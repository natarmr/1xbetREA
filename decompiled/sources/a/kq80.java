package a;

import android.gov.nist.core.Separators;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class kq80 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18709a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public kq80(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f18709a = z;
        this.b = i;
    }

    public static kq80 a(String str, Exception exc) {
        return new kq80(str, exc, true, 1);
    }

    public static kq80 b(String str) {
        return new kq80(str, null, true, 4);
    }

    public static kq80 d(String str) {
        return new kq80(str, null, true, 8);
    }

    public static kq80 e(String str) {
        return new kq80(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(Separators.SP) : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f18709a);
        sb.append(", dataType=");
        return rz4.j(this.b, "}", sb);
    }
}
