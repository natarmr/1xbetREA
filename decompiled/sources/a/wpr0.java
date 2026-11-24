package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wpr0;", "La/yx5;", "<init>", "()V", "a/s9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wpr0 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public ii N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(wpr0.class, "binding", "getBinding()Lorg/xplatform/toto_jackpot/impl/databinding/FragmentTotoJackpotDsBinding;", 0)};
    public static final s9m0 P1 = new s9m0();

    public wpr0() {
        super(R.layout.fragment_toto_jackpot_ds);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, 8);
        this.L1 = ltt0.o(this, vpr0.f37820a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(psr0.class), new upr0(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        pfx pfxVarI;
        ccq0.V(this, "REQUEST_JACKPOT_CLEAR_DIALOG_KEY", new upr0(this, (byte) 1));
        iiy[] iiyVarArr = Q1;
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
        pkd.i(((e6r) objN2).f7300a, null, new ugd(968963783, true, new nb50(this, i, (byte) 23)));
        qcc.X(this, new upr0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(u0y.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            u0y u0yVar = (u0y) (ze3Var instanceof u0y ? ze3Var : null);
            if (u0yVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                sa10 sa10Var = u0yVar.c;
                m1e m1eVar = u0yVar.d;
                gle0 gle0Var = u0yVar.b;
                duj dujVar = u0yVar.e;
                wsf0 wsf0Var = u0yVar.f;
                pru pruVar = u0yVar.g;
                wdk0 wdk0Var = u0yVar.h;
                ii iiVar = u0yVar.i;
                cad cadVar = u0yVar.f34878a;
                ctf0 ctf0Var = u0yVar.j;
                csr0 csr0Var = u0yVar.k;
                knf0 knf0Var = u0yVar.l;
                gii0 gii0Var = u0yVar.m;
                btt0 btt0Var = u0yVar.n;
                hqr0 hqr0Var = u0yVar.o;
                tgk tgkVar = u0yVar.p;
                r9u r9uVar = u0yVar.q;
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
                r9uVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(psr0.class, (tii) new cr(wsf0Var, cadVar, gle0Var, sa10Var, m1eVar, dujVar, pruVar, i1w0VarF, iiVar, ctf0Var, csr0Var, hqr0Var, knf0Var, gii0Var, btt0Var, tgkVar, r9uVar).q));
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(u0y.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
