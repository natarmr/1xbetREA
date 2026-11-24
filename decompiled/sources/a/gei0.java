package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.ByteArrayInputStream;
import java.lang.annotation.Annotation;
import java.nio.charset.Charset;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.platform.Platform;
import okhttp3.tls.HandshakeCertificates;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gei0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11158a;

    public /* synthetic */ gei0(eii0 eii0Var) {
        this.f11158a = (byte) 6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws CertificateException {
        String str;
        switch (this.f11158a) {
            case 0:
                tre0 tre0Var = sre0.f32672a;
                return new leh0("org.xplatform.consultantchat.data.models.SendMessageDataModel", tre0Var.b(oei0.class), new sgy[]{tre0Var.b(kei0.class), tre0Var.b(nei0.class)}, new jiy[]{iei0.f14635a, lei0.f19904a}, new Annotation[0]);
            case 1:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 2:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 3:
                return new g0o("org.xplatform.consultantchat.data.models.SendMessageRequest.Unknown", cfi0.INSTANCE, new Annotation[0]);
            case 4:
                return new zw3(g1o.f10523a, (byte) 0);
            case 5:
                return new inv(ysm0.f43175a, qcy.f28507a, (byte) 1);
            case 6:
                List listJ = q3d.j(bbb.f2300a, bbb.b);
                HandshakeCertificates.Builder builder = new HandshakeCertificates.Builder();
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    int iOrdinal = ((bbb) it.next()).ordinal();
                    if (iOrdinal == 0) {
                        str = "-----BEGIN CERTIFICATE-----\nMIIFazCCA1OgAwIBAgIRAIIQz7DSQONZRGPgu2OCiwAwDQYJKoZIhvcNAQELBQAw\nTzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh\ncmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMTUwNjA0MTEwNDM4\nWhcNMzUwNjA0MTEwNDM4WjBPMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJu\nZXQgU2VjdXJpdHkgUmVzZWFyY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBY\nMTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAK3oJHP0FDfzm54rVygc\nh77ct984kIxuPOZXoHj3dcKi/vVqbvYATyjb3miGbESTtrFj/RQSa78f0uoxmyF+\n0TM8ukj13Xnfs7j/EvEhmkvBioZxaUpmZmyPfjxwv60pIgbz5MDmgK7iS4+3mX6U\nA5/TR5d8mUgjU+g4rk8Kb4Mu0UlXjIB0ttov0DiNewNwIRt18jA8+o+u3dpjq+sW\nT8KOEUt+zwvo/7V3LvSye0rgTBIlDHCNAymg4VMk7BPZ7hm/ELNKjD+Jo2FR3qyH\nB5T0Y3HsLuJvW5iB4YlcNHlsdu87kGJ55tukmi8mxdAQ4Q7e2RCOFvu396j3x+UC\nB5iPNgiV5+I3lg02dZ77DnKxHZu8A/lJBdiB3QW0KtZB6awBdpUKD9jf1b0SHzUv\nKBds0pjBqAlkd25HN7rOrFleaJ1/ctaJxQZBKT5ZPt0m9STJEadao0xAH0ahmbWn\nOlFuhjuefXKnEgV4We0+UXgVCwOPjdAvBbI+e0ocS3MFEvzG6uBQE3xDk3SzynTn\njh8BCNAw1FtxNrQHusEwMFxIt4I7mKZ9YIqioymCzLq9gwQbooMDQaHWBfEbwrbw\nqHyGO0aoSCqI3Haadr8faqU9GY/rOPNk3sgrDQoo//fb4hVC1CLQJ13hef4Y53CI\nrU7m2Ys6xt0nUW7/vGT1M0NPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNV\nHRMBAf8EBTADAQH/MB0GA1UdDgQWBBR5tFnme7bl5AFzgAiIyBpY9umbbjANBgkq\nhkiG9w0BAQsFAAOCAgEAVR9YqbyyqFDQDLHYGmkgJykIrGF1XIpu+ILlaS/V9lZL\nubhzEFnTIZd+50xx+7LSYK05qAvqFyFWhfFQDlnrzuBZ6brJFe+GnY+EgPbk6ZGQ\n3BebYhtF8GaV0nxvwuo77x/Py9auJ/GpsMiu/X1+mvoiBOv/2X/qkSsisRcOj/KK\nNFtY2PwByVS5uCbMiogziUwthDyC3+6WVwW6LLv3xLfHTjuCvjHIInNzktHCgKQ5\nORAzI4JMPJ+GslWYHb4phowim57iaztXOoJwTdwJx4nLCgdNbOhdjsnvzqvHu7Ur\nTkXWStAmzOVyyghqpZXjFaH3pO3JLF+l+/+sKAIuvtd7u+Nxe5AW0wdeRlN8NwdC\njNPElpzVmbUq4JUagEiuTDkHzsxHpFKVK7q4+63SM1N95R1NbdWhscdCb+ZAJzVc\noyi3B43njTOQ5yOf+1CceWxG1bQVs5ZufpsMljq4Ui0/1lvh+wjChP4kqKOJ2qxq\n4RgqsahDYVvTH9w7jXbyLeiNdd8XM2w9U/t7y0Ff/9yi0GE44Za4rF2LN9d11TPA\nmRGunUHBcnWEvgJBQl9nJEiU0Zsnvgc/ubhPgXRR4Xq37Z0j4r7g1SgEEzwxA57d\nemyPxgcYxn/eR44/KJ4EBs+lVDR3veyJm+kXQ99b21/+jh5Xos1AnX5iItreGCc=\n-----END CERTIFICATE-----";
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        str = "-----BEGIN CERTIFICATE-----\nMIICGzCCAaGgAwIBAgIQQdKd0XLq7qeAwSxs6S+HUjAKBggqhkjOPQQDAzBPMQsw\nCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJuZXQgU2VjdXJpdHkgUmVzZWFyY2gg\nR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBYMjAeFw0yMDA5MDQwMDAwMDBaFw00\nMDA5MTcxNjAwMDBaME8xCzAJBgNVBAYTAlVTMSkwJwYDVQQKEyBJbnRlcm5ldCBT\nZWN1cml0eSBSZXNlYXJjaCBHcm91cDEVMBMGA1UEAxMMSVNSRyBSb290IFgyMHYw\nEAYHKoZIzj0CAQYFK4EEACIDYgAEzZvVn4CDCuwJSvMWSj5cz3es3mcFDR0HttwW\n+1qLFNvicWDEukWVEYmO6gbf9yoWHKS5xcUy4APgHoIYOIvXRdgKam7mAHf7AlF9\nItgKbppbd9/w+kHsOdx1ymgHDB/qo0IwQDAOBgNVHQ8BAf8EBAMCAQYwDwYDVR0T\nAQH/BAUwAwEB/zAdBgNVHQ4EFgQUfEKWrt5LSDv6kviejM9ti6lyN5UwCgYIKoZI\nzj0EAwMDaAAwZQIwe3lORlCEwkSHRhtFcP9Ymd70/aTSVaYgLXTWNLxBo1BfASdW\ntL4ndQavEi51mI38AjEAi/V3bNTIZargCyzuFJ0nN6T5U6VR5CmD1/iQMVtCnwr1\n/q4AaOeMSQ+2b1tbFfLn\n-----END CERTIFICATE-----";
                    }
                    String strC = ntm0.c(str);
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    Charset charsetForName = Charset.forName("UTF-8");
                    charsetForName.getClass();
                    byte[] bytes = strC.getBytes(charsetForName);
                    bytes.getClass();
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                    certificateGenerateCertificate.getClass();
                    builder.c.add((X509Certificate) certificateGenerateCertificate);
                }
                Platform platform = Platform.f46208a;
                Platform.f46208a.getClass();
                X509TrustManager x509TrustManagerN = Platform.n();
                ArrayList arrayList = builder.c;
                X509Certificate[] acceptedIssuers = x509TrustManagerN.getAcceptedIssuers();
                Collections.addAll(arrayList, Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
                return builder.a();
            case 7:
                try {
                    return aac.e0(pgi0.t(lgi0.b(Arrays.asList(new lf60()).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 8:
                try {
                    return aac.e0(pgi0.t(lgi0.b(Arrays.asList(new nnn0()).iterator())));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case 9:
                return new inv(ysm0.f43175a, myb0.f22596a, (byte) 1);
            case 10:
                return Unit.f46060a;
            case 11:
                return umi0.Companion.serializer();
            case 12:
                umi0[] umi0VarArrValues = umi0.values();
                umi0VarArrValues.getClass();
                return new g0o("org.xplatform.session_timer.domain.models.SessionTimerStatusType", (Enum[]) umi0VarArrValues);
            case 13:
                return new zw3(rcq.f30252a, (byte) 0);
            case 14:
                return new zw3(wf7.f39056a, (byte) 0);
            case 15:
                return new zw3(s710.f31729a, (byte) 0);
            case 16:
                return new zw3(rcq.f30252a, (byte) 0);
            case 17:
                return new zw3(xnz.f41191a, (byte) 0);
            case 18:
                return new zw3(rp40.f30869a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(op40.f25623a, (byte) 0);
            case 20:
                return new zw3(pp40.f27359a, (byte) 0);
            case 21:
                return new zw3(qp40.f29098a, (byte) 0);
            case 22:
                return new zw3(jp40.f16884a, (byte) 0);
            case 23:
                return new zw3(r6i0.f29934a, (byte) 0);
            case 24:
                return new zw3(s6i0.f31704a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(t6i0.f33418a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(u6i0.f35138a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(mkq0.f21956a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(nkq0.f23693a, (byte) 0);
            default:
                return new zw3(okq0.f25417a, (byte) 0);
        }
    }

    public /* synthetic */ gei0(byte b) {
        this.f11158a = b;
    }
}
