package com.google.android.material.theme;

import a.cd3;
import a.nh30;
import a.yd3;
import a.ye3;
import a.zc3;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.b;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textview.MaterialTextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends ye3 {
    @Override // a.ye3
    public final zc3 a(Context context, AttributeSet attributeSet) {
        return new nh30(context, attributeSet);
    }

    @Override // a.ye3
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // a.ye3
    public final cd3 c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // a.ye3
    public final yd3 d(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // a.ye3
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
