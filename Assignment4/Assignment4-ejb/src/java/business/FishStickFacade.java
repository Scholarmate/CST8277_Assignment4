/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entity.FishStick;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Megatron
 */
@Stateless
public class FishStickFacade extends AbstractFacade<FishStick> implements FishStickFacadeRemote {

    @PersistenceContext(unitName = "Assignment4-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FishStickFacade() {
        super(FishStick.class);
    }
    
}
