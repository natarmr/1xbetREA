package a;

import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class csj implements sg00, jgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4891a;

    public static /* synthetic */ void b() {
        throw new rsy();
    }

    public static /* synthetic */ void c(String str, Throwable th) throws IOException {
        throw new IOException(str, th);
    }

    public Constructor a() {
        switch (this.f4891a) {
            case 24:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(fuo.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(fuo.class).getConstructor(null);
        }
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        gt2 gt2Var = (gt2) obj;
        switch (this.f4891a) {
            case 0:
                gt2Var.getClass();
                break;
            case 1:
                gt2Var.getClass();
                break;
            case 2:
                gt2Var.getClass();
                break;
            case 3:
                gt2Var.getClass();
                break;
            case 4:
                gt2Var.getClass();
                break;
            case 5:
                gt2Var.getClass();
                break;
            case 6:
                gt2Var.getClass();
                break;
            case 7:
                gt2Var.getClass();
                break;
            case 8:
                gt2Var.getClass();
                break;
            case 9:
                gt2Var.getClass();
                break;
            case 10:
                gt2Var.getClass();
                break;
            case 11:
                gt2Var.getClass();
                break;
            case 12:
                gt2Var.getClass();
                break;
            case 13:
                gt2Var.getClass();
                break;
            case 14:
                gt2Var.getClass();
                break;
            case 15:
                gt2Var.getClass();
                break;
            case 16:
                gt2Var.getClass();
                break;
            case 17:
                gt2Var.getClass();
                break;
            case 18:
                gt2Var.getClass();
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                gt2Var.getClass();
                break;
            case 20:
                gt2Var.getClass();
                break;
            case 21:
                gt2Var.getClass();
                break;
            case 22:
                gt2Var.getClass();
                break;
            default:
                gt2Var.getClass();
                break;
        }
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        Set setM = pzuVar.m(jkd0.a(e45.class));
        r7v r7vVar = r7v.b;
        if (r7vVar == null) {
            synchronized (r7v.class) {
                try {
                    r7vVar = r7v.b;
                    if (r7vVar == null) {
                        r7vVar = new r7v();
                        r7v.b = r7vVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new yyj(setM, r7vVar);
    }

    public /* synthetic */ csj(byte b) {
        this.f4891a = b;
    }
}
