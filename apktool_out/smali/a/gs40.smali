.class public final La/gs40;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gs40;->a:B

    iput-object p1, p0, La/gs40;->b:Ljava/lang/Object;

    iput-object p2, p0, La/gs40;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/gs40;->a:B

    .line 2
    .line 3
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, La/gs40;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, La/gs40;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/qb00;

    .line 14
    .line 15
    check-cast v2, La/ar20;

    .line 16
    .line 17
    iget-object p0, p0, La/qb00;->a:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-array v0, v0, [I

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/lit8 v1, v1, -0x1

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    move v4, v3

    .line 33
    :goto_0
    if-ge v3, v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, La/wvq0;

    .line 40
    .line 41
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    move v4, v1

    .line 52
    :cond_0
    aput v4, v0, v1

    .line 53
    .line 54
    add-int/lit8 v1, v1, -0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-object v0

    .line 58
    :pswitch_0
    check-cast p0, La/htb;

    .line 59
    .line 60
    check-cast v2, La/j6u0;

    .line 61
    .line 62
    invoke-static {v1, v1}, La/wpm0;->g(FF)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    invoke-virtual {v2, v0, v1}, La/j6u0;->a(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v7

    .line 70
    new-instance v3, La/js40;

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-direct/range {v3 .. v8}, La/js40;-><init>(ZJJ)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, v3}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1
    check-cast p0, La/htb;

    .line 88
    .line 89
    check-cast v2, La/j6u0;

    .line 90
    .line 91
    invoke-static {v1, v1}, La/wpm0;->g(FF)J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    invoke-virtual {v2, v0, v1}, La/j6u0;->a(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    new-instance v3, La/js40;

    .line 100
    .line 101
    const/4 v4, 0x0

    .line 102
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-direct/range {v3 .. v8}, La/js40;-><init>(ZJJ)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p0, v3}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
