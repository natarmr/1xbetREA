package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vy3 implements q6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f38229a;

    public vy3(char c) {
        this.f38229a = c;
    }

    @Override // a.q6k
    public final char a() {
        return this.f38229a;
    }

    @Override // a.q6k
    public final void b(e2q0 e2q0Var, e2q0 e2q0Var2, int i) {
        String.valueOf(this.f38229a);
        b4e ktnVar = i == 1 ? new ktn() : new ztm0();
        b4e b4eVar = (b4e) e2q0Var.f;
        while (b4eVar != null && b4eVar != e2q0Var2) {
            b4e b4eVar2 = (b4e) b4eVar.f;
            ktnVar.b(b4eVar);
            b4eVar = b4eVar2;
        }
        ktnVar.j();
        b4e b4eVar3 = (b4e) e2q0Var.f;
        ktnVar.f = b4eVar3;
        if (b4eVar3 != null) {
            b4eVar3.e = ktnVar;
        }
        ktnVar.e = e2q0Var;
        e2q0Var.f = ktnVar;
        b4e b4eVar4 = (b4e) e2q0Var.b;
        ktnVar.b = b4eVar4;
        if (((b4e) ktnVar.f) == null) {
            b4eVar4.d = ktnVar;
        }
    }

    @Override // a.q6k
    public final int c(o6k o6kVar, o6k o6kVar2) {
        if (o6kVar.d || o6kVar2.c) {
            int i = o6kVar2.h;
            if (i % 3 != 0 && (o6kVar.h + i) % 3 == 0) {
                return 0;
            }
        }
        return (o6kVar.g < 2 || o6kVar2.g < 2) ? 1 : 2;
    }

    @Override // a.q6k
    public final int d() {
        return 1;
    }

    @Override // a.q6k
    public final char e() {
        return this.f38229a;
    }
}
