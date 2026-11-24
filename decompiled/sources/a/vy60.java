package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class vy60 extends i3t0 {
    public final jtj o;
    public final b8u p;
    public final x4u q;
    public final qxg0 r;
    public final lbu s;
    public final hnu t;
    public final duj u;
    public final ctf0 v;
    public final gw60 w;
    public final hs60 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy60(jtj jtjVar, b8u b8uVar, x4u x4uVar, lqc lqcVar, qxg0 qxg0Var, lbu lbuVar, hnu hnuVar, mne mneVar, duj dujVar, ctf0 ctf0Var, gw60 gw60Var, hs60 hs60Var, pru pruVar) {
        super(null, new b6u(pruVar, (byte) 26), new v510(ctf0Var, (byte) 24), cvm0.p(mneVar.c, mneVar.b), null);
        ctf0Var.getClass();
        this.o = jtjVar;
        this.p = b8uVar;
        this.q = x4uVar;
        this.r = qxg0Var;
        this.s = lbuVar;
        this.t = hnuVar;
        this.u = dujVar;
        this.v = ctf0Var;
        this.w = gw60Var;
        this.x = hs60Var;
        sac.V(jiu0.a(this), new cd60((Object) this, (byte) 10), null, null, new xn2((Object) this, (yje) null, (byte) 4), 14);
    }

    public static ArrayList N(int i, List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lxl lxlVar = (lxl) it.next();
            arrayList.add(lxl.a(lxlVar, ((int) lxlVar.f20819a) == i ? uxl.b : uxl.f36445a));
        }
        return arrayList;
    }

    public final void M(int i, String str) {
        String str2 = ((ty60) D()).d.f36179a;
        String str3 = ((ty60) D()).e.f21187a;
        y1p y1pVar = y1p.MAIN;
        gw60 gw60Var = this.w;
        gw60Var.getClass();
        gw60Var.f12011a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(str, (byte) 0), new j1p(str2, (byte) 1), new j1p(str3, (byte) 2)}), 11289L);
        hs60 hs60Var = this.x;
        hs60Var.getClass();
        hs60Var.f13566a.a("games_filters_click", xp20.f(new Pair("action", str), new Pair(Payload.TYPE, String.valueOf(i)), new Pair("option", str2), new Pair("point", str3)));
    }

    public final void O() {
        int i;
        Object value;
        qg40 qg40Var = ((ty60) D()).e.c;
        int i2 = qg40Var.f28665a;
        int i3 = ((ty60) D()).c;
        List list = ((ty60) D()).g;
        ArrayList<pbv> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i3 != 0 ? ((pbv) next).b.contains(Integer.valueOf(i3)) : true) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            int i4 = 0;
            for (pbv pbvVar : arrayList) {
                int i5 = qg40Var.b;
                boolean z = i2 == 0 && i5 == Integer.MAX_VALUE;
                Double dI = kotlin.text.b.i(pbvVar.f);
                if (dI != null) {
                    double dDoubleValue = dI.doubleValue();
                    z = dDoubleValue >= ((double) i2) && dDoubleValue <= ((double) i5);
                }
                if (z && (i4 = i4 + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
            i = i4;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, ty60.a((ty60) value, null, 0, null, null, i, null, 95)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        ly60 ly60Var = (ly60) obj;
        ly60Var.getClass();
        super.x(ly60Var);
        boolean z = ly60Var instanceof gy60;
        sy60 sy60Var = sy60.f33013a;
        if (z) {
            G(sy60Var);
            return;
        }
        boolean z2 = ly60Var instanceof jy60;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z2) {
            int i = ((jy60) ly60Var).f17346a;
            if (((ty60) D()).c == i) {
                return;
            }
            ArrayList arrayListN = N(i, ((ty60) D()).b);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, ty60.a((ty60) value4, arrayListN, i, null, null, 0, null, 121)));
            O();
            return;
        }
        if (ly60Var instanceof ky60) {
            urs ursVar = ((ky60) ly60Var).f19094a;
            if (((ty60) D()).d == ursVar) {
                return;
            }
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, ty60.a((ty60) value3, null, 0, ursVar, null, 0, null, 119)));
            O();
            return;
        }
        if (ly60Var instanceof iy60) {
            m4s m4sVar = ((iy60) ly60Var).f15576a;
            if (((ty60) D()).e == m4sVar) {
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, ty60.a((ty60) value2, null, 0, null, m4sVar, 0, null, 111)));
            O();
            return;
        }
        if (ly60Var instanceof hy60) {
            M(((ty60) D()).c, "discard");
            ArrayList arrayListN2 = N(0, ((ty60) D()).b);
            int size = ((ty60) D()).g.size();
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value = p7m0Var4.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value, ty60.a((ty60) value, arrayListN2, 0, urs.BY_POPULAR, m4s.ANY, size, null, 65)));
            return;
        }
        if (!(ly60Var instanceof fy60)) {
            if (ly60Var instanceof ey60) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        int i2 = ((ty60) D()).c;
        M(i2, "show");
        byte b = ((ty60) D()).d.c;
        qg40 qg40Var = ((ty60) D()).e.c;
        qxg0 qxg0Var = this.r;
        qxg0Var.getClass();
        my60 my60Var = (my60) qxg0Var.f29484a.f36498a;
        my60Var.getClass();
        my60Var.f22591a = b;
        my60Var.b = qg40Var;
        my60Var.c = i2;
        G(sy60Var);
    }
}
