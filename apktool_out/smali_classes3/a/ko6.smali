.class public final La/ko6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/po6;


# direct methods
.method public synthetic constructor <init>(La/po6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ko6;->i:B

    iput-object p1, p0, La/ko6;->j:La/po6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ko6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ko6;->j:La/po6;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ko6;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ko6;-><init>(La/po6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ko6;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ko6;-><init>(La/po6;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/ko6;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/ko6;-><init>(La/po6;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/ko6;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/ko6;-><init>(La/po6;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ko6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ko6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ko6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ko6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ko6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ko6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ko6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ko6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ko6;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ko6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/ko6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/ko6;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/ko6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ko6;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/ko6;->j:La/po6;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-boolean p1, p0, La/po6;->L:Z

    .line 16
    .line 17
    xor-int/2addr p1, v2

    .line 18
    iput-boolean p1, p0, La/po6;->L:Z

    .line 19
    .line 20
    iget-object p1, p0, La/po6;->f:La/qtt;

    .line 21
    .line 22
    invoke-virtual {p1}, La/qtt;->a()Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object p1, p0, La/po6;->r:La/vn7;

    .line 27
    .line 28
    iget-object p1, p1, La/vn7;->a:La/uzc;

    .line 29
    .line 30
    invoke-virtual {p1}, La/uzc;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    iget-object p1, p0, La/po6;->n:La/x4u;

    .line 35
    .line 36
    invoke-virtual {p1}, La/x4u;->d()Ljava/util/HashMap;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const/4 v7, 0x0

    .line 41
    iget-object v8, p0, La/po6;->B:La/ctf0;

    .line 42
    .line 43
    move-object v4, v3

    .line 44
    invoke-static/range {v3 .. v8}, La/o050;->L(Ljava/util/List;Ljava/util/List;ZLjava/util/HashMap;ZLa/ctf0;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    iget-boolean v0, p0, La/po6;->N:Z

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    move v1, v2

    .line 59
    :cond_0
    iget-object v0, p0, La/po6;->R:La/p7m0;

    .line 60
    .line 61
    new-instance v2, La/yv7;

    .line 62
    .line 63
    invoke-virtual {p0}, La/po6;->x()Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {v2, p0, v1}, La/yv7;-><init>(Ljava/util/ArrayList;Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    invoke-virtual {v0, p0, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/po6;->V:La/ol60;

    .line 90
    .line 91
    sget-object p1, La/av7;->a:La/av7;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 100
    .line 101
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, La/po6;->V:La/ol60;

    .line 105
    .line 106
    sget-object p1, La/bv7;->a:La/bv7;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 115
    .line 116
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, La/po6;->V:La/ol60;

    .line 120
    .line 121
    new-instance v0, La/zu7;

    .line 122
    .line 123
    iget-object v3, p0, La/po6;->J:La/lk5;

    .line 124
    .line 125
    sget-object v4, La/j820;->e:La/j820;

    .line 126
    .line 127
    invoke-virtual {v3, v4}, La/lk5;->c(La/j820;)La/ua20;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v4, La/ua20;->b:La/ua20;

    .line 132
    .line 133
    if-eq v3, v4, :cond_1

    .line 134
    .line 135
    move v3, v2

    .line 136
    goto :goto_0

    .line 137
    :cond_1
    move v3, v1

    .line 138
    :goto_0
    iget-object v4, p0, La/po6;->u:La/lbu;

    .line 139
    .line 140
    invoke-virtual {v4}, La/lbu;->j()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-nez v4, :cond_2

    .line 145
    .line 146
    iget-object p0, p0, La/po6;->K:La/n0o0;

    .line 147
    .line 148
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    check-cast p0, La/sff0;

    .line 153
    .line 154
    iget-object p0, p0, La/sff0;->l:La/toc0;

    .line 155
    .line 156
    iget-boolean p0, p0, La/toc0;->g:Z

    .line 157
    .line 158
    if-eqz p0, :cond_2

    .line 159
    .line 160
    move v1, v2

    .line 161
    :cond_2
    invoke-direct {v0, v3, v1}, La/zu7;-><init>(ZZ)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
