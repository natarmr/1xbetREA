package a;

import android.gov.nist.core.Separators;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class kp10 implements jwb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f18656a = Logger.getLogger(kp10.class.getName());
    public static final byte[] b = {0};
    public static final kp10 c = new kp10();

    @Override // a.jwb0
    public final Class a() {
        return gp10.class;
    }

    @Override // a.jwb0
    public final Class b() {
        return gp10.class;
    }

    @Override // a.jwb0
    public final Object c(gxu gxuVar) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) gxuVar.f12096a).values().iterator();
        while (it.hasNext()) {
            for (fwb0 fwb0Var : (List) it.next()) {
                l7x l7xVar = fwb0Var.h;
                if (l7xVar instanceof ip10) {
                    ip10 ip10Var = (ip10) l7xVar;
                    byte[] bArr = fwb0Var.c;
                    sg9 sg9VarA = sg9.a(Arrays.copyOf(bArr, bArr.length));
                    if (!sg9VarA.equals(ip10Var.h0())) {
                        StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                        sb.append(ip10Var.i0());
                        sg9 sg9VarH0 = ip10Var.h0();
                        sb.append(" has wrong output prefix (");
                        sb.append(sg9VarH0);
                        sb.append(") instead of (");
                        sb.append(sg9VarA);
                        sb.append(Separators.RPAREN);
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            }
        }
        return new jp10(gxuVar);
    }
}
