package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gpw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f11703a = new zfn(new kdw((byte) 10), (byte) 0);

    public static final void a(dbd dbdVar, ugd ugdVar, fet fetVar, int i) {
        Integer numValueOf;
        dbdVar.getClass();
        fetVar.g0(1095689228);
        int i2 = (fetVar.e(dbdVar.ordinal()) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = dbdVar.ordinal();
            if (iOrdinal == 0) {
                numValueOf = null;
            } else if (iOrdinal == 1) {
                numValueOf = Integer.valueOf(R.drawable.ic_history_compact_new);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
                numValueOf = Integer.valueOf(R.drawable.ic_history_full_new);
            }
            if (numValueOf == null) {
                fetVar.e0(-73293411);
                ugdVar.invoke(fetVar, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(-73257699);
                boolean zE = fetVar.e(numValueOf.intValue());
                Object objP = fetVar.P();
                if (zE || objP == ukd.f35823a) {
                    int iIntValue = numValueOf.intValue();
                    pz40 pz40Var = s6t0.f31722a;
                    long secondary = s6t0.b().f33626a.getSecondary();
                    int i3 = y3d.h;
                    objP = new dmm(new ta50(new wkm(0, iIntValue, true, ra50.f30118a, secondary)));
                    fetVar.o0(objP);
                }
                obc.d(f11703a.a((dmm) objP), ugdVar, fetVar, 56);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(dbdVar, ugdVar, i, (byte) 17);
        }
    }
}
