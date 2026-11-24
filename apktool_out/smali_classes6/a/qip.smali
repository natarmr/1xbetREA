.class public final synthetic La/qip;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(JZJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/qip;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/qip;->c:J

    iput-boolean p3, p0, La/qip;->b:Z

    iput-wide p4, p0, La/qip;->d:J

    return-void
.end method

.method public synthetic constructor <init>(ZJJ)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/qip;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/qip;->b:Z

    iput-wide p2, p0, La/qip;->c:J

    iput-wide p4, p0, La/qip;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qip;->a:B

    .line 4
    .line 5
    iget-boolean v2, v0, La/qip;->b:Z

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/abi0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-wide v3, v0, La/qip;->c:J

    .line 18
    .line 19
    iget-wide v5, v0, La/qip;->d:J

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    new-instance v0, La/y3d;

    .line 24
    .line 25
    invoke-direct {v0, v3, v4}, La/y3d;-><init>(J)V

    .line 26
    .line 27
    .line 28
    new-instance v2, La/y3d;

    .line 29
    .line 30
    invoke-direct {v2, v5, v6}, La/y3d;-><init>(J)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v2}, [La/y3d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v0, La/y3d;

    .line 43
    .line 44
    invoke-direct {v0, v5, v6}, La/y3d;-><init>(J)V

    .line 45
    .line 46
    .line 47
    new-instance v2, La/y3d;

    .line 48
    .line 49
    invoke-direct {v2, v3, v4}, La/y3d;-><init>(J)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v0, v2}, [La/y3d;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_0
    sget-object v2, La/cbi0;->a:[La/iiy;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget-object v2, La/cbi0;->e:La/zai0;

    .line 66
    .line 67
    sget-object v3, La/cbi0;->a:[La/iiy;

    .line 68
    .line 69
    const/4 v4, 0x3

    .line 70
    aget-object v3, v3, v4

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_0
    move-object/from16 v1, p1

    .line 82
    .line 83
    check-cast v1, La/fhl;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const/16 v14, 0x7e

    .line 90
    .line 91
    iget-wide v4, v0, La/qip;->c:J

    .line 92
    .line 93
    const-wide/16 v6, 0x0

    .line 94
    .line 95
    const-wide/16 v8, 0x0

    .line 96
    .line 97
    const/4 v10, 0x0

    .line 98
    const/4 v11, 0x0

    .line 99
    const/4 v12, 0x0

    .line 100
    move-object v3, v1

    .line 101
    invoke-static/range {v3 .. v14}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 102
    .line 103
    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    invoke-interface {v1}, La/fhl;->d()J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    const-wide v4, 0xffffffffL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    and-long/2addr v2, v4

    .line 116
    long-to-int v2, v2

    .line 117
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    const/high16 v3, 0x3f800000    # 1.0f

    .line 122
    .line 123
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    const/high16 v7, 0x40000000    # 2.0f

    .line 128
    .line 129
    div-float/2addr v6, v7

    .line 130
    sub-float/2addr v2, v6

    .line 131
    const/4 v6, 0x0

    .line 132
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    int-to-long v6, v6

    .line 137
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    int-to-long v8, v8

    .line 142
    const/16 v10, 0x20

    .line 143
    .line 144
    shl-long/2addr v6, v10

    .line 145
    and-long/2addr v8, v4

    .line 146
    or-long/2addr v6, v8

    .line 147
    invoke-interface {v1}, La/fhl;->d()J

    .line 148
    .line 149
    .line 150
    move-result-wide v8

    .line 151
    shr-long/2addr v8, v10

    .line 152
    long-to-int v8, v8

    .line 153
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    int-to-long v8, v8

    .line 162
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    int-to-long v11, v2

    .line 167
    shl-long/2addr v8, v10

    .line 168
    and-long/2addr v4, v11

    .line 169
    or-long/2addr v4, v8

    .line 170
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    const/4 v10, 0x0

    .line 175
    const/16 v11, 0x1f0

    .line 176
    .line 177
    iget-wide v2, v0, La/qip;->d:J

    .line 178
    .line 179
    const/4 v9, 0x0

    .line 180
    move-wide v15, v6

    .line 181
    move-wide v6, v4

    .line 182
    move-wide v4, v15

    .line 183
    invoke-static/range {v1 .. v11}, La/fhl;->Q(La/fhl;JJJFILa/x03;I)V

    .line 184
    .line 185
    .line 186
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
