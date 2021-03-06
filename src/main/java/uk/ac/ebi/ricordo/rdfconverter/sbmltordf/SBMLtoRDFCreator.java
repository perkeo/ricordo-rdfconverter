/*
 * Copyright 2012 EMBL-EBI
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.ebi.ricordo.rdfconverter.sbmltordf;

import org.sbml.jsbml.SBMLDocument;

import java.io.File;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Sarala Wimalaratne
 *         Date: 19/07/12
 *         Time: 17:29
 */
public interface SBMLtoRDFCreator {
    /**
     * creates RDF for a given model
     * @param modelId modelId
    */
    void generateSBMLtoRDFFromURL(String modelId);
    void generateSBMLtoRDFFromFile(String modelId, File file);
}
