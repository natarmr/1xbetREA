package androidx.camera.extensions;

import a.e2a;
import a.hne;
import a.ig00;
import a.kn4;
import a.msf0;
import a.nto;
import a.ro4;
import a.s0x;
import a.tu9;
import a.uje;
import a.wu9;
import a.yje;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"androidx/camera/extensions/ExtensionsManager$Companion", "", "<init>", "()V", "Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;", "extensionsAvailability", "La/e2a;", "cameraProvider", "Landroid/content/Context;", "applicationContext", "La/nto;", "getOrCreateExtensionsManager", "(Landroidx/camera/extensions/ExtensionsManager$ExtensionsAvailability;La/e2a;Landroid/content/Context;)La/nto;", "context", "La/ig00;", "getInstanceAsync", "(Landroid/content/Context;La/e2a;)La/ig00;", "getInstance", "(Landroid/content/Context;La/e2a;La/yje;)Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "", "MINIMUM_SUPPORTED_API_LEVEL", TokenNames.I, "EXTENSIONS_LOCK", "Ljava/lang/Object;", "sInitializeFuture", "La/ig00;", "Ljava/lang/Void;", "sDeinitializeFuture", "sExtensionsManager", "La/nto;", "camera-extensions"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtensionsManager$Companion {
    public /* synthetic */ ExtensionsManager$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static final Object getInstanceAsync$lambda$0$1(Context context, e2a e2aVar, tu9 tu9Var) throws CameraAccessException {
        String str;
        CameraExtensionCharacteristics cameraExtensionCharacteristicsG;
        tu9Var.getClass();
        CameraManager cameraManager = (CameraManager) context.getSystemService(CameraManager.class);
        cameraManager.getClass();
        Object obj = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        String[] cameraIdList = cameraManager.getCameraIdList();
        cameraIdList.getClass();
        int length = cameraIdList.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = null;
                break;
            }
            str = cameraIdList[i];
            str.getClass();
            synchronized (obj) {
                cameraExtensionCharacteristicsG = kn4.g(linkedHashMap.get(str));
                if (cameraExtensionCharacteristicsG == null) {
                    cameraExtensionCharacteristicsG = cameraManager.getCameraExtensionCharacteristics(str);
                    linkedHashMap.put(str, cameraExtensionCharacteristicsG);
                    cameraExtensionCharacteristicsG.getClass();
                }
            }
            List supportedExtensions = cameraExtensionCharacteristicsG.getSupportedExtensions();
            supportedExtensions.getClass();
            if (!supportedExtensions.isEmpty()) {
                break;
            }
            i++;
        }
        tu9Var.b(nto.f24111a.getOrCreateExtensionsManager(!(str != null) ? ExtensionsManager$ExtensionsAvailability.NONE : ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE, e2aVar, context));
        return "Initialize extensions";
    }

    private final nto getOrCreateExtensionsManager(ExtensionsManager$ExtensionsAvailability extensionsAvailability, e2a cameraProvider, Context applicationContext) {
        nto ntoVar;
        synchronized (nto.b) {
            ntoVar = nto.d;
            if (ntoVar == null) {
                ntoVar = new nto(extensionsAvailability, cameraProvider, applicationContext);
                nto.d = ntoVar;
            }
        }
        return ntoVar;
    }

    public final Object getInstance(Context context, e2a e2aVar, yje<? super nto> yjeVar) {
        return s0x.z(getInstanceAsync(context, e2aVar), yjeVar);
    }

    public final ig00 getInstanceAsync(Context context, e2a cameraProvider) {
        context.getClass();
        cameraProvider.getClass();
        synchronized (nto.b) {
            Context contextA = uje.a(context);
            contextA.getClass();
            if (Build.VERSION.SDK_INT < 33) {
                return ro4.a0(nto.f24111a.getOrCreateExtensionsManager(ExtensionsManager$ExtensionsAvailability.NONE, cameraProvider, contextA));
            }
            wu9 wu9Var = nto.c;
            if (wu9Var == null) {
                tu9 tu9Var = new tu9();
                tu9Var.c = new msf0();
                wu9 wu9Var2 = new wu9(tu9Var);
                tu9Var.b = wu9Var2;
                tu9Var.f34540a = hne.class;
                try {
                    Object instanceAsync$lambda$0$1 = getInstanceAsync$lambda$0$1(contextA, cameraProvider, tu9Var);
                    if (instanceAsync$lambda$0$1 != null) {
                        tu9Var.f34540a = instanceAsync$lambda$0$1;
                    }
                } catch (Exception e) {
                    wu9Var2.b(e);
                }
                nto.c = wu9Var2;
                wu9Var = wu9Var2;
            }
            return wu9Var;
        }
    }

    private ExtensionsManager$Companion() {
    }
}
