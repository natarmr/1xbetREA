.class public final synthetic La/gs90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/a8x;

.field public final synthetic b:I

.field public final synthetic c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic d:La/xcz;

.field public final synthetic e:F

.field public final synthetic f:La/l7m0;

.field public final synthetic g:La/vne;

.field public final synthetic h:F

.field public final synthetic i:F

.field public final synthetic j:La/j73;

.field public final synthetic k:La/pz40;

.field public final synthetic l:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/a8x;ILandroidx/compose/runtime/snapshots/SnapshotStateList;La/xcz;FLa/l7m0;La/vne;FFLa/nul0;La/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gs90;->a:La/a8x;

    iput p2, p0, La/gs90;->b:I

    iput-object p3, p0, La/gs90;->c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p4, p0, La/gs90;->d:La/xcz;

    iput p5, p0, La/gs90;->e:F

    iput-object p6, p0, La/gs90;->f:La/l7m0;

    iput-object p7, p0, La/gs90;->g:La/vne;

    iput p8, p0, La/gs90;->h:F

    iput p9, p0, La/gs90;->i:F

    iput-object p10, p0, La/gs90;->j:La/j73;

    iput-object p11, p0, La/gs90;->k:La/pz40;

    iput-object p12, p0, La/gs90;->l:La/pz40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/hcz;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v7, v0, La/gs90;->a:La/a8x;

    .line 11
    .line 12
    iget-object v3, v0, La/gs90;->c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 13
    .line 14
    iget-object v5, v0, La/gs90;->d:La/xcz;

    .line 15
    .line 16
    iget v6, v0, La/gs90;->e:F

    .line 17
    .line 18
    iget-object v8, v0, La/gs90;->f:La/l7m0;

    .line 19
    .line 20
    iget-object v9, v0, La/gs90;->g:La/vne;

    .line 21
    .line 22
    iget v10, v0, La/gs90;->h:F

    .line 23
    .line 24
    iget v11, v0, La/gs90;->i:F

    .line 25
    .line 26
    iget-object v12, v0, La/gs90;->j:La/j73;

    .line 27
    .line 28
    iget-object v14, v0, La/gs90;->k:La/pz40;

    .line 29
    .line 30
    iget-object v15, v0, La/gs90;->l:La/pz40;

    .line 31
    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    iget v0, v0, La/gs90;->b:I

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    move v0, v6

    .line 39
    move-object v6, v5

    .line 40
    iget v5, v7, La/a8x;->c:I

    .line 41
    .line 42
    move-object v4, v3

    .line 43
    iget v3, v7, La/a8x;->a:I

    .line 44
    .line 45
    new-instance v13, La/er90;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    invoke-direct {v13, v2}, La/er90;-><init>(B)V

    .line 49
    .line 50
    .line 51
    new-instance v2, La/is90;

    .line 52
    .line 53
    move-object/from16 p0, v13

    .line 54
    .line 55
    move-object v13, v12

    .line 56
    move v12, v11

    .line 57
    move v11, v10

    .line 58
    move-object v10, v9

    .line 59
    move-object v9, v8

    .line 60
    move-object v8, v7

    .line 61
    move v7, v0

    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-direct/range {v2 .. v15}, La/is90;-><init>(ILandroidx/compose/runtime/snapshots/SnapshotStateList;ILa/xcz;FLa/a8x;La/l7m0;La/vne;FFLa/j73;La/pz40;La/pz40;)V

    .line 64
    .line 65
    .line 66
    new-instance v4, La/ugd;

    .line 67
    .line 68
    const v3, -0x4b1cbc55

    .line 69
    .line 70
    .line 71
    invoke-direct {v4, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object v0, v1

    .line 75
    move v1, v5

    .line 76
    const/4 v5, 0x4

    .line 77
    const/4 v3, 0x0

    .line 78
    move-object/from16 v2, p0

    .line 79
    .line 80
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move-object v4, v3

    .line 85
    move v2, v6

    .line 86
    const/4 v0, 0x1

    .line 87
    move-object v6, v5

    .line 88
    new-instance v3, La/so90;

    .line 89
    .line 90
    const/4 v5, 0x6

    .line 91
    invoke-direct {v3, v5}, La/so90;-><init>(B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    new-instance v13, La/m160;

    .line 99
    .line 100
    const/16 v0, 0x1d

    .line 101
    .line 102
    invoke-direct {v13, v3, v4, v0}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 103
    .line 104
    .line 105
    new-instance v0, La/ts90;

    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    invoke-direct {v0, v4, v3}, La/ts90;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;B)V

    .line 109
    .line 110
    .line 111
    move/from16 v16, v5

    .line 112
    .line 113
    move-object v5, v6

    .line 114
    move v6, v2

    .line 115
    new-instance v2, La/xs90;

    .line 116
    .line 117
    move/from16 v17, v3

    .line 118
    .line 119
    move-object v3, v4

    .line 120
    move-object/from16 p0, v0

    .line 121
    .line 122
    move-object/from16 v18, v13

    .line 123
    .line 124
    move-object v13, v14

    .line 125
    move-object v14, v15

    .line 126
    move/from16 v15, v16

    .line 127
    .line 128
    move/from16 v0, v17

    .line 129
    .line 130
    invoke-direct/range {v2 .. v14}, La/xs90;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/snapshots/SnapshotStateList;La/xcz;FLa/a8x;La/l7m0;La/vne;FFLa/j73;La/pz40;La/pz40;)V

    .line 131
    .line 132
    .line 133
    new-instance v3, La/ugd;

    .line 134
    .line 135
    const v4, 0x799532c4

    .line 136
    .line 137
    .line 138
    invoke-direct {v3, v4, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    move-object/from16 v2, p0

    .line 142
    .line 143
    move-object/from16 v0, v18

    .line 144
    .line 145
    invoke-virtual {v1, v15, v0, v2, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 146
    .line 147
    .line 148
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object v0
.end method
