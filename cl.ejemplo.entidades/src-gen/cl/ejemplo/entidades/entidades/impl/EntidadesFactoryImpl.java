/**
 * generated by Xtext 2.21.0
 */
package cl.ejemplo.entidades.entidades.impl;

import cl.ejemplo.entidades.entidades.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntidadesFactoryImpl extends EFactoryImpl implements EntidadesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EntidadesFactory init()
  {
    try
    {
      EntidadesFactory theEntidadesFactory = (EntidadesFactory)EPackage.Registry.INSTANCE.getEFactory(EntidadesPackage.eNS_URI);
      if (theEntidadesFactory != null)
      {
        return theEntidadesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EntidadesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntidadesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EntidadesPackage.MODEL: return createModel();
      case EntidadesPackage.ENTIDAD: return createEntidad();
      case EntidadesPackage.ATRIBUTO: return createAtributo();
      case EntidadesPackage.TIPO_ATRIBUTO: return createTipoAtributo();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entidad createEntidad()
  {
    EntidadImpl entidad = new EntidadImpl();
    return entidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atributo createAtributo()
  {
    AtributoImpl atributo = new AtributoImpl();
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TipoAtributo createTipoAtributo()
  {
    TipoAtributoImpl tipoAtributo = new TipoAtributoImpl();
    return tipoAtributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntidadesPackage getEntidadesPackage()
  {
    return (EntidadesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EntidadesPackage getPackage()
  {
    return EntidadesPackage.eINSTANCE;
  }

} //EntidadesFactoryImpl