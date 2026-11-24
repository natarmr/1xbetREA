package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$esportsGamesScreen$1;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11036a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gc0(jc0 jc0Var, uvc uvcVar, int i, boolean z) {
        this.f11036a = (byte) 0;
        this.d = jc0Var;
        this.e = uvcVar;
        this.b = i;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11036a;
        byte b2 = 2;
        boolean z = false;
        z = false;
        boolean z2 = this.c;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                uzc0 uzc0Var = (uzc0) ((jc0) obj3).k;
                int i2 = ((uvc) obj2).f36341a;
                mvc mvcVar = mvc.CMS_CODE_LIVE_CASINO;
                uzc0Var.getClass();
                k0w0Var.h(new PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1(i2, i, mvcVar, z2));
                break;
            case 1:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar = (a4x) ((pz40) obj3).getValue();
                i8zVar.e(a4xVar.size(), new ci2(new ma2((byte) 13), a4xVar, (byte) 6), new a8(new cl2(i, z ? (byte) 1 : (byte) 0), a4xVar, (byte) 3), new wl0(a4xVar, (byte) 7), new ugd(-1942245546, true, new ra2(a4xVar, z2, (Function1) obj2, b2)));
                break;
            case 2:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(new CyberGamesScreenFactoryImpl$esportsGamesScreen$1(((uzg) obj3).b, new EsportsGamesScreenParams.ChampsGames(i, (List) obj2, z2)));
                break;
            case 3:
                a4x a4xVar2 = (a4x) obj3;
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                byte b3 = 8;
                i8zVar2.e(a4xVar2.size(), new m160(new zc70((byte) 12), a4xVar2, (byte) 15), new a8(new cl2(i, b3), a4xVar2, (byte) 19), new a580(a4xVar2, (byte) 2), new ugd(-1942245546, true, new cz0(a4xVar2, z2, (Function1) obj2, b3)));
                break;
            default:
                mlr mlrVar = (mlr) obj3;
                String str = (String) obj2;
                long j = mlrVar.f22006a;
                String str2 = mlrVar.f;
                long j2 = mlrVar.c;
                boolean z3 = mlrVar.l;
                long j3 = mlrVar.b;
                boolean z4 = mlrVar.m;
                boolean z5 = mlrVar.n;
                int i3 = this.b;
                boolean z6 = this.c;
                c8d c8dVar = (c8d) ((k0w0) obj).h(jdk0.f(j, str2, j2, z3, j3, z4, false, i3, z5, z6, false, str, true)).f14945a;
                bjk bjkVar = cfx0.o;
                if (!z6 && !mlrVar.n) {
                    z = true;
                }
                c8dVar.f3908a = new v7d(z, bjkVar, bjkVar);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gc0(sd60 sd60Var, mlr mlrVar, int i, boolean z, String str) {
        this.f11036a = (byte) 4;
        this.d = mlrVar;
        this.b = i;
        this.c = z;
        this.e = str;
    }

    public /* synthetic */ gc0(Object obj, Object obj2, boolean z, int i, byte b) {
        this.f11036a = b;
        this.d = obj;
        this.b = i;
        this.c = z;
        this.e = obj2;
    }
}
