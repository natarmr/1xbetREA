package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class x2v0 extends FrameLayout implements a5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OptimizedScrollRecyclerView f40189a;
    public final o4s b;
    public xdr c;
    public final int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2v0(Context context) {
        super(context, null, 0);
        context.getClass();
        OptimizedScrollRecyclerView optimizedScrollRecyclerView = new OptimizedScrollRecyclerView(context, null, 6, 0);
        optimizedScrollRecyclerView.setTag("WebGamesCollection");
        this.f40189a = optimizedScrollRecyclerView;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.e = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        addView(optimizedScrollRecyclerView);
        g5s g5sVar = g5s.Circle;
        o4s o4sVar = new o4s(g5sVar, lmc.G(context, g5sVar, 0, R.drawable.ic_games_square), this.c);
        this.b = o4sVar;
        optimizedScrollRecyclerView.setBackground(epv0.U(R.drawable.rounded_background_16_content, context));
        jmu0.i(optimizedScrollRecyclerView, optimizedScrollRecyclerView.getResources().getDimensionPixelSize(R.dimen.space_16));
        optimizedScrollRecyclerView.setNestedScrollingEnabled(false);
        optimizedScrollRecyclerView.setClipToPadding(false);
        optimizedScrollRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        optimizedScrollRecyclerView.setAdapter(o4sVar);
        optimizedScrollRecyclerView.m(new pmk0(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, 0, 16));
    }

    @Override // a.a5s
    public RecyclerView getCollectionRecycler() {
        return this.f40189a;
    }

    @Override // a.a5s
    public DsHeader getHeader() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth() - this.e;
        int i5 = this.d;
        OptimizedScrollRecyclerView optimizedScrollRecyclerView = this.f40189a;
        jmu0.f(this.e, this.d, measuredWidth, optimizedScrollRecyclerView.getMeasuredHeight() + i5, optimizedScrollRecyclerView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        OptimizedScrollRecyclerView optimizedScrollRecyclerView = this.f40189a;
        optimizedScrollRecyclerView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), optimizedScrollRecyclerView.getMeasuredHeight() + this.d);
    }

    public final void setItems(List<u4s> list) {
        list.getClass();
        o4s o4sVar = this.b;
        if (o4sVar != null) {
            o4sVar.H(list, null);
        }
    }

    public final void setOnItemClickListener(xdr xdrVar) {
        o4s o4sVar = this.b;
        if (o4sVar != null) {
            o4sVar.h = xdrVar;
        }
        this.c = xdrVar;
    }
}
