package okhttp3;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lokhttp3/Authenticator;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Authenticator {
    public static final Authenticator e1 = new Companion.AuthenticatorNone();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lokhttp3/Authenticator$Companion;", "", "Lokhttp3/Authenticator;", "NONE", "Lokhttp3/Authenticator;", "JAVA_NET_AUTHENTICATOR", "AuthenticatorNone", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Authenticator$Companion$AuthenticatorNone;", "Lokhttp3/Authenticator;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public final Request d(Route route, Response response) {
                return null;
            }
        }
    }

    Request d(Route route, Response response);
}
