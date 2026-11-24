package a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class kxq extends agd {
    public boolean x;
    public boolean y;
    public final cad v = new cad((Object) new jxq(this), (byte) 23);
    public final glz w = new glz(this, true);
    public boolean z = true;

    public kxq() {
        final byte b = 1;
        ((kd30) this.d.b).S("android:support:lifecycle", new ufd(this, (byte) 2));
        final byte b2 = 0;
        this.j.add(new sbe(this) { // from class: a.ixq
            public final /* synthetic */ kxq b;

            {
                this.b = this;
            }

            @Override // a.sbe
            public final void accept(Object obj) {
                byte b3 = b2;
                kxq kxqVar = this.b;
                switch (b3) {
                    case 0:
                        kxqVar.v.i();
                        break;
                    default:
                        kxqVar.v.i();
                        break;
                }
            }
        });
        this.l.add(new sbe(this) { // from class: a.ixq
            public final /* synthetic */ kxq b;

            {
                this.b = this;
            }

            @Override // a.sbe
            public final void accept(Object obj) {
                byte b3 = b;
                kxq kxqVar = this.b;
                switch (b3) {
                    case 0:
                        kxqVar.v.i();
                        break;
                    default:
                        kxqVar.v.i();
                        break;
                }
            }
        });
        m(new vfd(this, b));
    }

    public static boolean s(androidx.fragment.app.e eVar) {
        lkz lkzVar = lkz.c;
        boolean zS = false;
        for (Fragment fragment : eVar.c.p()) {
            if (fragment != null) {
                jxq jxqVar = fragment.w;
                if ((jxqVar == null ? null : jxqVar.e) != null) {
                    zS |= s(fragment.C());
                }
                n6r n6rVar = fragment.w1;
                if (n6rVar != null) {
                    n6rVar.b();
                    if (n6rVar.c.i.compareTo(lkz.d) >= 0) {
                        fragment.w1.c.g(lkzVar);
                        zS = true;
                    }
                }
                if (fragment.u1.i.compareTo(lkz.d) >= 0) {
                    fragment.u1.g(lkzVar);
                    zS = true;
                }
            }
        }
        return zS;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.x);
        printWriter.print(" mResumed=");
        printWriter.print(this.y);
        printWriter.print(" mStopped=");
        printWriter.print(this.z);
        if (getApplication() != null) {
            new zpu(this, g()).c(str3, printWriter);
        }
        ((jxq) this.v.b).d.y(str, fileDescriptor, printWriter, strArr);
    }

    @Override // a.agd, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.v.i();
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.agd, a.zfd, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w.d(kkz.ON_CREATE);
        v1r v1rVar = ((jxq) this.v.b).d;
        v1rVar.I = false;
        v1rVar.J = false;
        v1rVar.P.g = false;
        v1rVar.x(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((jxq) this.v.b).d.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((jxq) this.v.b).d.o();
        this.w.d(kkz.ON_DESTROY);
    }

    @Override // a.agd, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((jxq) this.v.b).d.m();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.y = false;
        v1r v1rVar = ((jxq) this.v.b).d;
        if (v1rVar.h != null) {
            v1rVar.d();
        }
        v1rVar.x(5);
        this.w.d(kkz.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.w.d(kkz.ON_RESUME);
        v1r v1rVar = ((jxq) this.v.b).d;
        v1rVar.I = false;
        v1rVar.J = false;
        v1rVar.P.g = false;
        v1rVar.x(7);
    }

    @Override // a.agd, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.v.i();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        cad cadVar = this.v;
        cadVar.i();
        super.onResume();
        this.y = true;
        ((jxq) cadVar.b).d.C(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        cad cadVar = this.v;
        cadVar.i();
        jxq jxqVar = (jxq) cadVar.b;
        super.onStart();
        this.z = false;
        if (!this.x) {
            this.x = true;
            v1r v1rVar = jxqVar.d;
            v1rVar.I = false;
            v1rVar.J = false;
            v1rVar.P.g = false;
            v1rVar.x(4);
        }
        jxqVar.d.C(true);
        this.w.d(kkz.ON_START);
        v1r v1rVar2 = jxqVar.d;
        v1rVar2.I = false;
        v1rVar2.J = false;
        v1rVar2.P.g = false;
        v1rVar2.x(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.v.i();
    }

    @Override // android.app.Activity
    public void onStop() {
        v1r v1rVarR;
        super.onStop();
        this.z = true;
        do {
            v1rVarR = r();
            lkz lkzVar = lkz.f20223a;
        } while (s(v1rVarR));
        v1r v1rVar = ((jxq) this.v.b).d;
        v1rVar.J = true;
        v1rVar.P.g = true;
        v1rVar.x(4);
        this.w.d(kkz.ON_STOP);
    }

    public final v1r r() {
        return ((jxq) this.v.b).d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((jxq) this.v.b).d.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
