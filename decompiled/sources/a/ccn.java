package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ccn extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final r7v o;
    public final ibu p;
    public final x4u q;

    /* JADX WARN: Illegal instructions before constructor call */
    public ccn(mne mneVar, ctf0 ctf0Var, wdn wdnVar, g7u g7uVar, ibu ibuVar, hbu hbuVar, r7v r7vVar, ibu ibuVar2, x4u x4uVar) {
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        super(new mr0(ibuVar, hbuVar, wdnVar, g7uVar, (byte) 10), g090VarP, new bcn(ctf0Var, (byte) 0), (yzn0) null);
        this.o = r7vVar;
        this.p = ibuVar2;
        this.q = x4uVar;
        i3t0.K(this, null, null, new pn(this, null, (byte) 25), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        qbn qbnVar = (qbn) obj;
        qbnVar.getClass();
        super.x(qbnVar);
        if (qbnVar instanceof pbn) {
            long j = ((pbn) qbnVar).f26716a;
            ybn ybnVar = (ybn) D();
            Set set = ybnVar.c;
            Set set2 = ybnVar.e;
            if (set.contains(Long.valueOf(j))) {
                return;
            }
            Set setE = set2.contains(Long.valueOf(j)) ? eui0.e(set2, Long.valueOf(j)) : set2.size() < 5 ? eui0.h(set2, Long.valueOf(j)) : set2;
            if (setE.equals(set2)) {
                return;
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, ybn.a((ybn) value, setE, null, 47)));
            return;
        }
        if (!(qbnVar instanceof obn)) {
            t9f.b();
            return;
        }
        ybn ybnVar2 = (ybn) D();
        Set set3 = ybnVar2.e;
        wdn wdnVar = ybnVar2.f42347a;
        Set set4 = ybnVar2.d;
        Set setF = eui0.f(set3, set4);
        Set setF2 = eui0.f(set4, ybnVar2.e);
        List list = ybnVar2.b;
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : list) {
            linkedHashMap.put(Long.valueOf(((tdn) obj2).f33777a), obj2);
        }
        Iterator it = setF2.iterator();
        while (it.hasNext()) {
            tdn tdnVar = (tdn) linkedHashMap.get(Long.valueOf(((Number) it.next()).longValue()));
            if (tdnVar != null) {
                this.p.a(tdnVar, wdnVar);
            }
        }
        Iterator it2 = setF.iterator();
        while (it2.hasNext()) {
            tdn tdnVar2 = (tdn) linkedHashMap.get(Long.valueOf(((Number) it2.next()).longValue()));
            if (tdnVar2 != null) {
                this.o.h(tdnVar2, wdnVar);
            }
        }
        G(xbn.f40608a);
    }
}
