.class Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1;->doSend([B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1$1;->this$1:Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public doSend([B)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1$1;->this$1:Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1;->this$0:Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;

    .line 4
    .line 5
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel$1;->val$isClient:Z

    .line 6
    .line 7
    invoke-static {v0, p1, p0}, Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;->access$401(Landroid/gov/nist/javax/sip/stack/NioTlsWebSocketMessageChannel;[BZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
