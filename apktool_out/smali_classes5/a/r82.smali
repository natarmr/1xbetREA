.class public final synthetic La/r82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/f3d;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/y82;

.field public final synthetic d:La/l7m0;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:La/l7m0;

.field public final synthetic g:La/l7m0;

.field public final synthetic h:La/l7m0;

.field public final synthetic i:La/l7m0;

.field public final synthetic j:La/l7m0;

.field public final synthetic k:F


# direct methods
.method public synthetic constructor <init>(La/f3d;La/l7m0;La/y82;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;La/l7m0;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/r82;->a:La/f3d;

    iput-object p2, p0, La/r82;->b:La/l7m0;

    iput-object p3, p0, La/r82;->c:La/y82;

    iput-object p4, p0, La/r82;->d:La/l7m0;

    iput-object p5, p0, La/r82;->e:La/l7m0;

    iput-object p6, p0, La/r82;->f:La/l7m0;

    iput-object p7, p0, La/r82;->g:La/l7m0;

    iput-object p8, p0, La/r82;->h:La/l7m0;

    iput-object p9, p0, La/r82;->i:La/l7m0;

    iput-object p10, p0, La/r82;->j:La/l7m0;

    iput p11, p0, La/r82;->k:F

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/mm40;

    .line 6
    .line 7
    move-object/from16 v11, p2

    .line 8
    .line 9
    check-cast v11, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v3, La/y82;->V1:La/qek0;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    and-int/lit8 v3, v2, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v3, 0x2

    .line 37
    :goto_0
    or-int/2addr v2, v3

    .line 38
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 39
    .line 40
    const/16 v4, 0x12

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    if-eq v3, v4, :cond_2

    .line 44
    .line 45
    move v3, v5

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 v3, 0x0

    .line 48
    :goto_1
    and-int/2addr v2, v5

    .line 49
    invoke-virtual {v11, v2, v3}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/high16 v2, 0x3f800000    # 1.0f

    .line 56
    .line 57
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    sget-object v1, La/qmk;->a:La/zcl;

    .line 62
    .line 63
    new-instance v3, La/x2g;

    .line 64
    .line 65
    const/16 v8, 0x8

    .line 66
    .line 67
    iget-object v4, v0, La/r82;->b:La/l7m0;

    .line 68
    .line 69
    iget-object v15, v0, La/r82;->a:La/f3d;

    .line 70
    .line 71
    iget-object v6, v0, La/r82;->c:La/y82;

    .line 72
    .line 73
    iget-object v7, v0, La/r82;->d:La/l7m0;

    .line 74
    .line 75
    move-object v5, v15

    .line 76
    invoke-direct/range {v3 .. v8}, La/x2g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    move-object/from16 v16, v6

    .line 80
    .line 81
    const v1, -0x71707074

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v3, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    new-instance v1, La/o82;

    .line 89
    .line 90
    iget-object v3, v0, La/r82;->e:La/l7m0;

    .line 91
    .line 92
    invoke-direct {v1, v3, v15}, La/o82;-><init>(La/l7m0;La/f3d;)V

    .line 93
    .line 94
    .line 95
    const v3, -0x27ff9b95

    .line 96
    .line 97
    .line 98
    invoke-static {v3, v1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    new-instance v12, La/s49;

    .line 103
    .line 104
    const/16 v19, 0x3

    .line 105
    .line 106
    iget-object v13, v0, La/r82;->f:La/l7m0;

    .line 107
    .line 108
    iget-object v14, v0, La/r82;->g:La/l7m0;

    .line 109
    .line 110
    move-object v3, v15

    .line 111
    iget-object v15, v0, La/r82;->h:La/l7m0;

    .line 112
    .line 113
    iget-object v1, v0, La/r82;->i:La/l7m0;

    .line 114
    .line 115
    move-object/from16 v18, v1

    .line 116
    .line 117
    move-object/from16 v17, v16

    .line 118
    .line 119
    move-object/from16 v16, v3

    .line 120
    .line 121
    invoke-direct/range {v12 .. v19}, La/s49;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    move-object/from16 v15, v16

    .line 125
    .line 126
    move-object/from16 v16, v17

    .line 127
    .line 128
    const v1, 0x2171394a

    .line 129
    .line 130
    .line 131
    invoke-static {v1, v12, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    new-instance v12, La/tp7;

    .line 136
    .line 137
    const/16 v17, 0x1

    .line 138
    .line 139
    iget-object v13, v0, La/r82;->j:La/l7m0;

    .line 140
    .line 141
    iget v14, v0, La/r82;->k:F

    .line 142
    .line 143
    invoke-direct/range {v12 .. v17}, La/tp7;-><init>(Ljava/lang/Object;FLjava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    const v0, -0x5df9b773

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v12, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    const/high16 v12, 0x6d80000

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    const/4 v5, 0x0

    .line 157
    const/high16 v6, 0x41c00000    # 24.0f

    .line 158
    .line 159
    move-object v3, v15

    .line 160
    invoke-static/range {v2 .. v12}, La/wzb;->a(La/mm40;La/f3d;La/j73;La/qkq;FLa/ugd;La/xdr;La/xdr;La/xdr;La/fet;I)V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 165
    .line 166
    .line 167
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0
.end method
