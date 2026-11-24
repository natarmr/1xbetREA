package org.xplatform.core.presentation.bonuses.views;

import a.csr;
import a.dyb;
import a.epv0;
import a.g7p;
import a.jf4;
import a.t4s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class GamesBonusButtonView1 extends AppCompatImageView {
    public static final /* synthetic */ int g = 0;
    public csr d;
    public final t4s e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesBonusButtonView1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.d = csr.e;
        this.e = new t4s((byte) 29);
        dyb.O(this, new g7p(this, (byte) 29));
        setImageDrawable(a(this.d));
    }

    public final Drawable a(csr csrVar) {
        csrVar.getClass();
        boolean zA = csrVar.a();
        int i = R.drawable.ic_bonus;
        if (!zA) {
            int iOrdinal = csrVar.f4905a.f3145a.ordinal();
            if (iOrdinal == 1) {
                i = R.drawable.ic_bonus_x2;
            } else if (iOrdinal == 2) {
                i = R.drawable.ic_bonus_x_2;
            } else if (iOrdinal == 3) {
                i = R.drawable.ic_bonus_free_game;
            }
        }
        Drawable drawableU = epv0.U(i, getContext());
        if (drawableU != null) {
            return drawableU;
        }
        jf4.o("Can't find drawable resource");
        return null;
    }

    public final void setBonusSelected(csr csrVar) {
        csrVar.getClass();
        this.d = csrVar;
        setImageDrawable(a(csrVar));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            animate().alpha(1.0f);
            animate().translationZ(0.0f);
            return;
        }
        animate().alpha(0.5f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        Context context = getContext();
        context.getClass();
        context.getClass();
        viewPropertyAnimatorAnimate.translationZ(-4.0f == 0.0f ? 0 : (int) Math.ceil(context.getResources().getDisplayMetrics().density * (-4.0f)));
    }
}
