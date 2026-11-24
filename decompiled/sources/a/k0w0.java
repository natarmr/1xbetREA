package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.core.navigation.dialog.DialogScreen$Companion$invoke$1;

/* JADX INFO: loaded from: classes3.dex */
public final class k0w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f17489a;

    public k0w0(i1w0 i1w0Var) {
        i1w0Var.getClass();
        this.f17489a = new CopyOnWriteArrayList();
    }

    public static void j(k0w0 k0w0Var, jgc jgcVar, Function1 function1) {
        jgcVar.getClass();
        k0w0Var.b(new c1w0(jgcVar, new onu0(jgcVar, function1, (byte) 11)));
    }

    public final okt0 a(g1w0 g1w0Var) {
        c8d c8dVar = new c8d(y7d.f42146a, g1w0Var);
        this.f17489a.add(c8dVar);
        return new okt0(c8dVar);
    }

    public final ikt0 b(g1w0 g1w0Var) {
        c8d c8dVar = new c8d(y7d.f42146a, g1w0Var);
        this.f17489a.add(c8dVar);
        return new ikt0(c8dVar);
    }

    public final void c(m7h0 m7h0Var) {
        b(new q0w0(m7h0Var));
    }

    public final void d() {
        b(r0w0.f29649a);
    }

    public final void e(FragmentScreen fragmentScreen) {
        b(new s0w0(fragmentScreen));
    }

    public final void f() {
        b(m0w0.f20976a);
    }

    public final void g() {
        b(p0w0.f26173a);
    }

    public final ikt0 h(m7h0 m7h0Var) {
        m7h0Var.getClass();
        return m7h0Var instanceof DialogScreen ? b(new e1w0((DialogScreen) m7h0Var)) : b(new w0w0(m7h0Var));
    }

    public final void i(m7h0... m7h0VarArr) {
        b(new x0w0(tx3.g0(m7h0VarArr)));
    }

    public final void k(m7h0 m7h0Var) {
        m7h0Var.getClass();
        b(new d1w0(m7h0Var));
    }

    public final void l(DialogScreen$Companion$invoke$1 dialogScreen$Companion$invoke$1) {
        b(new e1w0(dialogScreen$Companion$invoke$1));
    }

    public final ikt0 m(FragmentScreen fragmentScreen) {
        return b(new f1w0(fragmentScreen));
    }
}
