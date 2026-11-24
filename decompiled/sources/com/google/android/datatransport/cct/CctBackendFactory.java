package com.google.android.datatransport.cct;

import a.i35;
import a.k8b;
import a.los0;
import a.tbf;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public los0 create(tbf tbfVar) {
        Context context = ((i35) tbfVar).f14080a;
        i35 i35Var = (i35) tbfVar;
        return new k8b(context, i35Var.b, i35Var.c);
    }
}
