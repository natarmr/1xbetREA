.class public Landroid/gov/nist/javax/sip/parser/StringMsgParserFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/parser/MessageParserFactory;


# static fields
.field private static msgParser:Landroid/gov/nist/javax/sip/parser/StringMsgParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroid/gov/nist/javax/sip/parser/StringMsgParserFactory;->msgParser:Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createMessageParser(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)Landroid/gov/nist/javax/sip/parser/MessageParser;
    .locals 0

    .line 1
    sget-object p0, Landroid/gov/nist/javax/sip/parser/StringMsgParserFactory;->msgParser:Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    .line 2
    .line 3
    return-object p0
.end method
