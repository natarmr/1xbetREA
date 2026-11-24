package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gnu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dq00 f11602a;

    public /* synthetic */ gnu(dq00 dq00Var) {
        this.f11602a = dq00Var;
    }

    public p6d a() {
        dq00 dq00Var = this.f11602a;
        return new p6d(new xp90(new i89(((yp90) dq00Var.b).f43021a, (byte) 22), (byte) 0), ((imb) dq00Var.c).f15016a, new wx4((Object) dq00Var, (yje) null, (byte) 28), (byte) 1);
    }

    public void b(String str, List list) {
        str.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qkt qktVar = (qkt) it.next();
            qktVar.getClass();
            int i = qktVar.f28902a;
            boolean z = qktVar.g;
            String strI = ua80.i("+", qktVar.c, Separators.SP, qktVar.b);
            String strConcat = qktVar.f;
            if (!kotlin.text.c.x(strConcat, "http://", false) && !kotlin.text.c.x(strConcat, "https://", false)) {
                if (!kotlin.text.c.x(strConcat, Separators.SLASH, false)) {
                    strConcat = Separators.SLASH.concat(strConcat);
                }
                strConcat = str.concat(strConcat);
            }
            long j = qktVar.e;
            String str2 = qktVar.c;
            arrayList.add(new gq90(i, j, qktVar.h, strI, strConcat, str2, qktVar.d, z));
        }
        this.f11602a.k(arrayList);
    }

    public void c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qkt qktVar = (qkt) it.next();
            qktVar.getClass();
            int i = qktVar.f28902a;
            boolean z = qktVar.g;
            String strQ = w6x.q(qktVar.c, Separators.SP, qktVar.b);
            String str = qktVar.b;
            StringBuilder sb = new StringBuilder(ujn.h);
            String str2 = qktVar.f;
            str2.getClass();
            if (str2.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                sb.setLength(0);
                sb.append(str2);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str2, '/'));
            }
            arrayList.add(new kq90(i, qktVar.e, qktVar.h, strQ, str, sb.toString(), qktVar.c, qktVar.d, z));
        }
        this.f11602a.k(arrayList);
    }
}
