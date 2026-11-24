.class public final synthetic La/vh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tw6;

.field public final synthetic c:D


# direct methods
.method public synthetic constructor <init>(La/tw6;DB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/vh20;->a:B

    iput-object p1, p0, La/vh20;->b:La/tw6;

    iput-wide p2, p0, La/vh20;->c:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vh20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/oyg0;

    .line 14
    .line 15
    move-object/from16 v5, p2

    .line 16
    .line 17
    check-cast v5, La/a820;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v6, v5, La/a820;->g:La/hx4;

    .line 26
    .line 27
    iget-object v1, v6, La/hx4;->c:La/bx6;

    .line 28
    .line 29
    const/16 v27, 0x0

    .line 30
    .line 31
    const v28, 0xfffe

    .line 32
    .line 33
    .line 34
    iget-object v7, v0, La/vh20;->b:La/tw6;

    .line 35
    .line 36
    iget-wide v8, v0, La/vh20;->c:D

    .line 37
    .line 38
    const-wide/16 v10, 0x0

    .line 39
    .line 40
    const-wide/16 v12, 0x0

    .line 41
    .line 42
    const-wide/16 v14, 0x0

    .line 43
    .line 44
    const-wide/16 v16, 0x0

    .line 45
    .line 46
    const/16 v18, 0x0

    .line 47
    .line 48
    const/16 v19, 0x0

    .line 49
    .line 50
    const/16 v20, 0x0

    .line 51
    .line 52
    const/16 v21, 0x0

    .line 53
    .line 54
    const/16 v22, 0x0

    .line 55
    .line 56
    const/16 v23, 0x0

    .line 57
    .line 58
    const/16 v24, 0x0

    .line 59
    .line 60
    const/16 v25, 0x0

    .line 61
    .line 62
    const/16 v26, 0x0

    .line 63
    .line 64
    invoke-static/range {v7 .. v28}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v1, v4, v0, v3, v2}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    const/4 v12, 0x0

    .line 73
    const/16 v13, 0x3b

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    invoke-static/range {v6 .. v13}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    const/16 v21, 0x0

    .line 84
    .line 85
    const v22, 0x3ffbf

    .line 86
    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v12, 0x0

    .line 91
    const/4 v13, 0x0

    .line 92
    const/4 v14, 0x0

    .line 93
    const/4 v15, 0x0

    .line 94
    const/16 v16, 0x0

    .line 95
    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    const/16 v18, 0x0

    .line 99
    .line 100
    invoke-static/range {v5 .. v22}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0

    .line 105
    :pswitch_0
    move-object/from16 v1, p1

    .line 106
    .line 107
    check-cast v1, La/oyg0;

    .line 108
    .line 109
    move-object/from16 v5, p2

    .line 110
    .line 111
    check-cast v5, La/a820;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v6, v5, La/a820;->g:La/hx4;

    .line 120
    .line 121
    iget-object v1, v6, La/hx4;->c:La/bx6;

    .line 122
    .line 123
    const/16 v27, 0x0

    .line 124
    .line 125
    const v28, 0xfffe

    .line 126
    .line 127
    .line 128
    iget-object v7, v0, La/vh20;->b:La/tw6;

    .line 129
    .line 130
    iget-wide v8, v0, La/vh20;->c:D

    .line 131
    .line 132
    const-wide/16 v10, 0x0

    .line 133
    .line 134
    const-wide/16 v12, 0x0

    .line 135
    .line 136
    const-wide/16 v14, 0x0

    .line 137
    .line 138
    const-wide/16 v16, 0x0

    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const/16 v19, 0x0

    .line 143
    .line 144
    const/16 v20, 0x0

    .line 145
    .line 146
    const/16 v21, 0x0

    .line 147
    .line 148
    const/16 v22, 0x0

    .line 149
    .line 150
    const/16 v23, 0x0

    .line 151
    .line 152
    const/16 v24, 0x0

    .line 153
    .line 154
    const/16 v25, 0x0

    .line 155
    .line 156
    const/16 v26, 0x0

    .line 157
    .line 158
    invoke-static/range {v7 .. v28}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v1, v4, v0, v3, v2}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    const/4 v12, 0x0

    .line 167
    const/16 v13, 0x3b

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    const/4 v8, 0x0

    .line 171
    const/4 v10, 0x0

    .line 172
    const/4 v11, 0x0

    .line 173
    invoke-static/range {v6 .. v13}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    const v22, 0x3ffbf

    .line 180
    .line 181
    .line 182
    const/4 v6, 0x0

    .line 183
    const/4 v9, 0x0

    .line 184
    const/4 v12, 0x0

    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    invoke-static/range {v5 .. v22}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    return-object v0

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
