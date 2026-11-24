package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class szg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33070a;
    public final /* synthetic */ uzg b;
    public final /* synthetic */ String c;

    public /* synthetic */ szg(uzg uzgVar, String str, byte b) {
        this.f33070a = b;
        this.b = uzgVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33070a;
        uzg uzgVar = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                vqc vqcVar = uzgVar.b;
                String str = this.c;
                str.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1(vqcVar, str, 0L, false));
                break;
            default:
                k0w0Var.getClass();
                k0w0Var.h(((h6i) uzgVar.g.f24171a).c().h(this.c));
                break;
        }
        return Unit.f46060a;
    }
}
