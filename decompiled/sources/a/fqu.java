package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class fqu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final twz f9992a;

    public fqu(twz twzVar, byte b) {
        twzVar.getClass();
        switch (b) {
            case 1:
                this.f9992a = twzVar;
                break;
            case 2:
                this.f9992a = twzVar;
                break;
            case 3:
                this.f9992a = twzVar;
                break;
            default:
                this.f9992a = twzVar;
                break;
        }
    }

    public Object a(bnn0 bnn0Var) {
        kwz kwzVar = this.f9992a.c;
        if (kwzVar.b == 0) {
            kwzVar.b = System.currentTimeMillis();
        }
        kwzVar.f = System.currentTimeMillis();
        kwzVar.h = System.currentTimeMillis();
        kwzVar.i = false;
        qoj0 qoj0Var = kwzVar.d;
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
