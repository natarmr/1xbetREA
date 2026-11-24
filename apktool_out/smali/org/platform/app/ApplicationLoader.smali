.class public Lorg/platform/app/ApplicationLoader;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements La/zyk;
.implements La/xs00;
.implements La/ak3;
.implements La/vmv;
.implements La/af3;
.implements La/vsd;
.implements La/jhg0;
.implements La/rj3;
.implements La/q1e;
.implements La/n5k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00082\u00020\t2\u00020\n2\u00020\u000b2\u00020\u000c:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lorg/platform/app/ApplicationLoader;",
        "Landroid/app/Application;",
        "La/zyk;",
        "La/xs00;",
        "La/ak3;",
        "La/vmv;",
        "La/af3;",
        "La/vsd;",
        "",
        "La/jhg0;",
        "La/rj3;",
        "La/q1e;",
        "La/n5k0;",
        "<init>",
        "()V",
        "a/xf0",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final magic:I = 0x3

.field public static v1:Lorg/platform/app/ApplicationLoader;


# instance fields
.field public A:La/z7z;

.field public B:La/z7z;

.field public Y:La/z7z;

.field public final Z:La/sje;

.field public a:La/z7z;

.field public b:La/z7z;

.field public c:La/z7z;

.field public d:La/z7z;

.field public e:La/z7z;

.field public f:La/z7z;

.field public final f1:La/sje;

.field public g:La/z7z;

.field public final g1:La/sje;

.field public h:La/z7z;

.field public final h1:La/sje;

.field public i:La/z7z;

.field public final i1:La/n0o0;

.field public j:La/z7z;

.field public final j1:La/n0o0;

.field public k:La/z7z;

.field public final k1:La/n0o0;

.field public l:La/z7z;

.field public final l1:La/n0o0;

.field public m:La/z7z;

.field public final m1:La/n0o0;

.field public n:La/z7z;

.field public final n1:La/n0o0;

.field public o:La/z7z;

.field public final o1:La/n0o0;

.field public p:La/z7z;

.field public final p1:La/n0o0;

.field public q:La/z7z;

.field public final q1:La/n0o0;

.field public r:La/z7z;

.field public final r1:La/n0o0;

.field public s:La/z7z;

.field public final s1:La/n0o0;

.field public t:La/z7z;

.field public final t1:La/n0o0;

.field public u:La/z7z;

.field public final u1:La/n0o0;

.field public v:La/z7z;

.field public w:La/z7z;

.field public x:La/z7z;

.field public y:La/z7z;

.field public z:La/ejc;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/tvk;->a:La/rwj;

    .line 9
    .line 10
    sget-object v1, La/dvj;->c:La/dvj;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->Z:La/sje;

    .line 21
    .line 22
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->f1:La/sje;

    .line 35
    .line 36
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->g1:La/sje;

    .line 49
    .line 50
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, La/ys10;->a:La/vs10;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->h1:La/sje;

    .line 65
    .line 66
    new-instance v0, La/f33;

    .line 67
    .line 68
    const/16 v1, 0x1a

    .line 69
    .line 70
    invoke-direct {v0, v1}, La/f33;-><init>(B)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->i1:La/n0o0;

    .line 78
    .line 79
    new-instance v0, La/f33;

    .line 80
    .line 81
    const/16 v1, 0x1c

    .line 82
    .line 83
    invoke-direct {v0, v1}, La/f33;-><init>(B)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->j1:La/n0o0;

    .line 91
    .line 92
    new-instance v0, La/ds3;

    .line 93
    .line 94
    const/16 v1, 0xa

    .line 95
    .line 96
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->k1:La/n0o0;

    .line 104
    .line 105
    new-instance v0, La/ds3;

    .line 106
    .line 107
    const/16 v1, 0xb

    .line 108
    .line 109
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->l1:La/n0o0;

    .line 117
    .line 118
    new-instance v0, La/ds3;

    .line 119
    .line 120
    const/16 v1, 0xc

    .line 121
    .line 122
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 123
    .line 124
    .line 125
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->m1:La/n0o0;

    .line 130
    .line 131
    sput-object p0, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 132
    .line 133
    new-instance v0, La/ds3;

    .line 134
    .line 135
    const/16 v1, 0xd

    .line 136
    .line 137
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->n1:La/n0o0;

    .line 145
    .line 146
    new-instance v0, La/ds3;

    .line 147
    .line 148
    const/16 v1, 0xe

    .line 149
    .line 150
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 151
    .line 152
    .line 153
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->o1:La/n0o0;

    .line 158
    .line 159
    new-instance v0, La/ds3;

    .line 160
    .line 161
    const/4 v1, 0x0

    .line 162
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->p1:La/n0o0;

    .line 170
    .line 171
    new-instance v0, La/ds3;

    .line 172
    .line 173
    const/4 v1, 0x1

    .line 174
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->q1:La/n0o0;

    .line 182
    .line 183
    new-instance v0, La/ds3;

    .line 184
    .line 185
    const/4 v1, 0x2

    .line 186
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 187
    .line 188
    .line 189
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->r1:La/n0o0;

    .line 194
    .line 195
    new-instance v0, La/ds3;

    .line 196
    .line 197
    const/16 v1, 0x8

    .line 198
    .line 199
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 200
    .line 201
    .line 202
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->s1:La/n0o0;

    .line 207
    .line 208
    new-instance v0, La/ds3;

    .line 209
    .line 210
    const/16 v1, 0x9

    .line 211
    .line 212
    invoke-direct {v0, p0, v1}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 213
    .line 214
    .line 215
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->t1:La/n0o0;

    .line 220
    .line 221
    new-instance v0, La/f33;

    .line 222
    .line 223
    const/16 v1, 0x1b

    .line 224
    .line 225
    invoke-direct {v0, v1}, La/f33;-><init>(B)V

    .line 226
    .line 227
    .line 228
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->u1:La/n0o0;

    .line 233
    .line 234
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)La/gbe0;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/f7u;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/f7u;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v4, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v5, La/ds3;

    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    invoke-direct {v5, p0, v6}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 38
    .line 39
    .line 40
    new-instance p0, La/uk50;

    .line 41
    .line 42
    new-instance v6, La/pu50;

    .line 43
    .line 44
    const/16 v7, 0xb

    .line 45
    .line 46
    invoke-direct {v6, v5, v7}, La/pu50;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v6}, La/uk50;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 50
    .line 51
    .line 52
    const-class v5, La/aot0;

    .line 53
    .line 54
    sget-object v6, La/sre0;->a:La/tre0;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    new-instance v6, La/yw9;

    .line 61
    .line 62
    const/16 v7, 0x11

    .line 63
    .line 64
    invoke-direct {v6, p0, v5, v7}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    new-instance p0, La/s0d;

    .line 71
    .line 72
    invoke-direct {p0}, La/s0d;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    new-instance v5, La/ngd;

    .line 79
    .line 80
    invoke-static {p1}, La/aac;->e0(Ljava/util/List;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v1}, La/aac;->e0(Ljava/util/List;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-static {v2}, La/aac;->e0(Ljava/util/List;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-static {v3}, La/aac;->e0(Ljava/util/List;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-static {v4}, La/aac;->e0(Ljava/util/List;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-direct/range {v5 .. v10}, La/ngd;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    iput-object v5, v0, La/f7u;->d:Ljava/lang/Object;

    .line 104
    .line 105
    invoke-virtual {v0}, La/f7u;->b()La/gbe0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/content/res/Configuration;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v1

    .line 18
    :goto_0
    invoke-direct {v0, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 19
    .line 20
    .line 21
    iget v2, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 22
    .line 23
    const v3, 0x3f4ccccd    # 0.8f

    .line 24
    .line 25
    .line 26
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 27
    .line 28
    invoke-static {v2, v3, v4}, La/l1e0;->c(FFF)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iput v2, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    invoke-super {p0, v1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final b(La/uaq0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->d:La/z7z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/wyu;

    .line 11
    .line 12
    invoke-virtual {v0}, La/wyu;->a()La/uaq0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eq v0, p1, :cond_3

    .line 17
    .line 18
    iget-object p1, p0, Lorg/platform/app/ApplicationLoader;->m1:La/n0o0;

    .line 19
    .line 20
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/jvq;

    .line 25
    .line 26
    iget-object v0, v0, La/jvq;->c:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v1

    .line 38
    :goto_0
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, La/jvq;

    .line 43
    .line 44
    iget-object p1, p1, La/jvq;->b:Ljava/lang/ref/WeakReference;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, La/kxq;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object p1, v1

    .line 56
    :goto_1
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->f:La/z7z;

    .line 73
    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, La/dnt0;

    .line 81
    .line 82
    invoke-virtual {p0}, La/dnt0;->a()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    const-string p0, "updateThemeWorkersScenario"

    .line 87
    .line 88
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :cond_5
    const-string p0, "getThemeUseCase"

    .line 93
    .line 94
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v1
.end method

.method public final c()La/g8i;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->s1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/g8i;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d()La/wcf0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/g8i;->h7()La/wcf0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final e()V
    .locals 5

    .line 1
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "https://mob-experience.space"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iget-object v1, p0, Lorg/platform/app/ApplicationLoader;->t:La/z7z;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/o2z;

    .line 20
    .line 21
    iget-object v1, v1, La/o2z;->a:La/ieu;

    .line 22
    .line 23
    iget-object v1, v1, La/ieu;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, La/es00;

    .line 26
    .line 27
    iget-wide v1, v1, La/es00;->a:J

    .line 28
    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    cmp-long v1, v1, v3

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Lorg/platform/app/ApplicationLoader;->g(Z)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :cond_1
    const-string p0, "lastTimeUpdatedUseCase"

    .line 40
    .line 41
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    throw p0
.end method

.method public final f(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->i1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/tfq;

    .line 8
    .line 9
    iget-object v0, v0, La/tfq;->a:La/j8f;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, v0, La/j8f;->o:La/cu;

    .line 17
    .line 18
    iget-object v2, v2, La/cu;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, La/aaf;

    .line 21
    .line 22
    new-instance v3, La/b1;

    .line 23
    .line 24
    const/16 v4, 0x8

    .line 25
    .line 26
    const-string v5, "START_EXCEPTION"

    .line 27
    .line 28
    invoke-direct {v3, v0, v5, v1, v4}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, La/aaf;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/tfq;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, La/tfq;->c(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final g(Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->s:La/z7z;

    .line 2
    .line 3
    const-string v0, "localTimeDiffWorkerProvider"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ls00;

    .line 15
    .line 16
    invoke-virtual {p0}, La/ls00;->a()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v1

    .line 24
    :cond_1
    if-eqz p0, :cond_3

    .line 25
    .line 26
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/ls00;

    .line 31
    .line 32
    iget-object p1, p0, La/ls00;->c:La/sje;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-static {p1, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iput-object v1, p0, La/ls00;->c:La/sje;

    .line 40
    .line 41
    iget-object p0, p0, La/ls00;->a:La/us00;

    .line 42
    .line 43
    invoke-static {p0}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/cpv0;->b:La/wsd;

    .line 51
    .line 52
    iget-object p1, p1, La/wsd;->f:La/std;

    .line 53
    .line 54
    iget-object v0, p0, La/cpv0;->d:La/fpv0;

    .line 55
    .line 56
    iget-object v0, v0, La/fpv0;->a:La/xgi0;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v1, La/h5a;

    .line 62
    .line 63
    const-string v2, "LocalTimeDiffWorker"

    .line 64
    .line 65
    invoke-direct {v1, v2, p0}, La/h5a;-><init>(Ljava/lang/String;La/cpv0;)V

    .line 66
    .line 67
    .line 68
    const-string p0, "CancelWorkByName_LocalTimeDiffWorker"

    .line 69
    .line 70
    invoke-static {p1, p0, v0, v1}, La/r8x;->T(La/std;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)La/gqw0;

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v1
.end method

.method public final getRouter()La/i1w0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->z:La/ejc;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "cicerone"

    .line 9
    .line 10
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public final h()V
    .locals 14

    .line 1
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->n:La/z7z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/sue;

    .line 11
    .line 12
    invoke-interface {v0}, La/sue;->t()La/q4a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/q4a;->a:La/v6j0;

    .line 17
    .line 18
    iget-object v0, v0, La/v6j0;->a:La/q7d0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v3, "COUPON_CAN_START_NOTIFY_WORKER"

    .line 26
    .line 27
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v0, La/hl50;

    .line 48
    .line 49
    sget-object v0, La/sl50;->a:La/sl50;

    .line 50
    .line 51
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 54
    .line 55
    .line 56
    sget-object v4, La/sl50;->a:La/sl50;

    .line 57
    .line 58
    new-instance v3, La/hl50;

    .line 59
    .line 60
    invoke-direct {v3, v1}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v13

    .line 67
    new-instance v2, La/o4e;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const-wide/16 v9, -0x1

    .line 74
    .line 75
    move-wide v11, v9

    .line 76
    invoke-direct/range {v2 .. v13}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 77
    .line 78
    .line 79
    sget-object v0, La/zko;->a:La/zko;

    .line 80
    .line 81
    new-instance v1, La/xl60;

    .line 82
    .line 83
    const-class v3, Lorg/xplatform/coupon/impl/notify/CouponNotificationWorker;

    .line 84
    .line 85
    invoke-direct {v1, v3}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 86
    .line 87
    .line 88
    const-string v3, "CouponNotificationWorker"

    .line 89
    .line 90
    invoke-virtual {v1, v3}, La/v0;->g(Ljava/lang/String;)La/v0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, La/xl60;

    .line 95
    .line 96
    const-wide/16 v4, 0x4b0

    .line 97
    .line 98
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 99
    .line 100
    invoke-virtual {v1, v4, v5, v6}, La/v0;->x(JLjava/util/concurrent/TimeUnit;)La/v0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, La/xl60;

    .line 105
    .line 106
    iget-object v4, v1, La/v0;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v4, La/ppv0;

    .line 109
    .line 110
    iput-object v2, v4, La/ppv0;->j:La/o4e;

    .line 111
    .line 112
    invoke-virtual {v1}, La/v0;->k()La/lpv0;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, La/yl60;

    .line 117
    .line 118
    invoke-virtual {p0, v3, v0, v1}, La/cpv0;->c(Ljava/lang/String;La/zko;La/yl60;)V

    .line 119
    .line 120
    .line 121
    :cond_0
    return-void

    .line 122
    :cond_1
    const-string p0, "couponFeature"

    .line 123
    .line 124
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/app/Application;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, p1, p0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onCreate()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-boolean v0, La/ebc;->a:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 5
    .line 6
    .line 7
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 8
    .line 9
    invoke-static {p0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 14
    .line 15
    :goto_0
    sget v0, La/pkd;->a:F

    .line 16
    .line 17
    iget-object v8, p0, Lorg/platform/app/ApplicationLoader;->Z:La/sje;

    .line 18
    .line 19
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, La/tvk;->a:La/rwj;

    .line 23
    .line 24
    new-instance v1, La/pd;

    .line 25
    .line 26
    const/16 v3, 0x1b

    .line 27
    .line 28
    const/4 v4, 0x2

    .line 29
    const/4 v9, 0x0

    .line 30
    invoke-direct {v1, v4, v9, v3}, La/pd;-><init>(ILa/yje;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v8, v0, v9, v1, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    new-instance v1, La/gyf;

    .line 43
    .line 44
    invoke-direct {v1, v0, p0}, La/gyf;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;Lorg/platform/app/ApplicationLoader;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {p0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, v0, La/g8i;->v:La/n5d0;

    .line 55
    .line 56
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->a:La/z7z;

    .line 61
    .line 62
    iget-object v1, v0, La/g8i;->R4:La/f8i;

    .line 63
    .line 64
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->b:La/z7z;

    .line 69
    .line 70
    iget-object v1, v0, La/g8i;->b2:La/f8i;

    .line 71
    .line 72
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->c:La/z7z;

    .line 77
    .line 78
    iget-object v1, v0, La/g8i;->H2:La/f8i;

    .line 79
    .line 80
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->d:La/z7z;

    .line 85
    .line 86
    iget-object v1, v0, La/g8i;->Jk:La/f8i;

    .line 87
    .line 88
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->e:La/z7z;

    .line 93
    .line 94
    iget-object v1, v0, La/g8i;->Kk:La/f8i;

    .line 95
    .line 96
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->f:La/z7z;

    .line 101
    .line 102
    iget-object v1, v0, La/g8i;->Lk:La/n5d0;

    .line 103
    .line 104
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->g:La/z7z;

    .line 109
    .line 110
    iget-object v1, v0, La/g8i;->O3:La/f8i;

    .line 111
    .line 112
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->h:La/z7z;

    .line 117
    .line 118
    iget-object v1, v0, La/g8i;->Z3:La/f8i;

    .line 119
    .line 120
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->i:La/z7z;

    .line 125
    .line 126
    iget-object v1, v0, La/g8i;->k1:La/w1k;

    .line 127
    .line 128
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->j:La/z7z;

    .line 133
    .line 134
    iget-object v1, v0, La/g8i;->p5:La/f8i;

    .line 135
    .line 136
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->k:La/z7z;

    .line 141
    .line 142
    iget-object v1, v0, La/g8i;->Mk:La/f8i;

    .line 143
    .line 144
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->l:La/z7z;

    .line 149
    .line 150
    iget-object v1, v0, La/g8i;->P2:La/f8i;

    .line 151
    .line 152
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->m:La/z7z;

    .line 157
    .line 158
    iget-object v1, v0, La/g8i;->l3:La/f8i;

    .line 159
    .line 160
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->n:La/z7z;

    .line 165
    .line 166
    iget-object v1, v0, La/g8i;->Nk:La/f8i;

    .line 167
    .line 168
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->o:La/z7z;

    .line 173
    .line 174
    iget-object v1, v0, La/g8i;->q:La/n5d0;

    .line 175
    .line 176
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->p:La/z7z;

    .line 181
    .line 182
    iget-object v1, v0, La/g8i;->zi:La/n5d0;

    .line 183
    .line 184
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->q:La/z7z;

    .line 189
    .line 190
    iget-object v1, v0, La/g8i;->l5:La/f8i;

    .line 191
    .line 192
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->r:La/z7z;

    .line 197
    .line 198
    iget-object v1, v0, La/g8i;->T2:La/f8i;

    .line 199
    .line 200
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 201
    .line 202
    .line 203
    iget-object v1, v0, La/g8i;->U4:La/n5d0;

    .line 204
    .line 205
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->s:La/z7z;

    .line 210
    .line 211
    iget-object v1, v0, La/g8i;->T4:La/f8i;

    .line 212
    .line 213
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->t:La/z7z;

    .line 218
    .line 219
    iget-object v1, v0, La/g8i;->Ok:La/f8i;

    .line 220
    .line 221
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->u:La/z7z;

    .line 226
    .line 227
    iget-object v1, v0, La/g8i;->J1:La/n5d0;

    .line 228
    .line 229
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->v:La/z7z;

    .line 234
    .line 235
    iget-object v1, v0, La/g8i;->c5:La/f8i;

    .line 236
    .line 237
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->w:La/z7z;

    .line 242
    .line 243
    iget-object v1, v0, La/g8i;->B2:La/n5d0;

    .line 244
    .line 245
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->x:La/z7z;

    .line 250
    .line 251
    iget-object v1, v0, La/g8i;->S3:La/n5d0;

    .line 252
    .line 253
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->y:La/z7z;

    .line 258
    .line 259
    iget-object v1, v0, La/g8i;->S3:La/n5d0;

    .line 260
    .line 261
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, La/o1w0;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    new-instance v3, La/i1w0;

    .line 271
    .line 272
    invoke-direct {v3}, La/i1w0;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v3}, La/o1w0;->a(La/i1w0;)V

    .line 276
    .line 277
    .line 278
    new-instance v1, La/ejc;

    .line 279
    .line 280
    invoke-direct {v1, v3}, La/ejc;-><init>(La/i1w0;)V

    .line 281
    .line 282
    .line 283
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->z:La/ejc;

    .line 284
    .line 285
    iget-object v1, v0, La/g8i;->w3:La/n5d0;

    .line 286
    .line 287
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->A:La/z7z;

    .line 292
    .line 293
    iget-object v1, v0, La/g8i;->i1:La/n5d0;

    .line 294
    .line 295
    invoke-static {v1}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    iput-object v1, p0, Lorg/platform/app/ApplicationLoader;->B:La/z7z;

    .line 300
    .line 301
    iget-object v0, v0, La/g8i;->I2:La/n5d0;

    .line 302
    .line 303
    invoke-static {v0}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iput-object v0, p0, Lorg/platform/app/ApplicationLoader;->Y:La/z7z;

    .line 308
    .line 309
    sget-object v10, La/dvj;->c:La/dvj;

    .line 310
    .line 311
    new-instance v0, La/bk2;

    .line 312
    .line 313
    const/4 v6, 0x0

    .line 314
    const/16 v7, 0x16

    .line 315
    .line 316
    const/4 v1, 0x1

    .line 317
    const-class v3, Lorg/platform/app/ApplicationLoader;

    .line 318
    .line 319
    const-string v4, "logNonFatalError"

    .line 320
    .line 321
    const-string v5, "logNonFatalError(Ljava/lang/Throwable;)V"

    .line 322
    .line 323
    move-object v2, p0

    .line 324
    invoke-direct/range {v0 .. v7}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 325
    .line 326
    .line 327
    move-object v2, v0

    .line 328
    move-object v7, v3

    .line 329
    new-instance v5, La/is3;

    .line 330
    .line 331
    const/4 v1, 0x3

    .line 332
    invoke-direct {v5, p0, v9, v1}, La/is3;-><init>(Lorg/platform/app/ApplicationLoader;La/yje;B)V

    .line 333
    .line 334
    .line 335
    const/16 v6, 0xa

    .line 336
    .line 337
    const/4 v3, 0x0

    .line 338
    move-object v1, v8

    .line 339
    move-object v4, v10

    .line 340
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 341
    .line 342
    .line 343
    sget-object v1, La/rdj;->a:La/rdj;

    .line 344
    .line 345
    iget-object v1, p0, Lorg/platform/app/ApplicationLoader;->Y:La/z7z;

    .line 346
    .line 347
    if-eqz v1, :cond_1

    .line 348
    .line 349
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    check-cast v1, La/ctf0;

    .line 354
    .line 355
    invoke-virtual {v1}, La/ctf0;->h()Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-static {v1}, La/rdj;->l(Z)V

    .line 360
    .line 361
    .line 362
    iget-object v1, p0, Lorg/platform/app/ApplicationLoader;->m1:La/n0o0;

    .line 363
    .line 364
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, La/jvq;

    .line 369
    .line 370
    invoke-virtual {p0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 371
    .line 372
    .line 373
    new-instance v1, La/ys00;

    .line 374
    .line 375
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 376
    .line 377
    .line 378
    filled-new-array {v1}, [La/ys00;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-static {v1}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    sput-object v1, La/k5n0;->a:Ljava/util/List;

    .line 387
    .line 388
    iget-object v1, p0, Lorg/platform/app/ApplicationLoader;->j1:La/n0o0;

    .line 389
    .line 390
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    check-cast v1, La/clz;

    .line 395
    .line 396
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    iget-object v2, p0, Lorg/platform/app/ApplicationLoader;->k1:La/n0o0;

    .line 401
    .line 402
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    check-cast v2, La/es3;

    .line 407
    .line 408
    invoke-virtual {v1, v2}, La/glz;->a(La/blz;)V

    .line 409
    .line 410
    .line 411
    new-instance v2, La/bk2;

    .line 412
    .line 413
    const/4 v6, 0x0

    .line 414
    move-object v3, v7

    .line 415
    const/16 v7, 0x17

    .line 416
    .line 417
    const/4 v1, 0x1

    .line 418
    const-string v4, "logNonFatalError"

    .line 419
    .line 420
    const-string v5, "logNonFatalError(Ljava/lang/Throwable;)V"

    .line 421
    .line 422
    move-object v0, v2

    .line 423
    move-object v2, p0

    .line 424
    invoke-direct/range {v0 .. v7}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 425
    .line 426
    .line 427
    new-instance v5, La/oa;

    .line 428
    .line 429
    const/16 v1, 0x14

    .line 430
    .line 431
    invoke-direct {v5, p0, p0, v9, v1}, La/oa;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 432
    .line 433
    .line 434
    const/16 v6, 0xe

    .line 435
    .line 436
    const/4 v3, 0x0

    .line 437
    const/4 v4, 0x0

    .line 438
    move-object v2, v0

    .line 439
    move-object v1, v8

    .line 440
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :cond_1
    const-string v0, "resourceManager"

    .line 445
    .line 446
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v9
.end method

.method public final onLowMemory()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->q:La/z7z;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/uq70;

    .line 12
    .line 13
    invoke-interface {v0}, La/uq70;->close()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "onlineCallEngine"

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0

    .line 24
    :cond_1
    :goto_0
    invoke-super {p0}, Landroid/app/Application;->onLowMemory()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onTerminate()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->Z:La/sje;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->f1:La/sje;

    .line 8
    .line 9
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->g1:La/sje;

    .line 13
    .line 14
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/platform/app/ApplicationLoader;->h()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Lorg/platform/app/ApplicationLoader;->g(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->j1:La/n0o0;

    .line 25
    .line 26
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/clz;

    .line 31
    .line 32
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v2, p0, Lorg/platform/app/ApplicationLoader;->k1:La/n0o0;

    .line 37
    .line 38
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, La/es3;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, La/glz;->f(La/blz;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lorg/platform/app/ApplicationLoader;->v:La/z7z;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/m1e;

    .line 56
    .line 57
    invoke-interface {v0}, La/m1e;->d()V

    .line 58
    .line 59
    .line 60
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    const-string p0, "connectionObserver"

    .line 65
    .line 66
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1
.end method
