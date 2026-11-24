package androidx.preference;

import a.kqd0;
import a.zsm0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iL = zsm0.l(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kqd0.f18719a, iL, 0);
        if (typedArrayObtainStyledAttributes.getString(5) == null) {
            typedArrayObtainStyledAttributes.getString(0);
        }
        if (typedArrayObtainStyledAttributes.getString(4) == null) {
            typedArrayObtainStyledAttributes.getString(1);
        }
        typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
