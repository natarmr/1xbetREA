.class public final synthetic La/b4l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a5l;


# direct methods
.method public synthetic constructor <init>(La/a5l;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/b4l;->a:B

    iput-object p1, p0, La/b4l;->b:La/a5l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a5l;I)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    iput-byte p2, p0, La/b4l;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b4l;->b:La/a5l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b4l;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v0, v0, La/b4l;->b:La/a5l;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/fet;

    .line 16
    .line 17
    move-object/from16 v2, p2

    .line 18
    .line 19
    check-cast v2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v4}, La/x8x;->L(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v0, v1, v2}, La/jd8;->u(La/a5l;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v13, p1

    .line 35
    .line 36
    check-cast v13, La/fet;

    .line 37
    .line 38
    move-object/from16 v1, p2

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    and-int/lit8 v5, v1, 0x3

    .line 47
    .line 48
    if-eq v5, v2, :cond_0

    .line 49
    .line 50
    move v2, v4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v2, v3

    .line 53
    :goto_0
    and-int/2addr v1, v4

    .line 54
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-object v1, v0, La/a5l;->c:Ljava/lang/String;

    .line 61
    .line 62
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 63
    .line 64
    sget-object v2, La/qmk;->a:La/zcl;

    .line 65
    .line 66
    const/high16 v2, 0x40800000    # 4.0f

    .line 67
    .line 68
    invoke-static {v2}, La/vgg0;->a(F)La/ugg0;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v0, v2}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, "HERO_IMAGE_TAG"

    .line 77
    .line 78
    invoke-static {v0, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const v2, 0x7f080a5d

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v3, v13}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {v2, v3, v13}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    sget-object v11, La/gqw0;->A:La/pge;

    .line 94
    .line 95
    const/4 v15, 0x6

    .line 96
    const/16 v16, 0x7be0

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    const/4 v6, 0x0

    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v8, 0x0

    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v10, 0x0

    .line 104
    const/4 v12, 0x0

    .line 105
    const v14, 0x9030

    .line 106
    .line 107
    .line 108
    move-object v3, v0

    .line 109
    invoke-static/range {v1 .. v16}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    invoke-virtual {v13}, La/fet;->X()V

    .line 114
    .line 115
    .line 116
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_1
    move-object/from16 v13, p1

    .line 120
    .line 121
    check-cast v13, La/fet;

    .line 122
    .line 123
    move-object/from16 v1, p2

    .line 124
    .line 125
    check-cast v1, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    and-int/lit8 v5, v1, 0x3

    .line 132
    .line 133
    if-eq v5, v2, :cond_2

    .line 134
    .line 135
    move v2, v4

    .line 136
    goto :goto_2

    .line 137
    :cond_2
    move v2, v3

    .line 138
    :goto_2
    and-int/2addr v1, v4

    .line 139
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_3

    .line 144
    .line 145
    iget-object v1, v0, La/a5l;->b:Ljava/lang/String;

    .line 146
    .line 147
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 148
    .line 149
    const-string v2, "TEAM_IMAGE_TAG"

    .line 150
    .line 151
    invoke-static {v0, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const v2, 0x7f0804b6

    .line 156
    .line 157
    .line 158
    invoke-static {v2, v3, v13}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-static {v2, v3, v13}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    sget-object v11, La/gqw0;->A:La/pge;

    .line 167
    .line 168
    const/4 v15, 0x6

    .line 169
    const/16 v16, 0x7be0

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    const/4 v6, 0x0

    .line 173
    const/4 v7, 0x0

    .line 174
    const/4 v8, 0x0

    .line 175
    const/4 v9, 0x0

    .line 176
    const/4 v10, 0x0

    .line 177
    const/4 v12, 0x0

    .line 178
    const v14, 0x91b0

    .line 179
    .line 180
    .line 181
    move-object v3, v0

    .line 182
    invoke-static/range {v1 .. v16}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_3
    invoke-virtual {v13}, La/fet;->X()V

    .line 187
    .line 188
    .line 189
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
