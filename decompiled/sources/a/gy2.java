package a;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Path;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy2 {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void b(iy2 iy2Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        vai0 vai0Var;
        tai0 tai0Var;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseL = ow2.l(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseL != null && (value = viewTranslationResponseL.getValue("android:text")) != null && (text = value.getText()) != null && (vai0Var = (vai0) iy2Var.c().b((int) jKeyAt)) != null && (tai0Var = vai0Var.f37089a) != null) {
                Object objG = tai0Var.d.f23193a.g(mai0.l);
                if (objG == null) {
                    objG = null;
                }
                m6 m6Var = (m6) objG;
                if (m6Var != null && (function1 = (Function1) m6Var.b) != null) {
                }
            }
        }
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
            arrayList2.add(new o35(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return n35.a(defaultDurationSeconds, recommendedFileFormat, arrayList, arrayList2);
    }

    public static EncoderProfiles d(int i, String str) {
        return CamcorderProfile.getAll(str, i);
    }

    public static Path e(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float f(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static int g(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.e;
        switch (stopReason) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void h(iy2 iy2Var, long[] jArr, Consumer consumer) {
        tai0 tai0Var;
        for (long j : jArr) {
            vai0 vai0Var = (vai0) iy2Var.c().b((int) j);
            if (vai0Var != null && (tai0Var = vai0Var.f37089a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(iy2Var.f15568a.getAutofillId(), tai0Var.f);
                Object objG = tai0Var.d.f23193a.g(xai0.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new j83(qf00.a(list, Separators.RETURN, null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float i(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void j(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
