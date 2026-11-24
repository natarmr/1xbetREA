package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f45403a;
    public ArrayList b;

    public final void a() {
        int[] iArr = this.f45403a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    public final void b(int i) {
        int[] iArr = this.f45403a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f45403a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f45403a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f45403a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i, int i2) {
        int[] iArr = this.f45403a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        b(i3);
        int[] iArr2 = this.f45403a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.f45403a, i, i3, -1);
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f45399a;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f45399a = i4 + i2;
            }
        }
    }

    public final void d(int i, int i2) {
        int[] iArr = this.f45403a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        b(i3);
        int[] iArr2 = this.f45403a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.f45403a;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f45399a;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f45399a = i4 - i2;
                }
            }
        }
    }
}
