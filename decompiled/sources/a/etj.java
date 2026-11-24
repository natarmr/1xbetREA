package a;

/* JADX INFO: loaded from: classes3.dex */
public final class etj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ali f8378a;
    public final yqc b;
    public final mne c;

    public etj(ali aliVar, yqc yqcVar, mne mneVar) {
        this.f8378a = aliVar;
        this.b = yqcVar;
        this.c = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ql5 ql5Var, yje yjeVar) {
        dtj dtjVar;
        usj usjVar;
        long j;
        Double d;
        if (yjeVar instanceof dtj) {
            dtjVar = (dtj) yjeVar;
            int i = dtjVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                dtjVar.m = i - Integer.MIN_VALUE;
            } else {
                dtjVar = new dtj(this, yjeVar);
            }
        } else {
            dtjVar = new dtj(this, yjeVar);
        }
        Object obj = dtjVar.k;
        wne wneVar = wne.f39444a;
        int i2 = dtjVar.m;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            long j2 = ql5Var.f28916a;
            for (Object obj3 : this.f8378a.f()) {
                Long l = ((usj) obj3).f36214a;
                if (l != null && l.longValue() == j2) {
                    obj2 = obj3;
                    break;
                }
            }
            usj usjVar2 = (usj) obj2;
            long j3 = ql5Var.f28916a;
            long j4 = ql5Var.e;
            dtjVar.i = usjVar2;
            dtjVar.j = j3;
            dtjVar.m = 1;
            Object objP = this.b.p(j4, dtjVar);
            if (objP == wneVar) {
                return wneVar;
            }
            usjVar = usjVar2;
            obj = objP;
            j = j3;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = dtjVar.j;
            usjVar = dtjVar.i;
            z1x.P(obj);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        if (usjVar != null && (d = usjVar.b) != null) {
            dDoubleValue = d.doubleValue();
        }
        return new c3j0(dDoubleValue, j);
    }
}
