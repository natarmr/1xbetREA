package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class dv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l77 f6725a;

    public dv3(l77 l77Var, byte b) {
        l77Var.getClass();
        switch (b) {
            case 1:
                this.f6725a = l77Var;
                break;
            default:
                this.f6725a = l77Var;
                break;
        }
    }

    public Object a(pdj pdjVar, bnn0 bnn0Var) {
        l77 l77Var = this.f6725a;
        m0w m0wVar = l77Var.f19543a;
        odj odjVar = l77Var.b;
        odjVar.getClass();
        odjVar.f25078a = pdjVar;
        if (pdjVar == pdj.f26809a) {
            m0wVar.e = y2m0.c() - m0wVar.d;
            l77Var.d = 0L;
        }
        qoj0 qoj0Var = l77Var.c;
        Unit unit = Unit.f46060a;
        Object objA = qoj0Var.a(unit, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = unit;
        }
        if (objA != wneVar) {
            objA = unit;
        }
        return objA == wneVar ? objA : unit;
    }
}
