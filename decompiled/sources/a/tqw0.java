package a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tqw0 extends orw0 {
    public final /* synthetic */ byte e = 3;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqw0(cgp cgpVar, Activity activity, pow0 pow0Var) {
        super((wrw0) cgpVar.b, true);
        this.g = activity;
        this.h = pow0Var;
        this.f = cgpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // a.orw0
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle = null;
        yow0 yow0VarAsInterface = null;
        switch (this.e) {
            case 0:
                try {
                    Context context = (Context) this.g;
                    s0x.H(context);
                    String strX = iym0.x(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strX)) {
                        strX = iym0.x(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strX);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    wrw0 wrw0Var = (wrw0) this.f;
                    try {
                        yow0VarAsInterface = wow0.asInterface(ogn.c(context, (boolValueOf == null || !boolValueOf.booleanValue()) != false ? ogn.c : ogn.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (lgn e) {
                        wrw0Var.d(e, true, false);
                    }
                    wrw0Var.f = yow0VarAsInterface;
                    if (wrw0Var.f != null) {
                        int iA = ogn.a(context, ModuleDescriptor.MODULE_ID);
                        int iD = ogn.d(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iA, iD);
                        boolean z = Boolean.TRUE.equals(boolValueOf) || iD < iA;
                        long j = iMax;
                        wrw0Var.g = j;
                        zzdb zzdbVar = new zzdb(161000L, j, z, (Bundle) this.h, iym0.x(context));
                        Object[] objArr = wrw0Var.g >= 169;
                        yow0 yow0Var = wrw0Var.f;
                        if (objArr != true) {
                            s0x.H(yow0Var);
                            yow0Var.initialize(new aa60(context), zzdbVar, this.f25755a);
                        } else {
                            s0x.H(yow0Var);
                            yow0Var.initializeWithElapsedTime(new aa60(context), zzdbVar, this.f25755a, this.b);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((wrw0) this.f).d(e2, true, false);
                    return;
                }
                break;
            case 1:
                yow0 yow0Var2 = ((wrw0) this.f).f;
                s0x.H(yow0Var2);
                yow0Var2.getMaxUserProperties((String) this.g, (pow0) this.h);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                yow0 yow0Var3 = ((wrw0) ((cgp) this.f).b).f;
                s0x.H(yow0Var3);
                yow0Var3.onActivityCreatedByScionActivityInfo(zzdd.m((Activity) this.g), bundle, this.b);
                break;
            default:
                yow0 yow0Var4 = ((wrw0) ((cgp) this.f).b).f;
                s0x.H(yow0Var4);
                yow0Var4.onActivitySaveInstanceStateByScionActivityInfo(zzdd.m((Activity) this.g), (pow0) this.h, this.b);
                break;
        }
    }

    @Override // a.orw0
    public void b() {
        switch (this.e) {
            case 1:
                ((pow0) this.h).u(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqw0(cgp cgpVar, Bundle bundle, Activity activity) {
        super((wrw0) cgpVar.b, true);
        this.h = bundle;
        this.g = activity;
        this.f = cgpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqw0(wrw0 wrw0Var, Context context, Bundle bundle) {
        super(wrw0Var, true);
        this.g = context;
        this.h = bundle;
        this.f = wrw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqw0(wrw0 wrw0Var, String str, pow0 pow0Var) {
        super(wrw0Var, true);
        this.g = str;
        this.h = pow0Var;
        Objects.requireNonNull(wrw0Var);
        this.f = wrw0Var;
    }
}
