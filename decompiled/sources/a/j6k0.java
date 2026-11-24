package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.SIPConstants;
import android.javax.sip.ClientTransaction;
import android.javax.sip.SipListener;
import android.javax.sip.SipProvider;
import android.javax.sip.message.Request;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j6k0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15992a;
    public final /* synthetic */ k6k0 b;
    public final /* synthetic */ t5k0 c;
    public final /* synthetic */ int d;

    public j6k0(int i, k6k0 k6k0Var, t5k0 t5k0Var, int i2) {
        this.f15992a = i;
        this.b = k6k0Var;
        this.c = t5k0Var;
        this.d = i2;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        jt2 jt2Var;
        a7k0 a7k0Var = (a7k0) obj;
        k6k0 k6k0Var = this.b;
        int i = k6k0Var.u.get();
        int i2 = this.f15992a;
        if (i2 != i) {
            return Unit.f46060a;
        }
        if (!Intrinsics.d(a7k0Var, z6k0.f43873a)) {
            if (!(a7k0Var instanceof y6k0)) {
                t9f.b();
                return null;
            }
            k6k0Var.t.set(false);
            k6k0Var.b(new f6k0(((y6k0) a7k0Var).f42102a));
            return Unit.f46060a;
        }
        final int i3 = this.d;
        t6k0 t6k0Var = k6k0Var.b;
        AtomicReference atomicReference = t6k0Var.f;
        r6k0 r6k0Var = t6k0Var.f33421a;
        if (r6k0Var.d != null) {
            try {
                SipProvider sipProviderF = r6k0Var.f();
                s6k0 s6k0Var = t6k0Var.h;
                if (s6k0Var != null) {
                    sipProviderF.removeSipListener(s6k0Var);
                }
                t6k0Var.h = null;
            } catch (Exception unused) {
            }
            atomicReference.set(null);
        } else {
            atomicReference.set(null);
        }
        k6k0Var.f.a();
        k6k0Var.f17776a.getClass();
        final String strB = r6k0.b();
        k6k0Var.b(e6k0.f7289a);
        x5k0 x5k0Var = k6k0Var.c;
        t5k0 t5k0Var = this.c;
        final String str = t5k0Var.f33373a;
        final String str2 = t5k0Var.c;
        final String str3 = t5k0Var.b;
        final String str4 = t5k0Var.d;
        final Map map = t5k0Var.e;
        jt2 jt2Var2 = x5k0Var.c;
        g090 g090Var = x5k0Var.h;
        AtomicReference atomicReference2 = x5k0Var.d;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        qoj0 qoj0VarB = roj0.b(0, 16, i99.b, 1);
        AtomicReference atomicReference3 = x5k0Var.e;
        atomicReference3.set(qoj0VarB);
        try {
            SipProvider sipProviderF2 = x5k0Var.f40323a.f();
            SipListener sipListener = ((y5k0) atomicReference2.get()).c;
            if (sipListener != null) {
                sipProviderF2.removeSipListener(sipListener);
            }
            String string = UUID.randomUUID().toString();
            string.getClass();
            final String str5 = str + Separators.AT + strB + "-" + string.substring(0, 8);
            String string2 = UUID.randomUUID().toString();
            string2.getClass();
            final String strSubstring = string2.substring(0, 4);
            jt2Var = jt2Var2;
            try {
                atomicReference2.getAndUpdate(new UnaryOperator() { // from class: a.u5k0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        ((y5k0) obj2).getClass();
                        return y5k0.a(y5k0.b(), null, null, null, false, 0, str4, strB, i3, map, str5, strSubstring, str, str2, str3, null, 0, 0, false, 2031743);
                    }
                });
                String string3 = UUID.randomUUID().toString();
                string3.getClass();
                Request requestC = x5k0Var.i.c(str4, strB, str, str2, str3, str5, strSubstring, SIPConstants.BRANCH_MAGIC_COOKIE.concat(kotlin.text.c.r(string3, "-", "", false)), g090Var.e(i3, strB, str), map);
                m6k0 m6k0Var = new m6k0(x5k0Var.c, g090Var, x5k0Var.f40323a, sipProviderF2, x5k0Var.b, atomicReference2, atomicReference3);
                sipProviderF2.addSipListener(m6k0Var);
                atomicReference2.getAndUpdate(new kmk(m6k0Var, (byte) 1));
                ClientTransaction newClientTransaction = sipProviderF2.getNewClientTransaction(requestC);
                newClientTransaction.getClass();
                atomicReference2.getAndUpdate(new v5k0(newClientTransaction, (byte) 0));
                newClientTransaction.sendRequest();
                jt2Var.f17078a.a("inviteSent", "INVITE sent");
            } catch (Exception e) {
                e = e;
                jt2Var.f17078a.a("inviteFailed", e.getClass().getSimpleName());
                x5k0Var.a();
                qoj0VarB.g(new w6k0("Failed to initiate call"));
            }
        } catch (Exception e2) {
            e = e2;
            jt2Var = jt2Var2;
        }
        qoj0.o(qoj0VarB, new n6d(i2, k6k0Var), yjeVar);
        return wne.f39444a;
    }
}
