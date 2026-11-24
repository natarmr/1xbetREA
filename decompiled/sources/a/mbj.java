package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mbj {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f21512a;
    public final byte b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final int g;

    static {
        hn30.a("media3.datasource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mbj(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        x0x.A(j >= 0);
        x0x.A(j >= 0);
        x0x.A(j2 > 0 || j2 == -1);
        uri.getClass();
        this.f21512a = uri;
        this.b = i;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        byte b = this.b;
        if (b == 1) {
            str = "GET";
        } else if (b == 2) {
            str = "POST";
        } else {
            if (b != 3) {
                v4i0.e();
                return null;
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(Separators.SP);
        sb.append(this.f21512a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", null, ");
        return rz4.j(this.g, "]", sb);
    }
}
