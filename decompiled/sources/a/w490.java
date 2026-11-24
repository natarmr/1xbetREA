package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class w490 implements b590 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w490);
    }

    public final int hashCode() {
        return Integer.hashCode(Response.UNAUTHORIZED);
    }

    public final String toString() {
        return "OnHttpError(code=401)";
    }
}
