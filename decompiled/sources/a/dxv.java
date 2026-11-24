package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"La/dxv;", "La/nw5;", "La/whq0;", "<init>", "()V", "a/u70", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dxv extends nw5<whq0> {
    public vlq0 g2;
    public ii i2;
    public static final /* synthetic */ iiy[] k2 = {new ez40(dxv.class, "maxPeriod", "getMaxPeriod()I", 0), new ez40(dxv.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new j0d0(dxv.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/TimeHidenDialogBinding;", 0)};
    public static final bst j2 = new bst();
    public final zz2 e2 = new zz2("BUNDLE_MAX_PERIOD");
    public final phf0 f2 = new phf0("EXTRA_REQUEST_KEY");
    public final nae0 h2 = ltt0.p(this, cxv.f5143a);

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.h2.n(k2[2], this);
        objN.getClass();
        return (whq0) objN;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.nw5
    public final void O0() {
        u70 u70Var = new u70(this, qx3.c(vlq0.values()));
        iiy[] iiyVarArr = k2;
        iiy iiyVar = iiyVarArr[2];
        nae0 nae0Var = this.h2;
        Object objN = nae0Var.n(iiyVar, this);
        objN.getClass();
        ((whq0) objN).b.setLayoutManager(new LinearLayoutManager(o0()));
        Object objN2 = nae0Var.n(iiyVarArr[2], this);
        objN2.getClass();
        ((whq0) objN2).b.setAdapter(u70Var);
        List listC = qx3.c(vlq0.values());
        if (this.e2.n(this, iiyVarArr[0]).intValue() <= 7) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                if (((vlq0) obj) != vlq0.f37640a) {
                    arrayList.add(obj);
                }
            }
            listC = arrayList;
        }
        u70Var.G(listC);
        ccq0.V(this, "CONFIRM_DIALOG_REQUEST_KEY", new bdv(this, (byte) 12));
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bxv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bxv bxvVar = (bxv) (ze3Var instanceof bxv ? ze3Var : null);
            if (bxvVar != null) {
                ii iiVar = bxvVar.f3394a;
                iiVar.getClass();
                this.i2 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(bxv.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.header;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.hide_history_for_new);
        string.getClass();
        return string;
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        dialogInterface.dismiss();
    }
}
