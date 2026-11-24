package a;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class xjk extends hgd {
    public Function0 e;
    public fjk f;
    public final View g;
    public final xik h;
    public boolean i;

    public xjk(Function0 function0, fjk fjkVar, View view, k6z k6zVar, w6k w6kVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), fjkVar.d ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.e = function0;
        this.f = fjkVar;
        this.g = view;
        Window window = getWindow();
        if (window == null) {
            jf4.n("Dialog has no window");
            throw null;
        }
        fjk fjkVar2 = this.f;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            fjkVar2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        byte b = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        bcm0.x(window, this.f.d);
        window.setGravity(17);
        if (!this.f.d) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                ha3.f12706a.a(attributes2);
            }
            if (i >= 30) {
                ja3 ja3Var = ja3.f16169a;
                ja3Var.b(attributes2, 0);
                ja3Var.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        xik xikVar = new xik(getContext(), window);
        this.f.getClass();
        setTitle("");
        xikVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        xikVar.setClipChildren(false);
        xikVar.setElevation(w6kVar.w0(8.0f));
        xikVar.setOutlineProvider(new ruc((byte) 1));
        this.h = xikVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(xikVar);
        xikVar.setTag(R.id.view_tree_lifecycle_owner, s7n0.l(view));
        xikVar.setTag(R.id.view_tree_view_model_store_owner, n8n0.h(view));
        xikVar.setTag(R.id.view_tree_saved_state_registry_owner, w7n0.p(view));
        f(this.e, this.f, k6zVar);
        bdx.O(k(), this, new qy2(this, b));
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof xik) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    public final void f(Function0 function0, fjk fjkVar, k6z k6zVar) {
        int i;
        this.e = function0;
        this.f = fjkVar;
        pnh0 pnh0Var = fjkVar.b;
        boolean zB = k13.b(this.g);
        int iOrdinal = pnh0Var.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = k6zVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                t9f.b();
                return;
            }
            i = 1;
        }
        xik xikVar = this.h;
        xikVar.setLayoutDirection(i);
        boolean z = fjkVar.d;
        boolean z2 = fjkVar.c;
        Window window2 = xikVar.j;
        boolean z3 = (xikVar.n && z2 == xikVar.l && z == xikVar.m) ? false : true;
        xikVar.l = z2;
        xikVar.m = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z2 ? -2 : -1;
            if (i3 != attributes.width || !xikVar.n) {
                window2.setLayout(i3, -2);
                xikVar.n = true;
            }
        }
        setCanceledOnTouchOutside(fjkVar.f9644a);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i2 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f.getClass();
        if (!keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.e.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iB;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f.f9644a) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.i = false;
            return zOnTouchEvent;
        }
        xik xikVar = this.h;
        xikVar.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = xikVar.getChildAt(0)) != null) {
            int left = childAt.getLeft() + xikVar.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + xikVar.getTop();
            int height = childAt.getHeight() + top;
            int iB2 = si30.b(motionEvent.getX());
            if (left <= iB2 && iB2 <= width && top <= (iB = si30.b(motionEvent.getY())) && iB <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.i = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.i = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.i = false;
                return zOnTouchEvent;
            }
        } else if (this.i) {
            this.e.invoke();
            this.i = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
