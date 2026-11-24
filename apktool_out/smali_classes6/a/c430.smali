.class public final La/c430;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d430;


# direct methods
.method public synthetic constructor <init>(La/d430;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/c430;->i:B

    iput-object p1, p0, La/c430;->k:La/d430;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/c430;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/c430;->k:La/d430;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/c430;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/c430;-><init>(La/d430;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/c430;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/c430;-><init>(La/d430;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/c430;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/c430;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/c430;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/c430;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/c430;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/c430;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/c430;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/c430;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/c430;->k:La/d430;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/c430;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

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
    iget-object p1, v3, La/d430;->r:La/art;

    .line 32
    .line 33
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/y330;

    .line 38
    .line 39
    iget-object v1, v1, La/y330;->b:La/udl0;

    .line 40
    .line 41
    invoke-static {v1}, La/ufx;->N(La/udl0;)La/t730;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, La/art;->d(La/t730;)La/aw20;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v1, v3, La/d430;->q:La/zru;

    .line 53
    .line 54
    iput-boolean v4, p0, La/c430;->j:Z

    .line 55
    .line 56
    iget-object v1, v1, La/zru;->a:La/pyu;

    .line 57
    .line 58
    invoke-virtual {v1, p1, p0}, La/pyu;->e(La/aw20;La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_2

    .line 63
    .line 64
    move-object v1, v0

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    move-object v6, p1

    .line 67
    check-cast v6, La/aw20;

    .line 68
    .line 69
    sget-object p0, La/d430;->v:Ljava/util/List;

    .line 70
    .line 71
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 72
    .line 73
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 74
    .line 75
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-object v4, p0

    .line 83
    check-cast v4, La/y330;

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    const/16 v9, 0x73

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    move-object v7, v6

    .line 90
    invoke-static/range {v4 .. v9}, La/y330;->a(La/y330;ZLa/aw20;La/aw20;Ljava/util/List;I)La/y330;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    :goto_1
    return-object v1

    .line 103
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget-boolean v5, p0, La/c430;->j:Z

    .line 106
    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    if-ne v5, v4, :cond_4

    .line 110
    .line 111
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, v3, La/d430;->u:La/lhf0;

    .line 123
    .line 124
    iput-boolean v4, p0, La/c430;->j:Z

    .line 125
    .line 126
    invoke-virtual {p1, p0}, La/lhf0;->u(La/zje;)Ljava/io/Serializable;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v0, :cond_6

    .line 131
    .line 132
    move-object v1, v0

    .line 133
    goto :goto_3

    .line 134
    :cond_6
    :goto_2
    move-object v8, p1

    .line 135
    check-cast v8, Ljava/util/List;

    .line 136
    .line 137
    sget-object p0, La/d430;->v:Ljava/util/List;

    .line 138
    .line 139
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 140
    .line 141
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 142
    .line 143
    :cond_7
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-object v4, p1

    .line 151
    check-cast v4, La/y330;

    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    const/16 v9, 0x6f

    .line 155
    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v6, 0x0

    .line 158
    invoke-static/range {v4 .. v9}, La/y330;->a(La/y330;ZLa/aw20;La/aw20;Ljava/util/List;I)La/y330;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_7

    .line 167
    .line 168
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    :goto_3
    return-object v1

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
