package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o9b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24871a;
    public final /* synthetic */ o0x b;

    public /* synthetic */ o9b(o0x o0xVar, byte b) {
        this.f24871a = b;
        this.b = o0xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24871a;
        jm40 jm40Var = jm40.b;
        o0x o0xVar = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                y0x0.t(o0xVar, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ckb.G(o0xVar, (fet) obj, x8x.L(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                b5x.r(o0xVar, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                bdx.e(o0xVar, (fet) obj, x8x.L(1));
                break;
            case 4:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objA = o0xVar.a();
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar);
                    pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar);
                    m78 m78Var = new m78(((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), 5);
                    pge pgeVar = gqw0.A;
                    zcl zclVar = qmk.f28987a;
                    k7x.b(objA, null, o7k0.s(o7k0.e(jm40Var, 24.0f), 24.0f), pm80VarF, pm80VarF2, null, null, null, null, null, pgeVar, m78Var, fetVar, 36912, 6, 27616);
                } else {
                    fetVar.X();
                }
                break;
            case 5:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objA2 = o0xVar.a();
                    pm80 pm80VarF3 = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2);
                    pm80 pm80VarF4 = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2);
                    m78 m78Var2 = new m78(((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), 5);
                    pge pgeVar2 = gqw0.A;
                    zcl zclVar2 = qmk.f28987a;
                    k7x.b(objA2, null, o7k0.s(o7k0.e(jm40Var, 24.0f), 24.0f), pm80VarF3, pm80VarF4, null, null, null, null, null, pgeVar2, m78Var2, fetVar2, 36912, 6, 27616);
                } else {
                    fetVar2.X();
                }
                break;
            case 6:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objA3 = o0xVar.a();
                    pm80 pm80VarF5 = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar3);
                    pm80 pm80VarF6 = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar3);
                    m78 m78Var3 = new m78(((ThemeColors) fetVar3.k(zaq0.b)).getPrimary(), 5);
                    pge pgeVar3 = gqw0.A;
                    zcl zclVar3 = qmk.f28987a;
                    k7x.b(objA3, null, o7k0.s(o7k0.e(jm40Var, 24.0f), 24.0f), pm80VarF5, pm80VarF6, null, null, null, null, null, pgeVar3, m78Var3, fetVar3, 36912, 6, 27616);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objA4 = o0xVar.a();
                    pm80 pm80VarF7 = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar4);
                    pm80 pm80VarF8 = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar4);
                    m78 m78Var4 = new m78(((ThemeColors) fetVar4.k(zaq0.b)).getPrimary(), 5);
                    pge pgeVar4 = gqw0.A;
                    zcl zclVar4 = qmk.f28987a;
                    k7x.b(objA4, null, o7k0.s(o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 24.0f), 24.0f), pm80VarF7, pm80VarF8, null, null, null, null, null, pgeVar4, m78Var4, fetVar4, 36912, 6, 27616);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o9b(o0x o0xVar, int i, byte b) {
        this.f24871a = b;
        this.b = o0xVar;
    }
}
