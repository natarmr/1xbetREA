package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sla0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32390a;
    public final /* synthetic */ qzt b;
    public final /* synthetic */ weu c;
    public final /* synthetic */ String d;
    public final /* synthetic */ fhj e;
    public final /* synthetic */ long f;
    public final /* synthetic */ wyu g;

    public /* synthetic */ sla0(qzt qztVar, weu weuVar, String str, fhj fhjVar, long j, wyu wyuVar, byte b) {
        this.f32390a = b;
        this.b = qztVar;
        this.c = weuVar;
        this.d = str;
        this.e = fhjVar;
        this.f = j;
        this.g = wyuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32390a;
        wyu wyuVar = this.g;
        weu weuVar = this.c;
        qzt qztVar = this.b;
        switch (b) {
            case 0:
                eme emeVarA = qztVar.a();
                String str = this.d;
                hdm0 hdm0VarA = weuVar.a(str);
                nc5 nc5VarS = this.e.s(str, this.f, wyuVar.a(), 0L);
                iun iunVar = iun.f15405a;
                return new lla0(emeVarA, hdm0VarA, nc5VarS, iunVar, "", iunVar, 0, hko0.d, false, true, true, false);
            case 1:
                eme emeVarA2 = qztVar.a();
                String str2 = this.d;
                return new oop0(emeVarA2, weuVar.a(str2), this.e.s(str2, this.f, wyuVar.a(), 0L), true, false, true, null);
            case 2:
                eme emeVarA3 = qztVar.a();
                String str3 = this.d;
                return new gsp0(emeVarA3, weuVar.a(str3), this.e.s(str3, this.f, wyuVar.a(), 0L), iun.f15405a, true, false, false, true);
            case 3:
                eme emeVarA4 = qztVar.a();
                String str4 = this.d;
                return new tbr0(emeVarA4, weuVar.a(str4), this.e.s(str4, this.f, wyuVar.a(), 0L), true, false, true, null);
            default:
                eme emeVarA5 = qztVar.a();
                String str5 = this.d;
                return new gcr0(emeVarA5, weuVar.a(str5), this.e.s(str5, this.f, wyuVar.a(), 0L), true, false, false, true, null);
        }
    }
}
