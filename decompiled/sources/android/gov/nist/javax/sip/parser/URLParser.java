package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.HostNameParser;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StringTokenizer;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.address.TelURLImpl;
import android.gov.nist.javax.sip.address.TelephoneNumber;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class URLParser extends Parser {
    public URLParser(String str) {
        this.lexer = new Lexer("sip_urlLexer", str);
    }

    private String base_phone_number() {
        StringBuilder sb = new StringBuilder();
        if (ParserCore.debug) {
            dbg_enter("base_phone_number");
        }
        int i = 0;
        while (this.lexer.hasMoreChars()) {
            try {
                char cLookAhead = this.lexer.lookAhead(0);
                if (!StringTokenizer.isDigit(cLookAhead) && cLookAhead != '-' && cLookAhead != '.' && cLookAhead != '(' && cLookAhead != ')') {
                    if (i > 0) {
                        break;
                    }
                    throw createParseException("unexpected " + cLookAhead);
                }
                this.lexer.consume(1);
                sb.append(cLookAhead);
                i++;
            } catch (Throwable th) {
                if (ParserCore.debug) {
                    dbg_leave("base_phone_number");
                }
                throw th;
            }
        }
        String string = sb.toString();
        if (ParserCore.debug) {
            dbg_leave("base_phone_number");
        }
        return string;
    }

    private final TelephoneNumber global_phone_number(boolean z) {
        if (ParserCore.debug) {
            dbg_enter("global_phone_number");
        }
        try {
            TelephoneNumber telephoneNumber = new TelephoneNumber();
            telephoneNumber.setGlobal(true);
            this.lexer.match(43);
            telephoneNumber.setPhoneNumber(base_phone_number());
            if (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == ';' && z) {
                this.lexer.consume(1);
                telephoneNumber.setParameters(tel_parameters());
            }
            return telephoneNumber;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("global_phone_number");
            }
        }
    }

    public static boolean isMark(char c) {
        if (c == '!' || c == '_' || c == '~' || c == '-' || c == '.') {
            return true;
        }
        switch (c) {
            case '\'':
            case '(':
            case ')':
            case '*':
                return true;
            default:
                return false;
        }
    }

    public static boolean isReserved(char c) {
        return c == '$' || c == '&' || c == '/' || c == '=' || c == '+' || c == ',' || c == ':' || c == ';' || c == '?' || c == '@';
    }

    public static boolean isReservedNoSlash(char c) {
        return c == '$' || c == '&' || c == '+' || c == ',' || c == ':' || c == ';' || c == '?' || c == '@';
    }

    public static boolean isUnreserved(char c) {
        return StringTokenizer.isAlphaDigit(c) || isMark(c);
    }

    public static boolean isUserUnreserved(char c) {
        return c == '#' || c == '$' || c == '&' || c == '/' || c == ';' || c == '=' || c == '?' || c == '+' || c == ',';
    }

    private String local_number() {
        StringBuilder sb = new StringBuilder();
        if (ParserCore.debug) {
            dbg_enter("local_number");
        }
        int i = 0;
        while (this.lexer.hasMoreChars()) {
            try {
                char cLookAhead = this.lexer.lookAhead(0);
                if (cLookAhead != '*' && cLookAhead != '#' && cLookAhead != '-' && cLookAhead != '.' && cLookAhead != '(' && cLookAhead != ')' && !StringTokenizer.isHexDigit(cLookAhead)) {
                    if (i > 0) {
                        break;
                    }
                    throw createParseException("unexepcted " + cLookAhead);
                }
                this.lexer.consume(1);
                sb.append(cLookAhead);
                i++;
            } catch (Throwable th) {
                if (ParserCore.debug) {
                    dbg_leave("local_number");
                }
                throw th;
            }
        }
        String string = sb.toString();
        if (ParserCore.debug) {
            dbg_leave("local_number");
        }
        return string;
    }

    private TelephoneNumber local_phone_number(boolean z) {
        if (ParserCore.debug) {
            dbg_enter("local_phone_number");
        }
        TelephoneNumber telephoneNumber = new TelephoneNumber();
        telephoneNumber.setGlobal(false);
        try {
            telephoneNumber.setPhoneNumber(local_number());
            if (this.lexer.hasMoreChars() && this.lexer.peekNextToken().getTokenType() == 59 && z) {
                this.lexer.consume(1);
                telephoneNumber.setParameters(tel_parameters());
            }
            return telephoneNumber;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("local_phone_number");
            }
        }
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"sip:alice@example.com", "sips:alice@examples.com", "sip:3Zqkv5dajqaaas0tCjCxT0xH2ZEuEMsFl0xoasip%3A%2B3519116786244%40siplab.domain.com@213.0.115.163:7070"};
        for (int i = 0; i < 3; i++) {
            GenericURI genericURI = new URLParser(strArr2[i]).parse();
            System.out.println("uri type returned ".concat(genericURI.getClass().getName()));
            System.out.println(strArr2[i] + " is SipUri? " + genericURI.isSipURI() + Separators.GREATER_THAN + genericURI.encode());
        }
    }

    private NameValue phone_context() throws ParseException {
        String tokenValue;
        this.lexer.match(61);
        char cLookAhead = this.lexer.lookAhead(0);
        if (cLookAhead == '+') {
            this.lexer.consume(1);
            tokenValue = "+" + base_phone_number();
        } else {
            if (!StringTokenizer.isAlphaDigit(cLookAhead)) {
                throw new ParseException("Invalid phone-context:" + cLookAhead, -1);
            }
            tokenValue = this.lexer.match(4095).getTokenValue();
        }
        return new NameValue("phone-context", tokenValue, false);
    }

    private NameValueList tel_parameters() throws ParseException {
        NameValue nameValue;
        NameValueList nameValueList = new NameValueList();
        while (true) {
            String strParamNameOrValue = paramNameOrValue();
            if (strParamNameOrValue.equalsIgnoreCase("phone-context")) {
                nameValue = phone_context();
            } else if (this.lexer.lookAhead(0) == '=') {
                this.lexer.consume(1);
                nameValue = new NameValue(strParamNameOrValue, paramNameOrValue(), false);
            } else {
                nameValue = new NameValue(strParamNameOrValue, "", true);
            }
            nameValueList.set(nameValue);
            if (this.lexer.lookAhead(0) != ';') {
                return nameValueList;
            }
            this.lexer.consume(1);
        }
    }

    private NameValue uriParam() {
        if (ParserCore.debug) {
            dbg_enter("uriParam");
        }
        try {
            String strParamNameOrValue = "";
            String strParamNameOrValue2 = paramNameOrValue();
            boolean z = false;
            if (this.lexer.lookAhead(0) == '=') {
                this.lexer.consume(1);
                strParamNameOrValue = paramNameOrValue();
            } else {
                z = true;
            }
            if (strParamNameOrValue2.length() == 0 && (strParamNameOrValue == null || strParamNameOrValue.length() == 0)) {
                return null;
            }
            return new NameValue(strParamNameOrValue2, strParamNameOrValue, z);
        } finally {
            if (ParserCore.debug) {
                dbg_leave("uriParam");
            }
        }
    }

    public String escaped() {
        boolean z = ParserCore.debug;
        if (z) {
            dbg_enter("escaped");
        }
        try {
            StringBuilder sb = new StringBuilder();
            char cLookAhead = this.lexer.lookAhead(0);
            char cLookAhead2 = this.lexer.lookAhead(1);
            char cLookAhead3 = this.lexer.lookAhead(2);
            if (cLookAhead != '%' || !StringTokenizer.isHexDigit(cLookAhead2) || !StringTokenizer.isHexDigit(cLookAhead3)) {
                throw createParseException("escaped");
            }
            this.lexer.consume(3);
            sb.append(cLookAhead);
            sb.append(cLookAhead2);
            sb.append(cLookAhead3);
            String string = sb.toString();
            if (z) {
                dbg_leave("escaped");
            }
            return string;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave("escaped");
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x003b. Please report as an issue. */
    public String hvalue() {
        StringBuilder sb = new StringBuilder();
        while (this.lexer.hasMoreChars()) {
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead != '!' && cLookAhead != '\"' && cLookAhead != '$' && cLookAhead != ':' && cLookAhead != '?' && cLookAhead != '[' && cLookAhead != ']' && cLookAhead != '_' && cLookAhead != '~') {
                switch (cLookAhead) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                    default:
                        switch (cLookAhead) {
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                if (!StringTokenizer.isAlphaDigit(cLookAhead)) {
                                    if (cLookAhead == '%') {
                                        sb.append(escaped());
                                    }
                                }
                                break;
                        }
                        break;
                }
                return sb.toString();
            }
            this.lexer.consume(1);
            sb.append(cLookAhead);
        }
        return sb.toString();
    }

    public boolean isEscaped() {
        try {
            return this.lexer.lookAhead(0) == '%' && StringTokenizer.isHexDigit(this.lexer.lookAhead(1)) && StringTokenizer.isHexDigit(this.lexer.lookAhead(2));
        } catch (Exception unused) {
        }
    }

    public String mark() {
        boolean z = ParserCore.debug;
        if (z) {
            dbg_enter("mark");
        }
        try {
            char cLookAhead = this.lexer.lookAhead(0);
            if (!isMark(cLookAhead)) {
                throw createParseException("mark");
            }
            this.lexer.consume(1);
            String str = new String(new char[]{cLookAhead});
            if (z) {
                dbg_leave("mark");
            }
            return str;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave("mark");
            }
            throw th;
        }
    }

    public String paramNameOrValue() {
        int ptr = this.lexer.getPtr();
        while (this.lexer.hasMoreChars()) {
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead != '$' && cLookAhead != '&' && cLookAhead != '+' && cLookAhead != '/' && cLookAhead != ':' && cLookAhead != '[' && cLookAhead != ']' && !isUnreserved(cLookAhead)) {
                if (!isEscaped()) {
                    break;
                }
                this.lexer.consume(3);
            } else {
                this.lexer.consume(1);
            }
        }
        return this.lexer.getBuffer().substring(ptr, this.lexer.getPtr());
    }

    public GenericURI parse() {
        return uriReference(true);
    }

    public final TelephoneNumber parseTelephoneNumber(boolean z) {
        TelephoneNumber telephoneNumberLocal_phone_number;
        boolean z2 = ParserCore.debug;
        if (z2) {
            dbg_enter("telephone_subscriber");
        }
        this.lexer.selectLexer("charLexer");
        try {
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead == '+') {
                telephoneNumberLocal_phone_number = global_phone_number(z);
            } else {
                if (!StringTokenizer.isHexDigit(cLookAhead) && cLookAhead != '#' && cLookAhead != '*' && cLookAhead != '-' && cLookAhead != '.' && cLookAhead != '(' && cLookAhead != ')') {
                    throw createParseException("unexpected char " + cLookAhead);
                }
                telephoneNumberLocal_phone_number = local_phone_number(z);
            }
            if (z2) {
                dbg_leave("telephone_subscriber");
            }
            return telephoneNumberLocal_phone_number;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave("telephone_subscriber");
            }
            throw th;
        }
    }

    public String password() {
        int ptr = this.lexer.getPtr();
        while (true) {
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead == '$' || cLookAhead == '&' || cLookAhead == '=' || cLookAhead == '+' || cLookAhead == ',' || isUnreserved(cLookAhead)) {
                this.lexer.consume(1);
            } else {
                boolean zIsEscaped = isEscaped();
                LexerCore lexerCore = this.lexer;
                if (!zIsEscaped) {
                    return lexerCore.getBuffer().substring(ptr, this.lexer.getPtr());
                }
                lexerCore.consume(3);
            }
        }
    }

    public String peekScheme() {
        return this.lexer.getString(':');
    }

    public NameValue qheader() throws ParseException {
        String nextToken = this.lexer.getNextToken('=');
        this.lexer.consume(1);
        return new NameValue(nextToken, hvalue(), false);
    }

    public String reserved() throws ParseException {
        char cLookAhead = this.lexer.lookAhead(0);
        if (!isReserved(cLookAhead)) {
            throw createParseException("reserved");
        }
        this.lexer.consume(1);
        StringBuilder sb = new StringBuilder();
        sb.append(cLookAhead);
        return sb.toString();
    }

    public SipUri sipURL(boolean z) {
        String str;
        String strPassword;
        if (ParserCore.debug) {
            dbg_enter("sipURL");
        }
        SipUri sipUri = new SipUri();
        int tokenType = this.lexer.peekNextToken().getTokenType();
        int i = TokenTypes.SIPS;
        if (tokenType == 2136) {
            str = "sips";
        } else {
            i = TokenTypes.SIP;
            str = "sip";
        }
        try {
            this.lexer.match(i);
            this.lexer.match(58);
            sipUri.setScheme(str);
            int iMarkInputPosition = this.lexer.markInputPosition();
            String strUser = user();
            if (this.lexer.lookAhead() == ':') {
                this.lexer.consume(1);
                strPassword = password();
            } else {
                strPassword = null;
            }
            char cLookAhead = this.lexer.lookAhead();
            LexerCore lexerCore = this.lexer;
            if (cLookAhead == '@') {
                lexerCore.consume(1);
                sipUri.setUser(strUser);
                if (strPassword != null) {
                    sipUri.setUserPassword(strPassword);
                }
            } else {
                lexerCore.rewindInputPosition(iMarkInputPosition);
            }
            sipUri.setHostPort(new HostNameParser(getLexer()).hostPort(false));
            this.lexer.selectLexer("charLexer");
            while (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == ';' && z) {
                this.lexer.consume(1);
                NameValue nameValueUriParam = uriParam();
                if (nameValueUriParam != null) {
                    sipUri.setUriParameter(nameValueUriParam);
                }
            }
            if (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) == '?') {
                this.lexer.consume(1);
                while (this.lexer.hasMoreChars()) {
                    sipUri.setQHeader(qheader());
                    if (this.lexer.hasMoreChars() && this.lexer.lookAhead(0) != '&') {
                        break;
                    }
                    this.lexer.consume(1);
                }
            }
            return sipUri;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("sipURL");
            }
        }
    }

    public TelURLImpl telURL(boolean z) throws ParseException {
        this.lexer.match(TokenTypes.TEL);
        this.lexer.match(58);
        TelephoneNumber telephoneNumber = parseTelephoneNumber(z);
        TelURLImpl telURLImpl = new TelURLImpl();
        telURLImpl.setTelephoneNumber(telephoneNumber);
        return telURLImpl;
    }

    public String unreserved() throws ParseException {
        char cLookAhead = this.lexer.lookAhead(0);
        if (!isUnreserved(cLookAhead)) {
            throw createParseException("unreserved");
        }
        this.lexer.consume(1);
        return String.valueOf(cLookAhead);
    }

    public GenericURI uriReference(boolean z) {
        GenericURI genericURISipURL;
        boolean z2 = ParserCore.debug;
        if (z2) {
            dbg_enter("uriReference");
        }
        Token[] tokenArrPeekNextToken = this.lexer.peekNextToken(2);
        Token token = tokenArrPeekNextToken[0];
        Token token2 = tokenArrPeekNextToken[1];
        try {
            if (token.getTokenType() == 2051 || token.getTokenType() == 2136) {
                if (token2.getTokenType() != 58) {
                    throw createParseException("Expecting ':'");
                }
                genericURISipURL = sipURL(z);
            } else if (token.getTokenType() != 2105) {
                try {
                    genericURISipURL = new GenericURI(uricString());
                } catch (ParseException e) {
                    throw createParseException(e.getMessage());
                }
            } else {
                if (token2.getTokenType() != 58) {
                    throw createParseException("Expecting ':'");
                }
                genericURISipURL = telURL(z);
            }
            if (z2) {
                dbg_leave("uriReference");
            }
            return genericURISipURL;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave("uriReference");
            }
            throw th;
        }
    }

    public String uric() {
        boolean z = ParserCore.debug;
        if (z) {
            dbg_enter("uric");
        }
        try {
            char cLookAhead = this.lexer.lookAhead(0);
            if (isUnreserved(cLookAhead)) {
                this.lexer.consume(1);
                String strCharAsString = LexerCore.charAsString(cLookAhead);
                if (z) {
                    dbg_leave("uric");
                }
                return strCharAsString;
            }
            if (isReserved(cLookAhead)) {
                this.lexer.consume(1);
                String strCharAsString2 = LexerCore.charAsString(cLookAhead);
                if (z) {
                    dbg_leave("uric");
                }
                return strCharAsString2;
            }
            if (!isEscaped()) {
                if (z) {
                    dbg_leave("uric");
                }
                return null;
            }
            String strCharAsString3 = this.lexer.charAsString(3);
            this.lexer.consume(3);
            if (z) {
                dbg_leave("uric");
            }
            return strCharAsString3;
        } catch (Exception unused) {
            if (ParserCore.debug) {
                dbg_leave("uric");
            }
            return null;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave("uric");
            }
            throw th;
        }
    }

    public String uricNoSlash() {
        boolean z = ParserCore.debug;
        if (z) {
            dbg_enter("uricNoSlash");
        }
        try {
            char cLookAhead = this.lexer.lookAhead(0);
            if (isEscaped()) {
                String strCharAsString = this.lexer.charAsString(3);
                this.lexer.consume(3);
                if (z) {
                    dbg_leave("uricNoSlash");
                }
                return strCharAsString;
            }
            if (isUnreserved(cLookAhead)) {
                this.lexer.consume(1);
                String strCharAsString2 = LexerCore.charAsString(cLookAhead);
                if (z) {
                    dbg_leave("uricNoSlash");
                }
                return strCharAsString2;
            }
            if (!isReservedNoSlash(cLookAhead)) {
                if (z) {
                    dbg_leave("uricNoSlash");
                }
                return null;
            }
            this.lexer.consume(1);
            String strCharAsString3 = LexerCore.charAsString(cLookAhead);
            if (z) {
                dbg_leave("uricNoSlash");
            }
            return strCharAsString3;
        } catch (ParseException unused) {
            if (ParserCore.debug) {
                dbg_leave("uricNoSlash");
            }
            return null;
        } catch (Throwable th) {
            if (ParserCore.debug) {
                dbg_leave("uricNoSlash");
            }
            throw th;
        }
    }

    public String uricString() {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String strUric = uric();
            if (strUric != null) {
                sb.append(strUric);
            } else {
                if (this.lexer.lookAhead(0) != '[') {
                    return sb.toString();
                }
                sb.append(new HostNameParser(getLexer()).hostPort(false).toString());
            }
        }
    }

    public String urlString() {
        char cLookAhead;
        StringBuilder sb = new StringBuilder();
        this.lexer.selectLexer("charLexer");
        while (this.lexer.hasMoreChars() && (cLookAhead = this.lexer.lookAhead(0)) != ' ' && cLookAhead != '\t' && cLookAhead != '\n' && cLookAhead != '>' && cLookAhead != '<') {
            this.lexer.consume(0);
            sb.append(cLookAhead);
        }
        return sb.toString();
    }

    public String user() {
        if (ParserCore.debug) {
            dbg_enter("user");
        }
        try {
            int ptr = this.lexer.getPtr();
            while (this.lexer.hasMoreChars()) {
                char cLookAhead = this.lexer.lookAhead(0);
                if (!isUnreserved(cLookAhead) && !isUserUnreserved(cLookAhead)) {
                    if (!isEscaped()) {
                        break;
                    }
                    this.lexer.consume(3);
                } else {
                    this.lexer.consume(1);
                }
            }
            return this.lexer.getBuffer().substring(ptr, this.lexer.getPtr());
        } finally {
            if (ParserCore.debug) {
                dbg_leave("user");
            }
        }
    }

    public URLParser(Lexer lexer) {
        this.lexer = lexer;
        lexer.selectLexer("sip_urlLexer");
    }
}
