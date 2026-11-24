package a;

import android.gov.nist.core.Separators;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ydv0 {
    public static int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f42459a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.f42459a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                ydv0 ydv0Var = (ydv0) arrayList.get(i);
                if (this.e == ydv0Var.b) {
                    c(this.c, ydv0Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(p900 p900Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f42459a;
        if (arrayList.size() == 0) {
            return 0;
        }
        l4e l4eVar = (l4e) ((k4e) arrayList.get(0)).V;
        p900Var.t();
        l4eVar.c(p900Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((k4e) arrayList.get(i2)).c(p900Var, false);
        }
        if (i == 0 && l4eVar.D0 > 0) {
            cfx0.A(l4eVar, p900Var, arrayList, 0);
        }
        if (i == 1 && l4eVar.E0 > 0) {
            cfx0.A(l4eVar, p900Var, arrayList, 1);
        }
        try {
            p900Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + Separators.RETURN + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(Separators.COMMA, "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            k4e k4eVar = (k4e) arrayList.get(i3);
            wxs0 wxs0Var = new wxs0((byte) 14);
            new WeakReference(k4eVar);
            p900.n(k4eVar.J);
            p900.n(k4eVar.K);
            p900.n(k4eVar.L);
            p900.n(k4eVar.M);
            p900.n(k4eVar.N);
            this.d.add(wxs0Var);
        }
        if (i == 0) {
            iN = p900.n(l4eVar.J);
            iN2 = p900.n(l4eVar.L);
            p900Var.t();
        } else {
            iN = p900.n(l4eVar.K);
            iN2 = p900.n(l4eVar.M);
            p900Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, ydv0 ydv0Var) {
        int i2 = ydv0Var.b;
        for (k4e k4eVar : this.f42459a) {
            ArrayList arrayList = ydv0Var.f42459a;
            if (!arrayList.contains(k4eVar)) {
                arrayList.add(k4eVar);
            }
            if (i == 0) {
                k4eVar.s0 = i2;
            } else {
                k4eVar.t0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(" [");
        String strJ = rz4.j(this.b, "] <", sb);
        for (k4e k4eVar : this.f42459a) {
            StringBuilder sbT = brm0.t(strJ, Separators.SP);
            sbT.append(k4eVar.k0);
            strJ = sbT.toString();
        }
        return strJ.concat(" >");
    }
}
