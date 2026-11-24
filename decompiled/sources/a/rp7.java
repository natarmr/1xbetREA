package a;

import a.m1r;
import a.mjh;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.tournament_bracket.CyberTournamentBracketParams;
import org.xplatform.feed.navigation.OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rp7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30872a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;

    public /* synthetic */ rp7(uzg uzgVar, long j, String str, long j2, long j3, boolean z, long j4) {
        this.h = uzgVar;
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = j4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30872a;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                Object obj3 = ((gr00) obj2).e;
                k0w0Var.h(new OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1(this.b, this.d, this.e, this.g, this.c, this.f));
                break;
            default:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                final vqc vqcVar = ((uzg) obj2).b;
                final CyberTournamentBracketParams cyberTournamentBracketParams = new CyberTournamentBracketParams(this.b, this.d, this.e, this.g, this.c, this.f);
                k0w0Var2.h(new FragmentScreen(vqcVar, cyberTournamentBracketParams) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$tournamentBracketScreen$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ CyberTournamentBracketParams f46602a;

                    {
                        this.f46602a = cyberTournamentBracketParams;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        mjh.Q1.getClass();
                        mjh mjhVar = new mjh();
                        mjhVar.P1.J(mjhVar, mjh.R1[1], this.f46602a);
                        return mjhVar;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ rp7(gr00 gr00Var, long j, long j2, String str, long j3, long j4, boolean z) {
        this.h = gr00Var;
        this.b = j;
        this.d = j2;
        this.c = str;
        this.e = j3;
        this.g = j4;
        this.f = z;
    }
}
