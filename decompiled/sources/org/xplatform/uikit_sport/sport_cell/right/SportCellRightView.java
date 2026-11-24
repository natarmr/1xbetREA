package org.xplatform.uikit_sport.sport_cell.right;

import a.a8z;
import a.c0o;
import a.cqd0;
import a.dc;
import a.h3l0;
import a.hrf0;
import a.j1l0;
import a.jmu0;
import a.m5d;
import a.maz;
import a.obb;
import a.ppe;
import a.qg60;
import a.r0m;
import a.rc00;
import a.t9f;
import a.tje;
import a.u0m;
import a.wez;
import a.yrm;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.counter.DsCounter;
import org.xplatform.uikit.components.list_checkbox.DsListCheckBox;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes6.dex */
public final class SportCellRightView extends LinearLayout {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47299a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final a8z f;
    public DsTag g;
    public DsCounter h;
    public DsListCheckBox i;
    public DsAccordion j;
    public final a8z k;
    public final a8z l;
    public final a8z m;
    public h3l0 n;

    /* JADX WARN: Illegal instructions before constructor call */
    public SportCellRightView(final Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.sportCellRightStyle);
        this.f47299a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_40);
        final byte b2 = 0;
        Function0 function0 = new Function0() { // from class: a.i3l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                SportCellRightView sportCellRightView = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        int i2 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
                        int i3 = sportCellRightView.d;
                        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
                        appCompatImageView.setImageResource(R.drawable.ic_glyph_chevron_right_small);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return appCompatImageView;
                    case 1:
                        int i4 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
                        appCompatImageView2.setTag("starIcon");
                        appCompatImageView2.setId(jmu0.d());
                        int i5 = sportCellRightView.e;
                        appCompatImageView2.setLayoutParams(new LinearLayout.LayoutParams(i5, i5));
                        int i6 = sportCellRightView.b;
                        appCompatImageView2.setPadding(i6, i6, i6, i6);
                        return appCompatImageView2;
                    default:
                        int i7 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
                        int i8 = sportCellRightView.e;
                        appCompatImageView3.setLayoutParams(new LinearLayout.LayoutParams(i8, i8));
                        appCompatImageView3.setImageResource(R.drawable.ic_glyph_reorder);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        int i9 = sportCellRightView.b;
                        appCompatImageView3.setPadding(i9, i9, i9, i9);
                        return appCompatImageView3;
                }
            }
        };
        wez wezVar = wez.b;
        this.f = maz.a(wezVar, function0);
        final byte b3 = 1;
        this.k = maz.a(wezVar, new Function0() { // from class: a.i3l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                SportCellRightView sportCellRightView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
                        int i3 = sportCellRightView.d;
                        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
                        appCompatImageView.setImageResource(R.drawable.ic_glyph_chevron_right_small);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return appCompatImageView;
                    case 1:
                        int i4 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
                        appCompatImageView2.setTag("starIcon");
                        appCompatImageView2.setId(jmu0.d());
                        int i5 = sportCellRightView.e;
                        appCompatImageView2.setLayoutParams(new LinearLayout.LayoutParams(i5, i5));
                        int i6 = sportCellRightView.b;
                        appCompatImageView2.setPadding(i6, i6, i6, i6);
                        return appCompatImageView2;
                    default:
                        int i7 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
                        int i8 = sportCellRightView.e;
                        appCompatImageView3.setLayoutParams(new LinearLayout.LayoutParams(i8, i8));
                        appCompatImageView3.setImageResource(R.drawable.ic_glyph_reorder);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        int i9 = sportCellRightView.b;
                        appCompatImageView3.setPadding(i9, i9, i9, i9);
                        return appCompatImageView3;
                }
            }
        });
        this.l = maz.a(wezVar, new Function0() { // from class: a.i3l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                SportCellRightView sportCellRightView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
                        int i3 = sportCellRightView.d;
                        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
                        appCompatImageView.setImageResource(R.drawable.ic_glyph_chevron_right_small);
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return appCompatImageView;
                    case 1:
                        int i4 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
                        appCompatImageView2.setTag("starIcon");
                        appCompatImageView2.setId(jmu0.d());
                        int i5 = sportCellRightView.e;
                        appCompatImageView2.setLayoutParams(new LinearLayout.LayoutParams(i5, i5));
                        int i6 = sportCellRightView.b;
                        appCompatImageView2.setPadding(i6, i6, i6, i6);
                        return appCompatImageView2;
                    default:
                        int i7 = SportCellRightView.o;
                        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
                        int i8 = sportCellRightView.e;
                        appCompatImageView3.setLayoutParams(new LinearLayout.LayoutParams(i8, i8));
                        appCompatImageView3.setImageResource(R.drawable.ic_glyph_reorder);
                        appCompatImageView3.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        int i9 = sportCellRightView.b;
                        appCompatImageView3.setPadding(i9, i9, i9, i9);
                        return appCompatImageView3;
                }
            }
        });
        this.m = maz.a(wezVar, new hrf0(context, (byte) 5));
        this.n = h3l0.f12391a;
        j1l0 j1l0Var = new j1l0(this, b3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.g, R.attr.sportCellRightStyle, 0);
        j1l0Var.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final Unit a(SportCellRightView sportCellRightView, TypedArray typedArray) {
        typedArray.getClass();
        sportCellRightView.setupTag(typedArray);
        sportCellRightView.setupCounter(typedArray);
        sportCellRightView.setupListCheckBox(typedArray);
        sportCellRightView.setupAccordion(typedArray);
        sportCellRightView.setupCustomBadge(typedArray);
        sportCellRightView.setupActionIcon(typedArray);
        sportCellRightView.setType((h3l0) h3l0.j.get(typedArray.getInteger(12, 0)));
        return Unit.f46060a;
    }

    private final AppCompatImageView getActionIconImageView() {
        return (AppCompatImageView) this.k.getValue();
    }

    private final AppCompatImageView getChevronImageView() {
        return (AppCompatImageView) this.f.getValue();
    }

    private final u0m getCustomBadgeView() {
        return (u0m) this.m.getValue();
    }

    private final AppCompatImageView getDragAndDropImageView() {
        return (AppCompatImageView) this.l.getValue();
    }

    private final void setType(h3l0 h3l0Var) {
        this.n = h3l0Var;
        removeAllViewsInLayout();
        int iOrdinal = this.n.ordinal();
        int i = this.c;
        int i2 = this.f47299a;
        int i3 = this.b;
        switch (iOrdinal) {
            case 0:
                DsListCheckBox dsListCheckBox = this.i;
                if (dsListCheckBox != null) {
                    addView(dsListCheckBox);
                    return;
                } else {
                    Intrinsics.h("listCheckboxView");
                    throw null;
                }
            case 1:
                addView(getActionIconImageView());
                return;
            case 2:
                addView(b(i3));
                DsCounter dsCounter = this.h;
                if (dsCounter == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter);
                addView(b(i3));
                return;
            case 3:
                addView(b(i3));
                DsTag dsTag = this.g;
                if (dsTag == null) {
                    Intrinsics.h("tag");
                    throw null;
                }
                addView(dsTag);
                addView(b(i2));
                DsCounter dsCounter2 = this.h;
                if (dsCounter2 == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter2);
                addView(b(i2));
                addView(getActionIconImageView());
                return;
            case 4:
                addView(b(i3));
                DsCounter dsCounter3 = this.h;
                if (dsCounter3 == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter3);
                addView(b(i2));
                DsAccordion dsAccordion = this.j;
                if (dsAccordion != null) {
                    addView(dsAccordion);
                    return;
                } else {
                    Intrinsics.h("accordionView");
                    throw null;
                }
            case 5:
                addView(b(i3));
                DsCounter dsCounter4 = this.h;
                if (dsCounter4 == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter4);
                addView(b(i2));
                DsListCheckBox dsListCheckBox2 = this.i;
                if (dsListCheckBox2 != null) {
                    addView(dsListCheckBox2);
                    return;
                } else {
                    Intrinsics.h("listCheckboxView");
                    throw null;
                }
            case 6:
                addView(b(i3));
                addView(getChevronImageView());
                addView(b(i2));
                return;
            case 7:
                addView(b(i3));
                DsCounter dsCounter5 = this.h;
                if (dsCounter5 == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter5);
                addView(b(i2));
                addView(getChevronImageView());
                addView(b(i2));
                return;
            case 8:
                addView(getDragAndDropImageView());
                return;
            case 9:
                addView(getDragAndDropImageView());
                addView(b(i3));
                DsListCheckBox dsListCheckBox3 = this.i;
                if (dsListCheckBox3 != null) {
                    addView(dsListCheckBox3);
                    return;
                } else {
                    Intrinsics.h("listCheckboxView");
                    throw null;
                }
            case 10:
                DsAccordion dsAccordion2 = this.j;
                if (dsAccordion2 != null) {
                    addView(dsAccordion2);
                    return;
                } else {
                    Intrinsics.h("accordionView");
                    throw null;
                }
            case 11:
                addView(b(i3));
                addView(getCustomBadgeView());
                addView(b(i));
                DsCounter dsCounter6 = this.h;
                if (dsCounter6 == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter6);
                addView(b(i3));
                return;
            case 12:
                addView(b(i3));
                addView(getCustomBadgeView());
                addView(b(i));
                DsCounter dsCounter7 = this.h;
                if (dsCounter7 == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter7);
                addView(b(i2));
                DsListCheckBox dsListCheckBox4 = this.i;
                if (dsListCheckBox4 != null) {
                    addView(dsListCheckBox4);
                    return;
                } else {
                    Intrinsics.h("listCheckboxView");
                    throw null;
                }
            case 13:
                addView(b(i3));
                addView(getCustomBadgeView());
                addView(b(i));
                DsCounter dsCounter8 = this.h;
                if (dsCounter8 == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter8);
                addView(b(i2));
                DsAccordion dsAccordion3 = this.j;
                if (dsAccordion3 != null) {
                    addView(dsAccordion3);
                    return;
                } else {
                    Intrinsics.h("accordionView");
                    throw null;
                }
            case 14:
                addView(b(i3));
                DsCounter dsCounter9 = this.h;
                if (dsCounter9 == null) {
                    Intrinsics.h("counterView");
                    throw null;
                }
                addView(dsCounter9);
                addView(b(i2));
                DsAccordion dsAccordion4 = this.j;
                if (dsAccordion4 == null) {
                    Intrinsics.h("accordionView");
                    throw null;
                }
                addView(dsAccordion4);
                DsListCheckBox dsListCheckBox5 = this.i;
                if (dsListCheckBox5 != null) {
                    addView(dsListCheckBox5);
                    return;
                } else {
                    Intrinsics.h("listCheckboxView");
                    throw null;
                }
            default:
                t9f.b();
                return;
        }
    }

    private final void setupAccordion(TypedArray typedArray) {
        dc dcVar = dc.f5825a;
        dc dcVar2 = (dc) dc.c.get(typedArray.getInteger(1, 0));
        int i = DsAccordion.c;
        Context context = getContext();
        context.getClass();
        DsAccordion dsAccordionZ = obb.Z(context, dcVar2);
        dsAccordionZ.setId(jmu0.d());
        dsAccordionZ.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.j = dsAccordionZ;
        boolean z = typedArray.getBoolean(0, false);
        DsAccordion dsAccordion = this.j;
        if (dsAccordion == null) {
            Intrinsics.h("accordionView");
            throw null;
        }
        dsAccordion.setExpanded(z);
        dsAccordion.jumpDrawablesToCurrentState();
    }

    private final void setupActionIcon(TypedArray typedArray) {
        Drawable drawable = typedArray.getDrawable(2);
        if (drawable != null) {
            setActionIcon(drawable);
        }
        ColorStateList colorStateList = typedArray.getColorStateList(3);
        if (colorStateList != null) {
            setActionIconTint(colorStateList);
        }
    }

    private final void setupCounter(TypedArray typedArray) {
        ppe[] ppeVarArr = ppe.f27372a;
        r0m r0mVar = (r0m) r0m.t.get(typedArray.getInteger(6, 0));
        Context context = getContext();
        context.getClass();
        DsCounter dsCounter = new DsCounter(context, null, 6);
        dsCounter.setId(jmu0.d());
        dsCounter.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dsCounter.setComponentStyle(r0mVar);
        this.h = dsCounter;
        int i = typedArray.getInt(4, -1);
        int i2 = typedArray.getInt(5, -1);
        if (i <= 0 || i2 <= 0) {
            if (i > 0) {
                setCounterNumber(Integer.valueOf(i));
                return;
            }
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        DsCounter dsCounter2 = this.h;
        if (dsCounter2 != null) {
            dsCounter2.e(numValueOf, numValueOf2);
        } else {
            Intrinsics.h("counterView");
            throw null;
        }
    }

    private final void setupCustomBadge(TypedArray typedArray) {
        Object obj = yrm.f43128a;
        int integer = typedArray.getInteger(7, 0);
        c0o c0oVar = yrm.e;
        if (integer >= 0 && integer < c0oVar.b()) {
            obj = c0oVar.get(integer);
        }
        getCustomBadgeView().setStyle((yrm) obj);
    }

    private final void setupListCheckBox(TypedArray typedArray) {
        int i;
        rc00[] rc00VarArr = rc00.f30216a;
        rc00 rc00Var = (rc00) rc00.b.get(typedArray.getInteger(11, 0));
        Context context = getContext();
        context.getClass();
        rc00Var.getClass();
        int iOrdinal = rc00Var.ordinal();
        if (iOrdinal == 0) {
            i = R.style.Widget_DSListCheckbox_Primary;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            i = R.style.Widget_DSListCheckbox_Overlay;
        }
        DsListCheckBox dsListCheckBox = new DsListCheckBox(new tje(context, i), null, 6, 0);
        dsListCheckBox.setId(jmu0.d());
        dsListCheckBox.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.i = dsListCheckBox;
        boolean z = typedArray.getBoolean(10, false);
        DsListCheckBox dsListCheckBox2 = this.i;
        if (dsListCheckBox2 != null) {
            dsListCheckBox2.setChecked(z);
        } else {
            Intrinsics.h("listCheckboxView");
            throw null;
        }
    }

    private final void setupTag(TypedArray typedArray) {
        boolean z = typedArray.getBoolean(13, false);
        Context context = getContext();
        context.getClass();
        DsTag dsTag = new DsTag(context, null, 6, 0);
        dsTag.setId(jmu0.d());
        dsTag.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dsTag.setStyle(R.style.Widget_DSTag_RectangularS_Red);
        dsTag.setText("LIVE");
        dsTag.setGravity(17);
        dsTag.setVisibility(z ? 0 : 8);
        this.g = dsTag;
    }

    public final Space b(int i) {
        Space space = new Space(getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(i, -1));
        return space;
    }

    public final DsAccordion getAccordion() {
        DsAccordion dsAccordion = this.j;
        if (dsAccordion != null) {
            return dsAccordion;
        }
        Intrinsics.h("accordionView");
        throw null;
    }

    public final AppCompatImageView getActionIconView() {
        return getActionIconImageView();
    }

    public final DsCounter getCounter() {
        DsCounter dsCounter = this.h;
        if (dsCounter != null) {
            return dsCounter;
        }
        Intrinsics.h("counterView");
        throw null;
    }

    public final DsListCheckBox getListCheckBox() {
        DsListCheckBox dsListCheckBox = this.i;
        if (dsListCheckBox != null) {
            return dsListCheckBox;
        }
        Intrinsics.h("listCheckboxView");
        throw null;
    }

    public final void setAccordionClickListener(View.OnClickListener onClickListener) {
        DsAccordion dsAccordion = this.j;
        if (dsAccordion != null) {
            dsAccordion.setOnClickListener(onClickListener);
        } else {
            Intrinsics.h("accordionView");
            throw null;
        }
    }

    public final void setAccordionExpanded(boolean z) {
        DsCounter dsCounter = this.h;
        if (dsCounter == null) {
            Intrinsics.h("counterView");
            throw null;
        }
        if (dsCounter.getParent() != null) {
            DsCounter dsCounter2 = this.h;
            if (dsCounter2 == null) {
                Intrinsics.h("counterView");
                throw null;
            }
            if (dsCounter2.getComponentStyle() == r0m.o) {
                DsCounter dsCounter3 = this.h;
                if (dsCounter3 != null) {
                    DsCounter.f(dsCounter3, z);
                    return;
                } else {
                    Intrinsics.h("counterView");
                    throw null;
                }
            }
        }
        DsAccordion dsAccordion = this.j;
        if (dsAccordion == null) {
            Intrinsics.h("accordionView");
            throw null;
        }
        int i = DsAccordion.c;
        dsAccordion.setExpanded(z);
    }

    public final void setActionIcon(int i) {
        getActionIconImageView().setImageResource(i);
    }

    public final void setActionIconClickListener(View.OnClickListener onClickListener) {
        getActionIconImageView().setOnClickListener(onClickListener);
    }

    public final void setActionIconTint(ColorStateList colorStateList) {
        getActionIconImageView().setImageTintList(colorStateList);
    }

    public final void setActionIconTintByColorAttr(Integer num) {
        if (num == null) {
            getActionIconImageView().setImageTintList(null);
            return;
        }
        Context context = getContext();
        context.getClass();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(m5d.b(num.intValue(), context));
        colorStateListValueOf.getClass();
        setActionIconTint(colorStateListValueOf);
    }

    public final void setCounterClickListener(View.OnClickListener onClickListener) {
        DsCounter dsCounter = this.h;
        if (dsCounter != null) {
            dsCounter.setOnClickListener(onClickListener);
        } else {
            Intrinsics.h("counterView");
            throw null;
        }
    }

    public final void setCounterNumber(Integer num) {
        DsCounter dsCounter = this.h;
        if (dsCounter != null) {
            dsCounter.setCount(num);
        } else {
            Intrinsics.h("counterView");
            throw null;
        }
    }

    public final void setCounterStyle(r0m r0mVar) {
        r0mVar.getClass();
        DsCounter dsCounter = this.h;
        if (dsCounter != null) {
            dsCounter.setComponentStyle(r0mVar);
        } else {
            Intrinsics.h("counterView");
            throw null;
        }
    }

    public final void setCustomBadgeType(yrm yrmVar) {
        yrmVar.getClass();
        getCustomBadgeView().setStyle(yrmVar);
    }

    public final void setDragAndDrapTouchListener(View.OnTouchListener onTouchListener) {
        getDragAndDropImageView().setOnTouchListener(onTouchListener);
    }

    public final void setFavoriteIcon(boolean z) {
        getActionIconImageView().setImageResource(z ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive);
    }

    public final void setListCheckBoxClickListener(View.OnClickListener onClickListener) {
        DsListCheckBox dsListCheckBox = this.i;
        if (dsListCheckBox != null) {
            dsListCheckBox.setOnClickListener(onClickListener);
        } else {
            Intrinsics.h("listCheckboxView");
            throw null;
        }
    }

    public final void setListCheckBoxEnabledWithAlpha(boolean z) {
        DsListCheckBox dsListCheckBox = this.i;
        if (dsListCheckBox == null) {
            Intrinsics.h("listCheckboxView");
            throw null;
        }
        dsListCheckBox.setEnabled(z);
        DsListCheckBox dsListCheckBox2 = this.i;
        if (dsListCheckBox2 != null) {
            dsListCheckBox2.setAlpha(z ? 1.0f : 0.2f);
        } else {
            Intrinsics.h("listCheckboxView");
            throw null;
        }
    }

    public final void setListCheckboxChecked(boolean z) {
        DsListCheckBox dsListCheckBox = this.i;
        if (dsListCheckBox != null) {
            dsListCheckBox.setChecked(z);
        } else {
            Intrinsics.h("listCheckboxView");
            throw null;
        }
    }

    public final void setListCheckboxCheckedChangeListener(qg60 qg60Var) {
        DsListCheckBox dsListCheckBox = this.i;
        if (dsListCheckBox != null) {
            dsListCheckBox.setCheckedChangeListener(qg60Var);
        } else {
            Intrinsics.h("listCheckboxView");
            throw null;
        }
    }

    public final void setStyle(h3l0 h3l0Var) {
        h3l0Var.getClass();
        setType(h3l0Var);
    }

    public final void setTagVisible(boolean z) {
        DsTag dsTag = this.g;
        if (dsTag != null) {
            dsTag.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.h("tag");
            throw null;
        }
    }

    public final void setActionIcon(Drawable drawable) {
        getActionIconImageView().setImageDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCellRightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCellRightView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
