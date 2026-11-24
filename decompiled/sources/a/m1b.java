package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.Adapters;
import okhttp3.tls.internal.der.AlgorithmIdentifier;
import okhttp3.tls.internal.der.AttributeTypeAndValue;
import okhttp3.tls.internal.der.BasicConstraints;
import okhttp3.tls.internal.der.BasicDerAdapter;
import okhttp3.tls.internal.der.BitString;
import okhttp3.tls.internal.der.Certificate;
import okhttp3.tls.internal.der.CertificateAdapters;
import okhttp3.tls.internal.der.Extension;
import okhttp3.tls.internal.der.PrivateKeyInfo;
import okhttp3.tls.internal.der.SubjectPublicKeyInfo;
import okhttp3.tls.internal.der.TbsCertificate;
import okhttp3.tls.internal.der.Validity;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m1b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20999a;

    public /* synthetic */ m1b(byte b) {
        this.f20999a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20999a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 1:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                for (int i = 0; i < 20; i++) {
                    hcz.e(hczVar, null, null, qjj.f28842a, 3);
                }
                return Unit.f46060a;
            case 2:
                obj.getClass();
                return (Collection) obj;
            case 3:
                y130 y130Var = (y130) obj;
                y130Var.getClass();
                return new o6b(y130Var);
            case 4:
                Validity validity = (Validity) obj;
                BasicDerAdapter basicDerAdapter = CertificateAdapters.f46255a;
                validity.getClass();
                return q3d.j(Long.valueOf(validity.f46265a), Long.valueOf(validity.b));
            case 5:
                List list = (List) obj;
                BasicDerAdapter basicDerAdapter2 = CertificateAdapters.f46255a;
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                long jLongValue = ((Long) obj2).longValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                Object obj4 = list.get(2);
                obj4.getClass();
                return new PrivateKeyInfo(jLongValue, (AlgorithmIdentifier) obj3, (qg9) obj4);
            case 6:
                List list2 = (List) obj;
                BasicDerAdapter basicDerAdapter3 = CertificateAdapters.f46255a;
                list2.getClass();
                Object obj5 = list2.get(0);
                obj5.getClass();
                long jLongValue2 = ((Long) obj5).longValue();
                Object obj6 = list2.get(1);
                obj6.getClass();
                return new Validity(jLongValue2, ((Long) obj6).longValue());
            case 7:
                BasicDerAdapter basicDerAdapter4 = CertificateAdapters.f46255a;
                if (Intrinsics.d(obj, "1.2.840.113549.1.1.11")) {
                    return Adapters.f;
                }
                if (Intrinsics.d(obj, "1.2.840.113549.1.1.1")) {
                    return Adapters.f;
                }
                if (Intrinsics.d(obj, "1.2.840.10045.2.1")) {
                    return Adapters.g;
                }
                return null;
            case 8:
                AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) obj;
                BasicDerAdapter basicDerAdapter5 = CertificateAdapters.f46255a;
                algorithmIdentifier.getClass();
                return q3d.j(algorithmIdentifier.f46248a, algorithmIdentifier.b);
            case 9:
                List list3 = (List) obj;
                BasicDerAdapter basicDerAdapter6 = CertificateAdapters.f46255a;
                list3.getClass();
                Object obj7 = list3.get(0);
                obj7.getClass();
                return new AlgorithmIdentifier((String) obj7, list3.get(1));
            case 10:
                BasicConstraints basicConstraints = (BasicConstraints) obj;
                BasicDerAdapter basicDerAdapter7 = CertificateAdapters.f46255a;
                basicConstraints.getClass();
                return q3d.j(Boolean.valueOf(basicConstraints.f46251a), basicConstraints.b);
            case 11:
                List list4 = (List) obj;
                BasicDerAdapter basicDerAdapter8 = CertificateAdapters.f46255a;
                list4.getClass();
                Object obj8 = list4.get(0);
                obj8.getClass();
                return new BasicConstraints((Long) list4.get(1), ((Boolean) obj8).booleanValue());
            case 12:
                BasicDerAdapter basicDerAdapter9 = CertificateAdapters.f46255a;
                if (Intrinsics.d(obj, "2.5.29.17")) {
                    return CertificateAdapters.d;
                }
                if (Intrinsics.d(obj, "2.5.29.19")) {
                    return CertificateAdapters.f46255a;
                }
                return null;
            case 13:
                Extension extension = (Extension) obj;
                BasicDerAdapter basicDerAdapter10 = CertificateAdapters.f46255a;
                extension.getClass();
                return q3d.j(extension.f46261a, Boolean.valueOf(extension.b), extension.c);
            case 14:
                List list5 = (List) obj;
                BasicDerAdapter basicDerAdapter11 = CertificateAdapters.f46255a;
                list5.getClass();
                Object obj9 = list5.get(0);
                obj9.getClass();
                Object obj10 = list5.get(1);
                obj10.getClass();
                return new Extension((String) obj9, list5.get(2), ((Boolean) obj10).booleanValue());
            case 15:
                AttributeTypeAndValue attributeTypeAndValue = (AttributeTypeAndValue) obj;
                BasicDerAdapter basicDerAdapter12 = CertificateAdapters.f46255a;
                attributeTypeAndValue.getClass();
                return q3d.j(attributeTypeAndValue.f46250a, attributeTypeAndValue.b);
            case 16:
                List list6 = (List) obj;
                BasicDerAdapter basicDerAdapter13 = CertificateAdapters.f46255a;
                list6.getClass();
                Object obj11 = list6.get(0);
                obj11.getClass();
                return new AttributeTypeAndValue((String) obj11, list6.get(1));
            case 17:
                SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) obj;
                BasicDerAdapter basicDerAdapter14 = CertificateAdapters.f46255a;
                subjectPublicKeyInfo.getClass();
                return q3d.j(subjectPublicKeyInfo.f46263a, subjectPublicKeyInfo.b);
            case 18:
                List list7 = (List) obj;
                BasicDerAdapter basicDerAdapter15 = CertificateAdapters.f46255a;
                list7.getClass();
                Object obj12 = list7.get(0);
                obj12.getClass();
                Object obj13 = list7.get(1);
                obj13.getClass();
                return new SubjectPublicKeyInfo((AlgorithmIdentifier) obj12, (BitString) obj13);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                TbsCertificate tbsCertificate = (TbsCertificate) obj;
                BasicDerAdapter basicDerAdapter16 = CertificateAdapters.f46255a;
                tbsCertificate.getClass();
                Long lValueOf = Long.valueOf(tbsCertificate.f46264a);
                BigInteger bigInteger = tbsCertificate.b;
                AlgorithmIdentifier algorithmIdentifier2 = tbsCertificate.c;
                BasicDerAdapter basicDerAdapter17 = CertificateAdapters.e;
                return q3d.j(lValueOf, bigInteger, algorithmIdentifier2, new Pair(basicDerAdapter17, tbsCertificate.d), tbsCertificate.e, new Pair(basicDerAdapter17, tbsCertificate.f), tbsCertificate.g, tbsCertificate.h, tbsCertificate.i, tbsCertificate.j);
            case 20:
                List list8 = (List) obj;
                BasicDerAdapter basicDerAdapter18 = CertificateAdapters.f46255a;
                list8.getClass();
                Object obj14 = list8.get(0);
                obj14.getClass();
                long jLongValue3 = ((Long) obj14).longValue();
                Object obj15 = list8.get(1);
                obj15.getClass();
                BigInteger bigInteger2 = (BigInteger) obj15;
                Object obj16 = list8.get(2);
                obj16.getClass();
                AlgorithmIdentifier algorithmIdentifier3 = (AlgorithmIdentifier) obj16;
                Object obj17 = list8.get(3);
                obj17.getClass();
                Object obj18 = ((Pair) obj17).b;
                obj18.getClass();
                List list9 = (List) obj18;
                Object obj19 = list8.get(4);
                obj19.getClass();
                Validity validity2 = (Validity) obj19;
                Object obj20 = list8.get(5);
                obj20.getClass();
                Object obj21 = ((Pair) obj20).b;
                obj21.getClass();
                List list10 = (List) obj21;
                Object obj22 = list8.get(6);
                obj22.getClass();
                SubjectPublicKeyInfo subjectPublicKeyInfo2 = (SubjectPublicKeyInfo) obj22;
                BitString bitString = (BitString) list8.get(7);
                BitString bitString2 = (BitString) list8.get(8);
                Object obj23 = list8.get(9);
                obj23.getClass();
                return new TbsCertificate(jLongValue3, bigInteger2, algorithmIdentifier3, list9, validity2, list10, subjectPublicKeyInfo2, bitString, bitString2, (List) obj23);
            case 21:
                Certificate certificate = (Certificate) obj;
                BasicDerAdapter basicDerAdapter19 = CertificateAdapters.f46255a;
                certificate.getClass();
                return q3d.j(certificate.f46254a, certificate.b, certificate.c);
            case 22:
                List list11 = (List) obj;
                BasicDerAdapter basicDerAdapter20 = CertificateAdapters.f46255a;
                list11.getClass();
                Object obj24 = list11.get(0);
                obj24.getClass();
                Object obj25 = list11.get(1);
                obj25.getClass();
                Object obj26 = list11.get(2);
                obj26.getClass();
                return new Certificate((TbsCertificate) obj24, (AlgorithmIdentifier) obj25, (BitString) obj26);
            case 23:
                PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) obj;
                BasicDerAdapter basicDerAdapter21 = CertificateAdapters.f46255a;
                privateKeyInfo.getClass();
                return q3d.j(Long.valueOf(privateKeyInfo.f46262a), privateKeyInfo.b, privateKeyInfo.c);
            case 24:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new ukb(sjdVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                nll0 nll0Var = (nll0) obj;
                nll0Var.getClass();
                return new vkb(nll0Var);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sjb sjbVar = (sjb) obj;
                sjbVar.getClass();
                return sjbVar.getKey();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sjb sjbVar2 = (sjb) obj;
                sjbVar2.getClass();
                return sre0.f32672a.b(sjbVar2.getClass());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            default:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, R.drawable.ic_glyph_circle_warning);
                return Unit.f46060a;
        }
    }
}
