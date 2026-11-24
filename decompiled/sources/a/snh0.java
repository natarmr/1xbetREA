package a;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

/* JADX INFO: loaded from: classes2.dex */
public final class snh0 extends SSLSocketFactory {
    public static final String d;
    public static volatile snh0 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLContext f32495a;
    public Context b;
    public String[] c;

    static {
        new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
        d = snh0.class.getSimpleName();
        e = null;
    }

    public snh0(Context context) throws KeyManagementException {
        InputStream inputStreamOpen;
        this.f32495a = null;
        this.b = context.getApplicationContext();
        this.f32495a = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
        System.currentTimeMillis();
        if (ntb.f24089a == null) {
            ntb.f24089a = context.getApplicationContext();
        }
        if (unh0.f35961a == null) {
            synchronized (unh0.class) {
                if (unh0.f35961a == null) {
                    try {
                        inputStreamOpen = i78.a(context);
                    } catch (RuntimeException unused) {
                        ibm0.g("SecureX509SingleInstance", "get files bks error");
                        inputStreamOpen = null;
                    }
                    if (inputStreamOpen == null) {
                        ibm0.j("SecureX509SingleInstance", "get assets bks");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        ibm0.j("SecureX509SingleInstance", "get files bks");
                    }
                    unh0.f35961a = new vnh0(inputStreamOpen);
                }
            }
        }
        System.currentTimeMillis();
        this.f32495a.init(null, new X509TrustManager[]{unh0.f35961a}, null);
    }

    public static snh0 a(Context context) {
        System.currentTimeMillis();
        if (context != null && ntb.f24089a == null) {
            ntb.f24089a = context.getApplicationContext();
        }
        if (e == null) {
            synchronized (snh0.class) {
                try {
                    if (e == null) {
                        e = new snh0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (e.b == null && context != null) {
            snh0 snh0Var = e;
            snh0Var.getClass();
            snh0Var.b = context.getApplicationContext();
        }
        System.currentTimeMillis();
        return e;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        String str2 = d;
        ibm0.j(str2, "createSocket: host , port");
        Socket socketCreateSocket = this.f32495a.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            ibm0.j(str2, "set default protocols");
            y860.e0(sSLSocket);
            ibm0.j(str2, "set default cipher suites");
            String[] strArr = y860.i;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(strArr);
            for (String str3 : enabledCipherSuites) {
                if (listAsList.contains(str3.toUpperCase(Locale.ENGLISH))) {
                    arrayList.add(str3);
                }
            }
            if (arrayList.isEmpty()) {
                String[] strArr2 = y860.j;
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : enabledCipherSuites2) {
                    String upperCase = str4.toUpperCase(Locale.ENGLISH);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 16) {
                            arrayList2.add(str4);
                            break;
                        }
                        if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                            break;
                        }
                        i2++;
                    }
                }
                if (!arrayList2.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            } else {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            this.c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.c;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        String str2 = d;
        ibm0.j(str2, "createSocket s host port autoClose");
        Socket socketCreateSocket = this.f32495a.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            ibm0.j(str2, "set default protocols");
            y860.e0(sSLSocket);
            ibm0.j(str2, "set default cipher suites");
            String[] strArr = y860.i;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(strArr);
            for (String str3 : enabledCipherSuites) {
                if (listAsList.contains(str3.toUpperCase(Locale.ENGLISH))) {
                    arrayList.add(str3);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            } else {
                String[] strArr2 = y860.j;
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : enabledCipherSuites2) {
                    String upperCase = str4.toUpperCase(Locale.ENGLISH);
                    int i2 = 0;
                    while (true) {
                        if (i2 < 16) {
                            if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                break;
                            }
                            i2++;
                        } else {
                            arrayList2.add(str4);
                            break;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
            this.c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}
