.class public final synthetic La/znl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/hh80;

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:I

.field public final synthetic e:La/ow3;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:La/k6z;


# direct methods
.method public synthetic constructor <init>(ILa/hh80;Ljava/util/ArrayList;ILa/ow3;IIJLa/k6z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/znl;->a:I

    iput-object p2, p0, La/znl;->b:La/hh80;

    iput-object p3, p0, La/znl;->c:Ljava/util/ArrayList;

    iput p4, p0, La/znl;->d:I

    iput-object p5, p0, La/znl;->e:La/ow3;

    iput p6, p0, La/znl;->f:I

    iput p7, p0, La/znl;->g:I

    iput-wide p8, p0, La/znl;->h:J

    iput-object p10, p0, La/znl;->i:La/k6z;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/ou90;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, La/znl;->a:I

    .line 7
    .line 8
    new-array v1, v0, [I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    iget-object v4, p0, La/znl;->b:La/hh80;

    .line 13
    .line 14
    if-ge v3, v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v4}, La/hh80;->d()F

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-interface {p1, v4}, La/w6k;->T(F)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    aput v4, v1, v3

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v3, p0, La/znl;->c:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_7

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    add-int/lit8 v6, v2, 0x1

    .line 46
    .line 47
    if-ltz v2, :cond_6

    .line 48
    .line 49
    check-cast v5, La/pu90;

    .line 50
    .line 51
    rem-int v7, v2, v0

    .line 52
    .line 53
    if-lt v2, v0, :cond_1

    .line 54
    .line 55
    aget v2, v1, v7

    .line 56
    .line 57
    iget v8, p0, La/znl;->d:I

    .line 58
    .line 59
    add-int/2addr v2, v8

    .line 60
    aput v2, v1, v7

    .line 61
    .line 62
    :cond_1
    sget-object v2, La/uc9;->e:La/nw3;

    .line 63
    .line 64
    iget-object v8, p0, La/znl;->e:La/ow3;

    .line 65
    .line 66
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iget v9, p0, La/znl;->f:I

    .line 71
    .line 72
    iget v10, p0, La/znl;->g:I

    .line 73
    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    add-int/2addr v10, v9

    .line 77
    mul-int/2addr v10, v7

    .line 78
    iget v2, v5, La/pu90;->a:I

    .line 79
    .line 80
    const/4 v8, 0x2

    .line 81
    invoke-static {v9, v2, v8, v10}, La/hne;->d(IIII)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    sget-object v2, La/uc9;->b:La/lw3;

    .line 87
    .line 88
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    add-int/2addr v10, v9

    .line 95
    mul-int/2addr v10, v7

    .line 96
    iget v2, v5, La/pu90;->a:I

    .line 97
    .line 98
    sub-int/2addr v9, v2

    .line 99
    add-int v2, v9, v10

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    sget-object v2, La/uc9;->g:La/nw3;

    .line 103
    .line 104
    invoke-virtual {v8, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    const/4 v2, 0x1

    .line 111
    if-le v0, v2, :cond_4

    .line 112
    .line 113
    iget-wide v10, p0, La/znl;->h:J

    .line 114
    .line 115
    invoke-static {v10, v11}, La/p4e;->i(J)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    mul-int v8, v9, v0

    .line 120
    .line 121
    sub-int/2addr v2, v8

    .line 122
    add-int/lit8 v8, v0, -0x1

    .line 123
    .line 124
    div-int/2addr v2, v8

    .line 125
    add-int/2addr v2, v9

    .line 126
    mul-int/2addr v2, v7

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    mul-int v2, v7, v9

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    add-int/2addr v9, v10

    .line 132
    mul-int v2, v9, v7

    .line 133
    .line 134
    :goto_2
    iget-object v8, p0, La/znl;->i:La/k6z;

    .line 135
    .line 136
    invoke-interface {v4, v8}, La/hh80;->b(La/k6z;)F

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    invoke-interface {p1, v8}, La/w6k;->T(F)I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    add-int/2addr v8, v2

    .line 145
    aget v2, v1, v7

    .line 146
    .line 147
    const/4 v9, 0x0

    .line 148
    invoke-virtual {p1, v5, v8, v2, v9}, La/ou90;->g(La/pu90;IIF)V

    .line 149
    .line 150
    .line 151
    aget v2, v1, v7

    .line 152
    .line 153
    iget v5, v5, La/pu90;->b:I

    .line 154
    .line 155
    add-int/2addr v2, v5

    .line 156
    aput v2, v1, v7

    .line 157
    .line 158
    move v2, v6

    .line 159
    goto :goto_1

    .line 160
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 161
    .line 162
    .line 163
    const/4 p0, 0x0

    .line 164
    throw p0

    .line 165
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0
.end method
