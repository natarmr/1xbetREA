package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31906a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ sb(mm40 mm40Var, List list, xcz xczVar, Function1 function1, int i) {
        this.b = mm40Var;
        this.c = list;
        this.d = xczVar;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31906a) {
            case 0:
                ((Integer) obj2).getClass();
                wb.v(x8x.L(3073), (fet) obj, this.d, this.b, this.c, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                nia0.S(x8x.L(7), (fet) obj, this.d, this.b, this.c, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ sb(Function1 function1, xcz xczVar, List list, mm40 mm40Var, int i) {
        this.e = function1;
        this.d = xczVar;
        this.c = list;
        this.b = mm40Var;
    }
}
