package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h21 extends xo implements Function2 {
    public static final h21 h = new h21(2, Throwable.class, "printStackTrace", "printStackTrace()V", 4);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Throwable) obj).printStackTrace();
        return Unit.f46060a;
    }
}
