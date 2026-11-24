package okhttp3.internal.cache;

import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Factory", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CacheStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f46126a;
    public final Response b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory {
    }

    public CacheStrategy(Request request, Response response) {
        this.f46126a = request;
        this.b = response;
    }
}
