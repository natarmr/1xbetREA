package a;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class v34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioRecord f36716a;
    public c4m0 b;
    public sje c;
    public q99 d;
    public final AtomicBoolean e;
    public AcousticEchoCanceler f;

    public v34() {
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.c = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        this.e = new AtomicBoolean(false);
    }

    public final q99 a() {
        b();
        int minBufferSize = AudioRecord.getMinBufferSize(JosStatusCodes.RTN_CODE_COMMON_ERROR, 16, 2);
        int i = minBufferSize < 320 ? 320 : minBufferSize;
        yje yjeVar = null;
        q99 q99VarD = vtb.d(8, null, null, 6);
        this.d = q99VarD;
        try {
            AudioRecord audioRecord = new AudioRecord(7, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16, 2, i);
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                q99VarD.d(null);
                return q99VarD;
            }
            this.f36716a = audioRecord;
            if (AcousticEchoCanceler.isAvailable()) {
                try {
                    AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(audioRecord.getAudioSessionId());
                    this.f = acousticEchoCancelerCreate;
                    if (acousticEchoCancelerCreate != null) {
                        acousticEchoCancelerCreate.setEnabled(true);
                    }
                } catch (Exception unused) {
                }
            }
            audioRecord.startRecording();
            rwj rwjVar = tvk.f34603a;
            dvj dvjVar = dvj.c;
            kin0 kin0VarE = qem0.e();
            dvjVar.getClass();
            sje sjeVarA = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
            this.c = sjeVarA;
            this.b = qjj.W(sjeVarA, null, null, new ee0((Object) this, (Object) q99VarD, yjeVar, (byte) 10), 3);
            return q99VarD;
        } catch (Exception unused2) {
            q99VarD.d(null);
            return q99VarD;
        }
    }

    public final void b() {
        q99 q99Var = this.d;
        if (q99Var != null) {
            q99Var.d(null);
        }
        this.d = null;
        c4m0 c4m0Var = this.b;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.b = null;
        try {
            AcousticEchoCanceler acousticEchoCanceler = this.f;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
            }
        } catch (Exception unused) {
        }
        this.f = null;
        d5c.G(this.c, null);
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.c = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        try {
            AudioRecord audioRecord = this.f36716a;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception unused2) {
        }
        try {
            AudioRecord audioRecord2 = this.f36716a;
            if (audioRecord2 != null) {
                audioRecord2.release();
            }
        } catch (Exception unused3) {
        }
        this.f36716a = null;
    }
}
