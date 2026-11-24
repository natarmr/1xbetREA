.class public final La/bs5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/as5;

.field public static final H:[La/a8z;


# instance fields
.field public final A:Ljava/util/List;

.field public final B:Ljava/util/List;

.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/util/List;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final a:Ljava/lang/Integer;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/util/List;

.field public final r:Ljava/lang/Boolean;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/Long;

.field public final u:Ljava/lang/Long;

.field public final v:Ljava/lang/Integer;

.field public final w:Ljava/lang/Integer;

.field public final x:Ljava/lang/Integer;

.field public final y:Ljava/lang/Integer;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, La/as5;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/bs5;->Companion:La/as5;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/o85;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/o85;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v3, La/o85;

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v3, v4}, La/o85;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v5, La/o85;

    .line 33
    .line 34
    const/16 v6, 0xa

    .line 35
    .line 36
    invoke-direct {v5, v6}, La/o85;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    new-instance v7, La/o85;

    .line 44
    .line 45
    const/16 v8, 0xb

    .line 46
    .line 47
    invoke-direct {v7, v8}, La/o85;-><init>(B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v7}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    new-instance v9, La/o85;

    .line 55
    .line 56
    const/16 v10, 0xc

    .line 57
    .line 58
    invoke-direct {v9, v10}, La/o85;-><init>(B)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v9}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/16 v9, 0x21

    .line 66
    .line 67
    new-array v9, v9, [La/a8z;

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x0

    .line 71
    aput-object v12, v9, v11

    .line 72
    .line 73
    const/4 v11, 0x1

    .line 74
    aput-object v1, v9, v11

    .line 75
    .line 76
    const/4 v1, 0x2

    .line 77
    aput-object v12, v9, v1

    .line 78
    .line 79
    const/4 v1, 0x3

    .line 80
    aput-object v12, v9, v1

    .line 81
    .line 82
    const/4 v1, 0x4

    .line 83
    aput-object v12, v9, v1

    .line 84
    .line 85
    const/4 v1, 0x5

    .line 86
    aput-object v12, v9, v1

    .line 87
    .line 88
    const/4 v1, 0x6

    .line 89
    aput-object v12, v9, v1

    .line 90
    .line 91
    const/4 v1, 0x7

    .line 92
    aput-object v12, v9, v1

    .line 93
    .line 94
    aput-object v12, v9, v2

    .line 95
    .line 96
    aput-object v12, v9, v4

    .line 97
    .line 98
    aput-object v12, v9, v6

    .line 99
    .line 100
    aput-object v12, v9, v8

    .line 101
    .line 102
    aput-object v12, v9, v10

    .line 103
    .line 104
    const/16 v1, 0xd

    .line 105
    .line 106
    aput-object v12, v9, v1

    .line 107
    .line 108
    const/16 v1, 0xe

    .line 109
    .line 110
    aput-object v12, v9, v1

    .line 111
    .line 112
    const/16 v1, 0xf

    .line 113
    .line 114
    aput-object v12, v9, v1

    .line 115
    .line 116
    const/16 v1, 0x10

    .line 117
    .line 118
    aput-object v3, v9, v1

    .line 119
    .line 120
    const/16 v1, 0x11

    .line 121
    .line 122
    aput-object v12, v9, v1

    .line 123
    .line 124
    const/16 v1, 0x12

    .line 125
    .line 126
    aput-object v12, v9, v1

    .line 127
    .line 128
    const/16 v1, 0x13

    .line 129
    .line 130
    aput-object v12, v9, v1

    .line 131
    .line 132
    const/16 v1, 0x14

    .line 133
    .line 134
    aput-object v12, v9, v1

    .line 135
    .line 136
    const/16 v1, 0x15

    .line 137
    .line 138
    aput-object v12, v9, v1

    .line 139
    .line 140
    const/16 v1, 0x16

    .line 141
    .line 142
    aput-object v12, v9, v1

    .line 143
    .line 144
    const/16 v1, 0x17

    .line 145
    .line 146
    aput-object v12, v9, v1

    .line 147
    .line 148
    const/16 v1, 0x18

    .line 149
    .line 150
    aput-object v12, v9, v1

    .line 151
    .line 152
    const/16 v1, 0x19

    .line 153
    .line 154
    aput-object v12, v9, v1

    .line 155
    .line 156
    const/16 v1, 0x1a

    .line 157
    .line 158
    aput-object v5, v9, v1

    .line 159
    .line 160
    const/16 v1, 0x1b

    .line 161
    .line 162
    aput-object v7, v9, v1

    .line 163
    .line 164
    const/16 v1, 0x1c

    .line 165
    .line 166
    aput-object v12, v9, v1

    .line 167
    .line 168
    const/16 v1, 0x1d

    .line 169
    .line 170
    aput-object v12, v9, v1

    .line 171
    .line 172
    const/16 v1, 0x1e

    .line 173
    .line 174
    aput-object v0, v9, v1

    .line 175
    .line 176
    const/16 v0, 0x1f

    .line 177
    .line 178
    aput-object v12, v9, v0

    .line 179
    .line 180
    const/16 v0, 0x20

    .line 181
    .line 182
    aput-object v12, v9, v0

    .line 183
    .line 184
    sput-object v9, La/bs5;->H:[La/a8z;

    .line 185
    .line 186
    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, La/bs5;->a:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    iput-object p3, p0, La/bs5;->a:Ljava/lang/Integer;

    :goto_0
    and-int/lit8 p3, p1, 0x2

    if-nez p3, :cond_1

    iput-object v1, p0, La/bs5;->b:Ljava/util/List;

    goto :goto_1

    :cond_1
    iput-object p4, p0, La/bs5;->b:Ljava/util/List;

    :goto_1
    and-int/lit8 p3, p1, 0x4

    if-nez p3, :cond_2

    iput-object v1, p0, La/bs5;->c:Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    iput-object p5, p0, La/bs5;->c:Ljava/lang/Integer;

    :goto_2
    and-int/lit8 p3, p1, 0x8

    if-nez p3, :cond_3

    iput-object v1, p0, La/bs5;->d:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p6, p0, La/bs5;->d:Ljava/lang/String;

    :goto_3
    and-int/lit8 p3, p1, 0x10

    if-nez p3, :cond_4

    iput-object v1, p0, La/bs5;->e:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p7, p0, La/bs5;->e:Ljava/lang/String;

    :goto_4
    and-int/lit8 p3, p1, 0x20

    if-nez p3, :cond_5

    iput-object v1, p0, La/bs5;->f:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p8, p0, La/bs5;->f:Ljava/lang/String;

    :goto_5
    and-int/lit8 p3, p1, 0x40

    if-nez p3, :cond_6

    iput-object v1, p0, La/bs5;->g:Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p9, p0, La/bs5;->g:Ljava/lang/String;

    :goto_6
    and-int/lit16 p3, p1, 0x80

    if-nez p3, :cond_7

    iput-object v1, p0, La/bs5;->h:Ljava/lang/String;

    goto :goto_7

    :cond_7
    iput-object p10, p0, La/bs5;->h:Ljava/lang/String;

    :goto_7
    and-int/lit16 p3, p1, 0x100

    if-nez p3, :cond_8

    iput-object v1, p0, La/bs5;->i:Ljava/lang/String;

    goto :goto_8

    :cond_8
    iput-object p11, p0, La/bs5;->i:Ljava/lang/String;

    :goto_8
    and-int/lit16 p3, p1, 0x200

    if-nez p3, :cond_9

    iput-object v1, p0, La/bs5;->j:Ljava/lang/String;

    goto :goto_9

    :cond_9
    iput-object p12, p0, La/bs5;->j:Ljava/lang/String;

    :goto_9
    and-int/lit16 p3, p1, 0x400

    if-nez p3, :cond_a

    iput-object v1, p0, La/bs5;->k:Ljava/lang/String;

    goto :goto_a

    :cond_a
    iput-object p13, p0, La/bs5;->k:Ljava/lang/String;

    :goto_a
    and-int/lit16 p3, p1, 0x800

    if-nez p3, :cond_b

    iput-object v1, p0, La/bs5;->l:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 p3, p14

    iput-object p3, p0, La/bs5;->l:Ljava/lang/String;

    :goto_b
    and-int/lit16 p3, p1, 0x1000

    if-nez p3, :cond_c

    iput-object v1, p0, La/bs5;->m:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 p3, p15

    iput-object p3, p0, La/bs5;->m:Ljava/lang/String;

    :goto_c
    and-int/lit16 p3, p1, 0x2000

    if-nez p3, :cond_d

    iput-object v1, p0, La/bs5;->n:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 p3, p16

    iput-object p3, p0, La/bs5;->n:Ljava/lang/String;

    :goto_d
    and-int/lit16 p3, p1, 0x4000

    if-nez p3, :cond_e

    iput-object v1, p0, La/bs5;->o:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 p3, p17

    iput-object p3, p0, La/bs5;->o:Ljava/lang/String;

    :goto_e
    const p3, 0x8000

    and-int/2addr p3, p1

    if-nez p3, :cond_f

    iput-object v1, p0, La/bs5;->p:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 p3, p18

    iput-object p3, p0, La/bs5;->p:Ljava/lang/String;

    :goto_f
    const/high16 p3, 0x10000

    and-int/2addr p3, p1

    if-nez p3, :cond_10

    iput-object v1, p0, La/bs5;->q:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 p3, p19

    iput-object p3, p0, La/bs5;->q:Ljava/util/List;

    :goto_10
    const/high16 p3, 0x20000

    and-int/2addr p3, p1

    if-nez p3, :cond_11

    iput-object v1, p0, La/bs5;->r:Ljava/lang/Boolean;

    goto :goto_11

    :cond_11
    move-object/from16 p3, p20

    iput-object p3, p0, La/bs5;->r:Ljava/lang/Boolean;

    :goto_11
    const/high16 p3, 0x40000

    and-int/2addr p3, p1

    if-nez p3, :cond_12

    iput-object v1, p0, La/bs5;->s:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 p3, p21

    iput-object p3, p0, La/bs5;->s:Ljava/lang/String;

    :goto_12
    const/high16 p3, 0x80000

    and-int/2addr p3, p1

    if-nez p3, :cond_13

    iput-object v1, p0, La/bs5;->t:Ljava/lang/Long;

    goto :goto_13

    :cond_13
    move-object/from16 p3, p22

    iput-object p3, p0, La/bs5;->t:Ljava/lang/Long;

    :goto_13
    const/high16 p3, 0x100000

    and-int/2addr p3, p1

    if-nez p3, :cond_14

    iput-object v1, p0, La/bs5;->u:Ljava/lang/Long;

    goto :goto_14

    :cond_14
    move-object/from16 p3, p23

    iput-object p3, p0, La/bs5;->u:Ljava/lang/Long;

    :goto_14
    const/high16 p3, 0x200000

    and-int/2addr p3, p1

    if-nez p3, :cond_15

    iput-object v1, p0, La/bs5;->v:Ljava/lang/Integer;

    goto :goto_15

    :cond_15
    move-object/from16 p3, p24

    iput-object p3, p0, La/bs5;->v:Ljava/lang/Integer;

    :goto_15
    const/high16 p3, 0x400000

    and-int/2addr p3, p1

    if-nez p3, :cond_16

    iput-object v1, p0, La/bs5;->w:Ljava/lang/Integer;

    goto :goto_16

    :cond_16
    move-object/from16 p3, p25

    iput-object p3, p0, La/bs5;->w:Ljava/lang/Integer;

    :goto_16
    const/high16 p3, 0x800000

    and-int/2addr p3, p1

    if-nez p3, :cond_17

    iput-object v1, p0, La/bs5;->x:Ljava/lang/Integer;

    goto :goto_17

    :cond_17
    move-object/from16 p3, p26

    iput-object p3, p0, La/bs5;->x:Ljava/lang/Integer;

    :goto_17
    const/high16 p3, 0x1000000

    and-int/2addr p3, p1

    if-nez p3, :cond_18

    iput-object v1, p0, La/bs5;->y:Ljava/lang/Integer;

    goto :goto_18

    :cond_18
    move-object/from16 p3, p27

    iput-object p3, p0, La/bs5;->y:Ljava/lang/Integer;

    :goto_18
    const/high16 p3, 0x2000000

    and-int/2addr p3, p1

    if-nez p3, :cond_19

    iput-object v1, p0, La/bs5;->z:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 p3, p28

    iput-object p3, p0, La/bs5;->z:Ljava/lang/String;

    :goto_19
    const/high16 p3, 0x4000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1a

    iput-object v1, p0, La/bs5;->A:Ljava/util/List;

    goto :goto_1a

    :cond_1a
    move-object/from16 p3, p29

    iput-object p3, p0, La/bs5;->A:Ljava/util/List;

    :goto_1a
    const/high16 p3, 0x8000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1b

    iput-object v1, p0, La/bs5;->B:Ljava/util/List;

    goto :goto_1b

    :cond_1b
    move-object/from16 p3, p30

    iput-object p3, p0, La/bs5;->B:Ljava/util/List;

    :goto_1b
    const/high16 p3, 0x10000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1c

    iput-object v1, p0, La/bs5;->C:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 p3, p31

    iput-object p3, p0, La/bs5;->C:Ljava/lang/String;

    :goto_1c
    const/high16 p3, 0x20000000

    and-int/2addr p3, p1

    if-nez p3, :cond_1d

    iput-object v1, p0, La/bs5;->D:Ljava/lang/String;

    goto :goto_1d

    :cond_1d
    move-object/from16 p3, p32

    iput-object p3, p0, La/bs5;->D:Ljava/lang/String;

    :goto_1d
    const/high16 p3, 0x40000000    # 2.0f

    and-int/2addr p3, p1

    if-nez p3, :cond_1e

    iput-object v1, p0, La/bs5;->E:Ljava/util/List;

    goto :goto_1e

    :cond_1e
    move-object/from16 p3, p33

    iput-object p3, p0, La/bs5;->E:Ljava/util/List;

    :goto_1e
    const/high16 p3, -0x80000000

    and-int/2addr p1, p3

    if-nez p1, :cond_1f

    iput-object v1, p0, La/bs5;->F:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 p1, p34

    iput-object p1, p0, La/bs5;->F:Ljava/lang/String;

    :goto_1f
    and-int/lit8 p1, p2, 0x1

    if-nez p1, :cond_20

    iput-object v1, p0, La/bs5;->G:Ljava/lang/String;

    return-void

    :cond_20
    move-object/from16 p1, p35

    iput-object p1, p0, La/bs5;->G:Ljava/lang/String;

    return-void
.end method
