.class public final synthetic La/ci20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:D

.field public final synthetic c:D

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(DDZ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/ci20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/ci20;->b:D

    iput-wide p3, p0, La/ci20;->c:D

    iput-boolean p5, p0, La/ci20;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(DZD)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/ci20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/ci20;->b:D

    iput-boolean p3, p0, La/ci20;->d:Z

    iput-wide p4, p0, La/ci20;->c:D

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ci20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    check-cast v1, La/oyg0;

    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    check-cast v3, La/a820;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v4, v3, La/a820;->e:La/pvj0;

    .line 24
    .line 25
    iget-object v1, v4, La/pvj0;->a:La/bx6;

    .line 26
    .line 27
    iget-object v5, v1, La/bx6;->b:La/tw6;

    .line 28
    .line 29
    const/16 v25, 0x0

    .line 30
    .line 31
    const v26, 0xff7c

    .line 32
    .line 33
    .line 34
    iget-wide v6, v0, La/ci20;->b:D

    .line 35
    .line 36
    iget-wide v8, v0, La/ci20;->c:D

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
    const/16 v16, 0x0

    .line 45
    .line 46
    const/16 v17, 0x0

    .line 47
    .line 48
    iget-boolean v0, v0, La/ci20;->d:Z

    .line 49
    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    const/16 v20, 0x0

    .line 53
    .line 54
    const/16 v21, 0x0

    .line 55
    .line 56
    const/16 v22, 0x0

    .line 57
    .line 58
    const/16 v23, 0x0

    .line 59
    .line 60
    const/16 v24, 0x0

    .line 61
    .line 62
    move/from16 v18, v0

    .line 63
    .line 64
    invoke-static/range {v5 .. v26}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x5

    .line 70
    invoke-static {v1, v2, v0, v5, v6}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const/4 v10, 0x0

    .line 75
    const/16 v11, 0x3e

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v9, 0x0

    .line 81
    invoke-static/range {v4 .. v11}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    const v20, 0x3ffef

    .line 88
    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v11, 0x0

    .line 94
    const/4 v12, 0x0

    .line 95
    const/4 v13, 0x0

    .line 96
    const/4 v14, 0x0

    .line 97
    const/4 v15, 0x0

    .line 98
    const/16 v16, 0x0

    .line 99
    .line 100
    const/16 v18, 0x0

    .line 101
    .line 102
    invoke-static/range {v3 .. v20}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :pswitch_0
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, La/oyg0;

    .line 110
    .line 111
    move-object/from16 v3, p2

    .line 112
    .line 113
    check-cast v3, La/b820;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v4, v3, La/b820;->d:La/rvj0;

    .line 122
    .line 123
    iget-object v1, v4, La/rvj0;->a:La/dx6;

    .line 124
    .line 125
    iget-object v5, v1, La/dx6;->b:La/vw6;

    .line 126
    .line 127
    new-instance v6, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 128
    .line 129
    iget-wide v7, v0, La/ci20;->c:D

    .line 130
    .line 131
    iget-boolean v9, v0, La/ci20;->d:Z

    .line 132
    .line 133
    invoke-direct {v6, v7, v8, v9}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 134
    .line 135
    .line 136
    const/16 v23, 0x0

    .line 137
    .line 138
    const v24, 0xfefe

    .line 139
    .line 140
    .line 141
    iget-wide v7, v0, La/ci20;->b:D

    .line 142
    .line 143
    move-object/from16 v19, v6

    .line 144
    .line 145
    move-wide v6, v7

    .line 146
    const-wide/16 v8, 0x0

    .line 147
    .line 148
    const-wide/16 v10, 0x0

    .line 149
    .line 150
    const-wide/16 v12, 0x0

    .line 151
    .line 152
    const-wide/16 v14, 0x0

    .line 153
    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    const/16 v18, 0x0

    .line 159
    .line 160
    const/16 v20, 0x0

    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const/16 v22, 0x0

    .line 165
    .line 166
    invoke-static/range {v5 .. v24}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const/4 v5, 0x1

    .line 171
    invoke-static {v1, v2, v0, v5}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    const/4 v9, 0x0

    .line 176
    const/16 v10, 0x1e

    .line 177
    .line 178
    const/4 v6, 0x0

    .line 179
    const/4 v7, 0x0

    .line 180
    const/4 v8, 0x0

    .line 181
    invoke-static/range {v4 .. v10}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    const/4 v15, 0x0

    .line 186
    const/16 v16, 0x1ff7

    .line 187
    .line 188
    const/4 v4, 0x0

    .line 189
    const/4 v5, 0x0

    .line 190
    const/4 v10, 0x0

    .line 191
    const/4 v11, 0x0

    .line 192
    const/4 v12, 0x0

    .line 193
    const/4 v13, 0x0

    .line 194
    const/4 v14, 0x0

    .line 195
    invoke-static/range {v3 .. v16}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    return-object v0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
