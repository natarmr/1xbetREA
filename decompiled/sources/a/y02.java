package a;

import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y02 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41783a;
    public final /* synthetic */ int b;

    public /* synthetic */ y02(int i, byte b) {
        this.f41783a = b;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41783a;
        int i = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(i / 100.0f);
            case 1:
                ldm ldmVar = ldm.b;
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, i), null, ldmVar, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, 602);
            case 2:
                ldm ldmVar2 = ldm.b;
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, i), null, ldmVar2, 0, 0, R.string.bets_on_players_no_data_subtitle, 0, 0, 0L, 0L, 730);
            case 3:
                return new xcz(i, 2, 0);
            case 4:
                return androidx.compose.runtime.e.b(i);
            case 5:
                return androidx.compose.runtime.e.b(i);
            case 6:
                return Integer.valueOf(i);
            case 7:
                iun iunVar = iun.f15405a;
                return new qu50(iunVar, true, new mb10(lb10.f19735a, null), iunVar, this.b, false);
            case 8:
                pdm pdmVar = pdm.c;
                xuz xuzVar3 = pb10.c;
                pb10 pb10Var3 = pb10.r1;
                xuzVar3.getClass();
                return new mdm(xuz.a(pb10Var3, i), pdmVar, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 732);
            case 9:
                return androidx.compose.runtime.e.b(i);
            default:
                iun iunVar2 = iun.f15405a;
                o8u0 o8u0Var = o8u0.f24851a;
                mbu0.b.getClass();
                return new n9u0(iunVar2, o8u0Var, svs0.a(i));
        }
    }
}
