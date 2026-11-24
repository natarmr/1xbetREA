package a;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fa00 implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a4x f9182a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public fa00(a4x a4xVar, float f, float f2) {
        this.f9182a = a4xVar;
        this.b = f;
        this.c = f2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        Object next;
        Object next2;
        int size;
        a4x a4xVar;
        a4x a4xVar2;
        int iIntValue;
        a4x a4xVar3;
        Integer numValueOf;
        a4x a4xVar4;
        Integer numValueOf2;
        list.getClass();
        a4x a4xVar5 = this.f9182a;
        Iterator<E> it = a4xVar5.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((ua00) next) instanceof ra00));
        ua00 ua00Var = (ua00) next;
        int i = 0;
        if (ua00Var != null) {
            if (ua00Var instanceof pa00) {
                Iterator<E> it2 = a4xVar5.iterator();
                if (!it2.hasNext()) {
                    itt0.a();
                    return null;
                }
                ua00 ua00Var2 = (ua00) it2.next();
                pa00 pa00Var = ua00Var2 instanceof pa00 ? (pa00) ua00Var2 : null;
                if (pa00Var == null || (a4xVar4 = pa00Var.c) == null) {
                    size = 0;
                } else {
                    Iterator<E> it3 = a4xVar4.iterator();
                    if (it3.hasNext()) {
                        numValueOf2 = Integer.valueOf(((p6m0) it3.next()).b.size());
                        while (it3.hasNext()) {
                            Integer numValueOf3 = Integer.valueOf(((p6m0) it3.next()).b.size());
                            if (numValueOf2.compareTo(numValueOf3) < 0) {
                                numValueOf2 = numValueOf3;
                            }
                        }
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        size = numValueOf2.intValue();
                    } else {
                        size = 0;
                    }
                }
                while (it2.hasNext()) {
                    ua00 ua00Var3 = (ua00) it2.next();
                    pa00 pa00Var2 = ua00Var3 instanceof pa00 ? (pa00) ua00Var3 : null;
                    if (pa00Var2 == null || (a4xVar3 = pa00Var2.c) == null) {
                        iIntValue = 0;
                    } else {
                        Iterator<E> it4 = a4xVar3.iterator();
                        if (it4.hasNext()) {
                            numValueOf = Integer.valueOf(((p6m0) it4.next()).b.size());
                            while (it4.hasNext()) {
                                Integer numValueOf4 = Integer.valueOf(((p6m0) it4.next()).b.size());
                                if (numValueOf.compareTo(numValueOf4) < 0) {
                                    numValueOf = numValueOf4;
                                }
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 0;
                        }
                    }
                    if (size < iIntValue) {
                        size = iIntValue;
                    }
                }
            } else if (ua00Var instanceof qa00) {
                Iterator<E> it5 = a4xVar5.iterator();
                if (!it5.hasNext()) {
                    itt0.a();
                    return null;
                }
                ua00 ua00Var4 = (ua00) it5.next();
                qa00 qa00Var = ua00Var4 instanceof qa00 ? (qa00) ua00Var4 : null;
                size = (qa00Var == null || (a4xVar2 = qa00Var.c.b) == null) ? 0 : a4xVar2.size();
                while (it5.hasNext()) {
                    ua00 ua00Var5 = (ua00) it5.next();
                    qa00 qa00Var2 = ua00Var5 instanceof qa00 ? (qa00) ua00Var5 : null;
                    int size2 = (qa00Var2 == null || (a4xVar = qa00Var2.c.b) == null) ? 0 : a4xVar.size();
                    if (size < size2) {
                        size = size2;
                    }
                }
            }
            i = size;
        }
        zcl zclVar = qmk.f28987a;
        int iW0 = (int) ((vj30Var.w0(4.0f) * (i - 1)) + (vj30Var.w0(60.0f) * i) + vj30Var.w0(this.c) + vj30Var.w0(this.b) + vj30Var.w0(16.0f) + (ua00Var instanceof qa00 ? 0.0f : vj30Var.w0(48.0f)));
        long jA = p4e.a(p4e.i(j), p4e.i(j), iW0, iW0);
        Iterator it6 = list.iterator();
        do {
            if (!it6.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it6.next();
        } while (!Intrinsics.d(mrv.i0((pj30) next2), "COMPACT_ID"));
        pj30 pj30Var = (pj30) next2;
        return vj30.x(vj30Var, p4e.i(j), iW0, new cam(pj30Var != null ? pj30Var.S(jA) : null, (byte) 12));
    }
}
