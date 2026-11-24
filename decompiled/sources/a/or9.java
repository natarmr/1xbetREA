package a;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class or9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ok50 f25725a;
    public final mne b;
    public final btt0 c;

    public or9(ok50 ok50Var, mne mneVar, btt0 btt0Var) {
        btt0Var.getClass();
        this.f25725a = ok50Var;
        this.b = mneVar;
        this.c = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(zje zjeVar) {
        nr9 nr9Var;
        su9 su9Var;
        if (zjeVar instanceof nr9) {
            nr9Var = (nr9) zjeVar;
            int i = nr9Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nr9Var.k = i - Integer.MIN_VALUE;
            } else {
                nr9Var = new nr9(this, zjeVar);
            }
        } else {
            nr9Var = new nr9(this, zjeVar);
        }
        Object objD0 = nr9Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nr9Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            dvj dvjVar = this.b.b;
            qv3 qv3Var = new qv3(this, yjeVar, (byte) 22);
            nr9Var.k = 1;
            objD0 = qjj.d0(dvjVar, qv3Var, nr9Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        Iterable<mu9> iterable = (Iterable) ((q16) objD0).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (mu9 mu9Var : iterable) {
            mu9Var.getClass();
            Long l = mu9Var.f22404a;
            if (l == null) {
                jf4.k(null);
                return null;
            }
            long jLongValue = l.longValue();
            Long l2 = mu9Var.e;
            if (l2 == null && (l2 = mu9Var.b) == null) {
                jf4.k(null);
                return null;
            }
            long jLongValue2 = l2.longValue();
            String str = mu9Var.c;
            String str2 = str == null ? "" : str;
            kj5 kj5Var = su9.f32810a;
            Integer num = mu9Var.d;
            int iIntValue = num != null ? num.intValue() : 0;
            kj5Var.getClass();
            switch (iIntValue) {
                case 0:
                    su9Var = su9.c;
                    break;
                case 1:
                    su9Var = su9.d;
                    break;
                case 2:
                    su9Var = su9.e;
                    break;
                case 3:
                    su9Var = su9.f;
                    break;
                case 4:
                    su9Var = su9.c;
                    break;
                case 5:
                    su9Var = su9.g;
                    break;
                case 6:
                    su9Var = su9.c;
                    break;
                default:
                    su9Var = su9.b;
                    break;
            }
            su9 su9Var2 = su9Var;
            String str3 = mu9Var.f;
            String str4 = str3 != null ? str3 : "";
            Boolean bool = mu9Var.g;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Integer num2 = mu9Var.h;
            arrayList.add(new it9(jLongValue, jLongValue2, str2, su9Var2, str4, zBooleanValue, num2 != null ? num2.intValue() : -1));
        }
        return arrayList;
    }
}
