.class public final La/lpu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Z

.field public j:Z

.field public k:Z

.field public l:La/rf9;

.field public m:Ljava/lang/Long;

.field public n:Ljava/util/Collection;

.field public o:Ljava/util/Iterator;

.field public p:La/asc0;

.field public q:Ljava/util/Collection;

.field public r:J

.field public s:J

.field public t:I

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:La/qgd;

.field public x:I


# direct methods
.method public constructor <init>(La/qgd;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/lpu;->w:La/qgd;

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
    iput-object p1, p0, La/lpu;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/lpu;->x:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/lpu;->x:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/lpu;->w:La/qgd;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, La/qgd;->J(ZLjava/lang/Long;La/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
