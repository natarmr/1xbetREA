package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ls00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f20556a;
    public final o2z b;
    public sje c;

    public ls00(us00 us00Var, o2z o2zVar) {
        o2zVar.getClass();
        this.f20556a = us00Var;
        this.b = o2zVar;
    }

    public final void a() {
        sje sjeVar = this.c;
        byte b = 1;
        if (sjeVar == null || !d5c.R(sjeVar)) {
            kin0 kin0VarE = qem0.e();
            rwj rwjVar = tvk.f34603a;
            sje sjeVarA = d5c.a(kotlin.coroutines.e.c(kin0VarE, dvj.c));
            this.c = sjeVarA;
            qjj.W(sjeVarA, null, null, new ks00(this, null, b), 3);
        }
    }
}
