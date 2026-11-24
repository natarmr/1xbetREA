package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tjs implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34064a;
    public final /* synthetic */ k9s b;
    public final /* synthetic */ yks c;

    public /* synthetic */ tjs(k9s k9sVar, yks yksVar, byte b) {
        this.f34064a = b;
        this.b = k9sVar;
        this.c = yksVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34064a;
        yks yksVar = this.c;
        k9s k9sVar = this.b;
        switch (b) {
            case 0:
                njs njsVar = (njs) obj2;
                ((oyg0) obj).getClass();
                njsVar.getClass();
                long j = k9sVar.f17929a;
                String str = k9sVar.g;
                long j2 = k9sVar.b;
                boolean z = k9sVar.z;
                boolean z2 = k9sVar.W;
                boolean zS = k9sVar.s();
                boolean z3 = k9sVar.v;
                njs njsVarA = njs.a(njsVar, j, str, Long.valueOf(j2), z, k9sVar.s, 0L, null, null, null, null, null, null, null, null, false, false, z2, false, zS, false, false, z3, null, false, false, false, false, false, true, false, null, null, null, null, null, null, null, null, null, null, -9699360, 65523);
                yksVar.o.e("KEY_GAME_ID", Long.valueOf(njsVarA.f23650a));
                vzg0 vzg0Var = yksVar.o;
                vzg0Var.e("KEY_CHAMP_ID", njsVarA.g);
                vzg0Var.e("KEY_LIVE", Boolean.valueOf(njsVarA.d));
                vzg0Var.e("KEY_SHOW_SUB_GAMES", Boolean.valueOf(njsVarA.I));
                return njsVarA;
            default:
                njs njsVar2 = (njs) obj2;
                ((oyg0) obj).getClass();
                njsVar2.getClass();
                long j3 = k9sVar.f17929a;
                String str2 = k9sVar.g;
                long j4 = k9sVar.b;
                boolean z4 = k9sVar.z;
                boolean z5 = k9sVar.W;
                boolean zS2 = k9sVar.s();
                boolean z6 = k9sVar.v;
                njs njsVarA2 = njs.a(njsVar2, j3, str2, Long.valueOf(j4), z4, k9sVar.s, 0L, null, null, null, null, k9sVar.A, k9sVar.j, k9sVar.k, k9sVar.F, false, false, z5, false, zS2, false, false, z6, k9sVar.Z, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -26538016, 65535);
                vzg0 vzg0Var2 = yksVar.o;
                vzg0Var2.e("KEY_GAME_ID", Long.valueOf(njsVarA2.f23650a));
                vzg0Var2.e("KEY_CHAMP_ID", njsVarA2.g);
                vzg0Var2.e("KEY_LIVE", Boolean.valueOf(njsVarA2.d));
                return njsVarA2;
        }
    }
}
