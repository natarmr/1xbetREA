package a;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w20 implements dne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dne f38426a;
    public final float b;

    public w20(float f, dne dneVar) {
        while (dneVar instanceof w20) {
            dneVar = ((w20) dneVar).f38426a;
            f += ((w20) dneVar).b;
        }
        this.f38426a = dneVar;
        this.b = f;
    }

    @Override // a.dne
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f38426a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w20)) {
            return false;
        }
        w20 w20Var = (w20) obj;
        return this.f38426a.equals(w20Var.f38426a) && this.b == w20Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38426a, Float.valueOf(this.b)});
    }
}
