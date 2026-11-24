package a;

/* JADX INFO: loaded from: classes4.dex */
public final class du implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kjl f6676a;

    public du(kjl kjlVar) {
        this.f6676a = kjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du) && this.f6676a.equals(((du) obj).f6676a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KEY_ADD_TEAM";
    }

    public final int hashCode() {
        return (this.f6676a.f18391a.hashCode() * 31) + 1012712795;
    }

    public final String toString() {
        return "AddTeamUiItem(model=" + this.f6676a + ", key=KEY_ADD_TEAM)";
    }
}
