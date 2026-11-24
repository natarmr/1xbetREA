package a;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class l94 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final ocl o;
    public final jof0 p;
    public final tsu q;
    public final s31 r;
    public final ctf0 s;
    public final mne t;
    public final e41 u;
    public final i1w0 v;
    public final duj w;
    public bby x;

    public l94(ocl oclVar, jof0 jof0Var, tsu tsuVar, m1e m1eVar, s31 s31Var, g2v g2vVar, ctf0 ctf0Var, mne mneVar, e41 e41Var, i1w0 i1w0Var, duj dujVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        a04 a04Var = new a04((byte) 5);
        o20 o20Var = new o20(ctf0Var, g2vVar, (byte) 1);
        rwj rwjVar = mneVar.f22085a;
        super(null, a04Var, o20Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = oclVar;
        this.p = jof0Var;
        this.q = tsuVar;
        this.r = s31Var;
        this.s = ctf0Var;
        this.t = mneVar;
        this.u = e41Var;
        this.v = i1w0Var;
        this.w = dujVar;
        sac.T(new fnq(m1eVar.b(), new i94(this, (yje) null, (byte) 2), (byte) 4), jiu0.a(this), k94.h);
    }

    public final void M(Throwable th) {
        Object value;
        if (!(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException) && !(th instanceof zhi0)) {
            this.w.b(th, new o33((byte) 13));
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, d94.a((d94) value, null, null, false, (IOException) th, false, 7)));
        G(u84.f35217a);
    }

    public final void N() {
        Object value;
        v3c.N(this.x);
        if (((d94) D()).b()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, d94.a((d94) value, null, null, false, null, true, 15)));
        }
        bvc bvcVarA = jiu0.a(this);
        String simpleName = l94.class.getSimpleName();
        bk2 bk2Var = new bk2(1, this, l94.class, "handleErrorState", "handleErrorState(Ljava/lang/Throwable;)V", 0, (byte) 29);
        this.x = sac.i0(bvcVarA, simpleName, 3, 0L, q3d.j(SocketTimeoutException.class, oqt0.class), CollectionsKt.L0(pnm0.c), new i94(this, (yje) null, (byte) 0), null, this.t.f22085a, bk2Var, null, 580);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        l74 l74Var = (l74) obj;
        l74Var.getClass();
        super.x(l74Var);
        boolean z = l74Var instanceof c74;
        e41 e41Var = this.u;
        s31 s31Var = this.r;
        if (z) {
            s31Var.f31532a.c("acc_sec_history_fin_all");
            e41Var.f7161a.a(xun.f41520a, 3252L);
            G(v84.f36963a);
            return;
        }
        if (l74Var instanceof d74) {
            q84 q84Var = ((d74) l74Var).f5578a;
            s31Var.f31532a.c("acc_sec_history_fin_current");
            e41Var.f7161a.a(xun.f41520a, 3254L);
            G(new w84(q84Var));
            return;
        }
        boolean z2 = l74Var instanceof y64;
        yje yjeVar = null;
        mne mneVar = this.t;
        if (z2) {
            byte b = 1;
            sac.V(jiu0.a(this), new j94(b, this, l94.class, "handleErrorState", "handleErrorState(Ljava/lang/Throwable;)V", 0, (byte) 0), null, mneVar.f22085a, new fj3(this, yjeVar, b), 10);
            return;
        }
        if (l74Var instanceof z64) {
            int i = 1;
            Class<l94> cls = l94.class;
            String str = "handleErrorState";
            String str2 = "handleErrorState(Ljava/lang/Throwable;)V";
            sac.V(jiu0.a(this), new j94(i, this, cls, str, str2, 0, (byte) 1), null, mneVar.f22085a, new oa(this, ((z64) l74Var).f43846a, yjeVar, (byte) 21), 10);
            return;
        }
        if (!(l74Var instanceof w64)) {
            if (l74Var instanceof i74) {
                N();
                return;
            } else if (l74Var.equals(t64.f33397a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.v;
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
