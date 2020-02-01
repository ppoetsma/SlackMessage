// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxslackmessage.proxies;

public class Blocks
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject blocksMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxSlackMessage.Blocks";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Blocks_Message("MxSlackMessage.Blocks_Message");

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

	public Blocks(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxSlackMessage.Blocks"));
	}

	protected Blocks(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject blocksMendixObject)
	{
		if (blocksMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxSlackMessage.Blocks", blocksMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxSlackMessage.Blocks");

		this.blocksMendixObject = blocksMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Blocks.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxslackmessage.proxies.Blocks initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxslackmessage.proxies.Blocks.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxslackmessage.proxies.Blocks initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxslackmessage.proxies.Blocks(context, mendixObject);
	}

	public static mxslackmessage.proxies.Blocks load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxslackmessage.proxies.Blocks.initialize(context, mendixObject);
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
	 * @return value of Blocks_Message
	 */
	public final mxslackmessage.proxies.Message getBlocks_Message() throws com.mendix.core.CoreException
	{
		return getBlocks_Message(getContext());
	}

	/**
	 * @param context
	 * @return value of Blocks_Message
	 */
	public final mxslackmessage.proxies.Message getBlocks_Message(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxslackmessage.proxies.Message result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Blocks_Message.toString());
		if (identifier != null)
			result = mxslackmessage.proxies.Message.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Blocks_Message
	 * @param blocks_message
	 */
	public final void setBlocks_Message(mxslackmessage.proxies.Message blocks_message)
	{
		setBlocks_Message(getContext(), blocks_message);
	}

	/**
	 * Set value of Blocks_Message
	 * @param context
	 * @param blocks_message
	 */
	public final void setBlocks_Message(com.mendix.systemwideinterfaces.core.IContext context, mxslackmessage.proxies.Message blocks_message)
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
		return blocksMendixObject;
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
			final mxslackmessage.proxies.Blocks that = (mxslackmessage.proxies.Blocks) obj;
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
		return "MxSlackMessage.Blocks";
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