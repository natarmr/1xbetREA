package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mne f44309a;
    public final deo b;

    public zfo(mne mneVar, bek bekVar, sek sekVar, deo deoVar) {
        deoVar.getClass();
        this.f44309a = mneVar;
        this.b = deoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        tfo tfoVar;
        if (zjeVar instanceof tfo) {
            tfoVar = (tfo) zjeVar;
            int i = tfoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tfoVar.k = i - Integer.MIN_VALUE;
            } else {
                tfoVar = new tfo(this, zjeVar);
            }
        } else {
            tfoVar = new tfo(this, zjeVar);
        }
        Object objW0 = tfoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = tfoVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            tfoVar.k = 1;
            objW0 = sj3.w0(tfoVar, ((nbo) this.b.f5958a.getValue()).f23251a, new hu6(j, yjeVar, (byte) 5), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        return bek.p((obo) objW0);
    }

    public final Object b(yje yjeVar) {
        return qjj.d0(this.f44309a.b, new ufo(this, null, (byte) 0), yjeVar);
    }

    public final eu4 c() {
        return new eu4(new a1g(wwb.C(((nbo) this.b.f5958a.getValue()).f23251a, new String[]{"events"}, new f1e(2, null, (byte) 21)), this, (byte) 6), (byte) 8);
    }
}
