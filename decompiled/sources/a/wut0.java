package a;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wut0 {
    public final n0o0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39807a;
    public final int b;
    public final nvt0 c;
    public final a8z d;
    public final String e;
    public final uvt0 f;
    public final gsj g;
    public final yvj h;
    public final a8z i;
    public final String j;
    public final boolean k;
    public final a8z l;
    public final byte m;
    public final Function0 n;
    public final Function0 o;
    public final nmt0 p;
    public final Function0 q;
    public final int r;
    public final int s;
    public final gfk0 t;
    public final a8z u;
    public final a8z v;
    public final List w;
    public final a8z x;
    public final Function0 y;
    public final Function2 z;

    public wut0(Context context, int i, nvt0 nvt0Var) {
        n0o0 n0o0VarB = maz.b(w7f.B);
        tvt0 tvt0Var = new tvt0();
        n0o0 n0o0VarB2 = maz.b(w7f.Y);
        gsj gsjVar = new gsj();
        gsjVar.f11832a = n0o0VarB2;
        yvj yvjVar = new yvj((byte) 0);
        n0o0 n0o0VarB3 = maz.b(w7f.Z);
        n0o0 n0o0VarB4 = maz.b(w7f.f1);
        vut0 vut0Var = vut0.b;
        vut0 vut0Var2 = vut0.c;
        context.getClass();
        nmt0 nmt0Var = new nmt0();
        nmt0Var.f23789a = context.getSharedPreferences("com.vkontakte.android_pref_name", 0);
        vut0 vut0Var3 = vut0.d;
        n0o0 n0o0VarB5 = maz.b(vut0.e);
        n0o0 n0o0VarB6 = maz.b(vut0.f);
        iun iunVar = iun.f15405a;
        n0o0 n0o0VarB7 = maz.b(w7f.z);
        w7f w7fVar = w7f.A;
        y43 y43Var = y43.e;
        iunVar.getClass();
        this.f39807a = context;
        this.b = i;
        this.c = nvt0Var;
        this.d = n0o0VarB;
        this.e = "5.131";
        this.f = tvt0Var;
        this.g = gsjVar;
        this.h = yvjVar;
        this.i = n0o0VarB3;
        this.j = "";
        this.k = true;
        this.l = n0o0VarB4;
        this.m = (byte) 3;
        this.n = vut0Var;
        this.o = vut0Var2;
        this.p = nmt0Var;
        this.q = vut0Var3;
        this.r = 3600000;
        this.s = 3600000;
        this.t = va3.f37065a;
        this.u = n0o0VarB5;
        this.v = n0o0VarB6;
        this.w = iunVar;
        this.x = n0o0VarB7;
        this.y = w7fVar;
        this.z = y43Var;
        this.A = maz.b(new sz2(this, (byte) 22));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wut0)) {
            return false;
        }
        wut0 wut0Var = (wut0) obj;
        return Intrinsics.d(this.f39807a, wut0Var.f39807a) && this.b == wut0Var.b && Intrinsics.d(this.c, wut0Var.c) && Intrinsics.d(this.d, wut0Var.d) && Intrinsics.d(this.e, wut0Var.e) && Intrinsics.d(this.f, wut0Var.f) && Intrinsics.d(this.g, wut0Var.g) && Intrinsics.d(this.h, wut0Var.h) && Intrinsics.d(this.i, wut0Var.i) && Intrinsics.d(this.j, wut0Var.j) && this.k == wut0Var.k && Intrinsics.d(this.l, wut0Var.l) && this.m == wut0Var.m && Intrinsics.d(this.n, wut0Var.n) && Intrinsics.d(this.o, wut0Var.o) && Intrinsics.d(this.p, wut0Var.p) && Intrinsics.d(this.q, wut0Var.q) && ((long) this.r) == ((long) wut0Var.r) && ((long) this.s) == ((long) wut0Var.s) && Intrinsics.d(this.t, wut0Var.t) && Intrinsics.d(this.u, wut0Var.u) && Intrinsics.d(this.v, wut0Var.v) && Intrinsics.d(this.w, wut0Var.w) && Intrinsics.d(this.x, wut0Var.x) && Intrinsics.d(this.y, wut0Var.y) && Intrinsics.d(this.z, wut0Var.z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v49 */
    public final int hashCode() {
        int iA = twn.a(this.b, this.f39807a.hashCode() * 31, 31);
        nvt0 nvt0Var = this.c;
        int iB = ua80.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ua80.b((this.d.hashCode() + ((iA + (nvt0Var == null ? 0 : nvt0Var.hashCode())) * 29791)) * 31, 31, this.e)) * 31)) * 31)) * 31)) * 31, 31, this.j);
        boolean z = this.k;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + dw9.a((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + rw2.b(rw2.b((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + twn.a(this.m, (this.l.hashCode() + ((iB + r2) * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31, this.r), 31, this.s)) * 31)) * 31)) * 31, 31, this.w)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKApiConfig(context=");
        sb.append(this.f39807a);
        sb.append(", appId=");
        sb.append(this.b);
        sb.append(", validationHandler=");
        sb.append(this.c);
        sb.append(", apiCallListener=null, sectionAvailabilityListener=null, deviceId=");
        sb.append(this.d);
        sb.append(", version=");
        sb.append(this.e);
        sb.append(", okHttpProvider=");
        sb.append(this.f);
        sb.append(", logger=");
        sb.append(this.g);
        sb.append(", loggingPrefixer=");
        sb.append(this.h);
        sb.append(", credentials=");
        sb.append(this.i);
        sb.append(", clientSecret=");
        sb.append(this.j);
        sb.append(", logFilterCredentials=");
        sb.append(this.k);
        sb.append(", debugCycleCalls=");
        sb.append(this.l);
        sb.append(", callsPerSecondLimit=");
        sb.append((int) this.m);
        sb.append(", apiHostProvider=");
        sb.append(this.n);
        sb.append(", langProvider=");
        sb.append(this.o);
        sb.append(", keyValueStorage=");
        sb.append(this.p);
        sb.append(", customApiEndpoint=");
        sb.append(this.q);
        sb.append(", maxRateLimitBackoffTimeoutMs=");
        sb.append(this.r);
        sb.append(", minRateLimitBackoffTimeoutMs=");
        sb.append(this.s);
        sb.append(", apiMethodPriorityBackoff=");
        sb.append(this.t);
        sb.append(", externalDeviceId=");
        sb.append(this.u);
        sb.append(", anonymousTokenProvider=");
        sb.append(this.v);
        sb.append(", customJsonResponseTypeConverters=");
        sb.append(this.w);
        sb.append(", accessTokenRefresher=");
        sb.append(this.x);
        sb.append(", expiresInReduceRatioJson=");
        sb.append(this.y);
        sb.append(", clientIdClientSecretMethodsTracker=");
        sb.append(this.z);
        sb.append(", xScreenProvider=null)");
        return sb.toString();
    }
}
