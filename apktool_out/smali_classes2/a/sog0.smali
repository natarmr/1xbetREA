.class public abstract La/sog0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/qlc;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/swq;

    .line 2
    .line 3
    const-string v1, "java.lang.Void"

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/swq;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/qlc;

    .line 9
    .line 10
    invoke-virtual {v0}, La/swq;->b()La/swq;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v0, v0, La/swq;->a:La/twq;

    .line 15
    .line 16
    invoke-virtual {v0}, La/twq;->g()La/g950;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {v1, v2, v0}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/sog0;->a:La/qlc;

    .line 24
    .line 25
    return-void
.end method

.method public static a(La/mer;)La/bfy;
    .locals 4

    .line 1
    new-instance v0, La/bfy;

    .line 2
    .line 3
    new-instance v1, La/dfy;

    .line 4
    .line 5
    invoke-static {p0}, La/x0x;->R(La/mer;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_2

    .line 10
    .line 11
    instance-of v2, p0, La/g0d0;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, La/rek;->j(La/mp9;)La/mp9;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, La/vjj;->getName()La/g950;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, La/g950;->b()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, La/aey;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    instance-of v2, p0, La/n0d0;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-static {p0}, La/rek;->j(La/mp9;)La/mp9;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, La/vjj;->getName()La/g950;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, La/g950;->b()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v2}, La/aey;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v2, p0

    .line 60
    check-cast v2, La/wjj;

    .line 61
    .line 62
    invoke-virtual {v2}, La/wjj;->getName()La/g950;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, La/g950;->b()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_0
    const/4 v3, 0x1

    .line 74
    invoke-static {p0, v3}, La/m7x;->w(La/mer;I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {v1, v2, p0}, La/dfy;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1}, La/bfy;-><init>(La/dfy;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method public static b(La/d0d0;)La/g1x;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, La/oek;->s(La/mp9;)La/mp9;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, La/d0d0;

    .line 9
    .line 10
    invoke-interface {p0}, La/d0d0;->a()La/d0d0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v0, p0, La/rfk;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v3, p0

    .line 23
    check-cast v3, La/rfk;

    .line 24
    .line 25
    iget-object v4, v3, La/rfk;->B:La/p3d0;

    .line 26
    .line 27
    sget-object v0, La/dgy;->d:La/ijt;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v4, v0}, La/h8x;->L(La/gjt;La/ijt;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v5, v0

    .line 37
    check-cast v5, La/xfy;

    .line 38
    .line 39
    if-eqz v5, :cond_a

    .line 40
    .line 41
    new-instance v2, La/qfy;

    .line 42
    .line 43
    iget-object v6, v3, La/rfk;->Y:La/h950;

    .line 44
    .line 45
    iget-object v7, v3, La/rfk;->Z:La/roi0;

    .line 46
    .line 47
    invoke-direct/range {v2 .. v7}, La/qfy;-><init>(La/rfk;La/p3d0;La/xfy;La/h950;La/roi0;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_0
    instance-of v0, p0, La/x9y;

    .line 52
    .line 53
    if-eqz v0, :cond_a

    .line 54
    .line 55
    move-object v0, p0

    .line 56
    check-cast v0, La/x9y;

    .line 57
    .line 58
    invoke-virtual {v0}, La/yjj;->b()La/gmk0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    instance-of v3, v2, La/rog0;

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    check-cast v2, La/rog0;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v2, v1

    .line 70
    :goto_0
    if-eqz v2, :cond_2

    .line 71
    .line 72
    iget-object v2, v2, La/rog0;->a:La/qqe0;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move-object v2, v1

    .line 76
    :goto_1
    instance-of v3, v2, La/sqe0;

    .line 77
    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    new-instance p0, La/ofy;

    .line 81
    .line 82
    check-cast v2, La/sqe0;

    .line 83
    .line 84
    iget-object v0, v2, La/sqe0;->a:Ljava/lang/reflect/Field;

    .line 85
    .line 86
    invoke-direct {p0, v0}, La/ofy;-><init>(Ljava/lang/reflect/Field;)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_3
    instance-of v3, v2, La/vqe0;

    .line 91
    .line 92
    if-eqz v3, :cond_9

    .line 93
    .line 94
    new-instance p0, La/pfy;

    .line 95
    .line 96
    check-cast v2, La/vqe0;

    .line 97
    .line 98
    iget-object v2, v2, La/vqe0;->a:Ljava/lang/reflect/Method;

    .line 99
    .line 100
    iget-object v0, v0, La/f0d0;->y:La/n0d0;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {v0}, La/yjj;->b()La/gmk0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v0, v1

    .line 110
    :goto_2
    instance-of v3, v0, La/rog0;

    .line 111
    .line 112
    if-eqz v3, :cond_5

    .line 113
    .line 114
    check-cast v0, La/rog0;

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    move-object v0, v1

    .line 118
    :goto_3
    if-eqz v0, :cond_6

    .line 119
    .line 120
    iget-object v0, v0, La/rog0;->a:La/qqe0;

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    move-object v0, v1

    .line 124
    :goto_4
    instance-of v3, v0, La/vqe0;

    .line 125
    .line 126
    if-eqz v3, :cond_7

    .line 127
    .line 128
    check-cast v0, La/vqe0;

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_7
    move-object v0, v1

    .line 132
    :goto_5
    if-eqz v0, :cond_8

    .line 133
    .line 134
    iget-object v1, v0, La/vqe0;->a:Ljava/lang/reflect/Method;

    .line 135
    .line 136
    :cond_8
    invoke-direct {p0, v2, v1}, La/pfy;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 137
    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_9
    const-string v0, "Incorrect resolution sequence for Java field "

    .line 141
    .line 142
    const-string v3, " (source = "

    .line 143
    .line 144
    invoke-static {v0, p0, v3, v2}, La/c99;->u(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_a
    invoke-interface {p0}, La/d0d0;->d()La/g0d0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v0}, La/sog0;->a(La/mer;)La/bfy;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {p0}, La/d0d0;->e()La/n0d0;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-eqz p0, :cond_b

    .line 164
    .line 165
    invoke-static {p0}, La/sog0;->a(La/mer;)La/bfy;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    :cond_b
    new-instance p0, La/rfy;

    .line 170
    .line 171
    invoke-direct {p0, v0, v1}, La/rfy;-><init>(La/bfy;La/bfy;)V

    .line 172
    .line 173
    .line 174
    return-object p0
.end method

.method public static c(La/mer;)La/q0x;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, La/oek;->s(La/mp9;)La/mp9;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, La/mer;

    .line 9
    .line 10
    invoke-interface {v0}, La/mer;->a()La/mer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    instance-of v1, v0, La/wek;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, La/kfk;

    .line 23
    .line 24
    invoke-interface {v1}, La/kfk;->O()La/z3;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    instance-of v3, v2, La/i3d0;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    sget-object v3, La/egy;->a:La/sso;

    .line 33
    .line 34
    move-object v3, v2

    .line 35
    check-cast v3, La/i3d0;

    .line 36
    .line 37
    invoke-interface {v1}, La/kfk;->A()La/h950;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v1}, La/kfk;->x()La/roi0;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v3, v4, v5}, La/egy;->c(La/i3d0;La/h950;La/roi0;)La/dfy;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    new-instance p0, La/bfy;

    .line 52
    .line 53
    invoke-direct {p0, v3}, La/bfy;-><init>(La/dfy;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_0
    instance-of v3, v2, La/v2d0;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    sget-object v3, La/egy;->a:La/sso;

    .line 62
    .line 63
    check-cast v2, La/v2d0;

    .line 64
    .line 65
    invoke-interface {v1}, La/kfk;->A()La/h950;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v1}, La/kfk;->x()La/roi0;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v2, v3, v1}, La/egy;->a(La/v2d0;La/h950;La/roi0;)La/dfy;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-interface {p0}, La/vjj;->j()La/vjj;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {p0}, La/ddx;->a(La/vjj;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_1

    .line 91
    .line 92
    new-instance p0, La/bfy;

    .line 93
    .line 94
    invoke-direct {p0, v1}, La/bfy;-><init>(La/dfy;)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_1
    new-instance p0, La/afy;

    .line 99
    .line 100
    invoke-direct {p0, v1}, La/afy;-><init>(La/dfy;)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_2
    invoke-static {v0}, La/sog0;->a(La/mer;)La/bfy;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_3
    instance-of p0, v0, La/u9y;

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    if-eqz p0, :cond_8

    .line 113
    .line 114
    move-object p0, v0

    .line 115
    check-cast p0, La/u9y;

    .line 116
    .line 117
    invoke-virtual {p0}, La/yjj;->b()La/gmk0;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    instance-of v2, p0, La/rog0;

    .line 122
    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    check-cast p0, La/rog0;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    move-object p0, v1

    .line 129
    :goto_0
    if-eqz p0, :cond_5

    .line 130
    .line 131
    iget-object p0, p0, La/rog0;->a:La/qqe0;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    move-object p0, v1

    .line 135
    :goto_1
    instance-of v2, p0, La/vqe0;

    .line 136
    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    check-cast p0, La/vqe0;

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    move-object p0, v1

    .line 143
    :goto_2
    if-eqz p0, :cond_7

    .line 144
    .line 145
    iget-object p0, p0, La/vqe0;->a:Ljava/lang/reflect/Method;

    .line 146
    .line 147
    new-instance v0, La/zey;

    .line 148
    .line 149
    invoke-direct {v0, p0}, La/zey;-><init>(Ljava/lang/reflect/Method;)V

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_7
    const-string p0, "Incorrect resolution sequence for Java method "

    .line 154
    .line 155
    invoke-static {v0, p0}, La/ohq;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :cond_8
    instance-of p0, v0, La/p8y;

    .line 160
    .line 161
    if-eqz p0, :cond_d

    .line 162
    .line 163
    move-object p0, v0

    .line 164
    check-cast p0, La/p8y;

    .line 165
    .line 166
    invoke-virtual {p0}, La/yjj;->b()La/gmk0;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    instance-of v2, p0, La/rog0;

    .line 171
    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    check-cast p0, La/rog0;

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_9
    move-object p0, v1

    .line 178
    :goto_3
    if-eqz p0, :cond_a

    .line 179
    .line 180
    iget-object p0, p0, La/rog0;->a:La/qqe0;

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_a
    move-object p0, v1

    .line 184
    :goto_4
    instance-of v2, p0, La/pqe0;

    .line 185
    .line 186
    if-eqz v2, :cond_b

    .line 187
    .line 188
    new-instance v0, La/yey;

    .line 189
    .line 190
    check-cast p0, La/pqe0;

    .line 191
    .line 192
    iget-object p0, p0, La/pqe0;->a:Ljava/lang/reflect/Constructor;

    .line 193
    .line 194
    invoke-direct {v0, p0}, La/yey;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :cond_b
    instance-of v2, p0, La/mqe0;

    .line 199
    .line 200
    if-eqz v2, :cond_c

    .line 201
    .line 202
    move-object v2, p0

    .line 203
    check-cast v2, La/mqe0;

    .line 204
    .line 205
    iget-object v2, v2, La/mqe0;->a:Ljava/lang/Class;

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Class;->isAnnotation()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_c

    .line 212
    .line 213
    new-instance p0, La/xey;

    .line 214
    .line 215
    invoke-direct {p0, v2}, La/xey;-><init>(Ljava/lang/Class;)V

    .line 216
    .line 217
    .line 218
    return-object p0

    .line 219
    :cond_c
    const-string v2, "Incorrect resolution sequence for Java constructor "

    .line 220
    .line 221
    const-string v3, " ("

    .line 222
    .line 223
    invoke-static {v2, v0, v3, p0}, La/c99;->u(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-object v1

    .line 227
    :cond_d
    invoke-static {v0}, La/sog0;->a(La/mer;)La/bfy;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0
.end method
