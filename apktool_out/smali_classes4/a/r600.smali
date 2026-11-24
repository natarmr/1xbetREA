.class public final La/r600;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/jvn;

.field public j:Ljava/util/List;

.field public k:Ljava/util/Set;

.field public l:Ljava/util/List;

.field public m:Ljava/lang/Integer;

.field public n:Ljava/util/List;

.field public o:La/pzu;

.field public p:I

.field public q:Z

.field public r:Z

.field public s:J

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:La/pzu;

.field public v:I


# direct methods
.method public constructor <init>(La/pzu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/r600;->u:La/pzu;

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
    .locals 12

    .line 1
    iput-object p1, p0, La/r600;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/r600;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/r600;->v:I

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    const/4 v10, 0x0

    .line 12
    iget-object v0, p0, La/r600;->u:La/pzu;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    move-object v11, p0

    .line 23
    invoke-virtual/range {v0 .. v11}, La/pzu;->P(La/jvn;Ljava/util/List;Ljava/util/Set;ILjava/util/List;ZJZLjava/lang/Integer;La/zje;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
