package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class srw0 extends sqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32700a;
    public final m60 b;

    public srw0(int i, m60 m60Var) {
        this.f32700a = i;
        this.b = m60Var;
    }

    public static okt0 b() {
        okt0 okt0Var = new okt0();
        okt0Var.f25422a = null;
        okt0Var.b = m60.j;
        return okt0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.b != m60.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof srw0)) {
            return false;
        }
        srw0 srw0Var = (srw0) obj;
        return srw0Var.f32700a == this.f32700a && srw0Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(srw0.class, Integer.valueOf(this.f32700a), this.b);
    }

    public final String toString() {
        return dw9.n(this.f32700a, "AesGcmSiv Parameters (variant: ", String.valueOf(this.b), ", ", "-byte key)");
    }
}
