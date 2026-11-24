package a;

import android.view.MotionEvent;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x1d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40117a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ x1d(l7m0 l7m0Var, byte b) {
        this.f40117a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40117a;
        byte b2 = 0;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                nn8 nn8Var = (nn8) l7m0Var.getValue();
                uag0Var.I(Float.intBitsToFloat((int) (uag0Var.r & 4294967295L)) * (nn8Var.f23808a - nn8Var.b));
                return Unit.f46060a;
            case 1:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                jge0 jge0VarR = k9x.r(0L, pi9Var.f27033a.d());
                ucs0 ucs0VarD = saj.D();
                long j = y3d.b;
                return pi9Var.b(new dg(this.b, z03.a(), jge0VarR, ucs0VarD, q3d.j(new y3d(j), new y3d(y3d.c(0.5f, j)), new y3d(y3d.f)), (byte) 8));
            case 2:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.b(((nn8) l7m0Var.getValue()).c);
                return Unit.f46060a;
            case 3:
                uag0 uag0Var3 = (uag0) obj;
                uag0Var3.getClass();
                uag0Var3.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 4:
                ((MotionEvent) obj).getClass();
                return Boolean.valueOf(((Number) l7m0Var.getValue()).floatValue() < 1.0f);
            case 5:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                float fW0 = g7zVar.w0(36.0f);
                Float fValueOf = Float.valueOf(0.0f);
                long j2 = y3d.f;
                Pair pair = new Pair(fValueOf, new y3d(j2));
                Object obj2 = ((Pair) l7m0Var.getValue()).f46059a;
                long j3 = y3d.b;
                fhl.r(g7zVar, yk5.h(new Pair[]{pair, new Pair(obj2, new y3d(j3))}, 0.0f, fW0, 8), 0L, 0L, 0.0f, null, null, 6, 62);
                Pair[] pairArr = {new Pair(Float.valueOf(1.0f - ((Number) ((Pair) l7m0Var.getValue()).b).floatValue()), new y3d(j3)), new Pair(Float.valueOf(1.0f), new y3d(j2))};
                a6a a6aVar = g7zVar.f10839a;
                fhl.r(g7zVar, yk5.h(pairArr, Float.intBitsToFloat((int) (a6aVar.d() >> 32)) - fW0, Float.intBitsToFloat((int) (a6aVar.d() >> 32)), 8), 0L, 0L, 0.0f, null, null, 6, 62);
                return Unit.f46060a;
            case 6:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.r(fhlVar, new e900(gqj0.b, null, (((long) Float.floatToRawIntBits(((Number) l7m0Var.getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(((Number) l7m0Var.getValue()).floatValue())) & 4294967295L), (((long) Float.floatToRawIntBits(((Number) l7m0Var.getValue()).floatValue() + 100.0f)) << 32) | (((long) Float.floatToRawIntBits(((Number) l7m0Var.getValue()).floatValue() + 100.0f)) & 4294967295L)), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 7:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.g(abi0Var, ((a4x) l7m0Var.getValue()).size());
                return Unit.f46060a;
            case 8:
                uag0 uag0Var4 = (uag0) obj;
                uag0Var4.getClass();
                uag0Var4.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 9:
                uag0 uag0Var5 = (uag0) obj;
                uag0Var5.getClass();
                uag0Var5.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 10:
                uag0 uag0Var6 = (uag0) obj;
                uag0Var6.getClass();
                uag0Var6.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 11:
                uag0 uag0Var7 = (uag0) obj;
                uag0Var7.getClass();
                uag0Var7.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 12:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((o5j) l7m0Var.getValue()).b;
                hczVar.f(a4xVar.size(), new vtf(new zuh((byte) 10), a4xVar, (byte) 14), new wl0(a4xVar, (byte) 25), new ugd(2039820996, true, new zd1(a4xVar, (byte) 5)));
                return Unit.f46060a;
            case 13:
                fhl fhlVar2 = (fhl) obj;
                long j4 = ((y3d) l7m0Var.getValue()).f41946a;
                if (!h2t0.a(j4, y3d.g)) {
                    fhl.u(fhlVar2, j4, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return Unit.f46060a;
            case 14:
                uag0 uag0Var8 = (uag0) obj;
                uag0Var8.getClass();
                uag0Var8.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 15:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                yai0.h(abi0Var2, ((Boolean) l7m0Var.getValue()).booleanValue() ? "Expanded" : "Collapsed");
                return Unit.f46060a;
            case 16:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                yai0.h(abi0Var3, ((Number) l7m0Var.getValue()).floatValue() == 1.0f ? "Collapsed" : "Expanded");
                return Unit.f46060a;
            case 17:
                uag0 uag0Var9 = (uag0) obj;
                uag0Var9.getClass();
                uag0Var9.w(((Number) l7m0Var.getValue()).floatValue());
                uag0Var9.y(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 18:
                uag0 uag0Var10 = (uag0) obj;
                uag0Var10.getClass();
                uag0Var10.w(((Number) l7m0Var.getValue()).floatValue());
                uag0Var10.y(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uag0 uag0Var11 = (uag0) obj;
                uag0Var11.getClass();
                uag0Var11.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 20:
                uag0 uag0Var12 = (uag0) obj;
                uag0Var12.getClass();
                uag0Var12.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 21:
                ((w6k) obj).getClass();
                return new ikx(((long) si30.b(((Number) l7m0Var.getValue()).floatValue())) << 32);
            case 22:
                uag0 uag0Var13 = (uag0) obj;
                uag0Var13.getClass();
                uag0Var13.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case 23:
                pi9 pi9Var2 = (pi9) obj;
                pi9Var2.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var2.f27033a.d() & 4294967295L)) / 2.0f;
                return pi9Var2.a(new m5n((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), l7m0Var, b2));
            case 24:
                pi9 pi9Var3 = (pi9) obj;
                pi9Var3.getClass();
                return pi9Var3.a(new cel(h7k0.d(pi9Var3.f27033a.d()) / 2.0f, (Object) l7m0Var, (byte) 4));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                uag0 uag0Var14 = (uag0) obj;
                uag0Var14.getClass();
                uag0Var14.b(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uag0 uag0Var15 = (uag0) obj;
                uag0Var15.getClass();
                uag0Var15.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                uag0 uag0Var16 = (uag0) obj;
                uag0Var16.getClass();
                uag0Var16.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                uag0 uag0Var17 = (uag0) obj;
                uag0Var17.getClass();
                uag0Var17.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
            default:
                uag0 uag0Var18 = (uag0) obj;
                uag0Var18.getClass();
                uag0Var18.v(((Number) l7m0Var.getValue()).floatValue());
                return Unit.f46060a;
        }
    }
}
