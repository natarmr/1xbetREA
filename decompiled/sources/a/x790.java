package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.rules.impl.presentation.models.PaymentInfoParams;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/x790;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x790 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public final s0r N1;
    public final a8z O1;
    public final zz2 P1;
    public final phf0 Q1;
    public final zz2 R1;
    public final cgx0 S1;
    public FixedWebView U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(x790.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(x790.class, "titleRes", "getTitleRes()I", 0), new ez40(x790.class, RemoteMessageConst.Notification.URL, "getUrl()Ljava/lang/String;", 0), new ez40(x790.class, "projectId", "getProjectId()I", 0), new ez40(x790.class, "showReload", "getShowReload()Z", 0)};
    public static final fl70 V1 = new fl70();

    public x790() {
        super(R.layout.compose_fragment);
        this.K1 = hnm0.f13359a;
        this.N1 = ltt0.o(this, w790.f38661a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(j890.class), new pl70(this, (byte) 14));
        this.P1 = new zz2("EXTRA_TITLE_RES", 0);
        this.Q1 = new phf0("EXTRA_URL", "");
        this.R1 = new zz2("EXTRA_PROJECT_ID", 0);
        this.S1 = new cgx0("EXTRA_SHOW_RELOAD", false);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(W1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-628997961, true, new ds60(this, (byte) 24)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(t790.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            t790 t790Var = (t790) (ze3Var instanceof t790 ? ze3Var : null);
            if (t790Var != null) {
                iiy[] iiyVarArr = W1;
                o3c o3cVarA = t790Var.a(new PaymentInfoParams(this.R1.n(this, iiyVarArr[3]).intValue(), this.P1.n(this, iiyVarArr[1]).intValue(), this.Q1.n(this, iiyVarArr[2]), this.S1.n(this, iiyVarArr[4]).booleanValue()));
                this.L1 = o3cVarA.y();
                this.M1 = (wdk0) o3cVarA.g;
                return;
            }
        }
        jf4.n(b1j.i(t790.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
