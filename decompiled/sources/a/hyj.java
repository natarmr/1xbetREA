package a;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hyj implements lsb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ syj f13862a;
    public final /* synthetic */ nyj b;

    public /* synthetic */ hyj(syj syjVar, nyj nyjVar) {
        this.f13862a = syjVar;
        this.b = nyjVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006c A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec  */
    @Override // a.lsb0
    public final boolean apply(Object obj) {
        Boolean bool;
        o24 o24Var;
        Spatializer spatializer;
        Spatializer spatializer2;
        Spatializer spatializer3;
        boolean zCanBeSpatialized;
        Spatializer spatializer4;
        int i;
        o24 o24Var2;
        androidx.media3.common.b bVar = (androidx.media3.common.b) obj;
        syj syjVar = this.f13862a;
        syjVar.getClass();
        if (this.b.C && ((bool = syjVar.j) == null || !bool.booleanValue())) {
            int i2 = bVar.J;
            String str = bVar.p;
            if (i2 != -1 && i2 > 2) {
                if (str == null) {
                    if (Build.VERSION.SDK_INT >= 32 && (o24Var = syjVar.h) != null && o24Var.f24513a && (spatializer = (Spatializer) o24Var.b) != null && spatializer.isAvailable() && (spatializer2 = (Spatializer) syjVar.h.b) != null && spatializer2.isEnabled()) {
                        o24 o24Var3 = syjVar.h;
                        m24 m24Var = syjVar.i;
                        spatializer3 = (Spatializer) o24Var3.b;
                        if (spatializer3 == null && o24Var3.f24513a && spatializer3.isAvailable() && (spatializer4 = (Spatializer) o24Var3.b) != null && spatializer4.isEnabled()) {
                            int i3 = bVar.J;
                            if (Objects.equals(str, "audio/eac3-joc")) {
                                if (i3 == 16) {
                                    i = 12;
                                } else {
                                    i = i3;
                                }
                            } else if (Objects.equals(str, "audio/iamf")) {
                                if (i3 == -1) {
                                    i = 6;
                                } else {
                                    i = i3;
                                }
                            } else if (Objects.equals(str, "audio/ac4") && (i3 == 18 || i3 == 21)) {
                                i = 24;
                            } else {
                                i = i3;
                            }
                            int iP = bVar.K;
                            if (iP == -1 || i3 != i) {
                                iP = vtt0.p(i);
                            }
                            if (iP == 0) {
                                zCanBeSpatialized = false;
                            } else {
                                AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iP);
                                int i4 = bVar.L;
                                if (i4 != -1) {
                                    channelMask.setSampleRate(i4);
                                }
                                Spatializer spatializer5 = (Spatializer) o24Var3.b;
                                spatializer5.getClass();
                                zCanBeSpatialized = b7.d(spatializer5).canBeSpatialized(m24Var.a(), channelMask.build());
                            }
                        } else {
                            zCanBeSpatialized = false;
                        }
                        if (zCanBeSpatialized) {
                        }
                    }
                    return false;
                }
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac3":
                    case "audio/ac4":
                    case "audio/eac3":
                        if (Build.VERSION.SDK_INT >= 32 && (o24Var2 = syjVar.h) != null && o24Var2.f24513a) {
                        }
                    default:
                        if (Build.VERSION.SDK_INT >= 32) {
                            o24 o24Var4 = syjVar.h;
                            m24 m24Var2 = syjVar.i;
                            spatializer3 = (Spatializer) o24Var4.b;
                            if (spatializer3 == null) {
                                zCanBeSpatialized = false;
                            } else {
                                zCanBeSpatialized = false;
                            }
                            if (zCanBeSpatialized) {
                            }
                        }
                        return false;
                }
            }
        }
        return true;
    }
}
