package a;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class bns0 extends gms0 {
    public ArrayList j1;
    public boolean k1;
    public int l1;
    public boolean m1;
    public int n1;

    public bns0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j1 = new ArrayList();
        this.k1 = true;
        this.m1 = false;
        this.n1 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x4d0.m);
        V(zsm0.p(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // a.gms0
    public final boolean B() {
        for (int i = 0; i < this.j1.size(); i++) {
            if (((gms0) this.j1.get(i)).B()) {
                return true;
            }
        }
        return false;
    }

    @Override // a.gms0
    public final void G(ViewGroup viewGroup) {
        super.G(viewGroup);
        int size = this.j1.size();
        for (int i = 0; i < size; i++) {
            ((gms0) this.j1.get(i)).G(viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.gms0
    public final void H() {
        this.Y = 0L;
        ans0 ans0Var = new ans0(this, 0 == true ? 1 : 0);
        for (int i = 0; i < this.j1.size(); i++) {
            gms0 gms0Var = (gms0) this.j1.get(i);
            gms0Var.a(ans0Var);
            gms0Var.H();
            long j = gms0Var.Y;
            boolean z = this.k1;
            long j2 = this.Y;
            if (z) {
                this.Y = Math.max(j2, j);
            } else {
                gms0Var.Z = j2;
                this.Y = j2 + j;
            }
        }
    }

    @Override // a.gms0
    public final gms0 I(dms0 dms0Var) {
        super.I(dms0Var);
        return this;
    }

    @Override // a.gms0
    public final void J(View view) {
        super.J(view);
        int size = this.j1.size();
        for (int i = 0; i < size; i++) {
            ((gms0) this.j1.get(i)).J(view);
        }
    }

    @Override // a.gms0
    public final void K() {
        ArrayList arrayList;
        if (this.j1.isEmpty()) {
            S();
            r();
            return;
        }
        ans0 ans0Var = new ans0();
        ans0Var.b = this;
        Iterator it = this.j1.iterator();
        while (it.hasNext()) {
            ((gms0) it.next()).a(ans0Var);
        }
        this.l1 = this.j1.size();
        if (this.k1) {
            Iterator it2 = this.j1.iterator();
            while (it2.hasNext()) {
                ((gms0) it2.next()).K();
            }
            return;
        }
        int i = 1;
        while (true) {
            int size = this.j1.size();
            arrayList = this.j1;
            if (i >= size) {
                break;
            }
            ((gms0) arrayList.get(i - 1)).a(new ans0((gms0) this.j1.get(i), (byte) 2));
            i++;
        }
        gms0 gms0Var = (gms0) arrayList.get(0);
        if (gms0Var != null) {
            gms0Var.K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // a.gms0
    public final void L(long j, long j2) {
        long j3;
        long j4 = this.Y;
        long j5 = 0;
        if (this.n != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.w = false;
            F(this, v4i0.b, z);
        }
        if (!this.k1) {
            int size = 1;
            while (true) {
                int size2 = this.j1.size();
                ArrayList arrayList = this.j1;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (((gms0) arrayList.get(size)).Z > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.j1.size()) {
                        gms0 gms0Var = (gms0) this.j1.get(i);
                        long j6 = gms0Var.Z;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        gms0Var.L(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    gms0 gms0Var2 = (gms0) this.j1.get(i);
                    long j8 = gms0Var2.Z;
                    long j9 = j - j8;
                    gms0Var2.L(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.n != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.w = true;
                }
                F(this, v4i0.c, z);
            }
        }
        for (int i2 = 0; i2 < this.j1.size(); i2++) {
            ((gms0) this.j1.get(i2)).L(j, j2);
        }
        j3 = j5;
        if (this.n != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.w = true;
            }
            F(this, v4i0.c, z);
        }
    }

    @Override // a.gms0
    public final void M(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.j1) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gms0) this.j1.get(i)).M(j);
        }
    }

    @Override // a.gms0
    public final void N(vsm0 vsm0Var) {
        this.n1 |= 8;
        int size = this.j1.size();
        for (int i = 0; i < size; i++) {
            ((gms0) this.j1.get(i)).N(vsm0Var);
        }
    }

    @Override // a.gms0
    public final void O(TimeInterpolator timeInterpolator) {
        this.n1 |= 1;
        ArrayList arrayList = this.j1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gms0) this.j1.get(i)).O(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // a.gms0
    public final void P(f290 f290Var) {
        super.P(f290Var);
        this.n1 |= 4;
        if (this.j1 != null) {
            for (int i = 0; i < this.j1.size(); i++) {
                ((gms0) this.j1.get(i)).P(f290Var);
            }
        }
    }

    @Override // a.gms0
    public final void Q(saj sajVar) {
        this.A = sajVar;
        this.n1 |= 2;
        int size = this.j1.size();
        for (int i = 0; i < size; i++) {
            ((gms0) this.j1.get(i)).Q(sajVar);
        }
    }

    @Override // a.gms0
    public final void R(long j) {
        this.b = j;
    }

    @Override // a.gms0
    public final String T(String str) {
        String strT = super.T(str);
        for (int i = 0; i < this.j1.size(); i++) {
            StringBuilder sbT = brm0.t(strT, Separators.RETURN);
            sbT.append(((gms0) this.j1.get(i)).T(str.concat("  ")));
            strT = sbT.toString();
        }
        return strT;
    }

    public final void U(gms0 gms0Var) {
        this.j1.add(gms0Var);
        gms0Var.n = this;
        long j = this.c;
        if (j >= 0) {
            gms0Var.M(j);
        }
        if ((this.n1 & 1) != 0) {
            gms0Var.O(this.d);
        }
        if ((this.n1 & 2) != 0) {
            gms0Var.Q(this.A);
        }
        if ((this.n1 & 4) != 0) {
            gms0Var.P(this.B);
        }
        if ((this.n1 & 8) != 0) {
            gms0Var.N(null);
        }
    }

    public final void V(int i) {
        if (i == 0) {
            this.k1 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(twn.m(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.k1 = false;
        }
    }

    @Override // a.gms0
    public final void b(int i) {
        for (int i2 = 0; i2 < this.j1.size(); i2++) {
            ((gms0) this.j1.get(i2)).b(i);
        }
        super.b(i);
    }

    @Override // a.gms0
    public final void c(Class cls) {
        for (int i = 0; i < this.j1.size(); i++) {
            ((gms0) this.j1.get(i)).c(cls);
        }
        super.c(cls);
    }

    @Override // a.gms0
    public final void cancel() {
        super.cancel();
        int size = this.j1.size();
        for (int i = 0; i < size; i++) {
            ((gms0) this.j1.get(i)).cancel();
        }
    }

    @Override // a.gms0
    public final void d(String str) {
        for (int i = 0; i < this.j1.size(); i++) {
            ((gms0) this.j1.get(i)).d(str);
        }
        super.d(str);
    }

    @Override // a.gms0
    public final void f(mns0 mns0Var) {
        View view = mns0Var.b;
        if (D(view)) {
            for (gms0 gms0Var : this.j1) {
                if (gms0Var.D(view)) {
                    gms0Var.f(mns0Var);
                    mns0Var.c.add(gms0Var);
                }
            }
        }
    }

    @Override // a.gms0
    public final void h(mns0 mns0Var) {
        super.h(mns0Var);
        int size = this.j1.size();
        for (int i = 0; i < size; i++) {
            ((gms0) this.j1.get(i)).h(mns0Var);
        }
    }

    @Override // a.gms0
    public final void i(mns0 mns0Var) {
        View view = mns0Var.b;
        if (D(view)) {
            for (gms0 gms0Var : this.j1) {
                if (gms0Var.D(view)) {
                    gms0Var.i(mns0Var);
                    mns0Var.c.add(gms0Var);
                }
            }
        }
    }

    @Override // a.gms0
    /* JADX INFO: renamed from: n */
    public final gms0 clone() {
        bns0 bns0Var = (bns0) super.clone();
        bns0Var.j1 = new ArrayList();
        int size = this.j1.size();
        for (int i = 0; i < size; i++) {
            gms0 gms0VarClone = ((gms0) this.j1.get(i)).clone();
            bns0Var.j1.add(gms0VarClone);
            gms0VarClone.n = bns0Var;
        }
        return bns0Var;
    }

    @Override // a.gms0
    public final void p(ViewGroup viewGroup, n660 n660Var, n660 n660Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.j1.size();
        for (int i = 0; i < size; i++) {
            gms0 gms0Var = (gms0) this.j1.get(i);
            if (j > 0 && (this.k1 || i == 0)) {
                long j2 = gms0Var.b;
                if (j2 > 0) {
                    gms0Var.R(j2 + j);
                } else {
                    gms0Var.R(j);
                }
            }
            gms0Var.p(viewGroup, n660Var, n660Var2, arrayList, arrayList2);
        }
    }

    @Override // a.gms0
    public final void s(int i) {
        for (int i2 = 0; i2 < this.j1.size(); i2++) {
            ((gms0) this.j1.get(i2)).s(i);
        }
        super.s(i);
    }

    @Override // a.gms0
    public final void t(Class cls) {
        for (int i = 0; i < this.j1.size(); i++) {
            ((gms0) this.j1.get(i)).t(cls);
        }
        super.t(cls);
    }

    @Override // a.gms0
    public final void u(String str) {
        for (int i = 0; i < this.j1.size(); i++) {
            ((gms0) this.j1.get(i)).u(str);
        }
        super.u(str);
    }
}
