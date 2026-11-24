package a;

import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xsu implements cfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41434a;

    public xsu(z300 z300Var) {
        btt0 btt0Var = z300Var.f43696a;
        gii0 gii0Var = z300Var.b;
        cad cadVar = (cad) z300Var.c;
        ctf0 ctf0Var = (ctf0) z300Var.d;
        kuy kuyVar = (kuy) z300Var.e;
        e400 e400Var = (e400) z300Var.f;
        btt0Var.getClass();
        gii0Var.getClass();
        ctf0Var.getClass();
        kuyVar.getClass();
        e400Var.getClass();
        this.f41434a = new rrd(new wsz(), cadVar, btt0Var, gii0Var, kuyVar, e400Var);
    }

    public vsg0 a(String str) {
        str.getClass();
        cyu cyuVar = (cyu) this.f41434a;
        return gfx.R(((zb30) cyuVar.b).f44096a, ibc.w0(30L, bfn.SECONDS), null, new ffd(cyuVar, str, null, (byte) 25), 220);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable b(String str, zje zjeVar) throws Throwable {
        d4v d4vVar;
        if (zjeVar instanceof d4v) {
            d4vVar = (d4v) zjeVar;
            int i = d4vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4vVar.k = i - Integer.MIN_VALUE;
            } else {
                d4vVar = new d4v(this, zjeVar);
            }
        } else {
            d4vVar = new d4v(this, zjeVar);
        }
        Object objV = d4vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = d4vVar.k;
        if (i2 == 0) {
            z1x.P(objV);
            fuj0 fuj0Var = (fuj0) this.f41434a;
            d4vVar.k = 1;
            objV = fuj0Var.v(str, d4vVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objV) {
            uft0 uft0Var = (uft0) obj;
            if (!uft0Var.f35591a.equals("") && !Intrinsics.d(uft0Var.d.f35586a, "") && !Intrinsics.d(uft0Var.e.f35586a, "") && uft0Var.f.b() != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // a.cfr
    public void onFailure(Throwable th) throws Exception {
        ((oyw) this.f41434a).close();
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
    }

    public xsu(khb0 khb0Var) {
        khb0Var.getClass();
        this.f41434a = khb0Var;
    }

    public xsu(rkc0 rkc0Var) {
        rkc0Var.getClass();
        this.f41434a = rkc0Var;
    }

    public xsu(ggm0 ggm0Var) {
        ggm0Var.getClass();
        this.f41434a = ggm0Var;
    }

    public xsu(hm7 hm7Var) {
        hm7Var.getClass();
        this.f41434a = hm7Var;
    }

    public xsu(j9s0 j9s0Var) {
        j9s0Var.getClass();
        this.f41434a = j9s0Var;
    }

    public xsu(gii0 gii0Var) {
        gii0Var.getClass();
        this.f41434a = new tpv(gii0Var, (byte) 1);
    }

    public xsu(y1f0 y1f0Var) {
        y1f0Var.getClass();
        this.f41434a = y1f0Var;
    }

    public /* synthetic */ xsu(Object obj) {
        this.f41434a = obj;
    }

    public xsu(kpd0 kpd0Var) {
        this.f41434a = (IncorrectJpegMetadataQuirk) kpd0Var.b(IncorrectJpegMetadataQuirk.class);
    }
}
