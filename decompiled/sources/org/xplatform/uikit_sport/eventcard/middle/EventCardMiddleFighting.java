package org.xplatform.uikit_sport.eventcard.middle;

import a.cbo;
import a.gbo;
import a.hbo;
import a.hin;
import a.hny;
import a.isp;
import a.maz;
import a.n0o0;
import a.q3d;
import a.ryl;
import a.t9f;
import a.tx3;
import a.wsp;
import a.wvb;
import a.yum0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.sequences.Sequence;
import org.xbet.client1.R;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;

/* JADX INFO: loaded from: classes6.dex */
public final class EventCardMiddleFighting extends ConstraintLayout implements cbo {
    public static final /* synthetic */ int w = 0;
    public final hbo q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;
    public final n0o0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardMiddleFighting(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.eventCardMiddleFightingStyle);
        LayoutInflater.from(context).inflate(R.layout.event_card_middle_fighting_view, this);
        int i2 = R.id.barrier;
        if (((Barrier) yum0.f(this, R.id.barrier)) != null) {
            i2 = R.id.botFifthGameScore;
            TextView textView = (TextView) yum0.f(this, R.id.botFifthGameScore);
            if (textView != null) {
                i2 = R.id.botFirstGameScore;
                TextView textView2 = (TextView) yum0.f(this, R.id.botFirstGameScore);
                if (textView2 != null) {
                    i2 = R.id.botFourthGameScore;
                    TextView textView3 = (TextView) yum0.f(this, R.id.botFourthGameScore);
                    if (textView3 != null) {
                        i2 = R.id.botLogo;
                        DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(this, R.id.botLogo);
                        if (dsTeamLogo != null) {
                            i2 = R.id.botResultScore;
                            TextView textView4 = (TextView) yum0.f(this, R.id.botResultScore);
                            if (textView4 != null) {
                                i2 = R.id.botSecondGameScore;
                                TextView textView5 = (TextView) yum0.f(this, R.id.botSecondGameScore);
                                if (textView5 != null) {
                                    i2 = R.id.botTeamName;
                                    TextView textView6 = (TextView) yum0.f(this, R.id.botTeamName);
                                    if (textView6 != null) {
                                        i2 = R.id.botThirdGameScore;
                                        TextView textView7 = (TextView) yum0.f(this, R.id.botThirdGameScore);
                                        if (textView7 != null) {
                                            i2 = R.id.fifthGameTitle;
                                            TextView textView8 = (TextView) yum0.f(this, R.id.fifthGameTitle);
                                            if (textView8 != null) {
                                                i2 = R.id.firstGameTitle;
                                                TextView textView9 = (TextView) yum0.f(this, R.id.firstGameTitle);
                                                if (textView9 != null) {
                                                    i2 = R.id.fourthGameTitle;
                                                    TextView textView10 = (TextView) yum0.f(this, R.id.fourthGameTitle);
                                                    if (textView10 != null) {
                                                        i2 = R.id.liveInfo;
                                                        TextView textView11 = (TextView) yum0.f(this, R.id.liveInfo);
                                                        if (textView11 != null) {
                                                            i2 = R.id.resultTitle;
                                                            TextView textView12 = (TextView) yum0.f(this, R.id.resultTitle);
                                                            if (textView12 != null) {
                                                                i2 = R.id.secondGameTitle;
                                                                TextView textView13 = (TextView) yum0.f(this, R.id.secondGameTitle);
                                                                if (textView13 != null) {
                                                                    i2 = R.id.thirdGameTitle;
                                                                    TextView textView14 = (TextView) yum0.f(this, R.id.thirdGameTitle);
                                                                    if (textView14 != null) {
                                                                        i2 = R.id.topFifthGameScore;
                                                                        TextView textView15 = (TextView) yum0.f(this, R.id.topFifthGameScore);
                                                                        if (textView15 != null) {
                                                                            i2 = R.id.topFirstGameScore;
                                                                            TextView textView16 = (TextView) yum0.f(this, R.id.topFirstGameScore);
                                                                            if (textView16 != null) {
                                                                                i2 = R.id.topFourthGameScore;
                                                                                TextView textView17 = (TextView) yum0.f(this, R.id.topFourthGameScore);
                                                                                if (textView17 != null) {
                                                                                    i2 = R.id.topLogo;
                                                                                    DsTeamLogo dsTeamLogo2 = (DsTeamLogo) yum0.f(this, R.id.topLogo);
                                                                                    if (dsTeamLogo2 != null) {
                                                                                        i2 = R.id.topResultScore;
                                                                                        TextView textView18 = (TextView) yum0.f(this, R.id.topResultScore);
                                                                                        if (textView18 != null) {
                                                                                            i2 = R.id.topSecondGameScore;
                                                                                            TextView textView19 = (TextView) yum0.f(this, R.id.topSecondGameScore);
                                                                                            if (textView19 != null) {
                                                                                                i2 = R.id.topTeamName;
                                                                                                TextView textView20 = (TextView) yum0.f(this, R.id.topTeamName);
                                                                                                if (textView20 != null) {
                                                                                                    i2 = R.id.topThirdGameScore;
                                                                                                    TextView textView21 = (TextView) yum0.f(this, R.id.topThirdGameScore);
                                                                                                    if (textView21 != null) {
                                                                                                        this.q = new hbo(this, textView, textView2, textView3, dsTeamLogo, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, dsTeamLogo2, textView18, textView19, textView20, textView21);
                                                                                                        this.r = maz.b(new ryl(context, (byte) 17));
                                                                                                        this.s = maz.b(new ryl(context, (byte) 18));
                                                                                                        this.t = maz.b(new ryl(context, (byte) 19));
                                                                                                        this.u = maz.b(new ryl(context, (byte) 20));
                                                                                                        this.v = maz.b(new ryl(context, (byte) 21));
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
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final Drawable getBDrawable() {
        return (Drawable) this.r.getValue();
    }

    private final Drawable getFDrawable() {
        return (Drawable) this.s.getValue();
    }

    private final Sequence<gbo> getFightResultViews() {
        hbo hboVar = this.q;
        return tx3.t(new gbo[]{new gbo(hboVar.k, hboVar.r, hboVar.c), new gbo(hboVar.o, hboVar.v, hboVar.g), new gbo(hboVar.p, hboVar.x, hboVar.i), new gbo(hboVar.l, hboVar.s, hboVar.d), new gbo(hboVar.j, hboVar.q, hboVar.b)});
    }

    private final Drawable getFsDrawable() {
        return (Drawable) this.t.getValue();
    }

    private final Drawable getKoDrawable() {
        return (Drawable) this.u.getValue();
    }

    private final Drawable getRDrawable() {
        return (Drawable) this.v.getValue();
    }

    public final void setBotLogo(Drawable drawable) {
        hbo hboVar = this.q;
        hboVar.e.setVisibility(drawable == null ? 8 : 0);
        hboVar.e.setImageDrawable(drawable);
    }

    public final void setBotResultGameScore(isp ispVar) {
        ispVar.getClass();
        wvb.a0(this.q.f, u(ispVar));
    }

    public final void setBotTeamName(CharSequence charSequence) {
        hbo hboVar = this.q;
        hboVar.h.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        hboVar.h.setText(charSequence);
    }

    public final void setInfoText(CharSequence charSequence) {
        hbo hboVar = this.q;
        hboVar.m.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        hboVar.m.setText(charSequence);
    }

    public final void setResultGameTitle(CharSequence charSequence) {
        hbo hboVar = this.q;
        hboVar.n.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        hboVar.n.setText(charSequence);
    }

    public final void setResults(List<wsp> list) {
        List<wsp> list2;
        list.getClass();
        int i = 0;
        for (Object obj : getFightResultViews()) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            gbo gboVar = (gbo) obj;
            int i3 = 8;
            if (i < list.size()) {
                list2 = list;
                wsp wspVar = list2.get(i);
                hin hinVar = new hin(1, this, EventCardMiddleFighting.class, "getTintedDrawable", "getTintedDrawable(Lorg/xplatform/uikit/core/eventcard/middle/FightCellDrawable;)Landroid/graphics/drawable/Drawable;", 0, (byte) 13);
                gboVar.getClass();
                wspVar.getClass();
                TextView textView = gboVar.f11024a;
                CharSequence charSequence = wspVar.f39702a;
                textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
                textView.setText(charSequence);
                gbo.a(gboVar.b, wspVar.b, hinVar);
                gbo.a(gboVar.c, wspVar.c, hinVar);
            } else {
                list2 = list;
            }
            boolean z = i < list2.size();
            gboVar.f11024a.setVisibility(z ? 0 : 8);
            gboVar.b.setVisibility(z ? 0 : 8);
            TextView textView2 = gboVar.c;
            if (z) {
                i3 = 0;
            }
            textView2.setVisibility(i3);
            i = i2;
        }
    }

    public final void setTopLogo(Drawable drawable) {
        hbo hboVar = this.q;
        hboVar.t.setVisibility(drawable == null ? 8 : 0);
        hboVar.t.setImageDrawable(drawable);
    }

    public final void setTopResultGameScore(isp ispVar) {
        ispVar.getClass();
        wvb.a0(this.q.u, u(ispVar));
    }

    public final void setTopTeamName(CharSequence charSequence) {
        hbo hboVar = this.q;
        hboVar.w.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        hboVar.w.setText(charSequence);
    }

    public final Drawable u(isp ispVar) {
        int iOrdinal = ispVar.ordinal();
        if (iOrdinal == 0) {
            return getBDrawable();
        }
        if (iOrdinal == 1) {
            return getFDrawable();
        }
        if (iOrdinal == 2) {
            return getFsDrawable();
        }
        if (iOrdinal == 3) {
            return getKoDrawable();
        }
        if (iOrdinal == 4) {
            return getRDrawable();
        }
        t9f.b();
        return null;
    }

    public final void setBotLogo(int i) {
        setBotLogo(getContext().getDrawable(i));
    }

    public final void setTopLogo(int i) {
        setTopLogo(getContext().getDrawable(i));
    }

    public final void setBotTeamName(int i) {
        setBotTeamName(getContext().getText(i));
    }

    public final void setInfoText(int i) {
        setInfoText(getContext().getText(i));
    }

    public final void setResultGameTitle(int i) {
        setResultGameTitle(getContext().getString(i));
    }

    public final void setTopTeamName(int i) {
        setTopTeamName(getContext().getText(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleFighting(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardMiddleFighting(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
