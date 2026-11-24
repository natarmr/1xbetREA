package org.xplatform.uikit_sport.score;

import a.a8z;
import a.fzk0;
import a.j0x;
import a.maz;
import a.n5h0;
import a.o5h0;
import a.oh60;
import a.p5h0;
import a.t9f;
import a.wez;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class SportScore extends AppCompatTextView {
    public static final /* synthetic */ int k = 0;
    public boolean i;
    public final a8z j;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportScore(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.scoreStyle);
        this.j = maz.a(wez.b, new fzk0((byte) 12));
    }

    private final String getVsScoreTitle() {
        return (String) this.j.getValue();
    }

    public static final void j(p5h0 p5h0Var, SportScore sportScore) {
        CharSequence vsScoreTitle;
        if (p5h0Var instanceof n5h0) {
            n5h0 n5h0Var = (n5h0) p5h0Var;
            String str = n5h0Var.f22944a;
            boolean z = n5h0Var.c;
            boolean z2 = n5h0Var.d;
            String str2 = n5h0Var.b;
            sportScore.setContentDescription(str + " : " + str2);
            if (sportScore.i && sportScore.getParent().getLayoutDirection() == 1) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) str2);
                if (z2) {
                    Context context = sportScore.getContext();
                    context.getClass();
                    j0x.J(spannableStringBuilder, context, 0, str2.length());
                }
                spannableStringBuilder.append((CharSequence) " : ");
                spannableStringBuilder.append((CharSequence) str);
                if (z) {
                    Context context2 = sportScore.getContext();
                    context2.getClass();
                    j0x.J(spannableStringBuilder, context2, str2.length() + 3, str.length() + str2.length() + 3);
                }
                vsScoreTitle = new SpannedString(spannableStringBuilder);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) str);
                if (z) {
                    Context context3 = sportScore.getContext();
                    context3.getClass();
                    j0x.J(spannableStringBuilder2, context3, 0, str.length());
                }
                spannableStringBuilder2.append((CharSequence) " : ");
                spannableStringBuilder2.append((CharSequence) str2);
                if (z2) {
                    Context context4 = sportScore.getContext();
                    context4.getClass();
                    j0x.J(spannableStringBuilder2, context4, str.length() + 3, str2.length() + str.length() + 3);
                }
                vsScoreTitle = new SpannedString(spannableStringBuilder2);
            }
        } else {
            if (!Intrinsics.d(p5h0Var, o5h0.f24687a)) {
                t9f.b();
                return;
            }
            vsScoreTitle = sportScore.getVsScoreTitle();
        }
        sportScore.setText(vsScoreTitle);
        sportScore.setTag("SportScoreTestTag");
    }

    public final void setRtlSupportEnabled(boolean z) {
        this.i = z;
        requestLayout();
        invalidate();
    }

    public final void setScore(p5h0 p5h0Var) {
        p5h0Var.getClass();
        post(new oh60(p5h0Var, this, (byte) 22));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportScore(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportScore(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
