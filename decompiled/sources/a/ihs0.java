package a;

import java.util.Arrays;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ihs0 {
    public static final qcm a(qks0 qks0Var, boolean z) {
        if (qks0Var.e == fks0.Retirement) {
            return new pcm(ncm.RETIREMENT);
        }
        return (z && qks0Var.b.length() == 0) ? new pcm(ncm.FREE) : new ocm(new n0x(qks0Var.c));
    }

    public static final ucm b(qks0 qks0Var, ctf0 ctf0Var, qcm qcmVar) {
        String strA;
        tcm rcmVar;
        boolean z = qks0Var.f;
        String str = qks0Var.b;
        fks0 fks0Var = qks0Var.e;
        long j = z ? qks0Var.f28901a : -1L;
        if (fks0Var.a() && str.length() == 0) {
            strA = ctf0Var.b.a(R.string.cyber_games_free_agent_transfer, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = fks0Var == fks0.Retirement ? ctf0Var.b.a(R.string.retirement, Arrays.copyOf(new Object[0], 0)) : str;
        }
        String str2 = qks0Var.d;
        if (str.length() <= 0 || !fks0Var.b()) {
            rcmVar = (str.length() <= 0 || str2.length() <= 0) ? scm.f31992a : new rcm(str2);
        } else {
            rcmVar = new rcm(ctf0Var.b.a(fks0Var.f9708a, Arrays.copyOf(new Object[0], 0)));
        }
        return new ucm(j, qcmVar, strA, rcmVar, true);
    }
}
