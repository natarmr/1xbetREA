package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k5d0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17715a = 1;
    public final /* synthetic */ short b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k5d0(int i, a4x a4xVar, mm40 mm40Var) {
        this.c = mm40Var;
        this.d = a4xVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17715a;
        short s = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(s | 1);
                x8x.f(jm40.b, (List) obj4, (Function0) obj3, (fet) obj, iL);
                break;
            default:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(s | 1);
                tnq0.d(iL2, fetVar, (a4x) obj3, (mm40) obj4);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k5d0(List list, Function0 function0, int i) {
        this.c = list;
        this.d = function0;
        this.b = i;
    }
}
