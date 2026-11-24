.class Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl$HandshakeWatchdog;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "HandshakeWatchdog"
.end annotation


# instance fields
.field socket:Ljava/net/Socket;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;


# direct methods
.method private constructor <init>(Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;Ljava/net/Socket;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl$HandshakeWatchdog;->this$0:Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl$HandshakeWatchdog;->socket:Ljava/net/Socket;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;Ljava/net/Socket;Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl$HandshakeWatchdog;-><init>(Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;Ljava/net/Socket;)V

    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public runTask()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v2, "closing socket "

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl$HandshakeWatchdog;->socket:Ljava/net/Socket;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " on sslhandshaketimeout"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl$HandshakeWatchdog;->socket:Ljava/net/Socket;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "couldn\'t close socket on sslhandshaketimeout"

    .line 40
    .line 41
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v3, "socket closed "

    .line 51
    .line 52
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/HandshakeCompletedListenerImpl$HandshakeWatchdog;->socket:Ljava/net/Socket;

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
