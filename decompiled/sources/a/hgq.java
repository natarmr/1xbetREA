package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/hgq;", "La/by5;", "La/eun;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hgq extends by5<eun> {
    public final zz2 b2 = new zz2("FIREBASE_AUTH_TYPE");
    public final FirebaseAuth c2;
    public boolean d2;
    public final nae0 e2;
    public vby f2;
    public static final /* synthetic */ iiy[] h2 = {new ez40(hgq.class, Payload.TYPE, "getType()I", 0), new j0d0(hgq.class, "binding", "getBinding()Lorg/xplatform/ui_core/databinding/EmptyFrameLayoutBinding;", 0)};
    public static final nek g2 = new nek();

    public hgq() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.getClass();
        this.c2 = firebaseAuth;
        this.e2 = ltt0.p(this, ggq.f11264a);
    }

    @Override // a.by5
    public final yfu0 I0() {
        Object objN = this.e2.n(h2[1], this);
        objN.getClass();
        return (eun) objN;
    }

    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hhk0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hhk0 hhk0Var = (hhk0) (ze3Var instanceof hhk0 ? ze3Var : null);
            if (hhk0Var != null) {
                this.f2 = (vby) hhk0Var.a().d;
                return;
            }
        }
        jf4.n(b1j.i(hhk0.class, "Cannot create dependency "));
    }

    public final void R0(String str) {
        if (N()) {
            F().t0(i120.V(new Pair("ERROR_SOCIAL", str)), "ERROR_SOCIAL");
        }
        y0();
    }

    @Override // a.by5, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        String str;
        Task taskForException;
        FirebaseAuth firebaseAuth = this.c2;
        super.W(bundle);
        Uri uri = Uri.parse("https://natribu.org");
        uri.getClass();
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        Context contextD = D();
        PackageManager packageManager = contextD != null ? contextD.getPackageManager() : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager != null ? packageManager.queryIntentActivities(intent, 0) : null;
        if (listQueryIntentActivities == null || !(!listQueryIntentActivities.isEmpty())) {
            Context contextD2 = D();
            if (contextD2 != null) {
                String string = contextD2.getString(R.string.open_browser_error_message);
                string.getClass();
                R0(string);
                return;
            }
            return;
        }
        if (bundle == null || !bundle.getBoolean("HAS_BEEN_CREATED")) {
            firebaseAuth.c();
            String str2 = this.b2.n(this, h2[0]).intValue() == 13 ? "twitter.com" : "apple.com";
            kxq kxqVarB = B();
            if (kxqVarB != null) {
                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance();
                s0x.E(str2);
                s0x.H(firebaseAuth2);
                nfq nfqVar = firebaseAuth2.f45644a;
                if ("facebook.com".equals(str2)) {
                    gx3 gx3Var = xgw0.f40860a;
                    nfqVar.a();
                    if (!gx3Var.containsKey(nfqVar.c.f21755a)) {
                        jf4.o("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
                        return;
                    }
                }
                Bundle bundle2 = new Bundle();
                Bundle bundle3 = new Bundle();
                nfqVar.a();
                bundle2.putString("com.google.firebase.auth.KEY_API_KEY", nfqVar.c.f21755a);
                bundle2.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str2);
                bundle2.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle3);
                bundle2.putString("com.google.firebase.auth.internal.CLIENT_VERSION", x860.i().j());
                synchronized (firebaseAuth2.h) {
                    str = firebaseAuth2.i;
                }
                bundle2.putString("com.google.firebase.auth.KEY_TENANT_ID", str);
                nfqVar.a();
                bundle2.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", nfqVar.b);
                bundle2.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", null);
                byte b = 7;
                jw20 jw20Var = new jw20(bundle2, (byte) 7);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                s88 s88Var = firebaseAuth.o.b;
                if (s88Var.b) {
                    taskForException = Tasks.forException(jfw0.a(new Status(17057, null, null, null)));
                } else {
                    omw0 omw0Var = new omw0(s88Var, kxqVarB, taskCompletionSource, firebaseAuth);
                    s88Var.c = omw0Var;
                    gr00.t(kxqVarB).D(omw0Var, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
                    s88Var.b = true;
                    Context applicationContext = kxqVarB.getApplicationContext();
                    s0x.H(applicationContext);
                    SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    nfq nfqVar2 = firebaseAuth.f45644a;
                    nfqVar2.a();
                    editorEdit.putString("firebaseAppName", nfqVar2.b);
                    editorEdit.commit();
                    Intent intent2 = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
                    intent2.setClass(kxqVarB, GenericIdpActivity.class);
                    intent2.setPackage(kxqVarB.getPackageName());
                    intent2.putExtras((Bundle) jw20Var.b);
                    kxqVarB.startActivity(intent2);
                    taskForException = taskCompletionSource.getTask();
                }
                taskForException.getClass();
                taskForException.addOnSuccessListener(new z9f(new g7p(this, b), (byte) 27)).addOnFailureListener(new z9f(this, (byte) 28));
                this.d2 = true;
            }
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putBoolean("HAS_BEEN_CREATED", this.d2);
        super.f0(bundle);
    }
}
