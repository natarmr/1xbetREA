package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o25 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f9f f24515a;
    public List b;
    public List c;
    public Boolean d;
    public g9f e;
    public List f;
    public int g;
    public byte h;

    public final p25 a() {
        f9f f9fVar;
        if (this.h == 1 && (f9fVar = this.f24515a) != null) {
            return new p25(f9fVar, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f24515a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }
}
