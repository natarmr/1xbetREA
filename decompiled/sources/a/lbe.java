package a;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.consultantchat.presentation.dialogs.senderror.model.MessageErrorState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/lbe;", "La/nw5;", "La/kik;", "<init>", "()V", "a/qud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lbe extends nw5<kik> {
    public final nae0 e2 = ltt0.p(this, kbe.f18010a);
    public final es f2 = new es("INIT_MESSAGE_ERROR_STATE_KEY");
    public static final /* synthetic */ iiy[] h2 = {new j0d0(lbe.class, "binding", "getBinding()Lorg/xplatform/consultantchat/impl/databinding/DialogConsultantSendErrorMessageBinding;", 0), new ez40(lbe.class, "messageErrorStateList", "getMessageErrorStateList()Ljava/util/List;", 0)};
    public static final qud g2 = new qud();

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[EDGE_INSN: B:43:0x00b6->B:44:0x00b7 BREAK  A[LOOP:3: B:38:0x00a4->B:90:?]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[EDGE_INSN: B:55:0x00eb->B:56:0x00ec BREAK  A[LOOP:4: B:50:0x00d9->B:93:?]] */
    @Override // a.nw5
    public final void O0() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TextView textView = L0().c;
        List listU0 = U0();
        int i7 = 8;
        final byte b = 0;
        if (!listU0.isEmpty()) {
            Iterator it = listU0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 8;
                    break;
                } else if (((MessageErrorState) it.next()) instanceof MessageErrorState.Resend) {
                    i = 0;
                    break;
                }
            }
        } else {
            i = 8;
            break;
        }
        textView.setVisibility(i);
        TextView textView2 = L0().b;
        List listU1 = U0();
        if (!listU1.isEmpty()) {
            Iterator it2 = listU1.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i2 = 8;
                    break;
                } else if (((MessageErrorState) it2.next()) instanceof MessageErrorState.RemoveMessage) {
                    i2 = 0;
                    break;
                }
            }
        } else {
            i2 = 8;
            break;
        }
        textView2.setVisibility(i2);
        TextView textView3 = L0().d;
        List listU2 = U0();
        if (!listU2.isEmpty()) {
            Iterator it3 = listU2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    i3 = 8;
                    break;
                } else if (((MessageErrorState) it3.next()) instanceof MessageErrorState.RetryDownloading) {
                    i3 = 0;
                    break;
                }
            }
        } else {
            i3 = 8;
            break;
        }
        textView3.setVisibility(i3);
        View view = L0().g;
        final byte b2 = 1;
        if (U0().size() <= 1) {
            i4 = 8;
            break;
        }
        List listU3 = U0();
        if (!listU3.isEmpty()) {
            Iterator it4 = listU3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    i4 = 8;
                    break;
                } else if (((MessageErrorState) it4.next()) instanceof MessageErrorState.RetryDownloading) {
                    i4 = 0;
                    break;
                }
            }
        } else {
            i4 = 8;
            break;
        }
        view.setVisibility(i4);
        View view2 = L0().f;
        if (U0().size() <= 1) {
            i5 = 8;
            break;
        }
        List listU4 = U0();
        if (!listU4.isEmpty()) {
            Iterator it5 = listU4.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    i5 = 8;
                    break;
                } else if (((MessageErrorState) it5.next()) instanceof MessageErrorState.Resend) {
                    i5 = 0;
                    break;
                }
            }
        } else {
            i5 = 8;
            break;
        }
        view2.setVisibility(i5);
        TextView textView4 = L0().e;
        List listU5 = U0();
        if (!listU5.isEmpty()) {
            Iterator it6 = listU5.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    i6 = 8;
                    break;
                } else if (((MessageErrorState) it6.next()) instanceof MessageErrorState.RetryUploading) {
                    i6 = 0;
                    break;
                }
            }
        } else {
            i6 = 8;
            break;
        }
        textView4.setVisibility(i6);
        View view3 = L0().h;
        if (U0().size() > 1) {
            List listU6 = U0();
            if (!listU6.isEmpty()) {
                Iterator it7 = listU6.iterator();
                while (it7.hasNext()) {
                    if (((MessageErrorState) it7.next()) instanceof MessageErrorState.RetryUploading) {
                        i7 = 0;
                        break;
                    }
                }
            }
        }
        view3.setVisibility(i7);
        L0().d.setOnClickListener(new View.OnClickListener(this) { // from class: a.jbe
            public final /* synthetic */ lbe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b3 = b;
                lbe lbeVar = this.b;
                switch (b3) {
                    case 0:
                        qud qudVar = lbe.g2;
                        List listU7 = lbeVar.U0();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listU7) {
                            if (obj instanceof MessageErrorState.RetryDownloading) {
                                arrayList.add(obj);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    case 1:
                        qud qudVar2 = lbe.g2;
                        List listU8 = lbeVar.U0();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listU8) {
                            if (obj2 instanceof MessageErrorState.RetryUploading) {
                                arrayList2.add(obj2);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList2)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    case 2:
                        qud qudVar3 = lbe.g2;
                        List listU9 = lbeVar.U0();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listU9) {
                            if (obj3 instanceof MessageErrorState.RemoveMessage) {
                                arrayList3.add(obj3);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList3)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    default:
                        qud qudVar4 = lbe.g2;
                        List listU10 = lbeVar.U0();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listU10) {
                            if (obj4 instanceof MessageErrorState.Resend) {
                                arrayList4.add(obj4);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList4)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                }
            }
        });
        L0().e.setOnClickListener(new View.OnClickListener(this) { // from class: a.jbe
            public final /* synthetic */ lbe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b3 = b2;
                lbe lbeVar = this.b;
                switch (b3) {
                    case 0:
                        qud qudVar = lbe.g2;
                        List listU7 = lbeVar.U0();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listU7) {
                            if (obj instanceof MessageErrorState.RetryDownloading) {
                                arrayList.add(obj);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    case 1:
                        qud qudVar2 = lbe.g2;
                        List listU8 = lbeVar.U0();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listU8) {
                            if (obj2 instanceof MessageErrorState.RetryUploading) {
                                arrayList2.add(obj2);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList2)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    case 2:
                        qud qudVar3 = lbe.g2;
                        List listU9 = lbeVar.U0();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listU9) {
                            if (obj3 instanceof MessageErrorState.RemoveMessage) {
                                arrayList3.add(obj3);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList3)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    default:
                        qud qudVar4 = lbe.g2;
                        List listU10 = lbeVar.U0();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listU10) {
                            if (obj4 instanceof MessageErrorState.Resend) {
                                arrayList4.add(obj4);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList4)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                }
            }
        });
        final byte b3 = 2;
        L0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.jbe
            public final /* synthetic */ lbe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b4 = b3;
                lbe lbeVar = this.b;
                switch (b4) {
                    case 0:
                        qud qudVar = lbe.g2;
                        List listU7 = lbeVar.U0();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listU7) {
                            if (obj instanceof MessageErrorState.RetryDownloading) {
                                arrayList.add(obj);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    case 1:
                        qud qudVar2 = lbe.g2;
                        List listU8 = lbeVar.U0();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listU8) {
                            if (obj2 instanceof MessageErrorState.RetryUploading) {
                                arrayList2.add(obj2);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList2)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    case 2:
                        qud qudVar3 = lbe.g2;
                        List listU9 = lbeVar.U0();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listU9) {
                            if (obj3 instanceof MessageErrorState.RemoveMessage) {
                                arrayList3.add(obj3);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList3)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    default:
                        qud qudVar4 = lbe.g2;
                        List listU10 = lbeVar.U0();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listU10) {
                            if (obj4 instanceof MessageErrorState.Resend) {
                                arrayList4.add(obj4);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList4)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                }
            }
        });
        final byte b4 = 3;
        L0().c.setOnClickListener(new View.OnClickListener(this) { // from class: a.jbe
            public final /* synthetic */ lbe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b5 = b4;
                lbe lbeVar = this.b;
                switch (b5) {
                    case 0:
                        qud qudVar = lbe.g2;
                        List listU7 = lbeVar.U0();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listU7) {
                            if (obj instanceof MessageErrorState.RetryDownloading) {
                                arrayList.add(obj);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    case 1:
                        qud qudVar2 = lbe.g2;
                        List listU8 = lbeVar.U0();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listU8) {
                            if (obj2 instanceof MessageErrorState.RetryUploading) {
                                arrayList2.add(obj2);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList2)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    case 2:
                        qud qudVar3 = lbe.g2;
                        List listU9 = lbeVar.U0();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listU9) {
                            if (obj3 instanceof MessageErrorState.RemoveMessage) {
                                arrayList3.add(obj3);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList3)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                    default:
                        qud qudVar4 = lbe.g2;
                        List listU10 = lbeVar.U0();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listU10) {
                            if (obj4 instanceof MessageErrorState.Resend) {
                                arrayList4.add(obj4);
                            }
                        }
                        vcc.f0(i120.V(new Pair("ERROR_DIALOG_RESULT_VALUE", arrayList4)), lbeVar, "ERROR_DIALOG_RESULT_KEY");
                        lbeVar.x0();
                        break;
                }
            }
        });
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.root;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.bottom_file_title);
        strH.getClass();
        return strH;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final kik L0() {
        Object objN = this.e2.n(h2[0], this);
        objN.getClass();
        return (kik) objN;
    }

    public final List U0() {
        return this.f2.n(this, h2[1]);
    }
}
