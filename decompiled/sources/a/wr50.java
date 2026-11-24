package a;

import android.content.ComponentCallbacks2;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wr50;", "La/yx5;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wr50 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final zz2 N1;
    public final cgx0 O1;
    public final boolean P1;
    public final s0r Q1;
    public final n0o0 R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(wr50.class, "bannerId", "getBannerId()I", 0), new ez40(wr50.class, "fromDeepLink", "getFromDeepLink()Z", 0), new j0d0(wr50.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentNewsCatalogBinding;", 0)};
    public static final wsz S1 = new wsz();

    public wr50() {
        super(R.layout.fragment_news_catalog);
        this.K1 = hnm0.f13359a;
        tr50 tr50Var = new tr50(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new ej50(new ej50(this, (byte) 2), (byte) 3));
        this.M1 = agc.G(this, sre0.f32672a.b(ut50.class), new y620(a8zVarA, (byte) 22), new y620(a8zVarA, (byte) 23), tr50Var);
        this.N1 = new zz2("ID", 0);
        this.O1 = new cgx0("FROM_DEEP_LINK", false);
        this.P1 = true;
        this.Q1 = ltt0.o(this, ur50.f36148a);
        this.R1 = maz.b(new tr50(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().d.b(new tr50(this, (byte) 2));
        RecyclerView recyclerView = G0().b;
        uwk uwkVar = new uwk(recyclerView.getContext(), 1);
        Drawable drawableU = epv0.U(R.drawable.item_news_divider, recyclerView.getContext());
        if (drawableU != null) {
            uwkVar.f36397a = drawableU;
        }
        recyclerView.m(uwkVar);
        vvw.o(recyclerView, true, 1);
        recyclerView.setLayoutManager(new LinearLayoutManager(B(), 1, false));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xr50.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xr50 xr50Var = (xr50) (ze3Var instanceof xr50 ? ze3Var : null);
            if (xr50Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                iiy iiyVar = iiyVarArr[0];
                zz2 zz2Var = this.N1;
                this.L1 = xr50Var.a(zz2Var.n(this, iiyVar).intValue(), i1w0VarF, this.O1.n(this, iiyVarArr[1]).booleanValue()).x();
                zz2Var.I(this, iiyVarArr[0], 0);
                return;
            }
        }
        jf4.n(b1j.i(xr50.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.M1;
        xae0 xae0VarN = vtb.N(((ut50) kiu0Var.getValue()).u);
        yje yjeVar = null;
        vr50 vr50Var = new vr50(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hk40(xae0VarN, clzVarW, vr50Var, (yje) null), 3);
        ol60 ol60Var = ((ut50) kiu0Var.getValue()).t;
        vr50 vr50Var2 = new vr50(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new hk40(ol60Var, clzVarW2, vr50Var2, (yje) null), 3);
    }

    public final d2r G0() {
        Object objN = this.Q1.n(U1[2], this);
        objN.getClass();
        return (d2r) objN;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.P1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
