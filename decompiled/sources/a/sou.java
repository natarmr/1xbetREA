package a;

/* JADX INFO: loaded from: classes5.dex */
public final class sou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f32561a;

    public sou(pru pruVar) {
        this.f32561a = pruVar;
    }

    public final lc00 a(boolean z, boolean z2) {
        lc00 lc00VarB = kotlin.collections.a.b();
        sff0 sff0VarA = this.f32561a.a();
        toc0 toc0Var = sff0VarA.l;
        zuc0 zuc0Var = sff0VarA.V0;
        zuc0 zuc0Var2 = zuc0.LIST_WITH_GAMES_AND_STORE;
        boolean zContains = q3d.j(zuc0Var2, zuc0.LIST_WITH_GAMES).contains(zuc0Var);
        boolean zContains2 = q3d.j(zuc0Var2, zuc0.CARDS_WITH_GAMES_AND_STORE).contains(zuc0Var);
        if (toc0Var.y && !zContains2) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.c));
        }
        if (toc0Var.g) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.b));
        }
        if (sff0VarA.U) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.k));
        }
        if (toc0Var.j) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.d));
        }
        if (z) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.e));
        }
        if (toc0Var.l) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.f));
        }
        if (toc0Var.b) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.g));
        }
        if (toc0Var.m) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.h));
        }
        if (zContains && z2) {
            lc00VarB.add(new etc0(false, zuc0Var, 0, soc0.i));
        }
        return kotlin.collections.a.a(lc00VarB);
    }
}
