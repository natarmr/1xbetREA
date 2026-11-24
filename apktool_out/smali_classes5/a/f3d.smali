.class public final La/f3d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:La/v0h0;


# instance fields
.field public final a:La/agk0;

.field public final b:La/pz40;

.field public final c:La/zbk;

.field public final d:La/agk0;

.field public final e:La/ywj;

.field public f:Z

.field public final g:La/a8z;

.field public final h:La/a8z;

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/sfc;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/sfc;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/y2d;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, La/y2d;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/v0h0;

    .line 15
    .line 16
    invoke-direct {v2, v1, v0}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, La/f3d;->j:La/v0h0;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, La/f3d;->a:La/agk0;

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/f3d;->b:La/pz40;

    .line 18
    .line 19
    new-instance v0, La/s82;

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-direct {v0, p0, v1}, La/s82;-><init>(La/f3d;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/f3d;->c:La/zbk;

    .line 30
    .line 31
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/f3d;->d:La/agk0;

    .line 39
    .line 40
    new-instance v0, La/y1d;

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    invoke-direct {v0, p0, v1}, La/y1d;-><init>(La/f3d;B)V

    .line 44
    .line 45
    .line 46
    new-instance v1, La/ywj;

    .line 47
    .line 48
    invoke-direct {v1, v0}, La/ywj;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, La/f3d;->e:La/ywj;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    iput-boolean v0, p0, La/f3d;->f:Z

    .line 55
    .line 56
    new-instance v0, La/s82;

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    invoke-direct {v0, p0, v1}, La/s82;-><init>(La/f3d;B)V

    .line 60
    .line 61
    .line 62
    sget-object v1, La/wez;->b:La/wez;

    .line 63
    .line 64
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, La/f3d;->g:La/a8z;

    .line 69
    .line 70
    new-instance v0, La/s82;

    .line 71
    .line 72
    const/4 v2, 0x6

    .line 73
    invoke-direct {v0, p0, v2}, La/s82;-><init>(La/f3d;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, La/f3d;->h:La/a8z;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/z2d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/z2d;

    .line 7
    .line 8
    iget v1, v0, La/z2d;->k:I

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
    iput v1, v0, La/z2d;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/z2d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/z2d;-><init>(La/f3d;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/z2d;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/z2d;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/f3d;->a:La/agk0;

    .line 51
    .line 52
    invoke-virtual {p1}, La/agk0;->l()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget-object v2, p0, La/f3d;->d:La/agk0;

    .line 57
    .line 58
    invoke-virtual {v2}, La/agk0;->l()F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    sub-float/2addr p1, v2

    .line 63
    const/high16 v2, 0x438c0000    # 280.0f

    .line 64
    .line 65
    const/4 v5, 0x5

    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-static {v6, v2, v3, v5}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iput v4, v0, La/z2d;->k:I

    .line 72
    .line 73
    iget-object p0, p0, La/f3d;->e:La/ywj;

    .line 74
    .line 75
    invoke-static {p0, p1, v2, v0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, v1, :cond_3

    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/a3d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/a3d;

    .line 7
    .line 8
    iget v1, v0, La/a3d;->k:I

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
    iput v1, v0, La/a3d;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/a3d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/a3d;-><init>(La/f3d;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/a3d;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/a3d;->k:I

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/f3d;->a:La/agk0;

    .line 51
    .line 52
    invoke-virtual {p1}, La/agk0;->l()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    const/high16 v2, 0x438c0000    # 280.0f

    .line 57
    .line 58
    const/4 v5, 0x5

    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-static {v6, v2, v3, v5}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iput v4, v0, La/a3d;->k:I

    .line 65
    .line 66
    iget-object p0, p0, La/f3d;->e:La/ywj;

    .line 67
    .line 68
    invoke-static {p0, p1, v2, v0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0
.end method

.method public final c(J)J
    .locals 2

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr v0, p1

    .line 7
    long-to-int v0, v0

    .line 8
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object p0, p0, La/f3d;->e:La/ywj;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/ywj;->e(F)F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {p1, p2, v0, p0, v1}, La/ne60;->a(JFFI)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    return-wide p0
.end method

.method public final d()F
    .locals 0

    .line 1
    iget-object p0, p0, La/f3d;->c:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/f3d;->d:La/agk0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/agk0;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, La/f3d;->d()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    cmpl-float v0, v0, v1

    .line 20
    .line 21
    if-lez v0, :cond_4

    .line 22
    .line 23
    invoke-virtual {p0}, La/f3d;->d()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/high16 v1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    cmpg-float v0, v0, v1

    .line 30
    .line 31
    if-gez v0, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0}, La/f3d;->d()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/high16 v1, 0x3f000000    # 0.5f

    .line 38
    .line 39
    cmpl-float v0, v0, v1

    .line 40
    .line 41
    if-ltz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/f3d;->a(La/zje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    sget-object p1, La/wne;->a:La/wne;

    .line 48
    .line 49
    if-ne p0, p1, :cond_1

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-virtual {p0, p1}, La/f3d;->b(La/zje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object p1, La/wne;->a:La/wne;

    .line 60
    .line 61
    if-ne p0, p1, :cond_3

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0
.end method

.method public final f(F)V
    .locals 4

    .line 1
    iget-object v0, p0, La/f3d;->a:La/agk0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v1, p1, v1

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    instance-of v2, v1, La/nz40;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    check-cast v1, La/nz40;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object v1, v3

    .line 22
    :goto_0
    if-eqz v1, :cond_4

    .line 23
    .line 24
    invoke-virtual {v1, v3, v3}, La/nz40;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/nz40;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    :try_start_0
    invoke-virtual {v1}, La/rfk0;->j()La/rfk0;

    .line 31
    .line 32
    .line 33
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    :try_start_1
    iget-object v3, p0, La/f3d;->d:La/agk0;

    .line 35
    .line 36
    invoke-virtual {v3, p1}, La/agk0;->m(F)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, La/agk0;->l()F

    .line 40
    .line 41
    .line 42
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    cmpl-float v3, v3, p1

    .line 44
    .line 45
    iget-object p0, p0, La/f3d;->b:La/pz40;

    .line 46
    .line 47
    if-ltz v3, :cond_2

    .line 48
    .line 49
    :try_start_2
    invoke-virtual {v0, p1}, La/agk0;->m(F)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    check-cast p0, La/hgk0;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v3, p0

    .line 63
    check-cast v3, La/hgk0;

    .line 64
    .line 65
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    invoke-virtual {v0, p1}, La/agk0;->m(F)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    check-cast p0, La/hgk0;

    .line 83
    .line 84
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_1
    :try_start_3
    invoke-static {v2}, La/rfk0;->q(La/rfk0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, La/nz40;->w()La/wdx;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, La/wdx;->L()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, La/nz40;->c()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catchall_1
    move-exception p0

    .line 102
    goto :goto_3

    .line 103
    :goto_2
    :try_start_4
    invoke-static {v2}, La/rfk0;->q(La/rfk0;)V

    .line 104
    .line 105
    .line 106
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 107
    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 108
    :catchall_2
    move-exception p0

    .line 109
    invoke-virtual {v1}, La/nz40;->c()V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_4
    const-string p0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 114
    .line 115
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method
