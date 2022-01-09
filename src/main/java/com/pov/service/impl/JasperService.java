package com.pov.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.pov.dtos.ApplianceDto;
import com.pov.service.interfaces.IApplianceService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class JasperService {
	@Autowired
	private IApplianceService applianceService;
	
	public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
		String path="C:\\Users\\lenovo\\Desktop\\mustapha_Projests\\projetStof";
		
		List<ApplianceDto> applianceDtos=applianceService.allAppliance();	
		//	List<Appliance> appliances=applianceRepository.findAll();
			
		File file=ResourceUtils.getFile("classpath:appliance.jrxml");
		JasperReport jasperReport=JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource=new JRBeanCollectionDataSource(applianceDtos);
		Map<String, Object> parameters=new HashMap<String, Object>();
			parameters.put("createdBy", "isicod");
		JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint, path+"\\appliance.pdf");
			
			}
		return "report generated in path: "+path;
	}
}
