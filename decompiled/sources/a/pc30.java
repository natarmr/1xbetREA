package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pc30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26739a;
    public final /* synthetic */ long b;
    public final /* synthetic */ weu c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qzt e;
    public final /* synthetic */ ctf0 f;
    public final /* synthetic */ fhj g;
    public final /* synthetic */ wyu h;
    public final /* synthetic */ vzg0 i;

    public /* synthetic */ pc30(long j, weu weuVar, String str, qzt qztVar, ctf0 ctf0Var, fhj fhjVar, wyu wyuVar, vzg0 vzg0Var, byte b) {
        this.f26739a = b;
        this.b = j;
        this.c = weuVar;
        this.d = str;
        this.e = qztVar;
        this.f = ctf0Var;
        this.g = fhjVar;
        this.h = wyuVar;
        this.i = vzg0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Long l;
        byte b = this.f26739a;
        vzg0 vzg0Var = this.i;
        wyu wyuVar = this.h;
        ctf0 ctf0Var = this.f;
        qzt qztVar = this.e;
        weu weuVar = this.c;
        switch (b) {
            case 0:
                String str = this.d;
                zdm0 zdm0VarX = aem0.x(weuVar.a(str), qztVar.a(), ctf0Var);
                uaq0 uaq0VarA = wyuVar.a();
                fhj fhjVar = this.g;
                long j = this.b;
                nc5 nc5VarS = fhjVar.s(str, j, uaq0VarA, 0L);
                iun iunVar = iun.f15405a;
                Object objA = vzg0Var.a("CHECKED_CHIPS_ID_KEY");
                l = objA instanceof Long ? (Long) objA : null;
                return new hc30(j, zdm0VarX, nc5VarS, true, true, false, false, iunVar, l != null ? l.longValue() : 0L);
            default:
                String str2 = this.d;
                zdm0 zdm0VarX2 = aem0.x(weuVar.a(str2), qztVar.a(), ctf0Var);
                uaq0 uaq0VarA2 = wyuVar.a();
                fhj fhjVar2 = this.g;
                long j2 = this.b;
                nc5 nc5VarS2 = fhjVar2.s(str2, j2, uaq0VarA2, 0L);
                boolean z = !q3d.j(4L, 21L).contains(Long.valueOf(j2));
                iun iunVar2 = iun.f15405a;
                Object objA2 = vzg0Var.a("CHECKED_CHIPS_ID_KEY");
                l = objA2 instanceof Long ? (Long) objA2 : null;
                return new hd30(j2, zdm0VarX2, nc5VarS2, true, true, false, false, z, iunVar2, l != null ? l.longValue() : 0L);
        }
    }
}
