package org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb;

import a.a8z;
import a.c4m0;
import a.clz;
import a.dnq;
import a.e00;
import a.fnq;
import a.fob;
import a.jwd;
import a.lhf;
import a.maz;
import a.s7n0;
import a.sac;
import a.ush;
import a.vne;
import a.wez;
import a.x0x;
import a.x5f;
import a.yg1;
import a.yje;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class Cs2GameLogBombTimerView extends LinearLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46513a;
    public final DecimalFormat b;
    public c4m0 c;
    public final a8z d;
    public final a8z e;

    /* JADX WARN: Illegal instructions before constructor call */
    public Cs2GameLogBombTimerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        wez wezVar = wez.b;
        this.f46513a = maz.a(wezVar, new lhf(this, this, (byte) 1));
        this.b = new DecimalFormat("#00");
        this.d = maz.a(wezVar, new x5f((byte) 27));
        this.e = maz.a(wezVar, new jwd(this, (byte) 20));
    }

    public static final vne c(Cs2GameLogBombTimerView cs2GameLogBombTimerView) {
        clz clzVarL = s7n0.l(cs2GameLogBombTimerView.getBinding().f36210a);
        return clzVarL != null ? x0x.Q(clzVarL.x()) : cs2GameLogBombTimerView.getMainScope();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ush getBinding() {
        Object value = this.f46513a.getValue();
        value.getClass();
        return (ush) value;
    }

    public final void b(long j) {
        ImageView imageView = getBinding().b;
        Context context = getContext();
        context.getClass();
        imageView.setImageDrawable(context.getDrawable(R.drawable.cs2_bomb_ic));
        if (j <= 0) {
            getBinding().f36210a.setVisibility(8);
            return;
        }
        c4m0 c4m0Var = this.c;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        getBinding().f36210a.setVisibility(0);
        this.c = sac.T(new dnq(new fnq(sac.L(4, TimeUnit.SECONDS.toMillis(j), 0L), new yg1((Object) this, yjeVar, (byte) 9), (byte) 4), new e00(this, yjeVar, (byte) 15), (byte) 0), getScope(), new fob(this, yjeVar, (byte) 23));
    }

    public final vne getMainScope() {
        return (vne) this.d.getValue();
    }

    public final vne getScope() {
        return (vne) this.e.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c4m0 c4m0Var = this.c;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cs2GameLogBombTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cs2GameLogBombTimerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
