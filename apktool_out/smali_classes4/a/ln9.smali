.class public final La/ln9;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:La/khf0;

.field public m:Ljava/util/Map;

.field public n:La/khf0;

.field public o:La/ln9;

.field public p:Ljava/lang/Throwable;

.field public q:I

.field public r:I

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:La/khf0;

.field public v:I


# direct methods
.method public constructor <init>(La/khf0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ln9;->u:La/khf0;

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
    .locals 3

    .line 1
    iput-object p1, p0, La/ln9;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/ln9;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/ln9;->v:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, La/ln9;->u:La/khf0;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p0, p1}, La/khf0;->v(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/wne;->a:La/wne;

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p1, La/j0g0;

    .line 25
    .line 26
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1
.end method
