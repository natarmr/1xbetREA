package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Collections;
import kotlin.Metadata;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorJackpotBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"La/z31;", "La/iw5;", "<init>", "()V", "a/jdk0", "", "currentLineCount", "", "currentEllipsis", "isEllipsized", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z31 extends iw5 {
    public fiu0 l2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(z31.class, "params", "getParams()Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;", 0)};
    public static final jdk0 n2 = new jdk0();
    public final khf0 k2 = new khf0("PARAMS_KEY");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(c41.class), new y31(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1487324342);
        b41 b41Var = (b41) ((i3t0) ((k3t0) this.m2.getValue())).y(fetVar).getValue();
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = androidx.compose.runtime.e.b(0);
            fetVar.o0(objP);
        }
        cgk0 cgk0Var = (cgk0) objP;
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
            fetVar.o0(objP2);
        }
        pz40 pz40Var = (pz40) objP2;
        Object objP3 = fetVar.P();
        if (objP3 == cl5Var) {
            objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
            fetVar.o0(objP3);
        }
        pz40 pz40Var2 = (pz40) objP3;
        Object objP4 = fetVar.P();
        if (objP4 == cl5Var) {
            objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP4);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-1446016773, new un6(b41Var, (byte) 10), fetVar), u1c.M(544858675, new ri1(b41Var, this, (byte) 23), fetVar), u1c.M(1072875449, new hgs0(b41Var, (vne) objP4, pz40Var, cgk0Var, pz40Var2, (byte) 1), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(a41.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            a41 a41Var = (a41) (ze3Var instanceof a41 ? ze3Var : null);
            if (a41Var != null) {
                AggregatorJackpotBottomSheetParams aggregatorJackpotBottomSheetParams = (AggregatorJackpotBottomSheetParams) this.k2.n(this, o2[0]);
                cad cadVar = a41Var.b;
                ctf0 ctf0Var = a41Var.f200a;
                grj grjVar = a41Var.c;
                s31 s31Var = a41Var.d;
                e41 e41Var = a41Var.e;
                ctf0Var.getClass();
                ywq0 ywq0Var = new ywq0();
                ywq0Var.f43384a = aggregatorJackpotBottomSheetParams;
                ywq0Var.b = grjVar;
                ywq0Var.c = e41Var;
                ywq0Var.d = s31Var;
                ywq0Var.e = cadVar;
                ywq0Var.f = ctf0Var;
                ywq0Var.g = new t5i(ywq0Var, (byte) 18);
                this.l2 = new fiu0(Collections.singletonMap(c41.class, (t5i) ywq0Var.g));
                return;
            }
        }
        jf4.n(b1j.i(a41.class, "Cannot create dependency "));
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        ((k3t0) this.m2.getValue()).x(u31.f34973a);
    }
}
