package org.xplatform.resident.presentation.views;

import a.a8z;
import a.epv0;
import a.kku0;
import a.maz;
import a.sue0;
import a.t9f;
import a.wez;
import a.wqf0;
import a.wss;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ResidentPersonView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46884a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ResidentPersonView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0, 0);
        this.f46884a = maz.a(wez.b, new sue0(this, this, (byte) 4));
        setState(wqf0.f39589a);
    }

    private final kku0 getBinding() {
        return (kku0) this.f46884a.getValue();
    }

    public final void b(boolean z) {
        getBinding().b.setVisibility(z ? 0 : 8);
    }

    public final void setState(wqf0 wqf0Var) {
        wqf0Var.getClass();
        int iOrdinal = wqf0Var.ordinal();
        if (iOrdinal == 0) {
            AnimationDrawable animationDrawable = new AnimationDrawable();
            Drawable drawableU = epv0.U(R.drawable.ic_resident_person_default_1, getContext());
            if (drawableU == null) {
                return;
            }
            animationDrawable.addFrame(drawableU, 1000);
            Drawable drawableU2 = epv0.U(R.drawable.ic_resident_person_default_2, getContext());
            if (drawableU2 == null) {
                return;
            }
            animationDrawable.addFrame(drawableU2, 1000);
            getBinding().c.setImageDrawable(animationDrawable);
            getBinding().c.post(new wss(animationDrawable, (byte) 25));
            return;
        }
        if (iOrdinal == 1) {
            getBinding().c.setImageResource(R.drawable.ic_resident_person_win);
            return;
        }
        if (iOrdinal == 2) {
            getBinding().c.setImageResource(R.drawable.ic_resident_person_default_2);
            return;
        }
        if (iOrdinal == 3) {
            getBinding().c.setImageResource(R.drawable.ic_resident_person_loose_door);
        } else if (iOrdinal == 4) {
            getBinding().c.setImageResource(R.drawable.ic_resident_person_extinguisher);
        } else {
            t9f.b();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentPersonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResidentPersonView(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
