package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mvg0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22455a;
    public final /* synthetic */ w2d b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ pl7 d;
    public final /* synthetic */ long e;

    public /* synthetic */ mvg0(w2d w2dVar, Function1 function1, pl7 pl7Var, long j) {
        this.f22455a = (byte) 1;
        this.b = w2dVar;
        this.c = function1;
        this.d = pl7Var;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22455a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        pl7 pl7Var = this.d;
        w2d w2dVar = this.b;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    pl7 pl7Var2 = this.d;
                    Function1 function2 = this.c;
                    ugd ugdVarM = u1c.M(1677666155, new xbd(pl7Var2, function2, (byte) 3), fetVar);
                    w2d w2dVar2 = this.b;
                    agc.y(null, w2dVar2, ugdVarM, u1c.M(1601827594, new mvg0(w2dVar2, function2, pl7Var2, this.e), fetVar), fetVar, 3520);
                    mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zfn zfnVar = zaq0.b;
                    ilm ilmVar = new ilm(((ThemeColors) fetVar2.k(zfnVar)).getSecondary());
                    x2d x2dVar = w2dVar.f38442a;
                    agk0 agk0Var = x2dVar.d;
                    agk0 agk0Var2 = x2dVar.f;
                    boolean zH = fetVar2.h(!(agk0Var.l() == agk0Var2.l()));
                    Object objP = fetVar2.P();
                    if (zH || objP == cl5Var) {
                        float fL = x2dVar.d.l();
                        float fL2 = agk0Var2.l();
                        long j = this.e;
                        fa50 fa50Var = fa50.f9191a;
                        if (fL == fL2) {
                            String title = pl7Var.getTitle();
                            on5 on5VarB = pl7Var.b();
                            objP = new rlm(title, on5VarB instanceof dn5 ? ((dn5) on5VarB).c : "", j, j, fa50Var);
                        } else {
                            objP = new plm(pl7Var.getTitle(), j, fa50Var);
                        }
                        fetVar2.o0(objP);
                    }
                    imm immVar = new imm(ilmVar, (tlm) objP, fmm.f9790a, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), false, null);
                    boolean zG = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new dng0(function1, (byte) 2);
                        fetVar2.o0(objP2);
                    }
                    hlm.c(mm40VarD, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar2, 6, 0, 4084);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zfn zfnVar2 = zaq0.b;
                    ilm ilmVar2 = new ilm(((ThemeColors) fetVar3.k(zfnVar2)).getSecondary());
                    x2d x2dVar2 = w2dVar.f38442a;
                    agk0 agk0Var3 = x2dVar2.d;
                    agk0 agk0Var4 = x2dVar2.f;
                    boolean z = !(agk0Var3.l() == agk0Var4.l());
                    on5 on5VarB2 = pl7Var.b();
                    boolean zH2 = fetVar3.h(z) | fetVar3.g(on5VarB2 instanceof dn5 ? ((dn5) on5VarB2).c : "");
                    Object objP3 = fetVar3.P();
                    if (zH2 || objP3 == cl5Var) {
                        float fL3 = x2dVar2.d.l();
                        float fL4 = agk0Var4.l();
                        long j2 = this.e;
                        fa50 fa50Var2 = fa50.f9191a;
                        if (fL3 == fL4) {
                            String title2 = pl7Var.getTitle();
                            on5 on5VarB3 = pl7Var.b();
                            objP3 = new rlm(title2, on5VarB3 instanceof dn5 ? ((dn5) on5VarB3).c : "", j2, j2, fa50Var2);
                        } else {
                            objP3 = new plm(pl7Var.getTitle(), j2, fa50Var2);
                        }
                        fetVar3.o0(objP3);
                    }
                    imm immVar2 = new imm(ilmVar2, (tlm) objP3, fmm.f9790a, ((ThemeColors) fetVar3.k(zfnVar2)).getBackgroundContent(), false, null);
                    boolean zG2 = fetVar3.g(function1);
                    Object objP4 = fetVar3.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new gno0(function1, (byte) 15);
                        fetVar3.o0(objP4);
                    }
                    hlm.c(mm40VarD2, immVar2, null, (Function0) objP4, null, null, null, null, null, null, null, null, fetVar3, 6, 0, 4084);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mvg0(w2d w2dVar, pl7 pl7Var, Function1 function1, long j, byte b) {
        this.f22455a = b;
        this.b = w2dVar;
        this.d = pl7Var;
        this.c = function1;
        this.e = j;
    }
}
