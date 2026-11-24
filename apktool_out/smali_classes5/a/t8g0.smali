.class public final La/t8g0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:La/nvu;

.field public r:Ljava/util/Map;

.field public s:La/nvu;

.field public t:La/t8g0;

.field public u:Ljava/lang/Throwable;

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:La/nvu;

.field public x:I


# direct methods
.method public constructor <init>(La/nvu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/t8g0;->w:La/nvu;

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
    iput-object p1, p0, La/t8g0;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/t8g0;->x:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/t8g0;->x:I

    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v0, p0, La/t8g0;->w:La/nvu;

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v6, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, La/nvu;->z(IJJLa/zje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, La/wne;->a:La/wne;

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance p1, La/j0g0;

    .line 28
    .line 29
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method
