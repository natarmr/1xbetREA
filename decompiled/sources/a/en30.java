package a;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class en30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f8073a;
    public final String b;
    public final List c;
    public final b4x d;
    public final long e;

    static {
        hne.s(0, 1, 2, 3, 4);
        vtt0.H(5);
        vtt0.H(6);
        vtt0.H(7);
    }

    public en30(Uri uri, String str, d9x d9xVar, List list, b4x b4xVar, long j) {
        this.f8073a = uri;
        this.b = mg40.n(str);
        this.c = list;
        this.d = b4xVar;
        u3x u3xVarL = b4x.l();
        for (int i = 0; i < b4xVar.size(); i++) {
            ((gn30) b4xVar.get(i)).getClass();
            u3xVarL.b(new gn30());
        }
        u3xVarL.g();
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en30)) {
            return false;
        }
        en30 en30Var = (en30) obj;
        return this.f8073a.equals(en30Var.f8073a) && Objects.equals(this.b, en30Var.b) && Objects.equals(null, null) && this.c.equals(en30Var.c) && this.d.equals(en30Var.d) && this.e == en30Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f8073a.hashCode() * 31;
        String str = this.b;
        return (int) ((((long) ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.e);
    }
}
