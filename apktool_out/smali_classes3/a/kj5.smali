.class public final La/kj5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qna;


# direct methods
.method public static b(Landroid/content/Context;ILjava/lang/String;)I
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f07074a

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0x7f090001

    .line 13
    .line 14
    .line 15
    invoke-static {v1, p0}, La/itf0;->a(ILandroid/content/Context;)Landroid/graphics/Typeface;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v4, Landroid/text/TextPaint;

    .line 25
    .line 26
    invoke-direct {v4}, Landroid/text/TextPaint;-><init>()V

    .line 27
    .line 28
    .line 29
    int-to-float v0, v0

    .line 30
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 34
    .line 35
    .line 36
    new-instance v2, Landroid/text/StaticLayout;

    .line 37
    .line 38
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 39
    .line 40
    const/high16 v8, -0x3f800000    # -4.0f

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    const/4 v7, 0x0

    .line 44
    move v5, p1

    .line 45
    move-object v3, p2

    .line 46
    invoke-direct/range {v2 .. v9}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/text/StaticLayout;->getLineCount()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    sub-int/2addr p0, v1

    .line 54
    invoke-virtual {v2}, Landroid/text/StaticLayout;->getLineCount()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-le p1, v1, :cond_0

    .line 59
    .line 60
    mul-int p1, v5, p0

    .line 61
    .line 62
    int-to-float p1, p1

    .line 63
    invoke-virtual {v2, p0}, Landroid/text/Layout;->getLineWidth(I)F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    add-float/2addr p0, p1

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v2, p0}, Landroid/text/Layout;->getLineWidth(I)F

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    :goto_0
    float-to-int p0, p0

    .line 74
    return p0
.end method

.method public static e(La/mvc;)La/uo5;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const/16 v0, 0x1d

    .line 17
    .line 18
    if-eq p0, v0, :cond_0

    .line 19
    .line 20
    sget-object p0, La/uo5;->c:La/uo5;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, La/uo5;->l:La/uo5;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object p0, La/uo5;->h:La/uo5;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    sget-object p0, La/uo5;->f:La/uo5;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_3
    sget-object p0, La/uo5;->e:La/uo5;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_4
    sget-object p0, La/uo5;->d:La/uo5;

    .line 36
    .line 37
    return-object p0
.end method

.method public static f(I)La/uo5;
    .locals 2

    .line 1
    sget-object v0, La/uo5;->d:La/uo5;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    if-ne p0, v1, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v0, La/uo5;->e:La/uo5;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    if-ne p0, v1, :cond_1

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_1
    sget-object v0, La/uo5;->f:La/uo5;

    .line 16
    .line 17
    const/16 v1, 0xb

    .line 18
    .line 19
    if-ne p0, v1, :cond_2

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_2
    sget-object v0, La/uo5;->g:La/uo5;

    .line 23
    .line 24
    const/16 v1, 0xc

    .line 25
    .line 26
    if-ne p0, v1, :cond_3

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_3
    sget-object v0, La/uo5;->h:La/uo5;

    .line 30
    .line 31
    const/16 v1, 0x14

    .line 32
    .line 33
    if-ne p0, v1, :cond_4

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_4
    sget-object v0, La/uo5;->i:La/uo5;

    .line 37
    .line 38
    const/16 v1, 0x17

    .line 39
    .line 40
    if-ne p0, v1, :cond_5

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_5
    sget-object v0, La/uo5;->j:La/uo5;

    .line 44
    .line 45
    const/16 v1, 0x2b

    .line 46
    .line 47
    if-ne p0, v1, :cond_6

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_6
    sget-object v0, La/uo5;->k:La/uo5;

    .line 51
    .line 52
    const/16 v1, 0x4c

    .line 53
    .line 54
    if-ne p0, v1, :cond_7

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_7
    sget-object v0, La/uo5;->l:La/uo5;

    .line 58
    .line 59
    const/16 v1, 0x56

    .line 60
    .line 61
    if-ne p0, v1, :cond_8

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_8
    sget-object p0, La/uo5;->c:La/uo5;

    .line 65
    .line 66
    return-object p0
.end method

.method public static g(Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Lorg/xplatform/bet_constructor/impl/games/presentation/BetConstructorGamesScreen;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p0, Lorg/xplatform/bet_constructor/impl/games/presentation/BetConstructorGamesScreenOld;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public static h(Ljava/lang/Integer;)La/re9;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq v0, v1, :cond_3

    .line 10
    .line 11
    :goto_0
    if-nez p0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/4 v0, 0x2

    .line 19
    if-ne p0, v0, :cond_2

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_2
    :goto_1
    sget-object p0, La/re9;->c:La/re9;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_3
    :goto_2
    sget-object p0, La/re9;->b:La/re9;

    .line 26
    .line 27
    return-object p0
.end method

.method public static i(DLjava/lang/Double;)La/fzc;
    .locals 2

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lkotlin/jvm/internal/Intrinsics;->a(DLjava/lang/Double;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    cmpl-double v0, p0, v0

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    sget-object p0, La/fzc;->c:La/fzc;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    cmpg-double p0, p0, v0

    .line 26
    .line 27
    if-gez p0, :cond_2

    .line 28
    .line 29
    sget-object p0, La/fzc;->d:La/fzc;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    sget-object p0, La/fzc;->b:La/fzc;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_3
    :goto_0
    sget-object p0, La/fzc;->b:La/fzc;

    .line 36
    .line 37
    return-object p0
.end method

.method public static j(ILjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/16 v3, 0x2f

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    sub-int/2addr p0, v1

    .line 23
    add-int/lit8 p0, p0, -0x1

    .line 24
    .line 25
    const-string p1, "("

    .line 26
    .line 27
    const-string v0, ")"

    .line 28
    .line 29
    invoke-static {p0, p1, v0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static k(La/fzc;Landroid/content/Context;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-ne p0, v1, :cond_0

    .line 19
    .line 20
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 21
    .line 22
    const p0, 0x7f040b55

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p0, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 31
    .line 32
    .line 33
    return v0

    .line 34
    :cond_1
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 35
    .line 36
    const p0, 0x7f040b46

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p0, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_2
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 45
    .line 46
    const p0, 0x7f040b5f

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p0, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public static l(Ljava/lang/String;ILandroid/content/Context;La/wdv0;)Landroid/text/SpannableString;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v3, "/"

    .line 6
    .line 7
    filled-new-array {v3}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v4, 0x6

    .line 12
    const/4 v8, 0x0

    .line 13
    invoke-static {v0, v2, v8, v4}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v10, 0x2

    .line 22
    if-ge v2, v10, :cond_0

    .line 23
    .line 24
    new-instance v1, Landroid/text/SpannableString;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_0
    invoke-static {v9, v10}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v6, 0x0

    .line 35
    const/16 v7, 0x3e

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-static/range {v2 .. v7}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v3, 0x1

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    if-eq v2, v3, :cond_2

    .line 51
    .line 52
    if-ne v2, v10, :cond_1

    .line 53
    .line 54
    const/16 v2, 0x8c

    .line 55
    .line 56
    invoke-static {v2}, La/sj3;->X(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    return-object v0

    .line 66
    :cond_2
    const/16 v2, 0x6b

    .line 67
    .line 68
    invoke-static {v2}, La/sj3;->X(I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move v2, v8

    .line 74
    :goto_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const v5, 0x7f07074d

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    const v5, 0x7f090001

    .line 86
    .line 87
    .line 88
    invoke-static {v5, v1}, La/itf0;->a(ILandroid/content/Context;)Landroid/graphics/Typeface;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-static {v5, v3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    new-instance v13, Landroid/text/TextPaint;

    .line 97
    .line 98
    invoke-direct {v13}, Landroid/text/TextPaint;-><init>()V

    .line 99
    .line 100
    .line 101
    int-to-float v4, v4

    .line 102
    invoke-virtual {v13, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v13, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 106
    .line 107
    .line 108
    new-instance v11, Landroid/text/StaticLayout;

    .line 109
    .line 110
    invoke-static/range {p1 .. p2}, La/v2n0;->u(ILandroid/content/Context;)I

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    sget-object v15, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0x1

    .line 119
    .line 120
    const-string v12, "0000000"

    .line 121
    .line 122
    const/16 v16, 0x0

    .line 123
    .line 124
    invoke-direct/range {v11 .. v18}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v11, v8}, Landroid/text/Layout;->getLineWidth(I)F

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    float-to-int v4, v4

    .line 132
    add-int/2addr v2, v4

    .line 133
    invoke-static/range {p1 .. p2}, La/v2n0;->u(ILandroid/content/Context;)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    sget-object v5, La/wdv0;->c:La/wdv0;

    .line 138
    .line 139
    move-object/from16 v6, p3

    .line 140
    .line 141
    if-ne v6, v5, :cond_4

    .line 142
    .line 143
    sub-int/2addr v4, v2

    .line 144
    div-int/2addr v4, v10

    .line 145
    goto :goto_1

    .line 146
    :cond_4
    sub-int/2addr v4, v2

    .line 147
    :goto_1
    new-instance v2, Landroid/text/SpannableString;

    .line 148
    .line 149
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    mul-int/lit8 v6, v4, 0x2

    .line 154
    .line 155
    invoke-static {v5, v0}, La/kj5;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    const-string v9, " "

    .line 160
    .line 161
    invoke-static {v0, v9, v7}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    invoke-static {v1, v4, v9}, La/kj5;->b(Landroid/content/Context;ILjava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-le v10, v6, :cond_6

    .line 170
    .line 171
    const-string v9, ".."

    .line 172
    .line 173
    invoke-static {v0, v9, v7}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v1, v4, v0}, La/kj5;->b(Landroid/content/Context;ILjava/lang/String;)I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    :goto_2
    if-le v10, v6, :cond_5

    .line 182
    .line 183
    const-string v10, ""

    .line 184
    .line 185
    invoke-static {v0, v9, v10, v8}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v0, v7, v10, v8}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v3, v0}, La/ttm0;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v5, v0}, La/kj5;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v1, v4, v0}, La/kj5;->b(Landroid/content/Context;ILjava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    goto :goto_2

    .line 214
    :cond_5
    move-object v9, v0

    .line 215
    :cond_6
    invoke-direct {v2, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 216
    .line 217
    .line 218
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 219
    .line 220
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 221
    .line 222
    const v3, 0x7f040b0b

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v3, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Landroid/text/SpannableString;->length()I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    add-int/lit8 v1, v1, -0x3

    .line 237
    .line 238
    invoke-virtual {v2}, Landroid/text/SpannableString;->length()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    const/16 v4, 0x21

    .line 243
    .line 244
    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 245
    .line 246
    .line 247
    return-object v2
.end method

.method public static n(Landroid/widget/RemoteViews;JLjava/util/List;Ljava/util/List;Landroid/content/Context;)V
    .locals 16

    .line 1
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    move-object/from16 v2, p3

    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/lang/Integer;

    .line 15
    .line 16
    move-object/from16 v4, p4

    .line 17
    .line 18
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-nez v6, :cond_1

    .line 33
    .line 34
    :cond_0
    move-wide/from16 v14, p1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    move-wide/from16 v14, p1

    .line 42
    .line 43
    invoke-static {v14, v15, v5}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    invoke-virtual/range {p5 .. p5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const v5, 0x7f070786

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    float-to-int v12, v3

    .line 59
    new-instance v3, La/j2x;

    .line 60
    .line 61
    const v5, 0x7f0700a3

    .line 62
    .line 63
    .line 64
    invoke-direct {v3, v5}, La/j2x;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    const v11, 0x7f080dfe

    .line 72
    .line 73
    .line 74
    move-object/from16 v7, p0

    .line 75
    .line 76
    move-object/from16 v8, p5

    .line 77
    .line 78
    invoke-static/range {v7 .. v13}, La/a4n0;->h(Landroid/widget/RemoteViews;Landroid/content/Context;ILjava/lang/String;IILjava/util/List;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    const/16 v5, 0x8

    .line 87
    .line 88
    move-object/from16 v7, p0

    .line 89
    .line 90
    invoke-virtual {v7, v3, v5}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    move-object/from16 v7, p0

    .line 95
    .line 96
    move-wide/from16 v14, p1

    .line 97
    .line 98
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    return-void
.end method


# virtual methods
.method public a(La/zj;La/bpn0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(La/zj;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .locals 9

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/google/firebase/components/ComponentRegistrar;->getComponents()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/pfd;

    .line 25
    .line 26
    iget-object v2, v0, La/pfd;->a:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    new-instance v7, La/uq;

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-direct {v7, v2, v0, v1}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance v1, La/pfd;

    .line 37
    .line 38
    iget-object v3, v0, La/pfd;->b:Ljava/util/Set;

    .line 39
    .line 40
    iget-object v4, v0, La/pfd;->c:Ljava/util/Set;

    .line 41
    .line 42
    iget-byte v5, v0, La/pfd;->d:B

    .line 43
    .line 44
    iget-boolean v6, v0, La/pfd;->e:Z

    .line 45
    .line 46
    iget-object v8, v0, La/pfd;->g:Ljava/util/Set;

    .line 47
    .line 48
    invoke-direct/range {v1 .. v8}, La/pfd;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILa/jgd;Ljava/util/Set;)V

    .line 49
    .line 50
    .line 51
    move-object v0, v1

    .line 52
    :cond_0
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-object p0
.end method
