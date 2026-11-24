.class public final synthetic La/xdo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/ydo;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/ydo;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/xdo;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xdo;->b:La/mm40;

    iput-object p2, p0, La/xdo;->c:La/ydo;

    return-void
.end method

.method public synthetic constructor <init>(La/ydo;La/mm40;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/xdo;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xdo;->c:La/ydo;

    iput-object p2, p0, La/xdo;->b:La/mm40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xdo;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/xdo;->c:La/ydo;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/fet;

    .line 14
    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    check-cast v4, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, La/x8x;->L(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-object v0, v0, La/xdo;->b:La/mm40;

    .line 27
    .line 28
    invoke-static {v0, v3, v1, v2}, La/aac;->s(La/mm40;La/ydo;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/fet;

    .line 37
    .line 38
    move-object/from16 v4, p2

    .line 39
    .line 40
    check-cast v4, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    and-int/lit8 v5, v4, 0x3

    .line 47
    .line 48
    const/4 v6, 0x2

    .line 49
    if-eq v5, v6, :cond_0

    .line 50
    .line 51
    move v5, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v5, 0x0

    .line 54
    :goto_0
    and-int/2addr v2, v4

    .line 55
    invoke-virtual {v1, v2, v5}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    iget-object v2, v3, La/ydo;->b:Ljava/lang/String;

    .line 62
    .line 63
    sget-object v9, La/j1t0;->c:La/qrq;

    .line 64
    .line 65
    sget-wide v6, La/qmk;->q:J

    .line 66
    .line 67
    sget-wide v15, La/qmk;->D:J

    .line 68
    .line 69
    new-instance v3, La/y9q0;

    .line 70
    .line 71
    const/4 v14, 0x0

    .line 72
    const v17, 0xfdffdd

    .line 73
    .line 74
    .line 75
    const-wide/16 v4, 0x0

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    const-wide/16 v10, 0x0

    .line 79
    .line 80
    const/4 v12, 0x0

    .line 81
    const/4 v13, 0x0

    .line 82
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 83
    .line 84
    .line 85
    invoke-static {v3, v1}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 86
    .line 87
    .line 88
    move-result-object v21

    .line 89
    new-instance v13, La/f2q0;

    .line 90
    .line 91
    const/4 v3, 0x3

    .line 92
    invoke-direct {v13, v3}, La/f2q0;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const/16 v24, 0x0

    .line 96
    .line 97
    const v25, 0x1fbfc

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, La/xdo;->b:La/mm40;

    .line 101
    .line 102
    const-wide/16 v3, 0x0

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    const-wide/16 v6, 0x0

    .line 106
    .line 107
    const/4 v9, 0x0

    .line 108
    const/4 v10, 0x0

    .line 109
    const-wide/16 v11, 0x0

    .line 110
    .line 111
    const-wide/16 v14, 0x0

    .line 112
    .line 113
    const/16 v16, 0x0

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const/16 v19, 0x0

    .line 120
    .line 121
    const/16 v20, 0x0

    .line 122
    .line 123
    const/16 v23, 0x0

    .line 124
    .line 125
    move-object/from16 v22, v1

    .line 126
    .line 127
    move-object v1, v2

    .line 128
    move-object v2, v0

    .line 129
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    move-object/from16 v22, v1

    .line 134
    .line 135
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 136
    .line 137
    .line 138
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
