.class Landroid/gov/nist/javax/sip/message/MessageFactoryImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/parser/ParseExceptionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->createRequest(Ljava/lang/String;)Landroid/javax/sip/message/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl$1;->this$0:Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleException(Ljava/text/ParseException;Landroid/gov/nist/javax/sip/message/SIPMessage;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl$1;->this$0:Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;

    .line 2
    .line 3
    invoke-static {p0}, Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;->access$000(Landroid/gov/nist/javax/sip/message/MessageFactoryImpl;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    const-class p0, Landroid/gov/nist/javax/sip/header/From;

    .line 10
    .line 11
    if-eq p3, p0, :cond_0

    .line 12
    .line 13
    const-class p0, Landroid/gov/nist/javax/sip/header/To;

    .line 14
    .line 15
    if-eq p3, p0, :cond_0

    .line 16
    .line 17
    const-class p0, Landroid/gov/nist/javax/sip/header/CallID;

    .line 18
    .line 19
    if-eq p3, p0, :cond_0

    .line 20
    .line 21
    const-class p0, Landroid/gov/nist/javax/sip/header/MaxForwards;

    .line 22
    .line 23
    if-eq p3, p0, :cond_0

    .line 24
    .line 25
    const-class p0, Landroid/gov/nist/javax/sip/header/Via;

    .line 26
    .line 27
    if-eq p3, p0, :cond_0

    .line 28
    .line 29
    const-class p0, Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 30
    .line 31
    if-eq p3, p0, :cond_0

    .line 32
    .line 33
    const-class p0, Landroid/gov/nist/javax/sip/header/StatusLine;

    .line 34
    .line 35
    if-eq p3, p0, :cond_0

    .line 36
    .line 37
    const-class p0, Landroid/gov/nist/javax/sip/header/CSeq;

    .line 38
    .line 39
    if-eq p3, p0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p2, p4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->addUnparsed(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    throw p1

    .line 46
    :cond_1
    return-void
.end method
