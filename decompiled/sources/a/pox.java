package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.javax.sip.ListeningPoint;
import android.javax.sip.address.Address;
import android.javax.sip.address.AddressFactory;
import android.javax.sip.address.URI;
import android.javax.sip.header.AuthorizationHeader;
import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.header.ContactHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.FromHeader;
import android.javax.sip.header.HeaderFactory;
import android.javax.sip.header.MaxForwardsHeader;
import android.javax.sip.header.ToHeader;
import android.javax.sip.header.ViaHeader;
import android.javax.sip.message.MessageFactory;
import android.javax.sip.message.Request;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final class pox {
    public static final List b = q3d.j("INVITE", "ACK", Request.CANCEL, "BYE", "OPTIONS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6k0 f27349a;

    public pox(r6k0 r6k0Var) {
        r6k0Var.getClass();
        this.f27349a = r6k0Var;
    }

    public static void a(Request request, HeaderFactory headerFactory, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String strM = n7x.M(str);
            String strM2 = n7x.M(str2);
            if (n7x.J(strM) && request.getHeader(strM) == null) {
                request.addHeader(headerFactory.createHeader(strM, strM2));
            }
        }
    }

    public final Request b(String str, String str2, String str3, String str4, String str5, String str6, String str7, mmk mmkVar, nmk nmkVar, String str8, Map map, int i) {
        AuthorizationHeader authorizationHeaderCreateAuthorizationHeader;
        ohs0.z(str, str2, str3, str4, str6);
        str7.getClass();
        map.getClass();
        r6k0 r6k0Var = this.f27349a;
        HeaderFactory headerFactoryD = r6k0Var.d();
        AddressFactory addressFactoryC = r6k0Var.c();
        MessageFactory messageFactoryE = r6k0Var.e();
        String strM = n7x.M(str3);
        Address addressCreateAddress = addressFactoryC.createAddress("sip:" + strM + Separators.AT + str4);
        addressCreateAddress.getClass();
        String strM2 = n7x.M(str5 == null ? "" : str5);
        if (strM2.length() > 0) {
            addressCreateAddress.setDisplayName(strM2);
        }
        Address addressCreateAddress2 = addressFactoryC.createAddress("sip:".concat(str));
        addressCreateAddress2.getClass();
        URI uriCreateURI = addressFactoryC.createURI("sip:".concat(str));
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strConcat = SIPConstants.BRANCH_MAGIC_COOKIE.concat(kotlin.text.c.r(string, "-", "", false));
        FromHeader fromHeaderCreateFromHeader = headerFactoryD.createFromHeader(addressCreateAddress, str6);
        fromHeaderCreateFromHeader.getClass();
        ToHeader toHeaderCreateToHeader = headerFactoryD.createToHeader(addressCreateAddress2, null);
        toHeaderCreateToHeader.getClass();
        CallIdHeader callIdHeaderCreateCallIdHeader = headerFactoryD.createCallIdHeader(str7);
        callIdHeaderCreateCallIdHeader.getClass();
        CSeqHeader cSeqHeaderCreateCSeqHeader = headerFactoryD.createCSeqHeader(2L, "INVITE");
        cSeqHeaderCreateCSeqHeader.getClass();
        ViaHeader viaHeaderCreateViaHeader = headerFactoryD.createViaHeader(str2, r6k0Var.i(), ListeningPoint.UDP, strConcat);
        viaHeaderCreateViaHeader.getClass();
        viaHeaderCreateViaHeader.setRPort();
        MaxForwardsHeader maxForwardsHeaderCreateMaxForwardsHeader = headerFactoryD.createMaxForwardsHeader(70);
        maxForwardsHeaderCreateMaxForwardsHeader.getClass();
        Request requestCreateRequest = messageFactoryE.createRequest(uriCreateURI, "INVITE", callIdHeaderCreateCallIdHeader, cSeqHeaderCreateCSeqHeader, fromHeaderCreateFromHeader, toHeaderCreateToHeader, kotlin.collections.a.c(viaHeaderCreateViaHeader), maxForwardsHeaderCreateMaxForwardsHeader);
        requestCreateRequest.getClass();
        int i2 = r6k0Var.i();
        StringBuilder sbN = b1j.n("sip:", strM, Separators.AT, str2, Separators.COLON);
        sbN.append(i2);
        requestCreateRequest.addHeader(headerFactoryD.createContactHeader(addressFactoryC.createAddress(sbN.toString())));
        Iterator it = q3d.j("replaces", "outbound", ParameterNames.GRUU, "path").iterator();
        while (it.hasNext()) {
            requestCreateRequest.addHeader(headerFactoryD.createSupportedHeader((String) it.next()));
        }
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            requestCreateRequest.addHeader(headerFactoryD.createAllowHeader((String) it2.next()));
        }
        if (i == 407) {
            authorizationHeaderCreateAuthorizationHeader = headerFactoryD.createProxyAuthorizationHeader("Digest");
            authorizationHeaderCreateAuthorizationHeader.getClass();
        } else {
            authorizationHeaderCreateAuthorizationHeader = headerFactoryD.createAuthorizationHeader("Digest");
            authorizationHeaderCreateAuthorizationHeader.getClass();
        }
        authorizationHeaderCreateAuthorizationHeader.setUsername(strM);
        authorizationHeaderCreateAuthorizationHeader.setRealm(mmkVar.f22041a);
        authorizationHeaderCreateAuthorizationHeader.setNonce(mmkVar.b);
        authorizationHeaderCreateAuthorizationHeader.setURI(addressFactoryC.createURI("sip:".concat(str)));
        authorizationHeaderCreateAuthorizationHeader.setResponse(nmkVar.f23776a);
        authorizationHeaderCreateAuthorizationHeader.setAlgorithm(mmkVar.c);
        authorizationHeaderCreateAuthorizationHeader.setCNonce(nmkVar.b);
        authorizationHeaderCreateAuthorizationHeader.setNonceCount(Integer.parseInt(nmkVar.c, CharsKt.checkRadix(16)));
        authorizationHeaderCreateAuthorizationHeader.setQop(mmkVar.d);
        String str9 = mmkVar.e;
        if (str9 != null) {
            authorizationHeaderCreateAuthorizationHeader.setParameter("opaque", str9);
        }
        requestCreateRequest.addHeader(authorizationHeaderCreateAuthorizationHeader);
        requestCreateRequest.addHeader(headerFactoryD.createHeader("Session-Expires", "1800;refresher=uac"));
        a(requestCreateRequest, headerFactoryD, map);
        ContentTypeHeader contentTypeHeaderCreateContentTypeHeader = headerFactoryD.createContentTypeHeader(SIPServerTransaction.CONTENT_TYPE_APPLICATION, SIPServerTransaction.CONTENT_SUBTYPE_SDP);
        contentTypeHeaderCreateContentTypeHeader.getClass();
        byte[] bytes = str8.getBytes(Charsets.UTF_8);
        bytes.getClass();
        requestCreateRequest.setContent(bytes, contentTypeHeaderCreateContentTypeHeader);
        return requestCreateRequest;
    }

    public final Request c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        str.getClass();
        str3.getClass();
        map.getClass();
        r6k0 r6k0Var = this.f27349a;
        HeaderFactory headerFactoryD = r6k0Var.d();
        AddressFactory addressFactoryC = r6k0Var.c();
        MessageFactory messageFactoryE = r6k0Var.e();
        String strM = n7x.M(str3);
        Address addressCreateAddress = addressFactoryC.createAddress("sip:" + strM + Separators.AT + (str4 == null ? str2 : str4));
        addressCreateAddress.getClass();
        String strM2 = n7x.M(str5 == null ? "" : str5);
        if (strM2.length() > 0) {
            addressCreateAddress.setDisplayName(strM2);
        }
        Address addressCreateAddress2 = addressFactoryC.createAddress("sip:".concat(str));
        addressCreateAddress2.getClass();
        URI uriCreateURI = addressFactoryC.createURI("sip:".concat(str));
        FromHeader fromHeaderCreateFromHeader = headerFactoryD.createFromHeader(addressCreateAddress, str7);
        fromHeaderCreateFromHeader.getClass();
        ToHeader toHeaderCreateToHeader = headerFactoryD.createToHeader(addressCreateAddress2, null);
        toHeaderCreateToHeader.getClass();
        CallIdHeader callIdHeaderCreateCallIdHeader = headerFactoryD.createCallIdHeader(str6);
        callIdHeaderCreateCallIdHeader.getClass();
        CSeqHeader cSeqHeaderCreateCSeqHeader = headerFactoryD.createCSeqHeader(1L, "INVITE");
        cSeqHeaderCreateCSeqHeader.getClass();
        ViaHeader viaHeaderCreateViaHeader = headerFactoryD.createViaHeader(str2, r6k0Var.i(), ListeningPoint.UDP, str8);
        viaHeaderCreateViaHeader.getClass();
        viaHeaderCreateViaHeader.setRPort();
        MaxForwardsHeader maxForwardsHeaderCreateMaxForwardsHeader = headerFactoryD.createMaxForwardsHeader(70);
        maxForwardsHeaderCreateMaxForwardsHeader.getClass();
        Request requestCreateRequest = messageFactoryE.createRequest(uriCreateURI, "INVITE", callIdHeaderCreateCallIdHeader, cSeqHeaderCreateCSeqHeader, fromHeaderCreateFromHeader, toHeaderCreateToHeader, kotlin.collections.a.c(viaHeaderCreateViaHeader), maxForwardsHeaderCreateMaxForwardsHeader);
        requestCreateRequest.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        int i = r6k0Var.i();
        StringBuilder sbN = b1j.n("sip:", strM, Separators.AT, str2, Separators.COLON);
        sbN.append(i);
        sbN.append(";gr=urn:uuid:");
        sbN.append(string);
        ContactHeader contactHeaderCreateContactHeader = headerFactoryD.createContactHeader(addressFactoryC.createAddress(sbN.toString()));
        contactHeaderCreateContactHeader.setParameter(ParameterNames.SIP_INSTANCE, "\"<urn:uuid:" + string + ">\"");
        requestCreateRequest.addHeader(contactHeaderCreateContactHeader);
        Iterator it = q3d.j("replaces", "outbound", ParameterNames.GRUU, "path").iterator();
        while (it.hasNext()) {
            requestCreateRequest.addHeader(headerFactoryD.createSupportedHeader((String) it.next()));
        }
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            requestCreateRequest.addHeader(headerFactoryD.createAllowHeader((String) it2.next()));
        }
        requestCreateRequest.addHeader(headerFactoryD.createHeader("Session-Expires", "1800;refresher=uac"));
        a(requestCreateRequest, headerFactoryD, map);
        ContentTypeHeader contentTypeHeaderCreateContentTypeHeader = headerFactoryD.createContentTypeHeader(SIPServerTransaction.CONTENT_TYPE_APPLICATION, SIPServerTransaction.CONTENT_SUBTYPE_SDP);
        contentTypeHeaderCreateContentTypeHeader.getClass();
        byte[] bytes = str9.getBytes(Charsets.UTF_8);
        bytes.getClass();
        requestCreateRequest.setContent(bytes, contentTypeHeaderCreateContentTypeHeader);
        return requestCreateRequest;
    }
}
