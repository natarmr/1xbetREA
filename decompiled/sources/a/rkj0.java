package a;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class rkj0 extends skj0 {
    public float b;
    public float c;

    @Override // a.skj0
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f32352a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
