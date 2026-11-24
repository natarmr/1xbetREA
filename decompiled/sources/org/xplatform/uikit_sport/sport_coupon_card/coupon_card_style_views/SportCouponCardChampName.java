package org.xplatform.uikit_sport.sport_coupon_card.coupon_card_style_views;

import a.bte;
import a.cqd0;
import a.eue;
import a.fue;
import a.gue;
import a.hne;
import a.htj;
import a.hue;
import a.iue;
import a.j0d;
import a.j4l0;
import a.jmu0;
import a.jue;
import a.ktt0;
import a.lue;
import a.m5d;
import a.maz;
import a.mue;
import a.n0o0;
import a.nue;
import a.od5;
import a.pse;
import a.xr20;
import a.yte;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.components.views.LoadableImageView;
import org.xplatform.uikit_sport.sport_coupon_card.coupon_card_style_views.SportCouponCardChampName;

/* JADX INFO: loaded from: classes6.dex */
public final class SportCouponCardChampName extends FrameLayout implements pse, mue, iue, hue, nue, jue, gue, lue {
    public static final /* synthetic */ int y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f47303a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final eue l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final htj u;
    public final j4l0 v;
    public final LoadableImageView w;
    public final n0o0 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportCouponCardChampName(Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        AttributeSet attributeSet2 = null;
        AttributeSet attributeSet3 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet3, R.attr.sportCouponCardStyle);
        final byte b2 = 0;
        this.f47303a = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b3) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        this.b = getResources().getDimensionPixelSize(R.dimen.size_16);
        getResources().getDimensionPixelSize(R.dimen.size_14);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.g = (int) getResources().getDimension(R.dimen.size_120);
        this.h = getResources().getDimension(R.dimen.space_12);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_4);
        final byte b3 = 3;
        this.l = new eue(3, 0, R.style.TextStyle_Text_Medium_TextPrimary, this);
        final byte b4 = 1;
        this.m = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b5) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        this.n = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b5) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        this.o = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b3;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b5) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        final byte b5 = 4;
        this.p = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b6) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        final byte b6 = 5;
        this.q = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b7) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        final byte b7 = 6;
        this.r = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b7;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b8) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        final byte b8 = 7;
        this.s = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b9 = b8;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b9) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        final byte b9 = 8;
        this.t = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b10 = b9;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b10) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        htj htjVar = new htj(this, R.drawable.ic_glyph_cancel, R.dimen.size_48, R.dimen.size_40);
        addView(htjVar.d);
        addView(htjVar.c);
        this.u = htjVar;
        float dimension = getResources().getDimension(R.dimen.text_12);
        float dimension2 = getResources().getDimension(R.dimen.text_18);
        j4l0 j4l0Var = new j4l0(context);
        j4l0Var.setMarketBlockedIconPosition(xr20.f41348a);
        j4l0Var.setDescriptionTextStyle(R.style.TextStyle_Caption_Medium_L_TextPrimary);
        j4l0Var.setHeaderTextStyle(R.style.TextStyle_Caption_Regular_L_TextPrimary);
        j4l0Var.setCoefficientTextStyle(R.style.TextStyle_Headline_Medium_TextPrimary);
        j4l0Var.setDescriptionMaxLines(Integer.MAX_VALUE);
        j4l0Var.setHeaderMaxLines(1);
        j4l0Var.setCoefficientMaxTextSize(dimension2);
        j4l0Var.setCoefficientMinTextSize(dimension);
        this.v = j4l0Var;
        LoadableImageView loadableImageView = new LoadableImageView(context, attributeSet2, b7, b2);
        loadableImageView.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
        this.w = loadableImageView;
        final byte b10 = 9;
        this.x = maz.b(new Function0(this) { // from class: a.g4l0
            public final /* synthetic */ SportCouponCardChampName b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b11 = b10;
                SportCouponCardChampName sportCouponCardChampName = this.b;
                switch (b11) {
                    case 0:
                        int i2 = SportCouponCardChampName.y;
                        return new od5(sportCouponCardChampName);
                    case 1:
                        int i3 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 2:
                        int i4 = SportCouponCardChampName.y;
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, sportCouponCardChampName);
                    case 3:
                        int i5 = SportCouponCardChampName.y;
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, sportCouponCardChampName);
                    case 4:
                        int i6 = SportCouponCardChampName.y;
                        yte yteVar = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Red);
                        sportCouponCardChampName.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        int i7 = SportCouponCardChampName.y;
                        yte yteVar2 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        sportCouponCardChampName.addView(yteVar2.c);
                        return yteVar2;
                    case 6:
                        int i8 = SportCouponCardChampName.y;
                        yte yteVar3 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_Green);
                        sportCouponCardChampName.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        int i9 = SportCouponCardChampName.y;
                        yte yteVar4 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        sportCouponCardChampName.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        bte bteVar = new bte(sportCouponCardChampName, sportCouponCardChampName.g);
                        sportCouponCardChampName.addView(bteVar.c);
                        return bteVar;
                    default:
                        int i10 = SportCouponCardChampName.y;
                        yte yteVar5 = new yte(sportCouponCardChampName, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar5.c;
                        sportCouponCardChampName.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar5;
                }
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet3, cqd0.i, R.attr.sportCouponCardStyle, 0);
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 10);
        String string = strP != null ? strP.toString() : null;
        setTitle(string == null ? "" : string);
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 0);
        String string2 = strP2 != null ? strP2.toString() : null;
        setCaption(string2 == null ? "" : string2);
        String strP3 = ktt0.p(typedArrayObtainStyledAttributes, context, 7);
        String string3 = strP3 != null ? strP3.toString() : null;
        setSubTitle(string3 == null ? "" : string3);
        String strP4 = ktt0.p(typedArrayObtainStyledAttributes, context, 8);
        String string4 = strP4 != null ? strP4.toString() : null;
        setTagText(string4 == null ? "" : string4);
        ColorStateList colorStateListM = ktt0.m(9, context, typedArrayObtainStyledAttributes);
        if (colorStateListM != null) {
            setTagColor(colorStateListM);
        }
        String strP5 = ktt0.p(typedArrayObtainStyledAttributes, context, 2);
        String string5 = strP5 != null ? strP5.toString() : null;
        setError(string5 == null ? "" : string5);
        setMarketStyle(Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(1, 0)));
        String strP6 = ktt0.p(typedArrayObtainStyledAttributes, context, 5);
        String string6 = strP6 != null ? strP6.toString() : null;
        string6 = string6 == null ? "" : string6;
        String strP7 = ktt0.p(typedArrayObtainStyledAttributes, context, 4);
        String string7 = strP7 != null ? strP7.toString() : null;
        string7 = string7 == null ? "" : string7;
        String strP8 = ktt0.p(typedArrayObtainStyledAttributes, context, 3);
        String string8 = strP8 != null ? strP8.toString() : null;
        string8 = string8 == null ? "" : string8;
        if (j4l0Var.getParent() == null) {
            addView(j4l0Var);
        }
        setMarketHeader(string7);
        setMarketDescription(string6);
        setMarketCoefficient(string8);
        if (typedArrayObtainStyledAttributes.getBoolean(6, false)) {
            a();
        }
        typedArrayObtainStyledAttributes.recycle();
        addView(loadableImageView);
        getBackgroundTintHelper().a(attributeSet3, R.attr.sportCouponCardStyle);
        setTag("SportCouponCardChampName");
    }

    private final yte getAutoSubTagDelegate() {
        return (yte) this.q.getValue();
    }

    private final od5 getBackgroundTintHelper() {
        return (od5) this.f47303a.getValue();
    }

    private final eue getCaptionDelegate() {
        return (eue) this.n.getValue();
    }

    private final yte getEachWayTagDelegate() {
        return (yte) this.s.getValue();
    }

    private final int getEachWayTagWidth() {
        if (getEachWayTagDelegate().c.getVisibility() == 0) {
            return getEachWayTagDelegate().c.getMeasuredWidth() + this.k;
        }
        return 0;
    }

    private final eue getErrorDelegate() {
        return (eue) this.o.getValue();
    }

    private final yte getLiveTagDelegate() {
        return (yte) this.x.getValue();
    }

    private final yte getOptionBetTagDelegate() {
        return (yte) this.r.getValue();
    }

    private final bte getShimmerDelegate() {
        return (bte) this.t.getValue();
    }

    private final eue getSubTitleDelegate() {
        return (eue) this.m.getValue();
    }

    private final yte getTagDelegate() {
        return (yte) this.p.getValue();
    }

    @Override // a.lue
    public final void a() {
        getShimmerDelegate().c();
        requestLayout();
    }

    @Override // a.pse
    public final void b(CharSequence charSequence, j0d j0dVar) {
        setMarketCoefficient(charSequence);
        setMarketCoefficientState(j0dVar);
    }

    @Override // a.iue
    public final void c(boolean z) {
        getLiveTagDelegate().c.setVisibility(z ? 0 : 8);
        requestLayout();
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
        float f = this.e;
        int i = this.b;
        int i2 = this.d;
        int i3 = this.f;
        getCaptionDelegate().a(canvas, i + i2 + i3, f);
        float f2 = f + getCaptionDelegate().e;
        int visibility = getTagDelegate().c.getVisibility();
        int i4 = this.i;
        float measuredHeight = f2 + this.h + (visibility == 0 ? getTagDelegate().c.getMeasuredHeight() + i4 : 0);
        eue eueVar = this.l;
        eueVar.a(canvas, i2, measuredHeight);
        float f3 = measuredHeight + (!eueVar.b() ? eueVar.e + i4 : 0);
        getSubTitleDelegate().a(canvas, getLiveTagDelegate().c.getVisibility() == 0 ? getLiveTagDelegate().c.getMeasuredWidth() + i2 + i3 : i2, f3);
        if (getErrorDelegate().b()) {
            i4 = 0;
        }
        getErrorDelegate().a(canvas, i2, f3 + (getSubTitleDelegate().b() ? 0 : getSubTitleDelegate().e + i4));
        if (getErrorDelegate().b()) {
            return;
        }
        int i5 = getErrorDelegate().e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getShimmerDelegate().c.getVisibility() == 0) {
            getShimmerDelegate().a();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        int i5 = this.j;
        j4l0 j4l0Var = this.v;
        int measuredHeight2 = (measuredHeight - i5) - j4l0Var.getMeasuredHeight();
        j4l0 j4l0Var2 = this.v;
        int measuredWidth = j4l0Var2.getMeasuredWidth();
        int i6 = this.d;
        jmu0.f(i6, measuredHeight2, measuredWidth + i6, j4l0Var.getMeasuredHeight() + measuredHeight2, j4l0Var2, this);
        int i7 = getCaptionDelegate().e / 2;
        int i8 = this.e;
        int measuredHeight3 = (getMeasuredHeight() - i5) - (j4l0Var.getMeasuredHeight() / 2);
        htj htjVar = this.u;
        htjVar.b(i7 + i8, measuredHeight3);
        int i9 = getCaptionDelegate().e;
        LoadableImageView loadableImageView = this.w;
        float fMax = Math.max(i9, loadableImageView.getHeight()) + i8 + this.h;
        int i10 = this.d;
        getTagDelegate().a(i10, i10, (int) fMax);
        int visibility = getAutoSubTagDelegate().c.getVisibility();
        int i11 = this.c;
        if (visibility == 0) {
            int i12 = ((getCaptionDelegate().e / 2) + i8) - (getAutoSubTagDelegate().b / 2);
            int i13 = htjVar.c.getVisibility() == 0 ? i11 : i10;
            getAutoSubTagDelegate().a((getMeasuredWidth() - i13) - getAutoSubTagDelegate().c.getMeasuredWidth(), i13, i12);
        }
        if (getOptionBetTagDelegate().c.getVisibility() == 0) {
            int i14 = ((getCaptionDelegate().e / 2) + i8) - (getOptionBetTagDelegate().b / 2);
            int eachWayTagWidth = (htjVar.c.getVisibility() == 0 ? i11 : i10) + getEachWayTagWidth();
            getOptionBetTagDelegate().a((getMeasuredWidth() - eachWayTagWidth) - getOptionBetTagDelegate().c.getMeasuredWidth(), eachWayTagWidth, i14);
        }
        if (getEachWayTagDelegate().c.getVisibility() == 0) {
            int i15 = ((getCaptionDelegate().e / 2) + i8) - (getEachWayTagDelegate().b / 2);
            if (htjVar.c.getVisibility() != 0) {
                i11 = i10;
            }
            getEachWayTagDelegate().a((getMeasuredWidth() - i11) - getEachWayTagDelegate().c.getMeasuredWidth(), i11, i15);
        }
        if (loadableImageView.getVisibility() == 0) {
            int i16 = (getCaptionDelegate().e / 2) + i8;
            int i17 = this.b;
            int i18 = i17 / 2;
            int i19 = this.d;
            jmu0.f(i19, i16 - i18, i19 + i17, i18 + i16, loadableImageView, this);
        }
        if (getLiveTagDelegate().c.getVisibility() == 0) {
            getLiveTagDelegate().a(i10, getLiveTagDelegate().c.getMeasuredWidth() + i10, (((getMeasuredHeight() - ((i5 * 2) + j4l0Var.getMeasuredHeight())) - (!getErrorDelegate().b() ? getErrorDelegate().e + this.i : 0)) - (getSubTitleDelegate().e / 2)) - (getLiveTagDelegate().b / 2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int size = View.MeasureSpec.getSize(i);
        int visibility = getShimmerDelegate().c.getVisibility();
        int i3 = this.b;
        eue eueVar = this.l;
        j4l0 j4l0Var = this.v;
        if (visibility == 0) {
            getShimmerDelegate().b(size);
        } else {
            htj htjVar = this.u;
            int visibility2 = htjVar.d.getVisibility();
            int i4 = this.c;
            int i5 = this.d;
            j4l0Var.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i5) - (visibility2 == 0 ? i4 : i5), 1073741824), i2);
            getTagDelegate().b(size - (i5 * 2));
            eueVar.c(size - (i5 * 2));
            getErrorDelegate().c(size - (i5 * 2));
            if (getLiveTagDelegate().c.getVisibility() == 0) {
                getLiveTagDelegate().b(size);
            }
            int visibility3 = getLiveTagDelegate().c.getVisibility();
            int i6 = this.f;
            if (visibility3 == 0) {
                measuredWidth = getLiveTagDelegate().c.getMeasuredWidth() + i5 + i6;
            } else {
                measuredWidth = i5;
            }
            getSubTitleDelegate().c((size - i5) - measuredWidth);
            getAutoSubTagDelegate().c();
            getOptionBetTagDelegate().c();
            getEachWayTagDelegate().c();
            int visibility4 = getAutoSubTagDelegate().c.getVisibility();
            int i7 = this.k;
            int measuredWidth2 = visibility4 == 0 ? getAutoSubTagDelegate().c.getMeasuredWidth() + i7 : 0;
            int measuredWidth3 = getOptionBetTagDelegate().c.getVisibility() == 0 ? getOptionBetTagDelegate().c.getMeasuredWidth() + i7 : 0;
            int measuredWidth4 = getEachWayTagDelegate().c.getVisibility() == 0 ? getEachWayTagDelegate().c.getMeasuredWidth() + i7 : 0;
            if (htjVar.c.getVisibility() != 0) {
                i4 = i5;
            }
            int iD = hne.D(i4, measuredWidth2, measuredWidth3, measuredWidth4);
            LoadableImageView loadableImageView = this.w;
            if (loadableImageView.getVisibility() == 0) {
                i5 = i5 + i3 + i6;
            }
            getCaptionDelegate().c((size - i5) - iD);
            loadableImageView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            htjVar.c();
        }
        float fMax = Math.max(i3, getCaptionDelegate().e) + this.h;
        int visibility5 = getTagDelegate().c.getVisibility();
        int i8 = this.i;
        int measuredHeight = visibility5 == 0 ? getTagDelegate().c.getMeasuredHeight() + i8 : 0;
        int i9 = !getErrorDelegate().b() ? getErrorDelegate().e : 0;
        int i10 = !getSubTitleDelegate().b() ? getSubTitleDelegate().e + (i9 > 0 ? i8 : 0) : 0;
        if (i10 <= 0 && i9 <= 0) {
            i8 = 0;
        }
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec((getShimmerDelegate().c.getVisibility() == 0 ? Integer.valueOf(this.g) : Float.valueOf(this.e + (this.j * 2) + j4l0Var.getMeasuredHeight() + measuredHeight + i9 + (eueVar.b() ? 0 : eueVar.e + i8) + i10 + fMax)).intValue(), 1073741824));
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
        this.u.d(function1);
    }

    public final void setCaption(int i) {
        setCaption(getContext().getString(i));
    }

    @Override // a.pse
    public void setCouponBonusTitle(CharSequence charSequence) {
        setCaption(charSequence);
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

    @Override // a.pse
    public void setError(CharSequence charSequence) {
        getErrorDelegate().e(charSequence);
        requestLayout();
    }

    public void setLiveTagText(String str) {
        str.getClass();
        getLiveTagDelegate().e(str);
        requestLayout();
    }

    public final void setMarketCoefficient(CharSequence charSequence) {
        this.v.setMarketCoefficient(charSequence);
        requestLayout();
    }

    public final void setMarketCoefficientState(j0d j0dVar) {
        j0dVar.getClass();
        this.v.setMarketCoefficientState(j0dVar);
    }

    @Override // a.pse
    public void setMarketDescription(CharSequence charSequence) {
        this.v.setMarketDescription(charSequence);
        requestLayout();
    }

    @Override // a.jue
    public void setMarketHeader(CharSequence charSequence) {
        this.v.setMarketHeader(charSequence);
        requestLayout();
    }

    @Override // a.pse
    public void setMarketStyle(Integer num) {
        this.v.setMarketStyle(num);
    }

    @Override // a.pse
    public void setModel(fue fueVar) {
        fueVar.getClass();
        LoadableImageView.h(this.w, fueVar.o, null, 14);
        setCaption(fueVar.f10157a);
        setTagText(fueVar.b);
        setTagColor(fueVar.c);
        setTitle(fueVar.d);
        setSubTitle(fueVar.e);
        setError(fueVar.f);
        String str = fueVar.i;
        String str2 = fueVar.h;
        String str3 = fueVar.j;
        j4l0 j4l0Var = this.v;
        if (j4l0Var.getParent() == null) {
            addView(j4l0Var);
        }
        setMarketHeader(str2);
        setMarketDescription(str);
        setMarketCoefficient(str3);
        setMarketStyle(Integer.valueOf(fueVar.m));
        setMarketCoefficientState(fueVar.n);
        setMarketHeader(str2);
        c(fueVar.g);
        setLiveTagText(fueVar.p);
        setAutoSub(fueVar.q);
        setOptionBet(fueVar.r);
        setEachWay(fueVar.s);
    }

    @Override // a.pse
    public void setMoveButtonClickListener(Function1<? super View, Unit> function1) {
        this.u.e(function1);
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
        this.w.setImageResource(i);
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

    public final void setError(int i) {
        getErrorDelegate().d(i);
    }

    @Override // a.hue
    public void setCaption(CharSequence charSequence) {
        getCaptionDelegate().e(charSequence);
        requestLayout();
    }

    @Override // a.pse
    public void setSubTitle(CharSequence charSequence) {
        getSubTitleDelegate().e(charSequence);
        requestLayout();
    }

    @Override // a.nue
    public void setTitle(CharSequence charSequence) {
        this.l.e(charSequence);
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
    public SportCouponCardChampName(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCouponCardChampName(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
