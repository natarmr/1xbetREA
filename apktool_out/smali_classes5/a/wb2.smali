.class public final synthetic La/wb2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:La/vzg0;

.field public final synthetic d:La/g2v;


# direct methods
.method public synthetic constructor <init>(La/pru;La/vzg0;La/g2v;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/wb2;->a:B

    iput-object p1, p0, La/wb2;->b:La/pru;

    iput-object p2, p0, La/wb2;->c:La/vzg0;

    iput-object p3, p0, La/wb2;->d:La/g2v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wb2;->a:B

    .line 4
    .line 5
    const-string v2, "SAVED_SELECTED_SPORTS_IDS_KEY"

    .line 6
    .line 7
    iget-object v3, v0, La/wb2;->c:La/vzg0;

    .line 8
    .line 9
    iget-object v4, v0, La/wb2;->b:La/pru;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v4}, La/pru;->a()La/sff0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v5, La/iun;->a:La/iun;

    .line 19
    .line 20
    invoke-virtual {v3, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/Set;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    sget-object v2, La/xun;->a:La/xun;

    .line 29
    .line 30
    :cond_0
    move-object v6, v2

    .line 31
    sget-object v8, La/pb10;->g:La/pb10;

    .line 32
    .line 33
    const-wide/16 v18, 0x0

    .line 34
    .line 35
    const/16 v20, 0x25e

    .line 36
    .line 37
    iget-object v7, v0, La/wb2;->d:La/g2v;

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v12, 0x0

    .line 43
    const v13, 0x7f130677

    .line 44
    .line 45
    .line 46
    const/4 v14, 0x0

    .line 47
    const v15, 0x7f131690

    .line 48
    .line 49
    .line 50
    const-wide/16 v16, 0x2710

    .line 51
    .line 52
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    move-object/from16 v21, v7

    .line 57
    .line 58
    sget-object v22, La/pb10;->e:La/pb10;

    .line 59
    .line 60
    const-wide/16 v32, 0x0

    .line 61
    .line 62
    const/16 v34, 0x3de

    .line 63
    .line 64
    const/16 v23, 0x0

    .line 65
    .line 66
    const/16 v24, 0x0

    .line 67
    .line 68
    const/16 v25, 0x0

    .line 69
    .line 70
    const/16 v26, 0x0

    .line 71
    .line 72
    const v27, 0x7f130e37

    .line 73
    .line 74
    .line 75
    const/16 v28, 0x0

    .line 76
    .line 77
    const/16 v29, 0x0

    .line 78
    .line 79
    const-wide/16 v30, 0x0

    .line 80
    .line 81
    invoke-static/range {v21 .. v34}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    iget-object v0, v1, La/sff0;->g:La/mum0;

    .line 86
    .line 87
    iget-object v15, v0, La/mum0;->o:La/j8l0;

    .line 88
    .line 89
    iget-object v0, v0, La/mum0;->p:La/i8l0;

    .line 90
    .line 91
    new-instance v4, La/ad2;

    .line 92
    .line 93
    const/4 v13, 0x0

    .line 94
    const-string v14, ""

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x1

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v10, 0x0

    .line 100
    move-object/from16 v16, v0

    .line 101
    .line 102
    invoke-direct/range {v4 .. v16}, La/ad2;-><init>(Ljava/util/List;Ljava/util/Set;ZZZZLa/mdm;La/mdm;ZLjava/lang/String;La/j8l0;La/i8l0;)V

    .line 103
    .line 104
    .line 105
    return-object v4

    .line 106
    :pswitch_0
    invoke-virtual {v4}, La/pru;->a()La/sff0;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sget-object v5, La/iun;->a:La/iun;

    .line 111
    .line 112
    invoke-virtual {v3, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/util/Set;

    .line 117
    .line 118
    if-nez v2, :cond_1

    .line 119
    .line 120
    sget-object v2, La/xun;->a:La/xun;

    .line 121
    .line 122
    :cond_1
    move-object v6, v2

    .line 123
    sget-object v8, La/pb10;->g:La/pb10;

    .line 124
    .line 125
    const-wide/16 v18, 0x0

    .line 126
    .line 127
    const/16 v20, 0x25e

    .line 128
    .line 129
    iget-object v7, v0, La/wb2;->d:La/g2v;

    .line 130
    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v10, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v12, 0x0

    .line 135
    const v13, 0x7f130677

    .line 136
    .line 137
    .line 138
    const/4 v14, 0x0

    .line 139
    const v15, 0x7f131690

    .line 140
    .line 141
    .line 142
    const-wide/16 v16, 0x2710

    .line 143
    .line 144
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    move-object/from16 v21, v7

    .line 149
    .line 150
    sget-object v22, La/pb10;->e:La/pb10;

    .line 151
    .line 152
    const-wide/16 v32, 0x0

    .line 153
    .line 154
    const/16 v34, 0x3de

    .line 155
    .line 156
    const/16 v23, 0x0

    .line 157
    .line 158
    const/16 v24, 0x0

    .line 159
    .line 160
    const/16 v25, 0x0

    .line 161
    .line 162
    const/16 v26, 0x0

    .line 163
    .line 164
    const v27, 0x7f130e37

    .line 165
    .line 166
    .line 167
    const/16 v28, 0x0

    .line 168
    .line 169
    const/16 v29, 0x0

    .line 170
    .line 171
    const-wide/16 v30, 0x0

    .line 172
    .line 173
    invoke-static/range {v21 .. v34}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    iget-object v0, v1, La/sff0;->g:La/mum0;

    .line 178
    .line 179
    iget-object v1, v0, La/mum0;->o:La/j8l0;

    .line 180
    .line 181
    iget-object v0, v0, La/mum0;->p:La/i8l0;

    .line 182
    .line 183
    new-instance v4, La/dc2;

    .line 184
    .line 185
    const-string v14, ""

    .line 186
    .line 187
    const/4 v15, 0x0

    .line 188
    const/4 v7, 0x0

    .line 189
    const/4 v8, 0x0

    .line 190
    const/4 v9, 0x1

    .line 191
    const/4 v10, 0x0

    .line 192
    const/4 v13, 0x0

    .line 193
    move-object/from16 v17, v0

    .line 194
    .line 195
    move-object/from16 v16, v1

    .line 196
    .line 197
    invoke-direct/range {v4 .. v17}, La/dc2;-><init>(Ljava/util/List;Ljava/util/Set;ZZZZLa/mdm;La/mdm;ZLjava/lang/String;Ljava/util/Date;La/j8l0;La/i8l0;)V

    .line 198
    .line 199
    .line 200
    return-object v4

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
