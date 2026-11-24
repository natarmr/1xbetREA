.class Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer$DefaultTimerTask;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DefaultTimerTask"
.end annotation


# instance fields
.field private task:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer;Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer$DefaultTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer$DefaultTimerTask;->task:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 7
    .line 8
    invoke-virtual {p2, p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->setSipTimerTask(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public cancel()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer$DefaultTimerTask;->task:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->cleanUpBeforeCancel()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer$DefaultTimerTask;->task:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 10
    .line 11
    :cond_0
    invoke-super {p0}, Ljava/util/TimerTask;->cancel()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer$DefaultTimerTask;->task:Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->runTask()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 11
    .line 12
    const-string v1, "SIP stack timer task failed due to exception:"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
