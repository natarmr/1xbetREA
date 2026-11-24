package a;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/s2g0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class s2g0 extends Fragment {
    public static final /* synthetic */ int L1 = 0;
    public final ywq H1 = m0(new yn4(this, 1), new xn(2));
    public final LinkedHashMap I1 = new LinkedHashMap();
    public gvb0 J1;
    public String[] K1;

    @Override // androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        gvb0 gvb0Var = this.J1;
        if (gvb0Var != null) {
            gvb0Var.invoke();
        }
        this.J1 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        if (this.K1 == null) {
            this.K1 = bundle != null ? bundle.getStringArray("pending_permissions") : null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putStringArray("pending_permissions", this.K1);
    }

    public final void x0(String[] strArr) {
        qog0 qog0Var = (qog0) this.I1.get(tx3.l0(strArr));
        if (qog0Var == null) {
            return;
        }
        ArrayList arrayListJ = n4c.J(n0(), tx3.g0(strArr));
        if (n7x.p(arrayListJ)) {
            Iterator it = CollectionsKt.P0(qog0Var.f29072a).iterator();
            while (it.hasNext()) {
                ((rg90) it.next()).d(arrayListJ);
            }
        } else {
            if (this.K1 != null) {
                return;
            }
            this.K1 = strArr;
            Log.d("s2g0", "requesting permissions: ".concat(tx3.N(strArr, null, null, null, null, 63)));
            Function0 function0 = qog0Var.e;
            if (function0 != null) {
                function0.invoke();
            }
            this.H1.a(strArr);
        }
    }
}
