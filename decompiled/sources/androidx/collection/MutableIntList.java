package androidx.collection;

import a.l1e0;
import a.pkx;
import a.qx3;
import a.v4i0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u0000¨\u0006\u0001"}, d2 = {"Landroidx/collection/MutableIntList;", "collection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MutableIntList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f45342a;
    public int b;

    public MutableIntList(int i) {
        this.f45342a = i == 0 ? pkx.f27156a : new int[i];
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.f45342a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.f45342a;
        if (iArr.length < i) {
            this.f45342a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.f45342a[i];
        }
        v4i0.m("Index must be between 0 and size");
        return 0;
    }

    public final int d() {
        int i = this.b;
        if (i != 0) {
            return this.f45342a[i - 1];
        }
        v4i0.o("IntList is empty.");
        return 0;
    }

    public final void e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            v4i0.m("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f45342a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            qx3.d(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MutableIntList) {
            MutableIntList mutableIntList = (MutableIntList) obj;
            int i = mutableIntList.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.f45342a;
                int[] iArr2 = mutableIntList.f45342a;
                IntRange intRangeO = l1e0.o(0, i2);
                int i3 = intRangeO.f46068a;
                int i4 = intRangeO.b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            v4i0.m("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f45342a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.f45342a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.f45342a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ MutableIntList() {
        this(16);
    }
}
