package okhttp3;

import a.iun;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lokhttp3/CookieJar;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CookieJar f46088a = new Companion.NoCookies();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/CookieJar$Companion;", "", "Lokhttp3/CookieJar;", "NO_COOKIES", "Lokhttp3/CookieJar;", "NoCookies", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/CookieJar$Companion$NoCookies;", "Lokhttp3/CookieJar;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public final iun a(HttpUrl httpUrl) {
                httpUrl.getClass();
                return iun.f15405a;
            }

            @Override // okhttp3.CookieJar
            public final void b(HttpUrl httpUrl, List list) {
                httpUrl.getClass();
            }
        }
    }

    iun a(HttpUrl httpUrl);

    void b(HttpUrl httpUrl, List list);
}
