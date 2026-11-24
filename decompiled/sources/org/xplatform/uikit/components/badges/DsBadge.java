package org.xplatform.uikit.components.badges;

import a.jmu0;
import a.k14;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class DsBadge extends AppCompatImageView {
    public static final Integer[] e = {Integer.valueOf(R.style.Widget_DSBadge_Live), Integer.valueOf(R.style.Widget_DSBadge_Live_Header), Integer.valueOf(R.style.Widget_DSBadge_Prominent_S), Integer.valueOf(R.style.Widget_DSBadge_Prominent_L), Integer.valueOf(R.style.Widget_DSBadge_Market_Coupon), Integer.valueOf(R.style.Widget_DSBadge_Championship_Popular), Integer.valueOf(R.style.Widget_DSBadge_Championship_New), Integer.valueOf(R.style.Widget_DSBadge_Status), Integer.valueOf(R.style.Widget_DSBadge_Market_Track), Integer.valueOf(R.style.Widget_DSBadge_Market_Block), Integer.valueOf(R.style.Widget_DSBadge_Custom), Integer.valueOf(R.style.Widget_DSBadge_Market_Popular), Integer.valueOf(R.style.Widget_DSBadge_Dot), Integer.valueOf(R.style.Widget_DSBadge_Authenticator)};
    public final k14 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsBadge(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        k14 k14Var = new k14(this);
        this.d = k14Var;
        k14Var.a(attributeSet);
        setTag("TAG_BADGE");
    }

    public final DsBadge a(View view, Function0 function0) {
        view.getClass();
        return (DsBadge) this.d.b(view, function0);
    }

    public final void d(int i, int i2, int i3) {
        this.d.d(i, i2, i3);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        jmu0.b(this, z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsBadge(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
