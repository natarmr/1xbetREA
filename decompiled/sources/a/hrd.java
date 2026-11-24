package a;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.sdk_base.util.ContentProviderFetcher;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hrd implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13525a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hrd(Object obj, byte b) {
        this.f13525a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FileInputStream fileInputStreamOpenFileInput;
        boolean z = true;
        int i = 0;
        FileInputStream fileInputStream = null;
        mrd mrdVarA = null;
        switch (this.f13525a) {
            case 0:
                nsd nsdVar = (nsd) this.b;
                synchronized (nsdVar) {
                    try {
                        try {
                            fileInputStreamOpenFileInput = nsdVar.f24046a.openFileInput(nsdVar.b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                mrdVarA = mrd.a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStreamOpenFileInput;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return mrdVarA;
            case 1:
                return ((ContentProviderFetcher) this.b).lambda$new$0();
            case 2:
                f8f f8fVar = ((j8f) this.b).g;
                f8fVar.getClass();
                cu.d();
                c5k c5kVar = f8fVar.c;
                xzp xzpVar = (xzp) c5kVar.b;
                String str = (String) c5kVar.f3775a;
                if (new File((File) xzpVar.c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    new File((File) ((xzp) c5kVar.b).c, str).delete();
                } else if (f8fVar.e() == null || !f8fVar.j.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) ((jru) this.b).b;
                Long lA = workDatabase.t().a("next_job_scheduler_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                int i2 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                vsb0 vsb0VarT = workDatabase.t();
                byte b = 21;
                kpb.h0(vsb0VarT.f37942a, false, true, new zga0(vsb0VarT, new usb0("next_job_scheduler_id", Long.valueOf(i2)), b));
                if (iLongValue < 0 || iLongValue > Integer.MAX_VALUE) {
                    vsb0 vsb0VarT2 = workDatabase.t();
                    kpb.h0(vsb0VarT2.f37942a, false, true, new zga0(vsb0VarT2, new usb0("next_job_scheduler_id", 1L), b));
                } else {
                    i = iLongValue;
                }
                return Integer.valueOf(i);
            case 4:
                return ka10.e(w9x.L((ByteArrayInputStream) this.b), null);
            case 5:
                return ((qff0) this.b).b("firebase");
            case 6:
                sd60 sd60Var = (sd60) ((g090) this.b).b;
                fhn fhnVar = (fhn) sd60Var.f;
                z6j0 z6j0Var = (z6j0) sd60Var.c;
                String str2 = fhnVar.b;
                cu.e();
                try {
                    HashMap mapG = fhn.g(z6j0Var);
                    yuu yuuVar = new yuu(str2, mapG);
                    yuuVar.l("User-Agent", "Crashlytics Android SDK/20.1.1");
                    yuuVar.l("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    fhn.c(yuuVar, z6j0Var);
                    String strConcat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str3 = "Settings query params were: " + mapG;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return fhnVar.h(yuuVar.f());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            default:
                return (AssetFileDescriptor) this.b;
        }
    }
}
