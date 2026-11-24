package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rvl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31175a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ String c;
    public final /* synthetic */ u23 d;

    public /* synthetic */ rvl0(a4x a4xVar, String str, u23 u23Var, byte b) {
        this.f31175a = b;
        this.b = a4xVar;
        this.c = str;
        this.d = u23Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31175a;
        u23 u23Var = this.d;
        String str = this.c;
        a4x a4xVar = this.b;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        switch (b) {
            case 0:
                hcz.e(hczVar, null, null, new ugd(-1641145247, true, new h0(str, (byte) 8)), 3);
                hczVar.f(a4xVar.size(), new o3l0(new gcl0((byte) 21), a4xVar, (byte) 21), new y9k0(a4xVar, (byte) 23), new ugd(2039820996, true, new vvl0(a4xVar, a4xVar, u23Var, (byte) 0)));
                break;
            default:
                hcz.e(hczVar, null, null, new ugd(1462935785, true, new h0(str, (byte) 9)), 3);
                hczVar.f(a4xVar.size(), new o3l0(new gcl0((byte) 22), a4xVar, (byte) 22), new y9k0(a4xVar, (byte) 24), new ugd(2039820996, true, new vvl0(a4xVar, a4xVar, u23Var, (byte) 1)));
                break;
        }
        return Unit.f46060a;
    }
}
