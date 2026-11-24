package com.google.android.material.transformation;

import a.ble;
import a.wti;
import a.xi70;
import a.zt40;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.HashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final wti E(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        wti wtiVar = new wti((byte) 9);
        wtiVar.b = zt40.b(i, context);
        wtiVar.c = new xi70();
        return wtiVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void x(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof ble) && (((ble) childAt.getLayoutParams()).f2790a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    HashMap map = this.i;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.i.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.i = null;
            }
        }
        super.x(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
