package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class dvl extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6748a = 0;
    public final Paint b;
    public final Path c;
    public final float d;
    public final float e;
    public final float[] f;
    public final m9b g;

    public dvl(j9b j9bVar) {
        this.g = j9bVar;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        this.d = j9bVar.c;
        this.e = j9bVar.d;
        float f = j9bVar.i;
        this.f = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f};
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(j9bVar.g);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v20 java.lang.Object, still in use, count: 2, list:
          (r11v20 java.lang.Object) from 0x01df: PHI (r11 I:??) = (r11v17 java.lang.Object), (r11v20 java.lang.Object) binds: [B:111:0x01de, B:138:0x01df] A[DONT_GENERATE, DONT_INLINE]
          (r11v20 java.lang.Object) from 0x01d7: CHECK_CAST (android.view.View) (r11v20 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.fhe0
    public final void f(android.graphics.Rect r9, android.view.View r10, androidx.recyclerview.widget.RecyclerView r11, a.the0 r12) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dvl.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, a.the0):void");
    }

    /* JADX WARN: Code duplicated, block: B:94:0x017c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0185  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v12 java.lang.Object, still in use, count: 2, list:
          (r6v12 java.lang.Object) from 0x0178: PHI (r6 I:??) = (r6v8 java.lang.Object), (r6v12 java.lang.Object) binds: [B:91:0x0177, B:164:0x0178] A[DONT_GENERATE, DONT_INLINE]
          (r6v12 java.lang.Object) from 0x0168: CHECK_CAST (kotlin.Pair) (r6v12 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.fhe0
    public final void g(android.graphics.Canvas r17, androidx.recyclerview.widget.RecyclerView r18, a.the0 r19) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dvl.g(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, a.the0):void");
    }

    public void i(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, Canvas canvas, int i, int i2, boolean z) {
        View viewD;
        View viewD2 = linearLayoutManager.D(i);
        if (viewD2 == null) {
            return;
        }
        Iterator it = l1e0.i(i2, i).iterator();
        do {
            if (!it.hasNext()) {
                viewD = null;
                break;
            }
            viewD = linearLayoutManager.D(((bkx) it).nextInt());
        } while (viewD == null);
        if (viewD == null) {
            return;
        }
        Path path = this.c;
        path.reset();
        float left = recyclerView.getLeft();
        float f = this.d;
        RectF rectF = new RectF(left + f, viewD2.getTop(), recyclerView.getRight() - f, viewD.getBottom() + this.e);
        if (z) {
            path.addRoundRect(rectF, this.f, Path.Direction.CW);
        } else {
            path.addRect(rectF, Path.Direction.CW);
        }
        canvas.drawPath(path, this.b);
    }

    public void j(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, Canvas canvas, int i, int i2, boolean z, float f) {
        View viewD;
        View viewD2 = linearLayoutManager.D(i);
        if (viewD2 == null) {
            return;
        }
        Iterator it = l1e0.i(i2, i).iterator();
        do {
            if (!it.hasNext()) {
                viewD = null;
                break;
            }
            viewD = linearLayoutManager.D(((bkx) it).nextInt());
        } while (viewD == null);
        if (viewD == null) {
            return;
        }
        Path path = this.c;
        path.reset();
        float left = recyclerView.getLeft();
        float f2 = this.d;
        float f3 = left + f2;
        float top = viewD2.getTop();
        float right = recyclerView.getRight() - f2;
        float bottom = viewD.getBottom();
        if (!z) {
            f = this.e;
        }
        RectF rectF = new RectF(f3, top, right, bottom + f);
        if (z) {
            path.addRoundRect(rectF, this.f, Path.Direction.CW);
        } else {
            path.addRect(rectF, Path.Direction.CW);
        }
        canvas.drawPath(path, this.b);
    }

    public void k(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, Canvas canvas, int i, int i2, boolean z) {
        View viewD;
        View viewD2 = linearLayoutManager.D(i);
        if (viewD2 == null) {
            return;
        }
        Iterator it = l1e0.i(i2, i).iterator();
        do {
            if (!it.hasNext()) {
                viewD = null;
                break;
            }
            viewD = linearLayoutManager.D(((bkx) it).nextInt());
        } while (viewD == null);
        if (viewD == null) {
            return;
        }
        Path path = this.c;
        path.reset();
        float left = recyclerView.getLeft();
        float f = this.d;
        RectF rectF = new RectF(left + f, viewD2.getTop(), recyclerView.getRight() - f, viewD.getBottom() + this.e);
        if (z) {
            path.addRoundRect(rectF, this.f, Path.Direction.CW);
        } else {
            path.addRect(rectF, Path.Direction.CW);
        }
        canvas.drawPath(path, this.b);
    }

    public dvl(k9b k9bVar) {
        this.g = k9bVar;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        this.d = k9bVar.c;
        this.e = k9bVar.e;
        float f = k9bVar.i;
        this.f = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f};
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(k9bVar.h);
    }

    public dvl(l9b l9bVar) {
        this.g = l9bVar;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        this.d = l9bVar.c;
        this.e = l9bVar.d;
        float f = l9bVar.k;
        this.f = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f};
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(l9bVar.h);
    }
}
