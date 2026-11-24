package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class egl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7770a;
    public final /* synthetic */ kfl0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ egl0(kfl0 kfl0Var, Function1 function1, boolean z, byte b) {
        this.f7770a = b;
        this.b = kfl0Var;
        this.c = function1;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hcz hczVar = (hcz) obj;
        switch (this.f7770a) {
            case 0:
                hczVar.getClass();
                kfl0 kfl0Var = this.b;
                a4x a4xVar = kfl0Var.b;
                hczVar.f(a4xVar.size(), new o3l0(new gcl0((byte) 10), a4xVar, (byte) 13), new y9k0(a4xVar, (byte) 16), new ugd(2039820996, true, new hgl0(a4xVar, kfl0Var, this.c, this.d, (byte) 1)));
                break;
            case 1:
                hczVar.getClass();
                kfl0 kfl0Var2 = this.b;
                a4x a4xVar2 = kfl0Var2.b;
                hczVar.f(a4xVar2.size(), new o3l0(new gcl0((byte) 7), a4xVar2, (byte) 11), new y9k0(a4xVar2, (byte) 14), new ugd(2039820996, true, new hgl0(a4xVar2, kfl0Var2, this.c, this.d, (byte) 0)));
                break;
            default:
                hczVar.getClass();
                kfl0 kfl0Var3 = this.b;
                a4x a4xVar3 = kfl0Var3.b;
                hczVar.f(a4xVar3.size(), new o3l0(new gcl0((byte) 8), a4xVar3, (byte) 15), new y9k0(a4xVar3, (byte) 18), new ugd(2039820996, true, new hgl0(a4xVar3, kfl0Var3, this.c, this.d, (byte) 2)));
                break;
        }
        return Unit.f46060a;
    }
}
