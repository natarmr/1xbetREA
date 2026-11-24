package org.xplatform.cyber.game.counterstrike.impl.presentation.statistic.tablet;

import a.a8z;
import a.fth;
import a.lhf;
import a.maz;
import a.oqf;
import a.srf;
import a.u0d;
import a.vqd;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class Cs2StatisticTabletView extends ConstraintLayout {
    public final a8z q;
    public final int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cs2StatisticTabletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.q = maz.a(wez.b, new lhf(this, this, (byte) 3));
        this.r = R.drawable.cs2_weapon_placeholder;
    }

    private final fth getBinding() {
        return (fth) this.q.getValue();
    }

    public final void setBackground(int i) {
        View view = getBinding().F0;
        Context context = getContext();
        context.getClass();
        view.setBackground(context.getDrawable(i));
        TextView textView = getBinding().j0;
        Context context2 = getContext();
        context2.getClass();
        textView.setBackground(context2.getDrawable(i));
        TextView textView2 = getBinding().l0;
        Context context3 = getContext();
        context3.getClass();
        textView2.setBackground(context3.getDrawable(i));
        TextView textView3 = getBinding().k0;
        Context context4 = getContext();
        context4.getClass();
        textView3.setBackground(context4.getDrawable(i));
        TextView textView4 = getBinding().M;
        Context context5 = getContext();
        context5.getClass();
        textView4.setBackground(context5.getDrawable(i));
        TextView textView5 = getBinding().N;
        Context context6 = getContext();
        context6.getClass();
        textView5.setBackground(context6.getDrawable(i));
        TextView textView6 = getBinding().L;
        Context context7 = getContext();
        context7.getClass();
        textView6.setBackground(context7.getDrawable(i));
        TextView textView7 = getBinding().B0;
        Context context8 = getContext();
        context8.getClass();
        textView7.setBackground(context8.getDrawable(i));
    }

    public final void setExtraMargin(boolean z) {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.space_4);
        if (z) {
            getBinding().f10112a.setPadding(0, 0, 0, dimensionPixelSize);
        }
    }

    public final void setFirstPlayer(srf srfVar) {
        srfVar.getClass();
        vqd.z(this, srfVar.f32673a, getBinding().U);
        vqd.z(this, srfVar.g, getBinding().O);
        vqd.z(this, srfVar.f, getBinding().Q);
        vqd.z(this, srfVar.e, getBinding().P);
        vqd.z(this, srfVar.d, getBinding().S);
        vqd.z(this, srfVar.c, getBinding().T);
        vqd.z(this, srfVar.b, getBinding().R);
        oqf oqfVar = srfVar.h;
        u(getBinding().e, oqfVar.b);
        v(getBinding().F, oqfVar.c);
        v(getBinding().b, oqfVar.d);
        v(getBinding().f, oqfVar.e);
        v(getBinding().g, oqfVar.f);
        v(getBinding().d, oqfVar.g);
        v(getBinding().c, oqfVar.h);
    }

    public final void setFivePlayer(srf srfVar) {
        srfVar.getClass();
        vqd.z(this, srfVar.f32673a, getBinding().b0);
        vqd.z(this, srfVar.g, getBinding().V);
        vqd.z(this, srfVar.f, getBinding().X);
        vqd.z(this, srfVar.e, getBinding().W);
        vqd.z(this, srfVar.d, getBinding().Z);
        vqd.z(this, srfVar.c, getBinding().a0);
        vqd.z(this, srfVar.b, getBinding().Y);
        oqf oqfVar = srfVar.h;
        u(getBinding().k, oqfVar.b);
        v(getBinding().G, oqfVar.c);
        v(getBinding().h, oqfVar.d);
        v(getBinding().l, oqfVar.e);
        v(getBinding().m, oqfVar.f);
        v(getBinding().j, oqfVar.g);
        v(getBinding().i, oqfVar.h);
    }

    public final void setFourPlayer(srf srfVar) {
        srfVar.getClass();
        vqd.z(this, srfVar.f32673a, getBinding().i0);
        vqd.z(this, srfVar.g, getBinding().c0);
        vqd.z(this, srfVar.f, getBinding().e0);
        vqd.z(this, srfVar.e, getBinding().d0);
        vqd.z(this, srfVar.d, getBinding().g0);
        vqd.z(this, srfVar.c, getBinding().h0);
        vqd.z(this, srfVar.b, getBinding().f0);
        oqf oqfVar = srfVar.h;
        u(getBinding().q, oqfVar.b);
        v(getBinding().H, oqfVar.c);
        v(getBinding().n, oqfVar.d);
        v(getBinding().r, oqfVar.e);
        v(getBinding().s, oqfVar.f);
        v(getBinding().p, oqfVar.g);
        v(getBinding().o, oqfVar.h);
    }

    public final void setSecondPlayer(srf srfVar) {
        srfVar.getClass();
        vqd.z(this, srfVar.f32673a, getBinding().s0);
        vqd.z(this, srfVar.g, getBinding().m0);
        vqd.z(this, srfVar.f, getBinding().o0);
        vqd.z(this, srfVar.e, getBinding().n0);
        vqd.z(this, srfVar.d, getBinding().q0);
        vqd.z(this, srfVar.c, getBinding().r0);
        vqd.z(this, srfVar.b, getBinding().p0);
        oqf oqfVar = srfVar.h;
        u(getBinding().w, oqfVar.b);
        v(getBinding().I, oqfVar.c);
        v(getBinding().t, oqfVar.d);
        v(getBinding().x, oqfVar.e);
        v(getBinding().y, oqfVar.f);
        v(getBinding().v, oqfVar.g);
        v(getBinding().u, oqfVar.h);
    }

    public final void setThirdPlayer(srf srfVar) {
        srfVar.getClass();
        vqd.z(this, srfVar.f32673a, getBinding().A0);
        vqd.z(this, srfVar.g, getBinding().u0);
        vqd.z(this, srfVar.f, getBinding().w0);
        vqd.z(this, srfVar.e, getBinding().v0);
        vqd.z(this, srfVar.d, getBinding().y0);
        vqd.z(this, srfVar.c, getBinding().z0);
        vqd.z(this, srfVar.b, getBinding().x0);
        oqf oqfVar = srfVar.h;
        u(getBinding().C, oqfVar.b);
        v(getBinding().J, oqfVar.c);
        v(getBinding().z, oqfVar.d);
        v(getBinding().D, oqfVar.e);
        v(getBinding().E, oqfVar.f);
        v(getBinding().B, oqfVar.g);
        v(getBinding().A, oqfVar.h);
    }

    public final void setTotalCash(String str) {
        str.getClass();
        getBinding().B0.setText(str);
    }

    public final void u(ImageView imageView, String str) {
        if (str.length() <= 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        List list = u0d.f34849a;
        u0d.j(imageView, str, this.r, 0, null, null, null, 508);
    }

    public final void v(ImageView imageView, String str) {
        List list = u0d.f34849a;
        u0d.j(imageView, str, this.r, 0, null, null, null, 508);
    }

    public final void w(String str, String str2) {
        str2.getClass();
        getBinding().t0.setText(str2);
        List list = u0d.f34849a;
        u0d.n(getBinding().K, str, R.drawable.icon_globe_new, 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cs2StatisticTabletView(Context context) {
        this(context, null);
        context.getClass();
    }
}
