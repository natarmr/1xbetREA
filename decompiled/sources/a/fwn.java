package a;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class fwn implements ewn {
    public final String b;
    public final kpd0 c;
    public final boolean d;
    public final int e;
    public final LinkedHashMap f;

    public fwn(String str, kpd0 kpd0Var) {
        boolean z;
        int i;
        kpd0Var.getClass();
        this.b = str;
        this.c = kpd0Var;
        this.f = new LinkedHashMap();
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            l8x.E0("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.b + ", unable to create EncoderProfilesProviderAdapter.");
            z = false;
            i = -1;
        }
        this.d = z;
        this.e = i;
    }

    @Override // a.ewn
    public final boolean a(int i) {
        return this.d && b(i) != null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x0100  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00a0, please report this as an issue */
    @Override // a.ewn
    public final n35 b(int i) {
        CamcorderProfile camcorderProfile;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        n35 n35VarA;
        boolean zContains;
        n35 n35Var = null;
        if (this.d) {
            int i6 = this.e;
            if (CamcorderProfile.hasProfile(i6, i)) {
                Integer numValueOf = Integer.valueOf(i);
                LinkedHashMap linkedHashMap = this.f;
                if (linkedHashMap.containsKey(numValueOf)) {
                    return (n35) linkedHashMap.get(Integer.valueOf(i));
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 31) {
                    try {
                        camcorderProfile = CamcorderProfile.get(i6, i);
                    } catch (RuntimeException e) {
                        l8x.F0("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + i, e);
                        camcorderProfile = null;
                    }
                    if (camcorderProfile != null) {
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            l8x.E0("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                        }
                        int i8 = camcorderProfile.duration;
                        int i9 = camcorderProfile.fileFormat;
                        ArrayList arrayList = new ArrayList();
                        i3 = camcorderProfile.audioCodec;
                        switch (i3) {
                            case 1:
                                str = "audio/3gpp";
                                break;
                            case 2:
                                str = "audio/amr-wb";
                                break;
                            case 3:
                            case 4:
                            case 5:
                                str = "audio/mp4a-latm";
                                break;
                            case 6:
                                str = "audio/vorbis";
                                break;
                            case 7:
                                str = "audio/opus";
                                break;
                            default:
                                str = "audio/none";
                                break;
                        }
                        String str3 = str;
                        int i10 = camcorderProfile.audioBitRate;
                        int i11 = camcorderProfile.audioSampleRate;
                        int i12 = camcorderProfile.audioChannels;
                        if (i3 != 3) {
                            i4 = 5;
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    i4 = -1;
                                } else {
                                    i4 = 39;
                                }
                            }
                        } else {
                            i4 = 2;
                        }
                        arrayList.add(new m35(i3, i10, i11, i12, i4, str3));
                        ArrayList arrayList2 = new ArrayList();
                        i5 = camcorderProfile.videoCodec;
                        switch (i5) {
                            case 1:
                                str2 = "video/3gpp";
                                break;
                            case 2:
                                str2 = "video/avc";
                                break;
                            case 3:
                                str2 = "video/mp4v-es";
                                break;
                            case 4:
                                str2 = "video/x-vnd.on2.vp8";
                                break;
                            case 5:
                                str2 = "video/hevc";
                                break;
                            case 6:
                                str2 = "video/x-vnd.on2.vp9";
                                break;
                            case 7:
                                str2 = "video/dolby-vision";
                                break;
                            case 8:
                                str2 = "video/av01";
                                break;
                            default:
                                str2 = "video/none";
                                break;
                        }
                        arrayList2.add(new o35(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                        n35VarA = n35.a(i8, i9, arrayList, arrayList2);
                    } else {
                        n35VarA = null;
                    }
                } else {
                    EncoderProfiles encoderProfilesD = gy2.d(i, this.b);
                    if (encoderProfilesD != null) {
                        if (mhk.a().b(InvalidVideoProfilesQuirk.class) != null) {
                            l8x.U("EncoderProfilesProviderAdapter", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
                        } else {
                            try {
                                if (i7 >= 33) {
                                    n35VarA = f7.c(encoderProfilesD);
                                } else {
                                    if (i7 < 31) {
                                        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i7 + ". Version 31 or higher required.");
                                    }
                                    n35VarA = gy2.c(encoderProfilesD);
                                }
                            } catch (NullPointerException e2) {
                                l8x.F0("EncoderProfilesProviderAdapter", "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead.", e2);
                                camcorderProfile = CamcorderProfile.get(i6, i);
                                if (camcorderProfile != null) {
                                    i2 = Build.VERSION.SDK_INT;
                                    if (i2 >= 31) {
                                        l8x.E0("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                                    }
                                    int i13 = camcorderProfile.duration;
                                    int i14 = camcorderProfile.fileFormat;
                                    ArrayList arrayList3 = new ArrayList();
                                    i3 = camcorderProfile.audioCodec;
                                    switch (i3) {
                                        case 1:
                                            str = "audio/3gpp";
                                            break;
                                        case 2:
                                            str = "audio/amr-wb";
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                            str = "audio/mp4a-latm";
                                            break;
                                        case 6:
                                            str = "audio/vorbis";
                                            break;
                                        case 7:
                                            str = "audio/opus";
                                            break;
                                        default:
                                            str = "audio/none";
                                            break;
                                    }
                                    String str4 = str;
                                    int i15 = camcorderProfile.audioBitRate;
                                    int i16 = camcorderProfile.audioSampleRate;
                                    int i17 = camcorderProfile.audioChannels;
                                    if (i3 != 3) {
                                        i4 = 5;
                                        if (i3 != 4) {
                                            if (i3 != 5) {
                                                i4 = -1;
                                            } else {
                                                i4 = 39;
                                            }
                                        }
                                    } else {
                                        i4 = 2;
                                    }
                                    arrayList3.add(new m35(i3, i15, i16, i17, i4, str4));
                                    ArrayList arrayList4 = new ArrayList();
                                    i5 = camcorderProfile.videoCodec;
                                    switch (i5) {
                                        case 1:
                                            str2 = "video/3gpp";
                                            break;
                                        case 2:
                                            str2 = "video/avc";
                                            break;
                                        case 3:
                                            str2 = "video/mp4v-es";
                                            break;
                                        case 4:
                                            str2 = "video/x-vnd.on2.vp8";
                                            break;
                                        case 5:
                                            str2 = "video/hevc";
                                            break;
                                        case 6:
                                            str2 = "video/x-vnd.on2.vp9";
                                            break;
                                        case 7:
                                            str2 = "video/dolby-vision";
                                            break;
                                        case 8:
                                            str2 = "video/av01";
                                            break;
                                        default:
                                            str2 = "video/none";
                                            break;
                                    }
                                    arrayList4.add(new o35(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                                    n35VarA = n35.a(i13, i14, arrayList3, arrayList4);
                                } else {
                                    n35VarA = null;
                                }
                            }
                        }
                        camcorderProfile = CamcorderProfile.get(i6, i);
                        if (camcorderProfile != null) {
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31) {
                                l8x.E0("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                            }
                            int i18 = camcorderProfile.duration;
                            int i19 = camcorderProfile.fileFormat;
                            ArrayList arrayList5 = new ArrayList();
                            i3 = camcorderProfile.audioCodec;
                            switch (i3) {
                                case 1:
                                    str = "audio/3gpp";
                                    break;
                                case 2:
                                    str = "audio/amr-wb";
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    str = "audio/mp4a-latm";
                                    break;
                                case 6:
                                    str = "audio/vorbis";
                                    break;
                                case 7:
                                    str = "audio/opus";
                                    break;
                                default:
                                    str = "audio/none";
                                    break;
                            }
                            String str5 = str;
                            int i110 = camcorderProfile.audioBitRate;
                            int i111 = camcorderProfile.audioSampleRate;
                            int i112 = camcorderProfile.audioChannels;
                            if (i3 != 3) {
                                i4 = 5;
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        i4 = -1;
                                    } else {
                                        i4 = 39;
                                    }
                                }
                            } else {
                                i4 = 2;
                            }
                            arrayList5.add(new m35(i3, i110, i111, i112, i4, str5));
                            ArrayList arrayList6 = new ArrayList();
                            i5 = camcorderProfile.videoCodec;
                            switch (i5) {
                                case 1:
                                    str2 = "video/3gpp";
                                    break;
                                case 2:
                                    str2 = "video/avc";
                                    break;
                                case 3:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 4:
                                    str2 = "video/x-vnd.on2.vp8";
                                    break;
                                case 5:
                                    str2 = "video/hevc";
                                    break;
                                case 6:
                                    str2 = "video/x-vnd.on2.vp9";
                                    break;
                                case 7:
                                    str2 = "video/dolby-vision";
                                    break;
                                case 8:
                                    str2 = "video/av01";
                                    break;
                                default:
                                    str2 = "video/none";
                                    break;
                            }
                            arrayList6.add(new o35(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                            n35VarA = n35.a(i18, i19, arrayList5, arrayList6);
                        } else {
                            n35VarA = null;
                        }
                    } else {
                        n35VarA = null;
                    }
                }
                if (n35VarA != null) {
                    CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.c.b(CamcorderProfileResolutionQuirk.class);
                    if (camcorderProfileResolutionQuirk == null) {
                        zContains = true;
                    } else {
                        List list = n35VarA.d;
                        list.getClass();
                        if (list.isEmpty()) {
                            zContains = true;
                        } else {
                            o35 o35Var = (o35) list.get(0);
                            List listL0 = CollectionsKt.L0((List) camcorderProfileResolutionQuirk.b.getValue());
                            o35Var.getClass();
                            zContains = listL0.contains(new Size(o35Var.e, o35Var.f));
                        }
                    }
                    if (!zContains) {
                        List<Integer> list2 = ewn.f8535a;
                        if (i == 0) {
                            list2.getClass();
                            for (int size = list2.size() - 1; -1 < size; size--) {
                                Object obj = list2.get(size);
                                obj.getClass();
                                n35 n35VarB = b(((Number) obj).intValue());
                                if (n35VarB != null) {
                                    n35Var = n35VarB;
                                }
                            }
                        } else if (i == 1) {
                            for (Integer num : list2) {
                                num.getClass();
                                n35 n35VarB2 = b(num.intValue());
                                if (n35VarB2 != null) {
                                    n35Var = n35VarB2;
                                }
                            }
                        }
                        n35VarA = n35Var;
                    }
                }
                linkedHashMap.put(Integer.valueOf(i), n35VarA);
                return n35VarA;
            }
        }
        return null;
    }
}
