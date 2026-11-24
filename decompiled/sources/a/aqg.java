package a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class aqg extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1293a = 1;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public aqg(Resources resources) {
        resources.getClass();
        this.b = resources.getDimensionPixelOffset(R.dimen.space_4);
        this.c = resources.getDimensionPixelOffset(R.dimen.cyber_games_content_horizontal_margin);
        this.d = resources.getDimensionPixelOffset(R.dimen.cyber_games_content_horizontal_medium_margin);
        this.e = resources.getDimensionPixelOffset(R.dimen.space_8);
        this.f = resources.getDimensionPixelOffset(R.dimen.space_16);
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        byte b = this.f1293a;
        int i = this.e;
        int i2 = this.d;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = this.f;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        switch (b) {
            case 0:
                xhe0 xhe0VarW = recyclerView.W(view);
                cp cpVar = xhe0VarW instanceof cp ? (cp) xhe0VarW : null;
                yge0 adapter = recyclerView.getAdapter();
                zz3 zz3Var = adapter instanceof zz3 ? (zz3) adapter : null;
                if (cpVar != null && zz3Var != null) {
                    List listZ = zz3Var.z();
                    listZ.getClass();
                    Object objW = CollectionsKt.W(cpVar.d() - 1, listZ);
                    rect.left = i4;
                    rect.right = i4;
                    if (cpVar.u() instanceof osv) {
                        if (objW != null) {
                            i = i5;
                        }
                        rect.top = i;
                        if (!cy7.c()) {
                            rect.left = i2 - i3;
                        } else {
                            rect.right = i2 - i3;
                        }
                    }
                    break;
                }
                break;
            default:
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.getClass();
                yge0 adapter2 = recyclerView.getAdapter();
                int iD = adapter2 != null ? adapter2.d() : 0;
                int iU = RecyclerView.U(view);
                if (iU == -1) {
                    iU = RecyclerView.V(view);
                }
                if (iU != -1) {
                    int i6 = iU / i5;
                    int iCeil = (int) Math.ceil(((double) iD) / ((double) i5));
                    boolean z = recyclerView.getLayoutDirection() == 0;
                    int i7 = i3 / 2;
                    int i8 = i4 - i7;
                    recyclerView.setPadding(i8, 0, i8, 0);
                    if (i6 > 0) {
                        i2 = i7;
                    }
                    rect.top = i2;
                    if (i6 < iCeil - 1) {
                        i = i7;
                    }
                    rect.bottom = i;
                    if (z) {
                        rect.left = i7;
                    } else {
                        rect.right = i7;
                    }
                    if (!z) {
                        rect.left = i7;
                    } else {
                        rect.right = i7;
                    }
                    break;
                }
                break;
        }
    }

    public aqg(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }
}
