package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class l4l0 extends FrameLayout implements pse, kue, iue, hue, jue, mue, gue, lue {
    public int A;
    public final j4l0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f19412a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final LoadableImageView k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final htj u;
    public final sq8 v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4l0(Context context) {
        super(context, null, R.attr.sportCouponCardStyle);
        context.getClass();
        final byte b = 0;
        this.f19412a = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                l4l0 l4l0Var = this.b;
                switch (b2) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        this.b = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.e = (int) getResources().getDimension(R.dimen.size_120);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_12);
        this.h = getResources().getDimensionPixelSize(R.dimen.size_26);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_110);
        this.i = dimensionPixelSize;
        this.j = getResources().getDimensionPixelSize(R.dimen.space_12);
        final byte b2 = 6;
        LoadableImageView loadableImageView = new LoadableImageView(context, null, b2, b);
        loadableImageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        loadableImageView.setColorFilter(m5d.b(R.attr.uikitBackgroundGroupSecondary, context));
        addView(loadableImageView);
        this.k = loadableImageView;
        final byte b3 = 1;
        this.l = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                l4l0 l4l0Var = this.b;
                switch (b4) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b4 = 2;
        this.m = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                l4l0 l4l0Var = this.b;
                switch (b5) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b5 = 3;
        this.n = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                l4l0 l4l0Var = this.b;
                switch (b6) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b6 = 4;
        this.o = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                l4l0 l4l0Var = this.b;
                switch (b7) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b7 = 5;
        this.p = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b7;
                l4l0 l4l0Var = this.b;
                switch (b8) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        this.q = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b2;
                l4l0 l4l0Var = this.b;
                switch (b8) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b8 = 7;
        this.r = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b9 = b8;
                l4l0 l4l0Var = this.b;
                switch (b9) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b9 = 8;
        this.s = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b10 = b9;
                l4l0 l4l0Var = this.b;
                switch (b10) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b10 = 9;
        this.t = maz.b(new Function0(this) { // from class: a.k4l0
            public final /* synthetic */ l4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b11 = b10;
                l4l0 l4l0Var = this.b;
                switch (b11) {
                    case 0:
                        return new od5(l4l0Var);
                    case 1:
                        return new eue(2, l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_1), R.style.TextStyle_Caption_Medium_L_TextPrimary, l4l0Var);
                    case 2:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, l4l0Var);
                    case 3:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, l4l0Var);
                    case 4:
                        yte yteVar = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        l4l0Var.addView(yteVar.c);
                        return yteVar;
                    case 5:
                        yte yteVar2 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_RedTransparent);
                        DsTag dsTag = yteVar2.c;
                        l4l0Var.addView(dsTag);
                        dsTag.setVisibility(8);
                        return yteVar2;
                    case 6:
                        yte yteVar3 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_PrimaryTransparent);
                        l4l0Var.addView(yteVar3.c);
                        return yteVar3;
                    case 7:
                        yte yteVar4 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_Green);
                        l4l0Var.addView(yteVar4.c);
                        return yteVar4;
                    case 8:
                        yte yteVar5 = new yte(l4l0Var, R.style.Widget_DSTag_RectangularS_DarkOrange);
                        l4l0Var.addView(yteVar5.c);
                        return yteVar5;
                    default:
                        bte bteVar = new bte(l4l0Var, l4l0Var.e);
                        l4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        htj htjVar = new htj(this, R.drawable.ic_glyph_cancel, R.dimen.size_40, R.dimen.size_40);
        addView(htjVar.d);
        addView(htjVar.c);
        this.u = htjVar;
        this.v = new sq8(this);
        float dimension = getResources().getDimension(R.dimen.text_12);
        float dimension2 = getResources().getDimension(R.dimen.text_16);
        j4l0 j4l0Var = new j4l0(context);
        j4l0Var.setMarketBlockedIconPosition(xr20.b);
        j4l0Var.setDescriptionTextStyle(R.style.TextStyle_Caption_Medium_M_Secondary);
        j4l0Var.setHeaderTextStyle(R.style.TextStyle_Caption_Bold_L_TextPrimary);
        j4l0Var.setCoefficientTextStyle(R.style.TextStyle_Headline_Bold_TextPrimary);
        j4l0Var.setDescriptionMaxLines(1);
        j4l0Var.setHeaderMaxLines(Integer.MAX_VALUE);
        j4l0Var.setCoefficientMaxTextSize(dimension2);
        j4l0Var.setCoefficientMinTextSize(dimension);
        this.B = j4l0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, cqd0.i, R.attr.sportCouponCardStyle, 0);
        setCaption(typedArrayObtainStyledAttributes.getString(0));
        setSubTitle(typedArrayObtainStyledAttributes.getString(7));
        setTagText(typedArrayObtainStyledAttributes.getString(8));
        ColorStateList colorStateListM = ktt0.m(9, context, typedArrayObtainStyledAttributes);
        if (colorStateListM != null) {
            setTagColor(colorStateListM);
        }
        setError(typedArrayObtainStyledAttributes.getString(2));
        setMarketStyle(Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(1, 0)));
        CharSequence string = typedArrayObtainStyledAttributes.getString(5);
        CharSequence string2 = typedArrayObtainStyledAttributes.getString(4);
        CharSequence string3 = typedArrayObtainStyledAttributes.getString(3);
        if (j4l0Var.getParent() == null) {
            addView(j4l0Var);
        }
        setMarketHeader(string2);
        setMarketDescription(string);
        setMarketCoefficient(string3);
        if (typedArrayObtainStyledAttributes.getBoolean(6, false)) {
            a();
        }
        typedArrayObtainStyledAttributes.recycle();
        getBackgroundTintHelper().a(null, R.attr.sportCouponCardStyle);
        setTag("SportCouponCardSmallTeamLogoTestTag");
    }

    private final yte getAutoSubTagDelegate() {
        return (yte) this.q.getValue();
    }

    private final od5 getBackgroundTintHelper() {
        return (od5) this.f19412a.getValue();
    }

    private final eue getCaptionDelegate() {
        return (eue) this.m.getValue();
    }

    private final yte getEachWayTagDelegate() {
        return (yte) this.s.getValue();
    }

    private final int getEachWayTagWidth() {
        if (getEachWayTagDelegate().c.getVisibility() == 0) {
            return getEachWayTagDelegate().c.getMeasuredWidth();
        }
        return 0;
    }

    private final eue getErrorDelegate() {
        return (eue) this.n.getValue();
    }

    private final yte getLiveTagDelegate() {
        return (yte) this.p.getValue();
    }

    private final yte getOptionBetTagDelegate() {
        return (yte) this.r.getValue();
    }

    private final bte getShimmerDelegate() {
        return (bte) this.t.getValue();
    }

    private final eue getSubTitleDelegate() {
        return (eue) this.l.getValue();
    }

    private final yte getWarningTagDelegate() {
        return (yte) this.o.getValue();
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

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        float f = this.c;
        int measuredWidth = getLiveTagDelegate().c.getMeasuredWidth() + this.d;
        int i = this.b;
        Integer numValueOf = Integer.valueOf(measuredWidth + i);
        if (getLiveTagDelegate().c.getVisibility() != 0) {
            numValueOf = null;
        }
        getSubTitleDelegate().a(canvas, numValueOf != null ? numValueOf.intValue() : i, f);
        float f2 = f + this.w;
        getCaptionDelegate().a(canvas, i, f2);
        getErrorDelegate().a(canvas, i, f2 + this.x + this.y + this.z);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getBackgroundTintHelper().b;
    }

    public final String getError() {
        return getErrorDelegate().d;
    }

    public final String getSubTitle() {
        return getSubTitleDelegate().d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        if (getShimmerDelegate().c.getVisibility() == 0) {
            getShimmerDelegate().a();
            return;
        }
        int visibility = getAutoSubTagDelegate().c.getVisibility();
        int i5 = this.b;
        htj htjVar = this.u;
        int i6 = this.c;
        if (visibility == 0) {
            int iA = htjVar.a();
            Integer numValueOf = Integer.valueOf(iA);
            if (iA <= 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : i5;
            getAutoSubTagDelegate().a((getMeasuredWidth() - iIntValue) - getAutoSubTagDelegate().c.getMeasuredWidth(), iIntValue, i6);
        }
        if (getOptionBetTagDelegate().c.getVisibility() == 0) {
            int iA2 = htjVar.a();
            Integer numValueOf2 = Integer.valueOf(iA2);
            if (iA2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : i5;
            getOptionBetTagDelegate().a(((getMeasuredWidth() - iIntValue2) - getEachWayTagWidth()) - getOptionBetTagDelegate().c.getMeasuredWidth(), iIntValue2, i6);
        }
        if (getEachWayTagDelegate().c.getVisibility() == 0) {
            int iA3 = htjVar.a();
            Integer numValueOf3 = Integer.valueOf(iA3);
            if (iA3 <= 0) {
                numValueOf3 = null;
            }
            int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i5;
            getEachWayTagDelegate().a((getMeasuredWidth() - iIntValue3) - getEachWayTagDelegate().c.getMeasuredWidth(), iIntValue3, i6);
        }
        int measuredWidth = getMeasuredWidth();
        int i7 = this.i;
        int i8 = this.g;
        int i9 = this.h;
        jmu0.f((measuredWidth - i7) + i8, -i9, i8 + getMeasuredWidth(), i7 - i9, this.k, this);
        int measuredHeight = getMeasuredHeight() - i6;
        j4l0 j4l0Var = this.B;
        int measuredHeight2 = measuredHeight - j4l0Var.getMeasuredHeight();
        int measuredWidth2 = j4l0Var.getMeasuredWidth();
        int i10 = this.b;
        jmu0.f(i10, measuredHeight2, measuredWidth2 + i10, j4l0Var.getMeasuredHeight() + measuredHeight2, j4l0Var, this);
        ImageView imageView2 = htjVar.c;
        ImageView imageView3 = htjVar.d;
        int measuredHeight3 = imageView2.getMeasuredHeight() / 2;
        int measuredHeight4 = imageView3.getMeasuredHeight() / 2;
        ViewGroup viewGroup = htjVar.f13637a;
        int i11 = htjVar.b;
        ImageView imageView4 = htjVar.c;
        if (imageView4.getVisibility() == 0) {
            int i12 = i11 / 2;
            imageView = imageView4;
            jmu0.f(viewGroup.getMeasuredWidth() - i11, measuredHeight3 - i12, viewGroup.getMeasuredWidth(), i12 + measuredHeight3, imageView, viewGroup);
            viewGroup = viewGroup;
        } else {
            imageView = imageView4;
        }
        int i13 = imageView.getVisibility() == 0 ? i11 : 0;
        if (imageView3.getVisibility() == 0) {
            int measuredWidth3 = (viewGroup.getMeasuredWidth() - i11) - i13;
            int i14 = i11 / 2;
            jmu0.f(measuredWidth3, measuredHeight4 - i14, viewGroup.getMeasuredWidth() - i13, i14 + measuredHeight4, imageView3, viewGroup);
        }
        getWarningTagDelegate().a(i5, i5, this.w + i6 + this.x);
        getLiveTagDelegate().a(i5, i5, hne.d(this.w, this.f, 2, i6) - (getLiveTagDelegate().c.getMeasuredHeight() / 2));
        int i15 = i6 + this.w + this.x + this.y;
        sq8 sq8Var = this.v;
        Object obj = (due) sq8Var.i;
        l4l0 l4l0Var = (l4l0) sq8Var.e;
        View view = obj != null ? (View) obj : null;
        if (view == null) {
            return;
        }
        int i16 = sq8Var.b;
        jmu0.f(i16, i15, view.getMeasuredWidth() + i16, view.getMeasuredHeight() + i15, view, l4l0Var);
        Object obj2 = (zse) sq8Var.h;
        View view2 = obj2 != null ? (View) obj2 : null;
        if (view2 == null) {
            return;
        }
        int measuredWidth4 = (l4l0Var.getMeasuredWidth() - sq8Var.b) - view2.getMeasuredWidth();
        jmu0.f(measuredWidth4, i15, view2.getMeasuredWidth() + measuredWidth4, view2.getMeasuredHeight() + i15, view2, l4l0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int visibility = getShimmerDelegate().c.getVisibility();
        sq8 sq8Var = this.v;
        j4l0 j4l0Var = this.B;
        if (visibility == 0) {
            getShimmerDelegate().b(size);
        } else {
            getAutoSubTagDelegate().c();
            getOptionBetTagDelegate().c();
            getEachWayTagDelegate().c();
            int iIntValue = this.b;
            int i3 = size - (iIntValue * 2);
            j4l0Var.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            getWarningTagDelegate().b(i3);
            getLiveTagDelegate().b(size);
            getErrorDelegate().c(i3);
            htj htjVar = this.u;
            htjVar.c();
            int measuredWidth = getAutoSubTagDelegate().c.getVisibility() == 0 ? getAutoSubTagDelegate().c.getMeasuredWidth() : 0;
            int measuredWidth2 = getOptionBetTagDelegate().c.getVisibility() == 0 ? getOptionBetTagDelegate().c.getMeasuredWidth() : 0;
            int measuredWidth3 = getEachWayTagDelegate().c.getVisibility() == 0 ? getEachWayTagDelegate().c.getMeasuredWidth() : 0;
            Integer numValueOf = Integer.valueOf(getLiveTagDelegate().c.getMeasuredWidth() + iIntValue + this.d);
            if (getLiveTagDelegate().c.getVisibility() != 0) {
                numValueOf = null;
            }
            int iIntValue2 = numValueOf != null ? numValueOf.intValue() : iIntValue;
            int i4 = measuredWidth + measuredWidth2 + measuredWidth3;
            int iA = htjVar.a();
            Integer numValueOf2 = Integer.valueOf(iA);
            if (iA <= 0) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            }
            getSubTitleDelegate().c((size - iIntValue2) - (i4 + iIntValue));
            getCaptionDelegate().c(i3);
            int i5 = sq8Var.b;
            Object obj = (zse) sq8Var.h;
            View view = obj != null ? (View) obj : null;
            if (view != null) {
                view.measure(i, i2);
            }
            Object obj2 = (zse) sq8Var.h;
            View view2 = obj2 != null ? (View) obj2 : null;
            int size2 = (View.MeasureSpec.getSize(i) - i5) - (((zse) sq8Var.h) == null ? i5 : (sq8Var.d + (view2 != null ? view2.getMeasuredWidth() : 0)) + i5);
            Object obj3 = (due) sq8Var.i;
            View view3 = obj3 != null ? (View) obj3 : null;
            if (view3 != null) {
                view3.measure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i2);
            }
            Object obj4 = (zse) sq8Var.h;
            View view4 = obj4 != null ? (View) obj4 : null;
            int measuredHeight = view4 != null ? view4.getMeasuredHeight() : 0;
            Object obj5 = (due) sq8Var.i;
            View view5 = obj5 != null ? (View) obj5 : null;
            sq8Var.f32615a = Math.max(measuredHeight, view5 != null ? view5.getMeasuredHeight() : 0);
        }
        int i6 = getSubTitleDelegate().e;
        int i7 = this.f;
        Integer numValueOf3 = Integer.valueOf(i6 + i7);
        if (getSubTitleDelegate().b()) {
            numValueOf3 = null;
        }
        this.w = numValueOf3 != null ? numValueOf3.intValue() : 0;
        Integer numValueOf4 = Integer.valueOf(getCaptionDelegate().e + i7);
        if (getCaptionDelegate().b()) {
            numValueOf4 = null;
        }
        this.x = numValueOf4 != null ? numValueOf4.intValue() : 0;
        Integer numValueOf5 = Integer.valueOf(getWarningTagDelegate().c.getMeasuredHeight() + i7);
        if (getWarningTagDelegate().c.getVisibility() != 0) {
            numValueOf5 = null;
        }
        this.y = numValueOf5 != null ? numValueOf5.intValue() : 0;
        Integer numValueOf6 = Integer.valueOf(sq8Var.f32615a + i7);
        if (sq8Var.f32615a <= 0) {
            numValueOf6 = null;
        }
        this.z = numValueOf6 != null ? numValueOf6.intValue() : this.j;
        Integer numValueOf7 = Integer.valueOf(getErrorDelegate().e + i7);
        if (getErrorDelegate().b()) {
            numValueOf7 = null;
        }
        this.A = numValueOf7 != null ? numValueOf7.intValue() : 0;
        Integer numValueOf8 = getShimmerDelegate().c.getVisibility() != 0 ? Integer.valueOf((this.c * 2) + this.w + this.x + this.y + this.z + this.A + j4l0Var.getMeasuredHeight()) : null;
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(numValueOf8 != null ? numValueOf8.intValue() : this.e, 1073741824));
    }

    @Override // a.gue
    public void setAutoSub(CharSequence charSequence) {
        getAutoSubTagDelegate().e(charSequence);
        getAutoSubTagDelegate().c.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
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

    public void setCouponMarketDescriptionStyle(int i) {
        this.B.setDescriptionTextStyle(i);
        requestLayout();
    }

    @Override // a.pse
    public void setEachWay(CharSequence charSequence) {
        getEachWayTagDelegate().e(charSequence);
        getEachWayTagDelegate().c.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    @Override // a.pse
    public void setError(CharSequence charSequence) {
        getErrorDelegate().e(charSequence);
        requestLayout();
    }

    public void setLiveTagText(String str) {
        str.getClass();
        getLiveTagDelegate().e(str);
    }

    public final void setMarketCoefficient(CharSequence charSequence) {
        this.B.setMarketCoefficient(charSequence);
        requestLayout();
    }

    public final void setMarketCoefficientState(j0d j0dVar) {
        j0dVar.getClass();
        this.B.setMarketCoefficientState(j0dVar);
    }

    @Override // a.pse
    public void setMarketDescription(CharSequence charSequence) {
        this.B.setMarketDescription(charSequence);
        requestLayout();
    }

    @Override // a.jue
    public void setMarketHeader(CharSequence charSequence) {
        this.B.setMarketHeader(charSequence);
        requestLayout();
    }

    @Override // a.pse
    public void setMarketStyle(Integer num) {
        this.B.setMarketStyle(num);
    }

    @Override // a.pse
    public void setModel(fue fueVar) {
        fueVar.getClass();
        LoadableImageView.h(this.k, fueVar.o, null, 14);
        setCaption(fueVar.f10157a);
        setTagText(fueVar.b);
        setTagColor(fueVar.c);
        setSubTitle(fueVar.e);
        setError(fueVar.f);
        String str = fueVar.i;
        String str2 = fueVar.h;
        String str3 = fueVar.j;
        j4l0 j4l0Var = this.B;
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
        this.v.a(fueVar.l, fueVar.k);
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

    @Override // a.kue
    public void setScoreUiModel(yse yseVar) {
        yseVar.getClass();
        sq8 sq8Var = this.v;
        sq8Var.getClass();
        yseVar.getClass();
        sq8Var.a((cue) sq8Var.g, yseVar);
        requestLayout();
    }

    @Override // a.mue
    public void setSportImage(int i) {
        this.k.setImageResource(i);
    }

    public final void setSubTitle(int i) {
        setSubTitle(getContext().getString(i));
    }

    public final void setTagColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        yte warningTagDelegate = getWarningTagDelegate();
        warningTagDelegate.getClass();
        jmu0.j(warningTagDelegate.c, colorStateList);
    }

    @Override // a.pse
    public void setTagText(CharSequence charSequence) {
        getWarningTagDelegate().e(charSequence);
        getWarningTagDelegate().c.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    @Override // a.kue
    public void setTeamsUiModel(cue cueVar) {
        cueVar.getClass();
        sq8 sq8Var = this.v;
        sq8Var.getClass();
        cueVar.getClass();
        sq8Var.a(cueVar, (yse) sq8Var.f);
    }

    /* JADX INFO: renamed from: getCaptionDelegate, reason: collision with other method in class */
    public final String m7getCaptionDelegate() {
        return getCaptionDelegate().d;
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

    @Override // a.pse
    public void setTagColor(int i) {
        getWarningTagDelegate().d(i);
    }

    @Override // a.gue
    public void setAutoSubClickListener(Function1<? super View, Unit> function1) {
    }

    @Override // a.pse
    public void setEachWayClickListener(Function1<? super View, Unit> function1) {
    }

    @Override // a.pse
    public void setOptionBetClickListener(Function1<? super View, Unit> function1) {
    }

    public final void setOptionBet(int i) {
        setOptionBet(getContext().getString(i));
    }

    public final void setTagText(int i) {
        yte warningTagDelegate = getWarningTagDelegate();
        warningTagDelegate.e(warningTagDelegate.f43214a.getContext().getString(i));
    }
}
