package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class of00 implements tsj0 {
    public static final Method A;
    public static final Method B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25143a;
    public ListAdapter b;
    public hil c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public bwf n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final xd3 z;
    public final int d = -2;
    public int e = -2;
    public final short h = 1002;
    public int l = 0;
    public final int m = Integer.MAX_VALUE;
    public final lf00 r = new lf00(this, (byte) 1);
    public final nf00 s = new nf00(this, (byte) 0);
    public final mf00 t = new mf00(this);
    public final lf00 u = new lf00(this, (byte) 0);
    public final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public of00(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f25143a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mqd0.o, i, i2);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        xd3 xd3Var = new xd3(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, mqd0.s, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            xd3Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        xd3Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : epv0.U(resourceId, context));
        typedArrayObtainStyledAttributes2.recycle();
        this.z = xd3Var;
        xd3Var.setInputMethodMode(1);
    }

    public hil a(Context context, boolean z) {
        return new hil(context, z);
    }

    public final void b(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }

    @Override // a.tsj0
    public final void dismiss() {
        xd3 xd3Var = this.z;
        xd3Var.dismiss();
        xd3Var.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final Drawable e() {
        return this.z.getBackground();
    }

    @Override // a.tsj0
    public final boolean f() {
        return this.z.isShowing();
    }

    public final int g() {
        return this.f;
    }

    public final void h(int i) {
        this.f = i;
    }

    public final void k(int i) {
        this.g = i;
        this.i = true;
    }

    public final int n() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        bwf bwfVar = this.n;
        if (bwfVar == null) {
            this.n = new bwf(this, (byte) 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bwfVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        hil hilVar = this.c;
        if (hilVar != null) {
            hilVar.setAdapter(this.b);
        }
    }

    @Override // a.tsj0
    public final void q() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        hil hilVar;
        hil hilVar2 = this.c;
        Context context = this.f25143a;
        xd3 xd3Var = this.z;
        if (hilVar2 == null) {
            hil hilVarA = a(context, !this.y);
            this.c = hilVarA;
            hilVarA.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new kf00(this, (byte) 0));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            xd3Var.setContentView(this.c);
        }
        Drawable background = xd3Var.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = xd3Var.getMaxAvailableHeight(this.o, this.g, xd3Var.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA = this.c.a(iMakeMeasureSpec, maxAvailableHeight);
            paddingBottom = iA + (iA > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = xd3Var.getInputMethodMode() == 2;
        xd3Var.setWindowLayoutType(this.h);
        if (xd3Var.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        xd3Var.setWidth(i5 == -1 ? -1 : 0);
                        xd3Var.setHeight(0);
                    } else {
                        xd3Var.setWidth(i5 == -1 ? -1 : 0);
                        xd3Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                xd3Var.setOutsideTouchable(true);
                View view = this.o;
                int i6 = width;
                int i7 = this.f;
                int i8 = this.g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                xd3Var.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        xd3Var.setWidth(width2);
        xd3Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(xd3Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            sf3.D(xd3Var);
        }
        xd3Var.setOutsideTouchable(true);
        xd3Var.setTouchInterceptor(this.s);
        if (this.k) {
            xd3Var.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(xd3Var, this.x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            sf3.B(xd3Var, this.x);
        }
        xd3Var.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (hilVar = this.c) != null) {
            hilVar.setListSelectionHidden(true);
            hilVar.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    @Override // a.tsj0
    public final hil r() {
        return this.c;
    }

    public final void s(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }
}
