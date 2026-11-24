.class public abstract La/x1x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/y6x0;

.field public static final b:La/u6x0;

.field public static final c:La/j5x0;

.field public static final d:La/e5x0;

.field public static final e:La/j5x0;

.field public static final f:La/e5x0;

.field public static final g:La/okt0;

.field public static final h:La/okt0;

.field public static final i:La/okt0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/epw0;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/epw0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/y6x0;

    .line 9
    .line 10
    const-class v2, La/xzw0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, La/y6x0;-><init>(Ljava/lang/Class;La/a7x0;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/x1x0;->a:La/y6x0;

    .line 16
    .line 17
    new-instance v0, La/tow0;

    .line 18
    .line 19
    const/16 v1, 0x1c

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/tow0;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/u6x0;

    .line 25
    .line 26
    const-string v3, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, La/u6x0;-><init>(Ljava/lang/String;La/w6x0;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, La/x1x0;->b:La/u6x0;

    .line 32
    .line 33
    new-instance v0, La/qow0;

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/qow0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/j5x0;

    .line 39
    .line 40
    const-class v4, La/f0x0;

    .line 41
    .line 42
    invoke-direct {v2, v4, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 43
    .line 44
    .line 45
    sput-object v2, La/x1x0;->c:La/j5x0;

    .line 46
    .line 47
    new-instance v0, La/zow0;

    .line 48
    .line 49
    invoke-direct {v0, v1}, La/zow0;-><init>(B)V

    .line 50
    .line 51
    .line 52
    new-instance v2, La/e5x0;

    .line 53
    .line 54
    const-string v4, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"

    .line 55
    .line 56
    invoke-direct {v2, v4, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 57
    .line 58
    .line 59
    sput-object v2, La/x1x0;->d:La/e5x0;

    .line 60
    .line 61
    new-instance v0, La/vow0;

    .line 62
    .line 63
    invoke-direct {v0, v1}, La/vow0;-><init>(B)V

    .line 64
    .line 65
    .line 66
    new-instance v2, La/j5x0;

    .line 67
    .line 68
    const-class v4, La/yzw0;

    .line 69
    .line 70
    invoke-direct {v2, v4, v0}, La/j5x0;-><init>(Ljava/lang/Class;La/g5x0;)V

    .line 71
    .line 72
    .line 73
    sput-object v2, La/x1x0;->e:La/j5x0;

    .line 74
    .line 75
    new-instance v0, La/cpw0;

    .line 76
    .line 77
    invoke-direct {v0, v1}, La/cpw0;-><init>(B)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/e5x0;

    .line 81
    .line 82
    invoke-direct {v1, v3, v0}, La/e5x0;-><init>(Ljava/lang/String;La/d5x0;)V

    .line 83
    .line 84
    .line 85
    sput-object v1, La/x1x0;->f:La/e5x0;

    .line 86
    .line 87
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v1, La/mdx0;->c:La/mdx0;

    .line 92
    .line 93
    sget-object v2, La/uzw0;->b:La/uzw0;

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v1, La/mdx0;->g:La/mdx0;

    .line 99
    .line 100
    sget-object v2, La/uzw0;->c:La/uzw0;

    .line 101
    .line 102
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object v1, La/mdx0;->e:La/mdx0;

    .line 106
    .line 107
    sget-object v2, La/uzw0;->d:La/uzw0;

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object v1, La/mdx0;->d:La/mdx0;

    .line 113
    .line 114
    sget-object v2, La/uzw0;->e:La/uzw0;

    .line 115
    .line 116
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object v1, La/mdx0;->f:La/mdx0;

    .line 120
    .line 121
    sget-object v2, La/uzw0;->f:La/uzw0;

    .line 122
    .line 123
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sput-object v0, La/x1x0;->g:La/okt0;

    .line 131
    .line 132
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v1, La/ddx0;->c:La/ddx0;

    .line 137
    .line 138
    sget-object v2, La/vzw0;->b:La/vzw0;

    .line 139
    .line 140
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object v1, La/ddx0;->d:La/ddx0;

    .line 144
    .line 145
    sget-object v2, La/vzw0;->c:La/vzw0;

    .line 146
    .line 147
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object v1, La/ddx0;->e:La/ddx0;

    .line 151
    .line 152
    sget-object v2, La/vzw0;->d:La/vzw0;

    .line 153
    .line 154
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object v1, La/ddx0;->f:La/ddx0;

    .line 158
    .line 159
    sget-object v2, La/vzw0;->e:La/vzw0;

    .line 160
    .line 161
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sput-object v0, La/x1x0;->h:La/okt0;

    .line 169
    .line 170
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sget-object v1, La/ecx0;->c:La/ecx0;

    .line 175
    .line 176
    sget-object v2, La/wzw0;->c:La/wzw0;

    .line 177
    .line 178
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    sget-object v1, La/ecx0;->d:La/ecx0;

    .line 182
    .line 183
    sget-object v2, La/wzw0;->b:La/wzw0;

    .line 184
    .line 185
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object v1, La/ecx0;->e:La/ecx0;

    .line 189
    .line 190
    sget-object v2, La/wzw0;->d:La/wzw0;

    .line 191
    .line 192
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, La/x1x0;->i:La/okt0;

    .line 200
    .line 201
    return-void
.end method

.method public static a(La/vzw0;)I
    .locals 2

    .line 1
    sget-object v0, La/vzw0;->b:La/vzw0;

    .line 2
    .line 3
    if-eq v0, p0, :cond_2

    .line 4
    .line 5
    sget-object v0, La/vzw0;->c:La/vzw0;

    .line 6
    .line 7
    if-eq v0, p0, :cond_1

    .line 8
    .line 9
    sget-object v0, La/vzw0;->d:La/vzw0;

    .line 10
    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    const/16 p0, 0x43

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v1, "Unable to serialize CurveType "

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    const/16 p0, 0x31

    .line 33
    .line 34
    return p0

    .line 35
    :cond_2
    const/16 p0, 0x21

    .line 36
    .line 37
    return p0
.end method

.method public static b(La/p50;)La/lpw0;
    .locals 2

    .line 1
    sget-object v0, La/p50;->n:La/p50;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, La/lpw0;->e:La/lpw0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, La/p50;->l:La/p50;

    .line 13
    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    sget-object v0, La/p50;->m:La/p50;

    .line 17
    .line 18
    if-ne p0, v0, :cond_1

    .line 19
    .line 20
    sget-object p0, La/lpw0;->f:La/lpw0;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "unknown variant: "

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_2
    sget-object p0, La/lpw0;->c:La/lpw0;

    .line 40
    .line 41
    return-object p0
.end method

.method public static c(La/lpw0;La/mcx0;)La/xzw0;
    .locals 3

    .line 1
    invoke-static {}, La/bfx0;->t()La/zex0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, La/mcx0;->x()La/dcx0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, La/dcx0;->w()La/bfx0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, La/bfx0;->C()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, La/zex0;->g(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    invoke-virtual {v0, v1}, La/zex0;->h(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, La/mcx0;->x()La/dcx0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, La/dcx0;->w()La/bfx0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, La/bfx0;->B()La/sjw0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, La/zex0;->f(La/sjw0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/bfx0;

    .line 44
    .line 45
    invoke-static {}, La/xzw0;->b()La/zcw0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v2, La/lpw0;->e:La/lpw0;

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_0

    .line 56
    .line 57
    sget-object p0, La/p50;->n:La/p50;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    sget-object v2, La/lpw0;->c:La/lpw0;

    .line 61
    .line 62
    if-eq p0, v2, :cond_3

    .line 63
    .line 64
    sget-object v2, La/lpw0;->f:La/lpw0;

    .line 65
    .line 66
    if-eq p0, v2, :cond_2

    .line 67
    .line 68
    sget-object v2, La/lpw0;->d:La/lpw0;

    .line 69
    .line 70
    if-ne p0, v2, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 74
    .line 75
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string v0, "unknown variant: "

    .line 80
    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_2
    :goto_0
    sget-object p0, La/p50;->m:La/p50;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    sget-object p0, La/p50;->l:La/p50;

    .line 93
    .line 94
    :goto_1
    iput-object p0, v1, La/zcw0;->e:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-virtual {p1}, La/mcx0;->A()La/xcx0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, La/xcx0;->y()La/ddx0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    sget-object v2, La/x1x0;->h:La/okt0;

    .line 105
    .line 106
    invoke-virtual {v2, p0}, La/okt0;->o(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, La/vzw0;

    .line 111
    .line 112
    iput-object p0, v1, La/zcw0;->a:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {p1}, La/mcx0;->A()La/xcx0;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, La/xcx0;->z()La/mdx0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    sget-object v2, La/x1x0;->g:La/okt0;

    .line 123
    .line 124
    invoke-virtual {v2, p0}, La/okt0;->o(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, La/uzw0;

    .line 129
    .line 130
    iput-object p0, v1, La/zcw0;->b:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {v0}, La/ojw0;->c()[B

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, La/ktt0;->E([B)La/fpw0;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {v1, p0}, La/zcw0;->e(La/fpw0;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, La/mcx0;->A()La/xcx0;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, La/xcx0;->A()La/sjw0;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, La/sjw0;->r()[B

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, La/icw0;->a([B)La/icw0;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    iget-object v0, p0, La/icw0;->a:[B

    .line 160
    .line 161
    array-length v0, v0

    .line 162
    const/4 v2, 0x0

    .line 163
    if-nez v0, :cond_4

    .line 164
    .line 165
    iput-object v2, v1, La/zcw0;->f:Ljava/lang/Object;

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_4
    iput-object p0, v1, La/zcw0;->f:Ljava/lang/Object;

    .line 169
    .line 170
    :goto_2
    invoke-virtual {p1}, La/mcx0;->A()La/xcx0;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, La/xcx0;->y()La/ddx0;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    sget-object v0, La/ddx0;->f:La/ddx0;

    .line 179
    .line 180
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-nez p0, :cond_5

    .line 185
    .line 186
    sget-object p0, La/x1x0;->i:La/okt0;

    .line 187
    .line 188
    invoke-virtual {p1}, La/mcx0;->t()La/ecx0;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p0, p1}, La/okt0;->o(Ljava/lang/Enum;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, La/wzw0;

    .line 197
    .line 198
    iput-object p0, v1, La/zcw0;->c:Ljava/lang/Object;

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_5
    invoke-virtual {p1}, La/mcx0;->t()La/ecx0;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    sget-object p1, La/ecx0;->d:La/ecx0;

    .line 206
    .line 207
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    if-eqz p0, :cond_6

    .line 212
    .line 213
    :goto_3
    invoke-virtual {v1}, La/zcw0;->b()La/xzw0;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :cond_6
    const-string p0, "For CURVE25519 EcPointFormat must be compressed"

    .line 219
    .line 220
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-object v2
.end method

.method public static d(La/f0x0;)La/tcx0;
    .locals 5

    .line 1
    iget-object v0, p0, La/f0x0;->a:La/xzw0;

    .line 2
    .line 3
    iget-object v1, v0, La/xzw0;->a:La/vzw0;

    .line 4
    .line 5
    sget-object v2, La/vzw0;->e:La/vzw0;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, La/tcx0;->B()La/scx0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 19
    .line 20
    .line 21
    iget-object v3, v1, La/hkw0;->b:La/jkw0;

    .line 22
    .line 23
    check-cast v3, La/tcx0;

    .line 24
    .line 25
    invoke-static {v3}, La/tcx0;->w(La/tcx0;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, La/x1x0;->e(La/xzw0;)La/mcx0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 33
    .line 34
    .line 35
    iget-object v3, v1, La/hkw0;->b:La/jkw0;

    .line 36
    .line 37
    check-cast v3, La/tcx0;

    .line 38
    .line 39
    invoke-static {v3, v0}, La/tcx0;->y(La/tcx0;La/mcx0;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/f0x0;->c:La/icw0;

    .line 43
    .line 44
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    array-length v0, p0

    .line 49
    invoke-static {p0, v2, v0}, La/sjw0;->h([BII)La/vjw0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 54
    .line 55
    .line 56
    iget-object v0, v1, La/hkw0;->b:La/jkw0;

    .line 57
    .line 58
    check-cast v0, La/tcx0;

    .line 59
    .line 60
    invoke-static {v0, p0}, La/tcx0;->x(La/tcx0;La/sjw0;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, La/sjw0;->b:La/vjw0;

    .line 64
    .line 65
    invoke-virtual {v1}, La/hkw0;->d()V

    .line 66
    .line 67
    .line 68
    iget-object v0, v1, La/hkw0;->b:La/jkw0;

    .line 69
    .line 70
    check-cast v0, La/tcx0;

    .line 71
    .line 72
    invoke-static {v0, p0}, La/tcx0;->A(La/tcx0;La/sjw0;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, La/hkw0;->c()La/jkw0;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/tcx0;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_0
    iget-object v1, v0, La/xzw0;->a:La/vzw0;

    .line 83
    .line 84
    invoke-static {v1}, La/x1x0;->a(La/vzw0;)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget-object p0, p0, La/f0x0;->b:Ljava/security/spec/ECPoint;

    .line 89
    .line 90
    if-eqz p0, :cond_1

    .line 91
    .line 92
    invoke-static {}, La/tcx0;->B()La/scx0;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v3}, La/hkw0;->d()V

    .line 97
    .line 98
    .line 99
    iget-object v4, v3, La/hkw0;->b:La/jkw0;

    .line 100
    .line 101
    check-cast v4, La/tcx0;

    .line 102
    .line 103
    invoke-static {v4}, La/tcx0;->w(La/tcx0;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, La/x1x0;->e(La/xzw0;)La/mcx0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v3}, La/hkw0;->d()V

    .line 111
    .line 112
    .line 113
    iget-object v4, v3, La/hkw0;->b:La/jkw0;

    .line 114
    .line 115
    check-cast v4, La/tcx0;

    .line 116
    .line 117
    invoke-static {v4, v0}, La/tcx0;->y(La/tcx0;La/mcx0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0, v1}, La/ibm0;->G(Ljava/math/BigInteger;I)[B

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    array-length v4, v0

    .line 129
    invoke-static {v0, v2, v4}, La/sjw0;->h([BII)La/vjw0;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v3}, La/hkw0;->d()V

    .line 134
    .line 135
    .line 136
    iget-object v4, v3, La/hkw0;->b:La/jkw0;

    .line 137
    .line 138
    check-cast v4, La/tcx0;

    .line 139
    .line 140
    invoke-static {v4, v0}, La/tcx0;->x(La/tcx0;La/sjw0;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0, v1}, La/ibm0;->G(Ljava/math/BigInteger;I)[B

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    array-length v0, p0

    .line 152
    invoke-static {p0, v2, v0}, La/sjw0;->h([BII)La/vjw0;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {v3}, La/hkw0;->d()V

    .line 157
    .line 158
    .line 159
    iget-object v0, v3, La/hkw0;->b:La/jkw0;

    .line 160
    .line 161
    check-cast v0, La/tcx0;

    .line 162
    .line 163
    invoke-static {v0, p0}, La/tcx0;->A(La/tcx0;La/sjw0;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, La/hkw0;->c()La/jkw0;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, La/tcx0;

    .line 171
    .line 172
    return-object p0

    .line 173
    :cond_1
    const-string p0, "NistCurvePoint was null for NIST curve"

    .line 174
    .line 175
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const/4 p0, 0x0

    .line 179
    return-object p0
.end method

.method public static e(La/xzw0;)La/mcx0;
    .locals 5

    .line 1
    invoke-static {}, La/xcx0;->t()La/vcx0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/x1x0;->h:La/okt0;

    .line 6
    .line 7
    iget-object v2, p0, La/xzw0;->a:La/vzw0;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/ddx0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 16
    .line 17
    .line 18
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 19
    .line 20
    check-cast v2, La/xcx0;

    .line 21
    .line 22
    invoke-static {v2, v1}, La/xcx0;->v(La/xcx0;La/ddx0;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, La/x1x0;->g:La/okt0;

    .line 26
    .line 27
    iget-object v2, p0, La/xzw0;->b:La/uzw0;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/mdx0;

    .line 34
    .line 35
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 36
    .line 37
    .line 38
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 39
    .line 40
    check-cast v2, La/xcx0;

    .line 41
    .line 42
    invoke-static {v2, v1}, La/xcx0;->w(La/xcx0;La/mdx0;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/xzw0;->f:La/icw0;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    iget-object v2, v1, La/icw0;->a:[B

    .line 50
    .line 51
    array-length v2, v2

    .line 52
    if-lez v2, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, La/icw0;->b()[B

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/4 v2, 0x0

    .line 59
    array-length v3, v1

    .line 60
    invoke-static {v1, v2, v3}, La/sjw0;->h([BII)La/vjw0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 65
    .line 66
    .line 67
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 68
    .line 69
    check-cast v2, La/xcx0;

    .line 70
    .line 71
    invoke-static {v2, v1}, La/xcx0;->u(La/xcx0;La/sjw0;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/xcx0;

    .line 79
    .line 80
    :try_start_0
    iget-object v1, p0, La/xzw0;->e:La/fpw0;

    .line 81
    .line 82
    invoke-static {v1}, La/ktt0;->F(La/fpw0;)[B

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sget-object v2, La/dkw0;->b:La/dkw0;

    .line 87
    .line 88
    invoke-static {v1, v2}, La/bfx0;->v([BLa/dkw0;)La/bfx0;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {}, La/dcx0;->t()La/ccx0;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {}, La/bfx0;->t()La/zex0;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1}, La/bfx0;->C()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v3, v4}, La/zex0;->g(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 v4, 0x2

    .line 108
    invoke-virtual {v3, v4}, La/zex0;->h(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, La/bfx0;->B()La/sjw0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v3, v1}, La/zex0;->f(La/sjw0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, La/hkw0;->c()La/jkw0;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, La/bfx0;

    .line 123
    .line 124
    invoke-virtual {v2}, La/hkw0;->d()V

    .line 125
    .line 126
    .line 127
    iget-object v3, v2, La/hkw0;->b:La/jkw0;

    .line 128
    .line 129
    check-cast v3, La/dcx0;

    .line 130
    .line 131
    invoke-static {v3, v1}, La/dcx0;->u(La/dcx0;La/bfx0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, La/hkw0;->c()La/jkw0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, La/dcx0;
    :try_end_0
    .catch La/qkw0; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    .line 140
    iget-object p0, p0, La/xzw0;->c:La/wzw0;

    .line 141
    .line 142
    if-nez p0, :cond_1

    .line 143
    .line 144
    sget-object p0, La/wzw0;->b:La/wzw0;

    .line 145
    .line 146
    :cond_1
    invoke-static {}, La/mcx0;->y()La/kcx0;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v2}, La/hkw0;->d()V

    .line 151
    .line 152
    .line 153
    iget-object v3, v2, La/hkw0;->b:La/jkw0;

    .line 154
    .line 155
    check-cast v3, La/mcx0;

    .line 156
    .line 157
    invoke-static {v3, v0}, La/mcx0;->w(La/mcx0;La/xcx0;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, La/hkw0;->d()V

    .line 161
    .line 162
    .line 163
    iget-object v0, v2, La/hkw0;->b:La/jkw0;

    .line 164
    .line 165
    check-cast v0, La/mcx0;

    .line 166
    .line 167
    invoke-static {v0, v1}, La/mcx0;->u(La/mcx0;La/dcx0;)V

    .line 168
    .line 169
    .line 170
    sget-object v0, La/x1x0;->i:La/okt0;

    .line 171
    .line 172
    invoke-virtual {v0, p0}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    check-cast p0, La/ecx0;

    .line 177
    .line 178
    invoke-virtual {v2}, La/hkw0;->d()V

    .line 179
    .line 180
    .line 181
    iget-object v0, v2, La/hkw0;->b:La/jkw0;

    .line 182
    .line 183
    check-cast v0, La/mcx0;

    .line 184
    .line 185
    invoke-static {v0, p0}, La/mcx0;->v(La/mcx0;La/ecx0;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, La/hkw0;->c()La/jkw0;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    check-cast p0, La/mcx0;

    .line 193
    .line 194
    return-object p0

    .line 195
    :catch_0
    move-exception p0

    .line 196
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 197
    .line 198
    const-string v1, "Parsing EciesParameters failed: "

    .line 199
    .line 200
    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    throw v0
.end method
