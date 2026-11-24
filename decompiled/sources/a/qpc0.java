package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qpc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29110a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ qpc0(ArrayList arrayList, Function1 function1, int i, byte b) {
        this.f29110a = b;
        this.b = arrayList;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29110a;
        Function1 function1 = this.c;
        ArrayList arrayList = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                vbw0.E(arrayList, function1, fetVar, x8x.L(1));
                break;
            default:
                bcm0.a(arrayList, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
