package a;

import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLException;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class svd extends w46 {
    public final p7m0 A;
    public c4m0 B;
    public bby C;
    public bby D;
    public c4m0 E;
    public boolean F;
    public String G;
    public boolean H;
    public final vzg0 b;
    public final i1w0 c;
    public final oud d;
    public final duj e;
    public final rek0 f;
    public final ctf0 g;
    public final mne h;
    public final m1e i;
    public final hse0 j;
    public final suk k;
    public final ok50 l;
    public final gxu m;
    public final eru n;
    public final jh70 o;
    public final mi70 p;
    public final iqt q;
    public final rou r;
    public final iw20 s;
    public final qgd t;
    public final suk u;
    public final nyb v;
    public final tvd w;
    public final epc x;
    public final p7m0 y;
    public final ol60 z;

    public svd(vzg0 vzg0Var, i1w0 i1w0Var, oud oudVar, duj dujVar, rek0 rek0Var, pru pruVar, ctf0 ctf0Var, mne mneVar, m1e m1eVar, hse0 hse0Var, suk sukVar, ok50 ok50Var, gxu gxuVar, eru eruVar, jh70 jh70Var, mi70 mi70Var, myb mybVar, iqt iqtVar, rou rouVar, iw20 iw20Var, qgd qgdVar, suk sukVar2, nyb nybVar, tvd tvdVar, zn00 zn00Var, g2v g2vVar, epc epcVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        hse0Var.getClass();
        this.b = vzg0Var;
        this.c = i1w0Var;
        this.d = oudVar;
        this.e = dujVar;
        this.f = rek0Var;
        this.g = ctf0Var;
        this.h = mneVar;
        this.i = m1eVar;
        this.j = hse0Var;
        this.k = sukVar;
        this.l = ok50Var;
        this.m = gxuVar;
        this.n = eruVar;
        this.o = jh70Var;
        this.p = mi70Var;
        this.q = iqtVar;
        this.r = rouVar;
        this.s = iw20Var;
        this.t = qgdVar;
        this.u = sukVar2;
        this.v = nybVar;
        this.w = tvdVar;
        this.x = epcVar;
        this.y = q7m0.a(rud.f31121a);
        ol60 ol60Var = new ol60(3);
        this.z = ol60Var;
        xuz xuzVar = pb10.c;
        this.A = q7m0.a(new fvd(g2v.e(g2vVar, new mkm(), new h8a(this, (byte) 29)), "", true, false, false, false, false, true));
        this.G = oudVar.b;
        boolean z = !sj3.L(mybVar.f22595a.f34444a) && iqtVar.f15225a.a();
        this.H = z;
        if (z) {
            ol60Var.f(xud.f41504a);
        } else {
            D();
        }
    }

    public final long A() {
        Long l = (Long) this.b.a("SAVED_FINISH_TIME");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void B(Throwable th) {
        Object value;
        boolean z = th instanceof an4;
        i1w0 i1w0Var = this.c;
        if (z) {
            i1w0Var.d(new h6c(this, (an4) th, (byte) 14));
            return;
        }
        boolean z2 = th instanceof mu4;
        ctf0 ctf0Var = this.g;
        ol60 ol60Var = this.z;
        if (!z2) {
            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                ol60Var.f(dvd.f6737a);
                return;
            }
            if (!(th instanceof zhi0)) {
                if ((th instanceof SSLException) || (th instanceof SocketException)) {
                    return;
                }
                this.e.b(th, new cnc(this, (byte) 12));
                return;
            }
            if (th instanceof z080) {
                ol60Var.f(new yud(ctf0Var.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.data_retrieval_error_try_again, Arrays.copyOf(new Object[0], 0))));
                return;
            }
            if (th instanceof uoo) {
                ol60Var.f(new zud(ctf0Var.b.a(R.string.expired_operation_time_connection, Arrays.copyOf(new Object[0], 0))));
                return;
            }
            if (!(th instanceof zhi0)) {
                E(th.getMessage());
                return;
            }
            zhi0 zhi0Var = (zhi0) th;
            kuw kuwVar = zhi0Var.c;
            if (kuwVar == i2o.AuthCodeConfirmationLimit) {
                String message = zhi0Var.getMessage();
                ol60Var.f(new zud(message != null ? message : ""));
                return;
            } else if (kuwVar == i2o.OnlyOperatorCanEditParticipants) {
                String message2 = zhi0Var.getMessage();
                ol60Var.f(new bvd(message2 != null ? message2 : ""));
                return;
            } else {
                if (kuwVar == i2o.AuthInvalidCode) {
                    E(zhi0Var.getMessage());
                    return;
                }
                String strA = ctf0Var.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0));
                String message3 = zhi0Var.getMessage();
                ol60Var.f(new yud(strA, message3 != null ? message3 : ""));
                return;
            }
        }
        if (gvd.b[((mu4) th).f22396a.ordinal()] == 1) {
            p7m0 p7m0Var = this.A;
            if (((fvd) p7m0Var.getValue()).g) {
                C();
                return;
            } else {
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, fvd.a((fvd) value, false, false, false, false, true, null, 239)));
                return;
            }
        }
        if (!this.F) {
            return;
        }
        ol60Var.f(new avd(ctf0Var.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0))));
        i1w0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new q0w0(null)), i1w0Var, copyOnWriteArrayList, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void C() {
        bby bbyVar = this.D;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.C;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        this.D = sac.V(jiu0.a(this), null, null, null, new pvd(this, yjeVar, (byte) 0), 15);
    }

    public final void D() {
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.h;
        Class<svd> cls = svd.class;
        yje yjeVar = null;
        sac.V(bvcVarA, new enc(1, this, cls, "handleServerError", "handleServerError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, mneVar.b, new fj3((diu0) this, yjeVar, (byte) 3), 10);
        bby bbyVar = this.C;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.C = sac.V(jiu0.a(this), new enc(1, this, cls, "handleServerError", "handleServerError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, mneVar.b, new pvd(this, yjeVar, (byte) 2), 10);
        }
    }

    public final void E(String str) {
        this.z.f(new vud(str, (str == null || str.length() == 0) ? R.attr.uikitSecondary : R.attr.uikitWarning));
    }

    public final void F() {
        p7m0 p7m0Var;
        Object value;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = A();
        rud rudVar = rud.f31121a;
        p7m0 p7m0Var2 = this.y;
        yje yjeVar = null;
        if (jA == 0) {
            p7m0Var2.getClass();
            p7m0Var2.o(null, rudVar);
            return;
        }
        if (A() <= jCurrentTimeMillis) {
            do {
                p7m0Var = this.A;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, fvd.a((fvd) value, false, true, false, false, false, null, 252)));
            p7m0Var2.getClass();
            p7m0Var2.o(null, rudVar);
            return;
        }
        long jA2 = A() - jCurrentTimeMillis;
        c4m0 c4m0Var = this.E;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.E = sac.T(new dnq(new fnq(sac.L(6, jA2, 0L), new yg1((Object) this, yjeVar, (byte) 5), (byte) 4), new rj((Object) this, yjeVar, (byte) 11), (byte) 0), d5c.S(jiu0.a(this), this.h.c), rvd.h);
    }

    public final void w() {
        int i = gvd.f11969a[this.d.e.ordinal()];
        i1w0 i1w0Var = this.c;
        if (i == 1) {
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI.c(iw20.f(this.s, nqh0.f23960a));
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI2.c(jh70.j(this.o, false));
            ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r6, a.zje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.hvd
            if (r0 == 0) goto L13
            r0 = r7
            a.hvd r0 = (a.hvd) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.hvd r0 = new a.hvd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r7)
            goto L56
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r7)
            goto L45
        L35:
            a.z1x.P(r7)
            r0.k = r4
            a.nyb r7 = r5.v
            a.ts4 r7 = r7.f24323a
            java.io.Serializable r7 = r7.a(r6, r0)
            if (r7 != r1) goto L45
            goto L55
        L45:
            a.swp0 r7 = (a.swp0) r7
            r0.k = r3
            a.ok50 r6 = r5.l
            java.lang.Object r6 = r6.f25390a
            a.n660 r6 = (a.n660) r6
            java.lang.Object r7 = r6.f(r7, r0)
            if (r7 != r1) goto L56
        L55:
            return r1
        L56:
            a.v340 r7 = (a.v340) r7
            a.oud r6 = r5.d
            java.lang.String r6 = r6.f
            r6.getClass()
            a.eru r0 = r5.n
            a.owp0 r0 = r0.f8298a
            int r1 = r6.length()
            if (r1 <= 0) goto L6c
            r0.i(r6)
        L6c:
            a.epc r6 = r5.x
            r6.b()
            a.avd r6 = new a.avd
            java.lang.String r7 = r7.f36717a
            r6.<init>(r7)
            a.ol60 r7 = r5.z
            r7.f(r6)
            r5.w()
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.svd.x(java.lang.String, a.zje):java.lang.Object");
    }

    public final void y(String str) {
        while (true) {
            p7m0 p7m0Var = this.A;
            Object value = p7m0Var.getValue();
            String str2 = str;
            if (p7m0Var.m(value, fvd.a((fvd) value, false, false, !StringsKt.W(str), false, false, str2, 123))) {
                E("");
                return;
            }
            str = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r6 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.mvd
            if (r0 == 0) goto L13
            r0 = r6
            a.mvd r0 = (a.mvd) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.mvd r0 = new a.mvd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L55
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L44
        L35:
            a.z1x.P(r6)
            r0.k = r4
            a.rou r6 = r5.r
            r2 = 0
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L44
            goto L54
        L44:
            a.m2c0 r6 = (a.m2c0) r6
            boolean r6 = r6.n0
            if (r6 == 0) goto L72
            r0.k = r3
            a.gxu r6 = r5.m
            java.lang.Object r6 = r6.n(r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L72
            a.suk r5 = r5.u
            a.ts4 r5 = r5.f32825a
            a.vo4 r5 = r5.e
            a.qoj0 r5 = r5.f37746a
            a.i89 r6 = new a.i89
            r0 = 6
            r6.<init>(r5, r0)
            a.eu4 r5 = new a.eu4
            r0 = 3
            r5.<init>(r6, r0)
            return r5
        L72:
            a.eu4 r5 = new a.eu4
            r6 = 12
            java.lang.String r0 = ""
            r5.<init>(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.svd.z(a.zje):java.lang.Object");
    }
}
