package a;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.media.AudioManager;
import android.net.TrafficStats;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.view.View;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.authorization.model.AuthType;
import org.xplatform.core.navigation.authorization.screen.Authorization;
import org.xplatform.core.navigation.authorization.screen.Authorization$Registration$Screen;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gdv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11122a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gdv0(PackageInfo packageInfo, x7w0 x7w0Var) {
        this.f11122a = (byte) 15;
        this.b = packageInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Authorization.Login.Screen screen;
        Object g0g0Var;
        byte b = this.f11122a;
        byte b2 = 18;
        byte b3 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, ((hdv0) obj2).f12890a);
                return Unit.f46060a;
            case 1:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                View view = cpVar.f40887a;
                view.getClass();
                dyb.c0(view, new zfv0((vft) obj2, cpVar, b3));
                cpVar.t(new a8u0(cpVar, (byte) 8));
                return Unit.f46060a;
            case 2:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, null, null, cfx0.m, 3);
                hcz.e(hczVar, null, null, cfx0.n, 3);
                a4x a4xVar = ((omv0) obj2).b;
                hczVar.f(a4xVar.size(), null, new vdr0(a4xVar, b2), new ugd(802480018, true, new bzp0(a4xVar, (byte) 6)));
                return Unit.f46060a;
            case 3:
                tmv0 tmv0Var = (tmv0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                tmv0Var.r.b(th, new ggt0(tmv0Var, (byte) 26));
                return Unit.f46060a;
            case 4:
                knv0 knv0Var = (knv0) obj2;
                TableViewImpl tableViewImpl = (TableViewImpl) obj;
                tableViewImpl.getClass();
                k5 adapter = tableViewImpl.getAdapter();
                dnv0 dnv0Var = adapter instanceof dnv0 ? (dnv0) adapter : null;
                if (dnv0Var != null) {
                    env0 env0Var = knv0Var.b;
                    dnv0Var.q(env0Var.b, env0Var.c, env0Var.f8114a, env0Var.d);
                }
                tableViewImpl.getColumnHeaderRecyclerView().y0(0);
                tableViewImpl.getRowHeaderRecyclerView().y0(0);
                tableViewImpl.getCellRecyclerView().y0(0);
                return Unit.f46060a;
            case 5:
                qnv0 qnv0Var = (qnv0) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                qnv0Var.r.b(th2, new ggt0(qnv0Var, (byte) 28));
                return Unit.f46060a;
            case 6:
                f240 f240Var = (f240) obj;
                sxs0 sxs0Var = cyv0.O1;
                f240Var.getClass();
                ((fho0) ((cyv0) obj2).M1.getValue()).F(f240Var);
                return Unit.f46060a;
            case 7:
                f240 f240Var2 = (f240) obj;
                wxs0 wxs0Var = wzv0.O1;
                f240Var2.getClass();
                ((rio0) ((wzv0) obj2).M1.getValue()).E(f240Var2);
                return Unit.f46060a;
            case 8:
                AuthType authType = (AuthType) obj;
                authType.getClass();
                gdv0 gdv0Var = ((i1w0) obj2).e;
                if (gdv0Var != null) {
                    return (Authorization) gdv0Var.invoke(authType);
                }
                return null;
            case 9:
                o1w0 o1w0Var = (o1w0) obj2;
                AuthType authType2 = (AuthType) obj;
                authType2.getClass();
                wn4 wn4Var = o1w0Var.d;
                List list = ((j1w0) o1w0Var.g.getValue()).b;
                pru pruVar = wn4Var.f39430a;
                list.getClass();
                int iOrdinal = authType2.ordinal();
                byte b4 = 14;
                if (iOrdinal == 0) {
                    int iOrdinal2 = pruVar.a().N.q.ordinal();
                    if (iOrdinal2 == 0) {
                        screen = new Authorization.Login.Screen(null, new gne(authType2, b4), 3);
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                t9f.b();
                                return null;
                            }
                            if (!((rpx) ((chf0) wn4Var.b.b).c).f30906a.get()) {
                                return wn4Var.c.a();
                            }
                            ze4.g2.getClass();
                            return new Authorization.Login.Screen(ze4.i2, new jf4((byte) 21), 2);
                        }
                        screen = new Authorization.Login.Screen(null, new jf4((byte) 22), 3);
                    }
                    return screen;
                }
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                int iOrdinal3 = pruVar.a().N.q.ordinal();
                if (iOrdinal3 == 0) {
                    if (list.size() != 1) {
                        return new Authorization.Login.Screen(null, new gne(AuthType.b, b4), 3);
                    }
                    RegistrationDefaultScreenParams registrationDefaultScreenParams = new RegistrationDefaultScreenParams((q7f0) CollectionsKt.U(list));
                    dxe0.Y1.getClass();
                    return new Authorization$Registration$Screen(dxe0.a2, new ex60(registrationDefaultScreenParams, b2));
                }
                if (iOrdinal3 == 1) {
                    iaf0.Z1.getClass();
                    return new Authorization$Registration$Screen(iaf0.b2, new e9d0((byte) 10));
                }
                if (iOrdinal3 == 2) {
                    z3f0.Y1.getClass();
                    return new Authorization$Registration$Screen(z3f0.a2, new e9d0((byte) 9));
                }
                t9f.b();
                return null;
            case 10:
                n2w0 n2w0Var = (n2w0) obj2;
                bzs0 bzs0Var = n2w0.h2;
                ((Throwable) obj).getClass();
                sje sjeVar = n2w0Var.c2;
                if (sjeVar != null) {
                    sac.V(sjeVar, m2w0.f21085a, null, null, new lvv0(n2w0Var, null), 14);
                }
                return Unit.f46060a;
            case 11:
                TelephonyManager telephonyManager = (TelephonyManager) obj2;
                n7w0 n7w0Var = (n7w0) obj;
                n7w0Var.getClass();
                n7w0Var.a(telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null, "operator");
                n7w0Var.a(telephonyManager != null ? telephonyManager.getSimCountryIso() : null, "simCountry");
                n7w0Var.a(Long.valueOf(TrafficStats.getTotalTxBytes()), "TotalTxBytes");
                n7w0Var.a(Long.valueOf(TrafficStats.getTotalRxBytes()), "TotalRxBytes");
                return Unit.f46060a;
            case 12:
                Intent intent = (Intent) obj2;
                n7w0 n7w0Var2 = (n7w0) obj;
                n7w0Var2.getClass();
                if (intent != null) {
                    n7w0Var2.a(Integer.valueOf(intent.getIntExtra("level", -1)), "level");
                    n7w0Var2.a(Boolean.valueOf(intent.getIntExtra(CommonConstant.KEY_STATUS, -1) == 2), "charging");
                    n7w0Var2.a(Integer.valueOf(intent.getIntExtra("plugged", -1)), "plugged");
                    n7w0Var2.a(Integer.valueOf(intent.getIntExtra("health", -1)), "health");
                    n7w0Var2.a(intent.getStringExtra("technology"), "technology");
                    n7w0Var2.a(Integer.valueOf(intent.getIntExtra("temperature", -1)), "temperature");
                    n7w0Var2.a(Integer.valueOf(intent.getIntExtra("voltage", -1)), "voltage");
                }
                return Unit.f46060a;
            case 13:
                AudioManager audioManager = (AudioManager) obj2;
                n7w0 n7w0Var3 = (n7w0) obj;
                n7w0Var3.getClass();
                n7w0Var3.a(Integer.valueOf(audioManager.getRingerMode()), "ringerMode");
                n7w0Var3.a(Integer.valueOf(audioManager.getStreamVolume(2)), "streamRing");
                n7w0Var3.a(Integer.valueOf(audioManager.getStreamVolume(3)), "streamMusic");
                n7w0Var3.a(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), "sampleRate");
                n7w0Var3.a(audioManager.getProperty("android.media.property.SUPPORT_MIC_NEAR_ULTRASOUND"), "supportMicUltrasound");
                n7w0Var3.a(audioManager.getProperty("android.media.property.SUPPORT_SPEAKER_NEAR_ULTRASOUND"), "supportSpeakerUltrasound");
                n7w0Var3.a(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), "bufferFrames");
                return Unit.f46060a;
            case 14:
                StatFs statFs = (StatFs) obj2;
                n7w0 n7w0Var4 = (n7w0) obj;
                n7w0Var4.getClass();
                n7w0Var4.a(statFs != null ? Long.valueOf(statFs.getBlockSizeLong()) : null, "blockSize");
                n7w0Var4.a(statFs != null ? Long.valueOf(statFs.getBlockCountLong()) : null, "blockCount");
                n7w0Var4.a(Environment.getExternalStorageState(), com.huawei.hms.support.api.entity.common.CommonConstant.ReqAccessTokenParam.STATE_LABEL);
                n7w0Var4.a(Boolean.valueOf(Environment.isExternalStorageEmulated()), "emulated");
                return Unit.f46060a;
            default:
                PackageInfo packageInfo = (PackageInfo) obj2;
                n7w0 n7w0Var5 = (n7w0) obj;
                n7w0Var5.getClass();
                n7w0Var5.a(packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null, "firstInstallTime");
                n7w0Var5.a(packageInfo != null ? Long.valueOf(packageInfo.lastUpdateTime) : null, "lastUpdateTime");
                try {
                    e0g0 e0g0Var = j0g0.b;
                    Object obj3 = oav.d;
                    g0g0Var = oav.class;
                    break;
                } catch (Throwable th3) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th3);
                }
                n7w0Var5.a(Boolean.valueOf(!(g0g0Var instanceof g0g0)), "googlePlayServicesAvailable");
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gdv0(Object obj, byte b) {
        this.f11122a = b;
        this.b = obj;
    }
}
