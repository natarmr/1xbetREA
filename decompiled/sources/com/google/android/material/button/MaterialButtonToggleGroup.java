package com.google.android.material.button;

import a.c46;
import a.dwi0;
import a.i7;
import a.klq0;
import a.mrv;
import a.q0;
import a.rgu0;
import a.rpd0;
import a.s7m0;
import a.yh30;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.TimePickerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends yh30 {
    public static final /* synthetic */ int s = 0;
    public final LinkedHashSet m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final int q;
    public HashSet r;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(dwi0.V(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.m = new LinkedHashSet();
        this.n = false;
        this.r = new HashSet();
        TypedArray typedArrayL0 = mrv.l0(getContext(), attributeSet, rpd0.z, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayL0.getBoolean(7, false));
        this.q = typedArrayL0.getResourceId(2, -1);
        this.p = typedArrayL0.getBoolean(4, false);
        if (this.f == null) {
            this.f = s7m0.b(new q0(0.0f));
        }
        setEnabled(typedArrayL0.getBoolean(0, true));
        typedArrayL0.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.o ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // a.yh30, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        l(materialButton.getId(), materialButton.v);
        rgu0.o(materialButton, new c46(this, (byte) 5));
    }

    public int getCheckedButtonId() {
        if (!this.o || this.r.isEmpty()) {
            return -1;
        }
        return ((Integer) this.r.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.r.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void l(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.r);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.o && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.p || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m(hashSet);
    }

    public final void m(Set set) {
        HashSet hashSet = this.r;
        this.r = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.n = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.n = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    TimePickerView timePickerView = ((klq0) it.next()).f18505a;
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.q;
        if (i != -1) {
            m(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i7.b(1, getVisibleButtonCount(), this.o ? 1 : 2).f14266a);
    }

    public void setSelectionRequired(boolean z) {
        this.p = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.o != z) {
            this.o = z;
            m(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }
}
