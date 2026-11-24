package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1tSDK implements AFh1wSDK {
    private AFh1ySDK AFKeystoreWrapper;
    private AFh1vSDK AFLogger;
    private AFh1zSDK d;
    private final AFc1bSDK registerClient;

    public AFh1tSDK(AFc1bSDK aFc1bSDK) {
        aFc1bSDK.getClass();
        this.registerClient = aFc1bSDK;
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void AFKeystoreWrapper() {
        AFh1zSDK aFh1zSDK = this.d;
        if (aFh1zSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1zSDK);
            this.d = null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.appsflyer.internal.AFh1wSDK
    public final void AFLogger() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = this.AFLogger;
        if (aFh1vSDK == null) {
            aFh1vSDK = new AFh1vSDK(this.registerClient);
            this.AFLogger = aFh1vSDK;
        }
        aFh1vSDK.getClass();
        aFLogger.registerClient(aFh1vSDK);
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void d() {
        AFh1ySDK aFh1ySDK = this.AFKeystoreWrapper;
        if (aFh1ySDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1ySDK);
            this.AFKeystoreWrapper = null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.appsflyer.internal.AFh1wSDK
    public final void e() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1zSDK aFh1zSDK = this.d;
        if (aFh1zSDK == null) {
            AFc1iSDK aFc1iSDKAFLogger = this.registerClient.AFLogger();
            aFc1iSDKAFLogger.getClass();
            aFh1zSDK = new AFh1zSDK(aFc1iSDKAFLogger);
            this.d = aFh1zSDK;
        }
        aFLogger.registerClient(aFh1zSDK);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.appsflyer.internal.AFh1wSDK
    public final void registerClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1ySDK aFh1ySDK = this.AFKeystoreWrapper;
        if (aFh1ySDK == null) {
            aFh1ySDK = new AFh1ySDK(this.registerClient);
            this.AFKeystoreWrapper = aFh1ySDK;
        }
        aFh1ySDK.getClass();
        aFLogger.registerClient(aFh1ySDK);
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void unregisterClient() {
        AFh1vSDK aFh1vSDK = this.AFLogger;
        if (aFh1vSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFLoggerBase.v$default(aFLogger, LogTag.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1vSDK);
            this.AFLogger = null;
        }
    }
}
