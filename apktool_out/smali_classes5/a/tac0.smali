.class public final La/tac0;
.super La/eiu0;
.source "SourceFile"


# instance fields
.field public final c:La/fvt0;

.field public final d:La/i1w0;

.field public final e:La/duj;

.field public final f:La/b4j;

.field public final g:La/x20;

.field public final h:La/peg0;

.field public final i:La/pru;

.field public final j:La/lbu;

.field public final k:La/ls;

.field public l:Ljava/util/List;

.field public final m:La/ol60;


# direct methods
.method public constructor <init>(La/kl5;La/jh70;La/qgd;La/yk5;La/fvt0;La/rl70;La/i1w0;La/duj;La/b4j;La/x20;La/peg0;La/pru;La/lbu;La/sxs0;La/mi70;La/ls;J)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p5, p0, La/tac0;->c:La/fvt0;

    .line 8
    .line 9
    iput-object p7, p0, La/tac0;->d:La/i1w0;

    .line 10
    .line 11
    iput-object p8, p0, La/tac0;->e:La/duj;

    .line 12
    .line 13
    iput-object p9, p0, La/tac0;->f:La/b4j;

    .line 14
    .line 15
    iput-object p10, p0, La/tac0;->g:La/x20;

    .line 16
    .line 17
    iput-object p11, p0, La/tac0;->h:La/peg0;

    .line 18
    .line 19
    iput-object p12, p0, La/tac0;->i:La/pru;

    .line 20
    .line 21
    iput-object p13, p0, La/tac0;->j:La/lbu;

    .line 22
    .line 23
    move-object/from16 p1, p16

    .line 24
    .line 25
    iput-object p1, p0, La/tac0;->k:La/ls;

    .line 26
    .line 27
    sget-object p1, La/iun;->a:La/iun;

    .line 28
    .line 29
    iput-object p1, p0, La/tac0;->l:Ljava/util/List;

    .line 30
    .line 31
    new-instance p1, La/ol60;

    .line 32
    .line 33
    const/4 p2, 0x3

    .line 34
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, La/tac0;->m:La/ol60;

    .line 38
    .line 39
    const-wide/16 p1, 0x0

    .line 40
    .line 41
    cmp-long p1, p17, p1

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    new-instance p1, La/k0w0;

    .line 46
    .line 47
    invoke-direct {p1, p7}, La/k0w0;-><init>(La/i1w0;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/tac0;->c:La/fvt0;

    .line 51
    .line 52
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/esg0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/esg0;->S()La/bbw0;

    .line 57
    .line 58
    .line 59
    invoke-static/range {p17 .. p18}, La/bbw0;->h(J)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 64
    .line 65
    .line 66
    iget-object p0, p1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-static {p7, p0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_0
    move-object p1, p0

    .line 74
    check-cast p1, La/paw;

    .line 75
    .line 76
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_0

    .line 81
    .line 82
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, La/oe50;

    .line 87
    .line 88
    invoke-virtual {p7, p1}, La/i1w0;->a(La/oe50;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    return-void
.end method

.method public static w(La/gtc0;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, La/t9f;->b()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    const-string p0, "promo_welcome_bonus"

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_1
    const-string p0, "promo_friend"

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_2
    const-string p0, "promo_bonuses"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_3
    const-string p0, "promo_actions"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_4
    const-string p0, "promo_sport_cashback"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_5
    const-string p0, "promo_vip"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_6
    const-string p0, "promo_cashback"

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_7
    const-string p0, "promo_check"

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_8
    const-string p0, "champions_club"

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_9
    const-string p0, "promo_codes"

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_a
    const-string p0, "bonus_games"

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_b
    const-string p0, "bonus_info"

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final A(La/o4c0;)V
    .locals 5

    .line 1
    sget-object v0, La/gtc0;->e:La/fl70;

    .line 2
    .line 3
    iget-wide v1, p1, La/o4c0;->a:J

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object p1, La/gtc0;->f:La/gtc0;

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v0, v1, v3

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :cond_0
    sget-object p1, La/gtc0;->g:La/gtc0;

    .line 19
    .line 20
    const-wide/16 v3, 0x1

    .line 21
    .line 22
    cmp-long v0, v1, v3

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object p1, La/gtc0;->h:La/gtc0;

    .line 28
    .line 29
    const-wide/16 v3, 0x2

    .line 30
    .line 31
    cmp-long v0, v1, v3

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    sget-object p1, La/gtc0;->i:La/gtc0;

    .line 37
    .line 38
    const-wide/16 v3, 0xc

    .line 39
    .line 40
    cmp-long v0, v1, v3

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    sget-object p1, La/gtc0;->j:La/gtc0;

    .line 46
    .line 47
    const-wide/16 v3, 0x3

    .line 48
    .line 49
    cmp-long v0, v1, v3

    .line 50
    .line 51
    if-nez v0, :cond_4

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    sget-object p1, La/gtc0;->k:La/gtc0;

    .line 55
    .line 56
    const-wide/16 v3, 0x4

    .line 57
    .line 58
    cmp-long v0, v1, v3

    .line 59
    .line 60
    if-nez v0, :cond_5

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_5
    sget-object p1, La/gtc0;->l:La/gtc0;

    .line 64
    .line 65
    const-wide/16 v3, 0x5

    .line 66
    .line 67
    cmp-long v0, v1, v3

    .line 68
    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_6
    sget-object p1, La/gtc0;->m:La/gtc0;

    .line 73
    .line 74
    const-wide/16 v3, 0x6

    .line 75
    .line 76
    cmp-long v0, v1, v3

    .line 77
    .line 78
    if-nez v0, :cond_7

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_7
    sget-object p1, La/gtc0;->o:La/gtc0;

    .line 82
    .line 83
    const-wide/16 v3, 0x7

    .line 84
    .line 85
    cmp-long v0, v1, v3

    .line 86
    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_8
    sget-object p1, La/gtc0;->p:La/gtc0;

    .line 91
    .line 92
    const-wide/16 v3, 0x8

    .line 93
    .line 94
    cmp-long v0, v1, v3

    .line 95
    .line 96
    if-nez v0, :cond_9

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_9
    sget-object p1, La/gtc0;->q:La/gtc0;

    .line 100
    .line 101
    const-wide/16 v3, 0x9

    .line 102
    .line 103
    cmp-long v0, v1, v3

    .line 104
    .line 105
    if-nez v0, :cond_a

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_a
    sget-object p1, La/gtc0;->r:La/gtc0;

    .line 109
    .line 110
    const-wide/16 v3, 0xb

    .line 111
    .line 112
    cmp-long v0, v1, v3

    .line 113
    .line 114
    if-nez v0, :cond_b

    .line 115
    .line 116
    :goto_0
    invoke-virtual {p0, p1}, La/tac0;->v(La/gtc0;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_b
    invoke-static {}, La/e9d0;->o()V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public final B()V
    .locals 4

    .line 1
    iget-object v0, p0, La/tac0;->f:La/b4j;

    .line 2
    .line 3
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 4
    .line 5
    const-string v1, "point"

    .line 6
    .line 7
    const-string v2, "promo_shop"

    .line 8
    .line 9
    const-string v3, "promo_menu_call"

    .line 10
    .line 11
    invoke-static {v1, v2, v0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/quc0;

    .line 15
    .line 16
    invoke-direct {v0, v2}, La/quc0;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, La/tac0;->g:La/x20;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, La/x20;->v(La/suc0;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/wyb0;

    .line 25
    .line 26
    const/16 v1, 0x11

    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, La/wyb0;-><init>(La/tac0;B)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/tac0;->d:La/i1w0;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final v(La/gtc0;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/tac0;->f:La/b4j;

    .line 2
    .line 3
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 4
    .line 5
    sget-object v1, La/gtc0;->g:La/gtc0;

    .line 6
    .line 7
    if-eq p1, v1, :cond_0

    .line 8
    .line 9
    sget-object v1, La/gtc0;->f:La/gtc0;

    .line 10
    .line 11
    if-eq p1, v1, :cond_0

    .line 12
    .line 13
    new-instance v1, La/quc0;

    .line 14
    .line 15
    invoke-static {p1}, La/tac0;->w(La/gtc0;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, La/quc0;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, La/tac0;->g:La/x20;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, La/x20;->v(La/suc0;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v1, 0x0

    .line 32
    const-string v2, "point"

    .line 33
    .line 34
    const-string v3, "promo_menu_call"

    .line 35
    .line 36
    iget-object v4, p0, La/tac0;->d:La/i1w0;

    .line 37
    .line 38
    packed-switch p1, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    invoke-static {}, La/t9f;->b()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    new-instance p0, Lkotlin/Pair;

    .line 46
    .line 47
    const-string p1, "promo_welcome_bonus"

    .line 48
    .line 49
    invoke-direct {p0, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {v0, v3, p0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p0, La/k0w0;

    .line 63
    .line 64
    invoke-direct {p0, v4}, La/k0w0;-><init>(La/i1w0;)V

    .line 65
    .line 66
    .line 67
    new-instance p1, Lorg/xplatform/welcome_bonus/impl/presentation/WelcomeBonusScreenFactoryImpl$getWelcomeBonusScreen$1;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 76
    .line 77
    invoke-static {v4, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :goto_0
    move-object p1, p0

    .line 82
    check-cast p1, La/paw;

    .line 83
    .line 84
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, La/oe50;

    .line 95
    .line 96
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    return-void

    .line 101
    :pswitch_1
    new-instance p0, Lkotlin/Pair;

    .line 102
    .line 103
    const-string p1, "promo_friend"

    .line 104
    .line 105
    invoke-direct {p0, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p0}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-interface {v0, v3, p0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance p0, La/k0w0;

    .line 119
    .line 120
    invoke-direct {p0, v4}, La/k0w0;-><init>(La/i1w0;)V

    .line 121
    .line 122
    .line 123
    new-instance p1, Lorg/xplatform/referral/impl/navigation/ReferralProgramScreenFactoryImpl$loadDataScreen$1;

    .line 124
    .line 125
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 129
    .line 130
    .line 131
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 132
    .line 133
    invoke-static {v4, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    :goto_1
    move-object p1, p0

    .line 138
    check-cast p1, La/paw;

    .line 139
    .line 140
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_2

    .line 145
    .line 146
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, La/oe50;

    .line 151
    .line 152
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    return-void

    .line 157
    :pswitch_2
    new-instance p0, Lkotlin/Pair;

    .line 158
    .line 159
    const-string p1, "promo_bonuses"

    .line 160
    .line 161
    invoke-direct {p0, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {p0}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-interface {v0, v3, p0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 175
    .line 176
    invoke-direct {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    new-instance p1, Lorg/xplatform/bonuses/impl/navigation/BonusesScreenFactoryImpl$getBonusesScreen$1;

    .line 180
    .line 181
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 182
    .line 183
    .line 184
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 185
    .line 186
    if-eqz v0, :cond_3

    .line 187
    .line 188
    new-instance v0, La/e1w0;

    .line 189
    .line 190
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 191
    .line 192
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 193
    .line 194
    .line 195
    new-instance p1, La/c8d;

    .line 196
    .line 197
    sget-object v2, La/y7d;->a:La/v7d;

    .line 198
    .line 199
    invoke-direct {p1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_3
    new-instance v0, La/w0w0;

    .line 207
    .line 208
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 209
    .line 210
    .line 211
    new-instance p1, La/c8d;

    .line 212
    .line 213
    sget-object v2, La/y7d;->a:La/v7d;

    .line 214
    .line 215
    invoke-direct {p1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    :goto_2
    invoke-static {v4, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    :goto_3
    move-object p1, p0

    .line 226
    check-cast p1, La/paw;

    .line 227
    .line 228
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_7

    .line 233
    .line 234
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    check-cast p1, La/oe50;

    .line 239
    .line 240
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :pswitch_3
    new-instance p0, Lkotlin/Pair;

    .line 245
    .line 246
    const-string p1, "promo_actions"

    .line 247
    .line 248
    invoke-direct {p0, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-static {p0}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-interface {v0, v3, p0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 262
    .line 263
    invoke-direct {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 264
    .line 265
    .line 266
    new-instance p1, Lorg/xplatform/bonus_agreements/impl/di/feature/navigation/BonusAgreementsScreenFactoryImpl$getBonusAgreementsScreen$1;

    .line 267
    .line 268
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 269
    .line 270
    .line 271
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 272
    .line 273
    if-eqz v0, :cond_4

    .line 274
    .line 275
    new-instance v0, La/e1w0;

    .line 276
    .line 277
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 278
    .line 279
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 280
    .line 281
    .line 282
    new-instance p1, La/c8d;

    .line 283
    .line 284
    sget-object v2, La/y7d;->a:La/v7d;

    .line 285
    .line 286
    invoke-direct {p1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_4
    new-instance v0, La/w0w0;

    .line 294
    .line 295
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 296
    .line 297
    .line 298
    new-instance p1, La/c8d;

    .line 299
    .line 300
    sget-object v2, La/y7d;->a:La/v7d;

    .line 301
    .line 302
    invoke-direct {p1, v2, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    :goto_4
    invoke-static {v4, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    :goto_5
    move-object p1, p0

    .line 313
    check-cast p1, La/paw;

    .line 314
    .line 315
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_7

    .line 320
    .line 321
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    check-cast p1, La/oe50;

    .line 326
    .line 327
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 328
    .line 329
    .line 330
    goto :goto_5

    .line 331
    :pswitch_4
    new-instance p1, Lkotlin/Pair;

    .line 332
    .line 333
    const-string v1, "promo_sport_cashback"

    .line 334
    .line 335
    invoke-direct {p1, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-static {p1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-interface {v0, v3, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 343
    .line 344
    .line 345
    new-instance p1, La/wyb0;

    .line 346
    .line 347
    const/16 v0, 0x14

    .line 348
    .line 349
    invoke-direct {p1, p0, v0}, La/wyb0;-><init>(La/tac0;B)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v4, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :pswitch_5
    iget-object p1, p0, La/tac0;->i:La/pru;

    .line 357
    .line 358
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 359
    .line 360
    .line 361
    new-instance p1, Lkotlin/Pair;

    .line 362
    .line 363
    const-string v1, "promo_vip"

    .line 364
    .line 365
    invoke-direct {p1, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-static {p1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-interface {v0, v3, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 373
    .line 374
    .line 375
    new-instance p1, La/ppb0;

    .line 376
    .line 377
    const/16 v0, 0xd

    .line 378
    .line 379
    invoke-direct {p1, p0, v0}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :pswitch_6
    new-instance p1, Lkotlin/Pair;

    .line 387
    .line 388
    const-string v1, "promo_cashback"

    .line 389
    .line 390
    invoke-direct {p1, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-static {p1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-interface {v0, v3, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 398
    .line 399
    .line 400
    new-instance p1, La/wyb0;

    .line 401
    .line 402
    const/16 v0, 0x13

    .line 403
    .line 404
    invoke-direct {p1, p0, v0}, La/wyb0;-><init>(La/tac0;B)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v4, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 408
    .line 409
    .line 410
    return-void

    .line 411
    :pswitch_7
    new-instance p1, Lkotlin/Pair;

    .line 412
    .line 413
    const-string v1, "promo_check"

    .line 414
    .line 415
    invoke-direct {p1, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    invoke-static {p1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    invoke-interface {v0, v3, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 423
    .line 424
    .line 425
    new-instance p1, La/wyb0;

    .line 426
    .line 427
    const/16 v0, 0x12

    .line 428
    .line 429
    invoke-direct {p1, p0, v0}, La/wyb0;-><init>(La/tac0;B)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 433
    .line 434
    .line 435
    return-void

    .line 436
    :pswitch_8
    new-instance p0, Lkotlin/Pair;

    .line 437
    .line 438
    const-string p1, "champions_club"

    .line 439
    .line 440
    invoke-direct {p0, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    invoke-static {p0}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    invoke-interface {v0, v3, p0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    new-instance p0, La/k0w0;

    .line 454
    .line 455
    invoke-direct {p0, v4}, La/k0w0;-><init>(La/i1w0;)V

    .line 456
    .line 457
    .line 458
    new-instance p1, Lorg/xplatform/promotions/loyalty/impl/navigation/PromotionsLoyaltyScreens$ChampionsClubFragmentScreen;

    .line 459
    .line 460
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 461
    .line 462
    .line 463
    invoke-virtual {p0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 464
    .line 465
    .line 466
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 467
    .line 468
    invoke-static {v4, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    :goto_6
    move-object p1, p0

    .line 473
    check-cast p1, La/paw;

    .line 474
    .line 475
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_5

    .line 480
    .line 481
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    check-cast p1, La/oe50;

    .line 486
    .line 487
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 488
    .line 489
    .line 490
    goto :goto_6

    .line 491
    :cond_5
    return-void

    .line 492
    :pswitch_9
    new-instance p0, Lkotlin/Pair;

    .line 493
    .line 494
    const-string p1, "promo_codes"

    .line 495
    .line 496
    invoke-direct {p0, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    invoke-static {p0}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    invoke-interface {v0, v3, p0}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    new-instance p0, La/k0w0;

    .line 510
    .line 511
    invoke-direct {p0, v4}, La/k0w0;-><init>(La/i1w0;)V

    .line 512
    .line 513
    .line 514
    new-instance p1, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoListScreen$1;

    .line 515
    .line 516
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 517
    .line 518
    .line 519
    invoke-virtual {p0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 520
    .line 521
    .line 522
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 523
    .line 524
    invoke-static {v4, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    :goto_7
    move-object p1, p0

    .line 529
    check-cast p1, La/paw;

    .line 530
    .line 531
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    if-eqz v0, :cond_6

    .line 536
    .line 537
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    check-cast p1, La/oe50;

    .line 542
    .line 543
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 544
    .line 545
    .line 546
    goto :goto_7

    .line 547
    :cond_6
    return-void

    .line 548
    :pswitch_a
    new-instance p1, Lkotlin/Pair;

    .line 549
    .line 550
    const-string v5, "bonus_games"

    .line 551
    .line 552
    invoke-direct {p1, v2, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    invoke-static {p1}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    invoke-interface {v0, v3, p1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    new-instance p1, La/k0w0;

    .line 566
    .line 567
    invoke-direct {p1, v4}, La/k0w0;-><init>(La/i1w0;)V

    .line 568
    .line 569
    .line 570
    iget-object p0, p0, La/tac0;->c:La/fvt0;

    .line 571
    .line 572
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast p0, La/esg0;

    .line 575
    .line 576
    invoke-virtual {p0}, La/esg0;->S()La/bbw0;

    .line 577
    .line 578
    .line 579
    const-wide/16 v2, 0x0

    .line 580
    .line 581
    invoke-static {v2, v3}, La/bbw0;->h(J)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 586
    .line 587
    .line 588
    iget-object p0, p1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 589
    .line 590
    invoke-static {v4, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 591
    .line 592
    .line 593
    move-result-object p0

    .line 594
    :goto_8
    move-object p1, p0

    .line 595
    check-cast p1, La/paw;

    .line 596
    .line 597
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-eqz v0, :cond_7

    .line 602
    .line 603
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    check-cast p1, La/oe50;

    .line 608
    .line 609
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 610
    .line 611
    .line 612
    goto :goto_8

    .line 613
    :cond_7
    :pswitch_b
    return-void

    .line 614
    nop

    .line 615
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object p0, p0, La/tac0;->d:La/i1w0;

    .line 2
    .line 3
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, La/c8d;

    .line 8
    .line 9
    sget-object v2, La/y7d;->a:La/v7d;

    .line 10
    .line 11
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    move-object v1, v0

    .line 22
    check-cast v1, La/paw;

    .line 23
    .line 24
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/oe50;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public final y()V
    .locals 4

    .line 1
    new-instance v0, La/quc0;

    .line 2
    .line 3
    sget-object v1, La/gtc0;->g:La/gtc0;

    .line 4
    .line 5
    invoke-static {v1}, La/tac0;->w(La/gtc0;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, La/quc0;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, La/tac0;->g:La/x20;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, La/x20;->v(La/suc0;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/tac0;->f:La/b4j;

    .line 18
    .line 19
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 20
    .line 21
    const-string v1, "point"

    .line 22
    .line 23
    const-string v2, "bonus_games"

    .line 24
    .line 25
    const-string v3, "promo_menu_call"

    .line 26
    .line 27
    invoke-static {v1, v2, v0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, La/tac0;->d:La/i1w0;

    .line 31
    .line 32
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object p0, p0, La/tac0;->c:La/fvt0;

    .line 37
    .line 38
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, La/esg0;

    .line 41
    .line 42
    invoke-virtual {p0}, La/esg0;->S()La/bbw0;

    .line 43
    .line 44
    .line 45
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    invoke-static {v2, v3}, La/bbw0;->h(J)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 52
    .line 53
    .line 54
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-static {v0, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :goto_0
    move-object v1, p0

    .line 62
    check-cast v1, La/paw;

    .line 63
    .line 64
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, La/oe50;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    return-void
.end method

.method public final z(La/u4s;)V
    .locals 10

    .line 1
    new-instance v0, La/puc0;

    .line 2
    .line 3
    iget-wide v1, p1, La/u4s;->a:J

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, La/puc0;-><init>(J)V

    .line 6
    .line 7
    .line 8
    iget-object v3, p0, La/tac0;->g:La/x20;

    .line 9
    .line 10
    invoke-virtual {v3, v0}, La/x20;->v(La/suc0;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "promo_menu"

    .line 14
    .line 15
    invoke-virtual {v3, v1, v2, v0}, La/x20;->s(JLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, La/tac0;->f:La/b4j;

    .line 19
    .line 20
    invoke-virtual {v3, v1, v2, v0}, La/b4j;->l(JLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/eiu0;->s()La/diu0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, La/l8c0;

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const/16 v9, 0xd

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    const-class v5, La/tac0;

    .line 38
    .line 39
    const-string v6, "handleError"

    .line 40
    .line 41
    const-string v7, "handleError(Ljava/lang/Throwable;)V"

    .line 42
    .line 43
    move-object v4, p0

    .line 44
    invoke-direct/range {v2 .. v9}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    new-instance v5, La/qo6;

    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    const/4 v0, 0x4

    .line 51
    invoke-direct {v5, p1, v4, p0, v0}, La/qo6;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 52
    .line 53
    .line 54
    const/16 v6, 0xe

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 59
    .line 60
    .line 61
    return-void
.end method
