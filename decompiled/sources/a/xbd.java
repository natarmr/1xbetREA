package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xbd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40596a;
    public final /* synthetic */ pl7 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ xbd(pl7 pl7Var, Function1 function1, byte b) {
        this.f40596a = b;
        this.b = pl7Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40596a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.c;
        pl7 pl7Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(i120.Q(o7k0.e(jm40Var, 52.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(0.0f, 0.0f, 20.0f, 20.0f, 3)), 12.0f, 8.0f, 12.0f, 12.0f);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    on5 on5VarB = pl7Var.b();
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new dib(function1, (byte) 20);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new dib(function1, (byte) 21);
                        fetVar.o0(objP2);
                    }
                    rcb.j(null, on5VarB, function0, (Function0) objP2, fetVar, 0, 1);
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
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), new plm(pl7Var.getTitle(), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), false, null);
                    boolean zG3 = fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new dib(function1, (byte) 19);
                        fetVar2.o0(objP3);
                    }
                    hlm.c(mm40VarD, immVar, null, (Function0) objP3, null, null, null, null, null, null, null, null, fetVar2, 6, 0, 4084);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    eeq.k(o7k0.d(jm40Var, 1.0f), pl7Var.b(), function1, fetVar3, 6);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    eeq.k(o7k0.d(jm40Var, 1.0f), pl7Var.b(), function1, fetVar4, 6);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
