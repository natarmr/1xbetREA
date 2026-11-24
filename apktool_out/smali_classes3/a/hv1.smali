.class public final synthetic La/hv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/pru;

.field public final synthetic b:La/bzt;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/s9s0;

.field public final synthetic f:La/iqt;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(La/pru;La/bzt;JLjava/lang/String;La/s9s0;La/iqt;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hv1;->a:La/pru;

    iput-object p2, p0, La/hv1;->b:La/bzt;

    iput-wide p3, p0, La/hv1;->c:J

    iput-object p5, p0, La/hv1;->d:Ljava/lang/String;

    iput-object p6, p0, La/hv1;->e:La/s9s0;

    iput-object p7, p0, La/hv1;->f:La/iqt;

    iput-boolean p8, p0, La/hv1;->g:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/hv1;->a:La/pru;

    .line 4
    .line 5
    invoke-virtual {v1}, La/pru;->a()La/sff0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, La/hv1;->b:La/bzt;

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
    iget-object v3, v1, La/sff0;->b:La/hl1;

    .line 18
    .line 19
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 20
    .line 21
    new-instance v4, La/yu1;

    .line 22
    .line 23
    sget-object v5, La/bv1;->c:La/qek0;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget-object v5, La/bv1;->g:La/c0o;

    .line 29
    .line 30
    invoke-virtual {v5}, La/b3;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    move-object v8, v6

    .line 46
    check-cast v8, La/bv1;

    .line 47
    .line 48
    iget-object v8, v8, La/bv1;->b:La/s9s0;

    .line 49
    .line 50
    iget-object v9, v0, La/hv1;->e:La/s9s0;

    .line 51
    .line 52
    if-ne v8, v9, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v6, v7

    .line 56
    :goto_0
    check-cast v6, La/bv1;

    .line 57
    .line 58
    if-nez v6, :cond_2

    .line 59
    .line 60
    sget-object v6, La/bv1;->d:La/bv1;

    .line 61
    .line 62
    :cond_2
    move-object v8, v6

    .line 63
    sget-object v5, La/qu1;->b:La/pek0;

    .line 64
    .line 65
    iget-object v6, v3, La/hl1;->y:La/ww1;

    .line 66
    .line 67
    iget-object v6, v6, La/ww1;->a:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v5, La/qu1;->e:La/c0o;

    .line 73
    .line 74
    invoke-virtual {v5}, La/b3;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-eqz v9, :cond_4

    .line 83
    .line 84
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    move-object v10, v9

    .line 89
    check-cast v10, La/qu1;

    .line 90
    .line 91
    iget-object v10, v10, La/qu1;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v10, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    if-eqz v10, :cond_3

    .line 98
    .line 99
    move-object v7, v9

    .line 100
    :cond_4
    check-cast v7, La/qu1;

    .line 101
    .line 102
    if-nez v7, :cond_5

    .line 103
    .line 104
    sget-object v7, La/qu1;->c:La/qu1;

    .line 105
    .line 106
    :cond_5
    move-object v9, v7

    .line 107
    iget-object v5, v0, La/hv1;->f:La/iqt;

    .line 108
    .line 109
    iget-object v5, v5, La/iqt;->a:La/gst0;

    .line 110
    .line 111
    invoke-virtual {v5}, La/gst0;->a()Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    iget-object v12, v1, La/mum0;->x:La/zvh0;

    .line 116
    .line 117
    iget v1, v2, La/v8d;->r:I

    .line 118
    .line 119
    iget-object v2, v3, La/hl1;->a:La/f61;

    .line 120
    .line 121
    iget-boolean v2, v2, La/f61;->a:Z

    .line 122
    .line 123
    iget-object v5, v3, La/hl1;->v:La/th1;

    .line 124
    .line 125
    iget-object v5, v5, La/th1;->a:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v3, v3, La/hl1;->l:La/ot0;

    .line 128
    .line 129
    sget-object v22, La/lun;->a:La/lun;

    .line 130
    .line 131
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    sget-object v27, La/iun;->a:La/iun;

    .line 135
    .line 136
    sget-object v29, La/xun;->a:La/xun;

    .line 137
    .line 138
    move-object/from16 v19, v5

    .line 139
    .line 140
    iget-wide v5, v0, La/hv1;->c:J

    .line 141
    .line 142
    iget-object v7, v0, La/hv1;->d:Ljava/lang/String;

    .line 143
    .line 144
    const/4 v11, 0x0

    .line 145
    sget-object v13, La/ct1;->a:La/ct1;

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const/16 v23, 0x0

    .line 150
    .line 151
    iget-boolean v0, v0, La/hv1;->g:Z

    .line 152
    .line 153
    const/16 v25, 0x0

    .line 154
    .line 155
    const-string v26, ""

    .line 156
    .line 157
    move-object v14, v13

    .line 158
    move-object v15, v13

    .line 159
    move-object/from16 v16, v13

    .line 160
    .line 161
    move-object/from16 v28, v22

    .line 162
    .line 163
    move-object/from16 v30, v29

    .line 164
    .line 165
    move/from16 v24, v0

    .line 166
    .line 167
    move/from16 v17, v1

    .line 168
    .line 169
    move/from16 v18, v2

    .line 170
    .line 171
    move-object/from16 v20, v3

    .line 172
    .line 173
    invoke-direct/range {v4 .. v30}, La/yu1;-><init>(JLjava/lang/String;La/bv1;La/qu1;ZLa/ql5;La/zvh0;La/dt1;La/dt1;La/dt1;La/dt1;IZLjava/lang/String;La/ot0;La/gu1;Ljava/util/Map;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 174
    .line 175
    .line 176
    return-object v4
.end method
