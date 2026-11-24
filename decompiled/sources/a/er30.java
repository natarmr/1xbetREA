package a;

/* JADX INFO: loaded from: classes.dex */
public final class er30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8263a;

    public er30(String str) {
        this.f8263a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er30) && this.f8263a.equals(((er30) obj).f8263a);
    }

    public final int hashCode() {
        return this.f8263a.hashCode();
    }

    public final String toString() {
        return axq.m(new StringBuilder("MemberSignature(signature="), this.f8263a, ')');
    }
}
