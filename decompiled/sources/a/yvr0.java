package a;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class yvr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ zvr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yvr0(zvr0 zvr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = zvr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zvr0 zvr0Var = this.j;
        switch (b) {
            case 0:
                return new yvr0(zvr0Var, yjeVar, (byte) 0);
            default:
                return new yvr0(zvr0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((yvr0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws kzp {
        Object value;
        uvr0 uvr0Var;
        byte b = this.i;
        zvr0 zvr0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                nv20 nv20Var = zvr0Var.t;
                String str = ((uvr0) zvr0Var.D()).f;
                String str2 = ((uvr0) zvr0Var.D()).g;
                nv20Var.getClass();
                afm0 afm0Var = (afm0) ((nvu) nv20Var.f24171a).c;
                try {
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    DownloadManager.Request request = new DownloadManager.Request(uri);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
                    Object systemService = ((us00) afm0Var.b).getSystemService("download");
                    systemService.getClass();
                    ((DownloadManager) systemService).enqueue(request);
                    zvr0Var.G(new rvr0(new xdk0(pek0.f26859a, zvr0Var.x.b.a(R.string.show_loading_document_message, Arrays.copyOf(new Object[0], 0)), null, null, null, new Integer(R.drawable.ic_glyph_download), 92)));
                    return Unit.f46060a;
                } catch (Exception unused) {
                    throw new kzp();
                }
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = zvr0.E;
                p7m0 p7m0Var = zvr0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    uvr0Var = (uvr0) value;
                    zvr0Var.f.getClass();
                } while (!p7m0Var.m(value, uvr0.a(uvr0Var, vvr0.a(uvr0Var.f36362a, null, null, crq0.f4858a, 3), nlr0.f23742a, false, 0, 0L, null, null, null, 508)));
                return Unit.f46060a;
        }
    }
}
