package a;

import android.app.LocaleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.camera2.CameraCharacteristics;
import android.media.EncoderProfiles;
import android.os.Bundle;
import android.os.LocaleList;
import android.security.identity.PresentationSession;
import android.text.StaticLayout;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f7 {
    public static void A(Object obj, ma3 ma3Var) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(ma3Var);
    }

    public static BiometricPrompt.CryptoObject a(PresentationSession presentationSession) {
        return new BiometricPrompt.CryptoObject(presentationSession);
    }

    public static OnBackInvokedDispatcher b(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }

    public static n35 c(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(new m35(audioProfile.getCodec(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile(), audioProfile.getMediaType()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(new o35(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return n35.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static PackageInfo d(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object e(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] f(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArray(str, cls);
    }

    public static ArrayList g(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object h(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static PresentationSession i(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getPresentationSession();
    }

    public static agn j(c1a c1aVar) {
        c1aVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
        key.getClass();
        Long l = (Long) ((ow9) c1aVar).c(key);
        if (l != null) {
            return (agn) bgn.f2563a.get(l);
        }
        return null;
    }

    public static Serializable k(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static Serializable l(Intent intent) {
        return intent.getSerializableExtra("com.yandex.authsdk.EXTRA_ERROR", d2w0.class);
    }

    public static SparseArray m(Bundle bundle, String str, Class cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    public static String n(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean o(hil hilVar) {
        return hilVar.isSelectedChildViewEnabled();
    }

    public static boolean p(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList q(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList r(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void s(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static final void t(rmb0 rmb0Var, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = rmb0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void u(rmb0 rmb0Var, ma3 ma3Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (ma3Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = rmb0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(ma3Var);
    }

    public static final void v(CursorAnchorInfo.Builder builder, jge0 jge0Var) {
        builder.setEditorBoundsInfo(r6e.f().setEditorBounds(e9x.W(jge0Var)).setHandwritingBounds(e9x.W(jge0Var)).build());
    }

    public static final void w(CursorAnchorInfo.Builder builder, jge0 jge0Var) {
        builder.setEditorBoundsInfo(r6e.f().setEditorBounds(e9x.W(jge0Var)).setHandwritingBounds(e9x.W(jge0Var)).build());
    }

    public static final void x(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static void y(hil hilVar, boolean z) {
        hilVar.setSelectedChildViewEnabled(z);
    }

    public static void z(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }
}
