package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f46202a = 0;
    public final /* synthetic */ Http2Connection b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ b(Http2Connection http2Connection, int i, List list) {
        this.b = http2Connection;
        this.c = i;
        this.d = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46202a) {
            case 0:
                Http2Connection http2Connection = this.b;
                int i = this.c;
                List list = this.d;
                ((PushObserver.Companion.PushObserverCancel) http2Connection.k).getClass();
                list.getClass();
                try {
                    http2Connection.x.n(i, ErrorCode.CANCEL);
                    synchronized (http2Connection) {
                        http2Connection.z.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return Unit.f46060a;
            default:
                Http2Connection http2Connection2 = this.b;
                int i2 = this.c;
                List list2 = this.d;
                ((PushObserver.Companion.PushObserverCancel) http2Connection2.k).getClass();
                list2.getClass();
                try {
                    http2Connection2.x.n(i2, ErrorCode.CANCEL);
                    synchronized (http2Connection2) {
                        http2Connection2.z.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ b(Http2Connection http2Connection, int i, List list, boolean z) {
        this.b = http2Connection;
        this.c = i;
        this.d = list;
    }
}
