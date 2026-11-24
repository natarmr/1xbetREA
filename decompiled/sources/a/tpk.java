package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tpk implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34338a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ qdz c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ tpk(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, byte b) {
        this.f34338a = b;
        this.b = l7m0Var;
        this.c = qdzVar;
        this.d = function1;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34338a;
        l7m0 l7m0Var = this.b;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                a4x a4xVar = (a4x) l7m0Var.getValue();
                hczVar.f(a4xVar.size(), new vtf(new vbk((byte) 9), a4xVar, (byte) 17), new vtf(new vbk((byte) 10), a4xVar, (byte) 18), new ugd(802480018, true, new vpk(a4xVar, this.c, this.e, this.d, (byte) 0)));
                break;
            case 1:
                hczVar.getClass();
                a4x a4xVar2 = (a4x) l7m0Var.getValue();
                hczVar.f(a4xVar2.size(), new vtf(new vbk((byte) 11), a4xVar2, (byte) 19), new vtf(new vbk((byte) 12), a4xVar2, (byte) 20), new ugd(802480018, true, new vpk(a4xVar2, this.c, this.d, this.e, (byte) 1)));
                break;
            case 2:
                hczVar.getClass();
                List list = (List) l7m0Var.getValue();
                hczVar.f(list.size(), new vtf(new vbk((byte) 14), list, (byte) 21), new vtf(new vbk((byte) 15), list, (byte) 22), new ugd(802480018, true, new frk(list, this.c, this.d, this.e, (byte) 0)));
                break;
            default:
                hczVar.getClass();
                List list2 = (List) l7m0Var.getValue();
                hczVar.f(list2.size(), new vtf(new vbk((byte) 16), list2, (byte) 23), new vtf(new vbk((byte) 17), list2, (byte) 24), new ugd(802480018, true, new frk(list2, this.d, this.c, this.e)));
                break;
        }
        return Unit.f46060a;
    }
}
