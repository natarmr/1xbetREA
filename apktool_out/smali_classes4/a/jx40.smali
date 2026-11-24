.class public final La/jx40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fl80;

.field public final b:La/gr00;


# direct methods
.method public constructor <init>(La/vne;La/fl80;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/jx40;->a:La/fl80;

    .line 11
    .line 12
    new-instance v0, La/gr00;

    .line 13
    .line 14
    iget-object p2, p2, La/fl80;->a:La/gmq;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/zz2;

    .line 26
    .line 27
    const/4 v2, 0x7

    .line 28
    invoke-direct {v1, v2}, La/zz2;-><init>(B)V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, La/gr00;->a:Ljava/lang/Object;

    .line 32
    .line 33
    const v1, 0x7fffffff

    .line 34
    .line 35
    .line 36
    sget-object v2, La/i99;->a:La/i99;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-static {v3, v1, v2}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, v0, La/gr00;->b:Ljava/lang/Object;

    .line 44
    .line 45
    new-instance v2, La/ex1;

    .line 46
    .line 47
    const/16 v4, 0x13

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct {v2, v0, v5, v4}, La/ex1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/s6n0;

    .line 54
    .line 55
    invoke-direct {v4, v1, v2}, La/s6n0;-><init>(La/noj0;Lkotlin/jvm/functions/Function2;)V

    .line 56
    .line 57
    .line 58
    iput-object v4, v0, La/gr00;->c:Ljava/lang/Object;

    .line 59
    .line 60
    sget-object v1, La/yne;->b:La/yne;

    .line 61
    .line 62
    new-instance v2, La/d09;

    .line 63
    .line 64
    const/16 v4, 0xb

    .line 65
    .line 66
    invoke-direct {v2, p2, v0, v5, v4}, La/d09;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v5, v1, v2, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance p2, La/d38;

    .line 74
    .line 75
    const/16 v1, 0x14

    .line 76
    .line 77
    invoke-direct {p2, v0, v1}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 81
    .line 82
    .line 83
    iput-object p1, v0, La/gr00;->d:Ljava/lang/Object;

    .line 84
    .line 85
    new-instance p1, La/d09;

    .line 86
    .line 87
    const/16 p2, 0xa

    .line 88
    .line 89
    invoke-direct {p1, v0, v5, p2}, La/d09;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 90
    .line 91
    .line 92
    new-instance p2, La/vsg0;

    .line 93
    .line 94
    invoke-direct {p2, p1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    iput-object p2, v0, La/gr00;->e:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v0, p0, La/jx40;->b:La/gr00;

    .line 100
    .line 101
    return-void
.end method
