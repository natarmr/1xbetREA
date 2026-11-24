package a;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f21060a = wv00.h("Schedulers");

    public static void a(upv0 upv0Var, s2m0 s2m0Var, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                upv0Var.g(jCurrentTimeMillis, ((ppv0) it.next()).f27390a);
            }
        }
    }

    public static void b(wsd wsdVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        upv0 upv0VarY = workDatabase.y();
        new ArrayList();
        workDatabase.b();
        try {
            aeg0 aeg0Var = upv0VarY.f36087a;
            aeg0 aeg0Var2 = upv0VarY.f36087a;
            List list2 = (List) kpb.h0(aeg0Var, true, false, new ejv0((byte) 8));
            a(upv0VarY, wsdVar.d, list2);
            List list3 = (List) kpb.h0(aeg0Var2, true, false, new ejv0((byte) 11));
            List list4 = (List) kpb.h0(aeg0Var2, true, false, new ejv0((byte) 13));
            a(upv0VarY, wsdVar.d, list4);
            list4.addAll(list2);
            workDatabase.q();
            workDatabase.m();
            c(list4, list, true);
            c(list3, list, false);
        } catch (Throwable th) {
            workDatabase.m();
            throw th;
        }
    }

    public static void c(List list, List list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        ppv0[] ppv0VarArr = (ppv0[]) list.toArray(new ppv0[list.size()]);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            j2h0 j2h0Var = (j2h0) it.next();
            if (j2h0Var.e() == z) {
                j2h0Var.d(ppv0VarArr);
            }
        }
    }
}
