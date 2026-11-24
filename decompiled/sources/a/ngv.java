package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ngv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23503a;

    public ngv(int i) {
        this.f23503a = i;
        if (i > 0) {
            return;
        }
        adx.a("Provided count should be larger than zero");
    }

    public final ArrayList a(int i, int i2) {
        int i3 = this.f23503a;
        int i4 = i - ((i3 - 1) * i2);
        int i5 = i4 / i3;
        int i6 = i4 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i7 = 0;
        while (i7 < i3) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ngv) {
            return this.f23503a == ((ngv) obj).f23503a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f23503a;
    }
}
