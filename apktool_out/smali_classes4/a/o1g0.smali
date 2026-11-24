.class public abstract La/o1g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/text/Regex;

.field public static final b:Lkotlin/text/Regex;

.field public static final c:Lkotlin/text/Regex;

.field public static final d:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v1, "\\d+[:-]\\d+|\\d+ - \\d+"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/o1g0;->a:Lkotlin/text/Regex;

    .line 9
    .line 10
    new-instance v0, Lkotlin/text/Regex;

    .line 11
    .line 12
    const-string v1, "(\\d+(?:\\.\\d+)?)"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/o1g0;->b:Lkotlin/text/Regex;

    .line 18
    .line 19
    new-instance v0, Lkotlin/text/Regex;

    .line 20
    .line 21
    const-string v1, "(\\s[:-]\\s(\\d+(?:\\.\\d+)?))"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/o1g0;->c:Lkotlin/text/Regex;

    .line 27
    .line 28
    sget-object v0, La/csg;->d:La/csg;

    .line 29
    .line 30
    iget-wide v0, v0, La/yxg;->b:J

    .line 31
    .line 32
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, La/rtg;->d:La/rtg;

    .line 37
    .line 38
    iget-wide v1, v1, La/yxg;->b:J

    .line 39
    .line 40
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    filled-new-array {v0, v1}, [Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, La/o1g0;->d:Ljava/util/Set;

    .line 53
    .line 54
    return-void
.end method

.method public static final a(JLjava/lang/String;)La/a2m;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, p2}, La/o1g0;->d(JLjava/lang/String;)Lkotlin/Pair;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v1, La/c2m;->a:La/c2m;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    new-instance p0, La/z1m;

    .line 13
    .line 14
    invoke-direct {p0, v1}, La/z1m;-><init>(La/d2m;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, La/y1m;

    .line 19
    .line 20
    new-instance v2, La/x1m;

    .line 21
    .line 22
    invoke-direct {v2}, La/x1m;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v3, p1

    .line 28
    check-cast v3, Ljava/lang/String;

    .line 29
    .line 30
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v4, p0

    .line 33
    check-cast v4, Ljava/lang/String;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-direct/range {v0 .. v6}, La/y1m;-><init>(La/d2m;La/x1m;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public static final b(JLjava/lang/String;)La/mpm;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, p2}, La/o1g0;->d(JLjava/lang/String;)Lkotlin/Pair;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 p1, 0x3

    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    sget-object p2, La/opm;->a:La/opm;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    new-instance p0, La/lpm;

    .line 16
    .line 17
    new-instance v2, La/hpm;

    .line 18
    .line 19
    invoke-direct {v2, v0, v1, p1}, La/hpm;-><init>(JI)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p2, v2}, La/lpm;-><init>(La/rpm;La/ipm;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance v2, La/kpm;

    .line 27
    .line 28
    new-instance v3, La/hpm;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1, p1}, La/hpm;-><init>(JI)V

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Ljava/lang/String;

    .line 36
    .line 37
    iget-object p0, p0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    new-instance v5, La/hpm;

    .line 42
    .line 43
    invoke-direct {v5, v0, v1, p1}, La/hpm;-><init>(JI)V

    .line 44
    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-static {v4, p0, p1, p1, v5}, La/d5c;->O(Ljava/lang/String;Ljava/lang/String;ZZLa/ipm;)La/j83;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {v2, p2, v3, p0}, La/kpm;-><init>(La/rpm;La/ipm;La/j83;)V

    .line 52
    .line 53
    .line 54
    return-object v2
.end method

.method public static final c(JLjava/lang/String;)Lkotlin/Pair;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, p2}, La/o1g0;->d(JLjava/lang/String;)Lkotlin/Pair;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    new-instance p0, Lkotlin/Pair;

    .line 11
    .line 12
    const-string p1, ""

    .line 13
    .line 14
    invoke-direct {p0, p1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-object p0
.end method

.method public static final d(JLjava/lang/String;)Lkotlin/Pair;
    .locals 2

    .line 1
    sget-object v0, La/jwg;->d:La/jwg;

    .line 2
    .line 3
    iget-wide v0, v0, La/yxg;->b:J

    .line 4
    .line 5
    cmp-long v0, p0, v0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    sget-object p0, La/o1g0;->b:Lkotlin/text/Regex;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/bh30;->getValue()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p0, v1

    .line 24
    :goto_0
    sget-object p1, La/o1g0;->c:Lkotlin/text/Regex;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, La/bh30;->getValue()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object p1, v1

    .line 38
    :goto_1
    invoke-static {p0, p1}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move-object p2, v1

    .line 48
    :goto_2
    if-eqz p2, :cond_5

    .line 49
    .line 50
    invoke-static {p2}, La/o1g0;->e(Ljava/lang/String;)Lkotlin/Pair;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_3
    sget-object v0, La/o1g0;->d:Ljava/util/Set;

    .line 56
    .line 57
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    sget-object p0, La/o1g0;->a:Lkotlin/text/Regex;

    .line 69
    .line 70
    invoke-virtual {p0, p2}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eqz p0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p0}, La/bh30;->getValue()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-eqz p0, :cond_5

    .line 81
    .line 82
    invoke-static {p0}, La/o1g0;->e(Ljava/lang/String;)Lkotlin/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_5
    :goto_3
    return-object v1
.end method

.method public static final e(Ljava/lang/String;)Lkotlin/Pair;
    .locals 2

    .line 1
    const/16 v0, 0x2d

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "-"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, ":"

    .line 13
    .line 14
    :goto_0
    invoke-static {p0, v0}, Lkotlin/text/StringsKt;->r0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p0, v0, p0}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v0, Lkotlin/Pair;

    .line 39
    .line 40
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method
