.class public final La/ivj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/jvj0;


# direct methods
.method public constructor <init>(La/jvj0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ivj0;->j:La/jvj0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/ivj0;

    .line 2
    .line 3
    iget-object p0, p0, La/ivj0;->j:La/jvj0;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/ivj0;-><init>(La/jvj0;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/ivj0;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/ja20;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/ivj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ivj0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ivj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/ivj0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ja20;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    iget-object v1, v0, La/ja20;->h:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, La/ivj0;->j:La/jvj0;

    .line 16
    .line 17
    iget-object v2, p0, La/jvj0;->P1:La/lgn0;

    .line 18
    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    new-instance v3, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 22
    .line 23
    const v4, 0x7f13025d

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v5, v0, La/ja20;->i:Ljava/lang/String;

    .line 34
    .line 35
    invoke-direct {v3, v4, p1, v5, p1}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const p1, 0x7f1312d7

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iget-object v6, v0, La/ja20;->e:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v4, 0x0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    const/4 v4, 0x1

    .line 63
    :goto_1
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 64
    .line 65
    if-nez v4, :cond_2

    .line 66
    .line 67
    const v8, 0x7f130cdc

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const v8, 0x7f130494

    .line 72
    .line 73
    .line 74
    :goto_2
    invoke-virtual {p0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v9, v0, La/ja20;->b:Ljava/lang/String;

    .line 82
    .line 83
    invoke-direct {v7, v8, v9}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    if-nez v4, :cond_3

    .line 90
    .line 91
    new-instance v4, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 92
    .line 93
    const v7, 0x7f130ed9

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-direct {v4, v7, v1}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    :cond_3
    new-instance v8, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 110
    .line 111
    const v1, 0x7f130270

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v11, v0, La/ja20;->a:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const v4, 0x7f040b72

    .line 128
    .line 129
    .line 130
    invoke-static {v4, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    iget-object v12, v0, La/ja20;->d:Ljava/lang/String;

    .line 135
    .line 136
    const/4 v13, 0x1

    .line 137
    invoke-direct/range {v8 .. v13}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    iget-object v1, v0, La/ja20;->g:La/gnb0;

    .line 144
    .line 145
    if-eqz v1, :cond_4

    .line 146
    .line 147
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 148
    .line 149
    iget-object v9, v1, La/gnb0;->a:Ljava/lang/String;

    .line 150
    .line 151
    iget-object v10, v1, La/gnb0;->b:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const v4, 0x7f040aeb

    .line 158
    .line 159
    .line 160
    invoke-static {v4, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    iget-object v11, v0, La/ja20;->d:Ljava/lang/String;

    .line 165
    .line 166
    const/4 v12, 0x0

    .line 167
    invoke-direct/range {v7 .. v12}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_4
    invoke-static {p1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    iget-wide v0, v0, La/ja20;->c:J

    .line 178
    .line 179
    new-instance v4, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 180
    .line 181
    new-instance v8, Ljava/lang/Long;

    .line 182
    .line 183
    invoke-direct {v8, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 184
    .line 185
    .line 186
    const-string v9, "SIMPLE"

    .line 187
    .line 188
    const-string v7, "REQUEST_SUCCESS_BET_KEY"

    .line 189
    .line 190
    invoke-direct/range {v4 .. v10}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 191
    .line 192
    .line 193
    invoke-static {p0}, La/jvj0;->G0(Landroidx/fragment/app/Fragment;)La/a720;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {v2, v3, v4, p1}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 202
    .line 203
    .line 204
    invoke-static {p0}, La/jvj0;->G0(Landroidx/fragment/app/Fragment;)La/a720;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    :cond_5
    const-string p0, "successBetAlertManager"

    .line 215
    .line 216
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw p1

    .line 220
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 221
    .line 222
    .line 223
    return-object p1
.end method
