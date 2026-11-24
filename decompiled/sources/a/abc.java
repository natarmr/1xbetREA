package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class abc extends roq {
    public int e;
    public int f;
    public xac g;
    public final m9c h;
    public final int i;
    public final yac j;

    /* JADX WARN: Illegal instructions before constructor call */
    public abc(Context context, AttributeSet attributeSet) {
        Context contextV = dwi0.V(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextV, attributeSet, R.attr.chipGroupStyle);
        this.c = false;
        TypedArray typedArrayObtainStyledAttributes = contextV.getTheme().obtainStyledAttributes(attributeSet, rpd0.q, 0, 0);
        this.f30851a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        m9c m9cVar = new m9c();
        this.h = m9cVar;
        yac yacVar = new yac(this);
        this.j = yacVar;
        TypedArray typedArrayL0 = mrv.l0(getContext(), attributeSet, rpd0.h, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayL0.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayL0.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayL0.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayL0.getBoolean(6, false));
        setSingleSelection(typedArrayL0.getBoolean(7, false));
        setSelectionRequired(typedArrayL0.getBoolean(5, false));
        this.i = typedArrayL0.getResourceId(0, -1);
        typedArrayL0.recycle();
        m9cVar.e = new yk50((Object) this, (byte) 23);
        super.setOnHierarchyChangeListener(yacVar);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof vac);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new vac(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new vac(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.h.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            m9c m9cVar = this.h;
            hi30 hi30Var = (hi30) ((HashMap) m9cVar.c).get(Integer.valueOf(i));
            if (hi30Var != null && m9cVar.a(hi30Var)) {
                m9cVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i7.b(getRowCount(), this.c ? getVisibleChipCount() : -1, this.h.f21402a ? 1 : 2).f14266a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.e != i) {
            this.e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f != i) {
            this.f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(wac wacVar) {
        if (wacVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new fvt0(this));
        }
    }

    public void setOnCheckedStateChangeListener(xac xacVar) {
        this.g = xacVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.f42287a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.h.b = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        m9c m9cVar = this.h;
        if (m9cVar.f21402a != z) {
            m9cVar.f21402a = z;
            boolean zIsEmpty = ((HashSet) m9cVar.d).isEmpty();
            Iterator it = ((HashMap) m9cVar.c).values().iterator();
            while (it.hasNext()) {
                m9cVar.g((hi30) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            m9cVar.d();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new vac(layoutParams);
    }

    @Override // a.roq
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
