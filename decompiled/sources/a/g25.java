package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g25 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10545a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public y8f g;
    public p9f h;
    public o9f i;
    public z8f j;
    public List k;
    public int l;
    public byte m;

    public final h25 a() {
        String str;
        String str2;
        y8f y8fVar;
        if (this.m == 7 && (str = this.f10545a) != null && (str2 = this.b) != null && (y8fVar = this.g) != null) {
            return new h25(str, str2, this.c, this.d, this.e, this.f, y8fVar, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f10545a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
