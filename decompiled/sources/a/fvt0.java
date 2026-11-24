package a;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class fvt0 implements pf00, nae0, Callback, dfn0, xac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10231a;

    public fvt0() {
        wy40 wy40VarL = wy40.l();
        this.f10231a = wy40VarL;
        u15 u15Var = xto0.A0;
        Class cls = (Class) wy40VarL.e(u15Var, null);
        if (cls != null && !cls.equals(j4a.class)) {
            itt0.l("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        wy40VarL.y(u15Var, j4a.class);
        u15 u15Var2 = xto0.z0;
        if (wy40VarL.e(u15Var2, null) == null) {
            wy40VarL.y(u15Var2, j4a.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public static void m(fvt0 fvt0Var, float f, float f2, int i) {
        nr nrVar = (nr) fvt0Var.f10231a;
        if ((i & 4) != 0) {
            f = Float.intBitsToFloat((int) (nrVar.p() >> 32));
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = Float.intBitsToFloat((int) (nrVar.p() & 4294967295L));
        }
        fvt0Var.k(0.0f, 0.0f, f3, f2, 1);
    }

    public void A(float f, float f2) {
        ((nr) this.f10231a).i().g(f, f2);
    }

    @Override // a.dfn0
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // okhttp3.Callback
    public void b(Call call, IOException iOException) {
        n5a n5aVar = (n5a) this.f10231a;
        e0g0 e0g0Var = j0g0.b;
        n5aVar.resumeWith(new g0g0(iOException));
    }

    @Override // a.pf00
    public void c(int i, int i2) {
        ((yge0) this.f10231a).k(i, i2);
    }

    @Override // a.pf00
    public void d(int i, int i2) {
        ((yge0) this.f10231a).l(i, i2);
    }

    @Override // a.dfn0
    public List e(long j) {
        return j >= 0 ? (List) this.f10231a : Collections.EMPTY_LIST;
    }

    @Override // a.pf00
    public void f(int i, int i2, Object obj) {
        ((yge0) this.f10231a).j(i, i2, obj);
    }

    @Override // a.pf00
    public void g(int i, int i2) {
        ((yge0) this.f10231a).i(i, i2);
    }

    @Override // okhttp3.Callback
    public void h(Call call, Response response) {
        ((n5a) this.f10231a).v(response, tv9.b);
    }

    public void i(w03 w03Var) {
        ((nr) this.f10231a).i().c(w03Var);
    }

    @Override // a.dfn0
    public long j(int i) {
        x0x.A(i == 0);
        return 0L;
    }

    public void k(float f, float f2, float f3, float f4, int i) {
        ((nr) this.f10231a).i().f(f, f2, f3, f4, i);
    }

    @Override // a.dfn0
    public int l() {
        return 1;
    }

    public kki o() {
        esg0 esg0Var = (esg0) this.f10231a;
        return new kki((rkc0) esg0Var.f8326a, (fhj) esg0Var.b, (ntu) esg0Var.c, (iqt) esg0Var.d, (wtt) esg0Var.e);
    }

    public wyb p() {
        return new wyb(((h7i) this.f10231a).a());
    }

    public uut0 q() {
        List list = uut0.j;
        nmt0 nmt0Var = (nmt0) this.f10231a;
        nmt0Var.getClass();
        List<String> list2 = uut0.j;
        HashMap map = new HashMap(list2.size());
        for (String str : list2) {
            str.getClass();
            String string = ((SharedPreferences) nmt0Var.f23789a).getString(str, null);
            if (string != null) {
                map.put(str, string);
            }
        }
        if (map.containsKey("access_token") && map.containsKey("user_id")) {
            return new uut0(map);
        }
        return null;
    }

    public hsj r() {
        h7i h7iVar = (h7i) this.f10231a;
        return new hsj(h7iVar.c, new n31(new xzp((gii0) h7iVar.h, (x2c0) h7iVar.i), (knf0) h7iVar.j, (j51) h7iVar.k, (x2c0) h7iVar.i, (btt0) h7iVar.l));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:12|13|66|22|(1:25)|61) */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r6 = r10;
        r10 = r11;
        r11 = r0;
        r0 = r2;
        r2 = r12;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
    
        if ((r12 instanceof a.zhi0) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
    
        if (r7.f != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        if (a.hic.C(r12) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        if (r10 > 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r10, "error (", "): ", r12));
        r0.l = r6;
        r0.i = r2;
        r0.j = r11;
        r0.k = r10;
        r0.o = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
    
        if (a.qcc.O(3000, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fe, code lost:
    
        r10 = a.j0g0.b;
        r12 = new a.g0g0(r12);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00fb -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable s(int r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fvt0.s(int, a.zje):java.io.Serializable");
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Boolean n(Fragment fragment, iiy iiyVar) {
        boolean zBooleanValue;
        fragment.getClass();
        iiyVar.getClass();
        Boolean bool = (Boolean) this.f10231a;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Bundle bundle = fragment.g;
            Boolean boolValueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean("FULL_SCREEN_ANIMATION_FIX", false)) : null;
            this.f10231a = boolValueOf;
            zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public void u(float f, float f2, float f3, float f4) {
        nr nrVar = (nr) this.f10231a;
        x5a x5aVarI = nrVar.i();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (nrVar.p() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (nrVar.p() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            wcx.a("Width and height must be greater than or equal to zero");
        }
        nrVar.H(jFloatToRawIntBits);
        x5aVarI.g(f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(long j, zje zjeVar) {
        k3c k3cVar;
        if (zjeVar instanceof k3c) {
            k3cVar = (k3c) zjeVar;
            int i = k3cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                k3cVar.k = i - Integer.MIN_VALUE;
            } else {
                k3cVar = new k3c(this, zjeVar);
            }
        } else {
            k3cVar = new k3c(this, zjeVar);
        }
        Object objC = k3cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = k3cVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            sjl0 sjl0Var = (sjl0) this.f10231a;
            k3cVar.k = 1;
            objC = sjl0Var.c(j, k3cVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return Boolean.valueOf(((ril0) objC).e);
    }

    public Object w(npn npnVar, zje zjeVar) throws n7p {
        Long l = (Long) npnVar.d;
        long j = npnVar.f23922a;
        Object objU = ((nr) this.f10231a).u(npnVar.c, npnVar.b, l != null ? new qgb(j, l.longValue()) : new rgb(j), zjeVar);
        return objU == wne.f39444a ? objU : Unit.f46060a;
    }

    public void x(long j) {
        ((ev7) ((mii0) this.f10231a).d).b = j;
    }

    public void y(float f, long j) {
        x5a x5aVarI = ((nr) this.f10231a).i();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        x5aVarI.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        x5aVarI.k(f);
        x5aVarI.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void z(float f, float f2, long j) {
        x5a x5aVarI = ((nr) this.f10231a).i();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        x5aVarI.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        x5aVarI.a(f, f2);
        x5aVarI.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public fvt0(sjl0 sjl0Var) {
        sjl0Var.getClass();
        this.f10231a = sjl0Var;
    }

    public fvt0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 23:
                this.f10231a = new sza(gii0Var, (byte) 7);
                break;
            default:
                this.f10231a = new zm(gii0Var, (byte) 15);
                break;
        }
    }

    public /* synthetic */ fvt0(Object obj) {
        this.f10231a = obj;
    }
}
