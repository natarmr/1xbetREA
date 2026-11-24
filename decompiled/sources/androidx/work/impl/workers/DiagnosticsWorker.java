package androidx.work.impl.workers;

import a.aeg0;
import a.cpv0;
import a.ejv0;
import a.fik;
import a.hpv0;
import a.kpb;
import a.mg00;
import a.ng00;
import a.r2a0;
import a.s2m0;
import a.s9o0;
import a.upv0;
import a.wv00;
import a.zpv0;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final mg00 c() {
        cpv0 cpv0VarD = cpv0.d(this.f25193a);
        cpv0VarD.getClass();
        WorkDatabase workDatabase = cpv0VarD.c;
        workDatabase.getClass();
        upv0 upv0VarY = workDatabase.y();
        hpv0 hpv0VarW = workDatabase.w();
        zpv0 zpv0VarZ = workDatabase.z();
        s9o0 s9o0VarV = workDatabase.v();
        s2m0 s2m0Var = cpv0VarD.b.d;
        List list = (List) kpb.h0(upv0VarY.f36087a, true, false, new r2a0((byte) 22, System.currentTimeMillis() - 86400000));
        aeg0 aeg0Var = upv0VarY.f36087a;
        List list2 = (List) kpb.h0(aeg0Var, true, false, new ejv0((byte) 14));
        List list3 = (List) kpb.h0(aeg0Var, true, false, new ejv0((byte) 11));
        if (!list.isEmpty()) {
            wv00 wv00VarF = wv00.f();
            String str = fik.f9592a;
            wv00VarF.g(str, "Recently completed work:\n\n");
            wv00.f().g(str, fik.a(hpv0VarW, zpv0VarZ, s9o0VarV, list));
        }
        if (!list2.isEmpty()) {
            wv00 wv00VarF2 = wv00.f();
            String str2 = fik.f9592a;
            wv00VarF2.g(str2, "Running work:\n\n");
            wv00.f().g(str2, fik.a(hpv0VarW, zpv0VarZ, s9o0VarV, list2));
        }
        if (!list3.isEmpty()) {
            wv00 wv00VarF3 = wv00.f();
            String str3 = fik.f9592a;
            wv00VarF3.g(str3, "Enqueued work:\n\n");
            wv00.f().g(str3, fik.a(hpv0VarW, zpv0VarZ, s9o0VarV, list3));
        }
        return ng00.a();
    }
}
