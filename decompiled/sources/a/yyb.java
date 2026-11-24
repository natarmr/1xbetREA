package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1u f43458a;
    public final gmt b;
    public final ztt c;
    public final pbt d;

    public yyb(k1u k1uVar, gmt gmtVar, ztt zttVar, pbt pbtVar) {
        k1uVar.getClass();
        gmtVar.getClass();
        zttVar.getClass();
        pbtVar.getClass();
        this.f43458a = k1uVar;
        this.b = gmtVar;
        this.c = zttVar;
        this.d = pbtVar;
    }

    public final an7 a(double d, double d2) {
        ql5 ql5VarA;
        if (this.f43458a.a() < d) {
            return an7.c;
        }
        ztt zttVar = this.c;
        esr esrVar = zttVar.a().f4905a.f3145a;
        esr esrVar2 = esr.FREE_BET;
        if (esrVar == esrVar2 || d <= d2 || !this.d.f26724a.v || (ql5VarA = this.b.a()) == null || !ql5VarA.i.a()) {
            return (zttVar.a().f4905a.f3145a == esrVar2 || d <= d2) ? an7.f1136a : an7.b;
        }
        return an7.d;
    }
}
