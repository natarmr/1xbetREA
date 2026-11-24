package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tv7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34586a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ tv7(String str, String str2, String str3, int i, byte b) {
        this.f34586a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34586a;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ccq0.H(str3, str2, str, fetVar, x8x.L(1));
                break;
            default:
                nkb.v(str3, str2, str, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
