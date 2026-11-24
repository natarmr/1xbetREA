package okhttp3.internal.connection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ReusePlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReusePlan implements RoutePlanner.Plan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealConnection f46149a;

    public ReusePlan(RealConnection realConnection) {
        realConnection.getClass();
        this.f46149a = realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: b, reason: from getter */
    public final RealConnection getF46149a() {
        return this.f46149a;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult d() {
        throw new IllegalStateException("already connected");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() {
        throw new IllegalStateException("already connected");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean isReady() {
        return true;
    }
}
