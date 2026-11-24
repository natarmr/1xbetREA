.class public final La/tfk;
.super La/yjj;
.source "SourceFile"

# interfaces
.implements La/kfk;
.implements La/goc;


# instance fields
.field public final f:La/eu00;

.field public final g:La/tek;

.field public h:Ljava/util/List;

.field public final i:La/p5;

.field public final j:La/c4d0;

.field public final k:La/h950;

.field public final l:La/roi0;

.field public final m:La/xbu0;

.field public final n:La/hfk;

.field public o:La/kzj0;

.field public p:La/kzj0;

.field public q:Ljava/util/List;

.field public r:La/kzj0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(La/eu00;La/vjj;La/g93;La/g950;La/tek;La/c4d0;La/h950;La/roi0;La/xbu0;La/hfk;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v0, La/gmk0;->x0:La/gne0;

    .line 44
    .line 45
    invoke-direct {p0, p2, p3, p4, v0}, La/yjj;-><init>(La/vjj;La/g93;La/g950;La/gmk0;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/tfk;->f:La/eu00;

    .line 49
    .line 50
    iput-object p5, p0, La/tfk;->g:La/tek;

    .line 51
    .line 52
    new-instance p2, La/o5;

    .line 53
    .line 54
    const/4 p3, 0x0

    .line 55
    invoke-direct {p2, p0, p3}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2}, La/eu00;->b(Lkotlin/jvm/functions/Function0;)La/cu00;

    .line 59
    .line 60
    .line 61
    new-instance p1, La/p5;

    .line 62
    .line 63
    invoke-direct {p1, p0}, La/p5;-><init>(La/tfk;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, La/tfk;->i:La/p5;

    .line 67
    .line 68
    iput-object p6, p0, La/tfk;->j:La/c4d0;

    .line 69
    .line 70
    iput-object p7, p0, La/tfk;->k:La/h950;

    .line 71
    .line 72
    iput-object p8, p0, La/tfk;->l:La/roi0;

    .line 73
    .line 74
    iput-object p9, p0, La/tfk;->m:La/xbu0;

    .line 75
    .line 76
    iput-object p10, p0, La/tfk;->n:La/hfk;

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final A()La/h950;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->k:La/h950;

    .line 2
    .line 3
    return-object p0
.end method

.method public final B()La/hfk;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->n:La/hfk;

    .line 2
    .line 3
    return-object p0
.end method

.method public final I()La/kzj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->r:La/kzj0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "defaultTypeImpl"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final L()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final M()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->h:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "declaredTypeParametersImpl"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final O()La/z3;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->j:La/c4d0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Q()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final a()La/foc;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final a()La/vjj;
    .locals 0

    .line 2
    return-object p0
.end method

.method public final f(La/xzs0;)La/xjj;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/xzs0;->a:La/vzs0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/vzs0;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v1, La/tfk;

    .line 14
    .line 15
    invoke-virtual {p0}, La/yjj;->j()La/vjj;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/p4;->getAnnotations()La/g93;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, La/wjj;->getName()La/g950;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v10, p0, La/tfk;->m:La/xbu0;

    .line 37
    .line 38
    iget-object v11, p0, La/tfk;->n:La/hfk;

    .line 39
    .line 40
    iget-object v2, p0, La/tfk;->f:La/eu00;

    .line 41
    .line 42
    iget-object v6, p0, La/tfk;->g:La/tek;

    .line 43
    .line 44
    iget-object v7, p0, La/tfk;->j:La/c4d0;

    .line 45
    .line 46
    iget-object v8, p0, La/tfk;->k:La/h950;

    .line 47
    .line 48
    iget-object v9, p0, La/tfk;->l:La/roi0;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v11}, La/tfk;-><init>(La/eu00;La/vjj;La/g93;La/g950;La/tek;La/c4d0;La/h950;La/roi0;La/xbu0;La/hfk;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/tfk;->M()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, La/tfk;->r1()La/kzj0;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    sget-object v3, La/t3u0;->c:La/t3u0;

    .line 62
    .line 63
    invoke-virtual {p1, v2, v3}, La/xzs0;->f(La/wsy;La/t3u0;)La/wsy;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, La/qsm0;->s(La/wsy;)La/kzj0;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {p0}, La/tfk;->q1()La/kzj0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1, p0, v3}, La/xzs0;->f(La/wsy;La/t3u0;)La/wsy;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, La/qsm0;->s(La/wsy;)La/kzj0;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v1, v0, v2, p0}, La/tfk;->s1(Ljava/util/List;La/kzj0;La/kzj0;)V

    .line 84
    .line 85
    .line 86
    return-object v1
.end method

.method public final getVisibility()La/tek;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->g:La/tek;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()La/iys0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->i:La/p5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, La/tfk;->r1()La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/w0;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v1, p0, v2}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    invoke-static {v0, v1, p0}, La/e0t0;->c(La/wsy;Lkotlin/jvm/functions/Function1;La/nbk0;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final i0(La/zjj;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, La/zjj;->n(La/tfk;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final isExternal()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final o1()La/xjj;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final p1()La/wm40;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/tfk;->q1()La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/bdx;->k0(La/wsy;)Z

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
    invoke-virtual {p0}, La/tfk;->q1()La/kzj0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, La/wsy;->S()La/iys0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, La/iys0;->n()La/foc;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    instance-of v0, p0, La/wm40;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p0, La/wm40;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final q1()La/kzj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->p:La/kzj0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "expandedType"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final r1()La/kzj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->o:La/kzj0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "underlyingType"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final s1(Ljava/util/List;La/kzj0;La/kzj0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/tfk;->h:Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, La/tfk;->o:La/kzj0;

    .line 13
    .line 14
    iput-object p3, p0, La/tfk;->p:La/kzj0;

    .line 15
    .line 16
    invoke-static {p0}, La/nsm0;->o(La/goc;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/tfk;->q:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p0}, La/tfk;->p1()La/wm40;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, La/wm40;->k0()La/cr30;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    move-object v4, p1

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_1
    sget-object p1, La/br30;->b:La/br30;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_2
    new-instance v5, La/pnk0;

    .line 41
    .line 42
    const/16 p1, 0x10

    .line 43
    .line 44
    invoke-direct {v5, p0, p1}, La/pnk0;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    sget-object p1, La/e0t0;->a:La/a2o;

    .line 48
    .line 49
    invoke-static {p0}, La/f2o;->f(La/vjj;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    sget-object p1, La/c2o;->k:La/c2o;

    .line 56
    .line 57
    invoke-virtual {p0}, La/tfk;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    filled-new-array {p2}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {p1, p2}, La/f2o;->c(La/c2o;[Ljava/lang/String;)La/a2o;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    invoke-virtual {p0}, La/tfk;->h()La/iys0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    move-object p1, v1

    .line 77
    check-cast p1, La/p5;

    .line 78
    .line 79
    invoke-virtual {p1}, La/p5;->getParameters()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, La/e0t0;->d(Ljava/util/List;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    sget-object p1, La/ays0;->b:La/fck0;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v0, La/ays0;->c:La/ays0;

    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    invoke-static/range {v0 .. v5}, La/ucx;->i0(La/ays0;La/iys0;Ljava/util/List;ZLa/cr30;Lkotlin/jvm/functions/Function1;)La/kzj0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_3
    iput-object p1, p0, La/tfk;->r:La/kzj0;

    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    const/16 p0, 0xc

    .line 103
    .line 104
    invoke-static {p0}, La/e0t0;->a(I)V

    .line 105
    .line 106
    .line 107
    const/4 p0, 0x0

    .line 108
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "typealias "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/wjj;->getName()La/g950;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, La/g950;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final x()La/roi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tfk;->l:La/roi0;

    .line 2
    .line 3
    return-object p0
.end method
