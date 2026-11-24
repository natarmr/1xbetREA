.class public final synthetic La/c1i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pm80;

.field public final synthetic c:La/qge;


# direct methods
.method public synthetic constructor <init>(La/pm80;La/qge;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/c1i;->a:B

    iput-object p1, p0, La/c1i;->b:La/pm80;

    iput-object p2, p0, La/c1i;->c:La/qge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c1i;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x82

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v7, p1

    .line 15
    .line 16
    check-cast v7, La/pbe0;

    .line 17
    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    check-cast v1, La/iz3;

    .line 21
    .line 22
    move-object/from16 v15, p3

    .line 23
    .line 24
    check-cast v15, La/fet;

    .line 25
    .line 26
    move-object/from16 v8, p4

    .line 27
    .line 28
    check-cast v8, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    and-int/lit8 v1, v8, 0x6

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v15, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    move v4, v5

    .line 51
    :cond_0
    or-int/2addr v8, v4

    .line 52
    :cond_1
    and-int/lit16 v1, v8, 0x83

    .line 53
    .line 54
    if-eq v1, v3, :cond_2

    .line 55
    .line 56
    move v2, v6

    .line 57
    :cond_2
    and-int/lit8 v1, v8, 0x1

    .line 58
    .line 59
    invoke-virtual {v15, v1, v2}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    and-int/lit8 v1, v8, 0xe

    .line 66
    .line 67
    or-int/lit16 v1, v1, 0x200

    .line 68
    .line 69
    const/16 v17, 0xed

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    iget-object v9, v0, La/c1i;->b:La/pm80;

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    iget-object v11, v0, La/c1i;->c:La/qge;

    .line 76
    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v14, 0x0

    .line 80
    move/from16 v16, v1

    .line 81
    .line 82
    invoke-static/range {v7 .. v17}, La/u4n0;->e(La/pbe0;La/mm40;La/pm80;La/u12;La/qge;FLa/a4d;ZLa/fet;II)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-virtual {v15}, La/fet;->X()V

    .line 87
    .line 88
    .line 89
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_0
    move-object/from16 v1, p1

    .line 93
    .line 94
    check-cast v1, La/pbe0;

    .line 95
    .line 96
    move-object/from16 v7, p2

    .line 97
    .line 98
    check-cast v7, La/jz3;

    .line 99
    .line 100
    move-object/from16 v9, p3

    .line 101
    .line 102
    check-cast v9, La/fet;

    .line 103
    .line 104
    move-object/from16 v8, p4

    .line 105
    .line 106
    check-cast v8, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    and-int/lit8 v7, v8, 0x6

    .line 119
    .line 120
    if-nez v7, :cond_5

    .line 121
    .line 122
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-eqz v7, :cond_4

    .line 127
    .line 128
    move v4, v5

    .line 129
    :cond_4
    or-int/2addr v8, v4

    .line 130
    :cond_5
    and-int/lit16 v4, v8, 0x83

    .line 131
    .line 132
    if-eq v4, v3, :cond_6

    .line 133
    .line 134
    move v2, v6

    .line 135
    :cond_6
    and-int/lit8 v3, v8, 0x1

    .line 136
    .line 137
    invoke-virtual {v9, v3, v2}, La/fet;->U(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    and-int/lit8 v2, v8, 0xe

    .line 144
    .line 145
    or-int/lit16 v10, v2, 0x200

    .line 146
    .line 147
    const/16 v11, 0xed

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    iget-object v3, v0, La/c1i;->b:La/pm80;

    .line 151
    .line 152
    const/4 v4, 0x0

    .line 153
    iget-object v5, v0, La/c1i;->c:La/qge;

    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v7, 0x0

    .line 157
    const/4 v8, 0x0

    .line 158
    invoke-static/range {v1 .. v11}, La/u4n0;->e(La/pbe0;La/mm40;La/pm80;La/u12;La/qge;FLa/a4d;ZLa/fet;II)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    invoke-virtual {v9}, La/fet;->X()V

    .line 163
    .line 164
    .line 165
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object v0

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
