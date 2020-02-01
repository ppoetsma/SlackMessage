// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxslackmessage.proxies;

public class Block
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject blockMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxSlackMessage.Block";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		BlockType("BlockType"),
		Text_Block("MxSlackMessage.Text_Block"),
		Block_Blocks("MxSlackMessage.Block_Blocks");

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

	public Block(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxSlackMessage.Block"));
	}

	protected Block(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject blockMendixObject)
	{
		if (blockMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxSlackMessage.Block", blockMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxSlackMessage.Block");

		this.blockMendixObject = blockMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Block.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxslackmessage.proxies.Block initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxslackmessage.proxies.Block.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxslackmessage.proxies.Block initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxslackmessage.proxies.Block(context, mendixObject);
	}

	public static mxslackmessage.proxies.Block load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxslackmessage.proxies.Block.initialize(context, mendixObject);
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
	 * Set value of BlockType
	 * @param blocktype
	 */
	public final mxslackmessage.proxies.EnumBlockType getBlockType()
	{
		return getBlockType(getContext());
	}

	/**
	 * @param context
	 * @return value of BlockType
	 */
	public final mxslackmessage.proxies.EnumBlockType getBlockType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.BlockType.toString());
		if (obj == null)
			return null;

		return mxslackmessage.proxies.EnumBlockType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of BlockType
	 * @param blocktype
	 */
	public final void setBlockType(mxslackmessage.proxies.EnumBlockType blocktype)
	{
		setBlockType(getContext(), blocktype);
	}

	/**
	 * Set value of BlockType
	 * @param context
	 * @param blocktype
	 */
	public final void setBlockType(com.mendix.systemwideinterfaces.core.IContext context, mxslackmessage.proxies.EnumBlockType blocktype)
	{
		if (blocktype != null)
			getMendixObject().setValue(context, MemberNames.BlockType.toString(), blocktype.toString());
		else
			getMendixObject().setValue(context, MemberNames.BlockType.toString(), null);
	}

	/**
	 * @return value of Text_Block
	 */
	public final mxslackmessage.proxies.Text getText_Block() throws com.mendix.core.CoreException
	{
		return getText_Block(getContext());
	}

	/**
	 * @param context
	 * @return value of Text_Block
	 */
	public final mxslackmessage.proxies.Text getText_Block(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxslackmessage.proxies.Text result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Text_Block.toString());
		if (identifier != null)
			result = mxslackmessage.proxies.Text.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Text_Block
	 * @param text_block
	 */
	public final void setText_Block(mxslackmessage.proxies.Text text_block)
	{
		setText_Block(getContext(), text_block);
	}

	/**
	 * Set value of Text_Block
	 * @param context
	 * @param text_block
	 */
	public final void setText_Block(com.mendix.systemwideinterfaces.core.IContext context, mxslackmessage.proxies.Text text_block)
	{
		if (text_block == null)
			getMendixObject().setValue(context, MemberNames.Text_Block.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Text_Block.toString(), text_block.getMendixObject().getId());
	}

	/**
	 * @return value of Block_Blocks
	 */
	public final mxslackmessage.proxies.Blocks getBlock_Blocks() throws com.mendix.core.CoreException
	{
		return getBlock_Blocks(getContext());
	}

	/**
	 * @param context
	 * @return value of Block_Blocks
	 */
	public final mxslackmessage.proxies.Blocks getBlock_Blocks(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxslackmessage.proxies.Blocks result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Block_Blocks.toString());
		if (identifier != null)
			result = mxslackmessage.proxies.Blocks.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Block_Blocks
	 * @param block_blocks
	 */
	public final void setBlock_Blocks(mxslackmessage.proxies.Blocks block_blocks)
	{
		setBlock_Blocks(getContext(), block_blocks);
	}

	/**
	 * Set value of Block_Blocks
	 * @param context
	 * @param block_blocks
	 */
	public final void setBlock_Blocks(com.mendix.systemwideinterfaces.core.IContext context, mxslackmessage.proxies.Blocks block_blocks)
	{
		if (block_blocks == null)
			getMendixObject().setValue(context, MemberNames.Block_Blocks.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Block_Blocks.toString(), block_blocks.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return blockMendixObject;
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
			final mxslackmessage.proxies.Block that = (mxslackmessage.proxies.Block) obj;
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
		return "MxSlackMessage.Block";
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
