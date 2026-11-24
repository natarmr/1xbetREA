package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class myb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts4 f22595a;

    public /* synthetic */ myb(ts4 ts4Var) {
        this.f22595a = ts4Var;
    }

    public Object a(String str, String str2, String str3, xwd xwdVar) {
        str.getClass();
        str3.getClass();
        ts4 ts4Var = this.f22595a;
        Object objF = ((ws4) ts4Var.m.invoke()).f(ts4Var.h.a(), str2, new wwd(ts4Var.k.o(str, str3)), "application/vnd.xenvelop+json", xwdVar);
        wne wneVar = wne.f39444a;
        if (objF != wneVar) {
            objF = Unit.f46060a;
        }
        return objF == wneVar ? objF : Unit.f46060a;
    }

    public String b() {
        return this.f22595a.i.e() ? "ru" : "en";
    }
}
