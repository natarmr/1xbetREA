.class public final synthetic La/fi20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:D

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:D

.field public final synthetic e:La/on20;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(DJZDLa/on20;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/fi20;->a:D

    iput-wide p3, p0, La/fi20;->b:J

    iput-boolean p5, p0, La/fi20;->c:Z

    iput-wide p6, p0, La/fi20;->d:D

    iput-object p8, p0, La/fi20;->e:La/on20;

    iput-boolean p9, p0, La/fi20;->f:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/oyg0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/a820;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, v2, La/a820;->g:La/hx4;

    .line 18
    .line 19
    iget-object v1, v3, La/hx4;->c:La/bx6;

    .line 20
    .line 21
    iget-object v4, v1, La/bx6;->b:La/tw6;

    .line 22
    .line 23
    iget-wide v5, v4, La/tw6;->b:D

    .line 24
    .line 25
    iget-wide v7, v4, La/tw6;->a:D

    .line 26
    .line 27
    iget-boolean v4, v1, La/bx6;->c:Z

    .line 28
    .line 29
    iget-wide v12, v0, La/fi20;->a:D

    .line 30
    .line 31
    cmpg-double v5, v12, v5

    .line 32
    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    iget-object v5, v2, La/a820;->m:La/vf7;

    .line 36
    .line 37
    iget-wide v9, v5, La/vf7;->a:J

    .line 38
    .line 39
    iget-wide v14, v0, La/fi20;->b:J

    .line 40
    .line 41
    cmp-long v5, v14, v9

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v5, 0x0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    const/4 v5, 0x1

    .line 49
    :goto_1
    const-wide/high16 v9, -0x4010000000000000L    # -1.0

    .line 50
    .line 51
    cmpg-double v9, v7, v9

    .line 52
    .line 53
    if-nez v9, :cond_2

    .line 54
    .line 55
    if-nez v5, :cond_2

    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_2
    if-nez v9, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    if-nez v5, :cond_6

    .line 62
    .line 63
    const-wide/16 v9, 0x0

    .line 64
    .line 65
    cmpg-double v5, v7, v9

    .line 66
    .line 67
    if-nez v5, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    iget-boolean v5, v0, La/fi20;->c:Z

    .line 71
    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    iget-wide v9, v0, La/fi20;->d:D

    .line 75
    .line 76
    cmpl-double v5, v7, v9

    .line 77
    .line 78
    if-lez v5, :cond_5

    .line 79
    .line 80
    move-wide v10, v9

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    move-wide v10, v7

    .line 83
    goto :goto_3

    .line 84
    :cond_6
    :goto_2
    move-wide v10, v12

    .line 85
    :goto_3
    sget-object v5, La/pn40;->a:La/pn40;

    .line 86
    .line 87
    sget-object v5, La/p3u0;->g:La/p3u0;

    .line 88
    .line 89
    invoke-static {v10, v11, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    new-instance v9, La/a8q0;

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v14

    .line 99
    invoke-static {v14, v14}, La/s7n0;->e(II)J

    .line 100
    .line 101
    .line 102
    move-result-wide v14

    .line 103
    const/4 v6, 0x4

    .line 104
    invoke-direct {v9, v5, v14, v15, v6}, La/a8q0;-><init>(Ljava/lang/String;JI)V

    .line 105
    .line 106
    .line 107
    cmpg-double v5, v10, v7

    .line 108
    .line 109
    if-nez v5, :cond_7

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    const/4 v4, 0x0

    .line 113
    :goto_4
    iget-object v5, v0, La/fi20;->e:La/on20;

    .line 114
    .line 115
    invoke-virtual {v5, v9, v4}, La/on20;->G0(La/a8q0;Z)V

    .line 116
    .line 117
    .line 118
    iget-object v9, v1, La/bx6;->b:La/tw6;

    .line 119
    .line 120
    const/16 v29, 0x0

    .line 121
    .line 122
    const v30, 0xff7c

    .line 123
    .line 124
    .line 125
    const-wide/16 v14, 0x0

    .line 126
    .line 127
    const-wide/16 v16, 0x0

    .line 128
    .line 129
    const-wide/16 v18, 0x0

    .line 130
    .line 131
    const/16 v20, 0x0

    .line 132
    .line 133
    const/16 v21, 0x0

    .line 134
    .line 135
    iget-boolean v0, v0, La/fi20;->f:Z

    .line 136
    .line 137
    const/16 v23, 0x0

    .line 138
    .line 139
    const/16 v24, 0x0

    .line 140
    .line 141
    const/16 v25, 0x0

    .line 142
    .line 143
    const/16 v26, 0x0

    .line 144
    .line 145
    const/16 v27, 0x0

    .line 146
    .line 147
    const/16 v28, 0x0

    .line 148
    .line 149
    move/from16 v22, v0

    .line 150
    .line 151
    invoke-static/range {v9 .. v30}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const/4 v4, 0x5

    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v6, 0x0

    .line 158
    invoke-static {v1, v5, v0, v6, v4}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    const/4 v9, 0x0

    .line 163
    const/16 v10, 0x3b

    .line 164
    .line 165
    const/4 v4, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v8, 0x0

    .line 168
    invoke-static/range {v3 .. v10}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    const/16 v18, 0x0

    .line 173
    .line 174
    const v19, 0x3ffbf

    .line 175
    .line 176
    .line 177
    const/4 v3, 0x0

    .line 178
    const/4 v6, 0x0

    .line 179
    const/4 v9, 0x0

    .line 180
    const/4 v10, 0x0

    .line 181
    const/4 v11, 0x0

    .line 182
    const/4 v12, 0x0

    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    const/16 v16, 0x0

    .line 187
    .line 188
    const/16 v17, 0x0

    .line 189
    .line 190
    invoke-static/range {v2 .. v19}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0
.end method
