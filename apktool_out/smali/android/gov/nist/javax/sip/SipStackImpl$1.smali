.class Landroid/gov/nist/javax/sip/SipStackImpl$1;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/SipStackImpl;-><init>(Ljava/util/Properties;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/SipStackImpl;

.field final synthetic val$thisStack:Landroid/javax/sip/SipStack;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/SipStackImpl;Landroid/javax/sip/SipStack;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/SipStackImpl$1;->this$0:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 2
    .line 3
    iput-object p2, p0, Landroid/gov/nist/javax/sip/SipStackImpl$1;->val$thisStack:Landroid/javax/sip/SipStack;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x64

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl$1;->this$0:Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 7
    .line 8
    iget-object v0, v0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 9
    .line 10
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl$1;->val$thisStack:Landroid/javax/sip/SipStack;

    .line 11
    .line 12
    invoke-interface {v0, p0}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->init(Landroid/javax/sip/SipStack;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception p0

    .line 17
    invoke-static {}, Landroid/gov/nist/javax/sip/SipStackImpl;->access$000()Landroid/gov/nist/core/StackLogger;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "Error intializing SIPEventInterceptor"

    .line 22
    .line 23
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
