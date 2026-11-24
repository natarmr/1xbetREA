package a;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vtj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38010a;
    public final float[] b;
    public final int c;

    public vtj(List list, float[] fArr) {
        this.f38010a = list;
        this.b = fArr;
        if (list.size() != fArr.length) {
            adx.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + tx3.d0(fArr));
        }
        this.c = fArr.length;
    }

    public final Object a(float f) {
        float[] fArr = this.b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i2 = i3;
                f2 = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.f38010a.get(i2);
    }

    public final Object b(float f, boolean z) {
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.f38010a.get(i2);
    }

    public final float c() {
        float[] fArr = this.b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMin;
    }

    public final float d(Object obj) {
        int iIndexOf = this.f38010a.indexOf(obj);
        if (iIndexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.b;
        if (iIndexOf < fArr.length) {
            return fArr[iIndexOf];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtj)) {
            return false;
        }
        vtj vtjVar = (vtj) obj;
        return Intrinsics.d(this.f38010a, vtjVar.f38010a) && Arrays.equals(this.b, vtjVar.b) && this.c == vtjVar.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.f38010a.hashCode() * 31)) * 31) + this.c;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            Object objW = CollectionsKt.W(i, this.f38010a);
            if (i >= 0) {
                float[] fArr = this.b;
                if (i < fArr.length) {
                    f = fArr[i];
                } else {
                    f = Float.NaN;
                }
            } else {
                f = Float.NaN;
            }
            sb.append(objW + "=" + f);
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
