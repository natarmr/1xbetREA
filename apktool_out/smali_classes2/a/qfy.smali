.class public final La/qfy;
.super La/g1x;
.source "SourceFile"


# instance fields
.field public final a:La/rfk;

.field public final b:La/p3d0;

.field public final c:La/xfy;

.field public final d:La/h950;

.field public final e:La/roi0;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/rfk;La/p3d0;La/xfy;La/h950;La/roi0;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/qfy;->a:La/rfk;

    .line 11
    .line 12
    iput-object p2, p0, La/qfy;->b:La/p3d0;

    .line 13
    .line 14
    iput-object p3, p0, La/qfy;->c:La/xfy;

    .line 15
    .line 16
    iput-object p4, p0, La/qfy;->d:La/h950;

    .line 17
    .line 18
    iput-object p5, p0, La/qfy;->e:La/roi0;

    .line 19
    .line 20
    invoke-virtual {p3}, La/xfy;->j()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object p2, p3, La/xfy;->e:La/vfy;

    .line 32
    .line 33
    iget p2, p2, La/vfy;->c:I

    .line 34
    .line 35
    invoke-interface {p4, p2}, La/h950;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object p2, p3, La/xfy;->e:La/vfy;

    .line 43
    .line 44
    iget p2, p2, La/vfy;->d:I

    .line 45
    .line 46
    invoke-interface {p4, p2}, La/h950;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :cond_0
    sget-object p3, La/egy;->a:La/sso;

    .line 60
    .line 61
    const/4 p3, 0x1

    .line 62
    invoke-static {p2, p4, p5, p3}, La/egy;->b(La/p3d0;La/h950;La/roi0;Z)La/cfy;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    const/4 p3, 0x0

    .line 67
    if-eqz p2, :cond_6

    .line 68
    .line 69
    iget-object p5, p2, La/cfy;->b:Ljava/lang/String;

    .line 70
    .line 71
    iget-object p2, p2, La/cfy;->c:Ljava/lang/String;

    .line 72
    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-static {p5}, La/aey;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p5

    .line 79
    invoke-direct {v0, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, La/yjj;->j()La/vjj;

    .line 83
    .line 84
    .line 85
    move-result-object p5

    .line 86
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, La/f0d0;->getVisibility()La/tek;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v2, La/uek;->d:La/tek;

    .line 94
    .line 95
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const-string v2, "$"

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    instance-of v1, p5, La/ffk;

    .line 104
    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    check-cast p5, La/ffk;

    .line 108
    .line 109
    iget-object p1, p5, La/ffk;->e:La/s2d0;

    .line 110
    .line 111
    sget-object p3, La/dgy;->g:La/ijt;

    .line 112
    .line 113
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {p1, p3}, La/h8x;->L(La/gjt;La/ijt;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Ljava/lang/Integer;

    .line 121
    .line 122
    if-eqz p1, :cond_1

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-interface {p4, p1}, La/h950;->getString(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-nez p1, :cond_2

    .line 133
    .line 134
    :cond_1
    const-string p1, "main"

    .line 135
    .line 136
    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sget-object p4, La/j950;->a:Lkotlin/text/Regex;

    .line 142
    .line 143
    const-string p5, "_"

    .line 144
    .line 145
    invoke-virtual {p4, p1, p5}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    goto :goto_0

    .line 157
    :cond_3
    invoke-virtual {p1}, La/f0d0;->getVisibility()La/tek;

    .line 158
    .line 159
    .line 160
    move-result-object p4

    .line 161
    sget-object v1, La/uek;->a:La/tek;

    .line 162
    .line 163
    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p4

    .line 167
    if-eqz p4, :cond_5

    .line 168
    .line 169
    instance-of p4, p5, La/mg80;

    .line 170
    .line 171
    if-eqz p4, :cond_5

    .line 172
    .line 173
    iget-object p1, p1, La/rfk;->g1:La/hfk;

    .line 174
    .line 175
    instance-of p4, p1, La/kfy;

    .line 176
    .line 177
    if-eqz p4, :cond_5

    .line 178
    .line 179
    check-cast p1, La/kfy;

    .line 180
    .line 181
    iget-object p4, p1, La/kfy;->b:La/rey;

    .line 182
    .line 183
    if-eqz p4, :cond_5

    .line 184
    .line 185
    new-instance p4, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p1, La/kfy;->a:La/rey;

    .line 191
    .line 192
    iget-object p1, p1, La/rey;->a:Ljava/lang/String;

    .line 193
    .line 194
    if-eqz p1, :cond_4

    .line 195
    .line 196
    const/16 p3, 0x2f

    .line 197
    .line 198
    invoke-static {p3, p1, p1}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-static {p1}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, La/g950;->b()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    goto :goto_0

    .line 218
    :cond_4
    const/16 p0, 0xa

    .line 219
    .line 220
    invoke-static {p0}, La/rey;->a(I)V

    .line 221
    .line 222
    .line 223
    throw p3

    .line 224
    :cond_5
    const-string p1, ""

    .line 225
    .line 226
    :goto_0
    const-string p3, "()"

    .line 227
    .line 228
    invoke-static {v0, p1, p3, p2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    :goto_1
    iput-object p1, p0, La/qfy;->f:Ljava/lang/String;

    .line 233
    .line 234
    return-void

    .line 235
    :cond_6
    const-string p0, "No field signature for property: "

    .line 236
    .line 237
    invoke-static {p1, p0}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw p3
.end method


# virtual methods
.method public final o()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/qfy;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
