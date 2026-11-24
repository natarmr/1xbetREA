package a;

import android.gov.nist.core.Separators;
import android.media.MediaCodec;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l13 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19228a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 1;
        switch (this.f19228a) {
            case 0:
                return Intrinsics.e(((qwb0) obj2).f29428a ? 1 : 0, ((qwb0) obj).f29428a ? 1 : 0);
            case 1:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 2:
                return Integer.compare(((androidx.media3.common.b) obj2).k, ((androidx.media3.common.b) obj).k);
            case 3:
                return Integer.compare(((o8b) obj2).b, ((o8b) obj).b);
            case 4:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 5:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 6:
                String name = ((File) obj).getName();
                byte b = x9f.f;
                return name.substring(0, b).compareTo(((File) obj2).getName().substring(0, b));
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                return Integer.compare(((kyj) ((List) obj).get(0)).f, ((kyj) ((List) obj2).get(0)).f);
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                byte b2 = 12;
                byte b3 = 13;
                return edd.f(ryj.c((ryj) Collections.max(list, new l13(b2)), (ryj) Collections.max(list2, new l13(b2)))).a(list.size(), list2.size()).b((ryj) Collections.max(list, new l13(b3)), (ryj) Collections.max(list2, new l13(b3)), new l13(b3)).e();
            case 10:
                return ((jyj) Collections.max((List) obj)).compareTo((jyj) Collections.max((List) obj2));
            case 11:
                return ((oyj) ((List) obj).get(0)).compareTo((oyj) ((List) obj2).get(0));
            case 12:
                return ryj.c((ryj) obj, (ryj) obj2);
            case 13:
                ryj ryjVar = (ryj) obj;
                ryj ryjVar2 = (ryj) obj2;
                boolean z = ryjVar.e;
                int i2 = ryjVar.j;
                ia80 ia80VarA = (z && ryjVar.h) ? syj.k : syj.k.a();
                ryjVar.f.getClass();
                gdd gddVarB = gdd.f11100a.c(ryjVar.y, ryjVar2.y).b(Integer.valueOf(ryjVar.k), Integer.valueOf(ryjVar2.k), ia80VarA);
                if (ryjVar.u && ryjVar.w) {
                    gddVarB = gddVarB.a(ryjVar.x, ryjVar2.x);
                }
                return gddVarB.c(ryjVar.v, ryjVar2.v).b(Integer.valueOf(i2), Integer.valueOf(ryjVar2.j), ia80VarA).e();
            case 14:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b4 = bArr[i3];
                    byte b5 = bArr2[i3];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
            case 15:
                return Intrinsics.e(((fox) obj).b, ((fox) obj2).b);
            case 16:
                return Integer.parseInt(((String) obj).split(Separators.COLON)[0]) - Integer.parseInt(((String) obj2).split(Separators.COLON)[0]);
            case 17:
                return ((abw) obj).f598a.compareTo(((abw) obj2).f598a);
            case 18:
                IntRange intRange = (IntRange) obj;
                IntRange intRange2 = (IntRange) obj2;
                return (intRange.b - intRange.f46068a) - (intRange2.b - intRange2.f46068a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                e7z e7zVar = (e7z) obj;
                e7z e7zVar2 = (e7z) obj2;
                float f = e7zVar.i1.p.g1;
                float f2 = e7zVar2.i1.p.g1;
                return f == f2 ? Intrinsics.e(e7zVar.w(), e7zVar2.w()) : Float.compare(f, f2);
            case 20:
                return Intrinsics.e(((kbz) obj).getIndex(), ((kbz) obj2).getIndex());
            case 21:
                return ((u15) obj).f34886a.compareTo(((u15) obj2).f34886a);
            case 22:
                return ((Number) bbi0.b.invoke(obj, obj2)).intValue();
            case 23:
                return ((b25) ((s8f) obj)).f1839a.compareTo(((b25) ((s8f) obj2)).f1839a);
            case 24:
                return ((k8k0) obj).f17877a - ((k8k0) obj2).f17877a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Float.compare(((k8k0) obj).c, ((k8k0) obj2).c);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cnk0 cnk0Var = (cnk0) obj;
                cnk0 cnk0Var2 = (cnk0) obj2;
                int iCompare = Integer.compare(cnk0Var2.b, cnk0Var.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = cnk0Var.c.compareTo(cnk0Var2.c);
                return iCompareTo != 0 ? iCompareTo : cnk0Var.d.compareTo(cnk0Var2.d);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                cnk0 cnk0Var3 = (cnk0) obj;
                cnk0 cnk0Var4 = (cnk0) obj2;
                int iCompare2 = Integer.compare(cnk0Var4.f4660a, cnk0Var3.f4660a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = cnk0Var4.c.compareTo(cnk0Var3.c);
                return iCompareTo2 != 0 ? iCompareTo2 : cnk0Var4.d.compareTo(cnk0Var3.d);
            default:
                a55 a55Var = (a55) obj2;
                Class cls = ((a55) obj).f252a.j;
                int i4 = cls == MediaCodec.class ? 2 : (cls == oub0.class || cls == qrm0.class) ? 0 : 1;
                Class cls2 = a55Var.f252a.j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 == oub0.class || cls2 == qrm0.class) {
                    i = 0;
                }
                return i4 - i;
        }
    }

    public /* synthetic */ l13(byte b) {
        this.f19228a = b;
    }
}
