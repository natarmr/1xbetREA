package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u49 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35033a;
    public final /* synthetic */ int b;

    public /* synthetic */ u49(byte b, int i, boolean z) {
        this.f35033a = b;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35033a;
        int i = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dww.c(a8k0.F(i, 0, fetVar), null, null, y3d.g, fetVar, 3128, 4);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dww.c(a8k0.F(i, 0, fetVar2), null, null, y3d.g, fetVar2, 3128, 4);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                i4w0.k(i, x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                saj.B(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                saj.P(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                saj.C(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                acb.z(i, x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                fbc.i(i, x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                obc.b(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                uzb.l(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case 10:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pm80 pm80VarF = a8k0.F(i, 6, fetVar3);
                    long secondary = ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary();
                    zcl zclVar = qmk.f28987a;
                    dww.c(pm80VarF, null, o7k0.n(jm40.b, 12.0f), secondary, fetVar3, 56, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                ebc.a(i, x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 12:
                v020 v020Var = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var.getClass();
                return v020.a(v020Var, false, false, 0L, false, 0, null, null, null, null, null, null, null, na00.a(v020Var.o, null, this.b, 0L, 0L, false, false, 0L, 509), null, null, null, null, null, null, null, 8372223);
            case 13:
                v020 v020Var2 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var2.getClass();
                return v020.a(v020Var2, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, ehm0.a(v020Var2.r, false, i, null, 11), null, null, null, null, 8257535);
            case 14:
                v020 v020Var3 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var3.getClass();
                return v020.a(v020Var3, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, null, ehm0.a(v020Var3.s, false, i, null, 11), null, null, null, 8126463);
            case 15:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                ko7 ko7Var = jo7.b;
                if (i != 0) {
                    if (i == 1) {
                        ko7Var = io7.b;
                    } else if (i == 2) {
                        ko7Var = ho7.b;
                    }
                }
                return a820.a(a820Var, null, ko7Var, null, null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262139);
            case 16:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                fo7 fo7Var = co7.b;
                if (i != 0) {
                    if (i == 1) {
                        fo7Var = zn7.b;
                    } else if (i == 2) {
                        fo7Var = xn7.b;
                    }
                }
                return b820.a(b820Var, null, fo7Var, null, null, null, null, null, false, false, false, false, false, 8189);
            case 17:
                oyg0 oyg0Var = (oyg0) obj;
                d140 d140Var = (d140) obj2;
                oyg0Var.getClass();
                d140Var.getClass();
                r040 r040Var = (r040) CollectionsKt.W(i, CollectionsKt.L0(d140Var.q.keySet()));
                if (r040Var == null) {
                    r040Var = d140Var.s;
                }
                q7x.F(oyg0Var, r040Var, "SELECTED_TAB");
                return d140.a(d140Var, false, false, false, null, null, null, null, null, null, false, false, null, false, null, null, r040Var, null, null, null, 1072168959);
            case 18:
                ((Integer) obj2).getClass();
                n2x.e(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                oyg0 oyg0Var2 = (oyg0) obj;
                gp40 gp40Var = (gp40) obj2;
                oyg0Var2.getClass();
                gp40Var.getClass();
                int i2 = this.b;
                q7x.F(oyg0Var2, Integer.valueOf(i2), "SELECTED_VALUE_INDEX_KEY");
                q7x.F(oyg0Var2, 0L, "INPUT_VALUE_KEY");
                q7x.F(oyg0Var2, "", "TEXT_FIELD_ERROR");
                return gp40.a(gp40Var, null, false, "", 0, i2, 0L, false, 311);
            case 20:
                xb70 xb70Var = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var.getClass();
                return xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, z870.a(xb70Var.q, this.b, null, false, false, null, false, 62), 65535);
            case 21:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dww.c(iom0.r(jpm0.t(i, 6, fetVar4), fetVar4), null, null, 0L, fetVar4, 8, 12);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                j120.B(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case 23:
                tcj0 tcj0Var = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var.getClass();
                return tcj0.a(tcj0Var, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, this.b, false, null, false, false, 0, -1, 2096895);
            case 24:
                ((Integer) obj2).getClass();
                ucx.J(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dvk0 dvk0Var = (dvk0) obj2;
                ((oyg0) obj).getClass();
                dvk0Var.getClass();
                return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ctk0.a(dvk0Var.y, null, null, i, 3), null, null, null, 1056964607);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ju70.c(i, x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                y860.b(i, x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                aad.B(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            default:
                oyg0 oyg0Var3 = (oyg0) obj;
                dbr0 dbr0Var = (dbr0) obj2;
                oyg0Var3.getClass();
                dbr0Var.getClass();
                wcr0 wcr0Var = dbr0Var.g;
                q7x.F(oyg0Var3, Integer.valueOf(i), "CURRENT_POS_KEY");
                return dbr0.a(dbr0Var, false, null, null, wcr0.a(wcr0Var, i, null, 2), 367);
        }
    }

    public /* synthetic */ u49(int i, byte b) {
        this.f35033a = b;
        this.b = i;
    }

    public /* synthetic */ u49(int i, int i2, byte b) {
        this.f35033a = b;
        this.b = i;
    }
}
