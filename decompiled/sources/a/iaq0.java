package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.TextView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iaq0 {
    public static final void a(int i, TextView textView) {
        Object g0g0Var;
        Context context = textView.getContext();
        context.getClass();
        int[] iArr = bqd0.s0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        Context context2 = textView.getContext();
        context2.getClass();
        ColorStateList colorStateListM = ktt0.m(2, context2, typedArrayObtainStyledAttributes);
        if (colorStateListM != null) {
            textView.setTextColor(colorStateListM);
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            tnq0.i(typedArrayObtainStyledAttributes, 9);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
            tnq0.i(typedArrayObtainStyledAttributes, 8);
            aem0.r(textView, dimension, (int) typedArrayObtainStyledAttributes.getDimension(8, 0.0f), 1, 1);
            tnq0.i(typedArrayObtainStyledAttributes, 10);
            aem0.s(typedArrayObtainStyledAttributes.getInt(10, 0), textView);
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            aem0.s(0, textView);
        }
        try {
            tnq0.i(typedArrayObtainStyledAttributes, 3);
            textView.setMaxLines(typedArrayObtainStyledAttributes.getInt(3, 0));
        } catch (Throwable unused) {
            e0g0 e0g0Var3 = j0g0.b;
        }
        try {
            tnq0.i(typedArrayObtainStyledAttributes, 7);
            textView.setTextAlignment(typedArrayObtainStyledAttributes.getInt(7, 0));
        } catch (Throwable unused2) {
            e0g0 e0g0Var4 = j0g0.b;
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context3 = textView.getContext();
        context3.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(i, iArr);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        if (resourceId > 0) {
            textView.setTextAppearance(resourceId);
            Context context4 = textView.getContext();
            context4.getClass();
            TypedArray typedArrayObtainStyledAttributes3 = context4.obtainStyledAttributes(resourceId, iArr);
            textView.setAllCaps(typedArrayObtainStyledAttributes3.getBoolean(5, false));
            typedArrayObtainStyledAttributes3.recycle();
        }
        typedArrayObtainStyledAttributes2.recycle();
    }
}
