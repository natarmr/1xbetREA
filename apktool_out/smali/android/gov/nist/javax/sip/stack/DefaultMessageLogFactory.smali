.class public Landroid/gov/nist/javax/sip/stack/DefaultMessageLogFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/LogRecordFactory;


# direct methods
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
.method public createLogRecord(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Landroid/gov/nist/javax/sip/LogRecord;
    .locals 0

    .line 7
    new-instance p0, Landroid/gov/nist/javax/sip/stack/MessageLog;

    invoke-direct/range {p0 .. p11}, Landroid/gov/nist/javax/sip/stack/MessageLog;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object p0
.end method

.method public createLogRecord(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Landroid/gov/nist/javax/sip/LogRecord;
    .locals 0

    .line 1
    new-instance p0, Landroid/gov/nist/javax/sip/stack/MessageLog;

    .line 2
    .line 3
    invoke-direct/range {p0 .. p10}, Landroid/gov/nist/javax/sip/stack/MessageLog;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
