package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class arg0 extends crg0 implements brg0, zqg0 {
    public ArrayList i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // a.zqg0
    public final Set a() {
        return null;
    }

    @Override // a.zqg0
    public final String b() {
        return this.k;
    }

    @Override // a.zqg0
    public final void d(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // a.zqg0
    public final Set e() {
        return this.j;
    }

    @Override // a.brg0
    public void g(frg0 frg0Var) {
        this.i.add(frg0Var);
    }

    @Override // a.brg0
    public final List getChildren() {
        return this.i;
    }

    @Override // a.zqg0
    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // a.zqg0
    public final void i(String str) {
        this.k = str;
    }

    @Override // a.zqg0
    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // a.zqg0
    public final Set l() {
        return this.l;
    }

    @Override // a.zqg0
    public final Set m() {
        return this.m;
    }

    @Override // a.zqg0
    public final void f(HashSet hashSet) {
    }
}
