package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41838a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public String h;
    public List i;
    public byte j;

    public final z15 a() {
        String str;
        if (this.j == 63 && (str = this.b) != null) {
            return new z15(this.f41838a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.b == null) {
            sb.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb.append(" timestamp");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
