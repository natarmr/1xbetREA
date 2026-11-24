package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22064a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public mmw0(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        s0x.E(str);
        s0x.E(str2);
        s0x.C(j >= 0);
        s0x.C(j2 >= 0);
        s0x.C(j3 >= 0);
        s0x.C(j5 >= 0);
        this.f22064a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final mmw0 a(long j) {
        return new mmw0(this.f22064a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    public final mmw0 b(Long l, Long l2, Boolean bool) {
        return new mmw0(this.f22064a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }
}
