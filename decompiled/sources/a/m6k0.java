package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.javax.sip.ClientTransaction;
import android.javax.sip.Dialog;
import android.javax.sip.DialogTerminatedEvent;
import android.javax.sip.IOExceptionEvent;
import android.javax.sip.RequestEvent;
import android.javax.sip.ResponseEvent;
import android.javax.sip.ServerTransaction;
import android.javax.sip.SipListener;
import android.javax.sip.SipProvider;
import android.javax.sip.TimeoutEvent;
import android.javax.sip.TransactionTerminatedEvent;
import android.javax.sip.address.Address;
import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.Header;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class m6k0 implements SipListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SipProvider f21275a;
    public final r6k0 b;
    public final g090 c;
    public final jt2 d;
    public final AtomicReference e;
    public final AtomicReference f;
    public final sd60 g;

    public m6k0(jt2 jt2Var, g090 g090Var, r6k0 r6k0Var, SipProvider sipProvider, String str, AtomicReference atomicReference, AtomicReference atomicReference2) {
        r6k0Var.getClass();
        jt2Var.getClass();
        str.getClass();
        this.f21275a = sipProvider;
        this.b = r6k0Var;
        this.c = g090Var;
        this.d = jt2Var;
        this.e = atomicReference;
        this.f = atomicReference2;
        this.g = new sd60(jt2Var, g090Var, r6k0Var, sipProvider, str, atomicReference, atomicReference2);
    }

    public static void c(ResponseEvent responseEvent) {
        Response response = responseEvent.getResponse();
        response.getClass();
        Dialog dialog = responseEvent.getDialog();
        if (dialog == null) {
            ClientTransaction clientTransaction = responseEvent.getClientTransaction();
            dialog = clientTransaction != null ? clientTransaction.getDialog() : null;
            if (dialog == null) {
                return;
            }
        }
        Header header = response.getHeader("CSeq");
        CSeqHeader cSeqHeader = header instanceof CSeqHeader ? (CSeqHeader) header : null;
        if (cSeqHeader == null) {
            return;
        }
        Request requestCreateAck = dialog.createAck(cSeqHeader.getSeqNumber());
        requestCreateAck.getClass();
        dialog.sendAck(requestCreateAck);
    }

    public final void a() {
        AtomicReference atomicReference = this.e;
        SipListener sipListener = ((y5k0) atomicReference.get()).c;
        if (sipListener != null) {
            try {
                this.f21275a.removeSipListener(sipListener);
            } catch (Exception unused) {
            }
            atomicReference.getAndUpdate(new w5k0((byte) 9));
        }
    }

    public final void b(x6k0 x6k0Var) {
        mz40 mz40Var = (mz40) this.f.get();
        if (mz40Var != null) {
            mz40Var.g(x6k0Var);
        }
    }

    @Override // android.javax.sip.SipListener
    public final void processDialogTerminated(DialogTerminatedEvent dialogTerminatedEvent) {
        dialogTerminatedEvent.getClass();
        Dialog dialog = dialogTerminatedEvent.getDialog();
        AtomicReference atomicReference = this.e;
        if (Intrinsics.d(dialog, ((y5k0) atomicReference.get()).f42052a) && !((y5k0) atomicReference.get()).t && m7x.N(atomicReference)) {
            b(u6k0.f35139a);
            a();
            atomicReference.getAndUpdate(new w5k0((byte) 4));
            this.f.set(null);
        }
    }

    @Override // android.javax.sip.SipListener
    public final void processIOException(IOExceptionEvent iOExceptionEvent) {
        iOExceptionEvent.getClass();
        AtomicReference atomicReference = this.e;
        if (((y5k0) atomicReference.get()).f) {
            m7x.u(atomicReference);
        } else {
            b(new w6k0("IO error"));
        }
    }

    @Override // android.javax.sip.SipListener
    public final void processRequest(RequestEvent requestEvent) {
        requestEvent.getClass();
        Request request = requestEvent.getRequest();
        request.getClass();
        String method = request.getMethod();
        method.getClass();
        int iHashCode = method.hashCode();
        jt2 jt2Var = this.d;
        AtomicReference atomicReference = this.e;
        r6k0 r6k0Var = this.b;
        SipProvider sipProvider = this.f21275a;
        try {
            switch (iHashCode) {
                case -2130369783:
                    if (method.equals("INVITE")) {
                        Dialog dialog = requestEvent.getDialog();
                        Dialog dialog2 = ((y5k0) atomicReference.get()).f42052a;
                        if (dialog != null && dialog.equals(dialog2) && ((y5k0) atomicReference.get()).f) {
                            try {
                                ServerTransaction serverTransaction = requestEvent.getServerTransaction();
                                if (serverTransaction == null) {
                                    serverTransaction = sipProvider.getNewServerTransaction(requestEvent.getRequest());
                                    serverTransaction.getClass();
                                }
                                Response responseCreateResponse = r6k0Var.e().createResponse(Response.OK, requestEvent.getRequest());
                                responseCreateResponse.getClass();
                                String strE = this.c.e(((y5k0) atomicReference.get()).j, ((y5k0) atomicReference.get()).i, ((y5k0) atomicReference.get()).n);
                                ContentTypeHeader contentTypeHeaderCreateContentTypeHeader = r6k0Var.d().createContentTypeHeader(SIPServerTransaction.CONTENT_TYPE_APPLICATION, SIPServerTransaction.CONTENT_SUBTYPE_SDP);
                                contentTypeHeaderCreateContentTypeHeader.getClass();
                                byte[] bytes = strE.getBytes(Charsets.UTF_8);
                                bytes.getClass();
                                responseCreateResponse.setContent(bytes, contentTypeHeaderCreateContentTypeHeader);
                                String str = (String) r6k0Var.f.get();
                                if (str == null) {
                                    str = ((y5k0) atomicReference.get()).i;
                                }
                                Integer num = (Integer) r6k0Var.g.get();
                                int iIntValue = num != null ? num.intValue() : r6k0Var.i();
                                String strM = n7x.M(((y5k0) atomicReference.get()).n);
                                Address addressCreateAddress = r6k0Var.c().createAddress("sip:" + strM + Separators.AT + str + Separators.COLON + iIntValue);
                                addressCreateAddress.getClass();
                                responseCreateResponse.addHeader(r6k0Var.d().createContactHeader(addressCreateAddress));
                                serverTransaction.sendResponse(responseCreateResponse);
                            } catch (Exception e) {
                                jt2Var.f17078a.a("incomingReInviteFailed", e.getClass().getSimpleName());
                                return;
                            }
                        } else {
                            jt2Var.f17078a.a("incomingInviteIgnored", "out-of-dialog INVITE ignored");
                        }
                        break;
                    }
                    break;
                case -531492226:
                    if (method.equals("OPTIONS")) {
                        ServerTransaction serverTransaction2 = requestEvent.getServerTransaction();
                        if (serverTransaction2 == null) {
                            serverTransaction2 = sipProvider.getNewServerTransaction(requestEvent.getRequest());
                            serverTransaction2.getClass();
                        }
                        Response responseCreateResponse2 = r6k0Var.e().createResponse(Response.METHOD_NOT_ALLOWED, requestEvent.getRequest());
                        responseCreateResponse2.getClass();
                        serverTransaction2.sendResponse(responseCreateResponse2);
                        break;
                    }
                    break;
                case 64617:
                    method.equals("ACK");
                    break;
                case 66254:
                    if (method.equals("BYE")) {
                        if (!m7x.N(atomicReference)) {
                            ServerTransaction serverTransaction3 = requestEvent.getServerTransaction();
                            if (serverTransaction3 == null) {
                                serverTransaction3 = sipProvider.getNewServerTransaction(requestEvent.getRequest());
                                serverTransaction3.getClass();
                            }
                            Response responseCreateResponse3 = r6k0Var.e().createResponse(Response.OK, requestEvent.getRequest());
                            responseCreateResponse3.getClass();
                            serverTransaction3.sendResponse(responseCreateResponse3);
                        } else {
                            AtomicReference atomicReference2 = this.f;
                            u6k0 u6k0Var = u6k0.f35139a;
                            try {
                                ServerTransaction serverTransaction4 = requestEvent.getServerTransaction();
                                if (serverTransaction4 == null) {
                                    serverTransaction4 = sipProvider.getNewServerTransaction(requestEvent.getRequest());
                                    serverTransaction4.getClass();
                                }
                                Response responseCreateResponse4 = r6k0Var.e().createResponse(Response.OK, requestEvent.getRequest());
                                responseCreateResponse4.getClass();
                                serverTransaction4.sendResponse(responseCreateResponse4);
                                jt2Var.f17078a.a("incomingBye", "Received BYE, sent 200 OK");
                                b(u6k0Var);
                                a();
                                atomicReference.getAndUpdate(new w5k0((byte) 5));
                                atomicReference2.set(null);
                            } catch (Exception e2) {
                                jt2Var.f17078a.a("incomingByeFailed", e2.getClass().getSimpleName());
                                b(u6k0Var);
                                a();
                                atomicReference.getAndUpdate(new w5k0((byte) 6));
                                atomicReference2.set(null);
                                return;
                            }
                        }
                    }
                    break;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.javax.sip.SipListener
    public final void processResponse(ResponseEvent responseEvent) {
        byte b;
        String str;
        Object next;
        String str2;
        responseEvent.getClass();
        Response response = responseEvent.getResponse();
        response.getClass();
        int statusCode = response.getStatusCode();
        String reasonPhrase = response.getReasonPhrase();
        Header header = response.getHeader("CSeq");
        CSeqHeader cSeqHeader = header instanceof CSeqHeader ? (CSeqHeader) header : null;
        if (cSeqHeader == null) {
            return;
        }
        String method = cSeqHeader.getMethod();
        method.getClass();
        if (method.equals("INVITE")) {
            jt2 jt2Var = this.d;
            n6k0 n6k0Var = jt2Var.f17078a;
            n6k0 n6k0Var2 = jt2Var.f17078a;
            n6k0Var.a("inviteResponse", "statusCode " + statusCode + " reasonPhrase " + reasonPhrase);
            if (statusCode == 100 || statusCode == 180) {
                return;
            }
            byte b2 = 1;
            AtomicReference atomicReference = this.e;
            if (statusCode == 200) {
                try {
                    Response response2 = responseEvent.getResponse();
                    response2.getClass();
                    if (((y5k0) atomicReference.get()).f) {
                        if (!((y5k0) atomicReference.get()).u) {
                            atomicReference.getAndUpdate(new w5k0((byte) 10));
                            c(responseEvent);
                            return;
                        }
                        try {
                            m7x.u(atomicReference);
                            c(responseEvent);
                            n6k0Var2.a("sessionRefreshOk", "re-INVITE 200 OK, ACK sent");
                            return;
                        } catch (Exception unused) {
                            m7x.u(atomicReference);
                            return;
                        }
                    }
                    Dialog dialog = responseEvent.getDialog();
                    if (dialog == null) {
                        ClientTransaction clientTransaction = responseEvent.getClientTransaction();
                        dialog = clientTransaction != null ? clientTransaction.getDialog() : null;
                    }
                    if (dialog == null) {
                        b(new w6k0("No dialog in 200 OK"));
                        return;
                    }
                    atomicReference.getAndUpdate(new kmk(dialog, (byte) 2));
                    Object content = response2.getContent();
                    if (content == null) {
                        b = -1;
                    } else if (content instanceof String) {
                        b = 0;
                    } else {
                        b = content instanceof byte[] ? (byte) 1 : (byte) -2;
                    }
                    if (b != 0) {
                        str = b != 1 ? null : new String((byte[]) content, Charsets.UTF_8);
                    } else {
                        str = (String) content;
                    }
                    if (str != null) {
                        Iterator it = StringsKt.Z(str).iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!kotlin.text.c.x((String) next, "m=audio ", false));
                        String str3 = (String) next;
                        final Integer intOrNull = str3 != null ? StringsKt.toIntOrNull(StringsKt.r0(StringsKt.m0(str3, "m=audio ", str3), Separators.SP)) : null;
                        final String strG = gne0.g(str);
                        if (intOrNull != null && strG != null) {
                            final int iE = gne0.e(str);
                            atomicReference.getAndUpdate(new UnaryOperator() { // from class: a.l6k0
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    y5k0 y5k0Var = (y5k0) obj;
                                    y5k0Var.getClass();
                                    int iIntValue = intOrNull.intValue();
                                    int i = iE;
                                    if (i == -1) {
                                        i = y5k0Var.s;
                                    }
                                    return y5k0.a(y5k0Var, null, null, null, false, 0, null, null, 0, null, null, null, null, null, null, strG, iIntValue, i, false, 1638399);
                                }
                            });
                        }
                    }
                    c(responseEvent);
                    n6k0Var2.a("callEstablished", "Call established, ACK sent");
                    Object obj = atomicReference.get();
                    obj.getClass();
                    y5k0 y5k0Var = (y5k0) obj;
                    String str4 = y5k0Var.q;
                    if (str4 == null) {
                        str4 = "";
                    }
                    b(new v6k0(str4, y5k0Var.r, y5k0Var.s));
                    return;
                } catch (Exception e) {
                    n6k0Var2.a("inviteOkFailed", e.getClass().getSimpleName());
                    b(new w6k0("Failed to establish call"));
                    return;
                }
            }
            if (statusCode != 401 && statusCode != 407) {
                if (((y5k0) atomicReference.get()).u) {
                    m7x.u(atomicReference);
                    return;
                }
                if (statusCode == 403) {
                    str2 = "Call failed: 403 Forbidden";
                } else if (statusCode == 404) {
                    str2 = "Call failed: 404 Not Found";
                } else if (statusCode == 480) {
                    str2 = "Call failed: 480 Temporarily Unavailable";
                } else if (statusCode == 486) {
                    str2 = "Call failed: 486 Busy";
                } else if (statusCode == 488) {
                    str2 = "Call failed: 488 Not Acceptable Here";
                } else if (statusCode == 500) {
                    str2 = "Call failed: 500 Server Error";
                } else if (statusCode == 503) {
                    str2 = "Call failed: 503 Service Unavailable";
                } else if (statusCode != 603) {
                    str2 = "Unknown response: " + statusCode + Separators.SP + reasonPhrase;
                } else {
                    str2 = "Call failed: 603 Declined";
                }
                b(new w6k0(str2));
                return;
            }
            if (((y5k0) atomicReference.get()).u) {
                m7x.u(atomicReference);
                return;
            }
            if (((y5k0) atomicReference.get()).e) {
                atomicReference.getAndUpdate(new w5k0((byte) 7));
                b(new w6k0("Auth failed"));
                return;
            }
            atomicReference.getAndUpdate(new w5k0((byte) 8));
            sd60 sd60Var = this.g;
            AtomicReference atomicReference2 = (AtomicReference) sd60Var.c;
            AtomicReference atomicReference3 = (AtomicReference) sd60Var.b;
            try {
                mmk mmkVarA = wti.A(response);
                if (mmkVarA == null) {
                    w6k0 w6k0Var = new w6k0("Auth challenge failed: no authenticate header");
                    mz40 mz40Var = (mz40) atomicReference2.get();
                    if (mz40Var != null) {
                        mz40Var.g(w6k0Var);
                    }
                } else {
                    Object obj2 = atomicReference3.get();
                    obj2.getClass();
                    y5k0 y5k0Var2 = (y5k0) obj2;
                    String str5 = y5k0Var2.n;
                    String str6 = y5k0Var2.i;
                    String str7 = y5k0Var2.o;
                    String str8 = str7 == null ? str6 : str7;
                    ClientTransaction newClientTransaction = ((SipProvider) sd60Var.d).getNewClientTransaction(((pox) sd60Var.i).b(y5k0Var2.h, y5k0Var2.i, str5, str8, y5k0Var2.p, y5k0Var2.m, y5k0Var2.l, mmkVarA, ((wti) sd60Var.h).c(str5, (String) sd60Var.g, "INVITE", "sip:" + y5k0Var2.h, mmkVarA), ((g090) sd60Var.e).e(y5k0Var2.j, str6, y5k0Var2.n), y5k0Var2.k, response.getStatusCode()));
                    newClientTransaction.getClass();
                    newClientTransaction.sendRequest();
                    atomicReference3.getAndUpdate(new v5k0(newClientTransaction, b2));
                    ((jt2) sd60Var.f).f17078a.a("inviteWithAuthSent", "INVITE with Digest Auth sent");
                }
            } catch (Exception unused2) {
                atomicReference3.getAndUpdate(new w5k0((byte) 3));
                w6k0 w6k0Var2 = new w6k0("Auth failed");
                mz40 mz40Var2 = (mz40) atomicReference2.get();
                if (mz40Var2 != null) {
                    mz40Var2.g(w6k0Var2);
                }
            }
        }
    }

    @Override // android.javax.sip.SipListener
    public final void processTimeout(TimeoutEvent timeoutEvent) {
        timeoutEvent.getClass();
        AtomicReference atomicReference = this.e;
        if (((y5k0) atomicReference.get()).f) {
            m7x.u(atomicReference);
        } else {
            b(new w6k0("Call timeout"));
        }
    }

    @Override // android.javax.sip.SipListener
    public final void processTransactionTerminated(TransactionTerminatedEvent transactionTerminatedEvent) {
        transactionTerminatedEvent.getClass();
    }
}
