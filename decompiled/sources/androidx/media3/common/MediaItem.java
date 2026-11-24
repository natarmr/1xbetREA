package androidx.media3.common;

import a.b4x;
import a.bn30;
import a.cn30;
import a.dn30;
import a.en30;
import a.fn30;
import a.hne;
import a.jn30;
import a.mtc;
import a.rcf0;
import a.v3x;
import a.vtt0;
import a.xuz;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MediaItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45383a;
    public final en30 b;
    public final dn30 c;
    public final jn30 d;
    public final bn30 e;
    public final fn30 f;

    static {
        mtc mtcVar = new mtc();
        new xuz((byte) 15);
        List list = Collections.EMPTY_LIST;
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        cn30 cn30Var = new cn30();
        fn30 fn30Var = fn30.f9813a;
        new bn30(mtcVar);
        new dn30(cn30Var);
        jn30 jn30Var = jn30.C;
        hne.s(0, 1, 2, 3, 4);
        vtt0.H(5);
    }

    public MediaItem(String str, bn30 bn30Var, en30 en30Var, dn30 dn30Var, jn30 jn30Var, fn30 fn30Var) {
        this.f45383a = str;
        this.b = en30Var;
        this.c = dn30Var;
        this.d = jn30Var;
        this.e = bn30Var;
        this.f = fn30Var;
    }

    public static MediaItem a(String str) {
        mtc mtcVar = new mtc();
        new xuz((byte) 15);
        List list = Collections.EMPTY_LIST;
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        cn30 cn30Var = new cn30();
        fn30 fn30Var = fn30.f9813a;
        Uri uri = str == null ? null : Uri.parse(str);
        return new MediaItem("", new bn30(mtcVar), uri != null ? new en30(uri, null, null, list, rcf0Var, -9223372036854775807L) : null, new dn30(cn30Var), jn30.C, fn30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Objects.equals(this.f45383a, mediaItem.f45383a) && this.e.equals(mediaItem.e) && Objects.equals(this.b, mediaItem.b) && this.c.equals(mediaItem.c) && Objects.equals(this.d, mediaItem.d) && Objects.equals(this.f, mediaItem.f);
    }

    public final int hashCode() {
        int iHashCode = this.f45383a.hashCode() * 31;
        en30 en30Var = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (en30Var != null ? en30Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}
