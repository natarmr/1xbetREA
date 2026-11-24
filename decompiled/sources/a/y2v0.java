package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class y2v0 extends FrameLayout implements a5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsHeader f41923a;
    public final OptimizedScrollRecyclerView b;
    public final o4s c;
    public xdr d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2v0(Context context) {
        w0i w0iVar;
        super(context, null, 0);
        context.getClass();
        DsHeader dsHeader = new DsHeader(new ContextThemeWrapper(context, R.style.Widget_GameCollectionHeader), null, 6);
        this.f41923a = dsHeader;
        OptimizedScrollRecyclerView optimizedScrollRecyclerView = new OptimizedScrollRecyclerView(context, null, 6, 0);
        optimizedScrollRecyclerView.setTag("WebGamesCollection");
        this.b = optimizedScrollRecyclerView;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_40);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        addView(dsHeader);
        addView(optimizedScrollRecyclerView);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, dqd0.b, 0, 0);
        dsHeader.setTagLabel(ktt0.p(typedArrayObtainStyledAttributes, context, 4));
        dsHeader.setButtonLabel(ktt0.p(typedArrayObtainStyledAttributes, context, 0));
        dsHeader.setLabel(ktt0.p(typedArrayObtainStyledAttributes, context, 5));
        l0x l0xVar = new l0x(typedArrayObtainStyledAttributes.getDrawable(1));
        l0x l0xVar2 = new l0x(typedArrayObtainStyledAttributes.getDrawable(2));
        if (!l0xVar.c() && (w0iVar = dsHeader.d) != null) {
            w0iVar.a(l0xVar, l0xVar2);
        }
        typedArrayObtainStyledAttributes.recycle();
        g5s g5sVar = g5s.Rectangle;
        o4s o4sVar = new o4s(g5sVar, lmc.G(context, g5sVar, 0, R.drawable.ic_games_placeholder), this.d);
        this.c = o4sVar;
        optimizedScrollRecyclerView.setNestedScrollingEnabled(false);
        optimizedScrollRecyclerView.setClipToPadding(false);
        optimizedScrollRecyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        optimizedScrollRecyclerView.setAdapter(o4sVar);
        optimizedScrollRecyclerView.m(new pmk0(dimensionPixelSize, dimensionPixelSize2, 0, 0, 16));
    }

    @Override // a.a5s
    public RecyclerView getCollectionRecycler() {
        return this.b;
    }

    @Override // a.a5s
    public DsHeader getHeader() {
        return this.f41923a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        DsHeader dsHeader = this.f41923a;
        int measuredWidth = dsHeader.getMeasuredWidth();
        DsHeader dsHeader2 = this.f41923a;
        jmu0.f(0, 0, measuredWidth, dsHeader2.getMeasuredHeight(), dsHeader, this);
        int measuredHeight = dsHeader2.getMeasuredHeight();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = dsHeader2.getMeasuredHeight();
        OptimizedScrollRecyclerView optimizedScrollRecyclerView = this.b;
        jmu0.f(0, measuredHeight, measuredWidth2, optimizedScrollRecyclerView.getMeasuredHeight() + measuredHeight2, optimizedScrollRecyclerView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.e, 1073741824);
        DsHeader dsHeader = this.f41923a;
        dsHeader.measure(i, iMakeMeasureSpec);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        OptimizedScrollRecyclerView optimizedScrollRecyclerView = this.b;
        optimizedScrollRecyclerView.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        setMeasuredDimension(View.MeasureSpec.getSize(i), optimizedScrollRecyclerView.getMeasuredHeight() + dsHeader.getMeasuredHeight());
    }

    public final void setButtonText(CharSequence charSequence) {
        this.f41923a.setButtonLabel(charSequence);
    }

    public final void setHeaderTitle(CharSequence charSequence) {
        this.f41923a.setLabel(charSequence);
    }

    public final void setItems(List<u4s> list) {
        list.getClass();
        o4s o4sVar = this.c;
        if (o4sVar != null) {
            o4sVar.H(list, null);
        }
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        this.f41923a.setButtonClickListener(onClickListener);
    }

    public final void setOnItemClickListener(xdr xdrVar) {
        xdrVar.getClass();
        this.d = xdrVar;
        o4s o4sVar = this.c;
        if (o4sVar != null) {
            o4sVar.h = xdrVar;
        }
    }

    public final void setOnTagClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        this.f41923a.setTagClickListener(onClickListener);
    }

    public final void setTagColor(int i) {
        this.f41923a.setTagColor(Integer.valueOf(i));
    }

    public final void setTagText(CharSequence charSequence) {
        this.f41923a.setTagLabel(charSequence);
    }
}
