.class public abstract La/f0c0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 6
    .line 7
    new-instance v1, Lkotlin/text/Regex;

    .line 8
    .line 9
    const-string v2, "\\p{C}"

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    invoke-virtual {v1, p0, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    :cond_0
    move-object p0, v0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 37
    .line 38
    sget-object v2, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 39
    .line 40
    iget-object v2, v2, La/sdj;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 47
    .line 48
    .line 49
    const-string v2, "UTC"

    .line 50
    .line 51
    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 65
    .line 66
    .line 67
    move-result-wide v1

    .line 68
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 75
    .line 76
    new-instance v1, La/g0g0;

    .line 77
    .line 78
    invoke-direct {v1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    move-object p0, v1

    .line 82
    :goto_0
    nop

    .line 83
    instance-of v1, p0, La/g0g0;

    .line 84
    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move-object v0, p0

    .line 89
    :goto_1
    check-cast v0, Ljava/lang/Long;

    .line 90
    .line 91
    return-object v0
.end method
