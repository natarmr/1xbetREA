package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/urr0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class urr0 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(urr0.class, "binding", "getBinding()Lorg/xplatform/toto_jackpot/impl/databinding/FragmentTotoJackpotDsBinding;", 0)};
    public static final j6m0 O1 = new j6m0((byte) 25);

    public urr0() {
        super(R.layout.fragment_toto_jackpot_ds);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, bp3Var, bp3Var);
        this.L1 = ltt0.o(this, trr0.f34432a);
        this.N1 = xbc.b0(this, sre0.f32672a.b(yrr0.class), new qir0(this, (byte) 4));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        pfx pfxVarI;
        iiy[] iiyVarArr = P1;
        iiy iiyVar = iiyVarArr[0];
        s0r s0rVar = this.L1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ComposeView composeView = ((e6r) objN).f7300a;
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(composeView);
        int i = (xiv0VarA == null || (pfxVarI = xiv0VarA.f40966a.i(1)) == null) ? 0 : pfxVarI.b;
        Object objN2 = s0rVar.n(iiyVarArr[0], this);
        objN2.getClass();
        pkd.i(((e6r) objN2).f7300a, null, new ugd(337338286, true, new nb50(this, i, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vrr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vrr0 vrr0Var = (vrr0) (ze3Var instanceof vrr0 ? ze3Var : null);
            if (vrr0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                sa10 sa10Var = vrr0Var.b;
                m1e m1eVar = vrr0Var.c;
                duj dujVar = vrr0Var.d;
                wsf0 wsf0Var = vrr0Var.e;
                pru pruVar = vrr0Var.f;
                wdk0 wdk0Var = vrr0Var.g;
                ii iiVar = vrr0Var.h;
                cad cadVar = vrr0Var.f37916a;
                ctf0 ctf0Var = vrr0Var.i;
                csr0 csr0Var = vrr0Var.j;
                knf0 knf0Var = vrr0Var.k;
                gii0 gii0Var = vrr0Var.l;
                btt0 btt0Var = vrr0Var.m;
                hqr0 hqr0Var = vrr0Var.n;
                tgk tgkVar = vrr0Var.o;
                m1eVar.getClass();
                wdk0Var.getClass();
                iiVar.getClass();
                ctf0Var.getClass();
                csr0Var.getClass();
                hqr0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                tgkVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(yrr0.class, (yxi) new v7i(wsf0Var, cadVar, sa10Var, m1eVar, dujVar, pruVar, wdk0Var, i1w0VarF, iiVar, ctf0Var, csr0Var, hqr0Var, knf0Var, gii0Var, btt0Var, tgkVar).o));
                return;
            }
        }
        jf4.n(b1j.i(vrr0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
