package org.xplatform.cyber.game.universal.impl.presentation.crystal;

import a.a8z;
import a.h5;
import a.igg0;
import a.maz;
import a.okg;
import a.shf;
import a.t9f;
import a.thf;
import a.vhf;
import a.wez;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CrystalFieldInfoView extends ConstraintLayout {
    public final a8z q;
    public ObjectAnimator r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrystalFieldInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.q = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 28));
        setBackgroundResource(R.drawable.cybergame_crystal_view_bg);
        getBinding().b.setImageResource(R.drawable.cybergame_crystal_orange);
        getBinding().c.setImageResource(R.drawable.cybergame_crystal_red);
        getBinding().d.setImageResource(R.drawable.cybergame_crystal_yellow);
        getBinding().f.setImageResource(R.drawable.cybergame_crystal_blue);
        getBinding().g.setImageResource(R.drawable.cybergame_crystal_cyan);
        getBinding().h.setImageResource(R.drawable.cybergame_crystal_purple);
    }

    private final okg getBinding() {
        return (okg) this.q.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: setFirstPlayerResult-Z7eCPMA, reason: not valid java name */
    public final void m28setFirstPlayerResultZ7eCPMA(String str) {
        str.getClass();
        getBinding().l.setText(str);
    }

    public final void setFirstPlayerRounds(thf thfVar) {
        thfVar.getClass();
        getBinding().j.setText(getContext().getString(R.string.crystal_short_points, thfVar.b));
        getBinding().m.setText(getContext().getString(R.string.crystal_short_points, thfVar.c));
    }

    public final void setPlayersName(shf shfVar) {
        shfVar.getClass();
        getBinding().k.setText(shfVar.f32208a);
        getBinding().o.setText(shfVar.b);
    }

    /* JADX INFO: renamed from: setRoundState-EQFU1Hg, reason: not valid java name */
    public final void m29setRoundStateEQFU1Hg(igg0 igg0Var) {
        igg0Var.getClass();
        int iOrdinal = igg0Var.ordinal();
        if (iOrdinal == 0) {
            getBinding().e.animate().alpha(1.0f).setDuration(500L);
            getBinding().i.animate().alpha(0.0f).setDuration(500L);
            u(getBinding().e);
            return;
        }
        if (iOrdinal == 1) {
            getBinding().e.animate().alpha(0.0f).setDuration(500L);
            getBinding().i.animate().alpha(1.0f).setDuration(500L);
            getBinding().j.animate().alpha(1.0f).setDuration(500L);
            getBinding().l.animate().alpha(1.0f).setDuration(500L);
            getBinding().n.animate().alpha(1.0f).setDuration(500L);
            getBinding().p.animate().alpha(1.0f).setDuration(500L);
            u(getBinding().i);
            return;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        getBinding().m.animate().alpha(1.0f).setDuration(500L);
        getBinding().q.animate().alpha(1.0f).setDuration(500L);
        getBinding().i.animate().alpha(0.0f).setDuration(500L);
        getBinding().j.animate().alpha(1.0f).setDuration(500L);
        getBinding().l.animate().alpha(1.0f).setDuration(500L);
        getBinding().n.animate().alpha(1.0f).setDuration(500L);
        getBinding().p.animate().alpha(1.0f).setDuration(500L);
    }

    /* JADX INFO: renamed from: setSecondPlayerResult-r0dkc8Y, reason: not valid java name */
    public final void m30setSecondPlayerResultr0dkc8Y(String str) {
        str.getClass();
        getBinding().p.setText(str);
    }

    public final void setSecondPlayerRounds(vhf vhfVar) {
        vhfVar.getClass();
        getBinding().n.setText(getContext().getString(R.string.crystal_short_points, vhfVar.b));
        getBinding().q.setText(getContext().getString(R.string.crystal_short_points, vhfVar.c));
    }

    public final void u(ImageView imageView) {
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) ViewGroup.ROTATION, 360.0f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
        this.r = objectAnimatorOfFloat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrystalFieldInfoView(Context context) {
        this(context, null);
        context.getClass();
    }
}
