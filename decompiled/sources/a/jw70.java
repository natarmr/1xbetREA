package a;

/* JADX INFO: loaded from: classes4.dex */
public final class jw70 implements mw70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpv f17239a;

    public jw70(zpv zpvVar) {
        this.f17239a = zpvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jw70) && this.f17239a.equals(((jw70) obj).f17239a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f17239a.hashCode() * 31);
    }

    public final String toString() {
        return "SportEvents(headerActionsState=" + this.f17239a + ", canScrollUp=true)";
    }
}
