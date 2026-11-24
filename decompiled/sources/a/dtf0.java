package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class dtf0 {
    public static dtf0 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f6654a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public esg0 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final p06 h = new p06(6, 1);

    public static synchronized dtf0 c() {
        dtf0 dtf0Var;
        dtf0Var = g;
        if (dtf0Var == null) {
            dtf0Var = new dtf0();
            g = dtf0Var;
        }
        return dtf0Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        p06 p06Var = h;
        p06Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) p06Var.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, goq0 goq0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = goq0Var.d;
        if (!z && !goq0Var.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? goq0Var.f11644a : null;
        PorterDuff.Mode mode = goq0Var.c ? goq0Var.b : f;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterF = f(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.f6654a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.f6654a = weakHashMap;
        }
        gnk0 gnk0Var = (gnk0) weakHashMap.get(context);
        if (gnk0Var == null) {
            gnk0Var = new gnk0(0);
            this.f6654a.put(context, gnk0Var);
        }
        int i2 = gnk0Var.c;
        if (i2 != 0 && i <= gnk0Var.f11593a[i2 - 1]) {
            gnk0Var.c(i, colorStateList);
            return;
        }
        if (i2 >= gnk0Var.f11593a.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            gnk0Var.f11593a = Arrays.copyOf(gnk0Var.f11593a, i6);
            gnk0Var.b = Arrays.copyOf(gnk0Var.b, i6);
        }
        gnk0Var.f11593a[i2] = i;
        gnk0Var.b[i2] = colorStateList;
        gnk0Var.c = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    public final Drawable b(int i, Context context) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableV;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            u710 u710Var = (u710) this.b.get(context);
            obj = null;
            if (u710Var != null && (weakReference = (WeakReference) u710Var.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    u710Var.g(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e == null) {
            layerDrawableV = null;
        } else if (i == R.drawable.abc_cab_background_top_material) {
            layerDrawableV = new LayerDrawable(new Drawable[]{d(R.drawable.abc_cab_background_internal_bg, context), d(R.drawable.abc_cab_background_top_mtrl_alpha, context)});
        } else if (i == R.drawable.abc_ratingbar_material) {
            layerDrawableV = esg0.V(this, context, R.dimen.abc_star_big);
        } else if (i == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableV = esg0.V(this, context, R.dimen.abc_star_medium);
        } else if (i == R.drawable.abc_ratingbar_small_material) {
            layerDrawableV = esg0.V(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableV = null;
        }
        if (layerDrawableV == null) {
            return layerDrawableV;
        }
        layerDrawableV.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableV.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableV;
                }
                u710 u710Var2 = (u710) this.b.get(context);
                if (u710Var2 == null) {
                    u710Var2 = new u710(obj);
                    this.b.put(context, u710Var2);
                }
                u710Var2.f(new WeakReference(constantState2), j);
                return layerDrawableV;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(int i, Context context) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(R.drawable.abc_vector_test, context);
                if (drawableD == null || (!(drawableD instanceof n4u0) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(i, context);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                qhl.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(int i, Context context) {
        ColorStateList colorStateList;
        gnk0 gnk0Var;
        WeakHashMap weakHashMap = this.f6654a;
        ColorStateList colorStateListW = null;
        colorStateList = (weakHashMap == null || (gnk0Var = (gnk0) weakHashMap.get(context)) == null) ? null : (ColorStateList) j2e.L(gnk0Var, i);
        if (colorStateList == null) {
            esg0 esg0Var = this.e;
            if (esg0Var != null) {
                colorStateListW = esg0Var.W(i, context);
            }
            if (colorStateListW != null) {
                a(context, i, colorStateListW);
            }
            colorStateList = colorStateListW;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[RETURN] */
    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        int iRound;
        ColorStateList colorStateListG = g(i, context);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        esg0 esg0Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (esg0Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = ybq0.c(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode2 = td3.b;
                esg0.B0(drawableFindDrawableByLayerId, iC, mode2);
                esg0.B0(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ybq0.c(R.attr.colorControlNormal, context), mode2);
                esg0.B0(layerDrawable.findDrawableByLayerId(android.R.id.progress), ybq0.c(R.attr.colorControlActivated, context), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = ybq0.b(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode3 = td3.b;
                esg0.B0(drawableFindDrawableByLayerId2, iB, mode3);
                esg0.B0(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ybq0.c(R.attr.colorControlActivated, context), mode3);
                esg0.B0(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ybq0.c(R.attr.colorControlActivated, context), mode3);
                return drawable;
            }
        }
        if (esg0Var != null) {
            PorterDuff.Mode mode4 = td3.b;
            boolean z2 = true;
            if (esg0.p((int[]) esg0Var.f8326a, i)) {
                iRound = -1;
            } else {
                if (esg0.p((int[]) esg0Var.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zP = esg0.p((int[]) esg0Var.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zP) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z2 = false;
                    }
                }
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(td3.c(ybq0.c(i2, context), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                    return drawable;
                }
            } else if (z) {
                return null;
            }
        } else if (z) {
            return null;
        }
        return drawable;
    }
}
