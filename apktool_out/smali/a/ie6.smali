.class public final La/ie6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/p7m0;

.field public k:La/me6;

.field public l:Ljava/lang/String;

.field public m:La/q88;

.field public n:Z

.field public final synthetic o:La/me6;

.field public final synthetic p:La/q88;


# direct methods
.method public synthetic constructor <init>(La/me6;La/q88;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ie6;->i:B

    iput-object p1, p0, La/ie6;->o:La/me6;

    iput-object p2, p0, La/ie6;->p:La/q88;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/ie6;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/ie6;->p:La/q88;

    .line 4
    .line 5
    iget-object p0, p0, La/ie6;->o:La/me6;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/ie6;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/ie6;-><init>(La/me6;La/q88;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/ie6;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/ie6;-><init>(La/me6;La/q88;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ie6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ie6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ie6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ie6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ie6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ie6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ie6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ie6;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ie6;->p:La/q88;

    .line 4
    .line 5
    iget-object v2, p0, La/ie6;->o:La/me6;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/ie6;->n:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, La/ie6;->m:La/q88;

    .line 23
    .line 24
    iget-object v0, p0, La/ie6;->l:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, p0, La/ie6;->k:La/me6;

    .line 27
    .line 28
    iget-object p0, p0, La/ie6;->j:La/p7m0;

    .line 29
    .line 30
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, v2, La/me6;->z:La/p7m0;

    .line 42
    .line 43
    iget-object v3, v1, La/q88;->g:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p1, p0, La/ie6;->j:La/p7m0;

    .line 46
    .line 47
    iput-object v2, p0, La/ie6;->k:La/me6;

    .line 48
    .line 49
    iput-object v3, p0, La/ie6;->l:Ljava/lang/String;

    .line 50
    .line 51
    iput-object v1, p0, La/ie6;->m:La/q88;

    .line 52
    .line 53
    iput-boolean v4, p0, La/ie6;->n:Z

    .line 54
    .line 55
    iget-object v4, v2, La/me6;->o:La/j9c;

    .line 56
    .line 57
    invoke-virtual {v4}, La/j9c;->a()La/q4f;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    sget-object v6, La/q4f;->m:La/q4f;

    .line 62
    .line 63
    if-ne v4, v6, :cond_2

    .line 64
    .line 65
    iget-object v4, v2, La/me6;->t:La/phf0;

    .line 66
    .line 67
    iget v6, v2, La/me6;->b:I

    .line 68
    .line 69
    invoke-virtual {v4, v6, p0}, La/phf0;->p(ILa/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 75
    .line 76
    :goto_0
    if-ne p0, v0, :cond_3

    .line 77
    .line 78
    move-object v5, v0

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    move-object v0, p1

    .line 81
    move-object p1, p0

    .line 82
    move-object p0, v0

    .line 83
    move-object v0, v3

    .line 84
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-virtual {v2, v0, v1, p1}, La/me6;->B(Ljava/lang/String;La/q88;Z)La/zd6;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v5, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    :goto_2
    return-object v5

    .line 103
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget-boolean v6, p0, La/ie6;->n:Z

    .line 106
    .line 107
    if-eqz v6, :cond_5

    .line 108
    .line 109
    if-ne v6, v4, :cond_4

    .line 110
    .line 111
    iget-object v1, p0, La/ie6;->m:La/q88;

    .line 112
    .line 113
    iget-object v0, p0, La/ie6;->l:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v2, p0, La/ie6;->k:La/me6;

    .line 116
    .line 117
    iget-object p0, p0, La/ie6;->j:La/p7m0;

    .line 118
    .line 119
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object p1, v2, La/me6;->z:La/p7m0;

    .line 131
    .line 132
    iget-object v3, v1, La/q88;->g:Ljava/lang/String;

    .line 133
    .line 134
    iput-object p1, p0, La/ie6;->j:La/p7m0;

    .line 135
    .line 136
    iput-object v2, p0, La/ie6;->k:La/me6;

    .line 137
    .line 138
    iput-object v3, p0, La/ie6;->l:Ljava/lang/String;

    .line 139
    .line 140
    iput-object v1, p0, La/ie6;->m:La/q88;

    .line 141
    .line 142
    iput-boolean v4, p0, La/ie6;->n:Z

    .line 143
    .line 144
    iget-object v4, v2, La/me6;->o:La/j9c;

    .line 145
    .line 146
    invoke-virtual {v4}, La/j9c;->a()La/q4f;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    sget-object v6, La/q4f;->m:La/q4f;

    .line 151
    .line 152
    if-ne v4, v6, :cond_6

    .line 153
    .line 154
    iget-object v4, v2, La/me6;->t:La/phf0;

    .line 155
    .line 156
    iget v6, v2, La/me6;->b:I

    .line 157
    .line 158
    invoke-virtual {v4, v6, p0}, La/phf0;->p(ILa/zje;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    goto :goto_3

    .line 163
    :cond_6
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 164
    .line 165
    :goto_3
    if-ne p0, v0, :cond_7

    .line 166
    .line 167
    move-object v5, v0

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    move-object v0, p1

    .line 170
    move-object p1, p0

    .line 171
    move-object p0, v0

    .line 172
    move-object v0, v3

    .line 173
    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-virtual {v2, v0, v1, p1}, La/me6;->B(Ljava/lang/String;La/q88;Z)La/zd6;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v5, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    :goto_5
    return-object v5

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
