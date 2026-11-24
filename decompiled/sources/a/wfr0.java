package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class wfr0 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39084a;
    public final String b;
    public final String c;

    public wfr0(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + Separators.DOT);
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            jf4.o(kng0.l("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.f39084a = strSubstring;
        this.b = str;
        this.c = w6x.q(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wfr0)) {
            return false;
        }
        wfr0 wfr0Var = (wfr0) obj;
        return this.f39084a.equals(wfr0Var.f39084a) && this.b.equals(wfr0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.f39084a);
    }
}
