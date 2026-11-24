package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigInteger;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.tls.HandshakeCertificates;
import okhttp3.tls.HeldCertificate;
import okhttp3.tls.internal.TlsUtil;
import okhttp3.tls.internal.der.AlgorithmIdentifier;
import okhttp3.tls.internal.der.AttributeTypeAndValue;
import okhttp3.tls.internal.der.BasicDerAdapter;
import okhttp3.tls.internal.der.BitString;
import okhttp3.tls.internal.der.Certificate;
import okhttp3.tls.internal.der.CertificateAdapters;
import okhttp3.tls.internal.der.DerReader;
import okhttp3.tls.internal.der.DerWriter;
import okhttp3.tls.internal.der.Extension;
import okhttp3.tls.internal.der.SubjectPublicKeyInfo;
import okhttp3.tls.internal.der.TbsCertificate;
import okhttp3.tls.internal.der.Validity;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class joq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16871a;

    public /* synthetic */ joq0(byte b) {
        this.f16871a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String str;
        Pair pair;
        byte b = this.f16871a;
        bid bidVar = bid.f2654a;
        byte b2 = 0;
        switch (b) {
            case 0:
                y2m0 y2m0Var = noq0.m2;
                return new ioq0(3, null);
            case 1:
                return new zw3(c3b.f3665a, (byte) 0);
            case 2:
                return new zw3(lh7.f20040a, (byte) 0);
            case 3:
                return new zw3(chb.f4351a, (byte) 0);
            case 4:
                return Unit.f46060a;
            case 5:
                char[] cArr = TlsUtil.f46242a;
                HeldCertificate.Builder builder = new HeldCertificate.Builder();
                builder.f46240a = "localhost";
                ArrayList<String> arrayList = builder.b;
                arrayList.add("localhost");
                arrayList.add("localhost.localdomain");
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(256, new SecureRandom());
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                keyPairGenerateKeyPair.getClass();
                BasicDerAdapter basicDerAdapter = CertificateAdapters.f;
                qg9 qg9Var = qg9.d;
                byte[] encoded = keyPairGenerateKeyPair.getPublic().getEncoded();
                encoded.getClass();
                qg9 qg9VarM = gl5.m(encoded);
                basicDerAdapter.getClass();
                f99 f99Var = new f99();
                f99Var.T(qg9VarM);
                SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) basicDerAdapter.d(new DerReader(f99Var));
                ArrayList arrayList2 = new ArrayList();
                String strG = builder.f46240a;
                if (strG == null) {
                    strG = axq.g();
                }
                arrayList2.add(kotlin.collections.a.c(new AttributeTypeAndValue("2.5.4.3", strG)));
                AlgorithmIdentifier algorithmIdentifier = keyPairGenerateKeyPair.getPrivate() instanceof RSAPrivateKey ? new AlgorithmIdentifier("1.2.840.113549.1.1.11", null) : new AlgorithmIdentifier("1.2.840.10045.4.3.2", qg9.d);
                BigInteger bigInteger = BigInteger.ONE;
                bigInteger.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Validity validity = new Validity(jCurrentTimeMillis, 86400000 + jCurrentTimeMillis);
                ArrayList arrayList3 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(r3d.q(arrayList, 10));
                    for (String str2 : arrayList) {
                        Regex regex = _HostnamesCommonKt.f46120a;
                        str2.getClass();
                        if (_HostnamesCommonKt.f46120a.g(str2)) {
                            BasicDerAdapter basicDerAdapter2 = CertificateAdapters.c;
                            qg9 qg9Var2 = qg9.d;
                            byte[] address = InetAddress.getByName(str2).getAddress();
                            address.getClass();
                            pair = new Pair(basicDerAdapter2, gl5.m(address));
                        } else {
                            pair = new Pair(CertificateAdapters.b, str2);
                        }
                        arrayList4.add(pair);
                    }
                    arrayList3.add(new Extension("2.5.29.17", arrayList4, true));
                }
                TbsCertificate tbsCertificate = new TbsCertificate(2L, bigInteger, algorithmIdentifier, arrayList2, validity, arrayList2, subjectPublicKeyInfo, null, null, arrayList3);
                String str3 = algorithmIdentifier.f46248a;
                if (str3.equals("1.2.840.113549.1.1.11")) {
                    str = "SHA256WithRSA";
                } else {
                    if (!str3.equals("1.2.840.10045.4.3.2")) {
                        throw new IllegalStateException("unexpected signature algorithm: ".concat(str3).toString());
                    }
                    str = "SHA256withECDSA";
                }
                Signature signature = Signature.getInstance(str);
                signature.initSign(keyPairGenerateKeyPair.getPrivate());
                BasicDerAdapter basicDerAdapter3 = CertificateAdapters.g;
                basicDerAdapter3.getClass();
                f99 f99Var2 = new f99();
                basicDerAdapter3.b(new DerWriter(f99Var2), tbsCertificate);
                signature.update(f99Var2.q0(f99Var2.b).w());
                qg9 qg9Var3 = qg9.d;
                byte[] bArrSign = signature.sign();
                bArrSign.getClass();
                Certificate certificate = new Certificate(tbsCertificate, algorithmIdentifier, new BitString(0, gl5.m(bArrSign)));
                BasicDerAdapter basicDerAdapter4 = CertificateAdapters.h;
                basicDerAdapter4.getClass();
                f99 f99Var3 = new f99();
                basicDerAdapter4.b(new DerWriter(f99Var3), certificate);
                qg9 qg9VarQ0 = f99Var3.q0(f99Var3.b);
                try {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    f99 f99Var4 = new f99();
                    f99Var4.T(qg9VarQ0);
                    Collection<? extends java.security.cert.Certificate> collectionGenerateCertificates = certificateFactory.generateCertificates(new e99(f99Var4, b2));
                    collectionGenerateCertificates.getClass();
                    Object objU0 = CollectionsKt.u0(collectionGenerateCertificates);
                    objU0.getClass();
                    X509Certificate x509Certificate = (X509Certificate) objU0;
                    HeldCertificate heldCertificate = new HeldCertificate(keyPairGenerateKeyPair, x509Certificate);
                    HandshakeCertificates.Builder builder2 = new HandshakeCertificates.Builder();
                    builder2.f46238a = heldCertificate;
                    builder2.b = (X509Certificate[]) Arrays.copyOf(new X509Certificate[0], 0);
                    builder2.c.add(x509Certificate);
                    return builder2.a();
                } catch (IllegalArgumentException e) {
                    e9d0.t("failed to decode certificate", e);
                    return null;
                } catch (GeneralSecurityException e2) {
                    e9d0.t("failed to decode certificate", e2);
                    return null;
                } catch (NoSuchElementException e3) {
                    e9d0.t("failed to decode certificate", e3);
                    return null;
                }
            case 6:
                return new zw3(l9a0.f19640a, (byte) 0);
            case 7:
                iun iunVar = iun.f15405a;
                return new yyq0("", y1p.MAIN, iunVar, iunVar);
            case 8:
                return new zw3(l9a0.f19640a, (byte) 0);
            case 9:
                return new zw3(v3r0.f36745a, (byte) 0);
            case 10:
                return new zw3(d3r0.f5418a, (byte) 0);
            case 11:
                return new zw3(uaa0.f35320a, (byte) 0);
            case 12:
                int i = m5r0.E;
                return bidVar;
            case 13:
                pz40 pz40Var = s6t0.f31722a;
                return new wkm(2, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary());
            case 14:
                return new skm(2, R.drawable.ic_glyph_search, true, (y3d) null, 48);
            case 15:
                int i2 = g7r0.L;
                return bidVar;
            case 16:
                return iun.f15405a;
            case 17:
                return iun.f15405a;
            case 18:
                return new zw3(d5h.f5505a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(z8r0.f43983a, (byte) 0);
            case 20:
                return new zw3(z8r0.f43983a, (byte) 0);
            case 21:
                return new zw3(z8r0.f43983a, (byte) 0);
            case 22:
                return new far0(iun.f15405a);
            case 23:
                return new zw3(whp0.f39176a, (byte) 0);
            case 24:
                return new zw3(o9a0.f24870a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(bar0.f2275a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                zcl zclVar = qmk.f28987a;
                return new ycl(324.0f);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i3 = ofr0.U0;
                return z370.f43707a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i4 = ofr0.U0;
                return pyq0.f27810a;
            default:
                int i5 = ofr0.U0;
                return n4l0.f22904a;
        }
    }
}
