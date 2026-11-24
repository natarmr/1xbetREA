package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nqs extends eiu0 {
    public final /* synthetic */ byte c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public nqs(rbu rbuVar, mne mneVar, xrs xrsVar) {
        this.c = (byte) 0;
        this.d = rbuVar;
        this.e = mneVar;
        this.f = xrsVar;
        this.g = maz.b(new jcs(this, (byte) 5));
    }

    @Override // a.eiu0
    public void u(diu0 diu0Var, vzg0 vzg0Var) {
        switch (this.c) {
            case 0:
                vzg0Var.getClass();
                this.f7878a = diu0Var;
                this.b = vzg0Var;
                qjj.W(jiu0.a(diu0Var), ((mne) this.e).c, null, new gkr(this, null, (byte) 3), 2);
                break;
            default:
                super.u(diu0Var, vzg0Var);
                break;
        }
    }

    public u3z v() {
        mqs mqsVarX = x();
        vzg0 vzg0Var = mqsVarX.f22239a;
        Long l = (Long) vzg0Var.a(mqsVarX.e);
        long jLongValue = l != null ? l.longValue() : mqsVarX.b;
        String strName = (String) vzg0Var.a(mqsVarX.f);
        if (strName == null) {
            rqt rqtVar = t3z.f33292a;
            boolean z = mqsVarX.c;
            rqtVar.getClass();
            strName = rqt.h(z, false, false).name();
        }
        return new u3z(jLongValue, t3z.valueOf(strName), mqsVarX.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(yje yjeVar) {
        wzb0 wzb0Var;
        if (yjeVar instanceof wzb0) {
            wzb0Var = (wzb0) yjeVar;
            int i = wzb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wzb0Var.k = i - Integer.MIN_VALUE;
            } else {
                wzb0Var = new wzb0(this, (zje) yjeVar);
            }
        } else {
            wzb0Var = new wzb0(this, (zje) yjeVar);
        }
        Object objK = wzb0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = wzb0Var.k;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(objK);
            vsg0 vsg0Var = new vsg0(new nv(new fnq(((cyh) this.e).a(new p6a(String.valueOf(((ort) this.f).b()), (byte) 6)), new s980(this, yjeVar2, (byte) 27), (byte) 4), yjeVar2, (byte) 4));
            wzb0Var.k = 1;
            objK = ntb.K(vsg0Var, wzb0Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        return (ynb0) objK;
    }

    public mqs x() {
        return (mqs) ((n0o0) this.g).getValue();
    }

    public nqs(z4w0 z4w0Var, cyh cyhVar, ort ortVar) {
        this.c = (byte) 1;
        this.d = z4w0Var;
        this.e = cyhVar;
        this.f = ortVar;
        this.g = new ol60(3);
    }
}
