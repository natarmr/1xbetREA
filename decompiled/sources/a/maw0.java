package a;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class maw0 extends f9w0 {
    public final /* synthetic */ byte b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maw0(TaskCompletionSource taskCompletionSource, byte b) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", (byte) 1);
        this.b = b;
        switch (b) {
            case 1:
                this.c = taskCompletionSource;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", (byte) 1);
                break;
            default:
                this.c = taskCompletionSource;
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.f9w0
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strE;
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) taw0.a(parcel, Status.CREATOR);
                BeginSignInResult beginSignInResult = (BeginSignInResult) taw0.a(parcel, BeginSignInResult.CREATOR);
                taw0.b(parcel);
                dqm0.y(status, beginSignInResult, (TaskCompletionSource) obj);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                Status status2 = (Status) taw0.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) taw0.a(parcel, PendingIntent.CREATOR);
                taw0.b(parcel);
                dqm0.y(status2, pendingIntent, (TaskCompletionSource) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    G();
                    bbw0.t(revocationBoundService).u();
                    return true;
                }
                G();
                xqm0 xqm0VarA = xqm0.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = xqm0VarA.b();
                GoogleSignInOptions googleSignInOptionsM = GoogleSignInOptions.k;
                if (googleSignInAccountB != null) {
                    String strE2 = xqm0VarA.e("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strE2) || (strE = xqm0VarA.e(xqm0.f("googleSignInOptions", strE2))) == null) {
                        googleSignInOptionsM = null;
                    } else {
                        try {
                            googleSignInOptionsM = GoogleSignInOptions.m(strE);
                        } catch (JSONException unused) {
                            googleSignInOptionsM = null;
                        }
                    }
                }
                s0x.H(googleSignInOptionsM);
                mmx mmxVar = new mmx(revocationBoundService, q44.f28080a, googleSignInOptionsM, new mav(new rek0((byte) 22), Looper.getMainLooper()));
                Context context = mmxVar.f23210a;
                j9w0 j9w0Var = mmxVar.i;
                if (googleSignInAccountB == null) {
                    boolean z = mmxVar.d() == 3;
                    zz2 zz2Var = abw0.f599a;
                    Object[] objArr = new Object[0];
                    if (zz2Var.f45232a <= 3) {
                        Log.d((String) zz2Var.b, zz2Var.p("Signing out", objArr));
                    }
                    abw0.a(context);
                    if (z) {
                        com0 com0Var = new com0(j9w0Var);
                        com0Var.e(Status.e);
                        basePendingResult = com0Var;
                    } else {
                        zaw0 zaw0Var = new zaw0(j9w0Var, (byte) 0);
                        j9w0Var.a(zaw0Var);
                        basePendingResult = zaw0Var;
                    }
                    svs0 svs0Var = new svs0((byte) 21);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    basePendingResult.a(new law0(basePendingResult, taskCompletionSource, svs0Var));
                    taskCompletionSource.getTask();
                    return true;
                }
                boolean z2 = mmxVar.d() == 3;
                zz2 zz2Var2 = abw0.f599a;
                Object[] objArr2 = new Object[0];
                if (zz2Var2.f45232a <= 3) {
                    Log.d((String) zz2Var2.b, zz2Var2.p("Revoking access", objArr2));
                }
                String strE3 = xqm0.a(context).e("refreshToken");
                abw0.a(context);
                if (!z2) {
                    zaw0 zaw0Var2 = new zaw0(j9w0Var, (byte) 1);
                    j9w0Var.a(zaw0Var2);
                    basePendingResult2 = zaw0Var2;
                } else if (strE3 == null) {
                    zz2 zz2Var3 = raw0.c;
                    Status status3 = new Status(4, null, null, null);
                    s0x.B("Status code must not be SUCCESS", !status3.m());
                    t9w0 t9w0Var = new t9w0(status3);
                    t9w0Var.e(status3);
                    basePendingResult2 = t9w0Var;
                } else {
                    raw0 raw0Var = new raw0(strE3);
                    new Thread(raw0Var).start();
                    basePendingResult2 = raw0Var.b;
                }
                svs0 svs0Var2 = new svs0((byte) 21);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                basePendingResult2.a(new law0(basePendingResult2, taskCompletionSource2, svs0Var2));
                taskCompletionSource2.getTask();
                return true;
        }
    }

    public void G() {
        if (!bcm0.q(Binder.getCallingUid(), (RevocationBoundService) this.c)) {
            throw new SecurityException(ua80.e(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maw0(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", (byte) 1);
        this.b = (byte) 2;
        this.c = revocationBoundService;
    }
}
