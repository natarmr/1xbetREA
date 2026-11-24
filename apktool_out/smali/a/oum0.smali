.class public final La/oum0;
.super La/f3k;
.source "SourceFile"

# interfaces
.implements La/gpa0;
.implements La/lpq;
.implements La/eqq;


# instance fields
.field public q:Lkotlin/jvm/functions/Function0;

.field public r:Z

.field public final s:La/jnn0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/f3k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/oum0;->q:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    new-instance p1, La/zy2;

    .line 7
    .line 8
    const/4 v0, 0x7

    .line 9
    invoke-direct {p1, p0, v0}, La/zy2;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    sget-object v0, La/fnn0;->a:La/woa0;

    .line 13
    .line 14
    new-instance v0, La/jnn0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1, v1, p1}, La/jnn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/oum0;->s:La/jnn0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final L(La/iqq;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, La/oum0;->r:Z

    .line 6
    .line 7
    return-void
.end method

.method public final d0()J
    .locals 4

    .line 1
    sget-object v0, La/fre0;->n:La/cdl;

    .line 2
    .line 3
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/e7z;->z:La/w6k;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget v0, La/dwr0;->b:I

    .line 13
    .line 14
    const/high16 v0, 0x41200000    # 10.0f

    .line 15
    .line 16
    invoke-interface {p0, v0}, La/w6k;->T(F)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/high16 v2, 0x42200000    # 40.0f

    .line 21
    .line 22
    invoke-interface {p0, v2}, La/w6k;->T(F)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-interface {p0, v0}, La/w6k;->T(F)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p0, v2}, La/w6k;->T(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {v1, v3, v0, p0}, La/egm0;->k(IIII)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0
.end method

.method public final h(La/woa0;La/xoa0;J)V
    .locals 0

    .line 1
    iget-object p0, p0, La/oum0;->s:La/jnn0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, La/jnn0;->h(La/woa0;La/xoa0;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n0()V
    .locals 0

    .line 1
    iget-object p0, p0, La/oum0;->s:La/jnn0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jnn0;->n0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
