package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q960 extends v73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28333a;
    public final int b;
    public final int c;
    public final kkf0 d;
    public final ArrayList e;
    public final int f;

    public q960(int i, int i2, int i3, kkf0 kkf0Var, ArrayList arrayList) {
        this.f28333a = i;
        this.b = i2;
        this.c = i3;
        this.d = kkf0Var;
        this.e = arrayList;
        this.f = i3 == -1 ? Integer.MAX_VALUE : ((i3 + 1) * i) + i2;
    }

    @Override // a.v73
    public final void b(hz40 hz40Var, int i, int i2) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            r0d0 r0d0Var = (r0d0) arrayList.get(i3);
            if (!(r0d0Var instanceof q0d0)) {
                boolean z = r0d0Var instanceof t0d0;
                kkf0 kkf0Var = this.d;
                int i4 = this.b;
                if (z) {
                    Object obj = ((t0d0) r0d0Var).f26145a;
                    jlq jlqVar = (jlq) hz40Var.g(obj);
                    if (jlqVar == null) {
                        jlqVar = new jlq();
                    }
                    jlq jlqVar2 = jlqVar;
                    jlqVar2.f24419a.add(new boq0(i4 + i2, this.f28333a, this.c, kkf0Var, (p0d0) r0d0Var));
                    hz40Var.n(obj, jlqVar2);
                } else if (r0d0Var instanceof s0d0) {
                    Object obj2 = ((s0d0) r0d0Var).f26145a;
                    o4d o4dVar = (o4d) hz40Var.g(obj2);
                    if (o4dVar == null) {
                        o4dVar = new o4d();
                    }
                    o4d o4dVar2 = o4dVar;
                    o4dVar2.f24419a.add(new boq0(i4 + i2, this.f28333a, this.c, kkf0Var, (p0d0) r0d0Var));
                    hz40Var.n(obj2, o4dVar2);
                } else if (r0d0Var instanceof v0d0) {
                    Object obj3 = ((v0d0) r0d0Var).f26145a;
                    b390 b390Var = (b390) hz40Var.g(obj3);
                    if (b390Var == null) {
                        b390Var = new b390();
                    }
                    b390 b390Var2 = b390Var;
                    b390Var2.f24419a.add(new boq0(i4 + i2, this.f28333a, this.c, kkf0Var, (p0d0) r0d0Var));
                    hz40Var.n(obj3, b390Var2);
                } else if (!(r0d0Var instanceof u0d0)) {
                    t9f.b();
                    return;
                }
            }
        }
    }

    @Override // a.v73
    public final int c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q960)) {
            return false;
        }
        q960 q960Var = (q960) obj;
        return this.f28333a == q960Var.f28333a && this.b == q960Var.b && this.c == q960Var.c && this.d == q960Var.d && this.e.equals(q960Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f28333a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("ObjectAnimator(duration=", this.f28333a, ", startDelay=", ", repeatCount=", this.b);
        sbT.append(this.c);
        sbT.append(", repeatMode=");
        sbT.append(this.d);
        sbT.append(", holders=");
        return rz4.n(sbT, this.e, Separators.RPAREN);
    }
}
