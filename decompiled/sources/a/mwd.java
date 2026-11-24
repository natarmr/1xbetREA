package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/mwd;", "La/stl;", "La/xvd;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mwd extends stl<xvd> {
    public fiu0 h2;
    public ii i2;
    public static final /* synthetic */ iiy[] l2 = {new j0d0(mwd.class, "binding", "getBinding()Lorg/xplatform/chooselang/impl/databinding/ConfirmChooseLangaugeDialogBinding;", 0)};
    public static final kwd k2 = new kwd();
    public final s0r g2 = ltt0.o(this, lwd.f20759a);
    public final a8z j2 = xbc.b0(this, sre0.f32672a.b(twd.class), new jwd(this, 0));

    @Override // a.stl
    public final yfu0 Q0() {
        Object objN = this.g2.n(l2[0], this);
        objN.getClass();
        return (xvd) objN;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(iwd.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            iwd iwdVar = (iwd) (ze3Var instanceof iwd ? ze3Var : null);
            if (iwdVar != null) {
                cad cadVar = iwdVar.f15483a;
                iw20 iw20Var = iwdVar.b;
                nv20 nv20Var = iwdVar.c;
                ii iiVar = iwdVar.g;
                yoc yocVar = iwdVar.d;
                yoc yocVar2 = iwdVar.e;
                gsb gsbVar = iwdVar.f;
                zg zgVar = iwdVar.h;
                rqc rqcVar = iwdVar.l;
                c1d0 c1d0Var = iwdVar.i;
                v6k v6kVar = iwdVar.j;
                rpc rpcVar = iwdVar.k;
                au0 au0Var = iwdVar.m;
                gr70 gr70Var = iwdVar.n;
                sue sueVar = iwdVar.o;
                ctf0 ctf0Var = iwdVar.p;
                bsc bscVar = iwdVar.q;
                wgu wguVar = iwdVar.r;
                o470 o470Var = iwdVar.s;
                gr70Var.getClass();
                sueVar.getClass();
                iiVar.getClass();
                c1d0Var.getClass();
                ctf0Var.getClass();
                wguVar.getClass();
                this.h2 = new fiu0(Collections.singletonMap(twd.class, (uci) new mci(cadVar, iw20Var, nv20Var, v6kVar, gr70Var, sueVar, iiVar, yocVar, yocVar2, gsbVar, zgVar, c1d0Var, rpcVar, rqcVar, au0Var, ctf0Var, bscVar, wguVar, o470Var).r));
                this.i2 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(iwd.class, "Cannot create dependency "));
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        b1j.t(composeView, new ugd(-412486611, true, new cnc(this, (byte) 13)));
        return composeView;
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Log.i("onCreateDialog", "Current screen: ".concat(mwd.class.getName()));
    }
}
