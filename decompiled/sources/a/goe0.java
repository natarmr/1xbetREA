package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class goe0 extends xo implements Function2 {
    public static final goe0 h = new goe0(2, Throwable.class, "printStackTrace", "printStackTrace()V", 4);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Throwable) obj).printStackTrace();
        return Unit.f46060a;
    }
}
