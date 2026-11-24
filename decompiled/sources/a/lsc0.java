package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lsc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20572a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ lsc0(String str, String str2, Function0 function0, int i, byte b) {
        this.f20572a = b;
        this.b = str;
        this.c = str2;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20572a;
        Function0 function0 = this.d;
        String str = this.c;
        String str2 = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hmw0.m(str2, str, function0, fetVar, x8x.L(1));
                break;
            case 1:
                hfm0.m(str2, str, function0, fetVar, x8x.L(1));
                break;
            default:
                y9a.x(str2, str, function0, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
