package a;

import android.app.Application;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xnk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f41174a = new LinkedHashMap();

    public static void a(int i, String str) {
        f41174a.remove(i + str);
    }

    public static String b(int i, String str) {
        return f140.i(i, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cui c(Application application, String str) {
        application.getClass();
        LinkedHashMap linkedHashMap = f41174a;
        cui cuiVar = (cui) linkedHashMap.get(str);
        if (cuiVar != null) {
            return cuiVar;
        }
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ynk0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ynk0)) {
                ze3Var = null;
            }
            ynk0 ynk0Var = (ynk0) ze3Var;
            if (ynk0Var != null) {
                cad cadVar = ynk0Var.f42946a;
                gii0 gii0Var = ynk0Var.b;
                knf0 knf0Var = ynk0Var.c;
                q7d0 q7d0Var = ynk0Var.d;
                vby vbyVar = ynk0Var.e;
                vqc vqcVar = ynk0Var.f;
                gst0 gst0Var = ynk0Var.g;
                btt0 btt0Var = ynk0Var.h;
                b3c0 b3c0Var = ynk0Var.i;
                lsn lsnVar = ynk0Var.j;
                viu viuVar = ynk0Var.k;
                pru pruVar = ynk0Var.l;
                gii0Var.getClass();
                knf0Var.getClass();
                q7d0Var.getClass();
                vbyVar.getClass();
                gst0Var.getClass();
                btt0Var.getClass();
                b3c0Var.getClass();
                cui cuiVar2 = new cui(cadVar, vqcVar, lsnVar, viuVar, gii0Var, knf0Var, gst0Var, b3c0Var, pruVar);
                linkedHashMap.put(str, cuiVar2);
                return cuiVar2;
            }
        }
        jf4.n(b1j.i(ynk0.class, "Cannot create dependency "));
        return null;
    }
}
