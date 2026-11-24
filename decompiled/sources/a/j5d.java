package a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class j5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypedValue f15927a = new TypedValue();

    public static int a(Context context, int i, boolean z) {
        context.getClass();
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = f15927a;
        theme.resolveAttribute(i, typedValue, true);
        return z ? typedValue.resourceId : typedValue.data;
    }

    public static int b(Pair[] pairArr, float f) {
        pairArr.getClass();
        if (pairArr.length == 0) {
            jf4.o("Failed requirement.");
            return 0;
        }
        if (pairArr.length == 1) {
            return ((Number) pairArr[0].f46059a).intValue();
        }
        if (f <= ((Number) pairArr[0].b).floatValue()) {
            return ((Number) pairArr[0].f46059a).intValue();
        }
        if (f >= ((Number) pairArr[pairArr.length - 1].b).floatValue()) {
            return ((Number) pairArr[pairArr.length - 1].f46059a).intValue();
        }
        int length = pairArr.length;
        for (int i = 1; i < length; i++) {
            if (f <= ((Number) pairArr[i].b).floatValue()) {
                int i2 = i - 1;
                float fFloatValue = (f - ((Number) pairArr[i2].b).floatValue()) / (((Number) pairArr[i].b).floatValue() - ((Number) pairArr[i2].b).floatValue());
                int iIntValue = ((Number) pairArr[i2].f46059a).intValue();
                int iIntValue2 = ((Number) pairArr[i].f46059a).intValue();
                float f2 = 1.0f - fFloatValue;
                return Color.argb((int) Math.floor((Color.alpha(iIntValue2) * fFloatValue) + (Color.alpha(iIntValue) * f2)), (int) Math.floor((Color.red(iIntValue2) * fFloatValue) + (Color.red(iIntValue) * f2)), (int) Math.floor((Color.green(iIntValue2) * fFloatValue) + (Color.green(iIntValue) * f2)), (int) Math.floor((Color.blue(iIntValue2) * fFloatValue) + (Color.blue(iIntValue) * f2)));
            }
        }
        return 0;
    }

    public static ColorStateList c(Context context, int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{context.getColor(i), context.getColor(i2)});
    }

    public static ColorStateList d(Context context, int i, int i2) {
        context.getClass();
        return new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{a(context, i, false), a(context, i2, false)});
    }

    public static int e(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }
}
