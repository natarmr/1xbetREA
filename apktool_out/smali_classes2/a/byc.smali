.class public final La/byc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jr20;


# static fields
.field public static final a:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v1, "^ {0,3}(~~~+|```+)([^`]*)$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/byc;->a:Lkotlin/text/Regex;

    .line 9
    .line 10
    return-void
.end method

.method public static c(La/v9d;La/k810;)La/ayc;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, La/k810;->b:I

    .line 5
    .line 6
    iget-object p1, p1, La/k810;->d:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-static {p0, p1}, La/idx;->x(La/v9d;Ljava/lang/CharSequence;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-ne v0, p0, :cond_3

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-interface {p1, v0, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    sget-object p1, La/byc;->a:Lkotlin/text/Regex;

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance p1, La/ayc;

    .line 33
    .line 34
    iget-object p0, p0, La/bh30;->c:La/g3;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-virtual {p0, v0}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v0, v1

    .line 47
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-virtual {p0, v2}, La/g3;->e(I)Lkotlin/text/MatchGroup;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    iget-object v1, p0, Lkotlin/text/MatchGroup;->a:Ljava/lang/String;

    .line 58
    .line 59
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, v0, v1}, La/ayc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_3
    :goto_1
    return-object v1
.end method


# virtual methods
.method public final a(La/k810;La/y78;La/mr20;)Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p3, La/mr20;->a:La/v9d;

    .line 5
    .line 6
    invoke-static {p0, p1}, La/byc;->c(La/v9d;La/k810;)La/ayc;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    sget-object p0, La/iun;->a:La/iun;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object v0, p3, La/ayc;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1}, La/k810;->c()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sub-int/2addr v1, v2

    .line 26
    new-instance v2, La/sgi0;

    .line 27
    .line 28
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 29
    .line 30
    iget v4, p1, La/k810;->c:I

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    invoke-direct {v3, v4, v1, v5}, Lkotlin/ranges/a;-><init>(III)V

    .line 34
    .line 35
    .line 36
    sget-object v4, La/cy2;->b0:La/ar20;

    .line 37
    .line 38
    invoke-direct {v2, v3, v4}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p2, v2}, La/y78;->b(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-lez v0, :cond_1

    .line 53
    .line 54
    new-instance v0, La/sgi0;

    .line 55
    .line 56
    new-instance v2, Lkotlin/ranges/IntRange;

    .line 57
    .line 58
    invoke-virtual {p1}, La/k810;->c()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-direct {v2, v1, p1, v5}, Lkotlin/ranges/a;-><init>(III)V

    .line 63
    .line 64
    .line 65
    sget-object p1, La/cy2;->a0:La/ar20;

    .line 66
    .line 67
    invoke-direct {v0, v2, p1}, La/sgi0;-><init>(Lkotlin/ranges/IntRange;La/ar20;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p2, p1}, La/y78;->b(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    new-instance p1, La/zxc;

    .line 78
    .line 79
    iget-object p3, p3, La/ayc;->a:Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {p1, p0, p2, p3}, La/zxc;-><init>(La/v9d;La/y78;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public final b(La/v9d;La/k810;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2}, La/byc;->c(La/v9d;La/k810;)La/ayc;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method
