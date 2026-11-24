package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o5i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24688a = 0;
    public final /* synthetic */ t9n b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ o5i(t9n t9nVar, Function1 function1) {
        this.b = t9nVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24688a;
        Function1 function1 = this.c;
        t9n t9nVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0x o0xVar = t9nVar.f33573a;
                    o0x o0xVar2 = t9nVar.b;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new olh(function1, (byte) 6);
                        fetVar.o0(objP);
                    }
                    ibm0.e(o0xVar, o0xVar2, (Function1) objP, phu0.c, u1c.M(1982640767, new tx(t9nVar, (byte) 15), fetVar), fetVar, 27648);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40.b, 44.0f);
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
                    zfn zfnVar = zaq0.b;
                    dww.c(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar), null, jr8.f16991a.b(s5x0.J(i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n), 10.0f), gqw0.e), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, 56, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jar0.L(t9nVar, function1, (fet) obj, x8x.L(385));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o5i(t9n t9nVar, Function1 function1, int i) {
        this.b = t9nVar;
        this.c = function1;
    }
}
