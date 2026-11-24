package a;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class vdg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f37231a;
    public final Context b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public Executor f;
    public Executor g;
    public qty h;
    public boolean i;
    public final ea70 j;
    public final LinkedHashSet k;
    public final LinkedHashSet l;
    public final ArrayList m;
    public boolean n;
    public boolean o;
    public boolean p;

    public vdg0(Context context, String str) {
        ydg0 ydg0Var = ydg0.f42436a;
        this.j = new ea70((byte) 1);
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        this.m = new ArrayList();
        this.n = true;
        this.f37231a = sre0.f32672a.b(WorkDatabase.class);
        this.b = context;
        this.c = str;
    }

    public final void a(eg40... eg40VarArr) {
        for (eg40 eg40Var : eg40VarArr) {
            Integer numValueOf = Integer.valueOf(eg40Var.f7744a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(eg40Var.b));
        }
        for (eg40 eg40Var2 : (eg40[]) Arrays.copyOf(eg40VarArr, eg40VarArr.length)) {
            this.j.a(eg40Var2);
        }
    }
}
