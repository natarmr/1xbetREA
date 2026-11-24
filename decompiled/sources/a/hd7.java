package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hd7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12856a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hd7(Object obj, long j, long j2, Object obj2, boolean z, byte b) {
        this.f12856a = b;
        this.e = obj;
        this.b = j;
        this.c = j2;
        this.f = obj2;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12856a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                z0w z0wVar = (z0w) obj2;
                ((k0w0) obj).h(((kd7) obj3).X.h(new GameScreenGeneralParams(this.b, this.c, z0wVar.t, z0wVar.I, this.d, z0wVar.f43588a, z0wVar.l, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN)));
                break;
            default:
                uv6 uv6Var = (uv6) obj2;
                ((k0w0) obj).h(((q5w) obj3).f.h(new GameScreenGeneralParams(this.b, this.c, uv6Var.t, uv6Var.I, this.d, uv6Var.f36333a, uv6Var.l, GameBroadcastType.c, grs.b, "main_screen", "", ors.f25750a, 0, false, k1g.UNKNOWN)));
                break;
        }
        return Unit.f46060a;
    }
}
