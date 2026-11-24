.class public Landroid/javax/sip/RequestEvent;
.super Ljava/util/EventObject;
.source "SourceFile"


# instance fields
.field private m_dialog:Landroid/javax/sip/Dialog;

.field private m_request:Landroid/javax/sip/message/Request;

.field private m_transaction:Landroid/javax/sip/ServerTransaction;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/javax/sip/ServerTransaction;Landroid/javax/sip/Dialog;Landroid/javax/sip/message/Request;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroid/javax/sip/RequestEvent;->m_transaction:Landroid/javax/sip/ServerTransaction;

    .line 5
    .line 6
    iput-object p4, p0, Landroid/javax/sip/RequestEvent;->m_request:Landroid/javax/sip/message/Request;

    .line 7
    .line 8
    iput-object p3, p0, Landroid/javax/sip/RequestEvent;->m_dialog:Landroid/javax/sip/Dialog;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getDialog()Landroid/javax/sip/Dialog;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/RequestEvent;->m_dialog:Landroid/javax/sip/Dialog;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRequest()Landroid/javax/sip/message/Request;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/RequestEvent;->m_request:Landroid/javax/sip/message/Request;

    .line 2
    .line 3
    return-object p0
.end method

.method public getServerTransaction()Landroid/javax/sip/ServerTransaction;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/javax/sip/RequestEvent;->m_transaction:Landroid/javax/sip/ServerTransaction;

    .line 2
    .line 3
    return-object p0
.end method
