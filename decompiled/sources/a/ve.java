package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ve implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37257a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ ve(String str, String str2, String str3, int i, byte b) {
        this.f37257a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37257a;
        int i = this.e;
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wha0.G(str3, str2, str, fetVar, x8x.L(i | 1));
                break;
            default:
                xkb.D(str3, str2, str, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
