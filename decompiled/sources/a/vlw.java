package a;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class vlw extends lhe0 implements khe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TableViewImpl f37649a;
    public final y9b b;
    public final androidx.recyclerview.widget.b c;
    public RecyclerView d;
    public int e;
    public boolean f;
    public int g;
    public xdr h = new thd((byte) 25);
    public RecyclerView i;

    public vlw(TableViewImpl tableViewImpl) {
        this.f37649a = tableViewImpl;
        this.b = tableViewImpl.getColumnHeaderRecyclerView();
        this.c = tableViewImpl.getCellRecyclerView().getLayoutManager();
        tableViewImpl.getVerticalRecyclerViewListener();
    }

    @Override // a.khe0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0) {
            f(recyclerView);
            g(recyclerView);
            this.f = false;
        }
        if (i == 1) {
            this.f = true;
        }
    }

    @Override // a.khe0
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i;
        RecyclerView recyclerView2;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            RecyclerView recyclerView3 = this.i;
            if (recyclerView3 != null && !recyclerView3.equals(recyclerView) && (recyclerView2 = this.i) != null && recyclerView2.getScrollState() != 0) {
                recyclerView2.G0();
                g(recyclerView2);
            }
            this.i = recyclerView;
            RecyclerView recyclerView4 = this.d;
            if (recyclerView4 != null && !recyclerView.equals(recyclerView4)) {
                RecyclerView recyclerView5 = this.d;
                if (recyclerView5 == null || recyclerView5.getScrollState() != 0) {
                    y9b y9bVar = this.b;
                    if (Intrinsics.d(recyclerView5, y9bVar)) {
                        g(y9bVar);
                        y9bVar.G0();
                    } else {
                        RecyclerView recyclerView6 = this.d;
                        androidx.recyclerview.widget.b bVar = this.c;
                        if (recyclerView6 != null) {
                            int I = bVar != null ? bVar.I() : 0;
                            i = 0;
                            while (true) {
                                if (i >= I) {
                                    i = -1;
                                    break;
                                }
                                if (Intrinsics.d(bVar != null ? bVar.H(i) : null, recyclerView6)) {
                                    break;
                                }
                                i++;
                            }
                        } else {
                            i = 0;
                        }
                        if (i >= 0) {
                            if (i < (bVar != null ? bVar.I() : 0)) {
                                View viewH = bVar != null ? bVar.H(i) : null;
                                RecyclerView recyclerView7 = viewH instanceof RecyclerView ? (RecyclerView) viewH : null;
                                if (recyclerView7 != null) {
                                    g(recyclerView7);
                                    recyclerView7.G0();
                                }
                            }
                        }
                    }
                } else {
                    g(recyclerView5);
                }
            }
            boolean z = recyclerView instanceof y9b;
            y9b y9bVar2 = z ? (y9b) recyclerView : null;
            this.e = y9bVar2 != null ? y9bVar2.getScrolledX() : 0;
            this.f = false;
            y9b y9bVar3 = z ? (y9b) recyclerView : null;
            if (y9bVar3 == null) {
                recyclerView.o(this);
                return false;
            }
            if (y9bVar3.o2) {
                ((y9b) recyclerView).o(this);
            }
        } else {
            if (action == 1) {
                y9b y9bVar4 = recyclerView instanceof y9b ? (y9b) recyclerView : null;
                Integer numValueOf = y9bVar4 != null ? Integer.valueOf(y9bVar4.getScrolledX()) : null;
                int i2 = this.e;
                if (numValueOf != null && i2 == numValueOf.intValue() && !this.f) {
                    g(recyclerView);
                }
                this.d = recyclerView;
                this.i = null;
                return false;
            }
            if (action == 2) {
                this.i = recyclerView;
                this.f = true;
                return false;
            }
            if (action == 3) {
                f(recyclerView);
                g(recyclerView);
                this.f = false;
                this.d = recyclerView;
                this.i = null;
                return false;
            }
        }
        return false;
    }

    @Override // a.lhe0
    public final void d(RecyclerView recyclerView, int i, int i2) {
        boolean zEquals = recyclerView.equals(this.b);
        androidx.recyclerview.widget.b bVar = this.c;
        if (zEquals) {
            int I = bVar != null ? bVar.I() : 0;
            for (int i3 = 0; i3 < I; i3++) {
                View viewH = bVar != null ? bVar.H(i3) : null;
                y9b y9bVar = viewH instanceof y9b ? (y9b) viewH : null;
                if (y9bVar != null) {
                    y9bVar.scrollBy(i, 0);
                }
            }
        } else {
            int I2 = bVar != null ? bVar.I() : 0;
            for (int i4 = 0; i4 < I2; i4++) {
                View viewH2 = bVar != null ? bVar.H(i4) : null;
                y9b y9bVar2 = viewH2 instanceof y9b ? (y9b) viewH2 : null;
                if (!Intrinsics.d(y9bVar2, recyclerView) && y9bVar2 != null) {
                    y9bVar2.scrollBy(i, 0);
                }
            }
        }
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        boolean z = linearLayoutManager != null && linearLayoutManager.g1() == (linearLayoutManager != null ? linearLayoutManager.S() : 0) - 1;
        boolean z2 = !((linearLayoutManager != null && linearLayoutManager.c1() == 0) || !recyclerView.canScrollHorizontally(-1));
        boolean z3 = !z;
        this.f37649a.b(z2, z3);
        this.h.F(Integer.valueOf(i), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    public final void f(RecyclerView recyclerView) {
        View viewD;
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iC1 = linearLayoutManager != null ? linearLayoutManager.c1() : -1;
        this.g = iC1;
        if (iC1 == -1) {
            int iF1 = linearLayoutManager != null ? linearLayoutManager.f1() : 0;
            this.g = iF1;
            if (linearLayoutManager == null || iF1 != linearLayoutManager.h1()) {
                this.g++;
            }
        }
        if (linearLayoutManager == null || (viewD = linearLayoutManager.D(this.g)) == null) {
            return;
        }
        viewD.getLeft();
    }

    public final void g(RecyclerView recyclerView) {
        y9b y9bVar = recyclerView instanceof y9b ? (y9b) recyclerView : null;
        if (y9bVar == null) {
            recyclerView.u0(this);
        } else {
            if (y9bVar.o2) {
                return;
            }
            ((y9b) recyclerView).u0(this);
        }
    }

    @Override // a.khe0
    public final void e(boolean z) {
    }
}
