package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class me6 extends w46 {
    public final p7m0 A;
    public final p7m0 B;
    public final p7m0 C;
    public final p7m0 D;
    public final c4m0 E;
    public final n0o0 F;
    public int b;
    public final iqt c;
    public final ipc d;
    public final khf0 e;
    public final zlt0 f;
    public final mne g;
    public final duj h;
    public final dgu i;
    public final hst j;
    public final hsj k;
    public final rq l;
    public final tqc m;
    public final ctf0 n;
    public final j9c o;
    public final lsn p;
    public final lef0 q;
    public final pv00 r;
    public final nmo s;
    public final phf0 t;
    public final tqc u;
    public final hru v;
    public final p7m0 w;
    public final p7m0 x;
    public final p7m0 y;
    public final p7m0 z;

    public me6(int i, iqt iqtVar, ipc ipcVar, khf0 khf0Var, zlt0 zlt0Var, mne mneVar, duj dujVar, dgu dguVar, hst hstVar, hsj hsjVar, rq rqVar, tqc tqcVar, ctf0 ctf0Var, j9c j9cVar, lsn lsnVar, lef0 lef0Var, pv00 pv00Var, nmo nmoVar, phf0 phf0Var, tqc tqcVar2, j9c j9cVar2, hru hruVar) {
        ctf0Var.getClass();
        this.b = i;
        this.c = iqtVar;
        this.d = ipcVar;
        this.e = khf0Var;
        this.f = zlt0Var;
        this.g = mneVar;
        this.h = dujVar;
        this.i = dguVar;
        this.j = hstVar;
        this.k = hsjVar;
        this.l = rqVar;
        this.m = tqcVar;
        this.n = ctf0Var;
        this.o = j9cVar;
        this.p = lsnVar;
        this.q = lef0Var;
        this.r = pv00Var;
        this.s = nmoVar;
        this.t = phf0Var;
        this.u = tqcVar2;
        this.v = hruVar;
        this.w = q7m0.a(new de6(false, true));
        this.x = q7m0.a(Boolean.TRUE);
        this.y = q7m0.a(ae6.f712a);
        this.z = q7m0.a(new zd6("", "", false));
        this.A = q7m0.a(new ee6("", false, false));
        this.B = q7m0.a("");
        this.C = q7m0.a(Boolean.valueOf(tqcVar2.c(this.b)));
        yje yjeVar = null;
        this.D = q7m0.a(null);
        this.F = maz.b(new xd6(this, (byte) 2));
        A("");
        this.E = sac.T(new fnq(dtb.U(dtb.z(j9cVar2.b(), tqcVar.a(0) == 0.0d ? 1 : 0), 1), new wa(this, yjeVar, (byte) 20), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), je6.h);
        y();
    }

    public final void A(String str) {
        Object next;
        Iterator it = this.j.f13600a.n().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hf6) next).f12958a != this.b);
        hf6 hf6Var = (hf6) next;
        if (hf6Var != null) {
            be6 be6Var = new be6(D(hf6Var.b), str, false, false);
            p7m0 p7m0Var = this.y;
            p7m0Var.getClass();
            p7m0Var.o(null, be6Var);
        }
    }

    public final zd6 B(String str, q88 q88Var, boolean z) {
        ay3 ay3VarJ = this.k.j(q88Var.f28287a, str, q88Var.f, q88Var.c, q88Var.d, z, this.u.c(this.b));
        boolean z2 = (ay3VarJ instanceof s78) || (ay3VarJ instanceof x78);
        String strX0 = b34.x0(ay3VarJ, this.n);
        String str2 = !z2 ? strX0 : "";
        if (!z2) {
            strX0 = "";
        }
        return new zd6(str2, strX0, z);
    }

    public final String C() {
        Object next;
        Iterator it = ((ArrayList) this.p.e()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((q88) next).f28287a != this.b);
        q88 q88Var = (q88) next;
        if (q88Var == null || !((Boolean) this.F.getValue()).booleanValue() || this.o.a() != q4f.m) {
            return "";
        }
        pn40 pn40Var = pn40.f27267a;
        return pn40.c(q88Var.d, p3u0.c);
    }

    public final String D(int i) {
        q4f q4fVarA = this.o.a();
        q4f q4fVar = q4f.m;
        ctf0 ctf0Var = this.n;
        return String.format(q4fVarA == q4fVar ? ctf0Var.f(R.string.multisingle_block_title_v2, new Object[0]) : ctf0Var.f(R.string.block_v2, new Object[0]), Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
    }

    public final void E(boolean z) {
        yje yjeVar;
        Object next;
        Double dI;
        v3c.N(this.E);
        Iterator it = ((ArrayList) this.p.e()).iterator();
        do {
            yjeVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((q88) next).f28287a != this.b);
        q88 q88Var = (q88) next;
        if (q88Var != null) {
            int i = q88Var.b;
            String strA = q88Var.g;
            boolean zW = StringsKt.W(strA);
            p7m0 p7m0Var = this.y;
            mne mneVar = this.g;
            char c = 1;
            char c2 = 1;
            byte b = 0;
            if (!zW && (dI = kotlin.text.b.i(strA)) != null && dI.doubleValue() > 0.0d) {
                sac.V(jiu0.a(this), ke6.f18138a, null, mneVar.f22085a, new ie6(this, q88Var, yjeVar, c2 == true ? 1 : 0), 10);
                pn40 pn40Var = pn40.f27267a;
                strA = pn40.c(Double.parseDouble(strA), p3u0.c);
            } else if (kotlin.text.b.i(strA) == null) {
                sac.V(jiu0.a(this), ke6.f18138a, null, mneVar.f22085a, new ie6(this, q88Var, yjeVar, c == true ? 1 : 0), 10);
            } else if (z) {
                sac.V(jiu0.a(this), he6.f12905a, null, mneVar.f22085a, new ie6(this, q88Var, yjeVar, b), 10);
                ce6 ce6Var = (ce6) p7m0Var.getValue();
                strA = ce6Var instanceof be6 ? ((be6) ce6Var).d : "";
            } else {
                sac.V(jiu0.a(this), ge6.f11137a, null, mneVar.f22085a, new ic1((diu0) this, yjeVar, (byte) 8), 10);
                strA = this.n.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
            }
            List listN = this.j.f13600a.n();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN) {
                if (!((hf6) obj).c.isEmpty()) {
                    arrayList.add(obj);
                }
            }
            be6 be6Var = new be6(D(i), strA, i != 1, i != arrayList.size());
            p7m0Var.getClass();
            p7m0Var.o(null, be6Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a4 -> B:21:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object F(java.lang.String r24, a.zje r25) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.me6.F(java.lang.String, a.zje):java.lang.Object");
    }

    public final void w() {
        sac.V(jiu0.a(this), fe6.f9390a, null, this.g.b, new xw5(this, null, (byte) 7), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    public final void x() {
        String strA;
        if (this.o.a() == q4f.m) {
            if (((ni9) this.v.f13549a).a(this.b).t) {
                strA = this.n.b.a(R.string.factor_2x, Arrays.copyOf(new Object[0], 0));
            } else {
                strA = null;
            }
        } else {
            strA = null;
        }
        this.D.n(strA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    public final void y() {
        boolean z;
        c4m0 c4m0Var = this.E;
        if (c4m0Var != null) {
            z = c4m0Var.isActive();
        }
        twn.A(this.o.a() != q4f.h ? z : false, this.x, null);
    }

    public final void z(Function0 function0) {
        if (this.c.f15225a.a()) {
            sac.V(jiu0.a(this), new yd6(this, (byte) 1), null, this.g.b, new ex1((Object) this, (Object) function0, (yje) null, (byte) 9), 10);
        }
    }
}
