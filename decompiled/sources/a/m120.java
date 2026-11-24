package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$RealityLimitErrorScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m120 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20983a;
    public final /* synthetic */ w220 b;

    public /* synthetic */ m120(w220 w220Var, byte b) {
        this.f20983a = b;
        this.b = w220Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20983a;
        w220 w220Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                w220Var.e0.b(th, new yr0(th, (byte) 13));
                break;
            case 1:
                th.getClass();
                w220Var.e0.b(th, new gm10((byte) 23));
                i1w0 i1w0VarS = w220Var.s.s();
                k0w0 k0w0Var = new k0w0(i1w0VarS);
                w220Var.d0.getClass();
                k0w0Var.h(new ResponsibleGamblingScreens$RealityLimitErrorScreen());
                ListIterator listIteratorO = b1j.o(i1w0VarS, k0w0Var.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        i1w0VarS.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 2:
                th.getClass();
                w220Var.e0.b(th, new gm10((byte) 22));
                i1w0 i1w0VarS2 = w220Var.s.s();
                k0w0 k0w0Var2 = new k0w0(i1w0VarS2);
                w220Var.d0.getClass();
                k0w0Var2.h(new ResponsibleGamblingScreens$RealityLimitErrorScreen());
                ListIterator listIteratorO2 = b1j.o(i1w0VarS2, k0w0Var2.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (pawVar2.hasNext()) {
                        i1w0VarS2.a((oe50) pawVar2.next());
                    }
                    break;
                }
                break;
            case 3:
                th.getClass();
                w220Var.e0.b(th, new gm10((byte) 21));
                break;
            case 4:
                th.getClass();
                w220Var.e0.b(th, new gm10((byte) 24));
                break;
            case 5:
                th.getClass();
                w220Var.e0.b(th, new yr0(th, (byte) 14));
                break;
            case 6:
                th.getClass();
                w220Var.e0.b(th, new gm10((byte) 26));
                break;
            case 7:
                th.getClass();
                w220Var.e0.b(th, new gm10((byte) 25));
                w220Var.A();
                break;
            case 8:
                th.getClass();
                w220Var.e0.b(th, new yr0(th, (byte) 11));
                break;
            case 9:
                th.getClass();
                w220Var.f0.f(th, new km00(th, (byte) 16));
                break;
            default:
                th.getClass();
                w220Var.e0.b(th, new yr0(th, (byte) 12));
                break;
        }
        return Unit.f46060a;
    }
}
