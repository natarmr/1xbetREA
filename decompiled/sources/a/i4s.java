package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i4s extends xo implements Function2 {
    public static final i4s h = new i4s(2, Throwable.class, "printStackTrace", "printStackTrace()V", 4);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Throwable) obj).printStackTrace();
        return Unit.f46060a;
    }
}
