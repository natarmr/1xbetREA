package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class ppm0 implements j39 {
    public final Function0 b;
    public final boolean c;
    public final k6z d;
    public final boolean e;
    public final j39 f;

    public ppm0(Function0 function0, boolean z, k6z k6zVar, boolean z2, j39 j39Var) {
        this.b = function0;
        this.c = z;
        this.d = k6zVar;
        this.e = z2;
        this.f = j39Var;
    }

    @Override // a.j39
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.b.invoke()).intValue();
        boolean z = false;
        boolean z2 = this.d == k6z.b;
        if (!this.e && z2) {
            z = true;
        }
        if (this.c == z) {
            f -= fIntValue;
        }
        return this.f.a(f, f2, f3 - fIntValue);
    }
}
