.class public final synthetic La/gh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:D

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(DZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/gh20;->a:B

    iput-wide p1, p0, La/gh20;->b:D

    iput-boolean p3, p0, La/gh20;->c:Z

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
    iget-byte v1, v0, La/gh20;->a:B

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
    iget-object v5, v4, La/b820;->d:La/rvj0;

    .line 25
    .line 26
    iget-object v1, v5, La/rvj0;->a:La/dx6;

    .line 27
    .line 28
    iget-object v6, v1, La/dx6;->b:La/vw6;

    .line 29
    .line 30
    const/16 v24, 0x0

    .line 31
    .line 32
    const v25, 0xff7c

    .line 33
    .line 34
    .line 35
    iget-wide v7, v0, La/gh20;->b:D

    .line 36
    .line 37
    const-wide/16 v11, 0x0

    .line 38
    .line 39
    const-wide/16 v13, 0x0

    .line 40
    .line 41
    const-wide/16 v15, 0x0

    .line 42
    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    const/16 v18, 0x0

    .line 46
    .line 47
    iget-boolean v0, v0, La/gh20;->c:Z

    .line 48
    .line 49
    const/16 v20, 0x0

    .line 50
    .line 51
    const/16 v21, 0x0

    .line 52
    .line 53
    const/16 v22, 0x0

    .line 54
    .line 55
    const/16 v23, 0x0

    .line 56
    .line 57
    move-wide v9, v7

    .line 58
    move/from16 v19, v0

    .line 59
    .line 60
    invoke-static/range {v6 .. v25}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v1, v3, v0, v2}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    const/4 v10, 0x0

    .line 69
    const/16 v11, 0x1e

    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    invoke-static/range {v5 .. v11}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/16 v17, 0x1ff7

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v11, 0x0

    .line 85
    const/4 v12, 0x0

    .line 86
    const/4 v13, 0x0

    .line 87
    const/4 v14, 0x0

    .line 88
    const/4 v15, 0x0

    .line 89
    invoke-static/range {v4 .. v17}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    return-object v0

    .line 94
    :pswitch_0
    move-object/from16 v1, p1

    .line 95
    .line 96
    check-cast v1, La/oyg0;

    .line 97
    .line 98
    move-object/from16 v4, p2

    .line 99
    .line 100
    check-cast v4, La/b820;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v5, v4, La/b820;->f:La/gx4;

    .line 109
    .line 110
    if-eqz v5, :cond_0

    .line 111
    .line 112
    iget-object v1, v5, La/gx4;->c:La/dx6;

    .line 113
    .line 114
    iget-object v6, v1, La/dx6;->b:La/vw6;

    .line 115
    .line 116
    const/16 v24, 0x0

    .line 117
    .line 118
    const v25, 0xff7c

    .line 119
    .line 120
    .line 121
    iget-wide v7, v0, La/gh20;->b:D

    .line 122
    .line 123
    const-wide/16 v11, 0x0

    .line 124
    .line 125
    const-wide/16 v13, 0x0

    .line 126
    .line 127
    const-wide/16 v15, 0x0

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    const/16 v18, 0x0

    .line 132
    .line 133
    iget-boolean v0, v0, La/gh20;->c:Z

    .line 134
    .line 135
    const/16 v20, 0x0

    .line 136
    .line 137
    const/16 v21, 0x0

    .line 138
    .line 139
    const/16 v22, 0x0

    .line 140
    .line 141
    const/16 v23, 0x0

    .line 142
    .line 143
    move-wide v9, v7

    .line 144
    move/from16 v19, v0

    .line 145
    .line 146
    invoke-static/range {v6 .. v25}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {v1, v3, v0, v2}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    const/4 v10, 0x0

    .line 155
    const/16 v11, 0x1b

    .line 156
    .line 157
    const/4 v6, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    invoke-static/range {v5 .. v11}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    const/16 v17, 0x1fdf

    .line 167
    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v8, 0x0

    .line 170
    const/4 v11, 0x0

    .line 171
    const/4 v12, 0x0

    .line 172
    const/4 v13, 0x0

    .line 173
    const/4 v14, 0x0

    .line 174
    const/4 v15, 0x0

    .line 175
    invoke-static/range {v4 .. v17}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    :cond_0
    return-object v4

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
