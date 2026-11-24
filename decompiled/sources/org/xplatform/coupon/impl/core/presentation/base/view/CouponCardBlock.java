package org.xplatform.coupon.impl.core.presentation.base.view;

import a.ase;
import a.hny;
import a.tbc;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class CouponCardBlock extends ConstraintLayout {
    public final tbc q;

    /* JADX WARN: Illegal instructions before constructor call */
    public CouponCardBlock(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.coupon_card_block, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.groupBlockBet;
        Group group = (Group) yum0.f(viewInflate, R.id.groupBlockBet);
        if (group != null) {
            i2 = R.id.guideline;
            if (((Guideline) yum0.f(viewInflate, R.id.guideline)) != null) {
                i2 = R.id.ivBlockBet;
                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivBlockBet);
                if (imageView != null) {
                    i2 = R.id.rvCoupon;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvCoupon);
                    if (recyclerView != null) {
                        i2 = R.id.shimmerBlockBet;
                        DsShimmerView dsShimmerView = (DsShimmerView) yum0.f(viewInflate, R.id.shimmerBlockBet);
                        if (dsShimmerView != null) {
                            i2 = R.id.tvBlockBet;
                            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvBlockBet);
                            if (textView != null) {
                                i2 = R.id.tvBlockError;
                                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvBlockError);
                                if (textView2 != null) {
                                    i2 = R.id.tvBlockName;
                                    TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvBlockName);
                                    if (textView3 != null) {
                                        i2 = R.id.viewBlockBetClickableArea;
                                        View viewF = yum0.f(viewInflate, R.id.viewBlockBetClickableArea);
                                        if (viewF != null) {
                                            this.q = new tbc((ConstraintLayout) viewInflate, group, imageView, recyclerView, dsShimmerView, textView, textView2, textView3, viewF);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final int getItemDecorationsCount() {
        return ((RecyclerView) this.q.g).getItemDecorationCount();
    }

    public final void setAdapter(ase aseVar) {
        aseVar.getClass();
        ((RecyclerView) this.q.g).setAdapter(aseVar);
    }

    public final void setBlockBetGravity(int i) {
        this.q.d.setGravity(i);
    }

    public final void setBlockBetImage(int i) {
        ImageView imageView = (ImageView) this.q.c;
        Context context = getContext();
        context.getClass();
        imageView.setImageDrawable(context.getDrawable(i));
    }

    public final void setBlockBetText(String str) {
        str.getClass();
        this.q.d.setText(str);
    }

    public final void setBlockBetValueLoading(boolean z) {
        tbc tbcVar = this.q;
        ((Group) tbcVar.f).setVisibility(!z ? 0 : 8);
        ((DsShimmerView) tbcVar.h).setVisibility(z ? 0 : 8);
    }

    public final void setBlockBetVisibility(boolean z) {
        ((Group) this.q.f).setVisibility(z ? 0 : 8);
    }

    public final void setBlockErrorText(String str) {
        str.getClass();
        this.q.e.setText(str);
    }

    public final void setBlockErrorVisibility(boolean z) {
        this.q.e.setVisibility(z ? 0 : 8);
    }

    public final void setBlockName(String str) {
        str.getClass();
        ((TextView) this.q.i).setText(str);
    }

    public final void setEventItemsVisibility(boolean z) {
        ((RecyclerView) this.q.g).setVisibility(z ? 0 : 8);
    }

    public final void setLayoutManager(b bVar) {
        bVar.getClass();
        ((RecyclerView) this.q.g).setLayoutManager(bVar);
    }

    public final void setMakeBetClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        this.q.j.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CouponCardBlock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CouponCardBlock(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
