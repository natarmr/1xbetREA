package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class osy extends pry implements ire0 {
    public final ihy c;
    public final String d;
    public final Object e;
    public final dqy f;
    public final a8z g;
    public final a8z h;
    public final a8z i;
    public final a8z j;
    public final a8z k;
    public final a8z l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osy(ihy ihyVar, String str, Object obj, dqy dqyVar, rgy rgyVar) {
        super(rgyVar);
        ihyVar.getClass();
        str.getClass();
        dqyVar.getClass();
        rgyVar.getClass();
        this.c = ihyVar;
        this.d = str;
        this.e = obj;
        this.f = dqyVar;
        wez wezVar = wez.f39042a;
        this.g = maz.a(wezVar, new dsy(this, (byte) 0));
        this.h = maz.a(wezVar, new dsy(this, (byte) 1));
        this.i = maz.a(wezVar, new dsy(this, (byte) 2));
        this.j = maz.a(wezVar, new dsy(this, (byte) 3));
        this.k = maz.a(wezVar, new dsy(this, (byte) 4));
        this.l = maz.a(wezVar, new dsy(this, (byte) 5));
    }

    @Override // a.dre0
    public final bv9 G() {
        u().getClass();
        return null;
    }

    @Override // a.dre0
    public final ihy K() {
        return this.c;
    }

    @Override // a.dre0
    public final Object L() {
        return this.e;
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return (List) this.h.getValue();
    }

    public final boolean equals(Object obj) {
        ire0 ire0VarC = xtt0.c(obj);
        return ire0VarC != null && Intrinsics.d(this.c, ire0VarC.K()) && Intrinsics.d(this.f.b, ire0VarC.getName()) && Intrinsics.d(this.d, ire0VarC.getSignature()) && Intrinsics.d(this.e, ire0VarC.L());
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return t9x.E(this.c, this.d);
    }

    @Override // a.pgy
    public final List getAnnotations() {
        Annotation[] annotations;
        List listG0;
        boolean zR = xvw.R(this);
        dqy dqyVar = this.f;
        ihy ihyVar = this.c;
        if (zR || ihyVar.j().isAnnotation()) {
            ArrayList arrayList = dqyVar.m;
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(jwb.S((voy) it.next(), bqe0.d(ihyVar.j())));
            }
            return arrayList2;
        }
        if (!(ihyVar instanceof zhy)) {
            StringBuilder sb = new StringBuilder("Annotations are only supported for top-level properties for now: ");
            sb.append(ihyVar);
            hny.r(sb, dqyVar.b, this.d);
            return null;
        }
        dqyVar.getClass();
        hfy hfyVar = j0x.v(dqyVar).e;
        if (hfyVar == null) {
            return iun.f15405a;
        }
        Method methodB = ihyVar.B(hfyVar.b, hfyVar.c);
        if (methodB != null && (annotations = methodB.getAnnotations()) != null && (listG0 = tx3.g0(annotations)) != null) {
            return xtt0.t(listG0);
        }
        ohq.u(this, "No synthetic method found: ");
        return null;
    }

    @Override // a.qgy
    public final String getName() {
        return this.f.b;
    }

    @Override // a.qgy
    public final List getParameters() {
        return (List) this.i.getValue();
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return (kiy) this.j.getValue();
    }

    @Override // a.ire0
    public final String getSignature() {
        return this.d;
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        return ((nzs0) this.k.getValue()).f24388a;
    }

    @Override // a.qgy
    public final viy getVisibility() {
        return jwb.b0(j24.b(this.f));
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(this.c.hashCode() * 31, 31, this.f.b);
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        return false;
    }

    @Override // a.dre0
    public final fm40 m() {
        iiy[] iiyVarArr = j24.f15764a;
        dqy dqyVar = this.f;
        dqyVar.getClass();
        return (fm40) j24.q.v(j24.f15764a[35], dqyVar);
    }

    public final Member p() {
        iiy[] iiyVarArr = j24.f15764a;
        dqy dqyVar = this.f;
        dqyVar.getClass();
        if (!j24.s.m(j24.f15764a[42], dqyVar)) {
            return null;
        }
        hfy hfyVar = j0x.v(dqyVar).f;
        if (hfyVar == null) {
            return y();
        }
        return this.c.B(hfyVar.b, hfyVar.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        rv00.k(sb, this);
        sb.append(this instanceof uhy ? "var " : "val ");
        rv00.m(sb, this);
        rv00.l(this.f.b, sb);
        sb.append(": ");
        sb.append(rv00.z(getReturnType(), false));
        return sb.toString();
    }

    public abstract fsy u();

    @Override // a.dre0
    public final bv9 x() {
        return u().x();
    }

    @Override // a.ire0
    public final Field y() {
        return (Field) this.l.getValue();
    }
}
