package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cls implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4575a = 1;
    public final /* synthetic */ pls b;

    public /* synthetic */ cls(pls plsVar) {
        this.b = plsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4575a;
        pls plsVar = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                agc.x(plsVar, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, 208.0f);
                    long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarE0 = o2e.e0(s5x0.L(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 0.0f, 8.0f, 1), "GAME_LOG");
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
                    agc.x(plsVar, fetVar, 0);
                    mm40 mm40VarV = cjx.V(jm40Var, new hls(), null);
                    lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
                    boolean zG = fetVar.g(plsVar);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new g7p((Object) plsVar, (byte) 23);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarV, null, lh80VarT, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cls(pls plsVar, int i) {
        this.b = plsVar;
    }
}
