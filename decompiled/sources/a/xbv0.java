package a;

import android.app.Application;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f40619a = new LinkedHashMap();

    public static void a(int i, String str) {
        f40619a.remove(i + str);
    }

    public static String b(int i, String str) {
        return f140.i(i, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ozi c(Application application, String str) {
        application.getClass();
        LinkedHashMap linkedHashMap = f40619a;
        ozi oziVar = (ozi) linkedHashMap.get(str);
        if (oziVar != null) {
            return oziVar;
        }
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ybv0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ybv0)) {
                ze3Var = null;
            }
            ybv0 ybv0Var = (ybv0) ze3Var;
            if (ybv0Var != null) {
                cad cadVar = ybv0Var.d;
                onv onvVar = ybv0Var.f42358a;
                sue sueVar = ybv0Var.b;
                vqc vqcVar = ybv0Var.c;
                knf0 knf0Var = ybv0Var.e;
                gii0 gii0Var = ybv0Var.f;
                gst0 gst0Var = ybv0Var.g;
                clc clcVar = ybv0Var.h;
                ctf0 ctf0Var = ybv0Var.i;
                mii0 mii0Var = ybv0Var.j;
                x20 x20Var = ybv0Var.k;
                pru pruVar = ybv0Var.l;
                ii iiVar = ybv0Var.m;
                ouu ouuVar = ybv0Var.n;
                zfo zfoVar = ybv0Var.o;
                edo edoVar = ybv0Var.p;
                j1q0 j1q0Var = ybv0Var.q;
                onv onvVar2 = ybv0Var.r;
                b3c0 b3c0Var = ybv0Var.s;
                sueVar.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                gst0Var.getClass();
                ctf0Var.getClass();
                iiVar.getClass();
                zfoVar.getClass();
                edoVar.getClass();
                j1q0Var.getClass();
                b3c0Var.getClass();
                ozi oziVar2 = new ozi(onvVar, cadVar, clcVar, sueVar, vqcVar, onvVar2, knf0Var, gii0Var, gst0Var, ctf0Var, mii0Var, x20Var, pruVar, iiVar, ouuVar, zfoVar, edoVar, j1q0Var, b3c0Var);
                linkedHashMap.put(str, oziVar2);
                return oziVar2;
            }
        }
        jf4.n(b1j.i(ybv0.class, "Cannot create dependency "));
        return null;
    }
}
