package a;

import a.jou0;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualCategoryDisciplinesParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zpu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44778a;
    public final /* synthetic */ dqu0 b;

    public /* synthetic */ zpu0(dqu0 dqu0Var, byte b) {
        this.f44778a = b;
        this.b = dqu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44778a;
        dqu0 dqu0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                dqu0Var.r.b(th, new b4u0((byte) 18));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                final vqc vqcVar = dqu0Var.v;
                final VirtualCategoryDisciplinesParams virtualCategoryDisciplinesParams = new VirtualCategoryDisciplinesParams(((upu0) dqu0Var.D()).f36085a.f46574a);
                vqcVar.getClass();
                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualGameCategoryDisciplinesScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        Object obj2 = vqcVar.b;
                        jou0.R1.getClass();
                        jou0 jou0Var = new jou0();
                        jou0Var.M1.J(jou0Var, jou0.S1[0], virtualCategoryDisciplinesParams);
                        return jou0Var;
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
}
