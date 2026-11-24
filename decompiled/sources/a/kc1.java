package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class kc1 extends i3t0 {
    public static final List P = q3d.j(-1L, 0L);
    public final kki A;
    public final do20 B;
    public final hcp0 C;
    public final qoc D;
    public final trm0 E;
    public final nou F;
    public final lrc G;
    public final nrt H;
    public final yzn0 I;
    public final ubu J;
    public final tqx K;
    public final es L;
    public final s31 M;
    public final s64 N;
    public bby O;
    public final mne o;
    public final oeg0 p;
    public final khf0 q;
    public final fv70 r;
    public final gv70 s;
    public final ntu t;
    public final a6u u;
    public final u58 v;
    public final au0 w;
    public final bzu x;
    public final duj y;
    public final es z;

    public kc1(mne mneVar, oeg0 oeg0Var, iqt iqtVar, khf0 khf0Var, fv70 fv70Var, gv70 gv70Var, ntu ntuVar, a6u a6uVar, u58 u58Var, au0 au0Var, bzu bzuVar, duj dujVar, es esVar, kki kkiVar, do20 do20Var, hcp0 hcp0Var, qoc qocVar, trm0 trm0Var, nou nouVar, lrc lrcVar, nrt nrtVar, yzn0 yzn0Var, ubu ubuVar, tqx tqxVar, es esVar2, s31 s31Var, s64 s64Var, ctf0 ctf0Var, db1 db1Var, boolean z) {
        oeg0Var.getClass();
        ctf0Var.getClass();
        zb1 zb1Var = new zb1((Object) iqtVar, (Object) db1Var, (Object) ctf0Var, z, (byte) 0);
        eo0 eo0Var = new eo0((byte) 22);
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        yje yjeVar = null;
        super(null, zb1Var, eo0Var, cvm0.p(vs10Var, mneVar.f22085a), null);
        this.o = mneVar;
        this.p = oeg0Var;
        this.q = khf0Var;
        this.r = fv70Var;
        this.s = gv70Var;
        this.t = ntuVar;
        this.u = a6uVar;
        this.v = u58Var;
        this.w = au0Var;
        this.x = bzuVar;
        this.y = dujVar;
        this.z = esVar;
        this.A = kkiVar;
        this.B = do20Var;
        this.C = hcp0Var;
        this.D = qocVar;
        this.E = trm0Var;
        this.F = nouVar;
        this.G = lrcVar;
        this.H = nrtVar;
        this.I = yzn0Var;
        this.J = ubuVar;
        this.K = tqxVar;
        this.L = esVar2;
        this.M = s31Var;
        this.N = s64Var;
        this.O = sac.f0(jiu0.a(this), 500L, TimeUnit.MILLISECONDS, null, dc1.f5828a, new ec1(this, yjeVar, (byte) 0), 36);
        if (((xb1) D()).f40578a.k && ((xb1) D()).d) {
            sac.V(jiu0.a(this), new ac1(this, (byte) 2), null, dvjVar, new bc1(this, yjeVar, (byte) 3), 10);
        } else if (((xb1) D()).f40578a.k) {
            sac.V(jiu0.a(this), new ac1(this, (byte) 1), null, dvjVar, new l1(this, yjeVar, (byte) 20), 10);
        } else {
            M();
        }
    }

    public final void M() {
        if (!((xb1) D()).f40578a.i) {
            Q();
        } else {
            ((xb1) D()).j.add(ju0.c);
            G(new lb1(((xb1) D()).f40578a.b));
        }
    }

    public final void N() {
        if (!((xb1) D()).f40578a.f) {
            S();
            return;
        }
        sac.V(jiu0.a(this), new c21(1, this, kc1.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, null, new ec1(this, null, (byte) 1), 14);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|70|22|(1:25)|60) */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        r6 = r10;
        r10 = r11;
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
    
        if (a.qcc.O(3000, r0) == r1) goto L60;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00c5 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable O(a.zje r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kc1.O(a.zje):java.io.Serializable");
    }

    public final void P(Throwable th) {
        this.y.b(th, new o00(this, (byte) 14));
    }

    public final void Q() {
        boolean z = ((xb1) D()).f40578a.g;
        yje yjeVar = null;
        mne mneVar = this.o;
        if (z) {
            sac.V(jiu0.a(this), new c21(1, this, kc1.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, mneVar.b, new gc1((Object) this, yjeVar, (byte) 0), 10);
            return;
        }
        sac.V(jiu0.a(this), new c21(1, this, kc1.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, mneVar.b, new ya(this, yjeVar, (byte) 4), 10);
    }

    public final void R() {
        sac.V(jiu0.a(this), new c21(1, this, kc1.class, "handleGameLoadingException", "handleGameLoadingException(Ljava/lang/Throwable;)V", 0, (byte) 20), null, null, new jc1((Object) this, (yje) null, (byte) 0), 14);
    }

    public final void S() {
        if (((xb1) D()).b == null) {
            G(mb1.f21483a);
            return;
        }
        sac.V(jiu0.a(this), new c21(1, this, kc1.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, this.o.b, new ic1(this, null), 10);
    }

    public final void T() {
        if (((xb1) D()).c) {
            R();
            return;
        }
        yje yjeVar = null;
        if (((xb1) D()).g == 0) {
            sac.V(jiu0.a(this), new c21(1, this, kc1.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, this.o.b, new oa((Object) this, yjeVar, (byte) 7), 10);
            return;
        }
        if (!((xb1) D()).f40578a.e) {
            R();
            return;
        }
        byte b = 1;
        sac.V(jiu0.a(this), new c21(b, this, kc1.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, null, new bc1(this, yjeVar, b), 14);
    }

    public final void U(long j) {
        Object value;
        if (P.contains(Long.valueOf(((xb1) D()).e))) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, xb1.a((xb1) value, null, null, false, j, 0L, 0L, false, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        xb1 xb1Var;
        ya1 ya1Var = (ya1) obj;
        ya1Var.getClass();
        byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (!(ya1Var instanceof ta1)) {
            this.O = sac.f0(jiu0.a(this), 500L, TimeUnit.MILLISECONDS, null, dc1.f5828a, new ec1(this, objArr4 == true ? 1 : 0, b), 36);
        }
        if (ya1Var instanceof va1) {
            Set set = ((xb1) D()).j;
            Set set2 = set.isEmpty() ? null : set;
            if (set2 != null) {
                G(new eb1(CollectionsKt.L0(set2)));
                return;
            }
            return;
        }
        boolean z = ya1Var instanceof xa1;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            ((xb1) D()).j.remove(ju0.c);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                xb1Var = (xb1) value4;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, xb1.a(xb1Var, null, null, ((xa1) ya1Var).f40531a == av0.b, 0L, 0L, 0L, false, 2043)));
            if (((xb1) D()).c) {
                T();
                return;
            } else {
                Q();
                return;
            }
        }
        boolean z2 = ya1Var instanceof qa1;
        byte b2 = 2;
        p0w0 p0w0Var = p0w0.f26173a;
        oeg0 oeg0Var = this.p;
        if (z2) {
            qa1 qa1Var = (qa1) ya1Var;
            boolean z3 = qa1Var.f28374a;
            boolean z4 = qa1Var.b;
            s64 s64Var = this.N;
            s31 s31Var = this.M;
            if (z4) {
                s31Var.f31532a.a("acc_settings_popup_currency_call", xp20.f(new Pair("action", "approve"), new Pair("option", z3 ? "on" : "off")));
                s64Var.f31684a.a(tx3.l0(new k1p[]{new j1p(z3 ? "on" : "off", (byte) 0), new j1p("approve", (byte) 1)}), 10645L);
                this.K.a(!z3);
                N();
                return;
            }
            s31Var.f31532a.a("acc_settings_popup_currency_call", xp20.f(new Pair("action", "reject"), new Pair("option", z3 ? "on" : "off")));
            s64Var.f31684a.a(tx3.l0(new k1p[]{new j1p(z3 ? "on" : "off", (byte) 0), new j1p("reject", (byte) 1)}), 10645L);
            i1w0 i1w0VarC = oeg0Var.c();
            i1w0VarC.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0VarC, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean z5 = ya1Var instanceof wa1;
            mne mneVar = this.o;
            if (z5) {
                ((xb1) D()).j.remove(ju0.f);
                sac.V(jiu0.a(this), new ac1(this, b), null, mneVar.b, new l1(this, ((wa1) ya1Var).f38806a, objArr3 == true ? 1 : 0, (byte) 21), 10);
                return;
            }
            if (ya1Var.equals(ra1.f30111a)) {
                ((xb1) D()).j.remove(ju0.d);
                S();
                return;
            }
            if (ya1Var.equals(ua1.f35308a)) {
                ((xb1) D()).j.add(ju0.f);
                G(sb1.f31908a);
                return;
            }
            if (ya1Var.equals(oa1.f24907a)) {
                sac.V(jiu0.a(this), new c21(1, this, kc1.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, mneVar.b, new bc1(this, objArr2 == true ? 1 : 0, b), 10);
                return;
            }
            if (ya1Var.equals(na1.f23167a)) {
                if (((xb1) D()).f40578a.g) {
                    ((xb1) D()).j.add(ju0.b);
                    G(new hb1(((xb1) D()).i));
                    return;
                } else {
                    ((xb1) D()).j.add(ju0.f17126a);
                    G(jb1.f16215a);
                    return;
                }
            }
            if (ya1Var instanceof la1) {
                ((xb1) D()).j.remove(ju0.b);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, xb1.a((xb1) value3, null, null, false, 0L, 0L, ((la1) ya1Var).f19683a.f28916a, false, 1983)));
                T();
                return;
            }
            if (ya1Var instanceof ma1) {
                ((xb1) D()).j.remove(ju0.f17126a);
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, xb1.a((xb1) value2, null, null, false, 0L, 0L, ((ma1) ya1Var).f21438a.f28916a, false, 1983)));
                sac.V(jiu0.a(this), new c21(1, this, kc1.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, mneVar.b, new bc1(this, objArr == true ? 1 : 0, b2), 10);
                return;
            }
            if (ya1Var.equals(pa1.f26633a)) {
                N();
                return;
            }
            if (!ya1Var.equals(sa1.f31871a)) {
                if (!ya1Var.equals(ta1.f33592a)) {
                    t9f.b();
                    return;
                }
                e3c.n(this.O);
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, xb1.a((xb1) value, null, null, false, 0L, 0L, 0L, false, 1919)));
                E();
                return;
            }
            i1w0 i1w0VarC2 = oeg0Var.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC2);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0VarC2, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
