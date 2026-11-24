package a;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jbw0 extends Fragment implements alz {
    public static final WeakHashMap b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vnw0 f16250a = new vnw0();

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f16250a.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // a.alz
    public final nkz f(Class cls, String str) {
        return (nkz) cls.cast(this.f16250a.f37738a.get(str));
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f16250a.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16250a.b(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        vnw0 vnw0Var = this.f16250a;
        vnw0Var.b = (byte) 5;
        Iterator it = vnw0Var.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        vnw0 vnw0Var = this.f16250a;
        vnw0Var.b = (byte) 3;
        Iterator it = vnw0Var.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16250a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        vnw0 vnw0Var = this.f16250a;
        vnw0Var.b = (byte) 2;
        Iterator it = vnw0Var.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        vnw0 vnw0Var = this.f16250a;
        vnw0Var.b = (byte) 4;
        Iterator it = vnw0Var.f37738a.values().iterator();
        while (it.hasNext()) {
            ((nkz) it.next()).onStop();
        }
    }

    @Override // a.alz
    public final Activity r() {
        return getActivity();
    }

    @Override // a.alz
    public final void t(String str, nkz nkzVar) {
        this.f16250a.a(str, nkzVar);
    }
}
