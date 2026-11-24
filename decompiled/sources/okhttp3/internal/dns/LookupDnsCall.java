package okhttp3.internal.dns;

import a.axq;
import a.jf4;
import a.r3d;
import a.t9f;
import a.w3d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskRunner;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall;", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/Dns$Call;", "State", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LookupDnsCall extends Task implements Dns.Call {
    public final TaskRunner e;
    public final Dns f;
    public final Dns.Request g;
    public final AtomicReference h;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State;", "", "Idle", "Running", "Complete", "Canceled", "Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;", "Lokhttp3/internal/dns/LookupDnsCall$State$Complete;", "Lokhttp3/internal/dns/LookupDnsCall$State$Idle;", "Lokhttp3/internal/dns/LookupDnsCall$State$Running;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Canceled implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Canceled f46158a = new Canceled();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State$Complete;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Complete implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Complete f46159a = new Complete();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State$Idle;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Idle implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Idle f46160a = new Idle();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/LookupDnsCall$State$Running;", "Lokhttp3/internal/dns/LookupDnsCall$State;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Running implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final _ExecuteDnsKt$execute$1 f46161a;

            public Running(_ExecuteDnsKt$execute$1 _executednskt_execute_1) {
                this.f46161a = _executednskt_execute_1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookupDnsCall(TaskRunner taskRunner, Dns dns, Dns.Request request) {
        super(axq.n(new StringBuilder(), request.f46093a, " dns"), false);
        taskRunner.getClass();
        this.e = taskRunner;
        this.f = dns;
        this.g = request;
        this.h = new AtomicReference(State.Idle.f46160a);
    }

    @Override // okhttp3.Dns.Call
    public final void a(_ExecuteDnsKt$execute$1 _executednskt_execute_1) {
        State state;
        State.Running running = new State.Running(_executednskt_execute_1);
        loop0: while (true) {
            AtomicReference atomicReference = this.h;
            Object obj = atomicReference.get();
            state = (State) obj;
            state.getClass();
            if (!(state instanceof State.Idle)) {
                break;
            }
            do {
                if (atomicReference.compareAndSet(obj, running)) {
                    break loop0;
                }
            } while (atomicReference.get() == obj);
        }
        if (state instanceof State.Idle) {
            this.e.newQueue().d(this, 0L);
            return;
        }
        if ((state instanceof State.Running) || Intrinsics.d(state, State.Complete.f46159a)) {
            jf4.n("already enqueued");
        } else if (Intrinsics.d(state, State.Canceled.f46158a)) {
            _executednskt_execute_1.a(new IOException("canceled"));
        } else {
            t9f.b();
        }
    }

    @Override // okhttp3.internal.concurrent.Task
    public final long b() {
        State state;
        Object obj;
        State.Complete complete = State.Complete.f46159a;
        AtomicReference atomicReference = this.h;
        String str = this.g.f46093a;
        try {
            List listA = this.f.a(str);
            loop0: while (true) {
                obj = atomicReference.get();
                State state2 = (State) obj;
                state2.getClass();
                if (!(state2 instanceof State.Running)) {
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(obj, complete)) {
                        break loop0;
                    }
                } while (atomicReference.get() == obj);
            }
            State state3 = (State) obj;
            State.Running running = state3 instanceof State.Running ? (State.Running) state3 : null;
            if (running == null) {
                return -1L;
            }
            _ExecuteDnsKt$execute$1 _executednskt_execute_1 = running.f46161a;
            ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(new Dns.Record.IpAddress(str, (InetAddress) it.next()));
            }
            w3d.u(_executednskt_execute_1.f46167a, arrayList);
            _executednskt_execute_1.a(null);
            return -1L;
        } catch (UnknownHostException e) {
            loop3: while (true) {
                Object obj2 = atomicReference.get();
                state = (State) obj2;
                state.getClass();
                if (!(state instanceof State.Running)) {
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(obj2, complete)) {
                        break loop3;
                    }
                } while (atomicReference.get() == obj2);
            }
            State.Running running2 = state instanceof State.Running ? (State.Running) state : null;
            if (running2 == null) {
                return -1L;
            }
            running2.f46161a.a(e);
            return -1L;
        }
    }

    @Override // okhttp3.Dns.Call
    /* JADX INFO: renamed from: getRequest, reason: from getter */
    public final Dns.Request getG() {
        return this.g;
    }
}
