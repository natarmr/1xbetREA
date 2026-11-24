package a;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class vnh0 implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37719a = new ArrayList();

    public vnh0(InputStream inputStream) {
        if (inputStream == null) {
            jf4.o("inputstream or trustPwd is null");
            throw null;
        }
        System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, "".toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f37719a.add((X509TrustManager) trustManager);
                    }
                }
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    ibm0.g("IOUtil", "closeSecure IOException");
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    ibm0.g("IOUtil", "closeSecure IOException");
                }
                throw th;
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            ibm0.g("SX509TM", "loadInputStream: exception : " + e.getMessage());
            try {
                inputStream.close();
            } catch (IOException unused3) {
                ibm0.g("IOUtil", "closeSecure IOException");
            }
        }
        System.currentTimeMillis();
    }

    public static String a(String str) {
        try {
            for (String str2 : str.split(Separators.COMMA)) {
                String strTrim = str2.trim();
                if (strTrim.startsWith("CN=")) {
                    return strTrim.substring(3);
                }
            }
            return "";
        } catch (Exception e) {
            ibm0.g("SX509TM", "parse subjectDN is error, error message is " + e.getMessage());
            return "";
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ibm0.j("SX509TM", "checkClientTrusted: ");
        Iterator it = this.f37719a.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                ibm0.g("SX509TM", "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ibm0.j("SX509TM", "checkServerTrusted begin,size=" + x509CertificateArr.length + ",authType=" + str);
        System.currentTimeMillis();
        if (x509CertificateArr.length >= 2) {
            String strA = a(x509CertificateArr[x509CertificateArr.length - 1].getSubjectX500Principal().getName());
            String strA2 = a(x509CertificateArr[x509CertificateArr.length - 2].getSubjectX500Principal().getName());
            if ("Huawei CBG Mobile Equipment CA".equals(strA) || "Huawei CBG Mobile Equipment CA".equals(strA2)) {
                throw new CertificateException("Invalid CN, name is Huawei CBG Mobile Equipment CA");
            }
        }
        ArrayList arrayList = this.f37719a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ibm0.j("SX509TM", "check server i=" + i);
                X509TrustManager x509TrustManager = (X509TrustManager) arrayList.get(i);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    ibm0.j("SX509TM", "client root ca size=" + acceptedIssuers.length);
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                ibm0.j("SX509TM", "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e) {
                ibm0.g("SX509TM", "checkServerTrusted error :" + e.getMessage() + " , time : " + i);
                if (i == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        ibm0.g("SX509TM", "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
        System.currentTimeMillis();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f37719a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            ibm0.g("SX509TM", "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }
}
