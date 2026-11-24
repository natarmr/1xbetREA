.class public final La/hjt0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:La/v0f;

.field public l:La/hru;

.field public m:La/qvo0;

.field public n:D

.field public o:D

.field public p:D

.field public q:Z

.field public r:Z

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:La/sd60;

.field public v:I


# direct methods
.method public constructor <init>(La/sd60;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hjt0;->u:La/sd60;

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
    .locals 2

    .line 1
    iput-object p1, p0, La/hjt0;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/hjt0;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/hjt0;->v:I

    .line 9
    .line 10
    iget-object p1, p0, La/hjt0;->u:La/sd60;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, La/sd60;->g(JLa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
