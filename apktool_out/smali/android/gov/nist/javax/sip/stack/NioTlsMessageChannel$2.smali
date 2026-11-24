.class Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->sendMessage([BLjava/net/InetAddress;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

.field final synthetic val$receiverAddress:Ljava/net/InetAddress;

.field final synthetic val$receiverPort:I

.field final synthetic val$retry:Z


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;Ljava/net/InetAddress;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;->this$0:Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 2
    .line 3
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;->val$receiverAddress:Ljava/net/InetAddress;

    .line 4
    .line 5
    iput p3, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;->val$receiverPort:I

    .line 6
    .line 7
    iput-boolean p4, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;->val$retry:Z

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public doSend([B)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;->this$0:Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;->val$receiverAddress:Ljava/net/InetAddress;

    .line 4
    .line 5
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;->val$receiverPort:I

    .line 6
    .line 7
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel$2;->val$retry:Z

    .line 8
    .line 9
    invoke-static {v0, p1, v1, v2, p0}, Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;->access$101(Landroid/gov/nist/javax/sip/stack/NioTlsMessageChannel;[BLjava/net/InetAddress;IZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
