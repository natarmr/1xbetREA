.class public final synthetic La/so10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(FFB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/so10;->a:B

    iput p1, p0, La/so10;->b:F

    iput p2, p0, La/so10;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(FFIB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/so10;->a:B

    iput p1, p0, La/so10;->b:F

    iput p2, p0, La/so10;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/so10;->a:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    iget v3, v0, La/so10;->c:F

    .line 7
    .line 8
    iget v4, v0, La/so10;->b:F

    .line 9
    .line 10
    const-string v5, "KEY_PAYMENT_PROGRESS"

    .line 11
    .line 12
    const-string v6, "KEY_NEW_STAKE_PROGRESS"

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/oyg0;

    .line 20
    .line 21
    move-object/from16 v7, p2

    .line 22
    .line 23
    check-cast v7, La/svg0;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget v8, v0, La/so10;->b:F

    .line 32
    .line 33
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v1, v2, v6}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget v9, v0, La/so10;->c:F

    .line 41
    .line 42
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v1, v0, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/16 v32, 0x0

    .line 50
    .line 51
    const v33, 0x7ffffc

    .line 52
    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    const-wide/16 v11, 0x0

    .line 56
    .line 57
    const-wide/16 v13, 0x0

    .line 58
    .line 59
    const-wide/16 v15, 0x0

    .line 60
    .line 61
    const-wide/16 v17, 0x0

    .line 62
    .line 63
    const-wide/16 v19, 0x0

    .line 64
    .line 65
    const-wide/16 v21, 0x0

    .line 66
    .line 67
    const-wide/16 v23, 0x0

    .line 68
    .line 69
    const/16 v25, 0x0

    .line 70
    .line 71
    const/16 v26, 0x0

    .line 72
    .line 73
    const/16 v27, 0x0

    .line 74
    .line 75
    const/16 v28, 0x0

    .line 76
    .line 77
    const/16 v29, 0x0

    .line 78
    .line 79
    const/16 v30, 0x0

    .line 80
    .line 81
    const/16 v31, 0x0

    .line 82
    .line 83
    invoke-static/range {v7 .. v33}, La/svg0;->a(La/svg0;FFFDDDDDDDZZLa/xtg0;La/wvg0;La/ytg0;La/ql5;Ljava/util/List;Ljava/util/List;I)La/svg0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0

    .line 88
    :pswitch_0
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, La/oyg0;

    .line 91
    .line 92
    move-object/from16 v7, p2

    .line 93
    .line 94
    check-cast v7, La/svg0;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget v8, v0, La/so10;->b:F

    .line 103
    .line 104
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v1, v2, v6}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget v9, v0, La/so10;->c:F

    .line 112
    .line 113
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/16 v32, 0x0

    .line 121
    .line 122
    const v33, 0x7ffffc

    .line 123
    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    const-wide/16 v11, 0x0

    .line 127
    .line 128
    const-wide/16 v13, 0x0

    .line 129
    .line 130
    const-wide/16 v15, 0x0

    .line 131
    .line 132
    const-wide/16 v17, 0x0

    .line 133
    .line 134
    const-wide/16 v19, 0x0

    .line 135
    .line 136
    const-wide/16 v21, 0x0

    .line 137
    .line 138
    const-wide/16 v23, 0x0

    .line 139
    .line 140
    const/16 v25, 0x0

    .line 141
    .line 142
    const/16 v26, 0x0

    .line 143
    .line 144
    const/16 v27, 0x0

    .line 145
    .line 146
    const/16 v28, 0x0

    .line 147
    .line 148
    const/16 v29, 0x0

    .line 149
    .line 150
    const/16 v30, 0x0

    .line 151
    .line 152
    const/16 v31, 0x0

    .line 153
    .line 154
    invoke-static/range {v7 .. v33}, La/svg0;->a(La/svg0;FFFDDDDDDDZZLa/xtg0;La/wvg0;La/ytg0;La/ql5;Ljava/util/List;Ljava/util/List;I)La/svg0;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    return-object v0

    .line 159
    :pswitch_1
    move-object/from16 v0, p1

    .line 160
    .line 161
    check-cast v0, La/fet;

    .line 162
    .line 163
    move-object/from16 v1, p2

    .line 164
    .line 165
    check-cast v1, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {v2}, La/x8x;->L(I)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-static {v4, v3, v0, v1}, La/y0x0;->y(FFLa/fet;I)V

    .line 175
    .line 176
    .line 177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_2
    move-object/from16 v0, p1

    .line 181
    .line 182
    check-cast v0, La/fet;

    .line 183
    .line 184
    move-object/from16 v1, p2

    .line 185
    .line 186
    check-cast v1, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v2}, La/x8x;->L(I)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-static {v4, v3, v0, v1}, La/y0x0;->y(FFLa/fet;I)V

    .line 196
    .line 197
    .line 198
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
