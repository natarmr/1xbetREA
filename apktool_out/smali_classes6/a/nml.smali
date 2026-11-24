.class public final synthetic La/nml;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/w6k;

.field public final synthetic b:La/cgk0;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:La/pzh;

.field public final synthetic e:La/l7m0;

.field public final synthetic f:La/pzh;

.field public final synthetic g:La/l7m0;

.field public final synthetic h:La/pzh;

.field public final synthetic i:La/l7m0;

.field public final synthetic j:F

.field public final synthetic k:La/y9q0;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;

.field public final synthetic m:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/w6k;La/cgk0;Ljava/util/List;La/pzh;La/l7m0;La/pzh;La/l7m0;La/pzh;La/l7m0;FLa/y9q0;Lkotlin/jvm/functions/Function1;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nml;->a:La/w6k;

    iput-object p2, p0, La/nml;->b:La/cgk0;

    iput-object p3, p0, La/nml;->c:Ljava/util/List;

    iput-object p4, p0, La/nml;->d:La/pzh;

    iput-object p5, p0, La/nml;->e:La/l7m0;

    iput-object p6, p0, La/nml;->f:La/pzh;

    iput-object p7, p0, La/nml;->g:La/l7m0;

    iput-object p8, p0, La/nml;->h:La/pzh;

    iput-object p9, p0, La/nml;->i:La/l7m0;

    iput p10, p0, La/nml;->j:F

    iput-object p11, p0, La/nml;->k:La/y9q0;

    iput-object p12, p0, La/nml;->l:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, La/nml;->m:La/pz40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    check-cast v4, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x2

    .line 20
    if-eq v2, v6, :cond_0

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v3

    .line 25
    :goto_0
    and-int/2addr v1, v5

    .line 26
    invoke-virtual {v4, v1, v2}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    sget-object v1, La/jm40;->b:La/jm40;

    .line 33
    .line 34
    const/high16 v2, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const v2, 0x3fcccccd    # 1.6f

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v1, v3}, La/ny9;->O(FLa/mm40;Z)La/mm40;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v2, La/qmk;->i:La/zcl;

    .line 48
    .line 49
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 50
    .line 51
    invoke-static {v2, v2, v2, v2, v1}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 56
    .line 57
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 62
    .line 63
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    new-instance v3, La/ugg0;

    .line 68
    .line 69
    invoke-direct {v3, v2, v2, v2, v2}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v7, v8, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const/high16 v2, 0x40c00000    # 6.0f

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-static {v1, v2, v3, v6}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v5, La/oml;

    .line 84
    .line 85
    iget-object v6, v0, La/nml;->a:La/w6k;

    .line 86
    .line 87
    iget-object v7, v0, La/nml;->b:La/cgk0;

    .line 88
    .line 89
    iget-object v8, v0, La/nml;->c:Ljava/util/List;

    .line 90
    .line 91
    iget-object v9, v0, La/nml;->d:La/pzh;

    .line 92
    .line 93
    iget-object v10, v0, La/nml;->e:La/l7m0;

    .line 94
    .line 95
    iget-object v11, v0, La/nml;->f:La/pzh;

    .line 96
    .line 97
    iget-object v12, v0, La/nml;->g:La/l7m0;

    .line 98
    .line 99
    iget-object v13, v0, La/nml;->h:La/pzh;

    .line 100
    .line 101
    iget-object v14, v0, La/nml;->i:La/l7m0;

    .line 102
    .line 103
    iget v15, v0, La/nml;->j:F

    .line 104
    .line 105
    iget-object v2, v0, La/nml;->k:La/y9q0;

    .line 106
    .line 107
    iget-object v3, v0, La/nml;->l:Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    iget-object v0, v0, La/nml;->m:La/pz40;

    .line 110
    .line 111
    move-object/from16 v18, v0

    .line 112
    .line 113
    move-object/from16 v16, v2

    .line 114
    .line 115
    move-object/from16 v17, v3

    .line 116
    .line 117
    invoke-direct/range {v5 .. v18}, La/oml;-><init>(La/w6k;La/cgk0;Ljava/util/List;La/pzh;La/l7m0;La/pzh;La/l7m0;La/pzh;La/l7m0;FLa/y9q0;Lkotlin/jvm/functions/Function1;La/pz40;)V

    .line 118
    .line 119
    .line 120
    const v0, 0x68128b4b

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v5, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const/16 v5, 0xc00

    .line 128
    .line 129
    const/4 v6, 0x6

    .line 130
    move-object v0, v1

    .line 131
    const/4 v1, 0x0

    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-static/range {v0 .. v6}, La/nnw0;->g(La/mm40;La/u12;ZLa/ugd;La/fet;II)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {v4}, La/fet;->X()V

    .line 138
    .line 139
    .line 140
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object v0
.end method
