package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.b f31957a;
    public final String b;
    public final String c;

    public sbw(androidx.media3.common.b bVar, String str, String str2) {
        awq awqVarA = bVar.a();
        awqVarA.f1587a = null;
        awqVarA.l = null;
        this.f31957a = new androidx.media3.common.b(awqVarA);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbw)) {
            return false;
        }
        sbw sbwVar = (sbw) obj;
        return this.f31957a.equals(sbwVar.f31957a) && Objects.equals(this.b, sbwVar.b) && Objects.equals(this.c, sbwVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.f31957a, this.b, this.c);
    }
}
