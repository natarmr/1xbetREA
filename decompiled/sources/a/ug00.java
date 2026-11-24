package a;

/* JADX INFO: loaded from: classes.dex */
public final class ug00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35600a;
    public s88 b = new s88((byte) 6);
    public boolean c;
    public boolean d;

    public ug00(Object obj) {
        this.f35600a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ug00.class != obj.getClass()) {
            return false;
        }
        return this.f35600a.equals(((ug00) obj).f35600a);
    }

    public final int hashCode() {
        return this.f35600a.hashCode();
    }
}
