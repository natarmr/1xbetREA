package a;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class mcu0 extends lhe0 implements khe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TableViewImpl f21566a;
    public Function1 b = new d4u0(8);
    public final y9b c;
    public final y9b d;
    public boolean e;
    public boolean f;
    public RecyclerView g;

    public mcu0(TableViewImpl tableViewImpl) {
        this.f21566a = tableViewImpl;
        this.c = tableViewImpl.getRowHeaderRecyclerView();
        this.d = tableViewImpl.getCellRecyclerView();
    }

    @Override // a.khe0
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.f = false;
            TableViewImpl tableViewImpl = this.f21566a;
            tableViewImpl.getColumnHeaderRecyclerView().post(new apj0((Object) tableViewImpl, (byte) 11));
        } else if (i == 1 || i == 2) {
            this.f = true;
        }
    }

    @Override // a.khe0
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.f && !recyclerView.equals(this.g)) {
            return true;
        }
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.g = recyclerView;
        return false;
    }

    @Override // a.lhe0
    public final void d(RecyclerView recyclerView, int i, int i2) {
        if (this.e) {
            return;
        }
        this.e = true;
        y9b y9bVar = this.c;
        boolean zEquals = recyclerView.equals(y9bVar);
        y9b y9bVar2 = this.d;
        if (zEquals) {
            y9bVar2.scrollBy(0, i2);
        } else if (recyclerView.equals(y9bVar2)) {
            y9bVar.scrollBy(0, i2);
        }
        this.b.invoke(Integer.valueOf(i2));
        this.e = false;
    }

    @Override // a.khe0
    public final void e(boolean z) {
    }
}
