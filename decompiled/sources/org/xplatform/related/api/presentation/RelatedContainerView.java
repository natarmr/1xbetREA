package org.xplatform.related.api.presentation;

import a.a6g;
import a.a8z;
import a.hku0;
import a.maz;
import a.sue0;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public class RelatedContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46880a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        context.getClass();
        this.f46880a = maz.a(wez.b, new sue0(this, this, (byte) 1));
        new a6g(this, RelatedContainerView.class, "binding", "getBinding()Lorg/xplatform/related/api/databinding/ViewRelatedContentBinding;", 0, (byte) 12).get();
        setOrientation(1);
    }

    public final hku0 getBinding() {
        return (hku0) this.f46880a.getValue();
    }

    public final ComposeView getRelatedGamesList() {
        return getBinding().b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RelatedContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RelatedContainerView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ RelatedContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
