package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hq50;", "La/yx5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hq50 extends yx5 {
    public fiu0 K1;
    public final a8z L1;
    public final zz2 M1;
    public final phf0 N1;
    public final phf0 O1;
    public final boolean P1;
    public final s0r Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(hq50.class, "bannerType", "getBannerType()I", 0), new ez40(hq50.class, "bundleTitle", "getBundleTitle()Ljava/lang/String;", 0), new ez40(hq50.class, "bundleCode", "getBundleCode()Ljava/lang/String;", 0), new j0d0(hq50.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentComposeBinding;", 0)};
    public static final xuz R1 = new xuz();

    public hq50() {
        super(R.layout.fragment_compose);
        this.L1 = xbc.b0(this, sre0.f32672a.b(sq50.class), new eq50(this, (byte) 0));
        this.M1 = new zz2("ID");
        this.N1 = new phf0("BANNER_TITLE");
        this.O1 = new phf0("BANNER_CODE");
        this.P1 = true;
        this.Q1 = ltt0.o(this, fq50.f9957a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0q n0qVar = o7k0.c;
        Object objN = this.Q1.n(S1[3], this);
        objN.getClass();
        b1j.t(((ezq) objN).b, new ugd(1496548548, true, new ba30(this, n0qVar, (byte) 23)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kt50.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kt50 kt50Var = (kt50) (ze3Var instanceof kt50 ? ze3Var : null);
            if (kt50Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                int iIntValue = this.M1.n(this, iiyVarArr[0]).intValue();
                cl5 cl5Var = mvc.b;
                String strN = this.O1.n(this, iiyVarArr[2]);
                cl5Var.getClass();
                ws5 ws5Var = new ws5(iIntValue, cl5.r(strN));
                i1w0VarF.getClass();
                iw20 iw20Var = new iw20(ws5Var);
                ((h6i) kt50Var.f18847a.f24171a).c();
                m1e m1eVar = kt50Var.f;
                qu quVar = kt50Var.b;
                zrt zrtVar = kt50Var.c;
                yo4 yo4Var = kt50Var.d;
                x20 x20Var = kt50Var.e;
                duj dujVar = kt50Var.g;
                wv70 wv70Var = kt50Var.h;
                cad cadVar = kt50Var.i;
                sa10 sa10Var = kt50Var.j;
                wdk0 wdk0Var = kt50Var.k;
                lyt lytVar = kt50Var.l;
                pru pruVar = kt50Var.m;
                pyg pygVar = kt50Var.n;
                nyt nytVar = kt50Var.o;
                dst dstVar = kt50Var.p;
                ctf0 ctf0Var = kt50Var.q;
                fsd fsdVar = kt50Var.r;
                bzt bztVar = kt50Var.s;
                m1eVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                fsdVar.getClass();
                pygVar.getClass();
                gbi gbiVar = new gbi(iw20Var, cadVar, m1eVar, quVar, zrtVar, yo4Var, x20Var, i1w0VarF, dujVar, wv70Var, sa10Var, wdk0Var, lytVar, pruVar, nytVar, dstVar, ctf0Var, bztVar);
                iyk iykVar = new iyk(2);
                iykVar.b(uw50.class, (gji) gbiVar.r);
                iykVar.b(sq50.class, (gji) gbiVar.s);
                this.K1 = new fiu0(iykVar.a());
                return;
            }
        }
        jf4.n(b1j.i(kt50.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }
}
