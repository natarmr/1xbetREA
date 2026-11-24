package a;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class rjy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30620a = -1;
    public int b = -1;
    public String c = null;
    public byte d;
    public HashMap e;

    public void a(HashMap map) {
        throw null;
    }

    public abstract rjy b();

    public rjy c(rjy rjyVar) {
        this.f30620a = rjyVar.f30620a;
        this.b = rjyVar.b;
        this.c = rjyVar.c;
        this.d = rjyVar.d;
        this.e = rjyVar.e;
        return this;
    }

    public abstract void e(Context context, AttributeSet attributeSet);

    public void d(HashSet hashSet) {
    }

    public void f(HashMap map) {
    }
}
