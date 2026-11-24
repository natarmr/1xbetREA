package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.security.impl.presentation.otp_authenticator.OtpScreens$AddTwoFactoryAuthenticationScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class fjf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gjf0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjf0(gjf0 gjf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gjf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gjf0 gjf0Var = this.k;
        switch (b) {
            case 0:
                return new fjf0(gjf0Var, yjeVar, (byte) 0);
            default:
                fjf0 fjf0Var = new fjf0(gjf0Var, yjeVar, (byte) 1);
                fjf0Var.j = ((Boolean) obj).booleanValue();
                return fjf0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fjf0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fjf0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        gjf0 gjf0Var = this.k;
        switch (b) {
            case 0:
                ol60 ol60Var = gjf0Var.j;
                p7m0 p7m0Var = gjf0Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, ejf0.a((ejf0) value, true, null, false, false, 14)));
                    ol60Var.f(yif0.f42687a);
                    String str = ((ejf0) p7m0Var.getValue()).b;
                    zn00 zn00Var = gjf0Var.c;
                    this.j = true;
                    if (zn00Var.Q0(str, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ol60Var.f(new bjf0(gjf0Var.f.f(R.string.tfa_removed_new, new Object[0])));
                boolean z2 = gjf0Var.h;
                i1w0 i1w0Var = gjf0Var.g;
                if (z2) {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new d1w0(new OtpScreens$AddTwoFactoryAuthenticationScreen())), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = gjf0Var.i;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, ejf0.a((ejf0) value2, false, null, false, z3, 7)));
                return Unit.f46060a;
        }
    }
}
