package a;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i5a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14184a;
    public final /* synthetic */ WorkDatabase b;
    public final /* synthetic */ String c;
    public final /* synthetic */ cpv0 d;

    public /* synthetic */ i5a(WorkDatabase workDatabase, String str, cpv0 cpv0Var, byte b) {
        this.f14184a = b;
        this.b = workDatabase;
        this.c = str;
        this.d = cpv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f14184a;
        cpv0 cpv0Var = this.d;
        String str = this.c;
        WorkDatabase workDatabase = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                upv0 upv0VarY = workDatabase.y();
                upv0VarY.getClass();
                Iterator it = ((List) kpb.h0(upv0VarY.f36087a, true, false, new ka6(str, (byte) 24))).iterator();
                while (it.hasNext()) {
                    dj8.T(cpv0Var, (String) it.next());
                }
                break;
            default:
                upv0 upv0VarY2 = workDatabase.y();
                upv0VarY2.getClass();
                str.getClass();
                Iterator it2 = ((List) kpb.h0(upv0VarY2.f36087a, true, false, new tpv0(str, b2))).iterator();
                while (it2.hasNext()) {
                    dj8.T(cpv0Var, (String) it2.next());
                }
                break;
        }
    }
}
