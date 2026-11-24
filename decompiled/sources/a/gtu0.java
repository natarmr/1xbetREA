package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gtu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gtu0 f11898a;
    private static final ugi0 descriptor;

    static {
        gtu0 gtu0Var = new gtu0();
        f11898a = gtu0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.rules.data.model.VirtualSportRulesResponse.SectionWrapper", gtu0Var, 1);
        zna0Var.j(ParameterNames.INFO, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(dtu0.f6672a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ftu0 ftu0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                ftu0Var = (ftu0) bldVarA.e(ugi0Var, 0, dtu0.f6672a, ftu0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new itu0(i, ftu0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        itu0 itu0Var = (itu0) obj;
        itu0Var.getClass();
        ftu0 ftu0Var = itu0Var.f15369a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ftu0Var != null) {
            cldVarA.p(ugi0Var, 0, dtu0.f6672a, ftu0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
