package com.google.android.material.timepicker;

import a.c46;
import a.hp2;
import a.rbc;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f45582a;
    public final EditText b;
    public final TextView c;
    public String d;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = "";
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f45582a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new rbc(this, (byte) 0));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.c = textView;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
        new c46(this, (byte) 3);
    }

    public final String a(CharSequence charSequence) {
        try {
            return String.format(getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f45582a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        Chip chip = this.f45582a;
        chip.setChecked(z);
        if (z) {
            chip.setText("");
            chip.setImportantForAccessibility(2);
        } else {
            chip.setText(this.d);
            chip.setImportantForAccessibility(1);
        }
        int i = z ? 0 : 4;
        EditText editText = this.b;
        editText.setVisibility(i);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new hp2((Object) editText, false, (byte) 5));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f45582a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.f45582a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f45582a.toggle();
    }

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }
}
