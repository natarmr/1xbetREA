package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class er50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8265a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ er50(mm40 mm40Var, ArrayList arrayList, Function2 function2, int i, byte b) {
        this.f8265a = b;
        this.b = mm40Var;
        this.c = arrayList;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8265a;
        Function2 function2 = this.d;
        ArrayList arrayList = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                o050.G(mm40Var, arrayList, function2, fetVar, x8x.L(1));
                break;
            default:
                u7x.j(mm40Var, arrayList, function2, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
