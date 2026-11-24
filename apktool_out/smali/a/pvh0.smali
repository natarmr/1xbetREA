.class public final La/pvh0;
.super La/p4;
.source "SourceFile"


# static fields
.field public static final t:La/p73;

.field public static final u:La/p73;


# instance fields
.field public final c:La/pz40;

.field public final d:La/pz40;

.field public e:Ljava/lang/Object;

.field public f:La/oms0;

.field public g:J

.field public final h:La/a7g0;

.field public i:La/pgk0;

.field public final j:La/agk0;

.field public k:La/n5a;

.field public final l:La/k050;

.field public final m:La/h050;

.field public n:J

.field public final o:La/vy40;

.field public p:La/jvh0;

.field public final q:La/ivh0;

.field public r:F

.field public final s:La/ivh0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/p73;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La/p73;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/pvh0;->t:La/p73;

    .line 8
    .line 9
    new-instance v0, La/p73;

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    invoke-direct {v0, v1}, La/p73;-><init>(F)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/pvh0;->u:La/p73;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/p4;-><init>(B)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/pvh0;->c:La/pz40;

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/pvh0;->d:La/pz40;

    .line 17
    .line 18
    iput-object p1, p0, La/pvh0;->e:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p1, La/a7g0;

    .line 21
    .line 22
    const/16 v0, 0x16

    .line 23
    .line 24
    invoke-direct {p1, p0, v0}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/pvh0;->h:La/a7g0;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-static {p1}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, La/pvh0;->j:La/agk0;

    .line 35
    .line 36
    new-instance p1, La/k050;

    .line 37
    .line 38
    invoke-direct {p1}, La/k050;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/pvh0;->l:La/k050;

    .line 42
    .line 43
    new-instance p1, La/h050;

    .line 44
    .line 45
    invoke-direct {p1}, La/h050;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/pvh0;->m:La/h050;

    .line 49
    .line 50
    const-wide/high16 v0, -0x8000000000000000L

    .line 51
    .line 52
    iput-wide v0, p0, La/pvh0;->n:J

    .line 53
    .line 54
    new-instance p1, La/vy40;

    .line 55
    .line 56
    invoke-direct {p1}, La/vy40;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, La/pvh0;->o:La/vy40;

    .line 60
    .line 61
    new-instance p1, La/ivh0;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-direct {p1, p0, v0}, La/ivh0;-><init>(La/pvh0;B)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, La/pvh0;->q:La/ivh0;

    .line 68
    .line 69
    new-instance p1, La/ivh0;

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-direct {p1, p0, v0}, La/ivh0;-><init>(La/pvh0;B)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, La/pvh0;->s:La/ivh0;

    .line 76
    .line 77
    return-void
.end method

.method public static q1(La/jvh0;J)V
    .locals 8

    .line 1
    iget-wide v0, p0, La/jvh0;->a:J

    .line 2
    .line 3
    add-long v3, v0, p1

    .line 4
    .line 5
    iput-wide v3, p0, La/jvh0;->a:J

    .line 6
    .line 7
    iget-wide p1, p0, La/jvh0;->h:J

    .line 8
    .line 9
    cmp-long v0, v3, p1

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    iput v1, p0, La/jvh0;->d:F

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v2, p0, La/jvh0;->b:La/p5u0;

    .line 19
    .line 20
    iget-object v5, p0, La/jvh0;->e:La/p73;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, La/jvh0;->f:La/p73;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    sget-object p1, La/pvh0;->t:La/p73;

    .line 30
    .line 31
    :cond_1
    move-object v7, p1

    .line 32
    sget-object v6, La/pvh0;->u:La/p73;

    .line 33
    .line 34
    invoke-interface/range {v2 .. v7}, La/l5u0;->c(JLa/t73;La/t73;La/t73;)La/t73;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, La/p73;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, La/p73;->a(I)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-static {p1, p2, v1}, La/l1e0;->c(FFF)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, La/jvh0;->d:F

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    invoke-virtual {v5, v0}, La/p73;->a(I)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    long-to-float v2, v3

    .line 57
    long-to-float p1, p1

    .line 58
    div-float/2addr v2, p1

    .line 59
    sub-float p1, v1, v2

    .line 60
    .line 61
    mul-float/2addr p1, v0

    .line 62
    mul-float/2addr v2, v1

    .line 63
    add-float/2addr v2, p1

    .line 64
    iput v2, p0, La/jvh0;->d:F

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final A0()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/pvh0;->c:La/pz40;

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
    return-object p0
.end method

.method public final I0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/pvh0;->d:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final K0(La/oms0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/pvh0;->f:La/oms0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, La/pvh0;->f:La/oms0;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, ", new instance: "

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/fsb0;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iput-object p1, p0, La/pvh0;->f:La/oms0;

    .line 40
    .line 41
    return-void
.end method

.method public final L0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/pvh0;->f:La/oms0;

    .line 3
    .line 4
    iget-object v0, p0, La/pvh0;->i:La/pgk0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, La/pgk0;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final n1(La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p1}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/hhm0;->v(Lkotlin/coroutines/CoroutineContext;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v1, v0, v1

    .line 11
    .line 12
    if-gtz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, La/pvh0;->o1()V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    iput v0, p0, La/pvh0;->r:F

    .line 21
    .line 22
    invoke-interface {p1}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object p0, p0, La/pvh0;->s:La/ivh0;

    .line 31
    .line 32
    invoke-interface {v0, p0, p1}, La/qq40;->e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, La/wne;->a:La/wne;

    .line 37
    .line 38
    if-ne p0, p1, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0
.end method

.method public final o1()V
    .locals 1

    .line 1
    iget-object v0, p0, La/pvh0;->f:La/oms0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/oms0;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, La/pvh0;->o:La/vy40;

    .line 9
    .line 10
    invoke-virtual {v0}, La/vy40;->d()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/pvh0;->p:La/jvh0;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, La/pvh0;->p:La/jvh0;

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/pvh0;->u1(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/pvh0;->t1()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final p1()V
    .locals 10

    .line 1
    iget-object v0, p0, La/pvh0;->f:La/oms0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, La/pvh0;->p:La/jvh0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_4

    .line 10
    .line 11
    iget-wide v3, p0, La/pvh0;->g:J

    .line 12
    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    cmp-long v1, v3, v5

    .line 16
    .line 17
    if-lez v1, :cond_3

    .line 18
    .line 19
    iget-object v1, p0, La/pvh0;->j:La/agk0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/agk0;->l()F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/high16 v4, 0x3f800000    # 1.0f

    .line 26
    .line 27
    cmpg-float v3, v3, v4

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v3, p0, La/pvh0;->d:La/pz40;

    .line 33
    .line 34
    check-cast v3, La/hgk0;

    .line 35
    .line 36
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v4, p0, La/pvh0;->c:La/pz40;

    .line 41
    .line 42
    check-cast v4, La/hgk0;

    .line 43
    .line 44
    invoke-virtual {v4}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance v3, La/jvh0;

    .line 56
    .line 57
    invoke-direct {v3}, La/jvh0;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, La/agk0;->l()F

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iput v4, v3, La/jvh0;->d:F

    .line 65
    .line 66
    iget-wide v4, p0, La/pvh0;->g:J

    .line 67
    .line 68
    iput-wide v4, v3, La/jvh0;->g:J

    .line 69
    .line 70
    long-to-double v4, v4

    .line 71
    invoke-virtual {v1}, La/agk0;->l()F

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    float-to-double v6, v6

    .line 76
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 77
    .line 78
    sub-double/2addr v8, v6

    .line 79
    mul-double/2addr v8, v4

    .line 80
    invoke-static {v8, v9}, La/si30;->c(D)J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    iput-wide v4, v3, La/jvh0;->h:J

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-virtual {v1}, La/agk0;->l()F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v5, v3, La/jvh0;->e:La/p73;

    .line 92
    .line 93
    invoke-virtual {v5, v1, v4}, La/p73;->e(FI)V

    .line 94
    .line 95
    .line 96
    move-object v1, v3

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    :goto_0
    move-object v1, v2

    .line 99
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 100
    .line 101
    iget-wide v3, p0, La/pvh0;->g:J

    .line 102
    .line 103
    iput-wide v3, v1, La/jvh0;->g:J

    .line 104
    .line 105
    iget-object v3, p0, La/pvh0;->o:La/vy40;

    .line 106
    .line 107
    invoke-virtual {v3, v1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, La/oms0;->n(La/jvh0;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    iput-object v2, p0, La/pvh0;->p:La/jvh0;

    .line 114
    .line 115
    return-void
.end method

.method public final r1(La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, La/lvh0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/lvh0;

    .line 7
    .line 8
    iget v1, v0, La/lvh0;->k:I

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
    iput v1, v0, La/lvh0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lvh0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/lvh0;-><init>(La/pvh0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/lvh0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lvh0;->k:I

    .line 30
    .line 31
    iget-object v3, p0, La/pvh0;->o:La/vy40;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const-wide/high16 v6, -0x8000000000000000L

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    :goto_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, La/vy40;->i()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p0, La/pvh0;->p:La/jvh0;

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_4
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, La/hhm0;->v(Lkotlin/coroutines/CoroutineContext;)F

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    const/4 v2, 0x0

    .line 80
    cmpg-float p1, p1, v2

    .line 81
    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, La/pvh0;->o1()V

    .line 85
    .line 86
    .line 87
    iput-wide v6, p0, La/pvh0;->n:J

    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_5
    iget-wide v8, p0, La/pvh0;->n:J

    .line 93
    .line 94
    cmp-long p1, v8, v6

    .line 95
    .line 96
    if-nez p1, :cond_6

    .line 97
    .line 98
    iput v5, v0, La/lvh0;->k:I

    .line 99
    .line 100
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object v2, p0, La/pvh0;->q:La/ivh0;

    .line 109
    .line 110
    invoke-interface {p1, v2, v0}, La/qq40;->e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v1, :cond_6

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    :goto_2
    invoke-virtual {v3}, La/vy40;->j()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_8

    .line 122
    .line 123
    iget-object p1, p0, La/pvh0;->p:La/jvh0;

    .line 124
    .line 125
    if-eqz p1, :cond_7

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    iput-wide v6, p0, La/pvh0;->n:J

    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_8
    :goto_3
    iput v4, v0, La/lvh0;->k:I

    .line 134
    .line 135
    invoke-virtual {p0, v0}, La/pvh0;->n1(La/zje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v1, :cond_6

    .line 140
    .line 141
    :goto_4
    return-object v1
.end method

.method public final s1(FLjava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, v0, p1

    .line 3
    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "Expecting fraction between 0 and 1. Got "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, La/fsb0;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v5, p0, La/pvh0;->f:La/oms0;

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    iget-object v0, p0, La/pvh0;->c:La/pz40;

    .line 38
    .line 39
    check-cast v0, La/hgk0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v1, La/mvh0;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    move-object v4, p0

    .line 49
    move v6, p1

    .line 50
    move-object v2, p2

    .line 51
    invoke-direct/range {v1 .. v7}, La/mvh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/pvh0;La/oms0;FLa/yje;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, v4, La/pvh0;->m:La/h050;

    .line 55
    .line 56
    invoke-static {p0, v1, p3}, La/h050;->a(La/h050;Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sget-object p1, La/wne;->a:La/wne;

    .line 61
    .line 62
    if-ne p0, p1, :cond_2

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method

.method public final t1()V
    .locals 5

    .line 1
    iget-object v0, p0, La/pvh0;->f:La/oms0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, La/pvh0;->j:La/agk0;

    .line 7
    .line 8
    invoke-virtual {p0}, La/agk0;->l()F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    float-to-double v1, p0

    .line 13
    iget-object p0, v0, La/oms0;->m:La/zbk;

    .line 14
    .line 15
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    long-to-double v3, v3

    .line 26
    mul-double/2addr v1, v3

    .line 27
    invoke-static {v1, v2}, La/si30;->c(D)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, La/oms0;->m(J)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final u1(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/pvh0;->j:La/agk0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/agk0;->m(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v1(La/pgk0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/pvh0;->i:La/pgk0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, La/pvh0;->i:La/pgk0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, La/pgk0;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, La/pvh0;->i:La/pgk0;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, La/pgk0;->h:La/jk8;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, La/jk8;->a()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object p1, p0, La/pvh0;->i:La/pgk0;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, La/pgk0;->e()V

    .line 32
    .line 33
    .line 34
    :cond_2
    iget-object p1, p0, La/pvh0;->i:La/pgk0;

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    sget-object v0, La/phu0;->j:La/g4s0;

    .line 39
    .line 40
    iget-object v1, p0, La/pvh0;->h:La/a7g0;

    .line 41
    .line 42
    invoke-virtual {p1, p0, v0, v1}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method public final w1(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/nvh0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/nvh0;

    .line 7
    .line 8
    iget v1, v0, La/nvh0;->l:I

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
    iput v1, v0, La/nvh0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nvh0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/nvh0;-><init>(La/pvh0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/nvh0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nvh0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, La/pvh0;->l:La/k050;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v6, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    iget-object v0, v0, La/nvh0;->i:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-object v2, v0, La/nvh0;->i:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La/pvh0;->c:La/pz40;

    .line 65
    .line 66
    check-cast p1, La/hgk0;

    .line 67
    .line 68
    invoke-virtual {p1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, v0, La/nvh0;->i:Ljava/lang/Object;

    .line 73
    .line 74
    iput v6, v0, La/nvh0;->l:I

    .line 75
    .line 76
    invoke-virtual {v4, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-ne v2, v1, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_1
    iput-object p1, v0, La/nvh0;->i:Ljava/lang/Object;

    .line 84
    .line 85
    iput v5, v0, La/nvh0;->l:I

    .line 86
    .line 87
    new-instance v2, La/n5a;

    .line 88
    .line 89
    invoke-static {v0}, La/pnx;->b(La/yje;)La/yje;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {v2, v6, v0}, La/n5a;-><init>(ILa/yje;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, La/n5a;->r()V

    .line 97
    .line 98
    .line 99
    iput-object v2, p0, La/pvh0;->k:La/n5a;

    .line 100
    .line 101
    invoke-virtual {v4, v3}, La/k050;->c(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, La/n5a;->p()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-ne v0, v1, :cond_5

    .line 109
    .line 110
    :goto_2
    return-object v1

    .line 111
    :cond_5
    move-object v7, v0

    .line 112
    move-object v0, p1

    .line 113
    move-object p1, v7

    .line 114
    :goto_3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_6
    const-wide/high16 v0, -0x8000000000000000L

    .line 124
    .line 125
    iput-wide v0, p0, La/pvh0;->n:J

    .line 126
    .line 127
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 128
    .line 129
    const-string p1, "targetState while waiting for composition"

    .line 130
    .line 131
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p0
.end method

.method public final x1(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/ovh0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ovh0;

    .line 7
    .line 8
    iget v1, v0, La/ovh0;->l:I

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
    iput v1, v0, La/ovh0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ovh0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ovh0;-><init>(La/pvh0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ovh0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ovh0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    iget-object v5, p0, La/pvh0;->l:La/k050;

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v6, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object v0, v0, La/ovh0;->i:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-object v2, v0, La/ovh0;->i:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La/pvh0;->c:La/pz40;

    .line 65
    .line 66
    check-cast p1, La/hgk0;

    .line 67
    .line 68
    invoke-virtual {p1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, v0, La/ovh0;->i:Ljava/lang/Object;

    .line 73
    .line 74
    iput v6, v0, La/ovh0;->l:I

    .line 75
    .line 76
    invoke-virtual {v5, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-ne v2, v1, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_1
    iget-object v2, p0, La/pvh0;->e:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    invoke-virtual {v5, v3}, La/k050;->c(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    iput-object p1, v0, La/ovh0;->i:Ljava/lang/Object;

    .line 96
    .line 97
    iput v4, v0, La/ovh0;->l:I

    .line 98
    .line 99
    new-instance v2, La/n5a;

    .line 100
    .line 101
    invoke-static {v0}, La/pnx;->b(La/yje;)La/yje;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-direct {v2, v6, v0}, La/n5a;-><init>(ILa/yje;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, La/n5a;->r()V

    .line 109
    .line 110
    .line 111
    iput-object v2, p0, La/pvh0;->k:La/n5a;

    .line 112
    .line 113
    invoke-virtual {v5, v3}, La/k050;->c(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, La/n5a;->p()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-ne v0, v1, :cond_6

    .line 121
    .line 122
    :goto_2
    return-object v1

    .line 123
    :cond_6
    move-object v7, v0

    .line 124
    move-object v0, p1

    .line 125
    move-object p1, v7

    .line 126
    :goto_3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_7

    .line 131
    .line 132
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_7
    const-wide/high16 v1, -0x8000000000000000L

    .line 136
    .line 137
    iput-wide v1, p0, La/pvh0;->n:J

    .line 138
    .line 139
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 140
    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v2, "snapTo() was canceled because state was changed to "

    .line 144
    .line 145
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string p1, " instead of "

    .line 152
    .line 153
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p0
.end method

.method public final y0()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/pvh0;->d:La/pz40;

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
    return-object p0
.end method
