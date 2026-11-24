package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ps70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv20 f27502a;

    public ps70(nv20 nv20Var) {
        this.f27502a = nv20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, zje zjeVar) {
        ns70 ns70Var;
        if (zjeVar instanceof ns70) {
            ns70Var = (ns70) zjeVar;
            int i = ns70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ns70Var.k = i - Integer.MIN_VALUE;
            } else {
                ns70Var = new ns70(this, zjeVar);
            }
        } else {
            ns70Var = new ns70(this, zjeVar);
        }
        Object objG = ns70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ns70Var.k;
        if (i2 == 0) {
            z1x.P(objG);
            ns70Var.k = 1;
            objG = this.f27502a.g(str, str2, str3, ns70Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        jpx jpxVar = (jpx) objG;
        Integer num = jpxVar.b;
        return Boolean.valueOf((num == null || num.intValue() == 0) && Intrinsics.d(jpxVar.f16922a, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(String str, int i, String str2, String str3, String str4, zje zjeVar) {
        os70 os70Var;
        Object g0g0Var;
        if (zjeVar instanceof os70) {
            os70Var = (os70) zjeVar;
            int i2 = os70Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                os70Var.k = i2 - Integer.MIN_VALUE;
            } else {
                os70Var = new os70(this, zjeVar);
            }
        } else {
            os70Var = new os70(this, zjeVar);
        }
        os70 os70Var2 = os70Var;
        Object objH = os70Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = os70Var2.k;
        try {
            if (i3 == 0) {
                z1x.P(objH);
                e0g0 e0g0Var = j0g0.b;
                nv20 nv20Var = this.f27502a;
                os70Var2.k = 1;
                objH = nv20Var.h(str, i, str2, str3, str4, os70Var2);
                if (objH == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objH);
            }
            mte0 mte0Var = (mte0) objH;
            Integer num = mte0Var.f22367a;
            if (num != null && num.intValue() != 0) {
                String str5 = mte0Var.c;
                if (str5 == null) {
                    str5 = mte0Var.b;
                }
                throw new ff5(str5);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null || !(thA instanceof CancellationException)) {
            return g0g0Var;
        }
        throw thA;
    }
}
