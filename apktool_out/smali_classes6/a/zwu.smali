.class public final La/zwu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/z220;


# direct methods
.method public synthetic constructor <init>(La/z220;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/zwu;->a:La/z220;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/uaq0;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    const-string v0, "ru_RU"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    const-string p1, "_l.png"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p1, "_n.png"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string p1, "_d.png"

    .line 24
    .line 25
    :goto_0
    iget-object p0, p0, La/zwu;->a:La/z220;

    .line 26
    .line 27
    iget-object p0, p0, La/z220;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/yvn0;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    const-string p0, "/static/img/ImgDefault/swipex/onboarding/android/ru/A_2"

    .line 37
    .line 38
    const-string p2, "/static/img/ImgDefault/swipex/onboarding/android/ru/A_3"

    .line 39
    .line 40
    const-string v0, "/static/img/ImgDefault/swipex/onboarding/android/ru/A_1"

    .line 41
    .line 42
    filled-new-array {v0, p0, p2}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-string p0, "/static/img/ImgDefault/swipex/onboarding/android/en/A_2"

    .line 52
    .line 53
    const-string p2, "/static/img/ImgDefault/swipex/onboarding/android/en/A_3"

    .line 54
    .line 55
    const-string v0, "/static/img/ImgDefault/swipex/onboarding/android/en/A_1"

    .line 56
    .line 57
    filled-new-array {v0, p0, p2}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :goto_1
    new-instance p2, Ljava/util/ArrayList;

    .line 66
    .line 67
    const/16 v0, 0xa

    .line 68
    .line 69
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/String;

    .line 91
    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    return-object p2
.end method
