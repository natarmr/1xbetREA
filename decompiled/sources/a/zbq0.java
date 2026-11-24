package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class zbq0 extends diu0 {
    public final i1w0 b;
    public final y3v c;
    public final wyu d;
    public final bzt e;
    public final ubu f;
    public final m8u g;
    public final uqx h;
    public final dzt i;
    public final yyu j;
    public final xyu k;
    public final nmt0 l;
    public final nvu m;
    public final p7m0 n;

    public zbq0(i1w0 i1w0Var, String str, y3v y3vVar, wyu wyuVar, std stdVar, bzt bztVar, ubu ubuVar, m8u m8uVar, uqx uqxVar, dzt dztVar, yyu yyuVar, xyu xyuVar, nmt0 nmt0Var, rqt rqtVar, rqt rqtVar2, nvu nvuVar) {
        i1w0Var.getClass();
        wyuVar.getClass();
        this.b = i1w0Var;
        this.c = y3vVar;
        this.d = wyuVar;
        this.e = bztVar;
        this.f = ubuVar;
        this.g = m8uVar;
        this.h = uqxVar;
        this.i = dztVar;
        this.j = yyuVar;
        this.k = xyuVar;
        this.l = nmt0Var;
        this.m = nvuVar;
        this.n = q7m0.a(new obq0(iun.f15405a, uaq0.b, false, false, "", ""));
        String strName = ubuVar.b.g().name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        lowerCase.getClass();
        boolean zF = uqxVar.f36139a.f();
        HashMap map = (HashMap) y3vVar.c;
        String lowerCase2 = lowerCase.toLowerCase(locale);
        lowerCase2.getClass();
        map.put("theme", lowerCase2);
        map.put("calendar", zF ? "calendar_on" : "calendar_off");
        LinkedHashMap linkedHashMap = (LinkedHashMap) nvuVar.c;
        linkedHashMap.put("THEME_KEY", lowerCase);
        linkedHashMap.put("THEME_TIMETABLE_ON_KEY", zF ? "calendar_on" : "calendar_off");
    }

    public final void A(uaq0 uaq0Var) {
        if (this.f.b.g() != uaq0Var) {
            yip0 yip0Var = new yip0((Object) this, (Object) uaq0Var, (byte) 11);
            wyu wyuVar = this.d;
            uaq0 uaq0VarA = wyuVar.a();
            yip0Var.invoke();
            if (wyuVar.a() != uaq0VarA) {
                this.l.c(uaq0VarA);
            }
        }
    }

    @Override // a.diu0
    public final void v() {
        y3v y3vVar = this.c;
        HashMap map = (HashMap) y3vVar.c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) ((HashMap) y3vVar.d).get(str);
            if (str3 == null || str3.equals(str2)) {
                str3 = null;
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((kt2) y3vVar.b).a("acc_settings_dark_set", wp20.b(new Pair("option", arrayList)));
    }

    public final String w(int i, int i2, boolean z) {
        if (z) {
            return w6x.q(StringsKt.b0(2, String.valueOf(i)), Separators.COLON, StringsKt.b0(2, String.valueOf(i2)));
        }
        vkq0 vkq0VarG = std.g(i, i2);
        return StringsKt.b0(2, String.valueOf(vkq0VarG.f37587a)) + Separators.COLON + StringsKt.b0(2, String.valueOf(vkq0VarG.b)) + Separators.SP + vkq0VarG.c;
    }

    public final void x() {
        Object next;
        Iterator it = ((obq0) this.n.getValue()).f24995a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                uaq0.f35345a.getClass();
            }
        } while (!s9m0.i((uaq0) next));
        uaq0 uaq0Var = (uaq0) next;
        if (uaq0Var == null) {
            return;
        }
        A(uaq0Var);
    }

    public final void y() {
        Object next;
        Iterator it = ((obq0) this.n.getValue()).f24995a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                uaq0.f35345a.getClass();
            }
        } while (!s9m0.j((uaq0) next));
        uaq0 uaq0Var = (uaq0) next;
        if (uaq0Var == null) {
            return;
        }
        A(uaq0Var);
    }

    public final void z() {
        Object next;
        Iterator it = ((obq0) this.n.getValue()).f24995a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                uaq0.f35345a.getClass();
            }
        } while (!s9m0.k((uaq0) next));
        uaq0 uaq0Var = (uaq0) next;
        if (uaq0Var == null) {
            return;
        }
        A(uaq0Var);
    }
}
