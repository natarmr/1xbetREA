package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e28 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7073a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public e28(int... iArr) {
        List listL0;
        this.f7073a = iArr;
        byte b = 0;
        Integer numF = tx3.F(iArr, 0);
        this.b = numF != null ? numF.intValue() : -1;
        Integer numF2 = tx3.F(iArr, 1);
        this.c = numF2 != null ? numF2.intValue() : -1;
        Integer numF3 = tx3.F(iArr, 2);
        this.d = numF3 != null ? numF3.intValue() : -1;
        if (iArr.length <= 3) {
            listL0 = iun.f15405a;
        } else {
            if (iArr.length > 1024) {
                jf4.o(brm0.n(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listL0 = CollectionsKt.L0(new px3(iArr, b).subList(3, iArr.length));
        }
        this.e = listL0;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        e28 e28Var = (e28) obj;
        return this.b == e28Var.b && this.c == e28Var.c && this.d == e28Var.d && Intrinsics.d(this.e, e28Var.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = this.f7073a;
        int length = iArr.length;
        int iC = 0;
        while (iC < length) {
            int i = iArr[iC];
            if (i == -1) {
                break;
            }
            iC = w6x.c(i, iC, 1, arrayList);
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.b0(arrayList, Separators.DOT, null, null, null, 62);
    }
}
