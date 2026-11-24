package a;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Log;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dpi0 implements cfr, gm30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6468a;

    public dpi0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.f6468a = new enj0(gii0Var, (byte) 15);
                break;
            case 20:
            case 21:
            default:
                this.f6468a = new enj0(gii0Var, (byte) 2);
                break;
            case 22:
                this.f6468a = new lkr0(gii0Var, (byte) 4);
                break;
            case 23:
                this.f6468a = new lkr0(gii0Var, (byte) 10);
                break;
            case 24:
                this.f6468a = new lkr0(gii0Var, (byte) 13);
                break;
        }
    }

    @Override // a.gm30
    public void b(Bundle bundle) {
        ((MediaCodec) this.f6468a).setParameters(bundle);
    }

    @Override // a.gm30
    public void c(int i, int i2, int i3, long j) {
        ((MediaCodec) this.f6468a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // a.gm30
    public void d(int i, pef pefVar, long j, int i2) {
        ((MediaCodec) this.f6468a).queueSecureInputBuffer(i, 0, pefVar.i, j, i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Map map, zje zjeVar) {
        a9p0 a9p0Var;
        if (zjeVar instanceof a9p0) {
            a9p0Var = (a9p0) zjeVar;
            int i = a9p0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a9p0Var.k = i - Integer.MIN_VALUE;
            } else {
                a9p0Var = new a9p0(this, zjeVar);
            }
        } else {
            a9p0Var = new a9p0(this, zjeVar);
        }
        Object objC = a9p0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = a9p0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            z8p0 z8p0Var = (z8p0) ((enj0) this.f6468a).invoke();
            a9p0Var.k = 1;
            objC = z8p0Var.c(map, a9p0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return ((dx5) objC).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 == r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r6 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(a.sip r7, a.jo20 r8, a.zje r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6468a
            a.enj0 r0 = (a.enj0) r0
            boolean r1 = r9 instanceof a.b9p0
            if (r1 == 0) goto L17
            r1 = r9
            a.b9p0 r1 = (a.b9p0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.b9p0 r1 = new a.b9p0
            r1.<init>(r6, r9)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r9 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L53
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L69
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5a
            if (r6 != r5) goto L56
            java.lang.Object r6 = r0.invoke()
            a.z8p0 r6 = (a.z8p0) r6
            r1.k = r4
            java.lang.Object r6 = r6.a(r8, r1)
            if (r6 != r9) goto L53
            goto L68
        L53:
            a.dx5 r6 = (a.dx5) r6
            goto L6b
        L56:
            a.t9f.b()
            return r3
        L5a:
            java.lang.Object r6 = r0.invoke()
            a.z8p0 r6 = (a.z8p0) r6
            r1.k = r5
            java.lang.Object r6 = r6.b(r8, r1)
            if (r6 != r9) goto L69
        L68:
            return r9
        L69:
            a.dx5 r6 = (a.dx5) r6
        L6b:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dpi0.f(a.sip, a.jo20, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 == r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r6 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(a.sip r7, java.util.Map r8, a.zje r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f6468a
            a.enj0 r0 = (a.enj0) r0
            boolean r1 = r9 instanceof a.c9p0
            if (r1 == 0) goto L17
            r1 = r9
            a.c9p0 r1 = (a.c9p0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.c9p0 r1 = new a.c9p0
            r1.<init>(r6, r9)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r9 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L53
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L69
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5a
            if (r6 != r5) goto L56
            java.lang.Object r6 = r0.invoke()
            a.z8p0 r6 = (a.z8p0) r6
            r1.k = r4
            java.lang.Object r6 = r6.d(r8, r1)
            if (r6 != r9) goto L53
            goto L68
        L53:
            a.dx5 r6 = (a.dx5) r6
            goto L6b
        L56:
            a.t9f.b()
            return r3
        L5a:
            java.lang.Object r6 = r0.invoke()
            a.z8p0 r6 = (a.z8p0) r6
            r1.k = r5
            java.lang.Object r6 = r6.e(r8, r1)
            if (r6 != r9) goto L69
        L68:
            return r9
        L69:
            a.dx5 r6 = (a.dx5) r6
        L6b:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dpi0.g(a.sip, java.util.Map, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(long j, zje zjeVar) {
        aks0 aks0Var;
        if (zjeVar instanceof aks0) {
            aks0Var = (aks0) zjeVar;
            int i = aks0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                aks0Var.k = i - Integer.MIN_VALUE;
            } else {
                aks0Var = new aks0(this, zjeVar);
            }
        } else {
            aks0Var = new aks0(this, zjeVar);
        }
        Object objA = aks0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = aks0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ris0 ris0Var = (ris0) ((lkr0) this.f6468a).invoke();
            aks0Var.k = 1;
            objA = ris0Var.a(j, aks0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    public Object i(Set set, bnn0 bnn0Var) {
        Object objA = ((jh7) ((es) this.f6468a).b).f16514a.a(set, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public void j() {
        ((jix) this.f6468a).b.d("TIPS_INSIGHTS_SHOWED", true);
    }

    public boolean k() {
        return ((h83) this.f6468a).f12607a.length() > 0;
    }

    public lwi0 l(JSONObject jSONObject) {
        u1j0 gne0Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            gne0Var = new qud();
        } else {
            gne0Var = new gne0((byte) 20);
        }
        return gne0Var.a((j6m0) this.f6468a, jSONObject);
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
        ((xln0) this.f6468a).run();
    }

    @Override // a.gm30
    public void a() {
    }

    @Override // a.gm30
    public void flush() {
    }

    @Override // a.gm30
    public void shutdown() {
    }

    @Override // a.gm30
    public void start() {
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
    }

    public dpi0(bs20 bs20Var) {
        bs20Var.getClass();
        this.f6468a = bs20Var;
    }

    public dpi0(y6j0 y6j0Var) {
        y6j0Var.getClass();
        this.f6468a = y6j0Var;
    }

    public dpi0(zoq0 zoq0Var) {
        zoq0Var.getClass();
        this.f6468a = zoq0Var;
    }

    public dpi0(at4 at4Var) {
        at4Var.getClass();
        this.f6468a = at4Var;
    }

    public /* synthetic */ dpi0(Object obj) {
        this.f6468a = obj;
    }

    public dpi0(xxn0 xxn0Var) {
        xxn0Var.getClass();
        this.f6468a = xxn0Var;
    }

    public dpi0(j77 j77Var) {
        j77Var.getClass();
        this.f6468a = j77Var;
    }

    public dpi0(jtk0 jtk0Var) {
        jtk0Var.getClass();
        this.f6468a = jtk0Var;
    }

    public dpi0(gii0 gii0Var, knf0 knf0Var, peg0 peg0Var) {
        gii0Var.getClass();
        knf0Var.getClass();
        this.f6468a = new wti((Object) gii0Var, (Object) knf0Var, (byte) 0);
    }

    public dpi0(byte b) {
        switch (b) {
            case 15:
                this.f6468a = new h83();
                break;
            default:
                this.f6468a = new gle0();
                break;
        }
    }
}
