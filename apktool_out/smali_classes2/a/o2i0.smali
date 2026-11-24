.class public final La/o2i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/c5a;
.implements La/nvu0;


# static fields
.field public static final synthetic f:J

.field public static final synthetic g:I


# instance fields
.field public final a:Lkotlin/coroutines/CoroutineContext;

.field public b:Ljava/util/ArrayList;

.field public c:Ljava/lang/Object;

.field public d:I

.field public e:Ljava/lang/Object;

.field private volatile synthetic state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, La/o2i0;

    .line 4
    .line 5
    const-string v2, "state$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, La/o2i0;->f:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/o2i0;->a:Lkotlin/coroutines/CoroutineContext;

    .line 5
    .line 6
    sget-object p1, La/p2i0;->a:La/pfw;

    .line 7
    .line 8
    iput-object p1, p0, La/o2i0;->state$volatile:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/o2i0;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    iput p1, p0, La/o2i0;->d:I

    .line 20
    .line 21
    sget-object p1, La/p2i0;->d:La/pfw;

    .line 22
    .line 23
    iput-object p1, p0, La/o2i0;->e:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public static d(La/o2i0;La/bnn0;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, La;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, La/o2i0;->f:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v0, v0, La/m2i0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/o2i0;->c(La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, La/o2i0;->e(La/zje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public final a(La/wvh0;I)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o2i0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iput p2, p0, La/o2i0;->d:I

    .line 4
    .line 5
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    :goto_0
    sget-object p1, La;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v0, La/o2i0;->f:J

    .line 4
    .line 5
    invoke-virtual {p1, p0, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    sget-object p1, La/p2i0;->b:La/pfw;

    .line 10
    .line 11
    if-ne v6, p1, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    :goto_1
    sget-object v2, La;->a:Lsun/misc/Unsafe;

    .line 15
    .line 16
    sget-wide v4, La/o2i0;->f:J

    .line 17
    .line 18
    sget-object v7, La/p2i0;->c:La/pfw;

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_3

    .line 26
    .line 27
    iget-object p0, v3, La/o2i0;->b:Ljava/util/ArrayList;

    .line 28
    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    :goto_2
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/m2i0;

    .line 47
    .line 48
    invoke-virtual {p1}, La/m2i0;->a()V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_2
    sget-object p0, La/p2i0;->d:La/pfw;

    .line 53
    .line 54
    iput-object p0, v3, La/o2i0;->e:Ljava/lang/Object;

    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    iput-object p0, v3, La/o2i0;->b:Ljava/util/ArrayList;

    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    invoke-virtual {v2, v3, v0, v1}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eq p0, v6, :cond_4

    .line 65
    .line 66
    move-object p0, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    move-object p0, v3

    .line 69
    goto :goto_1
.end method

.method public final c(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, La/o2i0;->f:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast v0, La/m2i0;

    .line 13
    .line 14
    iget-object v3, v0, La/m2i0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v4, p0, La/o2i0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v5, p0, La/o2i0;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    check-cast v6, La/m2i0;

    .line 38
    .line 39
    if-eq v6, v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v6}, La/m2i0;->a()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    sget-object v5, La/p2i0;->b:La/pfw;

    .line 46
    .line 47
    sget-object v6, La;->a:Lsun/misc/Unsafe;

    .line 48
    .line 49
    invoke-virtual {v6, p0, v1, v2, v5}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v1, La/p2i0;->d:La/pfw;

    .line 53
    .line 54
    iput-object v1, p0, La/o2i0;->e:Ljava/lang/Object;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    iput-object v1, p0, La/o2i0;->b:Ljava/util/ArrayList;

    .line 58
    .line 59
    :goto_1
    iget-object p0, v0, La/m2i0;->c:La/xdr;

    .line 60
    .line 61
    iget-object v1, v0, La/m2i0;->a:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-interface {p0, v1, v3, v4}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    iget-object v0, v0, La/m2i0;->e:La/bnn0;

    .line 68
    .line 69
    sget-object v1, La/p2i0;->e:La/pfw;

    .line 70
    .line 71
    if-ne v3, v1, :cond_3

    .line 72
    .line 73
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 74
    .line 75
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_3
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 81
    .line 82
    invoke-interface {v0, p0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 14

    .line 1
    instance-of v2, p1, La/n2i0;

    .line 2
    .line 3
    if-eqz v2, :cond_0

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    check-cast v2, La/n2i0;

    .line 7
    .line 8
    iget v3, v2, La/n2i0;->k:I

    .line 9
    .line 10
    const/high16 v4, -0x80000000

    .line 11
    .line 12
    and-int v5, v3, v4

    .line 13
    .line 14
    if-eqz v5, :cond_0

    .line 15
    .line 16
    sub-int/2addr v3, v4

    .line 17
    iput v3, v2, La/n2i0;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v2

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v2, La/n2i0;

    .line 22
    .line 23
    invoke-direct {v2, p0, p1}, La/n2i0;-><init>(La/o2i0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, v6, La/n2i0;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v7, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v6, La/n2i0;->k:I

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x2

    .line 35
    const/4 v10, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v10, :cond_2

    .line 39
    .line 40
    if-ne v2, v9, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v8

    .line 52
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput v10, v6, La/n2i0;->k:I

    .line 61
    .line 62
    new-instance v5, La/n5a;

    .line 63
    .line 64
    invoke-static {v6}, La/pnx;->b(La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {v5, v10, v0}, La/n5a;-><init>(ILa/yje;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, La/n5a;->r()V

    .line 72
    .line 73
    .line 74
    :goto_2
    sget-object v0, La;->a:Lsun/misc/Unsafe;

    .line 75
    .line 76
    sget-wide v11, La/o2i0;->f:J

    .line 77
    .line 78
    invoke-virtual {v0, p0, v11, v12}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    move-object v0, v5

    .line 83
    sget-object v5, La/p2i0;->a:La/pfw;

    .line 84
    .line 85
    if-ne v4, v5, :cond_6

    .line 86
    .line 87
    move-object v5, v0

    .line 88
    :goto_3
    sget-object v0, La;->a:Lsun/misc/Unsafe;

    .line 89
    .line 90
    sget-wide v2, La/o2i0;->f:J

    .line 91
    .line 92
    move-object v1, p0

    .line 93
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    move-object v13, v5

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    invoke-virtual {v13, p0}, La/n5a;->u(La/j660;)V

    .line 101
    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_4
    invoke-virtual {v0, p0, v11, v12}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eq v0, v4, :cond_5

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_5
    move-object v5, v13

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    move-object v13, v0

    .line 114
    instance-of v0, v4, Ljava/util/List;

    .line 115
    .line 116
    if-eqz v0, :cond_a

    .line 117
    .line 118
    :cond_7
    sget-object v0, La;->a:Lsun/misc/Unsafe;

    .line 119
    .line 120
    sget-wide v2, La/o2i0;->f:J

    .line 121
    .line 122
    move-object v1, p0

    .line 123
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_8

    .line 128
    .line 129
    check-cast v4, Ljava/lang/Iterable;

    .line 130
    .line 131
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_9

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {p0, v2}, La/o2i0;->f(Ljava/lang/Object;)La/m2i0;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iput-object v8, v2, La/m2i0;->g:Ljava/lang/Object;

    .line 153
    .line 154
    const/4 v3, -0x1

    .line 155
    iput v3, v2, La/m2i0;->h:I

    .line 156
    .line 157
    invoke-virtual {p0, v2, v10}, La/o2i0;->h(La/m2i0;Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_8
    invoke-virtual {v0, p0, v11, v12}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eq v0, v4, :cond_7

    .line 166
    .line 167
    :cond_9
    :goto_5
    move-object v5, v13

    .line 168
    goto :goto_2

    .line 169
    :cond_a
    instance-of v0, v4, La/m2i0;

    .line 170
    .line 171
    if-eqz v0, :cond_f

    .line 172
    .line 173
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    check-cast v4, La/m2i0;

    .line 176
    .line 177
    iget-object v2, p0, La/o2i0;->e:Ljava/lang/Object;

    .line 178
    .line 179
    iget-object v3, v4, La/m2i0;->f:La/xdr;

    .line 180
    .line 181
    if-eqz v3, :cond_b

    .line 182
    .line 183
    iget-object v4, v4, La/m2i0;->d:Ljava/lang/Object;

    .line 184
    .line 185
    invoke-interface {v3, p0, v4, v2}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move-object v8, v2

    .line 190
    check-cast v8, La/xdr;

    .line 191
    .line 192
    :cond_b
    invoke-virtual {v13, v0, v8}, La/n5a;->v(Ljava/lang/Object;La/xdr;)V

    .line 193
    .line 194
    .line 195
    :goto_6
    invoke-virtual {v13}, La/n5a;->p()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sget-object v2, La/wne;->a:La/wne;

    .line 200
    .line 201
    if-ne v0, v2, :cond_c

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    :goto_7
    if-ne v0, v7, :cond_d

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_d
    :goto_8
    iput v9, v6, La/n2i0;->k:I

    .line 210
    .line 211
    invoke-virtual {p0, v6}, La/o2i0;->c(La/zje;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-ne v0, v7, :cond_e

    .line 216
    .line 217
    :goto_9
    return-object v7

    .line 218
    :cond_e
    return-object v0

    .line 219
    :cond_f
    const-string v0, "unexpected state: "

    .line 220
    .line 221
    invoke-static {v4, v0}, La/udk;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-object v8
.end method

.method public final f(Ljava/lang/Object;)La/m2i0;
    .locals 3

    .line 1
    iget-object p0, p0, La/o2i0;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, La/m2i0;

    .line 23
    .line 24
    iget-object v2, v2, La/m2i0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    if-ne v2, p1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-object v1, v0

    .line 30
    :goto_0
    check-cast v1, La/m2i0;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_3
    const-string p0, "Clause with object "

    .line 36
    .line 37
    const-string v1, " is not found"

    .line 38
    .line 39
    invoke-static {p1, v1, p0}, La/c99;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public final g(La/i1i0;Lkotlin/jvm/functions/Function2;)V
    .locals 8

    .line 1
    new-instance v0, La/m2i0;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    check-cast v1, La/n660;

    .line 5
    .line 6
    iget-object v2, v1, La/n660;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, La/n660;

    .line 9
    .line 10
    iget-object v1, p1, La/n660;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, La/xdr;

    .line 14
    .line 15
    iget-object v1, p1, La/n660;->c:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v1

    .line 18
    check-cast v4, La/xdr;

    .line 19
    .line 20
    iget-object p1, p1, La/n660;->d:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v7, p1

    .line 23
    check-cast v7, La/xdr;

    .line 24
    .line 25
    move-object v6, p2

    .line 26
    check-cast v6, La/bnn0;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    move-object v1, p0

    .line 30
    invoke-direct/range {v0 .. v7}, La/m2i0;-><init>(La/o2i0;Ljava/lang/Object;La/xdr;La/xdr;Ljava/lang/Object;La/bnn0;La/xdr;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    invoke-virtual {v1, v0, p0}, La/o2i0;->h(La/m2i0;Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final h(La/m2i0;Z)V
    .locals 5

    .line 1
    iget-object v0, p1, La/m2i0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, La;->a:Lsun/misc/Unsafe;

    .line 4
    .line 5
    sget-wide v2, La/o2i0;->f:J

    .line 6
    .line 7
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v1, v1, La/m2i0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-nez p2, :cond_3

    .line 17
    .line 18
    iget-object v1, p0, La/o2i0;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, La/m2i0;

    .line 45
    .line 46
    iget-object v4, v4, La/m2i0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    if-eq v4, v0, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const-string p0, "Cannot use select clauses on the same object: "

    .line 52
    .line 53
    invoke-static {v0, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    :goto_1
    iget-object v1, p1, La/m2i0;->b:La/xdr;

    .line 58
    .line 59
    iget-object v4, p1, La/m2i0;->d:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-interface {v1, v0, p0, v4}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, La/o2i0;->e:Ljava/lang/Object;

    .line 65
    .line 66
    sget-object v1, La/p2i0;->d:La/pfw;

    .line 67
    .line 68
    if-ne v0, v1, :cond_5

    .line 69
    .line 70
    if-nez p2, :cond_4

    .line 71
    .line 72
    iget-object p2, p0, La/o2i0;->b:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object p2, p0, La/o2i0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p2, p1, La/m2i0;->g:Ljava/lang/Object;

    .line 83
    .line 84
    iget p2, p0, La/o2i0;->d:I

    .line 85
    .line 86
    iput p2, p1, La/m2i0;->h:I

    .line 87
    .line 88
    const/4 p1, 0x0

    .line 89
    iput-object p1, p0, La/o2i0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    const/4 p1, -0x1

    .line 92
    iput p1, p0, La/o2i0;->d:I

    .line 93
    .line 94
    return-void

    .line 95
    :cond_5
    sget-object p2, La;->a:Lsun/misc/Unsafe;

    .line 96
    .line 97
    invoke-virtual {p2, p0, v2, v3, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/o2i0;->j(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 11

    .line 1
    :goto_0
    sget-object v0, La;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, La/o2i0;->f:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    instance-of v0, v7, La/m5a;

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v10, 0x2

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/o2i0;->f(Ljava/lang/Object;)La/m2i0;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    if-nez v8, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v8, La/m2i0;->f:La/xdr;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v3, v8, La/m2i0;->d:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {v0, p0, v3, p2}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/xdr;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_1
    sget-object v3, La;->a:Lsun/misc/Unsafe;

    .line 37
    .line 38
    sget-wide v5, La/o2i0;->f:J

    .line 39
    .line 40
    move-object v4, p0

    .line 41
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    check-cast v7, La/m5a;

    .line 48
    .line 49
    iput-object p2, v4, La/o2i0;->e:Ljava/lang/Object;

    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    invoke-interface {v7, p0, v0}, La/m5a;->b(Ljava/lang/Object;La/xdr;)La/pfw;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    sget-object p0, La/p2i0;->d:La/pfw;

    .line 60
    .line 61
    iput-object p0, v4, La/o2i0;->e:Ljava/lang/Object;

    .line 62
    .line 63
    return v10

    .line 64
    :cond_2
    invoke-interface {v7, p0}, La/m5a;->w(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return v9

    .line 68
    :cond_3
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eq p0, v7, :cond_4

    .line 73
    .line 74
    :goto_2
    move-object p0, v4

    .line 75
    goto :goto_0

    .line 76
    :cond_4
    move-object p0, v4

    .line 77
    goto :goto_1

    .line 78
    :cond_5
    move-object v4, p0

    .line 79
    sget-object p0, La/p2i0;->b:La/pfw;

    .line 80
    .line 81
    invoke-static {v7, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_e

    .line 86
    .line 87
    instance-of p0, v7, La/m2i0;

    .line 88
    .line 89
    if-eqz p0, :cond_6

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_6
    sget-object p0, La/p2i0;->c:La/pfw;

    .line 93
    .line 94
    invoke-static {v7, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_7

    .line 99
    .line 100
    return v10

    .line 101
    :cond_7
    sget-object p0, La/p2i0;->a:La/pfw;

    .line 102
    .line 103
    invoke-static {v7, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_a

    .line 108
    .line 109
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    :cond_8
    sget-object v3, La;->a:Lsun/misc/Unsafe;

    .line 114
    .line 115
    sget-wide v5, La/o2i0;->f:J

    .line 116
    .line 117
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_9

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_9
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-eq p0, v7, :cond_8

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_a
    instance-of p0, v7, Ljava/util/List;

    .line 132
    .line 133
    if-eqz p0, :cond_d

    .line 134
    .line 135
    move-object p0, v7

    .line 136
    check-cast p0, Ljava/util/Collection;

    .line 137
    .line 138
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    :cond_b
    sget-object v3, La;->a:Lsun/misc/Unsafe;

    .line 143
    .line 144
    sget-wide v5, La/o2i0;->f:J

    .line 145
    .line 146
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-eqz p0, :cond_c

    .line 151
    .line 152
    :goto_3
    const/4 p0, 0x1

    .line 153
    return p0

    .line 154
    :cond_c
    invoke-virtual {v3, v4, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-eq p0, v7, :cond_b

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_d
    const-string p0, "Unexpected state: "

    .line 162
    .line 163
    invoke-static {v7, p0}, La/udk;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return v9

    .line 167
    :cond_e
    :goto_4
    const/4 p0, 0x3

    .line 168
    return p0
.end method
