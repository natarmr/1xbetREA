package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qss0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qss0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final boolean M1;
    public final cgx0 N1;
    public final phf0 O1;
    public final phf0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(qss0.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentTvBetJackpotBinding;", 0), new ez40(qss0.class, "fromAggregator", "getFromAggregator()Z", 0), new ez40(qss0.class, "bannerUrl", "getBannerUrl()Ljava/lang/String;", 0), new ez40(qss0.class, "bannerTranslateId", "getBannerTranslateId()Ljava/lang/String;", 0)};
    public static final j6m0 R1 = new j6m0((byte) 29);

    public qss0() {
        super(R.layout.fragment_tv_bet_jackpot);
        this.K1 = ltt0.o(this, pss0.f27529a);
        this.M1 = true;
        this.N1 = new cgx0("FROM_AGGREGATOR", true);
        this.O1 = new phf0("BANNER_URL", "");
        this.P1 = new phf0("BANNER_TRANSLATE_ID", "");
        this.Q1 = xbc.b0(this, sre0.f32672a.b(tts0.class), new qir0(this, (byte) 22));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        pkd.h(((j6r) objN).b, new owp0(K()), null, new ugd(-1834325359, true, new iob0(this, (byte) 16)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(oss0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            oss0 oss0Var = (oss0) (ze3Var instanceof oss0 ? ze3Var : null);
            if (oss0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                Boolean boolN = this.N1.n(this, iiyVarArr[1]);
                String strN = this.O1.n(this, iiyVarArr[2]);
                String strN2 = this.P1.n(this, iiyVarArr[3]);
                i1w0VarF.getClass();
                strN.getClass();
                strN2.getClass();
                cad cadVar = oss0Var.f25797a;
                wsf0 wsf0Var = oss0Var.j;
                btt0 btt0Var = oss0Var.b;
                gii0 gii0Var = oss0Var.c;
                j1q0 j1q0Var = oss0Var.d;
                m1e m1eVar = oss0Var.e;
                kt2 kt2Var = oss0Var.f;
                b3c0 b3c0Var = oss0Var.g;
                knf0 knf0Var = oss0Var.h;
                gst0 gst0Var = oss0Var.i;
                ctf0 ctf0Var = oss0Var.k;
                bzt bztVar = oss0Var.l;
                kuy kuyVar = oss0Var.m;
                gle0 gle0Var = oss0Var.n;
                btt0Var.getClass();
                gii0Var.getClass();
                j1q0Var.getClass();
                m1eVar.getClass();
                kt2Var.getClass();
                b3c0Var.getClass();
                knf0Var.getClass();
                gst0Var.getClass();
                ctf0Var.getClass();
                kuyVar.getClass();
                this.L1 = new fiu0(Collections.singletonMap(tts0.class, (yxi) new qv2(cadVar, wsf0Var, i1w0VarF, boolN, strN2, gii0Var, m1eVar, knf0Var, ctf0Var, bztVar, kuyVar, gle0Var).n));
                return;
            }
        }
        jf4.n(b1j.i(oss0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }
}
