package a;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class dlo extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6293a;
    public final long b;
    public final byte c;
    public final String d;
    public final int e;
    public final androidx.media3.common.b f;
    public final int g;
    public final vn30 h;
    public final boolean i;

    static {
        hne.s(0, 1, 2, 3, 4);
        vtt0.H(5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dlo(int i, Exception exc, int i2, String str, int i3, androidx.media3.common.b bVar, int i4, vn30 vn30Var, boolean z) {
        String str2;
        int i5;
        androidx.media3.common.b bVar2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            bVar2 = bVar;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            bVar2 = bVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            bVar2 = bVar;
            sb.append(bVar2);
            sb.append(", format_supported=");
            String str4 = vtt0.f38024a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    v4i0.e();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, bVar2, i4, vn30Var, SystemClock.elapsedRealtime(), z);
    }

    public final dlo a(vn30 vn30Var) {
        String message = getMessage();
        String str = vtt0.f38024a;
        return new dlo(message, getCause(), this.f6293a, this.c, this.d, this.e, this.f, this.g, vn30Var, this.b, this.i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dlo(String str, Throwable th, int i, int i2, String str2, int i3, androidx.media3.common.b bVar, int i4, vn30 vn30Var, long j, boolean z) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        this.f6293a = i;
        this.b = j;
        x0x.A(!z || i2 == 1);
        x0x.A(th != null || i2 == 3);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = bVar;
        this.g = i4;
        this.h = vn30Var;
        this.i = z;
    }

    public dlo(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
