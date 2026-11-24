package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zo4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44700a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zo4(Object obj, byte b) {
        this.f44700a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0247  */
    /* JADX WARN: Code duplicated, block: B:130:0x0258  */
    /* JADX WARN: Code duplicated, block: B:132:0x026d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0276  */
    /* JADX WARN: Code duplicated, block: B:135:0x027d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0298  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x0302  */
    /* JADX WARN: Code duplicated, block: B:163:0x0307  */
    /* JADX WARN: Code duplicated, block: B:165:0x030f  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        float f;
        Object value;
        kko kkoVar;
        Bitmap bitmapDecodeStream;
        Exception exc;
        Matrix matrix;
        float width;
        float height;
        int i;
        RectF rectF;
        float f2;
        Bitmap.Config config;
        Bitmap bitmapCreateBitmap;
        boolean z;
        int i2;
        int iMin;
        double dMax;
        int i3;
        byte b = this.f44700a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ntu) obj).a();
            case 1:
                gfk0 gfk0Var = cp4.P1;
                fiu0 fiu0Var = ((cp4) obj).L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                ((hl60) obj).y(false);
                return Unit.f46060a;
            case 3:
                return (ws4) ((wby) obj).b(sre0.f32672a.b(ws4.class));
            case 4:
                return (hv4) ((gii0) ((ehf0) obj).b).b(sre0.f32672a.b(hv4.class));
            case 5:
                fiu0 fiu0Var2 = ((n75) obj).N1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 6:
                ((df5) obj).o.getClass();
                throw new ClassCastException();
            case 7:
                oyq0 oyq0Var = (oyq0) obj;
                float fL = oyq0Var.c.l();
                float f3 = oyq0Var.f26070a;
                if (fL != f3 || f3 == 0.0f) {
                    zcl zclVar = qmk.f28987a;
                    f = 24.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 0.0f;
                }
                return new ycl(f);
            case 8:
                bl5 bl5Var = (bl5) obj;
                l9i l9iVar = bl5Var.K1;
                if (l9iVar != null) {
                    return new t0h0(l9iVar, a4n0.f(bl5Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 9:
                fl5 fl5Var = (fl5) obj;
                l9i l9iVar2 = fl5Var.K1;
                if (l9iVar2 != null) {
                    return new t0h0(l9iVar2, a4n0.f(fl5Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 10:
                il5 il5Var = (il5) obj;
                l9i l9iVar3 = il5Var.M1;
                if (l9iVar3 != null) {
                    return new t0h0(l9iVar3, a4n0.f(il5Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 11:
                ol5 ol5Var = (ol5) obj;
                l9i l9iVar4 = ol5Var.K1;
                if (l9iVar4 != null) {
                    return new t0h0(l9iVar4, a4n0.f(ol5Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 12:
                return ((OnexDatabase) ((jr5) obj).f16985a.b).q();
            case 13:
                iiy[] iiyVarArr = iw5.j2;
                return new gw5((iw5) obj, (byte) 0);
            case 14:
                return new w1(obj, (byte) 17);
            case 15:
                q46 q46Var = (q46) obj;
                bj5 bj5Var = q46.O1;
                i1w0 i1w0VarF = a4n0.f(q46Var);
                s9i s9iVar = q46Var.L1;
                if (s9iVar != null) {
                    return new ry3(i1w0VarF, s9iVar);
                }
                Intrinsics.h("baseVerificationViewModelFactory");
                throw null;
            case 16:
                return ((a56) obj).h();
            case 17:
                return (j83) obj;
            case 18:
                return (rn6) ((gii0) ((xr) obj).f41344a).b(sre0.f32672a.b(rn6.class));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i4 = vp6.W;
                ((vp6) obj).G(cp6.f4729a);
                return Unit.f46060a;
            case 20:
                fiu0 fiu0Var3 = ((zp6) obj).g2;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 21:
                return (tq6) ((gii0) ((c5k) obj).f3775a).b(sre0.f32672a.b(tq6.class));
            case 22:
                r9u r9uVar = ((as6) obj).x;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return Boolean.valueOf(j1q0Var.f15748a.d(ygpVar));
            case 23:
                return (s37) ((gii0) ((yzn0) obj).f43523a).b(sre0.f32672a.b(s37.class));
            case 24:
                kf7 kf7Var = (kf7) obj;
                p7m0 p7m0Var = kf7Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    kf7Var.f.getClass();
                } while (!p7m0Var.m(value, hf7.a((hf7) value, null, null, false, null, 27)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (oj7) ((gii0) ((xex) obj).f40764a).b(sre0.f32672a.b(oj7.class));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Integer.valueOf(((nwh0) obj).b);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new pu7(nqp0.f23971a, cu7.f4974a, ((oif0) obj).u(), null);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fiu0 fiu0Var4 = ((e68) obj).K1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                x68 x68Var = (x68) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                a780 a780Var = x68Var.b;
                u68 u68Var = new u68(((y1x) x68Var.d).V0());
                zae0 zae0Var = new zae0(u68Var);
                byte b2 = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new e99(zae0Var.d(), b2), null, options);
                Exception exc2 = (Exception) u68Var.c;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inJustDecodeBounds = false;
                Paint paint = xko.f41037a;
                String str = options.outMimeType;
                ((uko) x68Var.e).getClass();
                if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
                    sko skoVar = new sko(new tko(new e99(zae0Var.d(), b2)));
                    int iD = skoVar.d(1, "Orientation");
                    boolean z2 = iD == 2 || iD == 7 || iD == 4 || iD == 5;
                    switch (skoVar.d(1, "Orientation")) {
                        case 3:
                        case 4:
                            i3 = 180;
                            break;
                        case 5:
                        case 8:
                            i3 = 270;
                            break;
                        case 6:
                        case 7:
                            i3 = 90;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    kkoVar = new kko(z2, i3);
                } else {
                    kkoVar = kko.c;
                }
                int i5 = kkoVar.f18450a;
                boolean z3 = kkoVar.b;
                Exception exc3 = (Exception) u68Var.c;
                if (exc3 != null) {
                    throw exc3;
                }
                options.inMutable = false;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 26) {
                    kuo kuoVar = t1x.c;
                    if (c0g.c(qbc.Q(a780Var, kuoVar)) != null) {
                        options.inPreferredColorSpace = c0g.c(qbc.Q(a780Var, kuoVar));
                    }
                }
                boolean zBooleanValue = ((Boolean) qbc.Q(a780Var, t1x.d)).booleanValue();
                Context context = a780Var.f354a;
                options.inPremultiplied = zBooleanValue;
                Bitmap.Config config2 = (Bitmap.Config) qbc.Q(a780Var, t1x.b);
                if ((z3 || i5 > 0) && (config2 == null || cy2.C(config2))) {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) qbc.Q(a780Var, t1x.h)).booleanValue() && config2 == Bitmap.Config.ARGB_8888 && Intrinsics.d(options.outMimeType, "image/jpeg")) {
                    config2 = Bitmap.Config.RGB_565;
                }
                if (i6 >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && config2 != Bitmap.Config.HARDWARE) {
                    config2 = Bitmap.Config.RGBA_F16;
                }
                options.inPreferredConfig = config2;
                int i7 = options.outWidth;
                if (i7 <= 0 || (i2 = options.outHeight) <= 0) {
                    options.inSampleSize = b2;
                    options.inScaled = false;
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(new e99(zae0Var, b2), null, options);
                        zae0Var.close();
                        exc = (Exception) u68Var.c;
                        if (exc == null) {
                            throw exc;
                        }
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                            if (z3 || i5 > 0) {
                                matrix = new Matrix();
                                width = bitmapDecodeStream.getWidth() / 2.0f;
                                height = bitmapDecodeStream.getHeight() / 2.0f;
                                if (z3) {
                                    matrix.postScale(-1.0f, 1.0f, width, height);
                                }
                                if (i5 > 0) {
                                    i = i5;
                                    matrix.postRotate(i, width, height);
                                } else {
                                    i = i5;
                                }
                                rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                matrix.mapRect(rectF);
                                f2 = rectF.left;
                                if (f2 == 0.0f || rectF.top != 0.0f) {
                                    matrix.postTranslate(-f2, -rectF.top);
                                }
                                if (i != 90 || i == 270) {
                                    int height2 = bitmapDecodeStream.getHeight();
                                    int width2 = bitmapDecodeStream.getWidth();
                                    config = bitmapDecodeStream.getConfig();
                                    if (config == null) {
                                        config = Bitmap.Config.ARGB_8888;
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config);
                                } else {
                                    int width3 = bitmapDecodeStream.getWidth();
                                    int height3 = bitmapDecodeStream.getHeight();
                                    Bitmap.Config config3 = bitmapDecodeStream.getConfig();
                                    if (config3 == null) {
                                        config3 = Bitmap.Config.ARGB_8888;
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config3);
                                }
                                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, xko.f41037a);
                                bitmapDecodeStream.recycle();
                                bitmapDecodeStream = bitmapCreateBitmap;
                            }
                            dyw dywVarR = c3x.r(new BitmapDrawable(context.getResources(), bitmapDecodeStream));
                            if (options.inSampleSize <= 1 || options.inScaled) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return new hkj(dywVarR, z);
                        }
                        jf4.n("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            bkb.E(zae0Var, th);
                            throw th2;
                        }
                    }
                } else {
                    int i8 = (i5 == 90 || i5 == 270) ? i2 : i7;
                    if (i5 != 90 && i5 != 270) {
                        i7 = i2;
                    }
                    f7k0 f7k0Var = a780Var.b;
                    j1h0 j1h0Var = a780Var.c;
                    kuo kuoVar2 = q1x.b;
                    long jZ = u1c.z(i8, i7, f7k0Var, j1h0Var, (f7k0) qbc.Q(a780Var, kuoVar2));
                    z3 = z3;
                    int i9 = (int) (jZ >> 32);
                    int i10 = (int) (jZ & 4294967295L);
                    int iHighestOneBit = Integer.highestOneBit(i8 / i9);
                    int iHighestOneBit2 = Integer.highestOneBit(i7 / i10);
                    int iOrdinal = j1h0Var.ordinal();
                    if (iOrdinal == 0) {
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                    } else if (iOrdinal == 1) {
                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                    } else {
                        t9f.b();
                    }
                    if (iMin < 1) {
                        iMin = 1;
                    }
                    options.inSampleSize = iMin;
                    i5 = i5;
                    double d = iMin;
                    double d2 = ((double) i8) / d;
                    double d3 = ((double) i7) / d;
                    double d4 = i9;
                    context = context;
                    f7k0 f7k0Var2 = (f7k0) qbc.Q(a780Var, kuoVar2);
                    double d5 = d4 / d2;
                    double d6 = ((double) i10) / d3;
                    int iOrdinal2 = j1h0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        dMax = Math.max(d5, d6);
                    } else if (iOrdinal2 == 1) {
                        dMax = Math.min(d5, d6);
                    } else {
                        t9f.b();
                    }
                    umk umkVar = f7k0Var2.f9062a;
                    if (umkVar instanceof rmk) {
                        double d7 = ((double) ((rmk) umkVar).f30747a) / d2;
                        if (dMax > d7) {
                            dMax = d7;
                        }
                    }
                    umk umkVar2 = f7k0Var2.b;
                    if (umkVar2 instanceof rmk) {
                        double d8 = ((double) ((rmk) umkVar2).f30747a) / d3;
                        if (dMax > d8) {
                            dMax = d8;
                        }
                    }
                    if (a780Var.d == asb0.b && dMax > 1.0d) {
                        dMax = 1.0d;
                    }
                    boolean z4 = dMax == 1.0d;
                    options.inScaled = !z4;
                    if (!z4) {
                        if (dMax > 1.0d) {
                            options.inDensity = si30.a(2.147483647E9d / dMax);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = si30.a(2.147483647E9d * dMax);
                        }
                    }
                    b2 = 1;
                    bitmapDecodeStream = BitmapFactory.decodeStream(new e99(zae0Var, b2), null, options);
                    zae0Var.close();
                    exc = (Exception) u68Var.c;
                    if (exc == null) {
                        throw exc;
                    }
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                        if (z3) {
                            matrix = new Matrix();
                            width = bitmapDecodeStream.getWidth() / 2.0f;
                            height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z3) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (i5 > 0) {
                                i = i5;
                                matrix.postRotate(i, width, height);
                            } else {
                                i = i5;
                            }
                            rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            f2 = rectF.left;
                            if (f2 == 0.0f) {
                                matrix.postTranslate(-f2, -rectF.top);
                            } else {
                                matrix.postTranslate(-f2, -rectF.top);
                            }
                            if (i != 90) {
                                int height4 = bitmapDecodeStream.getHeight();
                                int width4 = bitmapDecodeStream.getWidth();
                                config = bitmapDecodeStream.getConfig();
                                if (config == null) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height4, width4, config);
                            } else {
                                int height5 = bitmapDecodeStream.getHeight();
                                int width5 = bitmapDecodeStream.getWidth();
                                config = bitmapDecodeStream.getConfig();
                                if (config == null) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height5, width5, config);
                            }
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, xko.f41037a);
                            bitmapDecodeStream.recycle();
                            bitmapDecodeStream = bitmapCreateBitmap;
                        } else {
                            matrix = new Matrix();
                            width = bitmapDecodeStream.getWidth() / 2.0f;
                            height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z3) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (i5 > 0) {
                                i = i5;
                                matrix.postRotate(i, width, height);
                            } else {
                                i = i5;
                            }
                            rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            f2 = rectF.left;
                            if (f2 == 0.0f) {
                                matrix.postTranslate(-f2, -rectF.top);
                            } else {
                                matrix.postTranslate(-f2, -rectF.top);
                            }
                            if (i != 90) {
                                int height6 = bitmapDecodeStream.getHeight();
                                int width6 = bitmapDecodeStream.getWidth();
                                config = bitmapDecodeStream.getConfig();
                                if (config == null) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height6, width6, config);
                            } else {
                                int height7 = bitmapDecodeStream.getHeight();
                                int width7 = bitmapDecodeStream.getWidth();
                                config = bitmapDecodeStream.getConfig();
                                if (config == null) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height7, width7, config);
                            }
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, xko.f41037a);
                            bitmapDecodeStream.recycle();
                            bitmapDecodeStream = bitmapCreateBitmap;
                        }
                        dyw dywVarR2 = c3x.r(new BitmapDrawable(context.getResources(), bitmapDecodeStream));
                        if (options.inSampleSize <= 1) {
                            z = true;
                        } else {
                            z = true;
                        }
                        return new hkj(dywVarR2, z);
                    }
                    jf4.n("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                }
                return null;
        }
    }
}
