package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ou implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kjl f25852a;

    public ou(kjl kjlVar) {
        this.f25852a = kjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou) && this.f25852a.equals(((ou) obj).f25852a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "KEY_ADD_TEAM";
    }

    public final int hashCode() {
        return (this.f25852a.f18391a.hashCode() * 31) + 1012712795;
    }

    public final String toString() {
        return "AddTournamentUiItem(model=" + this.f25852a + ", key=KEY_ADD_TEAM)";
    }
}
