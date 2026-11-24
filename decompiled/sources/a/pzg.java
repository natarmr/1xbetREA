package a;

import a.lb40;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.meta_heroes.presentation.MetaHeroesParams;
import org.xplatform.cyber.section.api.presentation.TransferScreenParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$transferScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pzg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27843a;
    public final /* synthetic */ uzg b;
    public final /* synthetic */ long c;

    public /* synthetic */ pzg(uzg uzgVar, long j, byte b) {
        this.f27843a = b;
        this.b = uzgVar;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27843a;
        long j = this.c;
        uzg uzgVar = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                final vqc vqcVar = uzgVar.b;
                final MetaHeroesParams metaHeroesParams = new MetaHeroesParams(j);
                k0w0Var.h(new FragmentScreen(vqcVar, metaHeroesParams) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$metaHeroesScreen$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ MetaHeroesParams f46594a;

                    {
                        this.f46594a = metaHeroesParams;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        lb40.P1.getClass();
                        lb40 lb40Var = new lb40();
                        lb40Var.O1.J(lb40Var, lb40.Q1[0], this.f46594a);
                        return lb40Var;
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
            default:
                k0w0Var.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$transferScreen$1(uzgVar.b, new TransferScreenParams(j, 40L)));
                break;
        }
        return Unit.f46060a;
    }
}
