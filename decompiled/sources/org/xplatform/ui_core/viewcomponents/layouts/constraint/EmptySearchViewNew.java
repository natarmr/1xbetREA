package org.xplatform.ui_core.viewcomponents.layouts.constraint;

import a.a6g;
import a.a8z;
import a.lhf;
import a.maz;
import a.wez;
import a.zgu0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class EmptySearchViewNew extends ConstraintLayout {
    public final a8z q;
    public final int r;

    /* JADX WARN: Illegal instructions before constructor call */
    public EmptySearchViewNew(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new lhf(this, this, (byte) 21));
        new a6g(this, EmptySearchViewNew.class, "binding", "getBinding()Lorg/xplatform/ui_core/databinding/ViewEmptySearchNewBinding;", 0, (byte) 5).get();
        this.r = R.string.nothing_found;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zgu0 getBinding() {
        return (zgu0) this.q.getValue();
    }

    public final int getEmptyText() {
        return this.r;
    }

    public final void setEmptyText(int i) {
        getBinding().b.setText(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptySearchViewNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptySearchViewNew(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
