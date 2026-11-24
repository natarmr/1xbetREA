package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class org0 extends srg0 implements hqg0 {
    public Matrix r;

    @Override // a.hqg0
    public final void k(Matrix matrix) {
        this.r = matrix;
    }

    @Override // a.frg0
    public final String n() {
        return ParameterNames.TEXT;
    }
}
