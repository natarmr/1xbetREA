package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class tvd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts4 f34593a;

    public /* synthetic */ tvd(ts4 ts4Var) {
        this.f34593a = ts4Var;
    }

    public Object a(String str, bnn0 bnn0Var) {
        ts4 ts4Var = this.f34593a;
        Object objC = ((ws4) ts4Var.m.invoke()).c(ts4Var.d.e, new wvd(str), "application/vnd.xenvelop+json", bnn0Var);
        wne wneVar = wne.f39444a;
        if (objC != wneVar) {
            objC = Unit.f46060a;
        }
        return objC == wneVar ? objC : Unit.f46060a;
    }
}
