.class Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$1;
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


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$1;->this$1:Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask;

    .line 2
    .line 3
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$1;->val$nioTcpMessageChannel:Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTcpMessageProcessor$ProcessorTask$1;->val$nioTcpMessageChannel:Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/NioTcpMessageChannel;->triggerConnectSuccess()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
