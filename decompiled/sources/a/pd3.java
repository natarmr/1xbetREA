package a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pd3 extends hd3 implements mx30, LayoutInflater.Factory2 {
    public static final nuj0 G1 = new nuj0(0);
    public static final int[] H1 = {R.attr.windowBackground};
    public static final boolean I1 = !"robolectric".equals(Build.FINGERPRINT);
    public TextView A;
    public boolean A1;
    public boolean B;
    public Rect B1;
    public Rect C1;
    public ye3 D1;
    public OnBackInvokedDispatcher E1;
    public ma3 F1;
    public boolean Y;
    public boolean Z;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public final Object j;
    public boolean j1;
    public final Context k;
    public od3[] k1;
    public Window l;
    public od3 l1;
    public kd3 m;
    public boolean m1;
    public qhv0 n;
    public boolean n1;
    public njn0 o;
    public boolean o1;
    public CharSequence p;
    public boolean p1;
    public ActionBarOverlayLayout q;
    public Configuration q1;
    public wsf0 r;
    public final int r1;
    public r7v s;
    public int s1;
    public xj t;
    public int t1;
    public ActionBarContextView u;
    public boolean u1;
    public PopupWindow v;
    public ld3 v1;
    public id3 w;
    public ld3 w1;
    public boolean x1;
    public boolean y;
    public int y1;
    public ViewGroup z;
    public zju0 x = null;
    public final id3 z1 = new id3(this, 0);

    public pd3(Context context, Window window, bd3 bd3Var, Object obj) {
        yc3 yc3Var = null;
        this.r1 = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof yc3)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    yc3Var = (yc3) context;
                    break;
                }
            }
            if (yc3Var != null) {
                this.r1 = yc3Var.t().j();
            }
        }
        if (this.r1 == -100) {
            String name = this.j.getClass().getName();
            nuj0 nuj0Var = G1;
            Integer num = (Integer) nuj0Var.get(name);
            if (num != null) {
                this.r1 = num.intValue();
                nuj0Var.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            F(window);
        }
        td3.d();
    }

    public static ss00 G(Context context) {
        ss00 ss00Var;
        ss00 ss00VarC;
        if (Build.VERSION.SDK_INT >= 33 || (ss00Var = hd3.c) == null) {
            return null;
        }
        ts00 ts00Var = ss00Var.f32705a;
        ss00 ss00VarA = ss00.a(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (ss00Var.b()) {
            ss00VarC = ss00.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < ss00VarA.f32705a.f34441a.size() + ts00Var.f34441a.size()) {
                Locale locale = i < ts00Var.f34441a.size() ? ts00Var.f34441a.get(i) : ss00VarA.f32705a.f34441a.get(i - ts00Var.f34441a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            ss00VarC = ss00.c(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
        }
        return ss00VarC.b() ? ss00VarA : ss00VarC;
    }

    public static Configuration K(Context context, int i, ss00 ss00Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (ss00Var != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(ss00Var.f32705a.f34441a.toLanguageTags()));
        }
        return configuration2;
    }

    @Override // a.hd3
    public final void A(View view) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // a.hd3
    public final void B(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // a.hd3
    public final void C(int i) {
        this.s1 = i;
    }

    @Override // a.hd3
    public final void D(CharSequence charSequence) {
        this.p = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        qhv0 qhv0Var = this.n;
        if (qhv0Var == null) {
            TextView textView = this.A;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        rwq0 rwq0Var = (rwq0) qhv0Var.e;
        if (rwq0Var.g) {
            return;
        }
        Toolbar toolbar = rwq0Var.f31228a;
        rwq0Var.h = charSequence;
        if ((rwq0Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (rwq0Var.g) {
                rgu0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean E(boolean z, boolean z2) {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        if (this.p1) {
            return false;
        }
        int i2 = this.r1;
        if (i2 == -100) {
            i2 = hd3.b;
        }
        Context context = this.k;
        int iT = T(i2, context);
        int i3 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        ss00 ss00VarG = i3 < 33 ? G(context) : null;
        if (!z2 && ss00VarG != null) {
            ss00VarG = ss00.a(context.getResources().getConfiguration().getLocales().toLanguageTags());
        }
        Configuration configurationK = K(context, iT, ss00VarG, null, false);
        boolean z4 = this.u1;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj3 = this.j;
        if (z4 || !(obj3 instanceof Activity)) {
            this.u1 = true;
            i = this.t1;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.t1 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.t1 = 0;
                }
                this.u1 = true;
                i = this.t1;
            }
        }
        Configuration configuration = this.q1;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationK.uiMode & 48;
        ss00 ss00VarA = ss00.a(configuration.getLocales().toLanguageTags());
        ss00 ss00VarA2 = ss00VarG == null ? null : ss00.a(configurationK.getLocales().toLanguageTags());
        int i6 = i4 != i5 ? 512 : 0;
        if (ss00VarA2 != null && !ss00VarA.equals(ss00VarA2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.n1 && ((I1 || this.o1) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationK.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new w1(activity, z5 ? (byte) 1 : (byte) 0));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (ss00VarA2 != null) {
                configuration2.setLocales(LocaleList.forLanguageTags(ss00VarA2.f32705a.f34441a.toLanguageTags()));
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26 && i8 < 28) {
                if (!zvw.h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        zvw.g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e2) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                    }
                    zvw.h = true;
                }
                Field field = zvw.g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!zvw.b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                zvw.f45077a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e4) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                            }
                            zvw.b = true;
                        }
                        Field field2 = zvw.f45077a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!zvw.d) {
                                try {
                                    zvw.c = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e6) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
                                }
                                zvw.d = true;
                            }
                            Class cls = zvw.c;
                            if (cls != null) {
                                if (!zvw.f) {
                                    try {
                                        Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                        zvw.e = declaredField3;
                                        declaredField3.setAccessible(true);
                                    } catch (NoSuchFieldException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e7);
                                    }
                                    zvw.f = true;
                                }
                                Field field3 = zvw.e;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e8);
                                    }
                                    if (longSparseArray != null) {
                                        longSparseArray.clear();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i9 = this.s1;
            if (i9 != 0) {
                context.setTheme(i9);
                context.getTheme().applyStyle(this.s1, true);
            }
            if (z6 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof clz) {
                    if (((clz) activity2).x().i.compareTo(lkz.c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                        this.l.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                } else if (this.o1 && !this.p1) {
                    activity2.onConfigurationChanged(configuration2);
                    this.l.getDecorView().dispatchConfigurationChanged(configuration2);
                }
            }
        }
        if (ss00VarA2 != null) {
            LocaleList.setDefault(LocaleList.forLanguageTags(ss00.a(context.getResources().getConfiguration().getLocales().toLanguageTags()).f32705a.f34441a.toLanguageTags()));
        }
        if (i2 == 0) {
            P(context).I();
        } else {
            ld3 ld3Var = this.v1;
            if (ld3Var != null) {
                ld3Var.e();
            }
        }
        ld3 ld3Var2 = this.w1;
        if (i2 == 3) {
            if (ld3Var2 == null) {
                ld3Var2 = new ld3(this, context);
                this.w1 = ld3Var2;
            }
            ld3Var2.I();
        } else if (ld3Var2 != null) {
            ld3Var2.e();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    public final void F(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        ma3 ma3Var;
        int resourceId;
        if (this.l != null) {
            jf4.n("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof kd3) {
            jf4.n("AppCompat has already installed itself into the Window");
            return;
        }
        kd3 kd3Var = new kd3(this, callback);
        this.m = kd3Var;
        window.setCallback(kd3Var);
        Context context = this.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, H1);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            td3 td3VarA = td3.a();
            synchronized (td3VarA) {
                drawableE = td3VarA.f33746a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.E1) != null) {
            return;
        }
        Object obj = this.j;
        if (onBackInvokedDispatcher != null && (ma3Var = this.F1) != null) {
            c7.g(onBackInvokedDispatcher).unregisterOnBackInvokedCallback(c7.e(ma3Var));
            this.F1 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.E1 = activity.getOnBackInvokedDispatcher();
            } else {
                this.E1 = null;
            }
        } else {
            this.E1 = null;
        }
        Z();
    }

    public final void H(int i, od3 od3Var, ox30 ox30Var) {
        if (ox30Var == null) {
            if (od3Var == null && i >= 0) {
                od3[] od3VarArr = this.k1;
                if (i < od3VarArr.length) {
                    od3Var = od3VarArr[i];
                }
            }
            if (od3Var != null) {
                ox30Var = od3Var.h;
            }
        }
        if ((od3Var == null || od3Var.m) && !this.p1) {
            kd3 kd3Var = this.m;
            Window.Callback callback = this.l.getCallback();
            kd3Var.getClass();
            try {
                kd3Var.d = true;
                callback.onPanelClosed(i, ox30Var);
            } finally {
                kd3Var.d = false;
            }
        }
    }

    public final void I(ox30 ox30Var) {
        xi xiVar;
        if (this.j1) {
            return;
        }
        this.j1 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        actionBarOverlayLayout.j();
        ActionMenuView actionMenuView = ((rwq0) actionBarOverlayLayout.e).f31228a.f45299a;
        if (actionMenuView != null && (xiVar = actionMenuView.t) != null) {
            xiVar.j();
            ui uiVar = xiVar.t;
            if (uiVar != null && uiVar.b()) {
                uiVar.j.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.p1) {
            callback.onPanelClosed(108, ox30Var);
        }
        this.j1 = false;
    }

    public final void J(od3 od3Var, boolean z) {
        nd3 nd3Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        xi xiVar;
        if (z && od3Var.f25058a == 0 && (actionBarOverlayLayout = this.q) != null) {
            actionBarOverlayLayout.j();
            ActionMenuView actionMenuView = ((rwq0) actionBarOverlayLayout.e).f31228a.f45299a;
            if (actionMenuView != null && (xiVar = actionMenuView.t) != null && xiVar.k()) {
                I(od3Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && od3Var.m && (nd3Var = od3Var.e) != null) {
            windowManager.removeView(nd3Var);
            if (z) {
                H(od3Var.f25058a, od3Var, null);
            }
        }
        od3Var.k = false;
        od3Var.l = false;
        od3Var.m = false;
        od3Var.f = null;
        od3Var.n = true;
        if (this.l1 == od3Var) {
            this.l1 = null;
        }
        if (od3Var.f25058a == 0) {
            Z();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    public final boolean L(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        od3 od3VarQ;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean z2;
        boolean zX;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        xi xiVar;
        xi xiVar2;
        xi xiVar3;
        od3 od3VarQ2;
        Object obj = this.j;
        if ((!(obj instanceof hky) && !(obj instanceof rd3)) || (decorView = this.l.getDecorView()) == null || !rgu0.d(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                kd3 kd3Var = this.m;
                Window.Callback callback = this.l.getCallback();
                kd3Var.getClass();
                try {
                    kd3Var.c = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    kd3Var.c = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.m1 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    od3VarQ2 = Q(0);
                                    if (!od3VarQ2.m) {
                                        X(od3VarQ2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.t == null) {
                                    od3VarQ = Q(0);
                                    actionBarOverlayLayout = this.q;
                                    context = this.k;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.j();
                                        toolbar = ((rwq0) actionBarOverlayLayout.e).f31228a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f45299a) == null || !actionMenuView.s || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = od3VarQ.m;
                                            if (!z || od3VarQ.l) {
                                                J(od3VarQ, true);
                                                z2 = z;
                                            } else {
                                                if (od3VarQ.k) {
                                                    if (od3VarQ.o) {
                                                        od3VarQ.k = false;
                                                        zX = X(od3VarQ, keyEvent);
                                                    } else {
                                                        zX = true;
                                                    }
                                                    if (zX) {
                                                        V(od3VarQ, keyEvent);
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.q;
                                            actionBarOverlayLayout2.j();
                                            ActionMenuView actionMenuView2 = ((rwq0) actionBarOverlayLayout2.e).f31228a.f45299a;
                                            if (actionMenuView2 == null || (xiVar2 = actionMenuView2.t) == null || !xiVar2.k()) {
                                                if (!this.p1 && X(od3VarQ, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.q;
                                                    actionBarOverlayLayout3.j();
                                                    ActionMenuView actionMenuView3 = ((rwq0) actionBarOverlayLayout3.e).f31228a.f45299a;
                                                    if (actionMenuView3 != null && (xiVar = actionMenuView3.t) != null && xiVar.l()) {
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.q;
                                                actionBarOverlayLayout4.j();
                                                ActionMenuView actionMenuView4 = ((rwq0) actionBarOverlayLayout4.e).f31228a.f45299a;
                                                if (actionMenuView4 == null || (xiVar3 = actionMenuView4.t) == null || !xiVar3.j()) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z = od3VarQ.m;
                                        if (z) {
                                        }
                                        J(od3VarQ, true);
                                        z2 = z;
                                    }
                                    if (z2) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (U()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    kd3Var.c = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.m1 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            od3VarQ2 = Q(0);
                            if (!od3VarQ2.m) {
                                X(od3VarQ2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.t == null) {
                            od3VarQ = Q(0);
                            actionBarOverlayLayout = this.q;
                            context = this.k;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.j();
                                toolbar = ((rwq0) actionBarOverlayLayout.e).f31228a;
                                if (toolbar.getVisibility() == 0) {
                                    z = od3VarQ.m;
                                    if (z) {
                                    }
                                    J(od3VarQ, true);
                                    z2 = z;
                                } else {
                                    z = od3VarQ.m;
                                    if (z) {
                                    }
                                    J(od3VarQ, true);
                                    z2 = z;
                                }
                            } else {
                                z = od3VarQ.m;
                                if (z) {
                                }
                                J(od3VarQ, true);
                                z2 = z;
                            }
                            if (z2) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (U()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void M(int i) {
        od3 od3VarQ = Q(i);
        if (od3VarQ.h != null) {
            Bundle bundle = new Bundle();
            od3VarQ.h.t(bundle);
            if (bundle.size() > 0) {
                od3VarQ.p = bundle;
            }
            od3VarQ.h.w();
            od3VarQ.h.clear();
        }
        od3VarQ.o = true;
        od3VarQ.n = true;
        if ((i == 108 || i == 0) && this.q != null) {
            od3 od3VarQ2 = Q(0);
            od3VarQ2.k = false;
            X(od3VarQ2, null);
        }
    }

    public final void N() {
        ViewGroup viewGroup;
        if (this.y) {
            return;
        }
        Context context = this.k;
        int[] iArr = mqd0.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            jf4.n("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            y(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            y(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            y(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            y(10);
        }
        this.h1 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        O();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.i1) {
            viewGroup = this.g1 ? (ViewGroup) layoutInflaterFrom.inflate(org.xbet.client1.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(org.xbet.client1.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.h1) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(org.xbet.client1.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f1 = false;
            this.Z = false;
        } else if (this.Z) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(org.xbet.client1.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new tje(context, typedValue.resourceId) : context).inflate(org.xbet.client1.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(org.xbet.client1.R.id.decor_content_parent);
            this.q = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.l.getCallback());
            if (this.f1) {
                this.q.f(109);
            }
            if (this.B) {
                this.q.f(2);
            }
            if (this.Y) {
                this.q.f(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.Z);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f1);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.h1);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.g1);
            sb.append(", windowNoTitle: ");
            jf4.o(rw2.p(sb, this.i1, " }"));
            return;
        }
        peg0 peg0Var = new peg0((Object) this, (byte) 8);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewGroup, peg0Var);
        if (this.q == null) {
            this.A = (TextView) viewGroup.findViewById(org.xbet.client1.R.id.title);
        }
        boolean z = cmu0.f4626a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(org.xbet.client1.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new h03((Object) this, (byte) 11));
        this.z = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.p;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.q;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                qhv0 qhv0Var = this.n;
                if (qhv0Var != null) {
                    rwq0 rwq0Var = (rwq0) qhv0Var.e;
                    if (!rwq0Var.g) {
                        Toolbar toolbar = rwq0Var.f31228a;
                        rwq0Var.h = title;
                        if ((8 & rwq0Var.b) != 0) {
                            toolbar.setTitle(title);
                            if (rwq0Var.g) {
                                rgu0.p(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.A;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.z.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.y = true;
        od3 od3VarQ = Q(0);
        if (this.p1 || od3VarQ.h != null) {
            return;
        }
        S(108);
    }

    public final void O() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                F(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
            return;
        }
        jf4.n("We have not been given a Window");
    }

    public final c2 P(Context context) {
        ld3 ld3Var = this.v1;
        if (ld3Var == null) {
            yuu yuuVar = yuu.e;
            if (yuuVar == null) {
                Context applicationContext = context.getApplicationContext();
                yuuVar = new yuu(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                yuu.e = yuuVar;
            }
            ld3Var = new ld3(this, yuuVar);
            this.v1 = ld3Var;
        }
        return ld3Var;
    }

    public final od3 Q(int i) {
        od3[] od3VarArr = this.k1;
        if (od3VarArr == null || od3VarArr.length <= i) {
            od3[] od3VarArr2 = new od3[i + 1];
            if (od3VarArr != null) {
                System.arraycopy(od3VarArr, 0, od3VarArr2, 0, od3VarArr.length);
            }
            this.k1 = od3VarArr2;
            od3VarArr = od3VarArr2;
        }
        od3 od3Var = od3VarArr[i];
        if (od3Var != null) {
            return od3Var;
        }
        od3 od3Var2 = new od3();
        od3Var2.f25058a = i;
        od3Var2.n = false;
        od3VarArr[i] = od3Var2;
        return od3Var2;
    }

    public final void R() {
        qhv0 qhv0Var;
        N();
        if (this.Z && (qhv0Var = this.n) == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                qhv0Var = new qhv0((Activity) obj, this.f1);
                this.n = qhv0Var;
            } else if (obj instanceof Dialog) {
                qhv0Var = new qhv0((Dialog) obj);
                this.n = qhv0Var;
            }
            if (qhv0Var != null) {
                qhv0Var.d(this.A1);
            }
        }
    }

    public final void S(int i) {
        this.y1 = (1 << i) | this.y1;
        if (this.x1) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = rgu0.f30456a;
        decorView.postOnAnimation(this.z1);
        this.x1 = true;
    }

    public final int T(int i, Context context) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            jf4.n("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        ld3 ld3Var = this.w1;
                        if (ld3Var == null) {
                            ld3Var = new ld3(this, context);
                            this.w1 = ld3Var;
                        }
                        return ld3Var.k();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return P(context).k();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean U() {
        blj bljVar;
        fwq0 fwq0Var;
        boolean z = this.m1;
        this.m1 = false;
        od3 od3VarQ = Q(0);
        if (!od3VarQ.m) {
            xj xjVar = this.t;
            if (xjVar != null) {
                xjVar.c();
                return true;
            }
            R();
            qhv0 qhv0Var = this.n;
            if (qhv0Var == null || (bljVar = qhv0Var.e) == null || (fwq0Var = ((rwq0) bljVar).f31228a.p1) == null || fwq0Var.b == null) {
                return false;
            }
            fwq0 fwq0Var2 = ((rwq0) bljVar).f31228a.p1;
            hz30 hz30Var = fwq0Var2 == null ? null : fwq0Var2.b;
            if (hz30Var != null) {
                hz30Var.collapseActionView();
            }
        } else if (!z) {
            J(od3VarQ, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016f, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(a.od3 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pd3.V(a.od3, android.view.KeyEvent):void");
    }

    public final boolean W(od3 od3Var, int i, KeyEvent keyEvent) {
        ox30 ox30Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((od3Var.k || X(od3Var, keyEvent)) && (ox30Var = od3Var.h) != null) {
            return ox30Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ce A[PHI: r6
  0x00ce: PHI (r6v2 a.ox30) = (r6v1 a.ox30), (r6v8 a.ox30) binds: [B:31:0x004c, B:57:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    public final boolean X(od3 od3Var, KeyEvent keyEvent) {
        ox30 ox30Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        wsf0 wsf0Var;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.p1) {
            boolean z = od3Var.k;
            int i = od3Var.f25058a;
            if (z) {
                return true;
            }
            od3 od3Var2 = this.l1;
            if (od3Var2 != null && od3Var2 != od3Var) {
                J(od3Var2, false);
            }
            Window.Callback callback = this.l.getCallback();
            if (callback != null) {
                od3Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.q) != null) {
                actionBarOverlayLayout4.j();
                ((rwq0) actionBarOverlayLayout4.e).l = true;
            }
            if (od3Var.g == null) {
                ox30 ox30Var2 = od3Var.h;
                if (ox30Var2 == null || od3Var.o) {
                    if (ox30Var2 == null) {
                        Context context = this.k;
                        if ((i == 0 || i == 108) && this.q != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(org.xbet.client1.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(org.xbet.client1.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(org.xbet.client1.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                tje tjeVar = new tje(context, 0);
                                tjeVar.getTheme().setTo(themeNewTheme);
                                context = tjeVar;
                            }
                        }
                        ox30 ox30Var3 = new ox30(context);
                        ox30Var3.e = this;
                        ox30 ox30Var4 = od3Var.h;
                        if (ox30Var3 != ox30Var4) {
                            if (ox30Var4 != null) {
                                ox30Var4.r(od3Var.i);
                            }
                            od3Var.h = ox30Var3;
                            hf00 hf00Var = od3Var.i;
                            if (hf00Var != null) {
                                ox30Var3.b(hf00Var, ox30Var3.f25992a);
                            }
                        }
                        ox30Var2 = od3Var.h;
                        if (ox30Var2 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.q) != null) {
                                wsf0Var = this.r;
                                if (wsf0Var == null) {
                                    wsf0Var = new wsf0((Object) this, (byte) 7);
                                    this.r = wsf0Var;
                                }
                                actionBarOverlayLayout2.l(ox30Var2, wsf0Var);
                            }
                            od3Var.h.w();
                            if (callback.onCreatePanelMenu(i, od3Var.h)) {
                                od3Var.o = false;
                            } else {
                                ox30Var = od3Var.h;
                                if (ox30Var != null) {
                                    if (ox30Var != null) {
                                        ox30Var.r(od3Var.i);
                                    }
                                    od3Var.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.q) != null) {
                                    actionBarOverlayLayout.l(null, this.r);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            wsf0Var = this.r;
                            if (wsf0Var == null) {
                                wsf0Var = new wsf0((Object) this, (byte) 7);
                                this.r = wsf0Var;
                            }
                            actionBarOverlayLayout2.l(ox30Var2, wsf0Var);
                        }
                        od3Var.h.w();
                        if (callback.onCreatePanelMenu(i, od3Var.h)) {
                            ox30Var = od3Var.h;
                            if (ox30Var != null) {
                                if (ox30Var != null) {
                                    ox30Var.r(od3Var.i);
                                }
                                od3Var.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l(null, this.r);
                            }
                        } else {
                            od3Var.o = false;
                        }
                    }
                }
                od3Var.h.w();
                Bundle bundle = od3Var.p;
                if (bundle != null) {
                    od3Var.h.s(bundle);
                    od3Var.p = null;
                }
                if (!callback.onPreparePanel(0, od3Var.g, od3Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.q) != null) {
                        actionBarOverlayLayout3.l(null, this.r);
                    }
                    od3Var.h.v();
                    return false;
                }
                od3Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                od3Var.h.v();
            }
            od3Var.k = true;
            od3Var.l = false;
            this.l1 = od3Var;
            return true;
        }
        return false;
    }

    public final void Y() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Z() {
        ma3 ma3Var;
        if (Build.VERSION.SDK_INT >= 33) {
            byte b = 1;
            boolean z = false;
            if (this.E1 != null && (Q(0).m || this.t != null)) {
                z = true;
            }
            if (z && this.F1 == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.E1;
                ma3 ma3Var2 = new ma3(this, b);
                c7.g(onBackInvokedDispatcher).registerOnBackInvokedCallback(1000000, ma3Var2);
                this.F1 = ma3Var2;
                return;
            }
            if (z || (ma3Var = this.F1) == null) {
                return;
            }
            c7.g(this.E1).unregisterOnBackInvokedCallback(c7.e(ma3Var));
            this.F1 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // a.mx30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(a.ox30 r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pd3.a(a.ox30):void");
    }

    @Override // a.hd3
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        N();
        ((ViewGroup) this.z.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // a.hd3
    public final Context e(Context context) {
        Configuration configuration;
        this.n1 = true;
        int i = this.r1;
        if (i == -100) {
            i = hd3.b;
        }
        int iT = T(i, context);
        byte b = 0;
        if (hd3.o(context) && hd3.o(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (hd3.i) {
                    try {
                        ss00 ss00Var = hd3.c;
                        if (ss00Var == null) {
                            ss00 ss00VarA = hd3.d;
                            if (ss00VarA == null) {
                                ss00VarA = ss00.a(jd8.j0(context));
                                hd3.d = ss00VarA;
                            }
                            if (!ss00VarA.b()) {
                                hd3.c = hd3.d;
                            }
                        } else if (!ss00Var.equals(hd3.d)) {
                            ss00 ss00Var2 = hd3.c;
                            hd3.d = ss00Var2;
                            jd8.g0(context, ss00Var2.f32705a.f34441a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!hd3.f) {
                hd3.f12850a.execute(new fd3(context, b));
            }
        }
        ss00 ss00VarG = G(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(K(context, iT, ss00VarG, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof tje) {
            try {
                ((tje) context).a(K(context, iT, ss00VarG, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!I1) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = configuration3.mcc;
                int i3 = configuration4.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = configuration3.mnc;
                int i5 = configuration4.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                LocaleList locales = configuration3.getLocales();
                LocaleList locales2 = configuration4.getLocales();
                if (!locales.equals(locales2)) {
                    configuration.setLocales(locales2);
                    configuration.locale = configuration4.locale;
                }
                int i6 = configuration3.touchscreen;
                int i7 = configuration4.touchscreen;
                if (i6 != i7) {
                    configuration.touchscreen = i7;
                }
                int i8 = configuration3.keyboard;
                int i9 = configuration4.keyboard;
                if (i8 != i9) {
                    configuration.keyboard = i9;
                }
                int i10 = configuration3.keyboardHidden;
                int i11 = configuration4.keyboardHidden;
                if (i10 != i11) {
                    configuration.keyboardHidden = i11;
                }
                int i12 = configuration3.navigation;
                int i13 = configuration4.navigation;
                if (i12 != i13) {
                    configuration.navigation = i13;
                }
                int i14 = configuration3.navigationHidden;
                int i15 = configuration4.navigationHidden;
                if (i14 != i15) {
                    configuration.navigationHidden = i15;
                }
                int i16 = configuration3.orientation;
                int i17 = configuration4.orientation;
                if (i16 != i17) {
                    configuration.orientation = i17;
                }
                int i18 = configuration3.screenLayout & 15;
                int i19 = configuration4.screenLayout & 15;
                if (i18 != i19) {
                    configuration.screenLayout |= i19;
                }
                int i20 = configuration3.screenLayout & 192;
                int i21 = configuration4.screenLayout & 192;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 48;
                int i23 = configuration4.screenLayout & 48;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 768;
                int i25 = configuration4.screenLayout & 768;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                }
                int i26 = configuration3.uiMode & 15;
                int i27 = configuration4.uiMode & 15;
                if (i26 != i27) {
                    configuration.uiMode |= i27;
                }
                int i28 = configuration3.uiMode & 48;
                int i29 = configuration4.uiMode & 48;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.screenWidthDp;
                int i31 = configuration4.screenWidthDp;
                if (i30 != i31) {
                    configuration.screenWidthDp = i31;
                }
                int i32 = configuration3.screenHeightDp;
                int i33 = configuration4.screenHeightDp;
                if (i32 != i33) {
                    configuration.screenHeightDp = i33;
                }
                int i34 = configuration3.smallestScreenWidthDp;
                int i35 = configuration4.smallestScreenWidthDp;
                if (i34 != i35) {
                    configuration.smallestScreenWidthDp = i35;
                }
                int i36 = configuration3.densityDpi;
                int i37 = configuration4.densityDpi;
                if (i36 != i37) {
                    configuration.densityDpi = i37;
                }
            }
        }
        Configuration configurationK = K(context, iT, ss00VarG, configuration, true);
        tje tjeVar = new tje(context, org.xbet.client1.R.style.Theme_AppCompat_Empty);
        tjeVar.a(configurationK);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = tjeVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    sf3.t(theme);
                } else {
                    synchronized (eeq.n) {
                        if (!eeq.p) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                eeq.o = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException e) {
                                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                            }
                            eeq.p = true;
                        }
                        Method method = eeq.o;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e2) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                eeq.o = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused3) {
        }
        return tjeVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // a.mx30
    public final boolean f(ox30 ox30Var, MenuItem menuItem) {
        od3 od3Var;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.p1) {
            ox30 ox30VarK = ox30Var.k();
            od3[] od3VarArr = this.k1;
            int length = od3VarArr != null ? od3VarArr.length : 0;
            for (int i = 0; i < length; i++) {
                od3Var = od3VarArr[i];
                if (od3Var != null && od3Var.h == ox30VarK) {
                    if (od3Var != null) {
                        return callback.onMenuItemSelected(od3Var.f25058a, menuItem);
                    }
                }
            }
            od3Var = null;
            if (od3Var != null) {
                return callback.onMenuItemSelected(od3Var.f25058a, menuItem);
            }
        }
        return false;
    }

    @Override // a.hd3
    public final View g(View view, String str, Context context, AttributeSet attributeSet) {
        View zd3Var;
        ye3 ye3Var = this.D1;
        View view2 = null;
        if (ye3Var == null) {
            int[] iArr = mqd0.j;
            Context context2 = this.k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                ye3Var = new ye3();
                this.D1 = ye3Var;
            } else {
                try {
                    ye3Var = (ye3) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.D1 = ye3Var;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    ye3Var = new ye3();
                    this.D1 = ye3Var;
                }
            }
        }
        ye3Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, mqd0.z, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context tjeVar = (resourceId == 0 || ((context instanceof tje) && ((tje) context).f34043a == resourceId)) ? context : new tje(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                zd3Var = new zd3(tjeVar, attributeSet);
                break;
            case 1:
                zd3Var = new dd3(tjeVar, attributeSet);
                break;
            case 2:
                zd3Var = new wd3(tjeVar, attributeSet);
                break;
            case 3:
                zd3Var = ye3Var.e(tjeVar, attributeSet);
                break;
            case 4:
                zd3Var = new AppCompatImageButton(tjeVar, attributeSet);
                break;
            case 5:
                zd3Var = new ae3(tjeVar, attributeSet);
                break;
            case 6:
                zd3Var = new androidx.appcompat.widget.b(tjeVar, attributeSet);
                break;
            case 7:
                zd3Var = ye3Var.d(tjeVar, attributeSet);
                break;
            case 8:
                zd3Var = new we3(tjeVar, attributeSet);
                break;
            case 9:
                zd3Var = new AppCompatImageView(tjeVar, attributeSet);
                break;
            case 10:
                zd3Var = ye3Var.a(tjeVar, attributeSet);
                break;
            case 11:
                zd3Var = ye3Var.c(tjeVar, attributeSet);
                break;
            case 12:
                zd3Var = new AppCompatEditText(tjeVar, attributeSet);
                break;
            case 13:
                zd3Var = ye3Var.b(tjeVar, attributeSet);
                break;
            default:
                zd3Var = null;
                break;
        }
        if (zd3Var == null && context != tjeVar) {
            Object[] objArr = ye3Var.f42468a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = tjeVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = ye3.g;
                        if (i < 3) {
                            View viewF = ye3Var.f(tjeVar, str, strArr[i]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = ye3Var.f(tjeVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            zd3Var = view2;
        }
        if (zd3Var != null) {
            Context context3 = zd3Var.getContext();
            if ((context3 instanceof ContextWrapper) && zd3Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, ye3.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    zd3Var.setOnClickListener(new xe3(zd3Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = tjeVar.obtainStyledAttributes(attributeSet, ye3.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    new egu0(org.xbet.client1.R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 3).a(zd3Var, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = tjeVar.obtainStyledAttributes(attributeSet, ye3.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    rgu0.p(zd3Var, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = tjeVar.obtainStyledAttributes(attributeSet, ye3.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = rgu0.f30456a;
                    new egu0(org.xbet.client1.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, (byte) 0).a(zd3Var, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return zd3Var;
    }

    @Override // a.hd3
    public final View h(int i) {
        N();
        return this.l.findViewById(i);
    }

    @Override // a.hd3
    public final Context i() {
        return this.k;
    }

    @Override // a.hd3
    public final int j() {
        return this.r1;
    }

    @Override // a.hd3
    public final MenuInflater k() {
        njn0 njn0Var = this.o;
        if (njn0Var == null) {
            R();
            qhv0 qhv0Var = this.n;
            njn0Var = new njn0(qhv0Var != null ? qhv0Var.b() : this.k);
            this.o = njn0Var;
        }
        return njn0Var;
    }

    @Override // a.hd3
    public final qhv0 l() {
        R();
        return this.n;
    }

    @Override // a.hd3
    public final void m() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof pd3) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // a.hd3
    public final void n() {
        if (this.n != null) {
            R();
            this.n.getClass();
            S(0);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return g(null, str, context, attributeSet);
    }

    @Override // a.hd3
    public final void p(Configuration configuration) {
        if (this.Z && this.y) {
            R();
            qhv0 qhv0Var = this.n;
            if (qhv0Var != null) {
                qhv0Var.e(qhv0Var.f28761a.getResources().getBoolean(org.xbet.client1.R.bool.abc_action_bar_embed_tabs));
            }
        }
        td3 td3VarA = td3.a();
        Context context = this.k;
        synchronized (td3VarA) {
            dtf0 dtf0Var = td3VarA.f33746a;
            synchronized (dtf0Var) {
                u710 u710Var = (u710) dtf0Var.b.get(context);
                if (u710Var != null) {
                    u710Var.a();
                }
            }
        }
        this.q1 = new Configuration(this.k.getResources().getConfiguration());
        E(false, false);
    }

    @Override // a.hd3
    public final void q(Bundle bundle) {
        String strD;
        this.n1 = true;
        E(false, true);
        O();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strD = uvw.D(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strD = null;
            }
            if (strD != null) {
                qhv0 qhv0Var = this.n;
                if (qhv0Var == null) {
                    this.A1 = true;
                } else {
                    qhv0Var.d(true);
                }
            }
            hd3.b(this);
        }
        this.q1 = new Configuration(this.k.getResources().getConfiguration());
        this.o1 = true;
    }

    @Override // a.hd3
    public final void r() {
        nuj0 nuj0Var = G1;
        int i = this.r1;
        Object obj = this.j;
        boolean z = obj instanceof Activity;
        if (z) {
            synchronized (hd3.h) {
                hd3.x(this);
            }
        }
        if (this.x1) {
            this.l.getDecorView().removeCallbacks(this.z1);
        }
        this.p1 = true;
        if (i != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            nuj0Var.put(obj.getClass().getName(), Integer.valueOf(i));
        } else {
            nuj0Var.remove(obj.getClass().getName());
        }
        ld3 ld3Var = this.v1;
        if (ld3Var != null) {
            ld3Var.e();
        }
        ld3 ld3Var2 = this.w1;
        if (ld3Var2 != null) {
            ld3Var2.e();
        }
    }

    @Override // a.hd3
    public final void s(Bundle bundle) {
        N();
    }

    @Override // a.hd3
    public final void t() {
        R();
        qhv0 qhv0Var = this.n;
        if (qhv0Var != null) {
            qhv0Var.t = true;
        }
    }

    @Override // a.hd3
    public final void v() {
        E(true, false);
    }

    @Override // a.hd3
    public final void w() {
        R();
        qhv0 qhv0Var = this.n;
        if (qhv0Var != null) {
            qhv0Var.t = false;
            bku0 bku0Var = qhv0Var.s;
            if (bku0Var != null) {
                bku0Var.a();
            }
        }
    }

    @Override // a.hd3
    public final boolean y(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.i1 && i == 108) {
            return false;
        }
        if (this.Z && i == 1) {
            this.Z = false;
        }
        if (i == 1) {
            Y();
            this.i1 = true;
            return true;
        }
        if (i == 2) {
            Y();
            this.B = true;
            return true;
        }
        if (i == 5) {
            Y();
            this.Y = true;
            return true;
        }
        if (i == 10) {
            Y();
            this.g1 = true;
            return true;
        }
        if (i == 108) {
            Y();
            this.Z = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        Y();
        this.f1 = true;
        return true;
    }

    @Override // a.hd3
    public final void z(int i) {
        N();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }
}
