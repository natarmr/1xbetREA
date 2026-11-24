package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.AuthenticatorFilterViewModel$ViewModelState;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f43886a = q3d.j(c860.ALL, c860.ACTIVE, c860.APPROVED, c860.REJECTED, c860.EXPIRED);
    public static final List b = q3d.j(q760.ALL_TIME, q760.WEEK, q760.MONTH, q760.CUSTOM);

    public static final y6t0 a(AuthenticatorFilterViewModel$ViewModelState authenticatorFilterViewModel$ViewModelState, ctf0 ctf0Var) {
        dyl bylVar;
        authenticatorFilterViewModel$ViewModelState.getClass();
        ctf0Var.getClass();
        List list = f43886a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c860 c860Var = (c860) it.next();
            c860 c860Var2 = authenticatorFilterViewModel$ViewModelState.f46352a;
            c860Var.getClass();
            c860Var2.getClass();
            boolean z = c860Var == c860Var2;
            arrayList.add(new e860(c860Var, new lxl(1L, (dyl) new xxl(ctf0Var.b.a(c860Var.a(), Arrays.copyOf(new Object[0], 0))), false, z ? uxl.b : uxl.f36445a, (cwl) null, 108), z));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        List<q760> list2 = b;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        for (q760 q760Var : list2) {
            NotificationPeriodInfo notificationPeriodInfo = authenticatorFilterViewModel$ViewModelState.b;
            q760Var.getClass();
            notificationPeriodInfo.getClass();
            q760 q760Var2 = notificationPeriodInfo.f46354a;
            String strA = notificationPeriodInfo.b;
            boolean z2 = q760Var == q760Var2;
            q760 q760Var3 = q760.CUSTOM;
            if (q760Var != q760Var3) {
                bylVar = new xxl(ctf0Var.b.a(q760Var.a(), Arrays.copyOf(new Object[0], 0)));
            } else {
                if (strA.length() <= 0 || q760Var2 != q760Var3 || (notificationPeriodInfo.d == 0 && notificationPeriodInfo.c == 0)) {
                    strA = ctf0Var.b.a(q760Var3.a(), Arrays.copyOf(new Object[0], 0));
                }
                bylVar = new byl(strA, new m0x(R.drawable.ic_glyph_chevron_right_small, null, 6), null, null, 28);
            }
            arrayList2.add(new ydj(q760Var, new lxl(1L, bylVar, false, z2 ? uxl.b : uxl.f36445a, (cwl) null, 108), z2));
        }
        return new y6t0(a4xVarO0, dyb.o0(arrayList2));
    }
}
