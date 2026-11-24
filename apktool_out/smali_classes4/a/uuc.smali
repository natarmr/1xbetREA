.class public final synthetic La/uuc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eq8;


# direct methods
.method public synthetic constructor <init>(La/eq8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uuc;->a:B

    iput-object p1, p0, La/uuc;->b:La/eq8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uuc;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v0, v0, La/uuc;->b:La/eq8;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/y5d;

    .line 17
    .line 18
    move-object/from16 v13, p2

    .line 19
    .line 20
    check-cast v13, La/fet;

    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    check-cast v5, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v1, v5, 0x11

    .line 34
    .line 35
    if-eq v1, v3, :cond_0

    .line 36
    .line 37
    move v2, v4

    .line 38
    :cond_0
    and-int/lit8 v1, v5, 0x1

    .line 39
    .line 40
    invoke-virtual {v13, v1, v2}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    sget-object v1, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    const/high16 v6, 0x41800000    # 16.0f

    .line 49
    .line 50
    const/4 v7, 0x5

    .line 51
    sget-object v2, La/jm40;->b:La/jm40;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    const/high16 v4, 0x41400000    # 12.0f

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static/range {v2 .. v7}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-object v6, v0, La/eq8;->b:Ljava/lang/String;

    .line 62
    .line 63
    const/4 v14, 0x0

    .line 64
    const/16 v15, 0x3c

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    const/4 v8, 0x0

    .line 68
    const-wide/16 v9, 0x0

    .line 69
    .line 70
    const-wide/16 v11, 0x0

    .line 71
    .line 72
    invoke-static/range {v5 .. v15}, La/kkb;->m(La/mm40;Ljava/lang/String;La/ro8;IJJLa/fet;II)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v13}, La/fet;->X()V

    .line 77
    .line 78
    .line 79
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_0
    move-object/from16 v1, p1

    .line 83
    .line 84
    check-cast v1, La/y5d;

    .line 85
    .line 86
    move-object/from16 v12, p2

    .line 87
    .line 88
    check-cast v12, La/fet;

    .line 89
    .line 90
    move-object/from16 v5, p3

    .line 91
    .line 92
    check-cast v5, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    and-int/lit8 v1, v5, 0x11

    .line 102
    .line 103
    if-eq v1, v3, :cond_2

    .line 104
    .line 105
    move v2, v4

    .line 106
    :cond_2
    and-int/lit8 v1, v5, 0x1

    .line 107
    .line 108
    invoke-virtual {v12, v1, v2}, La/fet;->U(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_3

    .line 113
    .line 114
    iget-object v6, v0, La/eq8;->a:Ljava/lang/String;

    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    const/16 v14, 0x1d

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    const-wide/16 v7, 0x0

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    const-wide/16 v10, 0x0

    .line 124
    .line 125
    invoke-static/range {v5 .. v14}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    invoke-virtual {v12}, La/fet;->X()V

    .line 130
    .line 131
    .line 132
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
