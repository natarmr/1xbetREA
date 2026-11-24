package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg20 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kg20 f18221a = new kg20(1, Throwable.class, "printStackTrace", "printStackTrace()V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        th.printStackTrace();
        return Unit.f46060a;
    }
}
