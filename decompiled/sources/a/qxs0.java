package a;

import java.net.UnknownHostException;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qxs0 implements wyk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29503a;
    private final String b;
    private final azk c;
    private final jzk d;
    private final nk50 e;

    public static final class a extends zje {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29504a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int f;

        public a(yje<? super a> yjeVar) {
            super(yjeVar);
        }

        @Override // a.zw5
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return qxs0.this.resolve(this);
        }
    }

    public qxs0(String str, String str2, azk azkVar, jzk jzkVar, nk50 nk50Var) {
        str.getClass();
        str2.getClass();
        azkVar.getClass();
        jzkVar.getClass();
        nk50Var.getClass();
        this.f29503a = str;
        this.b = str2;
        this.c = azkVar;
        this.d = jzkVar;
        this.e = nk50Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // a.wyk
    public Object resolve(yje<? super Collection<String>> yjeVar) throws Throwable {
        a aVar;
        Object g0g0Var;
        Throwable thA;
        azk azkVar;
        String strQ;
        Throwable th;
        qxs0 qxs0Var;
        Object obj;
        if (yjeVar instanceof a) {
            aVar = (a) yjeVar;
            int i = aVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(yjeVar);
            }
        } else {
            aVar = new a(yjeVar);
        }
        Object objE = aVar.d;
        wne wneVar = wne.f39444a;
        int i2 = aVar.f;
        try {
            if (i2 == 0) {
                z1x.P(objE);
                e0g0 e0g0Var = j0g0.b;
                jzk jzkVar = this.d;
                String str = this.f29503a;
                String str2 = this.b;
                aVar.f29504a = this;
                aVar.f = 1;
                objE = jzkVar.e(str, str2, aVar);
                if (objE != wneVar) {
                    qxs0Var = this;
                }
                return wneVar;
            }
            if (i2 == 1) {
                qxs0Var = (qxs0) aVar.f29504a;
                z1x.P(objE);
            } else {
                if (i2 == 2) {
                    obj = aVar.b;
                    z1x.P(objE);
                    g0g0Var = (Collection) obj;
                    e0g0 e0g0Var2 = j0g0.b;
                    thA = j0g0.a(g0g0Var);
                    if (thA == null) {
                        return g0g0Var;
                    }
                    azkVar = this.c;
                    strQ = w6x.q(this.b, " error -> ", thA.getMessage());
                    aVar.f29504a = thA;
                    aVar.b = null;
                    aVar.c = null;
                    aVar.f = 3;
                    if (((o8f) azkVar).c(aVar, strQ, false) != wneVar) {
                        th = thA;
                    }
                    return wneVar;
                }
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) aVar.f29504a;
                z1x.P(objE);
            }
            if ((th instanceof UnknownHostException) || ((rf3) this.e).f30367a.c()) {
                return xun.f41520a;
            }
            throw th;
            azk azkVar2 = qxs0Var.c;
            String str3 = qxs0Var.b;
            String strB0 = CollectionsKt.b0((Collection) objE, null, null, null, null, 63);
            if (StringsKt.W(strB0)) {
                strB0 = "empty";
            }
            String str4 = str3 + " -> " + ((Object) strB0);
            aVar.f29504a = null;
            aVar.b = objE;
            aVar.c = null;
            aVar.f = 2;
            if (((o8f) azkVar2).c(aVar, str4, true) != wneVar) {
                obj = objE;
                g0g0Var = (Collection) obj;
                e0g0 e0g0Var3 = j0g0.b;
                thA = j0g0.a(g0g0Var);
                if (thA == null) {
                    return g0g0Var;
                }
                azkVar = this.c;
                strQ = w6x.q(this.b, " error -> ", thA.getMessage());
                aVar.f29504a = thA;
                aVar.b = null;
                aVar.c = null;
                aVar.f = 3;
                if (((o8f) azkVar).c(aVar, strQ, false) != wneVar) {
                    th = thA;
                    if (th instanceof UnknownHostException) {
                    }
                    return xun.f41520a;
                }
            }
        } catch (Throwable th2) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th2);
        }
        return wneVar;
    }
}
