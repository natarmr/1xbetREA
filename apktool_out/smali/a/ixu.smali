.class public final La/ixu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:D

.field public j:D

.field public k:D

.field public l:La/q4f;

.field public m:La/ozc;

.field public n:La/hru;

.field public o:Ljava/lang/Object;

.field public p:La/kxu;

.field public q:J

.field public r:J

.field public s:Z

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:La/kxu;

.field public w:I


# direct methods
.method public constructor <init>(La/kxu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ixu;->v:La/kxu;

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
    .locals 9

    .line 1
    iput-object p1, p0, La/ixu;->u:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/ixu;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/ixu;->w:I

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v0, p0, La/ixu;->v:La/kxu;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    move-object v8, p0

    .line 20
    invoke-virtual/range {v0 .. v8}, La/kxu;->a(DLa/q4f;JLjava/lang/Double;La/ozc;La/zje;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
