package a;

import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c8s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3929a;
    public final /* synthetic */ k9s b;
    public final /* synthetic */ g9s c;

    public /* synthetic */ c8s(k9s k9sVar, g9s g9sVar, byte b) {
        this.f3929a = b;
        this.b = k9sVar;
        this.c = g9sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3929a;
        g9s g9sVar = this.c;
        k9s k9sVar = this.b;
        switch (b) {
            case 0:
                r7s r7sVar = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar.getClass();
                long j = k9sVar.f17929a;
                String str = k9sVar.g;
                long j2 = k9sVar.b;
                r7s r7sVarA = r7s.a(r7sVar, j, str, Long.valueOf(j2), k9sVar.z, k9sVar.s, 0L, null, null, null, null, null, null, null, false, false, k9sVar.W, false, k9sVar.s(), false, false, k9sVar.v, null, null, false, false, false, false, false, false, null, false, false, false, null, null, true, false, null, null, null, null, null, null, null, null, null, false, -4849696, 1048383);
                g9sVar.o.e("KEY_GAME_ID", Long.valueOf(r7sVarA.f29992a));
                vzg0 vzg0Var = g9sVar.o;
                vzg0Var.e("KEY_CHAMP_ID", r7sVarA.g);
                vzg0Var.e("KEY_LIVE", Boolean.valueOf(r7sVarA.d));
                vzg0Var.e("KEY_SHOW_SUB_GAMES", Boolean.valueOf(r7sVarA.M));
                return r7sVarA;
            default:
                r7s r7sVar2 = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar2.getClass();
                long j3 = k9sVar.f17929a;
                String str2 = k9sVar.g;
                long j4 = k9sVar.b;
                boolean z = k9sVar.z;
                boolean z2 = k9sVar.W;
                boolean zS = k9sVar.s();
                boolean z3 = k9sVar.v;
                long j5 = k9sVar.s;
                String str3 = k9sVar.A;
                String str4 = k9sVar.j;
                String str5 = k9sVar.k;
                String str6 = k9sVar.l;
                String str7 = k9sVar.F;
                r7s r7sVarA2 = r7s.a(r7sVar2, j3, str2, Long.valueOf(j4), z, j5, 0L, null, null, (r7sVar2.c == null && StringsKt.W(k9sVar.Q()) && k9sVar.S.isEmpty() && k9sVar.V.isEmpty() && (k9sVar.I == null || !k9sVar.h) && !k9sVar.i && (str2.length() == 0 || !k9sVar.D)) ? py20.b : r7sVar2.k, str3, str4, str5, str7, false, false, z2, false, zS, false, false, z3, k9sVar.Z, null, false, false, false, false, false, false, null, false, false, false, null, str6, false, false, null, null, null, null, null, null, null, null, null, false, -13270048, 1048559);
                vzg0 vzg0Var2 = g9sVar.o;
                vzg0Var2.e("KEY_GAME_ID", Long.valueOf(r7sVarA2.f29992a));
                vzg0Var2.e("KEY_CHAMP_ID", r7sVarA2.g);
                vzg0Var2.e("KEY_LIVE", Boolean.valueOf(r7sVarA2.d));
                vzg0Var2.e("KEY_MARKETS_ANCHOR_STATE", r7sVarA2.k);
                return r7sVarA2;
        }
    }
}
