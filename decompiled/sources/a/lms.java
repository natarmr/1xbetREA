package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f20313a = q3d.j(Long.valueOf(ewg.d.b), Long.valueOf(pxg.d.b), Long.valueOf(fsg.d.b), Long.valueOf(yrg.d.b), Long.valueOf(rtg.d.b), Long.valueOf(hwg.d.b), Long.valueOf(ntg.d.b), Long.valueOf(lug.d.b), Long.valueOf(jwg.d.b), Long.valueOf(cug.d.b), Long.valueOf(mxg.d.b), Long.valueOf(jrg.d.b), Long.valueOf(vrg.d.b), Long.valueOf(uvg.d.b), Long.valueOf(iug.d.b));

    public static final long a(m9s m9sVar, long j) {
        m9sVar.getClass();
        boolean z = m9sVar.I instanceof qz7;
        qqs qqsVar = m9sVar.h;
        long j2 = qqsVar.h;
        if (!z) {
            return (m9sVar.p == 2 || znq0.f(j2) == 0) ? j : znq0.f(j2);
        }
        znq0 znq0Var = qqsVar.k;
        if (znq0Var != null) {
            return znq0.f(znq0Var.f44687a);
        }
        return 0L;
    }

    public static final boolean b(m9s m9sVar) {
        m9sVar.getClass();
        return !m9sVar.x || dyb.e0(m9sVar.v);
    }

    public static final boolean c(m9s m9sVar, long j) {
        m9sVar.getClass();
        if (j != 0) {
            return (f20313a.contains(Long.valueOf(m9sVar.o)) || b(m9sVar)) ? false : true;
        }
        return false;
    }
}
