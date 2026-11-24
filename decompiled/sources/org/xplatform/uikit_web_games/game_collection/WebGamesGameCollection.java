package org.xplatform.uikit_web_games.game_collection;

import a.dqd0;
import a.g5s;
import a.lmc;
import a.o4s;
import a.pmk0;
import a.pyl0;
import a.t2v0;
import a.xdr;
import a.yge0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;
import org.xplatform.uikit.utils.recycerview.CenterSingleLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
public final class WebGamesGameCollection extends OptimizedScrollRecyclerView {
    public static final /* synthetic */ int o2 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public WebGamesGameCollection(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.gameCollectionStyle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, dqd0.f6509a, R.attr.gameCollectionStyle, 0);
        g5s g5sVar = (g5s) g5s.l.get(typedArrayObtainStyledAttributes.getInt(2, 0));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        setAdapter(new o4s(g5sVar, lmc.G(context, g5sVar, ((resourceId == 0 && resourceId2 == 0) || resourceId == 0) ? 0 : resourceId, resourceId2 == 0 ? R.drawable.ic_games_square : resourceId2), null));
        setLayoutManager(t2v0.f33234a[g5sVar.ordinal()] == 1 ? new CenterSingleLayoutManager(context, 0, false) : new LinearLayoutManager(context, 0, false));
        setClipToOutline(true);
        setOutlineProvider(new pyl0(dimensionPixelOffset, (byte) 3));
        typedArrayObtainStyledAttributes.recycle();
        m(new pmk0(getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize2, 0, 0, 20));
    }

    public final void setOnItemClickListener(xdr xdrVar) {
        xdrVar.getClass();
        yge0 adapter = getAdapter();
        adapter.getClass();
        ((o4s) adapter).h = xdrVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebGamesGameCollection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebGamesGameCollection(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
