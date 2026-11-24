package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class evl extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8474a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Paint e;
    public final Path f;

    public evl(List list, int i, int i2, boolean z, int i3) {
        list.getClass();
        this.f8474a = list;
        this.b = i;
        this.c = i2;
        this.d = z;
        Paint paint = new Paint();
        this.e = paint;
        this.f = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i3);
    }

    @Override // a.fhe0
    public final void g(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        View viewD;
        canvas.getClass();
        the0Var.getClass();
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iF1 = linearLayoutManager.f1();
        int childCount = (recyclerView.getChildCount() + iF1) - 1;
        IntRange intRange = (iF1 == -1 || iF1 > childCount) ? new IntRange(0, 0, 1) : new IntRange(iF1, childCount, 1);
        yge0 adapter = recyclerView.getAdapter();
        zz3 zz3Var = adapter instanceof zz3 ? (zz3) adapter : null;
        if (zz3Var == null) {
            return;
        }
        List listZ = zz3Var.z();
        int i = intRange.f46068a;
        int i2 = intRange.b;
        if (i > i2) {
            return;
        }
        while (true) {
            listZ.getClass();
            Object objW = CollectionsKt.W(i, listZ);
            if (objW == null) {
                return;
            }
            int i3 = i + 1;
            Object objW2 = CollectionsKt.W(i3, listZ);
            if (objW2 == null) {
                objW2 = "";
            }
            Class<?> cls = objW.getClass();
            List list = this.f8474a;
            if (list.contains(cls) && list.contains(objW2.getClass()) && (viewD = linearLayoutManager.D(i)) != null) {
                Path path = this.f;
                path.reset();
                float left = viewD.getLeft();
                int i4 = this.c;
                boolean z = this.d;
                path.addRect(new RectF(left + (z ? 0.0f : i4), viewD.getBottom(), viewD.getRight() - (z ? i4 : 0.0f), viewD.getBottom() + this.b), Path.Direction.CW);
                canvas.drawPath(path, this.e);
            }
            if (i == i2) {
                return;
            } else {
                i = i3;
            }
        }
    }
}
