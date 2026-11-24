package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.login.core.presentation.model.AuthDataModel;
import org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType;
import org.xplatform.login.new_place.api.navigation.SmsCodeExtras;
import org.xplatform.login.new_place.impl.navigation.ConfirmationNewPlaceScreen;
import org.xplatform.security.impl.navigation.TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class cc4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kc4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc4(kc4 kc4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = kc4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kc4 kc4Var = this.l;
        switch (b) {
            case 0:
                cc4 cc4Var = new cc4(kc4Var, yjeVar, (byte) 0);
                cc4Var.k = obj;
                return cc4Var;
            default:
                cc4 cc4Var2 = new cc4(kc4Var, yjeVar, (byte) 1);
                cc4Var2.k = obj;
                return cc4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cc4) create((fd4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cc4) create((mm4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        AuthDataModel authDataModel;
        Object value3;
        Object value4;
        Object value5;
        ConfirmationNewPlaceScreenType smsCode;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        byte b = 3;
        byte b2 = 2;
        byte b3 = 1;
        yje yjeVar = null;
        switch (this.i) {
            case 0:
                kc4 kc4Var = this.l;
                ctf0 ctf0Var = kc4Var.x;
                oyg0 oyg0Var = kc4Var.f;
                ocj ocjVar = kc4Var.i;
                fd4 fd4Var = (fd4) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    rc4 rc4Var = kc4Var.q;
                    this.k = fd4Var;
                    this.j = true;
                    rc4Var.getClass();
                    if (rc4Var.a(oc4.f25010a, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = kc4.Y;
                cmt cmtVar = kc4Var.I;
                kd4 kd4Var = kc4Var.J;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (Intrinsics.d(fd4Var, cd4.f4144a)) {
                    kc4Var.G(new gb4(ctf0Var.b.a(R.string.network_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.check_connection, Arrays.copyOf(new Object[0], 0)), false));
                    kc4Var.M();
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value9 = p7m0Var.getValue();
                        value9.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value9, mb4.a((mb4) value9, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                } else if (Intrinsics.d(fd4Var, tc4.f33701a)) {
                    kc4Var.R();
                    kc4Var.M();
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value8 = p7m0Var2.getValue();
                        value8.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value8, mb4.a((mb4) value8, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                } else if (Intrinsics.d(fd4Var, ad4.f660a)) {
                    kd4Var.getClass();
                    i1w0 i1w0Var = kd4Var.f18087a;
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 = new TwoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1();
                    if (twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1 instanceof DialogScreen) {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1)));
                    } else {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(twoFactorAuthenticationScreenFactoryImpl$getTwoFactoryAuthenticationScreen$1)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        } else {
                            p7m0 p7m0Var3 = ocjVar.f25029a;
                            do {
                                value7 = p7m0Var3.getValue();
                                value7.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var3.m(value7, mb4.a((mb4) value7, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                        }
                    }
                } else if (fd4Var instanceof zc4) {
                    AuthDataModel authDataModel2 = ((zc4) fd4Var).f44148a;
                    uu4 uu4VarA = vu4.a(authDataModel2);
                    kc4Var.U = kc4Var.J(new dnq(new fnq(new fnq(kc4Var.z.a(new p6a(atm0.m(uu4VarA), (byte) 3)), new wa(kc4Var, yjeVar, (byte) 11)), new ac4((Object) new ac4(kc4Var, uu4VarA, yjeVar, b3), (Object) new sb4(kc4Var, objArr2 == true ? 1 : 0), yjeVar, (byte) (objArr == true ? 1 : 0)), (byte) 4), new e00(kc4Var, yjeVar, b2), (byte) 0), kc4Var.s.c, new j94(1, new j94(1, new tb4(kc4Var, authDataModel2, (byte) 0), Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 3), jhy.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 4));
                } else if (fd4Var instanceof xc4) {
                    fn50 fn50Var = ((xc4) fd4Var).f40628a;
                    kd4Var.getClass();
                    String str = fn50Var.b;
                    String str2 = fn50Var.f;
                    if (fn50Var.d) {
                        smsCode = new ConfirmationNewPlaceScreenType.Authenticator(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, fn50Var.c);
                    } else {
                        smsCode = fn50Var.e ? new ConfirmationNewPlaceScreenType.SmsCode(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, SmsCodeExtras.None.f46760a) : new ConfirmationNewPlaceScreenType.Simple(str, "KEY_REQUEST_CONFIRMATION_NEW_PLACE", str2, fn50Var.g);
                    }
                    i1w0 i1w0Var2 = kd4Var.f18087a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    ConfirmationNewPlaceScreen confirmationNewPlaceScreen = new ConfirmationNewPlaceScreen(smsCode);
                    if (confirmationNewPlaceScreen instanceof DialogScreen) {
                        copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) confirmationNewPlaceScreen)));
                    } else {
                        copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(confirmationNewPlaceScreen)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayList2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        } else {
                            p7m0 p7m0Var4 = ocjVar.f25029a;
                            do {
                                value6 = p7m0Var4.getValue();
                                value6.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var4.m(value6, mb4.a((mb4) value6, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                        }
                    }
                } else if (fd4Var instanceof yc4) {
                    yc4 yc4Var = (yc4) fd4Var;
                    int iIntValue = yc4Var.f42367a.intValue();
                    String str3 = yc4Var.b;
                    f7u f7uVar = kc4Var.H;
                    ((y3v) f7uVar.b).s(String.valueOf(iIntValue));
                    ((s64) f7uVar.c).h(iIntValue);
                    kc4Var.G(new gb4(ctf0Var.b.a(R.string.authorization_error, Arrays.copyOf(new Object[0], 0)), str3, iIntValue == 136 ? ((mb4) kc4Var.D()).m.f : false));
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value5 = p7m0Var5.getValue();
                        value5.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var5.m(value5, mb4.a((mb4) value5, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                    kc4Var.M();
                } else if (fd4Var instanceof bd4) {
                    kc4Var.G(new gb4(ctf0Var.b.a(R.string.authorization_error, Arrays.copyOf(new Object[0], 0)), ((bd4) fd4Var).f2382a, false));
                    kc4Var.M();
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var6.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var6.m(value4, mb4.a((mb4) value4, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                } else if (fd4Var instanceof ed4) {
                    kc4Var.R();
                    kc4Var.M();
                    p7m0 p7m0Var7 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var7.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var7.m(value3, mb4.a((mb4) value3, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                } else if (fd4Var instanceof wc4) {
                    String str4 = ((wc4) fd4Var).f38908a;
                    AuthDataErrorModel authDataErrorModel = ((mb4) kc4Var.D()).l;
                    if (authDataErrorModel != null && (authDataModel = authDataErrorModel.b) != null) {
                        i3t0.A(kc4Var, kc4Var.p, new ol4(vu4.a(authDataModel), str4, cmtVar.g()), null, null, 6);
                    }
                } else if (Intrinsics.d(fd4Var, vc4.f37169a)) {
                    kc4Var.R();
                    kc4Var.M();
                    p7m0 p7m0Var8 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var8.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var8.m(value2, mb4.a((mb4) value2, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                } else if (Intrinsics.d(fd4Var, uc4.f35411a)) {
                    kc4Var.M();
                    p7m0 p7m0Var9 = ocjVar.f25029a;
                    do {
                        value = p7m0Var9.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var9.m(value, mb4.a((mb4) value, false, false, false, null, null, null, 0, false, null, null, false, 16375)));
                } else {
                    if (!(fd4Var instanceof dd4)) {
                        t9f.b();
                        return null;
                    }
                    i3t0.A(kc4Var, kc4Var.p, new vl4(((dd4) fd4Var).f5878a, cmtVar.g()), null, null, 6);
                }
                return Unit.f46060a;
            default:
                mm4 mm4Var = (mm4) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                kc4 kc4Var2 = this.l;
                if (!z2) {
                    z1x.P(obj);
                    im4 im4Var = kc4Var2.p;
                    this.k = mm4Var;
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(jl4.f16698a, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (mm4Var != null) {
                    if (mm4Var instanceof lm4) {
                        int i2 = kc4.Y;
                        kc4Var2.I(kc4Var2.s.f22085a, new sb4(kc4Var2, b2), new bu(kc4Var2, yjeVar, b));
                    } else if (mm4Var instanceof km4) {
                        kd4 kd4Var2 = kc4Var2.J;
                        kd4Var2.f18087a.d(new b33((Object) kd4Var2, (byte) 16));
                    } else if (mm4Var instanceof jm4) {
                        jm4 jm4Var = (jm4) mm4Var;
                        AuthDataErrorModel authDataErrorModel2 = new AuthDataErrorModel(jm4Var.f16747a, sc4.a(jm4Var.b));
                        int i3 = kc4.Y;
                        kc4Var2.O(authDataErrorModel2);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
