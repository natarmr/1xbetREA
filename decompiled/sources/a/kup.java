package a;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kup implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18921a = 0;
    public final /* synthetic */ wyu b;
    public final /* synthetic */ weu c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qzt e;
    public final /* synthetic */ ctf0 f;
    public final /* synthetic */ fhj g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kup(weu weuVar, String str, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, long j, wyu wyuVar, r9u r9uVar) {
        this.c = weuVar;
        this.d = str;
        this.e = qztVar;
        this.f = ctf0Var;
        this.g = fhjVar;
        this.h = j;
        this.b = wyuVar;
        this.i = r9uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18921a;
        Object obj = this.i;
        ctf0 ctf0Var = this.f;
        qzt qztVar = this.e;
        weu weuVar = this.c;
        wyu wyuVar = this.b;
        switch (b) {
            case 0:
                r9u r9uVar = (r9u) obj;
                String str = this.d;
                zdm0 zdm0VarX = aem0.x(weuVar.a(str), qztVar.a(), ctf0Var);
                j9m0 j9m0VarC0 = ydx.c0(this.g.s(str, this.h, wyuVar.a(), 0L));
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new hup(zdm0VarX, j9m0VarC0, rtp.f31088a, j1q0Var.f15748a.d(ygpVar));
            default:
                uaq0 uaq0VarA = wyuVar.a();
                xqj0 xqj0Var = xqj0.v;
                uaq0.f35345a.getClass();
                boolean z = !s9m0.j(uaq0VarA);
                iun iunVar = iun.f15405a;
                String str2 = this.d;
                zdm0 zdm0VarX2 = aem0.x(weuVar.a(str2), qztVar.a(), ctf0Var);
                fhj fhjVar = this.g;
                long j = this.h;
                return new v020(true, false, j, z, "", str2, 0, xqj0Var, null, zdm0VarX2, fhjVar.s(str2, j, uaq0VarA, 0L), new LinkedHashSet(), new ehm0(false), new ehm0(false), new na00(new l800(0, iunVar, iunVar, iunVar), 0, 0L, 0L, false, true, false, false, 0L), new ehm0(true), iunVar, new ehm0(false), new ehm0(false), new ehm0(false), new ehm0(true), uaq0VarA, ((pru) obj).a().g.t);
        }
    }

    public /* synthetic */ kup(wyu wyuVar, weu weuVar, String str, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, long j, pru pruVar) {
        this.b = wyuVar;
        this.c = weuVar;
        this.d = str;
        this.e = qztVar;
        this.f = ctf0Var;
        this.g = fhjVar;
        this.h = j;
        this.i = pruVar;
    }
}
