package okhttp3.tls.internal.der;

import a.brm0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/Extension;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Extension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46261a;
    public final boolean b;
    public final Object c;

    public Extension(String str, Object obj, boolean z) {
        this.f46261a = str;
        this.b = z;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) obj;
        return this.f46261a.equals(extension.f46261a) && this.b == extension.b && Intrinsics.d(this.c, extension.c);
    }

    public final int hashCode() {
        int iE = brm0.e(this.f46261a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        return iE + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Extension(id=" + this.f46261a + ", critical=" + this.b + ", value=" + this.c + ')';
    }
}
