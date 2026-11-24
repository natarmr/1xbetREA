package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k2i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17573a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ z3i c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ k2i(mm40 mm40Var, z3i z3iVar, Function1 function1, int i, byte b) {
        this.f17573a = b;
        this.b = mm40Var;
        this.c = z3iVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17573a;
        int i = this.e;
        Function1 function1 = this.d;
        z3i z3iVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                d5c.h(mm40Var, z3iVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                sac.h(mm40Var, z3iVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                ebc.j(mm40Var, z3iVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
