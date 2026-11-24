package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Collections;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.alerts_pipe_api.presentation.AlertsPipeType;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/fj50;", "La/u0i;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fj50 extends u0i {
    public static final /* synthetic */ int i2 = 0;
    public fiu0 f2;
    public final kiu0 g2;
    public r12 h2;

    public fj50() {
        np30 np30Var = new np30(this, (byte) 17);
        a8z a8zVarA = maz.a(wez.b, new ej50(new pv10(this, (byte) 29), (byte) 0));
        this.g2 = agc.G(this, sre0.f32672a.b(gj50.class), new y620(a8zVarA, (byte) 20), new y620(a8zVarA, (byte) 21), np30Var);
    }

    @Override // a.u0i
    public final void O0() {
        gj50 gj50Var = (gj50) this.g2.getValue();
        i1w0 i1w0Var = gj50Var.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        FragmentScreen fragmentScreenE = drm0.e(gj50Var.c);
        if (fragmentScreenE instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenE)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenE)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                super.O0();
                return;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    @Override // a.u0i, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pty.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pty ptyVar = (pty) (ze3Var instanceof pty ? ze3Var : null);
            if (ptyVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                p12 p12Var = ptyVar.f27586a;
                this.f2 = new fiu0(Collections.singletonMap(gj50.class, (tii) new oif0(p12Var, ptyVar.b, i1w0VarF).d));
                r12 r12Var = (r12) ((p12) p12Var.b).b;
                x1x.x(r12Var);
                this.h2 = r12Var;
                androidx.fragment.app.e eVarF = F();
                AlertsPipeType.NotIdentifiedKzAlert notIdentifiedKzAlert = new AlertsPipeType.NotIdentifiedKzAlert(String.valueOf(K0().f47242a));
                s12 s12Var = (s12) r12Var;
                s12Var.g = eVarF;
                s12Var.f = notIdentifiedKzAlert;
                return;
            }
        }
        jf4.n(b1j.i(pty.class, "Cannot create dependency "));
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        r12 r12Var = this.h2;
        if (r12Var == null) {
            Intrinsics.h("alertsPipeReceiver");
            throw null;
        }
        ((s12) r12Var).b();
        super.onDismiss(dialogInterface);
    }
}
