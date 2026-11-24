.class public final La/ma6;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic j:B

.field public k:Z

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ma6;->j:B

    iput-object p1, p0, La/ma6;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ma6;->j:B

    .line 2
    .line 3
    iget-object p0, p0, La/ma6;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ma6;

    .line 9
    .line 10
    check-cast p0, La/ome;

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-direct {v0, p0, p2, v1}, La/ma6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/ma6;->l:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/ma6;

    .line 20
    .line 21
    check-cast p0, La/ep90;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, p0, p2, v1}, La/ma6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, La/ma6;->l:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, La/ma6;

    .line 31
    .line 32
    check-cast p0, La/xoa0;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p0, p2, v1}, La/ma6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 36
    .line 37
    .line 38
    iput-object p1, v0, La/ma6;->l:Ljava/lang/Object;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ma6;->j:B

    .line 2
    .line 3
    check-cast p1, La/inn0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ma6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ma6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ma6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, La/wne;->a:La/wne;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ma6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/ma6;

    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, La/ma6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p0, La/wne;->a:La/wne;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ma6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/ma6;

    .line 43
    .line 44
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, La/ma6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/ma6;->j:B

    .line 2
    .line 3
    iget-object v1, p0, La/ma6;->m:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

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
    iget-boolean v5, p0, La/ma6;->k:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, La/ma6;->l:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, La/inn0;

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, p0, La/ma6;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/inn0;

    .line 38
    .line 39
    move-object v2, p1

    .line 40
    :goto_0
    sget-object p1, La/xoa0;->a:La/xoa0;

    .line 41
    .line 42
    iput-object v2, p0, La/ma6;->l:Ljava/lang/Object;

    .line 43
    .line 44
    iput-boolean v4, p0, La/ma6;->k:Z

    .line 45
    .line 46
    invoke-virtual {v2, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    :goto_1
    return-object v2

    .line 54
    :cond_2
    :goto_2
    check-cast p1, La/woa0;

    .line 55
    .line 56
    move-object v3, v1

    .line 57
    check-cast v3, La/ome;

    .line 58
    .line 59
    invoke-static {p1}, La/e5i0;->a(La/woa0;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    xor-int/2addr p1, v4

    .line 64
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {v3, p1}, La/ome;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_0
    iget-object v0, p0, La/ma6;->l:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/inn0;

    .line 75
    .line 76
    sget-object v5, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v6, p0, La/ma6;->k:Z

    .line 79
    .line 80
    if-eqz v6, :cond_4

    .line 81
    .line 82
    if-ne v6, v4, :cond_3

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_3
    iput-object v0, p0, La/ma6;->l:Ljava/lang/Object;

    .line 96
    .line 97
    iput-boolean v4, p0, La/ma6;->k:Z

    .line 98
    .line 99
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 100
    .line 101
    invoke-virtual {v0, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v5, :cond_6

    .line 106
    .line 107
    move-object v2, v5

    .line 108
    :goto_4
    return-object v2

    .line 109
    :cond_6
    :goto_5
    check-cast p1, La/woa0;

    .line 110
    .line 111
    iget-object p1, p1, La/woa0;->a:Ljava/util/List;

    .line 112
    .line 113
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, La/dpa0;

    .line 118
    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    iget-boolean p1, p1, La/dpa0;->d:Z

    .line 122
    .line 123
    if-ne p1, v4, :cond_5

    .line 124
    .line 125
    move-object p1, v1

    .line 126
    check-cast p1, La/ep90;

    .line 127
    .line 128
    sget-object v2, La/ep90;->c2:La/jh70;

    .line 129
    .line 130
    invoke-virtual {p1}, La/ep90;->K0()La/k3t0;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    sget-object v2, La/sn90;->a:La/sn90;

    .line 135
    .line 136
    invoke-virtual {p1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 141
    .line 142
    iget-boolean v5, p0, La/ma6;->k:Z

    .line 143
    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    if-ne v5, v4, :cond_7

    .line 147
    .line 148
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    move-object p1, v2

    .line 156
    goto :goto_6

    .line 157
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, La/ma6;->l:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, La/inn0;

    .line 163
    .line 164
    check-cast v1, La/xoa0;

    .line 165
    .line 166
    iput-boolean v4, p0, La/ma6;->k:Z

    .line 167
    .line 168
    invoke-static {p1, v1, p0}, La/tto0;->i(La/inn0;La/xoa0;La/zw5;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-ne p1, v0, :cond_9

    .line 173
    .line 174
    move-object p1, v0

    .line 175
    :cond_9
    :goto_6
    return-object p1

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
