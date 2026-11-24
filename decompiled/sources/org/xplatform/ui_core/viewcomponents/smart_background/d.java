package org.xplatform.ui_core.viewcomponents.smart_background;

import a.bkx;
import a.l1e0;
import a.q3d;
import a.r3d;
import a.u0d;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f47204a;
    public AppCompatImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f47204a = new ArrayList();
        for (int i = 0; i < 8; i++) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            appCompatImageView.setVisibility(8);
            addView(appCompatImageView);
        }
    }

    private final List<View> getAllChildren() {
        IntRange intRangeO = l1e0.o(0, getChildCount());
        ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it = intRangeO.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((bkx) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.d((View) obj, this.b)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void a(int i) {
        List<View> allChildren = getAllChildren();
        ArrayList arrayList = new ArrayList(r3d.q(allChildren, 10));
        int i2 = 0;
        for (Object obj : allChildren) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            ((View) obj).setVisibility(i2 <= i ? 0 : 8);
            arrayList.add(Unit.f46060a);
            i2 = i3;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SmartBackgroundSmartImageView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SmartBackgroundSmartImageView$SavedState smartBackgroundSmartImageView$SavedState = (SmartBackgroundSmartImageView$SavedState) parcelable;
        this.f47204a.addAll(smartBackgroundSmartImageView$SavedState.b);
        super.onRestoreInstanceState(smartBackgroundSmartImageView$SavedState.f47200a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SmartBackgroundSmartImageView$SavedState(super.onSaveInstanceState(), this.f47204a);
    }

    public final void setBackgroundImage(int i) {
        setBackground(null);
        View view = this.b;
        if (view != null) {
            removeView(view);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        appCompatImageView.setImageResource(i);
        this.b = appCompatImageView;
        addView(appCompatImageView, 0);
    }

    public final void setContent(List<Integer> list) {
        list.getClass();
        boolean z = list.size() != getAllChildren().size();
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f47204a;
        if (Intrinsics.d(arrayList, list) || z) {
            return;
        }
        arrayList.addAll(list);
        List<View> allChildren = getAllChildren();
        Iterator<T> it = allChildren.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(r3d.q(allChildren, 10), r3d.q(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            int iIntValue = ((Number) it2.next()).intValue();
            View view = (View) next;
            AppCompatImageView appCompatImageView = view instanceof AppCompatImageView ? (AppCompatImageView) view : null;
            if (appCompatImageView == null) {
                return;
            }
            List list2 = u0d.f34849a;
            u0d.i(appCompatImageView, iIntValue);
            arrayList2.add(Unit.f46060a);
        }
    }
}
