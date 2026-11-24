package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.search.impl.navigation.SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gab0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10959a;
    public final /* synthetic */ sbb0 b;

    public /* synthetic */ gab0(sbb0 sbb0Var, byte b) {
        this.f10959a = b;
        this.b = sbb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f10959a;
        sbb0 sbb0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                p7m0 p7m0Var = sbb0Var.D0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, n7b0.a((n7b0) value, null, ar5.f1328a, null, null, 13)));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                p7m0 p7m0Var2 = sbb0Var.D0;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, n7b0.a((n7b0) value2, null, null, null, qd00.f28510a, 7)));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                sbb0Var.l.b(th3, new j3b0((byte) 4));
                break;
            case 3:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                eke0 eke0Var = sbb0Var.F;
                bhh0 bhh0Var = bhh0.f2606a;
                eke0Var.getClass();
                k0w0Var.h(new SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1(bhh0Var));
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                sbb0Var.l.b(th4, new lma0(sbb0Var, (byte) 10));
                break;
            case 5:
                ((List) obj).getClass();
                sbb0Var.C();
                break;
            case 6:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                sbb0Var.l.b(th5, new j3b0((byte) 5));
                break;
            default:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                sbb0Var.l.b(th6, new j3b0((byte) 6));
                break;
        }
        return Unit.f46060a;
    }
}
