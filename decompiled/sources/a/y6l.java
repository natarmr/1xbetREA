package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class y6l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42103a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final ImageView n;
    public final ArrayList o;
    public final ImageView p;
    public final ArrayList q;
    public final View r;
    public final View s;
    public final ArrayList t;
    public final ArrayList u;

    public y6l(Context context) {
        super(context, null);
        boolean z = context.getResources().getBoolean(R.bool.isTablet);
        this.f42103a = z;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = dimensionPixelSize;
        this.d = context.getResources().getDimensionPixelSize(R.dimen.space_16);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.space_24);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.size_24);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.size_32);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.size_42);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.size_56);
        int heroViewWidth = getHeroViewWidth();
        this.j = heroViewWidth;
        this.k = getHeroViewHeight();
        this.l = heroViewWidth * 5;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.icon_size_24);
        this.m = dimensionPixelSize2;
        ArrayList arrayListB = b();
        this.o = arrayListB;
        this.q = b();
        View view = new View(context);
        this.r = view;
        View view2 = new View(context);
        this.s = view2;
        this.t = new ArrayList();
        this.u = new ArrayList();
        if (z) {
            addView(view);
            addView(view2);
        } else {
            setBackgroundResource(R.drawable.dota_selected_heroes_bg);
        }
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        imageView.setLayoutParams(layoutParams);
        this.n = imageView;
        imageView.setTag("firstTeamLogoView");
        addView(imageView);
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            addView((w6l) it.next());
        }
        ImageView imageView2 = new ImageView(getContext());
        int i = this.m;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        int i2 = this.c;
        layoutParams2.setMarginStart(i2);
        layoutParams2.setMarginEnd(i2);
        imageView2.setLayoutParams(layoutParams2);
        this.p = imageView2;
        imageView2.setTag("secondTeamLogoView");
        addView(imageView2);
        Iterator it2 = this.q.iterator();
        while (it2.hasNext()) {
            addView((w6l) it2.next());
        }
    }

    public static void a(y4l y4lVar, ImageView imageView, ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        Throwable th;
        List list = u0d.f34849a;
        u0d.n(imageView, y4lVar.b, R.drawable.icon_globe_empty, 3);
        int size = arrayList2.size();
        ArrayList arrayList3 = y4lVar.c;
        Throwable th2 = null;
        int i = 0;
        if (size < 5) {
            for (Object obj : arrayList3) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                u6l u6lVar = (u6l) obj;
                arrayList2.add(u6lVar);
                w6l w6lVar = (w6l) arrayList.get(i);
                w6lVar.setHeroImage(u6lVar.b);
                w6lVar.b(u6lVar.d, u6lVar.f);
                if (u6lVar.c) {
                    w6lVar.setHeroAegisState(u6lVar.e);
                }
                i = i2;
            }
            return;
        }
        for (Object obj2 : arrayList3) {
            int i3 = i + 1;
            if (i < 0) {
                Throwable th3 = th2;
                q3d.p();
                throw th3;
            }
            u6l u6lVar2 = (u6l) obj2;
            u6l u6lVar3 = (u6l) arrayList2.get(i);
            String str = u6lVar2.b;
            long j = u6lVar2.e;
            long j2 = u6lVar2.f;
            boolean z = u6lVar2.c;
            boolean z2 = u6lVar2.d;
            if (str.equals(u6lVar3.b) && z2 == u6lVar3.d && z == u6lVar3.c) {
                th = th2;
                int i4 = i;
                if (j2 != u6lVar3.f || j != u6lVar3.e) {
                    i = i4;
                }
                th2 = th;
                i = i3;
            } else {
                th = th2;
            }
            w6l w6lVar2 = (w6l) arrayList.get(i);
            w6lVar2.setHeroImage(u6lVar2.b);
            w6lVar2.b(z2, j2);
            if (z) {
                w6lVar2.setHeroAegisState(j);
            }
            arrayList2.set(i, u6lVar2);
            th2 = th;
            i = i3;
        }
    }

    public static void c(View view, y6l y6lVar, int i, int i2, int i3, int i4) {
        if (view.getLayoutDirection() == 0) {
            view.layout(i, i2, i3, i4);
        } else {
            view.layout(y6lVar.getMeasuredWidth() - i3, i2, y6lVar.getMeasuredWidth() - i, i4);
        }
    }

    private final int getHeightView() {
        int i = this.c;
        boolean z = this.f42103a;
        int i2 = this.k;
        if (z) {
            return (i * 2) + i2;
        }
        int i3 = i * 2;
        return (this.b * 2) + i3 + (i2 * 2);
    }

    private final int getHeroViewHeight() {
        return this.f42103a ? this.f : this.g;
    }

    private final int getHeroViewWidth() {
        return this.f42103a ? this.h : this.i;
    }

    public final ArrayList b() {
        IntRange intRangeO = l1e0.o(0, 5);
        ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it = intRangeO.iterator();
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            Context context = getContext();
            context.getClass();
            w6l w6lVar = new w6l(context);
            w6lVar.setLayoutParams(new FrameLayout.LayoutParams(this.j, this.k));
            w6lVar.setHeroImage("");
            arrayList.add(w6lVar);
        }
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        y6l y6lVar = this;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = y6lVar.f42103a;
        ArrayList arrayList = y6lVar.q;
        int i5 = 0;
        ArrayList arrayList2 = y6lVar.o;
        ImageView imageView = y6lVar.p;
        ImageView imageView2 = y6lVar.n;
        int i6 = y6lVar.d;
        int i7 = y6lVar.k;
        int i8 = y6lVar.l;
        int i9 = y6lVar.m;
        int i10 = y6lVar.b;
        int i11 = y6lVar.e;
        int i12 = y6lVar.j;
        if (!z2) {
            int measuredWidth = (((y6lVar.getMeasuredWidth() - i11) - i9) - i8) / 4;
            int i13 = y6lVar.c;
            int i14 = i10 + i13;
            int height = imageView2.getHeight() + i14;
            int i15 = y6lVar.c;
            int i16 = height + i15;
            c(imageView2, y6lVar, i15, i14, i15 + i9, i14 + i9);
            int width = imageView.getWidth();
            int i17 = y6lVar.c;
            c(imageView, y6lVar, i17, i16, width + i17, i16 + i16);
            int i18 = 0;
            for (Object obj : arrayList2) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    q3d.p();
                    throw null;
                }
                w6l w6lVar = (w6l) obj;
                int i20 = i18 > 0 ? ((i12 + measuredWidth) * i18) + i9 + i6 : i9 + i6;
                int i21 = y6lVar.c;
                c(w6lVar, y6lVar, i20, i21, i20 + i12, i21 + i7);
                y6lVar = this;
                i18 = i19;
            }
            for (Object obj2 : arrayList) {
                int i22 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                w6l w6lVar2 = (w6l) obj2;
                int i23 = i5 > 0 ? ((i12 + measuredWidth) * i5) + i9 + i6 : i9 + i6;
                int i24 = i13 + i7 + i13;
                c(w6lVar2, this, i23, i24, i23 + i12, i24 + i7);
                i5 = i22;
            }
            return;
        }
        int measuredWidth2 = (((((y6lVar.getMeasuredWidth() / 2) - i11) - i10) - i9) - i8) / 4;
        int measuredWidth3 = (y6lVar.getMeasuredWidth() / 2) - i10;
        int i25 = y6lVar.c;
        int i26 = (measuredWidth3 - i25) - i9;
        int measuredWidth4 = (y6lVar.getMeasuredWidth() / 2) + i10 + i25;
        int width2 = (y6lVar.getWidth() / 2) - i10;
        int i27 = i7 + i6;
        View view = y6lVar.r;
        c(view, y6lVar, 0, 0, width2, i27);
        view.setBackgroundResource(R.drawable.dota_selected_heroes_bg);
        int width3 = (y6lVar.getWidth() / 2) + i25;
        int width4 = y6lVar.getWidth();
        View view2 = y6lVar.s;
        c(view2, y6lVar, width3, 0, width4, i27);
        view2.setBackgroundResource(R.drawable.dota_selected_heroes_bg);
        int i28 = y6lVar.c;
        int i29 = i9 + i28;
        c(imageView2, y6lVar, i26, i28, i9 + i26, i29);
        int i30 = i9 + measuredWidth4;
        y6l y6lVar2 = this;
        c(imageView, y6lVar2, measuredWidth4, i28, i30, i29);
        int i31 = 0;
        for (Object obj3 : arrayList2) {
            int i32 = i31 + 1;
            if (i31 < 0) {
                q3d.p();
                throw null;
            }
            w6l w6lVar3 = (w6l) obj3;
            int i33 = y6lVar2.c;
            int i34 = i31 > 0 ? ((i26 - i33) - i12) - ((i12 + measuredWidth2) * i31) : (i26 - i33) - i12;
            c(w6lVar3, y6lVar2, i34, i33, i34 + i12, i33 + i7);
            y6lVar2 = this;
            i31 = i32;
        }
        for (Object obj4 : arrayList) {
            int i35 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            w6l w6lVar4 = (w6l) obj4;
            int i36 = i5 > 0 ? ((i12 + measuredWidth2) * i5) + i30 + i25 : i30 + i25;
            c(w6lVar4, this, i36, i25, i36 + i12, i25 + i7);
            i5 = i35;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2) + getHeightView());
    }

    public final void setFirstTeam(y4l y4lVar) {
        y4lVar.getClass();
        a(y4lVar, this.n, this.o, this.t);
    }

    public final void setSecondTeam(y4l y4lVar) {
        y4lVar.getClass();
        a(y4lVar, this.p, this.q, this.u);
    }
}
