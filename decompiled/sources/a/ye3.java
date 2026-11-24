package a;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public class ye3 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final nuj0 h = new nuj0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f42468a = new Object[2];

    public zc3 a(Context context, AttributeSet attributeSet) {
        return new zc3(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public cd3 c(Context context, AttributeSet attributeSet) {
        return new cd3(context, attributeSet, org.xbet.client1.R.attr.checkboxStyle);
    }

    public yd3 d(Context context, AttributeSet attributeSet) {
        return new yd3(context, attributeSet, org.xbet.client1.R.attr.radioButtonStyle);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        nuj0 nuj0Var = h;
        Constructor constructor = (Constructor) nuj0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            nuj0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f42468a);
    }
}
