package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b29 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1843a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b29(fhj fhjVar, String str, long j, wyu wyuVar, qzt qztVar, pru pruVar) {
        this.f1843a = (byte) 3;
        this.d = fhjVar;
        this.e = str;
        this.b = j;
        this.f = wyuVar;
        this.g = qztVar;
        this.c = pruVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1843a;
        Object obj = this.c;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                vzg0 vzg0Var = (vzg0) obj5;
                iqt iqtVar = (iqt) obj4;
                dmt dmtVar = (dmt) obj3;
                bzt bztVar = (bzt) obj2;
                hl1 hl1Var = ((pru) obj).a().b;
                String str = (String) vzg0Var.a("SEARCH_QUERY_KEY");
                if (str == null) {
                    str = "";
                }
                String str2 = (String) vzg0Var.a("FILTER_QUERY_KEY");
                String str3 = str2 != null ? str2 : "";
                uzb0 uzb0Var = (uzb0) vzg0Var.a("SORT_TYPE_KEY");
                if (uzb0Var == null) {
                    uzb0Var = uzb0.f36529a;
                }
                return new x19(new w19(str.length() > 0, str, str3), new u19(false, false, false, null, hl1Var.e), new v19(false, false, false, iun.f15405a, hl1Var.v), iqtVar.f15225a.a(), null, dmtVar.b(), uzb0Var, bztVar.f3488a.a().r, this.b);
            case 1:
                String str4 = (String) obj3;
                return new dqw(true, false, false, str4, "", "", "", lak0.c, aem0.x(new edm0(0L), ((qzt) obj).a(), (ctf0) obj5), ((fhj) obj4).s(str4, this.b, ((wyu) obj2).a(), 0L));
            case 2:
                String str5 = (String) obj5;
                return new w7g0(true, false, false, null, aem0.x(((weu) obj).a(str5), ((qzt) obj4).a(), (ctf0) obj3), ((fhj) obj2).s(str5, this.b, uaq0.b, 0L));
            default:
                String str6 = (String) obj4;
                uaq0 uaq0VarA = ((wyu) obj3).a();
                long j = this.b;
                return new vlv0(j, new edm0(0L), ((qzt) obj2).a(), ((fhj) obj5).s(str6, j, uaq0VarA, 0L), true, false, false, ((pru) obj).a().g.t, "", str6, "", "", "", iun.f15405a);
        }
    }

    public /* synthetic */ b29(byte b, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f1843a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = j;
    }

    public /* synthetic */ b29(qzt qztVar, ctf0 ctf0Var, fhj fhjVar, String str, long j, wyu wyuVar) {
        this.f1843a = (byte) 1;
        this.c = qztVar;
        this.d = ctf0Var;
        this.e = fhjVar;
        this.f = str;
        this.b = j;
        this.g = wyuVar;
    }
}
