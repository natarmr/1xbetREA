.class public final La/xe4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xe4;->a:B

    iput-object p1, p0, La/xe4;->b:Ljava/util/List;

    iput-object p2, p0, La/xe4;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v8, p3

    .line 16
    .line 17
    check-cast v8, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    and-int/lit8 v4, v3, 0x6

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v3

    .line 43
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v8, v2}, La/fet;->e(I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v1, v3

    .line 59
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 60
    .line 61
    const/16 v4, 0x92

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    const/4 v11, 0x0

    .line 65
    if-eq v3, v4, :cond_4

    .line 66
    .line 67
    move v3, v5

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v3, v11

    .line 70
    :goto_3
    and-int/2addr v1, v5

    .line 71
    invoke-virtual {v8, v1, v3}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    iget-object v1, v0, La/xe4;->b:Ljava/util/List;

    .line 78
    .line 79
    check-cast v1, La/a4x;

    .line 80
    .line 81
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, La/qcx;

    .line 86
    .line 87
    const v3, 0x12771fe5

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8, v3}, La/fet;->e0(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    check-cast v1, La/ocx;

    .line 97
    .line 98
    sget-object v3, La/qmk;->a:La/zcl;

    .line 99
    .line 100
    iget-object v0, v0, La/xe4;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, La/fcx;

    .line 103
    .line 104
    check-cast v0, La/bcx;

    .line 105
    .line 106
    iget-object v0, v0, La/bcx;->a:La/a4x;

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    sub-int/2addr v0, v5

    .line 113
    if-ne v2, v0, :cond_5

    .line 114
    .line 115
    const/high16 v0, 0x41400000    # 12.0f

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_5
    const/4 v0, 0x0

    .line 119
    :goto_4
    invoke-static {v8}, La/xfn;->a(La/fet;)La/wfn;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget v2, v2, La/wfn;->d:F

    .line 124
    .line 125
    invoke-static {v8}, La/xfn;->a(La/fet;)La/wfn;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iget v3, v3, La/wfn;->d:F

    .line 130
    .line 131
    sget-object v4, La/jm40;->b:La/jm40;

    .line 132
    .line 133
    const/high16 v5, 0x41000000    # 8.0f

    .line 134
    .line 135
    invoke-static {v4, v2, v5, v3, v0}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    new-instance v12, La/rx30;

    .line 140
    .line 141
    new-instance v13, La/m0x;

    .line 142
    .line 143
    const v0, 0x7f080a98

    .line 144
    .line 145
    .line 146
    const/4 v2, 0x0

    .line 147
    const/4 v4, 0x6

    .line 148
    invoke-direct {v13, v0, v2, v4}, La/m0x;-><init>(ILa/bzw;I)V

    .line 149
    .line 150
    .line 151
    const/16 v20, 0x0

    .line 152
    .line 153
    const/16 v21, 0x1f6

    .line 154
    .line 155
    const-wide/16 v14, 0x0

    .line 156
    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    const v17, 0x7f080a98

    .line 160
    .line 161
    .line 162
    const-wide/16 v18, 0x0

    .line 163
    .line 164
    invoke-direct/range {v12 .. v21}, La/rx30;-><init>(La/o0x;JLa/miz;IJLa/rc5;I)V

    .line 165
    .line 166
    .line 167
    new-instance v13, La/ux30;

    .line 168
    .line 169
    iget-object v0, v1, La/ocx;->b:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v1, v1, La/ocx;->a:Ljava/lang/String;

    .line 172
    .line 173
    const/16 v14, 0xa

    .line 174
    .line 175
    const-wide/16 v15, 0x0

    .line 176
    .line 177
    move-object/from16 v17, v0

    .line 178
    .line 179
    move-object/from16 v18, v1

    .line 180
    .line 181
    invoke-direct/range {v13 .. v18}, La/ux30;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    new-instance v4, La/gy30;

    .line 185
    .line 186
    const/16 v19, 0x0

    .line 187
    .line 188
    const/16 v20, 0xfc

    .line 189
    .line 190
    const/4 v15, 0x0

    .line 191
    const-wide/16 v16, 0x0

    .line 192
    .line 193
    const/16 v18, 0x0

    .line 194
    .line 195
    move-object v14, v12

    .line 196
    move-object v12, v4

    .line 197
    invoke-direct/range {v12 .. v20}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 198
    .line 199
    .line 200
    const/4 v9, 0x0

    .line 201
    const/16 v10, 0x1c

    .line 202
    .line 203
    const/4 v5, 0x0

    .line 204
    const/4 v6, 0x0

    .line 205
    const/4 v7, 0x0

    .line 206
    invoke-static/range {v3 .. v10}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8, v11}, La/fet;->r(Z)V

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_6
    invoke-virtual {v8}, La/fet;->X()V

    .line 214
    .line 215
    .line 216
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v8, p3

    .line 16
    .line 17
    check-cast v8, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object v4, v0, La/xe4;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, La/k3t0;

    .line 30
    .line 31
    and-int/lit8 v5, v3, 0x6

    .line 32
    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v1, 0x2

    .line 44
    :goto_0
    or-int/2addr v1, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v1, v3

    .line 47
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    invoke-virtual {v8, v2}, La/fet;->e(I)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    const/16 v3, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/16 v3, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v1, v3

    .line 63
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 64
    .line 65
    const/16 v5, 0x92

    .line 66
    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v6, 0x1

    .line 69
    if-eq v3, v5, :cond_4

    .line 70
    .line 71
    move v3, v6

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    move v3, v11

    .line 74
    :goto_3
    and-int/2addr v1, v6

    .line 75
    invoke-virtual {v8, v1, v3}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_9

    .line 80
    .line 81
    iget-object v0, v0, La/xe4;->b:Ljava/util/List;

    .line 82
    .line 83
    check-cast v0, La/a4x;

    .line 84
    .line 85
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/lk60;

    .line 90
    .line 91
    const v1, -0x6a08e429

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 95
    .line 96
    .line 97
    new-instance v12, La/gy30;

    .line 98
    .line 99
    new-instance v13, La/ux30;

    .line 100
    .line 101
    iget-object v1, v0, La/lk60;->b:Ljava/lang/String;

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    const/16 v14, 0xe

    .line 106
    .line 107
    const-wide/16 v15, 0x0

    .line 108
    .line 109
    move-object/from16 v17, v1

    .line 110
    .line 111
    invoke-direct/range {v13 .. v18}, La/ux30;-><init>(IJLjava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v14, La/rx30;

    .line 115
    .line 116
    new-instance v15, La/m0x;

    .line 117
    .line 118
    iget v1, v0, La/lk60;->c:I

    .line 119
    .line 120
    const/4 v2, 0x0

    .line 121
    const/4 v3, 0x6

    .line 122
    invoke-direct {v15, v1, v2, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 123
    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const/16 v23, 0x1f6

    .line 128
    .line 129
    const-wide/16 v16, 0x0

    .line 130
    .line 131
    const-wide/16 v20, 0x0

    .line 132
    .line 133
    move/from16 v19, v1

    .line 134
    .line 135
    invoke-direct/range {v14 .. v23}, La/rx30;-><init>(La/o0x;JLa/miz;IJLa/rc5;I)V

    .line 136
    .line 137
    .line 138
    const/16 v19, 0x0

    .line 139
    .line 140
    const/16 v20, 0xfc

    .line 141
    .line 142
    const/4 v15, 0x0

    .line 143
    invoke-direct/range {v12 .. v20}, La/gy30;-><init>(La/wx30;La/sx30;La/fy30;JLjava/util/List;La/xx30;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    or-int/2addr v1, v2

    .line 155
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    sget-object v3, La/ukd;->a:La/cl5;

    .line 160
    .line 161
    if-nez v1, :cond_5

    .line 162
    .line 163
    if-ne v2, v3, :cond_6

    .line 164
    .line 165
    :cond_5
    new-instance v2, La/ej60;

    .line 166
    .line 167
    invoke-direct {v2, v4, v0, v11}, La/ej60;-><init>(La/k3t0;La/lk60;B)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_6
    move-object v5, v2

    .line 174
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 175
    .line 176
    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    or-int/2addr v1, v2

    .line 185
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    if-nez v1, :cond_7

    .line 190
    .line 191
    if-ne v2, v3, :cond_8

    .line 192
    .line 193
    :cond_7
    new-instance v2, La/ej60;

    .line 194
    .line 195
    invoke-direct {v2, v4, v0, v6}, La/ej60;-><init>(La/k3t0;La/lk60;B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_8
    move-object v6, v2

    .line 202
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 203
    .line 204
    const/4 v9, 0x0

    .line 205
    const/16 v10, 0x11

    .line 206
    .line 207
    const/4 v3, 0x0

    .line 208
    const/4 v7, 0x0

    .line 209
    move-object v4, v12

    .line 210
    invoke-static/range {v3 .. v10}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v8, v11}, La/fet;->r(Z)V

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_9
    invoke-virtual {v8}, La/fet;->X()V

    .line 218
    .line 219
    .line 220
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0
.end method

.method private final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v3, p3

    .line 16
    .line 17
    check-cast v3, La/fet;

    .line 18
    .line 19
    move-object/from16 v4, p4

    .line 20
    .line 21
    check-cast v4, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    and-int/lit8 v5, v4, 0x6

    .line 28
    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v4

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v4

    .line 43
    :goto_1
    and-int/lit8 v4, v4, 0x30

    .line 44
    .line 45
    if-nez v4, :cond_3

    .line 46
    .line 47
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    const/16 v4, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v4, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v1, v4

    .line 59
    :cond_3
    and-int/lit16 v4, v1, 0x93

    .line 60
    .line 61
    const/16 v5, 0x92

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    const/4 v7, 0x0

    .line 65
    if-eq v4, v5, :cond_4

    .line 66
    .line 67
    move v4, v6

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v4, v7

    .line 70
    :goto_3
    and-int/2addr v1, v6

    .line 71
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    iget-object v1, v0, La/xe4;->b:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/i5d;

    .line 84
    .line 85
    const v2, -0x5b4a3caf

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 89
    .line 90
    .line 91
    sget-object v14, La/j1t0;->b:La/qrq;

    .line 92
    .line 93
    sget-wide v11, La/qmk;->p:J

    .line 94
    .line 95
    sget-wide v20, La/qmk;->C:J

    .line 96
    .line 97
    new-instance v22, La/y9q0;

    .line 98
    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    move-object/from16 v8, v22

    .line 102
    .line 103
    const v22, 0xfdffdd

    .line 104
    .line 105
    .line 106
    const-wide/16 v9, 0x0

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const-wide/16 v15, 0x0

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    invoke-direct/range {v8 .. v22}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v0, La/xe4;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, La/v9c;

    .line 121
    .line 122
    iget-object v0, v0, La/v9c;->d:La/d4d;

    .line 123
    .line 124
    invoke-static {v0, v3}, La/ibc;->Y(La/d4d;La/fet;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v23

    .line 128
    const/16 v39, 0x0

    .line 129
    .line 130
    const v40, 0xfffffe

    .line 131
    .line 132
    .line 133
    const-wide/16 v25, 0x0

    .line 134
    .line 135
    const/16 v27, 0x0

    .line 136
    .line 137
    const/16 v28, 0x0

    .line 138
    .line 139
    const/16 v29, 0x0

    .line 140
    .line 141
    const-wide/16 v30, 0x0

    .line 142
    .line 143
    const/16 v32, 0x0

    .line 144
    .line 145
    const/16 v33, 0x0

    .line 146
    .line 147
    const/16 v34, 0x0

    .line 148
    .line 149
    const/16 v35, 0x0

    .line 150
    .line 151
    const-wide/16 v36, 0x0

    .line 152
    .line 153
    const/16 v38, 0x0

    .line 154
    .line 155
    move-object/from16 v22, v8

    .line 156
    .line 157
    invoke-static/range {v22 .. v40}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v1, v0, v3, v7}, La/ebc;->c(La/i5d;La/y9q0;La/fet;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v7}, La/fet;->r(Z)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_5
    invoke-virtual {v3}, La/fet;->X()V

    .line 169
    .line 170
    .line 171
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object v0
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/g9z;

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    check-cast v1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    move-object/from16 v6, p3

    .line 13
    .line 14
    check-cast v6, La/fet;

    .line 15
    .line 16
    move-object/from16 v2, p4

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    and-int/lit8 v3, v2, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x2

    .line 37
    :goto_0
    or-int/2addr v0, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v0, v2

    .line 40
    :goto_1
    and-int/lit8 v2, v2, 0x30

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v6, v1}, La/fet;->e(I)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    const/16 v2, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v2, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v0, v2

    .line 56
    :cond_3
    and-int/lit16 v2, v0, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    const/4 v13, 0x0

    .line 62
    if-eq v2, v3, :cond_4

    .line 63
    .line 64
    move v2, v4

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    move v2, v13

    .line 67
    :goto_3
    and-int/2addr v0, v4

    .line 68
    invoke-virtual {v6, v0, v2}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_c

    .line 73
    .line 74
    iget-object v0, p0, La/xe4;->b:Ljava/util/List;

    .line 75
    .line 76
    check-cast v0, La/a4x;

    .line 77
    .line 78
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, La/owa0;

    .line 83
    .line 84
    const v1, -0x28874b29

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 88
    .line 89
    .line 90
    if-eqz v0, :cond_b

    .line 91
    .line 92
    instance-of v1, v0, La/nwa0;

    .line 93
    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    const p0, -0x2886dba3

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 100
    .line 101
    .line 102
    check-cast v0, La/nwa0;

    .line 103
    .line 104
    iget-object v3, v0, La/nwa0;->a:Ljava/lang/String;

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    const/16 v11, 0x1d

    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    const-wide/16 v4, 0x0

    .line 111
    .line 112
    move-object v9, v6

    .line 113
    const/4 v6, 0x0

    .line 114
    const-wide/16 v7, 0x0

    .line 115
    .line 116
    invoke-static/range {v2 .. v11}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 117
    .line 118
    .line 119
    move-object v6, v9

    .line 120
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_6

    .line 124
    .line 125
    :cond_5
    instance-of v1, v0, La/kwa0;

    .line 126
    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    const p0, -0x2884b107

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 133
    .line 134
    .line 135
    sget-object p0, La/qmk;->a:La/zcl;

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    const/4 v8, 0x5

    .line 139
    const/4 v2, 0x0

    .line 140
    const/high16 v3, 0x41000000    # 8.0f

    .line 141
    .line 142
    const-wide/16 v4, 0x0

    .line 143
    .line 144
    invoke-static/range {v2 .. v8}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 145
    .line 146
    .line 147
    check-cast v0, La/kwa0;

    .line 148
    .line 149
    iget-object v3, v0, La/kwa0;->a:Ljava/lang/String;

    .line 150
    .line 151
    sget-object v4, La/ro8;->c:La/ro8;

    .line 152
    .line 153
    const/4 v11, 0x0

    .line 154
    const/16 v12, 0x39

    .line 155
    .line 156
    const/4 v5, 0x0

    .line 157
    move-object v9, v6

    .line 158
    const-wide/16 v6, 0x0

    .line 159
    .line 160
    move-object v10, v9

    .line 161
    const-wide/16 v8, 0x0

    .line 162
    .line 163
    invoke-static/range {v2 .. v12}, La/kkb;->m(La/mm40;Ljava/lang/String;La/ro8;IJJLa/fet;II)V

    .line 164
    .line 165
    .line 166
    move-object v6, v10

    .line 167
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_6

    .line 171
    .line 172
    :cond_6
    instance-of v1, v0, La/mwa0;

    .line 173
    .line 174
    if-eqz v1, :cond_a

    .line 175
    .line 176
    const v1, -0x287fe61b

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 180
    .line 181
    .line 182
    sget-object v1, La/qmk;->a:La/zcl;

    .line 183
    .line 184
    const/4 v7, 0x0

    .line 185
    const/4 v8, 0x5

    .line 186
    const/4 v2, 0x0

    .line 187
    const/high16 v3, 0x41800000    # 16.0f

    .line 188
    .line 189
    const-wide/16 v4, 0x0

    .line 190
    .line 191
    invoke-static/range {v2 .. v8}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 192
    .line 193
    .line 194
    sget-object v1, La/jm40;->b:La/jm40;

    .line 195
    .line 196
    const/high16 v2, 0x3f800000    # 1.0f

    .line 197
    .line 198
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v0, La/mwa0;

    .line 203
    .line 204
    sget-object v3, La/gx1;->a:La/gx1;

    .line 205
    .line 206
    iget-object v4, v0, La/mwa0;->a:La/yrl;

    .line 207
    .line 208
    const/4 v7, 0x6

    .line 209
    const/16 v8, 0x8

    .line 210
    .line 211
    const/4 v5, 0x0

    .line 212
    invoke-static/range {v2 .. v8}, La/vdb;->v(La/mm40;La/gx1;La/asl;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 213
    .line 214
    .line 215
    iget-object p0, p0, La/xe4;->c:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p0, La/l7m0;

    .line 218
    .line 219
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, La/twa0;

    .line 224
    .line 225
    iget-object p0, p0, La/twa0;->b:La/a4x;

    .line 226
    .line 227
    if-eqz p0, :cond_7

    .line 228
    .line 229
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_7

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_7
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_9

    .line 245
    .line 246
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, La/owa0;

    .line 251
    .line 252
    instance-of v0, v0, La/lwa0;

    .line 253
    .line 254
    if-eqz v0, :cond_8

    .line 255
    .line 256
    const p0, -0x287797d2    # -2.9996206E14f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 260
    .line 261
    .line 262
    sget-object p0, La/qmk;->a:La/zcl;

    .line 263
    .line 264
    const/4 v7, 0x0

    .line 265
    const/4 v8, 0x5

    .line 266
    const/4 v2, 0x0

    .line 267
    const/high16 v3, 0x41000000    # 8.0f

    .line 268
    .line 269
    const-wide/16 v4, 0x0

    .line 270
    .line 271
    invoke-static/range {v2 .. v8}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 275
    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_9
    :goto_4
    const p0, -0x287627f0

    .line 279
    .line 280
    .line 281
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 285
    .line 286
    .line 287
    :goto_5
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 288
    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_a
    instance-of p0, v0, La/lwa0;

    .line 292
    .line 293
    if-eqz p0, :cond_b

    .line 294
    .line 295
    const p0, -0x2874e5b5

    .line 296
    .line 297
    .line 298
    invoke-virtual {v6, p0}, La/fet;->e0(I)V

    .line 299
    .line 300
    .line 301
    check-cast v0, La/lwa0;

    .line 302
    .line 303
    iget-object v3, v0, La/lwa0;->a:La/kvl;

    .line 304
    .line 305
    const/4 v7, 0x0

    .line 306
    const/16 v8, 0x1d

    .line 307
    .line 308
    const/4 v2, 0x0

    .line 309
    const/4 v4, 0x0

    .line 310
    const/4 v5, 0x0

    .line 311
    invoke-static/range {v2 .. v8}, La/dub;->x(La/mm40;La/mvl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 315
    .line 316
    .line 317
    :goto_6
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 318
    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_b
    const p0, 0x6f360ac

    .line 322
    .line 323
    .line 324
    invoke-static {p0, v6, v13}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    throw p0

    .line 329
    :cond_c
    invoke-virtual {v6}, La/fet;->X()V

    .line 330
    .line 331
    .line 332
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    return-object p0
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, La/fet;

    .line 10
    .line 11
    check-cast p4, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    and-int/lit8 v0, p4, 0x6

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x2

    .line 30
    :goto_0
    or-int/2addr p1, p4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move p1, p4

    .line 33
    :goto_1
    and-int/lit8 p4, p4, 0x30

    .line 34
    .line 35
    if-nez p4, :cond_3

    .line 36
    .line 37
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    if-eqz p4, :cond_2

    .line 42
    .line 43
    const/16 p4, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 p4, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr p1, p4

    .line 49
    :cond_3
    and-int/lit16 p4, p1, 0x93

    .line 50
    .line 51
    const/16 v0, 0x92

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    const/4 v2, 0x1

    .line 55
    if-eq p4, v0, :cond_4

    .line 56
    .line 57
    move p4, v2

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move p4, v1

    .line 60
    :goto_3
    and-int/2addr p1, v2

    .line 61
    invoke-virtual {p3, p1, p4}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    iget-object p1, p0, La/xe4;->b:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, La/kba;

    .line 74
    .line 75
    const p2, -0x64b0b606

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3, p2}, La/fet;->e0(I)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, La/xe4;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, La/jba;

    .line 84
    .line 85
    iget-object p0, p0, La/jba;->a:La/a4x;

    .line 86
    .line 87
    invoke-interface {p0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    new-instance p2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string p4, "CARD_BASKETBALL_QUARTER_ITEM_"

    .line 94
    .line 95
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    sget-object p2, La/jm40;->b:La/jm40;

    .line 106
    .line 107
    invoke-static {p2, p0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    sget-object p2, La/gqw0;->a:La/zx7;

    .line 112
    .line 113
    invoke-static {p2, v1}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iget-wide v3, p3, La/fet;->T:J

    .line 118
    .line 119
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 120
    .line 121
    .line 122
    move-result p4

    .line 123
    invoke-virtual {p3}, La/fet;->m()La/bh90;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {p3, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3}, La/fet;->i0()V

    .line 137
    .line 138
    .line 139
    iget-boolean v3, p3, La/fet;->S:Z

    .line 140
    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 144
    .line 145
    invoke-virtual {p3, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    invoke-virtual {p3}, La/fet;->r0()V

    .line 150
    .line 151
    .line 152
    :goto_4
    sget-object v3, La/gqw0;->x:La/shd;

    .line 153
    .line 154
    invoke-static {p3, p2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    sget-object p2, La/gqw0;->w:La/shd;

    .line 158
    .line 159
    invoke-static {p3, v0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    sget-object p4, La/gqw0;->y:La/shd;

    .line 167
    .line 168
    invoke-static {p3, p2, p4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 169
    .line 170
    .line 171
    invoke-static {p3}, La/jpm0;->n(La/fet;)V

    .line 172
    .line 173
    .line 174
    sget-object p2, La/gqw0;->v:La/shd;

    .line 175
    .line 176
    invoke-static {p3, p0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 177
    .line 178
    .line 179
    const/16 p0, 0x8

    .line 180
    .line 181
    invoke-static {p1, p3, p0}, La/wdx;->x(La/kba;La/fet;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p3, v2}, La/fet;->r(Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, v1}, La/fet;->r(Z)V

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_6
    invoke-virtual {p3}, La/fet;->X()V

    .line 192
    .line 193
    .line 194
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0
.end method

.method private final i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v11, p3

    .line 16
    .line 17
    check-cast v11, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object v4, v0, La/xe4;->c:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v14, v4

    .line 30
    check-cast v14, La/l4e0;

    .line 31
    .line 32
    and-int/lit8 v4, v3, 0x6

    .line 33
    .line 34
    const/4 v15, 0x2

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v1, v15

    .line 46
    :goto_0
    or-int/2addr v1, v3

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v1, v3

    .line 49
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 50
    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    invoke-virtual {v11, v2}, La/fet;->e(I)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    const/16 v3, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v3, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v1, v3

    .line 65
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 66
    .line 67
    const/16 v4, 0x92

    .line 68
    .line 69
    const/4 v5, 0x1

    .line 70
    const/4 v6, 0x0

    .line 71
    if-eq v3, v4, :cond_4

    .line 72
    .line 73
    move v3, v5

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move v3, v6

    .line 76
    :goto_3
    and-int/2addr v1, v5

    .line 77
    invoke-virtual {v11, v1, v3}, La/fet;->U(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_c

    .line 82
    .line 83
    iget-object v0, v0, La/xe4;->b:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 90
    .line 91
    const v1, 0x10609033

    .line 92
    .line 93
    .line 94
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 95
    .line 96
    .line 97
    new-instance v16, La/rqm;

    .line 98
    .line 99
    new-instance v1, La/tui0;

    .line 100
    .line 101
    iget-object v3, v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->a:Ljava/lang/String;

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    invoke-direct {v1, v3, v4}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 105
    .line 106
    .line 107
    new-instance v3, La/nvi0;

    .line 108
    .line 109
    iget-boolean v4, v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->d:Z

    .line 110
    .line 111
    if-nez v4, :cond_6

    .line 112
    .line 113
    iget-boolean v4, v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;->c:Z

    .line 114
    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_5
    move v4, v6

    .line 119
    goto :goto_5

    .line 120
    :cond_6
    :goto_4
    move v4, v5

    .line 121
    :goto_5
    invoke-direct {v3, v4}, La/nvi0;-><init>(Z)V

    .line 122
    .line 123
    .line 124
    const/16 v24, 0x0

    .line 125
    .line 126
    const/16 v25, 0x1fa

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/16 v20, 0x0

    .line 131
    .line 132
    const/16 v21, 0x0

    .line 133
    .line 134
    const/16 v22, 0x0

    .line 135
    .line 136
    const/16 v23, 0x0

    .line 137
    .line 138
    move-object/from16 v17, v1

    .line 139
    .line 140
    move-object/from16 v19, v3

    .line 141
    .line 142
    invoke-direct/range {v16 .. v25}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v11, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {v11, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    or-int/2addr v1, v3

    .line 154
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    sget-object v4, La/ukd;->a:La/cl5;

    .line 159
    .line 160
    if-nez v1, :cond_7

    .line 161
    .line 162
    if-ne v3, v4, :cond_8

    .line 163
    .line 164
    :cond_7
    new-instance v3, La/k4e0;

    .line 165
    .line 166
    invoke-direct {v3, v14, v0, v6}, La/k4e0;-><init>(La/l4e0;Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v11, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    move-object v7, v3

    .line 173
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 174
    .line 175
    invoke-virtual {v11, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {v11, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    or-int/2addr v1, v3

    .line 184
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    if-nez v1, :cond_9

    .line 189
    .line 190
    if-ne v3, v4, :cond_a

    .line 191
    .line 192
    :cond_9
    new-instance v3, La/k4e0;

    .line 193
    .line 194
    invoke-direct {v3, v14, v0, v5}, La/k4e0;-><init>(La/l4e0;Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v11, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_a
    move-object v9, v3

    .line 201
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 202
    .line 203
    const/16 v12, 0x180

    .line 204
    .line 205
    const/16 v13, 0xa9

    .line 206
    .line 207
    const/4 v3, 0x0

    .line 208
    move v0, v5

    .line 209
    const/4 v5, 0x0

    .line 210
    move v1, v6

    .line 211
    const/4 v6, 0x0

    .line 212
    const/4 v8, 0x0

    .line 213
    const/4 v10, 0x0

    .line 214
    move-object/from16 v4, v16

    .line 215
    .line 216
    invoke-static/range {v3 .. v13}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 217
    .line 218
    .line 219
    sget-object v3, La/l4e0;->n2:La/fl70;

    .line 220
    .line 221
    iget-object v3, v14, La/l4e0;->l2:La/lhf0;

    .line 222
    .line 223
    sget-object v4, La/l4e0;->o2:[La/iiy;

    .line 224
    .line 225
    aget-object v4, v4, v0

    .line 226
    .line 227
    invoke-virtual {v3, v14, v4}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    sub-int/2addr v3, v0

    .line 236
    if-eq v2, v3, :cond_b

    .line 237
    .line 238
    const v0, 0x106e82c4

    .line 239
    .line 240
    .line 241
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 242
    .line 243
    .line 244
    sget-object v0, La/qmk;->a:La/zcl;

    .line 245
    .line 246
    const/high16 v0, 0x41800000    # 16.0f

    .line 247
    .line 248
    const/4 v2, 0x0

    .line 249
    sget-object v3, La/jm40;->b:La/jm40;

    .line 250
    .line 251
    invoke-static {v3, v0, v2, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    const/4 v7, 0x6

    .line 256
    const/4 v8, 0x4

    .line 257
    sget-object v3, La/zfi0;->a:La/zfi0;

    .line 258
    .line 259
    const/4 v5, 0x0

    .line 260
    move-object v6, v11

    .line 261
    invoke-static/range {v3 .. v8}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11, v1}, La/fet;->r(Z)V

    .line 265
    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_b
    const v0, 0x1071da0d

    .line 269
    .line 270
    .line 271
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v11, v1}, La/fet;->r(Z)V

    .line 275
    .line 276
    .line 277
    :goto_6
    invoke-virtual {v11, v1}, La/fet;->r(Z)V

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_c
    invoke-virtual {v11}, La/fet;->X()V

    .line 282
    .line 283
    .line 284
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object v0
.end method

.method private final l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v6, p3

    .line 16
    .line 17
    check-cast v6, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object v4, v0, La/xe4;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, La/ljh0;

    .line 30
    .line 31
    and-int/lit8 v5, v3, 0x6

    .line 32
    .line 33
    const/4 v7, 0x2

    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v1, v7

    .line 45
    :goto_0
    or-int/2addr v1, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v1, v3

    .line 48
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    invoke-virtual {v6, v2}, La/fet;->e(I)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    const/16 v3, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v3, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v1, v3

    .line 64
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 65
    .line 66
    const/16 v5, 0x92

    .line 67
    .line 68
    const/4 v8, 0x1

    .line 69
    const/4 v9, 0x0

    .line 70
    if-eq v3, v5, :cond_4

    .line 71
    .line 72
    move v3, v8

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move v3, v9

    .line 75
    :goto_3
    and-int/2addr v1, v8

    .line 76
    invoke-virtual {v6, v1, v3}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_a

    .line 81
    .line 82
    iget-object v0, v0, La/xe4;->b:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;

    .line 89
    .line 90
    const v1, -0x7e760162

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 94
    .line 95
    .line 96
    sget-object v1, La/jm40;->b:La/jm40;

    .line 97
    .line 98
    const/high16 v3, 0x3f800000    # 1.0f

    .line 99
    .line 100
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    sget-object v10, La/qmk;->a:La/zcl;

    .line 105
    .line 106
    const/high16 v10, 0x42400000    # 48.0f

    .line 107
    .line 108
    invoke-static {v5, v10}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const/high16 v10, 0x41800000    # 16.0f

    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    invoke-static {v5, v10, v11, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    invoke-virtual {v6, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-virtual {v6, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    or-int/2addr v5, v7

    .line 128
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    if-nez v5, :cond_5

    .line 133
    .line 134
    sget-object v5, La/ukd;->a:La/cl5;

    .line 135
    .line 136
    if-ne v7, v5, :cond_6

    .line 137
    .line 138
    :cond_5
    new-instance v7, La/sue0;

    .line 139
    .line 140
    const/16 v5, 0xd

    .line 141
    .line 142
    invoke-direct {v7, v4, v0, v5}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_6
    move-object/from16 v17, v7

    .line 149
    .line 150
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 151
    .line 152
    const/16 v18, 0x1c

    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x0

    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    sget-object v7, La/gqw0;->a:La/zx7;

    .line 164
    .line 165
    invoke-static {v7, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    iget-wide v10, v6, La/fet;->T:J

    .line 170
    .line 171
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-static {v6, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 184
    .line 185
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6}, La/fet;->i0()V

    .line 189
    .line 190
    .line 191
    iget-boolean v12, v6, La/fet;->S:Z

    .line 192
    .line 193
    if-eqz v12, :cond_7

    .line 194
    .line 195
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 196
    .line 197
    invoke-virtual {v6, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_7
    invoke-virtual {v6}, La/fet;->r0()V

    .line 202
    .line 203
    .line 204
    :goto_4
    sget-object v12, La/gqw0;->x:La/shd;

    .line 205
    .line 206
    invoke-static {v6, v7, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    sget-object v7, La/gqw0;->w:La/shd;

    .line 210
    .line 211
    invoke-static {v6, v11, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    sget-object v10, La/gqw0;->y:La/shd;

    .line 219
    .line 220
    invoke-static {v6, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 224
    .line 225
    .line 226
    sget-object v7, La/gqw0;->v:La/shd;

    .line 227
    .line 228
    invoke-static {v6, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 229
    .line 230
    .line 231
    sget-object v5, La/gqw0;->d:La/zx7;

    .line 232
    .line 233
    sget-object v7, La/jr8;->a:La/jr8;

    .line 234
    .line 235
    invoke-virtual {v7, v1, v5}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    move v10, v3

    .line 240
    iget-object v3, v0, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;->b:Ljava/lang/String;

    .line 241
    .line 242
    sget-object v17, La/j1t0;->c:La/qrq;

    .line 243
    .line 244
    sget-wide v14, La/qmk;->s:J

    .line 245
    .line 246
    sget-wide v23, La/qmk;->G:J

    .line 247
    .line 248
    new-instance v11, La/y9q0;

    .line 249
    .line 250
    const/16 v22, 0x0

    .line 251
    .line 252
    const v25, 0xfdffdd

    .line 253
    .line 254
    .line 255
    const-wide/16 v12, 0x0

    .line 256
    .line 257
    const/16 v16, 0x0

    .line 258
    .line 259
    const-wide/16 v18, 0x0

    .line 260
    .line 261
    const/16 v20, 0x0

    .line 262
    .line 263
    const/16 v21, 0x0

    .line 264
    .line 265
    invoke-direct/range {v11 .. v25}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 266
    .line 267
    .line 268
    iget-boolean v0, v0, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;->c:Z

    .line 269
    .line 270
    if-eqz v0, :cond_8

    .line 271
    .line 272
    const v0, 0x2005486a

    .line 273
    .line 274
    .line 275
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 276
    .line 277
    .line 278
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 279
    .line 280
    invoke-virtual {v6, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 285
    .line 286
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 287
    .line 288
    .line 289
    move-result-wide v12

    .line 290
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 291
    .line 292
    .line 293
    :goto_5
    move-wide/from16 v26, v12

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_8
    const v0, 0x2006f706

    .line 297
    .line 298
    .line 299
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 300
    .line 301
    .line 302
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 303
    .line 304
    invoke-virtual {v6, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 309
    .line 310
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 311
    .line 312
    .line 313
    move-result-wide v12

    .line 314
    invoke-virtual {v6, v9}, La/fet;->r(Z)V

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :goto_6
    const/16 v42, 0x0

    .line 319
    .line 320
    const v43, 0xfffffe

    .line 321
    .line 322
    .line 323
    const-wide/16 v28, 0x0

    .line 324
    .line 325
    const/16 v30, 0x0

    .line 326
    .line 327
    const/16 v31, 0x0

    .line 328
    .line 329
    const/16 v32, 0x0

    .line 330
    .line 331
    const-wide/16 v33, 0x0

    .line 332
    .line 333
    const/16 v35, 0x0

    .line 334
    .line 335
    const/16 v36, 0x0

    .line 336
    .line 337
    const/16 v37, 0x0

    .line 338
    .line 339
    const/16 v38, 0x0

    .line 340
    .line 341
    const-wide/16 v39, 0x0

    .line 342
    .line 343
    const/16 v41, 0x0

    .line 344
    .line 345
    move-object/from16 v25, v11

    .line 346
    .line 347
    invoke-static/range {v25 .. v43}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 348
    .line 349
    .line 350
    move-result-object v23

    .line 351
    const/16 v26, 0x180

    .line 352
    .line 353
    const v27, 0x1effc

    .line 354
    .line 355
    .line 356
    move-object v0, v4

    .line 357
    move-object v4, v5

    .line 358
    move-object/from16 v24, v6

    .line 359
    .line 360
    const-wide/16 v5, 0x0

    .line 361
    .line 362
    move-object v11, v7

    .line 363
    const/4 v7, 0x0

    .line 364
    move v12, v8

    .line 365
    move v13, v9

    .line 366
    const-wide/16 v8, 0x0

    .line 367
    .line 368
    move v14, v10

    .line 369
    const/4 v10, 0x0

    .line 370
    move-object v15, v11

    .line 371
    const/4 v11, 0x0

    .line 372
    move/from16 v16, v12

    .line 373
    .line 374
    const/4 v12, 0x0

    .line 375
    move/from16 v18, v13

    .line 376
    .line 377
    move/from16 v17, v14

    .line 378
    .line 379
    const-wide/16 v13, 0x0

    .line 380
    .line 381
    move-object/from16 v19, v15

    .line 382
    .line 383
    const/4 v15, 0x0

    .line 384
    move/from16 v21, v16

    .line 385
    .line 386
    move/from16 v20, v17

    .line 387
    .line 388
    const-wide/16 v16, 0x0

    .line 389
    .line 390
    move/from16 v22, v18

    .line 391
    .line 392
    const/16 v18, 0x2

    .line 393
    .line 394
    move-object/from16 v25, v19

    .line 395
    .line 396
    const/16 v19, 0x0

    .line 397
    .line 398
    move/from16 v28, v20

    .line 399
    .line 400
    const/16 v20, 0x0

    .line 401
    .line 402
    move/from16 v29, v21

    .line 403
    .line 404
    const/16 v21, 0x0

    .line 405
    .line 406
    move/from16 v30, v22

    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    move-object/from16 v31, v25

    .line 411
    .line 412
    const/16 v25, 0x0

    .line 413
    .line 414
    move-object/from16 p0, v1

    .line 415
    .line 416
    move-object/from16 v1, v31

    .line 417
    .line 418
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 419
    .line 420
    .line 421
    move-object/from16 v6, v24

    .line 422
    .line 423
    sget-object v3, La/ljh0;->m2:La/lme0;

    .line 424
    .line 425
    iget-object v3, v0, La/ljh0;->k2:La/es;

    .line 426
    .line 427
    sget-object v4, La/ljh0;->n2:[La/iiy;

    .line 428
    .line 429
    aget-object v4, v4, v30

    .line 430
    .line 431
    invoke-virtual {v3, v0, v4}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    add-int/lit8 v0, v0, -0x1

    .line 440
    .line 441
    if-eq v2, v0, :cond_9

    .line 442
    .line 443
    const v0, 0x200c1d40

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 447
    .line 448
    .line 449
    const/high16 v14, 0x3f800000    # 1.0f

    .line 450
    .line 451
    move-object/from16 v0, p0

    .line 452
    .line 453
    invoke-static {v0, v14}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    sget-object v2, La/gqw0;->i:La/zx7;

    .line 458
    .line 459
    invoke-virtual {v1, v0, v2}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 460
    .line 461
    .line 462
    move-result-object v4

    .line 463
    const/4 v7, 0x6

    .line 464
    const/4 v8, 0x4

    .line 465
    sget-object v3, La/zfi0;->a:La/zfi0;

    .line 466
    .line 467
    const/4 v5, 0x0

    .line 468
    invoke-static/range {v3 .. v8}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 469
    .line 470
    .line 471
    move/from16 v13, v30

    .line 472
    .line 473
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 474
    .line 475
    .line 476
    :goto_7
    move/from16 v12, v29

    .line 477
    .line 478
    goto :goto_8

    .line 479
    :cond_9
    move/from16 v13, v30

    .line 480
    .line 481
    const v0, 0x201111f3

    .line 482
    .line 483
    .line 484
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 488
    .line 489
    .line 490
    goto :goto_7

    .line 491
    :goto_8
    invoke-virtual {v6, v12}, La/fet;->r(Z)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 495
    .line 496
    .line 497
    goto :goto_9

    .line 498
    :cond_a
    invoke-virtual {v6}, La/fet;->X()V

    .line 499
    .line 500
    .line 501
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    return-object v0
.end method

.method private final m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v9, p3

    .line 16
    .line 17
    check-cast v9, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    and-int/lit8 v4, v3, 0x6

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    const/4 v6, 0x2

    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    move v1, v5

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v1, v6

    .line 42
    :goto_0
    or-int/2addr v1, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v1, v3

    .line 45
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 46
    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    invoke-virtual {v9, v2}, La/fet;->e(I)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    const/16 v3, 0x20

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/16 v3, 0x10

    .line 59
    .line 60
    :goto_2
    or-int/2addr v1, v3

    .line 61
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 62
    .line 63
    const/16 v4, 0x92

    .line 64
    .line 65
    const/4 v7, 0x1

    .line 66
    const/4 v12, 0x0

    .line 67
    if-eq v3, v4, :cond_4

    .line 68
    .line 69
    move v3, v7

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    move v3, v12

    .line 72
    :goto_3
    and-int/2addr v1, v7

    .line 73
    invoke-virtual {v9, v1, v3}, La/fet;->U(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_e

    .line 78
    .line 79
    iget-object v1, v0, La/xe4;->b:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, La/p6t0;

    .line 86
    .line 87
    const v2, -0x62f952b4

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9, v2}, La/fet;->e0(I)V

    .line 91
    .line 92
    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_5
    instance-of v2, v1, La/rfl0;

    .line 98
    .line 99
    sget-object v13, La/jm40;->b:La/jm40;

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    const v2, -0x62f93032

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v2}, La/fet;->e0(I)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, La/xe4;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/j8l0;

    .line 113
    .line 114
    sget-object v2, La/lgl0;->a:[I

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    aget v0, v2, v0

    .line 121
    .line 122
    if-ne v0, v7, :cond_6

    .line 123
    .line 124
    const v0, -0x62f7697d

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget v0, v0, La/wfn;->e:F

    .line 135
    .line 136
    invoke-static {v13, v0, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    sget-object v0, La/qmk;->a:La/zcl;

    .line 141
    .line 142
    const/high16 v18, 0x41000000    # 8.0f

    .line 143
    .line 144
    const/16 v19, 0x7

    .line 145
    .line 146
    const/4 v15, 0x0

    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 156
    .line 157
    .line 158
    :goto_4
    move-object v3, v0

    .line 159
    goto :goto_5

    .line 160
    :cond_6
    const v0, -0x62f38296

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 164
    .line 165
    .line 166
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget v0, v0, La/wfn;->d:F

    .line 171
    .line 172
    invoke-static {v13, v0, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 177
    .line 178
    .line 179
    goto :goto_4

    .line 180
    :goto_5
    check-cast v1, La/rfl0;

    .line 181
    .line 182
    iget-object v4, v1, La/rfl0;->a:La/jjm;

    .line 183
    .line 184
    sget-object v5, La/kjm;->b:La/kjm;

    .line 185
    .line 186
    const/16 v10, 0x180

    .line 187
    .line 188
    const/16 v11, 0x38

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    invoke-static/range {v3 .. v11}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_8

    .line 200
    .line 201
    :cond_7
    instance-of v0, v1, La/qfl0;

    .line 202
    .line 203
    if-eqz v0, :cond_c

    .line 204
    .line 205
    const v0, -0x62ec6385

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 209
    .line 210
    .line 211
    check-cast v1, La/qfl0;

    .line 212
    .line 213
    iget-object v0, v1, La/qfl0;->a:La/j8l0;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_b

    .line 220
    .line 221
    if-eq v0, v7, :cond_a

    .line 222
    .line 223
    if-eq v0, v6, :cond_a

    .line 224
    .line 225
    const/4 v1, 0x3

    .line 226
    if-eq v0, v1, :cond_9

    .line 227
    .line 228
    if-ne v0, v5, :cond_8

    .line 229
    .line 230
    const v0, -0x62e1c592

    .line 231
    .line 232
    .line 233
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 234
    .line 235
    .line 236
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget v0, v0, La/wfn;->d:F

    .line 241
    .line 242
    invoke-static {v13, v0, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v12, v9, v0}, La/ahy;->N(ILa/fet;La/mm40;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 250
    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_8
    const v0, -0x55c58f99

    .line 254
    .line 255
    .line 256
    invoke-static {v0, v9, v12}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    throw v0

    .line 261
    :cond_9
    const v0, -0x62dd5e6e

    .line 262
    .line 263
    .line 264
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 265
    .line 266
    .line 267
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    iget v0, v0, La/wfn;->d:F

    .line 272
    .line 273
    invoke-static {v13, v0, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v12, v9, v0}, La/ahy;->x(ILa/fet;La/mm40;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_a
    const v0, -0x62e62d13

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 288
    .line 289
    .line 290
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    iget v0, v0, La/wfn;->d:F

    .line 295
    .line 296
    invoke-static {v13, v0, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v12, v9, v0}, La/ahy;->C(ILa/fet;La/mm40;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_b
    const v0, -0x62eb75ef

    .line 308
    .line 309
    .line 310
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 311
    .line 312
    .line 313
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iget v0, v0, La/wfn;->d:F

    .line 318
    .line 319
    invoke-static {v13, v0, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v12, v9, v0}, La/ahy;->E(ILa/fet;La/mm40;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 327
    .line 328
    .line 329
    :goto_6
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 330
    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_c
    instance-of v0, v1, La/rer0;

    .line 334
    .line 335
    if-eqz v0, :cond_d

    .line 336
    .line 337
    const v0, -0x62d8f006

    .line 338
    .line 339
    .line 340
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 341
    .line 342
    .line 343
    sget-object v0, La/qmk;->a:La/zcl;

    .line 344
    .line 345
    const/high16 v17, 0x41400000    # 12.0f

    .line 346
    .line 347
    const/16 v18, 0x7

    .line 348
    .line 349
    const/4 v14, 0x0

    .line 350
    const/4 v15, 0x0

    .line 351
    const/16 v16, 0x0

    .line 352
    .line 353
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v1, La/rer0;

    .line 358
    .line 359
    iget-object v1, v1, La/rer0;->a:La/f3n;

    .line 360
    .line 361
    const/4 v2, 0x0

    .line 362
    const/16 v3, 0xc

    .line 363
    .line 364
    invoke-static {v0, v1, v2, v9, v3}, La/qcc;->m(La/mm40;La/f3n;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 368
    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_d
    :goto_7
    const v0, -0x62d5b839

    .line 372
    .line 373
    .line 374
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 378
    .line 379
    .line 380
    :goto_8
    invoke-virtual {v9, v12}, La/fet;->r(Z)V

    .line 381
    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_e
    invoke-virtual {v9}, La/fet;->X()V

    .line 385
    .line 386
    .line 387
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    return-object v0
.end method

.method private final o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v3, p3

    .line 16
    .line 17
    check-cast v3, La/fet;

    .line 18
    .line 19
    move-object/from16 v4, p4

    .line 20
    .line 21
    check-cast v4, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    and-int/lit8 v5, v4, 0x6

    .line 28
    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v4

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v4

    .line 43
    :goto_1
    and-int/lit8 v4, v4, 0x30

    .line 44
    .line 45
    if-nez v4, :cond_3

    .line 46
    .line 47
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    const/16 v4, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v4, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v1, v4

    .line 59
    :cond_3
    and-int/lit16 v4, v1, 0x93

    .line 60
    .line 61
    const/16 v5, 0x92

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x1

    .line 65
    if-eq v4, v5, :cond_4

    .line 66
    .line 67
    move v4, v7

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v4, v6

    .line 70
    :goto_3
    and-int/2addr v1, v7

    .line 71
    invoke-virtual {v3, v1, v4}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    iget-object v1, v0, La/xe4;->b:Ljava/util/List;

    .line 78
    .line 79
    check-cast v1, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, La/i1m0;

    .line 86
    .line 87
    const v2, 0x7e0294e3

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 91
    .line 92
    .line 93
    iget-object v4, v1, La/i1m0;->a:La/a1m0;

    .line 94
    .line 95
    iget-object v0, v0, La/xe4;->c:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v5, v0

    .line 98
    check-cast v5, La/xcz;

    .line 99
    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    const v18, 0x1801c0

    .line 103
    .line 104
    .line 105
    move-object/from16 v17, v3

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    move v0, v6

    .line 109
    const/4 v6, 0x0

    .line 110
    const-wide/16 v7, 0x0

    .line 111
    .line 112
    const-wide/16 v9, 0x0

    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v14, 0x0

    .line 118
    const/4 v15, 0x0

    .line 119
    invoke-static/range {v3 .. v18}, La/cfx0;->d(La/mm40;La/a1m0;La/xcz;ZJJLkotlin/jvm/functions/Function0;La/ydr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;La/fet;I)V

    .line 120
    .line 121
    .line 122
    move-object/from16 v1, v17

    .line 123
    .line 124
    invoke-virtual {v1, v0}, La/fet;->r(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move-object v1, v3

    .line 129
    invoke-virtual {v1}, La/fet;->X()V

    .line 130
    .line 131
    .line 132
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0
.end method

.method private final p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v6, p3

    .line 16
    .line 17
    check-cast v6, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object v4, v0, La/xe4;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, La/fcm0;

    .line 30
    .line 31
    and-int/lit8 v5, v3, 0x6

    .line 32
    .line 33
    const/4 v7, 0x2

    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v1, v7

    .line 45
    :goto_0
    or-int/2addr v1, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v1, v3

    .line 48
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    invoke-virtual {v6, v2}, La/fet;->e(I)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    const/16 v3, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v3, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v1, v3

    .line 64
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 65
    .line 66
    const/16 v5, 0x92

    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x1

    .line 70
    if-eq v3, v5, :cond_4

    .line 71
    .line 72
    move v3, v9

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move v3, v8

    .line 75
    :goto_3
    and-int/2addr v1, v9

    .line 76
    invoke-virtual {v6, v1, v3}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_9

    .line 81
    .line 82
    iget-object v0, v0, La/xe4;->b:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;

    .line 89
    .line 90
    const v1, 0x2ca206b6

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 94
    .line 95
    .line 96
    sget-object v1, La/jm40;->b:La/jm40;

    .line 97
    .line 98
    const/high16 v3, 0x3f800000    # 1.0f

    .line 99
    .line 100
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    sget-object v10, La/qmk;->a:La/zcl;

    .line 105
    .line 106
    const/high16 v10, 0x42400000    # 48.0f

    .line 107
    .line 108
    invoke-static {v5, v10}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const/high16 v10, 0x41800000    # 16.0f

    .line 113
    .line 114
    const/4 v11, 0x0

    .line 115
    invoke-static {v5, v10, v11, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    invoke-virtual {v6, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-virtual {v6, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    or-int/2addr v5, v7

    .line 128
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    if-nez v5, :cond_5

    .line 133
    .line 134
    sget-object v5, La/ukd;->a:La/cl5;

    .line 135
    .line 136
    if-ne v7, v5, :cond_6

    .line 137
    .line 138
    :cond_5
    new-instance v7, La/sue0;

    .line 139
    .line 140
    const/16 v5, 0x1d

    .line 141
    .line 142
    invoke-direct {v7, v4, v0, v5}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_6
    move-object/from16 v17, v7

    .line 149
    .line 150
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 151
    .line 152
    const/16 v18, 0x1c

    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x0

    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    sget-object v7, La/gqw0;->a:La/zx7;

    .line 164
    .line 165
    invoke-static {v7, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    iget-wide v10, v6, La/fet;->T:J

    .line 170
    .line 171
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-static {v6, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 184
    .line 185
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6}, La/fet;->i0()V

    .line 189
    .line 190
    .line 191
    iget-boolean v12, v6, La/fet;->S:Z

    .line 192
    .line 193
    if-eqz v12, :cond_7

    .line 194
    .line 195
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 196
    .line 197
    invoke-virtual {v6, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_7
    invoke-virtual {v6}, La/fet;->r0()V

    .line 202
    .line 203
    .line 204
    :goto_4
    sget-object v12, La/gqw0;->x:La/shd;

    .line 205
    .line 206
    invoke-static {v6, v7, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    sget-object v7, La/gqw0;->w:La/shd;

    .line 210
    .line 211
    invoke-static {v6, v11, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    sget-object v10, La/gqw0;->y:La/shd;

    .line 219
    .line 220
    invoke-static {v6, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 224
    .line 225
    .line 226
    sget-object v7, La/gqw0;->v:La/shd;

    .line 227
    .line 228
    invoke-static {v6, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 229
    .line 230
    .line 231
    sget-object v5, La/gqw0;->d:La/zx7;

    .line 232
    .line 233
    sget-object v7, La/jr8;->a:La/jr8;

    .line 234
    .line 235
    invoke-virtual {v7, v1, v5}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    iget-object v0, v0, Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;->c:Ljava/lang/String;

    .line 240
    .line 241
    sget-object v16, La/j1t0;->c:La/qrq;

    .line 242
    .line 243
    sget-wide v13, La/qmk;->s:J

    .line 244
    .line 245
    sget-wide v22, La/qmk;->G:J

    .line 246
    .line 247
    new-instance v24, La/y9q0;

    .line 248
    .line 249
    const/16 v21, 0x0

    .line 250
    .line 251
    move-object/from16 v10, v24

    .line 252
    .line 253
    const v24, 0xfdffdd

    .line 254
    .line 255
    .line 256
    const-wide/16 v11, 0x0

    .line 257
    .line 258
    const/4 v15, 0x0

    .line 259
    const-wide/16 v17, 0x0

    .line 260
    .line 261
    const/16 v19, 0x0

    .line 262
    .line 263
    const/16 v20, 0x0

    .line 264
    .line 265
    invoke-direct/range {v10 .. v24}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 266
    .line 267
    .line 268
    sget-object v11, La/zaq0;->b:La/zfn;

    .line 269
    .line 270
    invoke-virtual {v6, v11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    check-cast v11, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 275
    .line 276
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 277
    .line 278
    .line 279
    move-result-wide v25

    .line 280
    const/16 v41, 0x0

    .line 281
    .line 282
    const v42, 0xfffffe

    .line 283
    .line 284
    .line 285
    const-wide/16 v27, 0x0

    .line 286
    .line 287
    const/16 v29, 0x0

    .line 288
    .line 289
    const/16 v30, 0x0

    .line 290
    .line 291
    const/16 v31, 0x0

    .line 292
    .line 293
    const-wide/16 v32, 0x0

    .line 294
    .line 295
    const/16 v34, 0x0

    .line 296
    .line 297
    const/16 v35, 0x0

    .line 298
    .line 299
    const/16 v36, 0x0

    .line 300
    .line 301
    const/16 v37, 0x0

    .line 302
    .line 303
    const-wide/16 v38, 0x0

    .line 304
    .line 305
    const/16 v40, 0x0

    .line 306
    .line 307
    move-object/from16 v24, v10

    .line 308
    .line 309
    invoke-static/range {v24 .. v42}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 310
    .line 311
    .line 312
    move-result-object v23

    .line 313
    const/16 v26, 0x180

    .line 314
    .line 315
    const v27, 0x1effc

    .line 316
    .line 317
    .line 318
    move-object v10, v4

    .line 319
    move-object v4, v5

    .line 320
    move-object/from16 v24, v6

    .line 321
    .line 322
    const-wide/16 v5, 0x0

    .line 323
    .line 324
    move-object v11, v7

    .line 325
    const/4 v7, 0x0

    .line 326
    move v12, v8

    .line 327
    move v13, v9

    .line 328
    const-wide/16 v8, 0x0

    .line 329
    .line 330
    move-object v14, v10

    .line 331
    const/4 v10, 0x0

    .line 332
    move-object v15, v11

    .line 333
    const/4 v11, 0x0

    .line 334
    move/from16 v16, v12

    .line 335
    .line 336
    const/4 v12, 0x0

    .line 337
    move/from16 v18, v13

    .line 338
    .line 339
    move-object/from16 v17, v14

    .line 340
    .line 341
    const-wide/16 v13, 0x0

    .line 342
    .line 343
    move-object/from16 v19, v15

    .line 344
    .line 345
    const/4 v15, 0x0

    .line 346
    move/from16 v21, v16

    .line 347
    .line 348
    move-object/from16 v20, v17

    .line 349
    .line 350
    const-wide/16 v16, 0x0

    .line 351
    .line 352
    move/from16 v22, v18

    .line 353
    .line 354
    const/16 v18, 0x2

    .line 355
    .line 356
    move-object/from16 v25, v19

    .line 357
    .line 358
    const/16 v19, 0x0

    .line 359
    .line 360
    move-object/from16 v28, v20

    .line 361
    .line 362
    const/16 v20, 0x0

    .line 363
    .line 364
    move/from16 v29, v21

    .line 365
    .line 366
    const/16 v21, 0x0

    .line 367
    .line 368
    move/from16 v30, v22

    .line 369
    .line 370
    const/16 v22, 0x0

    .line 371
    .line 372
    move-object/from16 v31, v25

    .line 373
    .line 374
    const/16 v25, 0x0

    .line 375
    .line 376
    move-object v3, v0

    .line 377
    move-object/from16 p0, v1

    .line 378
    .line 379
    move-object/from16 v0, v28

    .line 380
    .line 381
    move-object/from16 v1, v31

    .line 382
    .line 383
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 384
    .line 385
    .line 386
    move-object/from16 v6, v24

    .line 387
    .line 388
    sget-object v3, La/fcm0;->n2:La/j6m0;

    .line 389
    .line 390
    iget-object v3, v0, La/fcm0;->l2:La/es;

    .line 391
    .line 392
    sget-object v4, La/fcm0;->o2:[La/iiy;

    .line 393
    .line 394
    aget-object v4, v4, v30

    .line 395
    .line 396
    invoke-virtual {v3, v0, v4}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    add-int/lit8 v0, v0, -0x1

    .line 405
    .line 406
    if-eq v2, v0, :cond_8

    .line 407
    .line 408
    const v0, -0x7ea0d780

    .line 409
    .line 410
    .line 411
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x3f800000    # 1.0f

    .line 415
    .line 416
    move-object/from16 v2, p0

    .line 417
    .line 418
    invoke-static {v2, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    sget-object v2, La/gqw0;->i:La/zx7;

    .line 423
    .line 424
    invoke-virtual {v1, v0, v2}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    const/4 v7, 0x6

    .line 429
    const/4 v8, 0x4

    .line 430
    sget-object v3, La/zfi0;->a:La/zfi0;

    .line 431
    .line 432
    const/4 v5, 0x0

    .line 433
    invoke-static/range {v3 .. v8}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 434
    .line 435
    .line 436
    const/4 v12, 0x0

    .line 437
    invoke-virtual {v6, v12}, La/fet;->r(Z)V

    .line 438
    .line 439
    .line 440
    :goto_5
    move/from16 v13, v30

    .line 441
    .line 442
    goto :goto_6

    .line 443
    :cond_8
    const/4 v12, 0x0

    .line 444
    const v0, -0x7e9be2cd

    .line 445
    .line 446
    .line 447
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6, v12}, La/fet;->r(Z)V

    .line 451
    .line 452
    .line 453
    goto :goto_5

    .line 454
    :goto_6
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v6, v12}, La/fet;->r(Z)V

    .line 458
    .line 459
    .line 460
    goto :goto_7

    .line 461
    :cond_9
    invoke-virtual {v6}, La/fet;->X()V

    .line 462
    .line 463
    .line 464
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 465
    .line 466
    return-object v0
.end method

.method private final r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v7, p3

    .line 16
    .line 17
    check-cast v7, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    and-int/lit8 v4, v3, 0x6

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v3

    .line 43
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v7, v2}, La/fet;->e(I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v1, v3

    .line 59
    :cond_3
    and-int/lit16 v3, v1, 0x93

    .line 60
    .line 61
    const/16 v4, 0x92

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v5, 0x1

    .line 65
    if-eq v3, v4, :cond_4

    .line 66
    .line 67
    move v3, v5

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v3, v9

    .line 70
    :goto_3
    and-int/2addr v1, v5

    .line 71
    invoke-virtual {v7, v1, v3}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_7

    .line 76
    .line 77
    iget-object v1, v0, La/xe4;->b:Ljava/util/List;

    .line 78
    .line 79
    check-cast v1, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    move-object v4, v1

    .line 86
    check-cast v4, La/s6x;

    .line 87
    .line 88
    const v1, 0x4356e733

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v1}, La/fet;->e0(I)V

    .line 92
    .line 93
    .line 94
    sget-object v1, La/jm40;->b:La/jm40;

    .line 95
    .line 96
    const/high16 v3, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    const/4 v1, 0x0

    .line 103
    sget-object v3, La/qmk;->a:La/zcl;

    .line 104
    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    const/high16 v3, 0x41800000    # 16.0f

    .line 108
    .line 109
    move v12, v3

    .line 110
    goto :goto_4

    .line 111
    :cond_5
    move v12, v1

    .line 112
    :goto_4
    iget-object v0, v0, La/xe4;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, La/pop0;

    .line 115
    .line 116
    iget-object v0, v0, La/pop0;->c:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    sub-int/2addr v0, v5

    .line 123
    if-ne v2, v0, :cond_6

    .line 124
    .line 125
    const/high16 v1, 0x41c00000    # 24.0f

    .line 126
    .line 127
    :cond_6
    move v14, v1

    .line 128
    const/4 v15, 0x5

    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v8, 0x0

    .line 137
    const/4 v5, 0x0

    .line 138
    invoke-static/range {v3 .. v8}, La/xkb;->r(La/mm40;La/s6x;IILa/fet;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, v9}, La/fet;->r(Z)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_7
    invoke-virtual {v7}, La/fet;->X()V

    .line 146
    .line 147
    .line 148
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object v0
.end method

.method private final s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    move-object v3, p3

    .line 10
    check-cast v3, La/fet;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    and-int/lit8 p4, p3, 0x6

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    if-nez p4, :cond_1

    .line 22
    .line 23
    invoke-virtual {v3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v0

    .line 32
    :goto_0
    or-int/2addr p1, p3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move p1, p3

    .line 35
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 36
    .line 37
    if-nez p3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v3, p2}, La/fet;->e(I)Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-eqz p3, :cond_2

    .line 44
    .line 45
    const/16 p3, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 p3, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr p1, p3

    .line 51
    :cond_3
    and-int/lit16 p3, p1, 0x93

    .line 52
    .line 53
    const/16 p4, 0x92

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    const/4 v6, 0x0

    .line 57
    if-eq p3, p4, :cond_4

    .line 58
    .line 59
    move p3, v1

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    move p3, v6

    .line 62
    :goto_3
    and-int/2addr p1, v1

    .line 63
    invoke-virtual {v3, p1, p3}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_6

    .line 68
    .line 69
    iget-object p1, p0, La/xe4;->b:Ljava/util/List;

    .line 70
    .line 71
    check-cast p1, La/a4x;

    .line 72
    .line 73
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, La/ear0;

    .line 78
    .line 79
    const p3, -0x12f06cae

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, p3}, La/fet;->e0(I)V

    .line 83
    .line 84
    .line 85
    const/4 p3, 0x0

    .line 86
    invoke-static {p3, p1, v3, v6}, La/wgm0;->f(La/mm40;La/ear0;La/fet;I)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/xe4;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, La/gar0;

    .line 92
    .line 93
    iget-object p0, p0, La/gar0;->a:La/a4x;

    .line 94
    .line 95
    invoke-static {p0}, La/q3d;->i(Ljava/util/List;)I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eq p2, p0, :cond_5

    .line 100
    .line 101
    const p0, -0x12ee6ac3

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, p0}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    sget-object p0, La/qmk;->a:La/zcl;

    .line 108
    .line 109
    const/high16 p0, 0x41800000    # 16.0f

    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    sget-object p2, La/jm40;->b:La/jm40;

    .line 113
    .line 114
    invoke-static {p2, p0, p1, v0}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const/4 v4, 0x6

    .line 119
    const/4 v5, 0x4

    .line 120
    sget-object v0, La/zfi0;->a:La/zfi0;

    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    invoke-static/range {v0 .. v5}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v6}, La/fet;->r(Z)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    const p0, -0x12ea7c5a

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, p0}, La/fet;->e0(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v6}, La/fet;->r(Z)V

    .line 137
    .line 138
    .line 139
    :goto_4
    invoke-virtual {v3, v6}, La/fet;->r(Z)V

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_6
    invoke-virtual {v3}, La/fet;->X()V

    .line 144
    .line 145
    .line 146
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0
.end method

.method private final t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/g9z;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, La/fet;

    .line 10
    .line 11
    check-cast p4, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    and-int/lit8 v0, p4, 0x6

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x2

    .line 30
    :goto_0
    or-int/2addr p1, p4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move p1, p4

    .line 33
    :goto_1
    and-int/lit8 p4, p4, 0x30

    .line 34
    .line 35
    if-nez p4, :cond_3

    .line 36
    .line 37
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    if-eqz p4, :cond_2

    .line 42
    .line 43
    const/16 p4, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 p4, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr p1, p4

    .line 49
    :cond_3
    and-int/lit16 p4, p1, 0x93

    .line 50
    .line 51
    const/16 v0, 0x92

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    const/4 v2, 0x0

    .line 55
    if-eq p4, v0, :cond_4

    .line 56
    .line 57
    move p4, v1

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move p4, v2

    .line 60
    :goto_3
    and-int/2addr p1, v1

    .line 61
    invoke-virtual {p3, p1, p4}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_c

    .line 66
    .line 67
    iget-object p1, p0, La/xe4;->b:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, La/o9r0;

    .line 74
    .line 75
    const p4, 0x533d423d

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3, p4}, La/fet;->e0(I)V

    .line 79
    .line 80
    .line 81
    if-nez p2, :cond_5

    .line 82
    .line 83
    move p4, v1

    .line 84
    goto :goto_4

    .line 85
    :cond_5
    move p4, v2

    .line 86
    :goto_4
    iget-object v0, p1, La/o9r0;->a:Ljava/lang/String;

    .line 87
    .line 88
    iget-object p1, p1, La/o9r0;->b:La/a4x;

    .line 89
    .line 90
    invoke-static {v2, p3, v0, p4}, La/ju70;->g(ILa/fet;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    sget-object p4, La/jm40;->b:La/jm40;

    .line 94
    .line 95
    const/high16 v0, 0x3f800000    # 1.0f

    .line 96
    .line 97
    invoke-static {p4, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-object p0, p0, La/xe4;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, La/jcr0;

    .line 104
    .line 105
    iget-object p0, p0, La/jcr0;->b:La/a4x;

    .line 106
    .line 107
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    sub-int/2addr p0, v1

    .line 112
    if-ne p2, p0, :cond_6

    .line 113
    .line 114
    sget-object p0, La/qmk;->a:La/zcl;

    .line 115
    .line 116
    const/high16 p0, 0x41c00000    # 24.0f

    .line 117
    .line 118
    :goto_5
    move v7, p0

    .line 119
    goto :goto_6

    .line 120
    :cond_6
    sget-object p0, La/qmk;->a:La/zcl;

    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    goto :goto_5

    .line 124
    :goto_6
    const/4 v8, 0x7

    .line 125
    const/4 v4, 0x0

    .line 126
    const/4 v5, 0x0

    .line 127
    const/4 v6, 0x0

    .line 128
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    sget-object p2, La/uc9;->c:La/mw3;

    .line 133
    .line 134
    sget-object p4, La/gqw0;->m:La/xx7;

    .line 135
    .line 136
    invoke-static {p2, p4, p3, v2}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    iget-wide v3, p3, La/fet;->T:J

    .line 141
    .line 142
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 143
    .line 144
    .line 145
    move-result p4

    .line 146
    invoke-virtual {p3}, La/fet;->m()La/bh90;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {p3, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3}, La/fet;->i0()V

    .line 160
    .line 161
    .line 162
    iget-boolean v3, p3, La/fet;->S:Z

    .line 163
    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 167
    .line 168
    invoke-virtual {p3, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 169
    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_7
    invoke-virtual {p3}, La/fet;->r0()V

    .line 173
    .line 174
    .line 175
    :goto_7
    sget-object v3, La/gqw0;->x:La/shd;

    .line 176
    .line 177
    invoke-static {p3, p2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    sget-object p2, La/gqw0;->w:La/shd;

    .line 181
    .line 182
    invoke-static {p3, v0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    sget-object p4, La/gqw0;->y:La/shd;

    .line 190
    .line 191
    invoke-static {p3, p2, p4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-static {p3}, La/jpm0;->n(La/fet;)V

    .line 195
    .line 196
    .line 197
    sget-object p2, La/gqw0;->v:La/shd;

    .line 198
    .line 199
    const p4, -0x5274e14e

    .line 200
    .line 201
    .line 202
    invoke-static {p3, p0, p2, p4, p1}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    move p2, v2

    .line 207
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result p4

    .line 211
    if-eqz p4, :cond_b

    .line 212
    .line 213
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p4

    .line 217
    add-int/lit8 v0, p2, 0x1

    .line 218
    .line 219
    if-ltz p2, :cond_a

    .line 220
    .line 221
    check-cast p4, La/tar0;

    .line 222
    .line 223
    if-nez p2, :cond_8

    .line 224
    .line 225
    move v3, v1

    .line 226
    goto :goto_9

    .line 227
    :cond_8
    move v3, v2

    .line 228
    :goto_9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    sub-int/2addr v4, v1

    .line 233
    if-ne p2, v4, :cond_9

    .line 234
    .line 235
    move p2, v1

    .line 236
    goto :goto_a

    .line 237
    :cond_9
    move p2, v2

    .line 238
    :goto_a
    invoke-static {p4, v3, p2, p3, v2}, La/ju70;->A(La/tar0;ZZLa/fet;I)V

    .line 239
    .line 240
    .line 241
    move p2, v0

    .line 242
    goto :goto_8

    .line 243
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 244
    .line 245
    .line 246
    const/4 p0, 0x0

    .line 247
    throw p0

    .line 248
    :cond_b
    invoke-static {p3, v2, v1, v2}, La/ohs0;->x(La/fet;ZZZ)V

    .line 249
    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_c
    invoke-virtual {p3}, La/fet;->X()V

    .line 253
    .line 254
    .line 255
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object p0
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 70

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xe4;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    const/high16 v5, 0x40800000    # 4.0f

    .line 8
    .line 9
    const/high16 v6, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    sget-object v8, La/ukd;->a:La/cl5;

    .line 13
    .line 14
    sget-object v9, La/jm40;->b:La/jm40;

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    iget-object v11, v0, La/xe4;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v12, v0, La/xe4;->b:Ljava/util/List;

    .line 20
    .line 21
    const/16 v13, 0x92

    .line 22
    .line 23
    const/16 v17, 0x30

    .line 24
    .line 25
    const/4 v14, 0x2

    .line 26
    const/4 v15, 0x6

    .line 27
    const/16 v20, 0x1

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    move-object/from16 v0, p1

    .line 34
    .line 35
    check-cast v0, La/g9z;

    .line 36
    .line 37
    move-object/from16 v1, p2

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    move-object/from16 v2, p3

    .line 46
    .line 47
    check-cast v2, La/fet;

    .line 48
    .line 49
    move-object/from16 v5, p4

    .line 50
    .line 51
    check-cast v5, Ljava/lang/Number;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    and-int/lit8 v6, v5, 0x6

    .line 58
    .line 59
    if-nez v6, :cond_1

    .line 60
    .line 61
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    const/4 v14, 0x4

    .line 68
    :cond_0
    or-int v0, v5, v14

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move v0, v5

    .line 72
    :goto_0
    and-int/lit8 v4, v5, 0x30

    .line 73
    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_2

    .line 81
    .line 82
    const/16 v14, 0x20

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const/16 v14, 0x10

    .line 86
    .line 87
    :goto_1
    or-int/2addr v0, v14

    .line 88
    :cond_3
    and-int/lit16 v4, v0, 0x93

    .line 89
    .line 90
    if-eq v4, v13, :cond_4

    .line 91
    .line 92
    move/from16 v4, v20

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move v4, v3

    .line 96
    :goto_2
    and-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    invoke-virtual {v2, v0, v4}, La/fet;->U(IZ)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    check-cast v12, La/a4x;

    .line 105
    .line 106
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/qhs0;

    .line 111
    .line 112
    const v4, -0x75fef4e7

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 116
    .line 117
    .line 118
    sget-object v4, La/qmk;->a:La/zcl;

    .line 119
    .line 120
    check-cast v11, La/ujs0;

    .line 121
    .line 122
    iget-object v4, v11, La/ujs0;->a:La/a4x;

    .line 123
    .line 124
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    add-int/lit8 v4, v4, -0x1

    .line 129
    .line 130
    if-ne v1, v4, :cond_5

    .line 131
    .line 132
    const/high16 v10, 0x41c00000    # 24.0f

    .line 133
    .line 134
    :cond_5
    move v8, v10

    .line 135
    const/4 v9, 0x5

    .line 136
    sget-object v4, La/jm40;->b:La/jm40;

    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    const/high16 v6, 0x41000000    # 8.0f

    .line 140
    .line 141
    const/4 v7, 0x0

    .line 142
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1, v0, v2, v3}, La/kcx;->n(La/mm40;La/qhs0;La/fet;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v3}, La/fet;->r(Z)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    invoke-virtual {v2}, La/fet;->X()V

    .line 154
    .line 155
    .line 156
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_0
    invoke-direct/range {p0 .. p4}, La/xe4;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    return-object v0

    .line 164
    :pswitch_1
    invoke-direct/range {p0 .. p4}, La/xe4;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    return-object v0

    .line 169
    :pswitch_2
    invoke-direct/range {p0 .. p4}, La/xe4;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0

    .line 174
    :pswitch_3
    invoke-direct/range {p0 .. p4}, La/xe4;->p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    return-object v0

    .line 179
    :pswitch_4
    invoke-direct/range {p0 .. p4}, La/xe4;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0

    .line 184
    :pswitch_5
    invoke-direct/range {p0 .. p4}, La/xe4;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0

    .line 189
    :pswitch_6
    invoke-direct/range {p0 .. p4}, La/xe4;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    return-object v0

    .line 194
    :pswitch_7
    move-object/from16 v0, p1

    .line 195
    .line 196
    check-cast v0, La/g9z;

    .line 197
    .line 198
    move-object/from16 v1, p2

    .line 199
    .line 200
    check-cast v1, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    move-object/from16 v2, p3

    .line 207
    .line 208
    check-cast v2, La/fet;

    .line 209
    .line 210
    move-object/from16 v5, p4

    .line 211
    .line 212
    check-cast v5, Ljava/lang/Number;

    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    and-int/lit8 v6, v5, 0x6

    .line 219
    .line 220
    if-nez v6, :cond_8

    .line 221
    .line 222
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_7

    .line 227
    .line 228
    const/4 v14, 0x4

    .line 229
    :cond_7
    or-int v0, v5, v14

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_8
    move v0, v5

    .line 233
    :goto_4
    and-int/lit8 v4, v5, 0x30

    .line 234
    .line 235
    if-nez v4, :cond_a

    .line 236
    .line 237
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_9

    .line 242
    .line 243
    const/16 v14, 0x20

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_9
    const/16 v14, 0x10

    .line 247
    .line 248
    :goto_5
    or-int/2addr v0, v14

    .line 249
    :cond_a
    and-int/lit16 v4, v0, 0x93

    .line 250
    .line 251
    if-eq v4, v13, :cond_b

    .line 252
    .line 253
    move/from16 v4, v20

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_b
    move v4, v3

    .line 257
    :goto_6
    and-int/lit8 v0, v0, 0x1

    .line 258
    .line 259
    invoke-virtual {v2, v0, v4}, La/fet;->U(IZ)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_c

    .line 264
    .line 265
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, La/eje0;

    .line 270
    .line 271
    const v1, -0x50201c5f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 275
    .line 276
    .line 277
    sget-object v1, La/qmk;->a:La/zcl;

    .line 278
    .line 279
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iget v5, v1, La/wfn;->d:F

    .line 284
    .line 285
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    iget v7, v1, La/wfn;->d:F

    .line 290
    .line 291
    const/4 v8, 0x0

    .line 292
    const/16 v9, 0x8

    .line 293
    .line 294
    sget-object v4, La/jm40;->b:La/jm40;

    .line 295
    .line 296
    const/high16 v6, 0x40800000    # 4.0f

    .line 297
    .line 298
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    check-cast v11, La/fje0;

    .line 303
    .line 304
    iget-boolean v4, v11, La/fje0;->b:Z

    .line 305
    .line 306
    invoke-static {v1, v0, v4, v2, v3}, La/ydx;->q(La/mm40;La/eje0;ZLa/fet;I)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v3}, La/fet;->r(Z)V

    .line 310
    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_c
    invoke-virtual {v2}, La/fet;->X()V

    .line 314
    .line 315
    .line 316
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    return-object v0

    .line 319
    :pswitch_8
    invoke-direct/range {p0 .. p4}, La/xe4;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0

    .line 324
    :pswitch_9
    invoke-direct/range {p0 .. p4}, La/xe4;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    return-object v0

    .line 329
    :pswitch_a
    invoke-direct/range {p0 .. p4}, La/xe4;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    return-object v0

    .line 334
    :pswitch_b
    invoke-direct/range {p0 .. p4}, La/xe4;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    return-object v0

    .line 339
    :pswitch_c
    invoke-direct/range {p0 .. p4}, La/xe4;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    return-object v0

    .line 344
    :pswitch_d
    invoke-direct/range {p0 .. p4}, La/xe4;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    return-object v0

    .line 349
    :pswitch_e
    move-object/from16 v0, p1

    .line 350
    .line 351
    check-cast v0, La/g9z;

    .line 352
    .line 353
    move-object/from16 v1, p2

    .line 354
    .line 355
    check-cast v1, Ljava/lang/Number;

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    move-object/from16 v2, p3

    .line 362
    .line 363
    check-cast v2, La/fet;

    .line 364
    .line 365
    move-object/from16 v19, p4

    .line 366
    .line 367
    check-cast v19, Ljava/lang/Number;

    .line 368
    .line 369
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Number;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result v19

    .line 373
    check-cast v11, La/c4w;

    .line 374
    .line 375
    iget-object v4, v11, La/c4w;->m2:La/lhf0;

    .line 376
    .line 377
    and-int/lit8 v23, v19, 0x6

    .line 378
    .line 379
    if-nez v23, :cond_e

    .line 380
    .line 381
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_d

    .line 386
    .line 387
    const/16 v22, 0x4

    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_d
    move/from16 v22, v14

    .line 391
    .line 392
    :goto_8
    or-int v0, v19, v22

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_e
    move/from16 v0, v19

    .line 396
    .line 397
    :goto_9
    and-int/lit8 v17, v19, 0x30

    .line 398
    .line 399
    if-nez v17, :cond_10

    .line 400
    .line 401
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 402
    .line 403
    .line 404
    move-result v17

    .line 405
    if-eqz v17, :cond_f

    .line 406
    .line 407
    const/16 v16, 0x20

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_f
    const/16 v16, 0x10

    .line 411
    .line 412
    :goto_a
    or-int v0, v0, v16

    .line 413
    .line 414
    :cond_10
    and-int/lit16 v3, v0, 0x93

    .line 415
    .line 416
    if-eq v3, v13, :cond_11

    .line 417
    .line 418
    move/from16 v3, v20

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_11
    const/4 v3, 0x0

    .line 422
    :goto_b
    and-int/lit8 v0, v0, 0x1

    .line 423
    .line 424
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    if-eqz v0, :cond_16

    .line 429
    .line 430
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    check-cast v0, Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;

    .line 435
    .line 436
    const v3, 0x37ead6a2

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 440
    .line 441
    .line 442
    invoke-static {v9, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    sget-object v12, La/qmk;->a:La/zcl;

    .line 447
    .line 448
    invoke-static {v3, v5, v10, v14}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 449
    .line 450
    .line 451
    move-result-object v22

    .line 452
    new-instance v23, La/rqm;

    .line 453
    .line 454
    new-instance v3, La/tui0;

    .line 455
    .line 456
    iget-object v5, v0, Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;->a:Ljava/lang/String;

    .line 457
    .line 458
    invoke-direct {v3, v5, v7}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 459
    .line 460
    .line 461
    new-instance v5, La/m0x;

    .line 462
    .line 463
    iget v12, v0, Lorg/xplatform/bet_history/history/presentation/dialog/history_menu/model/HistoryMenuItemUiModel;->b:I

    .line 464
    .line 465
    invoke-direct {v5, v12, v7, v15}, La/m0x;-><init>(ILa/bzw;I)V

    .line 466
    .line 467
    .line 468
    sget-object v7, La/zaq0;->b:La/zfn;

    .line 469
    .line 470
    invoke-virtual {v2, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    check-cast v7, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 475
    .line 476
    move/from16 v34, v14

    .line 477
    .line 478
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 479
    .line 480
    .line 481
    move-result-wide v14

    .line 482
    new-instance v24, La/oui0;

    .line 483
    .line 484
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 485
    .line 486
    .line 487
    move-result-object v25

    .line 488
    new-instance v7, La/y3d;

    .line 489
    .line 490
    invoke-direct {v7, v14, v15}, La/y3d;-><init>(J)V

    .line 491
    .line 492
    .line 493
    const/16 v29, 0x12

    .line 494
    .line 495
    const/16 v26, 0x0

    .line 496
    .line 497
    move-object/from16 v27, v5

    .line 498
    .line 499
    move-object/from16 v28, v7

    .line 500
    .line 501
    invoke-direct/range {v24 .. v29}, La/oui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;I)V

    .line 502
    .line 503
    .line 504
    sget-object v5, La/c4w;->n2:La/tqt;

    .line 505
    .line 506
    sget-object v5, La/c4w;->o2:[La/iiy;

    .line 507
    .line 508
    aget-object v7, v5, v34

    .line 509
    .line 510
    invoke-virtual {v4, v11, v7}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 511
    .line 512
    .line 513
    move-result-object v7

    .line 514
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 515
    .line 516
    .line 517
    move-result v7

    .line 518
    add-int/lit8 v7, v7, -0x1

    .line 519
    .line 520
    if-ne v1, v7, :cond_12

    .line 521
    .line 522
    sget-object v7, La/wui0;->d:La/wui0;

    .line 523
    .line 524
    :goto_c
    move-object/from16 v29, v7

    .line 525
    .line 526
    goto :goto_d

    .line 527
    :cond_12
    sget-object v7, La/wui0;->c:La/wui0;

    .line 528
    .line 529
    goto :goto_c

    .line 530
    :goto_d
    const/16 v31, 0x0

    .line 531
    .line 532
    const/16 v32, 0x1bc

    .line 533
    .line 534
    const/16 v26, 0x0

    .line 535
    .line 536
    const/16 v27, 0x0

    .line 537
    .line 538
    const/16 v28, 0x0

    .line 539
    .line 540
    const/16 v30, 0x0

    .line 541
    .line 542
    move-object/from16 v25, v24

    .line 543
    .line 544
    move-object/from16 v24, v3

    .line 545
    .line 546
    invoke-direct/range {v23 .. v32}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    invoke-virtual {v2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    or-int/2addr v3, v7

    .line 558
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v7

    .line 562
    if-nez v3, :cond_13

    .line 563
    .line 564
    if-ne v7, v8, :cond_14

    .line 565
    .line 566
    :cond_13
    new-instance v7, La/nsr;

    .line 567
    .line 568
    const/16 v3, 0x8

    .line 569
    .line 570
    invoke-direct {v7, v11, v0, v3}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    :cond_14
    move-object/from16 v26, v7

    .line 577
    .line 578
    check-cast v26, Lkotlin/jvm/functions/Function0;

    .line 579
    .line 580
    const/16 v31, 0x180

    .line 581
    .line 582
    const/16 v32, 0xe8

    .line 583
    .line 584
    const/16 v24, 0x0

    .line 585
    .line 586
    const/16 v25, 0x0

    .line 587
    .line 588
    const/16 v27, 0x0

    .line 589
    .line 590
    const/16 v28, 0x0

    .line 591
    .line 592
    const/16 v29, 0x0

    .line 593
    .line 594
    move-object/from16 v30, v2

    .line 595
    .line 596
    invoke-static/range {v22 .. v32}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 597
    .line 598
    .line 599
    move-object/from16 v0, v30

    .line 600
    .line 601
    aget-object v2, v5, v34

    .line 602
    .line 603
    invoke-virtual {v4, v11, v2}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    add-int/lit8 v2, v2, -0x1

    .line 612
    .line 613
    if-ge v1, v2, :cond_15

    .line 614
    .line 615
    const v1, 0x37ff8b25

    .line 616
    .line 617
    .line 618
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 619
    .line 620
    .line 621
    invoke-static {v9, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    move/from16 v3, v34

    .line 626
    .line 627
    const/high16 v2, 0x41800000    # 16.0f

    .line 628
    .line 629
    invoke-static {v1, v2, v10, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 630
    .line 631
    .line 632
    move-result-object v23

    .line 633
    const/16 v26, 0x6

    .line 634
    .line 635
    const/16 v27, 0x4

    .line 636
    .line 637
    sget-object v22, La/zfi0;->a:La/zfi0;

    .line 638
    .line 639
    const/16 v24, 0x0

    .line 640
    .line 641
    move-object/from16 v25, v0

    .line 642
    .line 643
    invoke-static/range {v22 .. v27}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 644
    .line 645
    .line 646
    const/4 v1, 0x0

    .line 647
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 648
    .line 649
    .line 650
    goto :goto_e

    .line 651
    :cond_15
    const/4 v1, 0x0

    .line 652
    const v2, 0x3803e60e

    .line 653
    .line 654
    .line 655
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 659
    .line 660
    .line 661
    :goto_e
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 662
    .line 663
    .line 664
    goto :goto_f

    .line 665
    :cond_16
    move-object v0, v2

    .line 666
    invoke-virtual {v0}, La/fet;->X()V

    .line 667
    .line 668
    .line 669
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 670
    .line 671
    return-object v0

    .line 672
    :pswitch_f
    sget-object v0, La/gqw0;->v:La/shd;

    .line 673
    .line 674
    sget-object v1, La/gqw0;->y:La/shd;

    .line 675
    .line 676
    sget-object v3, La/gqw0;->w:La/shd;

    .line 677
    .line 678
    sget-object v4, La/gqw0;->x:La/shd;

    .line 679
    .line 680
    move-object/from16 v5, p1

    .line 681
    .line 682
    check-cast v5, La/g9z;

    .line 683
    .line 684
    move-object/from16 v14, p2

    .line 685
    .line 686
    check-cast v14, Ljava/lang/Number;

    .line 687
    .line 688
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 689
    .line 690
    .line 691
    move-result v14

    .line 692
    move-object/from16 v10, p3

    .line 693
    .line 694
    check-cast v10, La/fet;

    .line 695
    .line 696
    move-object/from16 v21, p4

    .line 697
    .line 698
    check-cast v21, Ljava/lang/Number;

    .line 699
    .line 700
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Number;->intValue()I

    .line 701
    .line 702
    .line 703
    move-result v21

    .line 704
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 705
    .line 706
    sget-object v15, La/uc9;->c:La/mw3;

    .line 707
    .line 708
    check-cast v11, La/q0w;

    .line 709
    .line 710
    and-int/lit8 v26, v21, 0x6

    .line 711
    .line 712
    if-nez v26, :cond_18

    .line 713
    .line 714
    invoke-virtual {v10, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    if-eqz v5, :cond_17

    .line 719
    .line 720
    const/4 v5, 0x4

    .line 721
    goto :goto_10

    .line 722
    :cond_17
    const/4 v5, 0x2

    .line 723
    :goto_10
    or-int v5, v21, v5

    .line 724
    .line 725
    goto :goto_11

    .line 726
    :cond_18
    move/from16 v5, v21

    .line 727
    .line 728
    :goto_11
    and-int/lit8 v17, v21, 0x30

    .line 729
    .line 730
    if-nez v17, :cond_1a

    .line 731
    .line 732
    invoke-virtual {v10, v14}, La/fet;->e(I)Z

    .line 733
    .line 734
    .line 735
    move-result v17

    .line 736
    if-eqz v17, :cond_19

    .line 737
    .line 738
    const/16 v16, 0x20

    .line 739
    .line 740
    goto :goto_12

    .line 741
    :cond_19
    const/16 v16, 0x10

    .line 742
    .line 743
    :goto_12
    or-int v5, v5, v16

    .line 744
    .line 745
    :cond_1a
    and-int/lit16 v6, v5, 0x93

    .line 746
    .line 747
    if-eq v6, v13, :cond_1b

    .line 748
    .line 749
    move/from16 v6, v20

    .line 750
    .line 751
    goto :goto_13

    .line 752
    :cond_1b
    const/4 v6, 0x0

    .line 753
    :goto_13
    and-int/lit8 v5, v5, 0x1

    .line 754
    .line 755
    invoke-virtual {v10, v5, v6}, La/fet;->U(IZ)Z

    .line 756
    .line 757
    .line 758
    move-result v5

    .line 759
    if-eqz v5, :cond_30

    .line 760
    .line 761
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v5

    .line 765
    check-cast v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;

    .line 766
    .line 767
    const v6, 0x769bf77f

    .line 768
    .line 769
    .line 770
    invoke-virtual {v10, v6}, La/fet;->e0(I)V

    .line 771
    .line 772
    .line 773
    iget-object v6, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->c:Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;

    .line 774
    .line 775
    iget-boolean v12, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->d:Z

    .line 776
    .line 777
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 778
    .line 779
    .line 780
    move-result v6

    .line 781
    const/4 v13, 0x0

    .line 782
    sget-object v23, La/zfi0;->a:La/zfi0;

    .line 783
    .line 784
    if-eqz v6, :cond_2a

    .line 785
    .line 786
    const/4 v14, 0x3

    .line 787
    move/from16 v13, v20

    .line 788
    .line 789
    if-eq v6, v13, :cond_24

    .line 790
    .line 791
    const/4 v13, 0x2

    .line 792
    if-eq v6, v13, :cond_1f

    .line 793
    .line 794
    if-ne v6, v14, :cond_1e

    .line 795
    .line 796
    const v0, 0x76e464a4

    .line 797
    .line 798
    .line 799
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 800
    .line 801
    .line 802
    const/high16 v0, 0x3f800000    # 1.0f

    .line 803
    .line 804
    invoke-static {v9, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 805
    .line 806
    .line 807
    move-result-object v12

    .line 808
    sget-object v0, La/qmk;->a:La/zcl;

    .line 809
    .line 810
    const/16 v16, 0x0

    .line 811
    .line 812
    const/16 v17, 0x8

    .line 813
    .line 814
    const/high16 v13, 0x41800000    # 16.0f

    .line 815
    .line 816
    const/high16 v14, 0x41400000    # 12.0f

    .line 817
    .line 818
    const/high16 v15, 0x41800000    # 16.0f

    .line 819
    .line 820
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    const-string v1, "SEND_HISTORY_CELL"

    .line 825
    .line 826
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 827
    .line 828
    .line 829
    move-result-object v35

    .line 830
    new-instance v12, La/uui0;

    .line 831
    .line 832
    iget-object v13, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->a:Ljava/lang/String;

    .line 833
    .line 834
    iget-object v15, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->b:Ljava/lang/String;

    .line 835
    .line 836
    const/16 v17, 0x0

    .line 837
    .line 838
    const/16 v18, 0x3a

    .line 839
    .line 840
    const/4 v14, 0x0

    .line 841
    const/16 v16, 0x0

    .line 842
    .line 843
    invoke-direct/range {v12 .. v18}, La/uui0;-><init>(Ljava/lang/String;La/y3d;Ljava/lang/String;La/y3d;Ljava/lang/Integer;I)V

    .line 844
    .line 845
    .line 846
    new-instance v15, La/fvi0;

    .line 847
    .line 848
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 849
    .line 850
    invoke-virtual {v10, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 855
    .line 856
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 857
    .line 858
    .line 859
    move-result-wide v1

    .line 860
    new-instance v3, La/y3d;

    .line 861
    .line 862
    invoke-direct {v3, v1, v2}, La/y3d;-><init>(J)V

    .line 863
    .line 864
    .line 865
    invoke-direct {v15, v3}, La/fvi0;-><init>(La/y3d;)V

    .line 866
    .line 867
    .line 868
    sget-object v16, La/d4d;->z:La/d4d;

    .line 869
    .line 870
    new-instance v14, La/oui0;

    .line 871
    .line 872
    const v1, 0x7f080987

    .line 873
    .line 874
    .line 875
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    new-instance v4, La/m0x;

    .line 880
    .line 881
    const/4 v3, 0x0

    .line 882
    const/4 v5, 0x6

    .line 883
    invoke-direct {v4, v1, v3, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v10, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 891
    .line 892
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 893
    .line 894
    .line 895
    move-result-wide v0

    .line 896
    new-instance v5, La/y3d;

    .line 897
    .line 898
    invoke-direct {v5, v0, v1}, La/y3d;-><init>(J)V

    .line 899
    .line 900
    .line 901
    const/16 v6, 0x12

    .line 902
    .line 903
    const/4 v3, 0x0

    .line 904
    move-object v1, v14

    .line 905
    invoke-direct/range {v1 .. v6}, La/oui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;I)V

    .line 906
    .line 907
    .line 908
    new-instance v36, La/rqm;

    .line 909
    .line 910
    const/16 v20, 0x0

    .line 911
    .line 912
    const/16 v21, 0x1c8

    .line 913
    .line 914
    sget-object v17, La/qvi0;->a:La/qvi0;

    .line 915
    .line 916
    const/16 v18, 0x0

    .line 917
    .line 918
    const/16 v19, 0x0

    .line 919
    .line 920
    move-object v13, v12

    .line 921
    move-object/from16 v12, v36

    .line 922
    .line 923
    invoke-direct/range {v12 .. v21}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v10, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    move-result v0

    .line 930
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    if-nez v0, :cond_1c

    .line 935
    .line 936
    if-ne v1, v8, :cond_1d

    .line 937
    .line 938
    :cond_1c
    new-instance v1, La/p0w;

    .line 939
    .line 940
    const/4 v5, 0x6

    .line 941
    invoke-direct {v1, v11, v5}, La/p0w;-><init>(La/q0w;B)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v10, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 945
    .line 946
    .line 947
    :cond_1d
    move-object/from16 v39, v1

    .line 948
    .line 949
    check-cast v39, Lkotlin/jvm/functions/Function0;

    .line 950
    .line 951
    const/16 v44, 0x0

    .line 952
    .line 953
    const/16 v45, 0xec

    .line 954
    .line 955
    const/16 v37, 0x0

    .line 956
    .line 957
    const/16 v38, 0x0

    .line 958
    .line 959
    const/16 v40, 0x0

    .line 960
    .line 961
    const/16 v41, 0x0

    .line 962
    .line 963
    const/16 v42, 0x0

    .line 964
    .line 965
    move-object/from16 v43, v10

    .line 966
    .line 967
    move-object/from16 v36, v12

    .line 968
    .line 969
    invoke-static/range {v35 .. v45}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 970
    .line 971
    .line 972
    move-object/from16 v0, v43

    .line 973
    .line 974
    const/4 v1, 0x0

    .line 975
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 976
    .line 977
    .line 978
    move-object v6, v0

    .line 979
    move v10, v1

    .line 980
    goto/16 :goto_16

    .line 981
    .line 982
    :cond_1e
    move-object v0, v10

    .line 983
    const/4 v1, 0x0

    .line 984
    const v2, -0x2576d6fc

    .line 985
    .line 986
    .line 987
    invoke-static {v2, v0, v1}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    throw v0

    .line 992
    :cond_1f
    move-object v0, v10

    .line 993
    const v1, 0x76d154ce

    .line 994
    .line 995
    .line 996
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 997
    .line 998
    .line 999
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1000
    .line 1001
    invoke-static {v9, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v35

    .line 1005
    new-instance v36, La/rqm;

    .line 1006
    .line 1007
    new-instance v13, La/uui0;

    .line 1008
    .line 1009
    iget-object v14, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->a:Ljava/lang/String;

    .line 1010
    .line 1011
    iget-object v1, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->b:Ljava/lang/String;

    .line 1012
    .line 1013
    const/16 v18, 0x0

    .line 1014
    .line 1015
    const/16 v19, 0x3a

    .line 1016
    .line 1017
    const/4 v15, 0x0

    .line 1018
    const/16 v17, 0x0

    .line 1019
    .line 1020
    move-object/from16 v16, v1

    .line 1021
    .line 1022
    invoke-direct/range {v13 .. v19}, La/uui0;-><init>(Ljava/lang/String;La/y3d;Ljava/lang/String;La/y3d;Ljava/lang/Integer;I)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v1, La/nvi0;

    .line 1026
    .line 1027
    invoke-direct {v1, v12}, La/nvi0;-><init>(Z)V

    .line 1028
    .line 1029
    .line 1030
    const/16 v31, 0x0

    .line 1031
    .line 1032
    const/16 v32, 0x1fa

    .line 1033
    .line 1034
    const/16 v25, 0x0

    .line 1035
    .line 1036
    const/16 v27, 0x0

    .line 1037
    .line 1038
    const/16 v28, 0x0

    .line 1039
    .line 1040
    const/16 v29, 0x0

    .line 1041
    .line 1042
    const/16 v30, 0x0

    .line 1043
    .line 1044
    move-object/from16 v26, v1

    .line 1045
    .line 1046
    move-object/from16 v24, v13

    .line 1047
    .line 1048
    move-object/from16 v23, v36

    .line 1049
    .line 1050
    invoke-direct/range {v23 .. v32}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v1

    .line 1057
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v2

    .line 1061
    if-nez v1, :cond_20

    .line 1062
    .line 1063
    if-ne v2, v8, :cond_21

    .line 1064
    .line 1065
    :cond_20
    new-instance v2, La/p0w;

    .line 1066
    .line 1067
    const/4 v1, 0x4

    .line 1068
    invoke-direct {v2, v11, v1}, La/p0w;-><init>(La/q0w;B)V

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1072
    .line 1073
    .line 1074
    :cond_21
    move-object/from16 v39, v2

    .line 1075
    .line 1076
    check-cast v39, Lkotlin/jvm/functions/Function0;

    .line 1077
    .line 1078
    invoke-virtual {v0, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v2

    .line 1086
    if-nez v1, :cond_22

    .line 1087
    .line 1088
    if-ne v2, v8, :cond_23

    .line 1089
    .line 1090
    :cond_22
    new-instance v2, La/p0w;

    .line 1091
    .line 1092
    const/4 v1, 0x5

    .line 1093
    invoke-direct {v2, v11, v1}, La/p0w;-><init>(La/q0w;B)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1097
    .line 1098
    .line 1099
    :cond_23
    move-object/from16 v41, v2

    .line 1100
    .line 1101
    check-cast v41, Lkotlin/jvm/functions/Function0;

    .line 1102
    .line 1103
    const/16 v44, 0x6

    .line 1104
    .line 1105
    const/16 v45, 0xac

    .line 1106
    .line 1107
    const/16 v37, 0x0

    .line 1108
    .line 1109
    const/16 v38, 0x0

    .line 1110
    .line 1111
    const/16 v40, 0x0

    .line 1112
    .line 1113
    const/16 v42, 0x0

    .line 1114
    .line 1115
    move-object/from16 v43, v0

    .line 1116
    .line 1117
    invoke-static/range {v35 .. v45}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1118
    .line 1119
    .line 1120
    move-object/from16 v6, v43

    .line 1121
    .line 1122
    const/4 v10, 0x0

    .line 1123
    invoke-virtual {v6, v10}, La/fet;->r(Z)V

    .line 1124
    .line 1125
    .line 1126
    goto/16 :goto_16

    .line 1127
    .line 1128
    :cond_24
    move-object v6, v10

    .line 1129
    const/4 v10, 0x0

    .line 1130
    const v13, 0x76b6659b

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v6, v13}, La/fet;->e0(I)V

    .line 1134
    .line 1135
    .line 1136
    invoke-static {v15, v7, v6, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v7

    .line 1140
    iget-wide v14, v6, La/fet;->T:J

    .line 1141
    .line 1142
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 1143
    .line 1144
    .line 1145
    move-result v10

    .line 1146
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v13

    .line 1150
    invoke-static {v6, v9}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v14

    .line 1154
    sget-object v15, La/mkd;->c0:La/gqw0;

    .line 1155
    .line 1156
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v6}, La/fet;->i0()V

    .line 1160
    .line 1161
    .line 1162
    iget-boolean v15, v6, La/fet;->S:Z

    .line 1163
    .line 1164
    if-eqz v15, :cond_25

    .line 1165
    .line 1166
    invoke-virtual {v6, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1167
    .line 1168
    .line 1169
    goto :goto_14

    .line 1170
    :cond_25
    invoke-virtual {v6}, La/fet;->r0()V

    .line 1171
    .line 1172
    .line 1173
    :goto_14
    invoke-static {v6, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1174
    .line 1175
    .line 1176
    invoke-static {v6, v13, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-static {v10, v6, v1, v6}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 1180
    .line 1181
    .line 1182
    invoke-static {v6, v14, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1183
    .line 1184
    .line 1185
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1186
    .line 1187
    invoke-static {v9, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v35

    .line 1191
    new-instance v36, La/rqm;

    .line 1192
    .line 1193
    new-instance v37, La/uui0;

    .line 1194
    .line 1195
    iget-object v0, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->a:Ljava/lang/String;

    .line 1196
    .line 1197
    iget-object v1, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->b:Ljava/lang/String;

    .line 1198
    .line 1199
    const/16 v42, 0x0

    .line 1200
    .line 1201
    const/16 v43, 0x3a

    .line 1202
    .line 1203
    const/16 v39, 0x0

    .line 1204
    .line 1205
    const/16 v41, 0x0

    .line 1206
    .line 1207
    move-object/from16 v38, v0

    .line 1208
    .line 1209
    move-object/from16 v40, v1

    .line 1210
    .line 1211
    invoke-direct/range {v37 .. v43}, La/uui0;-><init>(Ljava/lang/String;La/y3d;Ljava/lang/String;La/y3d;Ljava/lang/Integer;I)V

    .line 1212
    .line 1213
    .line 1214
    new-instance v0, La/nvi0;

    .line 1215
    .line 1216
    invoke-direct {v0, v12}, La/nvi0;-><init>(Z)V

    .line 1217
    .line 1218
    .line 1219
    sget-object v42, La/wui0;->b:La/wui0;

    .line 1220
    .line 1221
    const/16 v44, 0x0

    .line 1222
    .line 1223
    const/16 v45, 0x1ba

    .line 1224
    .line 1225
    const/16 v38, 0x0

    .line 1226
    .line 1227
    const/16 v40, 0x0

    .line 1228
    .line 1229
    const/16 v43, 0x0

    .line 1230
    .line 1231
    move-object/from16 v39, v0

    .line 1232
    .line 1233
    invoke-direct/range {v36 .. v45}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v6, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1237
    .line 1238
    .line 1239
    move-result v0

    .line 1240
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v1

    .line 1244
    if-nez v0, :cond_26

    .line 1245
    .line 1246
    if-ne v1, v8, :cond_27

    .line 1247
    .line 1248
    :cond_26
    new-instance v1, La/p0w;

    .line 1249
    .line 1250
    const/4 v13, 0x2

    .line 1251
    invoke-direct {v1, v11, v13}, La/p0w;-><init>(La/q0w;B)V

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1255
    .line 1256
    .line 1257
    :cond_27
    move-object/from16 v39, v1

    .line 1258
    .line 1259
    check-cast v39, Lkotlin/jvm/functions/Function0;

    .line 1260
    .line 1261
    invoke-virtual {v6, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v0

    .line 1265
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    if-nez v0, :cond_28

    .line 1270
    .line 1271
    if-ne v1, v8, :cond_29

    .line 1272
    .line 1273
    :cond_28
    new-instance v1, La/p0w;

    .line 1274
    .line 1275
    const/4 v0, 0x3

    .line 1276
    invoke-direct {v1, v11, v0}, La/p0w;-><init>(La/q0w;B)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1280
    .line 1281
    .line 1282
    :cond_29
    move-object/from16 v41, v1

    .line 1283
    .line 1284
    check-cast v41, Lkotlin/jvm/functions/Function0;

    .line 1285
    .line 1286
    const/16 v44, 0x186

    .line 1287
    .line 1288
    const/16 v45, 0xa8

    .line 1289
    .line 1290
    const/16 v37, 0x0

    .line 1291
    .line 1292
    const/16 v38, 0x0

    .line 1293
    .line 1294
    const/16 v40, 0x0

    .line 1295
    .line 1296
    const/16 v42, 0x0

    .line 1297
    .line 1298
    move-object/from16 v43, v6

    .line 1299
    .line 1300
    invoke-static/range {v35 .. v45}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1301
    .line 1302
    .line 1303
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1304
    .line 1305
    invoke-static {v9, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1310
    .line 1311
    const/high16 v1, 0x41400000    # 12.0f

    .line 1312
    .line 1313
    const/4 v3, 0x2

    .line 1314
    const/4 v13, 0x0

    .line 1315
    invoke-static {v0, v1, v13, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v24

    .line 1319
    const/16 v27, 0x6

    .line 1320
    .line 1321
    const/16 v28, 0x4

    .line 1322
    .line 1323
    const/16 v25, 0x0

    .line 1324
    .line 1325
    move-object/from16 v26, v43

    .line 1326
    .line 1327
    invoke-static/range {v23 .. v28}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 1328
    .line 1329
    .line 1330
    move-object/from16 v6, v26

    .line 1331
    .line 1332
    const/4 v13, 0x1

    .line 1333
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 1334
    .line 1335
    .line 1336
    const/4 v10, 0x0

    .line 1337
    invoke-virtual {v6, v10}, La/fet;->r(Z)V

    .line 1338
    .line 1339
    .line 1340
    goto/16 :goto_16

    .line 1341
    .line 1342
    :cond_2a
    move-object v6, v10

    .line 1343
    move-object/from16 v13, v23

    .line 1344
    .line 1345
    const/4 v10, 0x0

    .line 1346
    const v14, 0x769b417d

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v6, v14}, La/fet;->e0(I)V

    .line 1350
    .line 1351
    .line 1352
    invoke-static {v15, v7, v6, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v7

    .line 1356
    iget-wide v14, v6, La/fet;->T:J

    .line 1357
    .line 1358
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 1359
    .line 1360
    .line 1361
    move-result v10

    .line 1362
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v14

    .line 1366
    invoke-static {v6, v9}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v15

    .line 1370
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 1371
    .line 1372
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v6}, La/fet;->i0()V

    .line 1376
    .line 1377
    .line 1378
    move-object/from16 p0, v13

    .line 1379
    .line 1380
    iget-boolean v13, v6, La/fet;->S:Z

    .line 1381
    .line 1382
    if-eqz v13, :cond_2b

    .line 1383
    .line 1384
    invoke-virtual {v6, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1385
    .line 1386
    .line 1387
    goto :goto_15

    .line 1388
    :cond_2b
    invoke-virtual {v6}, La/fet;->r0()V

    .line 1389
    .line 1390
    .line 1391
    :goto_15
    invoke-static {v6, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1392
    .line 1393
    .line 1394
    invoke-static {v6, v14, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1395
    .line 1396
    .line 1397
    invoke-static {v10, v6, v1, v6}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 1398
    .line 1399
    .line 1400
    invoke-static {v6, v15, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1401
    .line 1402
    .line 1403
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1404
    .line 1405
    invoke-static {v9, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v35

    .line 1409
    new-instance v36, La/rqm;

    .line 1410
    .line 1411
    new-instance v37, La/uui0;

    .line 1412
    .line 1413
    iget-object v0, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->a:Ljava/lang/String;

    .line 1414
    .line 1415
    iget-object v1, v5, Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeUiModel;->b:Ljava/lang/String;

    .line 1416
    .line 1417
    const/16 v42, 0x0

    .line 1418
    .line 1419
    const/16 v43, 0x3a

    .line 1420
    .line 1421
    const/16 v39, 0x0

    .line 1422
    .line 1423
    const/16 v41, 0x0

    .line 1424
    .line 1425
    move-object/from16 v38, v0

    .line 1426
    .line 1427
    move-object/from16 v40, v1

    .line 1428
    .line 1429
    invoke-direct/range {v37 .. v43}, La/uui0;-><init>(Ljava/lang/String;La/y3d;Ljava/lang/String;La/y3d;Ljava/lang/Integer;I)V

    .line 1430
    .line 1431
    .line 1432
    new-instance v0, La/nvi0;

    .line 1433
    .line 1434
    invoke-direct {v0, v12}, La/nvi0;-><init>(Z)V

    .line 1435
    .line 1436
    .line 1437
    sget-object v42, La/wui0;->b:La/wui0;

    .line 1438
    .line 1439
    const/16 v44, 0x0

    .line 1440
    .line 1441
    const/16 v45, 0x1ba

    .line 1442
    .line 1443
    const/16 v38, 0x0

    .line 1444
    .line 1445
    const/16 v40, 0x0

    .line 1446
    .line 1447
    const/16 v43, 0x0

    .line 1448
    .line 1449
    move-object/from16 v39, v0

    .line 1450
    .line 1451
    invoke-direct/range {v36 .. v45}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v6, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v0

    .line 1458
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v1

    .line 1462
    if-nez v0, :cond_2c

    .line 1463
    .line 1464
    if-ne v1, v8, :cond_2d

    .line 1465
    .line 1466
    :cond_2c
    new-instance v1, La/p0w;

    .line 1467
    .line 1468
    const/4 v10, 0x0

    .line 1469
    invoke-direct {v1, v11, v10}, La/p0w;-><init>(La/q0w;B)V

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1473
    .line 1474
    .line 1475
    :cond_2d
    move-object/from16 v39, v1

    .line 1476
    .line 1477
    check-cast v39, Lkotlin/jvm/functions/Function0;

    .line 1478
    .line 1479
    invoke-virtual {v6, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v0

    .line 1483
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v1

    .line 1487
    if-nez v0, :cond_2e

    .line 1488
    .line 1489
    if-ne v1, v8, :cond_2f

    .line 1490
    .line 1491
    :cond_2e
    new-instance v1, La/p0w;

    .line 1492
    .line 1493
    const/4 v13, 0x1

    .line 1494
    invoke-direct {v1, v11, v13}, La/p0w;-><init>(La/q0w;B)V

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1498
    .line 1499
    .line 1500
    :cond_2f
    move-object/from16 v41, v1

    .line 1501
    .line 1502
    check-cast v41, Lkotlin/jvm/functions/Function0;

    .line 1503
    .line 1504
    const/16 v44, 0x186

    .line 1505
    .line 1506
    const/16 v45, 0xa8

    .line 1507
    .line 1508
    const/16 v37, 0x0

    .line 1509
    .line 1510
    const/16 v38, 0x0

    .line 1511
    .line 1512
    const/16 v40, 0x0

    .line 1513
    .line 1514
    const/16 v42, 0x0

    .line 1515
    .line 1516
    move-object/from16 v43, v6

    .line 1517
    .line 1518
    invoke-static/range {v35 .. v45}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1519
    .line 1520
    .line 1521
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1522
    .line 1523
    invoke-static {v9, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v0

    .line 1527
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1528
    .line 1529
    const/high16 v1, 0x41400000    # 12.0f

    .line 1530
    .line 1531
    const/4 v3, 0x2

    .line 1532
    const/4 v13, 0x0

    .line 1533
    invoke-static {v0, v1, v13, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v24

    .line 1537
    const/16 v27, 0x6

    .line 1538
    .line 1539
    const/16 v28, 0x4

    .line 1540
    .line 1541
    const/16 v25, 0x0

    .line 1542
    .line 1543
    move-object/from16 v23, p0

    .line 1544
    .line 1545
    move-object/from16 v26, v43

    .line 1546
    .line 1547
    invoke-static/range {v23 .. v28}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 1548
    .line 1549
    .line 1550
    move-object/from16 v6, v26

    .line 1551
    .line 1552
    const/4 v13, 0x1

    .line 1553
    invoke-virtual {v6, v13}, La/fet;->r(Z)V

    .line 1554
    .line 1555
    .line 1556
    const/4 v10, 0x0

    .line 1557
    invoke-virtual {v6, v10}, La/fet;->r(Z)V

    .line 1558
    .line 1559
    .line 1560
    :goto_16
    invoke-virtual {v6, v10}, La/fet;->r(Z)V

    .line 1561
    .line 1562
    .line 1563
    goto :goto_17

    .line 1564
    :cond_30
    move-object v6, v10

    .line 1565
    invoke-virtual {v6}, La/fet;->X()V

    .line 1566
    .line 1567
    .line 1568
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1569
    .line 1570
    return-object v0

    .line 1571
    :pswitch_10
    move-object/from16 v0, p1

    .line 1572
    .line 1573
    check-cast v0, La/g9z;

    .line 1574
    .line 1575
    move-object/from16 v1, p2

    .line 1576
    .line 1577
    check-cast v1, Ljava/lang/Number;

    .line 1578
    .line 1579
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1580
    .line 1581
    .line 1582
    move-result v1

    .line 1583
    move-object/from16 v2, p3

    .line 1584
    .line 1585
    check-cast v2, La/fet;

    .line 1586
    .line 1587
    move-object/from16 v3, p4

    .line 1588
    .line 1589
    check-cast v3, Ljava/lang/Number;

    .line 1590
    .line 1591
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1592
    .line 1593
    .line 1594
    move-result v3

    .line 1595
    and-int/lit8 v4, v3, 0x6

    .line 1596
    .line 1597
    if-nez v4, :cond_32

    .line 1598
    .line 1599
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1600
    .line 1601
    .line 1602
    move-result v0

    .line 1603
    if-eqz v0, :cond_31

    .line 1604
    .line 1605
    const/4 v4, 0x4

    .line 1606
    goto :goto_18

    .line 1607
    :cond_31
    const/4 v4, 0x2

    .line 1608
    :goto_18
    or-int v0, v3, v4

    .line 1609
    .line 1610
    goto :goto_19

    .line 1611
    :cond_32
    move v0, v3

    .line 1612
    :goto_19
    and-int/lit8 v3, v3, 0x30

    .line 1613
    .line 1614
    if-nez v3, :cond_34

    .line 1615
    .line 1616
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1617
    .line 1618
    .line 1619
    move-result v3

    .line 1620
    if-eqz v3, :cond_33

    .line 1621
    .line 1622
    const/16 v14, 0x20

    .line 1623
    .line 1624
    goto :goto_1a

    .line 1625
    :cond_33
    const/16 v14, 0x10

    .line 1626
    .line 1627
    :goto_1a
    or-int/2addr v0, v14

    .line 1628
    :cond_34
    and-int/lit16 v3, v0, 0x93

    .line 1629
    .line 1630
    if-eq v3, v13, :cond_35

    .line 1631
    .line 1632
    const/4 v3, 0x1

    .line 1633
    :goto_1b
    const/4 v13, 0x1

    .line 1634
    goto :goto_1c

    .line 1635
    :cond_35
    const/4 v3, 0x0

    .line 1636
    goto :goto_1b

    .line 1637
    :goto_1c
    and-int/2addr v0, v13

    .line 1638
    invoke-virtual {v2, v0, v3}, La/fet;->U(IZ)Z

    .line 1639
    .line 1640
    .line 1641
    move-result v0

    .line 1642
    if-eqz v0, :cond_38

    .line 1643
    .line 1644
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    check-cast v0, La/xyx;

    .line 1649
    .line 1650
    const v1, -0x5011a57e

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 1654
    .line 1655
    .line 1656
    check-cast v11, La/wyx;

    .line 1657
    .line 1658
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 1659
    .line 1660
    .line 1661
    move-result v1

    .line 1662
    if-eqz v1, :cond_37

    .line 1663
    .line 1664
    if-eq v1, v13, :cond_37

    .line 1665
    .line 1666
    const/4 v3, 0x2

    .line 1667
    if-ne v1, v3, :cond_36

    .line 1668
    .line 1669
    const v1, 0x5acf9e4

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 1673
    .line 1674
    .line 1675
    iget-object v1, v0, La/xyx;->a:Ljava/lang/String;

    .line 1676
    .line 1677
    iget-object v0, v0, La/xyx;->b:Ljava/lang/String;

    .line 1678
    .line 1679
    const/4 v10, 0x0

    .line 1680
    invoke-static {v1, v0, v2, v10}, La/ebc;->W(Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v2, v10}, La/fet;->r(Z)V

    .line 1684
    .line 1685
    .line 1686
    goto :goto_1d

    .line 1687
    :cond_36
    const/4 v10, 0x0

    .line 1688
    const v0, 0x5acd9a1

    .line 1689
    .line 1690
    .line 1691
    invoke-static {v0, v2, v10}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v0

    .line 1695
    throw v0

    .line 1696
    :cond_37
    const/4 v10, 0x0

    .line 1697
    const v1, 0x5ace502

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 1701
    .line 1702
    .line 1703
    iget-object v1, v0, La/xyx;->a:Ljava/lang/String;

    .line 1704
    .line 1705
    iget-object v0, v0, La/xyx;->b:Ljava/lang/String;

    .line 1706
    .line 1707
    invoke-static {v1, v0, v2, v10}, La/ebc;->d(Ljava/lang/String;Ljava/lang/String;La/fet;I)V

    .line 1708
    .line 1709
    .line 1710
    invoke-virtual {v2, v10}, La/fet;->r(Z)V

    .line 1711
    .line 1712
    .line 1713
    :goto_1d
    invoke-virtual {v2, v10}, La/fet;->r(Z)V

    .line 1714
    .line 1715
    .line 1716
    goto :goto_1e

    .line 1717
    :cond_38
    invoke-virtual {v2}, La/fet;->X()V

    .line 1718
    .line 1719
    .line 1720
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1721
    .line 1722
    return-object v0

    .line 1723
    :pswitch_11
    move-object/from16 v0, p1

    .line 1724
    .line 1725
    check-cast v0, La/g9z;

    .line 1726
    .line 1727
    move-object/from16 v1, p2

    .line 1728
    .line 1729
    check-cast v1, Ljava/lang/Number;

    .line 1730
    .line 1731
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1732
    .line 1733
    .line 1734
    move-result v1

    .line 1735
    move-object/from16 v2, p3

    .line 1736
    .line 1737
    check-cast v2, La/fet;

    .line 1738
    .line 1739
    move-object/from16 v3, p4

    .line 1740
    .line 1741
    check-cast v3, Ljava/lang/Number;

    .line 1742
    .line 1743
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1744
    .line 1745
    .line 1746
    move-result v3

    .line 1747
    check-cast v11, La/omn;

    .line 1748
    .line 1749
    iget-object v4, v11, La/omn;->k2:La/es;

    .line 1750
    .line 1751
    iget-object v6, v11, La/omn;->o2:La/zz2;

    .line 1752
    .line 1753
    and-int/lit8 v7, v3, 0x6

    .line 1754
    .line 1755
    if-nez v7, :cond_3a

    .line 1756
    .line 1757
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1758
    .line 1759
    .line 1760
    move-result v0

    .line 1761
    if-eqz v0, :cond_39

    .line 1762
    .line 1763
    const/4 v0, 0x4

    .line 1764
    goto :goto_1f

    .line 1765
    :cond_39
    const/4 v0, 0x2

    .line 1766
    :goto_1f
    or-int/2addr v0, v3

    .line 1767
    goto :goto_20

    .line 1768
    :cond_3a
    move v0, v3

    .line 1769
    :goto_20
    and-int/lit8 v3, v3, 0x30

    .line 1770
    .line 1771
    if-nez v3, :cond_3c

    .line 1772
    .line 1773
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1774
    .line 1775
    .line 1776
    move-result v3

    .line 1777
    if-eqz v3, :cond_3b

    .line 1778
    .line 1779
    const/16 v14, 0x20

    .line 1780
    .line 1781
    goto :goto_21

    .line 1782
    :cond_3b
    const/16 v14, 0x10

    .line 1783
    .line 1784
    :goto_21
    or-int/2addr v0, v14

    .line 1785
    :cond_3c
    and-int/lit16 v3, v0, 0x93

    .line 1786
    .line 1787
    if-eq v3, v13, :cond_3d

    .line 1788
    .line 1789
    const/4 v3, 0x1

    .line 1790
    goto :goto_22

    .line 1791
    :cond_3d
    const/4 v3, 0x0

    .line 1792
    :goto_22
    and-int/lit8 v7, v0, 0x1

    .line 1793
    .line 1794
    invoke-virtual {v2, v7, v3}, La/fet;->U(IZ)Z

    .line 1795
    .line 1796
    .line 1797
    move-result v3

    .line 1798
    if-eqz v3, :cond_48

    .line 1799
    .line 1800
    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v3

    .line 1804
    check-cast v3, Ljava/lang/String;

    .line 1805
    .line 1806
    const v7, -0x6eca7e7c

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v2, v7}, La/fet;->e0(I)V

    .line 1810
    .line 1811
    .line 1812
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1813
    .line 1814
    invoke-static {v9, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v7

    .line 1818
    sget-object v9, La/qmk;->a:La/zcl;

    .line 1819
    .line 1820
    const/4 v9, 0x2

    .line 1821
    const/4 v13, 0x0

    .line 1822
    invoke-static {v7, v5, v13, v9}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v35

    .line 1826
    new-instance v36, La/rqm;

    .line 1827
    .line 1828
    new-instance v5, La/tui0;

    .line 1829
    .line 1830
    sget-object v7, La/omn;->p2:La/ddk;

    .line 1831
    .line 1832
    sget-object v7, La/omn;->q2:[La/iiy;

    .line 1833
    .line 1834
    const/16 v22, 0x4

    .line 1835
    .line 1836
    aget-object v9, v7, v22

    .line 1837
    .line 1838
    invoke-virtual {v6, v11, v9}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v9

    .line 1842
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1843
    .line 1844
    .line 1845
    move-result v9

    .line 1846
    if-ne v1, v9, :cond_3e

    .line 1847
    .line 1848
    sget-object v9, La/s6t0;->a:La/pz40;

    .line 1849
    .line 1850
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v9

    .line 1854
    iget-object v9, v9, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1855
    .line 1856
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 1857
    .line 1858
    .line 1859
    move-result-wide v9

    .line 1860
    new-instance v12, La/y3d;

    .line 1861
    .line 1862
    invoke-direct {v12, v9, v10}, La/y3d;-><init>(J)V

    .line 1863
    .line 1864
    .line 1865
    goto :goto_23

    .line 1866
    :cond_3e
    const/4 v12, 0x0

    .line 1867
    :goto_23
    invoke-direct {v5, v3, v12}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 1868
    .line 1869
    .line 1870
    new-instance v3, La/nvi0;

    .line 1871
    .line 1872
    const/16 v22, 0x4

    .line 1873
    .line 1874
    aget-object v9, v7, v22

    .line 1875
    .line 1876
    invoke-virtual {v6, v11, v9}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v6

    .line 1880
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1881
    .line 1882
    .line 1883
    move-result v6

    .line 1884
    if-ne v1, v6, :cond_3f

    .line 1885
    .line 1886
    const/4 v6, 0x1

    .line 1887
    goto :goto_24

    .line 1888
    :cond_3f
    const/4 v6, 0x0

    .line 1889
    :goto_24
    invoke-direct {v3, v6}, La/nvi0;-><init>(Z)V

    .line 1890
    .line 1891
    .line 1892
    const/16 v33, 0x0

    .line 1893
    .line 1894
    aget-object v6, v7, v33

    .line 1895
    .line 1896
    invoke-virtual {v4, v11, v6}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v6

    .line 1900
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1901
    .line 1902
    .line 1903
    move-result v6

    .line 1904
    const/4 v13, 0x1

    .line 1905
    if-ne v6, v13, :cond_40

    .line 1906
    .line 1907
    sget-object v4, La/wui0;->a:La/wui0;

    .line 1908
    .line 1909
    :goto_25
    move-object/from16 v42, v4

    .line 1910
    .line 1911
    goto :goto_26

    .line 1912
    :cond_40
    if-nez v1, :cond_41

    .line 1913
    .line 1914
    sget-object v4, La/wui0;->b:La/wui0;

    .line 1915
    .line 1916
    goto :goto_25

    .line 1917
    :cond_41
    aget-object v6, v7, v33

    .line 1918
    .line 1919
    invoke-virtual {v4, v11, v6}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v4

    .line 1923
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1924
    .line 1925
    .line 1926
    move-result v4

    .line 1927
    sub-int/2addr v4, v13

    .line 1928
    if-ne v1, v4, :cond_42

    .line 1929
    .line 1930
    sget-object v4, La/wui0;->d:La/wui0;

    .line 1931
    .line 1932
    goto :goto_25

    .line 1933
    :cond_42
    sget-object v4, La/wui0;->c:La/wui0;

    .line 1934
    .line 1935
    goto :goto_25

    .line 1936
    :goto_26
    const/16 v44, 0x0

    .line 1937
    .line 1938
    const/16 v45, 0x1ba

    .line 1939
    .line 1940
    const/16 v38, 0x0

    .line 1941
    .line 1942
    const/16 v40, 0x0

    .line 1943
    .line 1944
    const/16 v41, 0x0

    .line 1945
    .line 1946
    const/16 v43, 0x0

    .line 1947
    .line 1948
    move-object/from16 v39, v3

    .line 1949
    .line 1950
    move-object/from16 v37, v5

    .line 1951
    .line 1952
    invoke-direct/range {v36 .. v45}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 1953
    .line 1954
    .line 1955
    invoke-virtual {v2, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1956
    .line 1957
    .line 1958
    move-result v3

    .line 1959
    and-int/lit8 v4, v0, 0x70

    .line 1960
    .line 1961
    xor-int/lit8 v4, v4, 0x30

    .line 1962
    .line 1963
    const/16 v5, 0x20

    .line 1964
    .line 1965
    if-le v4, v5, :cond_43

    .line 1966
    .line 1967
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1968
    .line 1969
    .line 1970
    move-result v4

    .line 1971
    if-nez v4, :cond_44

    .line 1972
    .line 1973
    :cond_43
    and-int/lit8 v0, v0, 0x30

    .line 1974
    .line 1975
    if-ne v0, v5, :cond_45

    .line 1976
    .line 1977
    :cond_44
    const/16 v20, 0x1

    .line 1978
    .line 1979
    goto :goto_27

    .line 1980
    :cond_45
    const/16 v20, 0x0

    .line 1981
    .line 1982
    :goto_27
    or-int v0, v3, v20

    .line 1983
    .line 1984
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v3

    .line 1988
    if-nez v0, :cond_46

    .line 1989
    .line 1990
    if-ne v3, v8, :cond_47

    .line 1991
    .line 1992
    :cond_46
    new-instance v3, La/tfe;

    .line 1993
    .line 1994
    const/4 v0, 0x4

    .line 1995
    invoke-direct {v3, v11, v1, v0}, La/tfe;-><init>(Ljava/lang/Object;IB)V

    .line 1996
    .line 1997
    .line 1998
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1999
    .line 2000
    .line 2001
    :cond_47
    move-object/from16 v39, v3

    .line 2002
    .line 2003
    check-cast v39, Lkotlin/jvm/functions/Function0;

    .line 2004
    .line 2005
    const/16 v44, 0x0

    .line 2006
    .line 2007
    const/16 v45, 0xec

    .line 2008
    .line 2009
    const/16 v37, 0x0

    .line 2010
    .line 2011
    const/16 v38, 0x0

    .line 2012
    .line 2013
    const/16 v40, 0x0

    .line 2014
    .line 2015
    const/16 v41, 0x0

    .line 2016
    .line 2017
    const/16 v42, 0x0

    .line 2018
    .line 2019
    move-object/from16 v43, v2

    .line 2020
    .line 2021
    invoke-static/range {v35 .. v45}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 2022
    .line 2023
    .line 2024
    move-object/from16 v0, v43

    .line 2025
    .line 2026
    const/4 v10, 0x0

    .line 2027
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 2028
    .line 2029
    .line 2030
    goto :goto_28

    .line 2031
    :cond_48
    move-object v0, v2

    .line 2032
    invoke-virtual {v0}, La/fet;->X()V

    .line 2033
    .line 2034
    .line 2035
    :goto_28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2036
    .line 2037
    return-object v0

    .line 2038
    :pswitch_12
    const/4 v0, 0x4

    .line 2039
    const/16 v5, 0x20

    .line 2040
    .line 2041
    move-object/from16 v1, p1

    .line 2042
    .line 2043
    check-cast v1, La/g9z;

    .line 2044
    .line 2045
    move-object/from16 v2, p2

    .line 2046
    .line 2047
    check-cast v2, Ljava/lang/Number;

    .line 2048
    .line 2049
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2050
    .line 2051
    .line 2052
    move-result v2

    .line 2053
    move-object/from16 v3, p3

    .line 2054
    .line 2055
    check-cast v3, La/fet;

    .line 2056
    .line 2057
    move-object/from16 v4, p4

    .line 2058
    .line 2059
    check-cast v4, Ljava/lang/Number;

    .line 2060
    .line 2061
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 2062
    .line 2063
    .line 2064
    move-result v4

    .line 2065
    and-int/lit8 v6, v4, 0x6

    .line 2066
    .line 2067
    if-nez v6, :cond_4a

    .line 2068
    .line 2069
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2070
    .line 2071
    .line 2072
    move-result v1

    .line 2073
    if-eqz v1, :cond_49

    .line 2074
    .line 2075
    move v14, v0

    .line 2076
    goto :goto_29

    .line 2077
    :cond_49
    const/4 v14, 0x2

    .line 2078
    :goto_29
    or-int v0, v4, v14

    .line 2079
    .line 2080
    goto :goto_2a

    .line 2081
    :cond_4a
    move v0, v4

    .line 2082
    :goto_2a
    and-int/lit8 v1, v4, 0x30

    .line 2083
    .line 2084
    if-nez v1, :cond_4c

    .line 2085
    .line 2086
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 2087
    .line 2088
    .line 2089
    move-result v1

    .line 2090
    if-eqz v1, :cond_4b

    .line 2091
    .line 2092
    move v14, v5

    .line 2093
    goto :goto_2b

    .line 2094
    :cond_4b
    const/16 v14, 0x10

    .line 2095
    .line 2096
    :goto_2b
    or-int/2addr v0, v14

    .line 2097
    :cond_4c
    and-int/lit16 v1, v0, 0x93

    .line 2098
    .line 2099
    if-eq v1, v13, :cond_4d

    .line 2100
    .line 2101
    const/4 v1, 0x1

    .line 2102
    :goto_2c
    const/16 v20, 0x1

    .line 2103
    .line 2104
    goto :goto_2d

    .line 2105
    :cond_4d
    const/4 v1, 0x0

    .line 2106
    goto :goto_2c

    .line 2107
    :goto_2d
    and-int/lit8 v0, v0, 0x1

    .line 2108
    .line 2109
    invoke-virtual {v3, v0, v1}, La/fet;->U(IZ)Z

    .line 2110
    .line 2111
    .line 2112
    move-result v0

    .line 2113
    if-eqz v0, :cond_4f

    .line 2114
    .line 2115
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v0

    .line 2119
    check-cast v0, La/f7m;

    .line 2120
    .line 2121
    const v1, 0x7bc0658b

    .line 2122
    .line 2123
    .line 2124
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 2125
    .line 2126
    .line 2127
    check-cast v11, La/l7m;

    .line 2128
    .line 2129
    iget-object v1, v11, La/l7m;->d:La/a4x;

    .line 2130
    .line 2131
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 2132
    .line 2133
    .line 2134
    move-result v1

    .line 2135
    if-eq v2, v1, :cond_4e

    .line 2136
    .line 2137
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2138
    .line 2139
    const/high16 v10, 0x41000000    # 8.0f

    .line 2140
    .line 2141
    move v7, v10

    .line 2142
    goto :goto_2e

    .line 2143
    :cond_4e
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2144
    .line 2145
    const/4 v7, 0x0

    .line 2146
    :goto_2e
    const/4 v8, 0x0

    .line 2147
    const/16 v9, 0xb

    .line 2148
    .line 2149
    sget-object v4, La/jm40;->b:La/jm40;

    .line 2150
    .line 2151
    const/4 v5, 0x0

    .line 2152
    const/4 v6, 0x0

    .line 2153
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v1

    .line 2157
    const/4 v10, 0x0

    .line 2158
    invoke-static {v1, v0, v3, v10}, La/dub;->m(La/mm40;La/f7m;La/fet;I)V

    .line 2159
    .line 2160
    .line 2161
    invoke-virtual {v3, v10}, La/fet;->r(Z)V

    .line 2162
    .line 2163
    .line 2164
    goto :goto_2f

    .line 2165
    :cond_4f
    invoke-virtual {v3}, La/fet;->X()V

    .line 2166
    .line 2167
    .line 2168
    :goto_2f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2169
    .line 2170
    return-object v0

    .line 2171
    :pswitch_13
    const/4 v0, 0x4

    .line 2172
    const/16 v5, 0x20

    .line 2173
    .line 2174
    move-object/from16 v1, p1

    .line 2175
    .line 2176
    check-cast v1, La/g9z;

    .line 2177
    .line 2178
    move-object/from16 v3, p2

    .line 2179
    .line 2180
    check-cast v3, Ljava/lang/Number;

    .line 2181
    .line 2182
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2183
    .line 2184
    .line 2185
    move-result v3

    .line 2186
    move-object/from16 v4, p3

    .line 2187
    .line 2188
    check-cast v4, La/fet;

    .line 2189
    .line 2190
    move-object/from16 v6, p4

    .line 2191
    .line 2192
    check-cast v6, Ljava/lang/Number;

    .line 2193
    .line 2194
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2195
    .line 2196
    .line 2197
    move-result v6

    .line 2198
    check-cast v11, La/oic;

    .line 2199
    .line 2200
    and-int/lit8 v7, v6, 0x6

    .line 2201
    .line 2202
    if-nez v7, :cond_51

    .line 2203
    .line 2204
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2205
    .line 2206
    .line 2207
    move-result v1

    .line 2208
    if-eqz v1, :cond_50

    .line 2209
    .line 2210
    goto :goto_30

    .line 2211
    :cond_50
    const/4 v0, 0x2

    .line 2212
    :goto_30
    or-int/2addr v0, v6

    .line 2213
    goto :goto_31

    .line 2214
    :cond_51
    move v0, v6

    .line 2215
    :goto_31
    and-int/lit8 v1, v6, 0x30

    .line 2216
    .line 2217
    if-nez v1, :cond_53

    .line 2218
    .line 2219
    invoke-virtual {v4, v3}, La/fet;->e(I)Z

    .line 2220
    .line 2221
    .line 2222
    move-result v1

    .line 2223
    if-eqz v1, :cond_52

    .line 2224
    .line 2225
    move v14, v5

    .line 2226
    goto :goto_32

    .line 2227
    :cond_52
    const/16 v14, 0x10

    .line 2228
    .line 2229
    :goto_32
    or-int/2addr v0, v14

    .line 2230
    :cond_53
    and-int/lit16 v1, v0, 0x93

    .line 2231
    .line 2232
    if-eq v1, v13, :cond_54

    .line 2233
    .line 2234
    const/4 v1, 0x1

    .line 2235
    :goto_33
    const/16 v20, 0x1

    .line 2236
    .line 2237
    goto :goto_34

    .line 2238
    :cond_54
    const/4 v1, 0x0

    .line 2239
    goto :goto_33

    .line 2240
    :goto_34
    and-int/lit8 v0, v0, 0x1

    .line 2241
    .line 2242
    invoke-virtual {v4, v0, v1}, La/fet;->U(IZ)Z

    .line 2243
    .line 2244
    .line 2245
    move-result v0

    .line 2246
    if-eqz v0, :cond_5a

    .line 2247
    .line 2248
    check-cast v12, Ljava/util/ArrayList;

    .line 2249
    .line 2250
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2251
    .line 2252
    .line 2253
    move-result-object v0

    .line 2254
    check-cast v0, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;

    .line 2255
    .line 2256
    const v1, 0x4336a46c

    .line 2257
    .line 2258
    .line 2259
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 2260
    .line 2261
    .line 2262
    const/high16 v1, 0x3f800000    # 1.0f

    .line 2263
    .line 2264
    invoke-static {v9, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v5

    .line 2268
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2269
    .line 2270
    const/high16 v1, 0x42400000    # 48.0f

    .line 2271
    .line 2272
    invoke-static {v5, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v1

    .line 2276
    const/high16 v5, 0x41800000    # 16.0f

    .line 2277
    .line 2278
    const/4 v6, 0x2

    .line 2279
    const/4 v13, 0x0

    .line 2280
    invoke-static {v1, v5, v13, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2281
    .line 2282
    .line 2283
    move-result-object v34

    .line 2284
    invoke-virtual {v4, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2285
    .line 2286
    .line 2287
    move-result v1

    .line 2288
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2289
    .line 2290
    .line 2291
    move-result v5

    .line 2292
    or-int/2addr v1, v5

    .line 2293
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v5

    .line 2297
    if-nez v1, :cond_55

    .line 2298
    .line 2299
    if-ne v5, v8, :cond_56

    .line 2300
    .line 2301
    :cond_55
    new-instance v5, La/h5;

    .line 2302
    .line 2303
    const/16 v1, 0x11

    .line 2304
    .line 2305
    invoke-direct {v5, v11, v0, v1}, La/h5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2306
    .line 2307
    .line 2308
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2309
    .line 2310
    .line 2311
    :cond_56
    move-object/from16 v39, v5

    .line 2312
    .line 2313
    check-cast v39, Lkotlin/jvm/functions/Function0;

    .line 2314
    .line 2315
    const/16 v40, 0x1c

    .line 2316
    .line 2317
    const/16 v35, 0x0

    .line 2318
    .line 2319
    const/16 v36, 0x0

    .line 2320
    .line 2321
    const/16 v37, 0x0

    .line 2322
    .line 2323
    const/16 v38, 0x0

    .line 2324
    .line 2325
    invoke-static/range {v34 .. v40}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 2326
    .line 2327
    .line 2328
    move-result-object v1

    .line 2329
    sget-object v5, La/gqw0;->a:La/zx7;

    .line 2330
    .line 2331
    const/4 v10, 0x0

    .line 2332
    invoke-static {v5, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v5

    .line 2336
    iget-wide v6, v4, La/fet;->T:J

    .line 2337
    .line 2338
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 2339
    .line 2340
    .line 2341
    move-result v6

    .line 2342
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 2343
    .line 2344
    .line 2345
    move-result-object v7

    .line 2346
    invoke-static {v4, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 2347
    .line 2348
    .line 2349
    move-result-object v1

    .line 2350
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 2351
    .line 2352
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2353
    .line 2354
    .line 2355
    invoke-virtual {v4}, La/fet;->i0()V

    .line 2356
    .line 2357
    .line 2358
    iget-boolean v8, v4, La/fet;->S:Z

    .line 2359
    .line 2360
    if-eqz v8, :cond_57

    .line 2361
    .line 2362
    invoke-virtual {v4, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 2363
    .line 2364
    .line 2365
    goto :goto_35

    .line 2366
    :cond_57
    invoke-virtual {v4}, La/fet;->r0()V

    .line 2367
    .line 2368
    .line 2369
    :goto_35
    sget-object v2, La/gqw0;->x:La/shd;

    .line 2370
    .line 2371
    invoke-static {v4, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2372
    .line 2373
    .line 2374
    sget-object v2, La/gqw0;->w:La/shd;

    .line 2375
    .line 2376
    invoke-static {v4, v7, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2377
    .line 2378
    .line 2379
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v2

    .line 2383
    sget-object v5, La/gqw0;->y:La/shd;

    .line 2384
    .line 2385
    invoke-static {v4, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2386
    .line 2387
    .line 2388
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 2389
    .line 2390
    .line 2391
    sget-object v2, La/gqw0;->v:La/shd;

    .line 2392
    .line 2393
    invoke-static {v4, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2394
    .line 2395
    .line 2396
    sget-object v1, La/gqw0;->d:La/zx7;

    .line 2397
    .line 2398
    sget-object v2, La/jr8;->a:La/jr8;

    .line 2399
    .line 2400
    invoke-virtual {v2, v9, v1}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 2401
    .line 2402
    .line 2403
    move-result-object v36

    .line 2404
    iget-object v1, v0, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;->a:Ljava/lang/String;

    .line 2405
    .line 2406
    sget-object v43, La/j1t0;->c:La/qrq;

    .line 2407
    .line 2408
    sget-wide v40, La/qmk;->s:J

    .line 2409
    .line 2410
    sget-wide v49, La/qmk;->G:J

    .line 2411
    .line 2412
    new-instance v51, La/y9q0;

    .line 2413
    .line 2414
    const/16 v48, 0x0

    .line 2415
    .line 2416
    move-object/from16 v37, v51

    .line 2417
    .line 2418
    const v51, 0xfdffdd

    .line 2419
    .line 2420
    .line 2421
    const-wide/16 v38, 0x0

    .line 2422
    .line 2423
    const/16 v42, 0x0

    .line 2424
    .line 2425
    const-wide/16 v44, 0x0

    .line 2426
    .line 2427
    const/16 v46, 0x0

    .line 2428
    .line 2429
    const/16 v47, 0x0

    .line 2430
    .line 2431
    invoke-direct/range {v37 .. v51}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 2432
    .line 2433
    .line 2434
    iget-boolean v0, v0, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;->c:Z

    .line 2435
    .line 2436
    if-eqz v0, :cond_58

    .line 2437
    .line 2438
    const v0, 0xd913535

    .line 2439
    .line 2440
    .line 2441
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 2442
    .line 2443
    .line 2444
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 2445
    .line 2446
    invoke-virtual {v4, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2447
    .line 2448
    .line 2449
    move-result-object v0

    .line 2450
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2451
    .line 2452
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 2453
    .line 2454
    .line 2455
    move-result-wide v5

    .line 2456
    const/4 v10, 0x0

    .line 2457
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 2458
    .line 2459
    .line 2460
    :goto_36
    move-wide/from16 v52, v5

    .line 2461
    .line 2462
    goto :goto_37

    .line 2463
    :cond_58
    const/4 v10, 0x0

    .line 2464
    const v0, 0xd92e393

    .line 2465
    .line 2466
    .line 2467
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 2468
    .line 2469
    .line 2470
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 2471
    .line 2472
    invoke-virtual {v4, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v0

    .line 2476
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2477
    .line 2478
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 2479
    .line 2480
    .line 2481
    move-result-wide v5

    .line 2482
    invoke-virtual {v4, v10}, La/fet;->r(Z)V

    .line 2483
    .line 2484
    .line 2485
    goto :goto_36

    .line 2486
    :goto_37
    const/16 v68, 0x0

    .line 2487
    .line 2488
    const v69, 0xfffffe

    .line 2489
    .line 2490
    .line 2491
    const-wide/16 v54, 0x0

    .line 2492
    .line 2493
    const/16 v56, 0x0

    .line 2494
    .line 2495
    const/16 v57, 0x0

    .line 2496
    .line 2497
    const/16 v58, 0x0

    .line 2498
    .line 2499
    const-wide/16 v59, 0x0

    .line 2500
    .line 2501
    const/16 v61, 0x0

    .line 2502
    .line 2503
    const/16 v62, 0x0

    .line 2504
    .line 2505
    const/16 v63, 0x0

    .line 2506
    .line 2507
    const/16 v64, 0x0

    .line 2508
    .line 2509
    const-wide/16 v65, 0x0

    .line 2510
    .line 2511
    const/16 v67, 0x0

    .line 2512
    .line 2513
    move-object/from16 v51, v37

    .line 2514
    .line 2515
    invoke-static/range {v51 .. v69}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 2516
    .line 2517
    .line 2518
    move-result-object v55

    .line 2519
    const/16 v58, 0x180

    .line 2520
    .line 2521
    const v59, 0x1effc

    .line 2522
    .line 2523
    .line 2524
    const-wide/16 v37, 0x0

    .line 2525
    .line 2526
    const/16 v39, 0x0

    .line 2527
    .line 2528
    const-wide/16 v40, 0x0

    .line 2529
    .line 2530
    const/16 v42, 0x0

    .line 2531
    .line 2532
    const/16 v43, 0x0

    .line 2533
    .line 2534
    const/16 v44, 0x0

    .line 2535
    .line 2536
    const-wide/16 v45, 0x0

    .line 2537
    .line 2538
    const/16 v47, 0x0

    .line 2539
    .line 2540
    const-wide/16 v48, 0x0

    .line 2541
    .line 2542
    const/16 v50, 0x2

    .line 2543
    .line 2544
    const/16 v51, 0x0

    .line 2545
    .line 2546
    const/16 v52, 0x0

    .line 2547
    .line 2548
    const/16 v53, 0x0

    .line 2549
    .line 2550
    const/16 v54, 0x0

    .line 2551
    .line 2552
    const/16 v57, 0x0

    .line 2553
    .line 2554
    move-object/from16 v35, v1

    .line 2555
    .line 2556
    move-object/from16 v56, v4

    .line 2557
    .line 2558
    invoke-static/range {v35 .. v59}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 2559
    .line 2560
    .line 2561
    move-object/from16 v0, v56

    .line 2562
    .line 2563
    sget-object v1, La/oic;->l2:La/yk5;

    .line 2564
    .line 2565
    invoke-virtual {v11}, La/oic;->P0()Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v1

    .line 2569
    iget-object v1, v1, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;->c:Ljava/util/ArrayList;

    .line 2570
    .line 2571
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2572
    .line 2573
    .line 2574
    move-result v1

    .line 2575
    const/16 v20, 0x1

    .line 2576
    .line 2577
    add-int/lit8 v1, v1, -0x1

    .line 2578
    .line 2579
    if-eq v3, v1, :cond_59

    .line 2580
    .line 2581
    const v1, 0xd983c6b

    .line 2582
    .line 2583
    .line 2584
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 2585
    .line 2586
    .line 2587
    const/high16 v1, 0x3f800000    # 1.0f

    .line 2588
    .line 2589
    invoke-static {v9, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 2590
    .line 2591
    .line 2592
    move-result-object v1

    .line 2593
    sget-object v3, La/gqw0;->i:La/zx7;

    .line 2594
    .line 2595
    invoke-virtual {v2, v1, v3}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 2596
    .line 2597
    .line 2598
    move-result-object v28

    .line 2599
    const/16 v31, 0x6

    .line 2600
    .line 2601
    const/16 v32, 0x4

    .line 2602
    .line 2603
    sget-object v27, La/zfi0;->a:La/zfi0;

    .line 2604
    .line 2605
    const/16 v29, 0x0

    .line 2606
    .line 2607
    move-object/from16 v30, v0

    .line 2608
    .line 2609
    invoke-static/range {v27 .. v32}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 2610
    .line 2611
    .line 2612
    const/4 v10, 0x0

    .line 2613
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 2614
    .line 2615
    .line 2616
    :goto_38
    const/4 v13, 0x1

    .line 2617
    goto :goto_39

    .line 2618
    :cond_59
    const/4 v10, 0x0

    .line 2619
    const v1, 0xd9d311e

    .line 2620
    .line 2621
    .line 2622
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 2623
    .line 2624
    .line 2625
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 2626
    .line 2627
    .line 2628
    goto :goto_38

    .line 2629
    :goto_39
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 2630
    .line 2631
    .line 2632
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 2633
    .line 2634
    .line 2635
    goto :goto_3a

    .line 2636
    :cond_5a
    move-object v0, v4

    .line 2637
    invoke-virtual {v0}, La/fet;->X()V

    .line 2638
    .line 2639
    .line 2640
    :goto_3a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2641
    .line 2642
    return-object v0

    .line 2643
    :pswitch_14
    const/4 v0, 0x4

    .line 2644
    const/high16 v1, 0x41400000    # 12.0f

    .line 2645
    .line 2646
    const/16 v5, 0x20

    .line 2647
    .line 2648
    move-object/from16 v2, p1

    .line 2649
    .line 2650
    check-cast v2, La/g9z;

    .line 2651
    .line 2652
    move-object/from16 v3, p2

    .line 2653
    .line 2654
    check-cast v3, Ljava/lang/Number;

    .line 2655
    .line 2656
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2657
    .line 2658
    .line 2659
    move-result v3

    .line 2660
    move-object/from16 v4, p3

    .line 2661
    .line 2662
    check-cast v4, La/fet;

    .line 2663
    .line 2664
    move-object/from16 v6, p4

    .line 2665
    .line 2666
    check-cast v6, Ljava/lang/Number;

    .line 2667
    .line 2668
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 2669
    .line 2670
    .line 2671
    move-result v6

    .line 2672
    and-int/lit8 v7, v6, 0x6

    .line 2673
    .line 2674
    if-nez v7, :cond_5c

    .line 2675
    .line 2676
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2677
    .line 2678
    .line 2679
    move-result v2

    .line 2680
    if-eqz v2, :cond_5b

    .line 2681
    .line 2682
    goto :goto_3b

    .line 2683
    :cond_5b
    const/4 v0, 0x2

    .line 2684
    :goto_3b
    or-int/2addr v0, v6

    .line 2685
    goto :goto_3c

    .line 2686
    :cond_5c
    move v0, v6

    .line 2687
    :goto_3c
    and-int/lit8 v2, v6, 0x30

    .line 2688
    .line 2689
    if-nez v2, :cond_5e

    .line 2690
    .line 2691
    invoke-virtual {v4, v3}, La/fet;->e(I)Z

    .line 2692
    .line 2693
    .line 2694
    move-result v2

    .line 2695
    if-eqz v2, :cond_5d

    .line 2696
    .line 2697
    move v14, v5

    .line 2698
    goto :goto_3d

    .line 2699
    :cond_5d
    const/16 v14, 0x10

    .line 2700
    .line 2701
    :goto_3d
    or-int/2addr v0, v14

    .line 2702
    :cond_5e
    and-int/lit16 v2, v0, 0x93

    .line 2703
    .line 2704
    if-eq v2, v13, :cond_5f

    .line 2705
    .line 2706
    const/4 v2, 0x1

    .line 2707
    :goto_3e
    const/16 v20, 0x1

    .line 2708
    .line 2709
    goto :goto_3f

    .line 2710
    :cond_5f
    const/4 v2, 0x0

    .line 2711
    goto :goto_3e

    .line 2712
    :goto_3f
    and-int/lit8 v0, v0, 0x1

    .line 2713
    .line 2714
    invoke-virtual {v4, v0, v2}, La/fet;->U(IZ)Z

    .line 2715
    .line 2716
    .line 2717
    move-result v0

    .line 2718
    if-eqz v0, :cond_62

    .line 2719
    .line 2720
    check-cast v12, La/a4x;

    .line 2721
    .line 2722
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2723
    .line 2724
    .line 2725
    move-result-object v0

    .line 2726
    check-cast v0, La/n48;

    .line 2727
    .line 2728
    const v2, 0x5fc3e71f

    .line 2729
    .line 2730
    .line 2731
    invoke-virtual {v4, v2}, La/fet;->e0(I)V

    .line 2732
    .line 2733
    .line 2734
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2735
    .line 2736
    .line 2737
    check-cast v0, La/l48;

    .line 2738
    .line 2739
    iget-object v2, v0, La/l48;->a:Ljava/lang/String;

    .line 2740
    .line 2741
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 2742
    .line 2743
    .line 2744
    move-result v5

    .line 2745
    sget-object v12, La/jm40;->b:La/jm40;

    .line 2746
    .line 2747
    if-lez v5, :cond_60

    .line 2748
    .line 2749
    const v5, 0x5fc55f1d

    .line 2750
    .line 2751
    .line 2752
    invoke-virtual {v4, v5}, La/fet;->e0(I)V

    .line 2753
    .line 2754
    .line 2755
    invoke-static {v4}, La/xfn;->a(La/fet;)La/wfn;

    .line 2756
    .line 2757
    .line 2758
    move-result-object v5

    .line 2759
    iget v5, v5, La/wfn;->d:F

    .line 2760
    .line 2761
    const/4 v6, 0x2

    .line 2762
    const/4 v13, 0x0

    .line 2763
    invoke-static {v12, v5, v13, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2764
    .line 2765
    .line 2766
    move-result-object v24

    .line 2767
    new-instance v35, La/hjm;

    .line 2768
    .line 2769
    new-instance v5, La/ojm;

    .line 2770
    .line 2771
    const/16 v6, 0x7f

    .line 2772
    .line 2773
    invoke-direct {v5, v6}, La/ojm;-><init>(I)V

    .line 2774
    .line 2775
    .line 2776
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 2777
    .line 2778
    invoke-virtual {v4, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2779
    .line 2780
    .line 2781
    move-result-object v6

    .line 2782
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2783
    .line 2784
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 2785
    .line 2786
    .line 2787
    move-result-wide v6

    .line 2788
    new-instance v8, La/y3d;

    .line 2789
    .line 2790
    invoke-direct {v8, v6, v7}, La/y3d;-><init>(J)V

    .line 2791
    .line 2792
    .line 2793
    const/16 v47, 0x0

    .line 2794
    .line 2795
    const/16 v48, 0x1ff8

    .line 2796
    .line 2797
    const/16 v39, 0x0

    .line 2798
    .line 2799
    const/16 v40, 0x0

    .line 2800
    .line 2801
    const/16 v41, 0x0

    .line 2802
    .line 2803
    const/16 v42, 0x0

    .line 2804
    .line 2805
    const/16 v43, 0x0

    .line 2806
    .line 2807
    const/16 v44, 0x0

    .line 2808
    .line 2809
    const/16 v45, 0x0

    .line 2810
    .line 2811
    const/16 v46, 0x0

    .line 2812
    .line 2813
    move-object/from16 v36, v2

    .line 2814
    .line 2815
    move-object/from16 v37, v5

    .line 2816
    .line 2817
    move-object/from16 v38, v8

    .line 2818
    .line 2819
    invoke-direct/range {v35 .. v48}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 2820
    .line 2821
    .line 2822
    sget-object v26, La/kjm;->b:La/kjm;

    .line 2823
    .line 2824
    const/16 v31, 0x180

    .line 2825
    .line 2826
    const/16 v32, 0x38

    .line 2827
    .line 2828
    const/16 v27, 0x0

    .line 2829
    .line 2830
    const/16 v28, 0x0

    .line 2831
    .line 2832
    const/16 v29, 0x0

    .line 2833
    .line 2834
    move-object/from16 v30, v4

    .line 2835
    .line 2836
    move-object/from16 v25, v35

    .line 2837
    .line 2838
    invoke-static/range {v24 .. v32}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 2839
    .line 2840
    .line 2841
    move-object/from16 v2, v30

    .line 2842
    .line 2843
    const/4 v10, 0x0

    .line 2844
    invoke-virtual {v2, v10}, La/fet;->r(Z)V

    .line 2845
    .line 2846
    .line 2847
    goto :goto_40

    .line 2848
    :cond_60
    move-object v2, v4

    .line 2849
    const/4 v10, 0x0

    .line 2850
    const/4 v13, 0x0

    .line 2851
    const v4, 0x5fce0d6d

    .line 2852
    .line 2853
    .line 2854
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 2855
    .line 2856
    .line 2857
    invoke-virtual {v2, v10}, La/fet;->r(Z)V

    .line 2858
    .line 2859
    .line 2860
    :goto_40
    check-cast v11, La/c58;

    .line 2861
    .line 2862
    check-cast v11, La/y48;

    .line 2863
    .line 2864
    iget-object v4, v11, La/y48;->d:La/a4x;

    .line 2865
    .line 2866
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 2867
    .line 2868
    .line 2869
    move-result v4

    .line 2870
    const/16 v20, 0x1

    .line 2871
    .line 2872
    add-int/lit8 v4, v4, -0x1

    .line 2873
    .line 2874
    if-ne v3, v4, :cond_61

    .line 2875
    .line 2876
    sget-object v3, La/qmk;->a:La/zcl;

    .line 2877
    .line 2878
    move/from16 v16, v1

    .line 2879
    .line 2880
    goto :goto_41

    .line 2881
    :cond_61
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2882
    .line 2883
    move/from16 v16, v13

    .line 2884
    .line 2885
    :goto_41
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 2886
    .line 2887
    .line 2888
    move-result-object v1

    .line 2889
    iget v13, v1, La/wfn;->d:F

    .line 2890
    .line 2891
    invoke-static {v2}, La/xfn;->a(La/fet;)La/wfn;

    .line 2892
    .line 2893
    .line 2894
    move-result-object v1

    .line 2895
    iget v15, v1, La/wfn;->d:F

    .line 2896
    .line 2897
    const/4 v14, 0x0

    .line 2898
    const/16 v17, 0x2

    .line 2899
    .line 2900
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v36

    .line 2904
    iget-object v0, v0, La/l48;->b:Ljava/lang/String;

    .line 2905
    .line 2906
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 2907
    .line 2908
    invoke-virtual {v2, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2909
    .line 2910
    .line 2911
    move-result-object v1

    .line 2912
    check-cast v1, La/g1t0;

    .line 2913
    .line 2914
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2915
    .line 2916
    .line 2917
    invoke-static {}, La/g1t0;->k()La/y9q0;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v55

    .line 2921
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 2922
    .line 2923
    invoke-virtual {v2, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2924
    .line 2925
    .line 2926
    move-result-object v1

    .line 2927
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2928
    .line 2929
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 2930
    .line 2931
    .line 2932
    move-result-wide v37

    .line 2933
    const/16 v58, 0x0

    .line 2934
    .line 2935
    const v59, 0x1fff8

    .line 2936
    .line 2937
    .line 2938
    const/16 v39, 0x0

    .line 2939
    .line 2940
    const-wide/16 v40, 0x0

    .line 2941
    .line 2942
    const/16 v42, 0x0

    .line 2943
    .line 2944
    const/16 v43, 0x0

    .line 2945
    .line 2946
    const/16 v44, 0x0

    .line 2947
    .line 2948
    const-wide/16 v45, 0x0

    .line 2949
    .line 2950
    const/16 v47, 0x0

    .line 2951
    .line 2952
    const-wide/16 v48, 0x0

    .line 2953
    .line 2954
    const/16 v50, 0x0

    .line 2955
    .line 2956
    const/16 v51, 0x0

    .line 2957
    .line 2958
    const/16 v52, 0x0

    .line 2959
    .line 2960
    const/16 v53, 0x0

    .line 2961
    .line 2962
    const/16 v54, 0x0

    .line 2963
    .line 2964
    const/16 v57, 0x0

    .line 2965
    .line 2966
    move-object/from16 v35, v0

    .line 2967
    .line 2968
    move-object/from16 v56, v2

    .line 2969
    .line 2970
    invoke-static/range {v35 .. v59}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 2971
    .line 2972
    .line 2973
    const/4 v10, 0x0

    .line 2974
    invoke-virtual {v2, v10}, La/fet;->r(Z)V

    .line 2975
    .line 2976
    .line 2977
    goto :goto_42

    .line 2978
    :cond_62
    move-object v2, v4

    .line 2979
    invoke-virtual {v2}, La/fet;->X()V

    .line 2980
    .line 2981
    .line 2982
    :goto_42
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2983
    .line 2984
    return-object v0

    .line 2985
    :pswitch_15
    move v6, v14

    .line 2986
    const/4 v0, 0x4

    .line 2987
    const/16 v5, 0x20

    .line 2988
    .line 2989
    move-object/from16 v1, p1

    .line 2990
    .line 2991
    check-cast v1, La/k8z;

    .line 2992
    .line 2993
    move-object/from16 v2, p2

    .line 2994
    .line 2995
    check-cast v2, Ljava/lang/Number;

    .line 2996
    .line 2997
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 2998
    .line 2999
    .line 3000
    move-result v2

    .line 3001
    move-object/from16 v3, p3

    .line 3002
    .line 3003
    check-cast v3, La/fet;

    .line 3004
    .line 3005
    move-object/from16 v4, p4

    .line 3006
    .line 3007
    check-cast v4, Ljava/lang/Number;

    .line 3008
    .line 3009
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3010
    .line 3011
    .line 3012
    move-result v4

    .line 3013
    and-int/lit8 v7, v4, 0x6

    .line 3014
    .line 3015
    if-nez v7, :cond_64

    .line 3016
    .line 3017
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 3018
    .line 3019
    .line 3020
    move-result v1

    .line 3021
    if-eqz v1, :cond_63

    .line 3022
    .line 3023
    move v14, v0

    .line 3024
    goto :goto_43

    .line 3025
    :cond_63
    move v14, v6

    .line 3026
    :goto_43
    or-int v0, v4, v14

    .line 3027
    .line 3028
    goto :goto_44

    .line 3029
    :cond_64
    move v0, v4

    .line 3030
    :goto_44
    and-int/lit8 v1, v4, 0x30

    .line 3031
    .line 3032
    if-nez v1, :cond_66

    .line 3033
    .line 3034
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 3035
    .line 3036
    .line 3037
    move-result v1

    .line 3038
    if-eqz v1, :cond_65

    .line 3039
    .line 3040
    move v14, v5

    .line 3041
    goto :goto_45

    .line 3042
    :cond_65
    const/16 v14, 0x10

    .line 3043
    .line 3044
    :goto_45
    or-int/2addr v0, v14

    .line 3045
    :cond_66
    and-int/lit16 v1, v0, 0x93

    .line 3046
    .line 3047
    if-eq v1, v13, :cond_67

    .line 3048
    .line 3049
    const/4 v1, 0x1

    .line 3050
    :goto_46
    const/16 v20, 0x1

    .line 3051
    .line 3052
    goto :goto_47

    .line 3053
    :cond_67
    const/4 v1, 0x0

    .line 3054
    goto :goto_46

    .line 3055
    :goto_47
    and-int/lit8 v0, v0, 0x1

    .line 3056
    .line 3057
    invoke-virtual {v3, v0, v1}, La/fet;->U(IZ)Z

    .line 3058
    .line 3059
    .line 3060
    move-result v0

    .line 3061
    if-eqz v0, :cond_68

    .line 3062
    .line 3063
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3064
    .line 3065
    .line 3066
    move-result-object v0

    .line 3067
    check-cast v0, La/ko5;

    .line 3068
    .line 3069
    const v1, -0xb2e2292

    .line 3070
    .line 3071
    .line 3072
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 3073
    .line 3074
    .line 3075
    check-cast v11, La/rfv;

    .line 3076
    .line 3077
    move/from16 v2, v17

    .line 3078
    .line 3079
    const/4 v1, 0x0

    .line 3080
    invoke-static {v0, v11, v1, v3, v2}, La/bsr0;->s(La/ko5;La/rfv;La/mm40;La/fet;I)V

    .line 3081
    .line 3082
    .line 3083
    const/4 v10, 0x0

    .line 3084
    invoke-virtual {v3, v10}, La/fet;->r(Z)V

    .line 3085
    .line 3086
    .line 3087
    goto :goto_48

    .line 3088
    :cond_68
    invoke-virtual {v3}, La/fet;->X()V

    .line 3089
    .line 3090
    .line 3091
    :goto_48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3092
    .line 3093
    return-object v0

    .line 3094
    :pswitch_16
    move v6, v14

    .line 3095
    const/4 v0, 0x4

    .line 3096
    const/16 v5, 0x20

    .line 3097
    .line 3098
    move-object/from16 v1, p1

    .line 3099
    .line 3100
    check-cast v1, La/g9z;

    .line 3101
    .line 3102
    move-object/from16 v2, p2

    .line 3103
    .line 3104
    check-cast v2, Ljava/lang/Number;

    .line 3105
    .line 3106
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 3107
    .line 3108
    .line 3109
    move-result v2

    .line 3110
    move-object/from16 v3, p3

    .line 3111
    .line 3112
    check-cast v3, La/fet;

    .line 3113
    .line 3114
    move-object/from16 v4, p4

    .line 3115
    .line 3116
    check-cast v4, Ljava/lang/Number;

    .line 3117
    .line 3118
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 3119
    .line 3120
    .line 3121
    move-result v4

    .line 3122
    check-cast v11, La/ze4;

    .line 3123
    .line 3124
    and-int/lit8 v7, v4, 0x6

    .line 3125
    .line 3126
    if-nez v7, :cond_6a

    .line 3127
    .line 3128
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 3129
    .line 3130
    .line 3131
    move-result v1

    .line 3132
    if-eqz v1, :cond_69

    .line 3133
    .line 3134
    move v14, v0

    .line 3135
    goto :goto_49

    .line 3136
    :cond_69
    move v14, v6

    .line 3137
    :goto_49
    or-int v0, v4, v14

    .line 3138
    .line 3139
    :goto_4a
    const/16 v17, 0x30

    .line 3140
    .line 3141
    goto :goto_4b

    .line 3142
    :cond_6a
    move v0, v4

    .line 3143
    goto :goto_4a

    .line 3144
    :goto_4b
    and-int/lit8 v1, v4, 0x30

    .line 3145
    .line 3146
    if-nez v1, :cond_6c

    .line 3147
    .line 3148
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 3149
    .line 3150
    .line 3151
    move-result v1

    .line 3152
    if-eqz v1, :cond_6b

    .line 3153
    .line 3154
    move v14, v5

    .line 3155
    goto :goto_4c

    .line 3156
    :cond_6b
    const/16 v14, 0x10

    .line 3157
    .line 3158
    :goto_4c
    or-int/2addr v0, v14

    .line 3159
    :cond_6c
    and-int/lit16 v1, v0, 0x93

    .line 3160
    .line 3161
    if-eq v1, v13, :cond_6d

    .line 3162
    .line 3163
    const/4 v1, 0x1

    .line 3164
    :goto_4d
    const/16 v20, 0x1

    .line 3165
    .line 3166
    goto :goto_4e

    .line 3167
    :cond_6d
    const/4 v1, 0x0

    .line 3168
    goto :goto_4d

    .line 3169
    :goto_4e
    and-int/lit8 v0, v0, 0x1

    .line 3170
    .line 3171
    invoke-virtual {v3, v0, v1}, La/fet;->U(IZ)Z

    .line 3172
    .line 3173
    .line 3174
    move-result v0

    .line 3175
    if-eqz v0, :cond_70

    .line 3176
    .line 3177
    invoke-interface {v12, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3178
    .line 3179
    .line 3180
    move-result-object v0

    .line 3181
    check-cast v0, La/af4;

    .line 3182
    .line 3183
    const v1, -0xa6a804f

    .line 3184
    .line 3185
    .line 3186
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 3187
    .line 3188
    .line 3189
    sget-object v1, La/qmk;->a:La/zcl;

    .line 3190
    .line 3191
    const/high16 v1, 0x42600000    # 56.0f

    .line 3192
    .line 3193
    invoke-static {v9, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 3194
    .line 3195
    .line 3196
    move-result-object v1

    .line 3197
    sget-object v2, La/vgg0;->a:La/ugg0;

    .line 3198
    .line 3199
    invoke-static {v1, v2}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 3200
    .line 3201
    .line 3202
    move-result-object v21

    .line 3203
    iget v1, v0, La/af4;->a:I

    .line 3204
    .line 3205
    const/4 v10, 0x0

    .line 3206
    invoke-static {v1, v10, v3}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 3207
    .line 3208
    .line 3209
    move-result-object v22

    .line 3210
    invoke-virtual {v3, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 3211
    .line 3212
    .line 3213
    move-result v1

    .line 3214
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 3215
    .line 3216
    .line 3217
    move-result v2

    .line 3218
    or-int/2addr v1, v2

    .line 3219
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 3220
    .line 3221
    .line 3222
    move-result-object v2

    .line 3223
    if-nez v1, :cond_6e

    .line 3224
    .line 3225
    if-ne v2, v8, :cond_6f

    .line 3226
    .line 3227
    :cond_6e
    new-instance v2, La/h5;

    .line 3228
    .line 3229
    const/4 v1, 0x7

    .line 3230
    invoke-direct {v2, v11, v0, v1}, La/h5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3231
    .line 3232
    .line 3233
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 3234
    .line 3235
    .line 3236
    :cond_6f
    move-object/from16 v25, v2

    .line 3237
    .line 3238
    check-cast v25, Lkotlin/jvm/functions/Function0;

    .line 3239
    .line 3240
    const/16 v27, 0x40

    .line 3241
    .line 3242
    const/16 v28, 0xc

    .line 3243
    .line 3244
    const/16 v23, 0x0

    .line 3245
    .line 3246
    const/16 v24, 0x0

    .line 3247
    .line 3248
    move-object/from16 v26, v3

    .line 3249
    .line 3250
    invoke-static/range {v21 .. v28}, La/saj;->e(La/mm40;La/pm80;La/qge;La/hh80;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 3251
    .line 3252
    .line 3253
    move-object/from16 v0, v26

    .line 3254
    .line 3255
    const/4 v10, 0x0

    .line 3256
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 3257
    .line 3258
    .line 3259
    goto :goto_4f

    .line 3260
    :cond_70
    move-object v0, v3

    .line 3261
    invoke-virtual {v0}, La/fet;->X()V

    .line 3262
    .line 3263
    .line 3264
    :goto_4f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3265
    .line 3266
    return-object v0

    .line 3267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
