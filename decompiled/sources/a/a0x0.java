package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0x0(String str, int i) {
        this.f42a = str;
        this.b = i;
    }

    public final String toString() {
        return String.format("%s(0x%04x)", this.f42a, Integer.valueOf(this.b));
    }
}
