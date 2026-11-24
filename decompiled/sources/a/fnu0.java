package a;

import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class fnu0 implements eot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f9855a;
    public final ipt0 e;
    public final s0a f;
    public final s0a g;
    public final HashSet i;
    public final HashMap j;
    public final ksf0 k;
    public final ksf0 l;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final wx9 h = new wx9(this);

    public fnu0(s0a s0aVar, s0a s0aVar2, HashSet hashSet, ipt0 ipt0Var, b0l0 b0l0Var) {
        this.f = s0aVar;
        this.g = s0aVar2;
        this.e = ipt0Var;
        this.f9855a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            fot0 fot0Var = (fot0) it.next();
            map.put(fot0Var, fot0Var.q(s0aVar.h(), null, fot0Var.g(true, ipt0Var)));
        }
        this.j = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.i = hashSet2;
        this.k = new ksf0(s0aVar, hashSet2);
        if (this.g != null) {
            this.l = new ksf0(this.g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            fot0 fot0Var2 = (fot0) it2.next();
            this.d.put(fot0Var2, Boolean.FALSE);
            this.c.put(fot0Var2, new enu0(s0aVar, this, b0l0Var));
        }
    }

    public static void t(cmn0 cmn0Var, hzj hzjVar, xii0 xii0Var) {
        cmn0Var.d();
        try {
            ofm0.m();
            cmn0Var.a();
            bmn0 bmn0Var = cmn0Var.l;
            bmn0Var.g(hzjVar, new yln0(bmn0Var, (byte) 0));
        } catch (gzj unused) {
            vii0 vii0Var = xii0Var.f;
            if (vii0Var != null) {
                vii0Var.a(xii0Var);
            }
        }
    }

    public static hzj u(fot0 fot0Var) {
        List listB = fot0Var instanceof mzw ? fot0Var.p.b() : Collections.unmodifiableList(fot0Var.p.g.f33457a);
        z1x.y(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (hzj) listB.get(0);
        }
        return null;
    }

    @Override // a.eot0
    public final void c(fot0 fot0Var) {
        ofm0.m();
        if (x(fot0Var)) {
            this.d.put(fot0Var, Boolean.FALSE);
            cmn0 cmn0VarW = w(fot0Var);
            ofm0.m();
            cmn0VarW.a();
            cmn0VarW.l.a();
        }
    }

    @Override // a.eot0
    public final void i(fot0 fot0Var) {
        ofm0.m();
        if (x(fot0Var)) {
            cmn0 cmn0VarW = w(fot0Var);
            hzj hzjVarU = u(fot0Var);
            if (hzjVarU != null) {
                t(cmn0VarW, hzjVarU, fot0Var.p);
                return;
            }
            ofm0.m();
            cmn0VarW.a();
            cmn0VarW.l.a();
        }
    }

    @Override // a.eot0
    public final void j(fot0 fot0Var) {
        ofm0.m();
        if (x(fot0Var)) {
            return;
        }
        this.d.put(fot0Var, Boolean.TRUE);
        hzj hzjVarU = u(fot0Var);
        if (hzjVarU != null) {
            t(w(fot0Var), hzjVarU, fot0Var.p);
        }
    }

    @Override // a.eot0
    public final void l(fot0 fot0Var) {
        hzj hzjVarU;
        ofm0.m();
        cmn0 cmn0VarW = w(fot0Var);
        if (x(fot0Var) && (hzjVarU = u(fot0Var)) != null) {
            t(cmn0VarW, hzjVarU, fot0Var.p);
        }
    }

    public final l45 s(fot0 fot0Var, ksf0 ksf0Var, s0a s0aVar, cmn0 cmn0Var, int i, boolean z) {
        int i2;
        int iB = s0aVar.a().B(i);
        boolean zE = jls0.e(cmn0Var.b);
        fpt0 fpt0Var = (fpt0) this.j.get(fot0Var);
        Objects.requireNonNull(fpt0Var);
        jtb0 jtb0VarB = ksf0Var.b(fpt0Var, cmn0Var.d, jls0.b(cmn0Var.b), z);
        Rect rect = jtb0VarB.f17091a;
        Size size = jtb0VarB.b;
        int i3 = jls0.i((cmn0Var.i + s0aVar.a().B(((w0x) fot0Var.i).s(0))) - iB);
        boolean zP = fot0Var.p(s0aVar) ^ zE;
        if (fot0Var instanceof oub0) {
            i2 = 1;
        } else {
            i2 = fot0Var instanceof mzw ? 4 : 2;
        }
        return new l45(UUID.randomUUID(), i2, fot0Var instanceof mzw ? 256 : 34, rect, jls0.g(i3, size), i3, zP);
    }

    public final HashMap v(cmn0 cmn0Var, boolean z) {
        HashMap map = new HashMap();
        for (fot0 fot0Var : this.f9855a) {
            fpt0 fpt0Var = (fpt0) this.j.get(fot0Var);
            Objects.requireNonNull(fpt0Var);
            Size size = this.k.b(fpt0Var, cmn0Var.d, jls0.b(cmn0Var.b), z).c;
            map.put(fot0Var, size);
            l8x.U("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + fot0Var);
        }
        return map;
    }

    public final cmn0 w(fot0 fot0Var) {
        cmn0 cmn0Var = (cmn0) this.b.get(fot0Var);
        Objects.requireNonNull(cmn0Var);
        return cmn0Var;
    }

    public final boolean x(fot0 fot0Var) {
        Boolean bool = (Boolean) this.d.get(fot0Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void y(HashMap map, HashMap map2) {
        HashMap map3 = this.b;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            fot0 fot0Var = (fot0) entry.getKey();
            cmn0 cmn0Var = (cmn0) entry.getValue();
            fot0Var.C(cmn0Var.d);
            fot0Var.B(cmn0Var.b);
            qgd qgdVarB = cmn0Var.g.b();
            Size size = (Size) map2.get(fot0Var);
            if (size != null) {
                qgdVarB.c = size;
            }
            fot0Var.F(qgdVarB.i(), null);
            fot0Var.s();
        }
    }
}
