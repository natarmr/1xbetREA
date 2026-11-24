package org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views;

import a.bj5;
import a.cha;
import a.cia;
import a.d69;
import a.dha;
import a.eha;
import a.fha;
import a.gha;
import a.hny;
import a.iha;
import a.mha;
import a.q3d;
import a.qe5;
import a.qha;
import a.rha;
import a.rwj;
import a.sac;
import a.sha;
import a.t9f;
import a.tkz;
import a.tvk;
import a.xha;
import a.yje;
import a.ys10;
import a.yum0;
import a.z0o0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class CardFootballView extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final z0o0 q;
    public final List r;
    public final List s;
    public final HashMap t;
    public boolean u;
    public final TransitionDrawable v;
    public final TransitionDrawable w;

    /* JADX WARN: Illegal instructions before constructor call */
    public CardFootballView(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, 0);
        LayoutInflater.from(context).inflate(R.layout.synthetic_card_football_view, this);
        int i2 = R.id.clCards;
        if (((ConstraintLayout) yum0.f(this, R.id.clCards)) != null) {
            i2 = R.id.firstPeriodView;
            CardFootballPeriodView cardFootballPeriodView = (CardFootballPeriodView) yum0.f(this, R.id.firstPeriodView);
            if (cardFootballPeriodView != null) {
                i2 = R.id.firstPlayerField;
                CardFootballFieldView cardFootballFieldView = (CardFootballFieldView) yum0.f(this, R.id.firstPlayerField);
                if (cardFootballFieldView != null) {
                    i2 = R.id.ivFirstPlayerFirstDef;
                    ImageView imageView = (ImageView) yum0.f(this, R.id.ivFirstPlayerFirstDef);
                    if (imageView != null) {
                        i2 = R.id.ivFirstPlayerGlk;
                        ImageView imageView2 = (ImageView) yum0.f(this, R.id.ivFirstPlayerGlk);
                        if (imageView2 != null) {
                            i2 = R.id.ivFirstPlayerSecondDef;
                            ImageView imageView3 = (ImageView) yum0.f(this, R.id.ivFirstPlayerSecondDef);
                            if (imageView3 != null) {
                                i2 = R.id.ivSecondPlayerFirstDef;
                                ImageView imageView4 = (ImageView) yum0.f(this, R.id.ivSecondPlayerFirstDef);
                                if (imageView4 != null) {
                                    i2 = R.id.ivSecondPlayerGlk;
                                    ImageView imageView5 = (ImageView) yum0.f(this, R.id.ivSecondPlayerGlk);
                                    if (imageView5 != null) {
                                        i2 = R.id.ivSecondPlayerSecondDef;
                                        ImageView imageView6 = (ImageView) yum0.f(this, R.id.ivSecondPlayerSecondDef);
                                        if (imageView6 != null) {
                                            i2 = R.id.llFirstGoalStatus;
                                            LinearLayout linearLayout = (LinearLayout) yum0.f(this, R.id.llFirstGoalStatus);
                                            if (linearLayout != null) {
                                                i2 = R.id.llSecondGoalStatus;
                                                LinearLayout linearLayout2 = (LinearLayout) yum0.f(this, R.id.llSecondGoalStatus);
                                                if (linearLayout2 != null) {
                                                    i2 = R.id.secondPeriodView;
                                                    CardFootballPeriodView cardFootballPeriodView2 = (CardFootballPeriodView) yum0.f(this, R.id.secondPeriodView);
                                                    if (cardFootballPeriodView2 != null) {
                                                        i2 = R.id.secondPlayerField;
                                                        CardFootballFieldView cardFootballFieldView2 = (CardFootballFieldView) yum0.f(this, R.id.secondPlayerField);
                                                        if (cardFootballFieldView2 != null) {
                                                            i2 = R.id.syntheticTimerView;
                                                            SyntheticTimerView syntheticTimerView = (SyntheticTimerView) yum0.f(this, R.id.syntheticTimerView);
                                                            if (syntheticTimerView != null) {
                                                                i2 = R.id.thirdPeriodView;
                                                                CardFootballPeriodView cardFootballPeriodView3 = (CardFootballPeriodView) yum0.f(this, R.id.thirdPeriodView);
                                                                if (cardFootballPeriodView3 != null) {
                                                                    i2 = R.id.tvAllGoalStatus;
                                                                    TextView textView = (TextView) yum0.f(this, R.id.tvAllGoalStatus);
                                                                    if (textView != null) {
                                                                        i2 = R.id.tvAtt;
                                                                        TextView textView2 = (TextView) yum0.f(this, R.id.tvAtt);
                                                                        if (textView2 != null) {
                                                                            i2 = R.id.tvDef;
                                                                            TextView textView3 = (TextView) yum0.f(this, R.id.tvDef);
                                                                            if (textView3 != null) {
                                                                                i2 = R.id.tvDrawStatus;
                                                                                TextView textView4 = (TextView) yum0.f(this, R.id.tvDrawStatus);
                                                                                if (textView4 != null) {
                                                                                    i2 = R.id.tvFirstGoalStatus;
                                                                                    TextView textView5 = (TextView) yum0.f(this, R.id.tvFirstGoalStatus);
                                                                                    if (textView5 != null) {
                                                                                        i2 = R.id.tvFirstPeriod;
                                                                                        TextView textView6 = (TextView) yum0.f(this, R.id.tvFirstPeriod);
                                                                                        if (textView6 != null) {
                                                                                            i2 = R.id.tvGlk;
                                                                                            TextView textView7 = (TextView) yum0.f(this, R.id.tvGlk);
                                                                                            if (textView7 != null) {
                                                                                                i2 = R.id.tvSecondGoalStatus;
                                                                                                TextView textView8 = (TextView) yum0.f(this, R.id.tvSecondGoalStatus);
                                                                                                if (textView8 != null) {
                                                                                                    i2 = R.id.tvSecondPeriod;
                                                                                                    TextView textView9 = (TextView) yum0.f(this, R.id.tvSecondPeriod);
                                                                                                    if (textView9 != null) {
                                                                                                        i2 = R.id.tvStatus;
                                                                                                        TextView textView10 = (TextView) yum0.f(this, R.id.tvStatus);
                                                                                                        if (textView10 != null) {
                                                                                                            this.q = new z0o0(this, cardFootballPeriodView, cardFootballFieldView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, cardFootballPeriodView2, cardFootballFieldView2, syntheticTimerView, cardFootballPeriodView3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
                                                                                                            this.r = q3d.j(imageView, imageView3, imageView2);
                                                                                                            this.s = q3d.j(imageView4, imageView6, imageView5);
                                                                                                            this.t = new HashMap();
                                                                                                            this.v = new TransitionDrawable(new Drawable[]{context.getDrawable(R.drawable.cybergame_card_football_goal_bg), context.getDrawable(R.drawable.cybergame_card_football_goal_light_bg)});
                                                                                                            this.w = new TransitionDrawable(new Drawable[]{context.getDrawable(R.drawable.cybergame_card_football_goal_light_bg), context.getDrawable(R.drawable.cybergame_card_football_goal_bg)});
                                                                                                            bj5 bj5Var = fha.c;
                                                                                                            cardFootballPeriodView.setAttackNumberText$impl(1);
                                                                                                            cardFootballPeriodView2.setAttackNumberText$impl(2);
                                                                                                            cardFootballPeriodView3.setAttackNumberText$impl(3);
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
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void setDefenderTitles(boolean z) {
        String string = getContext().getString(z ? R.string.synthetic_card_football_def_ru : R.string.synthetic_card_football_def_en);
        string.getClass();
        String string2 = getContext().getString(z ? R.string.synthetic_card_football_glk_ru : R.string.synthetic_card_football_glk_en);
        string2.getClass();
        z0o0 z0o0Var = this.q;
        z0o0Var.k.setText(string);
        z0o0Var.l.setText(string);
        z0o0Var.p.setText(string2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("super");
            Serializable serializable = bundle.getSerializable("attack");
            serializable.getClass();
            this.t.putAll((HashMap) serializable);
            this.u = true;
            super.onRestoreInstanceState(parcelable2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("attack", this.t);
        bundle.putParcelable("super", super.onSaveInstanceState());
        return bundle;
    }

    public final void setFirstPeriod$impl(mha mhaVar) {
        mhaVar.getClass();
        z0o0 z0o0Var = this.q;
        z0o0Var.o.setText(mhaVar.f21780a);
        TextView textView = z0o0Var.o;
        Context context = getContext();
        context.getClass();
        textView.setTextColor(context.getColor(mhaVar.c));
        Context context2 = getContext();
        context2.getClass();
        textView.setBackground(context2.getDrawable(mhaVar.b));
    }

    public final void setSecondPeriod$impl(mha mhaVar) {
        mhaVar.getClass();
        z0o0 z0o0Var = this.q;
        z0o0Var.r.setText(mhaVar.f21780a);
        TextView textView = z0o0Var.r;
        Context context = getContext();
        context.getClass();
        textView.setTextColor(context.getColor(mhaVar.c));
        Context context2 = getContext();
        context2.getClass();
        textView.setBackground(context2.getDrawable(mhaVar.b));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c A[LOOP:0: B:20:0x0056->B:22:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[LOOP:1: B:28:0x008e->B:30:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (a.qcc.O(500, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b8 -> B:34:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(android.widget.TextView r12, java.util.List r13, a.zje r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof a.gia
            if (r0 == 0) goto L13
            r0 = r14
            a.gia r0 = (a.gia) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.gia r0 = new a.gia
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 2
            r6 = 1
            r7 = 500(0x1f4, float:7.0E-43)
            if (r2 == 0) goto L46
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L35
            int r12 = r0.k
            java.util.List r13 = r0.j
            android.widget.TextView r2 = r0.i
            a.z1x.P(r14)
            goto Lbb
        L35:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L3c:
            int r12 = r0.k
            java.util.List r13 = r0.j
            android.widget.TextView r2 = r0.i
            a.z1x.P(r14)
            goto L85
        L46:
            a.z1x.P(r14)
            r14 = 0
        L4a:
            r2 = 5
            if (r14 >= r2) goto Lbf
            android.graphics.drawable.TransitionDrawable r2 = r11.v
            r12.setBackground(r2)
            java.util.Iterator r8 = r13.iterator()
        L56:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L71
            java.lang.Object r9 = r8.next()
            org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballFieldView r9 = (org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballFieldView) r9
            a.vd7 r10 = r9.q
            android.view.View r10 = r10.d
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            android.graphics.drawable.TransitionDrawable r9 = r9.x
            r10.setImageDrawable(r9)
            r9.startTransition(r7)
            goto L56
        L71:
            r2.startTransition(r7)
            r0.i = r12
            r0.j = r13
            r0.k = r14
            r0.n = r6
            java.lang.Object r2 = a.qcc.O(r3, r0)
            if (r2 != r1) goto L83
            goto Lba
        L83:
            r2 = r12
            r12 = r14
        L85:
            android.graphics.drawable.TransitionDrawable r14 = r11.w
            r2.setBackground(r14)
            java.util.Iterator r8 = r13.iterator()
        L8e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La9
            java.lang.Object r9 = r8.next()
            org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballFieldView r9 = (org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballFieldView) r9
            a.vd7 r10 = r9.q
            android.view.View r10 = r10.d
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            android.graphics.drawable.TransitionDrawable r9 = r9.y
            r10.setImageDrawable(r9)
            r9.startTransition(r7)
            goto L8e
        La9:
            r14.startTransition(r7)
            r0.i = r2
            r0.j = r13
            r0.k = r12
            r0.n = r5
            java.lang.Object r14 = a.qcc.O(r3, r0)
            if (r14 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            int r14 = r12 + 1
            r12 = r2
            goto L4a
        Lbf:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballView.u(android.widget.TextView, java.util.List, a.zje):java.lang.Object");
    }

    public final void v(gha ghaVar, tkz tkzVar, boolean z) {
        xha xhaVar = ghaVar.f11287a;
        HashMap map = this.t;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((xha) ((Map.Entry) it.next()).getValue()).c.b != xhaVar.c.b) {
                    map.clear();
                    break;
                }
            }
        }
        if (this.u) {
            this.u = false;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                w((xha) ((Map.Entry) it2.next()).getValue(), new eha(dha.d), true, tkzVar);
            }
        }
        map.put(Integer.valueOf(xhaVar.c.f9530a), xhaVar);
        w(xhaVar, ghaVar.b, z, tkzVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    public final void w(xha xhaVar, eha ehaVar, boolean z, tkz tkzVar) {
        CardFootballPeriodView cardFootballPeriodView;
        fha fhaVar = xhaVar.c;
        fha fhaVar2 = fha.d;
        z0o0 z0o0Var = this.q;
        if (fhaVar == fhaVar2) {
            z0o0Var.b.u();
            z0o0Var.f.u();
            z0o0Var.i.u();
            z0o0Var.c.u();
            z0o0Var.g.u();
            return;
        }
        int iOrdinal = fhaVar.ordinal();
        if (iOrdinal == 1) {
            cardFootballPeriodView = z0o0Var.b;
        } else if (iOrdinal == 2) {
            cardFootballPeriodView = z0o0Var.f;
        } else if (iOrdinal == 4) {
            cardFootballPeriodView = z0o0Var.b;
        } else if (iOrdinal != 5) {
            cardFootballPeriodView = z0o0Var.i;
        } else {
            cardFootballPeriodView = z0o0Var.f;
        }
        ArrayList arrayList = xhaVar.b;
        ArrayList arrayList2 = xhaVar.f40880a;
        int i = 0;
        int i2 = 0;
        for (Object obj : arrayList2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            ((CardFootballAttackCardView) cardFootballPeriodView.r.get(i2)).v((cha) obj, i2, z);
            i2 = i3;
        }
        for (Object obj2 : arrayList) {
            int i4 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((CardFootballAttackCardView) cardFootballPeriodView.s.get(i)).v((cha) obj2, i, z);
            i = i4;
        }
        if (z || arrayList2.isEmpty() || arrayList.isEmpty()) {
            return;
        }
        z0o0Var.c.setAttackCardsOnField$impl(arrayList2);
        z0o0Var.g.setAttackCardsOnField$impl(arrayList);
        long jMax = ((long) Math.max(arrayList2.size(), arrayList.size())) * 1000;
        rwj rwjVar = tvk.f34603a;
        sac.V(tkzVar, new d69((byte) 15), null, ys10.f43147a, new qe5(jMax, this, ehaVar, (yje) null), 10);
    }

    public final void x(List list, List list2, boolean z) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            if (z) {
                Context context = getContext();
                context.getClass();
                new iha(context, (ImageView) list2.get(i), iIntValue);
            } else {
                ImageView imageView = (ImageView) list2.get(i);
                Context context2 = getContext();
                context2.getClass();
                imageView.setImageDrawable(context2.getDrawable(iIntValue));
            }
            i = i2;
        }
    }

    public final void y(sha shaVar, tkz tkzVar) {
        boolean z = shaVar instanceof qha;
        z0o0 z0o0Var = this.q;
        if (z) {
            z0o0Var.s.setText(((qha) shaVar).f28727a);
            z0o0Var.h.setVisibility(4);
            z0o0Var.s.setVisibility(0);
        } else {
            if (!(shaVar instanceof rha)) {
                t9f.b();
                return;
            }
            rha rhaVar = (rha) shaVar;
            SyntheticTimerView.b(z0o0Var.h, rhaVar.f30480a, tkzVar, rhaVar.b, 4);
            z0o0Var.s.setVisibility(4);
            z0o0Var.h.setVisibility(0);
        }
        z0o0Var.m.setVisibility(8);
        z0o0Var.d.setVisibility(8);
        z0o0Var.e.setVisibility(8);
        z0o0Var.j.setVisibility(8);
        z0o0Var.c.u();
        z0o0Var.g.u();
    }

    public final void z(cia ciaVar, boolean z) {
        if (z) {
            setDefenderTitles(ciaVar.d);
        }
        boolean z2 = ciaVar.c;
        List list = ciaVar.b;
        List list2 = ciaVar.f4401a;
        boolean z3 = z2 && !z;
        z0o0 z0o0Var = this.q;
        z0o0Var.c.v(list2, z3);
        z0o0Var.g.v(list, z3);
        x(list2, this.r, z3);
        x(list, this.s, z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFootballView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardFootballView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
