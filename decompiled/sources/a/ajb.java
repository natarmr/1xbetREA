package a;

import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ajb extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public bby A;
    public final c4m0 B;
    public final c4m0 C;
    public String D;
    public final i1w0 o;
    public final mne p;
    public final duj q;
    public final j1q0 r;
    public final ntu s;
    public final n4u t;
    public final ctf0 u;
    public final wgu v;
    public final hru w;
    public final iqt x;
    public final ahu y;
    public final c4m0 z;

    public ajb(i1w0 i1w0Var, g2v g2vVar, m1e m1eVar, mne mneVar, duj dujVar, j1q0 j1q0Var, ntu ntuVar, n4u n4uVar, ctf0 ctf0Var, wgu wguVar, hru hruVar, iqt iqtVar, jqt jqtVar, ahu ahuVar, phf0 phf0Var, pru pruVar) {
        m1eVar.getClass();
        j1q0Var.getClass();
        ctf0Var.getClass();
        wguVar.getClass();
        vs10 vs10Var = mneVar.c;
        g090 g090VarP = cvm0.p(vs10Var, mneVar.b);
        byte b = 0;
        qib qibVar = new qib(b, pruVar, ctf0Var);
        rib ribVar = new rib(g2vVar, b);
        yje yjeVar = null;
        super(qibVar, g090VarP, ribVar, (yzn0) null);
        this.o = i1w0Var;
        this.p = mneVar;
        this.q = dujVar;
        this.r = j1q0Var;
        this.s = ntuVar;
        this.t = n4uVar;
        this.u = ctf0Var;
        this.v = wguVar;
        this.w = hruVar;
        this.x = iqtVar;
        this.y = ahuVar;
        c4m0 c4m0Var = this.z;
        byte b2 = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.z = slb.U(new dnq(new fnq(jqtVar.a(), new vib(this, yjeVar, b), (byte) 4), new rj((Object) this, yjeVar, (byte) 9), (byte) 1), jiu0.a(this));
        }
        c4m0 c4m0Var2 = this.B;
        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
            this.B = slb.U(new fnq(m1eVar.b(), new vib(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), vs10Var));
        }
        c4m0 c4m0Var3 = this.C;
        if (c4m0Var3 == null || !c4m0Var3.isActive()) {
            this.C = sac.T(new fnq(i120.W(new fc4(phf0Var.m(), (byte) 3)), new zib(this, yjeVar, b), (byte) 4), jiu0.a(this), new zib(this, yjeVar, b2));
        }
        sac.V(jiu0.a(this), new sib(this, (byte) 1), null, mneVar.f22085a, new wib(this, yjeVar, b), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable M(zje zjeVar) {
        tib tibVar;
        boolean z;
        String str;
        if (zjeVar instanceof tib) {
            tibVar = (tib) zjeVar;
            int i = tibVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tibVar.m = i - Integer.MIN_VALUE;
            } else {
                tibVar = new tib(this, zjeVar);
            }
        } else {
            tibVar = new tib(this, zjeVar);
        }
        Object obj = tibVar.k;
        Serializable serializable = wne.f39444a;
        int i2 = tibVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = this.x.f15225a.a();
            String strA = this.v.a();
            tibVar.j = strA;
            tibVar.i = zA;
            tibVar.m = 1;
            Serializable serializableN = N(zA, tibVar);
            if (serializableN == serializable) {
                return serializable;
            }
            z = zA;
            obj = serializableN;
            str = strA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = tibVar.i;
            str = tibVar.j;
            z1x.P(obj);
        }
        String str2 = (String) obj;
        this.D = str2;
        jo20 jo20Var = new jo20();
        this.t.e();
        jo20Var.put("x-mobile-project-id", String.valueOf(1357));
        jo20Var.put("x-microfront", "sys-loyalty-program-app-front");
        jo20Var.put("x-route", "loyalty-program");
        jo20Var.put("x-mobile-currency", str2);
        if (str.length() > 0) {
            jo20Var.put("x-language", str);
        }
        if (z) {
            jo20Var.put("x-mobile-app-authorization", ((btt0) ((okt0) this.w.f13549a).b).a());
        }
        return jo20Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable N(boolean z, zje zjeVar) {
        uib uibVar;
        Serializable g0g0Var;
        if (zjeVar instanceof uib) {
            uibVar = (uib) zjeVar;
            int i = uibVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                uibVar.k = i - Integer.MIN_VALUE;
            } else {
                uibVar = new uib(this, zjeVar);
            }
        } else {
            uibVar = new uib(this, zjeVar);
        }
        Object objB = uibVar.i;
        wne wneVar = wne.f39444a;
        int i2 = uibVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                if (!z) {
                    return "";
                }
                e0g0 e0g0Var = j0g0.b;
                ahu ahuVar = this.y;
                uibVar.k = 1;
                objB = ahuVar.b(bm5.f2822a, uibVar);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
            }
            g0g0Var = ((ql5) objB).g;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? "" : g0g0Var;
    }

    public final void O(Throwable th) {
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
            } while (!p7m0Var.m(value, kib.a((kib) value, false, false, vhb.b, false, 58)));
            return;
        }
        if (((kib) D()).b) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, kib.a((kib) value3, false, false, vhb.b, false, 58)));
            return;
        }
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value2 = p7m0Var3.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value2, kib.a((kib) value2, false, false, vhb.d, false, 56)));
    }

    public final void P() {
        Object value;
        bby bbyVar = this.A;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, kib.a((kib) value, true, false, vhb.f37421a, false, 58)));
            this.A = sac.V(jiu0.a(this), new sib(this, (byte) 0), null, this.p.b, new vib(this, null, b), 10);
        }
    }

    @Override // a.diu0
    public final void v() {
        c4m0 c4m0Var = this.z;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.B;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        c4m0 c4m0Var3 = this.C;
        if (c4m0Var3 != null) {
            c4m0Var3.cancel(null);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        kib kibVar;
        vhb vhbVar;
        vhb vhbVar2;
        shb shbVar = (shb) obj;
        shbVar.getClass();
        super.x(shbVar);
        if (shbVar instanceof nhb) {
            nhb nhbVar = (nhb) shbVar;
            if (nhbVar.equals(mhb.f21782a)) {
                if (((kib) D()).d && ((kib) D()).b) {
                    P();
                    return;
                }
                return;
            }
            boolean zEquals = nhbVar.equals(khb.f18282a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (zEquals) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value4 = p7m0Var.getValue();
                    value4.getClass();
                    kibVar = (kib) value4;
                    oyg0Var.getClass();
                    vhbVar = kibVar.c;
                    vhbVar2 = vhb.f37421a;
                } while (!p7m0Var.m(value4, vhbVar != vhbVar2 ? kib.a(kibVar, false, false, null, false, 62) : kib.a(kibVar, false, true, vhbVar2, false, 48)));
                return;
            }
            if (nhbVar.equals(lhb.f20046a)) {
                bby bbyVar = this.A;
                if (bbyVar != null) {
                    e3c.n(bbyVar);
                    return;
                }
                return;
            }
            if (nhbVar.equals(ghb.f11289a)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, kib.a((kib) value3, false, false, vhb.d, false, 56)));
                return;
            }
            if (nhbVar.equals(ihb.f14771a)) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value2, kib.a((kib) value2, false, false, vhb.b, false, 58)));
                return;
            }
            if (!nhbVar.equals(jhb.f16518a)) {
                if (nhbVar.equals(hhb.f13054a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value = p7m0Var4.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value, kib.a((kib) value, false, false, vhb.c, false, 58)));
            return;
        }
        if (!(shbVar instanceof rhb)) {
            t9f.b();
            return;
        }
        rhb rhbVar = (rhb) shbVar;
        if (!rhbVar.equals(ohb.f25257a)) {
            if (rhbVar.equals(qhb.f28728a)) {
                if (((kib) D()).b) {
                    P();
                    return;
                }
                return;
            } else {
                if (!(rhbVar instanceof phb)) {
                    t9f.b();
                    return;
                }
                String str = ((phb) rhbVar).f26987a;
                if (str.length() == 0) {
                    return;
                }
                G(new iib(this.u.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0)).concat(str)));
                return;
            }
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
