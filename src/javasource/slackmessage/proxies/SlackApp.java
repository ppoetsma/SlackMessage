// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slackmessage.proxies;

public class SlackApp
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject slackAppMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SlackMessage.SlackApp";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		AppID("AppID"),
		SigningSecret("SigningSecret"),
		IsValid("IsValid"),
		SlackConfigUrl("SlackConfigUrl");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SlackApp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SlackMessage.SlackApp"));
	}

	protected SlackApp(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject slackAppMendixObject)
	{
		if (slackAppMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SlackMessage.SlackApp", slackAppMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SlackMessage.SlackApp");

		this.slackAppMendixObject = slackAppMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SlackApp.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static slackmessage.proxies.SlackApp initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return slackmessage.proxies.SlackApp.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static slackmessage.proxies.SlackApp initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new slackmessage.proxies.SlackApp(context, mendixObject);
	}

	public static slackmessage.proxies.SlackApp load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return slackmessage.proxies.SlackApp.initialize(context, mendixObject);
	}

	public static java.util.List<slackmessage.proxies.SlackApp> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<slackmessage.proxies.SlackApp> result = new java.util.ArrayList<slackmessage.proxies.SlackApp>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SlackMessage.SlackApp" + xpathConstraint))
			result.add(slackmessage.proxies.SlackApp.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of AppID
	 */
	public final java.lang.String getAppID()
	{
		return getAppID(getContext());
	}

	/**
	 * @param context
	 * @return value of AppID
	 */
	public final java.lang.String getAppID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AppID.toString());
	}

	/**
	 * Set value of AppID
	 * @param appid
	 */
	public final void setAppID(java.lang.String appid)
	{
		setAppID(getContext(), appid);
	}

	/**
	 * Set value of AppID
	 * @param context
	 * @param appid
	 */
	public final void setAppID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String appid)
	{
		getMendixObject().setValue(context, MemberNames.AppID.toString(), appid);
	}

	/**
	 * @return value of SigningSecret
	 */
	public final java.lang.String getSigningSecret()
	{
		return getSigningSecret(getContext());
	}

	/**
	 * @param context
	 * @return value of SigningSecret
	 */
	public final java.lang.String getSigningSecret(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SigningSecret.toString());
	}

	/**
	 * Set value of SigningSecret
	 * @param signingsecret
	 */
	public final void setSigningSecret(java.lang.String signingsecret)
	{
		setSigningSecret(getContext(), signingsecret);
	}

	/**
	 * Set value of SigningSecret
	 * @param context
	 * @param signingsecret
	 */
	public final void setSigningSecret(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String signingsecret)
	{
		getMendixObject().setValue(context, MemberNames.SigningSecret.toString(), signingsecret);
	}

	/**
	 * Set value of IsValid
	 * @param isvalid
	 */
	public final slackmessage.proxies.Enum_SlackApp_IsValid getIsValid()
	{
		return getIsValid(getContext());
	}

	/**
	 * @param context
	 * @return value of IsValid
	 */
	public final slackmessage.proxies.Enum_SlackApp_IsValid getIsValid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.IsValid.toString());
		if (obj == null)
			return null;

		return slackmessage.proxies.Enum_SlackApp_IsValid.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of IsValid
	 * @param isvalid
	 */
	public final void setIsValid(slackmessage.proxies.Enum_SlackApp_IsValid isvalid)
	{
		setIsValid(getContext(), isvalid);
	}

	/**
	 * Set value of IsValid
	 * @param context
	 * @param isvalid
	 */
	public final void setIsValid(com.mendix.systemwideinterfaces.core.IContext context, slackmessage.proxies.Enum_SlackApp_IsValid isvalid)
	{
		if (isvalid != null)
			getMendixObject().setValue(context, MemberNames.IsValid.toString(), isvalid.toString());
		else
			getMendixObject().setValue(context, MemberNames.IsValid.toString(), null);
	}

	/**
	 * @return value of SlackConfigUrl
	 */
	public final java.lang.String getSlackConfigUrl()
	{
		return getSlackConfigUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of SlackConfigUrl
	 */
	public final java.lang.String getSlackConfigUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SlackConfigUrl.toString());
	}

	/**
	 * Set value of SlackConfigUrl
	 * @param slackconfigurl
	 */
	public final void setSlackConfigUrl(java.lang.String slackconfigurl)
	{
		setSlackConfigUrl(getContext(), slackconfigurl);
	}

	/**
	 * Set value of SlackConfigUrl
	 * @param context
	 * @param slackconfigurl
	 */
	public final void setSlackConfigUrl(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String slackconfigurl)
	{
		getMendixObject().setValue(context, MemberNames.SlackConfigUrl.toString(), slackconfigurl);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return slackAppMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final slackmessage.proxies.SlackApp that = (slackmessage.proxies.SlackApp) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SlackMessage.SlackApp";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
