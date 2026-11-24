package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class hyj0 extends fdx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13863a;
    public final byte b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public hyj0(String str, int i, int i2) {
        this.f13863a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // a.nw70
    public void b(htw htwVar, String str, j jVar) {
        jVar.getClass();
        htwVar.g0(this.f13863a);
    }

    @Override // a.nw70
    public void c(htw htwVar, String str, j jVar) {
        jVar.getClass();
        htwVar.h0(jVar, this.f13863a, new CharSequence[0], false);
    }

    @Override // a.fdx
    public final List d(j jVar) {
        jVar.getClass();
        return jVar.a().subList(this.b, jVar.a().size() + this.c);
    }
}
