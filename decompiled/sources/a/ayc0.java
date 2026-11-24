package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.File;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class ayc0 extends i3t0 {
    public static final /* synthetic */ int O = 0;
    public final uzc0 A;
    public final x0u B;
    public final yfu C;
    public final ieu D;
    public final ocl E;
    public final m0u F;
    public final yfu G;
    public final ocl H;
    public final iqt I;
    public final hru J;
    public bby K;
    public final c4m0 L;
    public bby M;
    public final c4m0 N;
    public final String o;
    public final hse0 p;
    public final b8u q;
    public final i1w0 r;
    public final mne s;
    public final duj t;
    public final j1q0 u;
    public final ntu v;
    public final n4u w;
    public final ctf0 x;
    public final wgu y;
    public final nou z;

    public ayc0(String str, hse0 hse0Var, b8u b8uVar, i1w0 i1w0Var, g2v g2vVar, m1e m1eVar, mne mneVar, duj dujVar, j1q0 j1q0Var, ntu ntuVar, n4u n4uVar, ctf0 ctf0Var, wgu wguVar, nou nouVar, uzc0 uzc0Var, x0u x0uVar, yfu yfuVar, ieu ieuVar, ocl oclVar, m0u m0uVar, yfu yfuVar2, ocl oclVar2, iqt iqtVar, hru hruVar, jqt jqtVar) {
        hse0Var.getClass();
        m1eVar.getClass();
        j1q0Var.getClass();
        ctf0Var.getClass();
        wguVar.getClass();
        vs10 vs10Var = mneVar.c;
        g090 g090VarP = cvm0.p(vs10Var, mneVar.b);
        cbc0 cbc0Var = new cbc0((byte) 12);
        o20 o20Var = new o20(g2vVar, ctf0Var, (byte) 21);
        yje yjeVar = null;
        super(cbc0Var, g090VarP, o20Var, (yzn0) null);
        this.o = str;
        this.p = hse0Var;
        this.q = b8uVar;
        this.r = i1w0Var;
        this.s = mneVar;
        this.t = dujVar;
        this.u = j1q0Var;
        this.v = ntuVar;
        this.w = n4uVar;
        this.x = ctf0Var;
        this.y = wguVar;
        this.z = nouVar;
        this.A = uzc0Var;
        this.B = x0uVar;
        this.C = yfuVar;
        this.D = ieuVar;
        this.E = oclVar;
        this.F = m0uVar;
        this.G = yfuVar2;
        this.H = oclVar2;
        this.I = iqtVar;
        this.J = hruVar;
        c4m0 c4m0Var = this.L;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.L = slb.U(new dnq(new fnq(jqtVar.a(), new zxc0(this, yjeVar, b), (byte) 4), new jgb0((Object) this, yjeVar, (byte) 6), (byte) 1), jiu0.a(this));
        }
        c4m0 c4m0Var2 = this.N;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            this.N = slb.U(new fnq(m1eVar.b(), new zxc0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), vs10Var));
        }
        sac.V(jiu0.a(this), new vxc0(this, (byte) 1), null, mneVar.f22085a, new d7a0(this, yjeVar, (byte) 9), 10);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x012f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable M(String str, zje zjeVar) {
        wxc0 wxc0Var;
        Object objA;
        String str2;
        boolean z;
        String str3;
        jo20 jo20Var;
        Object objC;
        String str4;
        String str5;
        jo20 jo20Var2;
        jo20 jo20Var3;
        jo20 jo20Var4;
        if (zjeVar instanceof wxc0) {
            wxc0Var = (wxc0) zjeVar;
            int i = wxc0Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                wxc0Var.r = i - Integer.MIN_VALUE;
            } else {
                wxc0Var = new wxc0(this, zjeVar);
            }
        } else {
            wxc0Var = new wxc0(this, zjeVar);
        }
        Object obj = wxc0Var.p;
        wne wneVar = wne.f39444a;
        int i2 = wxc0Var.r;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = this.I.f15225a.a();
            wxc0Var.i = str;
            wxc0Var.o = zA;
            wxc0Var.r = 1;
            if (zA) {
                objA = hse0.a(this.p, ((btt0) this.G.f42558a).a(), false, wxc0Var, 6);
            } else {
                objA = "";
            }
            if (objA != wneVar) {
                Object obj2 = objA;
                str2 = str;
                z = zA;
                obj = obj2;
            }
            return wneVar;
        }
        if (i2 == 1) {
            z = wxc0Var.o;
            str2 = wxc0Var.i;
            z1x.P(obj);
        } else {
            if (i2 == 2) {
                z = wxc0Var.o;
                String str6 = wxc0Var.j;
                String str7 = wxc0Var.i;
                z1x.P(obj);
                str3 = str6;
                str2 = str7;
                jo20Var = new jo20();
                this.w.e();
                jo20Var.put("X-Mobile-Project-Id", String.valueOf(1357));
                jo20Var.put("x-mobile-app-authorization", str3);
                jo20Var.put("X-Auth", str3);
                jo20Var.put("x-mobile-currency", (String) obj);
                ((knf0) ((yk50) this.J.f13549a).b).getClass();
                jo20Var.put("X-Whence", String.valueOf(22));
                this.C.j();
                jo20Var.put("X-Referral", String.valueOf(1));
                wxc0Var.i = str2;
                wxc0Var.j = null;
                wxc0Var.k = jo20Var;
                wxc0Var.l = jo20Var;
                wxc0Var.m = "X-Country";
                wxc0Var.n = jo20Var;
                wxc0Var.o = z;
                wxc0Var.r = 3;
                objC = this.B.c(wxc0Var);
                if (objC != wneVar) {
                    str4 = "X-Country";
                    str5 = str2;
                    jo20Var2 = jo20Var;
                    jo20Var3 = jo20Var2;
                    obj = objC;
                    jo20Var4 = jo20Var3;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jo20Var4 = wxc0Var.n;
            str4 = wxc0Var.m;
            jo20Var2 = wxc0Var.l;
            jo20Var3 = wxc0Var.k;
            str5 = wxc0Var.i;
            z1x.P(obj);
        }
        jo20Var4.put(str4, String.valueOf(((Number) obj).intValue()));
        jo20Var2.put("X-FCountry", String.valueOf(((knf0) ((yk50) this.H.f25032a).b).b()));
        if (str5.length() > 0) {
            jo20Var2.put("X-Language", str5);
        }
        jo20Var3.getClass();
        return jo20Var3.b();
        String str8 = (String) obj;
        wxc0Var.i = str2;
        wxc0Var.j = str8;
        wxc0Var.o = z;
        wxc0Var.r = 2;
        Object objN = N(z, wxc0Var);
        if (objN != wneVar) {
            str3 = str8;
            obj = objN;
            jo20Var = new jo20();
            this.w.e();
            jo20Var.put("X-Mobile-Project-Id", String.valueOf(1357));
            jo20Var.put("x-mobile-app-authorization", str3);
            jo20Var.put("X-Auth", str3);
            jo20Var.put("x-mobile-currency", (String) obj);
            ((knf0) ((yk50) this.J.f13549a).b).getClass();
            jo20Var.put("X-Whence", String.valueOf(22));
            this.C.j();
            jo20Var.put("X-Referral", String.valueOf(1));
            wxc0Var.i = str2;
            wxc0Var.j = null;
            wxc0Var.k = jo20Var;
            wxc0Var.l = jo20Var;
            wxc0Var.m = "X-Country";
            wxc0Var.n = jo20Var;
            wxc0Var.o = z;
            wxc0Var.r = 3;
            objC = this.B.c(wxc0Var);
            if (objC != wneVar) {
                str4 = "X-Country";
                str5 = str2;
                jo20Var2 = jo20Var;
                jo20Var3 = jo20Var2;
                obj = objC;
                jo20Var4 = jo20Var3;
                jo20Var4.put(str4, String.valueOf(((Number) obj).intValue()));
                jo20Var2.put("X-FCountry", String.valueOf(((knf0) ((yk50) this.H.f25032a).b).b()));
                if (str5.length() > 0) {
                    jo20Var2.put("X-Language", str5);
                }
                jo20Var3.getClass();
                return jo20Var3.b();
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r7 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(boolean r6, a.zje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.xxc0
            if (r0 == 0) goto L13
            r0 = r7
            a.xxc0 r0 = (a.xxc0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.xxc0 r0 = new a.xxc0
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
            return r7
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
            if (r6 == 0) goto L4a
            r0.k = r4
            a.nou r5 = r5.z
            java.io.Serializable r7 = a.nou.b(r5, r0)
            if (r7 != r1) goto L45
            goto L52
        L45:
            a.ql5 r7 = (a.ql5) r7
            java.lang.String r5 = r7.g
            return r5
        L4a:
            r0.k = r3
            java.lang.Object r5 = r5.O(r0)
            if (r5 != r1) goto L53
        L52:
            return r1
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ayc0.N(boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r9 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.yxc0
            if (r0 == 0) goto L13
            r0 = r9
            a.yxc0 r0 = (a.yxc0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.yxc0 r0 = new a.yxc0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            a.z1x.P(r9)
            goto L74
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L34:
            long r4 = r0.i
            a.z1x.P(r9)
            goto L5f
        L3a:
            a.z1x.P(r9)
            goto L4c
        L3e:
            a.z1x.P(r9)
            r0.l = r5
            a.ieu r9 = r8.D
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L4c
            goto L73
        L4c:
            a.elt r9 = (a.elt) r9
            int r9 = r9.e
            long r5 = (long) r9
            r0.i = r5
            r0.l = r4
            a.ocl r9 = r8.E
            java.lang.Object r9 = r9.g(r5, r0)
            if (r9 != r1) goto L5e
            goto L73
        L5e:
            r4 = r5
        L5f:
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            r0.i = r4
            r0.l = r3
            a.m0u r8 = r8.F
            a.xr r8 = r8.f20973a
            java.lang.Object r9 = r8.c(r6, r0)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            a.xuf r9 = (a.xuf) r9
            java.lang.String r8 = r9.b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ayc0.O(a.zje):java.lang.Object");
    }

    public final void P(Throwable th) {
        Object value;
        Object value2;
        Object value3;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (th == null || (!(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException))) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, qxc0.a((qxc0) value, false, false, true, false, 26)));
            return;
        }
        if (((qxc0) D()).b) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, qxc0.a((qxc0) value3, false, false, true, false, 26)));
            return;
        }
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value2 = p7m0Var3.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value2, qxc0.a((qxc0) value2, false, false, false, false, 24)));
    }

    public final void Q(String str) {
        Object value;
        bby bbyVar = this.M;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, qxc0.a((qxc0) value, true, false, false, false, 30)));
            String strN = ohs0.n(this.v.a(), str);
            String strA = this.y.a();
            this.M = sac.V(jiu0.a(this), new vxc0(this, (byte) 0), null, this.s.b, new fxc0((i3t0) this, strA, strN, (yje) null, (byte) 2), 10);
        }
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.L;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.N;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        yvc0 yvc0Var = (yvc0) obj;
        yvc0Var.getClass();
        super.x(yvc0Var);
        boolean z = yvc0Var instanceof svc0;
        byte b = 0;
        mne mneVar = this.s;
        String str = this.o;
        yje yjeVar = null;
        if (z) {
            svc0 svc0Var = (svc0) yvc0Var;
            if (svc0Var instanceof rvc0) {
                if (((qxc0) D()).d && ((qxc0) D()).b) {
                    Q(str);
                    return;
                }
                return;
            }
            boolean z2 = svc0Var instanceof ovc0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, qxc0.a((qxc0) value3, false, true, false, false, 16)));
                return;
            }
            if (svc0Var instanceof qvc0) {
                bby bbyVar = this.M;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                }
                bby bbyVar2 = this.K;
                if (bbyVar2 != null) {
                    e3c.n(bbyVar2);
                    return;
                }
                return;
            }
            if (svc0Var instanceof nvc0) {
                bby bbyVar3 = this.K;
                if (bbyVar3 == null || !bbyVar3.isActive()) {
                    this.K = sac.V(jiu0.a(this), new vxc0(this, (byte) 3), null, mneVar.b, new zxc0(this, yjeVar, b), 10);
                    return;
                }
                return;
            }
            if (svc0Var instanceof pvc0) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, qxc0.a((qxc0) value2, false, false, true, false, 26)));
                return;
            }
            if (!(svc0Var instanceof lvc0)) {
                if (svc0Var instanceof mvc0) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, qxc0.a((qxc0) value, false, false, false, false, 24)));
            return;
        }
        if (!(yvc0Var instanceof xvc0)) {
            t9f.b();
            return;
        }
        xvc0 xvc0Var = (xvc0) yvc0Var;
        boolean z3 = xvc0Var instanceof tvc0;
        i1w0 i1w0Var = this.r;
        if (z3) {
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
            if (!(xvc0Var instanceof wvc0)) {
                if (xvc0Var instanceof uvc0) {
                    String str2 = ((uvc0) xvc0Var).f36342a;
                    if (str2.length() == 0) {
                        return;
                    }
                    G(new nxc0(w6x.r(new Object[0], 0, this.x.b, R.string.deeplink_scheme, str2)));
                    return;
                }
                if (!(xvc0Var instanceof vvc0)) {
                    t9f.b();
                    return;
                }
                File file = ((vvc0) xvc0Var).f38092a;
                sac.V(jiu0.a(this), new vxc0(this, (byte) 2), null, mneVar.b, new o690((Object) this, (Object) file, yjeVar, (byte) 27), 10);
                return;
            }
            if (!((qxc0) D()).b) {
                return;
            }
            if (!((qxc0) D()).c) {
                Q(str);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen fragmentScreenC = uzc0.c(this.A, 0);
            if (fragmentScreenC instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenC)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenC)));
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
