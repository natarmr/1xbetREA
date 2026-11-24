package org.xplatform.cyber.game.universal.impl.presentation.settoemezzo.combination;

import a.a8z;
import a.iij0;
import a.jij0;
import a.maz;
import a.sue0;
import a.wez;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class SettoeMezzoCombinationView extends ConstraintLayout {
    public final a8z q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettoeMezzoCombinationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.q = maz.a(wez.b, new sue0(this, this, (byte) 17));
    }

    private final jij0 getBinding() {
        return (jij0) this.q.getValue();
    }

    public final void setCombination(iij0 iij0Var) {
        Drawable drawable;
        Drawable drawable2;
        iij0Var.getClass();
        TextView textView = getBinding().f;
        String str = iij0Var.b;
        List list = iij0Var.e;
        textView.setText(str);
        getBinding().e.setText(iij0Var.c);
        SettoeMezzoCombinationView settoeMezzoCombinationView = getBinding().f16578a;
        Context context = getContext();
        context.getClass();
        settoeMezzoCombinationView.setBackground(context.getDrawable(iij0Var.f));
        getBinding().g.setVisibility(iij0Var.d ? 0 : 8);
        ImageView imageView = getBinding().b;
        Integer num = (Integer) CollectionsKt.firstOrNull(list);
        Drawable drawable3 = null;
        if (num != null) {
            int iIntValue = num.intValue();
            Context context2 = imageView.getContext();
            context2.getClass();
            drawable = context2.getDrawable(iIntValue);
            imageView.setVisibility(drawable != null ? 0 : 8);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView2 = getBinding().c;
        Integer num2 = (Integer) CollectionsKt.W(1, list);
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Context context3 = imageView2.getContext();
            context3.getClass();
            drawable2 = context3.getDrawable(iIntValue2);
            imageView2.setVisibility(drawable2 != null ? 0 : 8);
        } else {
            drawable2 = null;
        }
        imageView2.setImageDrawable(drawable2);
        ImageView imageView3 = getBinding().d;
        Integer num3 = (Integer) CollectionsKt.W(2, list);
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            Context context4 = imageView3.getContext();
            context4.getClass();
            drawable3 = context4.getDrawable(iIntValue3);
            imageView3.setVisibility(drawable3 != null ? 0 : 8);
        }
        imageView3.setImageDrawable(drawable3);
    }
}
