package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lfe implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19951a;
    public final /* synthetic */ ehm0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ lfe(ehm0 ehm0Var, Function1 function1, byte b) {
        this.f19951a = b;
        this.b = ehm0Var;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f19951a;
        Function1 function1 = this.c;
        ehm0 ehm0Var = this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((zdz) obj).getClass();
        int i = iIntValue & 17;
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    zcl zclVar = qmk.f28987a;
                    jeb.w(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ehm0Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    jeb.w(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7), ehm0Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
