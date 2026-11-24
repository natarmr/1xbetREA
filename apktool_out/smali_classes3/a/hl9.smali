.class public final La/hl9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:La/p7m0;

.field public final c:La/p7m0;

.field public final d:La/p7m0;

.field public final e:Ljava/util/LinkedHashMap;

.field public final f:La/ol60;


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/hl9;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v0, La/o4g;

    .line 12
    .line 13
    sget-object v1, La/iun;->a:La/iun;

    .line 14
    .line 15
    invoke-direct {v0, v1, v1}, La/o4g;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/hl9;->b:La/p7m0;

    .line 23
    .line 24
    const-string v0, "UTC"

    .line 25
    .line 26
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, Ljava/util/Date;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 44
    .line 45
    .line 46
    new-instance v4, La/c5g;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    const/4 v2, 0x2

    .line 54
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/4 v2, 0x5

    .line 59
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    sget-object v9, La/yag;->a:La/yag;

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    invoke-direct/range {v4 .. v10}, La/c5g;-><init>(IIIILa/yag;Z)V

    .line 71
    .line 72
    .line 73
    invoke-static {v4}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/hl9;->c:La/p7m0;

    .line 78
    .line 79
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/hl9;->d:La/p7m0;

    .line 84
    .line 85
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, La/hl9;->e:Ljava/util/LinkedHashMap;

    .line 91
    .line 92
    new-instance v0, La/ol60;

    .line 93
    .line 94
    const/4 v1, 0x3

    .line 95
    invoke-direct {v0, v1}, La/ol60;-><init>(I)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, La/hl9;->f:La/ol60;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/el9;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/el9;

    .line 7
    .line 8
    iget v1, v0, La/el9;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/el9;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/el9;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/el9;-><init>(La/hl9;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/el9;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/el9;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/hl9;->a:Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V

    .line 53
    .line 54
    .line 55
    sget-object p1, La/iun;->a:La/iun;

    .line 56
    .line 57
    iput v3, v0, La/el9;->k:I

    .line 58
    .line 59
    iget-object v0, p0, La/hl9;->d:La/p7m0;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    iget-object p0, p0, La/hl9;->f:La/ol60;

    .line 70
    .line 71
    iget-object p1, p0, La/ol60;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingDeque;->clear()V

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, La/ol60;->e:La/n0o0;

    .line 77
    .line 78
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/util/concurrent/LinkedBlockingDeque;->clear()V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0
.end method
