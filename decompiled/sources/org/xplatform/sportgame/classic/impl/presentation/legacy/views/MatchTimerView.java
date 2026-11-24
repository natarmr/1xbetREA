package org.xplatform.sportgame.classic.impl.presentation.legacy.views;

import a.a8z;
import a.biu0;
import a.ha30;
import a.hg30;
import a.maz;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.Locale;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class MatchTimerView extends ConstraintLayout {
    public final a8z q;

    /* JADX WARN: Illegal instructions before constructor call */
    public MatchTimerView(Context context, AttributeSet attributeSet, int i) {
        byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new ha30(this, this, b));
    }

    private final biu0 getBinding() {
        Object value = this.q.getValue();
        value.getClass();
        return (biu0) value;
    }

    public static String v(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public final void u(hg30 hg30Var) {
        String string;
        long j = hg30Var.b;
        boolean z = hg30Var.d;
        boolean z2 = hg30Var.g;
        long j2 = hg30Var.f13000a;
        boolean z3 = hg30Var.c;
        long j3 = 0;
        setVisibility((j == 0 && z3) ? 8 : 0);
        getBinding().b.setVisibility(!z2 ? 0 : 8);
        getBinding().c.setVisibility((z3 || z2) ? 8 : 0);
        TextView textView = getBinding().g;
        String str = hg30Var.f;
        String string2 = "";
        if (!z3 || j == 0) {
            if (!z3) {
                long j4 = j2 / 86400;
                if (j2 < 0) {
                    string = getContext().getString(R.string.game_started);
                } else {
                    string = j4 > 0 ? getContext().getString(R.string.line_time_before_v2, String.valueOf(j4)) : getContext().getString(R.string.before_start);
                }
                string2 = string;
                string2.getClass();
            }
        } else if (str.length() > 0) {
            string2 = getContext().getString(R.string.live_additional_min_v2, str);
            string2.getClass();
        } else if (!hg30Var.e) {
            string2 = z ? getContext().getString(R.string.line_live_time_period_back_v2, "") : getContext().getString(R.string.line_live_time_period_capitalized_v2, "");
            string2.getClass();
        }
        textView.setText(string2);
        if (!z3 || j == 0) {
            if (z3) {
                return;
            }
            if (j2 < 0) {
                j2 = 0;
            }
            long j5 = j2 / 60;
            getBinding().d.setText(v((j5 / 60) % 24));
            getBinding().e.setText(v(j5 % 60));
            getBinding().f.setText(v(j2 % 60));
            return;
        }
        getBinding().c.setVisibility(8);
        if (z) {
            long j6 = j - j2;
            if (j6 >= 0) {
                j3 = j6;
            }
        } else {
            j3 = j + j2;
        }
        getBinding().e.setText(v(j3 / 60));
        getBinding().f.setText(v(j3 % 60));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchTimerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
