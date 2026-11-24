.class public final La/yjv;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final h:La/xfu;

.field public final i:La/ouu;

.field public final j:La/v88;

.field public final k:La/std;

.field public final l:La/i1w0;

.field public final m:La/oct;

.field public final n:La/peg0;

.field public final o:La/vqc;

.field public final p:La/xex;

.field public final q:La/duj;

.field public final r:La/s31;

.field public final s:La/ix0;


# direct methods
.method public constructor <init>(La/oeu;La/xfu;La/ouu;La/v88;La/std;La/i1w0;La/oct;La/peg0;La/vqc;La/xex;La/duj;La/s31;La/ix0;)V
    .locals 1

    .line 1
    new-instance p1, La/ldv;

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    invoke-direct {p1, v0}, La/ldv;-><init>(B)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/yjv;->h:La/xfu;

    .line 11
    .line 12
    iput-object p3, p0, La/yjv;->i:La/ouu;

    .line 13
    .line 14
    iput-object p4, p0, La/yjv;->j:La/v88;

    .line 15
    .line 16
    iput-object p5, p0, La/yjv;->k:La/std;

    .line 17
    .line 18
    iput-object p6, p0, La/yjv;->l:La/i1w0;

    .line 19
    .line 20
    iput-object p7, p0, La/yjv;->m:La/oct;

    .line 21
    .line 22
    iput-object p8, p0, La/yjv;->n:La/peg0;

    .line 23
    .line 24
    iput-object p9, p0, La/yjv;->o:La/vqc;

    .line 25
    .line 26
    iput-object p10, p0, La/yjv;->p:La/xex;

    .line 27
    .line 28
    iput-object p11, p0, La/yjv;->q:La/duj;

    .line 29
    .line 30
    iput-object p12, p0, La/yjv;->r:La/s31;

    .line 31
    .line 32
    iput-object p13, p0, La/yjv;->s:La/ix0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/bkv;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/yjv;->k(La/bkv;La/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i(La/rkv;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, "point"

    .line 6
    .line 7
    const-string v1, "gesture_call"

    .line 8
    .line 9
    iget-object p0, p0, La/yjv;->r:La/s31;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, La/t9f;->b()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 19
    .line 20
    const-string p1, "Slots"

    .line 21
    .line 22
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 27
    .line 28
    const-string p1, "games"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 35
    .line 36
    const-string p1, "Cyber"

    .line 37
    .line 38
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 43
    .line 44
    const-string p1, "Express"

    .line 45
    .line 46
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_4
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 51
    .line 52
    const-string p1, "Favor"

    .line 53
    .line 54
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_5
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 59
    .line 60
    const-string p1, "BetHistory"

    .line 61
    .line 62
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_6
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 67
    .line 68
    const-string p1, "Deposit"

    .line 69
    .line 70
    invoke-static {v0, p1, p0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/wjv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/wjv;

    .line 7
    .line 8
    iget v1, v0, La/wjv;->k:I

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
    iput v1, v0, La/wjv;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wjv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/wjv;-><init>(La/yjv;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/wjv;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wjv;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    iget-object p1, p0, La/yjv;->p:La/xex;

    .line 54
    .line 55
    iput v3, v0, La/wjv;->k:I

    .line 56
    .line 57
    invoke-virtual {p1, v0}, La/xex;->H(La/yje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_5

    .line 71
    .line 72
    iget-object p1, p0, La/yjv;->l:La/i1w0;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v0, La/k0w0;

    .line 78
    .line 79
    invoke-direct {v0, p1}, La/k0w0;-><init>(La/i1w0;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, La/yjv;->m:La/oct;

    .line 83
    .line 84
    const/4 v7, 0x0

    .line 85
    const/16 v8, 0x1f

    .line 86
    .line 87
    const-wide/16 v2, 0x0

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-static/range {v1 .. v8}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 97
    .line 98
    .line 99
    iget-object v0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    invoke-virtual {p1}, La/i1w0;->c()La/mf50;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1, v0}, La/mf50;->d(Ljava/util/List;)La/lc00;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-virtual {v0, v1}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_2
    move-object v1, v0

    .line 115
    check-cast v1, La/paw;

    .line 116
    .line 117
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, La/oe50;

    .line 128
    .line 129
    invoke-virtual {p1, v1}, La/i1w0;->a(La/oe50;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    sget-object p1, La/rkv;->g:La/rkv;

    .line 134
    .line 135
    invoke-virtual {p0, p1}, La/yjv;->i(La/rkv;)V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_5
    sget-object p1, La/ckv;->a:La/ckv;

    .line 140
    .line 141
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :goto_3
    iget-object p0, p0, La/yjv;->q:La/duj;

    .line 146
    .line 147
    invoke-virtual {p0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0
.end method

.method public final k(La/bkv;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/xjv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/xjv;

    .line 7
    .line 8
    iget v1, v0, La/xjv;->l:I

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
    iput v1, v0, La/xjv;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/xjv;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/xjv;-><init>(La/yjv;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/xjv;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/xjv;->l:I

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
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    iget-object p1, v0, La/xjv;->i:La/bkv;

    .line 52
    .line 53
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, v0, La/xjv;->i:La/bkv;

    .line 61
    .line 62
    iput v5, v0, La/xjv;->l:I

    .line 63
    .line 64
    invoke-static {p0, p1, v0}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-ne p2, v1, :cond_4

    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_4
    :goto_1
    if-eqz p1, :cond_a

    .line 73
    .line 74
    instance-of p2, p1, La/akv;

    .line 75
    .line 76
    if-eqz p2, :cond_9

    .line 77
    .line 78
    iput-object v3, v0, La/xjv;->i:La/bkv;

    .line 79
    .line 80
    iput v4, v0, La/xjv;->l:I

    .line 81
    .line 82
    iget-object p1, p0, La/yjv;->h:La/xfu;

    .line 83
    .line 84
    invoke-virtual {p1}, La/xfu;->b()La/rkv;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, La/rkv;->a()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iget-object v2, p0, La/yjv;->s:La/ix0;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v2, v2, La/ix0;->a:La/s1p;

    .line 98
    .line 99
    new-instance v6, La/j1p;

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    invoke-direct {v6, p2, v7}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 103
    .line 104
    .line 105
    filled-new-array {v6}, [La/j1p;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-static {p2}, La/dui0;->c([Ljava/lang/Object;)Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    const-wide/16 v8, 0xd14

    .line 114
    .line 115
    invoke-virtual {v2, p2, v8, v9}, La/s1p;->a(Ljava/util/Set;J)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iget-object p2, p0, La/yjv;->i:La/ouu;

    .line 123
    .line 124
    iget-object v2, p0, La/yjv;->l:La/i1w0;

    .line 125
    .line 126
    packed-switch p1, :pswitch_data_0

    .line 127
    .line 128
    .line 129
    invoke-static {}, La/t9f;->b()V

    .line 130
    .line 131
    .line 132
    return-object v3

    .line 133
    :pswitch_0
    new-instance p1, La/vjv;

    .line 134
    .line 135
    invoke-direct {p1, p0, v7}, La/vjv;-><init>(La/yjv;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 139
    .line 140
    .line 141
    sget-object p1, La/rkv;->h:La/rkv;

    .line 142
    .line 143
    invoke-virtual {p0, p1}, La/yjv;->i(La/rkv;)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_4

    .line 147
    .line 148
    :pswitch_1
    invoke-virtual {p0, v0}, La/yjv;->j(La/zje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v1, :cond_5

    .line 153
    .line 154
    goto/16 :goto_5

    .line 155
    .line 156
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :pswitch_2
    new-instance p1, La/vjv;

    .line 161
    .line 162
    invoke-direct {p1, p0, v5}, La/vjv;-><init>(La/yjv;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 166
    .line 167
    .line 168
    sget-object p1, La/rkv;->f:La/rkv;

    .line 169
    .line 170
    invoke-virtual {p0, p1}, La/yjv;->i(La/rkv;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_4

    .line 174
    .line 175
    :pswitch_3
    iget-object p1, p0, La/yjv;->k:La/std;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance p1, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;

    .line 181
    .line 182
    invoke-direct {p1, v7}, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;-><init>(Z)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 189
    .line 190
    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 194
    .line 195
    if-eqz v0, :cond_6

    .line 196
    .line 197
    new-instance v0, La/e1w0;

    .line 198
    .line 199
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 200
    .line 201
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 202
    .line 203
    .line 204
    new-instance p1, La/c8d;

    .line 205
    .line 206
    sget-object v3, La/y7d;->a:La/v7d;

    .line 207
    .line 208
    invoke-direct {p1, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_6
    new-instance v0, La/w0w0;

    .line 216
    .line 217
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 218
    .line 219
    .line 220
    new-instance p1, La/c8d;

    .line 221
    .line 222
    sget-object v3, La/y7d;->a:La/v7d;

    .line 223
    .line 224
    invoke-direct {p1, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    :goto_2
    invoke-static {v2, p2, v7}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    :goto_3
    move-object p2, p1

    .line 235
    check-cast p2, La/paw;

    .line 236
    .line 237
    invoke-virtual {p2}, La/paw;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-eqz v0, :cond_7

    .line 242
    .line 243
    invoke-virtual {p2}, La/paw;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    check-cast p2, La/oe50;

    .line 248
    .line 249
    invoke-virtual {v2, p2}, La/i1w0;->a(La/oe50;)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_7
    sget-object p1, La/rkv;->e:La/rkv;

    .line 254
    .line 255
    invoke-virtual {p0, p1}, La/yjv;->i(La/rkv;)V

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :pswitch_4
    new-instance p1, La/ya50;

    .line 260
    .line 261
    invoke-direct {p1, v7}, La/ya50;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p2, p1, v7}, La/ouu;->q(La/cb50;Z)V

    .line 265
    .line 266
    .line 267
    sget-object p1, La/rkv;->d:La/rkv;

    .line 268
    .line 269
    invoke-virtual {p0, p1}, La/yjv;->i(La/rkv;)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :pswitch_5
    new-instance v6, La/za50;

    .line 274
    .line 275
    const-wide/16 v11, 0x0

    .line 276
    .line 277
    const/4 v8, 0x7

    .line 278
    const/4 v7, 0x0

    .line 279
    const-wide/16 v9, 0x0

    .line 280
    .line 281
    invoke-direct/range {v6 .. v12}, La/za50;-><init>(IIJJ)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p2, v6, v5}, La/ouu;->q(La/cb50;Z)V

    .line 285
    .line 286
    .line 287
    sget-object p1, La/rkv;->c:La/rkv;

    .line 288
    .line 289
    invoke-virtual {p0, p1}, La/yjv;->i(La/rkv;)V

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :pswitch_6
    new-instance p1, La/vjv;

    .line 294
    .line 295
    invoke-direct {p1, p0, v4}, La/vjv;-><init>(La/yjv;B)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 299
    .line 300
    .line 301
    sget-object p1, La/rkv;->b:La/rkv;

    .line 302
    .line 303
    invoke-virtual {p0, p1}, La/yjv;->i(La/rkv;)V

    .line 304
    .line 305
    .line 306
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    :goto_5
    if-ne p0, v1, :cond_8

    .line 309
    .line 310
    :goto_6
    return-object v1

    .line 311
    :cond_8
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object p0

    .line 314
    :cond_9
    instance-of p1, p1, La/zjv;

    .line 315
    .line 316
    if-eqz p1, :cond_a

    .line 317
    .line 318
    invoke-virtual {p0}, La/x2t0;->e()V

    .line 319
    .line 320
    .line 321
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object p0

    .line 324
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 325
    .line 326
    .line 327
    return-object v3

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
