.class Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CallIDOrderingStructure"
.end annotation


# instance fields
.field private messagesForCallID:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Landroid/gov/nist/javax/sip/message/SIPMessage;",
            ">;"
        }
    .end annotation
.end field

.field private semaphore:Ljava/util/concurrent/Semaphore;

.field final synthetic this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;->this$0:Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/Semaphore;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0, v0}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;->semaphore:Ljava/util/concurrent/Semaphore;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;->messagesForCallID:Ljava/util/Queue;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public getMessagesForCallID()Ljava/util/Queue;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Queue<",
            "Landroid/gov/nist/javax/sip/message/SIPMessage;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;->messagesForCallID:Ljava/util/Queue;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSemaphore()Ljava/util/concurrent/Semaphore;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/parser/PipelinedMsgParser$CallIDOrderingStructure;->semaphore:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    return-object p0
.end method
