package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.header.extensions.ReferredByHeader;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader;
import android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader;
import android.gov.nist.javax.sip.header.ims.PCalledPartyIDHeader;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader;
import android.gov.nist.javax.sip.header.ims.PChargingVectorHeader;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader;
import android.gov.nist.javax.sip.header.ims.PProfileKeyHeader;
import android.gov.nist.javax.sip.header.ims.PServedUserHeader;
import android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader;
import android.gov.nist.javax.sip.header.ims.PathHeader;
import android.gov.nist.javax.sip.header.ims.PrivacyHeader;
import android.gov.nist.javax.sip.header.ims.SecurityClientHeader;
import android.gov.nist.javax.sip.header.ims.SecurityServerHeader;
import android.gov.nist.javax.sip.header.ims.SecurityVerifyHeader;
import android.gov.nist.javax.sip.header.ims.ServiceRouteHeader;
import android.javax.sip.address.Address;
import android.javax.sip.header.Header;
import android.javax.sip.header.HeaderFactory;

/* JADX INFO: loaded from: classes.dex */
public interface HeaderFactoryExt extends HeaderFactory {
    PChargingVectorHeader createChargingVectorHeader(String str);

    Header createHeader(String str);

    JoinHeader createJoinHeader(String str, String str2, String str3);

    PAccessNetworkInfoHeader createPAccessNetworkInfoHeader();

    PAssertedIdentityHeader createPAssertedIdentityHeader(Address address);

    PAssertedServiceHeader createPAssertedServiceHeader();

    PAssociatedURIHeader createPAssociatedURIHeader(Address address);

    PCalledPartyIDHeader createPCalledPartyIDHeader(Address address);

    PChargingFunctionAddressesHeader createPChargingFunctionAddressesHeader();

    PMediaAuthorizationHeader createPMediaAuthorizationHeader(String str);

    PPreferredIdentityHeader createPPreferredIdentityHeader(Address address);

    PPreferredServiceHeader createPPreferredServiceHeader();

    PProfileKeyHeader createPProfileKeyHeader(Address address);

    PServedUserHeader createPServedUserHeader(Address address);

    PUserDatabaseHeader createPUserDatabaseHeader(String str);

    PVisitedNetworkIDHeader createPVisitedNetworkIDHeader();

    PathHeader createPathHeader(Address address);

    PrivacyHeader createPrivacyHeader(String str);

    ReferencesHeader createReferencesHeader(String str, String str2);

    ReferredByHeader createReferredByHeader(Address address);

    ReplacesHeader createReplacesHeader(String str, String str2, String str3);

    SipRequestLine createRequestLine(String str);

    SecurityClientHeader createSecurityClientHeader();

    SecurityServerHeader createSecurityServerHeader();

    SecurityVerifyHeader createSecurityVerifyHeader();

    ServiceRouteHeader createServiceRouteHeader(Address address);

    SessionExpiresHeader createSessionExpiresHeader(int i);

    SipStatusLine createStatusLine(String str);
}
