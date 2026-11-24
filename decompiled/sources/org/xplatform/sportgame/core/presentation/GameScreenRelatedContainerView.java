package org.xplatform.sportgame.core.presentation;

import a.ic3;
import a.xke;
import a.yke;
import android.content.Context;
import android.util.AttributeSet;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedContainerView;

/* JADX INFO: loaded from: classes5.dex */
public final class GameScreenRelatedContainerView extends RelatedContainerView implements xke {
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public GameScreenRelatedContainerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.b = getResources().getDimensionPixelSize(R.dimen.corner_radius_8);
    }

    @Override // a.xke
    /* JADX INFO: renamed from: getBehavior */
    public yke mo39getBehavior() {
        return new RelatedContainerBehavior();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        RelatedContainerView relatedContainerView = getBinding().f13225a;
        relatedContainerView.setClipToOutline(true);
        relatedContainerView.setOutlineProvider(new ic3(this, (byte) 2));
        super.onAttachedToWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameScreenRelatedContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameScreenRelatedContainerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
