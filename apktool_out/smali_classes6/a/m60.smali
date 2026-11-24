.class public final La/m60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xfw0;


# static fields
.field public static final c:La/m60;

.field public static final d:La/m60;

.field public static final e:La/m60;

.field public static final f:La/m60;

.field public static final g:La/m60;

.field public static final h:La/m60;

.field public static final i:La/m60;

.field public static final j:La/m60;

.field public static final k:La/m60;

.field public static final l:La/m60;

.field public static final m:La/m60;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/m60;

    .line 2
    .line 3
    const-string v1, "TINK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/m60;->c:La/m60;

    .line 10
    .line 11
    new-instance v0, La/m60;

    .line 12
    .line 13
    const-string v1, "CRUNCHY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/m60;->d:La/m60;

    .line 19
    .line 20
    new-instance v0, La/m60;

    .line 21
    .line 22
    const-string v1, "NO_PREFIX"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/m60;->e:La/m60;

    .line 28
    .line 29
    new-instance v0, La/m60;

    .line 30
    .line 31
    const-string v1, "FLAT"

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/m60;->f:La/m60;

    .line 38
    .line 39
    new-instance v0, La/m60;

    .line 40
    .line 41
    const-string v1, "HALF_OPENED"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 44
    .line 45
    .line 46
    sput-object v0, La/m60;->g:La/m60;

    .line 47
    .line 48
    new-instance v0, La/m60;

    .line 49
    .line 50
    const-string v1, "TINK"

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 54
    .line 55
    .line 56
    sput-object v0, La/m60;->h:La/m60;

    .line 57
    .line 58
    new-instance v0, La/m60;

    .line 59
    .line 60
    const-string v1, "CRUNCHY"

    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 63
    .line 64
    .line 65
    sput-object v0, La/m60;->i:La/m60;

    .line 66
    .line 67
    new-instance v0, La/m60;

    .line 68
    .line 69
    const-string v1, "NO_PREFIX"

    .line 70
    .line 71
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 72
    .line 73
    .line 74
    sput-object v0, La/m60;->j:La/m60;

    .line 75
    .line 76
    new-instance v0, La/m60;

    .line 77
    .line 78
    const-string v1, "TINK"

    .line 79
    .line 80
    const/4 v2, 0x3

    .line 81
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 82
    .line 83
    .line 84
    sput-object v0, La/m60;->k:La/m60;

    .line 85
    .line 86
    new-instance v0, La/m60;

    .line 87
    .line 88
    const-string v1, "CRUNCHY"

    .line 89
    .line 90
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 91
    .line 92
    .line 93
    sput-object v0, La/m60;->l:La/m60;

    .line 94
    .line 95
    new-instance v0, La/m60;

    .line 96
    .line 97
    const-string v1, "NO_PREFIX"

    .line 98
    .line 99
    invoke-direct {v0, v1, v2}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 100
    .line 101
    .line 102
    sput-object v0, La/m60;->m:La/m60;

    .line 103
    .line 104
    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 2
    const/4 v0, 0x5

    iput-byte v0, p0, La/m60;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m60;->a:B

    iput-object p1, p0, La/m60;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/kzv;DLjava/lang/String;)La/yty;
    .locals 6

    .line 1
    iget-object v5, p0, La/m60;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, La/kzv;->g:La/i0w;

    .line 7
    .line 8
    iget-object v0, p1, La/kzv;->b:La/q4f;

    .line 9
    .line 10
    sget-object v1, La/i0w;->b:La/i0w;

    .line 11
    .line 12
    if-ne p0, v1, :cond_1

    .line 13
    .line 14
    sget-object v2, La/q4f;->k:La/q4f;

    .line 15
    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    sget-object v2, La/q4f;->j:La/q4f;

    .line 19
    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    :cond_0
    new-instance p0, La/wty;

    .line 23
    .line 24
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 25
    .line 26
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 31
    .line 32
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    invoke-direct {p0, p4, v5, p1, p2}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    if-ne p0, v1, :cond_2

    .line 41
    .line 42
    sget-object v2, La/q4f;->e:La/q4f;

    .line 43
    .line 44
    sget-object v3, La/q4f;->g:La/q4f;

    .line 45
    .line 46
    filled-new-array {v2, v3}, [La/q4f;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    new-instance p0, La/wty;

    .line 61
    .line 62
    sget-object p2, La/pn40;->a:La/pn40;

    .line 63
    .line 64
    iget-wide p1, p1, La/kzv;->f:D

    .line 65
    .line 66
    sget-object p3, La/p3u0;->c:La/p3u0;

    .line 67
    .line 68
    invoke-static {p1, p2, p3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    sget-object p2, La/s6t0;->a:La/pz40;

    .line 73
    .line 74
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    iget-object p2, p2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 79
    .line 80
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 81
    .line 82
    .line 83
    move-result-wide p2

    .line 84
    invoke-direct {p0, p1, v5, p2, p3}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_2
    const-wide/16 v2, 0x0

    .line 89
    .line 90
    cmpg-double p1, p2, v2

    .line 91
    .line 92
    if-nez p1, :cond_4

    .line 93
    .line 94
    :cond_3
    move-object v4, p4

    .line 95
    goto :goto_0

    .line 96
    :cond_4
    if-ne p0, v1, :cond_3

    .line 97
    .line 98
    new-instance v0, La/xty;

    .line 99
    .line 100
    sget-object p0, La/pn40;->a:La/pn40;

    .line 101
    .line 102
    sget-object p0, La/p3u0;->c:La/p3u0;

    .line 103
    .line 104
    invoke-static {p2, p3, p0}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 109
    .line 110
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 115
    .line 116
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 117
    .line 118
    .line 119
    move-result-wide v1

    .line 120
    move-object v4, p4

    .line 121
    invoke-direct/range {v0 .. v5}, La/xty;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v0

    .line 125
    :goto_0
    if-nez p1, :cond_5

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    sget-object p4, La/i0w;->i:La/i0w;

    .line 129
    .line 130
    if-ne p0, p4, :cond_6

    .line 131
    .line 132
    new-instance p0, La/wty;

    .line 133
    .line 134
    sget-object p1, La/pn40;->a:La/pn40;

    .line 135
    .line 136
    sget-object p1, La/p3u0;->c:La/p3u0;

    .line 137
    .line 138
    invoke-static {p2, p3, p1}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    sget-object p2, La/s6t0;->a:La/pz40;

    .line 143
    .line 144
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    iget-object p2, p2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 149
    .line 150
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 151
    .line 152
    .line 153
    move-result-wide p2

    .line 154
    invoke-direct {p0, p1, v5, p2, p3}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 155
    .line 156
    .line 157
    return-object p0

    .line 158
    :cond_6
    :goto_1
    if-nez p1, :cond_7

    .line 159
    .line 160
    new-instance p0, La/wty;

    .line 161
    .line 162
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 163
    .line 164
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 169
    .line 170
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 171
    .line 172
    .line 173
    move-result-wide p1

    .line 174
    invoke-direct {p0, v4, v5, p1, p2}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 175
    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_7
    invoke-static {p0}, La/plc;->J(La/i0w;)La/y3d;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    if-eqz p0, :cond_8

    .line 183
    .line 184
    iget-wide v1, p0, La/y3d;->a:J

    .line 185
    .line 186
    new-instance v0, La/xty;

    .line 187
    .line 188
    sget-object p0, La/pn40;->a:La/pn40;

    .line 189
    .line 190
    sget-object p0, La/p3u0;->c:La/p3u0;

    .line 191
    .line 192
    invoke-static {p2, p3, p0}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-direct/range {v0 .. v5}, La/xty;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :cond_8
    new-instance p0, La/wty;

    .line 201
    .line 202
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 203
    .line 204
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 209
    .line 210
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 211
    .line 212
    .line 213
    move-result-wide p1

    .line 214
    invoke-direct {p0, v4, v5, p1, p2}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 215
    .line 216
    .line 217
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/m60;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, La/m60;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    iget-object p0, p0, La/m60;->b:Ljava/lang/String;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_2
    iget-object p0, p0, La/m60;->b:Ljava/lang/String;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_3
    iget-object p0, p0, La/m60;->b:Ljava/lang/String;

    .line 21
    .line 22
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public zza(Ljava/lang/String;)La/xfw0;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "error"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "code"

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    const-string v0, "message"

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/m60;->b:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    return-object p0

    .line 31
    :catch_0
    move-exception p0

    .line 32
    goto :goto_0

    .line 33
    :catch_1
    move-exception p0

    .line 34
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v2, "Failed to parse error for string ["

    .line 41
    .line 42
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v3, "] with exception: "

    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "a.m60"

    .line 61
    .line 62
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    new-instance v0, La/udw0;

    .line 66
    .line 67
    const-string v1, "]"

    .line 68
    .line 69
    invoke-static {v2, p1, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {v0, p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v0
.end method
