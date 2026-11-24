package a;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* JADX INFO: loaded from: classes4.dex */
public final class pxs0 {
    public static final Set j = tx3.l0(new String[]{"8.8.8.8", "208.67.222.222", "208.67.220.220", "9.9.9.11", "149.112.112.11"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final azk f27769a;
    public final jzk b;
    public final vyk c;
    public final uyk d;
    public final nk50 e;
    public final tiu f;
    public final qoj0 g;
    public final n0o0 h;
    public c4m0 i;

    public pxs0(azk azkVar, jzk jzkVar, vyk vykVar, uyk uykVar, nk50 nk50Var, tiu tiuVar) {
        vykVar.getClass();
        uykVar.getClass();
        this.f27769a = azkVar;
        this.b = jzkVar;
        this.c = vykVar;
        this.d = uykVar;
        this.e = nk50Var;
        this.f = tiuVar;
        this.g = roj0.a(0, Integer.MAX_VALUE, i99.b);
        this.h = maz.b(new xns0((byte) 8));
    }

    public final void a() {
        c4m0 c4m0Var = this.i;
        if (c4m0Var != null) {
            egi0 egi0VarA = igi0.a((Function2) ((sx3) c4m0Var.getChildren()).b);
            while (egi0VarA.hasNext()) {
                ((bby) egi0VarA.next()).cancel(null);
            }
        }
        c4m0 c4m0Var2 = this.i;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, String str3, zje zjeVar) {
        mxs0 mxs0Var;
        Throwable th;
        String str4;
        Object g0g0Var;
        if (zjeVar instanceof mxs0) {
            mxs0Var = (mxs0) zjeVar;
            int i = mxs0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                mxs0Var.m = i - Integer.MIN_VALUE;
            } else {
                mxs0Var = new mxs0(this, zjeVar);
            }
        } else {
            mxs0Var = new mxs0(this, zjeVar);
        }
        Object objC = mxs0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = mxs0Var.m;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objC);
            if (!StringsKt.O(str, "://", false)) {
                str = ohs0.n(str3, str);
            }
            try {
                e0g0 e0g0Var = j0g0.b;
                mxs0Var.i = str2;
                mxs0Var.j = str;
                mxs0Var.m = 1;
                objC = this.d.c(str + str2, mxs0Var);
                if (objC == wneVar) {
                    return wneVar;
                }
                str4 = str;
            } catch (Throwable th2) {
                String str5 = str;
                th = th2;
                str4 = str5;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = mxs0Var.j;
            str2 = mxs0Var.i;
            try {
                z1x.P(objC);
            } catch (Throwable th3) {
                th = th3;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        g0g0Var = (jtf0) objC;
        e0g0 e0g0Var4 = j0g0.b;
        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.f46113a;
        f99 f99Var = new f99();
        f99Var.U(new byte[0], 0);
        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$2 = new ResponseBody$Companion$asResponseBody$1(null, 0L, f99Var);
        Response.Builder builder = new Response.Builder();
        builder.g = new if60(null, 0L);
        builder.c = 500;
        builder.d = "Response.error()";
        builder.b = Protocol.HTTP_1_1;
        Request.Builder builder2 = new Request.Builder();
        builder2.d("http://localhost/");
        builder.f46112a = new Request(builder2);
        Object objA = jtf0.a(responseBody$Companion$asResponseBody$2, builder.a());
        if (g0g0Var instanceof g0g0) {
            g0g0Var = objA;
        }
        jtf0 jtf0Var = (jtf0) g0g0Var;
        if (jtf0Var.f17098a.d == 200) {
            z = false;
        } else if (str2.length() <= 0) {
            m0c m0cVar = (m0c) jtf0Var.b;
            if (!(m0cVar != null ? Intrinsics.d(m0cVar.getIsAvailable(), Boolean.FALSE) : false)) {
                z = false;
            }
        }
        return new o9c(str4, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, zje zjeVar) {
        nxs0 nxs0Var;
        if (zjeVar instanceof nxs0) {
            nxs0Var = (nxs0) zjeVar;
            int i = nxs0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxs0Var.k = i - Integer.MIN_VALUE;
            } else {
                nxs0Var = new nxs0(this, zjeVar);
            }
        } else {
            nxs0Var = new nxs0(this, zjeVar);
        }
        Object objM = nxs0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nxs0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objM);
            ltb ltbVarZ = nkb.z(new otp0((Object) this, (Object) new String[]{str}, yjeVar, (byte) 6));
            nxs0Var.k = 1;
            objM = ntb.M(ltbVarZ, nxs0Var);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objM);
        }
        List list = (List) objM;
        if (list != null) {
            return list;
        }
        throw new UnknownHostException("No domains resolved");
    }
}
