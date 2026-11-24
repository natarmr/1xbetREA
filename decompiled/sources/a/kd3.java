package a;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class kd3 implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f18085a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ pd3 e;

    public kd3(pd3 pd3Var, Window.Callback callback) {
        this.e = pd3Var;
        if (callback != null) {
            this.f18085a = callback;
        } else {
            jf4.o("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
        } finally {
            this.b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f18085a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f18085a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        this.f18085a.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f18085a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.c;
        Window.Callback callback = this.f18085a;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.e.L(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        od3 od3Var;
        boolean zW;
        ox30 ox30Var;
        boolean zPerformShortcut;
        if (!this.f18085a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            pd3 pd3Var = this.e;
            pd3Var.R();
            qhv0 qhv0Var = pd3Var.n;
            if (qhv0Var == null) {
                od3Var = pd3Var.l1;
                if (od3Var != null || !pd3Var.W(od3Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (pd3Var.l1 == null) {
                        od3 od3VarQ = pd3Var.Q(0);
                        pd3Var.X(od3VarQ, keyEvent);
                        zW = pd3Var.W(od3VarQ, keyEvent.getKeyCode(), keyEvent);
                        od3VarQ.k = false;
                        if (zW) {
                        }
                    }
                    return false;
                }
                od3 od3Var2 = pd3Var.l1;
                if (od3Var2 != null) {
                    od3Var2.l = true;
                    return true;
                }
            } else {
                phv0 phv0Var = qhv0Var.i;
                if (phv0Var == null || (ox30Var = phv0Var.e) == null) {
                    zPerformShortcut = false;
                } else {
                    ox30Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = ox30Var.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    od3Var = pd3Var.l1;
                    if (od3Var != null) {
                        if (pd3Var.l1 == null) {
                            od3 od3VarQ2 = pd3Var.Q(0);
                            pd3Var.X(od3VarQ2, keyEvent);
                            zW = pd3Var.W(od3VarQ2, keyEvent.getKeyCode(), keyEvent);
                            od3VarQ2.k = false;
                            if (zW) {
                            }
                        }
                        return false;
                    }
                    if (pd3Var.l1 == null) {
                        od3 od3VarQ3 = pd3Var.Q(0);
                        pd3Var.X(od3VarQ3, keyEvent);
                        zW = pd3Var.W(od3VarQ3, keyEvent.getKeyCode(), keyEvent);
                        od3VarQ3.k = false;
                        if (zW) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f18085a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f18085a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f18085a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f18085a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f18085a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f18085a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.b) {
            this.f18085a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof ox30)) {
            return this.f18085a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f18085a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f18085a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f18085a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            pd3 pd3Var = this.e;
            pd3Var.R();
            qhv0 qhv0Var = pd3Var.n;
            if (qhv0Var != null) {
                ArrayList arrayList = qhv0Var.m;
                if (true != qhv0Var.l) {
                    qhv0Var.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        hny.b();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f18085a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        pd3 pd3Var = this.e;
        if (i != 108) {
            if (i == 0) {
                od3 od3VarQ = pd3Var.Q(i);
                if (od3VarQ.m) {
                    pd3Var.J(od3VarQ, false);
                    return;
                }
                return;
            }
            return;
        }
        pd3Var.R();
        qhv0 qhv0Var = pd3Var.n;
        if (qhv0Var != null) {
            ArrayList arrayList = qhv0Var.m;
            if (qhv0Var.l) {
                qhv0Var.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                hny.b();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        ga3.o(this.f18085a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ox30 ox30Var = menu instanceof ox30 ? (ox30) menu : null;
        if (i == 0 && ox30Var == null) {
            return false;
        }
        if (ox30Var != null) {
            ox30Var.x = true;
        }
        boolean zOnPreparePanel = this.f18085a.onPreparePanel(i, view, menu);
        if (ox30Var != null) {
            ox30Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ox30 ox30Var = this.e.Q(0).h;
        if (ox30Var != null) {
            d(list, ox30Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f18085a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f18085a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f18085a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        pd3 pd3Var = this.e;
        Context context = pd3Var.k;
        if (i != 0) {
            return this.f18085a.onWindowStartingActionMode(callback, i);
        }
        z220 z220Var = new z220(context, callback);
        xj xjVar = pd3Var.t;
        if (xjVar != null) {
            xjVar.c();
        }
        xex xexVar = new xex();
        xexVar.b = pd3Var;
        xexVar.f40764a = z220Var;
        pd3Var.R();
        qhv0 qhv0Var = pd3Var.n;
        if (qhv0Var != null) {
            phv0 phv0Var = qhv0Var.i;
            if (phv0Var != null) {
                phv0Var.c();
            }
            qhv0Var.c.setHideOnContentScrollEnabled(false);
            qhv0Var.f.e();
            phv0 phv0Var2 = new phv0(qhv0Var, qhv0Var.f.getContext(), xexVar);
            ox30 ox30Var = phv0Var2.e;
            ox30Var.w();
            try {
                boolean zI = ((z220) phv0Var2.f.f40764a).I(phv0Var2, ox30Var);
                ox30Var.v();
                if (zI) {
                    qhv0Var.i = phv0Var2;
                    phv0Var2.k();
                    qhv0Var.f.c(phv0Var2);
                    qhv0Var.a(true);
                } else {
                    phv0Var2 = null;
                }
                pd3Var.t = phv0Var2;
            } catch (Throwable th) {
                ox30Var.v();
                throw th;
            }
        }
        if (pd3Var.t == null) {
            zju0 zju0Var = pd3Var.x;
            if (zju0Var != null) {
                zju0Var.b();
            }
            xj xjVar2 = pd3Var.t;
            if (xjVar2 != null) {
                xjVar2.c();
            }
            if (pd3Var.u == null) {
                if (pd3Var.h1) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        tje tjeVar = new tje(context, 0);
                        tjeVar.getTheme().setTo(themeNewTheme);
                        context = tjeVar;
                    }
                    pd3Var.u = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    pd3Var.v = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    pd3Var.v.setContentView(pd3Var.u);
                    pd3Var.v.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    pd3Var.u.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    pd3Var.v.setHeight(-2);
                    pd3Var.w = new id3(pd3Var, (byte) 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) pd3Var.z.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        pd3Var.R();
                        qhv0 qhv0Var2 = pd3Var.n;
                        Context contextB = qhv0Var2 != null ? qhv0Var2.b() : null;
                        if (contextB != null) {
                            context = contextB;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        pd3Var.u = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (pd3Var.u != null) {
                zju0 zju0Var2 = pd3Var.x;
                if (zju0Var2 != null) {
                    zju0Var2.b();
                }
                pd3Var.u.e();
                Context context2 = pd3Var.u.getContext();
                ActionBarContextView actionBarContextView = pd3Var.u;
                b4m0 b4m0Var = new b4m0();
                b4m0Var.d = context2;
                b4m0Var.e = actionBarContextView;
                b4m0Var.f = xexVar;
                ox30 ox30Var2 = new ox30(actionBarContextView.getContext());
                ox30Var2.l = true;
                b4m0Var.i = ox30Var2;
                ox30Var2.e = b4m0Var;
                if (((z220) xexVar.f40764a).I(b4m0Var, ox30Var2)) {
                    b4m0Var.k();
                    pd3Var.u.c(b4m0Var);
                    pd3Var.t = b4m0Var;
                    boolean z = pd3Var.y && (viewGroup = pd3Var.z) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = pd3Var.u;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        zju0 zju0VarA = rgu0.a(pd3Var.u);
                        zju0VarA.a(1.0f);
                        pd3Var.x = zju0VarA;
                        zju0VarA.d(new jd3(pd3Var, (byte) 1));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        pd3Var.u.setVisibility(0);
                        if (pd3Var.u.getParent() instanceof View) {
                            View view = (View) pd3Var.u.getParent();
                            WeakHashMap weakHashMap = rgu0.f30456a;
                            view.requestApplyInsets();
                        }
                    }
                    if (pd3Var.v != null) {
                        pd3Var.l.getDecorView().post(pd3Var.w);
                    }
                } else {
                    pd3Var.t = null;
                }
            }
            pd3Var.Z();
            pd3Var.t = pd3Var.t;
        }
        pd3Var.Z();
        xj xjVar3 = pd3Var.t;
        if (xjVar3 != null) {
            return z220Var.i(xjVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f18085a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
