package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.javax.sip.message.Response;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.Base64;
import android.view.InputDevice;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ejv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7926a;

    public /* synthetic */ ejv0(byte b) {
        this.f7926a = b;
    }

    private final Object a(Object obj) throws Exception {
        qpg0 qpg0Var = (qpg0) obj;
        qpg0Var.getClass();
        xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        try {
            xpg0VarZ0.o(1, 20L);
            int iT = g1x.t(xpg0VarZ0, ParameterNames.ID);
            int iT2 = g1x.t(xpg0VarZ0, CommonConstant.ReqAccessTokenParam.STATE_LABEL);
            int iT3 = g1x.t(xpg0VarZ0, "worker_class_name");
            int iT4 = g1x.t(xpg0VarZ0, "input_merger_class_name");
            int iT5 = g1x.t(xpg0VarZ0, "input");
            int iT6 = g1x.t(xpg0VarZ0, "output");
            int iT7 = g1x.t(xpg0VarZ0, "initial_delay");
            int iT8 = g1x.t(xpg0VarZ0, "interval_duration");
            int iT9 = g1x.t(xpg0VarZ0, "flex_duration");
            int iT10 = g1x.t(xpg0VarZ0, "run_attempt_count");
            int iT11 = g1x.t(xpg0VarZ0, "backoff_policy");
            int iT12 = g1x.t(xpg0VarZ0, "backoff_delay_duration");
            int iT13 = g1x.t(xpg0VarZ0, "last_enqueue_time");
            int iT14 = g1x.t(xpg0VarZ0, "minimum_retention_duration");
            int iT15 = g1x.t(xpg0VarZ0, "schedule_requested_at");
            int iT16 = g1x.t(xpg0VarZ0, "run_in_foreground");
            int iT17 = g1x.t(xpg0VarZ0, "out_of_quota_policy");
            int iT18 = g1x.t(xpg0VarZ0, "period_count");
            int iT19 = g1x.t(xpg0VarZ0, "generation");
            int iT20 = g1x.t(xpg0VarZ0, "next_schedule_time_override");
            int iT21 = g1x.t(xpg0VarZ0, "next_schedule_time_override_generation");
            int iT22 = g1x.t(xpg0VarZ0, "stop_reason");
            int iT23 = g1x.t(xpg0VarZ0, "trace_tag");
            int iT24 = g1x.t(xpg0VarZ0, "backoff_on_system_interruptions");
            int iT25 = g1x.t(xpg0VarZ0, "required_network_type");
            int iT26 = g1x.t(xpg0VarZ0, "required_network_request");
            int iT27 = g1x.t(xpg0VarZ0, "requires_charging");
            int iT28 = g1x.t(xpg0VarZ0, "requires_device_idle");
            int iT29 = g1x.t(xpg0VarZ0, "requires_battery_not_low");
            int iT30 = g1x.t(xpg0VarZ0, "requires_storage_not_low");
            int iT31 = g1x.t(xpg0VarZ0, "trigger_content_update_delay");
            int iT32 = g1x.t(xpg0VarZ0, "trigger_max_content_delay");
            int iT33 = g1x.t(xpg0VarZ0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (xpg0VarZ0.W0()) {
                String strJ0 = xpg0VarZ0.J0(iT);
                int i = iT13;
                int i2 = iT14;
                zov0 zov0VarV = dqm0.v((int) xpg0VarZ0.getLong(iT2));
                String strJ1 = xpg0VarZ0.J0(iT3);
                String strJ2 = xpg0VarZ0.J0(iT4);
                byte[] blob = xpg0VarZ0.getBlob(iT5);
                maj majVar = maj.b;
                maj majVarB = nkb.B(blob);
                maj majVarB2 = nkb.B(xpg0VarZ0.getBlob(iT6));
                long j = xpg0VarZ0.getLong(iT7);
                long j2 = xpg0VarZ0.getLong(iT8);
                long j3 = xpg0VarZ0.getLong(iT9);
                int i3 = (int) xpg0VarZ0.getLong(iT10);
                int i4 = iT;
                int i5 = iT2;
                af5 af5VarS = dqm0.s((int) xpg0VarZ0.getLong(iT11));
                long j4 = xpg0VarZ0.getLong(iT12);
                long j5 = xpg0VarZ0.getLong(i);
                long j6 = xpg0VarZ0.getLong(i2);
                int i6 = iT15;
                long j7 = xpg0VarZ0.getLong(i6);
                iT15 = i6;
                int i7 = iT16;
                int i8 = iT3;
                boolean z = ((int) xpg0VarZ0.getLong(i7)) != 0;
                int i9 = iT17;
                int i10 = iT4;
                od80 od80VarU = dqm0.u((int) xpg0VarZ0.getLong(i9));
                int i11 = iT18;
                int i12 = (int) xpg0VarZ0.getLong(i11);
                int i13 = iT19;
                int i14 = (int) xpg0VarZ0.getLong(i13);
                int i15 = iT20;
                long j8 = xpg0VarZ0.getLong(i15);
                int i16 = iT21;
                int i17 = (int) xpg0VarZ0.getLong(i16);
                iT21 = i16;
                iT22 = iT22;
                int i18 = (int) xpg0VarZ0.getLong(iT22);
                int i19 = iT23;
                Boolean boolValueOf = null;
                String strJ3 = xpg0VarZ0.isNull(i19) ? null : xpg0VarZ0.J0(i19);
                int i20 = iT24;
                Integer numValueOf = xpg0VarZ0.isNull(i20) ? null : Integer.valueOf((int) xpg0VarZ0.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iT25;
                sl50 sl50VarT = dqm0.t((int) xpg0VarZ0.getLong(i21));
                int i22 = iT26;
                hl50 hl50VarA = dqm0.A(xpg0VarZ0.getBlob(i22));
                int i23 = iT27;
                boolean z2 = ((int) xpg0VarZ0.getLong(i23)) != 0;
                int i24 = iT28;
                boolean z3 = ((int) xpg0VarZ0.getLong(i24)) != 0;
                int i25 = iT29;
                boolean z4 = ((int) xpg0VarZ0.getLong(i25)) != 0;
                iT29 = i25;
                int i26 = iT30;
                int i27 = iT31;
                int i28 = iT32;
                iT31 = i27;
                int i29 = iT33;
                arrayList.add(new ppv0(strJ0, zov0VarV, strJ1, strJ2, majVarB, majVarB2, j, j2, j3, new o4e(hl50VarA, sl50VarT, z2, z3, z4, ((int) xpg0VarZ0.getLong(i26)) != 0, xpg0VarZ0.getLong(i27), xpg0VarZ0.getLong(i28), dqm0.n(xpg0VarZ0.getBlob(i29))), i3, af5VarS, j4, j5, j6, j7, z, od80VarU, i12, i14, j8, i17, i18, strJ3, bool));
                iT28 = i24;
                iT4 = i10;
                iT17 = i9;
                iT18 = i11;
                iT19 = i13;
                iT20 = i15;
                iT23 = i19;
                iT24 = i20;
                iT25 = i21;
                iT26 = i22;
                iT27 = i23;
                iT33 = i29;
                iT32 = i28;
                iT30 = i26;
                iT = i4;
                iT3 = i8;
                iT13 = i;
                iT14 = i2;
                iT2 = i5;
                iT16 = i7;
            }
            return arrayList;
        } finally {
            xpg0VarZ0.close();
        }
    }

    private final Object b(Object obj) throws Exception {
        qpg0 qpg0Var = (qpg0) obj;
        qpg0Var.getClass();
        xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT * FROM workspec WHERE state=1");
        try {
            int iT = g1x.t(xpg0VarZ0, ParameterNames.ID);
            int iT2 = g1x.t(xpg0VarZ0, CommonConstant.ReqAccessTokenParam.STATE_LABEL);
            int iT3 = g1x.t(xpg0VarZ0, "worker_class_name");
            int iT4 = g1x.t(xpg0VarZ0, "input_merger_class_name");
            int iT5 = g1x.t(xpg0VarZ0, "input");
            int iT6 = g1x.t(xpg0VarZ0, "output");
            int iT7 = g1x.t(xpg0VarZ0, "initial_delay");
            int iT8 = g1x.t(xpg0VarZ0, "interval_duration");
            int iT9 = g1x.t(xpg0VarZ0, "flex_duration");
            int iT10 = g1x.t(xpg0VarZ0, "run_attempt_count");
            int iT11 = g1x.t(xpg0VarZ0, "backoff_policy");
            int iT12 = g1x.t(xpg0VarZ0, "backoff_delay_duration");
            int iT13 = g1x.t(xpg0VarZ0, "last_enqueue_time");
            int iT14 = g1x.t(xpg0VarZ0, "minimum_retention_duration");
            int iT15 = g1x.t(xpg0VarZ0, "schedule_requested_at");
            int iT16 = g1x.t(xpg0VarZ0, "run_in_foreground");
            int iT17 = g1x.t(xpg0VarZ0, "out_of_quota_policy");
            int iT18 = g1x.t(xpg0VarZ0, "period_count");
            int iT19 = g1x.t(xpg0VarZ0, "generation");
            int iT20 = g1x.t(xpg0VarZ0, "next_schedule_time_override");
            int iT21 = g1x.t(xpg0VarZ0, "next_schedule_time_override_generation");
            int iT22 = g1x.t(xpg0VarZ0, "stop_reason");
            int iT23 = g1x.t(xpg0VarZ0, "trace_tag");
            int iT24 = g1x.t(xpg0VarZ0, "backoff_on_system_interruptions");
            int iT25 = g1x.t(xpg0VarZ0, "required_network_type");
            int iT26 = g1x.t(xpg0VarZ0, "required_network_request");
            int iT27 = g1x.t(xpg0VarZ0, "requires_charging");
            int iT28 = g1x.t(xpg0VarZ0, "requires_device_idle");
            int iT29 = g1x.t(xpg0VarZ0, "requires_battery_not_low");
            int iT30 = g1x.t(xpg0VarZ0, "requires_storage_not_low");
            int iT31 = g1x.t(xpg0VarZ0, "trigger_content_update_delay");
            int iT32 = g1x.t(xpg0VarZ0, "trigger_max_content_delay");
            int iT33 = g1x.t(xpg0VarZ0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (xpg0VarZ0.W0()) {
                String strJ0 = xpg0VarZ0.J0(iT);
                int i = iT14;
                ArrayList arrayList2 = arrayList;
                zov0 zov0VarV = dqm0.v((int) xpg0VarZ0.getLong(iT2));
                String strJ1 = xpg0VarZ0.J0(iT3);
                String strJ2 = xpg0VarZ0.J0(iT4);
                byte[] blob = xpg0VarZ0.getBlob(iT5);
                maj majVar = maj.b;
                maj majVarB = nkb.B(blob);
                maj majVarB2 = nkb.B(xpg0VarZ0.getBlob(iT6));
                long j = xpg0VarZ0.getLong(iT7);
                long j2 = xpg0VarZ0.getLong(iT8);
                long j3 = xpg0VarZ0.getLong(iT9);
                int i2 = (int) xpg0VarZ0.getLong(iT10);
                int i3 = iT2;
                int i4 = iT3;
                af5 af5VarS = dqm0.s((int) xpg0VarZ0.getLong(iT11));
                long j4 = xpg0VarZ0.getLong(iT12);
                long j5 = xpg0VarZ0.getLong(iT13);
                long j6 = xpg0VarZ0.getLong(i);
                int i5 = iT15;
                long j7 = xpg0VarZ0.getLong(i5);
                int i6 = iT;
                int i7 = iT16;
                boolean z = ((int) xpg0VarZ0.getLong(i7)) != 0;
                int i8 = iT17;
                int i9 = iT4;
                od80 od80VarU = dqm0.u((int) xpg0VarZ0.getLong(i8));
                int i10 = iT18;
                int i11 = iT5;
                int i12 = (int) xpg0VarZ0.getLong(i10);
                int i13 = iT19;
                int i14 = (int) xpg0VarZ0.getLong(i13);
                int i15 = iT20;
                long j8 = xpg0VarZ0.getLong(i15);
                int i16 = iT21;
                int i17 = (int) xpg0VarZ0.getLong(i16);
                int i18 = iT22;
                int i19 = (int) xpg0VarZ0.getLong(i18);
                int i20 = iT23;
                Boolean boolValueOf = null;
                String strJ3 = xpg0VarZ0.isNull(i20) ? null : xpg0VarZ0.J0(i20);
                int i21 = iT24;
                Integer numValueOf = xpg0VarZ0.isNull(i21) ? null : Integer.valueOf((int) xpg0VarZ0.getLong(i21));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i22 = iT25;
                Boolean bool = boolValueOf;
                sl50 sl50VarT = dqm0.t((int) xpg0VarZ0.getLong(i22));
                int i23 = iT26;
                hl50 hl50VarA = dqm0.A(xpg0VarZ0.getBlob(i23));
                iT25 = i22;
                iT26 = i23;
                int i24 = iT27;
                boolean z2 = ((int) xpg0VarZ0.getLong(i24)) != 0;
                iT27 = i24;
                int i25 = iT28;
                boolean z3 = ((int) xpg0VarZ0.getLong(i25)) != 0;
                int i26 = iT29;
                boolean z4 = ((int) xpg0VarZ0.getLong(i26)) != 0;
                iT29 = i26;
                int i27 = iT30;
                int i28 = iT31;
                int i29 = iT32;
                int i30 = iT33;
                iT33 = i30;
                arrayList2.add(new ppv0(strJ0, zov0VarV, strJ1, strJ2, majVarB, majVarB2, j, j2, j3, new o4e(hl50VarA, sl50VarT, z2, z3, z4, ((int) xpg0VarZ0.getLong(i27)) != 0, xpg0VarZ0.getLong(i28), xpg0VarZ0.getLong(i29), dqm0.n(xpg0VarZ0.getBlob(i30))), i2, af5VarS, j4, j5, j6, j7, z, od80VarU, i12, i14, j8, i17, i19, strJ3, bool));
                iT30 = i27;
                iT4 = i9;
                iT17 = i8;
                iT19 = i13;
                iT22 = i18;
                iT24 = i21;
                iT31 = i28;
                iT32 = i29;
                iT2 = i3;
                iT14 = i;
                iT3 = i4;
                arrayList = arrayList2;
                iT = i6;
                iT15 = i5;
                iT16 = i7;
                iT20 = i15;
                iT21 = i16;
                iT23 = i20;
                iT28 = i25;
                iT5 = i11;
                iT18 = i10;
            }
            return arrayList;
        } finally {
            xpg0VarZ0.close();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v5 a.bxv0, still in use, count: 3, list:
          (r7v5 a.bxv0) from 0x0139: MOVE (r24v1 a.bxv0) = (r7v5 a.bxv0) (LINE:314)
          (r7v5 a.bxv0) from 0x0110: MOVE (r24v6 a.bxv0) = (r7v5 a.bxv0) (LINE:273)
          (r7v5 a.bxv0) from 0x0157: PHI (r24v5 a.bxv0) = (r24v1 a.bxv0), (r24v1 a.bxv0), (r7v5 a.bxv0), (r24v6 a.bxv0) binds: [B:64:0x014e, B:61:0x0145, B:57:0x0133, B:50:0x0109] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object c(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ejv0.c(java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj) {
        Object g0g0Var;
        z7w0 z7w0Var;
        n7w0 n7w0Var = (n7w0) obj;
        n7w0Var.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            l8w0 l8w0Var = new l8w0();
            l8w0Var.f19624a = EGL14.EGL_NO_DISPLAY;
            l8w0Var.b = EGL14.EGL_NO_CONTEXT;
            l8w0Var.c = EGL14.EGL_NO_SURFACE;
            try {
                l8w0Var.a();
                int iC = wxs0.c();
                try {
                    GLES20.glUseProgram(iC);
                    wxs0.a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                    double dA = wxs0.a(50000);
                    double dA2 = wxs0.a(2000000);
                    if (dA <= 0.0d) {
                        z7w0Var = z7w0.d;
                    } else {
                        double d = dA2 / dA;
                        if (d >= 2.5d || dA2 >= 5.0d) {
                            z7w0Var = d > 10.0d ? z7w0.c : z7w0.f43941a;
                        } else {
                            z7w0Var = z7w0.b;
                        }
                    }
                    g0g0Var = new a8w0(dA, dA2, z7w0Var);
                    GLES20.glDeleteProgram(iC);
                    l8w0Var.b();
                } catch (Throwable th) {
                    GLES20.glDeleteProgram(iC);
                    throw th;
                }
            } catch (Throwable th2) {
                l8w0Var.b();
                throw th2;
            }
        } catch (Throwable th3) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th3);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        a8w0 a8w0Var = (a8w0) g0g0Var;
        n7w0Var.a(a8w0Var != null ? Double.valueOf(a8w0Var.f449a) : null, "baselineTimeMs");
        n7w0Var.a(a8w0Var != null ? Double.valueOf(a8w0Var.b) : null, "heavyLoadTimeMs");
        n7w0Var.a(a8w0Var != null ? a8w0Var.c : null, "suspectedArchitecture");
        return Unit.f46060a;
    }

    private final Object h(Object obj) {
        n7w0 n7w0Var = (n7w0) obj;
        n7w0Var.getClass();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Response.OK, Response.OK, config);
        bitmapCreateBitmap.getClass();
        try {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2.0f);
            paint.setShader(new LinearGradient(0.0f, 0.0f, 200.0f, 200.0f, new int[]{-65536, -16776961}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawCircle(100.0f, 100.0f, 50.0f, paint);
            paint.setShader(null);
            paint.setColor(-16711936);
            Path path = new Path();
            path.moveTo(10.0f, 10.0f);
            path.cubicTo(50.0f, 150.0f, 150.0f, 50.0f, 190.0f, 190.0f);
            canvas.drawPath(path, paint);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            bitmapCreateBitmap.compress(compressFormat, 100, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            strEncodeToString.getClass();
            bitmapCreateBitmap.recycle();
            n7w0Var.a(strEncodeToString, "Geometry");
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(Response.OK, 50, config);
            bitmapCreateBitmap2.getClass();
            try {
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                Paint paint2 = new Paint();
                paint2.setColor(-16777216);
                paint2.setTextSize(30.0f);
                paint2.setAntiAlias(true);
                paint2.setStyle(Paint.Style.FILL);
                canvas2.drawText("Fingerprint_Test_123!@#", 10.0f, 35.0f, paint2);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bitmapCreateBitmap2.compress(compressFormat, 100, byteArrayOutputStream2);
                String strEncodeToString2 = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                strEncodeToString2.getClass();
                bitmapCreateBitmap2.recycle();
                n7w0Var.a(strEncodeToString2, "Canvas");
                return Unit.f46060a;
            } catch (Throwable th) {
                bitmapCreateBitmap2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            bitmapCreateBitmap.recycle();
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i = 0;
        switch (this.f7926a) {
            case 0:
                return ((djv0) obj).g;
            case 1:
                return ((djv0) obj).f;
            case 2:
                return ((djv0) obj).c;
            case 3:
                return ((djv0) obj).e;
            case 4:
                mjv0 mjv0Var = (mjv0) obj;
                mjv0Var.getClass();
                return mjv0Var;
            case 5:
                y2e y2eVar = (y2e) obj;
                y2eVar.getClass();
                return y2eVar.getClass().getSimpleName();
            case 6:
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                xpg0 xpg0VarZ0 = qpg0Var.Z0("DELETE FROM WorkProgress");
                try {
                    xpg0VarZ0.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ0.close();
                }
            case 7:
                qpg0 qpg0Var2 = (qpg0) obj;
                qpg0Var2.getClass();
                xpg0 xpg0VarZ1 = qpg0Var2.Z0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i2 = xpg0VarZ1.W0() ? (int) xpg0VarZ1.getLong(0) : 0;
                    xpg0VarZ1.close();
                    return Integer.valueOf(i2);
                } catch (Throwable th) {
                    xpg0VarZ1.close();
                    throw th;
                }
            case 8:
                qpg0 qpg0Var3 = (qpg0) obj;
                qpg0Var3.getClass();
                xpg0 xpg0VarZ2 = qpg0Var3.Z0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iT = g1x.t(xpg0VarZ2, ParameterNames.ID);
                    int iT2 = g1x.t(xpg0VarZ2, CommonConstant.ReqAccessTokenParam.STATE_LABEL);
                    int iT3 = g1x.t(xpg0VarZ2, "worker_class_name");
                    int iT4 = g1x.t(xpg0VarZ2, "input_merger_class_name");
                    int iT5 = g1x.t(xpg0VarZ2, "input");
                    int iT6 = g1x.t(xpg0VarZ2, "output");
                    int iT7 = g1x.t(xpg0VarZ2, "initial_delay");
                    int iT8 = g1x.t(xpg0VarZ2, "interval_duration");
                    int iT9 = g1x.t(xpg0VarZ2, "flex_duration");
                    int iT10 = g1x.t(xpg0VarZ2, "run_attempt_count");
                    int iT11 = g1x.t(xpg0VarZ2, "backoff_policy");
                    int iT12 = g1x.t(xpg0VarZ2, "backoff_delay_duration");
                    int iT13 = g1x.t(xpg0VarZ2, "last_enqueue_time");
                    int iT14 = g1x.t(xpg0VarZ2, "minimum_retention_duration");
                    int iT15 = g1x.t(xpg0VarZ2, "schedule_requested_at");
                    int iT16 = g1x.t(xpg0VarZ2, "run_in_foreground");
                    int iT17 = g1x.t(xpg0VarZ2, "out_of_quota_policy");
                    int iT18 = g1x.t(xpg0VarZ2, "period_count");
                    int iT19 = g1x.t(xpg0VarZ2, "generation");
                    int iT20 = g1x.t(xpg0VarZ2, "next_schedule_time_override");
                    int iT21 = g1x.t(xpg0VarZ2, "next_schedule_time_override_generation");
                    int iT22 = g1x.t(xpg0VarZ2, "stop_reason");
                    int iT23 = g1x.t(xpg0VarZ2, "trace_tag");
                    int iT24 = g1x.t(xpg0VarZ2, "backoff_on_system_interruptions");
                    int iT25 = g1x.t(xpg0VarZ2, "required_network_type");
                    int iT26 = g1x.t(xpg0VarZ2, "required_network_request");
                    int iT27 = g1x.t(xpg0VarZ2, "requires_charging");
                    int iT28 = g1x.t(xpg0VarZ2, "requires_device_idle");
                    int iT29 = g1x.t(xpg0VarZ2, "requires_battery_not_low");
                    int iT30 = g1x.t(xpg0VarZ2, "requires_storage_not_low");
                    int iT31 = g1x.t(xpg0VarZ2, "trigger_content_update_delay");
                    int iT32 = g1x.t(xpg0VarZ2, "trigger_max_content_delay");
                    int iT33 = g1x.t(xpg0VarZ2, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ2.W0()) {
                        String strJ0 = xpg0VarZ2.J0(iT);
                        int i3 = iT;
                        int i4 = iT14;
                        zov0 zov0VarV = dqm0.v((int) xpg0VarZ2.getLong(iT2));
                        String strJ1 = xpg0VarZ2.J0(iT3);
                        String strJ2 = xpg0VarZ2.J0(iT4);
                        byte[] blob = xpg0VarZ2.getBlob(iT5);
                        maj majVar = maj.b;
                        maj majVarB = nkb.B(blob);
                        maj majVarB2 = nkb.B(xpg0VarZ2.getBlob(iT6));
                        long j = xpg0VarZ2.getLong(iT7);
                        long j2 = xpg0VarZ2.getLong(iT8);
                        long j3 = xpg0VarZ2.getLong(iT9);
                        int i5 = (int) xpg0VarZ2.getLong(iT10);
                        int i6 = iT5;
                        int i7 = iT4;
                        af5 af5VarS = dqm0.s((int) xpg0VarZ2.getLong(iT11));
                        long j4 = xpg0VarZ2.getLong(iT12);
                        long j5 = xpg0VarZ2.getLong(iT13);
                        long j6 = xpg0VarZ2.getLong(i4);
                        int i8 = iT15;
                        long j7 = xpg0VarZ2.getLong(i8);
                        int i9 = iT3;
                        int i10 = iT16;
                        boolean z = ((int) xpg0VarZ2.getLong(i10)) != 0;
                        int i11 = iT2;
                        int i12 = iT17;
                        od80 od80VarU = dqm0.u((int) xpg0VarZ2.getLong(i12));
                        iT17 = i12;
                        int i13 = iT18;
                        int i14 = (int) xpg0VarZ2.getLong(i13);
                        iT18 = i13;
                        int i15 = iT19;
                        int i16 = (int) xpg0VarZ2.getLong(i15);
                        int i17 = iT20;
                        long j8 = xpg0VarZ2.getLong(i17);
                        int i18 = iT21;
                        int i19 = (int) xpg0VarZ2.getLong(i18);
                        iT21 = i18;
                        iT22 = iT22;
                        int i20 = (int) xpg0VarZ2.getLong(iT22);
                        iT23 = iT23;
                        String strJ3 = xpg0VarZ2.isNull(iT23) ? null : xpg0VarZ2.J0(iT23);
                        int i21 = iT24;
                        Integer numValueOf = xpg0VarZ2.isNull(i21) ? null : Integer.valueOf((int) xpg0VarZ2.getLong(i21));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i22 = iT25;
                        sl50 sl50VarT = dqm0.t((int) xpg0VarZ2.getLong(i22));
                        int i23 = iT26;
                        hl50 hl50VarA = dqm0.A(xpg0VarZ2.getBlob(i23));
                        int i24 = iT27;
                        boolean z2 = ((int) xpg0VarZ2.getLong(i24)) != 0;
                        int i25 = iT28;
                        boolean z3 = ((int) xpg0VarZ2.getLong(i25)) != 0;
                        int i26 = iT29;
                        boolean z4 = ((int) xpg0VarZ2.getLong(i26)) != 0;
                        iT29 = i26;
                        int i27 = iT30;
                        int i28 = iT31;
                        int i29 = iT32;
                        iT31 = i28;
                        int i30 = iT33;
                        arrayList.add(new ppv0(strJ0, zov0VarV, strJ1, strJ2, majVarB, majVarB2, j, j2, j3, new o4e(hl50VarA, sl50VarT, z2, z3, z4, ((int) xpg0VarZ2.getLong(i27)) != 0, xpg0VarZ2.getLong(i28), xpg0VarZ2.getLong(i29), dqm0.n(xpg0VarZ2.getBlob(i30))), i5, af5VarS, j4, j5, j6, j7, z, od80VarU, i14, i16, j8, i19, i20, strJ3, boolValueOf));
                        iT2 = i11;
                        iT16 = i10;
                        iT19 = i15;
                        iT20 = i17;
                        iT24 = i21;
                        iT25 = i22;
                        iT26 = i23;
                        iT27 = i24;
                        iT28 = i25;
                        iT33 = i30;
                        iT32 = i29;
                        iT30 = i27;
                        iT4 = i7;
                        iT = i3;
                        iT14 = i4;
                        iT5 = i6;
                        iT3 = i9;
                        iT15 = i8;
                        break;
                    }
                    return arrayList;
                } finally {
                    xpg0VarZ2.close();
                }
            case 9:
                qpg0 qpg0Var4 = (qpg0) obj;
                qpg0Var4.getClass();
                xpg0 xpg0VarZ3 = qpg0Var4.Z0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iT34 = g1x.t(xpg0VarZ3, ParameterNames.ID);
                    int iT35 = g1x.t(xpg0VarZ3, CommonConstant.ReqAccessTokenParam.STATE_LABEL);
                    int iT36 = g1x.t(xpg0VarZ3, "worker_class_name");
                    int iT37 = g1x.t(xpg0VarZ3, "input_merger_class_name");
                    int iT38 = g1x.t(xpg0VarZ3, "input");
                    int iT39 = g1x.t(xpg0VarZ3, "output");
                    int iT40 = g1x.t(xpg0VarZ3, "initial_delay");
                    int iT41 = g1x.t(xpg0VarZ3, "interval_duration");
                    int iT42 = g1x.t(xpg0VarZ3, "flex_duration");
                    int iT43 = g1x.t(xpg0VarZ3, "run_attempt_count");
                    int iT44 = g1x.t(xpg0VarZ3, "backoff_policy");
                    int iT45 = g1x.t(xpg0VarZ3, "backoff_delay_duration");
                    int iT46 = g1x.t(xpg0VarZ3, "last_enqueue_time");
                    int iT47 = g1x.t(xpg0VarZ3, "minimum_retention_duration");
                    int iT48 = g1x.t(xpg0VarZ3, "schedule_requested_at");
                    int iT49 = g1x.t(xpg0VarZ3, "run_in_foreground");
                    int iT50 = g1x.t(xpg0VarZ3, "out_of_quota_policy");
                    int iT51 = g1x.t(xpg0VarZ3, "period_count");
                    int iT52 = g1x.t(xpg0VarZ3, "generation");
                    int iT53 = g1x.t(xpg0VarZ3, "next_schedule_time_override");
                    int iT54 = g1x.t(xpg0VarZ3, "next_schedule_time_override_generation");
                    int iT55 = g1x.t(xpg0VarZ3, "stop_reason");
                    int iT56 = g1x.t(xpg0VarZ3, "trace_tag");
                    int iT57 = g1x.t(xpg0VarZ3, "backoff_on_system_interruptions");
                    int iT58 = g1x.t(xpg0VarZ3, "required_network_type");
                    int iT59 = g1x.t(xpg0VarZ3, "required_network_request");
                    int iT60 = g1x.t(xpg0VarZ3, "requires_charging");
                    int iT61 = g1x.t(xpg0VarZ3, "requires_device_idle");
                    int iT62 = g1x.t(xpg0VarZ3, "requires_battery_not_low");
                    int iT63 = g1x.t(xpg0VarZ3, "requires_storage_not_low");
                    int iT64 = g1x.t(xpg0VarZ3, "trigger_content_update_delay");
                    int iT65 = g1x.t(xpg0VarZ3, "trigger_max_content_delay");
                    int iT66 = g1x.t(xpg0VarZ3, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (xpg0VarZ3.W0()) {
                        String strJ4 = xpg0VarZ3.J0(iT34);
                        int i31 = iT34;
                        int i32 = iT47;
                        zov0 zov0VarV2 = dqm0.v((int) xpg0VarZ3.getLong(iT35));
                        String strJ5 = xpg0VarZ3.J0(iT36);
                        String strJ6 = xpg0VarZ3.J0(iT37);
                        byte[] blob2 = xpg0VarZ3.getBlob(iT38);
                        maj majVar2 = maj.b;
                        maj majVarB3 = nkb.B(blob2);
                        maj majVarB4 = nkb.B(xpg0VarZ3.getBlob(iT39));
                        long j9 = xpg0VarZ3.getLong(iT40);
                        long j10 = xpg0VarZ3.getLong(iT41);
                        long j11 = xpg0VarZ3.getLong(iT42);
                        int i33 = (int) xpg0VarZ3.getLong(iT43);
                        int i34 = iT38;
                        int i35 = iT37;
                        af5 af5VarS2 = dqm0.s((int) xpg0VarZ3.getLong(iT44));
                        long j12 = xpg0VarZ3.getLong(iT45);
                        long j13 = xpg0VarZ3.getLong(iT46);
                        long j14 = xpg0VarZ3.getLong(i32);
                        int i36 = iT48;
                        long j15 = xpg0VarZ3.getLong(i36);
                        int i37 = iT49;
                        iT48 = i36;
                        boolean z5 = ((int) xpg0VarZ3.getLong(i37)) != 0;
                        int i38 = iT36;
                        int i39 = iT50;
                        od80 od80VarU2 = dqm0.u((int) xpg0VarZ3.getLong(i39));
                        int i40 = iT51;
                        int i41 = iT35;
                        int i42 = (int) xpg0VarZ3.getLong(i40);
                        iT50 = i39;
                        int i43 = iT52;
                        int i44 = (int) xpg0VarZ3.getLong(i43);
                        long j16 = xpg0VarZ3.getLong(iT53);
                        int i45 = iT54;
                        int i46 = (int) xpg0VarZ3.getLong(i45);
                        iT54 = i45;
                        iT55 = iT55;
                        int i47 = (int) xpg0VarZ3.getLong(iT55);
                        iT56 = iT56;
                        String strJ7 = xpg0VarZ3.isNull(iT56) ? null : xpg0VarZ3.J0(iT56);
                        int i48 = iT57;
                        Integer numValueOf2 = xpg0VarZ3.isNull(i48) ? null : Integer.valueOf((int) xpg0VarZ3.getLong(i48));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i49 = iT58;
                        sl50 sl50VarT2 = dqm0.t((int) xpg0VarZ3.getLong(i49));
                        int i50 = iT59;
                        hl50 hl50VarA2 = dqm0.A(xpg0VarZ3.getBlob(i50));
                        int i51 = iT60;
                        boolean z6 = ((int) xpg0VarZ3.getLong(i51)) != 0;
                        int i52 = iT61;
                        boolean z7 = ((int) xpg0VarZ3.getLong(i52)) != 0;
                        int i53 = iT62;
                        boolean z8 = ((int) xpg0VarZ3.getLong(i53)) != 0;
                        iT62 = i53;
                        int i54 = iT63;
                        int i55 = iT64;
                        int i56 = iT65;
                        iT64 = i55;
                        int i57 = iT66;
                        arrayList2.add(new ppv0(strJ4, zov0VarV2, strJ5, strJ6, majVarB3, majVarB4, j9, j10, j11, new o4e(hl50VarA2, sl50VarT2, z6, z7, z8, ((int) xpg0VarZ3.getLong(i54)) != 0, xpg0VarZ3.getLong(i55), xpg0VarZ3.getLong(i56), dqm0.n(xpg0VarZ3.getBlob(i57))), i33, af5VarS2, j12, j13, j14, j15, z5, od80VarU2, i42, i44, j16, i46, i47, strJ7, boolValueOf2));
                        iT61 = i52;
                        iT35 = i41;
                        iT51 = i40;
                        iT52 = i43;
                        iT57 = i48;
                        iT58 = i49;
                        iT59 = i50;
                        iT60 = i51;
                        iT66 = i57;
                        iT65 = i56;
                        iT63 = i54;
                        iT34 = i31;
                        iT37 = i35;
                        iT38 = i34;
                        iT36 = i38;
                        iT49 = i37;
                        iT47 = i32;
                        break;
                    }
                    return arrayList2;
                } finally {
                    xpg0VarZ3.close();
                }
            case 10:
                qpg0 qpg0Var5 = (qpg0) obj;
                qpg0Var5.getClass();
                xpg0 xpg0VarZ4 = qpg0Var5.Z0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    return Boolean.valueOf(xpg0VarZ4.W0() && ((int) xpg0VarZ4.getLong(0)) != 0);
                } finally {
                    xpg0VarZ4.close();
                }
            case 11:
                qpg0 qpg0Var6 = (qpg0) obj;
                qpg0Var6.getClass();
                xpg0 xpg0VarZ5 = qpg0Var6.Z0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    xpg0VarZ5.o(1, 200L);
                    int iT67 = g1x.t(xpg0VarZ5, ParameterNames.ID);
                    int iT68 = g1x.t(xpg0VarZ5, CommonConstant.ReqAccessTokenParam.STATE_LABEL);
                    int iT69 = g1x.t(xpg0VarZ5, "worker_class_name");
                    int iT70 = g1x.t(xpg0VarZ5, "input_merger_class_name");
                    int iT71 = g1x.t(xpg0VarZ5, "input");
                    int iT72 = g1x.t(xpg0VarZ5, "output");
                    int iT73 = g1x.t(xpg0VarZ5, "initial_delay");
                    int iT74 = g1x.t(xpg0VarZ5, "interval_duration");
                    int iT75 = g1x.t(xpg0VarZ5, "flex_duration");
                    int iT76 = g1x.t(xpg0VarZ5, "run_attempt_count");
                    int iT77 = g1x.t(xpg0VarZ5, "backoff_policy");
                    int iT78 = g1x.t(xpg0VarZ5, "backoff_delay_duration");
                    int iT79 = g1x.t(xpg0VarZ5, "last_enqueue_time");
                    int iT80 = g1x.t(xpg0VarZ5, "minimum_retention_duration");
                    int iT81 = g1x.t(xpg0VarZ5, "schedule_requested_at");
                    int iT82 = g1x.t(xpg0VarZ5, "run_in_foreground");
                    int iT83 = g1x.t(xpg0VarZ5, "out_of_quota_policy");
                    int iT84 = g1x.t(xpg0VarZ5, "period_count");
                    int iT85 = g1x.t(xpg0VarZ5, "generation");
                    int iT86 = g1x.t(xpg0VarZ5, "next_schedule_time_override");
                    int iT87 = g1x.t(xpg0VarZ5, "next_schedule_time_override_generation");
                    int iT88 = g1x.t(xpg0VarZ5, "stop_reason");
                    int iT89 = g1x.t(xpg0VarZ5, "trace_tag");
                    int iT90 = g1x.t(xpg0VarZ5, "backoff_on_system_interruptions");
                    int iT91 = g1x.t(xpg0VarZ5, "required_network_type");
                    int iT92 = g1x.t(xpg0VarZ5, "required_network_request");
                    int iT93 = g1x.t(xpg0VarZ5, "requires_charging");
                    int iT94 = g1x.t(xpg0VarZ5, "requires_device_idle");
                    int iT95 = g1x.t(xpg0VarZ5, "requires_battery_not_low");
                    int iT96 = g1x.t(xpg0VarZ5, "requires_storage_not_low");
                    int iT97 = g1x.t(xpg0VarZ5, "trigger_content_update_delay");
                    int iT98 = g1x.t(xpg0VarZ5, "trigger_max_content_delay");
                    int iT99 = g1x.t(xpg0VarZ5, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (xpg0VarZ5.W0()) {
                        String strJ8 = xpg0VarZ5.J0(iT67);
                        int i58 = iT79;
                        int i59 = iT80;
                        zov0 zov0VarV3 = dqm0.v((int) xpg0VarZ5.getLong(iT68));
                        String strJ9 = xpg0VarZ5.J0(iT69);
                        String strJ10 = xpg0VarZ5.J0(iT70);
                        byte[] blob3 = xpg0VarZ5.getBlob(iT71);
                        maj majVar3 = maj.b;
                        maj majVarB5 = nkb.B(blob3);
                        maj majVarB6 = nkb.B(xpg0VarZ5.getBlob(iT72));
                        long j17 = xpg0VarZ5.getLong(iT73);
                        long j18 = xpg0VarZ5.getLong(iT74);
                        long j19 = xpg0VarZ5.getLong(iT75);
                        int i60 = (int) xpg0VarZ5.getLong(iT76);
                        int i61 = iT71;
                        int i62 = iT70;
                        af5 af5VarS3 = dqm0.s((int) xpg0VarZ5.getLong(iT77));
                        long j20 = xpg0VarZ5.getLong(iT78);
                        long j21 = xpg0VarZ5.getLong(i58);
                        long j22 = xpg0VarZ5.getLong(i59);
                        int i63 = iT81;
                        long j23 = xpg0VarZ5.getLong(i63);
                        int i64 = iT69;
                        int i65 = iT82;
                        boolean z9 = ((int) xpg0VarZ5.getLong(i65)) != 0;
                        int i66 = iT68;
                        int i67 = iT83;
                        od80 od80VarU3 = dqm0.u((int) xpg0VarZ5.getLong(i67));
                        iT83 = i67;
                        int i68 = iT84;
                        int i69 = (int) xpg0VarZ5.getLong(i68);
                        iT84 = i68;
                        int i70 = iT85;
                        int i71 = (int) xpg0VarZ5.getLong(i70);
                        int i72 = iT86;
                        long j24 = xpg0VarZ5.getLong(i72);
                        int i73 = iT87;
                        int i74 = (int) xpg0VarZ5.getLong(i73);
                        iT87 = i73;
                        iT88 = iT88;
                        int i75 = (int) xpg0VarZ5.getLong(iT88);
                        iT89 = iT89;
                        String strJ11 = xpg0VarZ5.isNull(iT89) ? null : xpg0VarZ5.J0(iT89);
                        int i76 = iT90;
                        Integer numValueOf3 = xpg0VarZ5.isNull(i76) ? null : Integer.valueOf((int) xpg0VarZ5.getLong(i76));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i77 = iT91;
                        sl50 sl50VarT3 = dqm0.t((int) xpg0VarZ5.getLong(i77));
                        int i78 = iT92;
                        hl50 hl50VarA3 = dqm0.A(xpg0VarZ5.getBlob(i78));
                        int i79 = iT93;
                        boolean z10 = ((int) xpg0VarZ5.getLong(i79)) != 0;
                        int i80 = iT94;
                        boolean z11 = ((int) xpg0VarZ5.getLong(i80)) != 0;
                        int i81 = iT95;
                        boolean z12 = ((int) xpg0VarZ5.getLong(i81)) != 0;
                        iT95 = i81;
                        int i82 = iT96;
                        int i83 = iT97;
                        int i84 = iT98;
                        iT97 = i83;
                        int i85 = iT99;
                        arrayList3.add(new ppv0(strJ8, zov0VarV3, strJ9, strJ10, majVarB5, majVarB6, j17, j18, j19, new o4e(hl50VarA3, sl50VarT3, z10, z11, z12, ((int) xpg0VarZ5.getLong(i82)) != 0, xpg0VarZ5.getLong(i83), xpg0VarZ5.getLong(i84), dqm0.n(xpg0VarZ5.getBlob(i85))), i60, af5VarS3, j20, j21, j22, j23, z9, od80VarU3, i69, i71, j24, i74, i75, strJ11, boolValueOf3));
                        iT68 = i66;
                        iT82 = i65;
                        iT85 = i70;
                        iT86 = i72;
                        iT90 = i76;
                        iT91 = i77;
                        iT92 = i78;
                        iT93 = i79;
                        iT94 = i80;
                        iT99 = i85;
                        iT98 = i84;
                        iT96 = i82;
                        iT79 = i58;
                        iT70 = i62;
                        iT71 = i61;
                        iT69 = i64;
                        iT81 = i63;
                        iT80 = i59;
                        break;
                    }
                    return arrayList3;
                } finally {
                    xpg0VarZ5.close();
                }
            case 12:
                qpg0 qpg0Var7 = (qpg0) obj;
                qpg0Var7.getClass();
                xpg0 xpg0VarZ6 = qpg0Var7.Z0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    xpg0VarZ6.W0();
                    return Integer.valueOf(s0x.R(qpg0Var7));
                } finally {
                    xpg0VarZ6.close();
                }
            case 13:
                return a(obj);
            case 14:
                return b(obj);
            case 15:
                rb50 rb50Var = (rb50) obj;
                rb50Var.getClass();
                return new ob50(rb50Var, cy2.u);
            case 16:
                return Unit.f46060a;
            case 17:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 18:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Fragment fragment = (Fragment) obj;
                fragment.getClass();
                return fragment.y;
            case 20:
                return c(obj);
            case 21:
                tn60 tn60Var = (tn60) obj;
                tn60Var.getClass();
                return new yyv0(tn60Var);
            case 22:
                ((d3w0) obj).getClass();
                return Boolean.TRUE;
            case 23:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 24:
                return g(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                n7w0 n7w0Var = (n7w0) obj;
                n7w0Var.getClass();
                MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
                codecInfos.getClass();
                ArrayList arrayList4 = new ArrayList(codecInfos.length);
                int length = codecInfos.length;
                while (i < length) {
                    MediaCodecInfo mediaCodecInfo = codecInfos[i];
                    arrayList4.add(mediaCodecInfo.getName() + ':' + mediaCodecInfo.isEncoder());
                    i++;
                }
                n7w0Var.a(arrayList4, "Codecs");
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                n7w0 n7w0Var2 = (n7w0) obj;
                n7w0Var2.getClass();
                int[] deviceIds = InputDevice.getDeviceIds();
                deviceIds.getClass();
                ArrayList arrayList5 = new ArrayList(deviceIds.length);
                int length2 = deviceIds.length;
                while (i < length2) {
                    InputDevice device = InputDevice.getDevice(deviceIds[i]);
                    arrayList5.add(String.valueOf(device != null ? device.getName() : null));
                    i++;
                }
                n7w0Var2.a(arrayList5, "devices");
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return h(obj);
            default:
                n7w0 n7w0Var3 = (n7w0) obj;
                n7w0Var3.getClass();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                stackTrace.getClass();
                List listG0 = 20 >= stackTrace.length ? tx3.g0(stackTrace) : qx3.c(qx3.k(stackTrace, 0, 20));
                ArrayList arrayList6 = new ArrayList(r3d.q(listG0, 10));
                Iterator it = listG0.iterator();
                while (it.hasNext()) {
                    arrayList6.add(((StackTraceElement) it.next()).toString());
                }
                n7w0Var3.a(arrayList6, ParameterNames.TEXT);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ejv0(x7w0 x7w0Var, byte b) {
        this.f7926a = b;
    }
}
