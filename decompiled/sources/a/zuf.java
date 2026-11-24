package a;

import com.huawei.hms.framework.common.BundleUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class zuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr5 f45008a;
    public final clc b;

    public zuf(jr5 jr5Var, clc clcVar) {
        this.f45008a = jr5Var;
        this.b = clcVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, long j2, zje zjeVar) {
        yuf yufVar;
        Double d;
        long j3;
        long j4;
        double dDoubleValue;
        if (zjeVar instanceof yuf) {
            yufVar = (yuf) zjeVar;
            int i = yufVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                yufVar.n = i - Integer.MIN_VALUE;
            } else {
                yufVar = new yuf(this, zjeVar);
            }
        } else {
            yufVar = new yuf(this, zjeVar);
        }
        yuf yufVar2 = yufVar;
        Object objA = yufVar2.l;
        wne wneVar = wne.f39444a;
        int i2 = yufVar2.n;
        if (i2 == 0) {
            z1x.P(objA);
            if (j2 == 0 || j == 0 || j2 == j) {
                d = new Double(1.0d);
            } else {
                d = (Double) this.f45008a.l.get(j + BundleUtil.UNDERLINE_TAG + j2);
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            } else {
                yufVar2.k = this;
                yufVar2.i = j;
                yufVar2.j = j2;
                yufVar2.n = 1;
                objA = ((quf) ((sza) this.b.b).invoke()).a(j, j2, "application/vnd.xenvelop+json", yufVar2);
                if (objA == wneVar) {
                    return wneVar;
                }
                j3 = j;
                j4 = j2;
            }
            return new Double(dDoubleValue);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j4 = yufVar2.j;
        j3 = yufVar2.i;
        this = yufVar2.k;
        z1x.P(objA);
        double dDoubleValue2 = ((Number) ((dx5) objA).a()).doubleValue();
        this.f45008a.l.put(j3 + BundleUtil.UNDERLINE_TAG + j4, Double.valueOf(dDoubleValue2));
        dDoubleValue = dDoubleValue2;
        return new Double(dDoubleValue);
    }
}
