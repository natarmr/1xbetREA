.class public final La/vns;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/zns;


# direct methods
.method public synthetic constructor <init>(La/zns;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vns;->i:B

    iput-object p1, p0, La/vns;->k:La/zns;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/vns;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vns;->k:La/zns;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/vns;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/vns;-><init>(La/zns;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/vns;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/vns;-><init>(La/zns;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/vns;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/vns;-><init>(La/zns;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vns;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/vns;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vns;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vns;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/vns;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/vns;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/vns;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/vns;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/vns;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/vns;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/vns;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/vns;->k:La/zns;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/vns;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-boolean v3, p0, La/vns;->j:Z

    .line 32
    .line 33
    sget p1, La/zns;->H:I

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-virtual {v4, p1, p0}, La/zns;->O(ZLa/zje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    move-object v1, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    check-cast p1, Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;

    .line 45
    .line 46
    sget p0, La/zns;->H:I

    .line 47
    .line 48
    invoke-virtual {v4, p1}, La/zns;->W(Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;)V

    .line 49
    .line 50
    .line 51
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    :goto_1
    return-object v1

    .line 54
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 55
    .line 56
    iget-boolean v5, p0, La/vns;->j:Z

    .line 57
    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    if-ne v5, v3, :cond_3

    .line 61
    .line 62
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, v4, La/zns;->C:La/m1e;

    .line 74
    .line 75
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v1, La/g7s;

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    invoke-direct {v1, v4, v2}, La/g7s;-><init>(Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    iput-boolean v3, p0, La/vns;->j:Z

    .line 86
    .line 87
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p0, v0, :cond_5

    .line 92
    .line 93
    move-object v1, v0

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_3
    return-object v1

    .line 98
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 99
    .line 100
    iget-boolean v5, p0, La/vns;->j:Z

    .line 101
    .line 102
    if-eqz v5, :cond_7

    .line 103
    .line 104
    if-ne v5, v3, :cond_6

    .line 105
    .line 106
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, La/qns;

    .line 122
    .line 123
    iget-boolean p1, p1, La/qns;->a:Z

    .line 124
    .line 125
    if-nez p1, :cond_9

    .line 126
    .line 127
    iget-object p1, v4, La/i3t0;->i:La/ocj;

    .line 128
    .line 129
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 130
    .line 131
    :cond_8
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-object v5, v1

    .line 139
    check-cast v5, La/qns;

    .line 140
    .line 141
    const/4 v11, 0x0

    .line 142
    const/16 v12, 0x1fd

    .line 143
    .line 144
    const/4 v6, 0x1

    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v8, 0x0

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, 0x0

    .line 149
    invoke-static/range {v5 .. v12}, La/qns;->a(La/qns;ZZZLorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;Ljava/util/ArrayList;Ljava/util/ArrayList;I)La/qns;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {p1, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_8

    .line 158
    .line 159
    :cond_9
    iput-boolean v3, p0, La/vns;->j:Z

    .line 160
    .line 161
    invoke-virtual {v4, v3, p0}, La/zns;->O(ZLa/zje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-ne p1, v0, :cond_a

    .line 166
    .line 167
    move-object v1, v0

    .line 168
    goto :goto_5

    .line 169
    :cond_a
    :goto_4
    check-cast p1, Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;

    .line 170
    .line 171
    sget p0, La/zns;->H:I

    .line 172
    .line 173
    invoke-virtual {v4, p1}, La/zns;->W(Lorg/xplatform/feed/notifictation/presentation/models/GameSubscriptionSettingsScreenUiModel;)V

    .line 174
    .line 175
    .line 176
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    :goto_5
    return-object v1

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
