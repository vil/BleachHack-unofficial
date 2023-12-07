package org.bleachhack.command.exception;

import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.text.Text;

import java.io.Serial;

public class CmdSyntaxException extends CommandSyntaxException {

	@Serial
	private static final long serialVersionUID = 7940377774005961331L;

	public CmdSyntaxException() {
        this(BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument(), Text.literal("Invalid Syntax!"));
    }

    public CmdSyntaxException(CommandExceptionType type, Text message) {
        super(type, message);
    }

}
