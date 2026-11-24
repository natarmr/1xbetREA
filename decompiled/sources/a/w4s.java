package a;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes5.dex */
public final class w4s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsHeader f38557a;
    public final RecyclerView b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4s(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f38557a = new DsHeader(new ContextThemeWrapper(context, R.style.Widget_GameCollectionHeader_Shimmer), null, 6);
        this.b = new RecyclerView(context);
        k4f k4fVar = new k4f();
        ((dp) k4fVar.e).b(new gbn(new k8e0((byte) 8), new o5c0(3, (byte) 14), new bod0((byte) 23), x4c0.q));
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new uge0());
        }
        k4fVar.f = arrayList;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_40);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        addView(this.f38557a);
        addView(this.b);
        RecyclerView recyclerView = this.b;
        recyclerView.setAdapter(k4fVar);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.m(new pmk0(dimensionPixelSize, dimensionPixelSize2, 0, 0, 16));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jmu0.f(0, 0, getMeasuredWidth(), this.c, this.f38557a, this);
        RecyclerView recyclerView = this.b;
        jmu0.f(0, this.c, recyclerView.getMeasuredWidth(), recyclerView.getMeasuredHeight() + this.c, recyclerView, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.c;
        this.f38557a.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        RecyclerView recyclerView = this.b;
        recyclerView.measure(i, iMakeMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(i), recyclerView.getMeasuredHeight() + i3);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f38557a.b(i == 0);
        this.b.setVisibility(i);
        if (i == 0) {
            x0x.s(this);
        } else {
            x0x.O(this);
        }
    }
}
