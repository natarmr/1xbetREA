package a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes5.dex */
public final class kq8 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18708a;
    public int b;

    public kq8(Context context) {
        this.f18708a = (byte) 2;
        context.getClass();
        this.b = context.getResources().getDimensionPixelSize(R.dimen.space_2);
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        yge0 adapter;
        byte b = this.f18708a;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        switch (b) {
            case 0:
                yge0 adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    if (RecyclerView.U(view) != adapter2.d() - 1) {
                        rect.bottom = 0;
                    } else {
                        rect.bottom = this.b;
                    }
                }
                break;
            case 1:
                xhe0 xhe0VarW = recyclerView.W(view);
                cp cpVar = xhe0VarW instanceof cp ? (cp) xhe0VarW : null;
                if (cpVar != null && (recyclerView.getAdapter() instanceof zz3)) {
                    if (cpVar.u() instanceof nsv) {
                        rect.top = this.b;
                    }
                    int iU = RecyclerView.U(view);
                    yge0 adapter3 = recyclerView.getAdapter();
                    adapter3.getClass();
                    List list = ((cyv) adapter3).e.f;
                    list.getClass();
                    boolean z = CollectionsKt.W(iU - 1, list) instanceof nsv;
                    yge0 adapter4 = recyclerView.getAdapter();
                    adapter4.getClass();
                    List list2 = ((cyv) adapter4).e.f;
                    list2.getClass();
                    int i = iU + 1;
                    boolean z2 = (CollectionsKt.W(i, list2) instanceof nsv) || ((adapter = recyclerView.getAdapter()) != null && i == adapter.d());
                    View root = cpVar.u.getRoot();
                    DsSettingsCell dsSettingsCell = root instanceof DsSettingsCell ? (DsSettingsCell) root : null;
                    if (dsSettingsCell != null) {
                        if (z && z2) {
                            dsSettingsCell.setFirst(true);
                            dsSettingsCell.setLast(true);
                        } else if (z) {
                            dsSettingsCell.setFirst(true);
                            dsSettingsCell.setLast(false);
                        } else if (!z2) {
                            dsSettingsCell.setFirst(false);
                            dsSettingsCell.setLast(false);
                        } else {
                            dsSettingsCell.setFirst(false);
                            dsSettingsCell.setLast(true);
                        }
                        break;
                    }
                }
                break;
            case 2:
                int i2 = this.b;
                rect.left = i2;
                rect.top = i2;
                rect.right = i2;
                rect.bottom = i2;
                break;
            case 3:
                Context context = view.getContext();
                context.getClass();
                int dimensionPixelSize = this.b;
                if (dimensionPixelSize == -1) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_4);
                    this.b = dimensionPixelSize;
                }
                rect.left = dimensionPixelSize;
                rect.right = dimensionPixelSize;
                rect.bottom = dimensionPixelSize;
                RecyclerView.V(view);
                rect.top = dimensionPixelSize;
                break;
            default:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = this.b;
                rect.top = 0;
                break;
        }
    }

    public /* synthetic */ kq8(int i, byte b) {
        this.f18708a = b;
        this.b = i;
    }

    public /* synthetic */ kq8() {
        this.f18708a = (byte) 3;
    }
}
