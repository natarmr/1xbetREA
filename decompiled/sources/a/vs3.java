package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.messages.navigation.MessagesScreens$PopUpBonusBottomSheetDialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vs3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37929a;
    public final /* synthetic */ zu3 b;

    public /* synthetic */ vs3(zu3 zu3Var, byte b) {
        this.f37929a = b;
        this.b = zu3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37929a;
        zu3 zu3Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                ((q840) zu3Var.B.get()).getClass();
                k0w0Var.h(new MessagesScreens$PopUpBonusBottomSheetDialogScreen());
                break;
            default:
                ((c1d0) zu3Var.f.get()).a();
                FragmentScreen$Companion$invoke$1 fragmentScreen$Companion$invoke$1 = new FragmentScreen$Companion$invoke$1(null, new hny((byte) 28), true);
                k0w0Var.getClass();
                k0w0Var.b(new y0w0(fragmentScreen$Companion$invoke$1));
                break;
        }
        return Unit.f46060a;
    }
}
