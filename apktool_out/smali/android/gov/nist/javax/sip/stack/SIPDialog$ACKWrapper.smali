.class final Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ACKWrapper"
.end annotation


# instance fields
.field cSeq:Landroid/javax/sip/header/CSeqHeader;

.field dialogId:Ljava/lang/String;

.field fromTag:Ljava/lang/String;

.field msgBytes:Ljava/lang/String;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setTransaction(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPRequest;->encode()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->msgBytes:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getFromTag()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->fromTag:Ljava/lang/String;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p2, p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getDialogId(Z)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->dialogId:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCSeq()Landroid/javax/sip/header/CSeqHeader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->cSeq:Landroid/javax/sip/header/CSeqHeader;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public getCSeq()Landroid/javax/sip/header/CSeqHeader;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->cSeq:Landroid/javax/sip/header/CSeqHeader;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDialogId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->dialogId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFromTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->fromTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public reparseRequest()Landroid/gov/nist/javax/sip/message/SIPRequest;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 3
    .line 4
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$000(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMessageParserFactory()Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 13
    .line 14
    invoke-static {v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$000(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v1, v2}, Landroid/gov/nist/javax/sip/parser/MessageParserFactory;->createMessageParser(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Landroid/gov/nist/javax/sip/parser/MessageParser;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$ACKWrapper;->msgBytes:Ljava/lang/String;

    .line 23
    .line 24
    const-string v2, "UTF-8"

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-interface {v1, p0, v2, v3, v0}, Landroid/gov/nist/javax/sip/parser/MessageParser;->parseSIPMessage([BZZLandroid/gov/nist/javax/sip/parser/ParseExceptionListener;)Landroid/gov/nist/javax/sip/message/SIPMessage;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroid/gov/nist/javax/sip/message/SIPRequest;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :catch_0
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/16 v1, 0x20

    .line 44
    .line 45
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_0

    .line 50
    .line 51
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string v1, "SIPDialog::resendAck:lastAck failed reparsing, hence not resending ACK"

    .line 56
    .line 57
    invoke-interface {p0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-object v0
.end method
