package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class xwq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lh80 f41622a = new lh80(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(axq0 axq0Var, mm40 mm40Var, float f, yjj0 yjj0Var, long j, long j2, ugd ugdVar, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        float f2;
        yjj0 yjj0Var2;
        long j3;
        long j4;
        float f3;
        long jD;
        int i3;
        yjj0 yjj0Var3;
        long j5;
        fetVar.g0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(axq0Var) : fetVar.i(axq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= fetVar.i(ugdVar) ? 536870912 : 268435456;
        }
        if (fetVar.U(i5 & 1, (306783379 & i5) != 306783378)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                f3 = vwq0.f38165a;
                yjj0 yjj0VarA = elj0.a(fv90.b, fetVar);
                long jD2 = v4d.d(fv90.c, fetVar);
                jD = v4d.d(fv90.f10205a, fetVar);
                i3 = i5 & (-4186113);
                yjj0Var3 = yjj0VarA;
                j5 = jD2;
                mm40Var2 = jm40.b;
            } else {
                fetVar.X();
                i3 = i5 & (-4186113);
                mm40Var2 = mm40Var;
                f3 = f;
                yjj0Var3 = yjj0Var;
                j5 = j;
                jD = j2;
            }
            fetVar.s();
            fetVar.e0(-1719831991);
            fetVar.r(false);
            int i6 = i3 >> 9;
            gmn0.a(mm40Var2, yjj0Var3, jD, 0L, 0.0f, 0.0f, null, u1c.M(-1573998995, new wwq0(f3, j5, ugdVar), fetVar), fetVar, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            f2 = f3;
            j3 = j5;
            yjj0Var2 = yjj0Var3;
            j4 = jD;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            f2 = f;
            yjj0Var2 = yjj0Var;
            j3 = j;
            j4 = j2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kdo0(axq0Var, mm40Var2, f2, yjj0Var2, j3, j4, ugdVar, i);
        }
    }

    public static final void b(vmb0 vmb0Var, ugd ugdVar, bxq0 bxq0Var, mm40 mm40Var, boolean z, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        boolean z2;
        fetVar.g0(-293753984);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(vmb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(bxq0Var) : fetVar.i(bxq0Var) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            oms0 oms0VarV = phu0.V(bxq0Var.b, "tooltip transition", fetVar, 48, 0);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                new zhl0(pz40Var, (byte) 15);
                objP2 = new axq0();
                fetVar.o0(objP2);
            }
            dwi0.e(vmb0Var, u1c.M(-527401546, new xrk(oms0VarV, ugdVar, (axq0) objP2, (byte) 5), fetVar), bxq0Var, u1c.M(-23901870, new a8(pz40Var, ugdVar2, (byte) 26), fetVar), fetVar, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            mm40Var2 = jm40.b;
            z2 = true;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgh0(vmb0Var, ugdVar, bxq0Var, mm40Var2, z2, ugdVar2, i);
        }
    }
}
