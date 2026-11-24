package a;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class x15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w15 f40103a;
    public final String b;
    public final File c;

    public x15(w15 w15Var, String str, File file) {
        this.f40103a = w15Var;
        if (str == null) {
            hny.u("Null sessionId");
            throw null;
        }
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x15)) {
            return false;
        }
        x15 x15Var = (x15) obj;
        return this.f40103a.equals(x15Var.f40103a) && this.b.equals(x15Var.b) && this.c.equals(x15Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.f40103a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f40103a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
