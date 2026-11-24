.class public final synthetic La/f1x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lin0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f1x0;->a:B

    iput-object p1, p0, La/f1x0;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/f1x0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/f1x0;->b:Landroid/content/Context;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/t1x0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p0}, La/y0x0;->O(Landroid/content/Context;)La/w680;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    sget-object v0, La/c1x0;->j:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v0, La/y2x0;

    .line 18
    .line 19
    new-instance v1, La/tzw0;

    .line 20
    .line 21
    sget-object v2, La/ea3;->D:La/da3;

    .line 22
    .line 23
    sget-object v3, La/mav;->c:La/mav;

    .line 24
    .line 25
    sget-object v4, La/gzw0;->a:La/yzn0;

    .line 26
    .line 27
    invoke-direct {v1, p0, v4, v2, v3}, La/nav;-><init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, La/y2x0;-><init>(La/tzw0;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    sget-object v0, La/c1x0;->j:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance v0, La/zcw0;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p0, v0, La/zcw0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object p0, v0, La/zcw0;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, La/lin0;

    .line 49
    .line 50
    if-nez p0, :cond_0

    .line 51
    .line 52
    sget-object p0, La/c1x0;->m:La/lin0;

    .line 53
    .line 54
    iput-object p0, v0, La/zcw0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    :cond_0
    iget-object p0, v0, La/zcw0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/lin0;

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    if-nez p0, :cond_1

    .line 62
    .line 63
    iget-object p0, v0, La/zcw0;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Landroid/content/Context;

    .line 66
    .line 67
    new-instance v2, La/f1x0;

    .line 68
    .line 69
    invoke-direct {v2, p0, v1}, La/f1x0;-><init>(Landroid/content/Context;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-object p0, v0, La/zcw0;->c:Ljava/lang/Object;

    .line 77
    .line 78
    :cond_1
    iget-object p0, v0, La/zcw0;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, La/a1x0;

    .line 81
    .line 82
    if-nez p0, :cond_2

    .line 83
    .line 84
    new-instance p0, La/a1x0;

    .line 85
    .line 86
    invoke-direct {p0, v0, v1}, La/a1x0;-><init>(La/zcw0;B)V

    .line 87
    .line 88
    .line 89
    iput-object p0, v0, La/zcw0;->d:Ljava/lang/Object;

    .line 90
    .line 91
    :cond_2
    iget-object p0, v0, La/zcw0;->e:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, La/lin0;

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    if-nez p0, :cond_3

    .line 97
    .line 98
    iget-object p0, v0, La/zcw0;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Landroid/content/Context;

    .line 101
    .line 102
    new-instance v3, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v4, La/dwj;

    .line 108
    .line 109
    const/4 v5, 0x2

    .line 110
    invoke-direct {v4, p0, v5}, La/dwj;-><init>(Landroid/content/Context;B)V

    .line 111
    .line 112
    .line 113
    new-instance p0, La/z8x0;

    .line 114
    .line 115
    invoke-direct {p0, v4}, La/z8x0;-><init>(La/dwj;)V

    .line 116
    .line 117
    .line 118
    new-instance v4, La/d9x0;

    .line 119
    .line 120
    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    .line 121
    .line 122
    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    new-array v5, v5, [La/p9x0;

    .line 129
    .line 130
    aput-object p0, v5, v2

    .line 131
    .line 132
    aput-object v4, v5, v1

    .line 133
    .line 134
    invoke-static {v3, v5}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    new-instance p0, La/h1x0;

    .line 138
    .line 139
    invoke-direct {p0, v3, v2}, La/h1x0;-><init>(Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {p0}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    iput-object p0, v0, La/zcw0;->e:Ljava/lang/Object;

    .line 147
    .line 148
    :cond_3
    iget-object p0, v0, La/zcw0;->f:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p0, La/a1x0;

    .line 151
    .line 152
    if-nez p0, :cond_4

    .line 153
    .line 154
    new-instance p0, La/a1x0;

    .line 155
    .line 156
    invoke-direct {p0, v0, v2}, La/a1x0;-><init>(La/zcw0;B)V

    .line 157
    .line 158
    .line 159
    iput-object p0, v0, La/zcw0;->f:Ljava/lang/Object;

    .line 160
    .line 161
    :cond_4
    new-instance v3, La/c1x0;

    .line 162
    .line 163
    iget-object p0, v0, La/zcw0;->a:Ljava/lang/Object;

    .line 164
    .line 165
    move-object v4, p0

    .line 166
    check-cast v4, Landroid/content/Context;

    .line 167
    .line 168
    iget-object p0, v0, La/zcw0;->b:Ljava/lang/Object;

    .line 169
    .line 170
    move-object v5, p0

    .line 171
    check-cast v5, La/lin0;

    .line 172
    .line 173
    iget-object p0, v0, La/zcw0;->c:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v6, p0

    .line 176
    check-cast v6, La/lin0;

    .line 177
    .line 178
    iget-object p0, v0, La/zcw0;->d:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v7, p0

    .line 181
    check-cast v7, La/a1x0;

    .line 182
    .line 183
    iget-object p0, v0, La/zcw0;->e:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v8, p0

    .line 186
    check-cast v8, La/lin0;

    .line 187
    .line 188
    iget-object p0, v0, La/zcw0;->f:Ljava/lang/Object;

    .line 189
    .line 190
    move-object v9, p0

    .line 191
    check-cast v9, La/a1x0;

    .line 192
    .line 193
    invoke-direct/range {v3 .. v9}, La/c1x0;-><init>(Landroid/content/Context;La/lin0;La/lin0;La/lin0;La/lin0;La/lin0;)V

    .line 194
    .line 195
    .line 196
    return-object v3

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
