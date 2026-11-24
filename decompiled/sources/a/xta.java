package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class xta implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eja f41456a;
    public final /* synthetic */ omv b;
    public final /* synthetic */ float c;
    public final /* synthetic */ pz40 d;
    public final /* synthetic */ pz40 e;
    public final /* synthetic */ pz40 f;
    public final /* synthetic */ pz40 g;

    public xta(eja ejaVar, omv omvVar, float f, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4) {
        this.f41456a = ejaVar;
        this.b = omvVar;
        this.c = f;
        this.d = pz40Var;
        this.e = pz40Var2;
        this.f = pz40Var3;
        this.g = pz40Var4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bvi0 bvi0Var = (bvi0) obj;
        Float fValueOf = Float.valueOf(0.0f);
        bvi0Var.getClass();
        boolean z = bvi0Var instanceof avi0;
        int i = 0;
        pz40 pz40Var = this.d;
        pz40 pz40Var2 = this.e;
        if (z) {
            pz40Var.setValue(this.f41456a.f7899a);
            pz40Var2.setValue(fValueOf);
            ckb.a0(this.b, 0);
        } else if (bvi0Var instanceof xui0) {
            pz40 pz40Var3 = this.f;
            a4x a4xVar = (a4x) pz40Var3.getValue();
            Iterator it = a4xVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((eja) it.next()).f7899a == ((dja) pz40Var.getValue())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                float f = this.c;
                pz40Var2.setValue(Float.valueOf(l1e0.c(Float.intBitsToFloat((int) (((xui0) bvi0Var).f41513a & 4294967295L)) + ((Number) pz40Var2.getValue()).floatValue(), -(i * f), ((a4xVar.size() - 1) - i) * f)));
                int iB = si30.b(((Number) pz40Var2.getValue()).floatValue() / f);
                int iE = l1e0.e(i + iB, q3d.h(a4xVar));
                if (iB != 0 && iE != i) {
                    ArrayList arrayList = new ArrayList(a4xVar);
                    arrayList.add(iE, arrayList.remove(i));
                    pz40Var3.setValue(dyb.o0(arrayList));
                    ((Function1) this.g.getValue()).invoke(new qta(i, iE));
                    pz40Var2.setValue(Float.valueOf(((Number) pz40Var2.getValue()).floatValue() - (iB * f)));
                }
            }
        } else {
            if (!(bvi0Var instanceof zui0) && !(bvi0Var instanceof yui0)) {
                t9f.b();
                return null;
            }
            pz40Var.setValue(null);
            pz40Var2.setValue(fValueOf);
        }
        return Unit.f46060a;
    }
}
