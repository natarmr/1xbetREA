.class public final synthetic La/qh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vw6;

.field public final synthetic c:D


# direct methods
.method public synthetic constructor <init>(La/vw6;DB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/qh20;->a:B

    iput-object p1, p0, La/qh20;->b:La/vw6;

    iput-wide p2, p0, La/qh20;->c:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qh20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/oyg0;

    .line 13
    .line 14
    move-object/from16 v4, p2

    .line 15
    .line 16
    check-cast v4, La/b820;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v5, v4, La/b820;->f:La/gx4;

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    iget-object v1, v5, La/gx4;->c:La/dx6;

    .line 29
    .line 30
    const/16 v24, 0x0

    .line 31
    .line 32
    const v25, 0xfffe

    .line 33
    .line 34
    .line 35
    iget-object v6, v0, La/qh20;->b:La/vw6;

    .line 36
    .line 37
    iget-wide v7, v0, La/qh20;->c:D

    .line 38
    .line 39
    const-wide/16 v9, 0x0

    .line 40
    .line 41
    const-wide/16 v11, 0x0

    .line 42
    .line 43
    const-wide/16 v13, 0x0

    .line 44
    .line 45
    const-wide/16 v15, 0x0

    .line 46
    .line 47
    const/16 v17, 0x0

    .line 48
    .line 49
    const/16 v18, 0x0

    .line 50
    .line 51
    const/16 v19, 0x0

    .line 52
    .line 53
    const/16 v20, 0x0

    .line 54
    .line 55
    const/16 v21, 0x0

    .line 56
    .line 57
    const/16 v22, 0x0

    .line 58
    .line 59
    const/16 v23, 0x0

    .line 60
    .line 61
    invoke-static/range {v6 .. v25}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v1, v3, v0, v2}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    const/4 v10, 0x0

    .line 70
    const/16 v11, 0x1b

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    invoke-static/range {v5 .. v11}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :cond_0
    move-object v10, v3

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    const/16 v17, 0x1fdf

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v11, 0x0

    .line 90
    const/4 v12, 0x0

    .line 91
    const/4 v13, 0x0

    .line 92
    const/4 v14, 0x0

    .line 93
    const/4 v15, 0x0

    .line 94
    invoke-static/range {v4 .. v17}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :pswitch_0
    move-object/from16 v1, p1

    .line 100
    .line 101
    check-cast v1, La/oyg0;

    .line 102
    .line 103
    move-object/from16 v4, p2

    .line 104
    .line 105
    check-cast v4, La/b820;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v5, v4, La/b820;->f:La/gx4;

    .line 114
    .line 115
    if-eqz v5, :cond_1

    .line 116
    .line 117
    iget-object v1, v5, La/gx4;->c:La/dx6;

    .line 118
    .line 119
    const/16 v24, 0x0

    .line 120
    .line 121
    const v25, 0xfffe

    .line 122
    .line 123
    .line 124
    iget-object v6, v0, La/qh20;->b:La/vw6;

    .line 125
    .line 126
    iget-wide v7, v0, La/qh20;->c:D

    .line 127
    .line 128
    const-wide/16 v9, 0x0

    .line 129
    .line 130
    const-wide/16 v11, 0x0

    .line 131
    .line 132
    const-wide/16 v13, 0x0

    .line 133
    .line 134
    const-wide/16 v15, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const/16 v23, 0x0

    .line 149
    .line 150
    invoke-static/range {v6 .. v25}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v1, v3, v0, v2}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    const/4 v10, 0x0

    .line 159
    const/16 v11, 0x1b

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v9, 0x0

    .line 164
    invoke-static/range {v5 .. v11}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    :cond_1
    move-object v10, v3

    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    const/16 v17, 0x1fdf

    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    const/4 v6, 0x0

    .line 175
    const/4 v7, 0x0

    .line 176
    const/4 v8, 0x0

    .line 177
    const/4 v9, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    const/4 v12, 0x0

    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    invoke-static/range {v4 .. v17}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
