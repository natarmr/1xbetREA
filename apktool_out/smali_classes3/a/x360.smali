.class public final synthetic La/x360;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/xcz;

.field public final synthetic b:La/z77;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/qgv0;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(La/xcz;La/z77;Lkotlin/jvm/functions/Function1;La/qgv0;Lkotlin/jvm/functions/Function1;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x360;->a:La/xcz;

    iput-object p2, p0, La/x360;->b:La/z77;

    iput-object p3, p0, La/x360;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/x360;->d:La/qgv0;

    iput-object p5, p0, La/x360;->e:Lkotlin/jvm/functions/Function1;

    iput-boolean p6, p0, La/x360;->f:Z

    iput-boolean p7, p0, La/x360;->g:Z

    iput-boolean p8, p0, La/x360;->h:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    check-cast v9, La/fet;

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
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    move v2, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    and-int/2addr v1, v4

    .line 25
    invoke-virtual {v9, v1, v2}, La/fet;->U(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    sget-object v1, La/jm40;->b:La/jm40;

    .line 32
    .line 33
    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v2, La/qmk;->a:La/zcl;

    .line 40
    .line 41
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget v2, v2, La/wfn;->d:F

    .line 46
    .line 47
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    iget v3, v3, La/wfn;->d:F

    .line 52
    .line 53
    new-instance v5, La/lh80;

    .line 54
    .line 55
    const/high16 v6, 0x40800000    # 4.0f

    .line 56
    .line 57
    const/high16 v7, 0x42000000    # 32.0f

    .line 58
    .line 59
    invoke-direct {v5, v2, v6, v3, v7}, La/lh80;-><init>(FFFF)V

    .line 60
    .line 61
    .line 62
    new-instance v3, La/qw3;

    .line 63
    .line 64
    new-instance v2, La/jf4;

    .line 65
    .line 66
    const/16 v6, 0xe

    .line 67
    .line 68
    invoke-direct {v2, v6}, La/jf4;-><init>(B)V

    .line 69
    .line 70
    .line 71
    const/high16 v6, 0x40000000    # 2.0f

    .line 72
    .line 73
    invoke-direct {v3, v6, v4, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 74
    .line 75
    .line 76
    iget-object v11, v0, La/x360;->b:La/z77;

    .line 77
    .line 78
    invoke-virtual {v9, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget-object v14, v0, La/x360;->c:Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    invoke-virtual {v9, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    or-int/2addr v2, v4

    .line 89
    iget-object v15, v0, La/x360;->d:La/qgv0;

    .line 90
    .line 91
    invoke-virtual {v9, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    or-int/2addr v2, v4

    .line 96
    iget-object v4, v0, La/x360;->e:Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    or-int/2addr v2, v6

    .line 103
    iget-boolean v6, v0, La/x360;->f:Z

    .line 104
    .line 105
    invoke-virtual {v9, v6}, La/fet;->h(Z)Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    or-int/2addr v2, v7

    .line 110
    iget-boolean v12, v0, La/x360;->g:Z

    .line 111
    .line 112
    invoke-virtual {v9, v12}, La/fet;->h(Z)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    or-int/2addr v2, v7

    .line 117
    iget-boolean v13, v0, La/x360;->h:Z

    .line 118
    .line 119
    invoke-virtual {v9, v13}, La/fet;->h(Z)Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    or-int/2addr v2, v7

    .line 124
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    if-nez v2, :cond_1

    .line 129
    .line 130
    sget-object v2, La/ukd;->a:La/cl5;

    .line 131
    .line 132
    if-ne v7, v2, :cond_2

    .line 133
    .line 134
    :cond_1
    new-instance v10, La/y360;

    .line 135
    .line 136
    move-object/from16 v16, v4

    .line 137
    .line 138
    move/from16 v17, v6

    .line 139
    .line 140
    invoke-direct/range {v10 .. v17}, La/y360;-><init>(La/z77;ZZLkotlin/jvm/functions/Function1;La/qgv0;Lkotlin/jvm/functions/Function1;Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v7, v10

    .line 147
    :cond_2
    move-object v8, v7

    .line 148
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 149
    .line 150
    const/4 v10, 0x6

    .line 151
    const/16 v11, 0x1e8

    .line 152
    .line 153
    iget-object v0, v0, La/x360;->a:La/xcz;

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    move-object v2, v5

    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v6, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    move-object/from16 v18, v1

    .line 161
    .line 162
    move-object v1, v0

    .line 163
    move-object/from16 v0, v18

    .line 164
    .line 165
    invoke-static/range {v0 .. v11}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 170
    .line 171
    .line 172
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0
.end method
