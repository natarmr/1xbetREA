package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredService;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.InvalidArgumentException;

/* JADX INFO: loaded from: classes.dex */
public class PPreferredServiceParser extends HeaderParser implements TokenTypes {
    public PPreferredServiceParser(Lexer lexer) {
        super(lexer);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("PPreferredServiceParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_PREFERRED_SERVICE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PPreferredService pPreferredService = new PPreferredService();
            String buffer = this.lexer.getBuffer();
            if (buffer.contains(ParameterNamesIms.SERVICE_ID)) {
                if (!buffer.contains(ParameterNamesIms.SERVICE_ID_LABEL)) {
                    if (buffer.contains(ParameterNamesIms.APPLICATION_ID_LABEL)) {
                        String str = buffer.split(ParameterNamesIms.APPLICATION_ID_LABEL)[1];
                        if (str.trim().equals("")) {
                            try {
                                throw new InvalidArgumentException("URN should atleast have one sub-application");
                            } catch (InvalidArgumentException e) {
                                e.printStackTrace();
                            }
                        } else {
                            pPreferredService.setApplicationIdentifiers(str);
                        }
                    } else {
                        try {
                            throw new InvalidArgumentException("URN is not well formed");
                        } catch (InvalidArgumentException e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (ParserCore.debug) {
                        dbg_enter("PPreferredServiceParser.parse");
                    }
                    throw th;
                }
                String str2 = buffer.split("3gpp-service.")[1];
                if (str2.trim().equals("")) {
                    try {
                        throw new InvalidArgumentException("URN should atleast have one sub-service");
                    } catch (InvalidArgumentException e3) {
                        e3.printStackTrace();
                    }
                } else {
                    pPreferredService.setSubserviceIdentifiers(str2);
                }
            }
            super.parse();
            if (ParserCore.debug) {
                dbg_enter("PPreferredServiceParser.parse");
            }
            return pPreferredService;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_enter("PPreferredServiceParser.parse");
            }
            throw th;
        }
    }

    public PPreferredServiceParser(String str) {
        super(str);
    }
}
