package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class b5v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xex f2024a;
    public final xex b;

    public /* synthetic */ b5v(xex xexVar, xex xexVar2) {
        this.f2024a = xexVar;
        this.b = xexVar2;
    }

    public Object a(String str, rwn rwnVar, bnn0 bnn0Var) {
        if (rwnVar != null) {
            yje yjeVar = null;
            if (rwnVar instanceof pwn) {
                String str2 = ((pwn) rwnVar).f27719a;
                xex xexVar = this.f2024a;
                Object objD0 = qjj.d0(((mne) xexVar.f40764a).b, new ke5(xexVar, str, str2, yjeVar, (byte) 4), bnn0Var);
                wne wneVar = wne.f39444a;
                if (objD0 != wneVar) {
                    objD0 = Unit.f46060a;
                }
                return objD0 == wneVar ? objD0 : Unit.f46060a;
            }
            if (rwnVar instanceof qwn) {
                String str3 = ((qwn) rwnVar).f29443a;
                xex xexVar2 = this.b;
                Object objD1 = qjj.d0(((mne) xexVar2.f40764a).b, new ke5(xexVar2, str, str3, yjeVar, (byte) 4), bnn0Var);
                wne wneVar2 = wne.f39444a;
                if (objD1 != wneVar2) {
                    objD1 = Unit.f46060a;
                }
                return objD1 == wneVar2 ? objD1 : Unit.f46060a;
            }
        }
        t9f.b();
        return null;
    }
}
