.class public final La/pfu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public Y:J

.field public Z:J

.field public f1:J

.field public g1:J

.field public h1:I

.field public i:La/s77;

.field public i1:I

.field public j:Ljava/lang/String;

.field public j1:I

.field public k:Ljava/lang/String;

.field public synthetic k1:Ljava/lang/Object;

.field public l:Ljava/lang/String;

.field public final synthetic l1:La/nc0;

.field public m:La/gm7;

.field public m1:I

.field public n:La/q57;

.field public o:La/rrd;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/Object;

.field public u:Ljava/util/List;

.field public v:Ljava/util/List;

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(La/nc0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pfu;->l1:La/nc0;

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
    iput-object p1, p0, La/pfu;->k1:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/pfu;->m1:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/pfu;->m1:I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, La/pfu;->l1:La/nc0;

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
    invoke-virtual/range {v0 .. v6}, La/nc0;->m(La/s77;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
