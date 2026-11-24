package org.xplatform.swipex.impl.presentation.swipex.cardstack;

import a.bpn0;
import a.jf4;
import a.pek;
import a.ron0;
import a.una;
import a.ven;
import a.xna;
import a.yge0;
import a.zj;
import android.content.Context;
import android.javax.sip.message.Response;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;

/* JADX INFO: loaded from: classes6.dex */
public final class SwipexCardsRecyclerView extends RecyclerView {
    /* JADX WARN: Illegal instructions before constructor call */
    public SwipexCardsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        new una().b(this);
        setOverScrollMode(2);
    }

    public final void H0() {
        b layoutManager = getLayoutManager();
        CardStackLayoutManager cardStackLayoutManager = layoutManager instanceof CardStackLayoutManager ? (CardStackLayoutManager) layoutManager : null;
        if (cardStackLayoutManager == null) {
            return;
        }
        xna xnaVar = cardStackLayoutManager.r;
        zj zjVar = zj.b;
        pek pekVar = ven.b;
        bpn0 bpn0Var = bpn0.f2993a;
        cardStackLayoutManager.s = new ron0(zjVar, Response.BUSY_EVERYWHERE, bpn0.b, new AccelerateInterpolator());
        if (xnaVar.f41165a.a()) {
            return;
        }
        B0(xnaVar.f + 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        CardStackLayoutManager cardStackLayoutManager;
        View viewD;
        motionEvent.getClass();
        if (motionEvent.getAction() == 0 && (cardStackLayoutManager = (CardStackLayoutManager) getLayoutManager()) != null) {
            motionEvent.getX();
            float y = motionEvent.getY();
            xna xnaVar = cardStackLayoutManager.r;
            if (xnaVar.f < cardStackLayoutManager.S() && (viewD = cardStackLayoutManager.D(xnaVar.f)) != null) {
                float f = cardStackLayoutManager.o / 2.0f;
                xnaVar.h = (-((y - f) - viewD.getTop())) / f;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(yge0 yge0Var) {
        super.setAdapter(yge0Var);
        if (getLayoutManager() == null) {
            setLayoutManager(new CardStackLayoutManager(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(b bVar) {
        if (bVar instanceof CardStackLayoutManager) {
            super.setLayoutManager(bVar);
        } else {
            jf4.n("CardStackView must be set CardStackLayoutManager.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipexCardsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipexCardsRecyclerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
