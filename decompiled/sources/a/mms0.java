package a;

/* JADX INFO: loaded from: classes.dex */
public final class mms0 {
    public static final mms0 b = new mms0(new bh9(new char[0]));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh9 f22058a;

    public mms0(bh9 bh9Var) {
        this.f22058a = bh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mms0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f22058a.equals(((mms0) obj).f22058a);
    }

    public final int hashCode() {
        return this.f22058a.hashCode();
    }
}
