package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xplatform.cyber.section.api.activeteams.CyberActiveTeamsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class qn extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final CyberActiveTeamsParams o;
    public final hzg p;
    public final cad q;
    public final m1e r;
    public final ih5 s;
    public final zr1 t;
    public c4m0 u;
    public bby v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(CyberActiveTeamsParams cyberActiveTeamsParams, hzg hzgVar, cad cadVar, ctf0 ctf0Var, mne mneVar, m1e m1eVar, g2v g2vVar, ih5 ih5Var, zr1 zr1Var) {
        super(new q8((byte) 8), cvm0.p(mneVar.c, mneVar.f22085a), new on((Object) ctf0Var, (Object) g2vVar, (Object) cyberActiveTeamsParams, (byte) 0), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = cyberActiveTeamsParams;
        this.p = hzgVar;
        this.q = cadVar;
        this.r = m1eVar;
        this.s = ih5Var;
        this.t = zr1Var;
    }

    public final void M() {
        e3c.n(this.u);
        this.u = i3t0.L(this, new fnq(i120.W(this.r.b()), new pa((Object) this, (yje) null, (byte) 4), (byte) 4), null, null, 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        ln lnVar;
        Object value3;
        rm rmVar = (rm) obj;
        rmVar.getClass();
        super.x(rmVar);
        Object obj2 = null;
        if (rmVar instanceof km) {
            km kmVar = (km) rmVar;
            if (kmVar.equals(jm.f16740a)) {
                M();
                return;
            }
            if (!kmVar.equals(im.f15001a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var = this.u;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            bby bbyVar = this.v;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        if (!(rmVar instanceof qm)) {
            t9f.b();
            return;
        }
        qm qmVar = (qm) rmVar;
        boolean zEquals = qmVar.equals(lm.f20271a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        hzg hzgVar = this.p;
        if (zEquals) {
            if (!((ln) D()).c) {
                ((uzg) hzgVar).a();
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, ln.a((ln) value3, false, null, false, "", 3)));
            return;
        }
        if (qmVar.equals(nm.f23748a)) {
            M();
            return;
        }
        if (qmVar.equals(om.f25480a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                lnVar = (ln) value2;
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, ln.a(lnVar, false, null, !lnVar.c, null, 11)));
            return;
        }
        if (qmVar instanceof pm) {
            String str = ((pm) qmVar).f27208a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, ln.a((ln) value, false, null, false, str, 7)));
            return;
        }
        if (!(qmVar instanceof mm)) {
            t9f.b();
            return;
        }
        String str2 = ((mm) qmVar).f22015a;
        j0g0 j0g0Var = ((ln) D()).b;
        if (j0g0Var != null) {
            Object obj3 = j0g0Var.f15681a;
            if (obj3 instanceof g0g0) {
                obj3 = null;
            }
            List list = (List) obj3;
            if (list != null) {
                for (Object obj4 : list) {
                    if (((bm) obj4).b.equals(str2)) {
                        obj2 = obj4;
                        break;
                    }
                }
                bm bmVar = (bm) obj2;
                if (bmVar != null) {
                    List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
                    ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
                    Iterator it = listJ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((yxg) it.next()).f43419a));
                    }
                    CyberActiveTeamsParams cyberActiveTeamsParams = this.o;
                    long j = cyberActiveTeamsParams.f46546a;
                    long j2 = cyberActiveTeamsParams.f46546a;
                    if (arrayList.contains(Long.valueOf(j))) {
                        this.s.p(r1g.CYBERSPORT_ACTIVE_TEAMS, j2);
                        this.t.z(j2, "cyber_active_teams");
                        ((uzg) hzgVar).n(cyberActiveTeamsParams.f46546a, bmVar.f2815a, str2, k1g.OPEN_REGULAR);
                    }
                }
            }
        }
    }
}
