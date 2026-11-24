package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class je80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16361a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ je80(a4x a4xVar, Function2 function2, Function2 function3, byte b) {
        this.f16361a = b;
        this.b = a4xVar;
        this.c = function2;
        this.d = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hcz hczVar = (hcz) obj;
        switch (this.f16361a) {
            case 0:
                hczVar.getClass();
                zc70 zc70Var = new zc70((byte) 14);
                a4x a4xVar = this.b;
                hczVar.f(a4xVar.size(), new m160(zc70Var, a4xVar, (byte) 17), new a580(a4xVar, (byte) 5), new ugd(2039820996, true, new le80(a4xVar, a4xVar, this.c, this.d, (byte) 0)));
                break;
            default:
                hczVar.getClass();
                a4x a4xVar2 = this.b;
                hczVar.f(a4xVar2.size(), null, new vdr0(a4xVar2, (byte) 1), new ugd(2039820996, true, new le80(a4xVar2, a4xVar2, this.c, this.d, (byte) 1)));
                break;
        }
        return Unit.f46060a;
    }
}
