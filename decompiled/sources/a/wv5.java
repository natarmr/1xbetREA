package a;

import android.text.BidiFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wv5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39824a;
    public final /* synthetic */ iw5 b;

    public /* synthetic */ wv5(iw5 iw5Var, byte b) {
        this.f39824a = b;
        this.b = iw5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39824a;
        iw5 iw5Var = this.b;
        byte b2 = 1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                iiy[] iiyVarArr = iw5.j2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    obc.d(bmd.n.a(BidiFormatter.getInstance().isRtlContext() ? k6z.b : k6z.f17794a), u1c.M(338430817, new wv5(iw5Var, b2), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                iiy[] iiyVarArr2 = iw5.j2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    iw5Var.I0(iw5Var.J0(fetVar), fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
