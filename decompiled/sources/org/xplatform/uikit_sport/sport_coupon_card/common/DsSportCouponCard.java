package org.xplatform.uikit_sport.sport_coupon_card.common;

import a.cqd0;
import a.cue;
import a.f4l0;
import a.fue;
import a.gue;
import a.hue;
import a.jmu0;
import a.jue;
import a.kue;
import a.l4l0;
import a.maz;
import a.mue;
import a.n0o0;
import a.ntl;
import a.nue;
import a.od5;
import a.pse;
import a.sse;
import a.t9f;
import a.yse;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit_sport.sport_coupon_card.coupon_card_style_views.SportCouponCardChampName;
import org.xplatform.uikit_sport.sport_coupon_card.coupon_card_style_views.SportCouponCardCoefWithBg;
import org.xplatform.uikit_sport.sport_coupon_card.coupon_card_style_views.SportCouponCardCompact;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSportCouponCard extends FrameLayout {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AttributeSet f47302a;
    public final int b;
    public final n0o0 c;
    public sse d;
    public Function1 e;
    public Function1 f;
    public Function1 g;
    public Function1 h;
    public Function1 i;
    public pse j;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsSportCouponCard(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.sportCouponCardStyle);
        this.f47302a = attributeSet;
        this.b = R.attr.sportCouponCardStyle;
        this.c = maz.b(new ntl(this, (byte) 10));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.radius_16);
        this.d = sse.f32722a;
        jmu0.i(this, dimensionPixelSize);
        getBackgroundTintHelper().a(attributeSet, R.attr.sportCouponCardStyle);
    }

    private final od5 getBackgroundTintHelper() {
        return (od5) this.c.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard] */
    /* JADX WARN: Type inference failed for: r8v14, types: [a.lue, a.pse, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    public final void a(String str) {
        sse sseVar;
        ?? sportCouponCardCoefWithBg;
        if (this.j != null) {
            return;
        }
        switch (str) {
            case "champNameAccentCoef":
                sseVar = sse.c;
                break;
            case "compactAccentMarket":
                sseVar = sse.b;
                break;
            case "bigTeamLogoAccentTeam":
                sseVar = sse.e;
                break;
            case "smallTeamLogoAccentCoef":
                sseVar = sse.d;
                break;
            case "coefWithBgAccentTeam":
                sseVar = sse.f32722a;
                break;
            default:
                sseVar = sse.f32722a;
                break;
        }
        this.d = sseVar;
        removeAllViews();
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            sportCouponCardCoefWithBg = new SportCouponCardCoefWithBg(context, null, 6);
        } else if (iOrdinal == 1) {
            Context context2 = getContext();
            context2.getClass();
            sportCouponCardCoefWithBg = new SportCouponCardCompact(context2, null, 6);
        } else if (iOrdinal == 2) {
            Context context3 = getContext();
            context3.getClass();
            sportCouponCardCoefWithBg = new SportCouponCardChampName(context3, null, 6);
        } else if (iOrdinal == 3) {
            Context context4 = getContext();
            context4.getClass();
            sportCouponCardCoefWithBg = new l4l0(context4);
        } else if (iOrdinal != 4) {
            t9f.b();
            return;
        } else {
            Context context5 = getContext();
            context5.getClass();
            sportCouponCardCoefWithBg = new f4l0(context5);
        }
        Context context6 = getContext();
        context6.getClass();
        TypedArray typedArrayObtainStyledAttributes = context6.obtainStyledAttributes(this.f47302a, cqd0.i, this.b, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(6, false)) {
            sportCouponCardCoefWithBg.a();
        }
        typedArrayObtainStyledAttributes.recycle();
        addView(sportCouponCardCoefWithBg);
        this.j = sportCouponCardCoefWithBg;
        sportCouponCardCoefWithBg.setCancelButtonClickListener(this.f);
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setMoveButtonClickListener(this.e);
        }
        pse pseVar2 = this.j;
        gue gueVar = pseVar2 != null ? (gue) pseVar2 : null;
        if (gueVar != null) {
            gueVar.setAutoSubClickListener(this.g);
        }
        pse pseVar3 = this.j;
        if (pseVar3 != null) {
            pseVar3.setOptionBetClickListener(this.h);
        }
        pse pseVar4 = this.j;
        if (pseVar4 != null) {
            pseVar4.setEachWayClickListener(this.i);
        }
        setTag("DsCouponCard");
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getBackgroundTintHelper().b;
    }

    public final pse getCurrentStyledView() {
        return this.j;
    }

    public final void setAutoSub(String str) {
        str.getClass();
        pse pseVar = this.j;
        gue gueVar = pseVar != null ? (gue) pseVar : null;
        if (gueVar != null) {
            gueVar.setAutoSub(str);
        }
    }

    public final void setAutoSubClickListener(Function1<? super View, Unit> function1) {
        this.g = function1;
        pse pseVar = this.j;
        gue gueVar = pseVar != null ? (gue) pseVar : null;
        if (gueVar != null) {
            gueVar.setAutoSubClickListener(this.g);
        }
    }

    public final void setCancelButtonClickListener(Function1<? super View, Unit> function1) {
        this.f = function1;
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setCancelButtonClickListener(function1);
        }
    }

    public final void setCaption(CharSequence charSequence) {
        pse pseVar = this.j;
        hue hueVar = pseVar instanceof hue ? (hue) pseVar : null;
        if (hueVar != null) {
            hueVar.setCaption(charSequence);
        }
    }

    public final void setCouponBonusTitle(String str) {
        str.getClass();
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setCouponBonusTitle(str);
        }
    }

    public final void setCouponBonusTitleStyle(int i) {
        pse pseVar = this.j;
        SportCouponCardCompact sportCouponCardCompact = pseVar instanceof SportCouponCardCompact ? (SportCouponCardCompact) pseVar : null;
        if (sportCouponCardCompact != null) {
            sportCouponCardCompact.setCouponBonusTitleStyle(i);
        }
    }

    public final void setEachWay(String str) {
        str.getClass();
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setEachWay(str);
        }
    }

    public final void setEachWayClickListener(Function1<? super View, Unit> function1) {
        this.i = function1;
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setEachWayClickListener(function1);
        }
    }

    public final void setError(CharSequence charSequence) {
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setError(charSequence);
        }
    }

    public final void setMarketDescription(CharSequence charSequence) {
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setMarketDescription(charSequence);
        }
    }

    public final void setMarketDescriptionStyle(int i) {
        pse pseVar = this.j;
        l4l0 l4l0Var = pseVar instanceof l4l0 ? (l4l0) pseVar : null;
        if (l4l0Var != null) {
            l4l0Var.setCouponMarketDescriptionStyle(i);
        }
    }

    public final void setMarketHeader(CharSequence charSequence) {
        pse pseVar = this.j;
        jue jueVar = pseVar instanceof jue ? (jue) pseVar : null;
        if (jueVar != null) {
            jueVar.setMarketHeader(charSequence);
        }
    }

    public final void setMarketStyle(int i) {
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setMarketStyle(Integer.valueOf(i));
        }
    }

    public final void setModel(fue fueVar) {
        fueVar.getClass();
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setModel(fueVar);
        }
    }

    public final void setMoveButtonClickListener(Function1<? super View, Unit> function1) {
        this.e = function1;
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setMoveButtonClickListener(function1);
        }
    }

    public final void setOptionBet(String str) {
        str.getClass();
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setOptionBet(str);
        }
    }

    public final void setOptionBetClickListener(Function1<? super View, Unit> function1) {
        this.h = function1;
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setOptionBetClickListener(function1);
        }
    }

    public final void setRtlSupportEnabled(boolean z) {
        pse pseVar = this.j;
        f4l0 f4l0Var = pseVar instanceof f4l0 ? (f4l0) pseVar : null;
        if (f4l0Var != null) {
            f4l0Var.setRtlSupportEnabled(z);
        }
    }

    public final void setScoreUiModel(yse yseVar) {
        yseVar.getClass();
        pse pseVar = this.j;
        kue kueVar = pseVar instanceof kue ? (kue) pseVar : null;
        if (kueVar != null) {
            kueVar.setScoreUiModel(yseVar);
        }
    }

    public final void setSportImage(int i) {
        pse pseVar = this.j;
        mue mueVar = pseVar instanceof mue ? (mue) pseVar : null;
        if (mueVar != null) {
            mueVar.setSportImage(i);
        }
    }

    public final void setSubTitle(CharSequence charSequence) {
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setSubTitle(charSequence);
        }
    }

    public final void setTagColor(int i) {
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setTagColor(i);
        }
    }

    public final void setTagText(CharSequence charSequence) {
        pse pseVar = this.j;
        if (pseVar != null) {
            pseVar.setTagText(charSequence);
        }
    }

    public final void setTeamsUiModel(cue cueVar) {
        cueVar.getClass();
        pse pseVar = this.j;
        kue kueVar = pseVar instanceof kue ? (kue) pseVar : null;
        if (kueVar != null) {
            kueVar.setTeamsUiModel(cueVar);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        pse pseVar = this.j;
        nue nueVar = pseVar instanceof nue ? (nue) pseVar : null;
        if (nueVar != null) {
            nueVar.setTitle(charSequence);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportCouponCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSportCouponCard(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
