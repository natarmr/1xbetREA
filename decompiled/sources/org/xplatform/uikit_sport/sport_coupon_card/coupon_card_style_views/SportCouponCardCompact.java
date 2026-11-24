package org.xplatform.uikit_sport.sport_coupon_card.coupon_card_style_views;

import a.bte;
import a.cqd0;
import a.eue;
import a.fue;
import a.gue;
import a.hne;
import a.htj;
import a.iue;
import a.j0d;
import a.j4l0;
import a.jmu0;
import a.ktt0;
import a.lue;
import a.m5d;
import a.maz;
import a.mue;
import a.n0o0;
import a.nue;
import a.od5;
import a.pse;
import a.r7x;
import a.xr20;
import a.yte;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableImageView;
import org.xplatform.uikit_sport.sport_coupon_card.coupon_card_style_views.SportCouponCardCompact;

/* JADX INFO: loaded from: classes6.dex */
public final class SportCouponCardCompact extends FrameLayout implements pse, mue, lue, nue, iue, gue {
    public static final /* synthetic */ int x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f47305a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final eue k;
    public final n0o0 l;
    public final eue m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final htj t;
    public final j4l0 u;
    public final LoadableImageView v;
    public Paint w;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportCouponCardCompact(Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        AttributeSet attributeSet2 = null;
        AttributeSet attributeSet3 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet3, R.attr.sportCouponCardStyle);
        final byte b2 = 0;
        this.f47305a = maz.b(new Function0(this) { // from class: a.i4l0
            public final /* synthetic */ SportCouponCardCompact b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                SportCouponCardCompact sportCouponCardCompact = this.b;
                switch (b3) {
                    case 0:
                        int i2 = SportCouponCardCompact.x;
                        return new od5(sportCouponCardCompact);
                    case 1:
                        int i3 = SportCouponCardCompact.x;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_TextPrimary, sportCouponCardCompact);
                    case 2:
                        int i4 = SportCouponCardCompact.x;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardCompact);
                    case 3:
                        int i5 = SportCouponCardCompact.x;
                        yte yteVar = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardCompact.addView(yteVar.c);
                        return yteVar;
                    case 4:
                        int i6 = SportCouponCardCompact.x;
                        yte yteVar2 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardCompact.addView(yteVar2.c);
                        return yteVar2;
                    case 5:
                        int i7 = SportCouponCardCompact.x;
                        yte yteVar3 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardCompact.addView(yteVar3.c);
                        return yteVar3;
                    case 6:
                        int i8 = SportCouponCardCompact.x;
                        yte yteVar4 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardCompact.addView(yteVar4.c);
                        return yteVar4;
                    default:
                        bte bteVar = new bte(sportCouponCardCompact, sportCouponCardCompact.e);
                        sportCouponCardCompact.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        this.b = getResources().getDimensionPixelSize(R.dimen.size_4);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_14);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.e = (int) getResources().getDimension(R.dimen.size_100);
        float dimension = getResources().getDimension(R.dimen.text_12);
        float dimension2 = getResources().getDimension(R.dimen.text_14);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_4);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_10);
        this.h = dimensionPixelSize2;
        this.i = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_30);
        final byte b3 = 3;
        this.k = new eue(3, 0, R.style.TextStyle_Caption_Medium_L_TextPrimary, this);
        final byte b4 = 1;
        this.l = maz.b(new Function0(this) { // from class: a.i4l0
            public final /* synthetic */ SportCouponCardCompact b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                SportCouponCardCompact sportCouponCardCompact = this.b;
                switch (b5) {
                    case 0:
                        int i2 = SportCouponCardCompact.x;
                        return new od5(sportCouponCardCompact);
                    case 1:
                        int i3 = SportCouponCardCompact.x;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_TextPrimary, sportCouponCardCompact);
                    case 2:
                        int i4 = SportCouponCardCompact.x;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardCompact);
                    case 3:
                        int i5 = SportCouponCardCompact.x;
                        yte yteVar = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardCompact.addView(yteVar.c);
                        return yteVar;
                    case 4:
                        int i6 = SportCouponCardCompact.x;
                        yte yteVar2 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardCompact.addView(yteVar2.c);
                        return yteVar2;
                    case 5:
                        int i7 = SportCouponCardCompact.x;
                        yte yteVar3 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardCompact.addView(yteVar3.c);
                        return yteVar3;
                    case 6:
                        int i8 = SportCouponCardCompact.x;
                        yte yteVar4 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardCompact.addView(yteVar4.c);
                        return yteVar4;
                    default:
                        bte bteVar = new bte(sportCouponCardCompact, sportCouponCardCompact.e);
                        sportCouponCardCompact.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        this.m = new eue(1, 0, R.style.TextStyle_Caption_Medium_L_Secondary, this);
        this.n = maz.b(new Function0(this) { // from class: a.i4l0
            public final /* synthetic */ SportCouponCardCompact b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b;
                SportCouponCardCompact sportCouponCardCompact = this.b;
                switch (b5) {
                    case 0:
                        int i2 = SportCouponCardCompact.x;
                        return new od5(sportCouponCardCompact);
                    case 1:
                        int i3 = SportCouponCardCompact.x;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_TextPrimary, sportCouponCardCompact);
                    case 2:
                        int i4 = SportCouponCardCompact.x;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardCompact);
                    case 3:
                        int i5 = SportCouponCardCompact.x;
                        yte yteVar = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardCompact.addView(yteVar.c);
                        return yteVar;
                    case 4:
                        int i6 = SportCouponCardCompact.x;
                        yte yteVar2 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardCompact.addView(yteVar2.c);
                        return yteVar2;
                    case 5:
                        int i7 = SportCouponCardCompact.x;
                        yte yteVar3 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardCompact.addView(yteVar3.c);
                        return yteVar3;
                    case 6:
                        int i8 = SportCouponCardCompact.x;
                        yte yteVar4 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardCompact.addView(yteVar4.c);
                        return yteVar4;
                    default:
                        bte bteVar = new bte(sportCouponCardCompact, sportCouponCardCompact.e);
                        sportCouponCardCompact.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        this.o = maz.b(new Function0(this) { // from class: a.i4l0
            public final /* synthetic */ SportCouponCardCompact b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b3;
                SportCouponCardCompact sportCouponCardCompact = this.b;
                switch (b5) {
                    case 0:
                        int i2 = SportCouponCardCompact.x;
                        return new od5(sportCouponCardCompact);
                    case 1:
                        int i3 = SportCouponCardCompact.x;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_TextPrimary, sportCouponCardCompact);
                    case 2:
                        int i4 = SportCouponCardCompact.x;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardCompact);
                    case 3:
                        int i5 = SportCouponCardCompact.x;
                        yte yteVar = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardCompact.addView(yteVar.c);
                        return yteVar;
                    case 4:
                        int i6 = SportCouponCardCompact.x;
                        yte yteVar2 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardCompact.addView(yteVar2.c);
                        return yteVar2;
                    case 5:
                        int i7 = SportCouponCardCompact.x;
                        yte yteVar3 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardCompact.addView(yteVar3.c);
                        return yteVar3;
                    case 6:
                        int i8 = SportCouponCardCompact.x;
                        yte yteVar4 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardCompact.addView(yteVar4.c);
                        return yteVar4;
                    default:
                        bte bteVar = new bte(sportCouponCardCompact, sportCouponCardCompact.e);
                        sportCouponCardCompact.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b5 = 4;
        this.p = maz.b(new Function0(this) { // from class: a.i4l0
            public final /* synthetic */ SportCouponCardCompact b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                SportCouponCardCompact sportCouponCardCompact = this.b;
                switch (b6) {
                    case 0:
                        int i2 = SportCouponCardCompact.x;
                        return new od5(sportCouponCardCompact);
                    case 1:
                        int i3 = SportCouponCardCompact.x;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_TextPrimary, sportCouponCardCompact);
                    case 2:
                        int i4 = SportCouponCardCompact.x;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardCompact);
                    case 3:
                        int i5 = SportCouponCardCompact.x;
                        yte yteVar = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardCompact.addView(yteVar.c);
                        return yteVar;
                    case 4:
                        int i6 = SportCouponCardCompact.x;
                        yte yteVar2 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardCompact.addView(yteVar2.c);
                        return yteVar2;
                    case 5:
                        int i7 = SportCouponCardCompact.x;
                        yte yteVar3 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardCompact.addView(yteVar3.c);
                        return yteVar3;
                    case 6:
                        int i8 = SportCouponCardCompact.x;
                        yte yteVar4 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardCompact.addView(yteVar4.c);
                        return yteVar4;
                    default:
                        bte bteVar = new bte(sportCouponCardCompact, sportCouponCardCompact.e);
                        sportCouponCardCompact.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b6 = 5;
        this.q = maz.b(new Function0(this) { // from class: a.i4l0
            public final /* synthetic */ SportCouponCardCompact b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                SportCouponCardCompact sportCouponCardCompact = this.b;
                switch (b7) {
                    case 0:
                        int i2 = SportCouponCardCompact.x;
                        return new od5(sportCouponCardCompact);
                    case 1:
                        int i3 = SportCouponCardCompact.x;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_TextPrimary, sportCouponCardCompact);
                    case 2:
                        int i4 = SportCouponCardCompact.x;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardCompact);
                    case 3:
                        int i5 = SportCouponCardCompact.x;
                        yte yteVar = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardCompact.addView(yteVar.c);
                        return yteVar;
                    case 4:
                        int i6 = SportCouponCardCompact.x;
                        yte yteVar2 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardCompact.addView(yteVar2.c);
                        return yteVar2;
                    case 5:
                        int i7 = SportCouponCardCompact.x;
                        yte yteVar3 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardCompact.addView(yteVar3.c);
                        return yteVar3;
                    case 6:
                        int i8 = SportCouponCardCompact.x;
                        yte yteVar4 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardCompact.addView(yteVar4.c);
                        return yteVar4;
                    default:
                        bte bteVar = new bte(sportCouponCardCompact, sportCouponCardCompact.e);
                        sportCouponCardCompact.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b7 = 6;
        this.r = maz.b(new Function0(this) { // from class: a.i4l0
            public final /* synthetic */ SportCouponCardCompact b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b7;
                SportCouponCardCompact sportCouponCardCompact = this.b;
                switch (b8) {
                    case 0:
                        int i2 = SportCouponCardCompact.x;
                        return new od5(sportCouponCardCompact);
                    case 1:
                        int i3 = SportCouponCardCompact.x;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_TextPrimary, sportCouponCardCompact);
                    case 2:
                        int i4 = SportCouponCardCompact.x;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardCompact);
                    case 3:
                        int i5 = SportCouponCardCompact.x;
                        yte yteVar = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardCompact.addView(yteVar.c);
                        return yteVar;
                    case 4:
                        int i6 = SportCouponCardCompact.x;
                        yte yteVar2 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardCompact.addView(yteVar2.c);
                        return yteVar2;
                    case 5:
                        int i7 = SportCouponCardCompact.x;
                        yte yteVar3 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardCompact.addView(yteVar3.c);
                        return yteVar3;
                    case 6:
                        int i8 = SportCouponCardCompact.x;
                        yte yteVar4 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardCompact.addView(yteVar4.c);
                        return yteVar4;
                    default:
                        bte bteVar = new bte(sportCouponCardCompact, sportCouponCardCompact.e);
                        sportCouponCardCompact.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b8 = 7;
        this.s = maz.b(new Function0(this) { // from class: a.i4l0
            public final /* synthetic */ SportCouponCardCompact b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b9 = b8;
                SportCouponCardCompact sportCouponCardCompact = this.b;
                switch (b9) {
                    case 0:
                        int i2 = SportCouponCardCompact.x;
                        return new od5(sportCouponCardCompact);
                    case 1:
                        int i3 = SportCouponCardCompact.x;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_TextPrimary, sportCouponCardCompact);
                    case 2:
                        int i4 = SportCouponCardCompact.x;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardCompact);
                    case 3:
                        int i5 = SportCouponCardCompact.x;
                        yte yteVar = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardCompact.addView(yteVar.c);
                        return yteVar;
                    case 4:
                        int i6 = SportCouponCardCompact.x;
                        yte yteVar2 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardCompact.addView(yteVar2.c);
                        return yteVar2;
                    case 5:
                        int i7 = SportCouponCardCompact.x;
                        yte yteVar3 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardCompact.addView(yteVar3.c);
                        return yteVar3;
                    case 6:
                        int i8 = SportCouponCardCompact.x;
                        yte yteVar4 = new yte(sportCouponCardCompact, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardCompact.addView(yteVar4.c);
                        return yteVar4;
                    default:
                        bte bteVar = new bte(sportCouponCardCompact, sportCouponCardCompact.e);
                        sportCouponCardCompact.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        htj htjVar = new htj(this, R.drawable.ic_glyph_trash, R.dimen.size_40, R.dimen.size_32);
        addView(htjVar.d);
        View view = htjVar.c;
        view.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize);
        addView(view);
        this.t = htjVar;
        j4l0 j4l0Var = new j4l0(context);
        j4l0Var.setMarketBlockedIconPosition(xr20.f41348a);
        j4l0Var.setDescriptionTextStyle(R.style.TextStyle_Text_Medium_TextPrimary);
        j4l0Var.setCoefficientTextStyle(R.style.TextStyle_Text_Bold_TextPrimary);
        j4l0Var.setDescriptionMaxLines(Integer.MAX_VALUE);
        j4l0Var.setCoefficientMaxTextSize(dimension2);
        j4l0Var.setCoefficientMinTextSize(dimension);
        this.u = j4l0Var;
        LoadableImageView loadableImageView = new LoadableImageView(context, attributeSet2, b7, b2);
        this.v = loadableImageView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet3, cqd0.i, R.attr.sportCouponCardStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(6, false)) {
            a();
        }
        setTitle(typedArrayObtainStyledAttributes.getString(10));
        setSubTitle(typedArrayObtainStyledAttributes.getString(7));
        setTagText(typedArrayObtainStyledAttributes.getString(8));
        ColorStateList colorStateListM = ktt0.m(9, context, typedArrayObtainStyledAttributes);
        if (colorStateListM != null) {
            setTagColor(colorStateListM);
        }
        setError(typedArrayObtainStyledAttributes.getString(2));
        setMarketStyle(Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(1, 0)));
        CharSequence string = typedArrayObtainStyledAttributes.getString(5);
        CharSequence string2 = typedArrayObtainStyledAttributes.getString(3);
        if (j4l0Var.getParent() == null) {
            addView(j4l0Var);
        }
        setMarketDescription(string);
        setMarketCoefficient(string2);
        typedArrayObtainStyledAttributes.recycle();
        addView(loadableImageView);
        getBackgroundTintHelper().a(attributeSet3, R.attr.sportCouponCardStyle);
        setTag("SportCouponCardCompactTest");
    }

    private final yte getAutoSubTagDelegate() {
        return (yte) this.p.getValue();
    }

    private final od5 getBackgroundTintHelper() {
        return (od5) this.f47305a.getValue();
    }

    private final yte getEachWayTagDelegate() {
        return (yte) this.r.getValue();
    }

    private final int getEachWayTagWidth() {
        if (getEachWayTagDelegate().c.getVisibility() == 0) {
            return getEachWayTagDelegate().c.getMeasuredWidth() + this.f;
        }
        return 0;
    }

    private final eue getErrorDelegate() {
        return (eue) this.n.getValue();
    }

    private final yte getOptionBetTagDelegate() {
        return (yte) this.q.getValue();
    }

    private final bte getShimmerDelegate() {
        return (bte) this.s.getValue();
    }

    private final int getStartSpaceDependsByIndicator() {
        return this.w != null ? this.j : this.i;
    }

    private final eue getSubTitleDelegate() {
        return (eue) this.l.getValue();
    }

    private final yte getTagDelegate() {
        return (yte) this.o.getValue();
    }

    @Override // a.lue
    public final void a() {
        getShimmerDelegate().c();
        requestLayout();
    }

    @Override // a.pse
    public final void b(CharSequence charSequence, j0d j0dVar) {
        j4l0 j4l0Var = this.u;
        j4l0Var.setMarketCoefficient(charSequence);
        j4l0Var.setMarketCoefficientState(j0dVar);
        requestLayout();
    }

    @Override // a.iue
    public final void c(boolean z) {
        Context context = getContext();
        context.getClass();
        int iB = m5d.b(z ? R.attr.uikitStaticRed : R.attr.uikitSecondary, context);
        this.v.setColorFilter(iB);
        if (this.w == null && getShimmerDelegate().c.getVisibility() != 0) {
            d();
        }
        Paint paint = this.w;
        if (paint != null) {
            paint.setColor(iB);
        }
        invalidate();
        requestLayout();
    }

    public final void d() {
        Paint paint = new Paint();
        Context context = getContext();
        context.getClass();
        paint.setColor(m5d.b(R.attr.uikitSecondary, context));
        paint.setStrokeWidth(this.b);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.w = paint;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getBackgroundTintHelper().b;
    }

    public final String getError() {
        return getErrorDelegate().d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int i = this.i;
        float f = i;
        int i2 = this.c + i;
        int i3 = this.f;
        getSubTitleDelegate().a(canvas, i2 + i3, f);
        float measuredHeight = f + getSubTitleDelegate().e + (getTagDelegate().c.getVisibility() == 0 ? getTagDelegate().c.getMeasuredHeight() + i3 : 0) + i3;
        int i4 = this.j;
        eue eueVar = this.m;
        eueVar.a(canvas, i4, measuredHeight);
        float f2 = measuredHeight + eueVar.e;
        eue eueVar2 = this.k;
        eueVar2.a(canvas, i4, f2);
        float f3 = f2 + eueVar2.e;
        if (!getErrorDelegate().b()) {
            getErrorDelegate().a(canvas, getStartSpaceDependsByIndicator(), f3);
            f3 += getErrorDelegate().e;
        }
        float width = i + (this.v.getWidth() / 2);
        if (getLayoutDirection() != 0) {
            width = getMeasuredWidth() - width;
        }
        float f4 = width;
        Paint paint = this.w;
        if (paint != null) {
            canvas.drawLine(f4, i + getSubTitleDelegate().e + this.h, f4, f3 - i3, paint);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getShimmerDelegate().c.getVisibility() == 0) {
            getShimmerDelegate().a();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int i5 = this.i;
        j4l0 j4l0Var = this.u;
        int measuredHeight2 = (measuredHeight - i5) - j4l0Var.getMeasuredHeight();
        j4l0 j4l0Var2 = this.u;
        int measuredWidth = j4l0Var2.getMeasuredWidth();
        int i6 = this.i;
        jmu0.f(i6, measuredHeight2, measuredWidth + i6, j4l0Var.getMeasuredHeight() + measuredHeight2, j4l0Var2, this);
        int i7 = getSubTitleDelegate().e + i5;
        int i8 = this.g;
        getTagDelegate().a(getStartSpaceDependsByIndicator(), i5, i7 + i8);
        int visibility = getAutoSubTagDelegate().c.getVisibility();
        int i9 = this.d;
        htj htjVar = this.t;
        if (visibility == 0) {
            int i10 = ((getSubTitleDelegate().e / 2) + i5) - (getAutoSubTagDelegate().b / 2);
            int i11 = htjVar.c.getVisibility() == 0 ? i9 : i5;
            getAutoSubTagDelegate().a((getMeasuredWidth() - i11) - getAutoSubTagDelegate().c.getMeasuredWidth(), i11, i10);
        }
        if (getOptionBetTagDelegate().c.getVisibility() == 0) {
            int i12 = ((getSubTitleDelegate().e / 2) + i5) - (getOptionBetTagDelegate().b / 2);
            int eachWayTagWidth = (htjVar.c.getVisibility() == 0 ? i9 : i5) + getEachWayTagWidth();
            getOptionBetTagDelegate().a((getMeasuredWidth() - eachWayTagWidth) - getOptionBetTagDelegate().c.getMeasuredWidth(), eachWayTagWidth, i12);
        }
        if (getEachWayTagDelegate().c.getVisibility() == 0) {
            int i13 = ((getSubTitleDelegate().e / 2) + i5) - (getEachWayTagDelegate().b / 2);
            if (htjVar.c.getVisibility() != 0) {
                i9 = i5;
            }
            getEachWayTagDelegate().a((getMeasuredWidth() - i9) - getEachWayTagDelegate().c.getMeasuredWidth(), i9, i13);
        }
        LoadableImageView loadableImageView = this.v;
        if (loadableImageView.getVisibility() == 0) {
            int i14 = getSubTitleDelegate().e / 2;
            int i15 = this.i;
            int i16 = i14 + i15;
            int i17 = this.c;
            int i18 = i17 / 2;
            jmu0.f(i15, i16 - i18, i15 + i17, i18 + i16, loadableImageView, this);
        }
        htjVar.b((getSubTitleDelegate().e / 2) + i5, getMeasuredHeight() - ((j4l0Var.getMeasuredHeight() + (i8 + i5)) / 2));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int visibility = getShimmerDelegate().c.getVisibility();
        int i3 = this.f;
        int i4 = this.c;
        eue eueVar = this.m;
        eue eueVar2 = this.k;
        j4l0 j4l0Var = this.u;
        int i5 = this.i;
        if (visibility == 0) {
            getShimmerDelegate().b(size);
        } else {
            htj htjVar = this.t;
            int visibility2 = htjVar.d.getVisibility();
            int i6 = this.d;
            j4l0Var.measure(View.MeasureSpec.makeMeasureSpec((size - i5) - (visibility2 == 0 ? i6 : i5), 1073741824), i2);
            int startSpaceDependsByIndicator = size - getStartSpaceDependsByIndicator();
            getTagDelegate().b(startSpaceDependsByIndicator - i5);
            int i7 = this.j;
            eueVar2.c((size - i7) - i5);
            eueVar.c((size - i7) - i5);
            getErrorDelegate().c(startSpaceDependsByIndicator - i5);
            getAutoSubTagDelegate().c();
            getOptionBetTagDelegate().c();
            getEachWayTagDelegate().c();
            int measuredWidth = getAutoSubTagDelegate().c.getVisibility() == 0 ? getAutoSubTagDelegate().c.getMeasuredWidth() + i3 : 0;
            int measuredWidth2 = getOptionBetTagDelegate().c.getVisibility() == 0 ? getOptionBetTagDelegate().c.getMeasuredWidth() + i3 : 0;
            int measuredWidth3 = getEachWayTagDelegate().c.getVisibility() == 0 ? getEachWayTagDelegate().c.getMeasuredWidth() + i3 : 0;
            if (htjVar.c.getVisibility() != 0) {
                i6 = i5;
            }
            int iD = hne.D(i6, measuredWidth, measuredWidth2, measuredWidth3);
            LoadableImageView loadableImageView = this.v;
            getSubTitleDelegate().c((size - (loadableImageView.getVisibility() == 0 ? (i4 + i5) + i3 : i5)) - iD);
            loadableImageView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            htjVar.c();
        }
        int iMax = Math.max(i4, getSubTitleDelegate().e);
        int measuredHeight = getTagDelegate().c.getVisibility() == 0 ? getTagDelegate().c.getMeasuredHeight() + i3 : 0;
        int i8 = !eueVar.b() ? eueVar.e + i3 : 0;
        int i9 = !eueVar2.b() ? eueVar2.e : 0;
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(Math.max(getShimmerDelegate().c.getVisibility() == 0 ? this.e : (i5 * 2) + i3 + iMax + measuredHeight + i8 + i9 + (getErrorDelegate().b() ? 0 : getErrorDelegate().e + i3) + j4l0Var.getMeasuredHeight(), getResources().getDimensionPixelSize(R.dimen.size_82)), 1073741824));
    }

    @Override // a.gue
    public void setAutoSub(CharSequence charSequence) {
        getAutoSubTagDelegate().e(charSequence);
        getAutoSubTagDelegate().c.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    @Override // a.gue
    public void setAutoSubClickListener(Function1<? super View, Unit> function1) {
    }

    @Override // a.pse
    public void setCancelButtonClickListener(Function1<? super View, Unit> function1) {
        this.t.d(function1);
    }

    @Override // a.pse
    public void setCouponBonusTitle(CharSequence charSequence) {
        setSubTitle(charSequence);
    }

    public void setCouponBonusTitleStyle(int i) {
        eue subTitleDelegate = getSubTitleDelegate();
        TextPaint textPaint = (TextPaint) subTitleDelegate.g.getValue();
        Context context = subTitleDelegate.f8416a.getContext();
        context.getClass();
        r7x.r(textPaint, context, i);
        requestLayout();
    }

    @Override // a.pse
    public void setEachWay(CharSequence charSequence) {
        getEachWayTagDelegate().e(charSequence);
        getEachWayTagDelegate().c.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    @Override // a.pse
    public void setEachWayClickListener(Function1<? super View, Unit> function1) {
    }

    public final void setError(int i) {
        setError(getContext().getString(i));
    }

    public final void setHeader(CharSequence charSequence) {
        this.m.e(charSequence);
        requestLayout();
    }

    public void setLiveTagText(String str) {
        str.getClass();
    }

    public final void setMarketCoefficient(CharSequence charSequence) {
        this.u.setMarketCoefficient(charSequence);
        requestLayout();
    }

    public final void setMarketCoefficientState(j0d j0dVar) {
        j0dVar.getClass();
        this.u.setMarketCoefficientState(j0dVar);
    }

    @Override // a.pse
    public void setMarketDescription(CharSequence charSequence) {
        this.u.setMarketDescription(charSequence);
        requestLayout();
    }

    @Override // a.pse
    public void setMarketStyle(Integer num) {
        this.u.setMarketStyle(num);
    }

    @Override // a.pse
    public void setModel(fue fueVar) {
        fueVar.getClass();
        LoadableImageView.h(this.v, fueVar.o, null, 14);
        setTagText(fueVar.b);
        setTagColor(fueVar.c);
        setTitle(fueVar.d);
        setSubTitle(fueVar.e);
        setHeader(fueVar.h);
        setError(fueVar.f);
        String str = fueVar.i;
        String str2 = fueVar.j;
        j4l0 j4l0Var = this.u;
        if (j4l0Var.getParent() == null) {
            addView(j4l0Var);
        }
        setMarketDescription(str);
        setMarketCoefficient(str2);
        setMarketStyle(Integer.valueOf(fueVar.m));
        setMarketCoefficientState(fueVar.n);
        d();
        c(fueVar.g);
        setAutoSub(fueVar.q);
        setOptionBet(fueVar.r);
        setEachWay(fueVar.s);
    }

    @Override // a.pse
    public void setMoveButtonClickListener(Function1<? super View, Unit> function1) {
        this.t.e(function1);
        requestLayout();
    }

    @Override // a.pse
    public void setOptionBet(CharSequence charSequence) {
        getOptionBetTagDelegate().e(charSequence);
        getOptionBetTagDelegate().c.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    @Override // a.pse
    public void setOptionBetClickListener(Function1<? super View, Unit> function1) {
    }

    @Override // a.mue
    public void setSportImage(int i) {
        Context context = getContext();
        context.getClass();
        int iB = m5d.b(R.attr.uikitSecondary, context);
        LoadableImageView loadableImageView = this.v;
        loadableImageView.setColorFilter(iB);
        loadableImageView.setImageResource(i);
    }

    public final void setSubTitle(int i) {
        setSubTitle(getContext().getString(i));
    }

    public final void setTagColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        yte tagDelegate = getTagDelegate();
        tagDelegate.getClass();
        jmu0.j(tagDelegate.c, colorStateList);
    }

    @Override // a.pse
    public void setTagText(CharSequence charSequence) {
        getTagDelegate().e(charSequence);
        getTagDelegate().c.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    @Override // a.pse
    public void setError(CharSequence charSequence) {
        getErrorDelegate().e(charSequence);
        requestLayout();
    }

    @Override // a.pse
    public void setSubTitle(CharSequence charSequence) {
        getSubTitleDelegate().e(charSequence);
        requestLayout();
    }

    @Override // a.nue
    public void setTitle(CharSequence charSequence) {
        this.k.e(charSequence);
        requestLayout();
    }

    @Override // a.pse
    public void setTagColor(int i) {
        getTagDelegate().d(i);
    }

    public final void setTagText(int i) {
        yte tagDelegate = getTagDelegate();
        tagDelegate.e(tagDelegate.f43214a.getContext().getString(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCouponCardCompact(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCouponCardCompact(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
