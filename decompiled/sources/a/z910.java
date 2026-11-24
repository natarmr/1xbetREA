package a;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z910 implements kb10 {
    @Override // a.kb10
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        z910 z910Var = LottieAnimationView.q;
        Matrix matrix = cut0.f5002a;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            xv00.c("Unable to load composition.", th);
        } else {
            hny.q("Unable to parse composition", th);
        }
    }
}
