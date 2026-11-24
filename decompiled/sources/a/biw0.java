package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class biw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2677a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public owp0 f;
    public final String g;
    public final long h;
    public final long i;
    public boolean j;
    public com.google.firebase.auth.zzc k;
    public final List l;
    public hhw0 m;

    public biw0(String str, String str2, boolean z, String str3, String str4, owp0 owp0Var, String str5, long j, long j2, ArrayList arrayList, ulw0 ulw0Var) {
        this.f2677a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        List list = (List) owp0Var.b;
        owp0 owp0Var2 = new owp0((byte) 22);
        if (list != null) {
            ((List) owp0Var2.b).addAll(list);
        }
        this.f = owp0Var2;
        this.g = str5;
        this.h = j;
        this.i = j2;
        this.j = false;
        this.k = null;
        this.l = arrayList;
        this.m = ulw0Var;
    }
}
