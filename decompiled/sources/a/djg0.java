package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class djg0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6184a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a4x c;

    public /* synthetic */ djg0(String str, a4x a4xVar, int i, byte b) {
        this.f6184a = b;
        this.b = str;
        this.c = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6184a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                vvw.i(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                j120.y(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
