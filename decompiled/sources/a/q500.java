package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class q500 extends eu5 {
    public u500 getLineData() {
        return (u500) this.b;
    }

    @Override // a.kwb, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        cbj cbjVar = this.p;
        if (cbjVar != null && (cbjVar instanceof s500)) {
            s500 s500Var = (s500) cbjVar;
            Canvas canvas = s500Var.l;
            if (canvas != null) {
                canvas.setBitmap(null);
                s500Var.l = null;
            }
            WeakReference weakReference = s500Var.k;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                s500Var.k.clear();
                s500Var.k = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
