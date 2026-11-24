package a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m5d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypedValue f21214a = new TypedValue();

    public static final ColorStateList a(Context context, int i, int i2) {
        context.getClass();
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[0]}, new int[]{i, i2});
    }

    public static int b(int i, Context context) {
        Resources.Theme theme = context.getTheme();
        theme.getClass();
        context.getClass();
        return f(context, i, false, theme);
    }

    public static int c(int i, Context context) {
        Resources.Theme theme = context.getTheme();
        theme.getClass();
        context.getClass();
        Resources resources = context.getResources();
        ThreadLocal threadLocal = itf0.f15351a;
        return resources.getColor(i, theme);
    }

    public static final ColorStateList d(Integer num, Integer num2) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{num2.intValue(), num.intValue()});
    }

    public static final Resources.Theme e(int i, Context context) {
        context.getClass();
        Resources.Theme themeNewTheme = context.getResources().newTheme();
        themeNewTheme.applyStyle(i, true);
        return themeNewTheme;
    }

    public static final int f(Context context, int i, boolean z, Resources.Theme theme) {
        context.getClass();
        theme.getClass();
        TypedValue typedValue = f21214a;
        theme.resolveAttribute(i, typedValue, true);
        return z ? typedValue.resourceId : typedValue.data;
    }

    public static /* synthetic */ int g(Context context, int i, int i2) {
        Resources.Theme theme = context.getTheme();
        theme.getClass();
        return f(context, i, true, theme);
    }
}
