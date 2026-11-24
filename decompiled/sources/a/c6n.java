package a;

import android.content.Context;
import android.content.pm.ResolveInfo;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c6n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3825a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c6n(Context context, ResolveInfo resolveInfo, boolean z, String str, long j) {
        this.d = context;
        this.e = resolveInfo;
        this.b = z;
        this.f = str;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c;
        float fIntBitsToFloat;
        byte b = this.f3825a;
        long j = this.c;
        Object obj2 = this.f;
        boolean z = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                HashMap map = (HashMap) obj4;
                c5n0 c5n0Var = (c5n0) obj3;
                sso0 sso0Var = (sso0) obj2;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                Object objValueOf = map.get(num);
                if (objValueOf == null) {
                    String strE = (z ? by7.e : by7.d).e("+ " + iIntValue);
                    strE.getClass();
                    objValueOf = Integer.valueOf(((pj30) CollectionsKt.v0(c5n0Var.k(twn.m(iIntValue, "COUNTER_MEASURE:"), new ugd(-178745746, true, new d0n((Object) strE, (Object) sso0Var, (byte) 16))))).S(j).f27604a);
                    map.put(num, objValueOf);
                }
                return Integer.valueOf(((Number) objValueOf).intValue());
            case 1:
                final agk0 agk0Var = (agk0) obj4;
                final l7m0 l7m0Var = (l7m0) obj3;
                final l7m0 l7m0Var2 = (l7m0) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                float fIntBitsToFloat2 = z ? 0.0f : Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                float fL = z ? agk0Var.l() : Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) - agk0Var.l();
                float fIntBitsToFloat3 = z ? 0.0f : Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) - agk0Var.l();
                long j2 = y3d.f;
                final e900 e900VarG = yk5.g(q3d.j(new y3d(j2), new y3d(j)), fIntBitsToFloat2, fL, 8);
                if (z) {
                    c = ' ';
                    fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                } else {
                    c = ' ';
                    fIntBitsToFloat = 0.0f;
                }
                float fIntBitsToFloat4 = z != 0 ? Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> c)) - agk0Var.l() : agk0Var.l();
                final float fIntBitsToFloat5 = z ? Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> c)) - agk0Var.l() : 0.0f;
                final e900 e900VarG2 = yk5.g(q3d.j(new y3d(j2), new y3d(j)), fIntBitsToFloat, fIntBitsToFloat4, 8);
                final float f = fIntBitsToFloat3;
                return pi9Var.b(new Function1() { // from class: a.fio
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        g7z g7zVar = (g7z) obj5;
                        g7zVar.getClass();
                        g7zVar.a();
                        a6a a6aVar = g7zVar.f10839a;
                        boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
                        agk0 agk0Var2 = agk0Var;
                        if (zBooleanValue) {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                            float fL2 = agk0Var2.l();
                            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L));
                            fhl.r(g7zVar, e900VarG, jFloatToRawIntBits, (Float.floatToRawIntBits(fL2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat6) & 4294967295L), 0.0f, null, null, 6, 56);
                        }
                        if (((Boolean) l7m0Var2.getValue()).booleanValue()) {
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                            float fL3 = agk0Var2.l();
                            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L));
                            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fL3);
                            fhl.r(g7zVar, e900VarG2, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) & 4294967295L) | (jFloatToRawIntBits3 << 32), 0.0f, null, null, 6, 56);
                        }
                        return Unit.f46060a;
                    }
                });
            default:
                ccq0.i.O((Context) obj4, (ResolveInfo) obj3, Boolean.valueOf(z), (String) obj2, new o9q0(j));
                ((g5q0) obj).close();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ c6n(HashMap map, boolean z, c5n0 c5n0Var, long j, sso0 sso0Var) {
        this.d = map;
        this.b = z;
        this.e = c5n0Var;
        this.c = j;
        this.f = sso0Var;
    }

    public /* synthetic */ c6n(boolean z, long j, agk0 agk0Var, l7m0 l7m0Var, l7m0 l7m0Var2) {
        this.b = z;
        this.c = j;
        this.d = agk0Var;
        this.e = l7m0Var;
        this.f = l7m0Var2;
    }
}
