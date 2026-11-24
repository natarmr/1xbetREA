package androidx.preference;

import a.kqd0;
import a.pek;
import a.zsm0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iL = zsm0.l(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kqd0.c, iL, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            pek pekVar = pek.f26858a;
            if (pekVar == null) {
                pekVar = new pek();
                pek.f26858a = pekVar;
            }
            this.g = pekVar;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
