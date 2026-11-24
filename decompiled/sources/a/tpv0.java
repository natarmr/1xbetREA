package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tpv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34356a;
    public final /* synthetic */ String b;

    public /* synthetic */ tpv0(String str, byte b) {
        this.f34356a = b;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        byte b = this.f34356a;
        String str = this.b;
        qpg0 qpg0Var = (qpg0) obj;
        switch (b) {
            case 0:
                qpg0Var.getClass();
                xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    xpg0VarZ0.z(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        arrayList.add(xpg0VarZ0.J0(0));
                    }
                    xpg0VarZ0.close();
                    return arrayList;
                } catch (Throwable th) {
                    xpg0VarZ0.close();
                    throw th;
                }
            case 1:
                qpg0Var.getClass();
                xpg0 xpg0VarZ1 = qpg0Var.Z0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    xpg0VarZ1.z(1, str);
                    xpg0VarZ1.W0();
                    return Integer.valueOf(s0x.R(qpg0Var));
                } finally {
                    xpg0VarZ1.close();
                }
            default:
                qpg0Var.getClass();
                xpg0 xpg0VarZ2 = qpg0Var.Z0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    xpg0VarZ2.z(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (xpg0VarZ2.W0()) {
                        arrayList2.add(xpg0VarZ2.J0(0));
                    }
                    xpg0VarZ2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    xpg0VarZ2.close();
                    throw th2;
                }
        }
    }
}
