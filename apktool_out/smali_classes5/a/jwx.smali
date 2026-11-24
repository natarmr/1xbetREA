.class public final La/jwx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/jwx;->a:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v3, v1

    .line 20
    check-cast v3, La/pj30;

    .line 21
    .line 22
    invoke-static {v3}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "ICON_BUILDER"

    .line 27
    .line 28
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v1, v2

    .line 36
    :goto_0
    check-cast v1, La/pj30;

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v3, v0

    .line 53
    check-cast v3, La/pj30;

    .line 54
    .line 55
    invoke-static {v3}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, "COLUMN_BUILDER"

    .line 60
    .line 61
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move-object v0, v2

    .line 69
    :goto_1
    check-cast v0, La/pj30;

    .line 70
    .line 71
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    const/high16 p3, 0x41800000    # 16.0f

    .line 76
    .line 77
    const/4 p4, 0x0

    .line 78
    if-eqz v1, :cond_7

    .line 79
    .line 80
    sget-object v3, La/qmk;->a:La/zcl;

    .line 81
    .line 82
    invoke-interface {p1, p3}, La/w6k;->T(F)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-interface {p1, p3}, La/w6k;->T(F)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    const/4 v5, 0x1

    .line 91
    if-ltz v3, :cond_4

    .line 92
    .line 93
    move v6, v5

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move v6, p4

    .line 96
    :goto_2
    if-ltz v4, :cond_5

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    move v5, p4

    .line 100
    :goto_3
    and-int/2addr v5, v6

    .line 101
    if-nez v5, :cond_6

    .line 102
    .line 103
    const-string v5, "width and height must be >= 0"

    .line 104
    .line 105
    invoke-static {v5}, La/zcx;->a(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_6
    invoke-static {v3, v3, v4, v4}, La/r4e;->h(IIII)J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    invoke-interface {v1, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    goto :goto_4

    .line 117
    :cond_7
    move-object v1, v2

    .line 118
    :goto_4
    iget-boolean p0, p0, La/jwx;->a:Z

    .line 119
    .line 120
    if-eqz p0, :cond_8

    .line 121
    .line 122
    move p3, p4

    .line 123
    goto :goto_5

    .line 124
    :cond_8
    sget-object p0, La/qmk;->a:La/zcl;

    .line 125
    .line 126
    invoke-interface {p1, p3}, La/w6k;->T(F)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    const/high16 p3, 0x41000000    # 8.0f

    .line 131
    .line 132
    invoke-interface {p1, p3}, La/w6k;->T(F)I

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    add-int/2addr p3, p0

    .line 137
    :goto_5
    sub-int p0, p2, p3

    .line 138
    .line 139
    if-gez p0, :cond_9

    .line 140
    .line 141
    move p0, p4

    .line 142
    :cond_9
    if-eqz v0, :cond_b

    .line 143
    .line 144
    if-ltz p0, :cond_a

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_a
    const-string v2, "width must be >= 0"

    .line 148
    .line 149
    invoke-static {v2}, La/zcx;->a(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :goto_6
    const v2, 0x7fffffff

    .line 153
    .line 154
    .line 155
    invoke-static {p0, p0, p4, v2}, La/r4e;->h(IIII)J

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    invoke-interface {v0, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    :cond_b
    if-eqz v1, :cond_c

    .line 164
    .line 165
    iget p0, v1, La/pu90;->b:I

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_c
    move p0, p4

    .line 169
    :goto_7
    if-eqz v2, :cond_d

    .line 170
    .line 171
    iget p4, v2, La/pu90;->b:I

    .line 172
    .line 173
    :cond_d
    invoke-static {p0, p4}, Ljava/lang/Math;->max(II)I

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    new-instance p4, La/d4i;

    .line 178
    .line 179
    invoke-direct {p4, v1, p0, v2, p3}, La/d4i;-><init>(La/pu90;ILa/pu90;I)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1, p2, p0, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0
.end method
