.class public final La/hjc0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/mne;

.field public final c:La/wsf0;

.field public final d:La/y3v;

.field public final e:La/s470;

.field public final f:La/m1e;

.field public final g:La/tpx;

.field public final h:La/b8u;

.field public final i:La/xsu;

.field public final j:La/p7m0;

.field public final k:La/p7m0;

.field public final l:La/p7m0;

.field public m:Z


# direct methods
.method public constructor <init>(La/i1w0;La/tpx;La/mne;La/wsf0;La/y3v;La/s470;La/m1e;La/tpx;La/b8u;La/xsu;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, La/hjc0;->b:La/mne;

    .line 8
    .line 9
    iput-object p4, p0, La/hjc0;->c:La/wsf0;

    .line 10
    .line 11
    iput-object p5, p0, La/hjc0;->d:La/y3v;

    .line 12
    .line 13
    move-object/from16 v1, p6

    .line 14
    .line 15
    iput-object v1, p0, La/hjc0;->e:La/s470;

    .line 16
    .line 17
    move-object/from16 v1, p7

    .line 18
    .line 19
    iput-object v1, p0, La/hjc0;->f:La/m1e;

    .line 20
    .line 21
    move-object/from16 v2, p8

    .line 22
    .line 23
    iput-object v2, p0, La/hjc0;->g:La/tpx;

    .line 24
    .line 25
    move-object/from16 v2, p9

    .line 26
    .line 27
    iput-object v2, p0, La/hjc0;->h:La/b8u;

    .line 28
    .line 29
    move-object/from16 v2, p10

    .line 30
    .line 31
    iput-object v2, p0, La/hjc0;->i:La/xsu;

    .line 32
    .line 33
    new-instance v2, La/zic0;

    .line 34
    .line 35
    invoke-interface {v1}, La/m1e;->c()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-interface {v1}, La/m1e;->c()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v4, 0x1

    .line 44
    xor-int/2addr v1, v4

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-direct {v2, v5, v5, v3, v1}, La/zic0;-><init>(IZZZ)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iput-object v1, p0, La/hjc0;->j:La/p7m0;

    .line 54
    .line 55
    sget-object v1, La/bjc0;->a:La/bjc0;

    .line 56
    .line 57
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p0, La/hjc0;->k:La/p7m0;

    .line 62
    .line 63
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, p0, La/hjc0;->l:La/p7m0;

    .line 70
    .line 71
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v2, La/wyb0;

    .line 76
    .line 77
    const/16 v3, 0x18

    .line 78
    .line 79
    invoke-direct {v2, v3}, La/wyb0;-><init>(B)V

    .line 80
    .line 81
    .line 82
    new-instance v3, La/o690;

    .line 83
    .line 84
    const/16 v6, 0x12

    .line 85
    .line 86
    const/4 v7, 0x0

    .line 87
    invoke-direct {v3, p2, p0, v7, v6}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 88
    .line 89
    .line 90
    const/16 v6, 0xe

    .line 91
    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v9, 0x0

    .line 94
    move-object p1, v1

    .line 95
    move-object p2, v2

    .line 96
    move-object p5, v3

    .line 97
    move/from16 p6, v6

    .line 98
    .line 99
    move-object p3, v8

    .line 100
    move-object p4, v9

    .line 101
    invoke-static/range {p1 .. p6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 102
    .line 103
    .line 104
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    new-instance v2, La/wyb0;

    .line 109
    .line 110
    const/16 v3, 0x19

    .line 111
    .line 112
    invoke-direct {v2, v3}, La/wyb0;-><init>(B)V

    .line 113
    .line 114
    .line 115
    new-instance v3, La/yic0;

    .line 116
    .line 117
    invoke-direct {v3, p0, v7, v5}, La/yic0;-><init>(La/hjc0;La/yje;B)V

    .line 118
    .line 119
    .line 120
    const/16 v5, 0xe

    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    move-object p1, v1

    .line 124
    move-object p2, v2

    .line 125
    move-object p5, v3

    .line 126
    move/from16 p6, v5

    .line 127
    .line 128
    move-object p3, v6

    .line 129
    move-object p4, v8

    .line 130
    invoke-static/range {p1 .. p6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 131
    .line 132
    .line 133
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v2, La/wyb0;

    .line 138
    .line 139
    const/16 v3, 0x1a

    .line 140
    .line 141
    invoke-direct {v2, v3}, La/wyb0;-><init>(B)V

    .line 142
    .line 143
    .line 144
    new-instance v3, La/yic0;

    .line 145
    .line 146
    invoke-direct {v3, p0, v7, v4}, La/yic0;-><init>(La/hjc0;La/yje;B)V

    .line 147
    .line 148
    .line 149
    const/16 v0, 0xe

    .line 150
    .line 151
    const/4 v4, 0x0

    .line 152
    const/4 v5, 0x0

    .line 153
    move p5, v0

    .line 154
    move-object p0, v1

    .line 155
    move-object p1, v2

    .line 156
    move-object p4, v3

    .line 157
    move-object p2, v4

    .line 158
    move-object p3, v5

    .line 159
    invoke-static/range {p0 .. p5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 160
    .line 161
    .line 162
    return-void
.end method


# virtual methods
.method public final A(La/pl5;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/gjc0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/gjc0;

    .line 7
    .line 8
    iget v1, v0, La/gjc0;->l:I

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
    iput v1, v0, La/gjc0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gjc0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/gjc0;-><init>(La/hjc0;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/gjc0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gjc0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p1, v0, La/gjc0;->i:La/pl5;

    .line 51
    .line 52
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, La/hjc0;->c:La/wsf0;

    .line 60
    .line 61
    if-eqz p1, :cond_6

    .line 62
    .line 63
    new-instance v2, La/z06;

    .line 64
    .line 65
    iget v3, p1, La/pl5;->f:I

    .line 66
    .line 67
    if-lez v3, :cond_4

    .line 68
    .line 69
    move v3, v5

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    const/4 v3, 0x0

    .line 72
    :goto_1
    invoke-direct {v2, v3}, La/z06;-><init>(Z)V

    .line 73
    .line 74
    .line 75
    iput-object p1, v0, La/gjc0;->i:La/pl5;

    .line 76
    .line 77
    iput v5, v0, La/gjc0;->l:I

    .line 78
    .line 79
    invoke-virtual {p2, v2, v0}, La/wsf0;->m(La/i16;La/zje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-ne p2, v1, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    :goto_2
    iget p1, p1, La/pl5;->f:I

    .line 87
    .line 88
    invoke-virtual {p0, p1}, La/hjc0;->y(I)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_6
    new-instance p0, La/x06;

    .line 95
    .line 96
    invoke-direct {p0, v5}, La/x06;-><init>(Z)V

    .line 97
    .line 98
    .line 99
    iput-object v3, v0, La/gjc0;->i:La/pl5;

    .line 100
    .line 101
    iput v4, v0, La/gjc0;->l:I

    .line 102
    .line 103
    invoke-virtual {p2, p0, v0}, La/wsf0;->m(La/i16;La/zje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, v1, :cond_7

    .line 108
    .line 109
    :goto_3
    return-object v1

    .line 110
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0
.end method

.method public final w(La/i16;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/hjc0;->b:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 8
    .line 9
    sget-object v1, La/fjc0;->a:La/fjc0;

    .line 10
    .line 11
    new-instance v4, La/o690;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/16 v5, 0x13

    .line 15
    .line 16
    invoke-direct {v4, p0, p1, v2, v5}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    const/16 v5, 0xa

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    iget-object p0, p0, La/hjc0;->k:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sget-object v1, La/bjc0;->a:La/bjc0;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final y(I)V
    .locals 10

    .line 1
    :goto_0
    iget-object v0, p0, La/hjc0;->j:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/zic0;

    .line 9
    .line 10
    iget-boolean v3, v2, La/zic0;->d:Z

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    if-lez p1, :cond_0

    .line 17
    .line 18
    move v3, v9

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move v3, v8

    .line 21
    :goto_1
    const/4 v6, 0x0

    .line 22
    const/16 v7, 0xc

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    move v4, p1

    .line 26
    invoke-static/range {v2 .. v7}, La/zic0;->a(La/zic0;ZIZZI)La/zic0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, v1, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_4

    .line 35
    .line 36
    if-lez v4, :cond_1

    .line 37
    .line 38
    move v8, v9

    .line 39
    :cond_1
    iget-boolean p1, p0, La/hjc0;->m:Z

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, La/hjc0;->i:La/xsu;

    .line 44
    .line 45
    iget-object p1, p1, La/xsu;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, La/rkc0;

    .line 48
    .line 49
    iget-object p1, p1, La/rkc0;->b:La/dnc0;

    .line 50
    .line 51
    iget-boolean p1, p1, La/dnc0;->f:Z

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    :cond_2
    if-nez v8, :cond_3

    .line 56
    .line 57
    iget-object p1, p0, La/hjc0;->g:La/tpx;

    .line 58
    .line 59
    iget-object p1, p1, La/tpx;->a:La/tnc0;

    .line 60
    .line 61
    iget-object p1, p1, La/tnc0;->b:La/dnc0;

    .line 62
    .line 63
    iget-boolean p1, p1, La/dnc0;->b:Z

    .line 64
    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    iget-object p0, p0, La/hjc0;->k:La/p7m0;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    sget-object v0, La/djc0;->a:La/djc0;

    .line 74
    .line 75
    invoke-virtual {p0, p1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    return-void

    .line 79
    :cond_4
    move p1, v4

    .line 80
    goto :goto_0
.end method

.method public final z()V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/hjc0;->b:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 8
    .line 9
    new-instance v1, La/wyb0;

    .line 10
    .line 11
    const/16 v2, 0x1b

    .line 12
    .line 13
    invoke-direct {v1, v2}, La/wyb0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v4, La/yic0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v5, 0x2

    .line 20
    invoke-direct {v4, p0, v2, v5}, La/yic0;-><init>(La/hjc0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    const/16 v5, 0xa

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 26
    .line 27
    .line 28
    return-void
.end method
