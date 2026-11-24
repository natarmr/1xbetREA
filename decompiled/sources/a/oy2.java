package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class oy2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f26040a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(ye60 ye60Var, mm40 mm40Var, long j, fet fetVar, int i) {
        int i2;
        fetVar.g0(1776202187);
        int i3 = (fetVar.g(ye60Var) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 32 : 16) | 128;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                fetVar.X();
                i2 = i3 & (-897);
            }
            fetVar.s();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new m51(ye60Var, (byte) 29);
                fetVar.o0(objP);
            }
            eeq.x(ye60Var, gqw0.b, u1c.M(-1653527038, new ly2(j, pai0.a(mm40Var, false, (Function1) objP)), fetVar), fetVar, i4 | 432);
        } else {
            fetVar.X();
        }
        long j2 = j;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2(ye60Var, mm40Var, j2, i, (byte) 0);
        }
    }

    public static final void b(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(694251107);
        int i4 = i2 & 1;
        byte b = 4;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            qxw.o(fetVar, rq8.L(o7k0.p(mm40Var, f26040a, 25.0f), new bx(b, ((s9q0) fetVar.k(t9q0.f33580a)).f31859a)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, i, i2, (byte) 2);
        }
    }
}
