package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/p170;", "La/yx5;", "<init>", "()V", "a/xuz", "promo"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p170 extends yx5 {
    public final s0r K1;
    public rmi L1;
    public ynb M1;
    public final kiu0 N1;
    public final a8z O1;
    public final phf0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(p170.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(p170.class, "umResultKey", "getUmResultKey()Ljava/lang/String;", 0)};
    public static final xuz Q1 = new xuz();

    public p170() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, o170.f24466a);
        a8z a8zVarA = maz.a(wez.b, new ej50(new n170(this, (byte) 0), (byte) 23));
        tre0 tre0Var = sre0.f32672a;
        this.N1 = agc.G(this, tre0Var.b(k370.class), new co60(a8zVarA, (byte) 18), new co60(a8zVarA, (byte) 19), new ha30(this, a8zVarA, (byte) 16));
        this.O1 = xbc.a0(this, tre0Var.b(n270.class), null, new n170(this, (byte) 1), 14);
        this.P1 = new phf0("OneXGamesPromo.BUNDLE_UM_RESULT_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        C().u0("SELECT_BALANCE_REQUEST_KEY", this, new ex60(this, (byte) 2));
        o2t.d(F(), this, "", new cd60(this, (byte) 12));
        G0().x(x070.f40058a);
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, qek0.h, new shd((byte) 14), new ugd(-708804101, true, new tx(this, (byte) 28)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(l170.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            l170 l170Var = (l170) (ze3Var instanceof l170 ? ze3Var : null);
            if (l170Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                j5t j5tVar = l170Var.f19236a;
                g7d g7dVar = l170Var.b;
                yvs yvsVar = l170Var.c;
                knf0 knf0Var = l170Var.d;
                btt0 btt0Var = l170Var.e;
                p2t p2tVar = l170Var.f;
                gst0 gst0Var = l170Var.g;
                pbt pbtVar = l170Var.h;
                ls lsVar = l170Var.i;
                scu scuVar = l170Var.j;
                ntu ntuVar = l170Var.k;
                bzt bztVar = l170Var.l;
                yoc yocVar = l170Var.m;
                yoc yocVar2 = l170Var.n;
                lbu lbuVar = l170Var.o;
                kt2 kt2Var = l170Var.p;
                x20 x20Var = l170Var.q;
                l7k l7kVar = l170Var.r;
                gg5 gg5Var = l170Var.s;
                uf3 uf3Var = l170Var.t;
                v88 v88Var = l170Var.u;
                m1e m1eVar = l170Var.v;
                r2t r2tVar = l170Var.w;
                g2v g2vVar = l170Var.x;
                gii0 gii0Var = l170Var.y;
                duj dujVar = l170Var.z;
                ctf0 ctf0Var = l170Var.A;
                ouu ouuVar = l170Var.B;
                oeg0 oeg0Var = l170Var.C;
                wsf0 wsf0Var = l170Var.D;
                peg0 peg0Var = l170Var.E;
                cad cadVar = l170Var.F;
                iw20 iw20Var = l170Var.G;
                cmt cmtVar = l170Var.H;
                j5tVar.getClass();
                g7dVar.getClass();
                yvsVar.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                p2tVar.getClass();
                gst0Var.getClass();
                pbtVar.getClass();
                kt2Var.getClass();
                m1eVar.getClass();
                r2tVar.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                hbi hbiVar = new hbi();
                hbiVar.b = pbtVar;
                hbiVar.c = gst0Var;
                hbiVar.d = ntuVar;
                hbiVar.e = scuVar;
                hbiVar.f = wsf0Var;
                hbiVar.g = lbuVar;
                hbiVar.h = yocVar;
                hbiVar.i = yocVar2;
                hbiVar.j = lsVar;
                hbiVar.k = iw20Var;
                hbiVar.l = bztVar;
                hbiVar.m = kt2Var;
                hbiVar.n = x20Var;
                hbiVar.o = l7kVar;
                hbiVar.p = cmtVar;
                hbiVar.q = gg5Var;
                hbiVar.r = uf3Var;
                hbiVar.s = i1w0VarF;
                hbiVar.t = ouuVar;
                hbiVar.u = dujVar;
                hbiVar.v = ctf0Var;
                hbiVar.w = g2vVar;
                hbiVar.x = m1eVar;
                hbiVar.y = cadVar;
                hbiVar.z = oeg0Var;
                hbiVar.A = v88Var;
                hbiVar.f12771a = n0k0.a(new rki(hbiVar, (byte) 27));
                this.L1 = (rmi) ((n5d0) hbiVar.f12771a).get();
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.M1 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(l170.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarW = ((k370) this.N1.getValue()).w();
        nf60 nf60Var = new nf60(this, null, (byte) 11);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60((i89) gmqVarW, clzVarW, nf60Var, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getO1() {
        return true;
    }
}
