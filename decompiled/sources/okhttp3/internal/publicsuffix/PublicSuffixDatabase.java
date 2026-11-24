package okhttp3.internal.publicsuffix;

import a.gl5;
import a.iun;
import a.pgi0;
import a.qg9;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PublicSuffixDatabase {
    public static final qg9 b = new qg9(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = a.c(Separators.STAR);
    public static final PublicSuffixDatabase d = new PublicSuffixDatabase(new AssetPublicSuffixList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetPublicSuffixList f46218a;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "La/qg9;", "WILDCARD_LABEL", "La/qg9;", "", "", "PREVAILING_RULE", "Ljava/util/List;", "", "EXCEPTION_MARKER", TokenNames.C, "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static String a(qg9 qg9Var, qg9[] qg9VarArr, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            int iE = qg9Var.e();
            int i5 = 0;
            while (i5 < iE) {
                int i6 = (i5 + iE) / 2;
                while (i6 > -1 && qg9Var.l(i6) != 10) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (qg9Var.l(i2) == 10) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte bL = qg9VarArr[i10].l(i11);
                        byte[] bArr = _UtilCommonKt.f46121a;
                        int i13 = bL & 255;
                        z = z2;
                        i3 = i13;
                    }
                    byte bL2 = qg9Var.l(i7 + i12);
                    byte[] bArr2 = _UtilCommonKt.f46121a;
                    i4 = i3 - (bL2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (qg9VarArr[i10].e() != i11) {
                        z2 = z;
                    } else {
                        if (i10 == qg9VarArr.length - 1) {
                            break;
                        }
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int iE2 = qg9VarArr[i10].e() - i11;
                        int length = qg9VarArr.length;
                        for (int i15 = i10 + 1; i15 < length; i15++) {
                            iE2 += qg9VarArr[i15].e();
                        }
                        if (iE2 >= i14) {
                            if (iE2 <= i14) {
                                return qg9Var.s(i7, i9 + i7).r(Charsets.UTF_8);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                iE = i6;
            }
            return null;
        }
    }

    public PublicSuffixDatabase(AssetPublicSuffixList assetPublicSuffixList) {
        this.f46218a = assetPublicSuffixList;
    }

    public static List b(String str) {
        List listI0 = StringsKt.i0(str, new char[]{'.'}, 6);
        return Intrinsics.d(CollectionsKt.d0(listI0), "") ? CollectionsKt.P(1, listI0) : listI0;
    }

    public final String a(String str) {
        String strA;
        String strA2;
        String strA3;
        List listI0;
        List listI1;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        AssetPublicSuffixList assetPublicSuffixList = this.f46218a;
        AtomicBoolean atomicBoolean = assetPublicSuffixList.f46217a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                assetPublicSuffixList.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        assetPublicSuffixList.c();
                        break;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    assetPublicSuffixList.e = e;
                    if (z) {
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (assetPublicSuffixList.c == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) assetPublicSuffixList.f) + " resource.");
            illegalStateException.initCause(assetPublicSuffixList.e);
            throw illegalStateException;
        }
        int size3 = listB.size();
        qg9[] qg9VarArr = new qg9[size3];
        for (int i = 0; i < size3; i++) {
            qg9 qg9Var = qg9.d;
            qg9VarArr[i] = gl5.i((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strA = null;
                break;
            }
            strA = Companion.a(assetPublicSuffixList.a(), qg9VarArr, i2);
            if (strA != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strA2 = null;
            break;
        }
        qg9[] qg9VarArr2 = (qg9[]) qg9VarArr.clone();
        int length = qg9VarArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strA2 = null;
                break;
            }
            qg9VarArr2[i3] = b;
            strA2 = Companion.a(assetPublicSuffixList.a(), qg9VarArr2, i3);
            if (strA2 != null) {
                break;
            }
            i3++;
        }
        if (strA2 == null) {
            strA3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strA3 = null;
                break;
            }
            qg9 qg9Var2 = assetPublicSuffixList.d;
            if (qg9Var2 == null) {
                Intrinsics.h("exceptionBytes");
                throw null;
            }
            strA3 = Companion.a(qg9Var2, qg9VarArr, i5);
            if (strA3 != null) {
                break;
            }
            i5++;
        }
        if (strA3 != null) {
            listI1 = StringsKt.i0("!".concat(strA3), new char[]{'.'}, 6);
        } else if (strA == null && strA2 == null) {
            listI1 = c;
        } else {
            if (strA == null || (listI0 = StringsKt.i0(strA, new char[]{'.'}, 6)) == null) {
                listI0 = iun.f15405a;
            }
            if (strA2 == null || (listI1 = StringsKt.i0(strA2, new char[]{'.'}, 6)) == null) {
                listI1 = iun.f15405a;
            }
            if (listI0.size() > listI1.size()) {
                listI1 = listI0;
            }
        }
        if (listB.size() == listI1.size() && ((String) listI1.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listI1.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listI1.size();
        } else {
            size = listB.size();
            size2 = listI1.size() + 1;
        }
        return pgi0.n(pgi0.g(CollectionsKt.I(b(str)), size - size2), Separators.DOT);
    }
}
