.class public final La/ruv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final x:La/uts0;


# instance fields
.field public final a:La/duv0;

.field public final b:La/fht0;

.field public final c:La/glt0;

.field public final d:La/mkt0;

.field public final e:La/muv0;

.field public final f:La/fuj0;

.field public final g:La/pz40;

.field public h:La/jmv0;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:F

.field public o:I

.field public p:Z

.field public q:F

.field public r:I

.field public s:La/c4m0;

.field public t:La/vne;

.field public u:La/c4m0;

.field public final v:La/t33;

.field public final w:La/pz40;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, La/ihn;->a:La/zsf;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x12c

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v2, v3, v0, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/ruv0;->x:La/uts0;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/duv0;La/fht0;La/glt0;La/mkt0;La/muv0;La/fuj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ruv0;->a:La/duv0;

    .line 5
    .line 6
    iput-object p2, p0, La/ruv0;->b:La/fht0;

    .line 7
    .line 8
    iput-object p3, p0, La/ruv0;->c:La/glt0;

    .line 9
    .line 10
    iput-object p4, p0, La/ruv0;->d:La/mkt0;

    .line 11
    .line 12
    iput-object p5, p0, La/ruv0;->e:La/muv0;

    .line 13
    .line 14
    iput-object p6, p0, La/ruv0;->f:La/fuj0;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/ruv0;->g:La/pz40;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-static {p1}, La/xf0;->c(F)La/t33;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iput-object p2, p0, La/ruv0;->v:La/t33;

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/ruv0;->w:La/pz40;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a(FLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/ouv0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ouv0;

    .line 7
    .line 8
    iget v1, v0, La/ouv0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ouv0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ouv0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ouv0;-><init>(La/ruv0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ouv0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ouv0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget p1, v0, La/ouv0;->i:F

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, La/ruv0;->s:La/c4m0;

    .line 53
    .line 54
    if-eqz p2, :cond_3

    .line 55
    .line 56
    iput p1, v0, La/ouv0;->i:F

    .line 57
    .line 58
    iput v4, v0, La/ouv0;->l:I

    .line 59
    .line 60
    invoke-static {p2, v0}, La/zvw;->H(La/bby;La/yje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p2, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    iget-object p2, p0, La/ruv0;->t:La/vne;

    .line 68
    .line 69
    if-nez p2, :cond_4

    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_4
    new-instance v0, La/puv0;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    invoke-direct {v0, p0, p1, v3, v1}, La/puv0;-><init>(La/ruv0;FLa/yje;B)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x3

    .line 81
    invoke-static {p2, v3, v3, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, La/ruv0;->s:La/c4m0;

    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, La/ruv0;->t:La/vne;

    .line 2
    .line 3
    iget v1, p0, La/ruv0;->n:F

    .line 4
    .line 5
    iget-object v2, p0, La/ruv0;->a:La/duv0;

    .line 6
    .line 7
    invoke-virtual {v2}, La/duv0;->b()La/l7m0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, La/tly;

    .line 16
    .line 17
    iget v3, v2, La/tly;->c:F

    .line 18
    .line 19
    invoke-virtual {p0, v3}, La/ruv0;->l(F)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget v2, v2, La/tly;->b:F

    .line 24
    .line 25
    invoke-virtual {p0, v2}, La/ruv0;->l(F)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, La/ruv0;->u:La/c4m0;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2}, La/pby;->isActive()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ne v2, v3, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    cmpl-float v2, v1, v2

    .line 53
    .line 54
    if-lez v2, :cond_2

    .line 55
    .line 56
    iget-object v2, p0, La/ruv0;->u:La/c4m0;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {v2, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    new-instance v2, La/jy7;

    .line 65
    .line 66
    invoke-direct {v2, p0, v1, v4, v3}, La/jy7;-><init>(Ljava/lang/Object;FLa/yje;B)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x3

    .line 70
    invoke-static {v0, v4, v4, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, La/ruv0;->u:La/c4m0;

    .line 75
    .line 76
    :cond_2
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ruv0;->c:La/glt0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/glt0;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, La/ruv0;->m:Z

    .line 12
    .line 13
    invoke-virtual {p0}, La/ruv0;->b()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iput-boolean v0, p0, La/ruv0;->l:Z

    .line 23
    .line 24
    invoke-virtual {p0}, La/ruv0;->k()V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/ruv0;->h:La/jmv0;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, La/jmv0;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method public final d(La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v1, p0, La/ruv0;->b:La/fht0;

    .line 11
    .line 12
    invoke-virtual {v1}, La/fht0;->f()La/cvv0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget v0, v0, La/yuv0;->b:F

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, v0, La/yuv0;->a:La/lxv0;

    .line 22
    .line 23
    invoke-static {v1, v0}, La/ktt0;->g(La/cvv0;La/lxv0;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-float v0, v0

    .line 28
    :goto_0
    invoke-virtual {p0}, La/ruv0;->k()V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput v1, p0, La/ruv0;->o:I

    .line 33
    .line 34
    iput-boolean v1, p0, La/ruv0;->p:Z

    .line 35
    .line 36
    invoke-virtual {p0, v0, p1}, La/ruv0;->a(FLa/zje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object p1, La/wne;->a:La/wne;

    .line 41
    .line 42
    if-ne p0, p1, :cond_2

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0
.end method

.method public final e()F
    .locals 2

    .line 1
    iget-object v0, p0, La/ruv0;->u:La/c4m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ruv0;->v:La/t33;

    .line 13
    .line 14
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    iget-object v0, p0, La/ruv0;->a:La/duv0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/duv0;->b()La/l7m0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/tly;

    .line 36
    .line 37
    iget v0, v0, La/tly;->b:F

    .line 38
    .line 39
    invoke-virtual {p0, v0}, La/ruv0;->l(F)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {}, La/a8k0;->A()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget p0, p0, La/ruv0;->n:F

    .line 51
    .line 52
    cmpl-float v1, v0, p0

    .line 53
    .line 54
    if-lez v1, :cond_2

    .line 55
    .line 56
    return p0

    .line 57
    :cond_2
    :goto_0
    return v0
.end method

.method public final f()La/yuv0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ruv0;->g:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/yuv0;

    .line 10
    .line 11
    return-object p0
.end method

.method public final g()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final h(La/cvv0;)F
    .locals 6

    .line 1
    iget v0, p1, La/cvv0;->d:I

    .line 2
    .line 3
    iget-object v1, p0, La/ruv0;->e:La/muv0;

    .line 4
    .line 5
    iget-object v2, v1, La/muv0;->b:La/fht0;

    .line 6
    .line 7
    invoke-virtual {v1}, La/muv0;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, La/fht0;->f()La/cvv0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget v2, v2, La/cvv0;->f:I

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v1}, La/muv0;->a()Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2}, La/fht0;->f()La/cvv0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget v2, v2, La/cvv0;->f:I

    .line 40
    .line 41
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :cond_1
    :goto_0
    if-nez v4, :cond_2

    .line 46
    .line 47
    invoke-static {p1}, La/ktt0;->k(La/cvv0;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-float p1, p1

    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_2
    iget-boolean v2, v1, La/muv0;->g:Z

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iget-object v2, p0, La/ruv0;->f:La/fuj0;

    .line 60
    .line 61
    iget-object v2, v2, La/fuj0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, La/l7m0;

    .line 64
    .line 65
    check-cast v2, La/hgk0;

    .line 66
    .line 67
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, La/zvv0;

    .line 72
    .line 73
    iget-object v2, v2, La/zvv0;->e:La/nsv0;

    .line 74
    .line 75
    iget v2, v2, La/nsv0;->a:I

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move v2, v3

    .line 79
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    sub-int/2addr v4, v0

    .line 84
    sub-int/2addr v4, v2

    .line 85
    iget-object v1, v1, La/muv0;->i:La/pz40;

    .line 86
    .line 87
    check-cast v1, La/hgk0;

    .line 88
    .line 89
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, La/atv0;

    .line 94
    .line 95
    instance-of v2, v1, La/xsv0;

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    check-cast v1, La/xsv0;

    .line 101
    .line 102
    iget v1, v1, La/xsv0;->d:I

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    instance-of v2, v1, La/ysv0;

    .line 106
    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    check-cast v1, La/ysv0;

    .line 110
    .line 111
    iget v1, v1, La/ysv0;->c:I

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    sget-object v2, La/zsv0;->a:La/zsv0;

    .line 115
    .line 116
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_b

    .line 121
    .line 122
    move v1, v3

    .line 123
    :goto_2
    sub-int/2addr v4, v1

    .line 124
    int-to-float v1, v4

    .line 125
    iget-object v2, p0, La/ruv0;->a:La/duv0;

    .line 126
    .line 127
    invoke-virtual {v2}, La/duv0;->b()La/l7m0;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, La/tly;

    .line 136
    .line 137
    iget-object v4, p0, La/ruv0;->b:La/fht0;

    .line 138
    .line 139
    invoke-virtual {v4}, La/fht0;->f()La/cvv0;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    if-eqz v4, :cond_6

    .line 144
    .line 145
    iget v3, v4, La/cvv0;->c:I

    .line 146
    .line 147
    :cond_6
    int-to-float v3, v3

    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-boolean v4, v2, La/tly;->a:Z

    .line 152
    .line 153
    if-eqz v4, :cond_8

    .line 154
    .line 155
    iget v2, v2, La/tly;->c:F

    .line 156
    .line 157
    sub-float/2addr v2, v3

    .line 158
    cmpg-float v3, v2, v5

    .line 159
    .line 160
    if-gez v3, :cond_7

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_7
    move v5, v2

    .line 164
    :cond_8
    :goto_3
    iget v2, p1, La/cvv0;->e:I

    .line 165
    .line 166
    int-to-float v2, v2

    .line 167
    int-to-float v0, v0

    .line 168
    sub-float/2addr v5, v2

    .line 169
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    add-float/2addr v0, v1

    .line 174
    invoke-static {p1}, La/ktt0;->k(La/cvv0;)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    int-to-float p1, p1

    .line 179
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    :goto_4
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    if-nez p0, :cond_9

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    iget p0, p0, La/yuv0;->b:F

    .line 191
    .line 192
    cmpg-float v0, p1, p0

    .line 193
    .line 194
    if-gez v0, :cond_a

    .line 195
    .line 196
    return p0

    .line 197
    :cond_a
    :goto_5
    return p1

    .line 198
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 199
    .line 200
    .line 201
    return v5
.end method

.method public final i(La/tly;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/quv0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/quv0;

    .line 13
    .line 14
    iget v4, v3, La/quv0;->t:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/quv0;->t:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/quv0;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/quv0;-><init>(La/ruv0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/quv0;->r:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/quv0;->t:I

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    if-eqz v5, :cond_4

    .line 43
    .line 44
    if-eq v5, v9, :cond_3

    .line 45
    .line 46
    if-eq v5, v8, :cond_2

    .line 47
    .line 48
    if-eq v5, v7, :cond_2

    .line 49
    .line 50
    if-ne v5, v6, :cond_1

    .line 51
    .line 52
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_b

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v10

    .line 63
    :cond_2
    iget v1, v3, La/quv0;->q:F

    .line 64
    .line 65
    iget v5, v3, La/quv0;->p:F

    .line 66
    .line 67
    iget v7, v3, La/quv0;->o:F

    .line 68
    .line 69
    iget v8, v3, La/quv0;->n:F

    .line 70
    .line 71
    iget v9, v3, La/quv0;->l:I

    .line 72
    .line 73
    iget v11, v3, La/quv0;->k:I

    .line 74
    .line 75
    iget v12, v3, La/quv0;->m:F

    .line 76
    .line 77
    iget v13, v3, La/quv0;->j:I

    .line 78
    .line 79
    iget-object v14, v3, La/quv0;->i:La/tly;

    .line 80
    .line 81
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_9

    .line 85
    .line 86
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_4
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-boolean v2, v0, La/ruv0;->m:Z

    .line 95
    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    iget v1, v1, La/tly;->b:F

    .line 99
    .line 100
    invoke-virtual {v0, v1}, La/ruv0;->l(F)F

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    iget-object v2, v0, La/ruv0;->v:La/t33;

    .line 105
    .line 106
    invoke-virtual {v2}, La/t33;->d()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    cmpl-float v1, v1, v2

    .line 117
    .line 118
    if-lez v1, :cond_5

    .line 119
    .line 120
    invoke-virtual {v0}, La/ruv0;->b()V

    .line 121
    .line 122
    .line 123
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_6
    iget-object v2, v0, La/ruv0;->b:La/fht0;

    .line 127
    .line 128
    invoke-virtual {v2}, La/fht0;->f()La/cvv0;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v0}, La/ruv0;->f()La/yuv0;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    if-eqz v2, :cond_17

    .line 137
    .line 138
    if-eqz v5, :cond_17

    .line 139
    .line 140
    iget-object v11, v0, La/ruv0;->d:La/mkt0;

    .line 141
    .line 142
    invoke-virtual {v11}, La/mkt0;->b()Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-eqz v11, :cond_7

    .line 147
    .line 148
    goto/16 :goto_d

    .line 149
    .line 150
    :cond_7
    iget-boolean v11, v0, La/ruv0;->i:Z

    .line 151
    .line 152
    if-nez v11, :cond_16

    .line 153
    .line 154
    iget-boolean v11, v0, La/ruv0;->j:Z

    .line 155
    .line 156
    if-eqz v11, :cond_8

    .line 157
    .line 158
    goto/16 :goto_c

    .line 159
    .line 160
    :cond_8
    iget v11, v0, La/ruv0;->q:F

    .line 161
    .line 162
    const/4 v12, 0x0

    .line 163
    cmpg-float v11, v11, v12

    .line 164
    .line 165
    if-nez v11, :cond_9

    .line 166
    .line 167
    move v11, v9

    .line 168
    goto :goto_1

    .line 169
    :cond_9
    const/4 v11, 0x0

    .line 170
    :goto_1
    iget-object v14, v0, La/ruv0;->a:La/duv0;

    .line 171
    .line 172
    invoke-virtual {v14}, La/duv0;->b()La/l7m0;

    .line 173
    .line 174
    .line 175
    move-result-object v14

    .line 176
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    check-cast v14, La/tly;

    .line 181
    .line 182
    iget v14, v14, La/tly;->b:F

    .line 183
    .line 184
    invoke-static {}, La/a8k0;->A()Z

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    if-eqz v15, :cond_a

    .line 189
    .line 190
    iget v15, v0, La/ruv0;->q:F

    .line 191
    .line 192
    cmpg-float v15, v14, v15

    .line 193
    .line 194
    if-gez v15, :cond_a

    .line 195
    .line 196
    move v15, v9

    .line 197
    goto :goto_2

    .line 198
    :cond_a
    const/4 v15, 0x0

    .line 199
    :goto_2
    iput v14, v0, La/ruv0;->q:F

    .line 200
    .line 201
    if-eqz v15, :cond_b

    .line 202
    .line 203
    iget v6, v0, La/ruv0;->r:I

    .line 204
    .line 205
    add-int/2addr v6, v9

    .line 206
    goto :goto_3

    .line 207
    :cond_b
    const/4 v6, 0x0

    .line 208
    :goto_3
    iput v6, v0, La/ruv0;->r:I

    .line 209
    .line 210
    invoke-static {}, La/a8k0;->A()Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    if-eqz v6, :cond_c

    .line 215
    .line 216
    iget v6, v0, La/ruv0;->r:I

    .line 217
    .line 218
    if-lt v6, v8, :cond_c

    .line 219
    .line 220
    invoke-virtual {v0, v14}, La/ruv0;->l(F)F

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    iget v7, v0, La/ruv0;->n:F

    .line 225
    .line 226
    const v16, 0x3f59999a    # 0.85f

    .line 227
    .line 228
    .line 229
    mul-float v7, v7, v16

    .line 230
    .line 231
    cmpg-float v6, v6, v7

    .line 232
    .line 233
    if-gtz v6, :cond_c

    .line 234
    .line 235
    move v6, v9

    .line 236
    goto :goto_4

    .line 237
    :cond_c
    const/4 v6, 0x0

    .line 238
    :goto_4
    if-eqz v6, :cond_e

    .line 239
    .line 240
    iput-object v10, v3, La/quv0;->i:La/tly;

    .line 241
    .line 242
    iput v11, v3, La/quv0;->j:I

    .line 243
    .line 244
    iput v14, v3, La/quv0;->m:F

    .line 245
    .line 246
    iput v15, v3, La/quv0;->k:I

    .line 247
    .line 248
    iput v6, v3, La/quv0;->l:I

    .line 249
    .line 250
    iput v9, v3, La/quv0;->t:I

    .line 251
    .line 252
    invoke-virtual {v0, v3}, La/ruv0;->d(La/zje;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    if-ne v0, v4, :cond_d

    .line 257
    .line 258
    goto/16 :goto_a

    .line 259
    .line 260
    :cond_d
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0

    .line 263
    :cond_e
    iget v7, v0, La/ruv0;->n:F

    .line 264
    .line 265
    iget v9, v1, La/tly;->c:F

    .line 266
    .line 267
    iget-boolean v10, v1, La/tly;->a:Z

    .line 268
    .line 269
    iget v8, v1, La/tly;->b:F

    .line 270
    .line 271
    move/from16 v17, v12

    .line 272
    .line 273
    invoke-virtual {v0, v9}, La/ruv0;->l(F)F

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    invoke-virtual {v0, v8}, La/ruv0;->l(F)F

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    invoke-static {v12, v13}, Ljava/lang/Math;->max(FF)F

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    invoke-static {v7, v12}, Ljava/lang/Math;->max(FF)F

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    iput v7, v0, La/ruv0;->n:F

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    iput-boolean v7, v0, La/ruv0;->p:Z

    .line 293
    .line 294
    if-eqz v10, :cond_f

    .line 295
    .line 296
    invoke-virtual {v0, v9}, La/ruv0;->l(F)F

    .line 297
    .line 298
    .line 299
    move-result v7

    .line 300
    cmpl-float v7, v7, v17

    .line 301
    .line 302
    if-lez v7, :cond_f

    .line 303
    .line 304
    invoke-virtual {v0, v9}, La/ruv0;->l(F)F

    .line 305
    .line 306
    .line 307
    move-result v7

    .line 308
    goto :goto_6

    .line 309
    :cond_f
    iget v7, v0, La/ruv0;->n:F

    .line 310
    .line 311
    :goto_6
    cmpl-float v9, v7, v17

    .line 312
    .line 313
    const/high16 v12, 0x3f800000    # 1.0f

    .line 314
    .line 315
    if-lez v9, :cond_10

    .line 316
    .line 317
    invoke-virtual {v0, v8}, La/ruv0;->l(F)F

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    div-float/2addr v8, v7

    .line 322
    move/from16 v9, v17

    .line 323
    .line 324
    invoke-static {v8, v9, v12}, La/l1e0;->c(FFF)F

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    goto :goto_7

    .line 329
    :cond_10
    move/from16 v9, v17

    .line 330
    .line 331
    move v8, v9

    .line 332
    :goto_7
    if-eqz v10, :cond_11

    .line 333
    .line 334
    move v9, v8

    .line 335
    goto :goto_8

    .line 336
    :cond_11
    const v10, 0x3e4ccccd    # 0.2f

    .line 337
    .line 338
    .line 339
    sub-float v10, v8, v10

    .line 340
    .line 341
    const v13, 0x3f4ccccd    # 0.8f

    .line 342
    .line 343
    .line 344
    div-float/2addr v10, v13

    .line 345
    invoke-static {v10, v9, v12}, La/l1e0;->c(FFF)F

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    :goto_8
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    iget-object v12, v0, La/ruv0;->w:La/pz40;

    .line 354
    .line 355
    check-cast v12, La/hgk0;

    .line 356
    .line 357
    invoke-virtual {v12, v10}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    iget v5, v5, La/yuv0;->b:F

    .line 361
    .line 362
    invoke-virtual {v0, v2}, La/ruv0;->h(La/cvv0;)F

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    invoke-static {v5, v2, v9}, La/l7x;->O(FFF)F

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eqz v11, :cond_13

    .line 371
    .line 372
    iput-object v1, v3, La/quv0;->i:La/tly;

    .line 373
    .line 374
    iput v11, v3, La/quv0;->j:I

    .line 375
    .line 376
    iput v14, v3, La/quv0;->m:F

    .line 377
    .line 378
    iput v15, v3, La/quv0;->k:I

    .line 379
    .line 380
    iput v6, v3, La/quv0;->l:I

    .line 381
    .line 382
    iput v7, v3, La/quv0;->n:F

    .line 383
    .line 384
    iput v8, v3, La/quv0;->o:F

    .line 385
    .line 386
    iput v9, v3, La/quv0;->p:F

    .line 387
    .line 388
    iput v2, v3, La/quv0;->q:F

    .line 389
    .line 390
    const/4 v5, 0x2

    .line 391
    iput v5, v3, La/quv0;->t:I

    .line 392
    .line 393
    invoke-virtual {v0, v2, v3}, La/ruv0;->a(FLa/zje;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    if-ne v5, v4, :cond_12

    .line 398
    .line 399
    goto :goto_a

    .line 400
    :cond_12
    move v5, v8

    .line 401
    move v8, v7

    .line 402
    move v7, v5

    .line 403
    move v5, v9

    .line 404
    move v13, v11

    .line 405
    move v12, v14

    .line 406
    move v11, v15

    .line 407
    move-object v14, v1

    .line 408
    move v1, v2

    .line 409
    move v9, v6

    .line 410
    goto :goto_9

    .line 411
    :cond_13
    iput-object v1, v3, La/quv0;->i:La/tly;

    .line 412
    .line 413
    iput v11, v3, La/quv0;->j:I

    .line 414
    .line 415
    iput v14, v3, La/quv0;->m:F

    .line 416
    .line 417
    iput v15, v3, La/quv0;->k:I

    .line 418
    .line 419
    iput v6, v3, La/quv0;->l:I

    .line 420
    .line 421
    iput v7, v3, La/quv0;->n:F

    .line 422
    .line 423
    iput v8, v3, La/quv0;->o:F

    .line 424
    .line 425
    iput v9, v3, La/quv0;->p:F

    .line 426
    .line 427
    iput v2, v3, La/quv0;->q:F

    .line 428
    .line 429
    const/4 v5, 0x3

    .line 430
    iput v5, v3, La/quv0;->t:I

    .line 431
    .line 432
    iget-object v5, v0, La/ruv0;->c:La/glt0;

    .line 433
    .line 434
    invoke-virtual {v5, v2, v3}, La/glt0;->g(FLa/yje;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    if-ne v5, v4, :cond_12

    .line 439
    .line 440
    goto :goto_a

    .line 441
    :goto_9
    iget-boolean v2, v14, La/tly;->a:Z

    .line 442
    .line 443
    if-nez v2, :cond_15

    .line 444
    .line 445
    iget v2, v14, La/tly;->b:F

    .line 446
    .line 447
    const/high16 v6, 0x3f000000    # 0.5f

    .line 448
    .line 449
    cmpg-float v2, v2, v6

    .line 450
    .line 451
    if-gtz v2, :cond_15

    .line 452
    .line 453
    const/4 v2, 0x0

    .line 454
    iput-object v2, v3, La/quv0;->i:La/tly;

    .line 455
    .line 456
    iput v13, v3, La/quv0;->j:I

    .line 457
    .line 458
    iput v12, v3, La/quv0;->m:F

    .line 459
    .line 460
    iput v11, v3, La/quv0;->k:I

    .line 461
    .line 462
    iput v9, v3, La/quv0;->l:I

    .line 463
    .line 464
    iput v8, v3, La/quv0;->n:F

    .line 465
    .line 466
    iput v7, v3, La/quv0;->o:F

    .line 467
    .line 468
    iput v5, v3, La/quv0;->p:F

    .line 469
    .line 470
    iput v1, v3, La/quv0;->q:F

    .line 471
    .line 472
    const/4 v1, 0x4

    .line 473
    iput v1, v3, La/quv0;->t:I

    .line 474
    .line 475
    invoke-virtual {v0, v3}, La/ruv0;->d(La/zje;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    if-ne v0, v4, :cond_14

    .line 480
    .line 481
    :goto_a
    return-object v4

    .line 482
    :cond_14
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0

    .line 485
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 486
    .line 487
    return-object v0

    .line 488
    :cond_16
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object v0

    .line 491
    :cond_17
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    return-object v0
.end method

.method public final j()Lkotlin/Unit;
    .locals 5

    .line 1
    iget-boolean v0, p0, La/ruv0;->m:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, La/ruv0;->l:Z

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-boolean v0, p0, La/ruv0;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, La/ruv0;->c:La/glt0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/glt0;->f()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v1, p0, La/ruv0;->b:La/fht0;

    .line 29
    .line 30
    invoke-virtual {v1}, La/fht0;->f()La/cvv0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    iget-object v2, p0, La/ruv0;->u:La/c4m0;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v2, v3}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iput-object v3, p0, La/ruv0;->u:La/c4m0;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    iput-boolean v2, p0, La/ruv0;->i:Z

    .line 51
    .line 52
    iput-boolean v2, p0, La/ruv0;->j:Z

    .line 53
    .line 54
    iget-object v3, p0, La/ruv0;->a:La/duv0;

    .line 55
    .line 56
    invoke-virtual {v3}, La/duv0;->b()La/l7m0;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, La/tly;

    .line 65
    .line 66
    iget v4, v3, La/tly;->c:F

    .line 67
    .line 68
    invoke-virtual {p0, v4}, La/ruv0;->l(F)F

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    iget v3, v3, La/tly;->b:F

    .line 73
    .line 74
    invoke-virtual {p0, v3}, La/ruv0;->l(F)F

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    iput v3, p0, La/ruv0;->n:F

    .line 83
    .line 84
    iget v3, v1, La/cvv0;->a:I

    .line 85
    .line 86
    iput v3, p0, La/ruv0;->o:I

    .line 87
    .line 88
    iput-boolean v2, p0, La/ruv0;->p:Z

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    iput v3, p0, La/ruv0;->q:F

    .line 92
    .line 93
    iput v2, p0, La/ruv0;->r:I

    .line 94
    .line 95
    new-instance v2, La/yuv0;

    .line 96
    .line 97
    invoke-virtual {v0}, La/glt0;->d()La/lxv0;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v0}, La/glt0;->d()La/lxv0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v1, v0}, La/ktt0;->g(La/cvv0;La/lxv0;)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    int-to-float v0, v0

    .line 110
    iget v1, p0, La/ruv0;->n:F

    .line 111
    .line 112
    invoke-direct {v2, v3, v0, v1}, La/yuv0;-><init>(La/lxv0;FF)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, La/ruv0;->g:La/pz40;

    .line 116
    .line 117
    check-cast p0, La/hgk0;

    .line 118
    .line 119
    invoke-virtual {p0, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0
.end method

.method public final k()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, La/ruv0;->i:Z

    .line 3
    .line 4
    iput-boolean v0, p0, La/ruv0;->j:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, La/ruv0;->w:La/pz40;

    .line 12
    .line 13
    check-cast v3, La/hgk0;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput v1, p0, La/ruv0;->n:F

    .line 19
    .line 20
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v2, p0, La/ruv0;->g:La/pz40;

    .line 28
    .line 29
    check-cast v2, La/hgk0;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v2, v3}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput v1, p0, La/ruv0;->q:F

    .line 36
    .line 37
    iput v0, p0, La/ruv0;->r:I

    .line 38
    .line 39
    return-void
.end method

.method public final l(F)F
    .locals 1

    .line 1
    iget-object p0, p0, La/ruv0;->b:La/fht0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fht0;->f()La/cvv0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget p0, p0, La/cvv0;->c:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    int-to-float p0, p0

    .line 14
    sub-float/2addr p1, p0

    .line 15
    const/4 p0, 0x0

    .line 16
    cmpg-float v0, p1, p0

    .line 17
    .line 18
    if-gez v0, :cond_1

    .line 19
    .line 20
    return p0

    .line 21
    :cond_1
    return p1
.end method

.method public final m(La/cvv0;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v2, v0, La/yuv0;->a:La/lxv0;

    .line 10
    .line 11
    invoke-static {p1, v2}, La/ktt0;->g(La/cvv0;La/lxv0;)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    int-to-float v2, v2

    .line 16
    const/4 v3, 0x5

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-static {v0, v4, v2, v1, v3}, La/yuv0;->a(La/yuv0;La/lxv0;FFI)La/yuv0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, p0, La/ruv0;->g:La/pz40;

    .line 23
    .line 24
    check-cast v2, La/hgk0;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget v0, p0, La/ruv0;->o:I

    .line 30
    .line 31
    iget p1, p1, La/cvv0;->a:I

    .line 32
    .line 33
    if-eq v0, p1, :cond_1

    .line 34
    .line 35
    iput p1, p0, La/ruv0;->o:I

    .line 36
    .line 37
    iput v1, p0, La/ruv0;->n:F

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, La/ruv0;->p:Z

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iget-boolean p1, p0, La/ruv0;->p:Z

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, La/ruv0;->a:La/duv0;

    .line 48
    .line 49
    invoke-virtual {p1}, La/duv0;->b()La/l7m0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, La/tly;

    .line 58
    .line 59
    iget v0, p0, La/ruv0;->n:F

    .line 60
    .line 61
    iget v1, p1, La/tly;->c:F

    .line 62
    .line 63
    invoke-virtual {p0, v1}, La/ruv0;->l(F)F

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iget p1, p1, La/tly;->b:F

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ruv0;->l(F)F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    iput p1, p0, La/ruv0;->n:F

    .line 82
    .line 83
    :cond_2
    return-void
.end method

.method public final n(La/lxv0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ruv0;->f()La/yuv0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, La/ruv0;->a:La/duv0;

    .line 12
    .line 13
    invoke-virtual {v1}, La/duv0;->b()La/l7m0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/tly;

    .line 22
    .line 23
    iget-boolean v1, v1, La/tly;->a:Z

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, La/ruv0;->k()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v1, p0, La/ruv0;->b:La/fht0;

    .line 32
    .line 33
    invoke-virtual {v1}, La/fht0;->f()La/cvv0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :cond_2
    invoke-static {v1, p1}, La/ktt0;->g(La/cvv0;La/lxv0;)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    int-to-float v1, v1

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x4

    .line 47
    invoke-static {v0, p1, v1, v2, v3}, La/yuv0;->a(La/yuv0;La/lxv0;FFI)La/yuv0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p0, p0, La/ruv0;->g:La/pz40;

    .line 52
    .line 53
    check-cast p0, La/hgk0;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
