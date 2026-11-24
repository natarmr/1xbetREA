package org.xplatform.scratch_card.presentation.views;

import a.bkx;
import a.c7h0;
import a.kkx;
import a.l1e0;
import a.r3d;
import a.x6h0;
import a.y6h0;
import a.yxg0;
import a.z6h0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ScratchCardView extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f46912a;
    public ScratchCardFieldView b;
    public ScratchCardProtectLayerView c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ScratchCardView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46912a = new yxg0((byte) 22);
    }

    public final void a(c7h0 c7h0Var) {
        c7h0Var.getClass();
        removeAllViews();
        Context context = getContext();
        context.getClass();
        this.c = new ScratchCardProtectLayerView(context, null, 6);
        Context context2 = getContext();
        context2.getClass();
        this.b = new ScratchCardFieldView(context2, null, 6);
        b();
        ScratchCardProtectLayerView scratchCardProtectLayerView = this.c;
        if (scratchCardProtectLayerView != null) {
            scratchCardProtectLayerView.setOnMapErased(new x6h0(this, c7h0Var, (byte) 1));
        }
        ScratchCardFieldView scratchCardFieldView = this.b;
        if (scratchCardFieldView != null) {
            ImageView imageView = scratchCardFieldView.d;
            imageView.setImageResource(R.drawable.sc_field_back);
            scratchCardFieldView.addView(imageView);
            ArrayList arrayListR = r3d.r(c7h0Var.f);
            Iterator it = l1e0.o(0, 9).iterator();
            while (((kkx) it).c) {
                int iNextInt = ((bkx) it).nextInt();
                Context context3 = scratchCardFieldView.getContext();
                context3.getClass();
                y6h0 y6h0Var = new y6h0(context3);
                y6h0Var.b((z6h0) arrayListR.get(iNextInt));
                y6h0Var.a(false);
                scratchCardFieldView.addView(y6h0Var);
                scratchCardFieldView.c.add(y6h0Var);
            }
        }
        addView(this.b);
        addView(this.c);
    }

    public final void b() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Context context = getContext();
        context.getClass();
        context.getClass();
        int iCeil = 12.0f == 0.0f ? 0 : (int) Math.ceil(context.getResources().getDisplayMetrics().density * 12.0f);
        layoutParams.setMargins(iCeil, iCeil, iCeil, iCeil);
        ScratchCardProtectLayerView scratchCardProtectLayerView = this.c;
        if (scratchCardProtectLayerView != null) {
            scratchCardProtectLayerView.setLayoutParams(layoutParams);
        }
    }

    public final Function0<Unit> getOnFieldErased$scratch_card() {
        return this.f46912a;
    }

    public final void setOnFieldErased$scratch_card(Function0<Unit> function0) {
        function0.getClass();
        this.f46912a = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScratchCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScratchCardView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
