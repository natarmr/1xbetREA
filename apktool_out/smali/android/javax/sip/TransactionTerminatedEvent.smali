.class public Landroid/javax/sip/TransactionTerminatedEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# instance fields
.field private m_clientTransaction:Landroid/javax/sip/ClientTransaction;

.field private m_isServerTransaction:Z

.field private m_serverTransaction:Landroid/javax/sip/ServerTransaction;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/ClientTransaction;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_serverTransaction:Landroid/javax/sip/ServerTransaction;

    .line 15
    iput-object p2, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_clientTransaction:Landroid/javax/sip/ClientTransaction;

    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_isServerTransaction:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_clientTransaction:Landroid/javax/sip/ClientTransaction;

    .line 6
    .line 7
    iput-object p2, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_serverTransaction:Landroid/javax/sip/ServerTransaction;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_isServerTransaction:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getClientTransaction()Landroid/javax/sip/ClientTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_clientTransaction:Landroid/javax/sip/ClientTransaction;

    .line 2
    .line 3
    return-object p0
.end method

.method public getServerTransaction()Landroid/javax/sip/ServerTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_serverTransaction:Landroid/javax/sip/ServerTransaction;

    .line 2
    .line 3
    return-object p0
.end method

.method public isServerTransaction()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/javax/sip/TransactionTerminatedEvent;->m_isServerTransaction:Z

    .line 2
    .line 3
    return p0
.end method
