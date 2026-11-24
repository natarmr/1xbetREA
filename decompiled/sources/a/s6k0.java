package a;

import android.javax.sip.DialogTerminatedEvent;
import android.javax.sip.IOExceptionEvent;
import android.javax.sip.RequestEvent;
import android.javax.sip.ResponseEvent;
import android.javax.sip.SipListener;
import android.javax.sip.TimeoutEvent;
import android.javax.sip.TransactionTerminatedEvent;
import android.javax.sip.header.Header;
import android.javax.sip.header.ViaHeader;
import android.javax.sip.message.Response;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class s6k0 implements SipListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f31708a;
    public final r6k0 b;
    public final jt2 c;
    public final AtomicBoolean d;
    public final bg0 e;

    public s6k0(AtomicReference atomicReference, r6k0 r6k0Var, jt2 jt2Var, AtomicBoolean atomicBoolean, bg0 bg0Var) {
        r6k0Var.getClass();
        jt2Var.getClass();
        this.f31708a = atomicReference;
        this.b = r6k0Var;
        this.c = jt2Var;
        this.d = atomicBoolean;
        this.e = bg0Var;
    }

    public final void a(a7k0 a7k0Var) {
        mz40 mz40Var = (mz40) this.f31708a.get();
        if (mz40Var != null) {
            mz40Var.g(a7k0Var);
        }
    }

    @Override // android.javax.sip.SipListener
    public final void processDialogTerminated(DialogTerminatedEvent dialogTerminatedEvent) {
        dialogTerminatedEvent.getClass();
    }

    @Override // android.javax.sip.SipListener
    public final void processIOException(IOExceptionEvent iOExceptionEvent) {
        iOExceptionEvent.getClass();
        this.d.set(false);
        a(new y6k0(false));
    }

    @Override // android.javax.sip.SipListener
    public final void processRequest(RequestEvent requestEvent) {
        requestEvent.getClass();
    }

    @Override // android.javax.sip.SipListener
    public final void processResponse(ResponseEvent responseEvent) {
        responseEvent.getClass();
        Response response = responseEvent.getResponse();
        response.getClass();
        int statusCode = response.getStatusCode();
        String reasonPhrase = response.getReasonPhrase();
        Header header = response.getHeader("Via");
        ViaHeader viaHeader = header instanceof ViaHeader ? (ViaHeader) header : null;
        if (viaHeader == null) {
            return;
        }
        String parameter = viaHeader.getParameter("received");
        int rPort = viaHeader.getRPort();
        r6k0 r6k0Var = this.b;
        if (parameter != null && parameter.length() != 0) {
            r6k0Var.f.set(parameter);
            r6k0Var.getClass();
        }
        if (rPort > 0) {
            r6k0Var.g.set(Integer.valueOf(rPort));
        }
        this.c.f17078a.a("registerResponse", "statusCode " + statusCode + " reasonPhrase " + reasonPhrase);
        AtomicBoolean atomicBoolean = this.d;
        if (statusCode == 200) {
            atomicBoolean.set(false);
            a(z6k0.f43873a);
            return;
        }
        if (statusCode != 401) {
            if (statusCode == 486 || statusCode == 503) {
                atomicBoolean.set(false);
                a(new y6k0(false));
                return;
            } else if (statusCode != 407) {
                if (statusCode != 408) {
                    atomicBoolean.set(false);
                    a(new y6k0(false));
                    return;
                } else {
                    atomicBoolean.set(false);
                    a(new y6k0(true));
                    return;
                }
            }
        }
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            a(new y6k0(false));
        } else {
            atomicBoolean.set(true);
            this.e.invoke(response);
        }
    }

    @Override // android.javax.sip.SipListener
    public final void processTimeout(TimeoutEvent timeoutEvent) {
        timeoutEvent.getClass();
        this.d.set(false);
        a(new y6k0(true));
    }

    @Override // android.javax.sip.SipListener
    public final void processTransactionTerminated(TransactionTerminatedEvent transactionTerminatedEvent) {
        transactionTerminatedEvent.getClass();
    }
}
