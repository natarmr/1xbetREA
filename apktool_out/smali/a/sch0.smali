.class public final La/sch0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/bch0;

.field public b:La/vf80;

.field public c:La/qkq;

.field public d:La/ma80;

.field public e:Z

.field public f:La/yj50;

.field public final g:La/lbh0;

.field public final h:La/ibh0;

.field public i:Z

.field public j:B

.field public k:La/qah0;

.field public final l:La/rch0;

.field public final m:La/gwg0;


# direct methods
.method public constructor <init>(La/bch0;La/vf80;La/qkq;La/ma80;ZLa/yj50;La/lbh0;La/ibh0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sch0;->a:La/bch0;

    .line 5
    .line 6
    iput-object p2, p0, La/sch0;->b:La/vf80;

    .line 7
    .line 8
    iput-object p3, p0, La/sch0;->c:La/qkq;

    .line 9
    .line 10
    iput-object p4, p0, La/sch0;->d:La/ma80;

    .line 11
    .line 12
    iput-boolean p5, p0, La/sch0;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, La/sch0;->f:La/yj50;

    .line 15
    .line 16
    iput-object p7, p0, La/sch0;->g:La/lbh0;

    .line 17
    .line 18
    iput-object p8, p0, La/sch0;->h:La/ibh0;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-byte p1, p0, La/sch0;->j:B

    .line 22
    .line 23
    sget-object p1, La/fbh0;->a:La/dbh0;

    .line 24
    .line 25
    iput-object p1, p0, La/sch0;->k:La/qah0;

    .line 26
    .line 27
    new-instance p1, La/rch0;

    .line 28
    .line 29
    invoke-direct {p1, p0}, La/rch0;-><init>(La/sch0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/sch0;->l:La/rch0;

    .line 33
    .line 34
    new-instance p1, La/gwg0;

    .line 35
    .line 36
    const/16 p2, 0x9

    .line 37
    .line 38
    invoke-direct {p1, p0, p2}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/sch0;->m:La/gwg0;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, La/pch0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/pch0;

    .line 7
    .line 8
    iget v1, v0, La/pch0;->l:I

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
    iput v1, v0, La/pch0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/pch0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/pch0;-><init>(La/sch0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/pch0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/pch0;->l:I

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
    iget-object p1, v0, La/pch0;->i:La/lie0;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    move-object v6, p0

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    move-object v6, p0

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
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v7, La/lie0;

    .line 59
    .line 60
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-wide p1, v7, La/lie0;->a:J

    .line 64
    .line 65
    iput-boolean v4, p0, La/sch0;->i:Z

    .line 66
    .line 67
    :try_start_1
    sget-object p3, La/c050;->a:La/c050;

    .line 68
    .line 69
    new-instance v5, La/qch0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    move-object v6, p0

    .line 73
    move-wide v8, p1

    .line 74
    :try_start_2
    invoke-direct/range {v5 .. v10}, La/qch0;-><init>(La/sch0;La/lie0;JLa/yje;)V

    .line 75
    .line 76
    .line 77
    iput-object v7, v0, La/pch0;->i:La/lie0;

    .line 78
    .line 79
    iput v4, v0, La/pch0;->l:I

    .line 80
    .line 81
    invoke-virtual {v6, p3, v5, v0}, La/sch0;->g(La/c050;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 85
    if-ne p0, v1, :cond_3

    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_3
    move-object p1, v7

    .line 89
    :goto_1
    iput-boolean v3, v6, La/sch0;->i:Z

    .line 90
    .line 91
    iget-wide p0, p1, La/lie0;->a:J

    .line 92
    .line 93
    new-instance p2, La/g6u0;

    .line 94
    .line 95
    invoke-direct {p2, p0, p1}, La/g6u0;-><init>(J)V

    .line 96
    .line 97
    .line 98
    return-object p2

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    :goto_2
    move-object p1, v0

    .line 101
    goto :goto_3

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    move-object v6, p0

    .line 104
    goto :goto_2

    .line 105
    :goto_3
    iput-boolean v3, v6, La/sch0;->i:Z

    .line 106
    .line 107
    throw p1
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, La/sch0;->a:La/bch0;

    .line 2
    .line 3
    invoke-interface {v0}, La/bch0;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, La/sch0;->a:La/bch0;

    .line 11
    .line 12
    invoke-interface {v0}, La/bch0;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, La/sch0;->b:La/vf80;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, La/vf80;->b()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-ne p0, v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_1
    :goto_0
    return v1
.end method

.method public final c(JZLa/bnn0;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p3, p0, La/sch0;->c:La/qkq;

    .line 4
    .line 5
    sget-object v0, La/fbh0;->a:La/dbh0;

    .line 6
    .line 7
    instance-of p3, p3, La/iuj;

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p3, p0, La/sch0;->d:La/ma80;

    .line 15
    .line 16
    sget-object v0, La/ma80;->b:La/ma80;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-ne p3, v0, :cond_1

    .line 20
    .line 21
    const/4 p3, 0x1

    .line 22
    :goto_0
    invoke-static {p1, p2, v1, v1, p3}, La/g6u0;->a(JFFI)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 p3, 0x2

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    new-instance p3, La/qkc0;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p3, p0, v0}, La/qkc0;-><init>(La/sch0;La/yje;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La/sch0;->b:La/vf80;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, La/sch0;->b()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    invoke-interface {v0, p1, p2, p3, p4}, La/vf80;->d(JLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object p1, La/wne;->a:La/wne;

    .line 50
    .line 51
    if-ne p0, p1, :cond_2

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    new-instance p0, La/qkc0;

    .line 58
    .line 59
    iget-object p3, p3, La/qkc0;->m:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p3, La/sch0;

    .line 62
    .line 63
    invoke-direct {p0, p3, p4}, La/qkc0;-><init>(La/sch0;La/yje;)V

    .line 64
    .line 65
    .line 66
    iput-wide p1, p0, La/qkc0;->l:J

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/qkc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object p1, La/wne;->a:La/wne;

    .line 75
    .line 76
    if-ne p0, p1, :cond_4

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0
.end method

.method public final d(La/qah0;JI)J
    .locals 14

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    iget-object v2, p0, La/sch0;->f:La/yj50;

    .line 4
    .line 5
    iget-object v2, v2, La/yj50;->a:La/ek50;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2}, La/ek50;->a1()La/ek50;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v2, v3

    .line 16
    :goto_0
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    move/from16 v7, p4

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2, v7, v0, v1}, La/ek50;->C(IJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v8

    .line 26
    move-wide v12, v8

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-wide v12, v4

    .line 29
    :goto_1
    invoke-static {v0, v1, v12, v13}, La/ne60;->e(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iget-object v2, p0, La/sch0;->d:La/ma80;

    .line 34
    .line 35
    sget-object v6, La/ma80;->b:La/ma80;

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    const/4 v9, 0x0

    .line 39
    if-ne v2, v6, :cond_2

    .line 40
    .line 41
    invoke-static {v0, v1, v9, v9, v8}, La/ne60;->a(JFFI)J

    .line 42
    .line 43
    .line 44
    move-result-wide v9

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/4 v2, 0x2

    .line 47
    invoke-static {v0, v1, v9, v9, v2}, La/ne60;->a(JFFI)J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    :goto_2
    invoke-virtual {p0, v9, v10}, La/sch0;->f(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v9

    .line 55
    invoke-virtual {p0, v9, v10}, La/sch0;->h(J)F

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-interface {p1, v2}, La/qah0;->a(F)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {p0, v2}, La/sch0;->i(F)J

    .line 64
    .line 65
    .line 66
    move-result-wide v9

    .line 67
    invoke-virtual {p0, v9, v10}, La/sch0;->f(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v9

    .line 71
    iget-object v2, p0, La/sch0;->g:La/lbh0;

    .line 72
    .line 73
    iget-boolean v6, v2, La/lm40;->n:Z

    .line 74
    .line 75
    if-nez v6, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-static {v2}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :try_start_0
    sget-object v6, Landroidx/compose/ui/platform/AndroidComposeView;->o2:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    if-nez v6, :cond_4

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const-string v11, "dispatchOnScrollChanged"

    .line 97
    .line 98
    invoke-virtual {v6, v11, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    .line 104
    .line 105
    sput-object v6, Landroidx/compose/ui/platform/AndroidComposeView;->o2:Ljava/lang/reflect/Method;

    .line 106
    .line 107
    :cond_4
    invoke-virtual {v6, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    :catch_0
    :goto_3
    invoke-static {v0, v1, v9, v10}, La/ne60;->e(JJ)J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    iget-object p0, p0, La/sch0;->f:La/yj50;

    .line 115
    .line 116
    iget-object p0, p0, La/yj50;->a:La/ek50;

    .line 117
    .line 118
    if-eqz p0, :cond_5

    .line 119
    .line 120
    invoke-virtual {p0}, La/ek50;->a1()La/ek50;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    :cond_5
    move-object v6, v3

    .line 125
    move-wide v8, v9

    .line 126
    if-eqz v6, :cond_6

    .line 127
    .line 128
    move-wide v10, v0

    .line 129
    invoke-virtual/range {v6 .. v11}, La/ek50;->S(IJJ)J

    .line 130
    .line 131
    .line 132
    move-result-wide v4

    .line 133
    :cond_6
    invoke-static {v12, v13, v8, v9}, La/ne60;->f(JJ)J

    .line 134
    .line 135
    .line 136
    move-result-wide v0

    .line 137
    invoke-static {v0, v1, v4, v5}, La/ne60;->f(JJ)J

    .line 138
    .line 139
    .line 140
    move-result-wide v0

    .line 141
    return-wide v0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-boolean p0, p0, La/sch0;->e:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/high16 p0, -0x40800000    # -1.0f

    .line 6
    .line 7
    mul-float/2addr p1, p0

    .line 8
    :cond_0
    return p1
.end method

.method public final f(J)J
    .locals 0

    .line 1
    iget-boolean p0, p0, La/sch0;->e:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/high16 p0, -0x40800000    # -1.0f

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, La/ne60;->g(FJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0

    .line 12
    :cond_0
    return-wide p1
.end method

.method public final g(La/c050;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/sch0;->a:La/bch0;

    .line 2
    .line 3
    new-instance v1, La/kmg0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xe

    .line 7
    .line 8
    invoke-direct {v1, p0, p2, v2, v3}, La/kmg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, v1, p3}, La/bch0;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, La/wne;->a:La/wne;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method public final h(J)F
    .locals 2

    .line 1
    iget-object p0, p0, La/sch0;->d:La/ma80;

    .line 2
    .line 3
    sget-object v0, La/ma80;->b:La/ma80;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/16 p0, 0x20

    .line 8
    .line 9
    shr-long p0, p1, p0

    .line 10
    .line 11
    :goto_0
    long-to-int p0, p0

    .line 12
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const-wide v0, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long p0, p1, v0

    .line 23
    .line 24
    goto :goto_0
.end method

.method public final i(F)J
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-wide/16 p0, 0x0

    .line 7
    .line 8
    return-wide p0

    .line 9
    :cond_0
    iget-object p0, p0, La/sch0;->d:La/ma80;

    .line 10
    .line 11
    sget-object v1, La/ma80;->b:La/ma80;

    .line 12
    .line 13
    const-wide v2, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/16 v4, 0x20

    .line 19
    .line 20
    if-ne p0, v1, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-long p0, p0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v0, v0

    .line 32
    shl-long/2addr p0, v4

    .line 33
    and-long/2addr v0, v2

    .line 34
    or-long/2addr p0, v0

    .line 35
    return-wide p0

    .line 36
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    int-to-long v0, p0

    .line 41
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    int-to-long p0, p0

    .line 46
    shl-long/2addr v0, v4

    .line 47
    and-long/2addr p0, v2

    .line 48
    or-long/2addr p0, v0

    .line 49
    return-wide p0
.end method

.method public final j(J)F
    .locals 5

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
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x20

    .line 17
    .line 18
    shr-long/2addr p1, v2

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    float-to-double v1, v1

    .line 29
    float-to-double v3, p2

    .line 30
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    double-to-float p2, v1

    .line 35
    float-to-double v1, p2

    .line 36
    const-wide v3, 0x3fe921fb54442d18L    # 0.7853981633974483

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmpl-double p2, v1, v3

    .line 42
    .line 43
    iget-object p0, p0, La/sch0;->d:La/ma80;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    if-ltz p2, :cond_1

    .line 47
    .line 48
    sget-object p1, La/ma80;->a:La/ma80;

    .line 49
    .line 50
    if-ne p0, p1, :cond_0

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_0
    return v1

    .line 58
    :cond_1
    sget-object p2, La/ma80;->b:La/ma80;

    .line 59
    .line 60
    if-ne p0, p2, :cond_2

    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_2
    return v1
.end method
