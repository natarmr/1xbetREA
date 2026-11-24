package a;

/* JADX INFO: loaded from: classes2.dex */
public final class cvc implements dvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5023a;
    public final float b;

    public cvc(float f, float f2) {
        this.f5023a = f;
        this.b = f2;
    }

    public final boolean a() {
        return this.f5023a > this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cvc)) {
            return false;
        }
        if (a() && ((cvc) obj).a()) {
            return true;
        }
        cvc cvcVar = (cvc) obj;
        return this.f5023a == cvcVar.f5023a && this.b == cvcVar.b;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.f5023a) * 31);
    }

    public final String toString() {
        return this.f5023a + ".." + this.b;
    }
}
