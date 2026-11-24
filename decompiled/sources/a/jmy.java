package a;

import androidx.collection.MutableIntList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jmy implements xen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imy f16788a;

    public jmy(imy imyVar) {
        this.f16788a = imyVar;
    }

    @Override // a.cfq, a.j73
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final t5u0 a(lxs0 lxs0Var) {
        int[] iArr;
        Object[] objArr;
        imy imyVar = this.f16788a;
        ey40 ey40Var = imyVar.b;
        MutableIntList mutableIntList = new MutableIntList(ey40Var.e + 2);
        ey40 ey40Var2 = new ey40(ey40Var.e);
        int[] iArr2 = ey40Var.b;
        Object[] objArr2 = ey40Var.c;
        long[] jArr = ey40Var.f11466a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            hmy hmyVar = (hmy) objArr2[i5];
                            mutableIntList.a(i6);
                            ey40Var2.j(i6, new s5u0((t73) lxs0Var.f20832a.invoke(hmyVar.f13326a), hmyVar.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!ey40Var.a(0)) {
            int i7 = mutableIntList.b;
            if (i7 < 0) {
                v4i0.m("Index must be between 0 and size");
                return null;
            }
            mutableIntList.b(i7 + 1);
            int[] iArr3 = mutableIntList.f45342a;
            int i8 = mutableIntList.b;
            if (i8 != 0) {
                qx3.d(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            mutableIntList.b++;
        }
        if (!ey40Var.a(imyVar.f15048a)) {
            mutableIntList.a(imyVar.f15048a);
        }
        int i9 = mutableIntList.b;
        if (i9 != 0) {
            int[] iArr4 = mutableIntList.f45342a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new t5u0(mutableIntList, ey40Var2, imyVar.f15048a, ihn.d);
    }
}
