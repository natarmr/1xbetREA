package a;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zz0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45229a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zz0(int i, pz40 pz40Var, aaj aajVar, long j) {
        this.f45229a = (byte) 3;
        this.c = i;
        this.d = pz40Var;
        this.e = aajVar;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f45229a;
        long j = this.b;
        int i = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                a01 a01Var = (a01) obj3;
                mlr mlrVar = (mlr) obj2;
                uf3 uf3Var = a01Var.B;
                long j2 = mlrVar.f22006a;
                String str = mlrVar.f;
                long j3 = mlrVar.c;
                boolean z = mlrVar.l;
                long j4 = mlrVar.b;
                boolean z2 = mlrVar.m;
                boolean z3 = mlrVar.n;
                String strO = a01Var.O(mlrVar, j);
                uf3Var.getClass();
                str.getClass();
                c8d c8dVar = (c8d) ((k0w0) obj).h(jdk0.f(j2, str, j3, z, j4, z2, false, this.c, z3, false, false, strO, true)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(!mlrVar.n, bjkVar, bjkVar);
                break;
            case 1:
                String str2 = (String) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(new CyberGameStatisticScreenParams(str2, 0, this.c, this.b), ((uzg) obj3).f));
                break;
            case 2:
                pu90 pu90Var = (pu90) obj3;
                pu90 pu90Var2 = (pu90) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, 0, (i - pu90Var.b) / 2, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, p4e.i(j) - pu90Var2.f27604a, (i - pu90Var2.b) / 2, 0.0f);
                }
                break;
            default:
                aaj aajVar = (aaj) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                int i2 = q3d.i((List) ((pz40) obj3).getValue());
                long j5 = this.b;
                if (i == i2 && aajVar.d == null) {
                    zcl zclVar = qmk.f28987a;
                    z1x.E(fhlVar, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3).a(fhlVar.d(), fhlVar.getLayoutDirection(), fhlVar), j5);
                } else {
                    fhl.u(fhlVar, j5, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zz0(pu90 pu90Var, int i, pu90 pu90Var2, long j) {
        this.f45229a = (byte) 2;
        this.d = pu90Var;
        this.c = i;
        this.e = pu90Var2;
        this.b = j;
    }

    public /* synthetic */ zz0(Object obj, Serializable serializable, long j, int i, byte b) {
        this.f45229a = b;
        this.d = obj;
        this.e = serializable;
        this.b = j;
        this.c = i;
    }
}
