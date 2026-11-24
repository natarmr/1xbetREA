package a;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class tnh0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLContext f34234a;
    public String[] b;

    public tnh0(vnh0 vnh0Var, SecureRandom secureRandom) throws KeyManagementException {
        this.f34234a = null;
        SSLContext sSLContext = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
        this.f34234a = sSLContext;
        sSLContext.init(null, new X509TrustManager[]{vnh0Var}, secureRandom);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        ibm0.j("SSLFNew", "createSocket: host , port");
        Socket socketCreateSocket = this.f34234a.getSocketFactory().createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            ibm0.j("SSLFNew", "set default protocols");
            y860.e0(sSLSocket);
            ibm0.j("SSLFNew", "set default cipher");
            String[] strArr = y860.i;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(strArr);
            for (String str2 : enabledCipherSuites) {
                if (listAsList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.isEmpty()) {
                String[] strArr2 = y860.j;
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : enabledCipherSuites2) {
                    String upperCase = str3.toUpperCase(Locale.ENGLISH);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 16) {
                            arrayList2.add(str3);
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
            this.b = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] strArr = this.b;
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
        ibm0.j("SSLFNew", "createSocket");
        Socket socketCreateSocket = this.f34234a.getSocketFactory().createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            ibm0.j("SSLFNew", "set default protocols");
            y860.e0(sSLSocket);
            ibm0.j("SSLFNew", "set default cipher");
            String[] strArr = y860.i;
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            List listAsList = Arrays.asList(strArr);
            for (String str2 : enabledCipherSuites) {
                if (listAsList.contains(str2.toUpperCase(Locale.ENGLISH))) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
            } else {
                String[] strArr2 = y860.j;
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : enabledCipherSuites2) {
                    String upperCase = str3.toUpperCase(Locale.ENGLISH);
                    int i2 = 0;
                    while (true) {
                        if (i2 < 16) {
                            if (upperCase.contains(strArr2[i2].toUpperCase(Locale.ENGLISH))) {
                                break;
                            }
                            i2++;
                        } else {
                            arrayList2.add(str3);
                            break;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
            this.b = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}
