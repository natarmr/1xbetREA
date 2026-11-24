.class public final La/d2u;
.super La/zje;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public j:I

.field public final synthetic k:La/e2u;

.field public l:La/kmq;

.field public m:Ljava/util/List;

.field public n:La/d2u;

.field public o:Ljava/lang/Throwable;

.field public p:J

.field public q:J

.field public r:I

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(La/e2u;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d2u;->k:La/e2u;

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
    iput-object p1, p0, La/d2u;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/d2u;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/d2u;->j:I

    .line 9
    .line 10
    iget-object p1, p0, La/d2u;->k:La/e2u;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/e2u;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
