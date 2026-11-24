package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.MissingFormatArgumentException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class pyu implements pp9, tdo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f27815a;

    public pyu(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 22:
                this.f27815a = new tpv(gii0Var, (byte) 17);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.f27815a = new tpv(gii0Var, (byte) 21);
                break;
            default:
                this.f27815a = new tpv(gii0Var, (byte) 4);
                break;
        }
    }

    public static boolean l(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String q(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String strF = f(str);
        return "1".equals(strF) || Boolean.parseBoolean(strF);
    }

    public Integer b(String str) {
        String strF = f(str);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strF));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + q(str) + Separators.LPAREN + strF + ") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String strF = f(str);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        try {
            return new JSONArray(strF);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + q(str) + ": " + strF + ", falling back to default");
            return null;
        }
    }

    public String d(Resources resources, String str, String str2) {
        String[] strArr;
        String strF = f(str2);
        if (!TextUtils.isEmpty(strF)) {
            return strF;
        }
        String strF2 = f(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strF2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strF2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", q(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayC = c(str2.concat("_loc_args"));
        if (jSONArrayC == null) {
            strArr = null;
        } else {
            int length = jSONArrayC.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayC.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + q(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x020c  */
    /* JADX WARN: Code duplicated, block: B:93:0x021d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c3 A[SYNTHETIC] */
    public Object e(aw20 aw20Var, zje zjeVar) {
        y230 y230Var;
        aw20 aw20Var2;
        trv trvVar;
        Object next;
        rw20 rw20Var;
        aw20 aw20Var3;
        urv urvVar;
        int iIntValue;
        Iterator it;
        Object next2;
        sw20 sw20Var;
        sw20 sw20Var2;
        h0d h0dVar;
        Integer num;
        urv urvVar2;
        sw20 sw20Var3;
        int iIntValue2;
        Iterator it2;
        Object next3;
        i0d i0dVar;
        r4d r4dVar;
        Integer num2;
        sw20 sw20Var4;
        i0d i0dVar2;
        int iIntValue3;
        Iterator it3;
        Object next4;
        s4d s4dVar;
        s4d s4dVar2;
        htz htzVar;
        Integer num3;
        s4d s4dVar3;
        sw20 sw20Var5;
        i0d i0dVar3;
        urv urvVar3;
        aw20 aw20Var4;
        int iIntValue4;
        Iterator it4;
        Object next5;
        qy20 qy20Var;
        v230 v230Var = (v230) this.f27815a;
        if (zjeVar instanceof y230) {
            y230Var = (y230) zjeVar;
            int i = y230Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                y230Var.q = i - Integer.MIN_VALUE;
            } else {
                y230Var = new y230(this, zjeVar);
            }
        } else {
            y230Var = new y230(this, zjeVar);
        }
        Object obj = y230Var.o;
        wne wneVar = wne.f39444a;
        int i2 = y230Var.q;
        if (i2 == 0) {
            z1x.P(obj);
            trv trvVar2 = urv.b;
            byte b = aw20Var.f1552a.f36181a;
            y230Var.i = aw20Var;
            y230Var.j = trvVar2;
            y230Var.q = 1;
            Integer num4 = new Integer(ua80.c(v230Var.f36665a, "HEADER_SIZE_KEY", b));
            if (num4 != wneVar) {
                aw20Var2 = aw20Var;
                trvVar = trvVar2;
                obj = num4;
            }
            return wneVar;
        }
        if (i2 == 1) {
            trvVar = (trv) y230Var.j;
            aw20Var2 = y230Var.i;
            z1x.P(obj);
        } else {
            if (i2 == 2) {
                rw20Var = (rw20) y230Var.k;
                urvVar = (urv) y230Var.j;
                aw20Var3 = y230Var.i;
                z1x.P(obj);
                iIntValue = ((Number) obj).intValue();
                rw20Var.getClass();
                it = sw20.g.iterator();
                do {
                    if (it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((sw20) next2).f32901a != iIntValue);
                sw20Var = (sw20) next2;
                if (sw20Var == null) {
                    sw20Var2 = sw20.SIZE_1;
                } else {
                    sw20Var2 = sw20Var;
                }
                h0dVar = i0d.b;
                byte b2 = aw20Var3.c.f13944a;
                y230Var.i = aw20Var3;
                y230Var.j = urvVar;
                y230Var.k = sw20Var2;
                y230Var.l = h0dVar;
                y230Var.q = 3;
                num = new Integer(ua80.c(v230Var.f36665a, "COEFFICIENT_SIZE_KEY", b2));
                if (num != wneVar) {
                    urvVar2 = urvVar;
                    sw20Var3 = sw20Var2;
                    obj = num;
                    iIntValue2 = ((Number) obj).intValue();
                    h0dVar.getClass();
                    it2 = i0d.h.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it2.next();
                    } while (((i0d) next3).f13944a != iIntValue2);
                    i0dVar = (i0d) next3;
                    if (i0dVar == null) {
                        i0dVar = i0d.SIZE_1;
                    }
                    r4dVar = s4d.b;
                    byte b3 = aw20Var3.d.f31599a;
                    y230Var.i = aw20Var3;
                    y230Var.j = urvVar2;
                    y230Var.k = sw20Var3;
                    y230Var.l = i0dVar;
                    y230Var.m = r4dVar;
                    y230Var.q = 4;
                    num2 = new Integer(ua80.c(v230Var.f36665a, "COLOR_SCHEME_KEY", b3));
                    if (num2 != wneVar) {
                        obj = num2;
                        sw20Var4 = sw20Var3;
                        i0dVar2 = i0dVar;
                        iIntValue3 = ((Number) obj).intValue();
                        r4dVar.getClass();
                        it3 = s4d.g.iterator();
                        do {
                            if (it3.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it3.next();
                        } while (((s4d) next4).f31599a != iIntValue3);
                        s4dVar = (s4d) next4;
                        if (s4dVar == null) {
                            s4dVar2 = s4d.TWO_TONE;
                        } else {
                            s4dVar2 = s4dVar;
                        }
                        htzVar = qy20.b;
                        byte b4 = aw20Var3.e.f29514a;
                        y230Var.i = aw20Var3;
                        y230Var.j = urvVar2;
                        y230Var.k = sw20Var4;
                        y230Var.l = i0dVar2;
                        y230Var.m = s4dVar2;
                        y230Var.n = htzVar;
                        y230Var.q = 5;
                        num3 = new Integer(ua80.c(v230Var.f36665a, "MARKETS_ARRANGEMENT_KEY", b4));
                        if (num3 != wneVar) {
                            urv urvVar4 = urvVar2;
                            s4dVar3 = s4dVar2;
                            obj = num3;
                            sw20Var5 = sw20Var4;
                            i0dVar3 = i0dVar2;
                            urvVar3 = urvVar4;
                            aw20Var4 = aw20Var3;
                        }
                    }
                }
                return wneVar;
            }
            if (i2 == 3) {
                h0dVar = (h0d) y230Var.l;
                sw20Var3 = (sw20) y230Var.k;
                urvVar2 = (urv) y230Var.j;
                aw20Var3 = y230Var.i;
                z1x.P(obj);
                iIntValue2 = ((Number) obj).intValue();
                h0dVar.getClass();
                it2 = i0d.h.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (((i0d) next3).f13944a != iIntValue2);
                i0dVar = (i0d) next3;
                if (i0dVar == null) {
                    i0dVar = i0d.SIZE_1;
                }
                r4dVar = s4d.b;
                byte b5 = aw20Var3.d.f31599a;
                y230Var.i = aw20Var3;
                y230Var.j = urvVar2;
                y230Var.k = sw20Var3;
                y230Var.l = i0dVar;
                y230Var.m = r4dVar;
                y230Var.q = 4;
                num2 = new Integer(ua80.c(v230Var.f36665a, "COLOR_SCHEME_KEY", b5));
                if (num2 != wneVar) {
                    obj = num2;
                    sw20Var4 = sw20Var3;
                    i0dVar2 = i0dVar;
                    iIntValue3 = ((Number) obj).intValue();
                    r4dVar.getClass();
                    it3 = s4d.g.iterator();
                    do {
                        if (it3.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it3.next();
                    } while (((s4d) next4).f31599a != iIntValue3);
                    s4dVar = (s4d) next4;
                    if (s4dVar == null) {
                        s4dVar2 = s4d.TWO_TONE;
                    } else {
                        s4dVar2 = s4dVar;
                    }
                    htzVar = qy20.b;
                    byte b6 = aw20Var3.e.f29514a;
                    y230Var.i = aw20Var3;
                    y230Var.j = urvVar2;
                    y230Var.k = sw20Var4;
                    y230Var.l = i0dVar2;
                    y230Var.m = s4dVar2;
                    y230Var.n = htzVar;
                    y230Var.q = 5;
                    num3 = new Integer(ua80.c(v230Var.f36665a, "MARKETS_ARRANGEMENT_KEY", b6));
                    if (num3 != wneVar) {
                        urv urvVar5 = urvVar2;
                        s4dVar3 = s4dVar2;
                        obj = num3;
                        sw20Var5 = sw20Var4;
                        i0dVar3 = i0dVar2;
                        urvVar3 = urvVar5;
                        aw20Var4 = aw20Var3;
                    }
                }
                return wneVar;
            }
            if (i2 == 4) {
                r4dVar = (r4d) y230Var.m;
                i0dVar2 = (i0d) y230Var.l;
                sw20Var4 = (sw20) y230Var.k;
                urvVar2 = (urv) y230Var.j;
                aw20Var3 = y230Var.i;
                z1x.P(obj);
                iIntValue3 = ((Number) obj).intValue();
                r4dVar.getClass();
                it3 = s4d.g.iterator();
                do {
                    if (it3.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it3.next();
                } while (((s4d) next4).f31599a != iIntValue3);
                s4dVar = (s4d) next4;
                if (s4dVar == null) {
                    s4dVar2 = s4d.TWO_TONE;
                } else {
                    s4dVar2 = s4dVar;
                }
                htzVar = qy20.b;
                byte b7 = aw20Var3.e.f29514a;
                y230Var.i = aw20Var3;
                y230Var.j = urvVar2;
                y230Var.k = sw20Var4;
                y230Var.l = i0dVar2;
                y230Var.m = s4dVar2;
                y230Var.n = htzVar;
                y230Var.q = 5;
                num3 = new Integer(ua80.c(v230Var.f36665a, "MARKETS_ARRANGEMENT_KEY", b7));
                if (num3 != wneVar) {
                    urv urvVar6 = urvVar2;
                    s4dVar3 = s4dVar2;
                    obj = num3;
                    sw20Var5 = sw20Var4;
                    i0dVar3 = i0dVar2;
                    urvVar3 = urvVar6;
                    aw20Var4 = aw20Var3;
                }
                return wneVar;
            }
            if (i2 != 5) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            htzVar = y230Var.n;
            s4d s4dVar4 = (s4d) y230Var.m;
            i0d i0dVar4 = (i0d) y230Var.l;
            sw20Var5 = (sw20) y230Var.k;
            urv urvVar7 = (urv) y230Var.j;
            aw20Var4 = y230Var.i;
            z1x.P(obj);
            i0dVar3 = i0dVar4;
            urvVar3 = urvVar7;
            s4dVar3 = s4dVar4;
        }
        iIntValue4 = ((Number) obj).intValue();
        htzVar.getClass();
        it4 = qy20.e.iterator();
        do {
            if (it4.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it4.next();
        } while (((qy20) next5).f29514a != iIntValue4);
        qy20Var = (qy20) next5;
        if (qy20Var == null) {
            qy20Var = qy20.ROW;
        }
        aw20 aw20Var5 = new aw20(urvVar3, sw20Var5, i0dVar3, s4dVar3, qy20Var, aw20Var4.f);
        v230Var.getClass();
        v230Var.b.o(null, aw20Var5);
        return aw20Var5;
        int iIntValue5 = ((Number) obj).intValue();
        trvVar.getClass();
        Iterator it5 = urv.h.iterator();
        do {
            if (!it5.hasNext()) {
                next = null;
                break;
            }
            next = it5.next();
        } while (((urv) next).f36181a != iIntValue5);
        urv urvVar8 = (urv) next;
        if (urvVar8 == null) {
            urvVar8 = urv.SIZE_1;
        }
        rw20Var = sw20.b;
        byte b8 = aw20Var2.b.f32901a;
        y230Var.i = aw20Var2;
        y230Var.j = urvVar8;
        y230Var.k = rw20Var;
        y230Var.q = 2;
        Integer num5 = new Integer(ua80.c(v230Var.f36665a, "MARKET_SIZE_KEY", b8));
        if (num5 != wneVar) {
            obj = num5;
            aw20Var3 = aw20Var2;
            urvVar = urvVar8;
            iIntValue = ((Number) obj).intValue();
            rw20Var.getClass();
            it = sw20.g.iterator();
            do {
                if (it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((sw20) next2).f32901a != iIntValue);
            sw20Var = (sw20) next2;
            if (sw20Var == null) {
                sw20Var2 = sw20.SIZE_1;
            } else {
                sw20Var2 = sw20Var;
            }
            h0dVar = i0d.b;
            byte b9 = aw20Var3.c.f13944a;
            y230Var.i = aw20Var3;
            y230Var.j = urvVar;
            y230Var.k = sw20Var2;
            y230Var.l = h0dVar;
            y230Var.q = 3;
            num = new Integer(ua80.c(v230Var.f36665a, "COEFFICIENT_SIZE_KEY", b9));
            if (num != wneVar) {
                urvVar2 = urvVar;
                sw20Var3 = sw20Var2;
                obj = num;
                iIntValue2 = ((Number) obj).intValue();
                h0dVar.getClass();
                it2 = i0d.h.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (((i0d) next3).f13944a != iIntValue2);
                i0dVar = (i0d) next3;
                if (i0dVar == null) {
                    i0dVar = i0d.SIZE_1;
                }
                r4dVar = s4d.b;
                byte b10 = aw20Var3.d.f31599a;
                y230Var.i = aw20Var3;
                y230Var.j = urvVar2;
                y230Var.k = sw20Var3;
                y230Var.l = i0dVar;
                y230Var.m = r4dVar;
                y230Var.q = 4;
                num2 = new Integer(ua80.c(v230Var.f36665a, "COLOR_SCHEME_KEY", b10));
                if (num2 != wneVar) {
                    obj = num2;
                    sw20Var4 = sw20Var3;
                    i0dVar2 = i0dVar;
                    iIntValue3 = ((Number) obj).intValue();
                    r4dVar.getClass();
                    it3 = s4d.g.iterator();
                    do {
                        if (it3.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it3.next();
                    } while (((s4d) next4).f31599a != iIntValue3);
                    s4dVar = (s4d) next4;
                    if (s4dVar == null) {
                        s4dVar2 = s4d.TWO_TONE;
                    } else {
                        s4dVar2 = s4dVar;
                    }
                    htzVar = qy20.b;
                    byte b11 = aw20Var3.e.f29514a;
                    y230Var.i = aw20Var3;
                    y230Var.j = urvVar2;
                    y230Var.k = sw20Var4;
                    y230Var.l = i0dVar2;
                    y230Var.m = s4dVar2;
                    y230Var.n = htzVar;
                    y230Var.q = 5;
                    num3 = new Integer(ua80.c(v230Var.f36665a, "MARKETS_ARRANGEMENT_KEY", b11));
                    if (num3 != wneVar) {
                        urv urvVar9 = urvVar2;
                        s4dVar3 = s4dVar2;
                        obj = num3;
                        sw20Var5 = sw20Var4;
                        i0dVar3 = i0dVar2;
                        urvVar3 = urvVar9;
                        aw20Var4 = aw20Var3;
                        iIntValue4 = ((Number) obj).intValue();
                        htzVar.getClass();
                        it4 = qy20.e.iterator();
                        do {
                            if (it4.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it4.next();
                        } while (((qy20) next5).f29514a != iIntValue4);
                        qy20Var = (qy20) next5;
                        if (qy20Var == null) {
                            qy20Var = qy20.ROW;
                        }
                        aw20 aw20Var6 = new aw20(urvVar3, sw20Var5, i0dVar3, s4dVar3, qy20Var, aw20Var4.f);
                        v230Var.getClass();
                        v230Var.b.o(null, aw20Var6);
                        return aw20Var6;
                    }
                }
            }
        }
        return wneVar;
    }

    public String f(String str) {
        Bundle bundle = (Bundle) this.f27815a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @Override // a.pp9
    public void g(to9 to9Var, jtf0 jtf0Var) {
        boolean z = jtf0Var.f17098a.q;
        n5a n5aVar = (n5a) this.f27815a;
        if (z) {
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(jtf0Var.b);
        } else {
            e0g0 e0g0Var2 = j0g0.b;
            n5aVar.resumeWith(new g0g0(new rtw(jtf0Var)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object h(String str, zje zjeVar) {
        ko00 ko00Var;
        if (zjeVar instanceof ko00) {
            ko00Var = (ko00) zjeVar;
            int i = ko00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ko00Var.k = i - Integer.MIN_VALUE;
            } else {
                ko00Var = new ko00(this, zjeVar);
            }
        } else {
            ko00Var = new ko00(this, zjeVar);
        }
        Object objD0 = ko00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ko00Var.k;
        Object obj = null;
        Object[] objArr = 0;
        if (i2 == 0) {
            z1x.P(objD0);
            dgu dguVar = (dgu) this.f27815a;
            ko00Var.k = 1;
            objD0 = qjj.d0(((mne) dguVar.f6058a).b, new oed(dguVar, str, objArr == true ? 1 : 0, (byte) 6, false), ko00Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        qcv qcvVar = (qcv) objD0;
        ArrayList arrayList = qcvVar.b;
        for (Object obj2 : qcvVar.c) {
            if (((ajh0) obj2).c) {
                obj = obj2;
                break;
            }
        }
        ajh0 ajh0Var = (ajh0) obj;
        if (ajh0Var == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (StringsKt.O(ajh0Var.b, ((jcv) obj3).g, false)) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }

    public void i(ArrayList arrayList) {
        ony onyVar = (ony) this.f27815a;
        int iA = wp20.a(r3d.q(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, "Completed");
        }
        ((rny) onyVar).a("LoadingScreenLoadStates", m8x.n0(linkedHashMap));
    }

    @Override // a.tdo0
    public void j(FrameLayout frameLayout) {
        Function1 function1;
        gx00 gx00Var = (gx00) this.f27815a;
        gx00Var.c(frameLayout);
        Object tag = frameLayout.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (function1 = gx00Var.b) == null) {
            return;
        }
        function1.invoke(str);
    }

    public boolean k() {
        return ((etj) this.f27815a).f8378a.m();
    }

    @Override // a.pp9
    public void m(to9 to9Var, Throwable th) {
        n5a n5aVar = (n5a) this.f27815a;
        e0g0 e0g0Var = j0g0.b;
        n5aVar.resumeWith(new g0g0(th));
    }

    public Bundle n() {
        Bundle bundle = (Bundle) this.f27815a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals(RemoteMessageConst.FROM)) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[PHI: r10
  0x0098: PHI (r10v3 a.aw20) = (r10v2 a.aw20), (r10v8 a.aw20) binds: [B:29:0x0095, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[PHI: r10
  0x00ac: PHI (r10v4 a.aw20) = (r10v3 a.aw20), (r10v9 a.aw20) binds: [B:32:0x00a9, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (kotlin.Unit.f46060a == r11) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(a.aw20 r10, a.zje r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pyu.o(a.aw20, a.zje):java.lang.Object");
    }

    public ArrayList p(int i) {
        ArrayList arrayList = new ArrayList();
        d9z d9zVar = (d9z) this.f27815a;
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            q8z q8zVar = d9zVar.b ? d9zVar.c : (q8z) ((hgk0) d9zVar.e).getValue();
            if (q8zVar != null) {
                kie0 kie0Var = new kie0();
                kie0Var.f18333a = 1;
                List list = (List) q8zVar.k.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair pair = (Pair) list.get(i2);
                    tbz tbzVar = d9zVar.o;
                    int iIntValue = ((Number) pair.f46059a).intValue();
                    long j = ((p4e) pair.b).f26347a;
                    v0h0 v0h0Var = d9z.w;
                    kie0Var = kie0Var;
                    arrayList.add(tbzVar.a(iIntValue, j, new enm((ArrayList) null, kie0Var, list, i, q8zVar), false));
                }
            }
            return arrayList;
        } finally {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
        }
    }

    public pyu(tnc0 tnc0Var) {
        tnc0Var.getClass();
        this.f27815a = tnc0Var;
    }

    public pyu(ost0 ost0Var) {
        ost0Var.getClass();
        this.f27815a = ost0Var;
    }

    public pyu(cuw cuwVar) {
        cuwVar.getClass();
        this.f27815a = cuwVar;
    }

    public pyu(v230 v230Var) {
        v230Var.getClass();
        this.f27815a = v230Var;
    }

    public /* synthetic */ pyu(Object obj) {
        this.f27815a = obj;
    }
}
