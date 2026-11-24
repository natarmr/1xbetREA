.class public final La/jtr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/vwu0;ZLa/yje;)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    iput-byte v0, p0, La/jtr0;->i:B

    .line 4
    .line 5
    iput-object p1, p0, La/jtr0;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iput-boolean p2, p0, La/jtr0;->j:Z

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 14
    iput-byte p3, p0, La/jtr0;->i:B

    iput-object p1, p0, La/jtr0;->k:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jtr0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/jtr0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/jtr0;

    .line 9
    .line 10
    check-cast v1, La/vcv0;

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance p0, La/jtr0;

    .line 19
    .line 20
    check-cast v1, La/c8v0;

    .line 21
    .line 22
    const/16 v0, 0xb

    .line 23
    .line 24
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    new-instance v0, La/jtr0;

    .line 29
    .line 30
    check-cast v1, La/vwu0;

    .line 31
    .line 32
    iget-boolean p0, p0, La/jtr0;->j:Z

    .line 33
    .line 34
    invoke-direct {v0, v1, p0, p1}, La/jtr0;-><init>(La/vwu0;ZLa/yje;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_2
    new-instance p0, La/jtr0;

    .line 39
    .line 40
    check-cast v1, La/ztu0;

    .line 41
    .line 42
    const/16 v0, 0x9

    .line 43
    .line 44
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_3
    new-instance p0, La/jtr0;

    .line 49
    .line 50
    check-cast v1, La/dqu0;

    .line 51
    .line 52
    const/16 v0, 0x8

    .line 53
    .line 54
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_4
    new-instance p0, La/jtr0;

    .line 59
    .line 60
    check-cast v1, La/xqt0;

    .line 61
    .line 62
    const/4 v0, 0x7

    .line 63
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_5
    new-instance p0, La/jtr0;

    .line 68
    .line 69
    check-cast v1, La/xot0;

    .line 70
    .line 71
    const/4 v0, 0x6

    .line 72
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_6
    new-instance p0, La/jtr0;

    .line 77
    .line 78
    check-cast v1, La/emt0;

    .line 79
    .line 80
    const/4 v0, 0x5

    .line 81
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_7
    new-instance p0, La/jtr0;

    .line 86
    .line 87
    check-cast v1, La/jdt0;

    .line 88
    .line 89
    const/4 v0, 0x4

    .line 90
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_8
    new-instance p0, La/jtr0;

    .line 95
    .line 96
    check-cast v1, La/wbt0;

    .line 97
    .line 98
    const/4 v0, 0x3

    .line 99
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 100
    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_9
    new-instance p0, La/jtr0;

    .line 104
    .line 105
    check-cast v1, La/yat0;

    .line 106
    .line 107
    const/4 v0, 0x2

    .line 108
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_a
    new-instance p0, La/jtr0;

    .line 113
    .line 114
    check-cast v1, La/dat0;

    .line 115
    .line 116
    const/4 v0, 0x1

    .line 117
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_b
    new-instance p0, La/jtr0;

    .line 122
    .line 123
    check-cast v1, La/ltr0;

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    invoke-direct {p0, v1, p1, v0}, La/jtr0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    nop

    .line 131
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jtr0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/jtr0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/jtr0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/jtr0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/jtr0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/jtr0;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/jtr0;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/jtr0;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/jtr0;

    .line 104
    .line 105
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_7
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/jtr0;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_8
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/jtr0;

    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_9
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, La/jtr0;

    .line 143
    .line 144
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_a
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, La/jtr0;

    .line 156
    .line 157
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_b
    invoke-virtual {p0, p1}, La/jtr0;->create(La/yje;)La/yje;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, La/jtr0;

    .line 169
    .line 170
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    invoke-virtual {p0, p1}, La/jtr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/jtr0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, La/jtr0;->k:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v5, La/vcv0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v6, p0, La/jtr0;->j:Z

    .line 18
    .line 19
    if-eqz v6, :cond_1

    .line 20
    .line 21
    if-ne v6, v3, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v7, v5, La/vcv0;->s:La/pwi;

    .line 35
    .line 36
    iget v8, v5, La/vcv0;->o:I

    .line 37
    .line 38
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/ncv0;

    .line 47
    .line 48
    iget-boolean v10, p1, La/ncv0;->f:Z

    .line 49
    .line 50
    iget-object p1, v5, La/vcv0;->w:La/yiu;

    .line 51
    .line 52
    invoke-virtual {p1}, La/yiu;->a()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    iget-object p1, v5, La/vcv0;->x:La/pru;

    .line 59
    .line 60
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-boolean p1, p1, La/sff0;->O1:Z

    .line 65
    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move v11, v1

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_0
    move v11, v3

    .line 72
    :goto_1
    iput-boolean v3, p0, La/jtr0;->j:Z

    .line 73
    .line 74
    const/4 v12, 0x0

    .line 75
    move-object v13, p0

    .line 76
    invoke-virtual/range {v7 .. v13}, La/pwi;->n(ILa/bvc;ZZZLa/zje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v0, :cond_4

    .line 81
    .line 82
    move-object v4, v0

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_3
    return-object v4

    .line 87
    :pswitch_0
    move-object v13, p0

    .line 88
    check-cast v5, La/c8v0;

    .line 89
    .line 90
    sget-object p0, La/wne;->a:La/wne;

    .line 91
    .line 92
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    if-ne v0, v3, :cond_5

    .line 97
    .line 98
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    check-cast p1, La/j0g0;

    .line 102
    .line 103
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, v5, La/c8v0;->r:La/x4u;

    .line 114
    .line 115
    iget-object v0, v5, La/c8v0;->o:Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 116
    .line 117
    iget-object v0, v0, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;->a:La/kgz;

    .line 118
    .line 119
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 120
    .line 121
    invoke-virtual {p1, v0, v13}, La/x4u;->g(La/kgz;La/zje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, p0, :cond_7

    .line 126
    .line 127
    move-object v4, p0

    .line 128
    goto :goto_5

    .line 129
    :cond_7
    move-object p0, p1

    .line 130
    :goto_4
    sget p1, La/c8v0;->v:I

    .line 131
    .line 132
    iget-object p1, v5, La/i3t0;->i:La/ocj;

    .line 133
    .line 134
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 135
    .line 136
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-object v1, p1

    .line 144
    check-cast v1, La/z7v0;

    .line 145
    .line 146
    new-instance v2, La/j0g0;

    .line 147
    .line 148
    invoke-direct {v2, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    iget-boolean v1, v1, La/z7v0;->b:Z

    .line 152
    .line 153
    new-instance v3, La/z7v0;

    .line 154
    .line 155
    invoke-direct {v3, v2, v1}, La/z7v0;-><init>(La/j0g0;Z)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_8

    .line 163
    .line 164
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    :goto_5
    return-object v4

    .line 167
    :pswitch_1
    move-object v13, p0

    .line 168
    sget-object p0, La/wne;->a:La/wne;

    .line 169
    .line 170
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    check-cast v5, La/vwu0;

    .line 174
    .line 175
    new-instance p0, La/rwu0;

    .line 176
    .line 177
    iget-boolean p1, v13, La/jtr0;->j:Z

    .line 178
    .line 179
    invoke-direct {p0, p1}, La/rwu0;-><init>(Z)V

    .line 180
    .line 181
    .line 182
    sget p1, La/vwu0;->p:I

    .line 183
    .line 184
    invoke-virtual {v5, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_2
    move-object v13, p0

    .line 191
    check-cast v5, La/ztu0;

    .line 192
    .line 193
    sget-object p0, La/wne;->a:La/wne;

    .line 194
    .line 195
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 196
    .line 197
    if-eqz v0, :cond_a

    .line 198
    .line 199
    if-ne v0, v3, :cond_9

    .line 200
    .line 201
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    check-cast p1, La/j0g0;

    .line 205
    .line 206
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget-object p1, v5, La/ztu0;->r:La/bzu;

    .line 217
    .line 218
    iget-object v0, v5, La/ztu0;->p:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 219
    .line 220
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;->d:Ljava/lang/String;

    .line 221
    .line 222
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 223
    .line 224
    invoke-virtual {p1, v0, v13}, La/bzu;->f(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    if-ne p1, p0, :cond_b

    .line 229
    .line 230
    move-object v4, p0

    .line 231
    goto :goto_7

    .line 232
    :cond_b
    move-object p0, p1

    .line 233
    :goto_6
    sget p1, La/ztu0;->w:I

    .line 234
    .line 235
    iget-object p1, v5, La/i3t0;->i:La/ocj;

    .line 236
    .line 237
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 238
    .line 239
    :cond_c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-object v1, p1

    .line 247
    check-cast v1, La/wtu0;

    .line 248
    .line 249
    new-instance v5, La/j0g0;

    .line 250
    .line 251
    invoke-direct {v5, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    const/4 v6, 0x7

    .line 255
    const/4 v2, 0x0

    .line 256
    const-wide/16 v3, 0x0

    .line 257
    .line 258
    invoke-static/range {v1 .. v6}, La/wtu0;->a(La/wtu0;ZJLa/j0g0;I)La/wtu0;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    if-eqz p1, :cond_c

    .line 267
    .line 268
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    :goto_7
    return-object v4

    .line 271
    :pswitch_3
    move-object v13, p0

    .line 272
    sget-object p0, La/wne;->a:La/wne;

    .line 273
    .line 274
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 275
    .line 276
    if-eqz v0, :cond_e

    .line 277
    .line 278
    if-ne v0, v3, :cond_d

    .line 279
    .line 280
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_e
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    check-cast v5, La/dqu0;

    .line 292
    .line 293
    iget-object p1, v5, La/dqu0;->q:La/hjd;

    .line 294
    .line 295
    new-instance v0, La/cid;

    .line 296
    .line 297
    sget-object v1, La/r1g;->b:La/r1g;

    .line 298
    .line 299
    new-instance v1, La/uq2;

    .line 300
    .line 301
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 302
    .line 303
    .line 304
    const-string v2, "cyber_category_game"

    .line 305
    .line 306
    invoke-direct {v0, v2, v1}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 307
    .line 308
    .line 309
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1, v0, v13}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    if-ne p1, p0, :cond_f

    .line 319
    .line 320
    move-object v4, p0

    .line 321
    goto :goto_9

    .line 322
    :cond_f
    :goto_8
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    :goto_9
    return-object v4

    .line 325
    :pswitch_4
    move-object v13, p0

    .line 326
    sget-object p0, La/wne;->a:La/wne;

    .line 327
    .line 328
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 329
    .line 330
    if-eqz v0, :cond_11

    .line 331
    .line 332
    if-ne v0, v3, :cond_10

    .line 333
    .line 334
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    goto :goto_a

    .line 338
    :cond_10
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    move-object p1, v4

    .line 342
    goto :goto_a

    .line 343
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    check-cast v5, La/xqt0;

    .line 347
    .line 348
    iget-object p1, v5, La/xqt0;->g:La/reu;

    .line 349
    .line 350
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 351
    .line 352
    iget-object p1, p1, La/reu;->b:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast p1, La/b3c0;

    .line 355
    .line 356
    invoke-virtual {p1, v13}, La/b3c0;->b(La/yje;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    if-ne p1, p0, :cond_12

    .line 361
    .line 362
    move-object p1, p0

    .line 363
    :cond_12
    :goto_a
    return-object p1

    .line 364
    :pswitch_5
    move-object v13, p0

    .line 365
    sget-object p0, La/wne;->a:La/wne;

    .line 366
    .line 367
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 368
    .line 369
    const-string v1, "CXCP"

    .line 370
    .line 371
    if-eqz v0, :cond_14

    .line 372
    .line 373
    if-ne v0, v3, :cond_13

    .line 374
    .line 375
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    .line 377
    .line 378
    goto :goto_c

    .line 379
    :catch_0
    move-exception v0

    .line 380
    move-object p0, v0

    .line 381
    goto :goto_d

    .line 382
    :cond_13
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    goto :goto_e

    .line 386
    :cond_14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    if-eqz p1, :cond_15

    .line 394
    .line 395
    const-string p1, "UseCaseCameraRequestControlImpl#setTorchOnAsync"

    .line 396
    .line 397
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 398
    .line 399
    .line 400
    :cond_15
    check-cast v5, La/xot0;

    .line 401
    .line 402
    :try_start_1
    iget-object p1, v5, La/xot0;->c:La/kpt0;

    .line 403
    .line 404
    invoke-virtual {p1}, La/kpt0;->a()La/b0a;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 409
    .line 410
    invoke-virtual {p1, v13}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    if-ne p1, p0, :cond_16

    .line 415
    .line 416
    :goto_b
    move-object v4, p0

    .line 417
    goto :goto_e

    .line 418
    :cond_16
    :goto_c
    check-cast p1, Ljava/lang/AutoCloseable;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 419
    .line 420
    :try_start_2
    move-object p0, p1

    .line 421
    check-cast p0, La/e0a;

    .line 422
    .line 423
    invoke-virtual {p0}, La/e0a;->e()La/odd;

    .line 424
    .line 425
    .line 426
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 427
    :try_start_3
    invoke-static {p1, v4}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 428
    .line 429
    .line 430
    goto :goto_b

    .line 431
    :catchall_0
    move-exception v0

    .line 432
    move-object p0, v0

    .line 433
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 434
    :catchall_1
    move-exception v0

    .line 435
    :try_start_5
    invoke-static {p1, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 436
    .line 437
    .line 438
    throw v0
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 439
    :goto_d
    invoke-static {v1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    if-eqz p1, :cond_17

    .line 444
    .line 445
    const-string p1, "Cannot acquire the CameraGraph.Session"

    .line 446
    .line 447
    invoke-static {v1, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 448
    .line 449
    .line 450
    :cond_17
    sget-object v4, La/xot0;->l:La/odd;

    .line 451
    .line 452
    :goto_e
    return-object v4

    .line 453
    :pswitch_6
    move-object v13, p0

    .line 454
    sget-object p0, La/wne;->a:La/wne;

    .line 455
    .line 456
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 457
    .line 458
    if-eqz v0, :cond_19

    .line 459
    .line 460
    if-ne v0, v3, :cond_18

    .line 461
    .line 462
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    goto :goto_f

    .line 466
    :cond_18
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    goto :goto_10

    .line 470
    :cond_19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    check-cast v5, La/emt0;

    .line 474
    .line 475
    iget-object p1, v5, La/emt0;->a:La/g8f0;

    .line 476
    .line 477
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 478
    .line 479
    invoke-virtual {p1, v13}, La/g8f0;->b(La/zje;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    if-ne p1, p0, :cond_1a

    .line 484
    .line 485
    move-object v4, p0

    .line 486
    goto :goto_10

    .line 487
    :cond_1a
    :goto_f
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 488
    .line 489
    :goto_10
    return-object v4

    .line 490
    :pswitch_7
    move-object v13, p0

    .line 491
    sget-object p0, La/wne;->a:La/wne;

    .line 492
    .line 493
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 494
    .line 495
    if-eqz v0, :cond_1c

    .line 496
    .line 497
    if-ne v0, v3, :cond_1b

    .line 498
    .line 499
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    goto :goto_11

    .line 503
    :cond_1b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    goto :goto_12

    .line 507
    :cond_1c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    check-cast v5, La/jdt0;

    .line 511
    .line 512
    iget-object p1, v5, La/jdt0;->t:La/hjd;

    .line 513
    .line 514
    new-instance v0, La/cid;

    .line 515
    .line 516
    sget-object v1, La/r1g;->b:La/r1g;

    .line 517
    .line 518
    new-instance v1, La/jq2;

    .line 519
    .line 520
    iget-object v2, v5, La/jdt0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 521
    .line 522
    iget-wide v4, v2, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->a:J

    .line 523
    .line 524
    invoke-direct {v1, v4, v5}, La/jq2;-><init>(J)V

    .line 525
    .line 526
    .line 527
    const-string v2, "cyber_champ"

    .line 528
    .line 529
    invoke-direct {v0, v2, v1}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 530
    .line 531
    .line 532
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 533
    .line 534
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    invoke-virtual {p1, v0, v13}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    if-ne p1, p0, :cond_1d

    .line 542
    .line 543
    move-object v4, p0

    .line 544
    goto :goto_12

    .line 545
    :cond_1d
    :goto_11
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    :goto_12
    return-object v4

    .line 548
    :pswitch_8
    move-object v13, p0

    .line 549
    check-cast v5, La/wbt0;

    .line 550
    .line 551
    sget-object p0, La/wne;->a:La/wne;

    .line 552
    .line 553
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 554
    .line 555
    if-eqz v0, :cond_1f

    .line 556
    .line 557
    if-ne v0, v3, :cond_1e

    .line 558
    .line 559
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    check-cast p1, La/j0g0;

    .line 563
    .line 564
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 565
    .line 566
    goto :goto_13

    .line 567
    :cond_1e
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    goto :goto_14

    .line 571
    :cond_1f
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    iget-object p1, v5, La/wbt0;->x:La/zpu;

    .line 575
    .line 576
    iget-object v0, v5, La/wbt0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;

    .line 577
    .line 578
    iget-wide v0, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;->a:J

    .line 579
    .line 580
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 581
    .line 582
    const/16 v2, 0x5a

    .line 583
    .line 584
    invoke-virtual {p1, v2, v0, v1, v13}, La/zpu;->m(IJLa/zje;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    if-ne p1, p0, :cond_20

    .line 589
    .line 590
    move-object v4, p0

    .line 591
    goto :goto_14

    .line 592
    :cond_20
    move-object p0, p1

    .line 593
    :goto_13
    sget p1, La/wbt0;->E:I

    .line 594
    .line 595
    iget-object p1, v5, La/i3t0;->i:La/ocj;

    .line 596
    .line 597
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 598
    .line 599
    :cond_21
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    move-object v1, p1

    .line 607
    check-cast v1, La/ubt0;

    .line 608
    .line 609
    new-instance v4, La/j0g0;

    .line 610
    .line 611
    invoke-direct {v4, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    const/4 v5, 0x0

    .line 615
    const/16 v6, 0x7b

    .line 616
    .line 617
    const/4 v2, 0x0

    .line 618
    const/4 v3, 0x0

    .line 619
    invoke-static/range {v1 .. v6}, La/ubt0;->a(La/ubt0;ZLjava/util/Date;La/j0g0;La/qbt0;I)La/ubt0;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result p1

    .line 627
    if-eqz p1, :cond_21

    .line 628
    .line 629
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 630
    .line 631
    :goto_14
    return-object v4

    .line 632
    :pswitch_9
    move-object v13, p0

    .line 633
    check-cast v5, La/yat0;

    .line 634
    .line 635
    sget-object p0, La/wne;->a:La/wne;

    .line 636
    .line 637
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 638
    .line 639
    if-eqz v0, :cond_23

    .line 640
    .line 641
    if-ne v0, v3, :cond_22

    .line 642
    .line 643
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    check-cast p1, La/j0g0;

    .line 647
    .line 648
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 649
    .line 650
    goto :goto_15

    .line 651
    :cond_22
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    goto :goto_16

    .line 655
    :cond_23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    iget-object p1, v5, La/yat0;->r:La/rpt;

    .line 659
    .line 660
    iget-object v0, v5, La/yat0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;

    .line 661
    .line 662
    iget-wide v1, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;->a:J

    .line 663
    .line 664
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampPrizePoolParams;->e:Ljava/lang/String;

    .line 665
    .line 666
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 667
    .line 668
    invoke-virtual {p1, v1, v2, v13, v0}, La/rpt;->n(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object p1

    .line 672
    if-ne p1, p0, :cond_24

    .line 673
    .line 674
    move-object v4, p0

    .line 675
    goto :goto_16

    .line 676
    :cond_24
    move-object p0, p1

    .line 677
    :goto_15
    sget p1, La/yat0;->w:I

    .line 678
    .line 679
    iget-object p1, v5, La/i3t0;->i:La/ocj;

    .line 680
    .line 681
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 682
    .line 683
    :cond_25
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object p1

    .line 687
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    move-object v1, p1

    .line 691
    check-cast v1, La/wat0;

    .line 692
    .line 693
    new-instance v2, La/j0g0;

    .line 694
    .line 695
    invoke-direct {v2, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    iget-boolean v1, v1, La/wat0;->a:Z

    .line 699
    .line 700
    new-instance v3, La/wat0;

    .line 701
    .line 702
    invoke-direct {v3, v2, v1}, La/wat0;-><init>(La/j0g0;Z)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v0, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    move-result p1

    .line 709
    if-eqz p1, :cond_25

    .line 710
    .line 711
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 712
    .line 713
    :goto_16
    return-object v4

    .line 714
    :pswitch_a
    move-object v13, p0

    .line 715
    check-cast v5, La/dat0;

    .line 716
    .line 717
    sget-object p0, La/wne;->a:La/wne;

    .line 718
    .line 719
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 720
    .line 721
    if-eqz v0, :cond_27

    .line 722
    .line 723
    if-ne v0, v3, :cond_26

    .line 724
    .line 725
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    check-cast p1, La/j0g0;

    .line 729
    .line 730
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 731
    .line 732
    goto :goto_17

    .line 733
    :cond_26
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    goto :goto_18

    .line 737
    :cond_27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    iget-object p1, v5, La/dat0;->r:La/rpt;

    .line 741
    .line 742
    iget-object v0, v5, La/dat0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;

    .line 743
    .line 744
    iget-wide v6, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;->a:J

    .line 745
    .line 746
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;->e:Ljava/lang/String;

    .line 747
    .line 748
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 749
    .line 750
    invoke-virtual {p1, v6, v7, v13, v0}, La/rpt;->n(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object p1

    .line 754
    if-ne p1, p0, :cond_28

    .line 755
    .line 756
    move-object v4, p0

    .line 757
    goto :goto_18

    .line 758
    :cond_28
    move-object p0, p1

    .line 759
    :goto_17
    sget p1, La/dat0;->y:I

    .line 760
    .line 761
    iget-object p1, v5, La/i3t0;->i:La/ocj;

    .line 762
    .line 763
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 764
    .line 765
    :cond_29
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object p1

    .line 769
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    move-object v2, p1

    .line 773
    check-cast v2, La/aat0;

    .line 774
    .line 775
    new-instance v4, La/j0g0;

    .line 776
    .line 777
    invoke-direct {v4, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    invoke-static {v2, v1, v4, v3}, La/aat0;->a(La/aat0;ZLa/j0g0;I)La/aat0;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    invoke-virtual {v0, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result p1

    .line 788
    if-eqz p1, :cond_29

    .line 789
    .line 790
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 791
    .line 792
    :goto_18
    return-object v4

    .line 793
    :pswitch_b
    move-object v13, p0

    .line 794
    check-cast v5, La/ltr0;

    .line 795
    .line 796
    sget-object p0, La/wne;->a:La/wne;

    .line 797
    .line 798
    iget-boolean v0, v13, La/jtr0;->j:Z

    .line 799
    .line 800
    if-eqz v0, :cond_2b

    .line 801
    .line 802
    if-ne v0, v3, :cond_2a

    .line 803
    .line 804
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    goto :goto_19

    .line 808
    :cond_2a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    goto :goto_1a

    .line 812
    :cond_2b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 813
    .line 814
    .line 815
    iget-object p1, v5, La/ltr0;->H:La/m1e;

    .line 816
    .line 817
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 818
    .line 819
    .line 820
    move-result-object p1

    .line 821
    iput-boolean v3, v13, La/jtr0;->j:Z

    .line 822
    .line 823
    invoke-static {p1, v13}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object p1

    .line 827
    if-ne p1, p0, :cond_2c

    .line 828
    .line 829
    move-object v4, p0

    .line 830
    goto :goto_1a

    .line 831
    :cond_2c
    :goto_19
    check-cast p1, Ljava/lang/Boolean;

    .line 832
    .line 833
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 834
    .line 835
    .line 836
    move-result p0

    .line 837
    new-instance p1, La/cxi0;

    .line 838
    .line 839
    const/16 v0, 0x16

    .line 840
    .line 841
    invoke-direct {p1, v0, p0}, La/cxi0;-><init>(BZ)V

    .line 842
    .line 843
    .line 844
    sget p0, La/ltr0;->Q:I

    .line 845
    .line 846
    invoke-virtual {v5, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 847
    .line 848
    .line 849
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 850
    .line 851
    :goto_1a
    return-object v4

    .line 852
    nop

    .line 853
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
