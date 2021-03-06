/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.core.interfaces.web.application;

import com.abixen.platform.core.application.dto.ModuleTypeDto;
import com.abixen.platform.core.application.service.ModuleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api/application/module-types")
public class ApplicationModuleTypeController {

    private final ModuleTypeService moduleTypeService;

    @Autowired
    public ApplicationModuleTypeController(ModuleTypeService moduleTypeService) {
        this.moduleTypeService = moduleTypeService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ModuleTypeDto> getModuleTypes() {
        return moduleTypeService.findAll();
    }
}