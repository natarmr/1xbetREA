package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lwh extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final i1w0 o;
    public final String p;
    public final vzg0 q;
    public final duj r;
    public final a7q s;

    public lwh(i1w0 i1w0Var, String str, vzg0 vzg0Var, ctf0 ctf0Var, ocl oclVar, duj dujVar, a7q a7qVar, mne mneVar, wyu wyuVar, m1e m1eVar) {
        ctf0Var.getClass();
        wyuVar.getClass();
        m1eVar.getClass();
        wg2 wg2Var = new wg2(vzg0Var, (byte) 4);
        sw8 sw8Var = new sw8((Object) oclVar, (Object) wyuVar, (Object) ctf0Var, (byte) 20);
        rwj rwjVar = mneVar.f22085a;
        dvj dvjVar = mneVar.b;
        super(null, wg2Var, sw8Var, cvm0.p(rwjVar, dvjVar), null);
        this.o = i1w0Var;
        this.p = str;
        this.q = vzg0Var;
        this.r = dujVar;
        this.s = a7qVar;
        sac.V(jiu0.a(this), new iwh(this, (byte) 0), null, dvjVar, new g6g((Object) m1eVar, (Object) this, (yje) null, (byte) 5), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object M(zje zjeVar) {
        kwh kwhVar;
        Object value;
        Object value2;
        dwh dwhVar;
        if (zjeVar instanceof kwh) {
            kwhVar = (kwh) zjeVar;
            int i = kwhVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kwhVar.k = i - Integer.MIN_VALUE;
            } else {
                kwhVar = new kwh(this, zjeVar);
            }
        } else {
            kwhVar = new kwh(this, zjeVar);
        }
        Object objD0 = kwhVar.i;
        wne wneVar = wne.f39444a;
        int i2 = kwhVar.k;
        yje yjeVar = null;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (i2 == 0) {
            z1x.P(objD0);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, dwh.a((dwh) value, false, true, false, false, 0L, null, 49)));
            kwhVar.k = 1;
            oif0 oif0Var = (oif0) this.s.f384a;
            objD0 = qjj.d0(((mne) oif0Var.d).b, new oed(oif0Var, this.p, yjeVar, (byte) 2), kwhVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        mwh mwhVar = (mwh) objD0;
        List list = mwhVar.b;
        b9a0 b9a0Var = mwhVar.f22502a;
        if (list.isEmpty()) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            while (true) {
                Object value3 = p7m0Var2.getValue();
                value3.getClass();
                dwh dwhVar2 = (dwh) value3;
                oyg0Var.getClass();
                mwh mwhVar2 = mwhVar;
                if (p7m0Var2.m(value3, dwh.a(dwhVar2, dwhVar2.f6798a || !Intrinsics.d(b9a0Var, b9a0.g), false, false, true, 0L, mwhVar2, 16))) {
                    break;
                }
                mwhVar = mwhVar2;
            }
        } else {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                dwhVar = (dwh) value2;
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, dwh.a(dwhVar, dwhVar.f6798a || !Intrinsics.d(b9a0Var, b9a0.g), false, false, false, 0L, mwhVar, 16)));
        }
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        uvh uvhVar = (uvh) obj;
        uvhVar.getClass();
        super.x(uvhVar);
        if (!uvhVar.equals(rvh.f31167a)) {
            if (!(uvhVar instanceof svh)) {
                if (!uvhVar.equals(tvh.f34598a)) {
                    t9f.b();
                    return;
                } else {
                    i3t0.K(this, null, new iwh(this, (byte) 1), new pn(this, null, (byte) 21), 1);
                    return;
                }
            }
            long j = ((svh) uvhVar).f32865a;
            this.q.e("KEY_CURRENT_TAB", Long.valueOf(j));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, dwh.a((dwh) value, false, false, false, false, j, null, 47)));
            return;
        }
        i1w0 i1w0Var = this.o;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
