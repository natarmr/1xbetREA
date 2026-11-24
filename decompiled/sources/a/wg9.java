package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class wg9 extends xg9 {
    public ArrayList e;

    public wg9(char[] cArr) {
        super(cArr);
        this.e = new ArrayList();
    }

    public final String A(int i) throws ch9 {
        xg9 xg9VarM = m(i);
        if (xg9VarM instanceof eh9) {
            return xg9VarM.c();
        }
        throw new ch9(twn.m(i, "no string at index "), this);
    }

    public final String B(String str) throws ch9 {
        xg9 xg9VarO = o(str);
        if (xg9VarO instanceof eh9) {
            return xg9VarO.c();
        }
        StringBuilder sbN = b1j.n("no string found for key <", str, ">, found [", xg9VarO != null ? xg9VarO.g() : null, "] : ");
        sbN.append(xg9VarO);
        throw new ch9(sbN.toString(), this);
    }

    public final String C(String str) {
        xg9 xg9VarZ = z(str);
        if (xg9VarZ instanceof eh9) {
            return xg9VarZ.c();
        }
        return null;
    }

    public final boolean D(String str) {
        for (xg9 xg9Var : this.e) {
            if ((xg9Var instanceof yg9) && ((yg9) xg9Var).c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList E() {
        ArrayList arrayList = new ArrayList();
        for (xg9 xg9Var : this.e) {
            if (xg9Var instanceof yg9) {
                arrayList.add(((yg9) xg9Var).c());
            }
        }
        return arrayList;
    }

    public final void F(String str, xg9 xg9Var) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            yg9 yg9Var = (yg9) ((xg9) it.next());
            if (yg9Var.c().equals(str)) {
                int size = yg9Var.e.size();
                ArrayList arrayList = yg9Var.e;
                if (size > 0) {
                    arrayList.set(0, xg9Var);
                    return;
                } else {
                    arrayList.add(xg9Var);
                    return;
                }
            }
        }
        yg9 yg9Var2 = new yg9(str.toCharArray());
        yg9Var2.b = 0L;
        yg9Var2.h(str.length() - 1);
        int size2 = yg9Var2.e.size();
        ArrayList arrayList2 = yg9Var2.e;
        if (size2 > 0) {
            arrayList2.set(0, xg9Var);
        } else {
            arrayList2.add(xg9Var);
        }
        this.e.add(yg9Var2);
    }

    @Override // a.xg9
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wg9) {
            return this.e.equals(((wg9) obj).e);
        }
        return false;
    }

    @Override // a.xg9
    public int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(super.hashCode()));
    }

    public final void i(xg9 xg9Var) {
        this.e.add(xg9Var);
    }

    @Override // a.xg9
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public wg9 clone() {
        wg9 wg9Var = (wg9) super.clone();
        ArrayList arrayList = new ArrayList(this.e.size());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            xg9 xg9VarClone = ((xg9) it.next()).clone();
            xg9VarClone.d = wg9Var;
            arrayList.add(xg9VarClone);
        }
        wg9Var.e = arrayList;
        return wg9Var;
    }

    public final xg9 m(int i) throws ch9 {
        if (i < 0 || i >= this.e.size()) {
            throw new ch9(twn.m(i, "no element at index "), this);
        }
        return (xg9) this.e.get(i);
    }

    public final xg9 o(String str) throws ch9 {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            yg9 yg9Var = (yg9) ((xg9) it.next());
            if (yg9Var.c().equals(str)) {
                return yg9Var.G();
            }
        }
        throw new ch9(kng0.l("no element for key <", str, Separators.GREATER_THAN), this);
    }

    public final vg9 p(String str) throws ch9 {
        xg9 xg9VarO = o(str);
        if (xg9VarO instanceof vg9) {
            return (vg9) xg9VarO;
        }
        StringBuilder sbT = kng0.t("no array found for key <", str, ">, found [");
        sbT.append(xg9VarO.g());
        sbT.append("] : ");
        sbT.append(xg9VarO);
        throw new ch9(sbT.toString(), this);
    }

    public final vg9 r(String str) {
        xg9 xg9VarZ = z(str);
        if (xg9VarZ instanceof vg9) {
            return (vg9) xg9VarZ;
        }
        return null;
    }

    public final float s(int i) throws ch9 {
        xg9 xg9VarM = m(i);
        if (xg9VarM != null) {
            return xg9VarM.e();
        }
        throw new ch9(twn.m(i, "no float at index "), this);
    }

    public final float t(String str) throws ch9 {
        xg9 xg9VarO = o(str);
        if (xg9VarO != null) {
            return xg9VarO.e();
        }
        StringBuilder sbT = kng0.t("no float found for key <", str, ">, found [");
        sbT.append(xg9VarO.g());
        sbT.append("] : ");
        sbT.append(xg9VarO);
        throw new ch9(sbT.toString(), this);
    }

    @Override // a.xg9
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (xg9 xg9Var : this.e) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(xg9Var);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final float u(String str) {
        xg9 xg9VarZ = z(str);
        if (xg9VarZ instanceof zg9) {
            return xg9VarZ.e();
        }
        return Float.NaN;
    }

    public final int v(int i) throws ch9 {
        xg9 xg9VarM = m(i);
        if (xg9VarM != null) {
            return xg9VarM.f();
        }
        throw new ch9(twn.m(i, "no int at index "), this);
    }

    public final xg9 w(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return (xg9) this.e.get(i);
    }

    public final xg9 z(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            yg9 yg9Var = (yg9) ((xg9) it.next());
            if (yg9Var.c().equals(str)) {
                return yg9Var.G();
            }
        }
        return null;
    }
}
