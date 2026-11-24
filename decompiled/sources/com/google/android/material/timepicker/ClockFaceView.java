package com.google.android.material.timepicker;

import a.b0l0;
import a.c46;
import a.g7x;
import a.i7;
import a.jiq0;
import a.ki30;
import a.n3e;
import a.r3e;
import a.rgu0;
import a.rpd0;
import a.ruc;
import a.wss;
import a.zef0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class ClockFaceView extends ConstraintLayout {
    public final float[] A;
    public final int B;
    public final int f1;
    public final int g1;
    public final int h1;
    public final String[] i1;
    public float j1;
    public final ColorStateList k1;
    public b0l0 l1;
    public final wss q;
    public int r;
    public final ki30 s;
    public final ClockHandView t;
    public final Rect u;
    public final RectF v;
    public final Rect w;
    public final SparseArray x;
    public final c46 y;
    public final int[] z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ki30 ki30Var = new ki30();
        this.s = ki30Var;
        ki30Var.setShapeAppearanceModel(ki30Var.b.f14810a.e(new zef0(0.5f)));
        this.s.s(ColorStateList.valueOf(-1));
        setBackground(this.s);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.M, R.attr.materialClockStyle, 0);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.q = new wss(this, (byte) 24);
        typedArrayObtainStyledAttributes.recycle();
        this.u = new Rect();
        this.v = new RectF();
        this.w = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.x = sparseArray;
        this.A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, rpd0.j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = g7x.A(1, context, typedArrayObtainStyledAttributes2);
        this.k1 = colorStateListA;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.t = clockHandView;
        this.B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.z = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.c.add(this);
        int defaultColor = jiq0.n0(R.color.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList colorStateListA2 = g7x.A(0, context, typedArrayObtainStyledAttributes2);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes2.recycle();
        setOutlineProvider(new ruc((byte) 0));
        setFocusable(true);
        setClipToOutline(true);
        this.y = new c46(this, (byte) 4);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.i1 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.i1.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.i1.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.i1[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                rgu0.o(textView, this.y);
                textView.setTextColor(this.k1);
            }
        }
        ClockHandView clockHandView2 = this.t;
        if (clockHandView2.b && !z) {
            clockHandView2.m = 1;
        }
        clockHandView2.b = z;
        clockHandView2.invalidate();
        this.f1 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.g1 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.h1 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            wss wssVar = this.q;
            handler.removeCallbacks(wssVar);
            handler.post(wssVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        v();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i7.b(1, this.i1.length, 1).f14266a);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int iIntValue;
        int length;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.x;
            if (i2 >= sparseArray.size()) {
                iIntValue = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i2);
            if (textView.isSelected()) {
                iIntValue = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i2++;
        }
        if (!isShown() || iIntValue == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            String[] strArr = this.i1;
            switch (i) {
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 22:
                    length = (iIntValue + 1) % strArr.length;
                    break;
                case 20:
                case 21:
                    length = ((iIntValue - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == iIntValue) {
                return super.onKeyDown(i, keyEvent);
            }
            int i3 = (length / 12) + 1;
            ClockHandView clockHandView = this.t;
            if (i3 != clockHandView.m) {
                clockHandView.m = i3;
                clockHandView.invalidate();
            }
            clockHandView.a((length % 12) * 30.0f);
            u();
            return true;
        }
        b0l0 b0l0Var = this.l1;
        if (b0l0Var != null) {
            ((TimePickerView) b0l0Var.b).q.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        u();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.h1 / Math.max(Math.max(this.f1 / displayMetrics.heightPixels, this.g1 / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i2));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        ClockHandView clockHandView = this.t;
        int i3 = ((iMax / 2) - clockHandView.d) - this.B;
        int i4 = this.r;
        if (i3 != i4 && i3 != i4) {
            this.r = i3;
            v();
            clockHandView.l = this.r;
            clockHandView.invalidate();
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            wss wssVar = this.q;
            handler.removeCallbacks(wssVar);
            handler.post(wssVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.s.s(ColorStateList.valueOf(i));
    }

    public final void u() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.t.g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.x;
            int size = sparseArray.size();
            rect = this.u;
            rectF = this.v;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.w;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.z, this.A, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    public final void v() {
        r3e r3eVar = new r3e();
        r3eVar.e(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iRound = this.r;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                n3e n3eVar = r3eVar.h(((View) it.next()).getId()).e;
                n3eVar.A = R.id.circle_center;
                n3eVar.B = iRound;
                n3eVar.C = size;
                size += 360.0f / list.size();
            }
        }
        r3eVar.b(this);
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.x;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }
}
