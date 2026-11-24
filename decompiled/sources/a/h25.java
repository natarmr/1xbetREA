package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h25 extends q9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12314a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final y8f g;
    public final p9f h;
    public final o9f i;
    public final z8f j;
    public final List k;
    public final int l;

    public h25(String str, String str2, String str3, long j, Long l, boolean z, y8f y8fVar, p9f p9fVar, o9f o9fVar, z8f z8fVar, List list, int i) {
        this.f12314a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = y8fVar;
        this.h = p9fVar;
        this.i = o9fVar;
        this.j = z8fVar;
        this.k = list;
        this.l = i;
    }

    @Override // a.q9f
    public final g25 a() {
        g25 g25Var = new g25();
        g25Var.f10545a = this.f12314a;
        g25Var.b = this.b;
        g25Var.c = this.c;
        g25Var.d = this.d;
        g25Var.e = this.e;
        g25Var.f = this.f;
        g25Var.g = this.g;
        g25Var.h = this.h;
        g25Var.i = this.i;
        g25Var.j = this.j;
        g25Var.k = this.k;
        g25Var.l = this.l;
        g25Var.m = (byte) 7;
        return g25Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q9f) {
            h25 h25Var = (h25) ((q9f) obj);
            if (this.f12314a.equals(h25Var.f12314a) && this.b.equals(h25Var.b)) {
                String str = h25Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == h25Var.d) {
                        Long l = h25Var.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == h25Var.f && this.g.equals(h25Var.g)) {
                                p9f p9fVar = h25Var.h;
                                p9f p9fVar2 = this.h;
                                if (p9fVar2 != null ? p9fVar2.equals(p9fVar) : p9fVar == null) {
                                    o9f o9fVar = h25Var.i;
                                    o9f o9fVar2 = this.i;
                                    if (o9fVar2 != null ? o9fVar2.equals(o9fVar) : o9fVar == null) {
                                        z8f z8fVar = h25Var.j;
                                        z8f z8fVar2 = this.j;
                                        if (z8fVar2 != null ? z8fVar2.equals(z8fVar) : z8fVar == null) {
                                            List list = h25Var.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == h25Var.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f12314a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        p9f p9fVar = this.h;
        int iHashCode4 = (iHashCode3 ^ (p9fVar == null ? 0 : p9fVar.hashCode())) * 1000003;
        o9f o9fVar = this.i;
        int iHashCode5 = (iHashCode4 ^ (o9fVar == null ? 0 : o9fVar.hashCode())) * 1000003;
        z8f z8fVar = this.j;
        int iHashCode6 = (iHashCode5 ^ (z8fVar == null ? 0 : z8fVar.hashCode())) * 1000003;
        List list = this.k;
        return this.l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f12314a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return rz4.j(this.l, "}", sb);
    }
}
