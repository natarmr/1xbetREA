.class public final synthetic La/icd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/icd;->a:B

    iput-wide p1, p0, La/icd;->b:J

    iput-object p3, p0, La/icd;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/icd;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41800000    # 16.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/high16 v4, 0x41000000    # 8.0f

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/16 v6, 0x20

    .line 12
    .line 13
    const-wide v7, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iget-object v9, v0, La/icd;->c:Lkotlin/jvm/functions/Function2;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v10, p1

    .line 24
    .line 25
    check-cast v10, La/fhl;

    .line 26
    .line 27
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v1, La/qmk;->a:La/zcl;

    .line 31
    .line 32
    invoke-interface {v10, v4}, La/w6k;->w0(F)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v9, :cond_0

    .line 41
    .line 42
    move-object v3, v1

    .line 43
    :cond_0
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v1, v5

    .line 51
    :goto_0
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    int-to-long v3, v3

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    int-to-long v11, v1

    .line 61
    shl-long/2addr v3, v6

    .line 62
    and-long/2addr v11, v7

    .line 63
    or-long v13, v3, v11

    .line 64
    .line 65
    invoke-interface {v10, v2}, La/w6k;->w0(F)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    int-to-long v2, v2

    .line 74
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    int-to-long v4, v1

    .line 79
    shl-long v1, v2, v6

    .line 80
    .line 81
    and-long v3, v4, v7

    .line 82
    .line 83
    or-long v17, v1, v3

    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    const/16 v20, 0xf4

    .line 88
    .line 89
    iget-wide v11, v0, La/icd;->b:J

    .line 90
    .line 91
    const-wide/16 v15, 0x0

    .line 92
    .line 93
    invoke-static/range {v10 .. v20}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_0
    move-object/from16 v1, p1

    .line 100
    .line 101
    check-cast v1, La/fhl;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    sget-object v10, La/qmk;->a:La/zcl;

    .line 107
    .line 108
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    if-eqz v9, :cond_2

    .line 117
    .line 118
    move-object v3, v4

    .line 119
    :cond_2
    if-eqz v3, :cond_3

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    goto :goto_1

    .line 126
    :cond_3
    move v3, v5

    .line 127
    :goto_1
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    int-to-long v4, v4

    .line 132
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    int-to-long v9, v3

    .line 137
    shl-long v3, v4, v6

    .line 138
    .line 139
    and-long/2addr v9, v7

    .line 140
    or-long v4, v3, v9

    .line 141
    .line 142
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    int-to-long v9, v3

    .line 151
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    int-to-long v2, v2

    .line 156
    shl-long/2addr v9, v6

    .line 157
    and-long/2addr v2, v7

    .line 158
    or-long v8, v9, v2

    .line 159
    .line 160
    const/4 v10, 0x0

    .line 161
    const/16 v11, 0xf4

    .line 162
    .line 163
    iget-wide v2, v0, La/icd;->b:J

    .line 164
    .line 165
    const-wide/16 v6, 0x0

    .line 166
    .line 167
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 168
    .line 169
    .line 170
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
