package org.xplatform.uikit.components.views;

import a.od5;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class AppCompatView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od5 f47283a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        od5 od5Var = new od5(this);
        this.f47283a = od5Var;
        od5Var.a(attributeSet, i);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f47283a.b;
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        boolean z = this.b;
        int i2 = R.attr.state_error;
        if (!z) {
            i2 = -R.attr.state_error;
        }
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{i2});
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    public final void setError(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppCompatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppCompatView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ AppCompatView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
