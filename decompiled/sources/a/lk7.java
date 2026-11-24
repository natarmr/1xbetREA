package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lk7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20186a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ l7m0 d;

    public /* synthetic */ lk7(l7m0 l7m0Var, Function1 function1, l7m0 l7m0Var2) {
        this.b = l7m0Var;
        this.c = function1;
        this.d = l7m0Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20186a;
        jm40 jm40Var = jm40.b;
        l7m0 l7m0Var = this.d;
        l7m0 l7m0Var2 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p7x.j(6, fetVar, o7k0.d(jm40Var, 1.0f), (l7m0) l7m0Var.getValue(), (String) ((l7m0) l7m0Var2.getValue()).getValue(), this.c);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w9x.a(6, fetVar2, o7k0.d(jm40Var, 1.0f), ((uc7) l7m0Var2.getValue()).d, (String) ((l7m0) l7m0Var.getValue()).getValue(), this.c);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lk7(Function1 function1, l7m0 l7m0Var, l7m0 l7m0Var2) {
        this.c = function1;
        this.b = l7m0Var;
        this.d = l7m0Var2;
    }
}
