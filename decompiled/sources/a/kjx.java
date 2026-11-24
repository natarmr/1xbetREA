package a;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class kjx extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljx f18409a;
    public final HttpsURLConnection b;

    public kjx(HttpsURLConnection httpsURLConnection, Timer timer, ml50 ml50Var) {
        super(httpsURLConnection.getURL());
        this.b = httpsURLConnection;
        this.f18409a = new ljx(httpsURLConnection, timer, ml50Var);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f18409a.f20173a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f18409a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        ljx ljxVar = this.f18409a;
        ml50 ml50Var = ljxVar.b;
        ml50Var.m(ljxVar.e.a());
        ml50Var.b();
        ljxVar.f20173a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f18409a.f20173a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f18409a.f20173a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f18409a.f20173a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f18409a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f18409a.f20173a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f18409a.f20173a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f18409a.f20173a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f18409a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f18409a.f20173a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f18409a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f18409a.f20173a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f18409a.f();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        ljx ljxVar = this.f18409a;
        ml50 ml50Var = ljxVar.b;
        try {
            return ljxVar.f20173a.getPermission();
        } catch (IOException e) {
            twn.y(ljxVar.e, ml50Var, ml50Var);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f18409a.f20173a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f18409a.f20173a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f18409a.f20173a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f18409a.f20173a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f18409a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f18409a.h();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f18409a.f20173a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f18409a.f20173a.getUseCaches();
    }

    public final int hashCode() {
        return this.f18409a.f20173a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f18409a.f20173a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f18409a.f20173a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f18409a.f20173a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f18409a.f20173a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f18409a.f20173a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f18409a.f20173a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f18409a.f20173a.setFixedLengthStreamingMode(i);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.f18409a.f20173a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f18409a.f20173a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f18409a.f20173a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f18409a.f20173a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        boolean zEqualsIgnoreCase = "User-Agent".equalsIgnoreCase(str);
        ljx ljxVar = this.f18409a;
        if (zEqualsIgnoreCase) {
            ljxVar.b.f = str2;
        }
        ljxVar.f20173a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f18409a.f20173a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f18409a.f20173a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f18409a.f20173a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f18409a.c(clsArr);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.f18409a.f20173a.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        ljx ljxVar = this.f18409a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderField(str);
    }
}
