//------------------------------------------------------------------------------------------------//
//                                                                                                //
//                                       C u r v e s S t e p                                      //
//                                                                                                //
//------------------------------------------------------------------------------------------------//
// <editor-fold defaultstate="collapsed" desc="hdr">
//
//  Copyright © Audiveris 2025. All rights reserved.
//
//  This program is free software: you can redistribute it and/or modify it under the terms of the
//  GNU Affero General Public License as published by the Free Software Foundation, either version
//  3 of the License, or (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
//  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
//  See the GNU Affero General Public License for more details.
//
//  You should have received a copy of the GNU Affero General Public License along with this
//  program.  If not, see <http://www.gnu.org/licenses/>.
//------------------------------------------------------------------------------------------------//
// </editor-fold>
package org.audiveris.omr.sheet.curve;

import org.audiveris.omr.sheet.Sheet;
import org.audiveris.omr.step.AbstractStep;
import org.audiveris.omr.step.StepException;

/**
 * Class <code>CurvesStep</code> retrieves all curves (slurs, wedges, endings) of a sheet.
 *
 * @author Hervé Bitteur
 */
public class CurvesStep
        extends AbstractStep
{
    //~ Constructors -------------------------------------------------------------------------------

    /**
     * Creates a new SlursStep object.
     */
    public CurvesStep ()
    {
    }

    //~ Methods ------------------------------------------------------------------------------------

    //------//
    // doit //
    //------//
    @Override
    public void doit (Sheet sheet)
        throws StepException
    {
        new Curves(sheet).buildCurves();
    }
}
