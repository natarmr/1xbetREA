package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class nj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4j f23620a;
    public final au0 b;

    public nj7(b4j b4jVar, au0 au0Var) {
        this.f23620a = b4jVar;
        this.b = au0Var;
    }

    public void a(r6w r6wVar, String str, String str2) {
        str.getClass();
        a1w a1wVar = a1w.k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str.length() > 0) {
            linkedHashMap.put(a1w.d.a(), str);
        }
        if (str2.length() > 0) {
            linkedHashMap.put(a1w.e.a(), str2);
        }
        this.f23620a.g(a1wVar, r6wVar, linkedHashMap);
        this.b.d(r6w.k.a(), str, str2);
    }

    public void b(int i) {
        a1w a1wVar = a1w.f93a;
        String strValueOf = String.valueOf(i);
        r6w r6wVar = r6w.k;
        this.f23620a.c(strValueOf, r6wVar);
        this.b.f(i, r6wVar.a());
    }

    public void c() {
        a1w a1wVar = a1w.m;
        r6w r6wVar = r6w.j;
        b4j.h(this.f23620a, a1wVar, r6wVar);
        this.b.e(r6wVar.a());
    }

    public void d() {
        a1w a1wVar = a1w.l;
        r6w r6wVar = r6w.k;
        b4j.h(this.f23620a, a1wVar, r6wVar);
        this.b.j(r6wVar.a());
    }

    public nj7(b4j b4jVar, au0 au0Var, String str) {
        this.f23620a = b4jVar;
        this.b = au0Var;
    }
}
