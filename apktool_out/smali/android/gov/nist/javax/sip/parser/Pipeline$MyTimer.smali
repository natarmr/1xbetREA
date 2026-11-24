.class Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/parser/Pipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyTimer"
.end annotation


# instance fields
.field private isCancelled:Z

.field pipeline:Landroid/gov/nist/javax/sip/parser/Pipeline;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/parser/Pipeline;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/Pipeline;Landroid/gov/nist/javax/sip/parser/Pipeline;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;->this$0:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;->pipeline:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public cleanUpBeforeCancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;->isCancelled:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;->pipeline:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 6
    .line 7
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->cleanUpBeforeCancel()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public runTask()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;->isCancelled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;->pipeline:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/Pipeline$MyTimer;->pipeline:Landroid/gov/nist/javax/sip/parser/Pipeline;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/parser/Pipeline;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p0

    .line 16
    invoke-static {p0}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
