package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f4x extends s3x implements Set {
    public static final /* synthetic */ int c = 0;
    public transient b4x b;

    public static int k(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            x0x.z("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static f4x l(int i, Object... objArr) {
        if (i == 0) {
            return ycf0.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new r5k0(obj);
        }
        int iK = k(i);
        Object[] objArr2 = new Object[iK];
        int i2 = iK - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                hny.u(twn.m(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iY = gkb.Y(iHashCode);
            while (true) {
                int i6 = iY & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iY++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new r5k0(obj4);
        }
        if (k(i4) < iK / 2) {
            return l(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new ycf0(i3, i2, i4, objArr, objArr2);
    }

    public static f4x m(Collection collection) {
        if ((collection instanceof f4x) && !(collection instanceof SortedSet)) {
            f4x f4xVar = (f4x) collection;
            if (!f4xVar.i()) {
                return f4xVar;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static f4x q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        x0x.z("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return l(length, objArr2);
    }

    @Override // a.s3x
    public b4x b() {
        b4x b4xVar = this.b;
        if (b4xVar != null) {
            return b4xVar;
        }
        b4x b4xVarO = o();
        this.b = b4xVarO;
        return b4xVarO;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f4x) && (this instanceof ycf0) && (((f4x) obj) instanceof ycf0) && ((ycf0) this).e != obj.hashCode()) {
            return false;
        }
        return d7x.u(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d7x.A(this);
    }

    public b4x o() {
        Object[] array = toArray(s3x.f31578a);
        v3x v3xVar = b4x.b;
        return b4x.k(array.length, array);
    }
}
