package a;

import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class dnt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ilp0 f6387a;
    public final tqx b;
    public final m8u c;
    public final q4a d;
    public final wyu e;

    public dnt0(ilp0 ilp0Var, tqx tqxVar, m8u m8uVar, q4a q4aVar, wyu wyuVar) {
        wyuVar.getClass();
        this.f6387a = ilp0Var;
        this.b = tqxVar;
        this.c = m8uVar;
        this.d = q4aVar;
        this.e = wyuVar;
    }

    public final void a() {
        boolean zF = this.b.f34399a.f();
        uaq0 uaq0VarA = this.e.a();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        v6j0 v6j0Var = this.c.f21386a;
        calendar2.set(11, v6j0Var.d());
        calendar2.set(12, v6j0Var.e());
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        if (calendar2.compareTo(calendar) < 0) {
            calendar2.add(5, 1);
        }
        long timeInMillis = calendar2.getTimeInMillis() - calendar.getTimeInMillis();
        ilp0 ilp0Var = this.f6387a;
        ilp0Var.e("theme_on_worker", timeInMillis, zF, uaq0VarA);
        Calendar calendar3 = Calendar.getInstance();
        Calendar calendar4 = Calendar.getInstance();
        v6j0 v6j0Var2 = this.d.f28087a;
        calendar4.set(11, v6j0Var2.b());
        calendar4.set(12, v6j0Var2.c());
        calendar4.set(13, 0);
        calendar4.set(14, 0);
        if (calendar4.compareTo(calendar3) < 0) {
            calendar4.add(5, 1);
        }
        ilp0Var.e("theme_off_worker", calendar4.getTimeInMillis() - calendar3.getTimeInMillis(), zF, uaq0VarA);
    }
}
