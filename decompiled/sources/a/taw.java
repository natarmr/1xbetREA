package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class taw implements am30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33633a;
    public long b = -1;
    public final List c;
    public final long d;

    public taw(long j, List list) {
        this.f33633a = list.size() - 1;
        this.d = j;
        this.c = list;
    }

    @Override // a.am30
    public final long a() {
        long j = this.b;
        if (j < 0 || j > this.f33633a) {
            itt0.a();
            return 0L;
        }
        return this.d + ((gbw) this.c.get((int) j)).e;
    }

    @Override // a.am30
    public final long b() {
        long j = this.b;
        if (j < 0 || j > this.f33633a) {
            itt0.a();
            return 0L;
        }
        gbw gbwVar = (gbw) this.c.get((int) j);
        return this.d + gbwVar.e + gbwVar.c;
    }

    @Override // a.am30
    public final boolean next() {
        long j = this.b + 1;
        this.b = j;
        return !(j > this.f33633a);
    }
}
