package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mk40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21926a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ zog c;

    public /* synthetic */ mk40(Function1 function1, zog zogVar, byte b) {
        this.f21926a = b;
        this.b = function1;
        this.c = zogVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21926a;
        zog zogVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new yj40(zogVar.c, zogVar.d));
                break;
            case 1:
                function1.invoke(new q110(zogVar.c, zogVar.d));
                break;
            case 2:
                function1.invoke(new awd0(zogVar.c, zogVar.d));
                break;
            default:
                function1.invoke(new jyt0(zogVar.c, zogVar.d));
                break;
        }
        return Unit.f46060a;
    }
}
