package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tb00 {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33638a = 1;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String strA = k2o.a(this.f);
            StringBuilder sb = this.h;
            String strA2 = sb != null ? k2o.a(sb.toString()) : null;
            String str = this.e;
            rb00 rb00Var = new rb00();
            rb00Var.g = str;
            rb00Var.h = strA;
            rb00Var.i = strA2;
            this.c.add(rb00Var);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}
