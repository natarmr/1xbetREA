.class public final synthetic La/lih0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/pru;

.field public final synthetic b:La/bzt;

.field public final synthetic c:La/lbu;

.field public final synthetic d:La/kuu;

.field public final synthetic e:I

.field public final synthetic f:La/ifh0;

.field public final synthetic g:La/vzg0;

.field public final synthetic h:La/r9u;


# direct methods
.method public synthetic constructor <init>(La/pru;La/bzt;La/lbu;La/kuu;ILa/ifh0;La/vzg0;La/r9u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lih0;->a:La/pru;

    iput-object p2, p0, La/lih0;->b:La/bzt;

    iput-object p3, p0, La/lih0;->c:La/lbu;

    iput-object p4, p0, La/lih0;->d:La/kuu;

    iput p5, p0, La/lih0;->e:I

    iput-object p6, p0, La/lih0;->f:La/ifh0;

    iput-object p7, p0, La/lih0;->g:La/vzg0;

    iput-object p8, p0, La/lih0;->h:La/r9u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/lih0;->a:La/pru;

    .line 4
    .line 5
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, La/lih0;->b:La/bzt;

    .line 10
    .line 11
    iget-object v2, v2, La/bzt;->a:La/fsd;

    .line 12
    .line 13
    invoke-virtual {v2}, La/fsd;->a()La/v8d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, v0, La/lih0;->c:La/lbu;

    .line 18
    .line 19
    invoke-virtual {v3}, La/lbu;->j()Z

    .line 20
    .line 21
    .line 22
    move-result v22

    .line 23
    iget-object v3, v0, La/lih0;->d:La/kuu;

    .line 24
    .line 25
    iget v5, v0, La/lih0;->e:I

    .line 26
    .line 27
    invoke-virtual {v3, v5}, La/kuu;->a(I)La/lok0;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v6, v0, La/lih0;->f:La/ifh0;

    .line 32
    .line 33
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    if-ne v4, v7, :cond_0

    .line 41
    .line 42
    sget-object v4, La/n0w;->b:La/n0w;

    .line 43
    .line 44
    :goto_0
    move-object/from16 v28, v4

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0

    .line 52
    :cond_1
    sget-object v4, La/n0w;->a:La/n0w;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :goto_1
    new-instance v9, La/cxk0;

    .line 56
    .line 57
    sget-object v11, La/iun;->a:La/iun;

    .line 58
    .line 59
    invoke-direct {v9, v11, v11, v11}, La/cxk0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    new-instance v10, La/cxk0;

    .line 63
    .line 64
    invoke-direct {v10, v11, v11, v11}, La/cxk0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    const-string v4, "KEY_SELECTED_SEARCH_FILTER"

    .line 68
    .line 69
    iget-object v7, v0, La/lih0;->g:La/vzg0;

    .line 70
    .line 71
    invoke-virtual {v7, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljava/lang/Long;

    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    :goto_2
    move-wide v15, v7

    .line 84
    goto :goto_3

    .line 85
    :cond_2
    const-wide/16 v7, -0x141

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :goto_3
    sget-object v18, La/xun;->a:La/xun;

    .line 89
    .line 90
    sget-object v21, La/sah0;->a:La/sah0;

    .line 91
    .line 92
    iget-boolean v4, v1, La/sff0;->J:Z

    .line 93
    .line 94
    iget-boolean v7, v1, La/sff0;->J1:Z

    .line 95
    .line 96
    iget-boolean v8, v3, La/lok0;->n:Z

    .line 97
    .line 98
    iget-boolean v12, v3, La/lok0;->p:Z

    .line 99
    .line 100
    iget-object v13, v3, La/lok0;->u:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v3, v3, La/lok0;->e:La/oho;

    .line 103
    .line 104
    invoke-static {v3, v1}, La/xdx;->P(La/oho;La/sff0;)La/v5l0;

    .line 105
    .line 106
    .line 107
    move-result-object v29

    .line 108
    iget v1, v2, La/v8d;->r:I

    .line 109
    .line 110
    sget-object v2, La/ygp;->t:La/ygp;

    .line 111
    .line 112
    iget-object v0, v0, La/lih0;->h:La/r9u;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 123
    .line 124
    invoke-virtual {v0, v2}, La/m1q0;->d(La/ygp;)Z

    .line 125
    .line 126
    .line 127
    move-result v31

    .line 128
    move/from16 v23, v4

    .line 129
    .line 130
    new-instance v4, La/uhh0;

    .line 131
    .line 132
    const/16 v19, 0x0

    .line 133
    .line 134
    const/16 v20, 0x1

    .line 135
    .line 136
    move/from16 v24, v7

    .line 137
    .line 138
    const-string v7, ""

    .line 139
    .line 140
    move/from16 v25, v8

    .line 141
    .line 142
    const-string v8, ""

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    move/from16 v26, v12

    .line 147
    .line 148
    move-object v12, v11

    .line 149
    move-object/from16 v27, v13

    .line 150
    .line 151
    move-object v13, v11

    .line 152
    move-object v14, v11

    .line 153
    move/from16 v30, v1

    .line 154
    .line 155
    invoke-direct/range {v4 .. v31}, La/uhh0;-><init>(ILa/ifh0;Ljava/lang/String;Ljava/lang/String;La/cxk0;La/cxk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;JLa/wcb;Ljava/util/Set;La/mfh0;ZLa/sah0;ZZZZZLjava/lang/String;La/n0w;La/v5l0;IZ)V

    .line 156
    .line 157
    .line 158
    return-object v4
.end method
