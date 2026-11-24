package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25817a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ ot8(boolean z, String str, Function0 function0, int i) {
        this.f25817a = (byte) 2;
        this.c = z;
        this.b = str;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25817a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                aad.f(x8x.L(1), fetVar, this.b, this.d, this.c);
                break;
            case 1:
                l8x.t(x8x.L(1), fetVar, this.b, this.d, this.c);
                break;
            default:
                x1x.r(x8x.L(1), fetVar, this.b, this.d, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ot8(String str, boolean z, Function0 function0, int i, byte b) {
        this.f25817a = b;
        this.b = str;
        this.c = z;
        this.d = function0;
    }
}
