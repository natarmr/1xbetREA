package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v610 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36851a = 1;
    public int b;
    public long[] c;

    public v610(int i) {
        this.c = new long[i];
    }

    public final void a(long j) {
        switch (this.f36851a) {
            case 0:
                int i = this.b;
                long[] jArrCopyOf = this.c;
                if (i == jArrCopyOf.length) {
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i * 2);
                    this.c = jArrCopyOf;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                jArrCopyOf[i2] = j;
                break;
            default:
                if (!c(j)) {
                    int i3 = this.b;
                    long[] jArrCopyOf2 = this.c;
                    if (i3 >= jArrCopyOf2.length) {
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(i3 + 1, jArrCopyOf2.length * 2));
                        this.c = jArrCopyOf2;
                    }
                    jArrCopyOf2[i3] = j;
                    if (i3 >= this.b) {
                        this.b = i3 + 1;
                    }
                }
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArrCopyOf = this.c;
        if (length > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(jArrCopyOf.length * 2, length));
            this.c = jArrCopyOf;
        }
        System.arraycopy(jArr, 0, jArrCopyOf, this.b, jArr.length);
        this.b = length;
    }

    public boolean c(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.c[i];
        }
        hny.k(this.b, b1j.m(i, "Invalid index ", ", size is "));
        return 0L;
    }

    public void e(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.c[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public /* synthetic */ v610() {
    }
}
