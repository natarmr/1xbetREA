package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f7435a = androidx.compose.runtime.e.e(null);
    public j83 b;
    public final SnapshotStateList c;

    public e9q0(j83 j83Var) {
        t6q0 t6q0Var = new t6q0((byte) 14);
        j83Var.getClass();
        h83 h83Var = new h83(j83Var);
        ArrayList arrayList = h83Var.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) t6q0Var.invoke(((g83) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                i83 i83Var = (i83) list.get(i2);
                arrayList3.add(new g83(i83Var.b, i83Var.c, i83Var.f14321a, i83Var.d));
            }
            w3d.u(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = h83Var.h();
        this.c = new SnapshotStateList();
    }

    public static i83 c(i83 i83Var, a9q0 a9q0Var) {
        bw40 bw40Var = a9q0Var.b;
        int iC = bw40Var.c(bw40Var.f - 1, false);
        if (i83Var.b < iC) {
            return i83.a(i83Var, null, Math.min(i83Var.c, iC), 11);
        }
        return null;
    }

    public final void a(int i, fet fetVar) {
        boolean z;
        fetVar.g0(1154651354);
        byte b = 2;
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            u23 u23Var = (u23) fetVar.k(bmd.s);
            j83 j83Var = this.b;
            List listA = j83Var.a(j83Var.b.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                i83 i83Var = (i83) listA.get(i3);
                int i4 = i83Var.b;
                Object obj = i83Var.f14321a;
                if (i4 != i83Var.c) {
                    fetVar.e0(725478935);
                    Object objP = fetVar.P();
                    Object obj2 = ukd.f35823a;
                    Object objJ = objP;
                    if (objP == obj2) {
                        objJ = dw9.j(fetVar);
                    }
                    gy40 gy40Var = (gy40) objJ;
                    mm40 mm40VarT = i4w0.T(jm40.b, new b8q0(this, i83Var, b));
                    Object objP2 = fetVar.P();
                    Object obj3 = objP2;
                    if (objP2 == obj2) {
                        Object t6q0Var = new t6q0((byte) 15);
                        fetVar.o0(t6q0Var);
                        obj3 = t6q0Var;
                    }
                    mm40 mm40VarI = hp4.I(pai0.a(mm40VarT, z2, (Function1) obj3).e(new p9q0(new lmn0(this, i83Var, (byte) 1))), gy40Var, true);
                    bpa0.f2973a.getClass();
                    mm40 mm40VarC = c3x.C(mm40VarI, i120.j);
                    boolean zI = fetVar.i(this) | fetVar.g(i83Var) | fetVar.i(u23Var);
                    Object objP3 = fetVar.P();
                    Object obj4 = objP3;
                    if (zI || objP3 == obj2) {
                        Object yip0Var = new yip0(this, i83Var, u23Var);
                        fetVar.o0(yip0Var);
                        obj4 = yip0Var;
                    }
                    zq8.a(0, fetVar, y860.Z(mm40VarC, gy40Var, false, null, (Function0) obj4, 508));
                    kb00 kb00Var = (kb00) obj;
                    f9q0 f9q0VarB = kb00Var.b();
                    if (f9q0VarB == null || (f9q0VarB.f9167a == null && f9q0VarB.b == null && f9q0VarB.c == null && f9q0VarB.d == null)) {
                        z = false;
                        fetVar.e0(728331710);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(726303039);
                        Object objP4 = fetVar.P();
                        Object obj5 = objP4;
                        if (objP4 == obj2) {
                            Object vb00Var = new vb00(gy40Var);
                            fetVar.o0(vb00Var);
                            obj5 = vb00Var;
                        }
                        vb00 vb00Var2 = (vb00) obj5;
                        Unit unit = Unit.f46060a;
                        Object objP5 = fetVar.P();
                        boolean z3 = false;
                        Object obj6 = objP5;
                        if (objP5 == obj2) {
                            Object z2n0Var = new z2n0(vb00Var2, z3 ? 1 : 0, (byte) 13);
                            fetVar.o0(z2n0Var);
                            obj6 = z2n0Var;
                        }
                        m0x0.t(fetVar, unit, (Function2) obj6);
                        cgk0 cgk0Var = vb00Var2.b;
                        cgk0 cgk0Var2 = vb00Var2.b;
                        Boolean boolValueOf = Boolean.valueOf((cgk0Var.l() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((cgk0Var2.l() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((cgk0Var2.l() & 4) != 0);
                        f9q0 f9q0VarB2 = kb00Var.b();
                        smk0 smk0Var = f9q0VarB2 != null ? f9q0VarB2.f9167a : null;
                        f9q0 f9q0VarB3 = kb00Var.b();
                        smk0 smk0Var2 = f9q0VarB3 != null ? f9q0VarB3.b : null;
                        f9q0 f9q0VarB4 = kb00Var.b();
                        smk0 smk0Var3 = f9q0VarB4 != null ? f9q0VarB4.c : null;
                        f9q0 f9q0VarB5 = kb00Var.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, smk0Var, smk0Var2, smk0Var3, f9q0VarB5 != null ? f9q0VarB5.d : null};
                        boolean zI2 = fetVar.i(this) | fetVar.g(i83Var);
                        Object objP6 = fetVar.P();
                        Object obj7 = objP6;
                        if (zI2 || objP6 == obj2) {
                            Object b8q0Var = new b8q0(this, i83Var, vb00Var2);
                            fetVar.o0(b8q0Var);
                            obj7 = b8q0Var;
                        }
                        b(objArr, (Function1) obj7, fetVar, (i2 << 6) & 896);
                        z = false;
                        fetVar.r(false);
                    }
                    fetVar.r(z);
                } else {
                    z = z2;
                    fetVar.e0(728345598);
                    fetVar.r(z);
                }
                i3++;
                z2 = z;
                b = b;
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l7p0(this, i, (byte) 20);
        }
    }

    public final void b(Object[] objArr, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-2083052099);
        int i2 = (i & 48) == 0 ? (fetVar.i(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= fetVar.i(this) ? 256 : 128;
        }
        fetVar.b0(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (fetVar.e(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= fetVar.i(obj) ? 4 : 0;
        }
        fetVar.r(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jdg0 jdg0Var = new jdg0(2);
            jdg0Var.a(function1);
            jdg0Var.b(objArr);
            ArrayList arrayList = jdg0Var.b;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zI = fetVar.i(this) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new da6(this, function1, b);
                fetVar.o0(objP);
            }
            m0x0.p(array, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(this, objArr, function1, i, (byte) 7);
        }
    }
}
