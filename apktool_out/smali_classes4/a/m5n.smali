.class public final synthetic La/m5n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(JLa/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/m5n;->a:B

    iput-wide p1, p0, La/m5n;->b:J

    iput-object p3, p0, La/m5n;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m5n;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/m5n;->c:La/l7m0;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v5, p1

    .line 14
    .line 15
    check-cast v5, La/fhl;

    .line 16
    .line 17
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v1, v3, v2}, La/l1e0;->c(FFF)F

    .line 28
    .line 29
    .line 30
    move-result v12

    .line 31
    const/4 v15, 0x0

    .line 32
    const/16 v16, 0x76

    .line 33
    .line 34
    iget-wide v6, v0, La/m5n;->b:J

    .line 35
    .line 36
    const-wide/16 v8, 0x0

    .line 37
    .line 38
    const-wide/16 v10, 0x0

    .line 39
    .line 40
    const/4 v13, 0x0

    .line 41
    const/4 v14, 0x0

    .line 42
    invoke-static/range {v5 .. v16}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    move-object/from16 v1, p1

    .line 49
    .line 50
    check-cast v1, La/fhl;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, La/ycl;

    .line 60
    .line 61
    iget v5, v5, La/ycl;->a:F

    .line 62
    .line 63
    invoke-interface {v1, v5}, La/w6k;->w0(F)F

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    int-to-long v6, v6

    .line 72
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    int-to-long v8, v5

    .line 77
    const/16 v5, 0x20

    .line 78
    .line 79
    shl-long/2addr v6, v5

    .line 80
    const-wide v10, 0xffffffffL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    and-long/2addr v8, v10

    .line 86
    or-long/2addr v8, v6

    .line 87
    invoke-interface {v1}, La/fhl;->d()J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    and-long/2addr v6, v10

    .line 92
    long-to-int v6, v6

    .line 93
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, La/ycl;

    .line 102
    .line 103
    iget v7, v7, La/ycl;->a:F

    .line 104
    .line 105
    invoke-interface {v1, v7}, La/w6k;->w0(F)F

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    const/high16 v12, 0x40000000    # 2.0f

    .line 110
    .line 111
    mul-float/2addr v7, v12

    .line 112
    sub-float/2addr v6, v7

    .line 113
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    int-to-long v13, v7

    .line 118
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    int-to-long v6, v6

    .line 123
    shl-long/2addr v13, v5

    .line 124
    and-long v5, v6, v10

    .line 125
    .line 126
    or-long/2addr v5, v13

    .line 127
    invoke-interface {v1}, La/fhl;->d()J

    .line 128
    .line 129
    .line 130
    move-result-wide v10

    .line 131
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    check-cast v4, La/ycl;

    .line 136
    .line 137
    iget v4, v4, La/ycl;->a:F

    .line 138
    .line 139
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    mul-float/2addr v4, v12

    .line 144
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    add-float/2addr v2, v4

    .line 149
    const/4 v4, 0x1

    .line 150
    invoke-static {v10, v11, v3, v2, v4}, La/h7k0;->a(JFFI)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    const/4 v10, 0x0

    .line 155
    const/16 v11, 0xf0

    .line 156
    .line 157
    move-wide v4, v5

    .line 158
    move-wide v6, v2

    .line 159
    iget-wide v2, v0, La/m5n;->b:J

    .line 160
    .line 161
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 162
    .line 163
    .line 164
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_1
    move-object/from16 v1, p1

    .line 168
    .line 169
    check-cast v1, La/fhl;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, La/y3d;

    .line 179
    .line 180
    iget-wide v2, v2, La/y3d;->a:J

    .line 181
    .line 182
    const/4 v10, 0x0

    .line 183
    const/16 v11, 0xf6

    .line 184
    .line 185
    const-wide/16 v4, 0x0

    .line 186
    .line 187
    const-wide/16 v6, 0x0

    .line 188
    .line 189
    iget-wide v8, v0, La/m5n;->b:J

    .line 190
    .line 191
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 192
    .line 193
    .line 194
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object v0

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
