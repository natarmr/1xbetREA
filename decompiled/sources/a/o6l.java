package a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o6l extends HorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24741a;
    public final int b;
    public final int c;
    public final FrameLayout d;
    public final LinkedHashMap e;
    public List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6l(Context context) {
        Resources resources;
        int i;
        super(context, null, 0);
        context.getClass();
        if (context.getResources().getBoolean(R.bool.isTablet)) {
            resources = getResources();
            i = R.dimen.size_62;
        } else {
            resources = getResources();
            i = R.dimen.size_44;
        }
        this.f24741a = resources.getDimensionPixelSize(i);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.c = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        this.e = new LinkedHashMap();
        this.f = iun.f15405a;
        setClipToPadding(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredWidth = getMeasuredWidth();
        FrameLayout frameLayout = this.d;
        if (measuredWidth < i5) {
            setMeasuredDimension(i5, getMeasuredHeight());
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        frameLayout.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int measuredWidth2 = 0;
        for (o4l o4lVar : this.e.values()) {
            if (o4lVar.getVisibility() == 0) {
                cww.z(measuredWidth2, 0, o4lVar.getMeasuredWidth() + measuredWidth2, o4lVar.getMeasuredHeight(), o4lVar, frameLayout);
                measuredWidth2 = o4lVar.getMeasuredWidth() + this.b + measuredWidth2;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Integer num;
        LinkedHashMap linkedHashMap = this.e;
        if (linkedHashMap.isEmpty()) {
            super.onMeasure(i, i2);
            return;
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((o4l) it.next()).measure(i, i2);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((o4l) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        int measuredWidth = 0;
        while (it2.hasNext()) {
            measuredWidth += ((o4l) it2.next()).getMeasuredWidth();
        }
        int size = arrayList.size() - 1;
        if (size < 0) {
            size = 0;
        }
        int i3 = this.b;
        int i4 = (size * i3) + measuredWidth;
        if (!linkedHashMap.isEmpty()) {
            setMinimumWidth((i3 * 3) + (this.f24741a * 4));
        }
        int iMax = Math.max(i4, getMinimumWidth()) + this.c;
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Integer numValueOf = Integer.valueOf(((o4l) it3.next()).getMeasuredHeight());
            while (it3.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((o4l) it3.next()).getMeasuredHeight());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824));
        setMeasuredDimension(iMax, iIntValue);
    }

    public final void setSkills(List<n4l> list) {
        list.getClass();
        Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.e;
            if (!zHasNext) {
                int size = list.size();
                int i2 = 0;
                for (Object obj : linkedHashMap.values()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    ((o4l) obj).setVisibility(i2 < size ? 0 : 8);
                    i2 = i3;
                }
                if (this.f.isEmpty()) {
                    tl60.a(this, new mx2(this, this, (byte) 7));
                }
                this.f = list;
                return;
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            n4l n4lVar = (n4l) next;
            Integer numValueOf = Integer.valueOf(i);
            Object obj2 = linkedHashMap.get(numValueOf);
            Object obj3 = obj2;
            if (obj2 == null) {
                Context context = getContext();
                context.getClass();
                o4l o4lVar = new o4l(context);
                this.d.addView(o4lVar);
                linkedHashMap.put(numValueOf, o4lVar);
                obj3 = o4lVar;
            }
            o4l o4lVar2 = (o4l) obj3;
            String str = n4lVar.f22903a;
            int i5 = n4lVar.b;
            int i6 = n4lVar.c;
            ImageView imageView = o4lVar2.k;
            if (!Intrinsics.d(o4lVar2.n, str)) {
                List list2 = u0d.f34849a;
                u0d.j(imageView, str, R.drawable.cybergame_dota_square_bg, 0, kotlin.collections.a.c(new j2x(o4lVar2.e)), null, null, 492);
            }
            o4lVar2.n = str;
            if (i6 == 0) {
                hxm0.B(imageView);
            } else {
                imageView.clearColorFilter();
            }
            o4lVar2.j = i5;
            m4l m4lVar = o4lVar2.l;
            boolean z = (i5 == m4lVar.f && i6 == m4lVar.g) ? false : true;
            if (i5 > 10) {
                i5 = 10;
            }
            m4lVar.f = i5;
            m4lVar.g = i6;
            if (z) {
                m4lVar.invalidate();
            }
            o4lVar2.requestLayout();
            i = i4;
        }
    }
}
