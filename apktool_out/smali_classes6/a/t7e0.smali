.class public final La/t7e0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;

.field public j:La/j6i0;

.field public k:Ljava/lang/Throwable;

.field public l:I

.field public m:B

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:J

.field public s:J

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:La/z220;

.field public v:I


# direct methods
.method public constructor <init>(La/z220;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/t7e0;->u:La/z220;

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
    .locals 7

    .line 1
    iput-object p1, p0, La/t7e0;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/t7e0;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/t7e0;->v:I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, La/t7e0;->u:La/z220;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v6, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, La/z220;->q(Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;IIILa/j6i0;La/zje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
