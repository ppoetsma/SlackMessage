// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slackmessage.proxies;

public class Message
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject messageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SlackMessage.Message";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TextType("TextType"),
		Text("Text"),
		Blocks_Message("SlackMessage.Blocks_Message");

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

	public Message(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SlackMessage.Message"));
	}

	protected Message(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject messageMendixObject)
	{
		if (messageMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SlackMessage.Message", messageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SlackMessage.Message");

		this.messageMendixObject = messageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Message.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static slackmessage.proxies.Message initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return slackmessage.proxies.Message.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static slackmessage.proxies.Message initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new slackmessage.proxies.Message(context, mendixObject);
	}

	public static slackmessage.proxies.Message load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return slackmessage.proxies.Message.initialize(context, mendixObject);
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
	 * Set value of TextType
	 * @param texttype
	 */
	public final slackmessage.proxies.EnumTextType getTextType()
	{
		return getTextType(getContext());
	}

	/**
	 * @param context
	 * @return value of TextType
	 */
	public final slackmessage.proxies.EnumTextType getTextType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TextType.toString());
		if (obj == null)
			return null;

		return slackmessage.proxies.EnumTextType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TextType
	 * @param texttype
	 */
	public final void setTextType(slackmessage.proxies.EnumTextType texttype)
	{
		setTextType(getContext(), texttype);
	}

	/**
	 * Set value of TextType
	 * @param context
	 * @param texttype
	 */
	public final void setTextType(com.mendix.systemwideinterfaces.core.IContext context, slackmessage.proxies.EnumTextType texttype)
	{
		if (texttype != null)
			getMendixObject().setValue(context, MemberNames.TextType.toString(), texttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.TextType.toString(), null);
	}

	/**
	 * @return value of Text
	 */
	public final java.lang.String getText()
	{
		return getText(getContext());
	}

	/**
	 * @param context
	 * @return value of Text
	 */
	public final java.lang.String getText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text.toString());
	}

	/**
	 * Set value of Text
	 * @param text
	 */
	public final void setText(java.lang.String text)
	{
		setText(getContext(), text);
	}

	/**
	 * Set value of Text
	 * @param context
	 * @param text
	 */
	public final void setText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text)
	{
		getMendixObject().setValue(context, MemberNames.Text.toString(), text);
	}

	/**
	 * @return value of Blocks_Message
	 */
	public final slackmessage.proxies.Blocks getBlocks_Message() throws com.mendix.core.CoreException
	{
		return getBlocks_Message(getContext());
	}

	/**
	 * @param context
	 * @return value of Blocks_Message
	 */
	public final slackmessage.proxies.Blocks getBlocks_Message(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		slackmessage.proxies.Blocks result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Blocks_Message.toString());
		if (identifier != null)
			result = slackmessage.proxies.Blocks.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Blocks_Message
	 * @param blocks_message
	 */
	public final void setBlocks_Message(slackmessage.proxies.Blocks blocks_message)
	{
		setBlocks_Message(getContext(), blocks_message);
	}

	/**
	 * Set value of Blocks_Message
	 * @param context
	 * @param blocks_message
	 */
	public final void setBlocks_Message(com.mendix.systemwideinterfaces.core.IContext context, slackmessage.proxies.Blocks blocks_message)
	{
		if (blocks_message == null)
			getMendixObject().setValue(context, MemberNames.Blocks_Message.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Blocks_Message.toString(), blocks_message.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return messageMendixObject;
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
			final slackmessage.proxies.Message that = (slackmessage.proxies.Message) obj;
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
		return "SlackMessage.Message";
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