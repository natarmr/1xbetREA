package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nkj0 extends tkj0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public nkj0(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // a.tkj0
    public final void a(Matrix matrix, ujj0 ujj0Var, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((tkj0) it.next()).a(this.d, ujj0Var, i, canvas);
        }
    }
}
