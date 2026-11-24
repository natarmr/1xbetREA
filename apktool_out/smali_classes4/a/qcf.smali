.class public final La/qcf;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xcf;

.field public final synthetic l:La/t33;


# direct methods
.method public synthetic constructor <init>(La/xcf;La/t33;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/qcf;->i:B

    iput-object p1, p0, La/qcf;->k:La/xcf;

    iput-object p2, p0, La/qcf;->l:La/t33;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/qcf;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/qcf;

    .line 7
    .line 8
    iget-object v0, p0, La/qcf;->l:La/t33;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    iget-object p0, p0, La/qcf;->k:La/xcf;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/qcf;-><init>(La/xcf;La/t33;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/qcf;

    .line 18
    .line 19
    iget-object v0, p0, La/qcf;->l:La/t33;

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    iget-object p0, p0, La/qcf;->k:La/xcf;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/qcf;-><init>(La/xcf;La/t33;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, La/qcf;

    .line 29
    .line 30
    iget-object v0, p0, La/qcf;->l:La/t33;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    iget-object p0, p0, La/qcf;->k:La/xcf;

    .line 34
    .line 35
    invoke-direct {p1, p0, v0, p2, v1}, La/qcf;-><init>(La/xcf;La/t33;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    new-instance p1, La/qcf;

    .line 40
    .line 41
    iget-object v0, p0, La/qcf;->l:La/t33;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    iget-object p0, p0, La/qcf;->k:La/xcf;

    .line 45
    .line 46
    invoke-direct {p1, p0, v0, p2, v1}, La/qcf;-><init>(La/xcf;La/t33;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_3
    new-instance p1, La/qcf;

    .line 51
    .line 52
    iget-object v0, p0, La/qcf;->l:La/t33;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    iget-object p0, p0, La/qcf;->k:La/xcf;

    .line 56
    .line 57
    invoke-direct {p1, p0, v0, p2, v1}, La/qcf;-><init>(La/xcf;La/t33;La/yje;B)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qcf;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qcf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qcf;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qcf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qcf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qcf;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qcf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/qcf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/qcf;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/qcf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/qcf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/qcf;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/qcf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/qcf;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/qcf;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/qcf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/qcf;->i:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iget-object v2, p0, La/qcf;->l:La/t33;

    .line 6
    .line 7
    iget-object v3, p0, La/qcf;->k:La/xcf;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, p0, La/qcf;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v6, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-boolean v6, p0, La/qcf;->j:Z

    .line 36
    .line 37
    invoke-virtual {v3, v2, v1, p0}, La/xcf;->a(La/t33;FLa/zje;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-ne p0, v0, :cond_2

    .line 42
    .line 43
    move-object v4, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    :goto_1
    return-object v4

    .line 48
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 49
    .line 50
    iget-boolean v7, p0, La/qcf;->j:Z

    .line 51
    .line 52
    if-eqz v7, :cond_4

    .line 53
    .line 54
    if-ne v7, v6, :cond_3

    .line 55
    .line 56
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-boolean v6, p0, La/qcf;->j:Z

    .line 68
    .line 69
    invoke-virtual {v3, v2, v1, p0}, La/xcf;->a(La/t33;FLa/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v0, :cond_5

    .line 74
    .line 75
    move-object v4, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    :goto_3
    return-object v4

    .line 80
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 81
    .line 82
    iget-boolean v1, p0, La/qcf;->j:Z

    .line 83
    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    if-ne v1, v6, :cond_6

    .line 87
    .line 88
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_6
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iput-boolean v6, p0, La/qcf;->j:Z

    .line 100
    .line 101
    invoke-virtual {v3, v2, p0}, La/xcf;->d(La/t33;La/zje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-ne p0, v0, :cond_8

    .line 106
    .line 107
    move-object v4, v0

    .line 108
    goto :goto_5

    .line 109
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_5
    return-object v4

    .line 112
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 113
    .line 114
    iget-boolean v1, p0, La/qcf;->j:Z

    .line 115
    .line 116
    if-eqz v1, :cond_a

    .line 117
    .line 118
    if-ne v1, v6, :cond_9

    .line 119
    .line 120
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_9
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iput-boolean v6, p0, La/qcf;->j:Z

    .line 132
    .line 133
    invoke-virtual {v3, v2, p0}, La/xcf;->e(La/t33;La/zje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-ne p0, v0, :cond_b

    .line 138
    .line 139
    move-object v4, v0

    .line 140
    goto :goto_7

    .line 141
    :cond_b
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    :goto_7
    return-object v4

    .line 144
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 145
    .line 146
    iget-boolean v1, p0, La/qcf;->j:Z

    .line 147
    .line 148
    if-eqz v1, :cond_d

    .line 149
    .line 150
    if-ne v1, v6, :cond_c

    .line 151
    .line 152
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_c
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_9

    .line 160
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iput-boolean v6, p0, La/qcf;->j:Z

    .line 164
    .line 165
    invoke-virtual {v3, v2, p0}, La/xcf;->f(La/t33;La/zje;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-ne p0, v0, :cond_e

    .line 170
    .line 171
    move-object v4, v0

    .line 172
    goto :goto_9

    .line 173
    :cond_e
    :goto_8
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    :goto_9
    return-object v4

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
