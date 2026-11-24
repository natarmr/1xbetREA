package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.StatusLine;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class StatusLineParser extends Parser {
    public StatusLineParser(String str) {
        this.lexer = new Lexer("status_lineLexer", str);
    }

    public StatusLine parse() {
        try {
            if (ParserCore.debug) {
                dbg_enter("parse");
            }
            StatusLine statusLine = new StatusLine();
            statusLine.setSipVersion(sipVersion());
            this.lexer.SPorHT();
            statusLine.setStatusCode(statusCode());
            this.lexer.SPorHT();
            statusLine.setReasonPhrase(reasonPhrase());
            this.lexer.SPorHT();
            return statusLine;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
        }
    }

    public String reasonPhrase() {
        return this.lexer.getRest().trim();
    }

    public int statusCode() {
        String strNumber = this.lexer.number();
        boolean z = ParserCore.debug;
        if (z) {
            dbg_enter(HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        }
        try {
            try {
                int i = Integer.parseInt(strNumber);
                if (z) {
                    dbg_leave(HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
                }
                return i;
            } catch (NumberFormatException e) {
                throw new ParseException(this.lexer.getBuffer() + Separators.COLON + e.getMessage(), this.lexer.getPtr());
            }
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave(HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
            }
            throw th;
        }
    }

    public StatusLineParser(Lexer lexer) {
        this.lexer = lexer;
        lexer.selectLexer("status_lineLexer");
    }
}
