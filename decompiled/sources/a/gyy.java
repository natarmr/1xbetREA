package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ufc.api.last_fights.LastFightsParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gyy;", "La/yx5;", "<init>", "()V", "a/rqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gyy extends yx5 {
    public final boolean K1;
    public fiu0 L1;
    public wdk0 M1;
    public final a8z N1;
    public final khf0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(gyy.class, "params", "getParams()Lorg/xplatform/ufc/api/last_fights/LastFightsParams;", 0)};
    public static final rqt P1 = new rqt();

    public gyy() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.N1 = xbc.b0(this, sre0.f32672a.b(ryy.class), new fyy(this, (byte) 0));
        this.O1 = new khf0("LAST_FIGHTS_PARAMS");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hyy.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hyy hyyVar = (hyy) (ze3Var instanceof hyy ? ze3Var : null);
            if (hyyVar != null) {
                LastFightsParams lastFightsParams = (LastFightsParams) this.O1.n(this, Q1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iip iipVar = hyyVar.f13882a;
                cad cadVar = hyyVar.b;
                epi0 epi0Var = hyyVar.c;
                ugf0 ugf0Var = hyyVar.d;
                ctf0 ctf0Var = hyyVar.e;
                wdk0 wdk0Var = hyyVar.f;
                gii0 gii0Var = hyyVar.g;
                kys0 kys0Var = hyyVar.h;
                m1e m1eVar = hyyVar.i;
                pru pruVar = hyyVar.j;
                g2v g2vVar = hyyVar.k;
                knf0 knf0Var = hyyVar.l;
                iipVar.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                knf0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(ryy.class, (tii) new nc0(iipVar, cadVar, epi0Var, ugf0Var, i1w0VarF, lastFightsParams, ctf0Var, wdk0Var, gii0Var, kys0Var, m1eVar, pruVar, g2vVar, knf0Var).n));
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(hyy.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        wdk0 wdk0Var = this.M1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.K1);
        pkd.h(composeView, new owp0(this), null, new ugd(882188359, true, new xxv(this, (byte) 24)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.K1;
    }
}
