.class public abstract La/pzg0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/ugi0;

.field public static final b:La/ugi0;

.field public static final c:La/ugi0;

.field public static final d:La/ugi0;

.field public static final e:La/uw3;

.field public static final f:La/uw3;

.field public static final g:La/uw3;

.field public static final h:La/uw3;

.field public static final i:La/uw3;

.field public static final j:La/uw3;

.field public static final k:La/uw3;

.field public static final l:La/uw3;

.field public static final m:La/ugi0;

.field public static final n:La/ugi0;

.field public static final o:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/uua0;

    .line 2
    .line 3
    sget-object v1, La/sre0;->a:La/tre0;

    .line 4
    .line 5
    const-class v2, Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-direct {v0, v3}, La/uua0;-><init>(La/sgy;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, La/uua0;->getDescriptor()La/ugi0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/pzg0;->a:La/ugi0;

    .line 19
    .line 20
    new-instance v0, La/uua0;

    .line 21
    .line 22
    const-class v3, Landroid/os/Parcelable;

    .line 23
    .line 24
    invoke-virtual {v1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-direct {v0, v4}, La/uua0;-><init>(La/sgy;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, La/uua0;->getDescriptor()La/ugi0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, La/pzg0;->b:La/ugi0;

    .line 36
    .line 37
    new-instance v0, La/uua0;

    .line 38
    .line 39
    const-class v4, Ljava/io/Serializable;

    .line 40
    .line 41
    invoke-virtual {v1, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {v0, v4}, La/uua0;-><init>(La/sgy;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, La/uua0;->getDescriptor()La/ugi0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, La/pzg0;->c:La/ugi0;

    .line 53
    .line 54
    new-instance v0, La/uua0;

    .line 55
    .line 56
    const-class v4, Landroid/os/IBinder;

    .line 57
    .line 58
    invoke-virtual {v1, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-direct {v0, v4}, La/uua0;-><init>(La/sgy;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, La/uua0;->getDescriptor()La/ugi0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, La/pzg0;->d:La/ugi0;

    .line 70
    .line 71
    sget-object v0, La/lwj;->b:La/lwj;

    .line 72
    .line 73
    invoke-virtual {v1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v4, v0}, La/mrv;->k(La/sgy;La/jiy;)La/wme0;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iget-object v4, v4, La/wme0;->c:La/uw3;

    .line 82
    .line 83
    sput-object v4, La/pzg0;->e:La/uw3;

    .line 84
    .line 85
    new-instance v4, La/uua0;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-direct {v4, v5}, La/uua0;-><init>(La/sgy;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5, v4}, La/mrv;->k(La/sgy;La/jiy;)La/wme0;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iget-object v4, v4, La/wme0;->c:La/uw3;

    .line 103
    .line 104
    sput-object v4, La/pzg0;->f:La/uw3;

    .line 105
    .line 106
    new-instance v4, La/uw3;

    .line 107
    .line 108
    invoke-interface {v0}, La/jiy;->getDescriptor()La/ugi0;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const/4 v6, 0x1

    .line 113
    invoke-direct {v4, v5, v6}, La/uw3;-><init>(La/ugi0;B)V

    .line 114
    .line 115
    .line 116
    sput-object v4, La/pzg0;->g:La/uw3;

    .line 117
    .line 118
    new-instance v4, La/uua0;

    .line 119
    .line 120
    invoke-virtual {v1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-direct {v4, v5}, La/uua0;-><init>(La/sgy;)V

    .line 125
    .line 126
    .line 127
    new-instance v5, La/uw3;

    .line 128
    .line 129
    invoke-virtual {v4}, La/uua0;->getDescriptor()La/ugi0;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-direct {v5, v4, v6}, La/uw3;-><init>(La/ugi0;B)V

    .line 137
    .line 138
    .line 139
    sput-object v5, La/pzg0;->h:La/uw3;

    .line 140
    .line 141
    sget-object v4, La/lvb;->a:La/lvb;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-static {v5, v4}, La/mrv;->k(La/sgy;La/jiy;)La/wme0;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    iget-object v4, v4, La/wme0;->c:La/uw3;

    .line 152
    .line 153
    sput-object v4, La/pzg0;->i:La/uw3;

    .line 154
    .line 155
    new-instance v4, La/uua0;

    .line 156
    .line 157
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-direct {v4, v5}, La/uua0;-><init>(La/sgy;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v5, v4}, La/mrv;->k(La/sgy;La/jiy;)La/wme0;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget-object v4, v4, La/wme0;->c:La/uw3;

    .line 173
    .line 174
    sput-object v4, La/pzg0;->j:La/uw3;

    .line 175
    .line 176
    new-instance v4, La/uw3;

    .line 177
    .line 178
    sget-object v5, La/lvb;->b:La/wgi0;

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-direct {v4, v5, v6}, La/uw3;-><init>(La/ugi0;B)V

    .line 184
    .line 185
    .line 186
    sput-object v4, La/pzg0;->k:La/uw3;

    .line 187
    .line 188
    new-instance v4, La/uua0;

    .line 189
    .line 190
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-direct {v4, v2}, La/uua0;-><init>(La/sgy;)V

    .line 195
    .line 196
    .line 197
    new-instance v2, La/uw3;

    .line 198
    .line 199
    invoke-virtual {v4}, La/uua0;->getDescriptor()La/ugi0;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-direct {v2, v4, v6}, La/uw3;-><init>(La/ugi0;B)V

    .line 207
    .line 208
    .line 209
    sput-object v2, La/pzg0;->l:La/uw3;

    .line 210
    .line 211
    sget-object v2, La/jnk0;->Companion:La/ink0;

    .line 212
    .line 213
    invoke-virtual {v2, v0}, La/ink0;->serializer(La/jiy;)La/jiy;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-interface {v0}, La/jiy;->getDescriptor()La/ugi0;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sput-object v0, La/pzg0;->m:La/ugi0;

    .line 222
    .line 223
    new-instance v0, La/uua0;

    .line 224
    .line 225
    invoke-virtual {v1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-direct {v0, v4}, La/uua0;-><init>(La/sgy;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v0}, La/ink0;->serializer(La/jiy;)La/jiy;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-interface {v0}, La/jiy;->getDescriptor()La/ugi0;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    sput-object v0, La/pzg0;->n:La/ugi0;

    .line 241
    .line 242
    new-instance v0, La/uua0;

    .line 243
    .line 244
    invoke-virtual {v1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-direct {v0, v1}, La/uua0;-><init>(La/sgy;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v2, v0}, La/ink0;->serializer(La/jiy;)La/jiy;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-interface {v0}, La/jiy;->getDescriptor()La/ugi0;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    sput-object v0, La/pzg0;->o:La/ugi0;

    .line 264
    .line 265
    return-void
.end method
