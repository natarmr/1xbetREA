package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class fnd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vwb0 f9831a;
    public final qoj0 b = roj0.b(0, 0, null, 7);

    public fnd0(vwb0 vwb0Var) {
        this.f9831a = vwb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        dnd0 dnd0Var;
        if (zjeVar instanceof dnd0) {
            dnd0Var = (dnd0) zjeVar;
            int i = dnd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnd0Var.k = i - Integer.MIN_VALUE;
            } else {
                dnd0Var = new dnd0(this, zjeVar);
            }
        } else {
            dnd0Var = new dnd0(this, zjeVar);
        }
        Object obj = dnd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dnd0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            dnd0Var.k = 1;
            Object objA = this.b.a(Boolean.FALSE, dnd0Var);
            if (objA != wneVar) {
                objA = Unit.f46060a;
            }
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        vwb0 vwb0Var = this.f9831a;
        vwb0Var.e("is_enabled", false);
        vwb0Var.h("sum_string", "-1.0");
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, yje yjeVar) {
        end0 end0Var;
        if (yjeVar instanceof end0) {
            end0Var = (end0) yjeVar;
            int i = end0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                end0Var.l = i - Integer.MIN_VALUE;
            } else {
                end0Var = new end0(this, yjeVar);
            }
        } else {
            end0Var = new end0(this, yjeVar);
        }
        Object obj = end0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = end0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            end0Var.i = z;
            end0Var.l = 1;
            Object objA = this.b.a(Boolean.valueOf(z), end0Var);
            if (objA != wneVar) {
                objA = Unit.f46060a;
            }
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = end0Var.i;
            z1x.P(obj);
        }
        this.f9831a.e("is_enabled", z);
        return Unit.f46060a;
    }
}
