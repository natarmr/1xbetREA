.class public abstract Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/ThreadAffinityIdentifier;


# instance fields
.field timerTask:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->timerTask:Ljava/lang/Object;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public cleanUpBeforeCancel()V
    .locals 0

    return-void
.end method

.method public getSipTimerTask()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->timerTask:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract runTask()V
.end method

.method public setSipTimerTask(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->timerTask:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method
