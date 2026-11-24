package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class aig0 extends w5 {
    public final zkk u;
    public final Function2 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public aig0(zkk zkkVar, ksc0 ksc0Var) {
        ksc0Var.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) zkkVar.f;
        constraintLayout.getClass();
        super(constraintLayout);
        this.u = zkkVar;
        this.v = ksc0Var;
        ((TextView) zkkVar.e).setFadingEdgeLength(0);
    }

    @Override // a.w5
    public final void t() {
        zkk zkkVar = this.u;
        TextView textView = (TextView) zkkVar.e;
        textView.setText("");
        TextView textView2 = zkkVar.d;
        textView2.setText("");
        TypedValue typedValue = j5d.f15927a;
        View view = this.f40887a;
        Context context = view.getContext();
        context.getClass();
        textView.setTextColor(j5d.a(context, R.attr.uikitSecondary, false));
        Context context2 = view.getContext();
        context2.getClass();
        textView2.setTextColor(j5d.a(context2, R.attr.uikitSecondary, false));
        textView2.setCompoundDrawables(null, null, null, null);
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) zkkVar.i;
        roundCornerImageView.setImageDrawable(null);
        ((ImageView) zkkVar.b).setImageDrawable(null);
        ((ImageView) zkkVar.c).setImageDrawable(null);
        List list = u0d.f34849a;
        u0d.a(roundCornerImageView);
        u0d.a((RoundCornerImageView) zkkVar.h);
    }
}
