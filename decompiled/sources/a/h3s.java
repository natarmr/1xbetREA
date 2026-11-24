package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h3s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12401a;
    public final /* synthetic */ k9s b;

    public /* synthetic */ h3s(k9s k9sVar, byte b) {
        this.f12401a = b;
        this.b = k9sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12401a;
        k9s k9sVar = this.b;
        switch (b) {
            case 0:
                oyg0 oyg0Var = (oyg0) obj;
                z2s z2sVar = (z2s) obj2;
                oyg0Var.getClass();
                z2sVar.getClass();
                q7x.F(oyg0Var, Boolean.TRUE, "KEY_SHOW_SUB_GAMES");
                long j = k9sVar.f17929a;
                q7x.F(oyg0Var, Long.valueOf(j), "KEY_GAME_ID");
                String str = k9sVar.g;
                long j2 = k9sVar.b;
                boolean z = k9sVar.z;
                q7x.F(oyg0Var, Boolean.valueOf(z), "KEY_LIVE");
                boolean z2 = k9sVar.W;
                boolean zS = k9sVar.s();
                boolean z3 = k9sVar.v;
                return z2s.a(z2sVar, j, str, Long.valueOf(j2), z, k9sVar.s, 0L, null, null, null, null, null, false, false, z2, false, zS, false, false, z3, null, false, false, false, null, k9sVar.l, true, false, null, null, null, null, null, null, null, null, null, null, null, false, null, 1608187872, 65534);
            default:
                oyg0 oyg0Var2 = (oyg0) obj;
                z2s z2sVar2 = (z2s) obj2;
                oyg0Var2.getClass();
                z2sVar2.getClass();
                long j3 = k9sVar.f17929a;
                q7x.F(oyg0Var2, Long.valueOf(j3), "KEY_GAME_ID");
                String str2 = k9sVar.g;
                long j4 = k9sVar.b;
                boolean z4 = k9sVar.z;
                q7x.F(oyg0Var2, Boolean.valueOf(z4), "KEY_LIVE");
                boolean z5 = k9sVar.W;
                boolean zS2 = k9sVar.s();
                boolean z6 = k9sVar.v;
                return z2s.a(z2sVar2, j3, str2, Long.valueOf(j4), z4, k9sVar.s, 0L, null, null, k9sVar.A, k9sVar.j, k9sVar.F, false, false, z5, false, zS2, false, false, z6, k9sVar.Z, false, false, false, null, k9sVar.l, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -543504416, 65535);
        }
    }
}
