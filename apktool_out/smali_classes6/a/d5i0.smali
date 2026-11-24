.class public final La/d5i0;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic j:B

.field public k:J

.field public l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLa/lie0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/d5i0;->j:B

    .line 3
    .line 4
    iput-wide p1, p0, La/d5i0;->k:J

    .line 5
    .line 6
    iput-object p3, p0, La/d5i0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, La/zzf0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/dpa0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/d5i0;->j:B

    .line 13
    iput-object p1, p0, La/d5i0;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 4

    .line 1
    iget-byte v0, p0, La/d5i0;->j:B

    .line 2
    .line 3
    iget-object v1, p0, La/d5i0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/d5i0;

    .line 9
    .line 10
    check-cast v1, La/dpa0;

    .line 11
    .line 12
    invoke-direct {p0, v1, p2}, La/d5i0;-><init>(La/dpa0;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/d5i0;->m:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance v0, La/d5i0;

    .line 19
    .line 20
    iget-wide v2, p0, La/d5i0;->k:J

    .line 21
    .line 22
    check-cast v1, La/lie0;

    .line 23
    .line 24
    invoke-direct {v0, v2, v3, v1, p2}, La/d5i0;-><init>(JLa/lie0;La/yje;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, La/d5i0;->m:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/d5i0;->j:B

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
    invoke-virtual {p0, p1, p2}, La/d5i0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/d5i0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/d5i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/d5i0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/d5i0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/d5i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/d5i0;->j:B

    .line 2
    .line 3
    iget-object v1, p0, La/d5i0;->n:Ljava/lang/Object;

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
    iget-boolean v5, p0, La/d5i0;->l:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    iget-wide v1, p0, La/d5i0;->k:J

    .line 21
    .line 22
    iget-object v3, p0, La/d5i0;->m:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, La/inn0;

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, La/d5i0;->m:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, La/inn0;

    .line 40
    .line 41
    check-cast v1, La/dpa0;

    .line 42
    .line 43
    iget-wide v1, v1, La/dpa0;->b:J

    .line 44
    .line 45
    invoke-virtual {p1}, La/inn0;->e()La/wgu0;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v3}, La/wgu0;->b()J

    .line 50
    .line 51
    .line 52
    move-result-wide v5

    .line 53
    add-long/2addr v5, v1

    .line 54
    move-object v3, p1

    .line 55
    move-wide v1, v5

    .line 56
    :cond_2
    iput-object v3, p0, La/d5i0;->m:Ljava/lang/Object;

    .line 57
    .line 58
    iput-wide v1, p0, La/d5i0;->k:J

    .line 59
    .line 60
    iput-boolean v4, p0, La/d5i0;->l:Z

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    const/4 v5, 0x3

    .line 64
    invoke-static {v3, p1, p0, v5}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_3

    .line 69
    .line 70
    move-object v2, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    :goto_0
    check-cast p1, La/dpa0;

    .line 73
    .line 74
    iget-wide v5, p1, La/dpa0;->b:J

    .line 75
    .line 76
    cmp-long v5, v5, v1

    .line 77
    .line 78
    if-ltz v5, :cond_2

    .line 79
    .line 80
    move-object v2, p1

    .line 81
    :goto_1
    return-object v2

    .line 82
    :pswitch_0
    check-cast v1, La/lie0;

    .line 83
    .line 84
    sget-object v0, La/wne;->a:La/wne;

    .line 85
    .line 86
    iget-boolean v5, p0, La/d5i0;->l:Z

    .line 87
    .line 88
    if-eqz v5, :cond_5

    .line 89
    .line 90
    if-ne v5, v4, :cond_4

    .line 91
    .line 92
    iget-object p0, p0, La/d5i0;->m:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, La/inn0;

    .line 95
    .line 96
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, La/d5i0;->m:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, La/inn0;

    .line 110
    .line 111
    iget-wide v2, p0, La/d5i0;->k:J

    .line 112
    .line 113
    new-instance v5, La/uph0;

    .line 114
    .line 115
    const/4 v6, 0x6

    .line 116
    invoke-direct {v5, v1, v6}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, La/d5i0;->m:Ljava/lang/Object;

    .line 120
    .line 121
    iput-boolean v4, p0, La/d5i0;->l:Z

    .line 122
    .line 123
    invoke-static {p1, v2, v3, v5, p0}, La/bel;->c(La/inn0;JLkotlin/jvm/functions/Function2;La/zw5;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-ne p0, v0, :cond_6

    .line 128
    .line 129
    move-object v2, v0

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move-object v7, p1

    .line 132
    move-object p1, p0

    .line 133
    move-object p0, v7

    .line 134
    :goto_2
    check-cast p1, La/dpa0;

    .line 135
    .line 136
    if-eqz p1, :cond_7

    .line 137
    .line 138
    iget-wide v0, v1, La/lie0;->a:J

    .line 139
    .line 140
    const-wide v2, 0x7fffffff7fffffffL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    and-long/2addr v0, v2

    .line 146
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    cmp-long p1, v0, v2

    .line 152
    .line 153
    if-eqz p1, :cond_7

    .line 154
    .line 155
    sget-object v2, La/acl;->b:La/acl;

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    iget-object p0, p0, La/inn0;->f:La/jnn0;

    .line 159
    .line 160
    iget-object p0, p0, La/jnn0;->s:La/woa0;

    .line 161
    .line 162
    iget-object p0, p0, La/woa0;->a:Ljava/util/List;

    .line 163
    .line 164
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, La/dpa0;

    .line 169
    .line 170
    invoke-static {p0}, La/x2x;->L(La/dpa0;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_8

    .line 175
    .line 176
    invoke-virtual {p0}, La/dpa0;->a()V

    .line 177
    .line 178
    .line 179
    sget-object v2, La/acl;->a:La/acl;

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_8
    sget-object v2, La/acl;->d:La/acl;

    .line 183
    .line 184
    :goto_3
    return-object v2

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
