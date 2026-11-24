package a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.TextView;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes.dex */
public final class gfk0 implements ifk0, tlu0, l7w0 {
    public static final gfk0 b = new gfk0(0);
    public static final gfk0 c = new gfk0(1);
    public static final gfk0 d = new gfk0(3);
    public static final gfk0 e = new gfk0(4);
    public static final uuu0 f = new uuu0();
    public static final gfk0 g = new gfk0(7);
    public static final gfk0 h = new gfk0(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11211a;

    public /* synthetic */ gfk0(byte b2) {
        this.f11211a = b2;
    }

    public static n05 b(long j, long j2) {
        return new n05(j, j2, idm0.s(0.25d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    public static o03 f(Surface surface, Integer num, m2a m2aVar, if80 if80Var, hf80 hf80Var, jf80 jf80Var, List list, Size size, boolean z, int i, String str, int i2) {
        Class cls;
        ?? F;
        ?? outputConfiguration = surface;
        m2a m2aVar2 = m2a.x;
        Integer num2 = (i2 & 2) != 0 ? null : num;
        m2a m2aVar3 = (i2 & 4) != 0 ? m2aVar2 : m2aVar;
        boolean z2 = (i2 & 512) != 0 ? false : z;
        int i3 = (i2 & 1024) != 0 ? -1 : i;
        m2aVar3.getClass();
        if (m2aVar3 == m2a.A && Build.VERSION.SDK_INT >= 35) {
            if (num2 == null) {
                jf4.n("Required value was null.");
                return null;
            }
            if (size == null) {
                jf4.n("Required value was null.");
                return null;
            }
            F = oa3.f(num2.intValue(), size);
        } else if (m2aVar3 != m2aVar2) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 26) {
                jf4.n(ua80.e(i4, "Deferred OutputConfigurations are not supported on API ", " (requires API 26)"));
                return null;
            }
            if (size == null) {
                jf4.n("Size must defined when creating a deferred OutputConfiguration.");
                return null;
            }
            if (m2aVar3 == m2a.z) {
                cls = SurfaceTexture.class;
            } else if (m2aVar3 == m2a.y) {
                cls = SurfaceHolder.class;
            } else if (m2aVar3 != m2a.B) {
                if (m2aVar3 != m2a.Y) {
                    e9d0.v(m2aVar3, "Unsupported OutputType: ");
                    return null;
                }
                if (i4 < 35) {
                    jf4.n("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                    return null;
                }
                cls = MediaRecorder.class;
            } else {
                if (i4 < 35) {
                    jf4.n("OutputType.MEDIA_CODEC requires API 35 or higher.");
                    return null;
                }
                cls = MediaCodec.class;
            }
            F = y6.f(size, cls);
        } else {
            if (outputConfiguration == 0) {
                jf4.n("non-null surface!");
                return null;
            }
            try {
                outputConfiguration = i3 != -1 ? new OutputConfiguration(i3, (Surface) outputConfiguration) : new OutputConfiguration(outputConfiguration);
                F = outputConfiguration;
            } catch (Throwable th) {
                Log.w("CXCP", "Failed to create an OutputConfiguration for " + outputConfiguration + '!', th);
                return null;
            }
        }
        if (z2 && Build.VERSION.SDK_INT >= 26) {
            F.enableSurfaceSharing();
        }
        if (str != null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 28) {
                c99.v(ua80.e(i5, "physicalCameraId is not supported on API ", " (requires API 28)"));
                return null;
            }
            if (i5 >= 28) {
                F.setPhysicalCameraId(str);
            }
        }
        if (if80Var != null) {
            byte b2 = if80Var.f14674a;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33) {
                F.setMirrorMode(b2);
            } else if (b2 != 0) {
                StringBuilder sbM = b1j.m(i6, "Cannot set mirrorMode to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                sbM.append((Object) if80.a(b2));
                Log.w("CXCP", sbM.toString());
            }
        }
        if (hf80Var != null) {
            long j = hf80Var.f12960a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                F.setDynamicRangeProfile(j);
            } else if (j != 1) {
                StringBuilder sbM2 = b1j.m(i7, "Cannot set dynamicRangeProfile to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                sbM2.append((Object) hf80.a(j));
                Log.w("CXCP", sbM2.toString());
            }
        }
        if (jf80Var != null && Build.VERSION.SDK_INT >= 33) {
            F.setStreamUseCase(jf80Var.f16412a);
        }
        if (!list.isEmpty()) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 31) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw rw2.h(it);
                }
            } else {
                Log.w("CXCP", "Cannot add sensorPixelModeUsed value on API " + i8 + ". This may result in unexpected behavior. Requested " + list);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            F.getMaxSharedSurfaceCount();
        }
        return new o03(F);
    }

    public static cl1 g(long j, String str) {
        str.getClass();
        cl1 cl1Var = new cl1();
        iiy[] iiyVarArr = cl1.p2;
        cl1Var.k2.j(cl1Var, iiyVarArr[0], j);
        cl1Var.l2.x(cl1Var, iiyVarArr[1], str);
        return cl1Var;
    }

    public static void h(androidx.fragment.app.e eVar, ActionMenuDialogParams actionMenuDialogParams) {
        eVar.getClass();
        pi.l2.getClass();
        if (eVar.J("ACTION_MENU_DIALOG_TAG") != null) {
            return;
        }
        pi piVar = new pi();
        piVar.j2.J(piVar, pi.m2[1], actionMenuDialogParams);
        piVar.H0(eVar, "ACTION_MENU_DIALOG_TAG");
    }

    public static void l(Context context) {
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            systemService.getClass();
            Vibrator defaultVibrator = tl50.q(systemService).getDefaultVibrator();
            defaultVibrator.getClass();
            defaultVibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
            return;
        }
        Object systemService2 = context.getSystemService("vibrator");
        systemService2.getClass();
        Vibrator vibrator = (Vibrator) systemService2;
        if (vibrator.hasVibrator()) {
            if (i >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
            } else {
                vibrator.vibrate(100L);
            }
        }
    }

    public static void n(gfk0 gfk0Var) throws GeneralSecurityException {
        if (gfk0Var != null) {
            return;
        }
        hny.o("SecretKeyAccess is required");
    }

    @Override // a.ifk0
    public int a(int i, int i2, int i3, int i4) {
        return (((i - i3) - i4) / 2) - (i2 / 2);
    }

    @Override // a.l7w0
    public String c() {
        return "OdEeB7/NHtslqGjArd";
    }

    @Override // a.l7w0
    public int d() {
        return R.string.one_x_games_second_v;
    }

    @Override // a.tlu0
    public View e(View view, AttributeSet attributeSet) {
        view.getClass();
        attributeSet.getClass();
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Context context = textView.getContext();
            context.getClass();
            int iD = tlu0.d(context, attributeSet, android.R.attr.text);
            Context context2 = textView.getContext();
            context2.getClass();
            int iD2 = tlu0.d(context2, attributeSet, android.R.attr.hint);
            if (iD > 0) {
                textView.setText(iD);
            }
            if (iD2 > 0) {
                textView.setHint(iD2);
            }
        }
        return view;
    }

    @Override // a.l7w0
    public int i() {
        return R.string.one_x_games_second_k;
    }

    @Override // a.l7w0
    public String j() {
        return "MBYGo6kbu/8IzM8";
    }

    @Override // a.l7w0
    public int k() {
        return R.string.one_x_games_first_k;
    }

    @Override // a.l7w0
    public int m() {
        return R.string.one_x_games_first_v;
    }

    public String toString() {
        switch (this.f11211a) {
            case 0:
                return "Center";
            default:
                return super.toString();
        }
    }

    @Override // a.l7w0
    public int a() {
        return R.string.one_x_games_vers;
    }

    @Override // a.l7w0
    public String b() {
        return "yW3mrTgpoL4/KRJQ0jFDJpDJso=";
    }

    @Override // a.l7w0
    public String e() {
        return "Rs1IG0T3vGjub/jvTEUTyQwiLTJ";
    }

    @Override // a.l7w0
    public String f() {
        return "vPHH9PpTZzp";
    }
}
