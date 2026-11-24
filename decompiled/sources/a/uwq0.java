package a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.CommonCode;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class uwq0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static uwq0 k;
    public static uwq0 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f36405a;
    public final CharSequence b;
    public final int c;
    public final twq0 d;
    public final twq0 e;
    public int f;
    public int g;
    public ywq0 h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r0v0, types: [a.twq0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.twq0] */
    public uwq0(View view, CharSequence charSequence) {
        final byte b = 0;
        this.d = new Runnable(this) { // from class: a.twq0
            public final /* synthetic */ uwq0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                uwq0 uwq0Var = this.b;
                switch (b2) {
                    case 0:
                        uwq0Var.c(false);
                        break;
                    default:
                        uwq0Var.a();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.e = new Runnable(this) { // from class: a.twq0
            public final /* synthetic */ uwq0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                uwq0 uwq0Var = this.b;
                switch (b3) {
                    case 0:
                        uwq0Var.c(false);
                        break;
                    default:
                        uwq0Var.a();
                        break;
                }
            }
        };
        this.f36405a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = xgu0.f40856a;
        this.c = Build.VERSION.SDK_INT >= 28 ? ia3.x(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(uwq0 uwq0Var) {
        uwq0 uwq0Var2 = k;
        if (uwq0Var2 != null) {
            uwq0Var2.f36405a.removeCallbacks(uwq0Var2.d);
        }
        k = uwq0Var;
        if (uwq0Var != null) {
            uwq0Var.f36405a.postDelayed(uwq0Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        uwq0 uwq0Var = l;
        View view = this.f36405a;
        if (uwq0Var == this) {
            l = null;
            ywq0 ywq0Var = this.h;
            if (ywq0Var != null) {
                View view2 = (View) ywq0Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) ywq0Var.f43384a).getSystemService("window")).removeView(view2);
                }
                this.h = null;
                this.j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f36405a;
        if (view.isAttachedToWindow()) {
            b(null);
            uwq0 uwq0Var = l;
            if (uwq0Var != null) {
                uwq0Var.a();
            }
            l = this;
            this.i = z;
            Context context = view.getContext();
            ywq0 ywq0Var = new ywq0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            ywq0Var.d = layoutParams;
            ywq0Var.e = new Rect();
            ywq0Var.f = new int[2];
            ywq0Var.g = new int[2];
            ywq0Var.f43384a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            ywq0Var.b = viewInflate;
            ywq0Var.c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(ywq0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = CommonCode.BusInterceptor.PRIVACY_CANCEL;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) ywq0Var.b;
            Context context2 = (Context) ywq0Var.f43384a;
            this.h = ywq0Var;
            int width = this.f;
            int i4 = this.g;
            boolean z2 = this.i;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) ywq0Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) ywq0Var.c).setText(this.b);
            int[] iArr = (int[]) ywq0Var.g;
            int[] iArr2 = (int[]) ywq0Var.f;
            Rect rect = (Rect) ywq0Var.e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams2.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams2.y = i8;
                    } else {
                        layoutParams2.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams2.y = i9;
                } else {
                    layoutParams2.y = i8;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.i) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = rgu0.f30456a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            twq0 twq0Var = this.e;
            view.removeCallbacks(twq0Var);
            view.postDelayed(twq0Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.h == null || !this.i) {
            View view2 = this.f36405a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.j = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.h == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.j) {
                        this.f = x;
                        this.g = y;
                        this.j = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.f);
                        int i = this.c;
                        if (iAbs > i || Math.abs(y - this.g) > i) {
                            this.f = x;
                            this.g = y;
                            this.j = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
