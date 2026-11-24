package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class fg90 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9481a;
    public final /* synthetic */ xcz b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ fg90(xcz xczVar, pz40 pz40Var, byte b) {
        this.f9481a = b;
        this.b = xczVar;
        this.c = pz40Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f9481a;
        xcz xczVar = this.b;
        pz40 pz40Var = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (((Number) pz40Var.getValue()).intValue() >= iIntValue) {
                    return Unit.f46060a;
                }
                pz40Var.setValue(Integer.valueOf(iIntValue));
                v0h0 v0h0Var = xcz.y;
                Object objF = xczVar.f(iIntValue - 1, 0, yjeVar);
                return objF == wne.f39444a ? objF : Unit.f46060a;
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                if (((Number) pz40Var.getValue()).intValue() >= iIntValue2) {
                    return Unit.f46060a;
                }
                pz40Var.setValue(Integer.valueOf(iIntValue2));
                v0h0 v0h0Var2 = xcz.y;
                Object objF2 = xczVar.f(iIntValue2 - 1, 0, yjeVar);
                return objF2 == wne.f39444a ? objF2 : Unit.f46060a;
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                if (((Number) pz40Var.getValue()).intValue() >= iIntValue3) {
                    return Unit.f46060a;
                }
                pz40Var.setValue(Integer.valueOf(iIntValue3));
                v0h0 v0h0Var3 = xcz.y;
                Object objF3 = xczVar.f(iIntValue3 - 1, 0, yjeVar);
                return objF3 == wne.f39444a ? objF3 : Unit.f46060a;
            default:
                int iIntValue4 = ((Number) obj).intValue();
                if (((Number) pz40Var.getValue()).intValue() >= iIntValue4) {
                    return Unit.f46060a;
                }
                pz40Var.setValue(Integer.valueOf(iIntValue4));
                v0h0 v0h0Var4 = xcz.y;
                Object objF4 = xczVar.f(iIntValue4 - 1, 0, yjeVar);
                return objF4 == wne.f39444a ? objF4 : Unit.f46060a;
        }
    }
}
