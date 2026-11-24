package okhttp3.internal.connection;

import a.ohq;
import a.tjo;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.ech.EchUntrustedException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/SequentialExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SequentialExchangeFinder implements ExchangeFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealRoutePlanner f46155a;

    public SequentialExchangeFinder(RealRoutePlanner realRoutePlanner) {
        this.f46155a = realRoutePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RealConnection a() throws Throwable {
        RealRoutePlanner realRoutePlanner = this.f46155a;
        IOException iOException = null;
        while (!realRoutePlanner.l.r) {
            try {
                RoutePlanner.Plan planC = realRoutePlanner.c();
                if (!planC.isReady()) {
                    RoutePlanner.ConnectResult connectResultG = planC.g();
                    if (connectResultG.b == null && connectResultG.c == null) {
                        connectResultG = planC.getF46142a();
                    }
                    RoutePlanner.Plan plan = connectResultG.b;
                    Throwable th = connectResultG.c;
                    if (th != null) {
                        throw th;
                    }
                    if (plan != null) {
                        realRoutePlanner.q.addFirst(plan);
                    }
                }
                return planC.getF46149a();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    tjo.a(iOException, e);
                }
                if (e instanceof EchUntrustedException) {
                    throw iOException;
                }
                if (!realRoutePlanner.a(null)) {
                    throw iOException;
                }
            }
        }
        ohq.l("Canceled");
        return null;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.f46155a;
    }
}
