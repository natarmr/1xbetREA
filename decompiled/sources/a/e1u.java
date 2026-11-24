package a;

import android.net.Uri;
import android.provider.Settings;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class e1u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7053a;
    public final Object b;

    public e1u(pew pewVar) {
        this.f7053a = (byte) 18;
        pewVar.getClass();
        this.b = pewVar;
    }

    public xp90 a() {
        return ((u6t) this.b).b.f31721a.z();
    }

    public Object b(File file, String str, bnn0 bnn0Var) {
        pzu pzuVar = (pzu) this.b;
        return qjj.d0(((mne) pzuVar.e).b, new qkb0(pzuVar, file, str, null, (byte) 19), bnn0Var);
    }

    public Object c(String str, zje zjeVar) {
        q990 q990Var = (q990) this.b;
        return qjj.d0(q990Var.f28337a.b, new s980(q990Var, str, null, (byte) 11), zjeVar);
    }

    public List d(long j) {
        List list;
        ap0 ap0Var = ((jr0) this.b).b;
        mi1 mi1Var = ap0Var.c;
        if (mi1Var != null && (list = mi1Var.b) != null) {
            return list;
        }
        Object obj = ap0Var.f1227a.get(Long.valueOf(j));
        if (obj == null) {
            obj = iun.f15405a;
        }
        return (List) obj;
    }

    public List e(boolean z) {
        phj phjVar = (phj) ((uii) this.b).f35730a;
        if (z) {
            List list = (List) phjVar.c.b();
            return list == null ? iun.f15405a : list;
        }
        List list2 = (List) phjVar.d.b();
        return list2 == null ? iun.f15405a : list2;
    }

    public boolean f() {
        byte b = this.f7053a;
        Object obj = this.b;
        switch (b) {
            case 1:
                return axq.z((q7d0) ((wrh) obj).f39642a.b, "AUTO_STREAM_KEY", true);
            default:
                return ((Boolean) ((xkn) ((rrc) obj).b).f41036a.getValue()).booleanValue();
        }
    }

    public p760 g() {
        jm3 jm3Var = (jm3) this.b;
        q7d0 q7d0Var = jm3Var.f16745a;
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        String string = uri.toString();
        string.getClass();
        q7d0Var.getClass();
        String string2 = q7d0Var.a().getString("GlobalSoundPath", string);
        if (string2 == null) {
            string2 = uri.toString();
            string2.getClass();
        }
        String string3 = q7d0Var.a().getString("BaseChannelId", "");
        jm3Var.b.getClass();
        return new p760(string2, sj3.j0(string3, "prod_id_channel_base"), q7d0Var.a().getBoolean("NOTIFICATION_LIGHT", false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(zje zjeVar) {
        s6u s6uVar;
        if (zjeVar instanceof s6u) {
            s6uVar = (s6u) zjeVar;
            int i = s6uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s6uVar.k = i - Integer.MIN_VALUE;
            } else {
                s6uVar = new s6u(this, zjeVar);
            }
        } else {
            s6uVar = new s6u(this, zjeVar);
        }
        Object objC = s6uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = s6uVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                e0g0 e0g0Var = j0g0.b;
                dzg dzgVar = (dzg) this.b;
                s6uVar.k = 1;
                objC = dzgVar.c(s6uVar);
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
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) objC) {
                fal falVar = (fal) obj;
                if (falVar.d >= 0 && falVar.c.length() > 0) {
                    arrayList.add(obj);
                }
            }
            List listA0 = CollectionsKt.A0(arrayList, new vvt((byte) 10));
            e0g0 e0g0Var2 = j0g0.b;
            return listA0;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            return new g0g0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(List list, zje zjeVar) {
        z9u z9uVar;
        if (zjeVar instanceof z9u) {
            z9uVar = (z9u) zjeVar;
            int i = z9uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z9uVar.k = i - Integer.MIN_VALUE;
            } else {
                z9uVar = new z9u(this, zjeVar);
            }
        } else {
            z9uVar = new z9u(this, zjeVar);
        }
        Object obj = z9uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = z9uVar.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        d4t0 d4t0Var = (d4t0) this.b;
        z9uVar.k = 1;
        Object objC = d4t0Var.c(list, z9uVar);
        return objC == wneVar ? wneVar : objC;
    }

    public /* synthetic */ e1u(Object obj, byte b) {
        this.f7053a = b;
        this.b = obj;
    }

    public e1u(d4t0 d4t0Var) {
        this.f7053a = (byte) 12;
        d4t0Var.getClass();
        this.b = d4t0Var;
    }

    public e1u(edo edoVar) {
        this.f7053a = (byte) 9;
        edoVar.getClass();
        this.b = edoVar;
    }

    public e1u(bs20 bs20Var) {
        this.f7053a = (byte) 25;
        bs20Var.getClass();
        this.b = bs20Var;
    }

    public e1u(q2m0 q2m0Var) {
        this.f7053a = (byte) 16;
        q2m0Var.getClass();
        this.b = q2m0Var;
    }

    public e1u(gn40 gn40Var) {
        this.f7053a = (byte) 26;
        gn40Var.getClass();
        this.b = gn40Var;
    }
}
