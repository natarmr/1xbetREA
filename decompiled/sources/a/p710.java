package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p710 extends d710 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26483a;
    public final long b;
    public boolean c;
    public long d;

    public p710(long j, long j2, long j3) {
        this.f26483a = j3;
        this.b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // a.d710
    public final long nextLong() {
        long j = this.d;
        if (j != this.b) {
            this.d = this.f26483a + j;
            return j;
        }
        if (this.c) {
            this.c = false;
            return j;
        }
        itt0.a();
        return 0L;
    }
}
