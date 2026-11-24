.class public final synthetic La/vs80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:J

.field public final synthetic d:La/bzt;

.field public final synthetic e:La/iqt;

.field public final synthetic f:La/dmt;


# direct methods
.method public synthetic constructor <init>(La/iqt;La/bzt;La/pru;La/dmt;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/vs80;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vs80;->e:La/iqt;

    iput-object p2, p0, La/vs80;->d:La/bzt;

    iput-object p3, p0, La/vs80;->b:La/pru;

    iput-object p4, p0, La/vs80;->f:La/dmt;

    iput-wide p5, p0, La/vs80;->c:J

    return-void
.end method

.method public synthetic constructor <init>(La/pru;JLa/bzt;La/iqt;La/dmt;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/vs80;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vs80;->b:La/pru;

    iput-wide p2, p0, La/vs80;->c:J

    iput-object p4, p0, La/vs80;->d:La/bzt;

    iput-object p5, p0, La/vs80;->e:La/iqt;

    iput-object p6, p0, La/vs80;->f:La/dmt;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vs80;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/vs80;->f:La/dmt;

    .line 6
    .line 7
    iget-object v3, v0, La/vs80;->e:La/iqt;

    .line 8
    .line 9
    iget-object v4, v0, La/vs80;->d:La/bzt;

    .line 10
    .line 11
    iget-object v5, v0, La/vs80;->b:La/pru;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v5, La/nfe0;

    .line 21
    .line 22
    iget-object v4, v4, La/bzt;->a:La/fsd;

    .line 23
    .line 24
    invoke-virtual {v4}, La/fsd;->a()La/v8d;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget v9, v4, La/v8d;->r:I

    .line 29
    .line 30
    iget-object v3, v3, La/iqt;->a:La/gst0;

    .line 31
    .line 32
    invoke-virtual {v3}, La/gst0;->a()Z

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    iget-object v1, v1, La/sff0;->b:La/hl1;

    .line 37
    .line 38
    iget-boolean v11, v1, La/hl1;->C:Z

    .line 39
    .line 40
    invoke-virtual {v2}, La/dmt;->b()La/kg;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    iget-object v13, v1, La/hl1;->l:La/ot0;

    .line 45
    .line 46
    sget-object v14, La/xun;->a:La/xun;

    .line 47
    .line 48
    const/4 v15, 0x0

    .line 49
    sget-object v6, La/ohe;->a:La/ohe;

    .line 50
    .line 51
    iget-wide v7, v0, La/vs80;->c:J

    .line 52
    .line 53
    invoke-direct/range {v5 .. v15}, La/nfe0;-><init>(La/aie;JIZZLa/kg;La/ot0;Ljava/util/Set;La/ql5;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :pswitch_0
    iget-object v1, v3, La/iqt;->a:La/gst0;

    .line 58
    .line 59
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    iget-object v1, v4, La/bzt;->a:La/fsd;

    .line 64
    .line 65
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget v14, v1, La/v8d;->r:I

    .line 70
    .line 71
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v1, v1, La/sff0;->b:La/hl1;

    .line 76
    .line 77
    iget-object v15, v1, La/hl1;->s:La/ai0;

    .line 78
    .line 79
    invoke-virtual {v2}, La/dmt;->b()La/kg;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v1, v1, La/sff0;->b:La/hl1;

    .line 88
    .line 89
    iget-object v1, v1, La/hl1;->l:La/ot0;

    .line 90
    .line 91
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object v2, v2, La/sff0;->b:La/hl1;

    .line 96
    .line 97
    iget-object v2, v2, La/hl1;->e:La/hr10;

    .line 98
    .line 99
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    iget-object v3, v3, La/sff0;->b:La/hl1;

    .line 104
    .line 105
    iget-boolean v3, v3, La/hl1;->C:Z

    .line 106
    .line 107
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    iget-boolean v4, v4, La/sff0;->O0:Z

    .line 112
    .line 113
    sget-object v24, La/iun;->a:La/iun;

    .line 114
    .line 115
    sget-object v25, La/xun;->a:La/xun;

    .line 116
    .line 117
    new-instance v5, Lkotlin/Pair;

    .line 118
    .line 119
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-direct {v5, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v6, La/rs80;

    .line 130
    .line 131
    const/16 v27, 0x0

    .line 132
    .line 133
    const/16 v33, 0x0

    .line 134
    .line 135
    const/4 v9, 0x0

    .line 136
    const/4 v11, 0x1

    .line 137
    const/4 v12, 0x0

    .line 138
    const/4 v13, 0x1

    .line 139
    const/16 v19, 0x0

    .line 140
    .line 141
    const/16 v20, 0x0

    .line 142
    .line 143
    const/16 v23, 0x0

    .line 144
    .line 145
    sget-object v26, La/or80;->a:La/or80;

    .line 146
    .line 147
    iget-wide v7, v0, La/vs80;->c:J

    .line 148
    .line 149
    sget-object v30, La/vr80;->a:La/vr80;

    .line 150
    .line 151
    move-object/from16 v31, v24

    .line 152
    .line 153
    move-object/from16 v32, v24

    .line 154
    .line 155
    move-object/from16 v17, v1

    .line 156
    .line 157
    move-object/from16 v18, v2

    .line 158
    .line 159
    move/from16 v21, v3

    .line 160
    .line 161
    move/from16 v22, v4

    .line 162
    .line 163
    move-object/from16 v34, v5

    .line 164
    .line 165
    move-wide/from16 v28, v7

    .line 166
    .line 167
    const/4 v7, 0x1

    .line 168
    const/4 v8, 0x0

    .line 169
    invoke-direct/range {v6 .. v34}, La/rs80;-><init>(ZZZZZZZILa/ai0;La/kg;La/ot0;La/hr10;Ljava/lang/String;Ljava/lang/String;ZZLorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;JLa/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;)V

    .line 170
    .line 171
    .line 172
    return-object v6

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
