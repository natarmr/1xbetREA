package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wid implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39209a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ GameBroadcastType h;
    public final /* synthetic */ grs i;
    public final /* synthetic */ String j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ wid(Object obj, long j, long j2, long j3, boolean z, long j4, boolean z2, GameBroadcastType gameBroadcastType, grs grsVar, String str, int i, byte b) {
        this.f39209a = b;
        this.l = obj;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = j4;
        this.g = z2;
        this.h = gameBroadcastType;
        this.i = grsVar;
        this.j = str;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39209a;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                cad cadVar = ((hjd) obj2).u;
                k1g k1gVar = k1g.OPEN_REGULAR;
                k0w0Var.h(cadVar.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, false));
                break;
            default:
                l0s l0sVar = (l0s) obj2;
                cad cadVar2 = l0sVar.o;
                boolean z = l0sVar.z instanceof rq2;
                k1g k1gVar2 = k1g.OPEN_REGULAR;
                ((k0w0) obj).h(cadVar2.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z));
                break;
        }
        return Unit.f46060a;
    }
}
