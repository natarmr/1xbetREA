package a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q24 {
    public static final rcf0 e;
    public static final q24 f;
    public static final rcf0 g;
    public static final wcf0 h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f27982a = new SparseArray();
    public final int b;
    public final b4x c;
    public final b4x d;

    static {
        rcf0 rcf0VarT = b4x.t(12);
        e = rcf0VarT;
        f = new q24(b4x.t(p24.d), rcf0VarT, rcf0.e);
        Object[] objArr = {2, 5, 6};
        h8x.w(3, objArr);
        g = b4x.k(3, objArr);
        zz2 zz2Var = new zz2(4);
        zz2Var.A(5, 6);
        zz2Var.A(17, 6);
        zz2Var.A(7, 6);
        zz2Var.A(30, 10);
        zz2Var.A(18, 6);
        zz2Var.A(6, 8);
        zz2Var.A(8, 8);
        zz2Var.A(14, 8);
        h = zz2Var.e(true);
    }

    public q24(rcf0 rcf0Var, b4x b4xVar, List list) {
        for (int i = 0; i < rcf0Var.d; i++) {
            p24 p24Var = (p24) rcf0Var.get(i);
            this.f27982a.put(p24Var.f26233a, p24Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f27982a.size(); i2++) {
            iMax = Math.max(iMax, ((p24) this.f27982a.valueAt(i2)).b);
        }
        this.b = iMax;
        this.c = b4x.o(b4xVar);
        this.d = b4x.o(list);
    }

    public static rcf0 a(int[] iArr, int i) {
        u3x u3xVarL = b4x.l();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            u3xVarL.b(new p24(i2, i));
        }
        return u3xVarL.g();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:128:0x01be  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:209:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:211:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[PHI: r6
  0x0097: PHI (r6v30 a.b4x) = (r6v25 a.b4x), (r6v27 a.b4x), (r6v29 a.b4x), (r6v32 a.b4x), (r6v34 a.b4x) binds: [B:140:0x01e5, B:44:0x00bb, B:129:0x01c6, B:34:0x0095, B:37:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    public static q24 b(Context context, Intent intent, m24 m24Var, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioDeviceInfo audioDeviceInfo2;
        int i;
        b4x b4xVarT;
        AudioDeviceInfo[] devices;
        int i2;
        int type;
        b4x b4xVarA;
        b4x b4xVarO;
        int i3;
        int speakerLayoutChannelMask;
        AudioManager audioManagerG0 = b34.g0(context);
        if (audioDeviceInfo != null) {
            audioDeviceInfo2 = audioDeviceInfo;
        } else if (Build.VERSION.SDK_INT >= 33) {
            List audioDevicesForAttributes = audioManagerG0.getAudioDevicesForAttributes(m24Var.a());
            if (audioDevicesForAttributes.isEmpty()) {
                audioDeviceInfo2 = null;
            } else {
                audioDeviceInfo2 = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
            }
        } else {
            audioDeviceInfo2 = null;
        }
        if (audioDeviceInfo2 != null) {
            b4xVarT = nnk0.f23827a;
            if (bkb.Y(audioDeviceInfo2.getType())) {
                i = 0;
            } else {
                if (audioDeviceInfo2.getType() == 1) {
                    b4xVarT = b4x.t(4);
                } else if (audioDeviceInfo2.getType() != 2) {
                    int i4 = Build.VERSION.SDK_INT;
                    i = 0;
                    if (i4 >= 31 && audioDeviceInfo2.getType() == 10) {
                        b4xVarA = nnk0.a(audioDeviceInfo2);
                        if (b4xVarA.isEmpty()) {
                            b4xVarA = tke.U(audioDeviceInfo2.getAudioDescriptors());
                            if (!b4xVarA.isEmpty()) {
                                b4xVarT = b4xVarA;
                            }
                        } else {
                            b4xVarT = b4xVarA;
                        }
                    } else if (i4 >= 31) {
                        int type2 = audioDeviceInfo2.getType();
                        if (i4 >= 31 && type2 == 29) {
                            b4xVarA = nnk0.a(audioDeviceInfo2);
                            if (b4xVarA.isEmpty()) {
                                List audioDescriptors = audioDeviceInfo2.getAudioDescriptors();
                                if (i4 < 34) {
                                    b4xVarA = tke.U(audioDescriptors);
                                    if (!b4xVarA.isEmpty()) {
                                        b4xVarT = b4xVarA;
                                    }
                                } else {
                                    if (i4 < 34 || audioDescriptors == null) {
                                        v3x v3xVar = b4x.b;
                                        b4xVarO = rcf0.e;
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it = audioDescriptors.iterator();
                                        while (it.hasNext()) {
                                            AudioDescriptor audioDescriptorI = ow2.i(it.next());
                                            if (audioDescriptorI.getStandard() == 2) {
                                                byte[] descriptor = audioDescriptorI.getDescriptor();
                                                if (descriptor.length != 3) {
                                                    f1t0.g0("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                                } else {
                                                    if (Build.VERSION.SDK_INT < 34 || descriptor.length != 3) {
                                                        i3 = 0;
                                                    } else {
                                                        byte b = descriptor[0];
                                                        int i5 = (b & 1) != 0 ? 12 : 0;
                                                        if ((b & 2) != 0) {
                                                            i5 |= 32;
                                                        }
                                                        if ((b & 4) != 0) {
                                                            i5 |= 16;
                                                        }
                                                        if ((b & 8) != 0) {
                                                            i5 |= 192;
                                                        }
                                                        if ((b & 16) != 0) {
                                                            i5 |= 1024;
                                                        }
                                                        if ((b & 32) != 0) {
                                                            i5 |= 768;
                                                        }
                                                        if ((b & 128) != 0) {
                                                            i5 |= 201326592;
                                                        }
                                                        byte b2 = descriptor[1];
                                                        if ((b2 & 1) != 0) {
                                                            i5 |= 81920;
                                                        }
                                                        if ((b2 & 2) != 0) {
                                                            i5 |= 8192;
                                                        }
                                                        if ((b2 & 4) != 0) {
                                                            i5 |= 32768;
                                                        }
                                                        if ((b2 & 8) != 0) {
                                                            i5 |= 6144;
                                                        }
                                                        if ((b2 & 16) != 0) {
                                                            i5 |= 33554432;
                                                        }
                                                        if ((b2 & 32) != 0) {
                                                            i5 |= 262144;
                                                        }
                                                        if ((b2 & 64) != 0) {
                                                            i5 |= 6144;
                                                        }
                                                        if ((b2 & 128) != 0) {
                                                            i5 |= 3145728;
                                                        }
                                                        byte b3 = descriptor[2];
                                                        if ((b3 & 1) != 0) {
                                                            i5 |= 655360;
                                                        }
                                                        if ((b3 & 2) != 0) {
                                                            i5 |= 8388608;
                                                        }
                                                        i3 = (b3 & 4) != 0 ? 20971520 | i5 : i5;
                                                    }
                                                    arrayList.add(Integer.valueOf(i3));
                                                }
                                            }
                                        }
                                        arrayList.sort(new l13((byte) 1));
                                        b4xVarO = b4x.o(arrayList);
                                    }
                                    if (b4xVarO.isEmpty()) {
                                        b4xVarA = tke.U(audioDescriptors);
                                        if (!b4xVarA.isEmpty()) {
                                            b4xVarT = b4xVarA;
                                        }
                                    } else {
                                        b4xVarT = b4xVarO;
                                    }
                                }
                            } else {
                                b4xVarT = b4xVarA;
                            }
                        } else if (i4 >= 31 && ((type = audioDeviceInfo2.getType()) == 11 || type == 12 || (i4 >= 31 && type == 22))) {
                            b4xVarA = nnk0.a(audioDeviceInfo2);
                            if (!b4xVarA.isEmpty()) {
                                b4xVarT = b4xVarA;
                            }
                        }
                    } else if (i4 >= 31) {
                        b4xVarA = nnk0.a(audioDeviceInfo2);
                        if (!b4xVarA.isEmpty()) {
                            b4xVarT = b4xVarA;
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 36 || (speakerLayoutChannelMask = audioDeviceInfo2.getSpeakerLayoutChannelMask()) == 0 || speakerLayoutChannelMask == 1) {
                    f1t0.g0("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                } else {
                    b4xVarT = b4x.t(Integer.valueOf(speakerLayoutChannelMask));
                }
                i = 0;
            }
        } else {
            i = 0;
            b4xVarT = e;
        }
        int i6 = Build.VERSION.SDK_INT;
        wcf0 wcf0Var = h;
        if (i6 >= 33 && (vtt0.L(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            List directProfilesForAttributes = audioManagerG0.getDirectProfilesForAttributes(m24Var.a());
            HashMap map = new HashMap();
            map.put(2, new HashSet(n6x.o(12)));
            for (int i7 = i; i7 < directProfilesForAttributes.size(); i7++) {
                AudioProfile audioProfileJ = ow2.j(directProfilesForAttributes.get(i7));
                if (audioProfileJ.getEncapsulationType() != 1) {
                    int format = audioProfileJ.getFormat();
                    if (vtt0.I(format) || wcf0Var.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(n6x.o(audioProfileJ.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(n6x.o(audioProfileJ.getChannelMasks())));
                        }
                    }
                }
            }
            u3x u3xVarL = b4x.l();
            for (Map.Entry entry : map.entrySet()) {
                u3xVarL.b(new p24(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new q24(u3xVarL.g(), b4xVarT, list);
        }
        if (audioDeviceInfo2 == null) {
            devices = audioManagerG0.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[1];
            devices[i] = audioDeviceInfo2;
        }
        int length = devices.length;
        for (int i8 = i; i8 < length; i8++) {
            if (bkb.Y(devices[i8].getType())) {
                return new q24(b4x.t(p24.d), b4xVarT, list);
            }
        }
        e4x e4xVar = new e4x(4);
        e4xVar.b(2);
        if (Build.VERSION.SDK_INT >= 29 && (vtt0.L(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            u3x u3xVarL2 = b4x.l();
            eet0 it2 = wcf0Var.keySet().iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= vtt0.o(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), m24Var.a())) {
                    u3xVarL2.b(num);
                }
            }
            u3xVarL2.b(2);
            rcf0 rcf0VarG = u3xVarL2.g();
            rcf0VarG.getClass();
            e4xVar.c(rcf0VarG);
            return new q24(a(n6x.m0(e4xVar.g()), 10), b4xVarT, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", i) == 1;
        if (z) {
            i2 = 0;
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                rcf0 rcf0Var = g;
                rcf0Var.getClass();
                e4xVar.c(rcf0Var);
            }
        } else {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                i2 = 0;
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    rcf0 rcf0Var2 = g;
                    rcf0Var2.getClass();
                    e4xVar.c(rcf0Var2);
                }
            } else {
                i2 = 0;
            }
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", i2) != 1) {
            return new q24(a(n6x.m0(e4xVar.g()), 10), b4xVarT, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listO = n6x.o(intArrayExtra);
            listO.getClass();
            e4xVar.c(listO);
        }
        return new q24(a(n6x.m0(e4xVar.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), b4xVarT, list);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    public final Pair c(androidx.media3.common.b bVar, m24 m24Var) {
        String str = bVar.p;
        int iP = bVar.K;
        int i = bVar.J;
        str.getClass();
        int iC = mg40.c(str, bVar.l);
        Integer numValueOf = Integer.valueOf(iC);
        wcf0 wcf0Var = h;
        if (!wcf0Var.containsKey(numValueOf)) {
            return null;
        }
        int i2 = 6;
        SparseArray sparseArray = this.f27982a;
        if (iC == 18 && !vtt0.k(sparseArray, 18)) {
            iC = 6;
        } else if ((iC == 8 && !vtt0.k(sparseArray, 8)) || (iC == 30 && !vtt0.k(sparseArray, 30))) {
            iC = 7;
        }
        if (!vtt0.k(sparseArray, iC)) {
            return null;
        }
        p24 p24Var = (p24) sparseArray.get(iC);
        p24Var.getClass();
        int iIntValue = p24Var.b;
        f4x f4xVar = p24Var.c;
        boolean zContains = false;
        if (i == -1 || iC == 18) {
            int i3 = bVar.L;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = p24Var.f26233a;
            if (f4xVar == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = 10;
                    while (true) {
                        if (iIntValue <= 0) {
                            iIntValue = 0;
                            break;
                        }
                        int iP2 = vtt0.p(iIntValue);
                        if (iP2 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i3).setChannelMask(iP2).build(), m24Var.a())) {
                            break;
                        }
                        iIntValue--;
                    }
                } else {
                    Object obj = wcf0Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!bVar.p.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                p24 p24Var2 = p24.d;
                if (f4xVar != null) {
                    int iP3 = iP != -1 ? iP : vtt0.p(i);
                    if (iP3 != 0) {
                        zContains = f4xVar.contains(Integer.valueOf(iP3));
                    }
                } else if (i <= iIntValue) {
                    zContains = true;
                }
                if (!zContains) {
                    return null;
                }
            } else if (i > 10) {
                return null;
            }
            iIntValue = i;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i2 = iIntValue;
        } else if (iIntValue == 7) {
            i2 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i2 = iIntValue;
        }
        HashSet hashSet = hn30.f13332a;
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        if (iP == -1 || i != i2) {
            iP = vtt0.p(i2);
        }
        if (iP == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iP));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof q24) {
                q24 q24Var = (q24) obj;
                SparseArray sparseArray = q24Var.f27982a;
                String str = vtt0.f38024a;
                SparseArray sparseArray2 = this.f27982a;
                if (sparseArray2 == null) {
                    if (sparseArray == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray == null) {
                    zContentEquals = false;
                } else if (Build.VERSION.SDK_INT >= 31) {
                    zContentEquals = sparseArray2.contentEquals(sparseArray);
                } else {
                    int size = sparseArray2.size();
                    if (size == sparseArray.size()) {
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                if (Objects.equals(sparseArray2.valueAt(i), sparseArray.get(sparseArray2.keyAt(i)))) {
                                    i++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.b != q24Var.b || !Objects.equals(this.c, q24Var.c) || !Objects.equals(this.d, q24Var.d)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.b * 31;
        String str = vtt0.f38024a;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f27982a;
        if (i2 >= 31) {
            iHashCode = sparseArray.contentHashCode();
        } else {
            iHashCode = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (iHashCode * 31)) * 31);
            }
        }
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((i + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.f27982a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
