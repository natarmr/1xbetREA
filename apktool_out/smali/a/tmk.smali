.class public final La/tmk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lfn0;


# static fields
.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:Ljava/lang/String;

.field public e:F

.field public f:I

.field public g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "FIXED_DIMENSION"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/tmk;->h:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "WRAP_DIMENSION"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/tmk;->i:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "SPREAD_DIMENSION"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/tmk;->j:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/String;

    .line 29
    .line 30
    const-string v1, "PARENT_DIMENSION"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/tmk;->k:Ljava/lang/String;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/String;

    .line 38
    .line 39
    const-string v1, "PERCENT_DIMENSION"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, La/tmk;->l:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v0, Ljava/lang/String;

    .line 47
    .line 48
    const-string v1, "RATIO_DIMENSION"

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, La/tmk;->m:Ljava/lang/String;

    .line 54
    .line 55
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, La/tmk;->b:I

    .line 6
    .line 7
    const v1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    iput v1, p0, La/tmk;->c:I

    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iput v1, p0, La/tmk;->e:F

    .line 15
    .line 16
    iput v0, p0, La/tmk;->f:I

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, p0, La/tmk;->d:Ljava/lang/String;

    .line 20
    .line 21
    iput-boolean v0, p0, La/tmk;->a:Z

    .line 22
    .line 23
    iput-object p1, p0, La/tmk;->g:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public static b(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 0

    .line 1
    if-eq p1, p2, :cond_0

    .line 2
    .line 3
    and-int/lit16 p2, p1, 0xff

    .line 4
    .line 5
    shl-int/lit8 p2, p2, 0x18

    .line 6
    .line 7
    ushr-int/lit8 p1, p1, 0x8

    .line 8
    .line 9
    or-int/2addr p1, p2

    .line 10
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    .line 11
    .line 12
    invoke-direct {p2, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 13
    .line 14
    .line 15
    or-int/lit8 p1, p5, 0x21

    .line 16
    .line 17
    invoke-virtual {p0, p2, p3, p4, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static c(Landroid/text/SpannableStringBuilder;IIIII)V
    .locals 5

    .line 1
    if-eq p1, p2, :cond_7

    .line 2
    .line 3
    or-int/lit8 p2, p5, 0x21

    .line 4
    .line 5
    and-int/lit8 p5, p1, 0x1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p5, :cond_0

    .line 10
    .line 11
    move p5, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p5, v0

    .line 14
    :goto_0
    and-int/lit8 v2, p1, 0x2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move v2, v0

    .line 21
    :goto_1
    if-eqz p5, :cond_3

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    new-instance v3, Landroid/text/style/StyleSpan;

    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v3, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    new-instance v3, Landroid/text/style/StyleSpan;

    .line 36
    .line 37
    invoke-direct {v3, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    if-eqz v2, :cond_4

    .line 45
    .line 46
    new-instance v3, Landroid/text/style/StyleSpan;

    .line 47
    .line 48
    const/4 v4, 0x2

    .line 49
    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v3, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 53
    .line 54
    .line 55
    :cond_4
    :goto_2
    and-int/lit8 p1, p1, 0x4

    .line 56
    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_5
    move v1, v0

    .line 61
    :goto_3
    if-eqz v1, :cond_6

    .line 62
    .line 63
    new-instance p1, Landroid/text/style/UnderlineSpan;

    .line 64
    .line 65
    invoke-direct {p1}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 69
    .line 70
    .line 71
    :cond_6
    if-nez v1, :cond_7

    .line 72
    .line 73
    if-nez p5, :cond_7

    .line 74
    .line 75
    if-nez v2, :cond_7

    .line 76
    .line 77
    new-instance p1, Landroid/text/style/StyleSpan;

    .line 78
    .line 79
    invoke-direct {p1, v0}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1, p3, p4, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 83
    .line 84
    .line 85
    :cond_7
    return-void
.end method

.method public static e(I)La/tmk;
    .locals 2

    .line 1
    new-instance v0, La/tmk;

    .line 2
    .line 3
    sget-object v1, La/tmk;->h:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/tmk;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, v0, La/tmk;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iput p0, v0, La/tmk;->f:I

    .line 12
    .line 13
    return-object v0
.end method

.method public static g(Ljava/lang/String;)La/tmk;
    .locals 3

    .line 1
    new-instance v0, La/tmk;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, v0, La/tmk;->b:I

    .line 8
    .line 9
    const v2, 0x7fffffff

    .line 10
    .line 11
    .line 12
    iput v2, v0, La/tmk;->c:I

    .line 13
    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    iput v2, v0, La/tmk;->e:F

    .line 17
    .line 18
    iput v1, v0, La/tmk;->f:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, v0, La/tmk;->d:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p0, v0, La/tmk;->g:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    iput-boolean p0, v0, La/tmk;->a:Z

    .line 27
    .line 28
    return-object v0
.end method

.method public static h()La/tmk;
    .locals 2

    .line 1
    new-instance v0, La/tmk;

    .line 2
    .line 3
    sget-object v1, La/tmk;->i:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/tmk;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public a(La/k4e;I)V
    .locals 12

    .line 1
    iget-object v0, p0, La/tmk;->d:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, v0}, La/k4e;->L(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, La/tmk;->a:Z

    .line 9
    .line 10
    sget-object v1, La/j4e;->a:La/j4e;

    .line 11
    .line 12
    sget-object v2, La/j4e;->d:La/j4e;

    .line 13
    .line 14
    sget-object v3, La/tmk;->k:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v4, La/j4e;->b:La/j4e;

    .line 17
    .line 18
    const v5, 0x7fffffff

    .line 19
    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    sget-object v7, La/tmk;->l:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v8, 0x1

    .line 25
    const/4 v9, 0x0

    .line 26
    sget-object v10, La/j4e;->c:La/j4e;

    .line 27
    .line 28
    sget-object v11, La/tmk;->i:Ljava/lang/String;

    .line 29
    .line 30
    if-nez p2, :cond_9

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {p1, v10}, La/k4e;->P(La/j4e;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, La/tmk;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/String;

    .line 40
    .line 41
    if-ne p2, v11, :cond_1

    .line 42
    .line 43
    move v6, v8

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    if-ne p2, v7, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v6, v9

    .line 49
    :goto_0
    iget p2, p0, La/tmk;->b:I

    .line 50
    .line 51
    iget v0, p0, La/tmk;->c:I

    .line 52
    .line 53
    iget p0, p0, La/tmk;->e:F

    .line 54
    .line 55
    invoke-virtual {p1, p0, v6, p2, v0}, La/k4e;->Q(FIII)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    iget p2, p0, La/tmk;->b:I

    .line 60
    .line 61
    if-lez p2, :cond_5

    .line 62
    .line 63
    if-gez p2, :cond_4

    .line 64
    .line 65
    iput v9, p1, La/k4e;->d0:I

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    iput p2, p1, La/k4e;->d0:I

    .line 69
    .line 70
    :cond_5
    :goto_1
    iget p2, p0, La/tmk;->c:I

    .line 71
    .line 72
    if-ge p2, v5, :cond_6

    .line 73
    .line 74
    iget-object v0, p1, La/k4e;->D:[I

    .line 75
    .line 76
    aput p2, v0, v9

    .line 77
    .line 78
    :cond_6
    iget-object p2, p0, La/tmk;->g:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p2, Ljava/lang/String;

    .line 81
    .line 82
    if-ne p2, v11, :cond_7

    .line 83
    .line 84
    invoke-virtual {p1, v4}, La/k4e;->P(La/j4e;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_7
    if-ne p2, v3, :cond_8

    .line 89
    .line 90
    invoke-virtual {p1, v2}, La/k4e;->P(La/j4e;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_8
    if-nez p2, :cond_12

    .line 95
    .line 96
    invoke-virtual {p1, v1}, La/k4e;->P(La/j4e;)V

    .line 97
    .line 98
    .line 99
    iget p0, p0, La/tmk;->f:I

    .line 100
    .line 101
    invoke-virtual {p1, p0}, La/k4e;->T(I)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_9
    if-eqz v0, :cond_c

    .line 106
    .line 107
    invoke-virtual {p1, v10}, La/k4e;->R(La/j4e;)V

    .line 108
    .line 109
    .line 110
    iget-object p2, p0, La/tmk;->g:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p2, Ljava/lang/String;

    .line 113
    .line 114
    if-ne p2, v11, :cond_a

    .line 115
    .line 116
    move v6, v8

    .line 117
    goto :goto_2

    .line 118
    :cond_a
    if-ne p2, v7, :cond_b

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_b
    move v6, v9

    .line 122
    :goto_2
    iget p2, p0, La/tmk;->b:I

    .line 123
    .line 124
    iget v0, p0, La/tmk;->c:I

    .line 125
    .line 126
    iget p0, p0, La/tmk;->e:F

    .line 127
    .line 128
    invoke-virtual {p1, p0, v6, p2, v0}, La/k4e;->S(FIII)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_c
    iget p2, p0, La/tmk;->b:I

    .line 133
    .line 134
    if-lez p2, :cond_e

    .line 135
    .line 136
    if-gez p2, :cond_d

    .line 137
    .line 138
    iput v9, p1, La/k4e;->e0:I

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_d
    iput p2, p1, La/k4e;->e0:I

    .line 142
    .line 143
    :cond_e
    :goto_3
    iget p2, p0, La/tmk;->c:I

    .line 144
    .line 145
    if-ge p2, v5, :cond_f

    .line 146
    .line 147
    iget-object v0, p1, La/k4e;->D:[I

    .line 148
    .line 149
    aput p2, v0, v8

    .line 150
    .line 151
    :cond_f
    iget-object p2, p0, La/tmk;->g:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p2, Ljava/lang/String;

    .line 154
    .line 155
    if-ne p2, v11, :cond_10

    .line 156
    .line 157
    invoke-virtual {p1, v4}, La/k4e;->R(La/j4e;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_10
    if-ne p2, v3, :cond_11

    .line 162
    .line 163
    invoke-virtual {p1, v2}, La/k4e;->R(La/j4e;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_11
    if-nez p2, :cond_12

    .line 168
    .line 169
    invoke-virtual {p1, v1}, La/k4e;->R(La/j4e;)V

    .line 170
    .line 171
    .line 172
    iget p0, p0, La/tmk;->f:I

    .line 173
    .line 174
    invoke-virtual {p1, p0}, La/k4e;->O(I)V

    .line 175
    .line 176
    .line 177
    :cond_12
    return-void
.end method

.method public d([BIILa/kfn0;La/rbe;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    iget-object v3, v0, La/tmk;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/fq80;

    .line 10
    .line 11
    add-int v4, v1, p3

    .line 12
    .line 13
    move-object/from16 v5, p1

    .line 14
    .line 15
    invoke-virtual {v3, v5, v4}, La/fq80;->K([BI)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v1}, La/fq80;->M(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, La/fq80;->a()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x2

    .line 28
    if-lt v1, v6, :cond_0

    .line 29
    .line 30
    move v1, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v5

    .line 33
    :goto_0
    invoke-static {v1}, La/x0x;->A(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, La/fq80;->G()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    const-string v1, ""

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iget v7, v3, La/fq80;->b:I

    .line 46
    .line 47
    invoke-virtual {v3}, La/fq80;->I()Ljava/nio/charset/Charset;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    iget v9, v3, La/fq80;->b:I

    .line 52
    .line 53
    sub-int/2addr v9, v7

    .line 54
    sub-int/2addr v1, v9

    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 59
    .line 60
    :goto_1
    invoke-virtual {v3, v1, v8}, La/fq80;->x(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_3

    .line 69
    .line 70
    new-instance v8, La/ftf;

    .line 71
    .line 72
    sget-object v0, La/b4x;->b:La/v3x;

    .line 73
    .line 74
    sget-object v13, La/rcf0;->e:La/rcf0;

    .line 75
    .line 76
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-direct/range {v8 .. v13}, La/ftf;-><init>(JJLjava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v2, v8}, La/rbe;->accept(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    new-instance v9, Landroid/text/SpannableStringBuilder;

    .line 94
    .line 95
    invoke-direct {v9, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    iget v10, v0, La/tmk;->b:I

    .line 99
    .line 100
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    const/high16 v14, 0xff0000

    .line 105
    .line 106
    const/4 v11, 0x0

    .line 107
    const/4 v12, 0x0

    .line 108
    invoke-static/range {v9 .. v14}, La/tmk;->c(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 109
    .line 110
    .line 111
    iget v10, v0, La/tmk;->c:I

    .line 112
    .line 113
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    const/4 v11, -0x1

    .line 118
    invoke-static/range {v9 .. v14}, La/tmk;->b(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v0, La/tmk;->d:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    const-string v8, "sans-serif"

    .line 128
    .line 129
    if-eq v1, v8, :cond_4

    .line 130
    .line 131
    new-instance v8, Landroid/text/style/TypefaceSpan;

    .line 132
    .line 133
    invoke-direct {v8, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const v1, 0xff0021

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9, v8, v5, v7, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 140
    .line 141
    .line 142
    :cond_4
    iget v1, v0, La/tmk;->e:F

    .line 143
    .line 144
    :goto_3
    invoke-virtual {v3}, La/fq80;->a()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    const/16 v8, 0x8

    .line 149
    .line 150
    if-lt v7, v8, :cond_d

    .line 151
    .line 152
    iget v7, v3, La/fq80;->b:I

    .line 153
    .line 154
    invoke-virtual {v3}, La/fq80;->m()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    invoke-virtual {v3}, La/fq80;->m()I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    const v11, 0x7374796c

    .line 163
    .line 164
    .line 165
    if-ne v10, v11, :cond_a

    .line 166
    .line 167
    invoke-virtual {v3}, La/fq80;->a()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-lt v10, v6, :cond_5

    .line 172
    .line 173
    move v10, v4

    .line 174
    goto :goto_4

    .line 175
    :cond_5
    move v10, v5

    .line 176
    :goto_4
    invoke-static {v10}, La/x0x;->A(Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, La/fq80;->G()I

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    move v10, v5

    .line 184
    :goto_5
    if-ge v10, v15, :cond_9

    .line 185
    .line 186
    invoke-virtual {v3}, La/fq80;->a()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    const/16 v12, 0xc

    .line 191
    .line 192
    if-lt v11, v12, :cond_6

    .line 193
    .line 194
    move v11, v4

    .line 195
    goto :goto_6

    .line 196
    :cond_6
    move v11, v5

    .line 197
    :goto_6
    invoke-static {v11}, La/x0x;->A(Z)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, La/fq80;->G()I

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    invoke-virtual {v3}, La/fq80;->G()I

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    invoke-virtual {v3, v6}, La/fq80;->N(I)V

    .line 209
    .line 210
    .line 211
    move v13, v10

    .line 212
    invoke-virtual {v3}, La/fq80;->z()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    invoke-virtual {v3, v4}, La/fq80;->N(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3}, La/fq80;->m()I

    .line 220
    .line 221
    .line 222
    move-result v16

    .line 223
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    const-string v4, ")."

    .line 228
    .line 229
    const-string v5, "Tx3gParser"

    .line 230
    .line 231
    if-le v11, v14, :cond_7

    .line 232
    .line 233
    const-string v14, "Truncating styl end ("

    .line 234
    .line 235
    const-string v6, ") to cueText.length() ("

    .line 236
    .line 237
    invoke-static {v11, v14, v6}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    invoke-static {v5, v6}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    :cond_7
    if-lt v12, v11, :cond_8

    .line 263
    .line 264
    const-string v6, "Ignoring styl with start ("

    .line 265
    .line 266
    const-string v10, ") >= end ("

    .line 267
    .line 268
    invoke-static {v6, v12, v10, v4, v11}, La/ohs0;->m(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-static {v5, v4}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    move v5, v13

    .line 276
    goto :goto_7

    .line 277
    :cond_8
    move v5, v13

    .line 278
    move v13, v11

    .line 279
    iget v11, v0, La/tmk;->b:I

    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    invoke-static/range {v9 .. v14}, La/tmk;->c(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 283
    .line 284
    .line 285
    iget v11, v0, La/tmk;->c:I

    .line 286
    .line 287
    move/from16 v10, v16

    .line 288
    .line 289
    invoke-static/range {v9 .. v14}, La/tmk;->b(Landroid/text/SpannableStringBuilder;IIIII)V

    .line 290
    .line 291
    .line 292
    :goto_7
    add-int/lit8 v10, v5, 0x1

    .line 293
    .line 294
    const/4 v4, 0x1

    .line 295
    const/4 v5, 0x0

    .line 296
    const/4 v6, 0x2

    .line 297
    goto :goto_5

    .line 298
    :cond_9
    move v4, v6

    .line 299
    goto :goto_9

    .line 300
    :cond_a
    const v4, 0x74626f78

    .line 301
    .line 302
    .line 303
    if-ne v10, v4, :cond_c

    .line 304
    .line 305
    iget-boolean v4, v0, La/tmk;->a:Z

    .line 306
    .line 307
    if-eqz v4, :cond_c

    .line 308
    .line 309
    invoke-virtual {v3}, La/fq80;->a()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    const/4 v4, 0x2

    .line 314
    if-lt v1, v4, :cond_b

    .line 315
    .line 316
    const/4 v1, 0x1

    .line 317
    goto :goto_8

    .line 318
    :cond_b
    const/4 v1, 0x0

    .line 319
    :goto_8
    invoke-static {v1}, La/x0x;->A(Z)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, La/fq80;->G()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    int-to-float v1, v1

    .line 327
    iget v5, v0, La/tmk;->f:I

    .line 328
    .line 329
    int-to-float v5, v5

    .line 330
    div-float/2addr v1, v5

    .line 331
    const/4 v5, 0x0

    .line 332
    const v6, 0x3f733333    # 0.95f

    .line 333
    .line 334
    .line 335
    invoke-static {v1, v5, v6}, La/vtt0;->h(FFF)F

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    goto :goto_9

    .line 340
    :cond_c
    const/4 v4, 0x2

    .line 341
    :goto_9
    add-int/2addr v7, v8

    .line 342
    invoke-virtual {v3, v7}, La/fq80;->M(I)V

    .line 343
    .line 344
    .line 345
    move v6, v4

    .line 346
    const/4 v4, 0x1

    .line 347
    const/4 v5, 0x0

    .line 348
    goto/16 :goto_3

    .line 349
    .line 350
    :cond_d
    new-instance v0, La/ctf;

    .line 351
    .line 352
    const/4 v11, 0x0

    .line 353
    const/4 v13, 0x0

    .line 354
    const/4 v15, 0x0

    .line 355
    const/16 v16, 0x0

    .line 356
    .line 357
    const v17, -0x800001

    .line 358
    .line 359
    .line 360
    const/high16 v18, -0x80000000

    .line 361
    .line 362
    const/16 v23, 0x0

    .line 363
    .line 364
    const/high16 v24, -0x1000000

    .line 365
    .line 366
    const/16 v26, 0x0

    .line 367
    .line 368
    const/16 v27, 0x0

    .line 369
    .line 370
    move-object v12, v11

    .line 371
    move/from16 v19, v18

    .line 372
    .line 373
    move/from16 v20, v17

    .line 374
    .line 375
    move/from16 v21, v17

    .line 376
    .line 377
    move/from16 v22, v17

    .line 378
    .line 379
    move/from16 v25, v18

    .line 380
    .line 381
    move v14, v1

    .line 382
    move-object v10, v9

    .line 383
    move-object v9, v0

    .line 384
    invoke-direct/range {v9 .. v27}, La/ctf;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFI)V

    .line 385
    .line 386
    .line 387
    new-instance v3, La/ftf;

    .line 388
    .line 389
    invoke-static {v9}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    invoke-direct/range {v3 .. v8}, La/ftf;-><init>(JJLjava/util/List;)V

    .line 404
    .line 405
    .line 406
    invoke-interface {v2, v3}, La/rbe;->accept(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    return-void
.end method
