package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ek80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lhf0 f7941a;
    public final bvc b;
    public final lne c;
    public bby d;
    public final p7m0 e;

    public ek80(lhf0 lhf0Var, bvc bvcVar, lne lneVar) {
        lneVar.getClass();
        this.f7941a = lhf0Var;
        this.b = bvcVar;
        this.c = lneVar;
        this.e = q7m0.a(new xl80(iun.f15405a, true));
        a(true);
    }

    public final void a(boolean z) {
        am80 am80Var = (am80) this.e.getValue();
        if ((am80Var instanceof ul80) && ((ul80) am80Var).b) {
            return;
        }
        bby bbyVar = this.d;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.d = sac.g0(this.b, ek80.class.getSimpleName().concat(".loadNextPageInternally"), this.c, new xj80(1, this, ek80.class, "setErrorState", "setErrorState(Ljava/lang/Throwable;)V", 0, (byte) 0), new a220((Object) this, z, (yje) null, (byte) 5), 86);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(boolean z, zje zjeVar) {
        ck80 ck80Var;
        lhf0 lhf0Var = this.f7941a;
        cyu cyuVar = (cyu) lhf0Var.b;
        if (zjeVar instanceof ck80) {
            ck80Var = (ck80) zjeVar;
            int i = ck80Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ck80Var.l = i - Integer.MIN_VALUE;
            } else {
                ck80Var = new ck80(this, zjeVar);
            }
        } else {
            ck80Var = new ck80(this, zjeVar);
        }
        Object objH = ck80Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ck80Var.l;
        p7m0 p7m0Var = this.e;
        if (i2 == 0) {
            z1x.P(objH);
            xl80 xl80Var = new xl80((List) ((p7m0) cyuVar.c).getValue(), z);
            p7m0Var.getClass();
            p7m0Var.o(null, xl80Var);
            ck80Var.i = z;
            ck80Var.l = 1;
            objH = lhf0.H(lhf0Var, z, ck80Var);
            if (objH == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ck80Var.i;
            z1x.P(objH);
        }
        ul80 ul80Var = new ul80((List) ((p7m0) cyuVar.c).getValue(), ((Boolean) objH).booleanValue(), z);
        p7m0Var.getClass();
        p7m0Var.o(null, ul80Var);
        return Unit.f46060a;
    }
}
