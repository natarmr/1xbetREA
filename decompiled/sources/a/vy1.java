package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vy1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38227a;
    public final /* synthetic */ kz1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ vy1(kz1 kz1Var, Function1 function1, int i) {
        this.f38227a = (byte) 2;
        this.b = kz1Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38227a;
        Function1 function1 = this.c;
        kz1 kz1Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zfn zfnVar = zaq0.b;
                    imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(kz1Var.f19131a, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, ((ThemeColors) fetVar.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new si1(function1, (byte) 21);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new h61(function1, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4053);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ccq0.N(o2e.e0(jm40.b, "TOP_CONTENT"), kz1Var.c, function1, fetVar2, 6);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ccq0.a(kz1Var, function1, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vy1(kz1 kz1Var, Function1 function1, byte b) {
        this.f38227a = b;
        this.b = kz1Var;
        this.c = function1;
    }
}
