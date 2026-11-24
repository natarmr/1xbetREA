package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class dtc0 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public bby A;
    public c4m0 B;
    public bby C;
    public final rl70 o;
    public final ctf0 p;
    public final m1e q;
    public final nou r;
    public final qgd s;
    public final j910 t;
    public final b4j u;
    public final x20 v;
    public final mne w;
    public final oeg0 x;
    public final duj y;
    public List z;

    public dtc0(vzg0 vzg0Var, rl70 rl70Var, ctf0 ctf0Var, m1e m1eVar, nou nouVar, qgd qgdVar, j910 j910Var, b4j b4jVar, x20 x20Var, g2v g2vVar, mne mneVar, oeg0 oeg0Var, duj dujVar, pru pruVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        oeg0Var.getClass();
        ck60 ck60Var = new ck60(pruVar, ctf0Var, g2vVar, (byte) 12);
        iv80 iv80Var = new iv80(ctf0Var, (byte) 10);
        rwj rwjVar = mneVar.f22085a;
        super(null, ck60Var, iv80Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = rl70Var;
        this.p = ctf0Var;
        this.q = m1eVar;
        this.r = nouVar;
        this.s = qgdVar;
        this.t = j910Var;
        this.u = b4jVar;
        this.v = x20Var;
        this.w = mneVar;
        this.x = oeg0Var;
        this.y = dujVar;
        this.z = iun.f15405a;
    }

    public final void M() {
        bby bbyVar = this.A;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.A = sac.i0(jiu0.a(this), "PromoShopViewModel.loadPage", 3, 0L, null, q3d.j(Integer.valueOf(i2o.NotFound.getErrorCode()), Integer.valueOf(i2o.Forbidden.getErrorCode()), Integer.valueOf(i2o.BadRequest.getErrorCode()), Integer.valueOf(i2o.l1.getErrorCode()), Integer.valueOf(i2o.TooManyRequests.getErrorCode())), new z8b0(this, null, (byte) 3), null, this.w.b, new ysc0(this, (byte) 0), null, 588);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(zje zjeVar) {
        ctc0 ctc0Var;
        Object value;
        if (zjeVar instanceof ctc0) {
            ctc0Var = (ctc0) zjeVar;
            int i = ctc0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ctc0Var.k = i - Integer.MIN_VALUE;
            } else {
                ctc0Var = new ctc0(this, zjeVar);
            }
        } else {
            ctc0Var = new ctc0(this, zjeVar);
        }
        Object objA = ctc0Var.i;
        Object obj = wne.f39444a;
        int i2 = ctc0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ctc0Var.k = 1;
            objA = this.r.a(tl5.c, ctc0Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        int i3 = ((ql5) objA).h;
        ctf0 ctf0Var = this.p;
        ctf0Var.getClass();
        String strF = ctf0Var.f(R.string.promo_bouns_pts_v2, String.valueOf(i3));
        G(new psc0(!((rrc0) D()).f ? strF : ""));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, rrc0.a((rrc0) value, null, i3, false, false, strF, false, false, false, 65469)));
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object next;
        cpc0 cpc0Var = (cpc0) obj;
        cpc0Var.getClass();
        super.x(cpc0Var);
        boolean z = cpc0Var instanceof apc0;
        byte b = 1;
        mne mneVar = this.w;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (z) {
            if (((rrc0) D()).j || !(((rrc0) D()).h || ((rrc0) D()).i)) {
                sac.V(jiu0.a(this), new ysc0(this, b), null, mneVar.b, new zsc0(this, objArr2 == true ? 1 : 0, b), 10);
                return;
            } else {
                M();
                return;
            }
        }
        if (cpc0Var instanceof bpc0) {
            v3c.N(this.A);
            v3c.N(this.C);
            return;
        }
        if (cpc0Var instanceof zoc0) {
            M();
            return;
        }
        boolean z2 = cpc0Var instanceof xoc0;
        byte b2 = 2;
        byte b3 = 0;
        oeg0 oeg0Var = this.x;
        x20 x20Var = this.v;
        b4j b4jVar = this.u;
        if (!z2) {
            if (cpc0Var instanceof woc0) {
                ssc0 ssc0Var = ((woc0) cpc0Var).f39489a;
                xi70 xi70Var = src0.f32669a;
                long j = ssc0Var.f32719a;
                xi70Var.getClass();
                String strA = xi70.e(j).a();
                b4jVar.getClass();
                b4jVar.f1961a.a("promo_shop_all_call", wp20.b(new Pair("category_id", strA)));
                x20Var.getClass();
                x20Var.f40143a.a(cui0.b(new j1p(strA, (byte) 0)), 3306L);
                oeg0Var.c().d(new oac0(this, ssc0Var, (byte) 9));
                return;
            }
            if (cpc0Var instanceof yoc0) {
                v3c.N(this.C);
                this.C = sac.V(jiu0.a(this), new ysc0(this, b2), new ssa0(this, (byte) 27), mneVar.b, new zsc0(this, objArr == true ? 1 : 0, b3), 8);
                return;
            }
            if (!(cpc0Var instanceof voc0)) {
                if (cpc0Var instanceof uoc0) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            boolean z3 = ((voc0) cpc0Var).f37759a;
            G(new psc0(!z3 ? ((rrc0) D()).g : ""));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, rrc0.a((rrc0) value, null, 0, false, z3, null, false, false, false, 65503)));
            return;
        }
        long j2 = ((xoc0) cpc0Var).f41211a;
        List list = this.z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((asc0) it.next()).c);
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((vrc0) next).getId() != j2);
        vrc0 vrc0Var = (vrc0) next;
        if (vrc0Var != null) {
            yrc0 yrc0VarE0 = s0x.e0(vrc0Var);
            List list2 = ((rrc0) D()).f30977a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                w3d.u(arrayList2, ((asc0) it3.next()).c);
            }
            for (Object obj3 : arrayList2) {
                if (((vrc0) obj3).getId() == yrc0VarE0.getId()) {
                    obj2 = obj3;
                    break;
                }
            }
            vrc0 vrc0Var2 = (vrc0) obj2;
            if (vrc0Var2 == null) {
                return;
            }
            b4jVar.f1961a.a("promo_shop_call", xp20.f(new Pair("promo_id", Long.valueOf(vrc0Var2.getId())), new Pair("screen", "promo_shop")));
            x20Var.f40143a.a(tx3.l0(new k1p[]{new i1p((int) vrc0Var2.getId(), (byte) 2), new j1p("promo_shop", (byte) 0)}), 3305L);
            oeg0Var.c().d(new oac0(this, vrc0Var2, (byte) 10));
        }
    }
}
