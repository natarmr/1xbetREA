.class Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->connect(Ljava/nio/channels/SelectionKey;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;

.field final synthetic val$nioTcpMessageChannel:Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

.field final synthetic val$socketChannel:Ljava/nio/channels/SocketChannel;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;Ljava/nio/channels/SocketChannel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;->this$1:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;

    .line 2
    .line 3
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;->val$nioTcpMessageChannel:Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 4
    .line 5
    iput-object p3, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;->val$socketChannel:Ljava/nio/channels/SocketChannel;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;->val$nioTcpMessageChannel:Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;->this$1:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;

    .line 4
    .line 5
    iget-object v1, v1, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;->this$0:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;

    .line 6
    .line 7
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;->access$100(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$2;->val$socketChannel:Ljava/nio/channels/SocketChannel;

    .line 12
    .line 13
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/util/Queue;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->triggerConnectFailure(Ljava/util/Queue;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
