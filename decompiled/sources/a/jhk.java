package a;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.android.SystemUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jhk implements sbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16531a;

    public /* synthetic */ jhk(byte b) {
        this.f16531a = b;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:118:0x01db  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:133:0x022d  */
    /* JADX WARN: Code duplicated, block: B:136:0x023f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0245  */
    /* JADX WARN: Code duplicated, block: B:140:0x0250  */
    /* JADX WARN: Code duplicated, block: B:142:0x0254  */
    /* JADX WARN: Code duplicated, block: B:143:0x0256  */
    /* JADX WARN: Code duplicated, block: B:146:0x025f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0271  */
    /* JADX WARN: Code duplicated, block: B:151:0x027c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0289  */
    /* JADX WARN: Code duplicated, block: B:156:0x0298  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:174:0x02db  */
    /* JADX WARN: Code duplicated, block: B:177:0x02df  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:184:0x0305 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x0308  */
    /* JADX WARN: Code duplicated, block: B:188:0x0317 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0324  */
    /* JADX WARN: Code duplicated, block: B:196:0x0332  */
    /* JADX WARN: Code duplicated, block: B:214:0x0365  */
    /* JADX WARN: Code duplicated, block: B:217:0x036e  */
    /* JADX WARN: Code duplicated, block: B:220:0x0384  */
    /* JADX WARN: Code duplicated, block: B:223:0x0394  */
    /* JADX WARN: Code duplicated, block: B:225:0x039f  */
    /* JADX WARN: Code duplicated, block: B:227:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:228:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:231:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:234:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:243:0x03de  */
    /* JADX WARN: Code duplicated, block: B:246:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:249:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:252:0x0408  */
    /* JADX WARN: Code duplicated, block: B:255:0x0418  */
    /* JADX WARN: Code duplicated, block: B:257:0x0423  */
    /* JADX WARN: Code duplicated, block: B:259:0x043c  */
    /* JADX WARN: Code duplicated, block: B:260:0x043e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0447  */
    /* JADX WARN: Code duplicated, block: B:266:0x0457  */
    /* JADX WARN: Code duplicated, block: B:268:0x0462  */
    /* JADX WARN: Code duplicated, block: B:270:0x046a  */
    /* JADX WARN: Code duplicated, block: B:271:0x046c  */
    /* JADX WARN: Code duplicated, block: B:274:0x0475  */
    /* JADX WARN: Code duplicated, block: B:277:0x0483  */
    /* JADX WARN: Code duplicated, block: B:279:0x048e  */
    /* JADX WARN: Code duplicated, block: B:281:0x049e  */
    /* JADX WARN: Code duplicated, block: B:282:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:285:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:288:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:291:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:293:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:295:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:296:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:299:0x0507  */
    /* JADX WARN: Code duplicated, block: B:302:0x0518  */
    /* JADX WARN: Code duplicated, block: B:305:0x0528  */
    /* JADX WARN: Code duplicated, block: B:307:0x0533  */
    /* JADX WARN: Code duplicated, block: B:310:0x053c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0542  */
    /* JADX WARN: Code duplicated, block: B:314:0x054d  */
    /* JADX WARN: Code duplicated, block: B:320:0x0560  */
    /* JADX WARN: Code duplicated, block: B:323:0x057d  */
    /* JADX WARN: Code duplicated, block: B:326:0x058f  */
    /* JADX WARN: Code duplicated, block: B:338:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:348:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x013a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x0149  */
    /* JADX WARN: Code duplicated, block: B:79:0x0154  */
    /* JADX WARN: Code duplicated, block: B:81:0x015c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    /* JADX WARN: Code duplicated, block: B:86:0x016b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0176  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    @Override // a.sbe
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Set set;
        String lowerCase;
        String lowerCase2;
        boolean z7;
        String str;
        boolean z8;
        boolean z9;
        boolean z10;
        String str2;
        boolean z11;
        List list;
        String lowerCase3;
        boolean z12;
        boolean z13;
        String upperCase;
        boolean z14;
        List list2;
        String lowerCase4;
        List list3;
        String lowerCase5;
        boolean z15;
        boolean z16;
        Map map;
        String upperCase2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List list4;
        String lowerCase6;
        boolean z17;
        boolean z18;
        List list5;
        String lowerCase7;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        switch (this.f16531a) {
            case 0:
                hpd0 hpd0Var = (hpd0) obj;
                ArrayList arrayList = new ArrayList();
                String str20 = Build.BRAND;
                if (hpd0Var.a(ImageCaptureRotationOptionQuirk.class, (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str20) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || (SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str20) && "STK-LX1".equalsIgnoreCase(Build.MODEL)))) {
                    arrayList.add(new ImageCaptureRotationOptionQuirk());
                }
                if (hpd0Var.a(SurfaceOrderQuirk.class, true)) {
                    arrayList.add(new SurfaceOrderQuirk());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.f45333a;
                Locale locale = Locale.US;
                String upperCase3 = str20.toUpperCase(locale);
                String str21 = Build.MODEL;
                if (hpd0Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.f45333a.contains(Pair.create(upperCase3, str21.toUpperCase(locale))))) {
                    arrayList.add(new CaptureFailedRetryQuirk());
                }
                if (hpd0Var.a(LowMemoryQuirk.class, LowMemoryQuirk.f45337a.contains(str21.toUpperCase(locale)))) {
                    arrayList.add(new LowMemoryQuirk());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.f45336a;
                if (hpd0Var.a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str20) || ("Vivo".equalsIgnoreCase(str20) && LargeJpegImageQuirk.f45336a.contains(str21.toUpperCase(locale))))) {
                    arrayList.add(new LargeJpegImageQuirk());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.f45335a;
                if (hpd0Var.a(IncorrectJpegMetadataQuirk.class, "Samsung".equalsIgnoreCase(str20) && IncorrectJpegMetadataQuirk.f45335a.contains(Build.DEVICE.toUpperCase(locale)))) {
                    arrayList.add(new IncorrectJpegMetadataQuirk());
                }
                HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.f45334a;
                if (hpd0Var.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ("oneplus".equalsIgnoreCase(str20) && "cph2583".equalsIgnoreCase(str21)) || (Payload.SOURCE_GOOGLE.equalsIgnoreCase(str20) && ImageCaptureFailedForSpecificCombinationQuirk.f45334a.contains(str21.toLowerCase())))) {
                    arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
                }
                PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.f45338a;
                if (hpd0Var.a(PreviewGreenTintQuirk.class, "motorola".equalsIgnoreCase(str20) && "moto e20".equalsIgnoreCase(str21))) {
                    arrayList.add(previewGreenTintQuirk);
                }
                khk.f18297a = new kpd0(arrayList);
                l8x.U("DeviceQuirks", "core DeviceQuirks = ".concat(kpd0.d(khk.f18297a)));
                break;
            case 1:
                hpd0 hpd0Var2 = (hpd0) obj;
                ArrayList arrayList2 = new ArrayList();
                if (Build.VERSION.SDK_INT < 33) {
                    String str22 = Build.MANUFACTURER;
                    if ("SAMSUNG".equalsIgnoreCase(str22)) {
                        String str23 = Build.DEVICE;
                        if (!"F2Q".equalsIgnoreCase(str23) && !"Q2Q".equalsIgnoreCase(str23)) {
                            z = (!"OPPO".equalsIgnoreCase(str22) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) || ("LENOVO".equalsIgnoreCase(str22) && "Q706F".equalsIgnoreCase(Build.DEVICE));
                        }
                    } else if (!"OPPO".equalsIgnoreCase(str22)) {
                    }
                }
                if (hpd0Var2.a(SurfaceViewStretchedQuirk.class, z)) {
                    arrayList2.add(new SurfaceViewStretchedQuirk());
                }
                if (hpd0Var2.a(SurfaceViewNotCroppedByParentQuirk.class, "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL))) {
                    arrayList2.add(new SurfaceViewNotCroppedByParentQuirk());
                }
                lhk.f20060a = new kpd0(arrayList2);
                l8x.U("DeviceQuirks", "view DeviceQuirks = ".concat(kpd0.d(lhk.f20060a)));
                break;
            case 2:
                hpd0 hpd0Var3 = (hpd0) obj;
                hpd0Var3.getClass();
                ArrayList arrayList3 = new ArrayList();
                int i = PixelJpegRSupportedQuirk.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    bf5 bf5Var = (bf5) BackportedFixQuirk.f45332a.getValue();
                    wqy wqyVar = xqy.f41342a;
                    bf5Var.getClass();
                    wqyVar.getClass();
                    fnm0 fnm0Var = ((Boolean) wqyVar.d.invoke()).booleanValue() ? (wqyVar.c.contains(Build.FINGERPRINT) || ((Set) ((n0o0) bf5Var.f2485a.f27236a).getValue()).contains(5)) ? fnm0.f9845a : fnm0.c : fnm0.b;
                    int iOrdinal = fnm0Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1 || iOrdinal == 2) {
                            z2 = false;
                        } else if (iOrdinal != 3) {
                            t9f.b();
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (hpd0Var3.a(PixelJpegRSupportedQuirk.class, z2)) {
                    arrayList3.add(new PixelJpegRSupportedQuirk());
                }
                if (CloseCameraDeviceOnCameraGraphCloseQuirk.f45306a || CloseCameraDeviceOnCameraGraphCloseQuirk.b || (30 <= i2 && i2 < 34 && (lgb.a0("Oppo") || lgb.a0("OnePlus") || lgb.a0("Realme")))) {
                    z3 = true;
                } else {
                    String str24 = Build.MANUFACTURER;
                    str24.getClass();
                    if (str24.equalsIgnoreCase("Vivo")) {
                        z3 = true;
                    } else {
                        String str25 = Build.BRAND;
                        str25.getClass();
                        if (str25.equalsIgnoreCase("Vivo") || CloseCameraDeviceOnCameraGraphCloseQuirk.c || CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.d) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                }
                if (hpd0Var3.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z3)) {
                    arrayList3.add(new CloseCameraDeviceOnCameraGraphCloseQuirk());
                }
                List list6 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.f45307a;
                String str26 = Build.MODEL;
                str26.getClass();
                Locale locale2 = Locale.ROOT;
                String upperCase4 = str26.toUpperCase(locale2);
                upperCase4.getClass();
                if (hpd0Var3.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list6.contains(upperCase4))) {
                    arrayList3.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
                }
                String str27 = Build.MANUFACTURER;
                str27.getClass();
                if (!str27.equalsIgnoreCase("Jio")) {
                    String str28 = Build.BRAND;
                    str28.getClass();
                    if (str28.equalsIgnoreCase("Jio")) {
                        if (kotlin.text.c.x(str26, "LS1542QW", true)) {
                            if (!str27.equalsIgnoreCase("Samsung")) {
                                str19 = Build.BRAND;
                                str19.getClass();
                                if (!str19.equalsIgnoreCase("Samsung")) {
                                    if (!str27.equalsIgnoreCase("Vivo")) {
                                        str18 = Build.BRAND;
                                        str18.getClass();
                                        if (str18.equalsIgnoreCase("Vivo")) {
                                            if (str26.equalsIgnoreCase("VIVO 2039")) {
                                            }
                                        }
                                    } else if (str26.equalsIgnoreCase("VIVO 2039")) {
                                    }
                                    z4 = false;
                                } else if (kotlin.text.c.x(str26, "SM-A025", true) && !str26.equalsIgnoreCase("SM-S124DL")) {
                                    if (!str27.equalsIgnoreCase("Vivo")) {
                                        str18 = Build.BRAND;
                                        str18.getClass();
                                        if (str18.equalsIgnoreCase("Vivo")) {
                                            if (str26.equalsIgnoreCase("VIVO 2039")) {
                                            }
                                        }
                                    } else if (str26.equalsIgnoreCase("VIVO 2039")) {
                                    }
                                    z4 = false;
                                }
                            } else if (kotlin.text.c.x(str26, "SM-A025", true)) {
                            }
                        }
                    } else if (!str27.equalsIgnoreCase("Samsung")) {
                        str19 = Build.BRAND;
                        str19.getClass();
                        if (!str19.equalsIgnoreCase("Samsung")) {
                            if (!str27.equalsIgnoreCase("Vivo")) {
                                str18 = Build.BRAND;
                                str18.getClass();
                                if (str18.equalsIgnoreCase("Vivo")) {
                                    if (str26.equalsIgnoreCase("VIVO 2039")) {
                                    }
                                }
                            } else if (str26.equalsIgnoreCase("VIVO 2039")) {
                            }
                            z4 = false;
                        } else if (kotlin.text.c.x(str26, "SM-A025", true)) {
                        }
                    } else if (kotlin.text.c.x(str26, "SM-A025", true)) {
                    }
                    if (hpd0Var3.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z4)) {
                        arrayList3.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                    }
                    boolean z19 = DisableAbortCapturesOnStopQuirk.f45308a;
                    if (str27.equalsIgnoreCase("Tecno")) {
                        z5 = true;
                    } else {
                        str17 = Build.BRAND;
                        str17.getClass();
                        if (!str17.equalsIgnoreCase("Tecno") || str27.equalsIgnoreCase("Tecno-mobile") || str17.equalsIgnoreCase("Tecno-mobile") || DisableAbortCapturesOnStopQuirk.f45308a || DisableAbortCapturesOnStopQuirk.b) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    if (hpd0Var3.a(DisableAbortCapturesOnStopQuirk.class, z5)) {
                        arrayList3.add(new DisableAbortCapturesOnStopQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        z6 = true;
                    } else {
                        str16 = Build.BRAND;
                        str16.getClass();
                        if (!str16.equalsIgnoreCase("Samsung") || str27.equalsIgnoreCase("Xiaomi") || str16.equalsIgnoreCase("Xiaomi")) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    if (hpd0Var3.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z6)) {
                        arrayList3.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                    }
                    set = FlashAvailabilityBufferUnderflowQuirk.f45311a;
                    Locale locale3 = Locale.US;
                    locale3.getClass();
                    lowerCase = str27.toLowerCase(locale3);
                    lowerCase.getClass();
                    lowerCase2 = str26.toLowerCase(locale3);
                    lowerCase2.getClass();
                    if (hpd0Var3.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new ojq(lowerCase, lowerCase2)))) {
                        arrayList3.add(new FlashAvailabilityBufferUnderflowQuirk());
                    }
                    if (!ImageCapturePixelHDRPlusQuirk.f45316a.contains(str26)) {
                        z7 = false;
                    } else if (!str27.equalsIgnoreCase("Google")) {
                        str15 = Build.BRAND;
                        str15.getClass();
                        if (!str15.equalsIgnoreCase("Google")) {
                            z7 = false;
                        } else if (i2 >= 26) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else if (i2 >= 26) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (hpd0Var3.a(ImageCapturePixelHDRPlusQuirk.class, z7)) {
                        arrayList3.add(new ImageCapturePixelHDRPlusQuirk());
                    }
                    List list7 = InvalidVideoProfilesQuirk.f45319a;
                    if (!str27.equalsIgnoreCase("Samsung")) {
                        str14 = Build.BRAND;
                        str14.getClass();
                        if (str14.equalsIgnoreCase("Samsung")) {
                            str = Build.ID;
                            str.getClass();
                            if (kotlin.text.c.x(str, "TP1A", true)) {
                                list4 = InvalidVideoProfilesQuirk.f45319a;
                                lowerCase6 = str26.toLowerCase(locale2);
                                lowerCase6.getClass();
                                if (list4.contains(lowerCase6)) {
                                    str13 = Build.ID;
                                    str13.getClass();
                                    if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                        str13.getClass();
                                        if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                            if (str27.equalsIgnoreCase("Redmi")) {
                                                z17 = true;
                                            } else {
                                                str12 = Build.BRAND;
                                                str12.getClass();
                                                if (str12.equalsIgnoreCase("Redmi")) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                            }
                                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                                z18 = true;
                                            } else {
                                                str11 = Build.BRAND;
                                                str11.getClass();
                                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                            }
                                            if (z17 || z18) {
                                                str10 = Build.ID;
                                                str10.getClass();
                                                if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                                    str10.getClass();
                                                    if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                        list5 = InvalidVideoProfilesQuirk.c;
                                                        lowerCase7 = str26.toLowerCase(locale2);
                                                        lowerCase7.getClass();
                                                        if (list5.contains(lowerCase7) || i2 != 33) {
                                                            List list8 = InvalidVideoProfilesQuirk.b;
                                                            String lowerCase8 = str26.toLowerCase(locale2);
                                                            lowerCase8.getClass();
                                                            z8 = !list8.contains(lowerCase8) && i2 == 33;
                                                        }
                                                    }
                                                }
                                            } else {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list9 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase9 = str26.toLowerCase(locale2);
                                                    lowerCase9.getClass();
                                                    if (list9.contains(lowerCase9)) {
                                                    }
                                                } else {
                                                    List list10 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase10 = str26.toLowerCase(locale2);
                                                    lowerCase10.getClass();
                                                    if (list10.contains(lowerCase10)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                            str10.getClass();
                                            if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list11 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11 = str26.toLowerCase(locale2);
                                                    lowerCase11.getClass();
                                                    if (list11.contains(lowerCase11)) {
                                                    }
                                                } else {
                                                    List list12 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase12 = str26.toLowerCase(locale2);
                                                    lowerCase12.getClass();
                                                    if (list12.contains(lowerCase12)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list13 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase13 = str26.toLowerCase(locale2);
                                            lowerCase13.getClass();
                                            if (list13.contains(lowerCase13)) {
                                            }
                                        } else {
                                            List list14 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase14 = str26.toLowerCase(locale2);
                                            lowerCase14.getClass();
                                            if (list14.contains(lowerCase14)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            list4 = InvalidVideoProfilesQuirk.f45319a;
                            lowerCase6 = str26.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                        if (str27.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                        if (str27.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                        } else {
                                            z18 = true;
                                        }
                                        if (z17 || z18) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str26.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list15 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase15 = str26.toLowerCase(locale2);
                                                        lowerCase15.getClass();
                                                        if (list15.contains(lowerCase15)) {
                                                        }
                                                    } else {
                                                        List list16 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase16 = str26.toLowerCase(locale2);
                                                        lowerCase16.getClass();
                                                        if (list16.contains(lowerCase16)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list17 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase17 = str26.toLowerCase(locale2);
                                                lowerCase17.getClass();
                                                if (list17.contains(lowerCase17)) {
                                                }
                                            } else {
                                                List list18 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase18 = str26.toLowerCase(locale2);
                                                lowerCase18.getClass();
                                                if (list18.contains(lowerCase18)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (kotlin.text.c.x(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list19 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase19 = str26.toLowerCase(locale2);
                                                lowerCase19.getClass();
                                                if (list19.contains(lowerCase19)) {
                                                }
                                            } else {
                                                List list110 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase110 = str26.toLowerCase(locale2);
                                                lowerCase110.getClass();
                                                if (list110.contains(lowerCase110)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list111 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase111 = str26.toLowerCase(locale2);
                                        lowerCase111.getClass();
                                        if (list111.contains(lowerCase111)) {
                                        }
                                    } else {
                                        List list112 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase112 = str26.toLowerCase(locale2);
                                        lowerCase112.getClass();
                                        if (list112.contains(lowerCase112)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                            arrayList3.add(new InvalidVideoProfilesQuirk());
                        }
                        if (!lmc.O() || lmc.P() || lmc.M() || lmc.T() || lmc.S() || lmc.Q() || lmc.R() || lmc.N() || lmc.U()) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                            arrayList3.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.f45309a;
                        if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                            arrayList3.add(new ExtraCroppingQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z10 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                            arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        sln0 sln0Var = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                        str2 = Build.DEVICE;
                        if (!"heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2) || mbc.c0() || mbc.d0()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                            arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        List list20 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                        if (!str27.equalsIgnoreCase("Google")) {
                            String str29 = Build.BRAND;
                            str29.getClass();
                            str29.equalsIgnoreCase("Google");
                        }
                        if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list21 = PreviewPixelHDRnetQuirk.f45323a;
                        if (str27.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.f45323a;
                            str2.getClass();
                            Locale locale4 = Locale.getDefault();
                            locale4.getClass();
                            lowerCase3 = str2.toLowerCase(locale4);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.f45323a;
                                str2.getClass();
                                Locale locale5 = Locale.getDefault();
                                locale5.getClass();
                                lowerCase3 = str2.toLowerCase(locale5);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else {
                                z12 = false;
                            }
                        }
                        if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                            arrayList3.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z13 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str26)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                            arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str27.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str26.toUpperCase(locale2);
                                upperCase.getClass();
                                if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        }
                        if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                            arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                        lowerCase4 = str26.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list22 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        if (str27.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                            String str30 = Build.HARDWARE;
                            str30.getClass();
                            Locale locale6 = Locale.getDefault();
                            locale6.getClass();
                            lowerCase5 = str30.toLowerCase(locale6);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                                String str31 = Build.HARDWARE;
                                str31.getClass();
                                Locale locale7 = Locale.getDefault();
                                locale7.getClass();
                                lowerCase5 = str31.toLowerCase(locale7);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = false;
                            }
                        }
                        if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                            arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list23 = ZslDisablerQuirk.f45330a;
                        if (!str27.equalsIgnoreCase("Samsung")) {
                            str4 = Build.BRAND;
                            str4.getClass();
                            if (!str4.equalsIgnoreCase("Samsung")) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.f45325a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                            }
                            mhk.f21798a = new kpd0(arrayList3);
                            l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                        } else {
                            if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.f45325a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                            }
                            mhk.f21798a = new kpd0(arrayList3);
                            l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                        }
                        z16 = true;
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    } else {
                        str = Build.ID;
                        str.getClass();
                        if (kotlin.text.c.x(str, "TP1A", true)) {
                            list4 = InvalidVideoProfilesQuirk.f45319a;
                            lowerCase6 = str26.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                        if (str27.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                        if (str27.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                        } else {
                                            z18 = true;
                                        }
                                        if (z17 || z18) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str26.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list113 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase113 = str26.toLowerCase(locale2);
                                                        lowerCase113.getClass();
                                                        if (list113.contains(lowerCase113)) {
                                                        }
                                                    } else {
                                                        List list114 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase114 = str26.toLowerCase(locale2);
                                                        lowerCase114.getClass();
                                                        if (list114.contains(lowerCase114)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list115 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase115 = str26.toLowerCase(locale2);
                                                lowerCase115.getClass();
                                                if (list115.contains(lowerCase115)) {
                                                }
                                            } else {
                                                List list116 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase116 = str26.toLowerCase(locale2);
                                                lowerCase116.getClass();
                                                if (list116.contains(lowerCase116)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (kotlin.text.c.x(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list117 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase117 = str26.toLowerCase(locale2);
                                                lowerCase117.getClass();
                                                if (list117.contains(lowerCase117)) {
                                                }
                                            } else {
                                                List list118 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase118 = str26.toLowerCase(locale2);
                                                lowerCase118.getClass();
                                                if (list118.contains(lowerCase118)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list119 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase119 = str26.toLowerCase(locale2);
                                        lowerCase119.getClass();
                                        if (list119.contains(lowerCase119)) {
                                        }
                                    } else {
                                        List list1110 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase1110 = str26.toLowerCase(locale2);
                                        lowerCase1110.getClass();
                                        if (list1110.contains(lowerCase1110)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                            arrayList3.add(new InvalidVideoProfilesQuirk());
                        }
                        if (lmc.O()) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                            arrayList3.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap2 = ExtraCroppingQuirk.f45309a;
                        if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                            arrayList3.add(new ExtraCroppingQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z10 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                            arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        sln0 sln0Var2 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                        str2 = Build.DEVICE;
                        if ("heroqltevzw".equalsIgnoreCase(str2)) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                            arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        List list24 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                        if (!str27.equalsIgnoreCase("Google")) {
                            String str210 = Build.BRAND;
                            str210.getClass();
                            str210.equalsIgnoreCase("Google");
                        }
                        if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list25 = PreviewPixelHDRnetQuirk.f45323a;
                        if (str27.equalsIgnoreCase("Google")) {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.f45323a;
                                str2.getClass();
                                Locale locale8 = Locale.getDefault();
                                locale8.getClass();
                                lowerCase3 = str2.toLowerCase(locale8);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else {
                                z12 = false;
                            }
                        } else {
                            list = PreviewPixelHDRnetQuirk.f45323a;
                            str2.getClass();
                            Locale locale9 = Locale.getDefault();
                            locale9.getClass();
                            lowerCase3 = str2.toLowerCase(locale9);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                            arrayList3.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z13 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str26)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                            arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str27.equalsIgnoreCase("Samsung")) {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str26.toUpperCase(locale2);
                                upperCase.getClass();
                                if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        } else {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                            arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                        lowerCase4 = str26.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list26 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        if (str27.equalsIgnoreCase("Samsung")) {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                                String str32 = Build.HARDWARE;
                                str32.getClass();
                                Locale locale10 = Locale.getDefault();
                                locale10.getClass();
                                lowerCase5 = str32.toLowerCase(locale10);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = false;
                            }
                        } else {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                            String str33 = Build.HARDWARE;
                            str33.getClass();
                            Locale locale11 = Locale.getDefault();
                            locale11.getClass();
                            lowerCase5 = str33.toLowerCase(locale11);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                            arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list27 = ZslDisablerQuirk.f45330a;
                        if (!str27.equalsIgnoreCase("Samsung")) {
                            if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.f45325a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                            }
                            mhk.f21798a = new kpd0(arrayList3);
                            l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                        } else {
                            str4 = Build.BRAND;
                            str4.getClass();
                            if (!str4.equalsIgnoreCase("Samsung")) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.f45325a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                            }
                            mhk.f21798a = new kpd0(arrayList3);
                            l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                        }
                        z16 = true;
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    }
                    if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                        arrayList3.add(new InvalidVideoProfilesQuirk());
                    }
                    if (lmc.O()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                        arrayList3.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap3 = ExtraCroppingQuirk.f45309a;
                    if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                        arrayList3.add(new ExtraCroppingQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z10 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                        arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    sln0 sln0Var3 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                        arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    List list28 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                    if (!str27.equalsIgnoreCase("Google")) {
                        String str211 = Build.BRAND;
                        str211.getClass();
                        str211.equalsIgnoreCase("Google");
                    }
                    if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list29 = PreviewPixelHDRnetQuirk.f45323a;
                    if (str27.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.f45323a;
                            str2.getClass();
                            Locale locale12 = Locale.getDefault();
                            locale12.getClass();
                            lowerCase3 = str2.toLowerCase(locale12);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.f45323a;
                        str2.getClass();
                        Locale locale13 = Locale.getDefault();
                        locale13.getClass();
                        lowerCase3 = str2.toLowerCase(locale13);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                        arrayList3.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z13 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                        arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                        arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                    lowerCase4 = str26.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list210 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                            String str34 = Build.HARDWARE;
                            str34.getClass();
                            Locale locale14 = Locale.getDefault();
                            locale14.getClass();
                            lowerCase5 = str34.toLowerCase(locale14);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        String str35 = Build.HARDWARE;
                        str35.getClass();
                        Locale locale15 = Locale.getDefault();
                        locale15.getClass();
                        lowerCase5 = str35.toLowerCase(locale15);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                        arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list211 = ZslDisablerQuirk.f45330a;
                    if (!str27.equalsIgnoreCase("Samsung")) {
                        if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    } else {
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (!str4.equalsIgnoreCase("Samsung")) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    }
                    z16 = true;
                    if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.f45325a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                    }
                    mhk.f21798a = new kpd0(arrayList3);
                    l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                } else {
                    if (kotlin.text.c.x(str26, "LS1542QW", true)) {
                        if (!str27.equalsIgnoreCase("Samsung")) {
                            str19 = Build.BRAND;
                            str19.getClass();
                            if (!str19.equalsIgnoreCase("Samsung")) {
                                if (!str27.equalsIgnoreCase("Vivo")) {
                                    str18 = Build.BRAND;
                                    str18.getClass();
                                    if (str18.equalsIgnoreCase("Vivo")) {
                                        if (str26.equalsIgnoreCase("VIVO 2039")) {
                                        }
                                    }
                                } else if (str26.equalsIgnoreCase("VIVO 2039")) {
                                }
                                z4 = false;
                            } else if (kotlin.text.c.x(str26, "SM-A025", true)) {
                            }
                        } else if (kotlin.text.c.x(str26, "SM-A025", true)) {
                        }
                    }
                    if (hpd0Var3.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z4)) {
                        arrayList3.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                    }
                    boolean z110 = DisableAbortCapturesOnStopQuirk.f45308a;
                    if (str27.equalsIgnoreCase("Tecno")) {
                        str17 = Build.BRAND;
                        str17.getClass();
                        if (!str17.equalsIgnoreCase("Tecno")) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z5 = true;
                    }
                    if (hpd0Var3.a(DisableAbortCapturesOnStopQuirk.class, z5)) {
                        arrayList3.add(new DisableAbortCapturesOnStopQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str16 = Build.BRAND;
                        str16.getClass();
                        if (!str16.equalsIgnoreCase("Samsung")) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } else {
                        z6 = true;
                    }
                    if (hpd0Var3.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z6)) {
                        arrayList3.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                    }
                    set = FlashAvailabilityBufferUnderflowQuirk.f45311a;
                    Locale locale16 = Locale.US;
                    locale16.getClass();
                    lowerCase = str27.toLowerCase(locale16);
                    lowerCase.getClass();
                    lowerCase2 = str26.toLowerCase(locale16);
                    lowerCase2.getClass();
                    if (hpd0Var3.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new ojq(lowerCase, lowerCase2)))) {
                        arrayList3.add(new FlashAvailabilityBufferUnderflowQuirk());
                    }
                    if (!ImageCapturePixelHDRPlusQuirk.f45316a.contains(str26)) {
                        z7 = false;
                    } else if (!str27.equalsIgnoreCase("Google")) {
                        str15 = Build.BRAND;
                        str15.getClass();
                        if (!str15.equalsIgnoreCase("Google")) {
                            z7 = false;
                        } else if (i2 >= 26) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else if (i2 >= 26) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (hpd0Var3.a(ImageCapturePixelHDRPlusQuirk.class, z7)) {
                        arrayList3.add(new ImageCapturePixelHDRPlusQuirk());
                    }
                    List list30 = InvalidVideoProfilesQuirk.f45319a;
                    if (!str27.equalsIgnoreCase("Samsung")) {
                        str = Build.ID;
                        str.getClass();
                        if (kotlin.text.c.x(str, "TP1A", true)) {
                            list4 = InvalidVideoProfilesQuirk.f45319a;
                            lowerCase6 = str26.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                        if (str27.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                        if (str27.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                        } else {
                                            z18 = true;
                                        }
                                        if (z17 || z18) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str26.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list1111 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase1111 = str26.toLowerCase(locale2);
                                                        lowerCase1111.getClass();
                                                        if (list1111.contains(lowerCase1111)) {
                                                        }
                                                    } else {
                                                        List list1112 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase1112 = str26.toLowerCase(locale2);
                                                        lowerCase1112.getClass();
                                                        if (list1112.contains(lowerCase1112)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list1113 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1113 = str26.toLowerCase(locale2);
                                                lowerCase1113.getClass();
                                                if (list1113.contains(lowerCase1113)) {
                                                }
                                            } else {
                                                List list1114 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1114 = str26.toLowerCase(locale2);
                                                lowerCase1114.getClass();
                                                if (list1114.contains(lowerCase1114)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (kotlin.text.c.x(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list1115 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1115 = str26.toLowerCase(locale2);
                                                lowerCase1115.getClass();
                                                if (list1115.contains(lowerCase1115)) {
                                                }
                                            } else {
                                                List list1116 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1116 = str26.toLowerCase(locale2);
                                                lowerCase1116.getClass();
                                                if (list1116.contains(lowerCase1116)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list1117 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase1117 = str26.toLowerCase(locale2);
                                        lowerCase1117.getClass();
                                        if (list1117.contains(lowerCase1117)) {
                                        }
                                    } else {
                                        List list1118 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase1118 = str26.toLowerCase(locale2);
                                        lowerCase1118.getClass();
                                        if (list1118.contains(lowerCase1118)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                            arrayList3.add(new InvalidVideoProfilesQuirk());
                        }
                        if (lmc.O()) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                            arrayList3.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap4 = ExtraCroppingQuirk.f45309a;
                        if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                            arrayList3.add(new ExtraCroppingQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z10 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                            arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        sln0 sln0Var4 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                        str2 = Build.DEVICE;
                        if ("heroqltevzw".equalsIgnoreCase(str2)) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                            arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        List list212 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                        if (!str27.equalsIgnoreCase("Google")) {
                            String str212 = Build.BRAND;
                            str212.getClass();
                            str212.equalsIgnoreCase("Google");
                        }
                        if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list213 = PreviewPixelHDRnetQuirk.f45323a;
                        if (str27.equalsIgnoreCase("Google")) {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.f45323a;
                                str2.getClass();
                                Locale locale17 = Locale.getDefault();
                                locale17.getClass();
                                lowerCase3 = str2.toLowerCase(locale17);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else {
                                z12 = false;
                            }
                        } else {
                            list = PreviewPixelHDRnetQuirk.f45323a;
                            str2.getClass();
                            Locale locale18 = Locale.getDefault();
                            locale18.getClass();
                            lowerCase3 = str2.toLowerCase(locale18);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                            arrayList3.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z13 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str26)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                            arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str27.equalsIgnoreCase("Samsung")) {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str26.toUpperCase(locale2);
                                upperCase.getClass();
                                if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        } else {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                            arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                        lowerCase4 = str26.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list214 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        if (str27.equalsIgnoreCase("Samsung")) {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                                String str36 = Build.HARDWARE;
                                str36.getClass();
                                Locale locale19 = Locale.getDefault();
                                locale19.getClass();
                                lowerCase5 = str36.toLowerCase(locale19);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = false;
                            }
                        } else {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                            String str37 = Build.HARDWARE;
                            str37.getClass();
                            Locale locale110 = Locale.getDefault();
                            locale110.getClass();
                            lowerCase5 = str37.toLowerCase(locale110);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                            arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list215 = ZslDisablerQuirk.f45330a;
                        if (!str27.equalsIgnoreCase("Samsung")) {
                            if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.f45325a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                            }
                            mhk.f21798a = new kpd0(arrayList3);
                            l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                        } else {
                            str4 = Build.BRAND;
                            str4.getClass();
                            if (!str4.equalsIgnoreCase("Samsung")) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.f45325a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                            }
                            mhk.f21798a = new kpd0(arrayList3);
                            l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                        }
                        z16 = true;
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    } else {
                        str14 = Build.BRAND;
                        str14.getClass();
                        if (str14.equalsIgnoreCase("Samsung")) {
                            str = Build.ID;
                            str.getClass();
                            if (kotlin.text.c.x(str, "TP1A", true)) {
                                list4 = InvalidVideoProfilesQuirk.f45319a;
                                lowerCase6 = str26.toLowerCase(locale2);
                                lowerCase6.getClass();
                                if (list4.contains(lowerCase6)) {
                                    str13 = Build.ID;
                                    str13.getClass();
                                    if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                        str13.getClass();
                                        if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                            if (str27.equalsIgnoreCase("Redmi")) {
                                                str12 = Build.BRAND;
                                                str12.getClass();
                                                if (str12.equalsIgnoreCase("Redmi")) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                            } else {
                                                z17 = true;
                                            }
                                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                                str11 = Build.BRAND;
                                                str11.getClass();
                                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                            } else {
                                                z18 = true;
                                            }
                                            if (z17 || z18) {
                                                str10 = Build.ID;
                                                str10.getClass();
                                                if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                                    str10.getClass();
                                                    if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                        list5 = InvalidVideoProfilesQuirk.c;
                                                        lowerCase7 = str26.toLowerCase(locale2);
                                                        lowerCase7.getClass();
                                                        if (list5.contains(lowerCase7)) {
                                                            List list1119 = InvalidVideoProfilesQuirk.b;
                                                            String lowerCase1119 = str26.toLowerCase(locale2);
                                                            lowerCase1119.getClass();
                                                            if (list1119.contains(lowerCase1119)) {
                                                            }
                                                        } else {
                                                            List list11110 = InvalidVideoProfilesQuirk.b;
                                                            String lowerCase11110 = str26.toLowerCase(locale2);
                                                            lowerCase11110.getClass();
                                                            if (list11110.contains(lowerCase11110)) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list11111 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11111 = str26.toLowerCase(locale2);
                                                    lowerCase11111.getClass();
                                                    if (list11111.contains(lowerCase11111)) {
                                                    }
                                                } else {
                                                    List list11112 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11112 = str26.toLowerCase(locale2);
                                                    lowerCase11112.getClass();
                                                    if (list11112.contains(lowerCase11112)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                            str10.getClass();
                                            if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list11113 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11113 = str26.toLowerCase(locale2);
                                                    lowerCase11113.getClass();
                                                    if (list11113.contains(lowerCase11113)) {
                                                    }
                                                } else {
                                                    List list11114 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11114 = str26.toLowerCase(locale2);
                                                    lowerCase11114.getClass();
                                                    if (list11114.contains(lowerCase11114)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list11115 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11115 = str26.toLowerCase(locale2);
                                            lowerCase11115.getClass();
                                            if (list11115.contains(lowerCase11115)) {
                                            }
                                        } else {
                                            List list11116 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11116 = str26.toLowerCase(locale2);
                                            lowerCase11116.getClass();
                                            if (list11116.contains(lowerCase11116)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            list4 = InvalidVideoProfilesQuirk.f45319a;
                            lowerCase6 = str26.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                        if (str27.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                        if (str27.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                        } else {
                                            z18 = true;
                                        }
                                        if (z17 || z18) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str26.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list11117 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase11117 = str26.toLowerCase(locale2);
                                                        lowerCase11117.getClass();
                                                        if (list11117.contains(lowerCase11117)) {
                                                        }
                                                    } else {
                                                        List list11118 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase11118 = str26.toLowerCase(locale2);
                                                        lowerCase11118.getClass();
                                                        if (list11118.contains(lowerCase11118)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list11119 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase11119 = str26.toLowerCase(locale2);
                                                lowerCase11119.getClass();
                                                if (list11119.contains(lowerCase11119)) {
                                                }
                                            } else {
                                                List list111110 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase111110 = str26.toLowerCase(locale2);
                                                lowerCase111110.getClass();
                                                if (list111110.contains(lowerCase111110)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (kotlin.text.c.x(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list111111 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase111111 = str26.toLowerCase(locale2);
                                                lowerCase111111.getClass();
                                                if (list111111.contains(lowerCase111111)) {
                                                }
                                            } else {
                                                List list111112 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase111112 = str26.toLowerCase(locale2);
                                                lowerCase111112.getClass();
                                                if (list111112.contains(lowerCase111112)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list111113 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase111113 = str26.toLowerCase(locale2);
                                        lowerCase111113.getClass();
                                        if (list111113.contains(lowerCase111113)) {
                                        }
                                    } else {
                                        List list111114 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase111114 = str26.toLowerCase(locale2);
                                        lowerCase111114.getClass();
                                        if (list111114.contains(lowerCase111114)) {
                                        }
                                    }
                                }
                            }
                        }
                        if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                            arrayList3.add(new InvalidVideoProfilesQuirk());
                        }
                        if (lmc.O()) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                            arrayList3.add(new ExcludedSupportedSizesQuirk());
                        }
                        LinkedHashMap linkedHashMap5 = ExtraCroppingQuirk.f45309a;
                        if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                            arrayList3.add(new ExtraCroppingQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Motorola")) {
                            str9 = Build.BRAND;
                            str9.getClass();
                            if (!str9.equalsIgnoreCase("Motorola")) {
                                z10 = false;
                            } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                            arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                        }
                        sln0 sln0Var5 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                        str2 = Build.DEVICE;
                        if ("heroqltevzw".equalsIgnoreCase(str2)) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                            arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                        }
                        List list216 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                        if (!str27.equalsIgnoreCase("Google")) {
                            String str213 = Build.BRAND;
                            str213.getClass();
                            str213.equalsIgnoreCase("Google");
                        }
                        if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                            arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                        }
                        List list217 = PreviewPixelHDRnetQuirk.f45323a;
                        if (str27.equalsIgnoreCase("Google")) {
                            str8 = Build.BRAND;
                            str8.getClass();
                            if (str8.equalsIgnoreCase("Google")) {
                                list = PreviewPixelHDRnetQuirk.f45323a;
                                str2.getClass();
                                Locale locale111 = Locale.getDefault();
                                locale111.getClass();
                                lowerCase3 = str2.toLowerCase(locale111);
                                lowerCase3.getClass();
                                if (list.contains(lowerCase3)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else {
                                z12 = false;
                            }
                        } else {
                            list = PreviewPixelHDRnetQuirk.f45323a;
                            str2.getClass();
                            Locale locale112 = Locale.getDefault();
                            locale112.getClass();
                            lowerCase3 = str2.toLowerCase(locale112);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                            arrayList3.add(new PreviewPixelHDRnetQuirk());
                        }
                        if (!str27.equalsIgnoreCase("Huawei")) {
                            str7 = Build.BRAND;
                            str7.getClass();
                            if (!str7.equalsIgnoreCase("Huawei")) {
                                z13 = false;
                            } else if ("mha-l29".equalsIgnoreCase(str26)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                            arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                        }
                        if (str27.equalsIgnoreCase("Samsung")) {
                            str6 = Build.BRAND;
                            str6.getClass();
                            if (str6.equalsIgnoreCase("Samsung")) {
                                upperCase = str26.toUpperCase(locale2);
                                upperCase.getClass();
                                if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            } else {
                                z14 = false;
                            }
                        } else {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                            arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                        }
                        list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                        lowerCase4 = str26.toLowerCase(locale2);
                        lowerCase4.getClass();
                        if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                            arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                        }
                        List list218 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        if (str27.equalsIgnoreCase("Samsung")) {
                            str5 = Build.BRAND;
                            str5.getClass();
                            if (str5.equalsIgnoreCase("Samsung")) {
                                list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                                String str38 = Build.HARDWARE;
                                str38.getClass();
                                Locale locale113 = Locale.getDefault();
                                locale113.getClass();
                                lowerCase5 = str38.toLowerCase(locale113);
                                lowerCase5.getClass();
                                if (list3.contains(lowerCase5)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = false;
                            }
                        } else {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                            String str39 = Build.HARDWARE;
                            str39.getClass();
                            Locale locale114 = Locale.getDefault();
                            locale114.getClass();
                            lowerCase5 = str39.toLowerCase(locale114);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                            arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                        }
                        if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                            arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                        }
                        List list219 = ZslDisablerQuirk.f45330a;
                        if (!str27.equalsIgnoreCase("Samsung")) {
                            if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.f45325a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                            }
                            mhk.f21798a = new kpd0(arrayList3);
                            l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                        } else {
                            str4 = Build.BRAND;
                            str4.getClass();
                            if (!str4.equalsIgnoreCase("Samsung")) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                                if (!str27.equalsIgnoreCase("Xiaomi")) {
                                    str3 = Build.BRAND;
                                    str3.getClass();
                                    if (str3.equalsIgnoreCase("Xiaomi")) {
                                        if (n8n0.i(ZslDisablerQuirk.b)) {
                                        }
                                    }
                                } else if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                                z16 = false;
                            }
                            if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                                arrayList3.add(new ZslDisablerQuirk());
                            }
                            map = SmallDisplaySizeQuirk.f45325a;
                            upperCase2 = str26.toUpperCase(locale2);
                            upperCase2.getClass();
                            if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                                arrayList3.add(new SmallDisplaySizeQuirk());
                            }
                            if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                                arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                            }
                            mhk.f21798a = new kpd0(arrayList3);
                            l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                        }
                        z16 = true;
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    }
                    if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                        arrayList3.add(new InvalidVideoProfilesQuirk());
                    }
                    if (lmc.O()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                        arrayList3.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap6 = ExtraCroppingQuirk.f45309a;
                    if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                        arrayList3.add(new ExtraCroppingQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z10 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                        arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    sln0 sln0Var6 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                        arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    List list2110 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                    if (!str27.equalsIgnoreCase("Google")) {
                        String str214 = Build.BRAND;
                        str214.getClass();
                        str214.equalsIgnoreCase("Google");
                    }
                    if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list2111 = PreviewPixelHDRnetQuirk.f45323a;
                    if (str27.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.f45323a;
                            str2.getClass();
                            Locale locale115 = Locale.getDefault();
                            locale115.getClass();
                            lowerCase3 = str2.toLowerCase(locale115);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.f45323a;
                        str2.getClass();
                        Locale locale116 = Locale.getDefault();
                        locale116.getClass();
                        lowerCase3 = str2.toLowerCase(locale116);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                        arrayList3.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z13 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                        arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                        arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                    lowerCase4 = str26.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list2112 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                            String str310 = Build.HARDWARE;
                            str310.getClass();
                            Locale locale117 = Locale.getDefault();
                            locale117.getClass();
                            lowerCase5 = str310.toLowerCase(locale117);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        String str311 = Build.HARDWARE;
                        str311.getClass();
                        Locale locale118 = Locale.getDefault();
                        locale118.getClass();
                        lowerCase5 = str311.toLowerCase(locale118);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                        arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list2113 = ZslDisablerQuirk.f45330a;
                    if (!str27.equalsIgnoreCase("Samsung")) {
                        if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    } else {
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (!str4.equalsIgnoreCase("Samsung")) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    }
                    z16 = true;
                    if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.f45325a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                    }
                    mhk.f21798a = new kpd0(arrayList3);
                    l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                }
                z4 = true;
                if (hpd0Var3.a(ControlZoomRatioRangeAssertionErrorQuirk.class, z4)) {
                    arrayList3.add(new ControlZoomRatioRangeAssertionErrorQuirk());
                }
                boolean z111 = DisableAbortCapturesOnStopQuirk.f45308a;
                if (str27.equalsIgnoreCase("Tecno")) {
                    str17 = Build.BRAND;
                    str17.getClass();
                    if (!str17.equalsIgnoreCase("Tecno")) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = true;
                }
                if (hpd0Var3.a(DisableAbortCapturesOnStopQuirk.class, z5)) {
                    arrayList3.add(new DisableAbortCapturesOnStopQuirk());
                }
                if (str27.equalsIgnoreCase("Samsung")) {
                    str16 = Build.BRAND;
                    str16.getClass();
                    if (!str16.equalsIgnoreCase("Samsung")) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = true;
                }
                if (hpd0Var3.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, z6)) {
                    arrayList3.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
                }
                set = FlashAvailabilityBufferUnderflowQuirk.f45311a;
                Locale locale119 = Locale.US;
                locale119.getClass();
                lowerCase = str27.toLowerCase(locale119);
                lowerCase.getClass();
                lowerCase2 = str26.toLowerCase(locale119);
                lowerCase2.getClass();
                if (hpd0Var3.a(FlashAvailabilityBufferUnderflowQuirk.class, set.contains(new ojq(lowerCase, lowerCase2)))) {
                    arrayList3.add(new FlashAvailabilityBufferUnderflowQuirk());
                }
                if (!ImageCapturePixelHDRPlusQuirk.f45316a.contains(str26)) {
                    z7 = false;
                } else if (!str27.equalsIgnoreCase("Google")) {
                    str15 = Build.BRAND;
                    str15.getClass();
                    if (!str15.equalsIgnoreCase("Google")) {
                        z7 = false;
                    } else if (i2 >= 26) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else if (i2 >= 26) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (hpd0Var3.a(ImageCapturePixelHDRPlusQuirk.class, z7)) {
                    arrayList3.add(new ImageCapturePixelHDRPlusQuirk());
                }
                List list31 = InvalidVideoProfilesQuirk.f45319a;
                if (!str27.equalsIgnoreCase("Samsung")) {
                    str = Build.ID;
                    str.getClass();
                    if (kotlin.text.c.x(str, "TP1A", true)) {
                        list4 = InvalidVideoProfilesQuirk.f45319a;
                        lowerCase6 = str26.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                str13.getClass();
                                if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                            str10.getClass();
                                            if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list111115 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase111115 = str26.toLowerCase(locale2);
                                                    lowerCase111115.getClass();
                                                    if (list111115.contains(lowerCase111115)) {
                                                    }
                                                } else {
                                                    List list111116 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase111116 = str26.toLowerCase(locale2);
                                                    lowerCase111116.getClass();
                                                    if (list111116.contains(lowerCase111116)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list111117 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase111117 = str26.toLowerCase(locale2);
                                            lowerCase111117.getClass();
                                            if (list111117.contains(lowerCase111117)) {
                                            }
                                        } else {
                                            List list111118 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase111118 = str26.toLowerCase(locale2);
                                            lowerCase111118.getClass();
                                            if (list111118.contains(lowerCase111118)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str27.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = true;
                            }
                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else {
                                z18 = true;
                            }
                            if (z17 || z18) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                    str10.getClass();
                                    if (kotlin.text.c.x(str10, "TP1A", true)) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list111119 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase111119 = str26.toLowerCase(locale2);
                                            lowerCase111119.getClass();
                                            if (list111119.contains(lowerCase111119)) {
                                            }
                                        } else {
                                            List list1111110 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase1111110 = str26.toLowerCase(locale2);
                                            lowerCase1111110.getClass();
                                            if (list1111110.contains(lowerCase1111110)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str26.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    List list1111111 = InvalidVideoProfilesQuirk.b;
                                    String lowerCase1111111 = str26.toLowerCase(locale2);
                                    lowerCase1111111.getClass();
                                    if (list1111111.contains(lowerCase1111111)) {
                                    }
                                } else {
                                    List list1111112 = InvalidVideoProfilesQuirk.b;
                                    String lowerCase1111112 = str26.toLowerCase(locale2);
                                    lowerCase1111112.getClass();
                                    if (list1111112.contains(lowerCase1111112)) {
                                    }
                                }
                            }
                        }
                    }
                    if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                        arrayList3.add(new InvalidVideoProfilesQuirk());
                    }
                    if (lmc.O()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                        arrayList3.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap7 = ExtraCroppingQuirk.f45309a;
                    if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                        arrayList3.add(new ExtraCroppingQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z10 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                        arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    sln0 sln0Var7 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                        arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    List list2114 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                    if (!str27.equalsIgnoreCase("Google")) {
                        String str215 = Build.BRAND;
                        str215.getClass();
                        str215.equalsIgnoreCase("Google");
                    }
                    if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list2115 = PreviewPixelHDRnetQuirk.f45323a;
                    if (str27.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.f45323a;
                            str2.getClass();
                            Locale locale1110 = Locale.getDefault();
                            locale1110.getClass();
                            lowerCase3 = str2.toLowerCase(locale1110);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.f45323a;
                        str2.getClass();
                        Locale locale1111 = Locale.getDefault();
                        locale1111.getClass();
                        lowerCase3 = str2.toLowerCase(locale1111);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                        arrayList3.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z13 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                        arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                        arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                    lowerCase4 = str26.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list2116 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                            String str312 = Build.HARDWARE;
                            str312.getClass();
                            Locale locale1112 = Locale.getDefault();
                            locale1112.getClass();
                            lowerCase5 = str312.toLowerCase(locale1112);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        String str313 = Build.HARDWARE;
                        str313.getClass();
                        Locale locale1113 = Locale.getDefault();
                        locale1113.getClass();
                        lowerCase5 = str313.toLowerCase(locale1113);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                        arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list2117 = ZslDisablerQuirk.f45330a;
                    if (!str27.equalsIgnoreCase("Samsung")) {
                        if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    } else {
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (!str4.equalsIgnoreCase("Samsung")) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    }
                    z16 = true;
                    if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.f45325a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                    }
                    mhk.f21798a = new kpd0(arrayList3);
                    l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                } else {
                    str14 = Build.BRAND;
                    str14.getClass();
                    if (str14.equalsIgnoreCase("Samsung")) {
                        str = Build.ID;
                        str.getClass();
                        if (kotlin.text.c.x(str, "TP1A", true)) {
                            list4 = InvalidVideoProfilesQuirk.f45319a;
                            lowerCase6 = str26.toLowerCase(locale2);
                            lowerCase6.getClass();
                            if (list4.contains(lowerCase6)) {
                                str13 = Build.ID;
                                str13.getClass();
                                if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                    str13.getClass();
                                    if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                        if (str27.equalsIgnoreCase("Redmi")) {
                                            str12 = Build.BRAND;
                                            str12.getClass();
                                            if (str12.equalsIgnoreCase("Redmi")) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                        } else {
                                            z17 = true;
                                        }
                                        if (str27.equalsIgnoreCase("Xiaomi")) {
                                            str11 = Build.BRAND;
                                            str11.getClass();
                                            if (str11.equalsIgnoreCase("Xiaomi")) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                        } else {
                                            z18 = true;
                                        }
                                        if (z17 || z18) {
                                            str10 = Build.ID;
                                            str10.getClass();
                                            if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                                str10.getClass();
                                                if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                    list5 = InvalidVideoProfilesQuirk.c;
                                                    lowerCase7 = str26.toLowerCase(locale2);
                                                    lowerCase7.getClass();
                                                    if (list5.contains(lowerCase7)) {
                                                        List list1111113 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase1111113 = str26.toLowerCase(locale2);
                                                        lowerCase1111113.getClass();
                                                        if (list1111113.contains(lowerCase1111113)) {
                                                        }
                                                    } else {
                                                        List list1111114 = InvalidVideoProfilesQuirk.b;
                                                        String lowerCase1111114 = str26.toLowerCase(locale2);
                                                        lowerCase1111114.getClass();
                                                        if (list1111114.contains(lowerCase1111114)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list1111115 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1111115 = str26.toLowerCase(locale2);
                                                lowerCase1111115.getClass();
                                                if (list1111115.contains(lowerCase1111115)) {
                                                }
                                            } else {
                                                List list1111116 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1111116 = str26.toLowerCase(locale2);
                                                lowerCase1111116.getClass();
                                                if (list1111116.contains(lowerCase1111116)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (str27.equalsIgnoreCase("Redmi")) {
                                    str12 = Build.BRAND;
                                    str12.getClass();
                                    if (str12.equalsIgnoreCase("Redmi")) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = true;
                                }
                                if (str27.equalsIgnoreCase("Xiaomi")) {
                                    str11 = Build.BRAND;
                                    str11.getClass();
                                    if (str11.equalsIgnoreCase("Xiaomi")) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                } else {
                                    z18 = true;
                                }
                                if (z17 || z18) {
                                    str10 = Build.ID;
                                    str10.getClass();
                                    if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                        str10.getClass();
                                        if (kotlin.text.c.x(str10, "TP1A", true)) {
                                            list5 = InvalidVideoProfilesQuirk.c;
                                            lowerCase7 = str26.toLowerCase(locale2);
                                            lowerCase7.getClass();
                                            if (list5.contains(lowerCase7)) {
                                                List list1111117 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1111117 = str26.toLowerCase(locale2);
                                                lowerCase1111117.getClass();
                                                if (list1111117.contains(lowerCase1111117)) {
                                                }
                                            } else {
                                                List list1111118 = InvalidVideoProfilesQuirk.b;
                                                String lowerCase1111118 = str26.toLowerCase(locale2);
                                                lowerCase1111118.getClass();
                                                if (list1111118.contains(lowerCase1111118)) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    list5 = InvalidVideoProfilesQuirk.c;
                                    lowerCase7 = str26.toLowerCase(locale2);
                                    lowerCase7.getClass();
                                    if (list5.contains(lowerCase7)) {
                                        List list1111119 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase1111119 = str26.toLowerCase(locale2);
                                        lowerCase1111119.getClass();
                                        if (list1111119.contains(lowerCase1111119)) {
                                        }
                                    } else {
                                        List list11111110 = InvalidVideoProfilesQuirk.b;
                                        String lowerCase11111110 = str26.toLowerCase(locale2);
                                        lowerCase11111110.getClass();
                                        if (list11111110.contains(lowerCase11111110)) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        list4 = InvalidVideoProfilesQuirk.f45319a;
                        lowerCase6 = str26.toLowerCase(locale2);
                        lowerCase6.getClass();
                        if (list4.contains(lowerCase6)) {
                            str13 = Build.ID;
                            str13.getClass();
                            if (!kotlin.text.c.x(str13, "TP1A", true)) {
                                str13.getClass();
                                if (!kotlin.text.c.x(str13, "TD1A", true)) {
                                    if (str27.equalsIgnoreCase("Redmi")) {
                                        str12 = Build.BRAND;
                                        str12.getClass();
                                        if (str12.equalsIgnoreCase("Redmi")) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                    } else {
                                        z17 = true;
                                    }
                                    if (str27.equalsIgnoreCase("Xiaomi")) {
                                        str11 = Build.BRAND;
                                        str11.getClass();
                                        if (str11.equalsIgnoreCase("Xiaomi")) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                    } else {
                                        z18 = true;
                                    }
                                    if (z17 || z18) {
                                        str10 = Build.ID;
                                        str10.getClass();
                                        if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                            str10.getClass();
                                            if (kotlin.text.c.x(str10, "TP1A", true)) {
                                                list5 = InvalidVideoProfilesQuirk.c;
                                                lowerCase7 = str26.toLowerCase(locale2);
                                                lowerCase7.getClass();
                                                if (list5.contains(lowerCase7)) {
                                                    List list11111111 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11111111 = str26.toLowerCase(locale2);
                                                    lowerCase11111111.getClass();
                                                    if (list11111111.contains(lowerCase11111111)) {
                                                    }
                                                } else {
                                                    List list11111112 = InvalidVideoProfilesQuirk.b;
                                                    String lowerCase11111112 = str26.toLowerCase(locale2);
                                                    lowerCase11111112.getClass();
                                                    if (list11111112.contains(lowerCase11111112)) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list11111113 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11111113 = str26.toLowerCase(locale2);
                                            lowerCase11111113.getClass();
                                            if (list11111113.contains(lowerCase11111113)) {
                                            }
                                        } else {
                                            List list11111114 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11111114 = str26.toLowerCase(locale2);
                                            lowerCase11111114.getClass();
                                            if (list11111114.contains(lowerCase11111114)) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (str27.equalsIgnoreCase("Redmi")) {
                                str12 = Build.BRAND;
                                str12.getClass();
                                if (str12.equalsIgnoreCase("Redmi")) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = true;
                            }
                            if (str27.equalsIgnoreCase("Xiaomi")) {
                                str11 = Build.BRAND;
                                str11.getClass();
                                if (str11.equalsIgnoreCase("Xiaomi")) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                            } else {
                                z18 = true;
                            }
                            if (z17 || z18) {
                                str10 = Build.ID;
                                str10.getClass();
                                if (!kotlin.text.c.x(str10, "TKQ1", true)) {
                                    str10.getClass();
                                    if (kotlin.text.c.x(str10, "TP1A", true)) {
                                        list5 = InvalidVideoProfilesQuirk.c;
                                        lowerCase7 = str26.toLowerCase(locale2);
                                        lowerCase7.getClass();
                                        if (list5.contains(lowerCase7)) {
                                            List list11111115 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11111115 = str26.toLowerCase(locale2);
                                            lowerCase11111115.getClass();
                                            if (list11111115.contains(lowerCase11111115)) {
                                            }
                                        } else {
                                            List list11111116 = InvalidVideoProfilesQuirk.b;
                                            String lowerCase11111116 = str26.toLowerCase(locale2);
                                            lowerCase11111116.getClass();
                                            if (list11111116.contains(lowerCase11111116)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                list5 = InvalidVideoProfilesQuirk.c;
                                lowerCase7 = str26.toLowerCase(locale2);
                                lowerCase7.getClass();
                                if (list5.contains(lowerCase7)) {
                                    List list11111117 = InvalidVideoProfilesQuirk.b;
                                    String lowerCase11111117 = str26.toLowerCase(locale2);
                                    lowerCase11111117.getClass();
                                    if (list11111117.contains(lowerCase11111117)) {
                                    }
                                } else {
                                    List list11111118 = InvalidVideoProfilesQuirk.b;
                                    String lowerCase11111118 = str26.toLowerCase(locale2);
                                    lowerCase11111118.getClass();
                                    if (list11111118.contains(lowerCase11111118)) {
                                    }
                                }
                            }
                        }
                    }
                    if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                        arrayList3.add(new InvalidVideoProfilesQuirk());
                    }
                    if (lmc.O()) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                        arrayList3.add(new ExcludedSupportedSizesQuirk());
                    }
                    LinkedHashMap linkedHashMap8 = ExtraCroppingQuirk.f45309a;
                    if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                        arrayList3.add(new ExtraCroppingQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Motorola")) {
                        str9 = Build.BRAND;
                        str9.getClass();
                        if (!str9.equalsIgnoreCase("Motorola")) {
                            z10 = false;
                        } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                        arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                    }
                    sln0 sln0Var8 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                    str2 = Build.DEVICE;
                    if ("heroqltevzw".equalsIgnoreCase(str2)) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                        arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                    }
                    List list2118 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                    if (!str27.equalsIgnoreCase("Google")) {
                        String str216 = Build.BRAND;
                        str216.getClass();
                        str216.equalsIgnoreCase("Google");
                    }
                    if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                        arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                    }
                    List list2119 = PreviewPixelHDRnetQuirk.f45323a;
                    if (str27.equalsIgnoreCase("Google")) {
                        str8 = Build.BRAND;
                        str8.getClass();
                        if (str8.equalsIgnoreCase("Google")) {
                            list = PreviewPixelHDRnetQuirk.f45323a;
                            str2.getClass();
                            Locale locale1114 = Locale.getDefault();
                            locale1114.getClass();
                            lowerCase3 = str2.toLowerCase(locale1114);
                            lowerCase3.getClass();
                            if (list.contains(lowerCase3)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                    } else {
                        list = PreviewPixelHDRnetQuirk.f45323a;
                        str2.getClass();
                        Locale locale1115 = Locale.getDefault();
                        locale1115.getClass();
                        lowerCase3 = str2.toLowerCase(locale1115);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                    if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                        arrayList3.add(new PreviewPixelHDRnetQuirk());
                    }
                    if (!str27.equalsIgnoreCase("Huawei")) {
                        str7 = Build.BRAND;
                        str7.getClass();
                        if (!str7.equalsIgnoreCase("Huawei")) {
                            z13 = false;
                        } else if ("mha-l29".equalsIgnoreCase(str26)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                        arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                    }
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str6 = Build.BRAND;
                        str6.getClass();
                        if (str6.equalsIgnoreCase("Samsung")) {
                            upperCase = str26.toUpperCase(locale2);
                            upperCase.getClass();
                            if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                        arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                    }
                    list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                    lowerCase4 = str26.toLowerCase(locale2);
                    lowerCase4.getClass();
                    if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                        arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                    }
                    List list21110 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                    if (str27.equalsIgnoreCase("Samsung")) {
                        str5 = Build.BRAND;
                        str5.getClass();
                        if (str5.equalsIgnoreCase("Samsung")) {
                            list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                            String str314 = Build.HARDWARE;
                            str314.getClass();
                            Locale locale1116 = Locale.getDefault();
                            locale1116.getClass();
                            lowerCase5 = str314.toLowerCase(locale1116);
                            lowerCase5.getClass();
                            if (list3.contains(lowerCase5)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        String str315 = Build.HARDWARE;
                        str315.getClass();
                        Locale locale1117 = Locale.getDefault();
                        locale1117.getClass();
                        lowerCase5 = str315.toLowerCase(locale1117);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                        arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                    }
                    if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                        arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                    }
                    List list21111 = ZslDisablerQuirk.f45330a;
                    if (!str27.equalsIgnoreCase("Samsung")) {
                        if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    } else {
                        str4 = Build.BRAND;
                        str4.getClass();
                        if (!str4.equalsIgnoreCase("Samsung")) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                            if (!str27.equalsIgnoreCase("Xiaomi")) {
                                str3 = Build.BRAND;
                                str3.getClass();
                                if (str3.equalsIgnoreCase("Xiaomi")) {
                                    if (n8n0.i(ZslDisablerQuirk.b)) {
                                    }
                                }
                            } else if (n8n0.i(ZslDisablerQuirk.b)) {
                            }
                            z16 = false;
                        }
                        if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                            arrayList3.add(new ZslDisablerQuirk());
                        }
                        map = SmallDisplaySizeQuirk.f45325a;
                        upperCase2 = str26.toUpperCase(locale2);
                        upperCase2.getClass();
                        if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                            arrayList3.add(new SmallDisplaySizeQuirk());
                        }
                        if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                            arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                        }
                        mhk.f21798a = new kpd0(arrayList3);
                        l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                    }
                    z16 = true;
                    if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.f45325a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                    }
                    mhk.f21798a = new kpd0(arrayList3);
                    l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                }
                if (hpd0Var3.a(InvalidVideoProfilesQuirk.class, z8)) {
                    arrayList3.add(new InvalidVideoProfilesQuirk());
                }
                if (lmc.O()) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (hpd0Var3.a(ExcludedSupportedSizesQuirk.class, z9)) {
                    arrayList3.add(new ExcludedSupportedSizesQuirk());
                }
                LinkedHashMap linkedHashMap9 = ExtraCroppingQuirk.f45309a;
                if (hpd0Var3.a(ExtraCroppingQuirk.class, n4c.N())) {
                    arrayList3.add(new ExtraCroppingQuirk());
                }
                if (!str27.equalsIgnoreCase("Motorola")) {
                    str9 = Build.BRAND;
                    str9.getClass();
                    if (!str9.equalsIgnoreCase("Motorola")) {
                        z10 = false;
                    } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ("moto e5 play".equalsIgnoreCase(str26)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hpd0Var3.a(ExtraSupportedOutputSizeQuirk.class, z10)) {
                    arrayList3.add(new ExtraSupportedOutputSizeQuirk());
                }
                sln0 sln0Var9 = ExtraSupportedSurfaceCombinationsQuirk.f45310a;
                str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2)) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (hpd0Var3.a(ExtraSupportedSurfaceCombinationsQuirk.class, z11)) {
                    arrayList3.add(new ExtraSupportedSurfaceCombinationsQuirk());
                }
                List list21112 = Nexus4AndroidLTargetAspectRatioQuirk.f45322a;
                if (!str27.equalsIgnoreCase("Google")) {
                    String str217 = Build.BRAND;
                    str217.getClass();
                    str217.equalsIgnoreCase("Google");
                }
                if (hpd0Var3.a(Nexus4AndroidLTargetAspectRatioQuirk.class, false)) {
                    arrayList3.add(new Nexus4AndroidLTargetAspectRatioQuirk());
                }
                List list21113 = PreviewPixelHDRnetQuirk.f45323a;
                if (str27.equalsIgnoreCase("Google")) {
                    str8 = Build.BRAND;
                    str8.getClass();
                    if (str8.equalsIgnoreCase("Google")) {
                        list = PreviewPixelHDRnetQuirk.f45323a;
                        str2.getClass();
                        Locale locale1118 = Locale.getDefault();
                        locale1118.getClass();
                        lowerCase3 = str2.toLowerCase(locale1118);
                        lowerCase3.getClass();
                        if (list.contains(lowerCase3)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                } else {
                    list = PreviewPixelHDRnetQuirk.f45323a;
                    str2.getClass();
                    Locale locale1119 = Locale.getDefault();
                    locale1119.getClass();
                    lowerCase3 = str2.toLowerCase(locale1119);
                    lowerCase3.getClass();
                    if (list.contains(lowerCase3)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (hpd0Var3.a(PreviewPixelHDRnetQuirk.class, z12)) {
                    arrayList3.add(new PreviewPixelHDRnetQuirk());
                }
                if (!str27.equalsIgnoreCase("Huawei")) {
                    str7 = Build.BRAND;
                    str7.getClass();
                    if (!str7.equalsIgnoreCase("Huawei")) {
                        z13 = false;
                    } else if ("mha-l29".equalsIgnoreCase(str26)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else if ("mha-l29".equalsIgnoreCase(str26)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (hpd0Var3.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, z13)) {
                    arrayList3.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
                }
                if (str27.equalsIgnoreCase("Samsung")) {
                    str6 = Build.BRAND;
                    str6.getClass();
                    if (str6.equalsIgnoreCase("Samsung")) {
                        upperCase = str26.toUpperCase(locale2);
                        upperCase.getClass();
                        if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                } else {
                    upperCase = str26.toUpperCase(locale2);
                    upperCase.getClass();
                    if (kotlin.text.c.x(upperCase, "SM-A716", false)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                if (hpd0Var3.a(StillCaptureFlashStopRepeatingQuirk.class, z14)) {
                    arrayList3.add(new StillCaptureFlashStopRepeatingQuirk());
                }
                list2 = TorchIsClosedAfterImageCapturingQuirk.f45328a;
                lowerCase4 = str26.toLowerCase(locale2);
                lowerCase4.getClass();
                if (hpd0Var3.a(TorchIsClosedAfterImageCapturingQuirk.class, list2.contains(lowerCase4))) {
                    arrayList3.add(new TorchIsClosedAfterImageCapturingQuirk());
                }
                List list21114 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                if (str27.equalsIgnoreCase("Samsung")) {
                    str5 = Build.BRAND;
                    str5.getClass();
                    if (str5.equalsIgnoreCase("Samsung")) {
                        list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                        String str316 = Build.HARDWARE;
                        str316.getClass();
                        Locale locale11110 = Locale.getDefault();
                        locale11110.getClass();
                        lowerCase5 = str316.toLowerCase(locale11110);
                        lowerCase5.getClass();
                        if (list3.contains(lowerCase5)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                } else {
                    list3 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.f45326a;
                    String str317 = Build.HARDWARE;
                    str317.getClass();
                    Locale locale11111 = Locale.getDefault();
                    locale11111.getClass();
                    lowerCase5 = str317.toLowerCase(locale11111);
                    lowerCase5.getClass();
                    if (list3.contains(lowerCase5)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (hpd0Var3.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, z15)) {
                    arrayList3.add(new androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk());
                }
                if (hpd0Var3.a(CaptureSessionOnClosedNotCalledQuirk.class, false)) {
                    arrayList3.add(new CaptureSessionOnClosedNotCalledQuirk());
                }
                List list21115 = ZslDisablerQuirk.f45330a;
                if (!str27.equalsIgnoreCase("Samsung")) {
                    if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (n8n0.i(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.f45325a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                    }
                    mhk.f21798a = new kpd0(arrayList3);
                    l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                } else {
                    str4 = Build.BRAND;
                    str4.getClass();
                    if (!str4.equalsIgnoreCase("Samsung")) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (n8n0.i(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    } else if (n8n0.i(ZslDisablerQuirk.f45330a)) {
                        if (!str27.equalsIgnoreCase("Xiaomi")) {
                            str3 = Build.BRAND;
                            str3.getClass();
                            if (str3.equalsIgnoreCase("Xiaomi")) {
                                if (n8n0.i(ZslDisablerQuirk.b)) {
                                }
                            }
                        } else if (n8n0.i(ZslDisablerQuirk.b)) {
                        }
                        z16 = false;
                    }
                    if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                        arrayList3.add(new ZslDisablerQuirk());
                    }
                    map = SmallDisplaySizeQuirk.f45325a;
                    upperCase2 = str26.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                        arrayList3.add(new SmallDisplaySizeQuirk());
                    }
                    if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                        arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                    }
                    mhk.f21798a = new kpd0(arrayList3);
                    l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                }
                z16 = true;
                if (hpd0Var3.a(ZslDisablerQuirk.class, z16)) {
                    arrayList3.add(new ZslDisablerQuirk());
                }
                map = SmallDisplaySizeQuirk.f45325a;
                upperCase2 = str26.toUpperCase(locale2);
                upperCase2.getClass();
                if (hpd0Var3.a(SmallDisplaySizeQuirk.class, map.containsKey(upperCase2))) {
                    arrayList3.add(new SmallDisplaySizeQuirk());
                }
                if (hpd0Var3.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.b)) {
                    arrayList3.add(PreviewUnderExposureQuirk.f45324a);
                }
                mhk.f21798a = new kpd0(arrayList3);
                l8x.U("DeviceQuirks", "camera2 DeviceQuirks = ".concat(kpd0.d(mhk.a())));
                break;
            default:
                break;
        }
    }
}
