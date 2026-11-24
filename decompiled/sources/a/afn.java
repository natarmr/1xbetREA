package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes2.dex */
public final class afn implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final afn f786a = new afn();
    public static final ewb0 b = new ewb0("kotlin.time.Duration", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        uen uenVar = wen.b;
        String strZ = rkjVar.z();
        uenVar.getClass();
        strZ.getClass();
        try {
            long jR0 = ibc.r0(strZ);
            if (wen.d(jR0, wen.e)) {
                throw new IllegalStateException("invariant failed");
            }
            return new wen(jR0);
        } catch (IllegalArgumentException e) {
            e9d0.t(kng0.l("Invalid ISO duration string format: '", strZ, "'."), e);
            return null;
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        long j = ((wen) obj).f39026a;
        uen uenVar = wen.b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jN = j < 0 ? wen.n(j) : j;
        long jL = wen.l(jN, bfn.HOURS);
        boolean z = false;
        int iL = wen.i(jN) ? 0 : (int) (wen.l(jN, bfn.MINUTES) % 60);
        int iL2 = wen.i(jN) ? 0 : (int) (wen.l(jN, bfn.SECONDS) % 60);
        int iF = wen.f(jN);
        if (wen.i(j)) {
            jL = 9999999999999L;
        }
        boolean z2 = jL != 0;
        boolean z3 = (iL2 == 0 && iF == 0) ? false : true;
        if (iL != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jL);
            sb.append('H');
        }
        if (z) {
            sb.append(iL);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            wen.b(sb, iL2, iF, 9, TokenNames.S, true);
        }
        bwnVar.E(sb.toString());
    }
}
