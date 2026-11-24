package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fr50 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10005a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ fr50(byte b, String str, Function1 function1) {
        this.f10005a = b;
        this.b = function1;
        this.c = str;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f10005a;
        String str = this.c;
        Function1 function1 = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        String str2 = (String) obj3;
        switch (b) {
            case 0:
                function1.invoke(new uq50(iIntValue, str, iIntValue2, str2));
                break;
            default:
                function1.invoke(new uq50(iIntValue, str, iIntValue2, str2));
                break;
        }
        return Unit.f46060a;
    }
}
