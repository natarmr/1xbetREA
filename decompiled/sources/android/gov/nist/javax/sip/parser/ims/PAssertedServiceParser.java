package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedService;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.InvalidArgumentException;

/* JADX INFO: loaded from: classes.dex */
public class PAssertedServiceParser extends HeaderParser implements TokenTypes {
    public PAssertedServiceParser(Lexer lexer) {
        super(lexer);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("PAssertedServiceParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_ASSERTED_SERVICE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PAssertedService pAssertedService = new PAssertedService();
            String buffer = this.lexer.getBuffer();
            if (buffer.contains(ParameterNamesIms.SERVICE_ID)) {
                if (!buffer.contains(ParameterNamesIms.SERVICE_ID_LABEL)) {
                    if (!buffer.contains(ParameterNamesIms.APPLICATION_ID_LABEL)) {
                        try {
                            throw new InvalidArgumentException("URN is not well formed");
                        } catch (InvalidArgumentException e) {
                            e.printStackTrace();
                            super.parse();
                            if (ParserCore.debug) {
                                dbg_enter("PAssertedServiceParser.parse");
                            }
                            return pAssertedService;
                        }
                    }
                    if (buffer.split("3gpp-application.")[1].trim().equals("")) {
                        try {
                            throw new InvalidArgumentException("URN should atleast have one sub-application");
                        } catch (InvalidArgumentException e2) {
                            e2.printStackTrace();
                            super.parse();
                            if (ParserCore.debug) {
                                dbg_enter("PAssertedServiceParser.parse");
                            }
                            return pAssertedService;
                        }
                    }
                    pAssertedService.setApplicationIdentifiers(buffer.split(ParameterNamesIms.APPLICATION_ID_LABEL)[1]);
                    if (ParserCore.debug) {
                        dbg_enter("PAssertedServiceParser.parse");
                    }
                    throw th;
                }
                if (buffer.split("3gpp-service.")[1].trim().equals("")) {
                    try {
                        throw new InvalidArgumentException("URN should atleast have one sub-service");
                    } catch (InvalidArgumentException e3) {
                        e3.printStackTrace();
                        super.parse();
                        if (ParserCore.debug) {
                            dbg_enter("PAssertedServiceParser.parse");
                        }
                        return pAssertedService;
                    }
                }
                pAssertedService.setSubserviceIdentifiers(buffer.split(ParameterNamesIms.SERVICE_ID_LABEL)[1]);
            }
            super.parse();
            if (ParserCore.debug) {
                dbg_enter("PAssertedServiceParser.parse");
            }
            return pAssertedService;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_enter("PAssertedServiceParser.parse");
            }
            throw th;
        }
    }

    public PAssertedServiceParser(String str) {
        super(str);
    }
}
