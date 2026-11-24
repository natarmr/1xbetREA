package a;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes5.dex */
public final class e720 {
    public static final String f = a720.class.getSimpleName();
    public static final String g = b720.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final loi0 f7314a;
    public final ani0 b;
    public final lbu c;
    public final boolean d;
    public final String e;

    public e720(loi0 loi0Var, ani0 ani0Var, lbu lbuVar, lk5 lk5Var) {
        this.f7314a = loi0Var;
        this.b = ani0Var;
        this.c = lbuVar;
        boolean z = lk5Var.c(j820.f16066a) != ua20.MEDIUM_NO_GAME_INFO;
        this.d = z;
        this.e = z ? g : f;
    }

    public final void a(androidx.fragment.app.e eVar) {
        eVar.getClass();
        Fragment fragmentJ = eVar.J(this.e);
        sik sikVar = fragmentJ instanceof sik ? (sik) fragmentJ : null;
        if (sikVar != null) {
            sikVar.x0();
        }
    }

    public final void b(androidx.fragment.app.e eVar, m97 m97Var, m0k0 m0k0Var, ms2 ms2Var) {
        eVar.getClass();
        m97Var.getClass();
        m0k0Var.getClass();
        ms2Var.getClass();
        eVar.F();
        String str = this.e;
        if (eVar.J(str) != null || this.c.j()) {
            return;
        }
        this.f7314a.a(m97Var);
        ((nb7) ((h03) this.b.f1155a).b).c = m0k0Var.x;
        if (this.d) {
            b720.w2.getClass();
            b720 b720Var = new b720();
            iiy[] iiyVarArr = b720.x2;
            b720Var.s2.u(b720Var, iiyVarArr[0], m0k0Var);
            b720Var.t2.u(b720Var, iiyVarArr[1], ms2Var);
            sj3.E0(b720Var, eVar, str);
            return;
        }
        a720.x2.getClass();
        a720 a720Var = new a720();
        iiy[] iiyVarArr2 = a720.y2;
        a720Var.o2.u(a720Var, iiyVarArr2[1], m0k0Var);
        a720Var.s2.u(a720Var, iiyVarArr2[2], ms2Var);
        sj3.E0(a720Var, eVar, str);
    }
}
