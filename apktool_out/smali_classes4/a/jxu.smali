.class public final La/jxu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:D

.field public j:D

.field public k:D

.field public l:D

.field public m:La/hru;

.field public n:La/qvo0;

.field public o:J

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/a6u;

.field public s:I


# direct methods
.method public constructor <init>(La/a6u;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jxu;->r:La/a6u;

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
    .locals 6

    .line 1
    iput-object p1, p0, La/jxu;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/jxu;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/jxu;->s:I

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    iget-object v0, p0, La/jxu;->r:La/a6u;

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/a6u;->x(DDLa/zje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
