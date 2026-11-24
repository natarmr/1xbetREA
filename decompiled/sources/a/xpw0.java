package a;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xpw0 extends Fragment implements alz {
    public static final WeakHashMap I1 = new WeakHashMap();
    public final vnw0 H1 = new vnw0();

    @Override // androidx.fragment.app.Fragment
    public final void U(int i, int i2, Intent intent) {
        super.U(i, i2, intent);
        Iterator it = this.H1.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        this.H1.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        vnw0 vnw0Var = this.H1;
        vnw0Var.b = (byte) 5;
        Iterator it = vnw0Var.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        this.j1 = true;
        vnw0 vnw0Var = this.H1;
        vnw0Var.b = (byte) 3;
        Iterator it = vnw0Var.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onResume();
        }
    }

    @Override // a.alz
    public final nkz f(Class cls, String str) {
        return (nkz) cls.cast(this.H1.f37738a.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        this.H1.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void g0() {
        this.j1 = true;
        vnw0 vnw0Var = this.H1;
        vnw0Var.b = (byte) 2;
        Iterator it = vnw0Var.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        vnw0 vnw0Var = this.H1;
        vnw0Var.b = (byte) 4;
        Iterator it = vnw0Var.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onStop();
        }
    }

    @Override // a.alz
    public final void t(String str, nkz nkzVar) {
        this.H1.a(str, nkzVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.z(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.H1.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
