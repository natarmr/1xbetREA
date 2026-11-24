package a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class i2m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f14056a;
    public final /* synthetic */ int b;
    public final /* synthetic */ j2m0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public i2m0(View view, int i, j2m0 j2m0Var, int i2, int i3, int i4) {
        this.f14056a = view;
        this.b = i;
        this.c = j2m0Var;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayoutManager linearLayoutManager;
        j2m0 j2m0Var = this.c;
        int i = this.b;
        if (i > 0) {
            iab iabVar = j2m0Var.f15787a;
            if (iabVar == null) {
                Intrinsics.h("binding");
                throw null;
            }
            LinearLayoutManager rowHeaderLayoutManager = ((TableViewImpl) iabVar.g).getRowHeaderLayoutManager();
            int i2 = this.d;
            rowHeaderLayoutManager.w1(i, i2);
            iab iabVar2 = j2m0Var.f15787a;
            if (iabVar2 == null) {
                Intrinsics.h("binding");
                throw null;
            }
            ((TableViewImpl) iabVar2.g).getCellLayoutManager().w1(i, i2);
        }
        int i3 = this.e;
        if (i3 > 0 && (linearLayoutManager = j2m0Var.f) != null) {
            linearLayoutManager.w1(i3, this.f);
        }
        j2m0Var.f();
    }
}
