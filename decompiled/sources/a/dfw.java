package a;

import a.m1r;
import a.q93;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dfw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6019a;
    public final /* synthetic */ hfw b;

    public /* synthetic */ dfw(hfw hfwVar, byte b) {
        this.f6019a = b;
        this.b = hfwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6019a;
        hfw hfwVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                hfwVar.q.b(th, new x2w((byte) 11));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                final vqc vqcVar = hfwVar.y;
                final long j = ((lew) hfwVar.D()).f19925a;
                vqcVar.getClass();
                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$anotherAwardsScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        Object obj2 = vqcVar.b;
                        q93.Q1.getClass();
                        q93 q93Var = new q93();
                        q93Var.O1.j(q93Var, q93.R1[1], j);
                        return q93Var;
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
