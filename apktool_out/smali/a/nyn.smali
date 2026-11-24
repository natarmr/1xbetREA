.class public final La/nyn;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/hmk0;

.field public j:La/ngd;

.field public k:La/o1x;

.field public l:Ljava/lang/Object;

.field public m:La/a780;

.field public n:La/gqw0;

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/ryn;

.field public r:I


# direct methods
.method public constructor <init>(La/ryn;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nyn;->q:La/ryn;

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
    .locals 8

    .line 1
    iput-object p1, p0, La/nyn;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/nyn;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/nyn;->r:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, La/nyn;->q:La/ryn;

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
    move-object v7, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, La/ryn;->b(La/hmk0;La/ngd;La/o1x;Ljava/lang/Object;La/a780;La/gqw0;La/zje;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
