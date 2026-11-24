.class public abstract La/wog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/bxg;->d:La/bxg;

    .line 2
    .line 3
    iget-wide v0, v0, La/yxg;->b:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, La/wog;->a:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Ljava/lang/String;)La/n0x;
    .locals 5

    .line 1
    new-instance v0, La/n0x;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p0, v2, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    const-string v2, "https://"

    .line 33
    .line 34
    invoke-static {p0, v2, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/16 v4, 0x2f

    .line 46
    .line 47
    if-lez v2, :cond_2

    .line 48
    .line 49
    const-string v2, "/"

    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :cond_2
    const/4 v2, 0x1

    .line 61
    new-array v2, v2, [C

    .line 62
    .line 63
    aput-char v4, v2, v3

    .line 64
    .line 65
    invoke-static {p0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {v0, p0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public static final b(La/m9s;)La/m0x;
    .locals 4

    .line 1
    iget-wide v0, p0, La/m9s;->o:J

    .line 2
    .line 3
    iget-wide v2, p0, La/m9s;->A:J

    .line 4
    .line 5
    iget-object p0, p0, La/m9s;->I:La/cqg;

    .line 6
    .line 7
    instance-of p0, p0, La/qz7;

    .line 8
    .line 9
    invoke-static {v0, v1, p0, v2, v3}, La/aem0;->q(JZJ)La/snu0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    instance-of p0, p0, La/qnu0;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    new-instance p0, La/m0x;

    .line 19
    .line 20
    const v1, 0x7f080965

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x6

    .line 24
    invoke-direct {p0, v1, v0, v2}, La/m0x;-><init>(ILa/bzw;I)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    return-object v0
.end method

.method public static final c(La/m9s;Ljava/lang/String;)La/f6m;
    .locals 6

    .line 1
    new-instance v0, La/m0x;

    .line 2
    .line 3
    const v1, 0x7f080a2c

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x6

    .line 8
    invoke-direct {v0, v1, v2, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, La/m9s;->f:Ljava/lang/String;

    .line 18
    .line 19
    :cond_0
    iget-wide v1, p0, La/m9s;->o:J

    .line 20
    .line 21
    sget-object p0, La/wog;->a:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {p0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-wide/16 v4, 0x28

    .line 35
    .line 36
    cmp-long p0, v1, v4

    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    new-instance p0, Lkotlin/text/Regex;

    .line 41
    .line 42
    const-string v1, "\\d"

    .line 43
    .line 44
    invoke-direct {p0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lkotlin/text/Regex;->a(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    const-string v1, "."

    .line 55
    .line 56
    invoke-static {p0, p1, v3, v1}, Lkotlin/text/StringsKt;->Y(ILjava/lang/String;ILjava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, -0x1

    .line 61
    if-ne v1, v2, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {p1, p0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const-string p0, ". "

    .line 70
    .line 71
    invoke-static {p1, p0, p1}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_4
    :goto_0
    new-instance p0, La/f6m;

    .line 76
    .line 77
    invoke-direct {p0, v0, p1}, La/f6m;-><init>(La/m0x;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object p0
.end method
