.class public final synthetic La/blm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tlm;

.field public final synthetic c:La/mm40;


# direct methods
.method public synthetic constructor <init>(La/tlm;La/mm40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/blm;->a:B

    iput-object p1, p0, La/blm;->b:La/tlm;

    iput-object p2, p0, La/blm;->c:La/mm40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/blm;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/high16 v4, 0x41000000    # 8.0f

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/16 v6, 0x10

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    iget-object v8, v0, La/blm;->c:La/mm40;

    .line 14
    .line 15
    iget-object v0, v0, La/blm;->b:La/tlm;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/u63;

    .line 23
    .line 24
    move-object/from16 v9, p2

    .line 25
    .line 26
    check-cast v9, La/fet;

    .line 27
    .line 28
    move-object/from16 v10, p3

    .line 29
    .line 30
    check-cast v10, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v10, 0x11

    .line 40
    .line 41
    if-eq v1, v6, :cond_0

    .line 42
    .line 43
    move v5, v7

    .line 44
    :cond_0
    and-int/lit8 v1, v10, 0x1

    .line 45
    .line 46
    invoke-virtual {v9, v1, v5}, La/fet;->U(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    check-cast v0, La/slm;

    .line 53
    .line 54
    iget-object v10, v0, La/slm;->b:Ljava/lang/String;

    .line 55
    .line 56
    iget-wide v12, v0, La/slm;->d:J

    .line 57
    .line 58
    iget-object v11, v0, La/slm;->c:Ljava/lang/String;

    .line 59
    .line 60
    iget-wide v14, v0, La/slm;->e:J

    .line 61
    .line 62
    sget-object v0, La/qmk;->a:La/zcl;

    .line 63
    .line 64
    move-object/from16 v17, v9

    .line 65
    .line 66
    invoke-static {v8, v4, v3, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    const/16 v18, 0x0

    .line 71
    .line 72
    sget-object v16, La/fa50;->a:La/fa50;

    .line 73
    .line 74
    invoke-static/range {v9 .. v18}, La/hlm;->j(La/mm40;Ljava/lang/String;Ljava/lang/String;JJLa/ga50;La/fet;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object/from16 v17, v9

    .line 79
    .line 80
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 81
    .line 82
    .line 83
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_0
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, La/u63;

    .line 89
    .line 90
    move-object/from16 v15, p2

    .line 91
    .line 92
    check-cast v15, La/fet;

    .line 93
    .line 94
    move-object/from16 v9, p3

    .line 95
    .line 96
    check-cast v9, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    and-int/lit8 v1, v9, 0x11

    .line 106
    .line 107
    if-eq v1, v6, :cond_2

    .line 108
    .line 109
    move v5, v7

    .line 110
    :cond_2
    and-int/lit8 v1, v9, 0x1

    .line 111
    .line 112
    invoke-virtual {v15, v1, v5}, La/fet;->U(IZ)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    check-cast v0, La/qlm;

    .line 119
    .line 120
    iget-object v10, v0, La/qlm;->a:Ljava/lang/String;

    .line 121
    .line 122
    iget-wide v11, v0, La/qlm;->c:J

    .line 123
    .line 124
    sget-object v0, La/ha50;->b:La/ha50;

    .line 125
    .line 126
    sget-object v0, La/qmk;->a:La/zcl;

    .line 127
    .line 128
    invoke-static {v8, v4, v3, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    const/16 v17, 0x0

    .line 135
    .line 136
    const/4 v13, 0x2

    .line 137
    sget-object v14, La/fa50;->a:La/fa50;

    .line 138
    .line 139
    invoke-static/range {v9 .. v17}, La/hlm;->i(La/mm40;Ljava/lang/String;JILa/ga50;La/fet;II)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    invoke-virtual {v15}, La/fet;->X()V

    .line 144
    .line 145
    .line 146
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
