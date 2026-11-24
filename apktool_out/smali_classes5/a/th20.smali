.class public final synthetic La/th20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:D

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;DB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/th20;->a:B

    iput-object p1, p0, La/th20;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/th20;->b:D

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
    iget-byte v1, v0, La/th20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/th20;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v4, v3

    .line 12
    check-cast v4, La/hx4;

    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/oyg0;

    .line 17
    .line 18
    move-object/from16 v3, p2

    .line 19
    .line 20
    check-cast v3, La/a820;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v1, v4, La/hx4;->c:La/bx6;

    .line 29
    .line 30
    iget-object v5, v1, La/bx6;->b:La/tw6;

    .line 31
    .line 32
    const/16 v25, 0x0

    .line 33
    .line 34
    const v26, 0xfffe

    .line 35
    .line 36
    .line 37
    iget-wide v6, v0, La/th20;->b:D

    .line 38
    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    const-wide/16 v10, 0x0

    .line 42
    .line 43
    const-wide/16 v12, 0x0

    .line 44
    .line 45
    const-wide/16 v14, 0x0

    .line 46
    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/16 v17, 0x0

    .line 50
    .line 51
    const/16 v18, 0x0

    .line 52
    .line 53
    const/16 v19, 0x0

    .line 54
    .line 55
    const/16 v20, 0x0

    .line 56
    .line 57
    const/16 v21, 0x0

    .line 58
    .line 59
    const/16 v22, 0x0

    .line 60
    .line 61
    const/16 v23, 0x0

    .line 62
    .line 63
    const/16 v24, 0x0

    .line 64
    .line 65
    invoke-static/range {v5 .. v26}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x5

    .line 71
    invoke-static {v1, v2, v0, v5, v6}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    const/4 v10, 0x0

    .line 76
    const/16 v11, 0x3b

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    invoke-static/range {v4 .. v11}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    const v22, 0x3ffbf

    .line 87
    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v12, 0x0

    .line 92
    const/4 v13, 0x0

    .line 93
    const/4 v14, 0x0

    .line 94
    const/4 v15, 0x0

    .line 95
    const/16 v16, 0x0

    .line 96
    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    move-object v5, v3

    .line 102
    invoke-static/range {v5 .. v22}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :pswitch_0
    move-object v1, v3

    .line 108
    check-cast v1, La/gx4;

    .line 109
    .line 110
    move-object/from16 v3, p1

    .line 111
    .line 112
    check-cast v3, La/oyg0;

    .line 113
    .line 114
    move-object/from16 v8, p2

    .line 115
    .line 116
    check-cast v8, La/b820;

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v3, v1, La/gx4;->c:La/dx6;

    .line 125
    .line 126
    iget-object v9, v3, La/dx6;->b:La/vw6;

    .line 127
    .line 128
    const/16 v27, 0x0

    .line 129
    .line 130
    const v28, 0xfffe

    .line 131
    .line 132
    .line 133
    iget-wide v10, v0, La/th20;->b:D

    .line 134
    .line 135
    const-wide/16 v12, 0x0

    .line 136
    .line 137
    const-wide/16 v14, 0x0

    .line 138
    .line 139
    const-wide/16 v16, 0x0

    .line 140
    .line 141
    const-wide/16 v18, 0x0

    .line 142
    .line 143
    const/16 v20, 0x0

    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const/16 v22, 0x0

    .line 148
    .line 149
    const/16 v23, 0x0

    .line 150
    .line 151
    const/16 v24, 0x0

    .line 152
    .line 153
    const/16 v25, 0x0

    .line 154
    .line 155
    const/16 v26, 0x0

    .line 156
    .line 157
    invoke-static/range {v9 .. v28}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const/4 v4, 0x1

    .line 162
    invoke-static {v3, v2, v0, v4}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    const/4 v6, 0x0

    .line 167
    const/16 v7, 0x1b

    .line 168
    .line 169
    const/4 v2, 0x0

    .line 170
    const/4 v3, 0x0

    .line 171
    const/4 v5, 0x0

    .line 172
    invoke-static/range {v1 .. v7}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    const/16 v16, 0x0

    .line 177
    .line 178
    const/16 v17, 0x1fdf

    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    move-object v4, v8

    .line 182
    const/4 v8, 0x0

    .line 183
    const/4 v9, 0x0

    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v12, 0x0

    .line 186
    const/4 v13, 0x0

    .line 187
    const/4 v14, 0x0

    .line 188
    const/4 v15, 0x0

    .line 189
    invoke-static/range {v4 .. v17}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    return-object v0

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
