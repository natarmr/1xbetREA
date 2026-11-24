.class public Landroid/gov/nist/javax/sip/header/ims/SecurityClient;
.super Landroid/gov/nist/javax/sip/header/ims/SecurityAgree;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/header/ims/SecurityClientHeader;
.implements Landroid/javax/sip/header/ExtensionHeader;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Security-Client"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/gov/nist/javax/sip/header/ims/SecurityAgree;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public setValue(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance p0, Ljava/text/ParseException;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method
