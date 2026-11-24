package a;

import java.io.IOException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x8e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40457a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x8e(byte b, int i, int i2, Object obj) {
        this.f40457a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40457a;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                fae faeVar = (fae) obj;
                if (faeVar.B(i2)) {
                    faeVar.O = Integer.valueOf(i);
                } else {
                    faeVar.B.f(new m6e(faeVar.m.b.a(R.string.message_not_found, Arrays.copyOf(new Object[0], 0))));
                }
                break;
            default:
                Http2Connection http2Connection = (Http2Connection) obj;
                try {
                    http2Connection.x.l(i2, i, true);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode, errorCode, e);
                }
                break;
        }
        return Unit.f46060a;
    }
}
