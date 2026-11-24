package okhttp3.internal;

import a.f99;
import a.zae0;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IsProbablyUtf8Kt {
    public static final boolean a(f99 f99Var) {
        f99Var.getClass();
        try {
            zae0 zae0VarX = f99Var.x();
            for (long j = 0; j < 16 && !zae0VarX.v0(); j++) {
                zae0VarX.h0(1L);
                f99 f99Var2 = zae0VarX.b;
                byte bN = f99Var2.n(0L);
                if ((bN & 224) == 192) {
                    zae0VarX.h0(2L);
                } else if ((bN & 240) == 224) {
                    zae0VarX.h0(3L);
                } else if ((bN & 248) == 240) {
                    zae0VarX.h0(4L);
                }
                int iQ = f99Var2.Q();
                if (Character.isISOControl(iQ) && !Character.isWhitespace(iQ)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
