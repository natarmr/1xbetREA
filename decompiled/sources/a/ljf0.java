package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ljf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20148a;

    public ljf0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 4:
                this.f20148a = new rta0(gii0Var, (byte) 25);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f20148a = new enj0(gii0Var, (byte) 3);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f20148a = new enj0(gii0Var, (byte) 7);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.f20148a = new enj0(gii0Var, (byte) 8);
                break;
            default:
                this.f20148a = new rta0(gii0Var, (byte) 23);
                break;
        }
    }

    public wdu a() {
        o3c o3cVar = (o3c) this.f20148a;
        return new wdu((Object) new lhf0((uzc) o3cVar.f24576a, o3cVar.v(), (ehf0) o3cVar.e), (Object) new ocl(o3cVar.v()), (Object) ((gbi) ((lsn) o3cVar.f).f20589a).k(), o3cVar.g, (Object) ((cs00) o3cVar.h).d(), (Object) new yk50((Object) o3cVar.v(), (byte) 26), o3cVar.i, o3cVar.j, o3cVar.k, (byte) 3);
    }

    public Object b(long j, zje zjeVar) {
        Object objA = ((q530) this.f20148a).f28131a.c.a(new Long(j), zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public void c(ArrayList arrayList) {
        y3v y3vVar = (y3v) ((iw20) this.f20148a).f15470a;
        vby vbyVar = (vby) y3vVar.c;
        vbyVar.getClass();
        ((vwb0) y3vVar.b).h("saved_section_quick_available", vbyVar.d(new zw3(okx.f25427a, (byte) 0), arrayList));
    }

    public void d(boolean z) {
        ((tnc0) this.f20148a).b.b = z;
    }

    public void e(zzc0 zzc0Var, Object obj) {
        HashMap map = (HashMap) this.f20148a;
        if (obj == null) {
            map.remove(zzc0Var);
        } else {
            map.put(zzc0Var, obj);
        }
    }

    public ljf0(r200 r200Var) {
        r200Var.getClass();
        this.f20148a = r200Var;
    }

    public ljf0(tnc0 tnc0Var) {
        tnc0Var.getClass();
        this.f20148a = tnc0Var;
    }

    public ljf0(g6m0 g6m0Var) {
        g6m0Var.getClass();
        this.f20148a = g6m0Var;
    }

    public ljf0(ost0 ost0Var) {
        ost0Var.getClass();
        this.f20148a = ost0Var;
    }

    public ljf0(neu0 neu0Var) {
        neu0Var.getClass();
        this.f20148a = neu0Var;
    }

    public ljf0(m6d0 m6d0Var) {
        m6d0Var.getClass();
        this.f20148a = m6d0Var;
    }

    public ljf0(g1q0 g1q0Var) {
        g1q0Var.getClass();
        this.f20148a = g1q0Var;
    }

    public ljf0(q530 q530Var) {
        q530Var.getClass();
        this.f20148a = q530Var;
    }

    public /* synthetic */ ljf0(Object obj) {
        this.f20148a = obj;
    }

    public ljf0(xjj0 xjj0Var) {
        q7d0 q7d0Var = (q7d0) xjj0Var.f40988a;
        q7d0Var.getClass();
        this.f20148a = new yqc(q7d0Var, (byte) 19);
    }

    public ljf0() {
        this.f20148a = new HashMap(3);
    }

    public ljf0(j1q0 j1q0Var, rtu rtuVar, ort ortVar, x1u x1uVar, ieu ieuVar, cs00 cs00Var, lsn lsnVar, gii0 gii0Var, ehf0 ehf0Var, knf0 knf0Var, uzc uzcVar, v8v v8vVar, pru pruVar) {
        j1q0Var.getClass();
        cs00Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        uzcVar.getClass();
        v8vVar.getClass();
        this.f20148a = new o3c(lsnVar, cs00Var, rtuVar, ortVar, x1uVar, gii0Var, ehf0Var, v8vVar, uzcVar, knf0Var, pruVar);
    }
}
