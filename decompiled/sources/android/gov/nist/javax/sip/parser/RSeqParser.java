package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.InvalidArgumentException;

/* JADX INFO: loaded from: classes.dex */
public class RSeqParser extends HeaderParser {
    public RSeqParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z = ParserCore.debug;
        if (z) {
            dbg_enter("RSeqParser.parse");
        }
        RSeq rSeq = new RSeq();
        try {
            headerName(TokenTypes.RSEQ);
            rSeq.setHeaderName("RSeq");
            try {
                rSeq.setSeqNumber(Long.parseLong(this.lexer.number()));
                this.lexer.SPorHT();
                this.lexer.match(10);
                if (z) {
                    dbg_leave("RSeqParser.parse");
                }
                return rSeq;
            } catch (InvalidArgumentException e) {
                throw createParseException(e.getMessage());
            }
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave("RSeqParser.parse");
            }
            throw th;
        }
    }

    public RSeqParser(Lexer lexer) {
        super(lexer);
    }
}
