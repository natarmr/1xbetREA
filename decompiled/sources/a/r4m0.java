package a;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r4m0 extends lys0 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r4m0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // a.vzs0
    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // a.vzs0
    public boolean e() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // a.lys0
    public final pzs0 g(iys0 iys0Var) {
        byte b = this.c;
        Object obj = this.d;
        iys0Var.getClass();
        switch (b) {
            case 0:
                if (!((ArrayList) obj).contains(iys0Var)) {
                    return null;
                }
                foc focVarN = iys0Var.n();
                focVarN.getClass();
                return e0t0.k((hzs0) focVarN);
            default:
                return (pzs0) ((Map) obj).get(iys0Var);
        }
    }
}
