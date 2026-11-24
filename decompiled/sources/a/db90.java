package a;

import android.net.Uri;
import java.io.Serializable;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class db90 extends i3t0 {
    public static final /* synthetic */ int M = 0;
    public final duj A;
    public final z7z B;
    public final l7k C;
    public final mne D;
    public final ctf0 E;
    public final nou F;
    public final z7z G;
    public final rou H;
    public final z7z I;
    public final z7z J;
    public final pru K;
    public bby L;
    public final k790 o;
    public final i1w0 p;
    public final hse0 q;
    public final sp r;
    public final w5z s;
    public final e1u t;
    public final ahu u;
    public final z7z v;
    public final suk w;
    public final x1u x;
    public final vd1 y;
    public final z7z z;

    /* JADX WARN: Illegal instructions before constructor call */
    public db90(vzg0 vzg0Var, k790 k790Var, i1w0 i1w0Var, hse0 hse0Var, sp spVar, w5z w5zVar, e1u e1uVar, ahu ahuVar, z7z z7zVar, suk sukVar, x1u x1uVar, vd1 vd1Var, z7z z7zVar2, duj dujVar, z7z z7zVar3, l7k l7kVar, mne mneVar, ctf0 ctf0Var, nou nouVar, z7z z7zVar4, rou rouVar, z7z z7zVar5, z7z z7zVar6, pru pruVar, ocl oclVar) {
        Object value;
        byte b;
        yje yjeVar;
        hse0Var.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        z7zVar3.getClass();
        ctf0Var.getClass();
        z7zVar4.getClass();
        z7zVar5.getClass();
        z7zVar6.getClass();
        rwj rwjVar = mneVar.f22085a;
        dvj dvjVar = mneVar.b;
        super(vzg0Var, new ev80((byte) 19), cvm0.p(rwjVar, rwjVar), new yar(oclVar, (byte) 6));
        this.o = k790Var;
        this.p = i1w0Var;
        this.q = hse0Var;
        this.r = spVar;
        this.s = w5zVar;
        this.t = e1uVar;
        this.u = ahuVar;
        this.v = z7zVar;
        this.w = sukVar;
        this.x = x1uVar;
        this.y = vd1Var;
        this.z = z7zVar2;
        this.A = dujVar;
        this.B = z7zVar3;
        this.C = l7kVar;
        this.D = mneVar;
        this.E = ctf0Var;
        this.F = nouVar;
        this.G = z7zVar4;
        this.H = rouVar;
        this.I = z7zVar5;
        this.J = z7zVar6;
        this.K = pruVar;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            b = 1;
        } while (!p7m0Var.m(value, new ia90(true, k790Var)));
        int length = k790Var.c.length();
        long j = k790Var.b;
        yje yjeVar2 = null;
        if (length > 0) {
            yjeVar = null;
            sac.V(jiu0.a(this), new ua90(this, (byte) 3), null, mneVar.b, new n1((Object) this, j, yjeVar2, (byte) 20), 10);
        } else {
            yjeVar = null;
            if (j == 0) {
                sac.V(jiu0.a(this), new ua90(this, (byte) 5), null, dvjVar, new wa90(this, yjeVar, b), 10);
            } else {
                sac.V(jiu0.a(this), new ua90(this, (byte) 0), null, dvjVar, new wn10(this, j, yjeVar, (byte) 7), 10);
            }
        }
        O();
        byte b2 = 4;
        sac.V(jiu0.a(this), new ua90(this, b2), null, mneVar.f22085a, new wa90(this, yjeVar, b2), 10);
    }

    public final void M() {
        sac.V(jiu0.a(this), xa90.f40543a, null, this.D.b, new wa90(this, null, (byte) 2), 10);
        i1w0 i1w0Var = this.p;
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

    public final void N() {
        k790 k790VarB;
        Object objD = D();
        fa90 fa90Var = objD instanceof fa90 ? (fa90) objD : null;
        if ((fa90Var == null || (k790VarB = fa90Var.b) == null) && (k790VarB = ((ka90) D()).b()) == null) {
            k790VarB = this.o;
        }
        k790 k790Var = k790VarB;
        sac.V(jiu0.a(this), new ua90(this, (byte) 1), null, this.D.b, new ze1(this, k790Var.c, k790Var, fa90Var != null ? fa90Var.e : k790Var.b, (yje) null), 10);
    }

    public final void O() {
        bby bbyVar = this.L;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        H(new obg((byte) 25, false));
        this.L = sac.V(jiu0.a(this), ya90.f42283a, null, this.D.f22085a, new wa90(this, yjeVar, (byte) 3), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object objC;
        Object value2;
        Object value3;
        Object value4;
        q490 q490Var = (q490) obj;
        q490Var.getClass();
        byte b = 0;
        if (!q490Var.equals(j490.f15873a)) {
            boolean zEquals = q490Var.equals(k490.f17657a);
            mne mneVar = this.D;
            yje yjeVar = null;
            if (zEquals) {
                sac.V(jiu0.a(this), va90.f37075a, null, mneVar.b, new wa90(this, yjeVar, b), 10);
                return;
            }
            if (q490Var instanceof l490) {
                mbu0 mbu0Var = ((l490) q490Var).f19392a;
                if (mbu0.l.contains(mbu0Var)) {
                    N();
                    sac.V(jiu0.a(this), new ua90(this, (byte) 2), null, mneVar.b, new w090((Object) this, (Serializable) mbu0Var, yjeVar, (byte) 11), 10);
                    return;
                }
                return;
            }
            if (q490Var instanceof m490) {
                G(new v990(((m490) q490Var).f21157a));
                return;
            }
            boolean zEquals2 = q490Var.equals(n490.f22889a);
            ctf0 ctf0Var = this.E;
            if (zEquals2) {
                ((grj) this.G.get()).a(ctf0Var.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)).concat("://open/editprofile"));
                return;
            }
            boolean zEquals3 = q490Var.equals(o490.f24623a);
            vd1 vd1Var = this.y;
            if (zEquals3) {
                vd1Var.f37210a.c("dep_refresh_method");
                ((wlt0) this.z.get()).f39375a.a(xun.f41520a, 3135L);
                N();
                O();
                return;
            }
            if (q490Var.equals(p490.f26342a)) {
                N();
                O();
                return;
            }
            if (q490Var.equals(a490.f213a)) {
                E();
                return;
            }
            boolean zEquals4 = q490Var.equals(d490.f5444a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (zEquals4) {
                ka90 ka90Var = (ka90) D();
                if (ka90Var == null) {
                    return;
                }
                if ((ka90Var instanceof fa90) || (ka90Var instanceof ia90)) {
                    boolean zA = ka90Var.a();
                    k790 k790VarB = ka90Var.b();
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value4, new ga90(zA, k790VarB)));
                    return;
                }
                return;
            }
            if (q490Var.equals(e490.f7171a)) {
                ka90 ka90Var2 = (ka90) D();
                if (ka90Var2 == null) {
                    return;
                }
                if ((ka90Var2 instanceof fa90) || (ka90Var2 instanceof ia90)) {
                    boolean zA2 = ka90Var2.a();
                    k790 k790VarB2 = ka90Var2.b();
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, new ha90(zA2, k790VarB2)));
                    return;
                }
                return;
            }
            if (q490Var.equals(g490.f10654a)) {
                ka90 ka90Var3 = (ka90) D();
                if (ka90Var3 == null) {
                    return;
                }
                if ((ka90Var3 instanceof fa90) || (ka90Var3 instanceof ia90)) {
                    boolean zA3 = ka90Var3.a();
                    k790 k790VarB3 = ka90Var3.b();
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, new ja90(zA3, k790VarB3)));
                    return;
                }
                return;
            }
            if (q490Var.equals(h490.f12424a)) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    objC = (ka90) value;
                    oyg0Var.getClass();
                    if (objC instanceof fa90) {
                        objC = fa90.c((fa90) objC, false, false, 127);
                    }
                } while (!p7m0Var4.m(value, objC));
                return;
            }
            if (!(q490Var instanceof i490)) {
                if (!(q490Var instanceof b490)) {
                    if (q490Var instanceof c490) {
                        c490 c490Var = (c490) q490Var;
                        G(new u990(c490Var.f3715a, c490Var.b));
                        return;
                    } else if (!(q490Var instanceof f490)) {
                        t9f.b();
                        return;
                    } else {
                        f490 f490Var = (f490) q490Var;
                        G(new t990(f490Var.f8903a, f490Var.b, f490Var.c));
                        return;
                    }
                }
                b490 b490Var = (b490) q490Var;
                String str = b490Var.f1948a;
                String str2 = b490Var.b;
                String str3 = b490Var.c;
                String strSubstring = str.substring(0, Math.min(str.length(), 10));
                String host = Uri.parse(str3).getHost();
                if (host == null) {
                    host = "";
                }
                vd1Var.f37210a.a("dep_download_error", xp20.f(new Pair("durl", strSubstring), new Pair("host", host), new Pair("error", str2)));
                return;
            }
            String str4 = ((i490) q490Var).f14136a;
            boolean zO = StringsKt.O(str4, "/onpay/success", false);
            l7k l7kVar = this.C;
            if (zO) {
                Map mapB = wp20.b(new Pair("id_user", Long.valueOf(this.x.a())));
                vd1Var.getClass();
                mapB.getClass();
                vd1Var.f37210a.a("dep_done", mapB);
                l7kVar.f19563a.a(xun.f41520a, 3044L);
                G(new aa90(ctf0Var.b.a(R.string.notification_payment_succeed, Arrays.copyOf(new Object[0], 0)), da90.f5737a));
                M();
                return;
            }
            if (StringsKt.O(str4, "/onpay/fail", false)) {
                vd1Var.f37210a.c("dep_error");
                l7kVar.f19563a.a(xun.f41520a, 3045L);
                G(new aa90(ctf0Var.b.a(R.string.notification_payment_fail, Arrays.copyOf(new Object[0], 0)), da90.b));
                M();
                return;
            }
            if (StringsKt.O(str4, "/onpay/withdraw/success", false)) {
                G(new aa90(ctf0Var.b.a(R.string.notification_payment_withdraw_succeed, Arrays.copyOf(new Object[0], 0)), da90.f5737a));
                M();
                return;
            }
            if (StringsKt.O(str4, "/onpay/withdraw/fail", false)) {
                G(new aa90(ctf0Var.b.a(R.string.notification_payment_withdraw_fail, Arrays.copyOf(new Object[0], 0)), da90.b));
                return;
            }
            if (StringsKt.O(str4, "/onpay/pending", false)) {
                G(new aa90(ctf0Var.b.a(R.string.notification_payment_pending, Arrays.copyOf(new Object[0], 0)), da90.c));
                M();
                return;
            } else if (StringsKt.O(str4, "/onpay/withdraw/pending", false)) {
                G(new aa90(ctf0Var.b.a(R.string.notification_payment_withdraw_pending, Arrays.copyOf(new Object[0], 0)), da90.c));
                M();
                return;
            } else {
                if (StringsKt.O(str4, "/onpay/cancel", false) || StringsKt.O(str4, "/onpay/withdraw/cancel", false)) {
                    G(new aa90(ctf0Var.b.a(R.string.notification_payment_cancel, Arrays.copyOf(new Object[0], 0)), da90.c));
                    M();
                    return;
                }
                return;
            }
        }
        i1w0 i1w0Var = this.p;
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
