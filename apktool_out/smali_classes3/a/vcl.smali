.class public final La/vcl;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:La/i050;

.field public m:La/rcl;

.field public n:Lorg/xplatform/consultantchat/presentation/workers/DownloadWorker;

.field public o:La/vcl;

.field public p:Ljava/lang/Throwable;

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:I

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lorg/xplatform/consultantchat/presentation/workers/DownloadWorker;

.field public y:I


# direct methods
.method public constructor <init>(Lorg/xplatform/consultantchat/presentation/workers/DownloadWorker;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vcl;->x:Lorg/xplatform/consultantchat/presentation/workers/DownloadWorker;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, La/vcl;->w:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/vcl;->y:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/vcl;->y:I

    .line 9
    .line 10
    iget-object p1, p0, La/vcl;->x:Lorg/xplatform/consultantchat/presentation/workers/DownloadWorker;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lorg/xplatform/consultantchat/presentation/workers/DownloadWorker;->c(La/yje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
