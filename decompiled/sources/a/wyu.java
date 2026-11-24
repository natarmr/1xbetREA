package a;

import java.util.Calendar;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class wyu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v6j0 f39990a;
    public final fsd b;

    public wyu(v6j0 v6j0Var, fsd fsdVar, v6k v6kVar) {
        v6j0Var.getClass();
        fsdVar.getClass();
        this.f39990a = v6j0Var;
        this.b = fsdVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    public final uaq0 a() {
        v6j0 v6j0Var = this.f39990a;
        uaq0 uaq0VarG = v6j0Var.g();
        List list = this.b.a().d;
        if (list.size() == 1 || !list.contains(uaq0VarG)) {
            uaq0VarG = (uaq0) CollectionsKt.U(list);
        } else if (v6j0Var.f()) {
            if (v6j0Var.f()) {
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, v6j0Var.d());
                calendar2.set(12, v6j0Var.e());
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(11, v6j0Var.b());
                calendar3.set(12, v6j0Var.c());
                calendar3.set(13, 0);
                calendar3.set(14, 0);
                if (calendar2.compareTo(calendar3) > 0) {
                    calendar3.add(5, 1);
                }
                if (calendar2.compareTo(calendar) > 0 || calendar.compareTo(calendar3) >= 0) {
                    uaq0VarG = (uaq0) CollectionsKt.U(list);
                }
            } else {
                uaq0VarG = (uaq0) CollectionsKt.U(list);
            }
        }
        uaq0VarG.getClass();
        p7m0 p7m0Var = (p7m0) v6j0Var.h();
        p7m0Var.getClass();
        p7m0Var.o(null, uaq0VarG);
        return uaq0VarG;
    }
}
