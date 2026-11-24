package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class eyg0 implements ept0, vkn0, qna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8628a;
    public final Object b;

    public eyg0(wy40 wy40Var) {
        this.f8628a = (byte) 25;
        this.b = wy40Var;
        u15 u15Var = xto0.A0;
        Class cls = (Class) wy40Var.e(u15Var, null);
        if (cls != null && !cls.equals(qrm0.class)) {
            itt0.l("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        wy40Var.y(fpt0.N0, hpt0.e);
        wy40Var.y(u15Var, qrm0.class);
        u15 u15Var2 = xto0.z0;
        if (wy40Var.e(u15Var2, null) == null) {
            wy40Var.y(u15Var2, qrm0.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // a.qna
    public void a(zj zjVar, bpn0 bpn0Var) {
        bpn0Var.getClass();
        zj zjVar2 = zj.f44462a;
        vvn0 vvn0Var = (vvn0) this.b;
        if (zjVar != zjVar2) {
            j6m0 j6m0Var = vvn0.W1;
            vvn0Var.K0().x(new dsn0(bpn0Var));
        } else {
            j6m0 j6m0Var2 = vvn0.W1;
            vvn0Var.K0().x(new asn0(bpn0Var));
            vvn0Var.K0().x(new urn0(vvn0Var.H0().r.f == vvn0Var.H0().S()));
        }
    }

    @Override // a.xro
    public wy40 b() {
        return (wy40) this.b;
    }

    @Override // a.ept0
    public fpt0 e() {
        return new rrm0(b780.j((wy40) this.b));
    }

    public String f(String str) {
        Object objE = c3x.E(1000L, new l0j0(this, str, (byte) 0));
        e0g0 e0g0Var = j0g0.b;
        if (objE instanceof g0g0) {
            objE = "";
        }
        return (String) objE;
    }

    public String g(String str) {
        Object objE = c3x.E(1000L, new l0j0(this, str, (byte) 1));
        e0g0 e0g0Var = j0g0.b;
        if (objE instanceof g0g0) {
            objE = "";
        }
        return (String) objE;
    }

    public String h(String str) {
        Object objE = c3x.E(1000L, new l0j0(this, str, (byte) 2));
        e0g0 e0g0Var = j0g0.b;
        if (objE instanceof g0g0) {
            objE = "";
        }
        return (String) objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(TreeMap treeMap, zje zjeVar) {
        u1p0 u1p0Var;
        if (zjeVar instanceof u1p0) {
            u1p0Var = (u1p0) zjeVar;
            int i = u1p0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u1p0Var.k = i - Integer.MIN_VALUE;
            } else {
                u1p0Var = new u1p0(this, zjeVar);
            }
        } else {
            u1p0Var = new u1p0(this, zjeVar);
        }
        Object objB = u1p0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = u1p0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            o1p0 o1p0Var = (o1p0) ((enj0) this.b).invoke();
            u1p0Var.k = 1;
            objB = o1p0Var.b(treeMap, u1p0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(TreeMap treeMap, zje zjeVar) {
        v1p0 v1p0Var;
        if (zjeVar instanceof v1p0) {
            v1p0Var = (v1p0) zjeVar;
            int i = v1p0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1p0Var.k = i - Integer.MIN_VALUE;
            } else {
                v1p0Var = new v1p0(this, zjeVar);
            }
        } else {
            v1p0Var = new v1p0(this, zjeVar);
        }
        Object objA = v1p0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = v1p0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            o1p0 o1p0Var = (o1p0) ((enj0) this.b).invoke();
            v1p0Var.k = 1;
            objA = o1p0Var.a(treeMap, v1p0Var);
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

    public String k(lu0 lu0Var) {
        r7v r7vVar = (r7v) this.b;
        String strG = axq.g();
        ku0 ku0Var = (ku0) r7vVar.f29996a;
        ku0Var.getClass();
        ku0Var.f18890a.put(strG, lu0Var);
        return strG;
    }

    public void l() {
        ((jm6) this.b).b.d("TIPS_BET_BUILDER_SHOWED", true);
    }

    public void m(vu00 vu00Var) {
        wu00 wu00Var = (wu00) ((hru) this.b).f13549a;
        wu00Var.getClass();
        wu00Var.f39769a.f(vu00Var);
    }

    public void n(boolean z) {
        byte b = this.f8628a;
        Object obj = this.b;
        switch (b) {
            case 11:
                ((xkn) ((rrc) obj).b).f41036a.o(null, Boolean.valueOf(z));
                break;
            default:
                ((sx40) obj).f32956a.f31247a.o(null, Boolean.valueOf(z));
                break;
        }
    }

    @Override // a.vkn0
    public String q() {
        return ((ykn0) this.b).c;
    }

    @Override // a.vkn0
    public void y(ukn0 ukn0Var) {
        ykn0 ykn0Var = (ykn0) this.b;
        int length = ykn0Var.e.length;
        for (int i = 1; i < length; i++) {
            int i2 = ykn0Var.e[i];
            if (i2 == 1) {
                ukn0Var.o(i, ykn0Var.f[i]);
            } else if (i2 == 2) {
                ukn0Var.p(ykn0Var.g[i], i);
            } else if (i2 == 3) {
                String str = ykn0Var.h[i];
                str.getClass();
                ukn0Var.r0(i, str);
            } else if (i2 == 4) {
                byte[] bArr = ykn0Var.i[i];
                bArr.getClass();
                ukn0Var.i(bArr, i);
            } else if (i2 == 5) {
                ukn0Var.s(i);
            }
        }
    }

    @Override // a.qna
    public void c(View view) {
    }

    @Override // a.qna
    public void d(zj zjVar) {
    }

    public eyg0(khb0 khb0Var) {
        this.f8628a = (byte) 15;
        khb0Var.getClass();
        this.b = khb0Var;
    }

    public eyg0(gok0 gok0Var) {
        this.f8628a = (byte) 17;
        gok0Var.getClass();
        this.b = gok0Var;
    }

    public eyg0(ost0 ost0Var) {
        this.f8628a = (byte) 18;
        ost0Var.getClass();
        this.b = ost0Var;
    }

    public eyg0(d49 d49Var) {
        this.f8628a = (byte) 23;
        d49Var.getClass();
        this.b = d49Var;
    }

    public eyg0(gii0 gii0Var, byte b) {
        this.f8628a = b;
        gii0Var.getClass();
        switch (b) {
            case 22:
                this.b = new enj0(gii0Var, (byte) 5);
                break;
            case 24:
                this.b = new enj0(gii0Var, (byte) 9);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.b = new enj0(gii0Var, (byte) 14);
                break;
            default:
                this.b = new enj0(gii0Var, (byte) 1);
                break;
        }
    }

    public eyg0(hoo hooVar) {
        this.f8628a = (byte) 4;
        hooVar.getClass();
        this.b = hooVar;
    }

    public /* synthetic */ eyg0(Object obj, byte b) {
        this.f8628a = b;
        this.b = obj;
    }
}
