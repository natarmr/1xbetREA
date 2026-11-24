package a;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v3c0 implements kq00 {
    public final Uri b;
    public final enm0 c;
    public final oif0 d;
    public final y3c0 e;
    public final brd f;
    public volatile boolean h;
    public long j;
    public ncs0 l;
    public boolean m;
    public final /* synthetic */ y3c0 n;
    public final mtc g = new mtc();
    public boolean i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36726a = wn00.c.getAndIncrement();
    public mbj k = c(0, null);

    public v3c0(y3c0 y3c0Var, Uri uri, jbj jbjVar, oif0 oif0Var, y3c0 y3c0Var2, brd brdVar) {
        this.n = y3c0Var;
        this.b = uri;
        this.c = new enm0(jbjVar);
        this.d = oif0Var;
        this.e = y3c0Var2;
        this.f = brdVar;
    }

    @Override // a.kq00
    public final void a() {
        jbj ywwVar;
        fuo fuoVar;
        int i;
        int iA = 0;
        String str = null;
        while (iA == 0 && !this.h) {
            try {
                long j = this.g.f22363a;
                mbj mbjVarC = c(j, str);
                this.k = mbjVarC;
                long jD = this.c.d(mbjVarC);
                if (this.h) {
                    if (iA != 1 && this.d.q() != -1) {
                        this.g.f22363a = this.d.q();
                    }
                    xkb.J(this.c);
                    return;
                }
                List list = (List) this.c.f8102a.e().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jD != -1) {
                    jD += j;
                    y3c0 y3c0Var = this.n;
                    y3c0Var.q.post(new s3c0(y3c0Var, (byte) 0));
                }
                long j2 = jD;
                this.n.s = axw.d(this.c.f8102a.e());
                enm0 enm0Var = this.c;
                axw axwVar = this.n.s;
                if (axwVar == null || (i = axwVar.f) == -1) {
                    ywwVar = enm0Var;
                } else {
                    ywwVar = new yww(enm0Var, i, this);
                    ncs0 ncs0VarE = this.n.E(new x3c0(0, true));
                    this.l = ncs0VarE;
                    ncs0VarE.c(y3c0.v1);
                }
                this.d.s(ywwVar, this.b, this.c.f8102a.e(), j, j2, this.e);
                if (this.n.s != null && (fuoVar = (fuo) this.d.c) != null) {
                    fuo fuoVarD = fuoVar.d();
                    if (fuoVarD instanceof av40) {
                        ((av40) fuoVarD).s = true;
                    }
                }
                if (this.i) {
                    oif0 oif0Var = this.d;
                    long j3 = this.j;
                    fuo fuoVar2 = (fuo) oif0Var.c;
                    fuoVar2.getClass();
                    fuoVar2.b(j, j3);
                    this.i = false;
                }
                while (iA == 0 && !this.h) {
                    try {
                        brd brdVar = this.f;
                        synchronized (brdVar) {
                            while (!brdVar.b) {
                                try {
                                    brdVar.f3075a.getClass();
                                    brdVar.wait();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        oif0 oif0Var2 = this.d;
                        mtc mtcVar = this.g;
                        fuo fuoVar3 = (fuo) oif0Var2.c;
                        fuoVar3.getClass();
                        guj gujVar = (guj) oif0Var2.d;
                        gujVar.getClass();
                        iA = fuoVar3.a(gujVar, mtcVar);
                        long jQ = this.d.q();
                        if (jQ > this.n.i + j) {
                            brd brdVar2 = this.f;
                            synchronized (brdVar2) {
                                brdVar2.b = false;
                            }
                            y3c0 y3c0Var2 = this.n;
                            y3c0Var2.q.post(y3c0Var2.p);
                            j = jQ;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iA == 1) {
                    iA = 0;
                } else if (this.d.q() != -1) {
                    this.g.f22363a = this.d.q();
                }
                xkb.J(this.c);
            } catch (Throwable th2) {
                if (iA != 1 && this.d.q() != -1) {
                    this.g.f22363a = this.d.q();
                }
                xkb.J(this.c);
                throw th2;
            }
        }
    }

    @Override // a.kq00
    public final void b() {
        this.h = true;
    }

    public final mbj c(long j, String str) {
        Map mapE = y3c0.u1;
        if (str != null && !str.startsWith("W/")) {
            zz2 zz2VarA = wcf0.a();
            zz2VarA.B(mapE.entrySet());
            zz2VarA.A("If-Range", str);
            mapE = zz2VarA.e(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.b;
        x0x.G(uri, "The uri must be set.");
        return new mbj(uri, 1, null, mapE, j, -1L, 6);
    }
}
