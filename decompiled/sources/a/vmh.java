package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vmh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37674a;
    public final /* synthetic */ smh b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ vmh(smh smhVar, Function1 function1, int i, byte b) {
        this.f37674a = b;
        this.b = smhVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37674a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ulb.f(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                kpb.d(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
