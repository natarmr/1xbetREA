package android.gov.nist.javax.sip.address;

import a.brm0;
import a.hny;
import a.jf4;
import a.kng0;
import android.gov.nist.core.Debug;
import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.javax.sip.PeerUnavailableException;
import android.javax.sip.SipFactory;
import android.javax.sip.address.SipURI;
import android.javax.sip.header.HeaderFactory;
import java.text.ParseException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class SipUri extends GenericURI implements SipURI, SipURIExt {
    private static final long serialVersionUID = 7749781076218987044L;
    protected Authority authority;
    protected NameValueList qheaders;
    protected TelephoneNumber telephoneSubscriber;
    protected NameValueList uriParms;

    public SipUri() {
        this.scheme = "sip";
        this.uriParms = new NameValueList();
        NameValueList nameValueList = new NameValueList();
        this.qheaders = nameValueList;
        nameValueList.setSeparator("&");
    }

    public void clearPassword() {
        UserInfo userInfo;
        Authority authority = this.authority;
        if (authority == null || (userInfo = authority.getUserInfo()) == null) {
            return;
        }
        userInfo.clearPassword();
    }

    public void clearQheaders() {
        this.qheaders = new NameValueList();
    }

    public void clearUriParms() {
        this.uriParms = new NameValueList();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        SipUri sipUri = (SipUri) super.clone();
        Authority authority = this.authority;
        if (authority != null) {
            sipUri.authority = (Authority) authority.clone();
        }
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            sipUri.uriParms = (NameValueList) nameValueList.clone();
        }
        NameValueList nameValueList2 = this.qheaders;
        if (nameValueList2 != null) {
            sipUri.qheaders = (NameValueList) nameValueList2.clone();
        }
        TelephoneNumber telephoneNumber = this.telephoneSubscriber;
        if (telephoneNumber != null) {
            sipUri.telephoneSubscriber = (TelephoneNumber) telephoneNumber.clone();
        }
        return sipUri;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        sb.append(this.scheme);
        sb.append(Separators.COLON);
        Authority authority = this.authority;
        if (authority != null) {
            authority.encode(sb);
        }
        if (!this.uriParms.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.uriParms.encode(sb);
        }
        if (!this.qheaders.isEmpty()) {
            sb.append(Separators.QUESTION);
            this.qheaders.encode(sb);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SipURI)) {
            return false;
        }
        SipURI sipURI = (SipURI) obj;
        if (isSecure() ^ sipURI.isSecure()) {
            return false;
        }
        if ((getUser() == null) ^ (sipURI.getUser() == null)) {
            return false;
        }
        if ((getUserPassword() == null) ^ (sipURI.getUserPassword() == null)) {
            return false;
        }
        if (getUser() != null && !UriDecoder.decode(getUser()).equals(UriDecoder.decode(sipURI.getUser()))) {
            return false;
        }
        if (getUserPassword() != null && !UriDecoder.decode(getUserPassword()).equals(UriDecoder.decode(sipURI.getUserPassword()))) {
            return false;
        }
        if ((getHost() == null) ^ (sipURI.getHost() == null)) {
            return false;
        }
        if ((getHost() != null && !getHost().equalsIgnoreCase(sipURI.getHost())) || getPort() != sipURI.getPort()) {
            return false;
        }
        Iterator parameterNames = getParameterNames();
        while (parameterNames.hasNext()) {
            String str = (String) parameterNames.next();
            String parameter = getParameter(str);
            String parameter2 = sipURI.getParameter(str);
            if (parameter != null && parameter2 != null && !UriDecoder.decode(parameter).equalsIgnoreCase(UriDecoder.decode(parameter2))) {
                return false;
            }
        }
        if ((getTransportParam() == null) ^ (sipURI.getTransportParam() == null)) {
            return false;
        }
        if ((getUserParam() == null) ^ (sipURI.getUserParam() == null)) {
            return false;
        }
        if ((getTTLParam() == -1) ^ (sipURI.getTTLParam() == -1)) {
            return false;
        }
        if ((getMethodParam() == null) ^ (sipURI.getMethodParam() == null)) {
            return false;
        }
        if ((getMAddrParam() == null) ^ (sipURI.getMAddrParam() == null)) {
            return false;
        }
        if (getHeaderNames().hasNext() && !sipURI.getHeaderNames().hasNext()) {
            return false;
        }
        if (!getHeaderNames().hasNext() && sipURI.getHeaderNames().hasNext()) {
            return false;
        }
        if (getHeaderNames().hasNext() && sipURI.getHeaderNames().hasNext()) {
            try {
                HeaderFactory headerFactoryCreateHeaderFactory = SipFactory.getInstance().createHeaderFactory();
                Iterator headerNames = getHeaderNames();
                while (headerNames.hasNext()) {
                    String str2 = (String) headerNames.next();
                    String header = getHeader(str2);
                    String header2 = sipURI.getHeader(str2);
                    if (header == null && header2 != null) {
                        return false;
                    }
                    if (header2 == null && header != null) {
                        return false;
                    }
                    if (header != null || header2 != null) {
                        try {
                            if (!headerFactoryCreateHeaderFactory.createHeader(str2, UriDecoder.decode(header)).equals(headerFactoryCreateHeaderFactory.createHeader(str2, UriDecoder.decode(header2)))) {
                                return false;
                            }
                        } catch (ParseException e) {
                            Debug.logError("Cannot parse one of the header of the sip uris to compare " + this + Separators.SP + sipURI, e);
                            return false;
                        }
                    }
                }
            } catch (PeerUnavailableException e2) {
                Debug.logError("Cannot get the header factory to parse the header of the sip uris to compare", e2);
                return false;
            }
        }
        return true;
    }

    public Authority getAuthority() {
        return this.authority;
    }

    public String getGrParam() {
        return (String) this.uriParms.getValue("gr");
    }

    @Override // android.javax.sip.address.SipURI
    public String getHeader(String str) {
        if (this.qheaders.getValue(str) != null) {
            return this.qheaders.getValue(str).toString();
        }
        return null;
    }

    @Override // android.javax.sip.address.SipURI
    public Iterator<String> getHeaderNames() {
        return this.qheaders.getNames();
    }

    @Override // android.javax.sip.address.SipURI
    public String getHost() {
        Authority authority = this.authority;
        if (authority == null || authority.getHost() == null) {
            return null;
        }
        return this.authority.getHost().encode();
    }

    public HostPort getHostPort() {
        Authority authority = this.authority;
        if (authority == null || authority.getHost() == null) {
            return null;
        }
        return this.authority.getHostPort();
    }

    public String getLrParam() {
        if (hasParameter("lr")) {
            return "true";
        }
        return null;
    }

    @Override // android.javax.sip.address.SipURI
    public String getMAddrParam() {
        NameValue nameValue = this.uriParms.getNameValue("maddr");
        if (nameValue == null) {
            return null;
        }
        return (String) nameValue.getValueAsObject();
    }

    public String getMethod() {
        return (String) getParm("method");
    }

    @Override // android.javax.sip.address.SipURI
    public String getMethodParam() {
        return getParameter("method");
    }

    @Override // android.javax.sip.header.Parameters
    public String getParameter(String str) {
        Object value = this.uriParms.getValue(str);
        if (value == null) {
            return null;
        }
        return value instanceof GenericObject ? ((GenericObject) value).encode() : value.toString();
    }

    @Override // android.javax.sip.header.Parameters
    public Iterator<String> getParameterNames() {
        return this.uriParms.getNames();
    }

    public NameValueList getParameters() {
        return this.uriParms;
    }

    public Object getParm(String str) {
        return this.uriParms.getValue(str);
    }

    @Override // android.javax.sip.address.SipURI
    public int getPort() {
        HostPort hostPort = getHostPort();
        if (hostPort == null) {
            return -1;
        }
        return hostPort.getPort();
    }

    public NameValueList getQheaders() {
        return this.qheaders;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.javax.sip.address.URI
    public String getScheme() {
        return this.scheme;
    }

    @Override // android.javax.sip.address.SipURI
    public int getTTLParam() {
        Integer num = (Integer) this.uriParms.getValue("ttl");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public TelephoneNumber getTelephoneSubscriber() {
        TelephoneNumber telephoneNumber = this.telephoneSubscriber;
        if (telephoneNumber != null) {
            return telephoneNumber;
        }
        TelephoneNumber telephoneNumber2 = new TelephoneNumber();
        this.telephoneSubscriber = telephoneNumber2;
        return telephoneNumber2;
    }

    @Override // android.javax.sip.address.SipURI
    public String getTransportParam() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            return (String) nameValueList.getValue(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
        }
        return null;
    }

    @Override // android.javax.sip.address.SipURI
    public String getUser() {
        return this.authority.getUser();
    }

    public String getUserAtHost() {
        String user = this.authority.getUserInfo() != null ? this.authority.getUserInfo().getUser() : "";
        String strEncode = this.authority.getHost().encode();
        StringBuilder sb = (user == null || user.equals("")) ? new StringBuilder() : brm0.t(user, Separators.AT);
        sb.append(strEncode);
        return sb.toString();
    }

    public String getUserAtHostPort() {
        String user = this.authority.getUserInfo() != null ? this.authority.getUserInfo().getUser() : "";
        String strEncode = this.authority.getHost().encode();
        int port = this.authority.getPort();
        StringBuilder sb = (user == null || user.equals("")) ? new StringBuilder() : brm0.t(user, Separators.AT);
        if (port == -1) {
            sb.append(strEncode);
            return sb.toString();
        }
        sb.append(strEncode);
        sb.append(Separators.COLON);
        sb.append(port);
        return sb.toString();
    }

    @Override // android.javax.sip.address.SipURI
    public String getUserParam() {
        return getParameter("user");
    }

    @Override // android.javax.sip.address.SipURI
    public String getUserPassword() {
        Authority authority = this.authority;
        if (authority == null) {
            return null;
        }
        return authority.getPassword();
    }

    public String getUserType() {
        return (String) this.uriParms.getValue("user");
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public boolean hasGrParam() {
        return this.uriParms.getNameValue("gr") != null;
    }

    @Override // android.javax.sip.address.SipURI
    public boolean hasLrParam() {
        return this.uriParms.getNameValue("lr") != null;
    }

    public boolean hasParameter(String str) {
        return this.uriParms.getValue(str) != null;
    }

    public boolean hasTransport() {
        return hasParameter(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
    }

    @Override // android.javax.sip.address.SipURI
    public boolean isSecure() {
        return getScheme().equalsIgnoreCase("sips");
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.javax.sip.address.URI
    public boolean isSipURI() {
        return true;
    }

    public boolean isUserTelephoneSubscriber() {
        String str = (String) this.uriParms.getValue("user");
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("phone");
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void removeHeader(String str) {
        NameValueList nameValueList = this.qheaders;
        if (nameValueList != null) {
            nameValueList.delete(str);
        }
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void removeHeaders() {
        this.qheaders = new NameValueList();
    }

    public void removeMAddr() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("maddr");
        }
    }

    public void removeMethod() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("method");
        }
    }

    @Override // android.javax.sip.header.Parameters
    public void removeParameter(String str) {
        this.uriParms.delete(str);
    }

    public void removeParameters() {
        this.uriParms = new NameValueList();
    }

    @Override // android.javax.sip.address.SipURI
    public void removePort() {
        this.authority.removePort();
    }

    public void removeTTL() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("ttl");
        }
    }

    public void removeTransport() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
        }
    }

    public void removeUser() {
        this.authority.removeUserInfo();
    }

    public void removeUserType() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("user");
        }
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public void setDefaultParm(String str, Object obj) {
        if (this.uriParms.getValue(str) == null) {
            this.uriParms.set(new NameValue(str, obj));
        }
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setGrParam(String str) {
        this.uriParms.set("gr", str);
    }

    @Override // android.javax.sip.address.SipURI
    public void setHeader(String str, String str2) {
        this.qheaders.set(new NameValue(str, str2));
    }

    public void setHost(Host host) {
        Authority authority = this.authority;
        if (authority == null) {
            authority = new Authority();
            this.authority = authority;
        }
        authority.setHost(host);
    }

    public void setHostPort(HostPort hostPort) {
        Authority authority = this.authority;
        if (authority == null) {
            authority = new Authority();
            this.authority = authority;
        }
        authority.setHostPort(hostPort);
    }

    public void setIsdnSubAddress(String str) {
        TelephoneNumber telephoneNumber = this.telephoneSubscriber;
        if (telephoneNumber == null) {
            telephoneNumber = new TelephoneNumber();
            this.telephoneSubscriber = telephoneNumber;
        }
        telephoneNumber.setIsdnSubaddress(str);
    }

    @Override // android.javax.sip.address.SipURI
    public void setLrParam() {
        this.uriParms.set("lr", null);
    }

    public void setMAddr(String str) {
        NameValue nameValue = this.uriParms.getNameValue("maddr");
        Host host = new Host();
        host.setAddress(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(host);
        } else {
            this.uriParms.set(new NameValue("maddr", host));
        }
    }

    @Override // android.javax.sip.address.SipURI
    public void setMAddrParam(String str) throws ParseException {
        if (str != null) {
            setParameter("maddr", str);
        } else {
            hny.u("bad maddr");
        }
    }

    public void setMethod(String str) {
        this.uriParms.set("method", str);
    }

    @Override // android.javax.sip.address.SipURI
    public void setMethodParam(String str) throws ParseException {
        setParameter("method", str);
    }

    @Override // android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) throws ParseException {
        if (str.equalsIgnoreCase("ttl")) {
            try {
                Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                hny.j(0, kng0.k("bad parameter ", str2));
                return;
            }
        }
        this.uriParms.set(str, str2);
    }

    @Override // android.javax.sip.address.SipURI
    public void setPort(int i) {
        Authority authority = this.authority;
        if (authority == null) {
            authority = new Authority();
            this.authority = authority;
        }
        authority.setPort(i);
    }

    public void setQHeader(NameValue nameValue) {
        this.qheaders.set(nameValue);
    }

    public void setQheaders(NameValueList nameValueList) {
        this.qheaders = nameValueList;
    }

    public void setScheme(String str) {
        if (str.compareToIgnoreCase("sip") == 0 || str.compareToIgnoreCase("sips") == 0) {
            this.scheme = str.toLowerCase();
        } else {
            jf4.o("bad scheme ".concat(str));
        }
    }

    @Override // android.javax.sip.address.SipURI
    public void setSecure(boolean z) {
        if (z) {
            this.scheme = "sips";
        } else {
            this.scheme = "sip";
        }
    }

    @Override // android.javax.sip.address.SipURI
    public void setTTLParam(int i) {
        if (i <= 0) {
            jf4.o("Bad ttl value");
        } else if (this.uriParms != null) {
            this.uriParms.set(new NameValue("ttl", Integer.valueOf(i)));
        }
    }

    public void setTelephoneSubscriber(TelephoneNumber telephoneNumber) {
        this.telephoneSubscriber = telephoneNumber;
    }

    @Override // android.javax.sip.address.SipURI
    public void setTransportParam(String str) {
        if (str == null) {
            hny.u("null arg");
        } else {
            this.uriParms.set(new NameValue(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT, str.toLowerCase()));
        }
    }

    public void setUriParameter(NameValue nameValue) {
        this.uriParms.set(nameValue);
    }

    public void setUriParm(String str, Object obj) {
        this.uriParms.set(new NameValue(str, obj));
    }

    public void setUriParms(NameValueList nameValueList) {
        this.uriParms = nameValueList;
    }

    @Override // android.javax.sip.address.SipURI
    public void setUser(String str) {
        Authority authority = this.authority;
        if (authority == null) {
            authority = new Authority();
            this.authority = authority;
        }
        authority.setUser(str);
    }

    @Override // android.javax.sip.address.SipURI
    public void setUserParam(String str) {
        this.uriParms.set("user", str);
    }

    @Override // android.javax.sip.address.SipURI
    public void setUserPassword(String str) {
        Authority authority = this.authority;
        if (authority == null) {
            authority = new Authority();
            this.authority = authority;
        }
        authority.setPassword(str);
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.javax.sip.address.NetObject, android.javax.sip.address.URI
    public String toString() {
        return encode();
    }

    @Override // android.javax.sip.address.SipURI
    public void setHost(String str) {
        setHost(new Host(str));
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }
}
