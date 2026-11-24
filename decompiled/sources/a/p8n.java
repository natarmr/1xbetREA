package a;

import android.graphics.CornerPathEffect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f26564a = {new ez40(p8n.class, "isActive", "isActive(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)};
    public static final zai0 b = new zai0("IsActive");

    public static final void a(int i, int i2, int i3, long j, long j2, long j3, fet fetVar, mm40 mm40Var, boolean z) {
        boolean z2;
        float f;
        Object n8nVar;
        x03 x03Var;
        float f2;
        float f3;
        boolean z3;
        int i4;
        float f4;
        int i5 = i2;
        fetVar.g0(218982363);
        long j4 = j3;
        int i6 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(i) ? 32 : 16) | (fetVar.e(i5) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.f(j) ? 16384 : 8192) | (fetVar.f(j2) ? 131072 : 65536) | (fetVar.f(j4) ? 1048576 : 524288);
        if (fetVar.U(i6 & 1, (599187 & i6) != 599186)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            float fW0 = w6kVar.w0(2.0f);
            float fW1 = w6kVar.w0(1.0f);
            float fW2 = w6kVar.w0(2.0f);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object obj2 = objP;
            if (objP == obj) {
                Object x03Var2 = new x03(new CornerPathEffect(fW2));
                fetVar.o0(x03Var2);
                obj2 = x03Var2;
            }
            x03 x03Var3 = (x03) obj2;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), z ? gqw0.o : gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            fetVar.e0(232488772);
            if (1 <= i) {
                int i7 = 1;
                while (true) {
                    boolean z4 = i7 <= i5;
                    fetVar.b0(232491428, Integer.valueOf(i7));
                    long j5 = z4 ? j4 : j;
                    if (!z4) {
                        j4 = j2;
                    }
                    if (i7 != 2) {
                        if (i7 == 3) {
                            zcl zclVar2 = qmk.f28987a;
                            f4 = 4.0f;
                        } else if (i7 != 4) {
                            zcl zclVar3 = qmk.f28987a;
                            f = 0.0f;
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            f4 = 6.0f;
                        }
                        f = f4;
                    } else {
                        zcl zclVar5 = qmk.f28987a;
                        f = 2.0f;
                    }
                    boolean zB = ycl.b(f, 0.0f);
                    mm40 mm40VarN = jm40.b;
                    if (!zB) {
                        mm40VarN = z ? s5x0.N(mm40VarN, 0.0f, 0.0f, f, 0.0f, 11) : s5x0.N(mm40VarN, f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    mm40 mm40VarN2 = o7k0.n(mm40VarN, 10.0f);
                    int i8 = i6;
                    boolean zD = ((i6 & 7168) == 2048) | fetVar.d(fW0) | fetVar.f(j5) | fetVar.i(x03Var3) | fetVar.d(fW1) | fetVar.f(j4);
                    Object objP2 = fetVar.P();
                    if (zD || objP2 == obj) {
                        boolean z5 = z4;
                        x03Var = x03Var3;
                        f2 = fW1;
                        f3 = fW0;
                        z3 = z5;
                        i4 = i7;
                        z2 = false;
                        n8nVar = new n8n(z, f3, j5, x03Var, f2, j4, (byte) 0);
                        fetVar.o0(n8nVar);
                    } else {
                        i4 = i7;
                        f2 = fW1;
                        f3 = fW0;
                        n8nVar = objP2;
                        z3 = z4;
                        x03Var = x03Var3;
                        z2 = false;
                    }
                    mm40 mm40VarL = rq8.L(mm40VarN2, (Function1) n8nVar);
                    boolean zH = fetVar.h(z3);
                    Object objP3 = fetVar.P();
                    Object obj3 = objP3;
                    if (zH || objP3 == obj) {
                        Object zVar = new z((byte) 29, z3);
                        fetVar.o0(zVar);
                        obj3 = zVar;
                    }
                    zq8.a(z2 ? 1 : 0, fetVar, o2e.e0(pai0.a(mm40VarL, z2, (Function1) obj3), "CellItem"));
                    fetVar.r(z2);
                    int i9 = i4;
                    if (i9 == i) {
                        break;
                    }
                    i7 = i9 + 1;
                    i5 = i2;
                    j4 = j3;
                    fW0 = f3;
                    x03Var3 = x03Var;
                    fW1 = f2;
                    i6 = i8;
                }
            } else {
                z2 = false;
            }
            fetVar.r(z2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qcd(mm40Var, i, i2, z, j, j2, j3, i3, (byte) 1);
        }
    }

    public static final void b(mm40 mm40Var, x8n x8nVar, boolean z, fet fetVar, int i, int i2) {
        int i3;
        boolean z2;
        x8nVar.getClass();
        fetVar.g0(-1430347195);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(x8nVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = i4 != 0 ? false : z;
            int iD = l1e0.d(x8nVar.b, 1, 4);
            int iD2 = l1e0.d(x8nVar.c, 0, 4);
            zfn zfnVar = bmd.n;
            obc.d(zfnVar.a(k6z.f17794a), u1c.M(-257759867, new sda(iD, iD2, x8nVar, mm40Var, z3 && ((k6z) fetVar.k(zfnVar)) == k6z.b), fetVar), fetVar, 56);
            z2 = z3;
        } else {
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m8n(i, i2, x8nVar, mm40Var, z2);
        }
    }

    public static final void c(abi0 abi0Var, boolean z) {
        iiy iiyVar = f26564a[0];
        Boolean boolValueOf = Boolean.valueOf(z);
        zai0 zai0Var = b;
        zai0Var.getClass();
        abi0Var.b(zai0Var, boolValueOf);
    }
}
