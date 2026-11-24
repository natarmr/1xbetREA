package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dsm0 implements q6k {
    @Override // a.q6k
    public final char a() {
        return '~';
    }

    @Override // a.q6k
    public final void b(e2q0 e2q0Var, e2q0 e2q0Var2, int i) {
        csm0 csm0Var = new csm0();
        b4e b4eVar = (b4e) e2q0Var.f;
        while (b4eVar != null && b4eVar != e2q0Var2) {
            b4e b4eVar2 = (b4e) b4eVar.f;
            csm0Var.b(b4eVar);
            b4eVar = b4eVar2;
        }
        csm0Var.j();
        b4e b4eVar3 = (b4e) e2q0Var.f;
        csm0Var.f = b4eVar3;
        if (b4eVar3 != null) {
            b4eVar3.e = csm0Var;
        }
        csm0Var.e = e2q0Var;
        e2q0Var.f = csm0Var;
        b4e b4eVar4 = (b4e) e2q0Var.b;
        csm0Var.b = b4eVar4;
        if (((b4e) csm0Var.f) == null) {
            b4eVar4.d = csm0Var;
        }
    }

    @Override // a.q6k
    public final int c(o6k o6kVar, o6k o6kVar2) {
        return (o6kVar.g < 2 || o6kVar2.g < 2) ? 0 : 2;
    }

    @Override // a.q6k
    public final int d() {
        return 2;
    }

    @Override // a.q6k
    public final char e() {
        return '~';
    }
}
