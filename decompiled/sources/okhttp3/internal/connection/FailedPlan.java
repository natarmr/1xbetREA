package okhttp3.internal.connection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/FailedPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FailedPlan implements RoutePlanner.Plan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoutePlanner.ConnectResult f46142a;

    public FailedPlan(Throwable th) {
        this.f46142a = new RoutePlanner.ConnectResult(this, null, th, 2);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: b */
    public final RealConnection getF46149a() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: d, reason: from getter */
    public final RoutePlanner.ConnectResult getF46142a() {
        return this.f46142a;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() {
        return this.f46142a;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean isReady() {
        return false;
    }
}
