package a;

import a.cp4;
import a.m1r;
import a.mq4;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class it4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15337a;
    public final /* synthetic */ ku4 b;

    public /* synthetic */ it4(ku4 ku4Var, byte b) {
        this.f15337a = b;
        this.b = ku4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        kuw kuwVar;
        byte b = this.f15337a;
        byte b2 = 1;
        byte b3 = 0;
        ku4 ku4Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ku4Var.s.b(th, new jt4(th, ku4Var));
                p7m0 p7m0Var = ku4Var.y;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                yje yjeVar = null;
                p7m0Var.o(null, bool);
                ku4Var.G(ut4.f36240a);
                p7m0 p7m0Var2 = ku4Var.w;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, ku4.J));
                p7m0 p7m0Var3 = ku4Var.z;
                do {
                    value2 = p7m0Var3.getValue();
                    ((Boolean) value2).getClass();
                } while (!p7m0Var3.m(value2, Boolean.TRUE));
                zhi0 zhi0Var = th instanceof zhi0 ? (zhi0) th : null;
                if (zhi0Var == null || (kuwVar = zhi0Var.c) == null || kuwVar.getErrorCode() != 37) {
                    v3c.N(ku4Var.E);
                    ku4Var.E = sac.T(new fnq(dtb.U(new eu4(dtb.z(ku4Var.i.b(), 1), (byte) 0), 1), new fu4(ku4Var, yjeVar, b3), (byte) 4), jiu0.a(ku4Var), gu4.h);
                }
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ku4Var.s.b(th2, new jt4(ku4Var, th2, b3));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                if (!hic.C(th3)) {
                    ku4Var.s.b(th3, new jt4(ku4Var, th3, (byte) 3));
                }
                break;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ku4Var.s.b(th4, new jt4(ku4Var, th4, b2));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                rek0 rek0Var = ku4Var.b;
                final mq4 mq4Var = ku4Var.o;
                rek0Var.getClass();
                mq4Var.getClass();
                k0w0Var.h(new FragmentScreen() { // from class: org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$authenticatorAuthHistoryScreen$1
                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        cp4.P1.getClass();
                        mq4 mq4Var2 = mq4Var;
                        mq4Var2.getClass();
                        cp4 cp4Var = new cp4();
                        cp4Var.M1.u(cp4Var, cp4.Q1[0], mq4Var2);
                        return cp4Var;
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
