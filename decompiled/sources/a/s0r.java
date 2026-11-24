package a;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s0r implements nae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31422a;
    public final Fragment b;
    public final Function1 c;
    public yfu0 d;
    public final Handler e;

    public s0r(Fragment fragment, Function1 function1, byte b) {
        this.f31422a = b;
        switch (b) {
            case 1:
                fragment.getClass();
                function1.getClass();
                this.b = fragment;
                this.c = function1;
                this.e = new Handler(Looper.getMainLooper());
                break;
            default:
                fragment.getClass();
                function1.getClass();
                this.b = fragment;
                this.c = function1;
                this.e = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // a.nae0
    public final Object n(iiy iiyVar, Object obj) {
        byte b = this.f31422a;
        Fragment fragment = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                ((Fragment) obj).getClass();
                iiyVar.getClass();
                yfu0 yfu0Var = this.d;
                if (yfu0Var != null) {
                    return yfu0Var;
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(fragment.o0());
                layoutInflaterFrom.getClass();
                yfu0 yfu0Var2 = (yfu0) function1.invoke(layoutInflaterFrom);
                this.d = yfu0Var2;
                n6r n6rVarK = fragment.K();
                n6rVarK.b();
                glz glzVar = n6rVarK.c;
                glzVar.a(new tvj(null, null, new gup((Object) glzVar, (Object) this, (byte) 10), 31));
                return yfu0Var2;
            default:
                Fragment fragment2 = (Fragment) obj;
                fragment2.getClass();
                iiyVar.getClass();
                yfu0 yfu0Var3 = this.d;
                if (yfu0Var3 != null) {
                    if (!Intrinsics.d(yfu0Var3.getRoot(), fragment2.J())) {
                        yfu0Var3 = null;
                    }
                    if (yfu0Var3 != null) {
                        return yfu0Var3;
                    }
                }
                yfu0 yfu0Var4 = (yfu0) function1.invoke(fragment2.q0());
                this.d = yfu0Var4;
                n6r n6rVarK2 = fragment.K();
                n6rVarK2.b();
                glz glzVar2 = n6rVarK2.c;
                glzVar2.a(new tvj(null, null, new gup((Object) glzVar2, (Object) this, (byte) 11), 31));
                return yfu0Var4;
        }
    }
}
