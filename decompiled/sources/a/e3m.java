package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e3m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7144a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ e3m(int i, String str, int i2, String str2) {
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7144a;
        int i = this.d;
        String str = this.c;
        String str2 = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ieb.G(str2, str, fetVar, x8x.L(i | 1));
                break;
            default:
                ro4.E(str2, str, i, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ e3m(int i, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = i;
    }
}
