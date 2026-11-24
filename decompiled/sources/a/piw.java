package a;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/piw;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class piw extends yx5 implements tah0 {
    public fiu0 K1;
    public ujd L1;
    public pru M1;
    public wdk0 N1;
    public poq0 O1;
    public final boolean P1;
    public final a8z Q1;
    public final a8z R1;
    public final khf0 S1;
    public final s0r U1;
    public final qdz V1;
    public final n0o0 W1;
    public bjw X1;
    public static final /* synthetic */ iiy[] Z1 = {new ez40(piw.class, "params", "getParams()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;", 0), new j0d0(piw.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final sqt Y1 = new sqt();

    public piw() {
        super(R.layout.compose_fragment);
        this.P1 = true;
        this.Q1 = maz.a(wez.b, new miw(this, (byte) 0));
        this.R1 = xbc.b0(this, sre0.f32672a.b(ukw.class), new miw(this, (byte) 1));
        this.S1 = new khf0("params_key");
        this.U1 = ltt0.o(this, niw.f23609a);
        this.V1 = new qdz();
        this.W1 = maz.b(new miw(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new miw(this, (byte) 3));
        wdk0 wdk0Var = this.N1;
        if (wdk0Var != null) {
            wdk0.l(wdk0Var, this, this.P1);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // a.yx5
    public final void C0() {
        yii yiiVar = (yii) this.Q1.getValue();
        this.K1 = new fiu0(Collections.singletonMap(ukw.class, yiiVar.L));
        ujd ujdVarD = yiiVar.f42692a.d();
        x1x.x(ujdVarD);
        this.L1 = ujdVarD;
        this.M1 = yiiVar.b;
        this.N1 = yiiVar.c;
        this.O1 = yiiVar.d;
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.U1.n(Z1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-600074902, true, new xxv(this, (byte) 6)));
    }

    public final CyberHomeParams G0() {
        return (CyberHomeParams) this.S1.n(this, Z1[0]);
    }

    public final k3t0 H0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        int iA;
        Window window;
        super.e0();
        boolean z = (((g5h) this.W1.getValue()) != g5h.EVENT_FOCUS || (G0().b instanceof CyberGamesParentSectionModel.FromPopular) || (G0().b instanceof CyberGamesParentSectionModel.FromNewPopular)) ? false : true;
        if (z) {
            iA = R.color.uikit_splash_background;
        } else {
            TypedValue typedValue = j5d.f15927a;
            iA = j5d.a(o0(), jtm0.l(getK1()), true);
        }
        int i = iA;
        boolean z2 = (z || qem0.r(B())) ? false : true;
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null) {
            return;
        }
        Context contextO0 = o0();
        TypedValue typedValue2 = j5d.f15927a;
        ofm0.A(window, contextO0, i, j5d.a(o0(), jtm0.k(getK1()), true), z2, !qem0.r(B()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        ms2 rq2Var;
        super.g0();
        ujd ujdVar = this.L1;
        if (ujdVar == null) {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
        CyberGamesParentSectionModel cyberGamesParentSectionModel = G0().b;
        if (cyberGamesParentSectionModel == null) {
            rq2Var = new rq2();
        } else if (cyberGamesParentSectionModel instanceof CyberGamesParentSectionModel.FromPopular) {
            rq2Var = new fr2();
        } else if (cyberGamesParentSectionModel instanceof CyberGamesParentSectionModel.FromNewPopular) {
            rq2Var = new jr2();
        } else {
            rq2Var = new rq2();
        }
        ujdVar.c(this, rq2Var, new kiw(this, (byte) 0));
    }

    @Override // a.tah0
    public final boolean p() {
        bjw bjwVar = this.X1;
        if (bjwVar != null) {
            return bjwVar.b.c();
        }
        return false;
    }

    @Override // a.tah0
    public final void w() {
        bjw bjwVar = this.X1;
        if (bjwVar != null) {
            qjj.W(bjwVar.f2723a, null, null, new wi6(bjwVar.b, null, (byte) 4), 3);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.P1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return new e9o0((((g5h) this.W1.getValue()) != g5h.HEADER_FOCUS || (G0().b instanceof CyberGamesParentSectionModel.FromPopular) || (G0().b instanceof CyberGamesParentSectionModel.FromNewPopular)) ? R.attr.uikitBackgroundContent : R.attr.uikitBackground, R.attr.uikitBackgroundContent, 12);
    }
}
