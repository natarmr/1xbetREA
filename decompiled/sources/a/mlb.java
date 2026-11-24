package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mlb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21980a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ g2v c;
    public final /* synthetic */ y78 d;

    public /* synthetic */ mlb(g2v g2vVar, ctf0 ctf0Var, y78 y78Var, byte b) {
        this.f21980a = b;
        this.c = g2vVar;
        this.b = ctf0Var;
        this.d = y78Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21980a;
        y78 y78Var = this.d;
        g2v g2vVar = this.c;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                alb albVar = (alb) obj;
                albVar.getClass();
                return new xa9(albVar, g2vVar, ctf0Var, y78Var);
            case 1:
                dfg dfgVar = (dfg) obj;
                dfgVar.getClass();
                return new gfg(dfgVar, ctf0Var, g2vVar, y78Var);
            case 2:
                ksk kskVar = (ksk) obj;
                kskVar.getClass();
                int iOrdinal = kskVar.b.c.q.ordinal();
                if (iOrdinal == 0) {
                    return new bqk(kskVar, ctf0Var, g2vVar, y78Var);
                }
                if (iOrdinal == 1) {
                    return new xqk(kskVar, ctf0Var, g2vVar, y78Var);
                }
                if (iOrdinal == 2) {
                    return new mrk(kskVar, ctf0Var, g2vVar, y78Var);
                }
                if (iOrdinal == 3) {
                    return new csk(kskVar, ctf0Var, g2vVar, y78Var);
                }
                t9f.b();
                return null;
            case 3:
                y3o y3oVar = (y3o) obj;
                y3oVar.getClass();
                return new b4o(y3oVar, g2vVar, ctf0Var, y78Var);
            case 4:
                z8o z8oVar = (z8o) obj;
                z8oVar.getClass();
                uen uenVar = wen.b;
                return new i9o(z8oVar, this.b, this.c, this.d, wen.l(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), bfn.SECONDS));
            case 5:
                x4p x4pVar = (x4p) obj;
                x4pVar.getClass();
                return new t2f(ctf0Var, x4pVar, y78Var, g2vVar);
            case 6:
                kxp kxpVar = (kxp) obj;
                kxpVar.getClass();
                return new syp(kxpVar, g2vVar, ctf0Var, y78Var);
            case 7:
                cis cisVar = (cis) obj;
                cisVar.getClass();
                return new ov0(cisVar, ctf0Var, y78Var, g2vVar);
            case 8:
                yjw yjwVar = (yjw) obj;
                yjwVar.getClass();
                return new mkw(yjwVar, g2vVar, ctf0Var, y78Var);
            case 9:
                nj00 nj00Var = (nj00) obj;
                nj00Var.getClass();
                return new syp(nj00Var, ctf0Var, y78Var, g2vVar);
            case 10:
                hdn0 hdn0Var = (hdn0) obj;
                hdn0Var.getClass();
                return new b430(hdn0Var, ctf0Var, y78Var, g2vVar);
            case 11:
                tbn0 tbn0Var = (tbn0) obj;
                tbn0Var.getClass();
                return new ee2(tbn0Var, ctf0Var, y78Var, g2vVar);
            case 12:
                szo0 szo0Var = (szo0) obj;
                szo0Var.getClass();
                return new b430(szo0Var, ctf0Var, y78Var, g2vVar);
            case 13:
                cdt0 cdt0Var = (cdt0) obj;
                cdt0Var.getClass();
                return new ej1(cdt0Var, ctf0Var, g2vVar, y78Var);
            default:
                upu0 upu0Var = (upu0) obj;
                upu0Var.getClass();
                return new gfg(upu0Var, ctf0Var, g2vVar, y78Var);
        }
    }

    public /* synthetic */ mlb(ctf0 ctf0Var, y78 y78Var, g2v g2vVar, byte b) {
        this.f21980a = b;
        this.b = ctf0Var;
        this.d = y78Var;
        this.c = g2vVar;
    }

    public /* synthetic */ mlb(ctf0 ctf0Var, g2v g2vVar, y78 y78Var, byte b) {
        this.f21980a = b;
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = y78Var;
    }
}
