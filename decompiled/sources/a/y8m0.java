package a;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y8m0 extends dr30 {
    public static final /* synthetic */ iiy[] f = {new j0d0(y8m0.class, "functions", "getFunctions()Ljava/util/List;", 0), new j0d0(y8m0.class, "properties", "getProperties()Ljava/util/List;", 0)};
    public final ffk b;
    public final boolean c;
    public final cu00 d;
    public final cu00 e;

    public y8m0(eu00 eu00Var, ffk ffkVar, boolean z) {
        eu00Var.getClass();
        this.b = ffkVar;
        this.c = z;
        slc slcVar = slc.f32392a;
        this.d = new cu00(eu00Var, new x8m0(this, (byte) 0));
        this.e = new cu00(eu00Var, new x8m0(this, (byte) 1));
    }

    @Override // a.dr30, a.cr30
    public final Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        List list = (List) yqm0.s(this.d, f[0]);
        mbk0 mbk0Var = new mbk0();
        for (Object obj : list) {
            if (Intrinsics.d(((fyj0) obj).getName(), g950Var)) {
                mbk0Var.add(obj);
            }
        }
        return mbk0Var;
    }

    @Override // a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        iiy[] iiyVarArr = f;
        return CollectionsKt.q0((List) yqm0.s(this.d, iiyVarArr[0]), (List) yqm0.s(this.e, iiyVarArr[1]));
    }

    @Override // a.dr30, a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        return null;
    }

    @Override // a.dr30, a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        List list = (List) yqm0.s(this.e, f[1]);
        mbk0 mbk0Var = new mbk0();
        for (Object obj : list) {
            if (Intrinsics.d(((d0d0) obj).getName(), g950Var)) {
                mbk0Var.add(obj);
            }
        }
        return mbk0Var;
    }
}
