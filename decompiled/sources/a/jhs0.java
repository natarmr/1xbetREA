package a;

import android.gov.nist.javax.sip.ListeningPointExt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jhs0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jhs0 f16544a;
    private static final ugi0 descriptor;

    static {
        jhs0 jhs0Var = new jhs0();
        f16544a = jhs0Var;
        zna0 zna0Var = new zna0("org.xplatform.coinplay_sport_cashback_impl.data.requests.TransferCashbackRequest", jhs0Var, 1);
        zna0Var.j(ListeningPointExt.WS, false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{tbl.f33669a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        double dT = 0.0d;
        boolean z = true;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                dT = bldVarA.t(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new lhs0(dT, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lhs0 lhs0Var = (lhs0) obj;
        lhs0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.j(ugi0Var, 0, lhs0Var.f20073a);
        cldVarA.c(ugi0Var);
    }
}
