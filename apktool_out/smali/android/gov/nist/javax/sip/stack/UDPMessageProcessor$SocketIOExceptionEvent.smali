.class Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor$SocketIOExceptionEvent;
.super Landroid/javax/sip/IOExceptionEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SocketIOExceptionEvent"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xacdca8251406350L


# instance fields
.field private final msg:Ljava/lang/String;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;Ljava/lang/String;)V
    .locals 3

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor$SocketIOExceptionEvent;->this$0:Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;

    .line 2
    .line 3
    iget-object v0, p1, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->sock:Ljava/net/DatagramSocket;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->getLocalAddress()Ljava/net/InetAddress;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1}, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;->access$000(Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p1, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->transport:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p0, p1, v0, v1, v2}, Landroid/javax/sip/IOExceptionEvent;-><init>(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor$SocketIOExceptionEvent;->msg:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/UDPMessageProcessor$SocketIOExceptionEvent;->msg:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
