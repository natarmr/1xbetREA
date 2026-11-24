package org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo;

import a.a8z;
import a.aa30;
import a.akc;
import a.b120;
import a.ba30;
import a.bek;
import a.bus;
import a.bww;
import a.ca30;
import a.cus;
import a.d0k0;
import a.da30;
import a.dja;
import a.du20;
import a.fa30;
import a.ga30;
import a.gbl0;
import a.glz;
import a.ha30;
import a.hgk0;
import a.hny;
import a.hsr;
import a.i14;
import a.iun;
import a.iym0;
import a.j5d;
import a.jtv;
import a.k110;
import a.knd;
import a.lme0;
import a.lnd;
import a.maz;
import a.mbz;
import a.mx2;
import a.n0o0;
import a.n230;
import a.n6r;
import a.ncl0;
import a.ofs;
import a.osr;
import a.pkd;
import a.pz40;
import a.qek0;
import a.qfs;
import a.qgd;
import a.r3d;
import a.rgu0;
import a.ro10;
import a.roi0;
import a.s930;
import a.sek;
import a.sj3;
import a.t9f;
import a.tk80;
import a.tl60;
import a.twn;
import a.u0d;
import a.ugd;
import a.ujn;
import a.v930;
import a.w23;
import a.wez;
import a.wss;
import a.wvb;
import a.x930;
import a.xke;
import a.y930;
import a.yge0;
import a.yke;
import a.yz3;
import a.z930;
import a.zb5;
import a.zhu0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.AnimatedViewsHeights;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.ui_core.circleindicator.CircleIndicator;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ManageHorizontalScrollLinearLayout;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class MatchInfoContainerView extends ConstraintLayout implements xke {
    public static final /* synthetic */ int t1 = 0;
    public lnd A;
    public hsr B;
    public y930 f1;
    public boolean g1;
    public CardIdentity h1;
    public CardIdentity i1;
    public du20 j1;
    public du20 k1;
    public roi0 l1;
    public AnimatedViewsHeights m1;
    public gbl0 n1;
    public List o1;
    public final pz40 p1;
    public final a8z q;
    public boolean q1;
    public final a8z r;
    public final v930 r1;
    public final int s;
    public final n0o0 s1;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final n0o0 y;
    public final n0o0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public MatchInfoContainerView(Context context, AttributeSet attributeSet, int i) {
        byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        wez wezVar = wez.b;
        this.q = maz.a(wezVar, new ha30(this, this, (byte) 0));
        this.r = maz.a(wezVar, new n230((byte) 5));
        this.s = getResources().getDimensionPixelSize(R.dimen.match_info_cards_height);
        this.t = getResources().getDimensionPixelSize(R.dimen.compressed_card_height);
        this.u = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.v = getResources().getDimensionPixelSize(R.dimen.space_24);
        this.w = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.x = getResources().getDimensionPixelSize(R.dimen.space_0);
        this.y = maz.b(new z930(this, b));
        this.z = maz.b(new z930(this, (byte) 3));
        this.f1 = y930.b;
        dja djaVar = dja.COMMON;
        this.h1 = new CardIdentity(djaVar, -1);
        this.i1 = new CardIdentity(djaVar, -1);
        this.o1 = iun.f15405a;
        this.p1 = e.e(null);
        this.r1 = new v930(getAnimatorState());
        this.s1 = maz.b(new n230((byte) 6));
    }

    public static final Unit C(MatchInfoContainerView matchInfoContainerView, ArrayList arrayList) {
        matchInfoContainerView.setFirstCard(arrayList);
        return Unit.f46060a;
    }

    public static final Unit L(MatchInfoContainerView matchInfoContainerView, mbz mbzVar) {
        roi0 roi0Var = matchInfoContainerView.l1;
        if (roi0Var != null) {
            gbl0 gbl0Var = (gbl0) roi0Var.f30839a;
            lme0 lme0Var = gbl0.c2;
            gbl0Var.I0().b.setTouchable(true);
        }
        matchInfoContainerView.getBinding().f.setTranslatedContainer(false);
        mbzVar.invoke();
        return Unit.f46060a;
    }

    public static final Unit M(MatchInfoContainerView matchInfoContainerView) {
        roi0 roi0Var = matchInfoContainerView.l1;
        if (roi0Var != null) {
            gbl0 gbl0Var = (gbl0) roi0Var.f30839a;
            lme0 lme0Var = gbl0.c2;
            gbl0Var.I0().b.setTouchable(false);
        }
        matchInfoContainerView.getBinding().f.setTranslatedContainer(true);
        return Unit.f46060a;
    }

    private final s930 getAnimatorState() {
        float alpha = getBinding().i.getAlpha();
        float alpha2 = getBinding().h.getAlpha();
        int i = bww.O(this.f1) ? 0 : this.s;
        int i2 = bww.O(this.f1) ? this.t : 0;
        ViewGroup.LayoutParams layoutParams = getBinding().b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return new s930(this.s, this.t, alpha, alpha2, i, i2, marginLayoutParams != null ? marginLayoutParams.topMargin : 0, this.x, this.w, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zhu0 getBinding() {
        Object value = this.q.getValue();
        value.getClass();
        return (zhu0) value;
    }

    private final fa30 getBroadcastCardsScrollListener() {
        return (fa30) this.y.getValue();
    }

    private final x930 getExpandAnimator() {
        return (x930) this.s1.getValue();
    }

    private final ga30 getInformationCardsScrollListener() {
        return (ga30) this.z.getValue();
    }

    private final tk80 getSnapHelper() {
        return (tk80) this.r.getValue();
    }

    private final void setFirstCard(List<? extends ofs> list) {
        this.h1 = ((ofs) CollectionsKt.U(list)).a();
        getBinding().i.y0(this.h1.b);
        du20 du20Var = this.k1;
        if (du20Var != null) {
            du20Var.invoke(this.h1);
        }
    }

    private final void setScrollEnabled(boolean z) {
        b layoutManager = getBinding().i.getLayoutManager();
        layoutManager.getClass();
        ((ManageHorizontalScrollLinearLayout) layoutManager).g1 = z;
    }

    public final void A(int i) {
        RecyclerView recyclerView = getBinding().i;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = i;
        recyclerView.setLayoutParams(layoutParams);
        getBinding().i.setVisibility(i == 0 ? 4 : 0);
        getBinding().d.setVisibility(i != 0 ? 0 : 4);
    }

    public final void B() {
        wvb.Z(getBinding().i, new b120(this, (byte) 12));
    }

    public final void D(View view, View view2, mbz mbzVar) {
        View paginationView = getPaginationView();
        View tabsContainerView = getTabsContainerView();
        View matchInfoCardsView = getMatchInfoCardsView();
        ViewGroup cardsContainer = getCardsContainer();
        final qgd qgdVar = new qgd(view2, view, this, paginationView, tabsContainerView, matchInfoCardsView, cardsContainer, (byte) 10);
        y930 y930Var = y930.b;
        this.f1 = y930Var;
        AnimatedViewsHeights animatedViewsHeights = this.m1;
        if (animatedViewsHeights != null) {
            mbz mbzVar2 = new mbz(mbzVar, this, (byte) 23);
            final x930 expandAnimator = getExpandAnimator();
            z930 z930Var = new z930(this, (byte) 1);
            mbz mbzVar3 = new mbz(this, mbzVar2, (byte) 21);
            expandAnimator.getClass();
            AnimatorSet animatorSet = expandAnimator.f40491a;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            AnimatorSet animatorSetA = x930.a(view2);
            paginationView.getClass();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(paginationView, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(600L);
            ObjectAnimator objectAnimatorW = iym0.w(tabsContainerView, 0.0f);
            ObjectAnimator objectAnimatorW2 = iym0.w(matchInfoCardsView, 0.0f);
            TypedValue typedValue = j5d.f15927a;
            Context context = cardsContainer.getContext();
            context.getClass();
            int iA = j5d.a(context, R.attr.uikitCustomDarkBlueBackground80, false);
            Context context2 = cardsContainer.getContext();
            context2.getClass();
            final byte b = 0;
            final byte b2 = 1;
            animatorSet2.playTogether(animatorSetA, objectAnimatorOfFloat, objectAnimatorW, objectAnimatorW2, iym0.o(cardsContainer, iA, j5d.a(context2, R.attr.uikitCustomDarkBlueBackground65, false)), x930.b(view, animatedViewsHeights.f46993a, null), x930.b(this, animatedViewsHeights.b, new Function0(expandAnimator, qgdVar, b) { // from class: a.w930

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f38758a;
                public final /* synthetic */ qgd b;

                {
                    this.f38758a = b;
                    this.b = qgdVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = this.f38758a;
                    qgd qgdVar2 = this.b;
                    switch (b3) {
                        case 0:
                            MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) qgdVar2.d;
                            ViewGroup.LayoutParams layoutParams = matchInfoContainerView.getLayoutParams();
                            layoutParams.height = -2;
                            matchInfoContainerView.setLayoutParams(layoutParams);
                            break;
                        default:
                            View view3 = (View) qgdVar2.h;
                            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                            layoutParams2.height = -2;
                            view3.setLayoutParams(layoutParams2);
                            break;
                    }
                    return Unit.f46060a;
                }
            }), x930.b(matchInfoCardsView, animatedViewsHeights.c, null), x930.b(cardsContainer, animatedViewsHeights.d, new Function0(expandAnimator, qgdVar, b2) { // from class: a.w930

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f38758a;
                public final /* synthetic */ qgd b;

                {
                    this.f38758a = b2;
                    this.b = qgdVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = this.f38758a;
                    qgd qgdVar2 = this.b;
                    switch (b3) {
                        case 0:
                            MatchInfoContainerView matchInfoContainerView = (MatchInfoContainerView) qgdVar2.d;
                            ViewGroup.LayoutParams layoutParams = matchInfoContainerView.getLayoutParams();
                            layoutParams.height = -2;
                            matchInfoContainerView.setLayoutParams(layoutParams);
                            break;
                        default:
                            View view3 = (View) qgdVar2.h;
                            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                            layoutParams2.height = -2;
                            view3.setLayoutParams(layoutParams2);
                            break;
                    }
                    return Unit.f46060a;
                }
            }));
            animatorSet2.addListener(new akc(qgdVar, z930Var, (byte) 10));
            animatorSet2.addListener(new akc(qgdVar, mbzVar3, (byte) 9));
            animatorSet2.setDuration(600L);
            animatorSet2.start();
            expandAnimator.f40491a = animatorSet2;
            setScrollEnabled(true);
        }
        roi0 roi0Var = this.l1;
        if (roi0Var != null) {
            roi0Var.l(y930Var);
        }
    }

    public final void E() {
        yge0 adapter;
        RecyclerView recyclerView;
        yge0 adapter2;
        zhu0 binding = getBinding();
        binding.k.g(getBroadcastCardsScrollListener());
        RecyclerView recyclerView2 = binding.i;
        recyclerView2.u0(getInformationCardsScrollListener());
        zhu0 binding2 = getBinding();
        CircleIndicator circleIndicator = binding2.d;
        RecyclerView recyclerView3 = circleIndicator.g;
        if (recyclerView3 != null && (adapter = recyclerView3.getAdapter()) != null) {
            if (adapter.f42580a.a() && (recyclerView = circleIndicator.g) != null && (adapter2 = recyclerView.getAdapter()) != null) {
                adapter2.y(circleIndicator.d);
            }
            RecyclerView recyclerView4 = circleIndicator.g;
            if (recyclerView4 != null) {
                recyclerView4.u0(circleIndicator.c);
            }
        }
        binding2.c.c();
        this.k1 = null;
        this.j1 = null;
        binding.k.setAdapter(null);
        recyclerView2.setAdapter(null);
        binding.h.setAdapter(null);
        this.A = null;
        List list = u0d.f34849a;
        u0d.a(binding.g);
        binding.b.e();
        AnimatorSet animatorSet = getExpandAnimator().f40491a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.l1 = null;
        this.n1 = null;
        v930 v930Var = this.r1;
        AnimatorSet animatorSet2 = v930Var.h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = v930Var.g;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    public final void F(qfs qfsVar, lnd lndVar, ncl0 ncl0Var, ncl0 ncl0Var2, roi0 roi0Var, ncl0 ncl0Var3, gbl0 gbl0Var) {
        qfsVar.getClass();
        lndVar.getClass();
        ncl0Var.getClass();
        ncl0Var2.getClass();
        roi0Var.getClass();
        ncl0Var3.getClass();
        zhu0 binding = getBinding();
        binding.e.setClipToOutline(true);
        binding.i.o(getInformationCardsScrollListener());
        binding.k.c(getBroadcastCardsScrollListener());
        byte b = 0;
        getBinding().f.setInfoTabClickDebounceListener(new aa30(ncl0Var, b));
        getBinding().f.setBroadcastingTabClickDebounceListener(new aa30(ncl0Var, (byte) 1));
        RecyclerView recyclerView = getBinding().i;
        if (recyclerView.getAdapter() == null) {
            yge0 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.x(2);
            }
            recyclerView.setAdapter(qfsVar);
            getSnapHelper().b(recyclerView);
            CircleIndicator circleIndicator = getBinding().d;
            tk80 snapHelper = getSnapHelper();
            snapHelper.getClass();
            circleIndicator.g = recyclerView;
            circleIndicator.f = snapHelper;
            yge0 adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                adapter2.v(circleIndicator.d);
                circleIndicator.i = -1;
                circleIndicator.k = adapter2.d();
                circleIndicator.j = circleIndicator.e(recyclerView.getLayoutManager());
                circleIndicator.d();
                recyclerView.o(circleIndicator.c);
            }
            recyclerView.setHasFixedSize(true);
        }
        FrozenRecyclerView frozenRecyclerView = getBinding().h;
        if (frozenRecyclerView.getAdapter() == null) {
            this.A = lndVar;
            frozenRecyclerView.setAdapter(lndVar);
            frozenRecyclerView.setHasFixedSize(true);
        }
        if (this.k1 == null) {
            this.k1 = new du20(1, ncl0Var2, ca30.class, "onCardChanged", "onCardChanged(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)V", 0, (byte) 21);
        }
        if (this.j1 == null) {
            this.j1 = new du20(1, ncl0Var2, ca30.class, "onBroadcastCardsPositionChanged", "onBroadcastCardsPositionChanged(I)V", 0, (byte) 22);
        }
        if (this.l1 == null) {
            this.l1 = roi0Var;
        }
        pkd.h(binding.b, qek0.h, null, new ugd(-367891303, true, new ba30(this, ncl0Var3, b)));
        this.n1 = gbl0Var;
    }

    public final boolean G() {
        return getBinding().f.f47000a;
    }

    public final void H(bus busVar) {
        getBinding().b.setVisibility(8);
        Q(ujn.t);
        ViewPager2 viewPager2 = getBinding().k;
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (viewPager2.isAttachedToWindow()) {
            viewPager2.e(busVar.f3248a, false);
        } else {
            viewPager2.addOnAttachStateChangeListener(new i14(viewPager2, viewPager2, busVar, (byte) 2));
        }
    }

    public final void I(View view, View view2, int i, int i2) {
        float f;
        if (bww.Q(this.f1)) {
            D(view, view2, null);
            return;
        }
        View paginationView = getPaginationView();
        View tabsContainerView = getTabsContainerView();
        View matchInfoCardsView = getMatchInfoCardsView();
        ViewGroup cardsContainer = getCardsContainer();
        qgd qgdVar = new qgd(view2, view, this, paginationView, tabsContainerView, matchInfoCardsView, cardsContainer, (byte) 10);
        y930 y930Var = y930.c;
        this.f1 = y930Var;
        setScrollEnabled(false);
        this.m1 = new AnimatedViewsHeights(view.getHeight(), getHeight(), matchInfoCardsView.getHeight(), cardsContainer.getHeight(), i, i2);
        x930 expandAnimator = getExpandAnimator();
        boolean zG = G();
        z930 z930Var = new z930(this, (byte) 4);
        z930 z930Var2 = new z930(this, (byte) 0);
        expandAnimator.getClass();
        int dimensionPixelSize = i - view.getContext().getResources().getDimensionPixelSize(R.dimen.space_32);
        if (zG) {
            int height = tabsContainerView.getHeight();
            ViewGroup.LayoutParams layoutParams = tabsContainerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            f = -(height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
        } else {
            f = 0.0f;
        }
        AnimatorSet animatorSet = expandAnimator.f40491a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSetA = x930.a(view2);
        paginationView.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(paginationView, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(600L);
        ObjectAnimator objectAnimatorW = iym0.w(tabsContainerView, f);
        ObjectAnimator objectAnimatorW2 = iym0.w(matchInfoCardsView, f);
        TypedValue typedValue = j5d.f15927a;
        Context context = cardsContainer.getContext();
        context.getClass();
        int iA = j5d.a(context, R.attr.uikitCustomDarkBlueBackground65, false);
        Context context2 = cardsContainer.getContext();
        context2.getClass();
        ValueAnimator valueAnimatorO = iym0.o(cardsContainer, iA, j5d.a(context2, R.attr.uikitCustomDarkBlueBackground80, false));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view.getHeight(), dimensionPixelSize);
        byte b = 2;
        valueAnimatorOfInt.addUpdateListener(new ro10(view, b));
        valueAnimatorOfInt.setDuration(600L);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(getHeight(), i2);
        valueAnimatorOfInt2.addUpdateListener(new ro10(this, b));
        valueAnimatorOfInt2.setDuration(600L);
        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(matchInfoCardsView.getHeight(), i);
        valueAnimatorOfInt3.addUpdateListener(new ro10(matchInfoCardsView, (byte) 2));
        valueAnimatorOfInt3.setDuration(600L);
        ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(cardsContainer.getHeight(), i);
        valueAnimatorOfInt4.addUpdateListener(new ro10(cardsContainer, (byte) 2));
        valueAnimatorOfInt4.setDuration(600L);
        animatorSet2.playTogether(animatorSetA, objectAnimatorOfFloat, objectAnimatorW, objectAnimatorW2, valueAnimatorO, valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfInt3, valueAnimatorOfInt4);
        animatorSet2.addListener(new akc(qgdVar, z930Var, (byte) 12));
        animatorSet2.addListener(new akc(qgdVar, z930Var2, (byte) 11));
        animatorSet2.setDuration(600L);
        animatorSet2.start();
        expandAnimator.f40491a = animatorSet2;
        roi0 roi0Var = this.l1;
        if (roi0Var != null) {
            roi0Var.l(y930Var);
        }
    }

    public final void J(cus cusVar) {
        lnd lndVar;
        CardIdentity cardIdentity;
        List list;
        knd kndVar;
        List list2;
        getBinding().b.setVisibility(0);
        Q(jtv.p);
        CardIdentity cardIdentity2 = this.h1;
        CardIdentity cardIdentity3 = cusVar.f5000a;
        if (!Intrinsics.d(cardIdentity2, cardIdentity3)) {
            getBinding().i.y0(cardIdentity3.b);
        }
        this.h1 = cardIdentity3;
        s930 animatorState = getAnimatorState();
        v930 v930Var = this.r1;
        v930Var.getClass();
        animatorState.getClass();
        v930Var.d = animatorState;
        lnd lndVar2 = this.A;
        knd kndVar2 = null;
        Object obj = null;
        kndVar2 = null;
        if (lndVar2 != null && (list2 = lndVar2.e.f) != null) {
            for (Object obj2 : list2) {
                if (((knd) obj2).a().f46994a == this.h1.f46994a) {
                    obj = obj2;
                    break;
                }
            }
            kndVar2 = (knd) obj;
        }
        if ((kndVar2 == null || (cardIdentity = kndVar2.a()) == null) && ((lndVar = this.A) == null || (list = lndVar.e.f) == null || (kndVar = (knd) CollectionsKt.firstOrNull(list)) == null || (cardIdentity = kndVar.a()) == null)) {
            cardIdentity = new CardIdentity(dja.COMMON, -1);
        }
        this.i1 = cardIdentity;
        getBinding().h.y0(this.i1.b);
    }

    public final void K() {
        CardIdentity cardIdentityA;
        yge0 adapter = getBinding().i.getAdapter();
        Object obj = null;
        qfs qfsVar = adapter instanceof qfs ? (qfs) adapter : null;
        if (qfsVar == null) {
            return;
        }
        Iterable iterable = qfsVar.e.f;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        for (Object obj2 : iterable) {
            if (((ofs) obj2).a().f46994a == dja.PENALTY) {
                obj = obj2;
                break;
            }
        }
        ofs ofsVar = (ofs) obj;
        if (ofsVar == null || (cardIdentityA = ofsVar.a()) == null) {
            return;
        }
        this.h1 = cardIdentityA;
        getBinding().i.y0(cardIdentityA.b);
        du20 du20Var = this.k1;
        if (du20Var != null) {
            du20Var.invoke(cardIdentityA);
        }
    }

    public final void N(LinearLayoutManager linearLayoutManager) {
        CardIdentity cardIdentityA;
        du20 du20Var;
        if (linearLayoutManager != null && linearLayoutManager.c1() == -1) {
            du20 du20Var2 = this.k1;
            if (du20Var2 != null) {
                du20Var2.invoke(this.h1);
                return;
            }
            return;
        }
        yge0 adapter = getBinding().i.getAdapter();
        adapter.getClass();
        List list = ((qfs) adapter).e.f;
        if (list != null) {
            ofs ofsVar = (ofs) CollectionsKt.W(linearLayoutManager != null ? linearLayoutManager.c1() : 0, list);
            if (ofsVar == null || (cardIdentityA = ofsVar.a()) == null || (du20Var = this.k1) == null) {
                return;
            }
            du20Var.invoke(cardIdentityA);
        }
    }

    public final void O(boolean z) {
        zhu0 binding = getBinding();
        if (z) {
            ShimmerFrameLayout shimmerFrameLayout = binding.j;
            if (shimmerFrameLayout.c) {
                return;
            }
            shimmerFrameLayout.c = true;
            shimmerFrameLayout.b();
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = binding.j;
        if (shimmerFrameLayout2.c) {
            shimmerFrameLayout2.c();
            shimmerFrameLayout2.c = false;
            shimmerFrameLayout2.invalidate();
        }
        binding.j.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:73:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[LOOP:1: B:20:0x004c->B:75:?, LOOP_END, SYNTHETIC] */
    public final void P(ArrayList arrayList) {
        boolean z;
        Iterator it;
        yge0 adapter = getBinding().i.getAdapter();
        adapter.getClass();
        qfs qfsVar = (qfs) adapter;
        List list = qfsVar.e.f;
        if (list == null) {
            list = iun.f15405a;
        }
        boolean z2 = false;
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((ofs) it2.next()).a().f46994a == dja.PENALTY) {
                        }
                    } else {
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                        it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (((ofs) it.next()).a().f46994a == dja.PENALTY) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    z = false;
                    break;
                }
            }
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((ofs) it.next()).a().f46994a == dja.PENALTY) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (list.isEmpty() && !arrayList.isEmpty()) {
            qfsVar.A(arrayList);
            RecyclerView recyclerView = getBinding().i;
            tl60.a(recyclerView, new mx2(recyclerView, this, (byte) 21));
        } else if (z && (bww.Q(this.f1) || bww.O(this.f1))) {
            qfsVar.A(arrayList);
            this.q1 = true;
        } else if (z) {
            qfsVar.B(arrayList, new wss(this, (byte) 9));
        } else {
            qfsVar.A(arrayList);
        }
        if (this.q1) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        this.q1 = false;
                        break;
                    }
                } while (((ofs) it3.next()).a().f46994a != dja.PENALTY);
            } else {
                this.q1 = false;
                break;
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    z2 = true;
                    break;
                }
            } while (((ofs) it4.next()).a().f46994a != this.h1.f46994a);
        } else {
            z2 = true;
            break;
        }
        if (z || !z2 || arrayList.isEmpty()) {
            return;
        }
        if (bww.Q(this.f1)) {
            wvb.Z(getBinding().i, new k110((Object) this, (Object) arrayList, (byte) 29));
        } else {
            setFirstCard(arrayList);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Q(da30 da30Var) {
        hsr hsrVar;
        zhu0 binding = getBinding();
        if (!da30Var.equals(jtv.p)) {
            if (!da30Var.equals(ujn.t)) {
                t9f.b();
                return;
            }
            this.g1 = true;
            this.f1 = y930.b;
            binding.f.setBroadcastTabSelected(true);
            binding.i.setVisibility(8);
            binding.h.setVisibility(8);
            binding.d.setVisibility(8);
            zhu0 binding2 = getBinding();
            ViewPager2 viewPager2 = binding2.k;
            ViewPager2 viewPager3 = binding2.k;
            viewPager2.setVisibility(0);
            binding2.c.setVisibility(0);
            if (viewPager3.getAdapter() == null) {
                gbl0 gbl0Var = this.n1;
                if (gbl0Var != null) {
                    androidx.fragment.app.e eVarC = gbl0Var.C();
                    eVarC.getClass();
                    n6r n6rVarK = gbl0Var.K();
                    n6rVarK.b();
                    glz glzVar = n6rVarK.c;
                    if (gbl0Var.P1 == null) {
                        Intrinsics.h("broadcastingFeature");
                        throw null;
                    }
                    hsr hsrVar2 = new hsr(eVarC, glzVar, new sek(), new bek());
                    this.B = hsrVar2;
                    viewPager3.setAdapter(hsrVar2);
                }
                getBinding().c.setViewPager2(viewPager3);
            }
            if (this.o1.isEmpty() || (hsrVar = this.B) == null) {
                return;
            }
            List list = this.o1;
            list.getClass();
            yz3 yz3Var = (yz3) hsrVar.n;
            List list2 = yz3Var.f;
            list2.getClass();
            if (list2.size() == list.size()) {
                return;
            }
            yz3Var.b(list, null);
            return;
        }
        this.g1 = false;
        binding.f.setInfoTabSelected(true);
        binding.i.setVisibility(0);
        binding.d.setVisibility(0);
        zhu0 binding3 = getBinding();
        ViewPager2 viewPager4 = binding3.k;
        CircleIndicator circleIndicator = binding3.c;
        yge0 adapter = viewPager4.getAdapter();
        hsr hsrVar3 = adapter instanceof hsr ? (hsr) adapter : null;
        if (hsrVar3 != null) {
            androidx.fragment.app.e eVar = hsrVar3.o;
            List listP = eVar.c.p();
            ArrayList<Fragment> arrayListU = twn.u(listP);
            for (Object obj : listP) {
                if (((Fragment) obj) instanceof osr) {
                    arrayListU.add(obj);
                }
            }
            ArrayList arrayList = new ArrayList(r3d.q(arrayListU, 10));
            for (Fragment fragment : arrayListU) {
                zb5 zb5Var = new zb5(eVar);
                zb5Var.n(fragment);
                zb5Var.i();
                arrayList.add(Unit.f46060a);
            }
        }
        viewPager4.setAdapter(null);
        viewPager4.setVisibility(8);
        circleIndicator.setVisibility(8);
        circleIndicator.c();
        int iOrdinal = this.f1.ordinal();
        if (iOrdinal == 0) {
            z(0.0f);
            A(0);
            x(1.0f);
            y(this.t);
            return;
        }
        if (iOrdinal == 1) {
            z(1.0f);
            A(this.s);
            x(0.0f);
            y(0);
            sj3.L0(getBinding().b, 0, this.w, 0, 0, 13);
            setScrollEnabled(true);
            w(R.attr.uikitCustomDarkBlueBackground65);
            getBinding().f.setTranslationY(0.0f);
            getBinding().i.setTranslationY(0.0f);
            ConstraintLayout constraintLayout = getBinding().e;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams.height = -2;
            constraintLayout.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams2.height = -2;
                setLayoutParams(layoutParams2);
                return;
            }
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        setScrollEnabled(false);
        getBinding().d.setAlpha(0.0f);
        w(R.attr.uikitCustomDarkBlueBackground80);
        MatchInfoTabsContainerView matchInfoTabsContainerView = getBinding().f;
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!matchInfoTabsContainerView.isLaidOut() || matchInfoTabsContainerView.isLayoutRequested()) {
            matchInfoTabsContainerView.addOnLayoutChangeListener(new w23(this, (byte) 9));
        } else if (G()) {
            MatchInfoTabsContainerView matchInfoTabsContainerView2 = getBinding().f;
            int height = matchInfoTabsContainerView2.getHeight();
            ViewGroup.LayoutParams layoutParams3 = matchInfoTabsContainerView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            float f = -(height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
            matchInfoTabsContainerView2.setTranslationY(f);
            getBinding().i.setTranslationY(f);
        }
        AnimatedViewsHeights animatedViewsHeights = this.m1;
        if (animatedViewsHeights != null) {
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            if (layoutParams4 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams4.height = animatedViewsHeights.f;
            setLayoutParams(layoutParams4);
            int i = animatedViewsHeights.e;
            ConstraintLayout constraintLayout2 = getBinding().e;
            ViewGroup.LayoutParams layoutParams5 = constraintLayout2.getLayoutParams();
            if (layoutParams5 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams5.height = i;
            constraintLayout2.setLayoutParams(layoutParams5);
            RecyclerView recyclerView = getBinding().i;
            ViewGroup.LayoutParams layoutParams6 = recyclerView.getLayoutParams();
            if (layoutParams6 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else {
                layoutParams6.height = i;
                recyclerView.setLayoutParams(layoutParams6);
            }
        }
    }

    public final void R(d0k0 d0k0Var) {
        getBinding().b.setPadding(0, 0, 0, d0k0Var == null ? this.u : this.v);
        ((hgk0) this.p1).setValue(d0k0Var);
    }

    public final ImageView getBackgroundView() {
        return getBinding().g;
    }

    @Override // a.xke
    /* JADX INFO: renamed from: getBehavior */
    public yke mo39getBehavior() {
        return new MatchInfoContainerBehavior();
    }

    public final ViewGroup getCardsContainer() {
        return getBinding().e;
    }

    public final v930 getCompressAnimator() {
        return this.r1;
    }

    public final View getMatchInfoCardsView() {
        return getBinding().i;
    }

    public final View getPaginationView() {
        return getBinding().d;
    }

    public final View getTabsContainerView() {
        return getBinding().f;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_KEY_SUPER"));
            Serializable serializable = bundle.getSerializable("BUNDLE_KEY_MATCH_INFO_CONTAINER_STATE");
            serializable.getClass();
            y930 y930Var = (y930) serializable;
            this.f1 = y930Var;
            roi0 roi0Var = this.l1;
            if (roi0Var != null) {
                roi0Var.l(y930Var);
            }
            int i = bww.O(this.f1) ? this.x : this.w;
            s930 s930Var = this.r1.d;
            s930Var.g = i;
            s930Var.j.v(i);
            this.m1 = (AnimatedViewsHeights) bundle.getParcelable("BUNDLE_KEY_ANIMATED_VIEWS_HEIGHTS");
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("BUNDLE_KEY_MATCH_INFO_CONTAINER_STATE", this.f1);
        bundle.putParcelable("BUNDLE_KEY_ANIMATED_VIEWS_HEIGHTS", this.m1);
        bundle.putParcelable("BUNDLE_KEY_SUPER", super.onSaveInstanceState());
        return bundle;
    }

    public void setCompress(boolean z) {
        boolean zO = bww.O(this.f1);
        y930 y930Var = z ? y930.f42225a : y930.b;
        this.f1 = y930Var;
        roi0 roi0Var = this.l1;
        if (roi0Var != null) {
            roi0Var.l(y930Var);
        }
        if (zO && !z && this.q1) {
            this.q1 = false;
            K();
        }
    }

    public final void setTabsVisibility(boolean z) {
        getBinding().f.setTabsVisibilityWithAnimation(z);
    }

    public void setupDisableWhenAnim(boolean z) {
        getBinding().f.setClickable(z);
    }

    public final void v(int i) {
        sj3.L0(getBinding().b, 0, i, 0, 0, 13);
    }

    public final void w(int i) {
        TypedValue typedValue = j5d.f15927a;
        Context context = getContext();
        context.getClass();
        int iA = j5d.a(context, i, false);
        Drawable background = getBinding().e.getBackground();
        background.getClass();
        ((GradientDrawable) background).setColor(iA);
    }

    public final void x(float f) {
        getBinding().h.setAlpha(f);
    }

    public final void y(int i) {
        FrozenRecyclerView frozenRecyclerView = getBinding().h;
        ViewGroup.LayoutParams layoutParams = frozenRecyclerView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = i;
        frozenRecyclerView.setLayoutParams(layoutParams);
        getBinding().h.setVisibility(i == 0 ? 4 : 0);
    }

    public final void z(float f) {
        getBinding().i.setAlpha(f);
        getBinding().d.setAlpha(f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchInfoContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchInfoContainerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
