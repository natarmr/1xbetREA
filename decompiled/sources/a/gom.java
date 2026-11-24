package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gom implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11637a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gom(pz40 pz40Var, float f, Map map, Function1 function1) {
        this.c = pz40Var;
        this.b = f;
        this.d = map;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11637a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                ou90.F(ou90Var, (pu90) obj4, 0, 0, new ny2(obj3, this.b, obj2, (byte) 3), 4);
                break;
            default:
                pz40 pz40Var = (pz40) obj4;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = (a4x) pz40Var.getValue();
                hczVar.f(a4xVar.size(), new pwe0(new k8e0((byte) 15), a4xVar, (byte) 0), new ubn(a4xVar, (byte) 23), new ugd(2039820996, true, new d7s(a4xVar, this.b, (Map) obj3, (Function1) obj2, pz40Var)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gom(pu90 pu90Var, wom womVar, float f, yjj0 yjj0Var) {
        this.c = pu90Var;
        this.d = womVar;
        this.b = f;
        this.e = yjj0Var;
    }
}
