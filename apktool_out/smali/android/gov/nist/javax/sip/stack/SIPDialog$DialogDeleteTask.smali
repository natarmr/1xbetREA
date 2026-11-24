.class Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DialogDeleteTask"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public runTask()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogDeleteTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
