package org.xplatform.uikit_sport.sport_cell.left;

import a.a6p;
import a.a8z;
import a.bqd0;
import a.bs50;
import a.cqd0;
import a.hny;
import a.hrf0;
import a.if5;
import a.ktt0;
import a.m5d;
import a.maz;
import a.t9f;
import a.v1l0;
import a.vf5;
import a.wez;
import a.yoe;
import a.yrm;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;

/* JADX INFO: loaded from: classes6.dex */
public final class SportCellLeftView extends FrameLayout {
    public static final /* synthetic */ int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v1l0 f47297a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final a8z g;
    public final a8z h;
    public final a8z i;
    public final a8z j;
    public final a8z k;
    public final a8z l;
    public final a6p m;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportCellLeftView(final Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b2 = 0;
        super(context, attributeSet, 0);
        this.f47297a = v1l0.f36638a;
        this.c = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_64);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_66);
        hrf0 hrf0Var = new hrf0(context, (byte) 3);
        wez wezVar = wez.b;
        this.g = maz.a(wezVar, hrf0Var);
        this.h = maz.a(wezVar, new Function0() { // from class: a.w1l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                SportCellLeftView sportCellLeftView = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        int i2 = SportCellLeftView.n;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
                        int i3 = sportCellLeftView.d;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                        layoutParams.gravity = 17;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setImageResource(R.drawable.ic_sport_cell_left_icon_background_circle);
                        return appCompatImageView;
                    default:
                        int i4 = SportCellLeftView.n;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
                        appCompatImageView2.setId(jmu0.d());
                        int i5 = sportCellLeftView.c;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i5);
                        layoutParams2.gravity = 17;
                        appCompatImageView2.setLayoutParams(layoutParams2);
                        return appCompatImageView2;
                }
            }
        });
        final byte b3 = 1;
        this.i = maz.a(wezVar, new Function0() { // from class: a.w1l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                SportCellLeftView sportCellLeftView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = SportCellLeftView.n;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
                        int i3 = sportCellLeftView.d;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
                        layoutParams.gravity = 17;
                        appCompatImageView.setLayoutParams(layoutParams);
                        appCompatImageView.setImageResource(R.drawable.ic_sport_cell_left_icon_background_circle);
                        return appCompatImageView;
                    default:
                        int i4 = SportCellLeftView.n;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
                        appCompatImageView2.setId(jmu0.d());
                        int i5 = sportCellLeftView.c;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i5);
                        layoutParams2.gravity = 17;
                        appCompatImageView2.setLayoutParams(layoutParams2);
                        return appCompatImageView2;
                }
            }
        });
        this.j = maz.a(wezVar, new Function0(this) { // from class: a.x1l0
            public final /* synthetic */ SportCellLeftView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b2;
                SportCellLeftView sportCellLeftView = this.b;
                switch (b4) {
                    case 0:
                        return SportCellLeftView.c(sportCellLeftView);
                    case 1:
                        return SportCellLeftView.b(sportCellLeftView);
                    default:
                        return SportCellLeftView.e(sportCellLeftView);
                }
            }
        });
        this.k = maz.a(wezVar, new Function0(this) { // from class: a.x1l0
            public final /* synthetic */ SportCellLeftView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                SportCellLeftView sportCellLeftView = this.b;
                switch (b4) {
                    case 0:
                        return SportCellLeftView.c(sportCellLeftView);
                    case 1:
                        return SportCellLeftView.b(sportCellLeftView);
                    default:
                        return SportCellLeftView.e(sportCellLeftView);
                }
            }
        });
        this.l = maz.a(wezVar, new Function0(this) { // from class: a.x1l0
            public final /* synthetic */ SportCellLeftView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                SportCellLeftView sportCellLeftView = this.b;
                switch (b4) {
                    case 0:
                        return SportCellLeftView.c(sportCellLeftView);
                    case 1:
                        return SportCellLeftView.b(sportCellLeftView);
                    default:
                        return SportCellLeftView.e(sportCellLeftView);
                }
            }
        });
        a6p a6pVar = new a6p(this, (byte) 1);
        this.m = a6pVar;
        addView(getContainerLeftCellView());
        getContainerLeftCellView().addView(getIconBackgroundView());
        getContainerLeftCellView().addView(getIconView());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.e, 0, 0);
        a6pVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        getCounterHelper().b(attributeSet, 0);
        getBadgeHelper().f(attributeSet, 0);
        if5 iconHelper = getIconHelper();
        Context context2 = iconHelper.f14670a.getContext();
        context2.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, bqd0.y, 0, 0);
        iconHelper.d = typedArrayObtainStyledAttributes2.getInt(2, iconHelper.d);
        iconHelper.e = ktt0.q(typedArrayObtainStyledAttributes2, 4, 7);
        iconHelper.f = ktt0.q(typedArrayObtainStyledAttributes2, 6, 8);
        iconHelper.b(typedArrayObtainStyledAttributes2);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public static final Unit a(SportCellLeftView sportCellLeftView, TypedArray typedArray) {
        typedArray.getClass();
        sportCellLeftView.f47297a = (v1l0) v1l0.f.get(typedArray.getInteger(7, sportCellLeftView.f47297a.ordinal()));
        sportCellLeftView.getIconView().setClickable(sportCellLeftView.f47297a == v1l0.d);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(2, sportCellLeftView.c);
        AppCompatImageView iconView = sportCellLeftView.getIconView();
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = dimensionPixelSize;
        layoutParams2.width = dimensionPixelSize;
        iconView.setLayoutParams(layoutParams2);
        sportCellLeftView.getIconView().setScaleType(sportCellLeftView.f47297a == v1l0.c ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
        sportCellLeftView.setImageBackgroundAvailable(typedArray.getBoolean(5, sportCellLeftView.b));
        Drawable drawable = typedArray.getDrawable(4);
        if (drawable != null) {
            sportCellLeftView.setIconBackground(drawable);
        }
        Drawable drawable2 = typedArray.getDrawable(1);
        if (drawable2 != null) {
            sportCellLeftView.setIcon(drawable2);
        }
        ColorStateList colorStateList = typedArray.getColorStateList(3);
        if (colorStateList != null) {
            sportCellLeftView.setIconTint(colorStateList);
        }
        ColorStateList colorStateList2 = typedArray.getColorStateList(6);
        if (colorStateList2 != null) {
            sportCellLeftView.setBackgroundTint(colorStateList2);
        }
        return Unit.f46060a;
    }

    public static final if5 b(SportCellLeftView sportCellLeftView) {
        return new if5(sportCellLeftView.getContainerLeftCellView(), null);
    }

    public static final yoe c(SportCellLeftView sportCellLeftView) {
        return new yoe(sportCellLeftView.getContainerLeftCellView(), null);
    }

    public static final if5 e(SportCellLeftView sportCellLeftView) {
        return new if5(sportCellLeftView.getContainerLeftCellView(), null);
    }

    public static final void f(View.OnClickListener onClickListener, SportCellLeftView sportCellLeftView) {
        if (onClickListener != null) {
            onClickListener.onClick(sportCellLeftView.getIconView());
        }
    }

    private final if5 getBadgeHelper() {
        return (if5) this.k.getValue();
    }

    private final FrameLayout getContainerLeftCellView() {
        return (FrameLayout) this.g.getValue();
    }

    private final yoe getCounterHelper() {
        return (yoe) this.j.getValue();
    }

    private final AppCompatImageView getIconBackgroundView() {
        return (AppCompatImageView) this.h.getValue();
    }

    private final if5 getIconHelper() {
        return (if5) this.l.getValue();
    }

    private final AppCompatImageView getIconView() {
        return (AppCompatImageView) this.i.getValue();
    }

    private final void setImageBackgroundAvailable(boolean z) {
        this.b = z;
        getIconBackgroundView().setVisibility(z ? 0 : 8);
    }

    public final AppCompatImageView d() {
        return getIconView();
    }

    public final void setActionIconClickListener(View.OnClickListener onClickListener) {
        getIconView().setOnClickListener(new bs50((Object) onClickListener, (Object) this, (byte) 11));
        getIconView().setClickable(this.f47297a == v1l0.d);
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        getIconBackgroundView().setImageTintList(colorStateList);
    }

    public final void setBadge(yrm yrmVar) {
        yrmVar.getClass();
        int iOrdinal = yrmVar.ordinal();
        if (iOrdinal == 0) {
            getBadgeHelper().a(vf5.e);
            return;
        }
        if (iOrdinal == 1) {
            getBadgeHelper().a(vf5.f);
        } else if (iOrdinal == 2) {
            getBadgeHelper().a(null);
        } else {
            t9f.b();
        }
    }

    public final void setBadgeBackgroundTint(int i) {
        getBadgeHelper().j(i);
    }

    public final void setBadgeNew(boolean z) {
        if (z) {
            getBadgeHelper().a(vf5.f);
        } else {
            getBadgeHelper().a(null);
        }
    }

    public final void setBadgeVisible(boolean z) {
        DsBadge dsBadge = getBadgeHelper().c;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
    }

    public final void setBottomIcon(Drawable drawable) {
        if (drawable != null) {
            if (getIconHelper().c == null) {
                getIconHelper().a(vf5.j);
            }
            DsBadge dsBadge = getIconHelper().c;
            if (dsBadge != null) {
                dsBadge.setImageDrawable(drawable);
            }
        } else {
            getIconHelper().a(null);
        }
        getCounterHelper().c(null);
    }

    public final void setCounterNumber(Integer num) {
        getCounterHelper().c(num);
        getIconHelper().a(null);
    }

    public final void setFavoriteIcon(boolean z) {
        getIconView().setImageResource(z ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive);
    }

    public final void setIcon(int i) {
        getIconView().setImageResource(i);
    }

    public final void setIconBackground(int i) {
        getIconBackgroundView().setImageResource(i);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        getIconView().setImageTintList(colorStateList);
    }

    public final void setIconTintByColorAttr(Integer num) {
        if (num == null) {
            getIconView().setImageTintList(null);
            return;
        }
        Context context = getContext();
        context.getClass();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(m5d.b(num.intValue(), context));
        colorStateListValueOf.getClass();
        setIconTint(colorStateListValueOf);
    }

    public final void setStyle(v1l0 v1l0Var) {
        int i;
        v1l0Var.getClass();
        this.f47297a = v1l0Var;
        int iOrdinal = v1l0Var.ordinal();
        if (iOrdinal == 0) {
            i = R.style.Widget_SportCell_SportCellLeft_Icon;
        } else if (iOrdinal == 1) {
            i = R.style.Widget_SportCell_SportCellLeft_BackgroundIcon;
        } else if (iOrdinal == 2) {
            i = R.style.Widget_SportCell_SportCellLeft_ChampionshipIcon;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            i = R.style.Widget_SportCell_SportCellLeft_ActionIcon;
        }
        int iOrdinal2 = v1l0Var.ordinal();
        int i2 = this.d;
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                i2 = this.e;
            } else if (iOrdinal2 == 2) {
                i2 = this.f;
            } else if (iOrdinal2 != 3) {
                t9f.b();
                return;
            }
        }
        getIconView().setScaleType(v1l0Var == v1l0.c ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = i2;
        setLayoutParams(layoutParams2);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), v1l0Var == v1l0.b ? 0 : getResources().getDimensionPixelSize(R.dimen.space_2), getPaddingBottom());
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, cqd0.e);
        this.m.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        getCounterHelper().a(i);
        getBadgeHelper().e(i);
        if5 iconHelper = getIconHelper();
        Context context2 = iconHelper.f14670a.getContext();
        context2.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i, bqd0.y);
        iconHelper.d = typedArrayObtainStyledAttributes2.getInt(2, iconHelper.d);
        iconHelper.e = ktt0.q(typedArrayObtainStyledAttributes2, 4, 7);
        iconHelper.f = ktt0.q(typedArrayObtainStyledAttributes2, 6, 8);
        iconHelper.b(typedArrayObtainStyledAttributes2);
        DsBadge dsBadge = iconHelper.c;
        if (dsBadge != null) {
            dsBadge.d(iconHelper.d, iconHelper.e, iconHelper.f);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
    }

    public final void setIconBackground(Drawable drawable) {
        getIconBackgroundView().setImageDrawable(drawable);
    }

    public final void setBadge(vf5 vf5Var) {
        getBadgeHelper().a(vf5Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCellLeftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCellLeftView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
