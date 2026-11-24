package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.net.ProxyInfo;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class thj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33965a;

    public /* synthetic */ thj0(byte b) {
        this.f33965a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 4;
        byte b2 = 2;
        byte b3 = 6;
        z = false;
        z = false;
        boolean z = false;
        switch (this.f33965a) {
            case 0:
                kxx kxxVar = (kxx) obj;
                kxxVar.getClass();
                kxxVar.e.setOnClickListener(null);
                return Unit.f46060a;
            case 1:
                ixx ixxVar = (ixx) obj;
                ixxVar.getClass();
                DsCellMiddleTitle dsCellMiddleTitle = ixxVar.c;
                dsCellMiddleTitle.setTitle((CharSequence) null);
                dsCellMiddleTitle.setSubtitle((CharSequence) null);
                ixxVar.d.setOnClickListener(null);
                return Unit.f46060a;
            case 2:
                lxx lxxVar = (lxx) obj;
                lxxVar.getClass();
                lxxVar.e.setOnClickListener(null);
                return Unit.f46060a;
            case 3:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new kzi0(cpVar, (byte) 5));
                return Unit.f46060a;
            case 4:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new kzi0(cpVar2, b));
                return Unit.f46060a;
            case 5:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 6:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 3, null, null, dj8.g, 6);
                return Unit.f46060a;
            case 7:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                for (int i = 0; i < 4; i++) {
                    hcz.e(hczVar2, null, null, uc9.m, 3);
                }
                return Unit.f46060a;
            case 8:
                Context context = (Context) obj;
                context.getClass();
                DsButton dsButton = new DsButton(new tje(context, R.style.DSButton_Large_Secondary), null, 6, 0);
                dsButton.setLoading(false);
                String string = context.getString(R.string.load_archive);
                string.getClass();
                dsButton.l(string);
                return dsButton;
            case 9:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new pgj0(cpVar3, cpVar3, b2));
                return Unit.f46060a;
            case 10:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new kzi0(cpVar4, b3));
                return Unit.f46060a;
            case 11:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 12:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 13:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 14:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                cpVar5.t(new kzi0(cpVar5, (byte) 7));
                return Unit.f46060a;
            case 15:
                di5 di5Var = (di5) obj;
                di5Var.getClass();
                if (di5Var.equals(ci5.f4395a)) {
                    return c2k0.f3628a;
                }
                if (di5Var instanceof bi5) {
                    return new d2k0(new xdk0(rek0.b, ((bi5) di5Var).f2642a, null, null, null, null, 124));
                }
                if (di5Var instanceof ai5) {
                    return new b2k0();
                }
                t9f.b();
                return null;
            case 16:
                NetworkInterface networkInterface = (NetworkInterface) obj;
                networkInterface.getClass();
                if (!networkInterface.isLoopback() && !networkInterface.isVirtual() && networkInterface.isUp()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                NetworkInterface networkInterface2 = (NetworkInterface) obj;
                networkInterface2.getClass();
                Enumeration<InetAddress> inetAddresses = networkInterface2.getInetAddresses();
                if (inetAddresses == null) {
                    return wun.f39799a;
                }
                ArrayList list = Collections.list(inetAddresses);
                list.getClass();
                return new sx3(list, (byte) 1);
            case 18:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(Response.OK, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(Response.OK, 0, null, 6), 2));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 20:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 21:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.g(hczVar3, 14, null, null, p8a.j, 6);
                return Unit.f46060a;
            case 22:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hcz.g(hczVar4, 14, null, null, q8a.e, 6);
                return Unit.f46060a;
            case 23:
                ((gwo) obj).getClass();
                return true;
            case 24:
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                rgk0 rgk0Var = (rgk0) obj;
                rgk0Var.getClass();
                return rgk0Var.f30442a + Separators.COLON + rgk0Var.b + Separators.SP;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                obj.getClass();
                try {
                    Object obj2 = obj.getClass().getDeclaredField("httpProxy").get(obj);
                    if (obj2 instanceof ProxyInfo) {
                        return (ProxyInfo) obj2;
                    }
                    return null;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ProxyInfo proxyInfo = (ProxyInfo) obj;
                proxyInfo.getClass();
                String host = proxyInfo.getHost();
                return Boolean.valueOf(!(host == null || host.length() == 0));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ProxyInfo proxyInfo2 = (ProxyInfo) obj;
                proxyInfo2.getClass();
                String host2 = proxyInfo2.getHost();
                host2.getClass();
                return new rgk0(host2, proxyInfo2.getPort());
            default:
                iiy[] iiyVarArr = tik0.Q1;
                ((View) obj).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ thj0(Object obj, byte b) {
        this.f33965a = b;
    }
}
