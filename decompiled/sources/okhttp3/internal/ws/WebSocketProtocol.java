package okhttp3.internal.ws;

import a.d99;
import a.f99;
import a.jf4;
import a.twn;
import a.ua80;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebSocketProtocol {
    public static String a(int i) {
        if (i < 1000 || i >= 5000) {
            return twn.m(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return ua80.e(i, "Code ", " is reserved and may not be used.");
    }

    public static void b(d99 d99Var, byte[] bArr) {
        long j;
        d99Var.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = d99Var.e;
            int i2 = d99Var.f;
            int i3 = d99Var.g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = d99Var.d;
            f99 f99Var = d99Var.f5689a;
            f99Var.getClass();
            if (j2 == f99Var.b) {
                jf4.n("no more bytes");
                return;
            }
            j = d99Var.d;
        } while (d99Var.c(j == -1 ? 0L : j + ((long) (d99Var.g - d99Var.f))) != -1);
    }
}
