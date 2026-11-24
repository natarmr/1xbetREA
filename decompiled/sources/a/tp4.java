package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tp4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34314a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ tp4(mm40 mm40Var, List list, Function1 function1, int i) {
        this.b = mm40Var;
        this.c = list;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34314a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ohq0.i(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            default:
                bfb.k(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ tp4(List list, Function1 function1, mm40 mm40Var, int i) {
        this.c = list;
        this.d = function1;
        this.b = mm40Var;
    }
}
