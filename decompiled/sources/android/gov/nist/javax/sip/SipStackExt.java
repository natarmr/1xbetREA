package android.gov.nist.javax.sip;

import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.javax.sip.clientauthutils.AccountManager;
import android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper;
import android.gov.nist.javax.sip.clientauthutils.SecureAccountManager;
import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.javax.sip.Dialog;
import android.javax.sip.SipStack;
import android.javax.sip.header.HeaderFactory;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface SipStackExt extends SipStack {
    AuthenticationHelper getAuthenticationHelper(AccountManager accountManager, HeaderFactory headerFactory);

    Collection<Dialog> getDialogs();

    Dialog getJoinDialog(JoinHeader joinHeader);

    SocketAddress getLocalAddressForTcpDst(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2);

    SocketAddress getLocalAddressForTlsDst(InetAddress inetAddress, int i, InetAddress inetAddress2);

    Dialog getReplacesDialog(ReplacesHeader replacesHeader);

    AuthenticationHelper getSecureAuthenticationHelper(SecureAccountManager secureAccountManager, HeaderFactory headerFactory);

    void setAddressResolver(AddressResolver addressResolver);

    void setEnabledCipherSuites(String[] strArr);
}
