.class public final La/pit0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Z

.field public j:La/sff0;

.field public k:La/lrc;

.field public l:La/fht0;

.field public m:J

.field public n:J

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/sd60;

.field public q:I


# direct methods
.method public constructor <init>(La/sd60;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pit0;->p:La/sd60;

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
    iput-object p1, p0, La/pit0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/pit0;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/pit0;->q:I

    .line 9
    .line 10
    iget-object p1, p0, La/pit0;->p:La/sd60;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/sd60;->h(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
