.class public final synthetic La/bda;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y5d;

.field public final synthetic c:La/mm40;

.field public final synthetic d:La/oda;

.field public final synthetic e:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/y5d;La/mm40;La/oda;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/bda;->a:B

    iput-object p1, p0, La/bda;->b:La/y5d;

    iput-object p2, p0, La/bda;->c:La/mm40;

    iput-object p3, p0, La/bda;->d:La/oda;

    iput-object p4, p0, La/bda;->e:Lkotlin/jvm/functions/Function2;

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
    iget-byte v1, v0, La/bda;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

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
    move-object/from16 v5, p2

    .line 16
    .line 17
    check-cast v5, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    and-int/lit8 v6, v5, 0x3

    .line 24
    .line 25
    if-eq v6, v2, :cond_0

    .line 26
    .line 27
    move v3, v4

    .line 28
    :cond_0
    and-int/lit8 v2, v5, 0x1

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object v2, v0, La/bda;->b:La/y5d;

    .line 37
    .line 38
    iget-object v3, v0, La/bda;->c:La/mm40;

    .line 39
    .line 40
    invoke-static {v2, v3}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, La/z1s;

    .line 45
    .line 46
    iget-object v5, v0, La/bda;->d:La/oda;

    .line 47
    .line 48
    iget-object v0, v0, La/bda;->e:Lkotlin/jvm/functions/Function2;

    .line 49
    .line 50
    invoke-direct {v3, v5, v0, v4}, La/z1s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    const v0, 0x177d7bf5

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v3, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/16 v3, 0x30

    .line 61
    .line 62
    invoke-static {v2, v0, v1, v3}, La/msm0;->b(La/mm40;La/ugd;La/fet;I)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    move-object/from16 v1, p1

    .line 73
    .line 74
    check-cast v1, La/fet;

    .line 75
    .line 76
    move-object/from16 v5, p2

    .line 77
    .line 78
    check-cast v5, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    and-int/lit8 v6, v5, 0x3

    .line 85
    .line 86
    if-eq v6, v2, :cond_2

    .line 87
    .line 88
    move v3, v4

    .line 89
    :cond_2
    and-int/lit8 v2, v5, 0x1

    .line 90
    .line 91
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    sget-object v2, La/egp0;->c:La/zfn;

    .line 98
    .line 99
    sget-object v9, La/j1t0;->b:La/qrq;

    .line 100
    .line 101
    sget-wide v6, La/qmk;->p:J

    .line 102
    .line 103
    sget-wide v15, La/qmk;->C:J

    .line 104
    .line 105
    new-instance v3, La/y9q0;

    .line 106
    .line 107
    const/4 v14, 0x0

    .line 108
    const v17, 0xfdffdd

    .line 109
    .line 110
    .line 111
    const-wide/16 v4, 0x0

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    const-wide/16 v10, 0x0

    .line 115
    .line 116
    const/4 v12, 0x0

    .line 117
    const/4 v13, 0x0

    .line 118
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    new-instance v3, La/bda;

    .line 126
    .line 127
    const/4 v8, 0x1

    .line 128
    iget-object v4, v0, La/bda;->b:La/y5d;

    .line 129
    .line 130
    iget-object v5, v0, La/bda;->c:La/mm40;

    .line 131
    .line 132
    iget-object v6, v0, La/bda;->d:La/oda;

    .line 133
    .line 134
    iget-object v7, v0, La/bda;->e:Lkotlin/jvm/functions/Function2;

    .line 135
    .line 136
    invoke-direct/range {v3 .. v8}, La/bda;-><init>(La/y5d;La/mm40;La/oda;Lkotlin/jvm/functions/Function2;B)V

    .line 137
    .line 138
    .line 139
    const v0, -0x2888f49d

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v3, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    const/16 v3, 0x38

    .line 147
    .line 148
    invoke-static {v2, v0, v1, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    invoke-virtual {v1}, La/fet;->X()V

    .line 153
    .line 154
    .line 155
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
