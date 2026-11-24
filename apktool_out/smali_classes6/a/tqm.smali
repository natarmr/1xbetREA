.class public final La/tqm;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/ehl;


# instance fields
.field public final o:La/ucs0;

.field public final p:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-wide v1, La/y3d;->f:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, La/ucs0;->s(J)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/tqm;->o:La/ucs0;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/tqm;->p:Ljava/util/ArrayList;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final u0(La/g7z;)V
    .locals 12

    .line 1
    iget-object v0, p1, La/g7z;->a:La/a6a;

    .line 2
    .line 3
    iget-object v1, v0, La/a6a;->b:La/nr;

    .line 4
    .line 5
    invoke-virtual {v1}, La/nr;->i()La/x5a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v1, p0, La/tqm;->p:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, La/sqm;

    .line 26
    .line 27
    iget-object v4, p0, La/tqm;->o:La/ucs0;

    .line 28
    .line 29
    invoke-static {v4}, La/saj;->V(La/ucs0;)Landroid/graphics/Paint;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget v5, v3, La/sqm;->c:F

    .line 34
    .line 35
    iget-object v6, v3, La/sqm;->e:La/zcl;

    .line 36
    .line 37
    iget v6, v6, La/zcl;->a:F

    .line 38
    .line 39
    invoke-virtual {p1, v5}, La/g7z;->w0(F)F

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const/4 v7, 0x0

    .line 44
    invoke-static {v7, v5}, Ljava/lang/Math;->max(FF)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/high16 v8, 0x40000000    # 2.0f

    .line 49
    .line 50
    div-float/2addr v5, v8

    .line 51
    iget v8, v3, La/sqm;->a:F

    .line 52
    .line 53
    invoke-virtual {p1, v8}, La/g7z;->w0(F)F

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    iget v9, v3, La/sqm;->b:F

    .line 58
    .line 59
    invoke-virtual {p1, v9}, La/g7z;->w0(F)F

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    iget-wide v10, v3, La/sqm;->d:J

    .line 64
    .line 65
    invoke-static {v10, v11}, La/fbc;->U(J)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-virtual {v4, v5, v8, v9, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v7}, La/g7z;->w0(F)F

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    neg-float v3, v3

    .line 77
    invoke-virtual {p1, v7}, La/g7z;->w0(F)F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    neg-float v4, v4

    .line 82
    invoke-interface {v0}, La/fhl;->d()J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    const/16 v5, 0x20

    .line 87
    .line 88
    shr-long/2addr v8, v5

    .line 89
    long-to-int v5, v8

    .line 90
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-virtual {p1, v7}, La/g7z;->w0(F)F

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    add-float/2addr v5, v8

    .line 99
    invoke-interface {v0}, La/fhl;->d()J

    .line 100
    .line 101
    .line 102
    move-result-wide v8

    .line 103
    const-wide v10, 0xffffffffL

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    and-long/2addr v8, v10

    .line 109
    long-to-int v8, v8

    .line 110
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-virtual {p1, v7}, La/g7z;->w0(F)F

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    add-float/2addr v7, v8

    .line 119
    invoke-interface {v0}, La/fhl;->d()J

    .line 120
    .line 121
    .line 122
    move v8, v6

    .line 123
    move v6, v7

    .line 124
    invoke-virtual {p1, v8}, La/g7z;->w0(F)F

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    invoke-interface {v0}, La/fhl;->d()J

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v8}, La/g7z;->w0(F)F

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    iget-object v9, p0, La/tqm;->o:La/ucs0;

    .line 136
    .line 137
    invoke-interface/range {v2 .. v9}, La/x5a;->d(FFFFFFLa/ucs0;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual {p1}, La/g7z;->a()V

    .line 142
    .line 143
    .line 144
    return-void
.end method
