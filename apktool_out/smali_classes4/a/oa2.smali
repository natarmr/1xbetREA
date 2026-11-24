.class public final synthetic La/oa2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/e2d;La/qdz;La/a4x;ZZZZLkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p11, p0, La/oa2;->a:B

    iput-object p1, p0, La/oa2;->b:Ljava/lang/Object;

    iput-object p2, p0, La/oa2;->c:Ljava/lang/Object;

    iput-object p3, p0, La/oa2;->d:Ljava/lang/Object;

    iput-object p4, p0, La/oa2;->e:Ljava/lang/Object;

    iput-boolean p5, p0, La/oa2;->f:Z

    iput-boolean p6, p0, La/oa2;->g:Z

    iput-boolean p7, p0, La/oa2;->h:Z

    iput-boolean p8, p0, La/oa2;->i:Z

    iput-object p9, p0, La/oa2;->j:Ljava/lang/Object;

    iput p10, p0, La/oa2;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/xex;Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;La/i3m;La/d9z;La/l7m0;ZZZZI)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/oa2;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/oa2;->b:Ljava/lang/Object;

    iput-object p2, p0, La/oa2;->c:Ljava/lang/Object;

    iput-object p3, p0, La/oa2;->d:Ljava/lang/Object;

    iput-object p4, p0, La/oa2;->e:Ljava/lang/Object;

    iput-object p5, p0, La/oa2;->j:Ljava/lang/Object;

    iput-boolean p6, p0, La/oa2;->f:Z

    iput-boolean p7, p0, La/oa2;->g:Z

    iput-boolean p8, p0, La/oa2;->h:Z

    iput-boolean p9, p0, La/oa2;->i:Z

    iput p10, p0, La/oa2;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oa2;->a:B

    .line 4
    .line 5
    iget v2, v0, La/oa2;->k:I

    .line 6
    .line 7
    iget-object v3, v0, La/oa2;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/oa2;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/oa2;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/oa2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, La/oa2;->b:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v8, v7

    .line 21
    check-cast v8, La/xex;

    .line 22
    .line 23
    move-object v9, v6

    .line 24
    check-cast v9, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;

    .line 25
    .line 26
    move-object v10, v5

    .line 27
    check-cast v10, La/i3m;

    .line 28
    .line 29
    move-object v11, v4

    .line 30
    check-cast v11, La/d9z;

    .line 31
    .line 32
    move-object v12, v3

    .line 33
    check-cast v12, La/l7m0;

    .line 34
    .line 35
    move-object/from16 v17, p1

    .line 36
    .line 37
    check-cast v17, La/fet;

    .line 38
    .line 39
    move-object/from16 v1, p2

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    or-int/lit8 v1, v2, 0x1

    .line 47
    .line 48
    invoke-static {v1}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v18

    .line 52
    iget-boolean v13, v0, La/oa2;->f:Z

    .line 53
    .line 54
    iget-boolean v14, v0, La/oa2;->g:Z

    .line 55
    .line 56
    iget-boolean v15, v0, La/oa2;->h:Z

    .line 57
    .line 58
    iget-boolean v0, v0, La/oa2;->i:Z

    .line 59
    .line 60
    move/from16 v16, v0

    .line 61
    .line 62
    invoke-virtual/range {v8 .. v18}, La/xex;->l(Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;La/i3m;La/d9z;La/l7m0;ZZZZLa/fet;I)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    move-object v1, v7

    .line 69
    check-cast v1, La/mm40;

    .line 70
    .line 71
    check-cast v6, La/e2d;

    .line 72
    .line 73
    check-cast v5, La/qdz;

    .line 74
    .line 75
    check-cast v4, La/a4x;

    .line 76
    .line 77
    move-object v9, v3

    .line 78
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    move-object/from16 v10, p1

    .line 81
    .line 82
    check-cast v10, La/fet;

    .line 83
    .line 84
    move-object/from16 v3, p2

    .line 85
    .line 86
    check-cast v3, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    or-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    invoke-static {v2}, La/x8x;->L(I)I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    move-object v3, v5

    .line 98
    iget-boolean v5, v0, La/oa2;->f:Z

    .line 99
    .line 100
    move-object v2, v6

    .line 101
    iget-boolean v6, v0, La/oa2;->g:Z

    .line 102
    .line 103
    iget-boolean v7, v0, La/oa2;->h:Z

    .line 104
    .line 105
    iget-boolean v8, v0, La/oa2;->i:Z

    .line 106
    .line 107
    invoke-static/range {v1 .. v11}, La/mrv;->J(La/mm40;La/e2d;La/qdz;La/a4x;ZZZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_1
    move-object v1, v7

    .line 114
    check-cast v1, La/mm40;

    .line 115
    .line 116
    check-cast v6, La/e2d;

    .line 117
    .line 118
    check-cast v5, La/qdz;

    .line 119
    .line 120
    check-cast v4, La/a4x;

    .line 121
    .line 122
    move-object v9, v3

    .line 123
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 124
    .line 125
    move-object/from16 v10, p1

    .line 126
    .line 127
    check-cast v10, La/fet;

    .line 128
    .line 129
    move-object/from16 v3, p2

    .line 130
    .line 131
    check-cast v3, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    or-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    invoke-static {v2}, La/x8x;->L(I)I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    move-object v3, v5

    .line 143
    iget-boolean v5, v0, La/oa2;->f:Z

    .line 144
    .line 145
    move-object v2, v6

    .line 146
    iget-boolean v6, v0, La/oa2;->g:Z

    .line 147
    .line 148
    iget-boolean v7, v0, La/oa2;->h:Z

    .line 149
    .line 150
    iget-boolean v8, v0, La/oa2;->i:Z

    .line 151
    .line 152
    invoke-static/range {v1 .. v11}, La/bsr0;->v(La/mm40;La/e2d;La/qdz;La/a4x;ZZZZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 153
    .line 154
    .line 155
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
