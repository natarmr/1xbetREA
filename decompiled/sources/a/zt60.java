package a;

import android.os.Bundle;
import android.view.MenuItem;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zt60 implements hwq0, k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cu60 f44941a;

    public /* synthetic */ zt60(cu60 cu60Var) {
        this.f44941a = cu60Var;
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        evz evzVar = cu60.U1;
        str.getClass();
        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
            Serializable serializable = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
            serializable.getClass();
            ql5 ql5Var = (ql5) serializable;
            long j = ql5Var.f28916a;
            h2b h2bVarH0 = this.f44941a.H0();
            h2bVarH0.x.a(j);
            wsf0 wsf0Var = h2bVarH0.y;
            ot otVarB = wsf0Var.b();
            bm5 bm5Var = bm5.d;
            otVarB.a(bm5Var, ql5Var);
            wsf0Var.q().f17359a.z(bm5Var, j);
            h2bVarH0.C();
        }
    }

    @Override // a.hwq0
    public boolean onMenuItemClick(MenuItem menuItem) {
        evz evzVar = cu60.U1;
        if (menuItem.getItemId() != R.id.cashback_info) {
            return false;
        }
        h2b h2bVarH0 = this.f44941a.H0();
        i1w0 i1w0Var = h2bVarH0.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        FragmentScreen fragmentScreenA = h2bVarH0.r.a(h2bVarH0.R);
        if (fragmentScreenA instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenA)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenA)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return true;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }
}
