package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ock extends ere0 {
    public final mre0 c;
    public final mre0 d;
    public final mre0 e;
    public final mre0 f;
    public final mre0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ock(rgy rgyVar) {
        super(rgyVar);
        rgyVar.getClass();
        this.c = bww.S(null, new mck(this, (byte) 0));
        this.d = bww.S(null, new mck(this, (byte) 1));
        this.e = bww.S(null, new mck(this, (byte) 2));
        this.f = bww.S(null, new mck(this, (byte) 3));
        this.g = bww.S(null, new lhf(this, rgyVar, (byte) 13));
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        Object objInvoke = this.d.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        Object objInvoke = this.c.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // a.qgy
    public final List getParameters() {
        Object objInvoke = this.e.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        Object objInvoke = this.f.invoke();
        objInvoke.getClass();
        return (kiy) objInvoke;
    }

    @Override // a.qgy, a.oiy
    public final List getTypeParameters() {
        Object objInvoke = this.g.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // a.qgy
    public final viy getVisibility() {
        tek visibility = z().getVisibility();
        visibility.getClass();
        swq swqVar = xtt0.f41480a;
        if (visibility.equals(uek.e)) {
            return viy.f37504a;
        }
        if (visibility.equals(uek.c)) {
            return viy.b;
        }
        if (visibility.equals(uek.d)) {
            return viy.c;
        }
        if (visibility.equals(uek.f35533a) || visibility.equals(uek.b)) {
            return viy.d;
        }
        return null;
    }

    @Override // a.dre0
    public final fm40 m() {
        fm40 fm40Var = this.f8277a.b;
        if (fm40Var != null) {
            return fm40Var;
        }
        gm40 gm40VarM = z().m();
        gm40VarM.getClass();
        int iOrdinal = gm40VarM.ordinal();
        if (iOrdinal == 0) {
            return fm40.FINAL;
        }
        if (iOrdinal == 1) {
            return fm40.SEALED;
        }
        if (iOrdinal == 2) {
            return fm40.OPEN;
        }
        if (iOrdinal == 3) {
            return fm40.ABSTRACT;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    public final ArrayList p(boolean z) {
        Pair pair;
        Collection collection;
        mp9 mp9VarZ = z();
        ArrayList arrayList = new ArrayList();
        if (z) {
            c8z c8zVarH = xtt0.h(this);
            if (c8zVarH != null) {
                arrayList.add(new adk(this, arrayList.size(), aiy.f949a, new nck(c8zVarH, (byte) 0)));
            }
            if (mp9VarZ instanceof sfk) {
                sfk sfkVar = (sfk) mp9VarZ;
                pair = new Pair(sfkVar.g1, sfkVar.f1.o);
            } else if (mp9VarZ instanceof rfk) {
                rfk rfkVar = (rfk) mp9VarZ;
                pair = new Pair(rfkVar.Y, rfkVar.B.o);
            } else if (mp9VarZ instanceof b0d0) {
                d0d0 d0d0VarP1 = ((b0d0) mp9VarZ).p1();
                rfk rfkVar2 = d0d0VarP1 instanceof rfk ? (rfk) d0d0VarP1 : null;
                if (rfkVar2 != null) {
                    pair = new Pair(rfkVar2.Y, rfkVar2.B.o);
                } else {
                    pair = null;
                }
            } else {
                pair = null;
            }
            if (pair == null) {
                collection = iun.f15405a;
            } else {
                h950 h950Var = (h950) pair.f46059a;
                List list = (List) pair.b;
                List listW = mp9VarZ.W();
                listW.getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(listW, 10));
                int i = 0;
                for (Object obj : listW) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    c8z c8zVar = (c8z) obj;
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new k3u0(mp9VarZ, null, i, c8zVar.getAnnotations(), g950.d(h950Var.getString(((i4d0) list.get(i)).e)), c8zVar.getType(), false, false, false, null, gmk0.x0));
                    arrayList2 = arrayList3;
                    i = i2;
                    h950Var = h950Var;
                    list = list;
                }
                collection = arrayList2;
            }
            int size = collection.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new adk(this, arrayList.size(), aiy.b, new tfe(collection, i3, (byte) 2)));
            }
            c8z c8zVarF = mp9VarZ.F();
            if (c8zVarF != null) {
                arrayList.add(new adk(this, arrayList.size(), aiy.c, new nck(c8zVarF, (byte) 1)));
            }
        }
        int size2 = mp9VarZ.z().size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.add(new adk(this, arrayList.size(), aiy.d, new tfe(mp9VarZ, i4, (byte) 3)));
        }
        if (fre0.V(this) && (mp9VarZ instanceof o8y) && arrayList.size() > 1) {
            v3d.t(new vt5((byte) 26), arrayList);
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @Override // a.dre0
    public final boolean t() {
        return Intrinsics.d(z().getVisibility(), w8y.f38749a);
    }

    public abstract wdk u();

    public abstract mp9 z();
}
