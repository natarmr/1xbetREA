package a;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.api.HuaweiApiClientImpl;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class r9w0 extends f9w0 implements qav, rav {
    public static final kmx n = u9w0.f35303a;
    public final Context b;
    public final Handler c;
    public final kmx d;
    public final Set e;
    public final qgd f;
    public buj0 l;
    public qaj m;

    public r9w0(Context context, jaw0 jaw0Var, qgd qgdVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", (byte) 0);
        this.b = context;
        this.c = jaw0Var;
        this.f = qgdVar;
        this.e = (Set) qgdVar.b;
        this.d = n;
    }

    @Override // a.rav
    public final void b(ConnectionResult connectionResult) {
        this.m.l(connectionResult);
    }

    @Override // a.qav
    public final void onConnected() {
        buj0 buj0Var = this.l;
        buj0Var.getClass();
        boolean z = false;
        try {
            buj0Var.C.getClass();
            Account account = new Account(HuaweiApiClientImpl.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = HuaweiApiClientImpl.DEFAULT_ACCOUNT.equals(account.name) ? xqm0.a(buj0Var.c).b() : null;
            Integer num = buj0Var.E;
            s0x.H(num);
            com.google.android.gms.common.internal.zay zayVar = new com.google.android.gms.common.internal.zay(2, account, num.intValue(), googleSignInAccountB);
            x9w0 x9w0Var = (x9w0) buj0Var.l();
            com.google.android.gms.signin.internal.zai zaiVar = new com.google.android.gms.signin.internal.zai(1, zayVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(x9w0Var.c);
            int i = o9w0.f24900a;
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                x9w0Var.b.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.c.post(new lfr(this, new com.google.android.gms.signin.internal.zak(1, new ConnectionResult(8, null, null), null), z, (byte) 22));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // a.qav
    public final void onConnectionSuspended(int i) {
        qaj qajVar = this.m;
        h9w0 h9w0Var = (h9w0) ((sav) qajVar.f).j.get((ua3) qajVar.b);
        if (h9w0Var != null) {
            if (h9w0Var.n) {
                h9w0Var.l(new ConnectionResult(17, null, null));
            } else {
                h9w0Var.onConnectionSuspended(i);
            }
        }
    }
}
