package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b4l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1965a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b4l0(Object obj, int i, byte b) {
        this.f1965a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1965a;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((lwk) obj).getClass();
                return new oa70((ngk0) obj2, i, (byte) 2);
            default:
                ((Function2) obj2).invoke(Integer.valueOf(i), Long.valueOf(((Number) obj).longValue()));
                return Unit.f46060a;
        }
    }
}
