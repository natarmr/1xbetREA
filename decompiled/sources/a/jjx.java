package a;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jjx extends HttpURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljx f16639a;

    public jjx(HttpURLConnection httpURLConnection, Timer timer, ml50 ml50Var) {
        super(httpURLConnection.getURL());
        this.f16639a = new ljx(httpURLConnection, timer, ml50Var);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f16639a.f20173a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f16639a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        ljx ljxVar = this.f16639a;
        ml50 ml50Var = ljxVar.b;
        ml50Var.m(ljxVar.e.a());
        ml50Var.b();
        ljxVar.f20173a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f16639a.f20173a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f16639a.f20173a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f16639a.f20173a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f16639a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f16639a.f20173a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f16639a.f20173a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f16639a.f20173a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f16639a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j) {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f16639a.f20173a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f16639a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f16639a.f20173a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f16639a.f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        ljx ljxVar = this.f16639a;
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
        return this.f16639a.f20173a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f16639a.f20173a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f16639a.f20173a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f16639a.f20173a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f16639a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f16639a.h();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f16639a.f20173a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f16639a.f20173a.getUseCaches();
    }

    public final int hashCode() {
        return this.f16639a.f20173a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f16639a.f20173a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f16639a.f20173a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f16639a.f20173a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f16639a.f20173a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f16639a.f20173a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f16639a.f20173a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f16639a.f20173a.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.f16639a.f20173a.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f16639a.f20173a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f16639a.f20173a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f16639a.f20173a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        boolean zEqualsIgnoreCase = "User-Agent".equalsIgnoreCase(str);
        ljx ljxVar = this.f16639a;
        if (zEqualsIgnoreCase) {
            ljxVar.b.f = str2;
        }
        ljxVar.f20173a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f16639a.f20173a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f16639a.f20173a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f16639a.f20173a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f16639a.c(clsArr);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.f16639a.f20173a.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        ljx ljxVar = this.f16639a;
        ljxVar.i();
        return ljxVar.f20173a.getHeaderField(str);
    }
}
