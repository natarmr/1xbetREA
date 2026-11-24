package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner;", "", "Plan", "ConnectResult", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RoutePlanner {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner$Plan;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Plan {
        Plan a();

        RealConnection b();

        void cancel();

        ConnectResult d();

        ConnectResult g();

        boolean isReady();
    }

    boolean a(RealConnection realConnection);

    boolean b(HttpUrl httpUrl);

    Address getAddress();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConnectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Plan f46151a;
        public final Plan b;
        public final Throwable c;

        public /* synthetic */ ConnectResult(Plan plan, ConnectPlan connectPlan, Throwable th, int i) {
            this(plan, (i & 2) != 0 ? null : connectPlan, (i & 4) != 0 ? null : th);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) obj;
            return Intrinsics.d(this.f46151a, connectResult.f46151a) && Intrinsics.d(this.b, connectResult.b) && Intrinsics.d(this.c, connectResult.c);
        }

        public final int hashCode() {
            int iHashCode = this.f46151a.hashCode() * 31;
            Plan plan = this.b;
            int iHashCode2 = (iHashCode + (plan == null ? 0 : plan.hashCode())) * 31;
            Throwable th = this.c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            return "ConnectResult(plan=" + this.f46151a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
        }

        public ConnectResult(Plan plan, Plan plan2, Throwable th) {
            this.f46151a = plan;
            this.b = plan2;
            this.c = th;
        }
    }
}
