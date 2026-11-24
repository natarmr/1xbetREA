.class public Landroid/javax/sip/TimeoutEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# instance fields
.field private m_clientTransaction:Landroid/javax/sip/ClientTransaction;

.field private m_isServerTransaction:Z

.field private m_serverTransaction:Landroid/javax/sip/ServerTransaction;

.field private m_timeout:Landroid/javax/sip/Timeout;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/Timeout;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Landroid/javax/sip/TimeoutEvent;->m_serverTransaction:Landroid/javax/sip/ServerTransaction;

    .line 17
    iput-object p2, p0, Landroid/javax/sip/TimeoutEvent;->m_clientTransaction:Landroid/javax/sip/ClientTransaction;

    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Landroid/javax/sip/TimeoutEvent;->m_isServerTransaction:Z

    .line 19
    iput-object p3, p0, Landroid/javax/sip/TimeoutEvent;->m_timeout:Landroid/javax/sip/Timeout;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Timeout;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Landroid/javax/sip/TimeoutEvent;->m_clientTransaction:Landroid/javax/sip/ClientTransaction;

    .line 6
    .line 7
    iput-object p2, p0, Landroid/javax/sip/TimeoutEvent;->m_serverTransaction:Landroid/javax/sip/ServerTransaction;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroid/javax/sip/TimeoutEvent;->m_isServerTransaction:Z

    .line 11
    .line 12
    iput-object p3, p0, Landroid/javax/sip/TimeoutEvent;->m_timeout:Landroid/javax/sip/Timeout;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public getClientTransaction()Landroid/javax/sip/ClientTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/TimeoutEvent;->m_clientTransaction:Landroid/javax/sip/ClientTransaction;

    .line 2
    .line 3
    return-object p0
.end method

.method public getServerTransaction()Landroid/javax/sip/ServerTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/TimeoutEvent;->m_serverTransaction:Landroid/javax/sip/ServerTransaction;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTimeout()Landroid/javax/sip/Timeout;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/TimeoutEvent;->m_timeout:Landroid/javax/sip/Timeout;

    .line 2
    .line 3
    return-object p0
.end method

.method public isServerTransaction()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/javax/sip/TimeoutEvent;->m_isServerTransaction:Z

    .line 2
    .line 3
    return p0
.end method
