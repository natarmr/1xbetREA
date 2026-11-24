package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ime extends v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15020a = new ArrayList(0);

    public static void f(dgu dguVar, String str, String str2, p78 p78Var) {
        dguVar.e();
        int iA = dguVar.A();
        xmk0 xmk0Var = (xmk0) dguVar.c;
        StringBuilder sb = xmk0Var.f41130a;
        sb.append((char) 160);
        sb.append('\n');
        ((g9m0) ((w5z) dguVar.f6058a).b).getClass();
        xmk0Var.b(sb.length(), str2);
        sb.append((CharSequence) str2);
        dguVar.e();
        xmk0Var.a((char) 160);
        ((ljf0) dguVar.b).e(uc9.t, str);
        dguVar.G(p78Var, iA);
        dguVar.b(p78Var);
    }

    @Override // a.v3
    public final void d(vjy vjyVar) {
        j98 j98Var = new j98((byte) 1);
        vjyVar.b(ztm0.class, new j98((byte) 8));
        vjyVar.b(ktn.class, new j98((byte) 3));
        vjyVar.b(d98.class, new j98((byte) 0));
        vjyVar.b(vxc.class, new j98((byte) 2));
        vjyVar.b(hpp.class, j98Var);
        vjyVar.b(c5x.class, j98Var);
        vjyVar.b(hd00.class, new j98((byte) 6));
        vjyVar.b(etv.class, new j98((byte) 4));
        vjyVar.b(hb00.class, new j98((byte) 5));
        vjyVar.b(saq0.class, new j98((byte) 9));
    }

    @Override // a.v3
    public final void e(d930 d930Var) {
        d930Var.a(e2q0.class, new hme(this));
        d930Var.a(ztm0.class, new gme((byte) 6));
        d930Var.a(ktn.class, new gme((byte) 7));
        d930Var.a(d98.class, new gme((byte) 8));
        d930Var.a(vxc.class, new gme((byte) 9));
        d930Var.a(hpp.class, new gme((byte) 10));
        d930Var.a(c5x.class, new gme((byte) 11));
        d930Var.a(cyw.class, new gme((byte) 12));
        byte b = 14;
        d930Var.a(od9.class, new gme(b));
        d930Var.a(ba80.class, new gme(b));
        d930Var.a(hd00.class, new gme((byte) 13));
        d930Var.a(saq0.class, new gme((byte) 0));
        d930Var.a(etv.class, new gme((byte) 1));
        d930Var.a(okk0.class, new gme((byte) 2));
        d930Var.a(qmv.class, new gme((byte) 3));
        d930Var.a(un80.class, new gme((byte) 4));
        d930Var.a(hb00.class, new gme((byte) 5));
    }
}
