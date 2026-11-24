.class public Landroid/javax/sip/IOExceptionEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# instance fields
.field private m_host:Ljava/lang/String;

.field private m_port:I

.field private m_transport:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroid/javax/sip/IOExceptionEvent;->m_host:Ljava/lang/String;

    .line 5
    .line 6
    iput p3, p0, Landroid/javax/sip/IOExceptionEvent;->m_port:I

    .line 7
    .line 8
    iput-object p4, p0, Landroid/javax/sip/IOExceptionEvent;->m_transport:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getHost()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/IOExceptionEvent;->m_host:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPort()I
    .locals 0

    .line 1
    iget p0, p0, Landroid/javax/sip/IOExceptionEvent;->m_port:I

    .line 2
    .line 3
    return p0
.end method

.method public getTransport()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/IOExceptionEvent;->m_transport:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
