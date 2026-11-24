package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zyw0 extends fpw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45226a;
    public final drq b;

    public zyw0(int i, drq drqVar) {
        this.f45226a = i;
        this.b = drqVar;
    }

    public static hcp0 b() {
        hcp0 hcp0Var = new hcp0((byte) 20);
        hcp0Var.b = null;
        hcp0Var.c = drq.j;
        return hcp0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.b != drq.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zyw0)) {
            return false;
        }
        zyw0 zyw0Var = (zyw0) obj;
        return zyw0Var.f45226a == this.f45226a && zyw0Var.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zyw0.class, Integer.valueOf(this.f45226a), this.b);
    }

    public final String toString() {
        return dw9.n(this.f45226a, "AesSiv Parameters (variant: ", String.valueOf(this.b), ", ", "-byte key)");
    }
}
