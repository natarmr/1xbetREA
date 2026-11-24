package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class vmd extends xmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f37670a;

    public vmd(ank0 ank0Var) {
        this.f37670a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vmd) && this.f37670a.equals(((vmd) obj).f37670a);
    }

    public final int hashCode() {
        return this.f37670a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("MatchBaseInfoChanged(matchBaseInfo=", this.f37670a, Separators.RPAREN);
    }
}
