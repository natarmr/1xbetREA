package a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qhv0 implements zh {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28761a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public blj e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public phv0 i;
    public phv0 j;
    public xex k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public bku0 s;
    public boolean t;
    public boolean u;
    public final ohv0 v;
    public final ohv0 w;
    public final owp0 x;

    public qhv0(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new ohv0(this, (byte) 0);
        this.w = new ohv0(this, (byte) 1);
        this.x = new owp0((Object) this, (byte) 17);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        zju0 zju0VarJ;
        zju0 zju0VarJ2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        blj bljVar = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((rwq0) bljVar).f31228a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((rwq0) bljVar).f31228a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            rwq0 rwq0Var = (rwq0) bljVar;
            zju0VarJ = rgu0.a(rwq0Var.f31228a);
            zju0VarJ.a(0.0f);
            zju0VarJ.c(100L);
            zju0VarJ.d(new qwq0(rwq0Var, 4));
            zju0VarJ2 = this.f.j(0, 200L);
        } else {
            rwq0 rwq0Var2 = (rwq0) bljVar;
            zju0 zju0VarA = rgu0.a(rwq0Var2.f31228a);
            zju0VarA.a(1.0f);
            zju0VarA.c(200L);
            zju0VarA.d(new qwq0(rwq0Var2, 0));
            zju0VarJ = this.f.j(8, 100L);
            zju0VarJ2 = zju0VarA;
        }
        bku0 bku0Var = new bku0();
        ArrayList arrayList = bku0Var.f2767a;
        arrayList.add(zju0VarJ);
        View view = (View) zju0VarJ.f44498a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) zju0VarJ2.f44498a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(zju0VarJ2);
        bku0Var.b();
    }

    public final Context b() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.f28761a.getTheme().resolveAttribute(org.xbet.client1.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f28761a, i);
            this.b = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.f28761a;
        this.b = context2;
        return context2;
    }

    public final void c(View view) {
        blj wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.xbet.client1.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(org.xbet.client1.R.id.action_bar);
        if (callbackFindViewById instanceof blj) {
            wrapper = (blj) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(org.xbet.client1.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.xbet.client1.R.id.action_bar_container);
        this.d = actionBarContainer;
        blj bljVar = this.e;
        if (bljVar == null || this.f == null || actionBarContainer == null) {
            jf4.n(qhv0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((rwq0) bljVar).f31228a.getContext();
        this.f28761a = context;
        if ((((rwq0) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        e(context.getResources().getBoolean(org.xbet.client1.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f28761a.obtainStyledAttributes(null, mqd0.f22220a, org.xbet.client1.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.g) {
                jf4.n("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = rgu0.f30456a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        rwq0 rwq0Var = (rwq0) this.e;
        int i2 = rwq0Var.b;
        this.h = true;
        rwq0Var.a((i & 4) | (i2 & (-5)));
    }

    public final void e(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((rwq0) this.e).getClass();
        } else {
            ((rwq0) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((rwq0) this.e).f31228a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        byte b = 6;
        owp0 owp0Var = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                bku0 bku0Var = this.s;
                if (bku0Var != null) {
                    bku0Var.a();
                }
                int i = this.n;
                ohv0 ohv0Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    ohv0Var.onAnimationEnd();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                bku0 bku0Var2 = new bku0();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                zju0 zju0VarA = rgu0.a(this.d);
                zju0VarA.e(f);
                View view2 = (View) zju0VarA.f44498a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(owp0Var != null ? new sb3(owp0Var, view2, b) : null);
                }
                boolean z5 = bku0Var2.e;
                ArrayList arrayList = bku0Var2.f2767a;
                if (!z5) {
                    arrayList.add(zju0VarA);
                }
                if (this.o && view != null) {
                    zju0 zju0VarA2 = rgu0.a(view);
                    zju0VarA2.e(f);
                    if (!bku0Var2.e) {
                        arrayList.add(zju0VarA2);
                    }
                }
                boolean z6 = bku0Var2.e;
                if (!z6) {
                    bku0Var2.c = y;
                }
                if (!z6) {
                    bku0Var2.b = 250L;
                }
                if (!z6) {
                    bku0Var2.d = ohv0Var;
                }
                this.s = bku0Var2;
                bku0Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        bku0 bku0Var3 = this.s;
        if (bku0Var3 != null) {
            bku0Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        ohv0 ohv0Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            bku0 bku0Var4 = new bku0();
            zju0 zju0VarA3 = rgu0.a(this.d);
            zju0VarA3.e(0.0f);
            View view3 = (View) zju0VarA3.f44498a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(owp0Var != null ? new sb3(owp0Var, view3, b) : null);
            }
            boolean z7 = bku0Var4.e;
            ArrayList arrayList2 = bku0Var4.f2767a;
            if (!z7) {
                arrayList2.add(zju0VarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                zju0 zju0VarA4 = rgu0.a(view);
                zju0VarA4.e(0.0f);
                if (!bku0Var4.e) {
                    arrayList2.add(zju0VarA4);
                }
            }
            boolean z8 = bku0Var4.e;
            if (!z8) {
                bku0Var4.c = z;
            }
            if (!z8) {
                bku0Var4.b = 250L;
            }
            if (!z8) {
                bku0Var4.d = ohv0Var2;
            }
            this.s = bku0Var4;
            bku0Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            ohv0Var2.onAnimationEnd();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public qhv0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new ohv0(this, (byte) 0);
        this.w = new ohv0(this, (byte) 1);
        this.x = new owp0((Object) this, (byte) 17);
        c(dialog.getWindow().getDecorView());
    }
}
