package a;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aeg0 f9204a;

    public fae0(aeg0 aeg0Var) {
        this.f9204a = aeg0Var;
    }

    public final void a(qpg0 qpg0Var, gx3 gx3Var) {
        cx3 cx3Var = (cx3) gx3Var.keySet();
        gx3 gx3Var2 = cx3Var.f5105a;
        if (gx3Var2.isEmpty()) {
            return;
        }
        if (gx3Var.c > 999) {
            q8x.G(gx3Var, new eae0(this, qpg0Var, (byte) 0));
            return;
        }
        StringBuilder sbR = brm0.r("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        zsm0.i(gx3Var2.c, sbR);
        sbR.append(Separators.RPAREN);
        xpg0 xpg0VarZ0 = qpg0Var.Z0(sbR.toString());
        Iterator it = cx3Var.iterator();
        int i = 1;
        while (true) {
            bx3 bx3Var = (bx3) it;
            if (!bx3Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    xpg0VarZ0.close();
                    throw th;
                }
            }
            xpg0VarZ0.z(i, (String) bx3Var.next());
            i++;
        }
        xpg0VarZ0.getClass();
        int iA = z1x.A(xpg0VarZ0, "work_spec_id");
        if (iA == -1) {
            xpg0VarZ0.close();
            return;
        }
        while (xpg0VarZ0.W0()) {
            List list = (List) gx3Var.get(xpg0VarZ0.J0(iA));
            if (list != null) {
                byte[] blob = xpg0VarZ0.getBlob(0);
                maj majVar = maj.b;
                list.add(nkb.B(blob));
            }
        }
        xpg0VarZ0.close();
    }

    public final void b(qpg0 qpg0Var, gx3 gx3Var) {
        cx3 cx3Var = (cx3) gx3Var.keySet();
        gx3 gx3Var2 = cx3Var.f5105a;
        if (gx3Var2.isEmpty()) {
            return;
        }
        if (gx3Var.c > 999) {
            q8x.G(gx3Var, new eae0(this, qpg0Var, (byte) 1));
            return;
        }
        StringBuilder sbR = brm0.r("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        zsm0.i(gx3Var2.c, sbR);
        sbR.append(Separators.RPAREN);
        xpg0 xpg0VarZ0 = qpg0Var.Z0(sbR.toString());
        Iterator it = cx3Var.iterator();
        int i = 1;
        while (true) {
            bx3 bx3Var = (bx3) it;
            if (!bx3Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    xpg0VarZ0.close();
                    throw th;
                }
            }
            xpg0VarZ0.z(i, (String) bx3Var.next());
            i++;
        }
        xpg0VarZ0.getClass();
        int iA = z1x.A(xpg0VarZ0, "work_spec_id");
        if (iA == -1) {
            xpg0VarZ0.close();
            return;
        }
        while (xpg0VarZ0.W0()) {
            List list = (List) gx3Var.get(xpg0VarZ0.J0(iA));
            if (list != null) {
                list.add(xpg0VarZ0.J0(0));
            }
        }
        xpg0VarZ0.close();
    }
}
