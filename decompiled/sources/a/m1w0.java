package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m1w0 extends xo implements Function2 {
    public static final m1w0 h = new m1w0(2, Throwable.class, "printStackTrace", "printStackTrace()V", 4);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Throwable) obj).printStackTrace();
        return Unit.f46060a;
    }
}
