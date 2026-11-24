package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aaq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f541a;
    public final /* synthetic */ paq b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ aaq(paq paqVar, Function1 function1, int i, byte b) {
        this.f541a = b;
        this.b = paqVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f541a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                mrv.v(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                mrv.H(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
