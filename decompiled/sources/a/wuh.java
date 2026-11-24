package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wuh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39791a = 0;
    public final /* synthetic */ qzt b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fhj d;
    public final /* synthetic */ long e;
    public final /* synthetic */ wyu f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ wuh(long j, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, String str, wyu wyuVar, pru pruVar) {
        this.e = j;
        this.b = qztVar;
        this.g = ctf0Var;
        this.d = fhjVar;
        this.c = str;
        this.f = wyuVar;
        this.h = pruVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39791a;
        Object obj = this.h;
        wyu wyuVar = this.f;
        Object obj2 = this.g;
        qzt qztVar = this.b;
        switch (b) {
            case 0:
                zdm0 zdm0VarX = aem0.x(new edm0(0L), qztVar.a(), (ctf0) obj2);
                uaq0 uaq0VarA = wyuVar.a();
                fhj fhjVar = this.d;
                String str = this.c;
                long j = this.e;
                return new ruh(j, zdm0VarX, fhjVar.s(str, j, uaq0VarA, 0L), true, false, false, ((pru) obj).a().g.t, "", str, "", "", "", iun.f15405a);
            default:
                eme emeVarA = qztVar.a();
                String str2 = this.c;
                hdm0 hdm0VarA = ((weu) obj2).a(str2);
                nc5 nc5VarS = this.d.s(str2, this.e, wyuVar.a(), 0L);
                Integer num = (Integer) ((vzg0) obj).a("KEY_SELECTED_TAB");
                return new pma0(emeVarA, hdm0VarA, nc5VarS, null, iun.f15405a, num != null ? num.intValue() : 0, true, true, false);
        }
    }

    public /* synthetic */ wuh(qzt qztVar, weu weuVar, String str, fhj fhjVar, long j, wyu wyuVar, vzg0 vzg0Var) {
        this.b = qztVar;
        this.g = weuVar;
        this.c = str;
        this.d = fhjVar;
        this.e = j;
        this.f = wyuVar;
        this.h = vzg0Var;
    }
}
