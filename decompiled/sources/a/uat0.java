package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampPrizePoolParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uat0;", "La/yx5;", "<init>", "()V", "a/uxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uat0 extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public fiu0 M1;
    public final a8z N1;
    public final qdz O1;
    public final khf0 P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(uat0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;", 0)};
    public static final uxs0 Q1 = new uxs0((byte) 2);

    public uat0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = true;
        this.N1 = xbc.b0(this, sre0.f32672a.b(yat0.class), new tat0(this, (byte) 0));
        this.O1 = new qdz();
        this.P1 = new khf0("UNIVERSAL_CHAMP_PARAMS");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vat0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vat0 vat0Var = (vat0) (ze3Var instanceof vat0 ? ze3Var : null);
            if (vat0Var != null) {
                UniversalChampPrizePoolParams universalChampPrizePoolParams = (UniversalChampPrizePoolParams) this.P1.n(this, R1[0]);
                cad cadVar = vat0Var.f37107a;
                pyg pygVar = vat0Var.b;
                ctf0 ctf0Var = vat0Var.c;
                g2v g2vVar = vat0Var.d;
                m1e m1eVar = vat0Var.e;
                gii0 gii0Var = vat0Var.f;
                vby vbyVar = vat0Var.g;
                pygVar.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                gii0Var.getClass();
                vbyVar.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = universalChampPrizePoolParams;
                g45Var.b = cadVar;
                g45Var.c = g2vVar;
                g45Var.d = pygVar;
                g45Var.e = m1eVar;
                g45Var.f = gii0Var;
                g45Var.g = vbyVar;
                g45Var.h = ctf0Var;
                g45Var.i = new yxi(g45Var, (byte) 12);
                this.M1 = new fiu0(Collections.singletonMap(yat0.class, (yxi) g45Var.i));
                return;
            }
        }
        jf4.n(b1j.i(vat0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(799235681, true, new p6r0(this, (byte) 28)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
