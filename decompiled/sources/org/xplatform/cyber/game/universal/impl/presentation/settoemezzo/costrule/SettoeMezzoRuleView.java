package org.xplatform.cyber.game.universal.impl.presentation.settoemezzo.costrule;

import a.a8z;
import a.lij0;
import a.maz;
import a.sij0;
import a.sj3;
import a.sue0;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class SettoeMezzoRuleView extends ConstraintLayout {
    public final a8z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettoeMezzoRuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.q = maz.a(wez.b, new sue0(this, this, (byte) 18));
        setBackground(context.getDrawable(R.drawable.settoe_mezo_card_bg));
        boolean z = getResources().getConfiguration().smallestScreenWidthDp < 360;
        ViewGroup.LayoutParams layoutParams = getBinding().b.getLayoutParams();
        if (z) {
            layoutParams.width = sj3.X(22);
            layoutParams.height = sj3.X(30);
        } else {
            layoutParams.width = sj3.X(28);
            layoutParams.height = sj3.X(38);
        }
        getBinding().b.setLayoutParams(layoutParams);
    }

    private final sij0 getBinding() {
        return (sij0) this.q.getValue();
    }

    public final void setRule(lij0 lij0Var) {
        lij0Var.getClass();
        ImageView imageView = getBinding().b;
        Context context = getContext();
        context.getClass();
        imageView.setImageDrawable(context.getDrawable(lij0Var.f20110a));
        getBinding().c.setText(lij0Var.b);
    }
}
