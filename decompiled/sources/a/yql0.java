package a;

import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final class yql0 extends FrameLayout implements wql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xdr f43082a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final FrameLayout.LayoutParams j;
    public final DsHeader k;
    public final nql0 l;
    public final ImageView m;
    public final DsShimmerView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yql0(ContextThemeWrapper contextThemeWrapper, String str, String str2, int i) {
        super(contextThemeWrapper, null, 0);
        str.getClass();
        str2.getClass();
        this.b = getResources().getDimensionPixelSize(R.dimen.extra_large_horizontal_margin_dynamic);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_10);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.g = getResources().getDimensionPixelSize(R.dimen.extra_large_horizontal_margin_dynamic);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.i = getResources().getDimensionPixelSize(R.dimen.size_24);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = dimensionPixelSize;
        this.j = layoutParams;
        DsHeader dsHeader = new DsHeader(contextThemeWrapper, null, 6);
        this.k = dsHeader;
        nql0 nql0Var = new nql0(contextThemeWrapper);
        this.l = nql0Var;
        ImageView imageView = new ImageView(contextThemeWrapper);
        this.m = imageView;
        DsShimmerView dsShimmerView = new DsShimmerView(contextThemeWrapper, null, 6);
        this.n = dsShimmerView;
        u5l0 u5l0Var = new u5l0((Object) this, (Object) contextThemeWrapper, (byte) 10);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, cqd0.h, 0, 0);
        u5l0Var.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        addView(dsHeader);
        addView(nql0Var);
        addView(imageView);
        addView(dsShimmerView);
        dsHeader.setModel(new nrv(str, false, null, str2, null, null, null, 246));
        if (i != 0) {
            imageView.setImageResource(i);
        }
    }

    @Override // a.wql0
    public final void a() {
        this.n.setVisibility(8);
        this.k.setVisibility(0);
        this.m.setVisibility(0);
        this.l.setVisibility(0);
    }

    @Override // a.wql0
    public final void b(List list, Runnable runnable) {
        list.getClass();
        nql0 nql0Var = this.l;
        nql0Var.getClass();
        nql0Var.o2.H(list, runnable);
        a();
    }

    @Override // a.wql0
    public final void d() {
        this.n.setVisibility(0);
        this.k.setVisibility(8);
        this.m.setVisibility(8);
        this.l.setVisibility(8);
    }

    @Override // a.wql0
    public final void e(int i) {
        this.l.e(i);
    }

    @Override // a.wql0
    public RecyclerView getRecyclerView() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        x0x.O(this);
        super.onDetachedFromWindow();
    }

    @Override // a.wql0
    public void setSportCollectionClickListener(xdr xdrVar) {
        xdrVar.getClass();
        this.l.setSportCollectionActionType(xdrVar);
        this.f43082a = xdrVar;
    }

    @Override // a.wql0
    public void setStyle(int i) {
        this.l.setViewStyle(i);
    }
}
