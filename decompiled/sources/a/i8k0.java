package a;

/* JADX INFO: loaded from: classes6.dex */
public final class i8k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14343a;
    public final String b;
    public final String c;

    public i8k0(float f, String str, String str2) {
        this.f14343a = f;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8k0)) {
            return false;
        }
        i8k0 i8k0Var = (i8k0) obj;
        return Float.compare(this.f14343a, i8k0Var.f14343a) == 0 && this.b.equals(i8k0Var.b) && this.c.equals(i8k0Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(ua80.b(Float.hashCode(this.f14343a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderUiState(sliderValue=");
        sb.append(this.f14343a);
        sb.append(", startLimitLabel=");
        sb.append(this.b);
        sb.append(", endLimitLabel=");
        return axq.n(sb, this.c, ", isEnabled=true)");
    }
}
