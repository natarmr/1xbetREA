.class public final synthetic La/al2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:F

.field public final synthetic e:La/d9z;

.field public final synthetic f:La/pz40;

.field public final synthetic g:Z

.field public final synthetic h:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLa/mm40;ZFLa/d9z;La/pz40;ZLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/al2;->a:Z

    iput-object p2, p0, La/al2;->b:La/mm40;

    iput-boolean p3, p0, La/al2;->c:Z

    iput p4, p0, La/al2;->d:F

    iput-object p5, p0, La/al2;->e:La/d9z;

    iput-object p6, p0, La/al2;->f:La/pz40;

    iput-boolean p7, p0, La/al2;->g:Z

    iput-object p8, p0, La/al2;->h:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/ir8;

    .line 3
    .line 4
    move-object/from16 v11, p2

    .line 5
    .line 6
    check-cast v11, La/fet;

    .line 7
    .line 8
    move-object/from16 v1, p3

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v0, v1, 0x11

    .line 20
    .line 21
    const/16 v2, 0x10

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    if-eq v0, v2, :cond_0

    .line 25
    .line 26
    move v0, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    and-int/2addr v1, v3

    .line 30
    invoke-virtual {v11, v1, v0}, La/fet;->U(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    iget-boolean v0, p0, La/al2;->a:Z

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    move v8, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v8, v3

    .line 44
    :goto_1
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 45
    .line 46
    iget-object v1, p0, La/al2;->b:La/mm40;

    .line 47
    .line 48
    invoke-interface {v1, v0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-boolean v0, p0, La/al2;->c:Z

    .line 53
    .line 54
    xor-int/2addr v0, v3

    .line 55
    new-instance v1, La/ngv;

    .line 56
    .line 57
    invoke-direct {v1, v8}, La/ngv;-><init>(I)V

    .line 58
    .line 59
    .line 60
    sget-object v4, La/qmk;->a:La/zcl;

    .line 61
    .line 62
    new-instance v10, La/qw3;

    .line 63
    .line 64
    new-instance v4, La/jf4;

    .line 65
    .line 66
    const/16 v5, 0xe

    .line 67
    .line 68
    invoke-direct {v4, v5}, La/jf4;-><init>(B)V

    .line 69
    .line 70
    .line 71
    const/high16 v5, 0x41000000    # 8.0f

    .line 72
    .line 73
    invoke-direct {v10, v5, v3, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v11}, La/xfn;->a(La/fet;)La/wfn;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iget v3, v3, La/wfn;->d:F

    .line 81
    .line 82
    invoke-static {v11}, La/xfn;->a(La/fet;)La/wfn;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    iget v4, v4, La/wfn;->d:F

    .line 87
    .line 88
    iget v5, p0, La/al2;->d:F

    .line 89
    .line 90
    const/high16 v6, 0x41c00000    # 24.0f

    .line 91
    .line 92
    invoke-static {v3, v5, v4, v6, v11}, La/h97;->f(FFFFLa/fet;)La/ch80;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-object v5, p0, La/al2;->f:La/pz40;

    .line 97
    .line 98
    invoke-virtual {v11, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v11, v8}, La/fet;->e(I)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    or-int/2addr v4, v6

    .line 107
    iget-boolean v7, p0, La/al2;->g:Z

    .line 108
    .line 109
    invoke-virtual {v11, v7}, La/fet;->h(Z)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    or-int/2addr v4, v6

    .line 114
    iget-object v6, p0, La/al2;->h:Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    or-int/2addr v4, v9

    .line 121
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    if-nez v4, :cond_2

    .line 126
    .line 127
    sget-object v4, La/ukd;->a:La/cl5;

    .line 128
    .line 129
    if-ne v9, v4, :cond_3

    .line 130
    .line 131
    :cond_2
    new-instance v4, La/gc0;

    .line 132
    .line 133
    const/4 v9, 0x1

    .line 134
    invoke-direct/range {v4 .. v9}, La/gc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZIB)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move-object v9, v4

    .line 141
    :cond_3
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 142
    .line 143
    const/4 v12, 0x0

    .line 144
    const/16 v13, 0x2b0

    .line 145
    .line 146
    iget-object p0, p0, La/al2;->e:La/d9z;

    .line 147
    .line 148
    const/4 v5, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    move-object v6, v10

    .line 151
    move-object v10, v9

    .line 152
    const/4 v9, 0x0

    .line 153
    move v8, v0

    .line 154
    move-object v4, v3

    .line 155
    move-object v3, p0

    .line 156
    invoke-static/range {v1 .. v13}, La/g8x;->i(La/ngv;La/mm40;La/d9z;La/hh80;La/sw3;La/ow3;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    invoke-virtual {v11}, La/fet;->X()V

    .line 161
    .line 162
    .line 163
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p0
.end method
