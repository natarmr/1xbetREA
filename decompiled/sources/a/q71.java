package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28227a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q71(f47 f47Var, long j, boolean z, String str) {
        this.f28227a = (byte) 5;
        this.d = f47Var;
        this.c = j;
        this.b = z;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28227a;
        boolean z = true;
        boolean z2 = this.b;
        long j = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                pu90 pu90Var = (pu90) obj3;
                pu90 pu90Var2 = (pu90) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.g(pu90Var, 0, 0, 0.0f);
                }
                if (pu90Var2 != null) {
                    if (z2) {
                        ou90Var.g(pu90Var2, pu90Var != null ? pu90Var.f27604a : 0, (p4e.h(j) / 2) - (pu90Var2.f27604a / 2), 0.0f);
                    } else {
                        ou90Var.g(pu90Var2, (p4e.i(j) / 2) - (pu90Var2.f27604a / 2), pu90Var != null ? pu90Var.b : 0, 0.0f);
                    }
                }
                return Unit.f46060a;
            case 1:
                Function2 function2 = (Function2) obj3;
                yk9 yk9Var = (yk9) obj2;
                ((qk9) obj).getClass();
                if (z2) {
                    function2.invoke(Long.valueOf(j), yk9Var);
                }
                return Unit.f46060a;
            case 2:
                jbm jbmVar = (jbm) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = jbmVar.c;
                hczVar.f(a4xVar.size(), new ctl((Object) new xjl((byte) 26), (Object) a4xVar, (byte) 12), new ctl((Object) new xjl((byte) 27), (Object) a4xVar, (byte) 13), new ugd(802480018, true, new ebm(a4xVar, this.b, this.c, (Function2) obj2, jbmVar)));
                return Unit.f46060a;
            case 3:
                ygs ygsVar = (ygs) obj2;
                int i = nnp.a0;
                qv2 qv2Var = ((nnp) obj3).y;
                GameBroadcastType gameBroadcastType = GameBroadcastType.c;
                grs grsVar = grs.b;
                ors orsVar = ors.f25750a;
                k1g k1gVar = k1g.OPEN_REGULAR;
                long j2 = ygsVar.f42600a;
                ((k0w0) obj).h(qv2Var.h(new GameScreenGeneralParams(j2, j2, ygsVar.d, ygsVar.B, this.b, ygsVar.f, ygsVar.c, gameBroadcastType, grsVar, "main_screen", ygsVar.e, orsVar, (int) j, false, k1g.OPEN_REGULAR)));
                return Unit.f46060a;
            case 4:
                v8d v8dVar = (v8d) obj3;
                sff0 sff0Var = (sff0) obj2;
                iz30 iz30Var = (iz30) obj;
                iz30Var.getClass();
                if ((iz30Var == iz30.w && !v8dVar.D) || ((iz30Var == iz30.p && !v8dVar.E) || ((iz30Var == iz30.j && !sff0Var.l.s) || ((iz30Var == iz30.r && !sff0Var.l.t) || (iz30Var == iz30.s && (!v8dVar.F || z2 || j == 0)))))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                String str = (String) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(uxs0.c((uxs0) ((f47) obj3).s, this.c, null, this.b, str, 6));
                return Unit.f46060a;
            default:
                ygs ygsVar2 = (ygs) obj2;
                qv2 qv2Var2 = ((rua0) obj3).t;
                GameBroadcastType gameBroadcastType2 = GameBroadcastType.c;
                grs grsVar2 = grs.b;
                ors orsVar2 = ors.f25750a;
                k1g k1gVar2 = k1g.UNKNOWN;
                long j3 = ygsVar2.f42600a;
                ((k0w0) obj).h(qv2Var2.h(new GameScreenGeneralParams(j3, j3, ygsVar2.d, ygsVar2.B, this.b, ygsVar2.f, ygsVar2.c, gameBroadcastType2, grsVar2, "main_screen", ygsVar2.e, orsVar2, (int) j, false, k1gVar2)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ q71(byte b, long j, Object obj, Object obj2, boolean z) {
        this.f28227a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = j;
    }

    public /* synthetic */ q71(jbm jbmVar, boolean z, long j, Function2 function2) {
        this.f28227a = (byte) 2;
        this.d = jbmVar;
        this.b = z;
        this.c = j;
        this.e = function2;
    }

    public /* synthetic */ q71(nnp nnpVar, ygs ygsVar, long j, boolean z) {
        this.f28227a = (byte) 3;
        this.d = nnpVar;
        this.e = ygsVar;
        this.c = j;
        this.b = z;
    }

    public /* synthetic */ q71(boolean z, Function2 function2, long j, yk9 yk9Var) {
        this.f28227a = (byte) 1;
        this.b = z;
        this.d = function2;
        this.c = j;
        this.e = yk9Var;
    }
}
