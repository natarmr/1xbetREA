package org.xplatform.uikit_web_games.game_collection_section;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class GameCollectionShimmer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f47306a;

    /* JADX WARN: Illegal instructions before constructor call */
    public GameCollectionShimmer(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameCollectionShimmer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameCollectionShimmer(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
