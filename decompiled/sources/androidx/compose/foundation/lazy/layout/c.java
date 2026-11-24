package androidx.compose.foundation.lazy.layout;

import a.adx;
import a.q5x;
import a.ry40;
import a.v960;
import a.xz40;
import a.zmx;
import a.zz2;
import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ry40 f45344a;
    public final Object[] b;
    public final int c;

    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    public c(IntRange intRange, b bVar) {
        Object defaultLazyKey;
        zz2 zz2VarB = bVar.b();
        int i = intRange.f46068a;
        if (i < 0) {
            adx.c("negative nearestRange.first");
        }
        int iMin = Math.min(intRange.b, zz2VarB.f45232a - 1);
        if (iMin < i) {
            ry40 ry40Var = v960.f37020a;
            ry40Var.getClass();
            this.f45344a = ry40Var;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        ry40 ry40Var2 = new ry40(i2);
        xz40 xz40Var = (xz40) zz2VarB.b;
        if (i < 0 || i >= zz2VarB.f45232a) {
            adx.e("Index " + i + ", size " + zz2VarB.f45232a);
        }
        if (iMin < 0 || iMin >= zz2VarB.f45232a) {
            adx.e("Index " + iMin + ", size " + zz2VarB.f45232a);
        }
        if (iMin < i) {
            adx.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + Separators.RPAREN);
        }
        int iA = q5x.A(i, xz40Var);
        int i3 = ((zmx) xz40Var.f41739a[iA]).f44646a;
        while (i3 <= iMin) {
            zmx zmxVar = (zmx) xz40Var.f41739a[iA];
            Function1 key = zmxVar.c.getKey();
            int i4 = zmxVar.f44646a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (zmxVar.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        defaultLazyKey = key.invoke(Integer.valueOf(iMax - i4));
                        defaultLazyKey = defaultLazyKey == null ? new DefaultLazyKey(iMax) : defaultLazyKey;
                    }
                    ry40Var2.g(iMax, defaultLazyKey);
                    this.b[iMax - this.c] = defaultLazyKey;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += zmxVar.b;
            iA++;
        }
        this.f45344a = ry40Var2;
    }

    public final int a(Object obj) {
        ry40 ry40Var = this.f45344a;
        int iD = ry40Var.d(obj);
        if (iD >= 0) {
            return ry40Var.c[iD];
        }
        return -1;
    }

    public final Object b(int i) {
        int i2 = i - this.c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }
}
