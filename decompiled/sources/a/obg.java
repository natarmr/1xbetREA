package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class obg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24977a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ obg(byte b, int i, boolean z) {
        this.f24977a = b;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long primary;
        byte b = this.f24977a;
        boolean z = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                mbc.e(x8x.L(1), (fet) obj, z);
                return Unit.f46060a;
            case 1:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40.b, 16.0f);
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_pin, 0, fetVar);
                    if (z) {
                        fetVar.e0(814412097);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground();
                    } else {
                        fetVar.e0(814413399);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                    }
                    fetVar.r(false);
                    dww.c(pm80VarF, null, mm40VarN, primary, fetVar, 56, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                u1c.m(x8x.L(1), (fet) obj, z);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ulb.k(x8x.L(1), (fet) obj, z);
                return Unit.f46060a;
            case 4:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, this.b, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -8388609, 524287);
            case 5:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, this.b, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -16777217, 524287);
            case 6:
                qnr qnrVar = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar.getClass();
                return qnr.a(qnrVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, this.b, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -16385, 524287);
            case 7:
                z2s z2sVar = (z2s) obj2;
                ((oyg0) obj).getClass();
                z2sVar.getClass();
                return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, this.b, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -16385, 65535);
            case 8:
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, this.b, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -33554433, 1048575);
            case 9:
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, this.b, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -67108865, 1048575);
            case 10:
                r7s r7sVar = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar.getClass();
                return r7s.a(r7sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, this.b, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -32769, 1048575);
            case 11:
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, this.b, -1, 524287);
            case 12:
                njs njsVar = (njs) obj2;
                ((oyg0) obj).getClass();
                njsVar.getClass();
                return njs.a(njsVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, null, this.b, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -65537, 65535);
            case 13:
                ((Integer) obj2).getClass();
                qzb.a(x8x.L(1), (fet) obj, z);
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                u7x.b(x8x.L(1), (fet) obj, z);
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                y9a.F(x8x.L(7), (fet) obj, z);
                return Unit.f46060a;
            case 16:
                v020 v020Var = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var.getClass();
                return v020.a(v020Var, false, false, 0L, false, 0, null, null, null, null, null, null, null, na00.a(v020Var.o, null, 0, 0L, 0L, false, this.b, 0L, 447), null, null, null, null, null, null, null, 8372223);
            case 17:
                v020 v020Var2 = (v020) obj2;
                ((oyg0) obj).getClass();
                v020Var2.getClass();
                return v020.a(v020Var2, false, false, 0L, false, 0, null, null, null, null, v020Var2.l, null, null, null, null, null, ehm0.a(v020Var2.r, z, 0, null, 12), ehm0.a(v020Var2.s, false, 0, null, 13), ehm0.a(v020Var2.t, false, 0, null, 13), null, null, 7469055);
            case 18:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                rvj0 rvj0Var = b820Var.d;
                dx6 dx6Var = rvj0Var.f31171a;
                return b820.a(b820Var, null, null, null, rvj0.a(rvj0Var, dx6.a(dx6Var, null, vw6.a(dx6Var.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, this.b, false, false, 61439), 1), null, null, null, null, 30), null, null, null, false, false, false, false, false, 8183);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                pvj0 pvj0Var = a820Var.e;
                bx6 bx6Var = pvj0Var.f27665a;
                tw6 tw6Var = bx6Var.b;
                boolean z2 = this.b;
                return a820.a(a820Var, null, null, null, pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(tw6Var, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, z2, false, false, false, false, 64511), false, 5), null, null, null, null, z2, 30), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case 20:
                a820 a820Var2 = (a820) obj2;
                pvj0 pvj0Var2 = a820Var2.e;
                bx6 bx6Var2 = pvj0Var2.f27665a;
                return a820.a(a820Var2, null, null, null, pvj0.a(pvj0Var2, bx6.a(bx6Var2, null, tw6.a(bx6Var2.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, this.b, false, false, 61439), false, 5), null, null, null, null, false, 62), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case 21:
                a820 a820Var3 = (a820) obj2;
                dzc0 dzc0Var = a820Var3.f;
                return a820.a(a820Var3, null, null, null, null, dzc0.a(dzc0Var, syc0.a(dzc0Var.f6938a, null, false, z, 31), null, false, false, false, 62), null, null, false, null, 0.0f, false, null, 0, false, false, false, 262111);
            case 22:
                sg20 sg20Var = (sg20) obj2;
                qvj0 qvj0Var = sg20Var.e;
                cx6 cx6Var = qvj0Var.f29389a;
                return sg20.a(sg20Var, null, null, null, qvj0.a(qvj0Var, cx6.a(cx6Var, null, uw6.a(cx6Var.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, this.b, false, false, false, false, 16127), 1), null, null, null, 30), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 23:
                ((Integer) obj2).getClass();
                azw.g(x8x.L(1), (fet) obj, z);
                return Unit.f46060a;
            case 24:
                w370 w370Var = (w370) obj2;
                ((oyg0) obj).getClass();
                w370Var.getClass();
                rc50 rc50Var = w370Var.d;
                boolean z3 = !z;
                return w370.a(w370Var, false, false, null, rc50.a(rc50Var, false, z3, z3, !z ? "" : rc50Var.e, 35), null, null, null, false, false, false, false, 16375);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ka90 ka90Var = (ka90) obj2;
                ((oyg0) obj).getClass();
                ka90Var.getClass();
                if (ka90Var instanceof ia90) {
                    return new ia90(z, ((ia90) ka90Var).b);
                }
                if (ka90Var instanceof fa90) {
                    return fa90.c((fa90) ka90Var, z, false, 254);
                }
                if (ka90Var instanceof ga90) {
                    return new ga90(z, ((ga90) ka90Var).b);
                }
                if (ka90Var instanceof ja90) {
                    return new ja90(z, ((ja90) ka90Var).b);
                }
                if (ka90Var instanceof ha90) {
                    return new ha90(z, ((ha90) ka90Var).b);
                }
                t9f.b();
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                twi0 twi0Var = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var.getClass();
                return twi0.a(twi0Var, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, this.b, false, false, false, null, false, false, false, false, 0, false, false, 0, -1048577, 2097151);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                twi0 twi0Var2 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var2.getClass();
                return twi0.a(twi0Var2, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, this.b, false, false, null, false, false, false, false, 0, false, false, 0, -2097153, 2097151);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                twi0 twi0Var3 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var3.getClass();
                return twi0.a(twi0Var3, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, this.b, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -524289, 2097151);
            default:
                twi0 twi0Var4 = (twi0) obj2;
                ((oyg0) obj).getClass();
                twi0Var4.getClass();
                return twi0.a(twi0Var4, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, this.b, null, false, false, false, false, 0, false, false, 0, -8388609, 2097151);
        }
    }

    public /* synthetic */ obg(byte b, boolean z) {
        this.f24977a = b;
        this.b = z;
    }
}
