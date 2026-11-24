package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10435a;
    public final /* synthetic */ String b;

    public /* synthetic */ g0(byte b, int i, String str) {
        this.f10435a = b;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10435a;
        Object objA = null;
        jr8 jr8Var = jr8.f16991a;
        jm40 jm40Var = jm40.b;
        String str = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ay3.z(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                kc5.p0(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                fx1.b(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                j120.E(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                oyg0 oyg0Var = (oyg0) obj;
                g72 g72Var = (g72) obj2;
                oyg0Var.getClass();
                g72Var.getClass();
                String str2 = this.b;
                if (Intrinsics.d(StringsKt.u0(str2).toString(), StringsKt.u0(g72Var.f10792a).toString())) {
                    q7x.F(oyg0Var, str2, "KEY_SEARCH_INPUT");
                    return g72.a(g72Var, str2, null, false, null, false, false, false, false, false, null, null, null, 524286);
                }
                q7x.F(oyg0Var, str2, "KEY_SEARCH_INPUT");
                return g72.a(g72Var, str2, null, false, null, false, false, true, false, false, null, null, null, 520190);
            case 5:
                ((Integer) obj2).getClass();
                j47.r0(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                zn4 zn4Var = (zn4) obj2;
                ((oyg0) obj).getClass();
                zn4Var.getClass();
                for (Object obj3 : zn4Var.h) {
                    if (Intrinsics.d(((bo4) obj3).f2913a, str)) {
                        objA = obj3;
                        return zn4.a(zn4Var, false, false, false, false, (bo4) objA, null, 191);
                    }
                }
                return zn4.a(zn4Var, false, false, false, false, (bo4) objA, null, 191);
            case 7:
                ((Integer) obj2).getClass();
                cjx.y(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                cjx.w(str, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                kc5.f0(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                kc5.d0(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                c820 c820Var = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var.getClass();
                jfc0 jfc0Var = c820Var.e;
                if (jfc0Var != null) {
                    boolean z = str.length() > 0;
                    azc0 azc0VarA = azc0.a(jfc0Var.f16419a, null, false, 47);
                    rlc0 rlc0Var = jfc0Var.c;
                    objA = jfc0.a(jfc0Var, azc0VarA, new rlc0(rlc0Var.f30690a, rlc0Var.b, rlc0Var.c, rlc0Var.d, rlc0Var.e, rlc0Var.f, rlc0Var.g, false), false, z, 10);
                }
                return c820.a(c820Var, null, null, null, null, objA, null, false, false, false, false, null, 8175);
            case 12:
                ((Integer) obj2).getClass();
                sw6.d(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "TITLE_TEXT");
                    qrq qrqVar = j1t0.c;
                    long j = qmk.s;
                    aad.e(this.b, mm40VarK0, ibm0.n(new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), fetVar), null, 2, false, 2, 0, null, new n05(qmk.q, j, qmk.n), fetVar, 1597488, 424);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                unh0.W(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j6n.h(this.b, woo0.f39508a, null, 0, 0, fetVar2, 48, 28);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ohq0.s(str, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                y0x0.A(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                xkb.F(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                gkb.J(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                dub.X(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                wzb.B(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                rcb.J(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                vdb.j(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j6n.h(this.b, hro0.f13541a, jr8Var.b(jm40Var, gqw0.e), 0, 0, fetVar3, 48, 24);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j6n.h(this.b, hro0.f13541a, jr8Var.b(jm40Var, gqw0.e), 0, 0, fetVar4, 48, 24);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    j6n.h(this.b, nro0.f24013a, null, 0, 0, fetVar5, 48, 28);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j6n.h(this.b, nro0.f24013a, jr8Var.b(jm40Var, gqw0.e), 0, 0, fetVar6, 48, 24);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                jjj.c(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                xf0.E(str, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ g0(String str, byte b) {
        this.f10435a = b;
        this.b = str;
    }
}
