package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q9k0 implements pld, Iterable, khy {
    public int b;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public HashMap j;
    public ey40 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f28352a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList i = new ArrayList();

    public static final void f(t9k0 t9k0Var, int i) {
        while (t9k0Var.v >= 0 && t9k0Var.u <= i) {
            t9k0Var.N();
            t9k0Var.i();
        }
    }

    public final int b(bet betVar) {
        if (this.g) {
            ykd.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!betVar.a()) {
            dsb0.a("Anchor refers to a group that was removed");
        }
        return betVar.f2467a;
    }

    public final void c() {
        this.j = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hz40 e(bv3 bv3Var, vy40 vy40Var) {
        int i;
        Object[] objArr = vy40Var.f38232a;
        int i2 = vy40Var.b;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < i2; i7++) {
            if (!j(obc.J(((mu40) objArr[i7]).e))) {
                vy40 vy40Var2 = new vy40();
                Object[] objArr4 = vy40Var.f38232a;
                int i8 = vy40Var.b;
                for (int i9 = i3; i9 < i8; i9++) {
                    Object obj = objArr4[i9];
                    if (j(obc.J(((mu40) obj).e))) {
                        vy40Var2.a(obj);
                    }
                }
                vy40Var = vy40Var2;
                break;
            }
        }
        rai0 rai0Var = new rai0(this, (byte) 19);
        int i10 = 1;
        int i11 = 1;
        boolean z2 = true;
        if (vy40Var.b > 1) {
            Comparable comparable = (Comparable) rai0Var.invoke(vy40Var.g(i5));
            int i12 = vy40Var.b;
            int i13 = i11;
            while (i13 < i12) {
                Comparable comparable2 = (Comparable) rai0Var.invoke(vy40Var.g(i13));
                if (comparable.compareTo(comparable2) > 0) {
                    vy40 vy40Var3 = new vy40(vy40Var.b);
                    Object[] objArr5 = vy40Var.f38232a;
                    int i14 = vy40Var.b;
                    for (int i15 = i4; i15 < i14; i15++) {
                        vy40Var3.a(objArr5[i15]);
                    }
                    ty40 ty40Var = vy40Var3.c;
                    if (ty40Var == null) {
                        ty40Var = new ty40(vy40Var3, objArr3 == true ? 1 : 0);
                        vy40Var3.c = ty40Var;
                    }
                    if (((vy40) ty40Var.b).b > i10) {
                        v3d.t(new mto(rai0Var, objArr2 == true ? 1 : 0), ty40Var);
                    }
                    vy40Var = vy40Var3;
                    break;
                }
                i13++;
                comparable = comparable2;
            }
        }
        if (vy40Var.i()) {
            hz40 hz40Var = u1h0.b;
            hz40Var.getClass();
            return hz40Var;
        }
        long[] jArr = u1h0.f34903a;
        hz40 hz40Var2 = new hz40();
        t9k0 t9k0VarH = h();
        try {
            Object[] objArr6 = vy40Var.f38232a;
            int i16 = vy40Var.b;
            for (int i17 = i6; i17 < i16; i17++) {
                mu40 mu40Var = (mu40) objArr6[i17];
                int iC = t9k0VarH.c(obc.J(mu40Var.e));
                int iF = t9k0VarH.F(t9k0VarH.b, iC);
                f(t9k0VarH, iF);
                f(t9k0VarH, iF);
                while (true) {
                    i = t9k0VarH.t;
                    if (i == iF || i == t9k0VarH.u) {
                        break;
                        break;
                    }
                    if (iF < t9k0VarH.t(i) + i) {
                        t9k0VarH.Q();
                    } else {
                        t9k0VarH.M();
                    }
                }
                if (i != iF) {
                    ykd.a("Unexpected slot table structure");
                }
                t9k0VarH.Q();
                t9k0VarH.a(iC - t9k0VarH.t);
                hz40Var2.n(mu40Var, ykd.c(mu40Var.c, mu40Var, t9k0VarH, bv3Var));
            }
            f(t9k0VarH, Integer.MAX_VALUE);
            return hz40Var2;
        } finally {
            t9k0VarH.e(z);
        }
    }

    public final p9k0 g() {
        if (this.g) {
            jf4.n("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new p9k0(this);
    }

    public final t9k0 h() {
        if (this.g) {
            ykd.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            ykd.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.h++;
        return new t9k0(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ygv(this, 0, this.b);
    }

    public final boolean j(bet betVar) {
        int iC;
        return betVar.a() && (iC = s9k0.c(this.i, betVar.f2467a, this.b)) >= 0 && Intrinsics.d(this.i.get(iC), betVar);
    }

    public final het k(int i) {
        int i2;
        ArrayList arrayList;
        int iC;
        HashMap map = this.j;
        if (map != null) {
            if (this.g) {
                ykd.a("use active SlotWriter to crate an anchor for location instead");
            }
            bet betVar = (i < 0 || i >= (i2 = this.b) || (iC = s9k0.c((arrayList = this.i), i, i2)) < 0) ? null : (bet) arrayList.get(iC);
            if (betVar != null) {
                return (het) map.get(betVar);
            }
        }
        return null;
    }
}
