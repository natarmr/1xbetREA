.class Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;->sendMessage([BZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;

.field final synthetic val$isClient:Z


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$2;->this$0:Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;

    .line 2
    .line 3
    iput-boolean p2, p0, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$2;->val$isClient:Z

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public doSend([B)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$2;->this$0:Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;

    .line 2
    .line 3
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$2;->val$isClient:Z

    .line 4
    .line 5
    invoke-static {v0, p1, p0}, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;->access$501(Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;[BZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
