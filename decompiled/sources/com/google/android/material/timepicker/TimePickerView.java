package com.google.android.material.timepicker;

import a.b0l0;
import a.klq0;
import a.llq0;
import a.mlq0;
import a.nf00;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int r = 0;
    public final Chip q;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        llq0 llq0Var = new llq0();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.m.add(new klq0(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.q = chip2;
        clockFaceView.l1 = new b0l0(this, (byte) 19);
        nf00 nf00Var = new nf00(new GestureDetector(getContext(), new mlq0()), (byte) 1);
        chip.setOnTouchListener(nf00Var);
        chip2.setOnTouchListener(nf00Var);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(llq0Var);
        chip2.setOnClickListener(llq0Var);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.q.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context) {
        this(context, null);
    }
}
