package a;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class mgk implements qe60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21747a;
    public final String b;

    public mgk(fhj fhjVar) {
        Context context = (Context) fhjVar.f9543a;
        int iN = aad.N(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iN != 0) {
            this.f21747a = "Unity";
            String string = context.getResources().getString(iN);
            this.b = string;
            String strK = kng0.k("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strK, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f21747a = "Flutter";
                this.b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f21747a = null;
        this.b = null;
    }

    @Override // a.qe60
    public int n(int i) {
        return l1e0.d(i - 1, 0, this.b.length());
    }

    @Override // a.qe60
    public int s(int i) {
        return l1e0.d(i + 1, 0, this.f21747a.length());
    }

    public mgk(String str, String str2) {
        this.f21747a = str;
        this.b = str2;
    }
}
