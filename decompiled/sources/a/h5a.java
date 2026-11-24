package a;

import androidx.work.impl.WorkDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h5a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12470a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ cpv0 c;

    public /* synthetic */ h5a(cpv0 cpv0Var, String str) {
        this.c = cpv0Var;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12470a;
        cpv0 cpv0Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                WorkDatabase workDatabase = cpv0Var.c;
                workDatabase.getClass();
                workDatabase.p(new i5a(workDatabase, str, cpv0Var, (byte) 0));
                m2h0.b(cpv0Var.b, workDatabase, cpv0Var.e);
                break;
            default:
                WorkDatabase workDatabase2 = cpv0Var.c;
                workDatabase2.getClass();
                workDatabase2.p(new i5a(workDatabase2, str, cpv0Var, (byte) 1));
                m2h0.b(cpv0Var.b, workDatabase2, cpv0Var.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ h5a(String str, cpv0 cpv0Var) {
        this.b = str;
        this.c = cpv0Var;
    }
}
