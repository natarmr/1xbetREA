package okhttp3.internal;

import a.sgy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/EmptyTags;", "Lokhttp3/internal/Tags;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmptyTags extends Tags {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EmptyTags f46118a = new EmptyTags();

    @Override // okhttp3.internal.Tags
    public final Object a(sgy sgyVar) {
        sgyVar.getClass();
        return null;
    }

    @Override // okhttp3.internal.Tags
    public final Tags b(sgy sgyVar, Object obj) {
        return obj != null ? new LinkedTags(sgyVar, obj, this) : this;
    }

    public final String toString() {
        return "{}";
    }
}
