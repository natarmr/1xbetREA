package a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class acw implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f650a;
    public final String b;
    public final List c;

    public acw(List list, String str, String str2) {
        this.f650a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && acw.class == obj.getClass()) {
            acw acwVar = (acw) obj;
            if (TextUtils.equals(this.f650a, acwVar.f650a) && TextUtils.equals(this.b, acwVar.b) && this.c.equals(acwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f650a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f650a;
        return "HlsTrackMetadataEntry".concat(str != null ? axq.n(kng0.t(" [", str, ", "), this.b, "]") : "");
    }
}
