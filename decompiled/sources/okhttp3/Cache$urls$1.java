package okhttp3;

import a.khy;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/Cache$urls$1", "", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Cache$urls$1 implements Iterator<String>, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46077a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f46077a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final String next() {
        this.f46077a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f46077a) {
            throw new IllegalStateException("remove() before next()");
        }
        throw null;
    }
}
