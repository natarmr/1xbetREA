package okhttp3.internal.dns;

import a.b1j;
import a.jf4;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall;", "Lokhttp3/Dns$Call;", "State", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StateMachineDnsCall implements Dns.Call {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall$State;", "", "Idle", "Running", "Complete", "Lokhttp3/internal/dns/StateMachineDnsCall$State$Complete;", "Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;", "Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall$State$Complete;", "Lokhttp3/internal/dns/StateMachineDnsCall$State;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Complete implements State {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;", "Lokhttp3/internal/dns/StateMachineDnsCall$State;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Idle implements State {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;", "Lokhttp3/internal/dns/StateMachineDnsCall$State;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Running implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f46165a;
            public final List b;
            public final List c;

            public Running(_ExecuteDnsKt$execute$1 _executednskt_execute_1, boolean z, List list, List list2, List list3) {
                b1j.B(list, list2, list3);
                this.f46165a = list;
                this.b = list2;
                this.c = list3;
                if (list2.isEmpty() || z) {
                    return;
                }
                jf4.n("Check failed.");
                throw null;
            }
        }
    }

    @Override // okhttp3.Dns.Call
    public final void a(_ExecuteDnsKt$execute$1 _executednskt_execute_1) {
        a.b();
        throw null;
    }

    @Override // okhttp3.Dns.Call
    /* JADX INFO: renamed from: getRequest */
    public final Dns.Request getG() {
        return null;
    }
}
