package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xkw0 extends giw0 {
    public final ArrayList c;
    public final ArrayList d;
    public final h0q0 e;

    public xkw0(String str, ArrayList arrayList, List list, h0q0 h0q0Var) {
        super(str);
        this.c = new ArrayList();
        this.e = h0q0Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.add(((jlw0) it.next()).zzc());
            }
        }
        this.d = new ArrayList(list);
    }

    @Override // a.giw0
    public final jlw0 a(h0q0 h0q0Var, List list) {
        wlw0 wlw0Var;
        h0q0 h0q0VarJ = this.e.J();
        okt0 okt0Var = (okt0) h0q0VarJ.b;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            wlw0Var = jlw0.V0;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                h0q0VarJ.N((String) arrayList.get(i), ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) list.get(i)));
            } else {
                h0q0VarJ.N((String) arrayList.get(i), wlw0Var);
            }
            i++;
        }
        for (jlw0 jlw0Var : this.d) {
            jlw0 jlw0VarS = okt0Var.s(h0q0VarJ, jlw0Var);
            if (jlw0VarS instanceof plw0) {
                jlw0VarS = okt0Var.s(h0q0VarJ, jlw0Var);
            }
            if (jlw0VarS instanceof kgw0) {
                return ((kgw0) jlw0VarS).f18260a;
            }
        }
        return wlw0Var;
    }

    @Override // a.giw0, a.jlw0
    public final jlw0 h() {
        return new xkw0(this);
    }

    public xkw0(xkw0 xkw0Var) {
        super(xkw0Var.f11369a);
        ArrayList arrayList = new ArrayList(xkw0Var.c.size());
        this.c = arrayList;
        arrayList.addAll(xkw0Var.c);
        ArrayList arrayList2 = new ArrayList(xkw0Var.d.size());
        this.d = arrayList2;
        arrayList2.addAll(xkw0Var.d);
        this.e = xkw0Var.e;
    }
}
