package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15705a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ j1(s1 s1Var, byte b) {
        this.f15705a = b;
        this.b = s1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yzj yzjVar;
        byte b = this.f15705a;
        s1 s1Var = this.b;
        switch (b) {
            case 0:
                d6x d6xVar = (d6x) mbc.R(s1Var, a6x.f338a);
                if (d6xVar == null) {
                    adx.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + d6xVar);
                }
                d6x d6xVar2 = s1Var.y;
                s1Var.y = d6xVar;
                if (d6xVar2 != null && !Intrinsics.d(d6xVar, d6xVar2) && ((yzjVar = s1Var.B) != null || !s1Var.j1)) {
                    if (yzjVar != null) {
                        s1Var.a1(yzjVar);
                    }
                    s1Var.B = null;
                    s1Var.k1();
                }
                return Unit.f46060a;
            default:
                s1Var.o1();
                return Boolean.TRUE;
        }
    }
}
