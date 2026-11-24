package a;

import android.util.JsonReader;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t24 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33198a;

    public /* synthetic */ t24(byte b) {
        this.f33198a = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f33198a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                String name = ((File) obj).getName();
                name.getClass();
                if (name.equals("trigger-type-anomaly")) {
                    return 8;
                }
                return !name.equals("trigger-type-oom") ? 0 : 7;
            default:
                File file = (File) obj;
                try {
                    v9f v9fVar = x9f.g;
                    String strF = x9f.f(file);
                    v9fVar.getClass();
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(strF));
                        try {
                            e25 e25VarH = v9f.h(jsonReader);
                            jsonReader.close();
                            return Optional.of(e25VarH);
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                                break;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IllegalStateException e) {
                        throw new IOException(e);
                    }
                } catch (IOException e2) {
                    Log.w("FirebaseCrashlytics", "Unable to read the Profiling Manager file ", e2);
                    return Optional.empty();
                }
        }
    }
}
