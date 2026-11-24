package a;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f23096a = new LinkedHashMap();

    public static void a(int i, String str) {
        LinkedHashMap linkedHashMap = f23096a;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (kotlin.text.c.x((String) obj, i + str, false)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((String) it.next());
        }
    }

    public static String b(int i, String str, String str2) {
        str2.getClass();
        return i + str + str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lui c(Application application, String str, String str2, int i) {
        application.getClass();
        LinkedHashMap linkedHashMap = f23096a;
        lui luiVar = (lui) linkedHashMap.get(str);
        if (luiVar != null) {
            return luiVar;
        }
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(o8l0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof o8l0)) {
                ze3Var = null;
            }
            o8l0 o8l0Var = (o8l0) ze3Var;
            if (o8l0Var != null) {
                q7d0 q7d0Var = o8l0Var.f24836a;
                vby vbyVar = o8l0Var.b;
                sjl0 sjl0Var = o8l0Var.c;
                q7d0Var.getClass();
                vbyVar.getClass();
                sjl0Var.getClass();
                lui luiVar2 = new lui(q7d0Var, vbyVar, sjl0Var, str2, Integer.valueOf(i));
                linkedHashMap.put(str, luiVar2);
                return luiVar2;
            }
        }
        jf4.n(b1j.i(o8l0.class, "Cannot create dependency "));
        return null;
    }
}
