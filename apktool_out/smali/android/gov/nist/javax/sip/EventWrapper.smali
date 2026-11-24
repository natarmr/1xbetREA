.class public Landroid/gov/nist/javax/sip/EventWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected sipEvent:Ljava/util/EventObject;

.field protected transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;


# direct methods
.method public constructor <init>(Ljava/util/EventObject;Landroid/gov/nist/javax/sip/stack/SIPTransaction;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroid/gov/nist/javax/sip/EventWrapper;->sipEvent:Ljava/util/EventObject;

    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/EventWrapper;->transaction:Landroid/gov/nist/javax/sip/stack/SIPTransaction;

    .line 7
    .line 8
    return-void
.end method
