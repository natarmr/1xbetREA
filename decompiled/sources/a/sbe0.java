package a;

import java.io.Closeable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sbe0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31929a;
    public final /* synthetic */ mie0 b;

    public /* synthetic */ sbe0(mie0 mie0Var, byte b) {
        this.f31929a = b;
        this.b = mie0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31929a;
        mie0 mie0Var = this.b;
        switch (b) {
            case 0:
                List list = RealWebSocket.x;
                _UtilCommonKt.b((Closeable) mie0Var.f21842a);
                break;
            case 1:
                mie0Var.f21842a = new j6u0();
                break;
            default:
                ((Function0) mie0Var.f21842a).invoke();
                break;
        }
        return Unit.f46060a;
    }
}
