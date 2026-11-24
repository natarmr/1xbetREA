package com.google.firebase;

import a.c7k;
import a.cc5;
import a.csj;
import a.e45;
import a.fty;
import a.jkd0;
import a.jtv;
import a.ktv;
import a.ltv;
import a.nfq;
import a.ofd;
import a.ouj;
import a.pfd;
import a.q0x;
import a.quj;
import a.udk;
import a.yyj;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        ofd ofdVarB = pfd.b(yyj.class);
        ofdVarB.a(new c7k(2, 0, e45.class));
        ofdVarB.f = new csj((byte) 27);
        arrayList.add(ofdVarB.b());
        jkd0 jkd0Var = new jkd0(cc5.class, Executor.class);
        ofd ofdVar = new ofd(quj.class, ktv.class, ltv.class);
        ofdVar.a(c7k.c(Context.class));
        ofdVar.a(c7k.c(nfq.class));
        ofdVar.a(new c7k(2, 0, jtv.class));
        ofdVar.a(new c7k(1, 1, yyj.class));
        ofdVar.a(new c7k(jkd0Var, 1, 0));
        ofdVar.f = new ouj(jkd0Var, (byte) 0);
        arrayList.add(ofdVar.b());
        arrayList.add(q0x.I("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(q0x.I("fire-core", "22.2.1"));
        arrayList.add(q0x.I("device-name", a(Build.PRODUCT)));
        arrayList.add(q0x.I("device-model", a(Build.DEVICE)));
        arrayList.add(q0x.I("device-brand", a(Build.BRAND)));
        arrayList.add(q0x.J("android-target-sdk", new udk((byte) 19)));
        arrayList.add(q0x.J("android-min-sdk", new udk((byte) 20)));
        arrayList.add(q0x.J("android-platform", new udk((byte) 21)));
        arrayList.add(q0x.J("android-installer", new udk((byte) 22)));
        try {
            string = fty.f.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(q0x.I("kotlin", string));
        }
        return arrayList;
    }
}
