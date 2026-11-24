package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zwy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45132a;
    public final /* synthetic */ hk00 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ zwy(hk00 hk00Var, Function1 function1, byte b) {
        this.f45132a = b;
        this.b = hk00Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f45132a;
        Function1 function1 = this.c;
        hk00 hk00Var = this.b;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                a4x a4xVar = hk00Var.f13186a;
                hczVar.f(a4xVar.size(), null, new far(a4xVar, (byte) 27), new ugd(802480018, true, new yul(a4xVar, function1, (byte) 13)));
                break;
            case 1:
                hczVar.getClass();
                a4x a4xVar2 = hk00Var.f13186a;
                hczVar.f(a4xVar2.size(), null, new ap30(a4xVar2, (byte) 1), new ugd(2039820996, true, new h8w((List) a4xVar2, (Object) hk00Var, function1, (byte) 6)));
                break;
            case 2:
                hczVar.getClass();
                a4x a4xVar3 = hk00Var.f13186a;
                hczVar.f(a4xVar3.size(), null, new ap30(a4xVar3, (byte) 3), new ugd(802480018, true, new a100(a4xVar3, function1, (byte) 7)));
                break;
            default:
                hczVar.getClass();
                a4x a4xVar4 = hk00Var.f13186a;
                hczVar.f(a4xVar4.size(), null, new y9k0(a4xVar4, (byte) 1), new ugd(802480018, true, new njh0(a4xVar4, function1, (byte) 8)));
                break;
        }
        return Unit.f46060a;
    }
}
