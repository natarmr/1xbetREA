.class public abstract La/qsw;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/hps0;
.implements La/gpa0;
.implements La/vld;


# instance fields
.field public o:La/cdl;

.field public p:La/d13;

.field public q:Z


# direct methods
.method public constructor <init>(La/d13;La/cdl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/qsw;->o:La/cdl;

    .line 5
    .line 6
    iput-object p1, p0, La/qsw;->p:La/d13;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final S0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/qsw;->d1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Z0()V
    .locals 2

    .line 1
    new-instance v0, La/mie0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/h7w;

    .line 7
    .line 8
    invoke-direct {v1, v0}, La/h7w;-><init>(La/mie0;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, La/etm0;->u(La/hps0;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/qsw;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, La/qsw;->p:La/d13;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, La/qsw;->p:La/d13;

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0, v0}, La/qsw;->a1(La/bpa0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public a1(La/bpa0;)V
    .locals 1

    .line 1
    sget-object v0, La/bmd;->w:La/zfn;

    .line 2
    .line 3
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cpa0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    check-cast p0, La/lx2;

    .line 12
    .line 13
    iput-object p1, p0, La/lx2;->a:La/bpa0;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final b1()V
    .locals 2

    .line 1
    new-instance v0, La/hie0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, La/hie0;->a:Z

    .line 8
    .line 9
    new-instance v1, La/fdl;

    .line 10
    .line 11
    invoke-direct {v1, v0}, La/fdl;-><init>(La/hie0;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v1}, La/etm0;->w(La/hps0;Lkotlin/jvm/functions/Function1;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, v0, La/hie0;->a:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, La/qsw;->Z0()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public c1(I)Z
    .locals 0

    .line 1
    const/4 p0, 0x3

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p0, 0x4

    .line 6
    if-ne p1, p0, :cond_1

    .line 7
    .line 8
    :goto_0
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :cond_1
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public final d0()J
    .locals 4

    .line 1
    iget-object v0, p0, La/qsw;->o:La/cdl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, La/e7z;->z:La/w6k;

    .line 10
    .line 11
    sget v0, La/dwr0;->b:I

    .line 12
    .line 13
    const/high16 v0, 0x41200000    # 10.0f

    .line 14
    .line 15
    invoke-interface {p0, v0}, La/w6k;->T(F)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/high16 v2, 0x42200000    # 40.0f

    .line 20
    .line 21
    invoke-interface {p0, v2}, La/w6k;->T(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-interface {p0, v0}, La/w6k;->T(F)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-interface {p0, v2}, La/w6k;->T(F)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {v1, v3, v0, p0}, La/egm0;->k(IIII)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_0
    sget-wide v0, La/dwr0;->a:J

    .line 39
    .line 40
    return-wide v0
.end method

.method public final d1()V
    .locals 3

    .line 1
    iget-boolean v0, p0, La/qsw;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, La/qsw;->q:Z

    .line 7
    .line 8
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v0, La/mie0;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/cx2;

    .line 18
    .line 19
    const/4 v2, 0x6

    .line 20
    invoke-direct {v1, v0, v2}, La/cx2;-><init>(La/mie0;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v1}, La/etm0;->u(La/hps0;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/qsw;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, La/qsw;->Z0()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    invoke-virtual {p0, v0}, La/qsw;->a1(La/bpa0;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final h(La/woa0;La/xoa0;J)V
    .locals 1

    .line 1
    sget-object p3, La/xoa0;->b:La/xoa0;

    .line 2
    .line 3
    if-ne p2, p3, :cond_2

    .line 4
    .line 5
    iget-object p2, p1, La/woa0;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 p4, 0x0

    .line 12
    :goto_0
    if-ge p4, p3, :cond_2

    .line 13
    .line 14
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/dpa0;

    .line 19
    .line 20
    iget v0, v0, La/dpa0;->i:I

    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/qsw;->c1(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget p1, p1, La/woa0;->f:I

    .line 29
    .line 30
    const/4 p2, 0x4

    .line 31
    if-ne p1, p2, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, La/qsw;->q:Z

    .line 35
    .line 36
    invoke-virtual {p0}, La/qsw;->b1()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const/4 p2, 0x5

    .line 41
    if-ne p1, p2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, La/qsw;->d1()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    add-int/lit8 p4, p4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method

.method public final n0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/qsw;->d1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
