package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fms0 implements l0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9801a = new HashMap();
    public final HashMap b = new HashMap();
    public final i0t0 c = new i0t0();
    public fhn d = null;
    public float e = 0.0f;
    public yls0 f = null;
    public final viq g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public fms0(viq viqVar) {
        this.g = viqVar;
    }

    public final ems0 a(int i, String str) {
        HashMap map = this.b;
        ems0 ems0Var = (ems0) map.get(str);
        if (ems0Var == null) {
            ems0Var = new ems0();
            ems0Var.e = true;
            new vjy((byte) 0);
            ems0Var.i = -1;
            vdv0 vdv0Var = new vdv0();
            ems0Var.f8063a = vdv0Var;
            vdv0 vdv0Var2 = new vdv0();
            ems0Var.b = vdv0Var2;
            vdv0 vdv0Var3 = new vdv0();
            ems0Var.c = vdv0Var3;
            ywu ywuVar = new ywu(vdv0Var);
            ems0Var.f = ywuVar;
            ywu ywuVar2 = new ywu(vdv0Var2);
            ems0Var.g = ywuVar2;
            ems0Var.h = new ywu(vdv0Var3);
            zr40 zr40Var = new zr40();
            zr40Var.b = 0;
            zr40Var.c = new qt40();
            zr40Var.d = new qt40();
            zr40Var.e = new bs40();
            zr40Var.f = new bs40();
            zr40Var.i = Float.NaN;
            zr40Var.j = 0.0f;
            zr40Var.k = 1.0f;
            zr40Var.q = new float[4];
            zr40Var.r = new ArrayList();
            zr40Var.s = new float[1];
            zr40Var.t = new ArrayList();
            zr40Var.x = -1;
            zr40Var.y = -1;
            zr40Var.z = -1;
            zr40Var.A = Float.NaN;
            zr40Var.B = null;
            zr40Var.f44837a = ywuVar;
            ems0Var.d = zr40Var;
            zr40Var.j(ywuVar);
            zr40Var.i(ywuVar2);
            this.c.d(zr40Var);
            i0t0 i0t0Var = ((vdv0) ywuVar.b).s;
            if (i0t0Var != null) {
                i0t0Var.d(zr40Var);
            }
            map.put(str, ems0Var);
        }
        return ems0Var;
    }

    public final void b(int i, float f, int i2) {
        if (this.n) {
            int i3 = this.h;
            this.l = (int) (((this.j - i3) * f) + i3 + 0.5f);
            int i4 = this.i;
            this.m = (int) (((this.k - i4) * f) + i4 + 0.5f);
        }
        fhn fhnVar = this.d;
        if (fhnVar != null) {
            f = (float) fhnVar.d(f);
        }
        HashMap map = this.b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((ems0) map.get((String) it.next())).a(i, i2, f, this);
        }
    }

    @Override // a.l0t0
    public final boolean c(int i, int i2) {
        return false;
    }

    @Override // a.l0t0
    public final boolean d(float f, int i) {
        if (i != 706) {
            return false;
        }
        this.e = f;
        return false;
    }

    @Override // a.l0t0
    public final boolean e(int i, String str) {
        if (i != 705) {
            return false;
        }
        this.d = fhn.f(str);
        return false;
    }

    public final void f(l4e l4eVar, int i) {
        float fMin;
        float fMax;
        j4e[] j4eVarArr = l4eVar.U;
        j4e j4eVar = j4eVarArr[0];
        j4e j4eVar2 = j4e.b;
        boolean z = j4eVar == j4eVar2;
        this.n = z;
        this.n = (j4eVarArr[1] == j4eVar2) | z;
        if (i == 0) {
            int iS = l4eVar.s();
            this.h = iS;
            this.l = iS;
            int iM = l4eVar.m();
            this.i = iM;
            this.m = iM;
        } else {
            this.j = l4eVar.s();
            this.k = l4eVar.m();
        }
        ArrayList arrayList = l4eVar.u0;
        int size = arrayList.size();
        ems0[] ems0VarArr = new ems0[size];
        for (int i2 = 0; i2 < size; i2++) {
            k4e k4eVar = (k4e) arrayList.get(i2);
            ems0 ems0VarA = a(i, k4eVar.k);
            zr40 zr40Var = ems0VarA.d;
            ems0VarArr[i2] = ems0VarA;
            zr40 zr40Var2 = ems0VarA.d;
            ywu ywuVar = ems0VarA.f;
            if (i == 0) {
                vdv0 vdv0Var = ems0VarA.f8063a;
                vdv0Var.f37251a = k4eVar;
                vdv0Var.d();
                i0t0 i0t0Var = ((vdv0) ywuVar.b).s;
                if (i0t0Var != null) {
                    i0t0Var.d(ywuVar);
                }
                zr40Var2.j(ywuVar);
                ems0VarA.e = true;
            } else if (i == 1) {
                vdv0 vdv0Var2 = ems0VarA.b;
                vdv0Var2.f37251a = k4eVar;
                vdv0Var2.d();
                zr40Var2.i(ems0VarA.g);
                ems0VarA.e = true;
            }
            String str = zr40Var.c.j;
            if (str != null) {
                zr40Var.Y = a(i, str).d;
            }
        }
        float f = this.e;
        if (f == 0.0f) {
            return;
        }
        boolean z2 = ((double) f) < 0.0d;
        float fAbs = Math.abs(f);
        HashMap map = this.b;
        Iterator it = map.keySet().iterator();
        do {
            fMin = Float.MAX_VALUE;
            fMax = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    qt40 qt40Var = ((ems0) map.get((String) it2.next())).d.d;
                    float f2 = qt40Var.d + qt40Var.e;
                    fMin = Math.min(fMin, f2);
                    fMax = Math.max(fMax, f2);
                }
                Iterator it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    zr40 zr40Var3 = ((ems0) map.get((String) it3.next())).d;
                    qt40 qt40Var2 = zr40Var3.d;
                    float f3 = qt40Var2.d + qt40Var2.e;
                    float f4 = fMax - fMin;
                    float f5 = fAbs - (((f3 - fMin) * fAbs) / f4);
                    if (z2) {
                        f5 = fAbs - (((fMax - f3) / f4) * fAbs);
                    }
                    zr40Var3.k = 1.0f / (1.0f - fAbs);
                    zr40Var3.j = f5;
                }
                return;
            }
        } while (Float.isNaN(((ems0) map.get((String) it.next())).d.i));
        Iterator it4 = map.keySet().iterator();
        while (it4.hasNext()) {
            float f6 = ((ems0) map.get((String) it4.next())).d.i;
            if (!Float.isNaN(f6)) {
                fMin = Math.min(fMin, f6);
                fMax = Math.max(fMax, f6);
            }
        }
        Iterator it5 = map.keySet().iterator();
        while (it5.hasNext()) {
            zr40 zr40Var4 = ((ems0) map.get((String) it5.next())).d;
            float f7 = zr40Var4.i;
            if (!Float.isNaN(f7)) {
                float f8 = 1.0f / (1.0f - fAbs);
                float f9 = fMax - fMin;
                float f10 = fAbs - (((f7 - fMin) * fAbs) / f9);
                if (z2) {
                    f10 = fAbs - (((fMax - f7) / f9) * fAbs);
                }
                zr40Var4.k = f8;
                zr40Var4.j = f10;
            }
        }
    }
}
