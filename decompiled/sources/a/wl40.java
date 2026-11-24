package a;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class wl40 extends hgd {
    public Function0 e;
    public em40 f;
    public long g;
    public final View h;
    public final tl40 i;

    public wl40(Function0 function0, em40 em40Var, long j, View view, k6z k6zVar, w6k w6kVar, UUID uuid, t33 t33Var, vne vneVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.e = function0;
        this.f = em40Var;
        this.g = j;
        this.h = view;
        Window window = getWindow();
        if (window == null) {
            jf4.n("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        bcm0.x(window, false);
        tl40 tl40Var = new tl40(getContext(), window);
        tl40Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        tl40Var.setClipChildren(false);
        tl40Var.setElevation(w6kVar.w0(8.0f));
        tl40Var.setOutlineProvider(new ruc((byte) 2));
        this.i = tl40Var;
        setContentView(tl40Var);
        tl40Var.setTag(R.id.view_tree_lifecycle_owner, s7n0.l(view));
        tl40Var.setTag(R.id.view_tree_view_model_store_owner, n8n0.h(view));
        tl40Var.setTag(R.id.view_tree_saved_state_registry_owner, w7n0.p(view));
        e(this.e, this.f, this.g, k6zVar);
        ani0 ani0Var = new ani0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        ycm0 bjv0Var = i >= 35 ? new bjv0(window, ani0Var) : i >= 30 ? new ajv0(window, ani0Var) : i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        this.f.getClass();
        bjv0Var.w(uvw.M(this.g));
        this.f.getClass();
        bjv0Var.v(uvw.M(this.g));
        jg60 jg60VarK = k();
        this.f.getClass();
        jg60VarK.a(this, new vl40(vneVar, t33Var, new np30(this, (byte) 9)));
    }

    public final void e(Function0 function0, em40 em40Var, long j, k6z k6zVar) {
        this.e = function0;
        this.f = em40Var;
        this.g = j;
        em40Var.getClass();
        pnh0 pnh0Var = pnh0.f27287a;
        ViewGroup.LayoutParams layoutParams = this.h.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal = k6zVar.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            t9f.b();
            return;
        }
        this.i.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.e.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
