package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class f8y extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final jru o;
    public final m0u p;
    public final uyn q;
    public final i1w0 r;
    public final mne s;
    public final duj t;
    public final abu u;
    public final wsf0 v;
    public final kyg0 w;
    public bby x;

    public f8y(jru jruVar, m0u m0uVar, m1e m1eVar, uyn uynVar, i1w0 i1w0Var, mne mneVar, duj dujVar, abu abuVar, wsf0 wsf0Var, kyg0 kyg0Var, ocl oclVar, n4u n4uVar) {
        super(null, new y2x(n4uVar, (byte) 15), new yar(oclVar, (byte) 3), cvm0.p(mneVar.c, mneVar.b), null);
        this.o = jruVar;
        this.p = m0uVar;
        this.q = uynVar;
        this.r = i1w0Var;
        this.s = mneVar;
        this.t = dujVar;
        this.u = abuVar;
        this.v = wsf0Var;
        this.w = kyg0Var;
        i3t0.L(this, new fnq(dtb.z(i120.W(m1eVar.b()), 1), new slx(this, null, (byte) 5), (byte) 4), null, null, 3);
        M(3);
    }

    public final void M(int i) {
        bby bbyVar = this.x;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = this.s.b;
        this.x = sac.i0(bvcVarA, "JackpotViewModel.loadJackpot", i, 3L, q3d.j(UnknownHostException.class, el50.class, SocketTimeoutException.class, ff5.class, qct.class, fhi0.class), CollectionsKt.L0(pnm0.c), new u2h(i, this, (yje) null), new y2x(this, (byte) 16), dvjVar, new g1y(1, this, f8y.class, "handleLoadJackpotError", "handleLoadJackpotError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        xzx xzxVar = (xzx) obj;
        xzxVar.getClass();
        super.x(xzxVar);
        boolean zEquals = xzxVar.equals(szx.f33089a);
        mne mneVar = this.s;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (zEquals) {
            I(mneVar.b, new adw(this, (byte) 20), new epp(this, objArr2 == true ? 1 : 0, (byte) 11));
            return;
        }
        if (xzxVar.equals(rzx.f31383a)) {
            E();
            return;
        }
        boolean zEquals2 = xzxVar.equals(tzx.f34825a);
        i1w0 i1w0Var = this.r;
        if (zEquals2) {
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
        } else {
            if (!xzxVar.equals(wzx.f40040a)) {
                if (!xzxVar.equals(vzx.f38319a)) {
                    if (xzxVar.equals(uzx.f36556a)) {
                        I(mneVar.b, new djx((byte) 9), new bu(this, objArr == true ? 1 : 0, (byte) 8));
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                o7y o7yVar = ((u7y) D()).f35208a;
                m7y m7yVar = o7yVar instanceof m7y ? (m7y) o7yVar : null;
                if (m7yVar == null) {
                    return;
                }
                if (((u7y) D()).e) {
                    M(3);
                    return;
                }
                q0y q0yVar = m7yVar.f21342a;
                if (q0yVar == q0y.f27925a || q0yVar == q0y.b) {
                    p7m0 p7m0Var = this.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        this.f.getClass();
                    } while (!p7m0Var.m(value, u7y.a((u7y) value, null, null, 10000L, false, 23)));
                }
                M(0);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            RulesScreenFactoryImpl$getRulesFragmentScreen$1 rulesScreenFactoryImpl$getRulesFragmentScreen$1D = this.q.d();
            if (rulesScreenFactoryImpl$getRulesFragmentScreen$1D instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) rulesScreenFactoryImpl$getRulesFragmentScreen$1D)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(rulesScreenFactoryImpl$getRulesFragmentScreen$1D)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
