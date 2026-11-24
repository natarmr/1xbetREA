package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dpq0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dpq0 extends yx5 {
    public final hnm0 K1;
    public final s0r L1;
    public final kiu0 M1;
    public final phf0 N1;
    public final phf0 O1;
    public spm0 P1;
    public fiu0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(dpq0.class, "viewBinding", "getViewBinding()Lorg/xplatform/toto_bet/impl/databinding/FragmentTirageCategoryDsBinding;", 0), new ez40(dpq0.class, "totoType", "getTotoType()Ljava/lang/String;", 0), new ez40(dpq0.class, "tirageCategoryResultQualifier", "getTirageCategoryResultQualifier()Ljava/lang/String;", 0)};
    public static final m6m0 R1 = new m6m0((byte) 21);

    public dpq0() {
        super(R.layout.fragment_tirage_category_ds);
        this.K1 = hnm0.f13359a;
        this.L1 = ltt0.o(this, cpq0.f4761a);
        bpq0 bpq0Var = new bpq0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 1), (byte) 2));
        this.M1 = agc.G(this, sre0.f32672a.b(tpq0.class), new r5p0(a8zVarA, (byte) 24), new r5p0(a8zVarA, (byte) 25), bpq0Var);
        this.N1 = new phf0("TOTO_TYPE");
        this.O1 = new phf0("TIRAGE_NUM");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(G0().d, new bpq0(this, (byte) 0));
        TableViewImpl tableViewImpl = G0().e;
        spm0 spm0Var = new spm0(tableViewImpl, true, R.dimen.text_12, (byte) 1);
        spm0Var.m = tableViewImpl;
        G0().e.setAdapter(spm0Var);
        this.P1 = spm0Var;
        knm0.h(G0().e, false);
        knm0.h(G0().c, false);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fpq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fpq0 fpq0Var = (fpq0) (ze3Var instanceof fpq0 ? ze3Var : null);
            if (fpq0Var != null) {
                iiy[] iiyVarArr = S1;
                String strN = this.N1.n(this, iiyVarArr[1]);
                String strN2 = this.O1.n(this, iiyVarArr[2]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                strN2.getClass();
                i1w0VarF.getClass();
                cad cadVar = fpq0Var.f9941a;
                gii0 gii0Var = fpq0Var.b;
                m1e m1eVar = fpq0Var.c;
                g2v g2vVar = fpq0Var.d;
                wsf0 wsf0Var = fpq0Var.g;
                ctf0 ctf0Var = fpq0Var.e;
                duj dujVar = fpq0Var.f;
                knf0 knf0Var = fpq0Var.h;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                this.Q1 = new fiu0(Collections.singletonMap(tpq0.class, (xvi) new daf(cadVar, wsf0Var, i1w0VarF, strN2, strN, gii0Var, g2vVar, m1eVar, ctf0Var, dujVar, knf0Var).m));
                return;
            }
        }
        jf4.n(b1j.i(fpq0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((tpq0) this.M1.getValue()).l;
        ssl0 ssl0Var = new ssl0(this, (yje) null, (byte) 28);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hlq0(p7m0Var, clzVarW, ssl0Var, (yje) null, (byte) 0), 3);
    }

    public final z5r G0() {
        Object objN = this.L1.n(S1[0], this);
        objN.getClass();
        return (z5r) objN;
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().e.getColumnHeaderLayoutManager().g1.clear();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
