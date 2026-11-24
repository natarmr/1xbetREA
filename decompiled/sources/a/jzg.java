package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$teamDetailsScreen$1;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jzg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17410a;
    public final /* synthetic */ uzg b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ jzg(uzg uzgVar, long j, long j2, String str) {
        this.f17410a = (byte) 0;
        this.b = uzgVar;
        this.d = j;
        this.e = j2;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17410a;
        String str = this.c;
        uzg uzgVar = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$teamDetailsScreen$1(uzgVar.b, new TeamDetailsParams(this.d, this.e, this.c)));
                break;
            case 1:
                k0w0Var.getClass();
                zfm0 zfm0Var = (zfm0) uzgVar.e;
                str.getClass();
                k0w0Var.h(zfm0Var.f44307a.a(new TypeStageId.Game(str), 40L, this.d, this.e));
                break;
            default:
                k0w0Var.getClass();
                zfm0 zfm0Var2 = (zfm0) uzgVar.e;
                str.getClass();
                k0w0Var.k(zfm0Var2.f44307a.a(new TypeStageId.Game(str), 40L, this.d, this.e));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jzg(uzg uzgVar, String str, long j, long j2, byte b) {
        this.f17410a = b;
        this.b = uzgVar;
        this.c = str;
        this.d = j;
        this.e = j2;
    }
}
