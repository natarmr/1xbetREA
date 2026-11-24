package a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class waw0 extends b9v {
    public final GoogleSignInOptions B;

    public waw0(Context context, Looper looper, qgd qgdVar, GoogleSignInOptions googleSignInOptions, h9w0 h9w0Var, h9w0 h9w0Var2) {
        ebv ebvVar;
        super(context, looper, 91, qgdVar, h9w0Var, h9w0Var2);
        Set<Scope> set = (Set) qgdVar.c;
        if (googleSignInOptions != null) {
            ebvVar = new ebv();
            ebvVar.f7537a = new HashSet();
            ebvVar.h = new HashMap();
            ebvVar.f7537a = new HashSet(googleSignInOptions.b);
            ebvVar.b = googleSignInOptions.e;
            ebvVar.c = googleSignInOptions.f;
            ebvVar.d = googleSignInOptions.d;
            ebvVar.e = googleSignInOptions.g;
            ebvVar.f = googleSignInOptions.c;
            ebvVar.g = googleSignInOptions.h;
            ebvVar.h = GoogleSignInOptions.o(googleSignInOptions.i);
            ebvVar.i = googleSignInOptions.j;
        } else {
            ebvVar = new ebv();
            ebvVar.f7537a = new HashSet();
            ebvVar.h = new HashMap();
        }
        ebvVar.i = qaw0.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = ebvVar.f7537a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = ebvVar.f7537a;
        if (hashSet2.contains(GoogleSignInOptions.n)) {
            Scope scope2 = GoogleSignInOptions.m;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (ebvVar.d && (ebvVar.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.l);
        }
        this.B = new GoogleSignInOptions(3, new ArrayList(hashSet2), ebvVar.f, ebvVar.d, ebvVar.b, ebvVar.c, ebvVar.e, ebvVar.g, ebvVar.h, ebvVar.i);
    }

    @Override // a.hz5
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof cbw0 ? (cbw0) iInterfaceQueryLocalInterface : new cbw0(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", (byte) 2);
    }

    @Override // a.hz5
    public final int i() {
        return 12451000;
    }

    @Override // a.hz5
    public final String m() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // a.hz5
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
