package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class f4l0 extends FrameLayout implements pse, kue, jue, mue, gue, lue {
    public int A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f8920a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int f1;
    public final int g;
    public int g1;
    public final int h;
    public int h1;
    public final int i;
    public int i1;
    public final int j;
    public int j1;
    public final int k;
    public int k1;
    public final int l;
    public final j4l0 l1;
    public final int m;
    public final a15 m1;
    public final int n;
    public final e680 n1;
    public int o;
    public final tgn o1;
    public int p;
    public int q;
    public final LoadableImageView r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;
    public final n0o0 v;
    public final htj w;
    public final w18 x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4l0(Context context) {
        super(context, null, R.attr.sportCouponCardStyle);
        context.getClass();
        final byte b = 0;
        this.f8920a = maz.b(new Function0(this) { // from class: a.e4l0
            public final /* synthetic */ f4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                f4l0 f4l0Var = this.b;
                switch (b2) {
                    case 0:
                        return new od5(f4l0Var);
                    case 1:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, f4l0Var);
                    case 2:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, f4l0Var);
                    case 3:
                        yte yteVar = new yte(f4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        f4l0Var.addView(yteVar.c);
                        return yteVar;
                    default:
                        bte bteVar = new bte(f4l0Var, f4l0Var.e);
                        f4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.b = dimensionPixelSize;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.e = (int) getResources().getDimension(R.dimen.size_138);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_14);
        this.f = dimensionPixelSize2;
        this.g = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_2);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.j = dimensionPixelSize3;
        this.k = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.l = getResources().getDimensionPixelSize(R.dimen.space_8);
        int i = dimensionPixelSize + dimensionPixelSize2;
        this.m = dimensionPixelSize3 + i;
        this.n = i;
        LoadableImageView loadableImageView = new LoadableImageView(context, null, 6, b);
        loadableImageView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
        loadableImageView.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
        addView(loadableImageView);
        this.r = loadableImageView;
        final byte b2 = 1;
        this.s = maz.b(new Function0(this) { // from class: a.e4l0
            public final /* synthetic */ f4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                f4l0 f4l0Var = this.b;
                switch (b3) {
                    case 0:
                        return new od5(f4l0Var);
                    case 1:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, f4l0Var);
                    case 2:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, f4l0Var);
                    case 3:
                        yte yteVar = new yte(f4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        f4l0Var.addView(yteVar.c);
                        return yteVar;
                    default:
                        bte bteVar = new bte(f4l0Var, f4l0Var.e);
                        f4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b3 = 2;
        this.t = maz.b(new Function0(this) { // from class: a.e4l0
            public final /* synthetic */ f4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                f4l0 f4l0Var = this.b;
                switch (b4) {
                    case 0:
                        return new od5(f4l0Var);
                    case 1:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, f4l0Var);
                    case 2:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, f4l0Var);
                    case 3:
                        yte yteVar = new yte(f4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        f4l0Var.addView(yteVar.c);
                        return yteVar;
                    default:
                        bte bteVar = new bte(f4l0Var, f4l0Var.e);
                        f4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b4 = 3;
        this.u = maz.b(new Function0(this) { // from class: a.e4l0
            public final /* synthetic */ f4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                f4l0 f4l0Var = this.b;
                switch (b5) {
                    case 0:
                        return new od5(f4l0Var);
                    case 1:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, f4l0Var);
                    case 2:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, f4l0Var);
                    case 3:
                        yte yteVar = new yte(f4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        f4l0Var.addView(yteVar.c);
                        return yteVar;
                    default:
                        bte bteVar = new bte(f4l0Var, f4l0Var.e);
                        f4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        final byte b5 = 4;
        this.v = maz.b(new Function0(this) { // from class: a.e4l0
            public final /* synthetic */ f4l0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                f4l0 f4l0Var = this.b;
                switch (b6) {
                    case 0:
                        return new od5(f4l0Var);
                    case 1:
                        return new eue(2, 0, R.style.TextStyle_Caption_Regular_L_Secondary, f4l0Var);
                    case 2:
                        return new eue(Integer.MAX_VALUE, 0, R.style.TextStyle_Caption_Regular_L_Warning, f4l0Var);
                    case 3:
                        yte yteVar = new yte(f4l0Var, R.style.Widget_DSTag_RectangularS_Red);
                        f4l0Var.addView(yteVar.c);
                        return yteVar;
                    default:
                        bte bteVar = new bte(f4l0Var, f4l0Var.e);
                        f4l0Var.addView(bteVar.c);
                        return bteVar;
                }
            }
        });
        htj htjVar = new htj(this, R.drawable.ic_glyph_cancel, R.dimen.size_48, R.dimen.size_36);
        addView(htjVar.d);
        addView(htjVar.c);
        this.w = htjVar;
        this.x = new w18(this);
        float dimension = getResources().getDimension(R.dimen.text_12);
        float dimension2 = getResources().getDimension(R.dimen.text_14);
        j4l0 j4l0Var = new j4l0(context);
        j4l0Var.setMarketBlockedIconPosition(xr20.f41348a);
        j4l0Var.setDescriptionTextStyle(R.style.TextStyle_Caption_Regular_L_Secondary);
        j4l0Var.setCoefficientTextStyle(R.style.TextStyle_Text_Bold_TextPrimary);
        j4l0Var.setDescriptionMaxLines(Integer.MAX_VALUE);
        j4l0Var.setCoefficientMaxTextSize(dimension2);
        j4l0Var.setCoefficientMinTextSize(dimension);
        j4l0Var.setBackgroundTintAttr(R.attr.uikitBackground);
        this.l1 = j4l0Var;
        this.m1 = new a15(context);
        this.n1 = new e680(context);
        this.o1 = new tgn(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, cqd0.i, R.attr.sportCouponCardStyle, 0);
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
        setTag("SportCouponCardBigTeamLogoTestTag");
    }

    private final od5 getBackgroundTintHelper() {
        return (od5) this.f8920a.getValue();
    }

    private final eue getErrorDelegate() {
        return (eue) this.t.getValue();
    }

    private final bte getShimmerDelegate() {
        return (bte) this.v.getValue();
    }

    private final eue getSubTitleDelegate() {
        return (eue) this.s.getValue();
    }

    private final yte getWarningTagDelegate() {
        return (yte) this.u.getValue();
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

    public final void c(View view) {
        int measuredHeight = getMeasuredHeight() - view.getMeasuredHeight();
        jmu0.f(this.l, measuredHeight, getMeasuredWidth() - this.l, view.getMeasuredHeight() + measuredHeight, view, this);
    }

    public final int d() {
        a15 a15Var = this.m1;
        int measuredHeight = a15Var.getVisibility() == 0 ? a15Var.getMeasuredHeight() : 0;
        e680 e680Var = this.n1;
        int measuredHeight2 = e680Var.getVisibility() == 0 ? e680Var.getMeasuredHeight() : 0;
        tgn tgnVar = this.o1;
        Integer numValueOf = Integer.valueOf(this.c + this.y + this.z + this.A + this.B + this.f1 + measuredHeight + measuredHeight2 + (tgnVar.getVisibility() == 0 ? tgnVar.getMeasuredHeight() : 0) + this.i);
        if (getShimmerDelegate().c.getVisibility() == 0) {
            numValueOf = null;
        }
        return View.MeasureSpec.makeMeasureSpec(numValueOf != null ? numValueOf.intValue() : this.e, 1073741824);
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

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        getSubTitleDelegate().a(canvas, this.m, this.c);
        getErrorDelegate().a(canvas, this.b, this.k1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getShimmerDelegate().c.getVisibility() == 0) {
            getShimmerDelegate().a();
            return;
        }
        int i5 = this.g1;
        jmu0.f(this.b, i5, this.n, i5 + this.f, this.r, this);
        int i6 = this.i1;
        int measuredWidth = getMeasuredWidth() - this.h1;
        int i7 = this.i1;
        jmu0.f(this.h, i6, measuredWidth, this.l1.getMeasuredHeight() + i7 + i7, this.l1, this);
        a15 a15Var = this.m1;
        if (a15Var.getVisibility() == 0) {
            c(a15Var);
        }
        e680 e680Var = this.n1;
        if (e680Var.getVisibility() == 0) {
            c(e680Var);
        }
        tgn tgnVar = this.o1;
        if (tgnVar.getVisibility() == 0) {
            c(tgnVar);
        }
        this.w.b(this.p, this.o);
        yte warningTagDelegate = getWarningTagDelegate();
        int i8 = this.b;
        warningTagDelegate.a(i8, i8, this.q);
        int i9 = this.j1;
        w18 w18Var = this.x;
        Object obj = w18Var.p;
        f4l0 f4l0Var = w18Var.f38386a;
        View view = obj != null ? (View) obj : null;
        if (view == null) {
            return;
        }
        int i10 = w18Var.f;
        jmu0.f(i10, i9 + w18Var.j, view.getMeasuredWidth() + i10, view.getMeasuredHeight() + w18Var.j + i9, view, f4l0Var);
        Object obj2 = w18Var.k;
        View view2 = obj2 != null ? (View) obj2 : null;
        if (view2 == null) {
            return;
        }
        int i11 = w18Var.h;
        jmu0.f(i11, i9 + w18Var.i, view2.getMeasuredWidth() + i11, view2.getMeasuredHeight() + i9 + w18Var.i, view2, f4l0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredWidth;
        int size = View.MeasureSpec.getSize(i);
        if (getShimmerDelegate().c.getVisibility() == 0) {
            getShimmerDelegate().b(size);
        } else {
            int i4 = this.b;
            int i5 = this.f;
            int i6 = i4 + i5 + this.d;
            eue subTitleDelegate = getSubTitleDelegate();
            int i7 = this.g;
            subTitleDelegate.c((size - i6) - i7);
            this.y = Math.max(getSubTitleDelegate().e, i5) + this.l;
            getWarningTagDelegate().b(size - (i4 * 2));
            Integer numValueOf = Integer.valueOf(getWarningTagDelegate().c.getMeasuredHeight() + this.j);
            if (getWarningTagDelegate().c.getVisibility() != 0) {
                numValueOf = null;
            }
            this.z = numValueOf != null ? numValueOf.intValue() : 0;
            int i8 = this.y;
            int i9 = this.c;
            this.q = i8 + i9;
            w18 w18Var = this.x;
            int i10 = w18Var.f;
            Object obj = w18Var.k;
            View view = obj != null ? (View) obj : null;
            if (view != null) {
                view.measure(i, i2);
            }
            Object obj2 = w18Var.k;
            View view2 = obj2 != null ? (View) obj2 : null;
            int measuredWidth2 = view2 != null ? view2.getMeasuredWidth() : 0;
            Object obj3 = w18Var.p;
            View view3 = obj3 != null ? (View) obj3 : null;
            if (view3 != null) {
                int size2 = View.MeasureSpec.getSize(i);
                if (view3 instanceof l5k0) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(size2 - (i10 * 2), 1073741824), i2);
                } else if (view3 instanceof x18) {
                    ((x18) view3).setScoreViewOccupiedWidth(measuredWidth2);
                    view3.measure(View.MeasureSpec.makeMeasureSpec(size2 - (i10 * 2), 1073741824), i2);
                } else {
                    view3.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i10) - (w18Var.k == null ? i10 : (w18Var.g + measuredWidth2) + i10), 1073741824), i2);
                }
            }
            Object obj4 = w18Var.k;
            View view4 = obj4 != null ? (View) obj4 : null;
            int measuredHeight = view4 != null ? view4.getMeasuredHeight() : 0;
            Object obj5 = w18Var.p;
            View view5 = obj5 != null ? (View) obj5 : null;
            int measuredHeight2 = view5 != null ? view5.getMeasuredHeight() : 0;
            w18Var.d = Math.max(measuredHeight, measuredHeight2);
            int size3 = View.MeasureSpec.getSize(i);
            Object obj6 = w18Var.k;
            View view6 = obj6 != null ? (View) obj6 : null;
            if (view6 != null) {
                View view7 = obj6 != null ? (View) obj6 : null;
                int measuredHeight3 = view7 != null ? view7.getMeasuredHeight() : 0;
                if (w18Var.p instanceof siz) {
                    i3 = size3 - i10;
                    measuredWidth = view6.getMeasuredWidth();
                } else {
                    i3 = ((size3 - (i10 * 2)) / 2) + i10;
                    measuredWidth = view6.getMeasuredWidth() / 2;
                }
                w18Var.h = i3 - measuredWidth;
                w18Var.i = w18Var.p instanceof siz ? 0 : (w18Var.d / 2) - (measuredHeight3 / 2);
            }
            boolean z = w18Var.k instanceof lxp0;
            int i11 = w18Var.d;
            w18Var.j = z ? i11 - measuredHeight2 : (i11 / 2) - (measuredHeight2 / 2);
            this.j1 = this.y + i9 + this.z;
            this.A = i11;
            getErrorDelegate().c(size - (i4 * 2));
            this.k1 = this.y + i9 + this.z + this.A;
            Integer numValueOf2 = !getErrorDelegate().b() ? Integer.valueOf(getErrorDelegate().e) : null;
            this.B = numValueOf2 != null ? numValueOf2.intValue() : 0;
            int size4 = View.MeasureSpec.getSize(i);
            htj htjVar = this.w;
            int visibility = htjVar.d.getVisibility();
            int i12 = this.h;
            if (visibility != 0) {
                i7 = i12;
            }
            this.h1 = i7;
            int i13 = this.y + i9 + this.z + this.A;
            int i14 = this.k;
            this.i1 = i13 + i14 + this.B;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size4 - i7) - i12, 1073741824);
            j4l0 j4l0Var = this.l1;
            j4l0Var.measure(iMakeMeasureSpec, i2);
            this.f1 = (i14 * 2) + j4l0Var.getMeasuredHeight();
            a15 a15Var = this.m1;
            if (a15Var.getVisibility() == 0) {
                a15Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (i12 * 2), 1073741824), i2);
            }
            e680 e680Var = this.n1;
            if (e680Var.getVisibility() == 0) {
                e680Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (i12 * 2), 1073741824), i2);
            }
            tgn tgnVar = this.o1;
            if (tgnVar.getVisibility() == 0) {
                tgnVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (i12 * 2), 1073741824), i2);
            }
            int size5 = View.MeasureSpec.getSize(d());
            int measuredHeight4 = a15Var.getVisibility() == 0 ? a15Var.getMeasuredHeight() : 0;
            int measuredHeight5 = e680Var.getVisibility() == 0 ? e680Var.getMeasuredHeight() : 0;
            int measuredHeight6 = tgnVar.getVisibility() == 0 ? tgnVar.getMeasuredHeight() : 0;
            htjVar.c();
            this.o = ((size5 - ((measuredHeight4 + measuredHeight5) + measuredHeight6)) - this.i) - (this.f1 / 2);
            this.p = (this.y + i9) / 2;
            this.g1 = ((getSubTitleDelegate().e / 2) + i9) - (i5 / 2);
        }
        setMeasuredDimension(i, d());
    }

    @Override // a.gue
    public void setAutoSub(CharSequence charSequence) {
        a15 a15Var = this.m1;
        if (a15Var.getParent() == null && charSequence != null && charSequence.length() != 0) {
            addView(a15Var);
        }
        a15Var.setAutoSubText(charSequence);
        a15Var.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    @Override // a.gue
    public void setAutoSubClickListener(Function1<? super View, Unit> function1) {
        this.m1.setOnAutoSubClickListener(function1);
    }

    @Override // a.pse
    public void setCancelButtonClickListener(Function1<? super View, Unit> function1) {
        this.w.d(function1);
    }

    @Override // a.pse
    public void setCouponBonusTitle(CharSequence charSequence) {
        setSubTitle(charSequence);
    }

    @Override // a.pse
    public void setEachWay(CharSequence charSequence) {
        tgn tgnVar = this.o1;
        if (tgnVar.getParent() == null && charSequence != null && charSequence.length() != 0) {
            addView(tgnVar);
        }
        tgnVar.setEachWayText(charSequence);
        tgnVar.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    @Override // a.pse
    public void setEachWayClickListener(Function1<? super View, Unit> function1) {
        this.o1.setOnEachWayClickListener(function1);
    }

    @Override // a.pse
    public void setError(CharSequence charSequence) {
        getErrorDelegate().e(charSequence);
        requestLayout();
    }

    public final void setMarketCoefficient(CharSequence charSequence) {
        this.l1.setMarketCoefficient(charSequence);
        requestLayout();
    }

    public final void setMarketCoefficientState(j0d j0dVar) {
        j0dVar.getClass();
        this.l1.setMarketCoefficientState(j0dVar);
    }

    @Override // a.pse
    public void setMarketDescription(CharSequence charSequence) {
        this.l1.setMarketDescription(charSequence);
        requestLayout();
    }

    @Override // a.jue
    public void setMarketHeader(CharSequence charSequence) {
        this.l1.setMarketHeader(charSequence);
        requestLayout();
    }

    @Override // a.pse
    public void setMarketStyle(Integer num) {
        this.l1.setMarketStyle(num);
    }

    @Override // a.pse
    public void setModel(fue fueVar) {
        fueVar.getClass();
        LoadableImageView.h(this.r, fueVar.o, null, 14);
        setTagText(fueVar.b);
        setTagColor(fueVar.c);
        setSubTitle(fueVar.e);
        setError(fueVar.f);
        String str = fueVar.i;
        String str2 = fueVar.h;
        String str3 = fueVar.j;
        j4l0 j4l0Var = this.l1;
        if (j4l0Var.getParent() == null) {
            addView(j4l0Var);
        }
        setMarketHeader(str2);
        setMarketDescription(str);
        setMarketCoefficient(str3);
        setMarketStyle(Integer.valueOf(fueVar.m));
        setMarketCoefficientState(fueVar.n);
        setMarketHeader(str2);
        this.x.a(fueVar.l, fueVar.k);
        setAutoSub(fueVar.q);
        setOptionBet(fueVar.r);
        setEachWay(fueVar.s);
    }

    @Override // a.pse
    public void setMoveButtonClickListener(Function1<? super View, Unit> function1) {
        this.w.e(function1);
    }

    @Override // a.pse
    public void setOptionBet(CharSequence charSequence) {
        e680 e680Var = this.n1;
        if (e680Var.getParent() == null && charSequence != null && charSequence.length() != 0) {
            addView(e680Var);
        }
        e680Var.setOptionBetText(charSequence);
        e680Var.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        requestLayout();
    }

    @Override // a.pse
    public void setOptionBetClickListener(Function1<? super View, Unit> function1) {
        this.n1.setOnOptionBetClickListener(function1);
    }

    public final void setRtlSupportEnabled(boolean z) {
        w18 w18Var = this.x;
        w18Var.e = z;
        w18Var.a(w18Var.c, w18Var.b);
    }

    @Override // a.kue
    public void setScoreUiModel(yse yseVar) {
        yseVar.getClass();
        w18 w18Var = this.x;
        w18Var.getClass();
        w18Var.a(w18Var.c, yseVar);
    }

    @Override // a.mue
    public void setSportImage(int i) {
        this.r.setImageResource(i);
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
        w18 w18Var = this.x;
        w18Var.getClass();
        w18Var.a(cueVar, w18Var.b);
    }

    public final void setError(int i) {
        getErrorDelegate().d(i);
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

    public final void setTagText(int i) {
        yte warningTagDelegate = getWarningTagDelegate();
        warningTagDelegate.e(warningTagDelegate.f43214a.getContext().getString(i));
    }
}
