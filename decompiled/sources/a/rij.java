package a;

import android.gov.nist.core.Separators;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import java.util.Date;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.TimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class rij extends v46 {
    public static final /* synthetic */ int x = 0;
    public final avs0 u;
    public final g6v0 v;
    public final zyx w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rij(View view, avs0 avs0Var, g6v0 g6v0Var) {
        super(view);
        view.getClass();
        this.u = avs0Var;
        this.v = g6v0Var;
        int i = R.id.btnPlay;
        TextView textView = (TextView) yum0.f(view, R.id.btnPlay);
        if (textView != null) {
            i = R.id.groupHurryUp;
            Group group = (Group) yum0.f(view, R.id.groupHurryUp);
            if (group != null) {
                i = R.id.groupNotAvailable;
                Group group2 = (Group) yum0.f(view, R.id.groupNotAvailable);
                if (group2 != null) {
                    i = R.id.ivDayBackground;
                    ImageView imageView = (ImageView) yum0.f(view, R.id.ivDayBackground);
                    if (imageView != null) {
                        i = R.id.mask;
                        View viewF = yum0.f(view, R.id.mask);
                        if (viewF != null) {
                            i = R.id.spacer;
                            if (((Space) yum0.f(view, R.id.spacer)) != null) {
                                i = R.id.timerView;
                                TimerView timerView = (TimerView) yum0.f(view, R.id.timerView);
                                if (timerView != null) {
                                    i = R.id.tvCompleted;
                                    TextView textView2 = (TextView) yum0.f(view, R.id.tvCompleted);
                                    if (textView2 != null) {
                                        i = R.id.tvCongratulations;
                                        TextView textView3 = (TextView) yum0.f(view, R.id.tvCongratulations);
                                        if (textView3 != null) {
                                            i = R.id.tvDayTitle;
                                            TextView textView4 = (TextView) yum0.f(view, R.id.tvDayTitle);
                                            if (textView4 != null) {
                                                i = R.id.tvHurryUp;
                                                if (((TextView) yum0.f(view, R.id.tvHurryUp)) != null) {
                                                    i = R.id.tvNotAvailable;
                                                    if (((TextView) yum0.f(view, R.id.tvNotAvailable)) != null) {
                                                        i = R.id.tvNotAvailableDescription;
                                                        if (((TextView) yum0.f(view, R.id.tvNotAvailableDescription)) != null) {
                                                            this.w = new zyx((ConstraintLayout) view, textView, group, group2, imageView, viewF, timerView, textView2, textView3, textView4);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // a.v46
    public final void t(Object obj) {
        oij oijVar = (oij) obj;
        oijVar.getClass();
        List list = u0d.f34849a;
        zyx zyxVar = this.w;
        ImageView imageView = zyxVar.e;
        TextView textView = zyxVar.b;
        String str = ujn.h;
        int i = oijVar.f25314a;
        u0d.j(imageView, str + "/static/img/android/actions/everyweekTournament/card_back_" + i + ".webp", R.drawable.card_lock, 0, null, null, null, 508);
        TextView textView2 = zyxVar.j;
        textView2.setText(textView2.getContext().getString(R.string.promo_weekly_reward_day_title_v2, Integer.valueOf(i)));
        View view = zyxVar.f;
        pij pijVar = oijVar.b;
        pij pijVar2 = pij.b;
        final byte b = 0;
        view.setVisibility(pijVar == pijVar2 ? 0 : 8);
        zyxVar.h.setVisibility(pijVar == pijVar2 ? 0 : 8);
        Group group = zyxVar.c;
        pij pijVar3 = pij.c;
        group.setVisibility(pijVar == pijVar3 ? 0 : 8);
        zyxVar.d.setVisibility(pijVar == pij.d ? 0 : 8);
        TextView textView3 = zyxVar.i;
        pij pijVar4 = pij.e;
        textView3.setVisibility(pijVar == pijVar4 ? 0 : 8);
        textView.setVisibility(((oijVar.d && pijVar == pijVar3) || pijVar == pijVar4) ? 0 : 8);
        int iOrdinal = pijVar.ordinal();
        final byte b2 = 1;
        if (iOrdinal == 1) {
            textView2.setBackgroundResource(R.drawable.rounded_day_bg);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                textView2.setBackgroundResource(R.drawable.rounded_inactive_day_bg);
                return;
            } else {
                if (iOrdinal != 4) {
                    return;
                }
                textView2.setBackgroundResource(R.drawable.rounded_day_bg);
                textView.setText(textView.getContext().getString(R.string.promo_weekly_reward_play_lucky_wheel));
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: a.qij
                    public final /* synthetic */ rij b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b2;
                        rij rijVar = this.b;
                        switch (b3) {
                            case 0:
                                rijVar.u.invoke();
                                break;
                            default:
                                rijVar.v.invoke();
                                break;
                        }
                    }
                });
                textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.promo_lucky_wheel_small, 0, 0, 0);
                return;
            }
        }
        TimerView timerView = zyxVar.g;
        timerView.v(new Date(new Date().getTime() + oijVar.c), false);
        timerView.setBackground(R.drawable.timer_background);
        TimerView.u(timerView, null, 3);
        textView.setText(textView.getContext().getString(R.string.promo_weekly_reward_play_to) + Separators.SP + oijVar.e);
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: a.qij
            public final /* synthetic */ rij b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b;
                rij rijVar = this.b;
                switch (b3) {
                    case 0:
                        rijVar.u.invoke();
                        break;
                    default:
                        rijVar.v.invoke();
                        break;
                }
            }
        });
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_games_all, 0, 0, 0);
        textView2.setBackgroundResource(R.drawable.rounded_active_day_bg);
    }
}
