package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.File;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class gxc0 extends i3t0 {
    public static final /* synthetic */ int M = 0;
    public final iqt A;
    public final uzc0 B;
    public final wsf0 C;
    public final x0u D;
    public final yfu E;
    public final ocl F;
    public final hru G;
    public final ytt H;
    public bby I;
    public bby J;
    public final c4m0 K;
    public final c4m0 L;
    public final String o;
    public final hse0 p;
    public final yfu q;
    public final b8u r;
    public final i1w0 s;
    public final mne t;
    public final duj u;
    public final j1q0 v;
    public final ntu w;
    public final wgu x;
    public final n4u y;
    public final ctf0 z;

    public gxc0(String str, hse0 hse0Var, yfu yfuVar, b8u b8uVar, i1w0 i1w0Var, g2v g2vVar, m1e m1eVar, mne mneVar, duj dujVar, j1q0 j1q0Var, ntu ntuVar, wgu wguVar, n4u n4uVar, ctf0 ctf0Var, iqt iqtVar, uzc0 uzc0Var, wsf0 wsf0Var, x0u x0uVar, yfu yfuVar2, ocl oclVar, hru hruVar, jqt jqtVar, ytt yttVar) {
        hse0Var.getClass();
        m1eVar.getClass();
        j1q0Var.getClass();
        wguVar.getClass();
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        g090 g090VarP = cvm0.p(vs10Var, mneVar.b);
        cbc0 cbc0Var = new cbc0((byte) 11);
        o20 o20Var = new o20(g2vVar, ctf0Var, (byte) 20);
        yje yjeVar = null;
        super(cbc0Var, g090VarP, o20Var, (yzn0) null);
        this.o = str;
        this.p = hse0Var;
        this.q = yfuVar;
        this.r = b8uVar;
        this.s = i1w0Var;
        this.t = mneVar;
        this.u = dujVar;
        this.v = j1q0Var;
        this.w = ntuVar;
        this.x = wguVar;
        this.y = n4uVar;
        this.z = ctf0Var;
        this.A = iqtVar;
        this.B = uzc0Var;
        this.C = wsf0Var;
        this.D = x0uVar;
        this.E = yfuVar2;
        this.F = oclVar;
        this.G = hruVar;
        this.H = yttVar;
        c4m0 c4m0Var = this.L;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.L = slb.U(new dnq(new fnq(jqtVar.a(), new exc0(this, yjeVar, b), (byte) 4), new jgb0((Object) this, yjeVar, (byte) 5), (byte) 1), jiu0.a(this));
        }
        c4m0 c4m0Var2 = this.K;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            this.K = slb.U(new fnq(m1eVar.b(), new exc0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), vs10Var));
        }
        sac.V(jiu0.a(this), new cxc0(this, (byte) 1), null, mneVar.f22085a, new d7a0(this, yjeVar, (byte) 8), 10);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0111  */
    /* JADX WARN: Code duplicated, block: B:38:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable M(String str, zje zjeVar) {
        dxc0 dxc0Var;
        Object objA;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        jo20 jo20Var;
        Object objC;
        String str6;
        String str7;
        jo20 jo20Var2;
        jo20 jo20Var3;
        jo20 jo20Var4;
        if (zjeVar instanceof dxc0) {
            dxc0Var = (dxc0) zjeVar;
            int i = dxc0Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                dxc0Var.r = i - Integer.MIN_VALUE;
            } else {
                dxc0Var = new dxc0(this, zjeVar);
            }
        } else {
            dxc0Var = new dxc0(this, zjeVar);
        }
        Object obj = dxc0Var.p;
        wne wneVar = wne.f39444a;
        int i2 = dxc0Var.r;
        String str8 = "";
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = this.A.f15225a.a();
            dxc0Var.i = str;
            dxc0Var.o = zA;
            dxc0Var.r = 1;
            if (zA) {
                objA = hse0.a(this.p, ((btt0) this.q.f42558a).a(), false, dxc0Var, 6);
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
            z = dxc0Var.o;
            str2 = dxc0Var.i;
            z1x.P(obj);
        } else {
            if (i2 == 2) {
                z = dxc0Var.o;
                str4 = dxc0Var.j;
                str5 = dxc0Var.i;
                z1x.P(obj);
                String str9 = str5;
                str8 = ((ql5) obj).g;
                str3 = str4;
                str2 = str9;
                jo20Var = new jo20();
                this.y.e();
                jo20Var.put("X-Mobile-Project-Id", String.valueOf(1357));
                jo20Var.put("x-mobile-app-authorization", str3);
                jo20Var.put("X-Auth", str3);
                jo20Var.put("x-mobile-currency", str8);
                ((knf0) ((yk50) this.G.f13549a).b).getClass();
                jo20Var.put("X-Whence", String.valueOf(22));
                this.E.j();
                jo20Var.put("X-Referral", String.valueOf(1));
                dxc0Var.i = str2;
                dxc0Var.j = null;
                dxc0Var.k = jo20Var;
                dxc0Var.l = jo20Var;
                dxc0Var.m = "X-Country";
                dxc0Var.n = jo20Var;
                dxc0Var.o = z;
                dxc0Var.r = 3;
                objC = this.D.c(dxc0Var);
                if (objC != wneVar) {
                    str6 = "X-Country";
                    str7 = str2;
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
            jo20Var4 = dxc0Var.n;
            str6 = dxc0Var.m;
            jo20Var2 = dxc0Var.l;
            jo20Var3 = dxc0Var.k;
            str7 = dxc0Var.i;
            z1x.P(obj);
        }
        jo20Var4.put(str6, String.valueOf(((Number) obj).intValue()));
        jo20Var2.put("X-FCountry", String.valueOf(((knf0) ((yk50) this.F.f25032a).b).b()));
        if (str7.length() > 0) {
            jo20Var2.put("X-Language", str7);
        }
        jo20Var3.getClass();
        return jo20Var3.b();
        str3 = (String) obj;
        if (z) {
            nou nouVarE = ((g45) this.C.b).E();
            dxc0Var.i = str2;
            dxc0Var.j = str3;
            dxc0Var.o = z;
            dxc0Var.r = 2;
            Serializable serializableA = nouVarE.a(tl5.c, dxc0Var);
            if (serializableA != wneVar) {
                String str10 = str2;
                str4 = str3;
                obj = serializableA;
                str5 = str10;
                String str11 = str5;
                str8 = ((ql5) obj).g;
                str3 = str4;
                str2 = str11;
                jo20Var = new jo20();
                this.y.e();
                jo20Var.put("X-Mobile-Project-Id", String.valueOf(1357));
                jo20Var.put("x-mobile-app-authorization", str3);
                jo20Var.put("X-Auth", str3);
                jo20Var.put("x-mobile-currency", str8);
                ((knf0) ((yk50) this.G.f13549a).b).getClass();
                jo20Var.put("X-Whence", String.valueOf(22));
                this.E.j();
                jo20Var.put("X-Referral", String.valueOf(1));
                dxc0Var.i = str2;
                dxc0Var.j = null;
                dxc0Var.k = jo20Var;
                dxc0Var.l = jo20Var;
                dxc0Var.m = "X-Country";
                dxc0Var.n = jo20Var;
                dxc0Var.o = z;
                dxc0Var.r = 3;
                objC = this.D.c(dxc0Var);
                if (objC != wneVar) {
                    str6 = "X-Country";
                    str7 = str2;
                    jo20Var2 = jo20Var;
                    jo20Var3 = jo20Var2;
                    obj = objC;
                    jo20Var4 = jo20Var3;
                    jo20Var4.put(str6, String.valueOf(((Number) obj).intValue()));
                    jo20Var2.put("X-FCountry", String.valueOf(((knf0) ((yk50) this.F.f25032a).b).b()));
                    if (str7.length() > 0) {
                        jo20Var2.put("X-Language", str7);
                    }
                    jo20Var3.getClass();
                    return jo20Var3.b();
                }
            }
        } else {
            jo20Var = new jo20();
            this.y.e();
            jo20Var.put("X-Mobile-Project-Id", String.valueOf(1357));
            jo20Var.put("x-mobile-app-authorization", str3);
            jo20Var.put("X-Auth", str3);
            jo20Var.put("x-mobile-currency", str8);
            ((knf0) ((yk50) this.G.f13549a).b).getClass();
            jo20Var.put("X-Whence", String.valueOf(22));
            this.E.j();
            jo20Var.put("X-Referral", String.valueOf(1));
            dxc0Var.i = str2;
            dxc0Var.j = null;
            dxc0Var.k = jo20Var;
            dxc0Var.l = jo20Var;
            dxc0Var.m = "X-Country";
            dxc0Var.n = jo20Var;
            dxc0Var.o = z;
            dxc0Var.r = 3;
            objC = this.D.c(dxc0Var);
            if (objC != wneVar) {
                str6 = "X-Country";
                str7 = str2;
                jo20Var2 = jo20Var;
                jo20Var3 = jo20Var2;
                obj = objC;
                jo20Var4 = jo20Var3;
                jo20Var4.put(str6, String.valueOf(((Number) obj).intValue()));
                jo20Var2.put("X-FCountry", String.valueOf(((knf0) ((yk50) this.F.f25032a).b).b()));
                if (str7.length() > 0) {
                    jo20Var2.put("X-Language", str7);
                }
                jo20Var3.getClass();
                return jo20Var3.b();
            }
        }
        return wneVar;
    }

    public final void N(Throwable th) {
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
            } while (!p7m0Var.m(value, xwc0.a((xwc0) value, false, false, true, false, 26)));
            return;
        }
        if (((xwc0) D()).b) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, xwc0.a((xwc0) value3, false, false, true, false, 26)));
            return;
        }
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value2 = p7m0Var3.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value2, xwc0.a((xwc0) value2, false, false, false, false, 24)));
    }

    public final void O(String str) {
        Object value;
        bby bbyVar = this.J;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, xwc0.a((xwc0) value, true, false, false, false, 30)));
            String strN = ohs0.n(this.w.a(), str);
            String strA = this.x.a();
            this.J = sac.V(jiu0.a(this), new cxc0(this, (byte) 0), null, this.t.b, new fxc0((i3t0) this, strA, strN, (yje) null, (byte) 0), 10);
        }
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.L;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.K;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        mwc0 mwc0Var = (mwc0) obj;
        mwc0Var.getClass();
        super.x(mwc0Var);
        boolean z = mwc0Var instanceof gwc0;
        byte b = 0;
        String str = this.o;
        yje yjeVar = null;
        mne mneVar = this.t;
        if (z) {
            gwc0 gwc0Var = (gwc0) mwc0Var;
            if (gwc0Var instanceof fwc0) {
                if (((xwc0) D()).d && ((xwc0) D()).b) {
                    O(str);
                    return;
                }
                return;
            }
            boolean z2 = gwc0Var instanceof cwc0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, xwc0.a((xwc0) value3, false, true, false, false, 16)));
                return;
            }
            if (gwc0Var instanceof ewc0) {
                bby bbyVar = this.J;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                }
                bby bbyVar2 = this.I;
                if (bbyVar2 != null) {
                    e3c.n(bbyVar2);
                    return;
                }
                return;
            }
            if (gwc0Var instanceof bwc0) {
                bby bbyVar3 = this.I;
                if (bbyVar3 == null || !bbyVar3.isActive()) {
                    this.I = sac.V(jiu0.a(this), new cxc0(this, (byte) 2), null, mneVar.b, new exc0(this, yjeVar, b), 10);
                    return;
                }
                return;
            }
            if (gwc0Var instanceof dwc0) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, xwc0.a((xwc0) value2, false, false, true, false, 26)));
                return;
            }
            if (!(gwc0Var instanceof zvc0)) {
                if (gwc0Var instanceof awc0) {
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
            } while (!p7m0Var3.m(value, xwc0.a((xwc0) value, false, false, false, false, 24)));
            return;
        }
        if (!(mwc0Var instanceof lwc0)) {
            t9f.b();
            return;
        }
        lwc0 lwc0Var = (lwc0) mwc0Var;
        boolean z3 = lwc0Var instanceof hwc0;
        i1w0 i1w0Var = this.s;
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
            if (!(lwc0Var instanceof kwc0)) {
                if (lwc0Var instanceof iwc0) {
                    String str2 = ((iwc0) lwc0Var).f15482a;
                    if (str2.length() == 0) {
                        return;
                    }
                    sac.V(jiu0.a(this), null, null, mneVar.b, new b2b(this, str2, (yje) null), 11);
                    return;
                }
                if (!(lwc0Var instanceof jwc0)) {
                    t9f.b();
                    return;
                }
                File file = ((jwc0) lwc0Var).f17243a;
                sac.V(jiu0.a(this), new cxc0(this, (byte) 3), null, mneVar.b, new o690((Object) this, (Object) file, yjeVar, (byte) 26), 10);
                return;
            }
            if (!((xwc0) D()).b) {
                return;
            }
            if (!((xwc0) D()).c) {
                O(str);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen fragmentScreenC = uzc0.c(this.B, 0);
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
