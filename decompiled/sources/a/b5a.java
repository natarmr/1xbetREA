package a;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class b5a implements c5a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1992a;
    public final Object b;

    public /* synthetic */ b5a(Object obj, byte b) {
        this.f1992a = b;
        this.b = obj;
    }

    @Override // a.c5a
    public final void b(Throwable th) {
        byte b = this.f1992a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                ((nwk) obj).a();
                break;
        }
    }

    public final String toString() {
        byte b = this.f1992a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + qjj.R(this) + ']';
            default:
                return "DisposeOnCancel[" + ((nwk) obj) + ']';
        }
    }
}
