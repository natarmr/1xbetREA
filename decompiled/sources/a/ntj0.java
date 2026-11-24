package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class ntj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24103a;
    public final n0o0 b;
    public final p7m0 c;
    public Function0 d;

    public ntj0(String str) {
        str.getClass();
        this.f24103a = str;
        this.b = maz.b(new hwi0((byte) 21));
        this.c = q7m0.a(null);
    }

    public static String a(Object obj) {
        return sj3.j0(obj != null ? obj.getClass().getSimpleName() : null, "Unknown effect");
    }

    public final ArrayList b() {
        String strJ;
        LinkedBlockingDeque linkedBlockingDequeC = c();
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedBlockingDequeC.iterator();
        while (it.hasNext()) {
            Object obj = ((ktj0) it.next()).f18869a;
            if (obj != null) {
                strJ = sre0.f32672a.b(obj.getClass()).J();
            } else {
                strJ = null;
            }
            if (strJ != null) {
                arrayList.add(strJ);
            }
        }
        return arrayList;
    }

    public final LinkedBlockingDeque c() {
        return (LinkedBlockingDeque) this.b.getValue();
    }

    public final void d() {
        Object value;
        Object obj;
        p7m0 p7m0Var = this.c;
        ktj0 ktj0Var = (ktj0) p7m0Var.getValue();
        yum0.j(this.f24103a, "handleSideEffect", "✅ Эффект " + ((ktj0Var == null || (obj = ktj0Var.f18869a) == null) ? null : a(obj)) + " обработан!");
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, null));
        f();
    }

    public final void e(Object obj) {
        Object value;
        ktj0 ktj0Var = new ktj0(obj);
        p7m0 p7m0Var = this.c;
        Object value2 = p7m0Var.getValue();
        String str = this.f24103a;
        if (value2 == null) {
            yum0.j(str, "postSideEffect", "🚀 Эффект " + a(ktj0Var.f18869a) + " отправлен!");
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, ktj0Var));
            return;
        }
        yum0.j(str, "postSideEffect", "✅ Эффект " + a(obj) + " добавлен, в очередь, отложенных эффектов " + b() + "!");
        c().offerLast(ktj0Var);
    }

    public final void f() {
        Object value;
        if (c().isEmpty()) {
            return;
        }
        p7m0 p7m0Var = this.c;
        if (p7m0Var.getValue() == null) {
            ktj0 ktj0Var = (ktj0) c().pollFirst();
            yum0.j(this.f24103a, "postPending", "✅ + 🗑️ Отложенный эффект " + a(ktj0Var != null ? ktj0Var.f18869a : null) + " отправлен и удален из очереди!");
            this.d = null;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, ktj0Var));
        }
    }
}
