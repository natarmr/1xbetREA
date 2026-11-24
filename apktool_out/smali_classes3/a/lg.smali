.class public final synthetic La/lg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/sd;ZLa/ym10;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/lg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lg;->g:Ljava/lang/Object;

    iput-boolean p2, p0, La/lg;->b:Z

    iput-object p3, p0, La/lg;->h:Ljava/lang/Object;

    iput-boolean p4, p0, La/lg;->c:Z

    iput-boolean p5, p0, La/lg;->d:Z

    iput-object p6, p0, La/lg;->e:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/lg;->f:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/functions/Function1;La/mm40;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 0

    .line 2
    const/4 p8, 0x0

    iput-byte p8, p0, La/lg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/lg;->b:Z

    iput-boolean p2, p0, La/lg;->c:Z

    iput-object p3, p0, La/lg;->e:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/lg;->g:Ljava/lang/Object;

    iput-object p5, p0, La/lg;->f:Ljava/lang/String;

    iput-object p6, p0, La/lg;->h:Ljava/lang/Object;

    iput-boolean p7, p0, La/lg;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lg;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/lg;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, v0, La/lg;->g:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v5, v4

    .line 14
    check-cast v5, La/sd;

    .line 15
    .line 16
    check-cast v3, La/ym10;

    .line 17
    .line 18
    move-object/from16 v13, p1

    .line 19
    .line 20
    check-cast v13, La/fet;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    and-int/lit8 v4, v1, 0x3

    .line 31
    .line 32
    const/4 v6, 0x2

    .line 33
    const/4 v15, 0x0

    .line 34
    if-eq v4, v6, :cond_0

    .line 35
    .line 36
    move v4, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v4, v15

    .line 39
    :goto_0
    and-int/2addr v1, v2

    .line 40
    invoke-virtual {v13, v1, v4}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_8

    .line 45
    .line 46
    instance-of v1, v3, La/um10;

    .line 47
    .line 48
    xor-int/lit8 v7, v1, 0x1

    .line 49
    .line 50
    iget-object v1, v0, La/lg;->e:Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    sget-object v4, La/ukd;->a:La/cl5;

    .line 61
    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    if-ne v3, v4, :cond_2

    .line 65
    .line 66
    :cond_1
    new-instance v3, La/pd10;

    .line 67
    .line 68
    const/16 v2, 0xe

    .line 69
    .line 70
    invoke-direct {v3, v1, v2}, La/pd10;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    move-object v10, v3

    .line 77
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 78
    .line 79
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-nez v2, :cond_3

    .line 88
    .line 89
    if-ne v3, v4, :cond_4

    .line 90
    .line 91
    :cond_3
    new-instance v3, La/pd10;

    .line 92
    .line 93
    const/16 v2, 0xf

    .line 94
    .line 95
    invoke-direct {v3, v1, v2}, La/pd10;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    move-object v11, v3

    .line 102
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 103
    .line 104
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-nez v2, :cond_5

    .line 113
    .line 114
    if-ne v3, v4, :cond_6

    .line 115
    .line 116
    :cond_5
    new-instance v3, La/pd10;

    .line 117
    .line 118
    const/16 v2, 0x10

    .line 119
    .line 120
    invoke-direct {v3, v1, v2}, La/pd10;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    move-object v12, v3

    .line 127
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    iget-boolean v6, v0, La/lg;->b:Z

    .line 131
    .line 132
    iget-boolean v8, v0, La/lg;->c:Z

    .line 133
    .line 134
    iget-boolean v9, v0, La/lg;->d:Z

    .line 135
    .line 136
    invoke-static/range {v5 .. v14}, La/km10;->g(La/sd;ZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 137
    .line 138
    .line 139
    iget-object v0, v0, La/lg;->f:Ljava/lang/String;

    .line 140
    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    const v1, 0x720ef52a

    .line 144
    .line 145
    .line 146
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 147
    .line 148
    .line 149
    const/4 v1, 0x0

    .line 150
    invoke-static {v15, v13, v1, v0}, La/km10;->h(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v13, v15}, La/fet;->r(Z)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_7
    const v0, 0x720ff0ad

    .line 158
    .line 159
    .line 160
    invoke-virtual {v13, v0}, La/fet;->e0(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v13, v15}, La/fet;->r(Z)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_8
    invoke-virtual {v13}, La/fet;->X()V

    .line 168
    .line 169
    .line 170
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_0
    check-cast v4, La/mm40;

    .line 174
    .line 175
    move-object v6, v3

    .line 176
    check-cast v6, Ljava/lang/String;

    .line 177
    .line 178
    move-object/from16 v8, p1

    .line 179
    .line 180
    check-cast v8, La/fet;

    .line 181
    .line 182
    move-object/from16 v1, p2

    .line 183
    .line 184
    check-cast v1, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v2}, La/x8x;->L(I)I

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    iget-boolean v1, v0, La/lg;->b:Z

    .line 194
    .line 195
    iget-boolean v2, v0, La/lg;->c:Z

    .line 196
    .line 197
    iget-object v3, v0, La/lg;->e:Lkotlin/jvm/functions/Function1;

    .line 198
    .line 199
    iget-object v5, v0, La/lg;->f:Ljava/lang/String;

    .line 200
    .line 201
    iget-boolean v7, v0, La/lg;->d:Z

    .line 202
    .line 203
    invoke-static/range {v1 .. v9}, La/ro4;->c(ZZLkotlin/jvm/functions/Function1;La/mm40;Ljava/lang/String;Ljava/lang/String;ZLa/fet;I)V

    .line 204
    .line 205
    .line 206
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
