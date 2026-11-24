.class public final La/c5k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kuc;
.implements La/n1x;
.implements La/hih0;


# static fields
.field public static final c:La/c5k;

.field public static final d:[I


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, La/tm80;

    .line 13
    .line 14
    invoke-direct {v2, v1, v1}, La/tm80;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/tm80;

    .line 18
    .line 19
    invoke-direct {v1, v0, v0}, La/tm80;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, La/c5k;

    .line 23
    .line 24
    invoke-direct {v0, v2, v1}, La/c5k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/c5k;->c:La/c5k;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    const/4 v1, 0x2

    .line 31
    filled-new-array {v0, v0, v1}, [I

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, La/c5k;->d:[I

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/fuj0;

    .line 8
    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    invoke-direct {p1, v0}, La/fuj0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance p1, La/xr;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-direct {p1, v0}, La/xr;-><init>(B)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/c5k;->b:Ljava/lang/Object;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance p1, La/or30;

    .line 29
    .line 30
    invoke-direct {p1}, La/or30;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p1, La/or30;

    .line 36
    .line 37
    invoke-direct {p1}, La/or30;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/c5k;->b:Ljava/lang/Object;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    const/16 v0, 0x15

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 45
    new-instance p1, La/zo4;

    invoke-direct {p1, p0, v0}, La/zo4;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/c5k;->b:Ljava/lang/Object;

    return-void

    .line 46
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 48
    new-instance p1, La/e8g;

    invoke-direct {p1, p0, v0}, La/e8g;-><init>(Ljava/lang/Object;B)V

    iput-object p1, p0, La/c5k;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/knf0;La/gii0;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 51
    new-instance p1, La/sza;

    const/16 v0, 0x13

    invoke-direct {p1, p2, v0}, La/sza;-><init>(La/gii0;B)V

    iput-object p1, p0, La/c5k;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/thy;La/ijq;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    iput-object p2, p0, La/c5k;->b:Ljava/lang/Object;

    .line 57
    iget p0, p2, La/ijq;->b:I

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    .line 58
    iget p0, p2, La/ijq;->c:I

    if-ne p0, p1, :cond_0

    return-void

    .line 59
    :cond_0
    const-string p0, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but "

    const-string p1, " was passed"

    .line 60
    invoke-static {p0, p2, p1}, La/rw2;->l(Ljava/lang/String;La/ijq;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 61
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 55
    iput-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    iput-object p2, p0, La/c5k;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 54
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, La/c5k;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    :try_start_0
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/xzp;

    .line 8
    .line 9
    new-instance v1, Ljava/io/File;

    .line 10
    .line 11
    iget-object p0, p0, La/xzp;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/io/File;

    .line 14
    .line 15
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string v1, "Error creating marker: "

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FirebaseCrashlytics"

    .line 30
    .line 31
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public b(IILa/p68;)La/i0g0;
    .locals 12

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, La/c5k;->d:[I

    .line 6
    .line 7
    invoke-static {p3, p2, v2, v3, v1}, La/n2t0;->l(La/p68;IZ[I[I)[I

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :try_start_0
    iget-object v1, p0, La/c5k;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/xr;

    .line 14
    .line 15
    invoke-virtual {v1, p1, p3, p2}, La/xr;->e(ILa/p68;[I)La/i0g0;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catch La/sae0; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p0

    .line 20
    :catch_0
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/fuj0;

    .line 23
    .line 24
    iget-object v1, p0, La/fuj0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/fuj0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, [I

    .line 34
    .line 35
    aput v2, p0, v2

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    aput v2, p0, v3

    .line 39
    .line 40
    const/4 v4, 0x2

    .line 41
    aput v2, p0, v4

    .line 42
    .line 43
    aput v2, p0, v0

    .line 44
    .line 45
    iget v0, p3, La/p68;->b:I

    .line 46
    .line 47
    aget v5, p2, v3

    .line 48
    .line 49
    move v6, v2

    .line 50
    move v7, v6

    .line 51
    :goto_0
    if-ge v6, v4, :cond_3

    .line 52
    .line 53
    if-ge v5, v0, :cond_3

    .line 54
    .line 55
    sget-object v8, La/n2t0;->g:[[I

    .line 56
    .line 57
    invoke-static {p3, p0, v5, v8}, La/n2t0;->h(La/p68;[II[[I)I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    rem-int/lit8 v9, v8, 0xa

    .line 62
    .line 63
    add-int/lit8 v9, v9, 0x30

    .line 64
    .line 65
    int-to-char v9, v9

    .line 66
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    array-length v9, p0

    .line 70
    move v10, v2

    .line 71
    :goto_1
    if-ge v10, v9, :cond_0

    .line 72
    .line 73
    aget v11, p0, v10

    .line 74
    .line 75
    add-int/2addr v5, v11

    .line 76
    add-int/lit8 v10, v10, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_0
    const/16 v9, 0xa

    .line 80
    .line 81
    if-lt v8, v9, :cond_1

    .line 82
    .line 83
    rsub-int/lit8 v8, v6, 0x1

    .line 84
    .line 85
    shl-int v8, v3, v8

    .line 86
    .line 87
    or-int/2addr v7, v8

    .line 88
    :cond_1
    if-eq v6, v3, :cond_2

    .line 89
    .line 90
    invoke-virtual {p3, v5}, La/p68;->e(I)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-virtual {p3, v5}, La/p68;->f(I)I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-ne p0, v4, :cond_7

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    rem-int/lit8 p0, p0, 0x4

    .line 116
    .line 117
    if-ne p0, v7, :cond_6

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    const/4 v0, 0x0

    .line 128
    if-eq p3, v4, :cond_4

    .line 129
    .line 130
    move-object p3, v0

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    new-instance p3, Ljava/util/EnumMap;

    .line 133
    .line 134
    const-class v1, La/a3g0;

    .line 135
    .line 136
    invoke-direct {p3, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 137
    .line 138
    .line 139
    sget-object v1, La/a3g0;->f:La/a3g0;

    .line 140
    .line 141
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {p3, v1, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :goto_2
    new-instance v1, La/i0g0;

    .line 149
    .line 150
    new-instance v4, La/d3g0;

    .line 151
    .line 152
    aget v2, p2, v2

    .line 153
    .line 154
    aget p2, p2, v3

    .line 155
    .line 156
    add-int/2addr v2, p2

    .line 157
    int-to-float p2, v2

    .line 158
    const/high16 v2, 0x40000000    # 2.0f

    .line 159
    .line 160
    div-float/2addr p2, v2

    .line 161
    int-to-float p1, p1

    .line 162
    invoke-direct {v4, p2, p1}, La/d3g0;-><init>(FF)V

    .line 163
    .line 164
    .line 165
    new-instance p2, La/d3g0;

    .line 166
    .line 167
    int-to-float v2, v5

    .line 168
    invoke-direct {p2, v2, p1}, La/d3g0;-><init>(FF)V

    .line 169
    .line 170
    .line 171
    filled-new-array {v4, p2}, [La/d3g0;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    sget-object p2, La/ju5;->q:La/ju5;

    .line 176
    .line 177
    invoke-direct {v1, p0, v0, p1, p2}, La/i0g0;-><init>(Ljava/lang/String;[B[La/d3g0;La/ju5;)V

    .line 178
    .line 179
    .line 180
    if-eqz p3, :cond_5

    .line 181
    .line 182
    invoke-virtual {v1, p3}, La/i0g0;->a(Ljava/util/Map;)V

    .line 183
    .line 184
    .line 185
    :cond_5
    return-object v1

    .line 186
    :cond_6
    invoke-static {}, La/o660;->a()La/o660;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    throw p0

    .line 191
    :cond_7
    invoke-static {}, La/o660;->a()La/o660;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    throw p0
.end method

.method public c(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    return-object p1

    .line 30
    :cond_1
    return-object v1
.end method

.method public d(JLa/zje;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, La/c5k;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/h03;

    .line 8
    .line 9
    instance-of v3, v1, La/bn;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/bn;

    .line 15
    .line 16
    iget v4, v3, La/bn;->t:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/bn;->t:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, La/bn;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, La/bn;-><init>(La/c5k;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v3, La/bn;->r:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v5, v3, La/bn;->t:I

    .line 38
    .line 39
    const/4 v6, 0x3

    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v10, 0x1

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    if-eq v5, v10, :cond_3

    .line 46
    .line 47
    if-eq v5, v7, :cond_2

    .line 48
    .line 49
    if-ne v5, v6, :cond_1

    .line 50
    .line 51
    iget v0, v3, La/bn;->q:I

    .line 52
    .line 53
    iget v5, v3, La/bn;->p:I

    .line 54
    .line 55
    iget v8, v3, La/bn;->o:I

    .line 56
    .line 57
    iget-wide v11, v3, La/bn;->k:J

    .line 58
    .line 59
    iget-wide v13, v3, La/bn;->j:J

    .line 60
    .line 61
    iget-wide v6, v3, La/bn;->i:J

    .line 62
    .line 63
    iget-object v9, v3, La/bn;->n:Ljava/lang/Throwable;

    .line 64
    .line 65
    iget-object v15, v3, La/bn;->m:La/bn;

    .line 66
    .line 67
    iget-object v10, v3, La/bn;->l:La/c5k;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    move-object v1, v10

    .line 73
    move-wide v10, v11

    .line 74
    const/16 v16, 0x2

    .line 75
    .line 76
    move-object v12, v9

    .line 77
    move v9, v8

    .line 78
    move v8, v5

    .line 79
    move-wide v5, v6

    .line 80
    move-object v7, v15

    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto/16 :goto_12

    .line 85
    .line 86
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v8

    .line 92
    :cond_2
    iget v0, v3, La/bn;->q:I

    .line 93
    .line 94
    iget v5, v3, La/bn;->p:I

    .line 95
    .line 96
    iget v6, v3, La/bn;->o:I

    .line 97
    .line 98
    iget-wide v7, v3, La/bn;->k:J

    .line 99
    .line 100
    iget-wide v9, v3, La/bn;->j:J

    .line 101
    .line 102
    iget-wide v11, v3, La/bn;->i:J

    .line 103
    .line 104
    iget-object v13, v3, La/bn;->n:Ljava/lang/Throwable;

    .line 105
    .line 106
    iget-object v14, v3, La/bn;->m:La/bn;

    .line 107
    .line 108
    iget-object v15, v3, La/bn;->l:La/c5k;

    .line 109
    .line 110
    :try_start_1
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    .line 113
    move-object v1, v15

    .line 114
    move-wide/from16 v20, v7

    .line 115
    .line 116
    move v8, v5

    .line 117
    move-object v7, v14

    .line 118
    move-wide/from16 v22, v9

    .line 119
    .line 120
    move v9, v6

    .line 121
    move-wide v5, v11

    .line 122
    move-object v12, v13

    .line 123
    move-wide/from16 v10, v20

    .line 124
    .line 125
    move-wide/from16 v13, v22

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    iget v5, v3, La/bn;->p:I

    .line 129
    .line 130
    iget v6, v3, La/bn;->o:I

    .line 131
    .line 132
    iget-wide v7, v3, La/bn;->k:J

    .line 133
    .line 134
    iget-wide v9, v3, La/bn;->j:J

    .line 135
    .line 136
    iget-wide v11, v3, La/bn;->i:J

    .line 137
    .line 138
    iget-object v13, v3, La/bn;->n:Ljava/lang/Throwable;

    .line 139
    .line 140
    iget-object v14, v3, La/bn;->m:La/bn;

    .line 141
    .line 142
    iget-object v15, v3, La/bn;->l:La/c5k;

    .line 143
    .line 144
    :try_start_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 145
    .line 146
    .line 147
    move-object v0, v1

    .line 148
    const/4 v1, 0x1

    .line 149
    goto/16 :goto_3

    .line 150
    .line 151
    :catchall_1
    move-exception v0

    .line 152
    move-object v1, v15

    .line 153
    move-wide/from16 v20, v11

    .line 154
    .line 155
    move-object v12, v0

    .line 156
    move-object v0, v13

    .line 157
    move-wide/from16 v22, v7

    .line 158
    .line 159
    move v8, v5

    .line 160
    move-object v7, v14

    .line 161
    move-wide v13, v9

    .line 162
    move v9, v6

    .line 163
    move-wide/from16 v10, v22

    .line 164
    .line 165
    move-wide/from16 v5, v20

    .line 166
    .line 167
    goto/16 :goto_c

    .line 168
    .line 169
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v1, v2, La/h03;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v1, Ljava/util/List;

    .line 175
    .line 176
    if-eqz v1, :cond_6

    .line 177
    .line 178
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-nez v5, :cond_5

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    move-object v1, v8

    .line 186
    :goto_1
    if-eqz v1, :cond_6

    .line 187
    .line 188
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 189
    .line 190
    return-object v1

    .line 191
    :cond_6
    :try_start_3
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 192
    .line 193
    sget-wide v5, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 194
    .line 195
    const-wide/16 v9, 0x3

    .line 196
    .line 197
    move-object v1, v0

    .line 198
    move-object v7, v3

    .line 199
    move-object v12, v8

    .line 200
    move-wide v13, v9

    .line 201
    const/4 v0, 0x1

    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v9, 0x0

    .line 204
    move-wide v10, v5

    .line 205
    move-wide/from16 v5, p1

    .line 206
    .line 207
    :goto_2
    if-eqz v0, :cond_15

    .line 208
    .line 209
    :try_start_4
    iget-object v15, v1, La/c5k;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v15, La/wsf0;

    .line 212
    .line 213
    iput-object v1, v3, La/bn;->l:La/c5k;

    .line 214
    .line 215
    iput-object v7, v3, La/bn;->m:La/bn;

    .line 216
    .line 217
    iput-object v12, v3, La/bn;->n:Ljava/lang/Throwable;

    .line 218
    .line 219
    iput-wide v5, v3, La/bn;->i:J

    .line 220
    .line 221
    iput-wide v13, v3, La/bn;->j:J

    .line 222
    .line 223
    iput-wide v10, v3, La/bn;->k:J

    .line 224
    .line 225
    iput v9, v3, La/bn;->o:I

    .line 226
    .line 227
    iput v8, v3, La/bn;->p:I

    .line 228
    .line 229
    iput v0, v3, La/bn;->q:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 230
    .line 231
    move-object/from16 p0, v1

    .line 232
    .line 233
    const/4 v1, 0x1

    .line 234
    :try_start_5
    iput v1, v3, La/bn;->t:I

    .line 235
    .line 236
    invoke-virtual {v15, v5, v6, v3}, La/wsf0;->e(JLa/zje;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 240
    if-ne v0, v4, :cond_7

    .line 241
    .line 242
    goto/16 :goto_11

    .line 243
    .line 244
    :cond_7
    move-object/from16 v15, p0

    .line 245
    .line 246
    move-wide/from16 v20, v13

    .line 247
    .line 248
    move-object v14, v7

    .line 249
    move-object v13, v12

    .line 250
    move-wide/from16 v22, v5

    .line 251
    .line 252
    move v5, v8

    .line 253
    move v6, v9

    .line 254
    move-wide v7, v10

    .line 255
    move-wide/from16 v9, v20

    .line 256
    .line 257
    move-wide/from16 v11, v22

    .line 258
    .line 259
    :goto_3
    :try_start_6
    check-cast v0, Ljava/lang/Iterable;

    .line 260
    .line 261
    new-instance v1, Ljava/util/ArrayList;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 262
    .line 263
    move-object/from16 p0, v3

    .line 264
    .line 265
    const/16 v3, 0xa

    .line 266
    .line 267
    :try_start_7
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    if-eqz v3, :cond_a

    .line 283
    .line 284
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    check-cast v3, La/em;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 289
    .line 290
    :try_start_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-object/from16 p1, v0

    .line 294
    .line 295
    new-instance v0, La/bm;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 296
    .line 297
    move/from16 p2, v5

    .line 298
    .line 299
    :try_start_9
    iget-object v5, v3, La/em;->a:Ljava/lang/Long;

    .line 300
    .line 301
    if-eqz v5, :cond_8

    .line 302
    .line 303
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 304
    .line 305
    .line 306
    move-result-wide v17
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 307
    :goto_5
    move/from16 v19, v6

    .line 308
    .line 309
    move-wide/from16 v5, v17

    .line 310
    .line 311
    move-wide/from16 v17, v7

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :catchall_2
    move-exception v0

    .line 315
    goto :goto_9

    .line 316
    :cond_8
    const-wide/16 v17, 0x0

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :goto_6
    :try_start_a
    iget-object v7, v3, La/em;->b:Ljava/lang/String;

    .line 320
    .line 321
    if-nez v7, :cond_9

    .line 322
    .line 323
    const-string v7, ""

    .line 324
    .line 325
    :cond_9
    iget-object v3, v3, La/em;->c:Ljava/lang/String;

    .line 326
    .line 327
    invoke-static {v3}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-direct {v0, v5, v6, v7, v3}, La/bm;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-object/from16 v0, p1

    .line 338
    .line 339
    move/from16 v5, p2

    .line 340
    .line 341
    move-wide/from16 v7, v17

    .line 342
    .line 343
    move/from16 v6, v19

    .line 344
    .line 345
    goto :goto_4

    .line 346
    :catchall_3
    move-exception v0

    .line 347
    :goto_7
    move-object/from16 v3, p0

    .line 348
    .line 349
    :goto_8
    move/from16 v8, p2

    .line 350
    .line 351
    move-wide v5, v11

    .line 352
    move-object v7, v14

    .line 353
    move-object v1, v15

    .line 354
    move-object v12, v0

    .line 355
    move-object v0, v13

    .line 356
    move-wide v13, v9

    .line 357
    move-wide/from16 v10, v17

    .line 358
    .line 359
    move/from16 v9, v19

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :catchall_4
    move-exception v0

    .line 363
    move/from16 p2, v5

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :catchall_5
    move-exception v0

    .line 367
    move/from16 p2, v5

    .line 368
    .line 369
    :goto_9
    move/from16 v19, v6

    .line 370
    .line 371
    move-wide/from16 v17, v7

    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_a
    move/from16 p2, v5

    .line 375
    .line 376
    move/from16 v19, v6

    .line 377
    .line 378
    move-wide/from16 v17, v7

    .line 379
    .line 380
    new-instance v0, Ljava/util/ArrayList;

    .line 381
    .line 382
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    :cond_b
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    if-eqz v3, :cond_c

    .line 394
    .line 395
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    move-object v5, v3

    .line 400
    check-cast v5, La/bm;

    .line 401
    .line 402
    iget-object v5, v5, La/bm;->b:Ljava/lang/String;

    .line 403
    .line 404
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-lez v5, :cond_b

    .line 409
    .line 410
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 411
    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_c
    :try_start_b
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 415
    .line 416
    goto/16 :goto_13

    .line 417
    .line 418
    :catchall_6
    move-exception v0

    .line 419
    move-object/from16 p0, v3

    .line 420
    .line 421
    move/from16 p2, v5

    .line 422
    .line 423
    move/from16 v19, v6

    .line 424
    .line 425
    move-wide/from16 v17, v7

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :catchall_7
    move-exception v0

    .line 429
    :goto_b
    move-object v1, v12

    .line 430
    move-object v12, v0

    .line 431
    move-object v0, v1

    .line 432
    move-object/from16 v1, p0

    .line 433
    .line 434
    goto :goto_c

    .line 435
    :catchall_8
    move-exception v0

    .line 436
    move-object/from16 p0, v1

    .line 437
    .line 438
    goto :goto_b

    .line 439
    :goto_c
    invoke-static {v12}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 440
    .line 441
    .line 442
    move-result v15

    .line 443
    if-eqz v15, :cond_11

    .line 444
    .line 445
    if-nez v9, :cond_d

    .line 446
    .line 447
    new-instance v0, La/el50;

    .line 448
    .line 449
    invoke-direct {v0, v12}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 450
    .line 451
    .line 452
    move-object v12, v0

    .line 453
    :goto_d
    const/4 v0, 0x0

    .line 454
    goto/16 :goto_2

    .line 455
    .line 456
    :cond_d
    move/from16 p0, v9

    .line 457
    .line 458
    move-wide/from16 v17, v10

    .line 459
    .line 460
    int-to-long v9, v8

    .line 461
    cmp-long v9, v9, v13

    .line 462
    .line 463
    if-gez v9, :cond_e

    .line 464
    .line 465
    const/4 v9, 0x1

    .line 466
    goto :goto_e

    .line 467
    :cond_e
    const/4 v9, 0x0

    .line 468
    :goto_e
    add-int/lit8 v8, v8, 0x1

    .line 469
    .line 470
    if-eqz v9, :cond_f

    .line 471
    .line 472
    iput-object v1, v3, La/bn;->l:La/c5k;

    .line 473
    .line 474
    iput-object v7, v3, La/bn;->m:La/bn;

    .line 475
    .line 476
    iput-object v0, v3, La/bn;->n:Ljava/lang/Throwable;

    .line 477
    .line 478
    iput-wide v5, v3, La/bn;->i:J

    .line 479
    .line 480
    iput-wide v13, v3, La/bn;->j:J

    .line 481
    .line 482
    move-wide/from16 v10, v17

    .line 483
    .line 484
    iput-wide v10, v3, La/bn;->k:J

    .line 485
    .line 486
    move/from16 v15, p0

    .line 487
    .line 488
    iput v15, v3, La/bn;->o:I

    .line 489
    .line 490
    iput v8, v3, La/bn;->p:I

    .line 491
    .line 492
    iput v9, v3, La/bn;->q:I

    .line 493
    .line 494
    const/4 v12, 0x2

    .line 495
    iput v12, v3, La/bn;->t:I

    .line 496
    .line 497
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v12

    .line 501
    if-ne v12, v4, :cond_10

    .line 502
    .line 503
    goto :goto_11

    .line 504
    :cond_f
    move/from16 v15, p0

    .line 505
    .line 506
    move-wide/from16 v10, v17

    .line 507
    .line 508
    const/16 v16, 0x2

    .line 509
    .line 510
    new-instance v0, La/el50;

    .line 511
    .line 512
    invoke-direct {v0, v12}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 513
    .line 514
    .line 515
    :cond_10
    :goto_f
    move-object v12, v0

    .line 516
    move v0, v9

    .line 517
    move v9, v15

    .line 518
    goto/16 :goto_2

    .line 519
    .line 520
    :cond_11
    move v15, v9

    .line 521
    const/16 v16, 0x2

    .line 522
    .line 523
    invoke-static {v12}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 524
    .line 525
    .line 526
    move-result v9

    .line 527
    if-eqz v9, :cond_14

    .line 528
    .line 529
    move-wide/from16 v17, v10

    .line 530
    .line 531
    int-to-long v9, v8

    .line 532
    cmp-long v9, v9, v13

    .line 533
    .line 534
    if-gez v9, :cond_12

    .line 535
    .line 536
    const/4 v9, 0x1

    .line 537
    goto :goto_10

    .line 538
    :cond_12
    const/4 v9, 0x0

    .line 539
    :goto_10
    add-int/lit8 v8, v8, 0x1

    .line 540
    .line 541
    if-eqz v9, :cond_13

    .line 542
    .line 543
    iput-object v1, v3, La/bn;->l:La/c5k;

    .line 544
    .line 545
    iput-object v7, v3, La/bn;->m:La/bn;

    .line 546
    .line 547
    iput-object v0, v3, La/bn;->n:Ljava/lang/Throwable;

    .line 548
    .line 549
    iput-wide v5, v3, La/bn;->i:J

    .line 550
    .line 551
    iput-wide v13, v3, La/bn;->j:J

    .line 552
    .line 553
    move-wide/from16 v10, v17

    .line 554
    .line 555
    iput-wide v10, v3, La/bn;->k:J

    .line 556
    .line 557
    iput v15, v3, La/bn;->o:I

    .line 558
    .line 559
    iput v8, v3, La/bn;->p:I

    .line 560
    .line 561
    iput v9, v3, La/bn;->q:I

    .line 562
    .line 563
    const/4 v12, 0x3

    .line 564
    iput v12, v3, La/bn;->t:I

    .line 565
    .line 566
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v12

    .line 570
    if-ne v12, v4, :cond_10

    .line 571
    .line 572
    :goto_11
    return-object v4

    .line 573
    :cond_13
    move-wide/from16 v10, v17

    .line 574
    .line 575
    const/16 v17, 0x3

    .line 576
    .line 577
    new-instance v0, La/dag0;

    .line 578
    .line 579
    invoke-direct {v0, v12}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 580
    .line 581
    .line 582
    goto :goto_f

    .line 583
    :cond_14
    const/16 v17, 0x3

    .line 584
    .line 585
    invoke-static {v12}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 586
    .line 587
    .line 588
    move v9, v15

    .line 589
    goto/16 :goto_d

    .line 590
    .line 591
    :cond_15
    if-nez v12, :cond_16

    .line 592
    .line 593
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 594
    .line 595
    const-string v1, "Unexpected error"

    .line 596
    .line 597
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    throw v0

    .line 601
    :cond_16
    throw v12
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 602
    :goto_12
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 603
    .line 604
    new-instance v1, La/g0g0;

    .line 605
    .line 606
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 607
    .line 608
    .line 609
    move-object v0, v1

    .line 610
    :goto_13
    nop

    .line 611
    instance-of v1, v0, La/g0g0;

    .line 612
    .line 613
    if-nez v1, :cond_17

    .line 614
    .line 615
    move-object v1, v0

    .line 616
    check-cast v1, Ljava/util/List;

    .line 617
    .line 618
    iput-object v1, v2, La/h03;->b:Ljava/lang/Object;

    .line 619
    .line 620
    :cond_17
    return-object v0
.end method

.method public e(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/b1d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/b1d;

    .line 7
    .line 8
    iget v1, v0, La/b1d;->k:I

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
    iput v1, v0, La/b1d;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/b1d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/b1d;-><init>(La/c5k;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/b1d;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/b1d;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, La/a1d;

    .line 53
    .line 54
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/btt0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iput v4, v0, La/b1d;->k:I

    .line 63
    .line 64
    iget-object p1, p1, La/a1d;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/sza;

    .line 67
    .line 68
    invoke-virtual {p1}, La/sza;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, La/y0d;

    .line 73
    .line 74
    invoke-interface {p1, p0, v0}, La/y0d;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_1
    check-cast p1, La/q16;

    .line 82
    .line 83
    invoke-virtual {p1}, La/q16;->a()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, La/dwa;

    .line 88
    .line 89
    new-instance p1, La/awa;

    .line 90
    .line 91
    iget-object p0, p0, La/dwa;->a:Ljava/lang/Double;

    .line 92
    .line 93
    if-eqz p0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-direct {p1, v0, v1}, La/awa;-><init>(D)V

    .line 100
    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_4
    invoke-static {v3}, La/jf4;->k(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v3
.end method

.method public f()Landroid/content/ClipboardManager;
    .locals 2

    .line 1
    iget-object v0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/ClipboardManager;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    const-string v1, "clipboard"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, Landroid/content/ClipboardManager;

    .line 21
    .line 22
    iput-object v0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    return-object v0
.end method

.method public g(ILa/zje;Z)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/knf0;

    .line 4
    .line 5
    instance-of v1, p2, La/fce;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, La/fce;

    .line 11
    .line 12
    iget v2, v1, La/fce;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/fce;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, La/fce;

    .line 26
    .line 27
    invoke-direct {v1, p0, p2}, La/fce;-><init>(La/c5k;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object p2, v7, La/fce;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v7, La/fce;->k:I

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/psc;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iput v3, v7, La/fce;->k:I

    .line 68
    .line 69
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, La/sza;

    .line 72
    .line 73
    invoke-virtual {p0}, La/sza;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    move-object v2, p0

    .line 78
    check-cast v2, La/ybe;

    .line 79
    .line 80
    const/16 v3, 0x54d

    .line 81
    .line 82
    move v5, p1

    .line 83
    move v6, p3

    .line 84
    invoke-interface/range {v2 .. v7}, La/ybe;->a(ILjava/lang/String;IZLa/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-ne p2, v1, :cond_3

    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_3
    :goto_2
    check-cast p2, La/dx5;

    .line 92
    .line 93
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method

.method public h(La/o1x;La/hhn0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(ILa/zje;)Ljava/io/Serializable;
    .locals 9

    .line 1
    iget-object v0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/knf0;

    .line 4
    .line 5
    instance-of v1, p2, La/wzf;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, La/wzf;

    .line 11
    .line 12
    iget v2, v1, La/wzf;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/wzf;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, La/wzf;

    .line 26
    .line 27
    invoke-direct {v1, p0, p2}, La/wzf;-><init>(La/c5k;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object p2, v8, La/wzf;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v8, La/wzf;->k:I

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/sza;

    .line 59
    .line 60
    invoke-virtual {p0}, La/sza;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    move-object v2, p0

    .line 65
    check-cast v2, La/a0g;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    iput v3, v8, La/wzf;->k:I

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    const/16 v4, 0x54d

    .line 78
    .line 79
    const/16 v5, 0x16

    .line 80
    .line 81
    move v6, p1

    .line 82
    invoke-interface/range {v2 .. v8}, La/a0g;->a(IIIILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-ne p2, v1, :cond_3

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    :goto_2
    check-cast p2, La/dx5;

    .line 90
    .line 91
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ljava/lang/Iterable;

    .line 96
    .line 97
    new-instance p1, Ljava/util/ArrayList;

    .line 98
    .line 99
    const/16 p2, 0xa

    .line 100
    .line 101
    invoke-static {p0, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_4

    .line 117
    .line 118
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    check-cast p2, La/zzf;

    .line 123
    .line 124
    new-instance v0, La/vzf;

    .line 125
    .line 126
    invoke-direct {v0, p2}, La/vzf;-><init>(La/zzf;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    return-object p1
.end method

.method public j()La/lk5;
    .locals 2

    .line 1
    new-instance v0, La/lk5;

    .line 2
    .line 3
    iget-object v1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/epi0;

    .line 6
    .line 7
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/xzp;

    .line 10
    .line 11
    invoke-virtual {v1}, La/xzp;->C()La/r9u;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/iw20;

    .line 18
    .line 19
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La/uii;

    .line 22
    .line 23
    invoke-virtual {p0}, La/uii;->r()La/pru;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, v1, p0}, La/lk5;-><init>(La/r9u;La/pru;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public k(La/o1x;La/r1o;)V
    .locals 0

    .line 1
    iget-object p1, p0, La/c5k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, La/cgk0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/cgk0;->l()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/lit8 p0, p0, -0x1

    .line 18
    .line 19
    if-ge p2, p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, La/cgk0;->l()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    add-int/lit8 p0, p0, 0x1

    .line 26
    .line 27
    invoke-virtual {p1, p0}, La/cgk0;->m(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public l(La/zje;)Ljava/io/Serializable;
    .locals 13

    .line 1
    instance-of v0, p1, La/c1d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/c1d;

    .line 7
    .line 8
    iget v1, v0, La/c1d;->k:I

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
    iput v1, v0, La/c1d;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/c1d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/c1d;-><init>(La/c5k;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/c1d;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/c1d;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, La/a1d;

    .line 53
    .line 54
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/btt0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iput v4, v0, La/c1d;->k:I

    .line 63
    .line 64
    iget-object p1, p1, La/a1d;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/sza;

    .line 67
    .line 68
    invoke-virtual {p1}, La/sza;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, La/y0d;

    .line 73
    .line 74
    invoke-interface {p1, p0, v0}, La/y0d;->c(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    :goto_1
    check-cast p1, La/q16;

    .line 82
    .line 83
    invoke-virtual {p1}, La/q16;->a()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ljava/lang/Iterable;

    .line 88
    .line 89
    new-instance p1, Ljava/util/ArrayList;

    .line 90
    .line 91
    const/16 v0, 0xa

    .line 92
    .line 93
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_a

    .line 109
    .line 110
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/s2z;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v1, v0, La/s2z;->a:Ljava/lang/Long;

    .line 120
    .line 121
    if-eqz v1, :cond_9

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v6

    .line 127
    iget-object v1, v0, La/s2z;->b:Ljava/lang/Long;

    .line 128
    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v1

    .line 135
    :goto_3
    move-wide v8, v1

    .line 136
    goto :goto_4

    .line 137
    :cond_4
    const-wide/16 v1, 0x0

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :goto_4
    iget-object v1, v0, La/s2z;->c:Ljava/lang/Double;

    .line 141
    .line 142
    if-eqz v1, :cond_8

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 145
    .line 146
    .line 147
    move-result-wide v10

    .line 148
    iget-object v0, v0, La/s2z;->d:Ljava/lang/Integer;

    .line 149
    .line 150
    if-eqz v0, :cond_7

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    sget-object v1, La/a0t0;->a:La/sxs0;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    sget-object v1, La/a0t0;->b:La/a0t0;

    .line 162
    .line 163
    if-ne v0, v4, :cond_6

    .line 164
    .line 165
    :cond_5
    move-object v12, v1

    .line 166
    goto :goto_5

    .line 167
    :cond_6
    sget-object v2, La/a0t0;->c:La/a0t0;

    .line 168
    .line 169
    const/4 v5, -0x1

    .line 170
    if-ne v0, v5, :cond_5

    .line 171
    .line 172
    move-object v12, v2

    .line 173
    :goto_5
    new-instance v5, La/p2z;

    .line 174
    .line 175
    invoke-direct/range {v5 .. v12}, La/p2z;-><init>(JJDLa/a0t0;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_7
    invoke-static {v3}, La/jf4;->k(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-object v3

    .line 186
    :cond_8
    invoke-static {v3}, La/jf4;->k(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-object v3

    .line 190
    :cond_9
    invoke-static {v3}, La/jf4;->k(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-object v3

    .line 194
    :cond_a
    return-object p1
.end method

.method public m(La/iiy;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/c5k;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, La/ijq;

    .line 7
    .line 8
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/thy;

    .line 11
    .line 12
    invoke-interface {p0, p2}, La/giy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    iget p2, p1, La/ijq;->a:I

    .line 23
    .line 24
    ushr-int/2addr p0, p2

    .line 25
    iget p2, p1, La/ijq;->b:I

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    shl-int p2, v0, p2

    .line 29
    .line 30
    sub-int/2addr p2, v0

    .line 31
    and-int/2addr p0, p2

    .line 32
    iget p1, p1, La/ijq;->c:I

    .line 33
    .line 34
    if-ne p0, p1, :cond_0

    .line 35
    .line 36
    return v0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public n()La/eb8;
    .locals 12

    .line 1
    iget-object v0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/neu;

    .line 4
    .line 5
    invoke-virtual {v0}, La/neu;->b()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/m1u;

    .line 12
    .line 13
    iget-object p0, p0, La/m1u;->a:La/h7q;

    .line 14
    .line 15
    iget-object p0, p0, La/h7q;->c:La/q6q;

    .line 16
    .line 17
    iget v3, p0, La/q6q;->b:F

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    move-object p0, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(DD)D

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    :goto_1
    const-wide/16 v4, 0x0

    .line 71
    .line 72
    if-eqz p0, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 75
    .line 76
    .line 77
    move-result-wide v6

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move-wide v6, v4

    .line 80
    :goto_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-eqz v8, :cond_4

    .line 106
    .line 107
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    .line 114
    .line 115
    .line 116
    move-result-wide v8

    .line 117
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->min(DD)D

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    :goto_4
    if-eqz v1, :cond_5

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 129
    .line 130
    .line 131
    move-result-wide v4

    .line 132
    :cond_5
    new-instance v1, La/eb8;

    .line 133
    .line 134
    move-wide v10, v6

    .line 135
    move-wide v6, v4

    .line 136
    move-wide v4, v10

    .line 137
    invoke-direct/range {v1 .. v7}, La/eb8;-><init>(Ljava/util/List;FDD)V

    .line 138
    .line 139
    .line 140
    return-object v1
.end method

.method public o(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/z4c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/z4c;

    .line 7
    .line 8
    iget v1, v0, La/z4c;->l:I

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
    iput v1, v0, La/z4c;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/z4c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/z4c;-><init>(La/c5k;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/z4c;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/z4c;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p0, v0, La/z4c;->i:La/ts4;

    .line 51
    .line 52
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, La/c5k;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, La/ts4;

    .line 62
    .line 63
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, La/rou;

    .line 66
    .line 67
    iput-object p1, v0, La/z4c;->i:La/ts4;

    .line 68
    .line 69
    iput v5, v0, La/z4c;->l:I

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-virtual {p0, v2, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move-object v7, p1

    .line 80
    move-object p1, p0

    .line 81
    move-object p0, v7

    .line 82
    :goto_1
    check-cast p1, La/m2c0;

    .line 83
    .line 84
    iget-wide v5, p1, La/m2c0;->S:J

    .line 85
    .line 86
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object v3, v0, La/z4c;->i:La/ts4;

    .line 91
    .line 92
    iput v4, v0, La/z4c;->l:I

    .line 93
    .line 94
    sget-object v2, La/fg40;->a:[La/fg40;

    .line 95
    .line 96
    invoke-virtual {p0, p1, v0}, La/ts4;->h(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-ne p0, v1, :cond_5

    .line 101
    .line 102
    :goto_2
    return-object v1

    .line 103
    :cond_5
    return-object p0
.end method

.method public onQueryTextChange(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/aya;

    .line 7
    .line 8
    sget-object v0, La/aya;->S1:La/bj5;

    .line 9
    .line 10
    invoke-virtual {p0}, La/aya;->I0()La/yya;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, La/aya;->G0()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2, p1}, La/yya;->y(JLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 7
    .line 8
    invoke-static {p0}, La/j120;->X(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public p(Ljava/util/List;La/h9n0;La/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, La/b5k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/b5k;

    .line 7
    .line 8
    iget v1, v0, La/b5k;->l:I

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
    iput v1, v0, La/b5k;->l:I

    .line 18
    .line 19
    :goto_0
    move-object p3, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/b5k;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, La/b5k;-><init>(La/c5k;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p3, La/b5k;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p3, La/b5k;->l:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-eq v2, v3, :cond_1

    .line 40
    .line 41
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_1
    iget-object p0, p3, La/b5k;->i:La/zhi0;

    .line 49
    .line 50
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_2
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch La/zhi0; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_6

    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object p1, v0

    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iget-object v0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, La/kki;

    .line 67
    .line 68
    iput v4, p3, La/b5k;->l:I

    .line 69
    .line 70
    invoke-virtual {v0, p1, p2, p3}, La/kki;->c(Ljava/util/List;La/h9n0;La/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_1
    .catch La/zhi0; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    if-ne p0, v1, :cond_6

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :goto_2
    iget-boolean p2, p1, La/zhi0;->e:Z

    .line 78
    .line 79
    if-nez p2, :cond_6

    .line 80
    .line 81
    iput-object p1, p3, La/b5k;->i:La/zhi0;

    .line 82
    .line 83
    iput v3, p3, La/b5k;->l:I

    .line 84
    .line 85
    new-instance v4, La/y6h;

    .line 86
    .line 87
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v6, p0

    .line 90
    check-cast v6, La/m0o0;

    .line 91
    .line 92
    const/4 v10, 0x0

    .line 93
    const/16 v11, 0x10

    .line 94
    .line 95
    const/4 v5, 0x1

    .line 96
    const-class v7, La/m0o0;

    .line 97
    .line 98
    const-string v8, "updateFavoritesFromRemote"

    .line 99
    .line 100
    const-string v9, "updateFavoritesFromRemote(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 101
    .line 102
    invoke-direct/range {v4 .. v11}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 103
    .line 104
    .line 105
    const-class p0, La/c5k;

    .line 106
    .line 107
    invoke-static {v4, p0, p3}, La/iom0;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Class;La/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    sget-object p2, La/wne;->a:La/wne;

    .line 112
    .line 113
    if-ne p0, p2, :cond_4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_3
    if-ne p0, v1, :cond_5

    .line 119
    .line 120
    :goto_4
    return-object v1

    .line 121
    :cond_5
    move-object p0, p1

    .line 122
    :goto_5
    throw p0

    .line 123
    :cond_6
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0
.end method

.method public q()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/c5k;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/es;

    .line 6
    .line 7
    iget-object v1, v1, La/es;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/sln;

    .line 10
    .line 11
    iget-object v2, v1, La/sln;->b:La/p7m0;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v2, v3}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/iun;->a:La/iun;

    .line 18
    .line 19
    iput-object v2, v1, La/sln;->a:Ljava/util/List;

    .line 20
    .line 21
    iget-object v0, v0, La/c5k;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, La/vqc;

    .line 24
    .line 25
    iget-object v0, v0, La/vqc;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/u0f;

    .line 28
    .line 29
    iget-object v1, v0, La/u0f;->a:La/p7m0;

    .line 30
    .line 31
    new-instance v4, La/v0f;

    .line 32
    .line 33
    sget-object v6, La/q4f;->b:La/q4f;

    .line 34
    .line 35
    sget-object v12, La/ozc;->d:La/ozc;

    .line 36
    .line 37
    const-wide/16 v20, 0x0

    .line 38
    .line 39
    sget-object v22, La/mln;->a:La/mln;

    .line 40
    .line 41
    const-string v5, ""

    .line 42
    .line 43
    const-string v7, ""

    .line 44
    .line 45
    const-wide/16 v8, 0x0

    .line 46
    .line 47
    const-wide/16 v10, 0x0

    .line 48
    .line 49
    const-wide/16 v13, 0x0

    .line 50
    .line 51
    const-string v15, ""

    .line 52
    .line 53
    const-wide/16 v17, 0x0

    .line 54
    .line 55
    const/16 v19, 0x0

    .line 56
    .line 57
    move-object/from16 v16, v2

    .line 58
    .line 59
    invoke-direct/range {v4 .. v22}, La/v0f;-><init>(Ljava/lang/String;La/q4f;Ljava/lang/String;DDLa/ozc;DLjava/lang/String;Ljava/util/List;DZDLa/oln;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iput-object v6, v0, La/u0f;->b:La/q4f;

    .line 69
    .line 70
    return-void
.end method

.method public r(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;)Lkotlin/Unit;
    .locals 3

    .line 1
    iget-object v0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/qcq0;

    .line 4
    .line 5
    iget-object p0, p0, La/c5k;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/o5d0;

    .line 8
    .line 9
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/hardware/camera2/CameraManager;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, La/g0a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, "#openCamera"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :try_start_0
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v2, 0x1c

    .line 42
    .line 43
    if-lt v1, v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, La/qcq0;->j:La/n0o0;

    .line 49
    .line 50
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0, p1, v0, p2}, La/x6;->q(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v0}, La/qcq0;->a()Landroid/os/Handler;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0, p1, p2, v0}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 78
    .line 79
    .line 80
    throw p0
.end method

.method public s(DLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/d1d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/d1d;

    .line 7
    .line 8
    iget v1, v0, La/d1d;->k:I

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
    iput v1, v0, La/d1d;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d1d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/d1d;-><init>(La/c5k;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/d1d;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d1d;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p3, p0, La/c5k;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p3, La/a1d;

    .line 53
    .line 54
    iget-object p0, p0, La/c5k;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/btt0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v2, La/lhs0;

    .line 63
    .line 64
    invoke-direct {v2, p1, p2}, La/lhs0;-><init>(D)V

    .line 65
    .line 66
    .line 67
    iput v4, v0, La/d1d;->k:I

    .line 68
    .line 69
    iget-object p1, p3, La/a1d;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, La/sza;

    .line 72
    .line 73
    invoke-virtual {p1}, La/sza;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, La/y0d;

    .line 78
    .line 79
    invoke-interface {p1, p0, v2, v0}, La/y0d;->a(Ljava/lang/String;La/lhs0;La/yje;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    if-ne p3, v1, :cond_3

    .line 84
    .line 85
    return-object v1

    .line 86
    :cond_3
    :goto_1
    check-cast p3, La/q16;

    .line 87
    .line 88
    invoke-virtual {p3}, La/q16;->a()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/dwa;

    .line 93
    .line 94
    iget-object p0, p0, La/dwa;->a:Ljava/lang/Double;

    .line 95
    .line 96
    if-eqz p0, :cond_4

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 99
    .line 100
    .line 101
    move-result-wide p0

    .line 102
    new-instance p2, Ljava/lang/Double;

    .line 103
    .line 104
    invoke-direct {p2, p0, p1}, Ljava/lang/Double;-><init>(D)V

    .line 105
    .line 106
    .line 107
    return-object p2

    .line 108
    :cond_4
    invoke-static {v3}, La/jf4;->k(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v3
.end method
