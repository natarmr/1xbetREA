package okhttp3;

import a.qg9;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Credentials;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Credentials {
    public static final String a(String str, String str2, Charset charset) {
        str.getClass();
        str2.getClass();
        charset.getClass();
        byte[] bytes = (str + ':' + str2).getBytes(charset);
        bytes.getClass();
        return "Basic ".concat(new qg9(bytes).a());
    }
}
