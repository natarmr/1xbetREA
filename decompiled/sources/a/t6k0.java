package a;

import android.javax.sip.ClientTransaction;
import android.javax.sip.SipProvider;
import android.javax.sip.message.Request;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class t6k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6k0 f33421a;
    public final String b;
    public final jt2 c;
    public final wti d;
    public final zx10 e;
    public final AtomicReference f;
    public final AtomicBoolean g;
    public s6k0 h;
    public long i;
    public String j;
    public String k;
    public String l;
    public String m;
    public Map n;

    public t6k0(r6k0 r6k0Var, String str, jt2 jt2Var) {
        r6k0Var.getClass();
        str.getClass();
        jt2Var.getClass();
        this.f33421a = r6k0Var;
        this.b = str;
        this.c = jt2Var;
        this.d = new wti((byte) 4);
        this.e = new zx10(r6k0Var);
        this.f = new AtomicReference(null);
        this.g = new AtomicBoolean(false);
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.n = lunVar;
    }

    public final qoj0 a(String str, String str2, String str3, Map map) {
        r6k0 r6k0Var = this.f33421a;
        AtomicBoolean atomicBoolean = this.g;
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        qoj0 qoj0VarB = roj0.b(0, 16, i99.b, 1);
        AtomicReference atomicReference = this.f;
        atomicReference.set(qoj0VarB);
        try {
            this.j = str;
            this.k = str2;
            this.l = str3;
            this.n = map;
            String string = UUID.randomUUID().toString();
            string.getClass();
            this.m = kotlin.text.c.r(string, "-", "", false);
            atomicBoolean.set(false);
            this.i = 1L;
            SipProvider sipProviderF = r6k0Var.f();
            String strB = r6k0.b();
            Request requestI = this.e.i(str, str2, strB, str3, this.i, this.m, map, 300);
            s6k0 s6k0Var = new s6k0(atomicReference, this.f33421a, this.c, atomicBoolean, new bg0(this, str, str2, strB, str3, sipProviderF, (byte) 17));
            s6k0 s6k0Var2 = this.h;
            if (s6k0Var2 != null) {
                sipProviderF.removeSipListener(s6k0Var2);
            }
            sipProviderF.addSipListener(s6k0Var);
            this.h = s6k0Var;
            ClientTransaction newClientTransaction = sipProviderF.getNewClientTransaction(requestI);
            newClientTransaction.getClass();
            newClientTransaction.sendRequest();
            this.c.f17078a.a("registerSent", "REGISTER sent");
            return qoj0VarB;
        } catch (Exception unused) {
            qoj0VarB.g(new y6k0(false));
            return qoj0VarB;
        }
    }
}
