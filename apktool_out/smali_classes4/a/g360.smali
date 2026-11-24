.class public final La/g360;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/v360;

.field public final synthetic m:La/rz50;


# direct methods
.method public synthetic constructor <init>(La/v360;La/rz50;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/g360;->i:B

    iput-object p1, p0, La/g360;->l:La/v360;

    iput-object p2, p0, La/g360;->m:La/rz50;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/g360;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/g360;

    .line 7
    .line 8
    iget-object v1, p0, La/g360;->m:La/rz50;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    iget-object p0, p0, La/g360;->l:La/v360;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/g360;-><init>(La/v360;La/rz50;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/g360;->k:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/g360;

    .line 20
    .line 21
    iget-object v1, p0, La/g360;->m:La/rz50;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iget-object p0, p0, La/g360;->l:La/v360;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p2, v2}, La/g360;-><init>(La/v360;La/rz50;La/yje;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, La/g360;->k:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, La/g360;

    .line 33
    .line 34
    iget-object v1, p0, La/g360;->m:La/rz50;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iget-object p0, p0, La/g360;->l:La/v360;

    .line 38
    .line 39
    invoke-direct {v0, p0, v1, p2, v2}, La/g360;-><init>(La/v360;La/rz50;La/yje;B)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v0, La/g360;->k:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/g360;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/g360;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g360;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g360;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/g360;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/g360;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/g360;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/g360;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/g360;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/g360;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/g360;->i:B

    .line 2
    .line 3
    const/16 v1, 0x7f

    .line 4
    .line 5
    sget-object v2, La/mz50;->a:La/mz50;

    .line 6
    .line 7
    iget-object v3, p0, La/g360;->m:La/rz50;

    .line 8
    .line 9
    iget-object v4, p0, La/g360;->l:La/v360;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/g360;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/kmq;

    .line 21
    .line 22
    sget-object v8, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-boolean v9, p0, La/g360;->j:Z

    .line 25
    .line 26
    if-eqz v9, :cond_1

    .line 27
    .line 28
    if-ne v9, v6, :cond_0

    .line 29
    .line 30
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, La/c260;

    .line 46
    .line 47
    iget-object p1, p1, La/c260;->j:La/tz50;

    .line 48
    .line 49
    instance-of p1, p1, La/sz50;

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    invoke-static {v3, v7, v2, v1}, La/rz50;->a(La/rz50;La/kz50;La/nz50;I)La/rz50;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object v7, p0, La/g360;->k:Ljava/lang/Object;

    .line 58
    .line 59
    iput-boolean v6, p0, La/g360;->j:Z

    .line 60
    .line 61
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, v8, :cond_2

    .line 66
    .line 67
    move-object v7, v8

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    :goto_1
    return-object v7

    .line 72
    :pswitch_0
    iget-object v0, p0, La/g360;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/kmq;

    .line 75
    .line 76
    sget-object v8, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v9, p0, La/g360;->j:Z

    .line 79
    .line 80
    if-eqz v9, :cond_4

    .line 81
    .line 82
    if-ne v9, v6, :cond_3

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, La/c260;

    .line 100
    .line 101
    iget-object p1, p1, La/c260;->j:La/tz50;

    .line 102
    .line 103
    instance-of p1, p1, La/sz50;

    .line 104
    .line 105
    if-nez p1, :cond_5

    .line 106
    .line 107
    invoke-static {v3, v7, v2, v1}, La/rz50;->a(La/rz50;La/kz50;La/nz50;I)La/rz50;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object v7, p0, La/g360;->k:Ljava/lang/Object;

    .line 112
    .line 113
    iput-boolean v6, p0, La/g360;->j:Z

    .line 114
    .line 115
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-ne p0, v8, :cond_5

    .line 120
    .line 121
    move-object v7, v8

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    :goto_3
    return-object v7

    .line 126
    :pswitch_1
    iget-object v0, p0, La/g360;->k:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, La/kmq;

    .line 129
    .line 130
    sget-object v8, La/wne;->a:La/wne;

    .line 131
    .line 132
    iget-boolean v9, p0, La/g360;->j:Z

    .line 133
    .line 134
    if-eqz v9, :cond_7

    .line 135
    .line 136
    if-ne v9, v6, :cond_6

    .line 137
    .line 138
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, La/c260;

    .line 154
    .line 155
    iget-object p1, p1, La/c260;->j:La/tz50;

    .line 156
    .line 157
    instance-of p1, p1, La/sz50;

    .line 158
    .line 159
    if-nez p1, :cond_8

    .line 160
    .line 161
    invoke-static {v3, v7, v2, v1}, La/rz50;->a(La/rz50;La/kz50;La/nz50;I)La/rz50;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iput-object v7, p0, La/g360;->k:Ljava/lang/Object;

    .line 166
    .line 167
    iput-boolean v6, p0, La/g360;->j:Z

    .line 168
    .line 169
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    if-ne p0, v8, :cond_8

    .line 174
    .line 175
    move-object v7, v8

    .line 176
    goto :goto_5

    .line 177
    :cond_8
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    :goto_5
    return-object v7

    .line 180
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
