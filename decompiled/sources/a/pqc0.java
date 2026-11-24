package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/pqc0;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pqc0 extends yx5 {
    public fqi K1;
    public ii L1;
    public final boolean M1;
    public final a8z N1;
    public final s0r O1;
    public final yzn0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(pqc0.class, "binding", "getBinding()Lorg/xplatform/promo/impl/databinding/FragmentPromoShopDetailBinding;", 0), new ez40(pqc0.class, "promoShopItem", "getPromoShopItem()Lorg/xplatform/promo/impl/promocodes/domain/models/PromoShopItemModel;", 0)};
    public static final mi70 Q1 = new mi70();

    public pqc0() {
        super(R.layout.fragment_promo_shop_detail);
        this.M1 = true;
        this.N1 = xbc.a0(this, sre0.f32672a.b(qrc0.class), null, new nqc0(this, (byte) 0), 14);
        this.O1 = ltt0.o(this, oqc0.f25682a);
        this.P1 = new yzn0("EXTRA_PROMO_SHOP");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(R1[0], this);
        objN.getClass();
        pkd.h(((g3r) objN).b, new owp0(this), null, new ugd(315268286, true, new lma0(this, (byte) 29)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qqc0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qqc0 qqc0Var = (qqc0) (ze3Var instanceof qqc0 ? ze3Var : null);
            if (qqc0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                vrc0 vrc0Var = (vrc0) this.P1.n(this, R1[1]);
                i1w0VarF.getClass();
                cad cadVar = qqc0Var.f29161a;
                wsf0 wsf0Var = qqc0Var.b;
                fsd fsdVar = qqc0Var.c;
                xyt xytVar = qqc0Var.d;
                gst0 gst0Var = qqc0Var.e;
                ntu ntuVar = qqc0Var.f;
                pru pruVar = qqc0Var.g;
                pbt pbtVar = qqc0Var.h;
                fhj fhjVar = qqc0Var.i;
                b3c0 b3c0Var = qqc0Var.j;
                oeg0 oeg0Var = qqc0Var.k;
                x20 x20Var = qqc0Var.l;
                kt2 kt2Var = qqc0Var.m;
                duj dujVar = qqc0Var.n;
                ii iiVar = qqc0Var.o;
                ctf0 ctf0Var = qqc0Var.p;
                knf0 knf0Var = qqc0Var.q;
                gii0 gii0Var = qqc0Var.r;
                btt0 btt0Var = qqc0Var.s;
                uf3 uf3Var = qqc0Var.t;
                oct octVar = qqc0Var.u;
                m1e m1eVar = qqc0Var.v;
                g2v g2vVar = qqc0Var.w;
                cdu cduVar = qqc0Var.x;
                fsdVar.getClass();
                gst0Var.getClass();
                pbtVar.getClass();
                b3c0Var.getClass();
                oeg0Var.getClass();
                kt2Var.getClass();
                iiVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                m1eVar.getClass();
                hbi hbiVar = new hbi();
                hbiVar.b = vrc0Var;
                hbiVar.c = pruVar;
                hbiVar.d = wsf0Var;
                hbiVar.h = xytVar;
                hbiVar.i = gst0Var;
                hbiVar.j = knf0Var;
                hbiVar.k = gii0Var;
                hbiVar.l = btt0Var;
                hbiVar.m = ntuVar;
                hbiVar.n = cduVar;
                hbiVar.o = fhjVar;
                hbiVar.p = b3c0Var;
                hbiVar.q = pbtVar;
                hbiVar.r = m1eVar;
                hbiVar.s = cadVar;
                hbiVar.t = oeg0Var;
                hbiVar.u = uf3Var;
                hbiVar.v = octVar;
                hbiVar.w = x20Var;
                hbiVar.x = kt2Var;
                hbiVar.y = g2vVar;
                hbiVar.z = dujVar;
                hbiVar.A = ctf0Var;
                hbiVar.f12771a = mbl.b(new omi(hbiVar, 1, (byte) 23));
                hbiVar.e = mbl.b(new omi(hbiVar, 2, (byte) 23));
                hbiVar.f = mbl.b(new omi(hbiVar, 3, (byte) 23));
                hbiVar.g = n0k0.a(new omi(hbiVar, 0, (byte) 23));
                this.K1 = (fqi) ((n5d0) hbiVar.g).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(qqc0.class, "Cannot create dependency "));
    }

    public final ii G0() {
        ii iiVar = this.L1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }
}
