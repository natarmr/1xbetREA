.class public final La/b5v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xex;

.field public final b:La/xex;


# direct methods
.method public synthetic constructor <init>(La/xex;La/xex;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/b5v;->a:La/xex;

    iput-object p2, p0, La/b5v;->b:La/xex;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;La/rwn;La/bnn0;)Ljava/lang/Object;
    .locals 7

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    instance-of v0, p2, La/pwn;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    check-cast p2, La/pwn;

    .line 9
    .line 10
    iget-object v4, p2, La/pwn;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, La/b5v;->a:La/xex;

    .line 13
    .line 14
    iget-object p0, v2, La/xex;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/mne;

    .line 17
    .line 18
    iget-object p0, p0, La/mne;->b:La/dvj;

    .line 19
    .line 20
    new-instance v1, La/ke5;

    .line 21
    .line 22
    const/4 v6, 0x4

    .line 23
    move-object v3, p1

    .line 24
    invoke-direct/range {v1 .. v6}, La/ke5;-><init>(La/xex;Ljava/lang/String;Ljava/lang/String;La/yje;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v1, p3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, La/wne;->a:La/wne;

    .line 32
    .line 33
    if-ne p0, p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    :goto_0
    if-ne p0, p1, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_2
    move-object v3, p1

    .line 45
    instance-of p1, p2, La/qwn;

    .line 46
    .line 47
    if-eqz p1, :cond_5

    .line 48
    .line 49
    check-cast p2, La/qwn;

    .line 50
    .line 51
    iget-object v4, p2, La/qwn;->a:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v2, p0, La/b5v;->b:La/xex;

    .line 54
    .line 55
    iget-object p0, v2, La/xex;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, La/mne;

    .line 58
    .line 59
    iget-object p0, p0, La/mne;->b:La/dvj;

    .line 60
    .line 61
    new-instance v1, La/ke5;

    .line 62
    .line 63
    const/4 v6, 0x4

    .line 64
    invoke-direct/range {v1 .. v6}, La/ke5;-><init>(La/xex;Ljava/lang/String;Ljava/lang/String;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v1, p3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    sget-object p1, La/wne;->a:La/wne;

    .line 72
    .line 73
    if-ne p0, p1, :cond_3

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_1
    if-ne p0, p1, :cond_4

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0
.end method
