package a;

/* JADX INFO: loaded from: classes3.dex */
public final class uoj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j700 f36018a;

    public uoj(j700 j700Var) {
        this.f36018a = j700Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uoj) && this.f36018a == ((uoj) obj).f36018a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f36018a.hashCode() * 31);
    }

    public final String toString() {
        return "Shortcut(lineLiveScreenType=" + this.f36018a + ", hasBackStack=false)";
    }
}
