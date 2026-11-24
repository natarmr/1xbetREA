package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class tcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xcz f33739a;
    public final Function2 b;
    public final zbk c;

    public tcz(xcz xczVar, Function2 function2) {
        xczVar.getClass();
        function2.getClass();
        this.f33739a = xczVar;
        this.b = function2;
        this.c = jgk0.b(new rcz(this, (byte) 0));
    }

    public final boolean a() {
        xcz xczVar = this.f33739a;
        ncz nczVar = (ncz) CollectionsKt.f0(xczVar.j().l);
        if (nczVar == null) {
            return false;
        }
        if (nczVar.f23317a >= xczVar.j().o - 1) {
            int i = nczVar.p + nczVar.q;
            mcz mczVarJ = xczVar.j();
            if (i <= mczVarJ.n - mczVarJ.r) {
                return false;
            }
        }
        return true;
    }

    public final int b(int i) {
        Object objInvoke;
        int iB;
        int iIntValue;
        qls0 qls0VarP = pgi0.p(CollectionsKt.I(this.f33739a.j().l), scz.f32008a);
        Iterator it = qls0VarP.f28951a.iterator();
        do {
            if (!it.hasNext()) {
                objInvoke = null;
                break;
            }
            objInvoke = qls0VarP.b.invoke(it.next());
        } while (((ucz) objInvoke).f35454a.f23317a != i);
        ucz uczVar = (ucz) objInvoke;
        Function2 function2 = this.b;
        if (uczVar != null) {
            iB = uczVar.f35454a.p;
            iIntValue = ((Number) function2.invoke(this, uczVar)).intValue();
        } else {
            ucz uczVarD = d();
            if (uczVarD == null) {
                return 0;
            }
            ncz nczVar = uczVarD.f35454a;
            iB = si30.b(c() * (i - nczVar.f23317a)) + nczVar.p;
            iIntValue = ((Number) function2.invoke(this, uczVarD)).intValue();
        }
        return iB - iIntValue;
    }

    public final float c() {
        Object next;
        xcz xczVar = this.f33739a;
        mcz mczVarJ = xczVar.j();
        List list = mczVarJ.l;
        List list2 = mczVarJ.l;
        if (list.isEmpty()) {
            return -1.0f;
        }
        Iterator it = list2.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((ncz) next).p;
                do {
                    Object next3 = it.next();
                    int i2 = ((ncz) next3).p;
                    if (i > i2) {
                        next = next3;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        ncz nczVar = (ncz) next;
        if (nczVar == null) {
            return -1.0f;
        }
        Iterator it2 = list2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                ncz nczVar2 = (ncz) next2;
                int i3 = nczVar2.p + nczVar2.q;
                do {
                    Object next4 = it2.next();
                    ncz nczVar3 = (ncz) next4;
                    int i4 = nczVar3.p + nczVar3.q;
                    if (i3 < i4) {
                        next2 = next4;
                        i3 = i4;
                    }
                } while (it2.hasNext());
            }
        }
        ncz nczVar4 = (ncz) next2;
        if (nczVar4 == null) {
            return -1.0f;
        }
        int iMax = Math.max(nczVar.p + nczVar.q, nczVar4.p + nczVar4.q) - Math.min(nczVar.p, nczVar4.p);
        if (iMax == 0) {
            return -1.0f;
        }
        List list3 = xczVar.j().l;
        int i5 = 0;
        if (list3.size() >= 2) {
            ncz nczVar5 = (ncz) list3.get(0);
            i5 = ((ncz) list3.get(1)).p - (nczVar5.q + nczVar5.p);
        }
        return (iMax + i5) / list2.size();
    }

    public final ucz d() {
        return (ucz) this.c.getValue();
    }
}
