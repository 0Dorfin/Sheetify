//------------------------------------------------------------------------------------------------//
//                                                                                                //
//                                 S a m e T i m e R e l a t i o n                                //
//                                                                                                //
//------------------------------------------------------------------------------------------------//
// <editor-fold defaultstate="collapsed" desc="hdr">
//
//  Copyright © Audiveris 2018. All rights reserved.
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
package org.audiveris.omr.sig.relation;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class <code>SameTimeRelation</code> indicates that the source and target chords
 * should share the same time slot.
 *
 * @author Hervé Bitteur
 */
@XmlRootElement(name = "same-time")
public class SameTimeRelation
        extends Rhythm
{
    //~ Constructors -------------------------------------------------------------------------------

    /**
     * Creates a new <code>SameTimeRelation</code> object.
     */
    public SameTimeRelation ()
    {
    }

    //~ Methods ------------------------------------------------------------------------------------

    //----------------//
    // isSingleSource //
    //----------------//
    @Override
    public boolean isSingleSource ()
    {
        return false;
    }

    //----------------//
    // isSingleTarget //
    //----------------//
    @Override
    public boolean isSingleTarget ()
    {
        return false;
    }
}
