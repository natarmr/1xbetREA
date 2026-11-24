.class public final synthetic La/oca;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nda;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/nda;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oca;->a:B

    iput-object p1, p0, La/oca;->b:La/nda;

    iput-object p2, p0, La/oca;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oca;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41000000    # 8.0f

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    sget-object v4, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    iget-object v9, v0, La/oca;->b:La/nda;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/fet;

    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    check-cast v10, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    and-int/lit8 v11, v10, 0x3

    .line 33
    .line 34
    if-eq v11, v5, :cond_0

    .line 35
    .line 36
    move v5, v6

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v5, v7

    .line 39
    :goto_0
    and-int/2addr v10, v6

    .line 40
    invoke-virtual {v1, v10, v5}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    sget-object v4, La/qmk;->a:La/zcl;

    .line 51
    .line 52
    invoke-static {v3, v8, v2, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    iget-object v11, v9, La/nda;->e:La/kdp0;

    .line 57
    .line 58
    iget-object v2, v9, La/nda;->c:La/cex;

    .line 59
    .line 60
    sget-object v3, La/cex;->b:La/cex;

    .line 61
    .line 62
    if-ne v2, v3, :cond_1

    .line 63
    .line 64
    move v12, v6

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v12, v7

    .line 67
    :goto_1
    iget-object v13, v9, La/nda;->h:Ljava/lang/String;

    .line 68
    .line 69
    iget-boolean v14, v9, La/nda;->i:Z

    .line 70
    .line 71
    const/16 v17, 0x0

    .line 72
    .line 73
    iget-object v15, v0, La/oca;->c:Lkotlin/jvm/functions/Function2;

    .line 74
    .line 75
    move-object/from16 v16, v1

    .line 76
    .line 77
    invoke-static/range {v10 .. v17}, La/dtb;->c(La/mm40;La/sdp0;ZLjava/lang/String;ZLkotlin/jvm/functions/Function2;La/fet;I)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move-object/from16 v16, v1

    .line 82
    .line 83
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 84
    .line 85
    .line 86
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_0
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, La/fet;

    .line 92
    .line 93
    move-object/from16 v10, p2

    .line 94
    .line 95
    check-cast v10, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    and-int/lit8 v11, v10, 0x3

    .line 102
    .line 103
    if-eq v11, v5, :cond_3

    .line 104
    .line 105
    move v5, v6

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    move v5, v7

    .line 108
    :goto_3
    and-int/2addr v10, v6

    .line 109
    invoke-virtual {v1, v10, v5}, La/fet;->U(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    sget-object v4, La/qmk;->a:La/zcl;

    .line 120
    .line 121
    invoke-static {v3, v8, v2, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move v3, v7

    .line 126
    move-object v7, v1

    .line 127
    move-object v1, v2

    .line 128
    iget-object v2, v9, La/nda;->d:La/kdp0;

    .line 129
    .line 130
    iget-object v4, v9, La/nda;->c:La/cex;

    .line 131
    .line 132
    sget-object v5, La/cex;->a:La/cex;

    .line 133
    .line 134
    if-ne v4, v5, :cond_4

    .line 135
    .line 136
    move v3, v6

    .line 137
    :cond_4
    iget-object v4, v9, La/nda;->f:Ljava/lang/String;

    .line 138
    .line 139
    iget-boolean v5, v9, La/nda;->g:Z

    .line 140
    .line 141
    const/4 v8, 0x0

    .line 142
    iget-object v6, v0, La/oca;->c:Lkotlin/jvm/functions/Function2;

    .line 143
    .line 144
    invoke-static/range {v1 .. v8}, La/dtb;->c(La/mm40;La/sdp0;ZLjava/lang/String;ZLkotlin/jvm/functions/Function2;La/fet;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    move-object v7, v1

    .line 149
    invoke-virtual {v7}, La/fet;->X()V

    .line 150
    .line 151
    .line 152
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
