package org.xplatform.core.presentation.bonuses.views;

import a.csr;
import a.dyb;
import a.epv0;
import a.jf4;
import a.s3t;
import a.t3t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class GamesBonusButtonViewNew extends AppCompatImageView {
    public static final /* synthetic */ int g = 0;
    public csr d;
    public final s3t e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesBonusButtonViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.d = csr.e;
        byte b = 0;
        this.e = new s3t(b);
        dyb.O(this, new t3t(this, b));
        try {
            setImageDrawable(a(this.d));
        } catch (Exception e) {
            String message = e.getMessage();
            Log.e("GamesBonusButtonViewNew", message == null ? "" : message);
        }
    }

    public final Drawable a(csr csrVar) {
        csrVar.getClass();
        boolean zA = csrVar.a();
        int i = R.drawable.ic_bonus_new;
        if (!zA) {
            int iOrdinal = csrVar.f4905a.f3145a.ordinal();
            if (iOrdinal == 1) {
                i = R.drawable.ic_bonus_x2;
            } else if (iOrdinal == 2) {
                i = R.drawable.ic_bonus_x_2;
            } else if (iOrdinal == 3) {
                i = R.drawable.ic_bonus_free_game;
            } else if (iOrdinal == 5) {
                i = R.drawable.ic_glyph_wild_freebet;
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
        try {
            setImageDrawable(a(csrVar));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Log.e("GamesBonusButtonViewNew", message);
        }
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
