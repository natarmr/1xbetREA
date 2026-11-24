package org.xplatform.cyber.game.universal.impl.presentation.durak.view;

import a.a8z;
import a.f73;
import a.fng;
import a.len;
import a.lhf;
import a.maz;
import a.n1o0;
import a.o1o0;
import a.q3d;
import a.wez;
import a.x3h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CyberPlayedCardsTableView extends LinearLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46530a;
    public final List b;
    public ArrayList c;
    public len d;
    public final a8z e;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberPlayedCardsTableView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        wez wezVar = wez.b;
        this.f46530a = maz.a(wezVar, new lhf(this, this, (byte) 8));
        this.b = q3d.j(getBindingView().b, getBindingView().e, getBindingView().g, getBindingView().d, getBindingView().c, getBindingView().f);
        this.e = maz.a(wezVar, new x3h((byte) 26));
    }

    private final o1o0 getBindingView() {
        return (o1o0) this.f46530a.getValue();
    }

    private final List<fng> getEmptyCards() {
        return (List) this.e.getValue();
    }

    public final void a(List list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            fng fngVar = (fng) obj;
            n1o0 n1o0Var = (n1o0) CollectionsKt.W(i, this.b);
            if (n1o0Var != null) {
                n1o0Var.b.setImageResource(fngVar.f9835a);
            }
            if (n1o0Var != null) {
                n1o0Var.c.setImageResource(fngVar.b);
            }
            i = i2;
        }
    }

    public final void b(ArrayList arrayList, len lenVar, boolean z) {
        Animation animationLoadAnimation;
        len lenVar2 = this.d;
        if (lenVar2 != null || this.c != null) {
            if (lenVar2 == len.c || lenVar2 == len.b) {
                a(getEmptyCards());
            }
            byte b = 1;
            AnimationSet animationSet = new AnimationSet(true);
            int iOrdinal = lenVar.ordinal();
            if (iOrdinal == 1) {
                animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.cybergame_durak_table_round_end);
                animationLoadAnimation.setStartOffset(3500L);
            } else if (iOrdinal != 2) {
                animationLoadAnimation = null;
            } else {
                animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), z ? R.anim.cybergame_durak_table_second_player_take : R.anim.cybergame_durak_table_first_player_take);
                animationLoadAnimation.setStartOffset(3500L);
            }
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.cybergame_empty_durak_animation);
            animationLoadAnimation2.setAnimationListener(new f73(this, arrayList, b));
            animationSet.addAnimation(animationLoadAnimation2);
            if (animationLoadAnimation != null) {
                animationSet.addAnimation(animationLoadAnimation);
            }
            animationSet.setFillEnabled(true);
            animationSet.setFillAfter(true);
            clearAnimation();
            setAnimation(animationSet);
            startAnimation(animationSet);
        } else if (lenVar != len.c && lenVar != len.b) {
            a(arrayList);
        }
        this.c = arrayList;
        this.d = lenVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberPlayedCardsTableView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberPlayedCardsTableView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
