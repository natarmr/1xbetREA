package a;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u3e extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34992a;
    public final /* synthetic */ v3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3e(v3e v3eVar, byte b) {
        super(1);
        this.f34992a = b;
        this.b = v3eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34992a;
        v3e v3eVar = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
                    function0.invoke();
                } else {
                    Handler handler = v3eVar.b;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        v3eVar.b = handler;
                    }
                    handler.post(new fx2(function0, (byte) 5));
                }
                break;
            default:
                v3eVar.d = true;
                break;
        }
        return Unit.f46060a;
    }
}
