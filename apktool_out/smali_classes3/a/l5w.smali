.class public final synthetic La/l5w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q5w;


# direct methods
.method public synthetic constructor <init>(La/q5w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l5w;->a:B

    iput-object p1, p0, La/l5w;->b:La/q5w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/l5w;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l5w;->b:La/q5w;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/q5w;->D:La/ol60;

    .line 19
    .line 20
    new-instance p1, La/g5w;

    .line 21
    .line 22
    invoke-direct {p1, p2}, La/g5w;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, La/q5w;->F:La/p7m0;

    .line 38
    .line 39
    new-instance v0, La/c5w;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, v1, v1}, La/c5w;-><init>(ZZ)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-virtual {p2, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    instance-of p2, p1, La/zhi0;

    .line 50
    .line 51
    if-eqz p2, :cond_0

    .line 52
    .line 53
    iget-object p2, p0, La/q5w;->A:La/nhf0;

    .line 54
    .line 55
    move-object v0, p1

    .line 56
    check-cast v0, La/zhi0;

    .line 57
    .line 58
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 59
    .line 60
    invoke-interface {v0}, La/kuw;->getErrorCode()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v1, p2, La/nhf0;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, La/b4j;

    .line 67
    .line 68
    sget-object v2, La/a1w;->a:La/a1w;

    .line 69
    .line 70
    sget-object v2, La/r6w;->g:La/r6w;

    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v1, v3, v2}, La/b4j;->c(Ljava/lang/String;La/r6w;)V

    .line 77
    .line 78
    .line 79
    iget-object p2, p2, La/nhf0;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p2, La/au0;

    .line 82
    .line 83
    invoke-virtual {v2}, La/r6w;->a()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p2, v0, v1}, La/au0;->f(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_0
    iget-object p2, p0, La/q5w;->w:La/duj;

    .line 91
    .line 92
    new-instance v0, La/l5w;

    .line 93
    .line 94
    const/4 v1, 0x2

    .line 95
    invoke-direct {v0, p0, v1}, La/l5w;-><init>(La/q5w;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    instance-of p2, p1, La/zhi0;

    .line 111
    .line 112
    if-eqz p2, :cond_1

    .line 113
    .line 114
    check-cast p1, La/zhi0;

    .line 115
    .line 116
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 117
    .line 118
    sget-object p2, La/i2o;->r:La/i2o;

    .line 119
    .line 120
    if-ne p1, p2, :cond_1

    .line 121
    .line 122
    iget-object p0, p0, La/q5w;->D:La/ol60;

    .line 123
    .line 124
    sget-object p1, La/e5w;->a:La/e5w;

    .line 125
    .line 126
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
