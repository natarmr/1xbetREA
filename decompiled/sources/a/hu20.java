package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hu20 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13661a;
    public final /* synthetic */ uv20 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ hu20(uv20 uv20Var, Function1 function1, byte b) {
        this.f13661a = b;
        this.b = uv20Var;
        this.c = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.f13661a;
        cl5 cl5Var = ukd.f35823a;
        uv20 uv20Var = this.b;
        switch (b) {
            case 0:
                int i6 = 2;
                yhg0 yhg0Var = (yhg0) obj;
                f07 f07Var = (f07) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                yhg0Var.getClass();
                f07Var.getClass();
                if ((iIntValue & 6) == 0) {
                    if (fetVar.g(yhg0Var)) {
                        i6 = 4;
                    }
                    i = iIntValue | i6;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= fetVar.e(f07Var.ordinal()) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    zcl zclVar = qmk.f28987a;
                    z1x.e(yhg0Var, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 20.0f), uv20Var.f36327a, f07Var, ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), this.c, fetVar, ((i << 6) & 7168) | (i & 14));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int i7 = 2;
                yhg0 yhg0Var2 = (yhg0) obj;
                f07 f07Var2 = (f07) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                yhg0Var2.getClass();
                f07Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    if (fetVar2.g(yhg0Var2)) {
                        i7 = 4;
                    }
                    i2 = iIntValue2 | i7;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= fetVar2.e(f07Var2.ordinal()) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    zfn zfnVar = zaq0.b;
                    long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 30.0f);
                    boolean zF = fetVar2.f(background);
                    Object objP = fetVar2.P();
                    if (zF || objP == cl5Var) {
                        objP = new dls((byte) 18, background);
                        fetVar2.o0(objP);
                    }
                    z1x.e(yhg0Var2, s5x0.J(rq8.K(mm40VarN, (Function1) objP), 6.0f), uv20Var.f36327a, f07Var2, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), this.c, fetVar2, ((i2 << 6) & 7168) | (i2 & 14));
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                int i8 = 2;
                yhg0 yhg0Var3 = (yhg0) obj;
                f07 f07Var3 = (f07) obj2;
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                yhg0Var3.getClass();
                f07Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    if (fetVar3.g(yhg0Var3)) {
                        i8 = 4;
                    }
                    i3 = iIntValue3 | i8;
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= fetVar3.e(f07Var3.ordinal()) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    zcl zclVar3 = qmk.f28987a;
                    int i9 = i3;
                    z1x.e(yhg0Var3, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 16.0f), uv20Var.f36327a, f07Var3, ((ThemeColors) fetVar3.k(zaq0.b)).getPrimary(), this.c, fetVar3, (i9 & 14) | ((i9 << 6) & 7168));
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                yhg0 yhg0Var4 = (yhg0) obj;
                f07 f07Var4 = (f07) obj2;
                int i10 = 2;
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                yhg0Var4.getClass();
                f07Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    if (fetVar4.g(yhg0Var4)) {
                        i10 = 4;
                    }
                    i4 = iIntValue4 | i10;
                } else {
                    i4 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i4 |= fetVar4.e(f07Var4.ordinal()) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    zcl zclVar4 = qmk.f28987a;
                    z1x.e(yhg0Var4, s5x0.J(o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 28.0f), 6.0f), uv20Var.f36327a, f07Var4, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), this.c, fetVar4, ((i4 << 6) & 7168) | (i4 & 14));
                } else {
                    fetVar4.X();
                }
                break;
            default:
                yhg0 yhg0Var5 = (yhg0) obj;
                f07 f07Var5 = (f07) obj2;
                fet fetVar5 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                yhg0Var5.getClass();
                f07Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i5 = (fetVar5.g(yhg0Var5) ? 4 : 2) | iIntValue5;
                } else {
                    i5 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i5 |= fetVar5.e(f07Var5.ordinal()) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    zfn zfnVar2 = zaq0.b;
                    long background2 = ((ThemeColors) fetVar5.k(zfnVar2)).getBackground();
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 28.0f);
                    boolean zF2 = fetVar5.f(background2);
                    Object objP2 = fetVar5.P();
                    if (zF2 || objP2 == cl5Var) {
                        objP2 = new dls((byte) 20, background2);
                        fetVar5.o0(objP2);
                    }
                    z1x.e(yhg0Var5, s5x0.J(rq8.K(mm40VarN2, (Function1) objP2), 6.0f), uv20Var.f36327a, f07Var5, ((ThemeColors) fetVar5.k(zfnVar2)).getSecondary(), this.c, fetVar5, (i5 & 14) | ((i5 << 6) & 7168));
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
