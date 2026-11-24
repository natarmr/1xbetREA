.class public final La/k8q;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/r8q;


# direct methods
.method public synthetic constructor <init>(La/r8q;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k8q;->i:B

    iput-object p1, p0, La/k8q;->l:La/r8q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k8q;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k8q;->l:La/r8q;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/k8q;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/k8q;-><init>(La/r8q;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/k8q;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/k8q;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/k8q;-><init>(La/r8q;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/k8q;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/k8q;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/sw00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/k8q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/k8q;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/k8q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/k8q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/k8q;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/k8q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/k8q;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/k8q;->l:La/r8q;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/k8q;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/sw00;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/k8q;->j:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-boolean p1, v0, La/sw00;->a:Z

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iput-object v4, p0, La/k8q;->k:Ljava/lang/Object;

    .line 40
    .line 41
    iput-boolean v3, p0, La/k8q;->j:Z

    .line 42
    .line 43
    sget-object p1, La/r8q;->Y:La/ocq;

    .line 44
    .line 45
    invoke-virtual {v2, p0}, La/r8q;->y(La/zje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v5, :cond_2

    .line 50
    .line 51
    move-object v4, v5

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_0
    sget-object p0, La/r8q;->Y:La/ocq;

    .line 54
    .line 55
    iget-object p0, v2, La/r8q;->B:La/f6k;

    .line 56
    .line 57
    sget-object p1, La/bm5;->m:La/bm5;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, La/f6k;->a(La/bm5;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, v2, La/r8q;->I:La/b8u;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, La/b8u;->a(La/bm5;)La/i89;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, La/sxk;

    .line 69
    .line 70
    const/16 v0, 0x17

    .line 71
    .line 72
    invoke-direct {p1, v2, v4, v0}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    new-instance v0, La/fnq;

    .line 76
    .line 77
    const/4 v1, 0x4

    .line 78
    invoke-direct {v0, p0, p1, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 79
    .line 80
    .line 81
    iget-object p0, v2, La/r8q;->X:La/sje;

    .line 82
    .line 83
    invoke-static {v0, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 84
    .line 85
    .line 86
    iget-object p0, v2, La/r8q;->y:La/vpu;

    .line 87
    .line 88
    invoke-virtual {p0}, La/vpu;->a()La/fnq;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    new-instance p1, La/k8q;

    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    invoke-direct {p1, v2, v4, v0}, La/k8q;-><init>(La/r8q;La/yje;B)V

    .line 96
    .line 97
    .line 98
    new-instance v3, La/fnq;

    .line 99
    .line 100
    invoke-direct {v3, p0, p1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/l8q;

    .line 104
    .line 105
    invoke-direct {p0, v2, v4, v0}, La/l8q;-><init>(La/r8q;La/yje;B)V

    .line 106
    .line 107
    .line 108
    new-instance p1, La/fnq;

    .line 109
    .line 110
    invoke-direct {p1, v3, p0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p1, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object p0, v2, La/r8q;->S:La/p7m0;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    sget-object p1, La/p7q;->a:La/p7q;

    .line 127
    .line 128
    invoke-virtual {p0, v4, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    :goto_2
    return-object v4

    .line 134
    :pswitch_0
    iget-object v0, p0, La/k8q;->k:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, La/kmq;

    .line 137
    .line 138
    sget-object v5, La/wne;->a:La/wne;

    .line 139
    .line 140
    iget-boolean v6, p0, La/k8q;->j:Z

    .line 141
    .line 142
    if-eqz v6, :cond_5

    .line 143
    .line 144
    if-ne v6, v3, :cond_4

    .line 145
    .line 146
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object p1, v2, La/r8q;->v:La/yk50;

    .line 158
    .line 159
    invoke-virtual {p1}, La/yk50;->g()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object v4, p0, La/k8q;->k:Ljava/lang/Object;

    .line 168
    .line 169
    iput-boolean v3, p0, La/k8q;->j:Z

    .line 170
    .line 171
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    if-ne p0, v5, :cond_6

    .line 176
    .line 177
    move-object v4, v5

    .line 178
    goto :goto_4

    .line 179
    :cond_6
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    :goto_4
    return-object v4

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
