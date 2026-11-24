package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class yyl extends FrameLayout implements iyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43472a;
    public wxl b;
    public wyl c;
    public List d;
    public uyl e;
    public boolean f;
    public Function2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyl(Context context) {
        super(context, null);
        context.getClass();
        this.f43472a = new ArrayList();
        this.b = wxl.PRIMARY;
        this.c = wyl.f39978a;
        this.d = iun.f15405a;
        this.e = uyl.f36494a;
    }

    public final void a() {
        removeAllViews();
        int i = 0;
        for (Object obj : this.d) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            mxl mxlVar = (mxl) obj;
            Context context = getContext();
            context.getClass();
            DsChip dsChip = new DsChip(context, null);
            dsChip.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            dsChip.setPaddingRelative(dsChip.getResources().getDimensionPixelSize(R.dimen.space_4), dsChip.getResources().getDimensionPixelSize(R.dimen.space_8), dsChip.getResources().getDimensionPixelSize(R.dimen.space_4), dsChip.getResources().getDimensionPixelSize(R.dimen.space_8));
            dsChip.setStyle(sac.r0(this.b));
            String str = mxlVar.f22560a;
            boolean z = mxlVar.e;
            dsChip.setText(str);
            dsChip.setEnabled(true);
            dsChip.setSelected(z);
            dsChip.setValueText(null);
            dsChip.setCount(null);
            dsChip.setRightIconRadius(0.0f);
            dsChip.setLeftIconRadius(0.0f);
            dsChip.setBadge(null);
            dsChip.setUnlimitedLines(false);
            dsChip.setTextMaxLines(null);
            dsChip.setTextActiveColor(null);
            dsChip.setBackgroundActiveColor(null);
            zwl zwlVar = mxlVar.d;
            if (zwlVar instanceof wwl) {
                throw null;
            }
            if (Intrinsics.d(zwlVar, ywl.f43374a)) {
                dsChip.setIconTint(null);
            } else if (!Intrinsics.d(zwlVar, xwl.f41614a)) {
                t9f.b();
                return;
            }
            fxl fxlVar = mxlVar.b;
            if (fxlVar instanceof axl) {
                throw null;
            }
            if (fxlVar instanceof cxl) {
                throw null;
            }
            if (!Intrinsics.d(fxlVar, exl.f8583a)) {
                if (fxlVar instanceof bxl) {
                    dsChip.setLeftIcon(R.drawable.ic_glyph_circle_check);
                } else {
                    if (!(fxlVar instanceof dxl)) {
                        t9f.b();
                        return;
                    }
                    dsChip.e(((dxl) fxlVar).f6851a, epv0.U(R.drawable.ic_glyph_category_new, dsChip.getContext()));
                }
            }
            kxl kxlVar = mxlVar.c;
            if (kxlVar instanceof ixl) {
                throw null;
            }
            if (kxlVar instanceof gxl) {
                throw null;
            }
            if (kxlVar instanceof hxl) {
                dsChip.getContext();
                throw null;
            }
            if (!Intrinsics.d(kxlVar, jxl.f17311a)) {
                t9f.b();
                return;
            } else {
                dyb.c0(dsChip, new ec3(this, dsChip, mxlVar, i, (byte) 5));
                addView(dsChip);
                i = i2;
            }
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        boolean z2 = getLayoutDirection() == 1;
        int paddingEnd = z2 ? i6 - getPaddingEnd() : getPaddingStart();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (z2) {
                if ((paddingEnd - measuredWidth) - getPaddingStart() < 0) {
                    paddingEnd = i6 - getPaddingEnd();
                    paddingTop += iMax;
                    iMax = 0;
                }
                i5 = paddingEnd - measuredWidth;
                childAt.layout(i5, paddingTop, paddingEnd, paddingTop + measuredHeight);
            } else {
                if (getPaddingEnd() + paddingEnd + measuredWidth > i6) {
                    paddingEnd = getPaddingStart();
                    paddingTop += iMax;
                    iMax = 0;
                }
                i5 = measuredWidth + paddingEnd;
                childAt.layout(paddingEnd, paddingTop, i5, paddingTop + measuredHeight);
            }
            paddingEnd = i5;
            iMax = Math.max(iMax, measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i3 = 0;
        int iMax = 0;
        while (i3 < childCount) {
            View childAt = this.getChildAt(i3);
            yyl yylVar = this;
            int i4 = i;
            int i5 = i2;
            yylVar.measureChildWithMargins(childAt, i4, 0, i5, 0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (paddingEnd + measuredWidth > size) {
                paddingTop += iMax;
                paddingEnd = yylVar.getPaddingEnd() + yylVar.getPaddingStart();
                iMax = 0;
            }
            paddingEnd += measuredWidth;
            iMax = Math.max(iMax, measuredHeight);
            i3++;
            this = yylVar;
            i = i4;
            i2 = i5;
        }
        yyl yylVar2 = this;
        yylVar2.setMeasuredDimension(size, View.resolveSize(yylVar2.getPaddingBottom() + iMax + paddingTop, i2));
    }

    @Override // a.iyl
    public void setChips(List<mxl> list) {
        list.getClass();
        this.d = list;
        a();
    }

    @Override // a.iyl
    public void setCustomHorizontalMargin(int i) {
        setPaddingRelative(i, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // a.iyl
    public void setLoading(boolean z) {
        ColorStateList colorStateListValueOf;
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.f43472a;
        if (!z) {
            if (getChildCount() == 0 || !(getChildAt(0) instanceof DsShimmerView)) {
                return;
            }
            x0x.O(this);
            removeAllViews();
            this.d = arrayList;
            a();
            return;
        }
        if (getChildCount() != 0 && (getChildAt(0) instanceof DsShimmerView)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.d);
        removeAllViews();
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context));
        } else if (iOrdinal != 1) {
            t9f.b();
            return;
        } else {
            Context context2 = getContext();
            context2.getClass();
            colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite60, context2));
        }
        colorStateListValueOf.getClass();
        for (int i = 0; i < 6; i++) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.ds_chip_shimmer, (ViewGroup) this, false);
            DsShimmerView dsShimmerView = (DsShimmerView) yum0.f(viewInflate, R.id.chipShimmer);
            if (dsShimmerView == null) {
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.chipShimmer)));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(getContext().getResources().getDimension(R.dimen.radius_14));
            gradientDrawable.setColor(colorStateListValueOf);
            dsShimmerView.setBackground(gradientDrawable);
            addView((FrameLayout) viewInflate);
        }
        requestLayout();
        x0x.s(this);
    }

    @Override // a.iyl
    public void setOnChipClickListener(Function2<? super mxl, ? super Integer, Unit> function2) {
        this.g = function2;
    }

    @Override // a.iyl
    public void setSelectionMode(uyl uylVar) {
        uylVar.getClass();
        this.e = uylVar;
    }

    @Override // a.iyl
    public void setSkeletonStyle(wyl wylVar) {
        wylVar.getClass();
        this.c = wylVar;
    }

    @Override // a.iyl
    public void setStyle(wxl wxlVar) {
        wxlVar.getClass();
        this.b = wxlVar;
    }
}
