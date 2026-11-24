package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v690 implements w690 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36865a;
    public final String[] b;

    public v690(String str, String[] strArr) {
        strArr.getClass();
        this.f36865a = str;
        this.b = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v690)) {
            return false;
        }
        v690 v690Var = (v690) obj;
        return this.f36865a.equals(v690Var.f36865a) && Intrinsics.d(this.b, v690Var.b);
    }

    public final int hashCode() {
        return (this.f36865a.hashCode() * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return b1j.k("OpenFileChooser(photoFilePath=", this.f36865a, ", fileFormats=", Arrays.toString(this.b), Separators.RPAREN);
    }
}
