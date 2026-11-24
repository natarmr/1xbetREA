.class public final La/z480;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public constructor <init>(La/pz40;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z480;->a:La/pz40;

    .line 5
    .line 6
    iput-wide p2, p0, La/z480;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, La/z480;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/pi9;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/z480;->a:La/pz40;

    .line 11
    .line 12
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, La/q380;

    .line 17
    .line 18
    iget-object v7, v2, La/q380;->f:La/v12;

    .line 19
    .line 20
    sget-object v2, La/qmk;->a:La/zcl;

    .line 21
    .line 22
    const/high16 v2, 0x41800000    # 16.0f

    .line 23
    .line 24
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    mul-float/2addr v3, v2

    .line 29
    const/high16 v2, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    mul-float v11, v4, v2

    .line 36
    .line 37
    const/high16 v2, 0x42600000    # 56.0f

    .line 38
    .line 39
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    mul-float v10, v4, v2

    .line 44
    .line 45
    invoke-static {}, La/z03;->a()La/w03;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sget-object v2, La/v12;->a:La/v12;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    if-eq v7, v2, :cond_1

    .line 53
    .line 54
    sget-object v2, La/v12;->d:La/v12;

    .line 55
    .line 56
    if-ne v7, v2, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v2, v5

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    :goto_0
    move v2, v3

    .line 62
    :goto_1
    sget-object v6, La/v12;->c:La/v12;

    .line 63
    .line 64
    if-eq v7, v6, :cond_3

    .line 65
    .line 66
    sget-object v6, La/v12;->d:La/v12;

    .line 67
    .line 68
    if-ne v7, v6, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v3, v5

    .line 72
    :cond_3
    :goto_2
    iget-object v5, v1, La/pi9;->a:La/y99;

    .line 73
    .line 74
    invoke-interface {v5}, La/y99;->d()J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    const-wide/16 v8, 0x0

    .line 79
    .line 80
    invoke-static {v8, v9, v5, v6}, La/k9x;->r(JJ)La/jge0;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    int-to-long v5, v5

    .line 89
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    int-to-long v8, v8

    .line 94
    const/16 v13, 0x20

    .line 95
    .line 96
    shl-long/2addr v5, v13

    .line 97
    const-wide v14, 0xffffffffL

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    and-long/2addr v8, v14

    .line 103
    or-long/2addr v5, v8

    .line 104
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    int-to-long v8, v8

    .line 109
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    move/from16 p1, v13

    .line 114
    .line 115
    move-wide/from16 v16, v14

    .line 116
    .line 117
    int-to-long v13, v2

    .line 118
    shl-long v8, v8, p1

    .line 119
    .line 120
    and-long v13, v13, v16

    .line 121
    .line 122
    or-long/2addr v8, v13

    .line 123
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    int-to-long v13, v2

    .line 128
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    move v15, v3

    .line 133
    int-to-long v2, v2

    .line 134
    shl-long v13, v13, p1

    .line 135
    .line 136
    and-long v2, v2, v16

    .line 137
    .line 138
    or-long v19, v13, v2

    .line 139
    .line 140
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    int-to-long v2, v2

    .line 145
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    int-to-long v13, v13

    .line 150
    shl-long v2, v2, p1

    .line 151
    .line 152
    and-long v13, v13, v16

    .line 153
    .line 154
    or-long v17, v2, v13

    .line 155
    .line 156
    move-wide v13, v5

    .line 157
    move-wide v15, v8

    .line 158
    invoke-static/range {v12 .. v20}, La/r8x;->u(La/jge0;JJJJ)La/wfg0;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-static {v4, v2}, La/w03;->b(La/w03;La/wfg0;)V

    .line 163
    .line 164
    .line 165
    new-instance v3, La/y480;

    .line 166
    .line 167
    iget-wide v5, v0, La/z480;->b:J

    .line 168
    .line 169
    iget-wide v8, v0, La/z480;->c:J

    .line 170
    .line 171
    invoke-direct/range {v3 .. v11}, La/y480;-><init>(La/w03;JLa/v12;JFF)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v3}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    return-object v0
.end method
