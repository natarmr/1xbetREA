.class public final La/cdu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/pbt;

.field public final c:La/gst0;


# direct methods
.method public constructor <init>(La/pbt;La/gst0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cdu;->a:B

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/cdu;->b:La/pbt;

    .line 16
    .line 17
    iput-object p2, p0, La/cdu;->c:La/gst0;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/cdu;->b:La/pbt;

    .line 24
    .line 25
    iput-object p2, p0, La/cdu;->c:La/gst0;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, La/cdu;->b:La/pbt;

    .line 38
    .line 39
    iput-object p2, p0, La/cdu;->c:La/gst0;

    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, La/cdu;->b:La/pbt;

    .line 52
    .line 53
    iput-object p2, p0, La/cdu;->c:La/gst0;

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic c(La/cdu;ILjava/lang/String;La/yje;I)Ljava/io/Serializable;
    .locals 6

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    move v2, p1

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    move-object v0, p0

    .line 10
    move-object v3, p2

    .line 11
    move-object v5, p3

    .line 12
    invoke-virtual/range {v0 .. v5}, La/cdu;->a(ZILjava/lang/String;ZLa/yje;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public a(ZILjava/lang/String;ZLa/yje;)Ljava/io/Serializable;
    .locals 8

    .line 1
    instance-of v0, p5, La/keu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/keu;

    .line 7
    .line 8
    iget v1, v0, La/keu;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/keu;->m:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/keu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/keu;-><init>(La/cdu;La/yje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, La/keu;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/keu;->m:I

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v7, :cond_1

    .line 37
    .line 38
    iget p2, v6, La/keu;->j:I

    .line 39
    .line 40
    iget-boolean p1, v6, La/keu;->i:Z

    .line 41
    .line 42
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p5, p0, La/cdu;->c:La/gst0;

    .line 57
    .line 58
    invoke-virtual {p5}, La/gst0;->a()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    iput-boolean p1, v6, La/keu;->i:Z

    .line 63
    .line 64
    iput p2, v6, La/keu;->j:I

    .line 65
    .line 66
    iput v7, v6, La/keu;->m:I

    .line 67
    .line 68
    iget-object v1, p0, La/cdu;->b:La/pbt;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    move-object v3, p3

    .line 72
    move v5, p4

    .line 73
    invoke-virtual/range {v1 .. v6}, La/pbt;->o(ZLjava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p5

    .line 77
    if-ne p5, v0, :cond_3

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_3
    :goto_2
    check-cast p5, La/p070;

    .line 81
    .line 82
    iget-object p0, p5, La/p070;->a:Ljava/util/List;

    .line 83
    .line 84
    new-instance p3, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :cond_4
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result p4

    .line 97
    if-eqz p4, :cond_6

    .line 98
    .line 99
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    move-object p5, p4

    .line 104
    check-cast p5, La/pbv;

    .line 105
    .line 106
    if-nez p2, :cond_5

    .line 107
    .line 108
    move p5, v7

    .line 109
    goto :goto_4

    .line 110
    :cond_5
    iget-object p5, p5, La/pbv;->b:Ljava/util/List;

    .line 111
    .line 112
    invoke-static {p2, p5}, La/rz4;->C(ILjava/util/List;)Z

    .line 113
    .line 114
    .line 115
    move-result p5

    .line 116
    :goto_4
    if-eqz p5, :cond_4

    .line 117
    .line 118
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    :cond_7
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    if-eqz p3, :cond_9

    .line 136
    .line 137
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    move-object p4, p3

    .line 142
    check-cast p4, La/pbv;

    .line 143
    .line 144
    if-eqz p1, :cond_8

    .line 145
    .line 146
    iget-boolean p4, p4, La/pbv;->g:Z

    .line 147
    .line 148
    if-eqz p4, :cond_7

    .line 149
    .line 150
    :cond_8
    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_9
    new-instance p1, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    :cond_a
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    if-eqz p2, :cond_b

    .line 168
    .line 169
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    move-object p3, p2

    .line 174
    check-cast p3, La/pbv;

    .line 175
    .line 176
    iget-object p3, p3, La/pbv;->e:La/a570;

    .line 177
    .line 178
    invoke-static {p3}, La/x1x;->G(La/a570;)Z

    .line 179
    .line 180
    .line 181
    move-result p3

    .line 182
    if-eqz p3, :cond_a

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_b
    new-instance p0, Ljava/util/HashSet;

    .line 189
    .line 190
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 191
    .line 192
    .line 193
    new-instance p2, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    :cond_c
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result p3

    .line 206
    if-eqz p3, :cond_d

    .line 207
    .line 208
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    move-object p4, p3

    .line 213
    check-cast p4, La/pbv;

    .line 214
    .line 215
    iget-wide p4, p4, La/pbv;->a:J

    .line 216
    .line 217
    new-instance v0, Ljava/lang/Long;

    .line 218
    .line 219
    invoke-direct {v0, p4, p5}, Ljava/lang/Long;-><init>(J)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result p4

    .line 226
    if-eqz p4, :cond_c

    .line 227
    .line 228
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_d
    return-object p2
.end method

.method public b(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/cdu;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/cdu;->c:La/gst0;

    .line 4
    .line 5
    iget-object v2, p0, La/cdu;->b:La/pbt;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/high16 v4, -0x80000000

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p1, La/dfb0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, La/dfb0;

    .line 22
    .line 23
    iget v7, v0, La/dfb0;->k:I

    .line 24
    .line 25
    and-int v8, v7, v4

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v4

    .line 30
    iput v7, v0, La/dfb0;->k:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/dfb0;

    .line 34
    .line 35
    invoke-direct {v0, p0, p1}, La/dfb0;-><init>(La/cdu;La/zje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/dfb0;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p1, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v4, v0, La/dfb0;->k:I

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    iput v5, v0, La/dfb0;->k:I

    .line 64
    .line 65
    invoke-virtual {v2, p0, v0}, La/pbt;->k(ZLa/zje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, p1, :cond_3

    .line 70
    .line 71
    move-object v6, p1

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    check-cast p0, Ljava/lang/Iterable;

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    move-object v0, p1

    .line 90
    check-cast v0, La/rq60;

    .line 91
    .line 92
    sget-object v1, La/d270;->b:La/evz;

    .line 93
    .line 94
    iget v0, v0, La/rq60;->a:I

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, La/evz;->c(I)La/d270;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v1, La/d270;->c:La/d270;

    .line 104
    .line 105
    if-ne v0, v1, :cond_4

    .line 106
    .line 107
    move-object v6, p1

    .line 108
    :cond_5
    check-cast v6, La/rq60;

    .line 109
    .line 110
    if-eqz v6, :cond_6

    .line 111
    .line 112
    new-instance p0, La/bfb0;

    .line 113
    .line 114
    iget-object p1, v6, La/rq60;->b:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v0, v6, La/rq60;->c:Ljava/lang/String;

    .line 117
    .line 118
    iget-boolean v1, v6, La/rq60;->d:Z

    .line 119
    .line 120
    invoke-direct {p0, p1, v0, v1}, La/bfb0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 121
    .line 122
    .line 123
    move-object v6, p0

    .line 124
    :goto_2
    return-object v6

    .line 125
    :cond_6
    new-instance p0, Ljava/lang/Throwable;

    .line 126
    .line 127
    const-string p1, "No LuckyWheel from popular OneXGames"

    .line 128
    .line 129
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p0

    .line 133
    :pswitch_0
    instance-of v0, p1, La/umv;

    .line 134
    .line 135
    if-eqz v0, :cond_7

    .line 136
    .line 137
    move-object v0, p1

    .line 138
    check-cast v0, La/umv;

    .line 139
    .line 140
    iget v7, v0, La/umv;->k:I

    .line 141
    .line 142
    and-int v8, v7, v4

    .line 143
    .line 144
    if-eqz v8, :cond_7

    .line 145
    .line 146
    sub-int/2addr v7, v4

    .line 147
    iput v7, v0, La/umv;->k:I

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_7
    new-instance v0, La/umv;

    .line 151
    .line 152
    invoke-direct {v0, p0, p1}, La/umv;-><init>(La/cdu;La/zje;)V

    .line 153
    .line 154
    .line 155
    :goto_3
    iget-object p0, v0, La/umv;->i:Ljava/lang/Object;

    .line 156
    .line 157
    sget-object p1, La/wne;->a:La/wne;

    .line 158
    .line 159
    iget v4, v0, La/umv;->k:I

    .line 160
    .line 161
    if-eqz v4, :cond_9

    .line 162
    .line 163
    if-ne v4, v5, :cond_8

    .line 164
    .line 165
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_9
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    iput v5, v0, La/umv;->k:I

    .line 181
    .line 182
    invoke-virtual {v2, p0, v0}, La/pbt;->k(ZLa/zje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-ne p0, p1, :cond_a

    .line 187
    .line 188
    move-object v6, p1

    .line 189
    goto :goto_6

    .line 190
    :cond_a
    :goto_4
    check-cast p0, Ljava/lang/Iterable;

    .line 191
    .line 192
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_c

    .line 201
    .line 202
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    move-object v0, p1

    .line 207
    check-cast v0, La/rq60;

    .line 208
    .line 209
    sget-object v1, La/d270;->b:La/evz;

    .line 210
    .line 211
    iget v0, v0, La/rq60;->a:I

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static {v0}, La/evz;->c(I)La/d270;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    sget-object v1, La/d270;->e:La/d270;

    .line 221
    .line 222
    if-ne v0, v1, :cond_b

    .line 223
    .line 224
    move-object v6, p1

    .line 225
    :cond_c
    if-eqz v6, :cond_d

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_d
    const/4 v5, 0x0

    .line 229
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    :goto_6
    return-object v6

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
