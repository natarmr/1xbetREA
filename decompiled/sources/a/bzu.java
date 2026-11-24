package a;

import android.gov.nist.core.Separators;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class bzu implements zf60, v9g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3490a;
    public final Object b;

    public bzu(byte b) {
        this.f3490a = b;
        switch (b) {
            case 22:
                zn20 zn20Var = new zn20();
                this.b = zn20Var;
                if (!zn20Var.b) {
                    if (zn20Var.c) {
                        esb0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    zn20Var.a();
                    zn20Var.c = true;
                    break;
                }
                break;
            case 23:
                this.b = new StringBuilder(ujn.h);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.b = new HashSet();
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public edy a() {
        return new edy((LinkedHashMap) this.b);
    }

    public gmq b(boolean z) {
        qj9 qj9Var = (qj9) this.b;
        return z ? new eu4(new i89(qj9Var.f28826a.a(), (byte) 1), (byte) 2) : qj9Var.b();
    }

    public Boolean c(File file, dxk dxkVar) {
        n660 n660Var = (n660) this.b;
        file.getClass();
        return Boolean.valueOf(n660Var.p(file, dxkVar).exists() && System.currentTimeMillis() - vwb0.a((vwb0) n660Var.f22981a, "RULES_UPDATE_TIME") < 180000);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public Object d(zje zjeVar) {
        frx frxVar;
        sn00 sn00Var;
        byte b = this.f3490a;
        Object obj = this.b;
        switch (b) {
            case 18:
                if (zjeVar instanceof frx) {
                    frxVar = (frx) zjeVar;
                    int i = frxVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        frxVar.k = i - Integer.MIN_VALUE;
                    } else {
                        frxVar = new frx(this, zjeVar);
                    }
                } else {
                    frxVar = new frx(this, zjeVar);
                }
                Object objA = frxVar.i;
                wne wneVar = wne.f39444a;
                int i2 = frxVar.k;
                if (i2 == 0) {
                    z1x.P(objA);
                    frxVar.k = 1;
                    objA = ((rou) obj).a(false, frxVar);
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
                return Boolean.valueOf(((m2c0) objA).e0 == cau0.h);
            default:
                ali aliVar = (ali) obj;
                yzi yziVar = (yzi) aliVar.b;
                if (zjeVar instanceof sn00) {
                    sn00Var = (sn00) zjeVar;
                    int i3 = sn00Var.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        sn00Var.k = i3 - Integer.MIN_VALUE;
                    } else {
                        sn00Var = new sn00(this, zjeVar);
                    }
                } else {
                    sn00Var = new sn00(this, zjeVar);
                }
                Object objT = sn00Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = sn00Var.k;
                if (i4 == 0) {
                    z1x.P(objT);
                    if (yziVar.d + 15000 < System.currentTimeMillis()) {
                        sn00Var.k = 1;
                        objT = aliVar.t(sn00Var);
                        if (objT == wneVar2) {
                            return wneVar2;
                        }
                    }
                    return Unit.f46060a;
                }
                if (i4 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objT);
                p6j p6jVar = (p6j) objT;
                p6jVar.getClass();
                yziVar.getClass();
                yziVar.f43514a.g(p6jVar);
                return Unit.f46060a;
        }
    }

    public ArrayList e(uaq0 uaq0Var) {
        byte b = this.f3490a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 3:
                List list = uur0.d;
                boolean zO = StringsKt.O(((uur0) obj).f36316a.c(), "ru", false);
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    tur0 tur0Var = (tur0) obj2;
                    String strValueOf = String.valueOf(i2);
                    String str = zO ? "/ru/" : "/en/";
                    uaq0.f35345a.getClass();
                    String str2 = "_l";
                    if (!s9m0.j(uaq0Var)) {
                        if (s9m0.i(uaq0Var)) {
                            str2 = "_d";
                        } else if (s9m0.k(uaq0Var)) {
                            str2 = "_n";
                        }
                    }
                    arrayList.add(new sur0(tur0Var, b1j.k("static/img/android/instructions/toto", str, strValueOf, str2, ".png")));
                    i = i2;
                }
                return arrayList;
            default:
                jix jixVar = (jix) obj;
                List<iix> list2 = jix.c;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (iix iixVar : list2) {
                    boolean zO2 = StringsKt.O(jixVar.f16596a.c(), "ru", false);
                    iixVar.getClass();
                    String str3 = zO2 ? "/ru/" : "/en/";
                    uaq0.f35345a.getClass();
                    String str4 = "1_l";
                    if (!s9m0.j(uaq0Var)) {
                        if (s9m0.i(uaq0Var)) {
                            str4 = "1_d";
                        } else if (s9m0.k(uaq0Var)) {
                            str4 = "1_n";
                        }
                    }
                    arrayList2.add(new hix(iixVar, ua80.i("static/img/android/instructions/insights", str3, str4, ".png")));
                }
                return arrayList2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, zje zjeVar) {
        f6v f6vVar;
        if (zjeVar instanceof f6v) {
            f6vVar = (f6v) zjeVar;
            int i = f6vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6vVar.k = i - Integer.MIN_VALUE;
            } else {
                f6vVar = new f6v(this, zjeVar);
            }
        } else {
            f6vVar = new f6v(this, zjeVar);
        }
        Object obj = f6vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = f6vVar.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        cmt0 cmt0Var = (cmt0) this.b;
        f6vVar.k = 1;
        Serializable serializableB = cmt0Var.b(str, f6vVar);
        return serializableB == wneVar ? wneVar : serializableB;
    }

    public void g(String str) {
        StringBuilder sb = (StringBuilder) this.b;
        str.getClass();
        if (str.length() == 0) {
            sb.setLength(0);
            return;
        }
        if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
            sb.setLength(0);
            sb.append(str);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str, '/'));
        }
    }

    public mcy h(mcy mcyVar, String str) {
        str.getClass();
        mcyVar.getClass();
        return (mcy) ((LinkedHashMap) this.b).put(str, mcyVar);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) ((c0x) this.b).d.b;
        constraintLayout.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), uiv0Var.i(1).b, constraintLayout.getPaddingRight(), uiv0Var.i(2).d);
        return xiv0.b;
    }

    public bzu(rwc rwcVar) {
        this.f3490a = (byte) 12;
        rwcVar.getClass();
        this.b = rwcVar;
    }

    public bzu(m6d0 m6d0Var) {
        this.f3490a = (byte) 16;
        m6d0Var.getClass();
        this.b = m6d0Var;
    }

    public bzu(k1u0 k1u0Var) {
        this.f3490a = (byte) 7;
        k1u0Var.getClass();
        this.b = k1u0Var;
    }

    public bzu(h3v0 h3v0Var) {
        this.f3490a = (byte) 9;
        h3v0Var.getClass();
        this.b = h3v0Var;
    }

    public bzu(qj9 qj9Var) {
        this.f3490a = (byte) 6;
        qj9Var.getClass();
        this.b = qj9Var;
    }

    public bzu(ony onyVar) {
        this.f3490a = (byte) 26;
        onyVar.getClass();
        this.b = onyVar;
    }

    public bzu(cuw cuwVar) {
        this.f3490a = (byte) 13;
        cuwVar.getClass();
        this.b = cuwVar;
    }

    public bzu(vby vbyVar, vwb0 vwb0Var, rrc rrcVar, btt0 btt0Var, knf0 knf0Var, gii0 gii0Var, cad cadVar, ony onyVar, wsf0 wsf0Var, x1u x1uVar, edo edoVar, pru pruVar, epi0 epi0Var, f920 f920Var) {
        this.f3490a = (byte) 29;
        vbyVar.getClass();
        vwb0Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        gii0Var.getClass();
        onyVar.getClass();
        edoVar.getClass();
        f920Var.getClass();
        this.b = new o3c(cadVar, wsf0Var, epi0Var, btt0Var, knf0Var, gii0Var, onyVar, x1uVar, edoVar, pruVar, f920Var);
    }

    public bzu(n3d0 n3d0Var) {
        this.f3490a = (byte) 20;
        emd emdVar = new emd((byte) 1);
        v3d0 v3d0Var = n3d0Var.d;
        v3d0Var.getClass();
        t3d0 t3d0Var = n3d0Var.e;
        t3d0Var.getClass();
        i950 i950Var = new i950(v3d0Var, t3d0Var);
        if ((n3d0Var.c & 4) == 4) {
            m3d0 m3d0Var = n3d0Var.f;
            m3d0Var.getClass();
            m8x.r0(m3d0Var, i950Var, false, 6);
        }
        List<s2d0> list = n3d0Var.g;
        list.getClass();
        for (s2d0 s2d0Var : list) {
            s2d0Var.getClass();
            emdVar.f8040a.add(m8x.o0(s2d0Var, i950Var, false, 6));
        }
        this.b = emdVar;
    }

    public /* synthetic */ bzu(Object obj, byte b) {
        this.f3490a = b;
        this.b = obj;
    }
}
