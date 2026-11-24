package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class kva extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f18948a;
    public final List b;

    public kva() {
        Paint paint = new Paint();
        this.f18948a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // a.fhe0
    public final void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f18948a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kmy) it.next()).getClass();
            paint.setColor(k5d.b(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).V0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.e(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).q.b(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
