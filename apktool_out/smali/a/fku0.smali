.class public final La/fku0;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/gku0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Landroid/util/AttributeSet;

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public constructor <init>(La/gku0;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fku0;->a:La/gku0;

    .line 2
    .line 3
    iput-object p2, p0, La/fku0;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, La/fku0;->c:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, La/fku0;->d:Landroid/util/AttributeSet;

    .line 8
    .line 9
    iput-object p5, p0, La/fku0;->e:Landroid/view/View;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/fku0;->a:La/gku0;

    .line 2
    .line 3
    iget-object v1, v0, La/gku0;->j:La/hd3;

    .line 4
    .line 5
    iget-object v2, p0, La/fku0;->e:Landroid/view/View;

    .line 6
    .line 7
    iget-object v3, p0, La/fku0;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/fku0;->c:Landroid/content/Context;

    .line 10
    .line 11
    iget-object p0, p0, La/fku0;->d:Landroid/util/AttributeSet;

    .line 12
    .line 13
    :try_start_0
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2, v3, v4, p0}, La/hd3;->g(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v5

    .line 30
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 31
    .line 32
    new-instance v6, La/g0g0;

    .line 33
    .line 34
    invoke-direct {v6, v5}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v5, v6

    .line 38
    :goto_0
    invoke-static {v5}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-nez v6, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-object v5, v0, La/gku0;->k:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2, v3, v5, p0}, La/hd3;->g(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    :goto_1
    check-cast v5, Landroid/view/View;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    if-nez v5, :cond_2

    .line 61
    .line 62
    :try_start_1
    invoke-static {v3, v4, p0}, La/gku0;->E(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    goto :goto_2

    .line 67
    :catchall_1
    move-exception v5

    .line 68
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 69
    .line 70
    new-instance v6, La/g0g0;

    .line 71
    .line 72
    invoke-direct {v6, v5}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object v5, v6

    .line 76
    :goto_2
    nop

    .line 77
    instance-of v6, v5, La/g0g0;

    .line 78
    .line 79
    if-eqz v6, :cond_1

    .line 80
    .line 81
    move-object v5, v2

    .line 82
    :cond_1
    check-cast v5, Landroid/view/View;

    .line 83
    .line 84
    :cond_2
    const-string v6, "WebView"

    .line 85
    .line 86
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_3

    .line 91
    .line 92
    new-instance v5, Landroid/webkit/WebView;

    .line 93
    .line 94
    new-instance v7, La/w4v0;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-direct {v7, v4}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v7}, La/gku0;->d(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v7}, La/hd3;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v7}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-direct {v5, v7, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    instance-of v7, v5, Landroid/webkit/WebView;

    .line 120
    .line 121
    if-eqz v7, :cond_7

    .line 122
    .line 123
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-nez v6, :cond_7

    .line 128
    .line 129
    check-cast v5, Landroid/webkit/WebView;

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v5}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    array-length v6, v5

    .line 143
    const/4 v7, 0x0

    .line 144
    move v8, v7

    .line 145
    :goto_3
    if-ge v8, v6, :cond_5

    .line 146
    .line 147
    aget-object v9, v5, v8

    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    array-length v10, v10

    .line 154
    const/4 v11, 0x2

    .line 155
    if-ne v10, v11, :cond_4

    .line 156
    .line 157
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    aget-object v10, v10, v7

    .line 162
    .line 163
    const-class v11, Landroid/content/Context;

    .line 164
    .line 165
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-eqz v10, :cond_4

    .line 170
    .line 171
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    const/4 v11, 0x1

    .line 176
    aget-object v10, v10, v11

    .line 177
    .line 178
    const-class v11, Landroid/util/AttributeSet;

    .line 179
    .line 180
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-eqz v10, :cond_4

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_5
    move-object v9, v2

    .line 191
    :goto_4
    if-eqz v9, :cond_6

    .line 192
    .line 193
    new-instance v2, La/w4v0;

    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-direct {v2, v4}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v2}, La/gku0;->d(Landroid/content/Context;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v2}, La/hd3;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {v0}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v9, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    :cond_6
    move-object v5, v2

    .line 224
    check-cast v5, Landroid/view/View;

    .line 225
    .line 226
    :cond_7
    const-string v0, "SearchView"

    .line 227
    .line 228
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_8

    .line 233
    .line 234
    new-instance v5, Landroid/widget/SearchView;

    .line 235
    .line 236
    invoke-direct {v5, v4, p0}, Landroid/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 237
    .line 238
    .line 239
    :cond_8
    return-object v5
.end method
