package a;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class nql0 extends OptimizedScrollRecyclerView implements wql0 {
    public final sql0 o2;
    public pmk0 p2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nql0(Context context) {
        super(context, null, 0);
        context.getClass();
        sql0 sql0Var = new sql0(sql0.h);
        this.o2 = sql0Var;
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(sql0Var);
        setTag("sportsCollectionSimple");
        pmk0 pmk0Var = new pmk0(getResources().getDimensionPixelSize(R.dimen.space_4), getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic), 0, 0, 20);
        m(pmk0Var);
        this.p2 = pmk0Var;
    }

    @Override // a.wql0
    public final void a() {
        setVisibility(0);
    }

    @Override // a.wql0
    public final void b(List list, Runnable runnable) {
        list.getClass();
        this.o2.H(list, runnable);
    }

    @Override // a.wql0
    public final void d() {
        setVisibility(8);
    }

    @Override // a.wql0
    public final void e(int i) {
        pmk0 pmk0Var = new pmk0(i, getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic), 0, 0, 20);
        fhe0 fhe0Var = this.p2;
        if (fhe0Var != null) {
            s0(fhe0Var);
        }
        this.p2 = pmk0Var;
        m(pmk0Var);
    }

    public final void setSportCollectionActionType(xdr xdrVar) {
        xdrVar.getClass();
        this.o2.f = xdrVar;
    }

    @Override // a.wql0
    public void setSportCollectionClickListener(xdr xdrVar) {
        xdrVar.getClass();
        this.o2.f = xdrVar;
    }

    @Override // a.wql0
    public void setStyle(int i) {
        this.o2.g = i;
    }

    public final void setViewStyle(int i) {
        this.o2.g = i;
    }

    @Override // a.wql0
    public RecyclerView getRecyclerView() {
        return this;
    }
}
