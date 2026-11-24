package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class t6a0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33408a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ t6a0(Function1 function1, byte b) {
        this.f33408a = b;
        this.b = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f33408a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                String str = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                str.getClass();
                function1.invoke(new n6a0(str, jLongValue, zBooleanValue));
                break;
            default:
                String str2 = (String) obj3;
                function1.invoke(new sdb0(str2, ((Number) obj2).intValue(), ((Number) obj).longValue()));
                break;
        }
        return Unit.f46060a;
    }
}
