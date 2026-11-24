.class public abstract La/zv20;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/math/BigDecimal;

.field public static final b:Ljava/math/BigDecimal;

.field public static final c:Ljava/math/BigDecimal;

.field public static final d:Ljava/math/BigDecimal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/math/BigDecimal;

    .line 2
    .line 3
    const-string v1, "100"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/zv20;->a:Ljava/math/BigDecimal;

    .line 9
    .line 10
    new-instance v0, Ljava/math/BigDecimal;

    .line 11
    .line 12
    const-string v1, "1000"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/zv20;->b:Ljava/math/BigDecimal;

    .line 18
    .line 19
    new-instance v0, Ljava/math/BigDecimal;

    .line 20
    .line 21
    const-string v1, "10000"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/zv20;->c:Ljava/math/BigDecimal;

    .line 27
    .line 28
    new-instance v0, Ljava/math/BigDecimal;

    .line 29
    .line 30
    const-string v1, "100000"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/zv20;->d:Ljava/math/BigDecimal;

    .line 36
    .line 37
    return-void
.end method

.method public static final a(Ljava/lang/Number;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/DecimalFormatSymbols;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x2e

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/text/DecimalFormatSymbols;->setDecimalSeparator(C)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/text/DecimalFormat;

    .line 14
    .line 15
    const-string v2, "####.######"

    .line 16
    .line 17
    invoke-direct {v1, v2, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "\u2066"

    .line 25
    .line 26
    const-string v1, "\u2069"

    .line 27
    .line 28
    invoke-static {v0, p0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final b(II)Ljava/lang/String;
    .locals 2

    .line 1
    int-to-double v0, p0

    .line 2
    int-to-double p0, p1

    .line 3
    div-double/2addr v0, p0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    sget-object v0, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static final d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;
    .locals 1

    .line 1
    invoke-static {p0, p1}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, v0}, La/zv20;->e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance p1, Lkotlin/Pair;

    .line 10
    .line 11
    invoke-direct {p1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public static final e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p1, 0x0

    .line 14
    sget-object p2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public static final f(IILjava/math/BigDecimal;)Ljava/lang/String;
    .locals 2

    .line 1
    int-to-long v0, p0

    .line 2
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p2}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v0, Ljava/math/BigDecimal;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0, p2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final g(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/math/BigDecimal;

    .line 16
    .line 17
    if-gez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :cond_0
    invoke-virtual {p0, p2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const-string v0, "()"

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {p1, v0, p2, v1}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p1, v0, p0, v1}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static final h(Ljava/math/BigDecimal;ZLjava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/math/BigDecimal;

    .line 16
    .line 17
    sget-object v1, La/zv20;->b:Ljava/math/BigDecimal;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object v1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {p0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    add-int p1, p0, p3

    .line 37
    .line 38
    const/16 v1, 0x2d

    .line 39
    .line 40
    if-eq p1, v1, :cond_0

    .line 41
    .line 42
    const/16 v1, 0x5a

    .line 43
    .line 44
    if-ne p1, v1, :cond_1

    .line 45
    .line 46
    :cond_0
    add-int/lit8 p1, p3, -0x1

    .line 47
    .line 48
    add-int/2addr p1, p0

    .line 49
    const-string v1, ":59+"

    .line 50
    .line 51
    invoke-static {p1, v1}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    add-int/lit8 p1, p3, -0x1

    .line 57
    .line 58
    add-int/2addr p1, p0

    .line 59
    const-string v1, ":59"

    .line 60
    .line 61
    invoke-static {p1, v1}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    const/16 v1, 0x64

    .line 66
    .line 67
    invoke-static {v0, v1}, La/zv20;->b(II)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "()"

    .line 72
    .line 73
    invoke-static {p2, v1, v0, v2}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p0, ":00"

    .line 86
    .line 87
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const-string v0, "(1)"

    .line 95
    .line 96
    invoke-static {p2, v0, p0, v2}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string p2, "("

    .line 101
    .line 102
    const-string v0, ")"

    .line 103
    .line 104
    invoke-static {p3, p2, v0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-static {p0, p2, p1, v2}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method

.method public static final i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "[]"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {p0, v1, v0, v2}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string v3, "/"

    .line 14
    .line 15
    const/4 v4, 0x6

    .line 16
    invoke-static {p1, v3, v2, v2, v4}, Lkotlin/text/StringsKt;->V(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, -0x1

    .line 21
    if-eq v5, v6, :cond_1

    .line 22
    .line 23
    filled-new-array {v3}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {p1, v3, v2, v4}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-string v3, "-"

    .line 33
    .line 34
    filled-new-array {v3}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {p1, v3, v2, v4}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p0, v1, v3, v2}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-static {p0, v1, v0, v2}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public static final j(I)Ljava/text/DecimalFormat;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/DecimalFormatSymbols;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x2e

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/text/DecimalFormatSymbols;->setDecimalSeparator(C)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/text/DecimalFormat;

    .line 14
    .line 15
    const-string v2, "0"

    .line 16
    .line 17
    invoke-static {p0, v2}, Lkotlin/text/c;->q(ILjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v1, p0, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public static final k(Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v3, p3

    const-string v4, "\u200e"

    const-string v5, "0:"

    const-string v6, "(0:"

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_76

    .line 1
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_0

    goto/16 :goto_18

    .line 2
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v9, "()"

    const-string v10, ")"

    const/4 v11, 0x3

    const-string v12, "("

    if-ne v7, v11, :cond_2

    if-nez v0, :cond_1

    .line 3
    :try_start_1
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_1a

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 4
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v13, 0x5

    sget-object v14, La/zv20;->b:Ljava/math/BigDecimal;

    if-ne v7, v13, :cond_3

    .line 5
    :try_start_2
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 6
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 7
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 8
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/math/BigDecimal;

    .line 10
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 12
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v15, "[]"

    const-string v16, ""

    move/from16 v17, v11

    const/4 v11, 0x7

    if-ne v7, v11, :cond_5

    if-nez v3, :cond_4

    move-object/from16 v3, v16

    .line 13
    :cond_4
    :try_start_3
    invoke-static {v2, v15, v3}, Lkotlin/text/c;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 14
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0x9

    if-ne v7, v11, :cond_8

    if-nez v0, :cond_6

    .line 15
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v3, :cond_7

    move-object/from16 v3, v16

    .line 16
    :cond_7
    invoke-static {v0, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 17
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0xb

    if-ne v7, v11, :cond_a

    .line 18
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 19
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 20
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 21
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 22
    check-cast v0, Ljava/math/BigDecimal;

    .line 23
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v3, :cond_9

    move-object/from16 v3, v16

    .line 25
    :cond_9
    invoke-static {v0, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 26
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const/16 v11, 0x64

    sget-object v8, La/zv20;->a:Ljava/math/BigDecimal;

    const/16 v13, 0xd

    if-ne v7, v13, :cond_b

    .line 27
    :try_start_4
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 28
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 29
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 30
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 31
    check-cast v0, Ljava/math/BigDecimal;

    .line 32
    invoke-static {v3, v11}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 33
    invoke-static {v0, v8}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 34
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v13, 0xf

    const/16 v11, 0x3e8

    if-ne v7, v13, :cond_c

    .line 35
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 36
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 37
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 38
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 39
    check-cast v0, Ljava/math/BigDecimal;

    .line 40
    invoke-static {v3, v11}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 41
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 42
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0x11

    if-ne v7, v11, :cond_d

    .line 43
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 44
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 45
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 46
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 47
    check-cast v0, Ljava/math/BigDecimal;

    const/16 v5, 0x64

    .line 48
    invoke-static {v3, v5}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 49
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 50
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const-wide/16 v19, 0x1

    const/4 v11, 0x2

    const/16 v13, 0x15

    if-ne v7, v13, :cond_10

    if-nez p4, :cond_e

    goto :goto_1

    .line 51
    :cond_e
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v5, v19

    if-nez v3, :cond_f

    const/4 v8, 0x1

    goto :goto_2

    :cond_f
    :goto_1
    const/4 v8, 0x0

    .line 52
    :goto_2
    invoke-static {v0, v8, v2, v11}, La/zv20;->h(Ljava/math/BigDecimal;ZLjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 53
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v13, 0x17

    if-ne v7, v13, :cond_13

    if-nez p4, :cond_11

    goto :goto_4

    .line 54
    :cond_11
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v5, v19

    if-nez v3, :cond_12

    const/4 v8, 0x1

    :goto_3
    const/4 v3, 0x5

    goto :goto_5

    :cond_12
    :goto_4
    const/4 v8, 0x0

    goto :goto_3

    .line 55
    :goto_5
    invoke-static {v0, v8, v2, v3}, La/zv20;->h(Ljava/math/BigDecimal;ZLjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 56
    :cond_13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v13, 0xa

    const/16 v11, 0x19

    if-ne v7, v11, :cond_16

    if-nez p4, :cond_14

    goto :goto_6

    .line 57
    :cond_14
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v5, v19

    if-nez v3, :cond_15

    const/4 v8, 0x1

    goto :goto_7

    :cond_15
    :goto_6
    const/4 v8, 0x0

    .line 58
    :goto_7
    invoke-static {v0, v8, v2, v13}, La/zv20;->h(Ljava/math/BigDecimal;ZLjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 59
    :cond_16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0x1b

    if-ne v7, v11, :cond_19

    if-nez p4, :cond_17

    goto :goto_9

    .line 60
    :cond_17
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v5, v19

    if-nez v3, :cond_18

    const/4 v8, 0x1

    :goto_8
    const/16 v3, 0xf

    goto :goto_a

    :cond_18
    :goto_9
    const/4 v8, 0x0

    goto :goto_8

    .line 61
    :goto_a
    invoke-static {v0, v8, v2, v3}, La/zv20;->h(Ljava/math/BigDecimal;ZLjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 62
    :cond_19
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0x1d

    if-ne v7, v11, :cond_1c

    if-nez p4, :cond_1a

    goto :goto_b

    .line 63
    :cond_1a
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v3, v5, v19

    if-nez v3, :cond_1b

    const/4 v8, 0x1

    goto :goto_c

    :cond_1b
    :goto_b
    const/4 v8, 0x0

    :goto_c
    const/16 v3, 0x1e

    .line 64
    invoke-static {v0, v8, v2, v3}, La/zv20;->h(Ljava/math/BigDecimal;ZLjava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 65
    :cond_1c
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const-string v11, ":00"

    const/16 v13, 0x1f

    if-ne v7, v13, :cond_1d

    .line 66
    :try_start_5
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 67
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 68
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 69
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 70
    check-cast v0, Ljava/math/BigDecimal;

    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 72
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":59"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 73
    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v13, 0x21

    if-ne v7, v13, :cond_1f

    .line 74
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 75
    iget-object v0, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 76
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-nez v0, :cond_1e

    :goto_d
    move-object/from16 v0, v16

    goto :goto_e

    .line 77
    :cond_1e
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    goto :goto_d

    :goto_e
    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 78
    :cond_1f
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0x23

    if-ne v7, v11, :cond_20

    .line 79
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 80
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 81
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 82
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 83
    check-cast v0, Ljava/math/BigDecimal;

    .line 84
    div-int/lit8 v5, v3, 0x64

    .line 85
    invoke-static {v3, v5, v8}, La/zv20;->f(IILjava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    .line 86
    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 87
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 89
    :cond_20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0x25

    if-ne v7, v11, :cond_21

    .line 90
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 91
    iget-object v0, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 92
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 93
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 94
    :cond_21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0x27

    if-ne v7, v11, :cond_22

    .line 95
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 96
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 97
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 98
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 99
    check-cast v0, Ljava/math/BigDecimal;

    .line 100
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 101
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 102
    :cond_22
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v11, 0x29

    if-ne v7, v11, :cond_24

    .line 103
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 104
    iget-object v0, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 105
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lez v0, :cond_23

    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":0)"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_f

    .line 107
    :cond_23
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 108
    :goto_f
    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 109
    :cond_24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x2b

    if-ne v6, v7, :cond_25

    .line 110
    invoke-static {v0, v2, v8}, La/zv20;->g(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 111
    :cond_25
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x2d

    if-ne v6, v7, :cond_26

    .line 112
    invoke-static {v0, v2, v14}, La/zv20;->g(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 113
    :cond_26
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x31

    if-ne v6, v7, :cond_28

    .line 114
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 115
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 116
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 117
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 118
    check-cast v0, Ljava/math/BigDecimal;

    if-nez v3, :cond_27

    move-object/from16 v3, v16

    .line 119
    :cond_27
    invoke-static {v2, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x64

    .line 120
    invoke-static {v5, v6}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 121
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 122
    :cond_28
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x33

    if-ne v6, v7, :cond_2a

    .line 123
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 124
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 125
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 126
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 127
    check-cast v0, Ljava/math/BigDecimal;

    .line 128
    div-int/lit16 v6, v5, 0x3e8

    .line 129
    invoke-static {v5, v6, v14}, La/zv20;->f(IILjava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    if-nez v3, :cond_29

    move-object/from16 v3, v16

    .line 130
    :cond_29
    invoke-static {v2, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 131
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 132
    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 133
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 134
    :cond_2a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x35

    if-ne v6, v7, :cond_2b

    .line 135
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 136
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 137
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 138
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 139
    check-cast v0, Ljava/math/BigDecimal;

    .line 140
    div-int/lit8 v5, v3, 0x64

    .line 141
    invoke-static {v3, v5, v8}, La/zv20;->f(IILjava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    .line 142
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 143
    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 144
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 145
    :cond_2b
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x37

    if-ne v6, v7, :cond_2d

    .line 146
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 147
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 148
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 149
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 150
    check-cast v0, Ljava/math/BigDecimal;

    if-nez v3, :cond_2c

    move-object/from16 v3, v16

    .line 151
    :cond_2c
    invoke-static {v2, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 152
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 153
    invoke-static {v0, v8}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 154
    :cond_2d
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x3b

    if-ne v6, v7, :cond_2f

    .line 155
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 156
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 157
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 158
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 159
    check-cast v0, Ljava/math/BigDecimal;

    if-nez v3, :cond_2e

    move-object/from16 v3, v16

    .line 160
    :cond_2e
    invoke-static {v2, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 161
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 162
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 163
    :cond_2f
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x41

    if-ne v6, v7, :cond_30

    .line 164
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 165
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 166
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 167
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 168
    check-cast v0, Ljava/math/BigDecimal;

    .line 169
    div-int/lit16 v5, v3, 0x3e8

    .line 170
    invoke-static {v3, v5, v14}, La/zv20;->f(IILjava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    .line 171
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 172
    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 173
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 174
    :cond_30
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x45

    if-ne v6, v7, :cond_32

    .line 175
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 176
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 177
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 178
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 179
    check-cast v0, Ljava/math/BigDecimal;

    .line 180
    div-int/lit8 v6, v5, 0x64

    .line 181
    invoke-static {v5, v6, v8}, La/zv20;->f(IILjava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    if-nez v3, :cond_31

    move-object/from16 v3, v16

    .line 182
    :cond_31
    invoke-static {v2, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 183
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 184
    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 185
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 186
    :cond_32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x47

    if-ne v6, v7, :cond_33

    .line 187
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 188
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 189
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 190
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 191
    check-cast v0, Ljava/math/BigDecimal;

    .line 192
    sget-object v5, Ljava/math/BigDecimal;->TEN:Ljava/math/BigDecimal;

    invoke-virtual {v0, v5}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    move-result v0

    sub-int v5, v3, v0

    .line 193
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    add-int/2addr v3, v0

    .line 194
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 195
    :cond_33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x4b

    if-ne v6, v7, :cond_34

    .line 196
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 197
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 198
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 199
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 200
    check-cast v0, Ljava/math/BigDecimal;

    .line 201
    invoke-virtual {v0, v8}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v7, 0x0

    invoke-virtual {v5, v7, v6}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 202
    invoke-virtual {v0, v8}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0x64

    .line 203
    invoke-static {v3, v6}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 204
    invoke-virtual {v5}, Ljava/math/BigDecimal;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 205
    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 206
    :cond_34
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x4d

    if-ne v6, v7, :cond_37

    .line 207
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 208
    iget-object v0, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 209
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lez v0, :cond_35

    .line 210
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":0"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_10

    .line 211
    :cond_35
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_10
    if-nez v3, :cond_36

    move-object/from16 v3, v16

    .line 212
    :cond_36
    invoke-static {v2, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 213
    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 214
    :cond_37
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x51

    if-ne v5, v6, :cond_38

    .line 215
    invoke-static/range {p1 .. p2}, La/zv20;->n(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 216
    :cond_38
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x53

    if-ne v5, v6, :cond_39

    .line 217
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 218
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 219
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 220
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 221
    check-cast v0, Ljava/math/BigDecimal;

    .line 222
    div-int/lit8 v5, v3, 0x64

    .line 223
    invoke-static {v3, v5, v8}, La/zv20;->f(IILjava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    .line 224
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 225
    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 226
    invoke-static {v0, v8}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 227
    :cond_39
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x55

    if-ne v5, v6, :cond_3a

    .line 228
    invoke-static/range {p1 .. p2}, La/zv20;->o(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 229
    :cond_3a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x57

    if-ne v5, v6, :cond_3b

    .line 230
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 231
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 232
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 233
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 234
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v3

    .line 235
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v3

    .line 236
    iget-object v5, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 237
    check-cast v5, Ljava/math/BigDecimal;

    .line 238
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 239
    check-cast v3, Ljava/math/BigDecimal;

    .line 240
    invoke-static {v0, v8}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 241
    iget-object v6, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 242
    check-cast v6, Ljava/math/BigDecimal;

    .line 243
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 244
    check-cast v0, Ljava/math/BigDecimal;

    .line 245
    sget-object v7, Ljava/math/BigDecimal;->TEN:Ljava/math/BigDecimal;

    invoke-virtual {v5, v7}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 246
    invoke-static {v3}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 247
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 248
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 249
    :cond_3b
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x59

    if-ne v5, v6, :cond_3c

    .line 250
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 251
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 252
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 253
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 254
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v3

    .line 255
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v3

    .line 256
    iget-object v5, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 257
    check-cast v5, Ljava/math/BigDecimal;

    .line 258
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 259
    check-cast v3, Ljava/math/BigDecimal;

    .line 260
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 261
    invoke-static {v3}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 262
    invoke-virtual {v0, v14}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 263
    :cond_3c
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x5b

    if-ne v5, v6, :cond_3d

    .line 264
    invoke-static {v2, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 265
    :cond_3d
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x5d

    if-ne v5, v6, :cond_3e

    .line 266
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 267
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 268
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 269
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 270
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v3

    .line 271
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v3

    .line 272
    iget-object v5, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 273
    check-cast v5, Ljava/math/BigDecimal;

    .line 274
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 275
    check-cast v3, Ljava/math/BigDecimal;

    .line 276
    invoke-static {v0, v8}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 277
    iget-object v6, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 278
    check-cast v6, Ljava/math/BigDecimal;

    .line 279
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 280
    check-cast v0, Ljava/math/BigDecimal;

    .line 281
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 282
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 283
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 284
    :cond_3e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x5f

    if-ne v5, v6, :cond_40

    .line 285
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 286
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 287
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 288
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 289
    check-cast v0, Ljava/math/BigDecimal;

    if-ltz v3, :cond_3f

    :goto_11
    const/16 v6, 0x64

    goto :goto_12

    .line 290
    :cond_3f
    invoke-virtual {v0}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_11

    .line 291
    :goto_12
    invoke-static {v3, v6}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 292
    invoke-static {v0, v8}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 293
    :cond_40
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x61

    if-ne v5, v6, :cond_42

    .line 294
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 295
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 296
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 297
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 298
    check-cast v0, Ljava/math/BigDecimal;

    if-ltz v3, :cond_41

    :goto_13
    const/16 v5, 0x3e8

    goto :goto_14

    .line 299
    :cond_41
    invoke-virtual {v0}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_13

    .line 300
    :goto_14
    invoke-static {v3, v5}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 301
    sget-object v5, Ljava/math/BigDecimal;->TEN:Ljava/math/BigDecimal;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v5}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 302
    :cond_42
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x63

    if-ne v5, v6, :cond_43

    .line 303
    invoke-static {v2, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 304
    :cond_43
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x65

    if-ne v5, v6, :cond_44

    .line 305
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 306
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 307
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 308
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 309
    check-cast v0, Ljava/math/BigDecimal;

    .line 310
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 311
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 312
    new-instance v5, Ljava/math/BigDecimal;

    const-string v6, "0.5"

    invoke-direct {v5, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 313
    invoke-virtual {v0, v14}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    .line 314
    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 315
    :cond_44
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x67

    if-ne v5, v6, :cond_46

    .line 316
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 317
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 318
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 319
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 320
    check-cast v0, Ljava/math/BigDecimal;

    if-ltz v3, :cond_45

    goto :goto_15

    .line 321
    :cond_45
    invoke-virtual {v0}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    :goto_15
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 323
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    int-to-double v5, v3

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    sub-double/2addr v5, v7

    .line 324
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 325
    :cond_46
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x69

    if-ne v5, v6, :cond_47

    .line 326
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 327
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 328
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 329
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 330
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v3

    .line 331
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v3

    .line 332
    iget-object v5, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 333
    check-cast v5, Ljava/math/BigDecimal;

    .line 334
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 335
    check-cast v3, Ljava/math/BigDecimal;

    .line 336
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 337
    invoke-static {v3}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 338
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 339
    :cond_47
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x6b

    if-ne v5, v6, :cond_48

    .line 340
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 341
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 342
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 343
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 344
    check-cast v0, Ljava/math/BigDecimal;

    .line 345
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 346
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 347
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 348
    :cond_48
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    sget-object v6, La/zv20;->c:Ljava/math/BigDecimal;

    const/16 v7, 0x6f

    if-ne v5, v7, :cond_49

    .line 349
    :try_start_6
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 350
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 351
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 352
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 353
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v10, v5

    .line 354
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 355
    invoke-static {v5, v8}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v7

    .line 356
    invoke-static {v5, v8, v7}, La/zv20;->e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v12

    .line 357
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v6, v5}, La/zv20;->e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 358
    invoke-static {v5, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 359
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 360
    check-cast v6, Ljava/math/BigDecimal;

    .line 361
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 362
    check-cast v5, Ljava/math/BigDecimal;

    .line 363
    invoke-static {v0, v8}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 364
    iget-object v8, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 365
    check-cast v8, Ljava/math/BigDecimal;

    .line 366
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 367
    check-cast v0, Ljava/math/BigDecimal;

    .line 368
    invoke-static {v7}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v9, v7}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 369
    invoke-static {v12}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v9, v10}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 370
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 371
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 372
    invoke-static {v8}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 373
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 374
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 375
    :cond_49
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x71

    if-ne v5, v7, :cond_4b

    if-nez v0, :cond_4a

    .line 376
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    :cond_4a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 377
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 378
    :cond_4b
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x73

    if-ne v5, v7, :cond_4c

    .line 379
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 380
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 381
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 382
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 383
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v5

    .line 384
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 385
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 386
    check-cast v6, Ljava/math/BigDecimal;

    .line 387
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 388
    check-cast v5, Ljava/math/BigDecimal;

    .line 389
    invoke-static {v0, v8}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 390
    iget-object v7, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 391
    check-cast v7, Ljava/math/BigDecimal;

    .line 392
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 393
    check-cast v0, Ljava/math/BigDecimal;

    .line 394
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 395
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 396
    invoke-static {v7}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 397
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 398
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 399
    :cond_4c
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x75

    if-ne v5, v7, :cond_4d

    .line 400
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 401
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 402
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 403
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 404
    check-cast v0, Ljava/math/BigDecimal;

    const/16 v5, 0x3e8

    .line 405
    invoke-static {v3, v5}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 406
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 407
    :cond_4d
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x77

    if-ne v5, v7, :cond_4e

    .line 408
    invoke-static/range {p1 .. p2}, La/zv20;->l(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 409
    :cond_4e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x79

    if-ne v5, v7, :cond_4f

    .line 410
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 411
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 412
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 413
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 414
    check-cast v0, Ljava/math/BigDecimal;

    .line 415
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 416
    invoke-static {v0, v6}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 417
    :cond_4f
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x7b

    if-ne v5, v7, :cond_50

    .line 418
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 419
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 420
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 421
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 422
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v10, v3

    .line 423
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v6}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v3

    .line 424
    invoke-static {v3, v8}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 425
    invoke-static {v3, v8, v5}, La/zv20;->e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v7

    .line 426
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v6, v3}, La/zv20;->e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v3

    .line 427
    invoke-static {v3, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v3

    .line 428
    iget-object v6, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 429
    check-cast v6, Ljava/math/BigDecimal;

    .line 430
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 431
    check-cast v3, Ljava/math/BigDecimal;

    .line 432
    invoke-static {v0, v8}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 433
    iget-object v8, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 434
    check-cast v8, Ljava/math/BigDecimal;

    .line 435
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 436
    check-cast v0, Ljava/math/BigDecimal;

    .line 437
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 438
    invoke-static {v7}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v9, v7}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 439
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 440
    invoke-static {v3}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 441
    invoke-static {v8}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 442
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 443
    :cond_50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x7d

    if-ne v5, v7, :cond_51

    .line 444
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 445
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 446
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 447
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 448
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v5

    .line 449
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 450
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 451
    check-cast v6, Ljava/math/BigDecimal;

    .line 452
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 453
    check-cast v5, Ljava/math/BigDecimal;

    .line 454
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 455
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 456
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 457
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 458
    :cond_51
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x7f

    if-ne v5, v7, :cond_52

    .line 459
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 460
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 461
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 462
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 463
    check-cast v0, Ljava/math/BigDecimal;

    .line 464
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 465
    invoke-static {v0, v6}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 466
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 467
    :cond_52
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x81

    if-ne v5, v7, :cond_53

    .line 468
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 469
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 470
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 471
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 472
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v3

    .line 473
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v14}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v3

    .line 474
    iget-object v5, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 475
    check-cast v5, Ljava/math/BigDecimal;

    .line 476
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 477
    check-cast v3, Ljava/math/BigDecimal;

    .line 478
    invoke-static {v0, v14}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 479
    iget-object v6, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 480
    check-cast v6, Ljava/math/BigDecimal;

    .line 481
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 482
    check-cast v0, Ljava/math/BigDecimal;

    .line 483
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 484
    invoke-static {v3}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 485
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 486
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 487
    :cond_53
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x83

    if-ne v5, v7, :cond_54

    .line 488
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 489
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 490
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 491
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 492
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v5

    .line 493
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 494
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 495
    check-cast v6, Ljava/math/BigDecimal;

    .line 496
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 497
    check-cast v5, Ljava/math/BigDecimal;

    .line 498
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 499
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 500
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 501
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 502
    :cond_54
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x85

    if-ne v5, v7, :cond_56

    if-nez v0, :cond_55

    .line 503
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    :cond_55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 504
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 505
    :cond_56
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x86

    if-ne v5, v7, :cond_57

    .line 506
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 507
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 508
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 509
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 510
    check-cast v0, Ljava/math/BigDecimal;

    const/16 v5, 0x3e8

    .line 511
    invoke-static {v3, v5}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 512
    invoke-static {v0, v8}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 513
    :cond_57
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x87

    if-ne v5, v7, :cond_58

    .line 514
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 515
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 516
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 517
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 518
    check-cast v0, Ljava/math/BigDecimal;

    .line 519
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 520
    invoke-static {v0, v14}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 521
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 522
    :cond_58
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x88

    if-ne v5, v7, :cond_59

    .line 523
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 524
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 525
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 526
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 527
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v5

    .line 528
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 529
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 530
    check-cast v6, Ljava/math/BigDecimal;

    .line 531
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 532
    check-cast v5, Ljava/math/BigDecimal;

    .line 533
    invoke-static {v0, v8}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 534
    iget-object v7, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 535
    check-cast v7, Ljava/math/BigDecimal;

    .line 536
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 537
    check-cast v0, Ljava/math/BigDecimal;

    .line 538
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 539
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 540
    invoke-static {v7}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 541
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 542
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 543
    :cond_59
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x89

    if-ne v5, v7, :cond_5a

    .line 544
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 545
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 546
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 547
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 548
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v10, v5

    .line 549
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 550
    invoke-static {v5, v8}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v7

    .line 551
    invoke-static {v5, v8, v7}, La/zv20;->e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v12

    .line 552
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v6, v5}, La/zv20;->e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 553
    invoke-static {v5, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 554
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 555
    check-cast v6, Ljava/math/BigDecimal;

    .line 556
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 557
    check-cast v5, Ljava/math/BigDecimal;

    .line 558
    invoke-static {v0, v8}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 559
    iget-object v8, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 560
    check-cast v8, Ljava/math/BigDecimal;

    .line 561
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 562
    check-cast v0, Ljava/math/BigDecimal;

    .line 563
    invoke-static {v7}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v9, v7}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 564
    invoke-static {v12}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v9, v10}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 565
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 566
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 567
    invoke-static {v8}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 568
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 569
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 570
    :cond_5a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x8a

    if-ne v5, v7, :cond_5b

    .line 571
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 572
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 573
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 574
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 575
    check-cast v0, Ljava/math/BigDecimal;

    const/16 v5, 0x3e8

    .line 576
    invoke-static {v3, v5}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 577
    invoke-virtual {v0}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 578
    :cond_5b
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x8b

    if-ne v5, v7, :cond_5f

    if-nez v0, :cond_5c

    .line 579
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 580
    :cond_5c
    sget-object v3, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    const/4 v5, 0x1

    invoke-virtual {v0, v5, v3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v7

    .line 581
    invoke-virtual {v0}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    move-result-object v10

    invoke-virtual {v7}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v10

    .line 582
    invoke-virtual {v10, v8}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v8

    const/4 v10, 0x0

    .line 583
    invoke-virtual {v8, v10, v3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v8

    .line 584
    sget-object v10, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    invoke-virtual {v8, v10}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v8

    if-eqz v8, :cond_5d

    move v8, v5

    goto :goto_16

    :cond_5d
    const/4 v8, 0x0

    .line 585
    :goto_16
    invoke-virtual {v0}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v0}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    move-result-object v0

    const/4 v10, 0x2

    invoke-virtual {v0, v10, v3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 586
    invoke-virtual {v0, v6}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    if-eqz v8, :cond_5e

    .line 587
    invoke-virtual {v0}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v0

    .line 588
    :cond_5e
    invoke-static {v7}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 589
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 590
    :cond_5f
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x8c

    if-ne v5, v7, :cond_60

    .line 591
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 592
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 593
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 594
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 595
    check-cast v0, Ljava/math/BigDecimal;

    const/16 v6, 0x64

    .line 596
    invoke-static {v5, v6}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 597
    invoke-virtual {v0}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v8}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 598
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 599
    :cond_60
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x8f

    if-ne v5, v7, :cond_61

    .line 600
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 601
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 602
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 603
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 604
    check-cast v0, Ljava/math/BigDecimal;

    .line 605
    new-instance v5, Ljava/math/BigDecimal;

    const-string v7, "100000000"

    invoke-direct {v5, v7}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    int-to-long v10, v3

    .line 606
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    invoke-static {v3, v5}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v7

    .line 608
    invoke-virtual {v3, v5}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 609
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v10, 0x0

    invoke-virtual {v5, v10, v6}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 610
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 611
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 612
    check-cast v6, Ljava/math/BigDecimal;

    .line 613
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 614
    check-cast v5, Ljava/math/BigDecimal;

    .line 615
    invoke-static {v3, v14}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v10

    .line 616
    invoke-static {v3, v14, v10}, La/zv20;->e(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v3

    .line 617
    invoke-static {v3, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v3

    .line 618
    iget-object v10, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 619
    check-cast v10, Ljava/math/BigDecimal;

    .line 620
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 621
    check-cast v3, Ljava/math/BigDecimal;

    .line 622
    invoke-static {v0, v8}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 623
    iget-object v8, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 624
    check-cast v8, Ljava/math/BigDecimal;

    .line 625
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 626
    check-cast v0, Ljava/math/BigDecimal;

    .line 627
    invoke-static {v7}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v9, v7}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 628
    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 629
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 630
    invoke-static {v10}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 631
    invoke-static {v3}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 632
    invoke-static {v8}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 633
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 634
    :cond_61
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x90

    if-ne v5, v7, :cond_63

    .line 635
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 636
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 637
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 638
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 639
    check-cast v0, Ljava/math/BigDecimal;

    if-ltz v3, :cond_62

    goto :goto_17

    .line 640
    :cond_62
    invoke-virtual {v0}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    :goto_17
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 642
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 643
    :cond_63
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x91

    if-ne v5, v7, :cond_64

    .line 644
    invoke-static {v2, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 645
    :cond_64
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x92

    if-ne v5, v7, :cond_66

    if-nez v0, :cond_65

    .line 646
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    :cond_65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 647
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 648
    :cond_66
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x93

    if-ne v5, v7, :cond_67

    .line 649
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 650
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 651
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 652
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 653
    check-cast v0, Ljava/math/BigDecimal;

    .line 654
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 655
    invoke-static {v0, v14}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 656
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 657
    :cond_67
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x94

    if-ne v5, v7, :cond_68

    .line 658
    invoke-static/range {p1 .. p2}, La/zv20;->n(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 659
    :cond_68
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x95

    if-ne v5, v7, :cond_69

    .line 660
    invoke-static/range {p1 .. p2}, La/zv20;->o(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 661
    :cond_69
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x96

    if-ne v5, v7, :cond_6a

    .line 662
    invoke-static {v2, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 663
    :cond_6a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x97

    if-ne v5, v7, :cond_6b

    .line 664
    invoke-static/range {p1 .. p2}, La/zv20;->o(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 665
    :cond_6b
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x98

    if-ne v5, v7, :cond_6c

    .line 666
    invoke-static/range {p1 .. p2}, La/zv20;->l(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 667
    :cond_6c
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x99

    if-ne v5, v7, :cond_6d

    .line 668
    invoke-static/range {p1 .. p2}, La/zv20;->m(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 669
    :cond_6d
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x9a

    if-ne v5, v7, :cond_6e

    .line 670
    invoke-static/range {p1 .. p2}, La/zv20;->m(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 671
    :cond_6e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x9b

    if-ne v5, v7, :cond_6f

    .line 672
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 673
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 674
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 675
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 676
    check-cast v0, Ljava/math/BigDecimal;

    .line 677
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 678
    new-instance v6, Ljava/math/BigDecimal;

    const-string v7, "1000000"

    invoke-direct {v6, v7}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v6}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 679
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 680
    :cond_6f
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x9c

    if-ne v5, v7, :cond_70

    .line 681
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 682
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 683
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 684
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 685
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v7, v5

    .line 686
    invoke-static {v7, v8}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 687
    iget-object v7, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 688
    check-cast v7, Ljava/math/BigDecimal;

    .line 689
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 690
    check-cast v5, Ljava/math/BigDecimal;

    .line 691
    invoke-static {v7}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v9, v7}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 692
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 693
    invoke-static {v0, v6}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 694
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 695
    :cond_70
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x9d

    if-ne v5, v7, :cond_71

    .line 696
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 697
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 698
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 699
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 700
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v10, v5

    .line 701
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    sget-object v7, La/zv20;->d:Ljava/math/BigDecimal;

    invoke-static {v5, v7}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v10

    .line 703
    invoke-virtual {v10, v7}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v11

    invoke-virtual {v5, v11}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v11

    invoke-virtual {v11, v14}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v11

    .line 704
    sget-object v12, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v13, 0x0

    invoke-virtual {v11, v13, v12}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v11

    .line 705
    invoke-virtual {v10, v7}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v15

    invoke-virtual {v5, v15}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 706
    invoke-virtual {v11, v14}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v15

    .line 707
    invoke-virtual {v5, v15}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 708
    invoke-virtual {v5, v13, v12}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v5

    .line 709
    invoke-virtual {v0, v8}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v15

    invoke-virtual {v15, v13, v12}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v15

    .line 710
    invoke-virtual {v0, v6}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v6

    invoke-virtual {v15, v8}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v6

    .line 711
    invoke-virtual {v6, v13, v12}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v6

    .line 712
    new-instance v8, Ljava/math/BigDecimal;

    const-string v13, "10000000"

    invoke-direct {v8, v13}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 713
    invoke-virtual {v15, v7}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 714
    invoke-virtual {v6, v14}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    const/4 v13, 0x0

    .line 715
    invoke-virtual {v0, v13, v12}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    const/16 v18, 0x2

    .line 716
    invoke-static/range {v18 .. v18}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v7

    invoke-virtual {v7, v10}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v9, v7}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 717
    invoke-static/range {v18 .. v18}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v8

    invoke-virtual {v8, v11}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v9, v8}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 718
    invoke-static/range {v17 .. v17}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v18, 0x2

    .line 719
    invoke-static/range {v18 .. v18}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v7

    invoke-virtual {v7, v15}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v9, v7}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 720
    invoke-static/range {v18 .. v18}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v9, v6}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 721
    invoke-static/range {v17 .. v17}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 722
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 723
    :cond_71
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v7, 0x9e

    if-ne v5, v7, :cond_72

    .line 724
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 725
    iget-object v5, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 726
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 727
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 728
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v10, v5

    .line 729
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v8}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v5

    .line 730
    iget-object v7, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 731
    check-cast v7, Ljava/math/BigDecimal;

    .line 732
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 733
    check-cast v5, Ljava/math/BigDecimal;

    const/16 v18, 0x2

    .line 734
    invoke-static/range {v18 .. v18}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v9, v7}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 735
    invoke-static/range {v18 .. v18}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 736
    invoke-static/range {v17 .. v17}, La/zv20;->j(I)Ljava/text/DecimalFormat;

    move-result-object v7

    invoke-virtual {v0, v6}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 737
    invoke-static {v0, v3}, La/zv20;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_19

    .line 738
    :cond_72
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x9f

    if-ne v5, v6, :cond_75

    if-nez v0, :cond_73

    .line 739
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    :cond_73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v3, :cond_74

    move-object/from16 v3, v16

    .line 740
    :cond_74
    invoke-static {v0, v15, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_19

    .line 741
    :cond_75
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v5, 0xa0

    if-ne v3, v5, :cond_76

    .line 742
    invoke-static {v0}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v0

    .line 743
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 744
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 745
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 746
    check-cast v0, Ljava/math/BigDecimal;

    int-to-long v5, v3

    .line 747
    invoke-static {v5, v6}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v14}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    move-result-object v3

    .line 748
    iget-object v5, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 749
    check-cast v5, Ljava/math/BigDecimal;

    .line 750
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 751
    check-cast v3, Ljava/math/BigDecimal;

    .line 752
    invoke-virtual {v0, v14}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v6

    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v13, 0x0

    invoke-virtual {v6, v13, v7}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v6

    .line 753
    invoke-virtual {v0, v14}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 754
    invoke-static {v5}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 755
    invoke-virtual {v3}, Ljava/math/BigDecimal;->intValue()I

    move-result v3

    const/16 v7, 0xa

    invoke-static {v3, v7}, La/zv20;->b(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v9, v3}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 756
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v9, v5}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v9, v0}, Lkotlin/text/c;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_19

    :cond_76
    :goto_18
    move-object v0, v2

    .line 758
    :goto_19
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return-object v0

    .line 759
    :goto_1a
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 760
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final l(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p1}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/math/BigDecimal;

    .line 16
    .line 17
    int-to-long v0, v0

    .line 18
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v3, La/zv20;->b:Ljava/math/BigDecimal;

    .line 26
    .line 27
    invoke-static {v2, v3}, La/zv20;->c(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v4, Ljava/math/BigDecimal;->TEN:Ljava/math/BigDecimal;

    .line 32
    .line 33
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v1, La/zv20;->a:Ljava/math/BigDecimal;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v4}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v3, "()"

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-static {p0, v3, v2, v4}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {p0, v3, v0, v4}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p1, v1}, La/zv20;->p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p0, v3, p1, v4}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static final m(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p1}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/math/BigDecimal;

    .line 16
    .line 17
    int-to-long v0, v0

    .line 18
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v1, La/zv20;->b:Ljava/math/BigDecimal;

    .line 26
    .line 27
    invoke-static {v0, v1}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ljava/math/BigDecimal;

    .line 34
    .line 35
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/math/BigDecimal;

    .line 38
    .line 39
    invoke-static {v2}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "()"

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {p0, v3, v2, v4}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p0, v3, v0, v4}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p1, v1}, La/zv20;->r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p0, v3, p1, v4}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public static final n(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p1}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/math/BigDecimal;

    .line 16
    .line 17
    div-int/lit8 v1, v0, 0x64

    .line 18
    .line 19
    sget-object v2, La/zv20;->a:Ljava/math/BigDecimal;

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, La/zv20;->f(IILjava/math/BigDecimal;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v4, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-virtual {v3, v5, v4}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p1, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v2, "()"

    .line 61
    .line 62
    invoke-static {p0, v2, v1, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0, v2, v0, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/math/BigDecimal;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {p0, v2, v0, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0, v2, p1, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public static final o(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p1}, La/zv20;->s(Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/math/BigDecimal;

    .line 16
    .line 17
    int-to-long v0, v0

    .line 18
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v1, La/zv20;->c:Ljava/math/BigDecimal;

    .line 26
    .line 27
    invoke-static {v0, v1}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/math/BigDecimal;

    .line 34
    .line 35
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/math/BigDecimal;

    .line 38
    .line 39
    sget-object v2, La/zv20;->a:Ljava/math/BigDecimal;

    .line 40
    .line 41
    invoke-static {v0, v2}, La/zv20;->d(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Ljava/math/BigDecimal;

    .line 48
    .line 49
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ljava/math/BigDecimal;

    .line 52
    .line 53
    invoke-static {p1, v2}, La/zv20;->q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-object v2, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ljava/math/BigDecimal;

    .line 60
    .line 61
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Ljava/math/BigDecimal;

    .line 64
    .line 65
    sget-object v4, Ljava/math/BigDecimal;->TEN:Ljava/math/BigDecimal;

    .line 66
    .line 67
    invoke-virtual {v1, v4}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string v4, "()"

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    invoke-static {p0, v4, v1, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {v3}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {p0, v4, v1, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {v0}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {p0, v4, v0, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {v2}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {p0, v4, v0, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p1}, La/zv20;->t(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p0, v4, p1, v5}, Lkotlin/text/c;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public static p(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, v0}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, La/zv20;->a(Ljava/lang/Number;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final q(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Pair;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, v0}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Lkotlin/Pair;

    .line 29
    .line 30
    invoke-direct {p1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public static final r(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    sget-object v0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static final s(Ljava/math/BigDecimal;)Lkotlin/Pair;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Lkotlin/Pair;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v1, Ljava/math/BigDecimal;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Lkotlin/Pair;

    .line 38
    .line 39
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method

.method public static final t(Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/math/BigDecimal;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
