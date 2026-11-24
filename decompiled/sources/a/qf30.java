package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class qf30 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28610a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ qf30(xcz xczVar, pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f28610a = b;
        this.b = xczVar;
        this.c = pz40Var;
        this.d = pz40Var2;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f28610a;
        xcz xczVar = this.b;
        pz40 pz40Var = this.d;
        pz40 pz40Var2 = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (((Number) pz40Var2.getValue()).intValue() < iIntValue) {
                    pz40Var2.setValue(Integer.valueOf(iIntValue));
                    if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                        v0h0 v0h0Var = xcz.y;
                        Object objF = xczVar.f(iIntValue - 1, 0, yjeVar);
                        return objF == wne.f39444a ? objF : Unit.f46060a;
                    }
                }
                return Unit.f46060a;
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                if (((Number) pz40Var2.getValue()).intValue() < iIntValue2) {
                    pz40Var2.setValue(Integer.valueOf(iIntValue2));
                    if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                        v0h0 v0h0Var2 = xcz.y;
                        Object objF2 = xczVar.f(iIntValue2 - 1, 0, yjeVar);
                        return objF2 == wne.f39444a ? objF2 : Unit.f46060a;
                    }
                }
                return Unit.f46060a;
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                if (((Number) pz40Var2.getValue()).intValue() < iIntValue3) {
                    pz40Var2.setValue(Integer.valueOf(iIntValue3));
                    if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                        v0h0 v0h0Var3 = xcz.y;
                        Object objF3 = xczVar.f(iIntValue3 - 1, 0, yjeVar);
                        return objF3 == wne.f39444a ? objF3 : Unit.f46060a;
                    }
                }
                return Unit.f46060a;
            default:
                int iIntValue4 = ((Number) obj).intValue();
                if (((Number) pz40Var2.getValue()).intValue() < iIntValue4) {
                    pz40Var2.setValue(Integer.valueOf(iIntValue4));
                    if (!((Boolean) pz40Var.getValue()).booleanValue()) {
                        v0h0 v0h0Var4 = xcz.y;
                        Object objF4 = xczVar.f(iIntValue4 - 1, 0, yjeVar);
                        return objF4 == wne.f39444a ? objF4 : Unit.f46060a;
                    }
                }
                return Unit.f46060a;
        }
    }
}
