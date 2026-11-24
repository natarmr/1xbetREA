.class public Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SSLStateMachine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MessageSendItem"
.end annotation


# instance fields
.field private callback:Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;

.field private message:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->message:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->callback:Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic access$000(Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;)Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->message:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public getCallBack()Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->callback:Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, " ["

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->message:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendItem;->callback:Landroid/gov/nist/javax/sip/stack/SSLStateMachine$MessageSendCallback;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, "]"

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method
