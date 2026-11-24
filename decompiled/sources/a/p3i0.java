package a;

import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class p3i0 extends i3t0 {
    public final void M() {
        long time;
        mfj mfjVar = ((m3i0) D()).b;
        if (mfjVar instanceof kfj) {
            time = -1;
        } else {
            if (!(mfjVar instanceof lfj)) {
                t9f.b();
                return;
            }
            time = ((lfj) mfjVar).f19959a.getTime();
        }
        G(new k3i0(time));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object next;
        Object value4;
        Object value5;
        y2i0 y2i0Var = (y2i0) obj;
        y2i0Var.getClass();
        if (y2i0Var instanceof q2i0) {
            E();
            return;
        }
        if (!(y2i0Var instanceof x2i0)) {
            t9f.b();
            return;
        }
        x2i0 x2i0Var = (x2i0) y2i0Var;
        boolean z = x2i0Var instanceof w2i0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        long time = -1;
        if (z) {
            byte b = ((w2i0) x2i0Var).f38450a;
            Iterator it = ((m3i0) D()).d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ygq0) next).f42598a != b);
            ygq0 ygq0Var = (ygq0) next;
            if (ygq0Var == null) {
                return;
            }
            if (o3i0.f24587a[ygq0Var.ordinal()] != 1) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value4, m3i0.a((m3i0) value4, b, null, null, 14)));
                G(new i3i0(ygq0Var));
                return;
            }
            mfj mfjVar = ((m3i0) D()).b;
            mfj mfjVar2 = ((m3i0) D()).c;
            if (mfjVar instanceof kfj) {
                G(new k3i0(-1L));
                return;
            }
            if (!(mfjVar instanceof lfj)) {
                t9f.b();
                return;
            }
            if (mfjVar2 instanceof kfj) {
                G(new j3i0(-1L, ((lfj) mfjVar).f19959a));
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value5 = p7m0Var2.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value5, m3i0.a((m3i0) value5, b, null, null, 14)));
            G(new i3i0(ygq0.CUSTOM_DATE));
            return;
        }
        if (x2i0Var instanceof u2i0) {
            M();
            return;
        }
        if (x2i0Var instanceof t2i0) {
            mfj mfjVar3 = ((m3i0) D()).b;
            if (mfjVar3 instanceof kfj) {
                return;
            }
            if (!(mfjVar3 instanceof lfj)) {
                t9f.b();
                return;
            }
            mfj mfjVar4 = ((m3i0) D()).c;
            if (!(mfjVar4 instanceof kfj)) {
                if (!(mfjVar4 instanceof lfj)) {
                    t9f.b();
                    return;
                }
                time = ((lfj) mfjVar4).f19959a.getTime();
            }
            G(new j3i0(time, ((lfj) mfjVar3).f19959a));
            return;
        }
        if (!(x2i0Var instanceof v2i0)) {
            if (!(x2i0Var instanceof s2i0)) {
                if (x2i0Var instanceof r2i0) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            Date date = ((s2i0) x2i0Var).f31502a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, m3i0.a((m3i0) value, 0, null, new lfj(date), 11)));
            G(new f3i0(date));
            return;
        }
        Date date2 = ((v2i0) x2i0Var).f36684a;
        G(new g3i0(date2));
        p7m0 p7m0Var4 = ocjVar.f25029a;
        do {
            value2 = p7m0Var4.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var4.m(value2, m3i0.a((m3i0) value2, 0, new lfj(date2), null, 13)));
        mfj mfjVar5 = ((m3i0) D()).c;
        if (mfjVar5 instanceof kfj) {
            G(new j3i0(-1L, date2));
            return;
        }
        if (!(mfjVar5 instanceof lfj)) {
            t9f.b();
            return;
        }
        Date date3 = ((lfj) mfjVar5).f19959a;
        if (date3.compareTo(date2) > 0) {
            G(new j3i0(date3.getTime(), date2));
            return;
        }
        p7m0 p7m0Var5 = ocjVar.f25029a;
        do {
            value3 = p7m0Var5.getValue();
            value3.getClass();
            oyg0Var.getClass();
            j6m0 j6m0Var = ygq0.b;
        } while (!p7m0Var5.m(value3, m3i0.a((m3i0) value3, 0, null, kfj.f18198a, 10)));
        j6m0 j6m0Var2 = ygq0.b;
        G(new h3i0());
        G(new j3i0(-1L, date2));
    }
}
