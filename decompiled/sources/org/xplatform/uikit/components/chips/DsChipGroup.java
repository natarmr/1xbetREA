package org.xplatform.uikit.components.chips;

import a.abc;
import a.bqd0;
import a.dwl;
import a.f58;
import a.i3l;
import a.ihu0;
import a.jmu0;
import a.ktt0;
import a.m5d;
import a.pgi0;
import a.ske;
import a.t9f;
import a.vac;
import a.wg;
import a.x0x;
import a.xjl;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class DsChipGroup extends abc {
    public static final /* synthetic */ int r = 0;
    public final boolean k;
    public final dwl l;
    public final int m;
    public final int n;
    public Function1 o;
    public final ArrayList p;
    public final i3l q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        dwl dwlVar = dwl.f6805a;
        this.l = dwlVar;
        this.p = new ArrayList();
        this.q = new i3l(this, (byte) 3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.w, 0, 0);
        jmu0.j(this, ktt0.m(3, context, typedArrayObtainStyledAttributes));
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, bqd0.J, 0, 0);
        this.k = typedArrayObtainStyledAttributes2.getBoolean(0, this.k);
        this.l = typedArrayObtainStyledAttributes2.getInt(3, 0) != 0 ? dwl.b : dwlVar;
        this.m = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(2, 0);
        this.n = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        setTag("DSChipGroup");
    }

    public static final void a(DsChipGroup dsChipGroup, DsChip dsChip, View view) {
        int iM;
        DsChip dsChip2;
        if (dsChipGroup.h.b && dsChip.isSelected() && dsChipGroup.getSelectedChips().size() == 1) {
            return;
        }
        dsChip.setSelected(!dsChip.isSelected());
        if (!dsChipGroup.k || (iM = pgi0.m(dsChipGroup.getItems(), view)) == -1) {
            return;
        }
        ViewParent parent = dsChipGroup.getParent();
        HorizontalScrollView horizontalScrollView = parent instanceof HorizontalScrollView ? (HorizontalScrollView) parent : null;
        if (horizontalScrollView == null || (dsChip2 = (DsChip) CollectionsKt.W(iM, pgi0.t(dsChipGroup.getItems()))) == null) {
            return;
        }
        int left = dsChip2.getLeft();
        int width = horizontalScrollView.getWidth() / 2;
        horizontalScrollView.post(new f58((Object) horizontalScrollView, left < width ? 0 : (left - width) + (dsChip2.getWidth() / 2), (Object) dsChip2, (byte) 6));
    }

    private final Sequence<DsChip> getItems() {
        return pgi0.h(new ihu0(this), ske.v);
    }

    public final List<DsChip> getSelectedChips() {
        return pgi0.t(pgi0.h(getItems(), new xjl((byte) 11)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        view.getClass();
        super.onViewAdded(view);
        DsChip dsChip = view instanceof DsChip ? (DsChip) view : null;
        if (dsChip != null) {
            dsChip.setOnSelectInternalListener(this.q);
            dsChip.setOnClickListener(new wg((Object) this, (Object) dsChip, (byte) 15));
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        DsChip dsChip = view instanceof DsChip ? (DsChip) view : null;
        if (dsChip != null) {
            dsChip.setOnSelectInternalListener(null);
        }
        super.onViewRemoved(view);
    }

    public final void setLoading(boolean z) {
        ColorStateList colorStateListValueOf;
        ArrayList arrayList = this.p;
        int i = 0;
        if (!z) {
            if (getChildCount() > 0 && (getChildAt(0) instanceof DsShimmerView)) {
                removeAllViews();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    addView((DsChip) it.next());
                }
            }
            x0x.O(this);
            return;
        }
        if (getChildCount() == 0 || !(getChildAt(0) instanceof DsShimmerView)) {
            arrayList.clear();
            arrayList.addAll(pgi0.t(getItems()));
            removeAllViews();
            int iOrdinal = this.l.ordinal();
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
            while (i < 6) {
                Context context3 = getContext();
                context3.getClass();
                View dsShimmerView = new DsShimmerView(context3, null, 6);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(dsShimmerView.getContext().getResources().getDimension(R.dimen.radius_14));
                gradientDrawable.setColor(colorStateListValueOf);
                dsShimmerView.setBackground(gradientDrawable);
                vac vacVar = new vac(dsShimmerView.getResources().getDimensionPixelSize(R.dimen.size_64), dsShimmerView.getResources().getDimensionPixelSize(R.dimen.size_32));
                if (i == 0) {
                    vacVar.setMarginStart(this.m);
                }
                vacVar.setMarginEnd(i != 5 ? dsShimmerView.getResources().getDimensionPixelSize(R.dimen.size_8) : this.n);
                dsShimmerView.setLayoutParams(vacVar);
                addView(dsShimmerView);
                i++;
            }
            x0x.s(this);
        }
    }

    public final void setOnSelectChangeListener(Function1<? super List<DsChip>, Unit> function1) {
        this.o = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsChipGroup(Context context) {
        this(context, null);
        context.getClass();
    }
}
