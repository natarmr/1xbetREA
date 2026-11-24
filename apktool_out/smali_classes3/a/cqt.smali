.class public final La/cqt;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/bwl;

.field public j:Ljava/util/List;

.field public k:La/cne0;

.field public l:La/ynb0;

.field public m:I

.field public n:I

.field public o:Z

.field public p:Z

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/es;

.field public s:I


# direct methods
.method public constructor <init>(La/es;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cqt;->r:La/es;

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
    iput-object p1, p0, La/cqt;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/cqt;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/cqt;->s:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, La/cqt;->r:La/es;

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
    invoke-virtual/range {v0 .. v7}, La/es;->v(Ljava/util/List;La/cne0;La/ynb0;IZZLa/zje;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
